package io.ably.lib.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.realtime.Presence;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.rest.DeviceDetails;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.types.RegistrationToken;
import io.ably.lib.util.IntentUtils;
import io.ably.lib.util.Log;
import io.ably.lib.util.ParamsUtils;
import io.ably.lib.util.Serialisation;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public class ActivationStateMachine {
    private static final String TAG = "AblyActivation";
    protected final ActivationContext activationContext;
    private final Context context;
    public State current;
    protected boolean handlingEvent;
    public ArrayDeque<Event> pendingEvents;

    public static class PersistKeys {
        public static final String CURRENT_STATE = "ABLY_PUSH_CURRENT_STATE";
        static final String PENDING_EVENTS_LENGTH = "ABLY_PUSH_PENDING_EVENTS_LENGTH";
        static final String PENDING_EVENTS_PREFIX = "ABLY_PUSH_PENDING_EVENTS";
        static final String PUSH_CUSTOM_REGISTRAR = "ABLY_PUSH_REGISTRATION_HANDLER";
    }

    public static class CalledActivate extends Event {
        public static final String NAME = "CalledActivate";

        public static CalledActivate useCustomRegistrar(boolean z, SharedPreferences sharedPreferences) {
            sharedPreferences.edit().putBoolean("ABLY_PUSH_REGISTRATION_HANDLER", z).apply();
            return new CalledActivate();
        }

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    public static class CalledDeactivate extends Event {
        public static final String NAME = "CalledDeactivate";

        static CalledDeactivate useCustomRegistrar(boolean z, SharedPreferences sharedPreferences) {
            sharedPreferences.edit().putBoolean("ABLY_PUSH_REGISTRATION_HANDLER", z).apply();
            return new CalledDeactivate();
        }

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    public static class GotPushDeviceDetails extends Event {
        public static final String NAME = "GotPushDeviceDetails";

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    public static class GotDeviceRegistration extends Event {
        final String deviceId;
        final String deviceIdentityToken;

        public GotDeviceRegistration(String str, String str2) {
            this.deviceId = str;
            this.deviceIdentityToken = str2;
        }

        public String toString() {
            return "GotDeviceRegistration{deviceIdentityToken='" + this.deviceIdentityToken + "'}";
        }
    }

    public static class GettingDeviceRegistrationFailed extends ErrorEvent {
        public GettingDeviceRegistrationFailed(ErrorInfo errorInfo) {
            super(errorInfo);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.ErrorEvent
        public String toString() {
            return "GettingDeviceRegistrationFailed: " + super.toString();
        }
    }

    public static class GettingPushDeviceDetailsFailed extends ErrorEvent {
        public GettingPushDeviceDetailsFailed(ErrorInfo errorInfo) {
            super(errorInfo);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.ErrorEvent
        public String toString() {
            return "GettingPushDeviceDetailsFailed: " + super.toString();
        }
    }

    public static class RegistrationSynced extends Event {
        public static final String NAME = "RegistrationSynced";

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    public static class SyncRegistrationFailed extends ErrorEvent {
        public SyncRegistrationFailed(ErrorInfo errorInfo) {
            super(errorInfo);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.ErrorEvent
        public String toString() {
            return "SyncRegistrationFailed: " + super.toString();
        }
    }

    public static class Deregistered extends Event {
        public static final String NAME = "Deregistered";

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    public static class DeregistrationFailed extends ErrorEvent {
        public DeregistrationFailed(ErrorInfo errorInfo) {
            super(errorInfo);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.ErrorEvent
        public String toString() {
            return "DeregistrationFailed: " + super.toString();
        }
    }

    public static abstract class Event {
        public String getPersistedName() {
            return null;
        }

        public static Event constructEventByName(String str) {
            str.hashCode();
            switch (str) {
                case "RegistrationSynced":
                    return new RegistrationSynced();
                case "CalledDeactivate":
                    return new CalledDeactivate();
                case "GotPushDeviceDetails":
                    return new GotPushDeviceDetails();
                case "Deregistered":
                    return new Deregistered();
                case "CalledActivate":
                    return new CalledActivate();
                default:
                    return null;
            }
        }
    }

    public static abstract class ErrorEvent extends Event {
        public final ErrorInfo reason;

        ErrorEvent(ErrorInfo errorInfo) {
            this.reason = errorInfo;
        }

        public String toString() {
            return "ErrorEvent{reason=" + this.reason + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class NotActivated extends PersistentState {
        public static final String NAME = "NotActivated";

        public NotActivated(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.PersistentState
        String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledDeactivate) {
                LocalDevice device = this.machine.getDevice();
                if (device.isRegistered()) {
                    this.machine.deregister();
                    return new WaitingForDeregistration(this.machine, this);
                }
                device.reset();
                this.machine.callDeactivatedCallback(null);
                return this;
            }
            if (event instanceof CalledActivate) {
                LocalDevice device2 = this.machine.getDevice();
                if (device2.isRegistered()) {
                    this.machine.validateRegistration();
                    return new WaitingForRegistrationSync(this.machine, event);
                }
                if (device2.getRegistrationToken() != null) {
                    this.machine.pendingEvents.add(new GotPushDeviceDetails());
                } else {
                    this.machine.getRegistrationToken();
                }
                if (!device2.isCreated()) {
                    device2.create();
                }
                return new WaitingForPushDeviceDetails(this.machine);
            }
            if (event instanceof GotPushDeviceDetails) {
                return this;
            }
            return null;
        }
    }

    public static class WaitingForPushDeviceDetails extends PersistentState {
        public static final String NAME = "WaitingForPushDeviceDetails";

        public WaitingForPushDeviceDetails(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.PersistentState
        String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledActivate) {
                return this;
            }
            if (event instanceof CalledDeactivate) {
                this.machine.callDeactivatedCallback(null);
                return new NotActivated(this.machine);
            }
            if (event instanceof GettingPushDeviceDetailsFailed) {
                this.machine.callDeactivatedCallback(((GettingPushDeviceDetailsFailed) event).reason);
                return new NotActivated(this.machine);
            }
            if (!(event instanceof GotPushDeviceDetails)) {
                return null;
            }
            final ActivationContext activationContext = this.machine.activationContext;
            final LocalDevice localDevice = activationContext.getLocalDevice();
            if (activationContext.getPreferences().getBoolean("ABLY_PUSH_REGISTRATION_HANDLER", false)) {
                this.machine.invokeCustomRegistration(localDevice, true);
            } else {
                try {
                    final AblyRest ably = activationContext.getAbly();
                    final HttpCore.RequestBody requestBodyFromGson = HttpUtils.requestBodyFromGson(localDevice.toJsonObject(), ably.options.useBinaryProtocol);
                    ably.http.request(new Http.Execute<JsonObject>() { // from class: io.ably.lib.push.ActivationStateMachine.WaitingForPushDeviceDetails.2
                        @Override // io.ably.lib.http.Http.Execute
                        public void execute(HttpScheduler httpScheduler, Callback<JsonObject> callback) throws AblyException {
                            httpScheduler.post("/push/deviceRegistrations", HttpUtils.defaultAcceptHeaders(ably.options.useBinaryProtocol), ParamsUtils.enrichParams(null, ably.options), requestBodyFromGson, new Serialisation.HttpResponseHandler(), true, callback);
                        }
                    }).async(new Callback<JsonObject>() { // from class: io.ably.lib.push.ActivationStateMachine.WaitingForPushDeviceDetails.1
                        @Override // io.ably.lib.types.Callback
                        public void onSuccess(JsonObject jsonObject) {
                            Log.i(ActivationStateMachine.TAG, "registered " + localDevice.id);
                            JsonObject asJsonObject = jsonObject.getAsJsonObject("deviceIdentityToken");
                            if (asJsonObject == null) {
                                Log.e(ActivationStateMachine.TAG, "invalid device registration response (no deviceIdentityToken); deviceId = " + localDevice.id);
                                WaitingForPushDeviceDetails.this.machine.handleEvent(new GettingDeviceRegistrationFailed(new ErrorInfo("Invalid deviceIdentityToken in response", 40000, 400)));
                                return;
                            }
                            JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(Presence.GET_CLIENTID);
                            if (asJsonPrimitive != null) {
                                String asString = asJsonPrimitive.getAsString();
                                if (localDevice.clientId == null) {
                                    activationContext.setClientId(asString, false);
                                }
                            }
                            WaitingForPushDeviceDetails.this.machine.handleEvent(new GotDeviceRegistration(localDevice.id, asJsonObject.getAsJsonPrimitive(AnalyticsConstantsKt.KEY_TOKEN).getAsString()));
                        }

                        @Override // io.ably.lib.types.Callback
                        public void onError(ErrorInfo errorInfo) {
                            Log.e(ActivationStateMachine.TAG, "error registering " + localDevice.id + ": " + errorInfo.toString());
                            WaitingForPushDeviceDetails.this.machine.handleEvent(new GettingDeviceRegistrationFailed(errorInfo));
                        }
                    });
                } catch (AblyException e) {
                    ErrorInfo errorInfo = e.errorInfo;
                    Log.e(ActivationStateMachine.TAG, "exception registering " + localDevice.id + ": " + errorInfo.toString());
                    this.machine.handleEvent(new GettingDeviceRegistrationFailed(errorInfo));
                    return new NotActivated(this.machine);
                }
            }
            return new WaitingForDeviceRegistration(this.machine);
        }
    }

    public static class WaitingForDeviceRegistration extends State {
        public WaitingForDeviceRegistration(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        public String toString() {
            return "WaitingForDeviceRegistration";
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledActivate) {
                return this;
            }
            if (event instanceof GotDeviceRegistration) {
                LocalDevice device = this.machine.getDevice();
                GotDeviceRegistration gotDeviceRegistration = (GotDeviceRegistration) event;
                if (device.id.equals(gotDeviceRegistration.deviceId)) {
                    device.setDeviceIdentityToken(gotDeviceRegistration.deviceIdentityToken);
                    this.machine.callActivatedCallback(null);
                    return new WaitingForNewPushDeviceDetails(this.machine);
                }
                Log.e(ActivationStateMachine.TAG, "error registering " + device.id + ": deviceId has been changed during registration, it was " + gotDeviceRegistration.deviceId);
                throw new IllegalStateException("DeviceId has been changed during registration");
            }
            if (!(event instanceof GettingDeviceRegistrationFailed)) {
                return null;
            }
            this.machine.callActivatedCallback(((GettingDeviceRegistrationFailed) event).reason);
            return new NotActivated(this.machine);
        }
    }

    public static class WaitingForNewPushDeviceDetails extends PersistentState {
        public static final String NAME = "WaitingForNewPushDeviceDetails";

        public WaitingForNewPushDeviceDetails(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.PersistentState
        String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledActivate) {
                this.machine.callActivatedCallback(null);
                return this;
            }
            if (event instanceof CalledDeactivate) {
                this.machine.deregister();
                return new WaitingForDeregistration(this.machine, this);
            }
            if (!(event instanceof GotPushDeviceDetails)) {
                return null;
            }
            this.machine.getDevice();
            this.machine.updateRegistration();
            return new WaitingForRegistrationSync(this.machine, event);
        }
    }

    public static class WaitingForRegistrationSync extends State {
        private final Event fromEvent;

        public WaitingForRegistrationSync(ActivationStateMachine activationStateMachine, Event event) {
            super(activationStateMachine);
            this.fromEvent = event;
        }

        public String toString() {
            return "WaitingForRegistrationSync{fromEvent=" + this.fromEvent + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledActivate) {
                if (this.fromEvent instanceof CalledActivate) {
                    return null;
                }
                this.machine.callActivatedCallback(null);
                return this;
            }
            if (event instanceof RegistrationSynced) {
                if (this.fromEvent instanceof CalledActivate) {
                    this.machine.callActivatedCallback(null);
                }
                return new WaitingForNewPushDeviceDetails(this.machine);
            }
            if (!(event instanceof SyncRegistrationFailed)) {
                return null;
            }
            ErrorInfo errorInfo = ((SyncRegistrationFailed) event).reason;
            if (this.fromEvent instanceof CalledActivate) {
                this.machine.callActivatedCallback(errorInfo);
            } else {
                this.machine.callSyncRegistrationFailedCallback(errorInfo);
            }
            return new AfterRegistrationSyncFailed(this.machine);
        }
    }

    public static class AfterRegistrationSyncFailed extends PersistentState {
        public static final String NAME = "AfterRegistrationSyncFailed";

        public AfterRegistrationSyncFailed(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.PersistentState
        String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if ((event instanceof CalledActivate) || (event instanceof GotPushDeviceDetails)) {
                this.machine.validateRegistration();
                return new WaitingForRegistrationSync(this.machine, event);
            }
            if (!(event instanceof CalledDeactivate)) {
                return null;
            }
            this.machine.deregister();
            return new WaitingForDeregistration(this.machine, this);
        }
    }

    public static class WaitingForDeregistration extends State {
        private State previousState;

        public WaitingForDeregistration(ActivationStateMachine activationStateMachine, State state) {
            super(activationStateMachine);
            this.previousState = state;
        }

        public String toString() {
            return "WaitingForDeregistration{previousState=" + this.previousState + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledDeactivate) {
                return this;
            }
            if (event instanceof Deregistered) {
                this.machine.getDevice().reset();
                this.machine.callDeactivatedCallback(null);
                return new NotActivated(this.machine);
            }
            if (!(event instanceof DeregistrationFailed)) {
                return null;
            }
            this.machine.callDeactivatedCallback(((DeregistrationFailed) event).reason);
            return this.previousState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LocalDevice getDevice() {
        return this.activationContext.getLocalDevice();
    }

    public static abstract class State {
        protected final ActivationStateMachine machine;

        public abstract State transition(Event event);

        public State(ActivationStateMachine activationStateMachine) {
            this.machine = activationStateMachine;
        }
    }

    private static abstract class PersistentState extends State {
        abstract String getPersistedName();

        PersistentState(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        public static State constructStateByName(String str, ActivationStateMachine activationStateMachine) {
            str.hashCode();
            switch (str) {
                case "WaitingForNewPushDeviceDetails":
                    return new WaitingForNewPushDeviceDetails(activationStateMachine);
                case "WaitingForPushDeviceDetails":
                    return new WaitingForPushDeviceDetails(activationStateMachine);
                case "AfterRegistrationSyncFailed":
                    return new AfterRegistrationSyncFailed(activationStateMachine);
                case "NotActivated":
                    return new NotActivated(activationStateMachine);
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callActivatedCallback(ErrorInfo errorInfo) {
        sendErrorIntent("PUSH_ACTIVATE", errorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callDeactivatedCallback(ErrorInfo errorInfo) {
        sendErrorIntent("PUSH_DEACTIVATE", errorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callSyncRegistrationFailedCallback(ErrorInfo errorInfo) {
        sendErrorIntent("PUSH_UPDATE_FAILED", errorInfo);
    }

    private void sendErrorIntent(String str, ErrorInfo errorInfo) {
        Intent intent = new Intent();
        IntentUtils.addErrorInfo(intent, errorInfo);
        sendIntent(str, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeCustomRegistration(DeviceDetails deviceDetails, final boolean z) {
        final String str = deviceDetails.id;
        registerOnceReceiver("PUSH_DEVICE_REGISTERED", new BroadcastReceiver() { // from class: io.ably.lib.push.ActivationStateMachine.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ErrorInfo errorInfo = IntentUtils.getErrorInfo(intent);
                if (errorInfo == null) {
                    Log.i(ActivationStateMachine.TAG, "custom registration for " + str);
                    if (z) {
                        ActivationStateMachine.this.handleEvent(new GotDeviceRegistration(str, intent.getStringExtra("deviceIdentityToken")));
                        return;
                    } else {
                        ActivationStateMachine.this.handleEvent(new RegistrationSynced());
                        return;
                    }
                }
                Log.e(ActivationStateMachine.TAG, "error from custom registration for " + str + ": " + errorInfo.toString());
                if (z) {
                    ActivationStateMachine.this.handleEvent(new GettingDeviceRegistrationFailed(errorInfo));
                } else {
                    ActivationStateMachine.this.handleEvent(new SyncRegistrationFailed(errorInfo));
                }
            }
        });
        Intent intent = new Intent();
        intent.putExtra("isNew", z);
        sendIntent("PUSH_REGISTER_DEVICE", intent);
    }

    private void invokeCustomDeregistration(final DeviceDetails deviceDetails) {
        registerOnceReceiver("PUSH_DEVICE_DEREGISTERED", new BroadcastReceiver() { // from class: io.ably.lib.push.ActivationStateMachine.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ErrorInfo errorInfo = IntentUtils.getErrorInfo(intent);
                if (errorInfo == null) {
                    Log.i(ActivationStateMachine.TAG, "custom deregistration for " + deviceDetails.id);
                    ActivationStateMachine.this.handleEvent(new Deregistered());
                    return;
                }
                Log.e(ActivationStateMachine.TAG, "error from custom deregisterer for " + deviceDetails.id + ": " + errorInfo.toString());
                ActivationStateMachine.this.handleEvent(new DeregistrationFailed(errorInfo));
            }
        });
        sendIntent("PUSH_DEREGISTER_DEVICE", new Intent());
    }

    private void sendIntent(String str, Intent intent) {
        intent.setAction("io.ably.broadcast." + str);
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
    }

    private void registerOnceReceiver(String str, final BroadcastReceiver broadcastReceiver) {
        LocalBroadcastManager.getInstance(this.context).registerReceiver(new BroadcastReceiver() { // from class: io.ably.lib.push.ActivationStateMachine.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LocalBroadcastManager.getInstance(context.getApplicationContext()).unregisterReceiver(this);
                broadcastReceiver.onReceive(context, intent);
            }
        }, new IntentFilter("io.ably.broadcast." + str));
    }

    protected void getRegistrationToken() {
        this.activationContext.getRegistrationToken(new Callback<String>() { // from class: io.ably.lib.push.ActivationStateMachine.4
            @Override // io.ably.lib.types.Callback
            public void onSuccess(String str) {
                Log.i(ActivationStateMachine.TAG, "getInstanceId completed with new token");
                ActivationStateMachine.this.activationContext.onNewRegistrationToken(RegistrationToken.Type.FCM, str);
            }

            @Override // io.ably.lib.types.Callback
            public void onError(ErrorInfo errorInfo) {
                Log.e(ActivationStateMachine.TAG, "getInstanceId failed", AblyException.fromErrorInfo(errorInfo));
                ActivationStateMachine.this.handleEvent(new GettingPushDeviceDetailsFailed(errorInfo));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRegistration() {
        final LocalDevice localDevice = this.activationContext.getLocalDevice();
        if (this.activationContext.getPreferences().getBoolean("ABLY_PUSH_REGISTRATION_HANDLER", false)) {
            invokeCustomRegistration(localDevice, false);
            return;
        }
        try {
            final AblyRest ably = this.activationContext.getAbly();
            final HttpCore.RequestBody requestBodyFromGson = HttpUtils.requestBodyFromGson(localDevice.pushRecipientJsonObject(), ably.options.useBinaryProtocol);
            ably.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.ActivationStateMachine.6
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<Void> callback) throws AblyException {
                    httpScheduler.patch("/push/deviceRegistrations/" + localDevice.id, ably.push.pushRequestHeaders(true), ParamsUtils.enrichParams(null, ably.options), requestBodyFromGson, null, false, callback);
                }
            }).async(new Callback<Void>() { // from class: io.ably.lib.push.ActivationStateMachine.5
                @Override // io.ably.lib.types.Callback
                public void onSuccess(Void r2) {
                    Log.i(ActivationStateMachine.TAG, "updated registration " + localDevice.id);
                    ActivationStateMachine.this.handleEvent(new RegistrationSynced());
                }

                @Override // io.ably.lib.types.Callback
                public void onError(ErrorInfo errorInfo) {
                    Log.e(ActivationStateMachine.TAG, "error updating registration " + localDevice.id + ": " + errorInfo.toString());
                    ActivationStateMachine.this.handleEvent(new SyncRegistrationFailed(errorInfo));
                }
            });
        } catch (AblyException e) {
            ErrorInfo errorInfo = e.errorInfo;
            Log.e(TAG, "exception registering " + localDevice.id + ": " + errorInfo.toString());
            handleEvent(new SyncRegistrationFailed(errorInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void validateRegistration() {
        final LocalDevice localDevice = this.activationContext.getLocalDevice();
        try {
            final AblyRest ably = this.activationContext.getAbly();
            String str = ably.auth.clientId;
            if (str != null && localDevice.clientId != null && !str.equals(localDevice.clientId)) {
                handleEvent(new SyncRegistrationFailed(new ErrorInfo("Activation failed: present clientId is not compatible with existing device registration", 400, 61002)));
            } else if (this.activationContext.getPreferences().getBoolean("ABLY_PUSH_REGISTRATION_HANDLER", false)) {
                invokeCustomRegistration(localDevice, false);
            } else {
                ably.http.request(new Http.Execute<JsonObject>() { // from class: io.ably.lib.push.ActivationStateMachine.8
                    @Override // io.ably.lib.http.Http.Execute
                    public void execute(HttpScheduler httpScheduler, Callback<JsonObject> callback) throws AblyException {
                        httpScheduler.put("/push/deviceRegistrations/" + localDevice.id, ably.push.pushRequestHeaders(true), ParamsUtils.enrichParams(null, ably.options), HttpUtils.requestBodyFromGson(localDevice.toJsonObject(), ably.options.useBinaryProtocol), new Serialisation.HttpResponseHandler(), true, callback);
                    }
                }).async(new Callback<JsonObject>() { // from class: io.ably.lib.push.ActivationStateMachine.7
                    @Override // io.ably.lib.types.Callback
                    public void onSuccess(JsonObject jsonObject) {
                        Log.i(ActivationStateMachine.TAG, "updated registration " + localDevice.id);
                        JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(Presence.GET_CLIENTID);
                        if (asJsonPrimitive != null) {
                            String asString = asJsonPrimitive.getAsString();
                            if (localDevice.clientId == null) {
                                ActivationStateMachine.this.activationContext.setClientId(asString, false);
                            }
                        }
                        ActivationStateMachine.this.handleEvent(new RegistrationSynced());
                    }

                    @Override // io.ably.lib.types.Callback
                    public void onError(ErrorInfo errorInfo) {
                        Log.e(ActivationStateMachine.TAG, "error validating registration " + localDevice.id + ": " + errorInfo.toString());
                        ActivationStateMachine.this.handleEvent(new SyncRegistrationFailed(errorInfo));
                    }
                });
            }
        } catch (AblyException e) {
            ErrorInfo errorInfo = e.errorInfo;
            Log.e(TAG, "exception validating registration for " + localDevice.id + ": " + errorInfo.toString());
            handleEvent(new SyncRegistrationFailed(errorInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deregister() {
        final LocalDevice localDevice = this.activationContext.getLocalDevice();
        if (this.activationContext.getPreferences().getBoolean("ABLY_PUSH_REGISTRATION_HANDLER", false)) {
            invokeCustomDeregistration(localDevice);
            return;
        }
        try {
            final AblyRest deviceIdentityTokenBasedAblyClient = this.activationContext.getDeviceIdentityTokenBasedAblyClient(localDevice.deviceIdentityToken);
            deviceIdentityTokenBasedAblyClient.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.ActivationStateMachine.10
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<Void> callback) {
                    httpScheduler.del("/push/deviceRegistrations/" + localDevice.id, HttpUtils.mergeHeaders(HttpUtils.defaultAcceptHeaders(deviceIdentityTokenBasedAblyClient.options.useBinaryProtocol), localDevice.deviceIdentityHeaders()), ParamsUtils.enrichParams(new Param[0], deviceIdentityTokenBasedAblyClient.options), null, true, callback);
                }
            }).async(new Callback<Void>() { // from class: io.ably.lib.push.ActivationStateMachine.9
                @Override // io.ably.lib.types.Callback
                public void onSuccess(Void r2) {
                    Log.i(ActivationStateMachine.TAG, "deregistered " + localDevice.id);
                    ActivationStateMachine.this.handleEvent(new Deregistered());
                }

                @Override // io.ably.lib.types.Callback
                public void onError(ErrorInfo errorInfo) {
                    if (errorInfo.statusCode == 401 || errorInfo.code == 40005) {
                        Log.w(ActivationStateMachine.TAG, "unauthorized error during deregistration " + localDevice.id + ": " + errorInfo);
                        ActivationStateMachine.this.handleEvent(new Deregistered());
                        return;
                    }
                    Log.e(ActivationStateMachine.TAG, "error deregistering " + localDevice.id + ": " + errorInfo);
                    ActivationStateMachine.this.handleEvent(new DeregistrationFailed(errorInfo));
                }
            });
        } catch (AblyException e) {
            ErrorInfo errorInfo = e.errorInfo;
            Log.e(TAG, "exception registering " + localDevice.id + ": " + errorInfo.toString());
            handleEvent(new DeregistrationFailed(errorInfo));
        }
    }

    public ActivationStateMachine(ActivationContext activationContext) {
        this.activationContext = activationContext;
        this.context = activationContext.getContext();
        loadPersisted();
        this.handlingEvent = false;
    }

    private void loadPersisted() {
        this.current = getPersistedState();
        this.pendingEvents = getPersistedPendingEvents();
    }

    private void enqueueEvent(Event event) {
        Log.d(TAG, "enqueuing event: " + event);
        this.pendingEvents.add(event);
    }

    public synchronized boolean handleEvent(Event event) {
        if (this.handlingEvent) {
            enqueueEvent(event);
            return true;
        }
        this.handlingEvent = true;
        try {
            Log.d(TAG, "handling event " + event + " from state " + this.current);
            State transition = this.current.transition(event);
            if (transition == null) {
                enqueueEvent(event);
                return persist();
            }
            Log.d(TAG, "transition: " + this.current + " -(" + event + ")-> " + transition + ".");
            this.current = transition;
            while (true) {
                Event peek = this.pendingEvents.peek();
                if (peek == null) {
                    break;
                }
                Log.d(TAG, "attempting to consume pending event: " + peek);
                State transition2 = this.current.transition(peek);
                if (transition2 == null) {
                    break;
                }
                this.pendingEvents.poll();
                Log.d(TAG, "transition: " + this.current + " -(" + peek + ")-> " + transition2 + ".");
                this.current = transition2;
            }
            return persist();
        } finally {
            this.handlingEvent = false;
        }
    }

    public boolean reset() {
        SharedPreferences.Editor edit = this.activationContext.getPreferences().edit();
        for (Field field : PersistKeys.class.getDeclaredFields()) {
            try {
                edit.remove((String) field.get(null));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            return edit.commit();
        } finally {
            loadPersisted();
        }
    }

    private boolean persist() {
        SharedPreferences.Editor edit = this.activationContext.getPreferences().edit();
        State state = this.current;
        if (state instanceof PersistentState) {
            edit.putString(PersistKeys.CURRENT_STATE, ((PersistentState) state).getPersistedName());
        }
        edit.putInt("ABLY_PUSH_PENDING_EVENTS_LENGTH", this.pendingEvents.size());
        Iterator<Event> it = this.pendingEvents.iterator();
        int i = 0;
        while (it.hasNext()) {
            String persistedName = it.next().getPersistedName();
            if (persistedName != null) {
                edit.putString(String.format(Locale.ROOT, "%s[%d]", "ABLY_PUSH_PENDING_EVENTS", Integer.valueOf(i)), persistedName);
            }
            i++;
        }
        return edit.commit();
    }

    private State getPersistedState() {
        State constructStateByName = PersistentState.constructStateByName(this.activationContext.getPreferences().getString(PersistKeys.CURRENT_STATE, ""), this);
        return constructStateByName == null ? new NotActivated(this) : constructStateByName;
    }

    private ArrayDeque<Event> getPersistedPendingEvents() {
        int i = this.activationContext.getPreferences().getInt("ABLY_PUSH_PENDING_EVENTS_LENGTH", 0);
        ArrayDeque<Event> arrayDeque = new ArrayDeque<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            String string = this.activationContext.getPreferences().getString(String.format(Locale.ROOT, "%s[%d]", "ABLY_PUSH_PENDING_EVENTS", Integer.valueOf(i2)), "");
            Event constructEventByName = Event.constructEventByName(string);
            if (constructEventByName != null) {
                arrayDeque.add(constructEventByName);
            } else {
                Log.w(TAG, "Failed to construct push activation state machine event from persisted class name '" + string + "'.");
            }
        }
        return arrayDeque;
    }
}

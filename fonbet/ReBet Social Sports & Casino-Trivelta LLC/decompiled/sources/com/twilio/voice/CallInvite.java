package com.twilio.voice;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.twilio.voice.AcceptOptions;
import com.twilio.voice.Call;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class CallInvite implements Parcelable {
    private final String bridgeToken;
    final Map<String, String> callInviteMessage;
    private final Call.Listener callListenerProxy;
    private final String callSid;
    private CallerInfo callerInfo;
    final Map<String, String> customParameters;
    Call.EventListener eventListenerProxy;
    private final String from;
    private final String messageSid;
    private final String stirStatus;
    private final String to;
    private static final Logger logger = Logger.getLogger(InternalCall.class);
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.twilio.voice.CallInvite.3
        @Override // android.os.Parcelable.Creator
        public CallInvite createFromParcel(Parcel parcel) {
            return new CallInvite(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CallInvite[] newArray(int i10) {
            return new CallInvite[i10];
        }
    };

    public static /* synthetic */ void a(Call call, Call.Listener listener) {
        logger.d("Attempted to reject CallInvite that was previously accepted,rejected, or canceled.");
        call.state = Call.State.DISCONNECTED;
        listener.onConnectFailure(call, CallException.CallCancelledException);
    }

    public static /* synthetic */ void b(Call call, Call.Listener listener) {
        logger.d("Attempted to accept CallInvite that was previously accepted,rejected, or canceled.");
        call.state = Call.State.DISCONNECTED;
        listener.onConnectFailure(call, CallException.CallCancelledException);
    }

    public static CallInvite create(Map<String, String> map) {
        return new CallInvite(map);
    }

    public static boolean isValid(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(bundle, "data must not be null");
        return isValid(context, Utils.bundleToMap(bundle));
    }

    private static native boolean nativeIsValid(String[] strArr, String[] strArr2);

    @NonNull
    public synchronized Call accept(@NonNull Context context, @NonNull AcceptOptions acceptOptions, @NonNull Call.Listener listener) {
        return accept(context, acceptOptions, listener, this.eventListenerProxy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CallInvite) {
            CallInvite callInvite = (CallInvite) obj;
            if (getFrom().equals(callInvite.getFrom()) && getTo().equals(callInvite.getTo()) && getCallSid().equals(callInvite.getCallSid())) {
                return true;
            }
        }
        return false;
    }

    public String getBridgeToken() {
        return this.bridgeToken;
    }

    @NonNull
    public String getCallSid() {
        return this.callSid;
    }

    @NonNull
    public CallerInfo getCallerInfo() {
        return this.callerInfo;
    }

    @NonNull
    public Map<String, String> getCustomParameters() {
        return this.customParameters;
    }

    public String getFrom() {
        return this.from;
    }

    @NonNull
    public String getMessageSid() {
        return this.messageSid;
    }

    @NonNull
    public String getTo() {
        return this.to;
    }

    public synchronized void reject(@NonNull Context context) {
        reject(context, this.callListenerProxy, this.eventListenerProxy);
    }

    public String sendMessage(CallMessage callMessage) {
        CallInviteProxy callInviteProxy = Voice.callInviteProxyMap.get(this.callSid);
        if (callInviteProxy != null) {
            return callInviteProxy.sendMessage(callMessage);
        }
        logger.d("Attempted to accept CallInvite that was previously accepted,rejected, or canceled.");
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringArray(new String[]{this.from, this.to, this.callSid, this.bridgeToken, this.messageSid, this.stirStatus});
        parcel.writeInt(this.callInviteMessage.size());
        for (Map.Entry<String, String> entry : this.callInviteMessage.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        Map<String, String> map = this.customParameters;
        if (map != null) {
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry2 : this.customParameters.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
    }

    private CallInvite(Map<String, String> map) {
        this.callListenerProxy = new Call.Listener() { // from class: com.twilio.voice.CallInvite.1
            @Override // com.twilio.voice.Call.Listener
            public void onCallQualityWarningsChanged(Call call, Set<Call.CallQualityWarning> set, Set<Call.CallQualityWarning> set2) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onConnectFailure(@NonNull Call call, @NonNull CallException callException) {
                call.release();
            }

            @Override // com.twilio.voice.Call.Listener
            public void onConnected(@NonNull Call call) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onDisconnected(@NonNull Call call, CallException callException) {
                call.release();
            }

            @Override // com.twilio.voice.Call.Listener
            public void onReconnected(@NonNull Call call) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onReconnecting(@NonNull Call call, @NonNull CallException callException) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onRinging(@NonNull Call call) {
            }
        };
        this.eventListenerProxy = new Call.EventListener() { // from class: com.twilio.voice.CallInvite.2
            @Override // com.twilio.voice.Call.EventListener
            public void onEvent(Map<String, Pair<String, Class>> map2) {
            }

            @Override // com.twilio.voice.Call.EventListener
            public void onMetric(Map<String, Pair<String, Class>> map2) {
            }
        };
        this.from = map.get(VoiceConstants.FROM);
        this.to = map.get(VoiceConstants.TO);
        this.callSid = map.get(VoiceConstants.CALL_SID);
        this.bridgeToken = map.get(VoiceConstants.BRIDGE_TOKEN);
        this.messageSid = map.get(VoiceConstants.MESSAGE_SID);
        String str = map.get(VoiceConstants.STIR_STATUS);
        this.stirStatus = str;
        this.callerInfo = new CallerInfo(str);
        HashMap hashMap = new HashMap();
        this.customParameters = hashMap;
        String str2 = map.get(VoiceConstants.CUSTOM_PARAMS);
        if (str2 != null) {
            Utils.parseCustomParams(str2, hashMap);
        }
        this.callInviteMessage = map;
    }

    @NonNull
    public synchronized Call accept(@NonNull Context context, @NonNull Call.Listener listener) {
        return accept(context, new AcceptOptions.Builder().build(), listener);
    }

    @NonNull
    public synchronized Call accept(@NonNull Context context, @NonNull AcceptOptions acceptOptions, @NonNull final Call.Listener listener, @NonNull Call.EventListener eventListener) {
        final Call call;
        try {
            Preconditions.checkNotNull(context, "context must not be null");
            Preconditions.checkNotNull(acceptOptions, "acceptOptions must not be null");
            Preconditions.checkNotNull(listener, "listener must not be null");
            if (Utils.isAudioPermissionGranted(context)) {
                call = new Call(context.getApplicationContext(), this, listener);
                CallInviteProxy callInviteProxy = Voice.callInviteProxyMap.get(this.callSid);
                if (callInviteProxy != null) {
                    callInviteProxy.setTempCallSid(call.tempCallSid);
                    AcceptOptions.Builder builder = new AcceptOptions.Builder(this, false);
                    if (acceptOptions.getIceOptions() != null) {
                        builder.iceOptions(acceptOptions.getIceOptions());
                    }
                    if (acceptOptions.getPreferredAudioCodecs() != null) {
                        builder.preferAudioCodecs(acceptOptions.getPreferredAudioCodecs());
                    }
                    builder.enableDscp(acceptOptions.enableDscp);
                    builder.enableIceGatheringOnAnyAddressPorts(acceptOptions.enableIceGatheringOnAnyAddressPorts);
                    builder.audioTracks(Collections.singletonList(LocalAudioTrack.create(context, true, acceptOptions.getAudioOptions())));
                    builder.callMessageListener(acceptOptions.getCallMessageListener());
                    builder.audioOptions(acceptOptions.getAudioOptions());
                    AcceptOptions build = builder.build();
                    callInviteProxy.setCall(call);
                    callInviteProxy.setEventListener(eventListener);
                    call.accept(build, callInviteProxy.nativeCallInviteProxy);
                    callInviteProxy.release(this.callSid);
                } else {
                    Utils.createHandler().post(new Runnable() { // from class: com.twilio.voice.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            CallInvite.b(Call.this, listener);
                        }
                    });
                }
            } else {
                throw new SecurityException("Requires the RECORD_AUDIO permission");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return call;
    }

    public void reject(@NonNull Context context, @NonNull final Call.Listener listener, @NonNull Call.EventListener eventListener) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(context, "listener must not be null");
        Preconditions.checkNotNull(context, "eventListener must not be null");
        final Call call = new Call(context.getApplicationContext(), this, listener);
        CallInviteProxy callInviteProxy = Voice.callInviteProxyMap.get(this.callSid);
        if (callInviteProxy != null) {
            AcceptOptions build = new AcceptOptions.Builder(this, true).build();
            callInviteProxy.setEventListener(eventListener);
            call.reject(build, callInviteProxy);
            callInviteProxy.release(this.callSid);
            return;
        }
        Utils.createHandler().post(new Runnable() { // from class: com.twilio.voice.m
            @Override // java.lang.Runnable
            public final void run() {
                CallInvite.a(Call.this, listener);
            }
        });
    }

    public static boolean isValid(Context context, Map<String, String> map) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(map, "data must not be null");
        Pair<String[], String[]> mapToArrays = Utils.mapToArrays(map);
        Voice.loadLibrary(context);
        return nativeIsValid((String[]) mapToArrays.first, (String[]) mapToArrays.second);
    }

    private CallInvite(Parcel parcel) {
        this.callListenerProxy = new Call.Listener() { // from class: com.twilio.voice.CallInvite.1
            @Override // com.twilio.voice.Call.Listener
            public void onCallQualityWarningsChanged(Call call, Set<Call.CallQualityWarning> set, Set<Call.CallQualityWarning> set2) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onConnectFailure(@NonNull Call call, @NonNull CallException callException) {
                call.release();
            }

            @Override // com.twilio.voice.Call.Listener
            public void onConnected(@NonNull Call call) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onDisconnected(@NonNull Call call, CallException callException) {
                call.release();
            }

            @Override // com.twilio.voice.Call.Listener
            public void onReconnected(@NonNull Call call) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onReconnecting(@NonNull Call call, @NonNull CallException callException) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onRinging(@NonNull Call call) {
            }
        };
        this.eventListenerProxy = new Call.EventListener() { // from class: com.twilio.voice.CallInvite.2
            @Override // com.twilio.voice.Call.EventListener
            public void onEvent(Map<String, Pair<String, Class>> map2) {
            }

            @Override // com.twilio.voice.Call.EventListener
            public void onMetric(Map<String, Pair<String, Class>> map2) {
            }
        };
        String[] strArr = new String[6];
        parcel.readStringArray(strArr);
        this.from = strArr[0];
        this.to = strArr[1];
        this.callSid = strArr[2];
        this.bridgeToken = strArr[3];
        this.messageSid = strArr[4];
        String str = strArr[5];
        this.stirStatus = str;
        this.callerInfo = new CallerInfo(str);
        int readInt = parcel.readInt();
        this.callInviteMessage = new HashMap(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.callInviteMessage.put(parcel.readString(), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        this.customParameters = new HashMap(readInt2);
        for (int i11 = 0; i11 < readInt2; i11++) {
            this.customParameters.put(parcel.readString(), parcel.readString());
        }
    }
}

package com.braze.location;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1483w0;
import V9.C1754j;
import V9.InterfaceC1750f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.braze.BrazeInternal;
import com.braze.enums.GeofenceTransitionType;
import com.braze.location.BrazeActionReceiver;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/location/BrazeActionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "ActionReceiver", "android-sdk-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeActionReceiver extends BroadcastReceiver {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/braze/location/BrazeActionReceiver$ActionReceiver;", "", "applicationContext", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "<init>", "(Landroid/content/Context;Landroid/content/Intent;)V", "action", "", "run", "", "performWork", "Companion", "android-sdk-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazeActionReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeActionReceiver.kt\ncom/braze/location/BrazeActionReceiver$ActionReceiver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
    public static final class ActionReceiver {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String action;

        @NotNull
        private final Context applicationContext;

        @NotNull
        private final Intent intent;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/braze/location/BrazeActionReceiver$ActionReceiver$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Landroid/location/Location;", "location", "", "handleSingleLocationUpdate", "(Landroid/content/Context;Landroid/location/Location;)Z", "LV9/j;", "geofenceEvent", "handleGeofenceEvent", "(Landroid/content/Context;LV9/j;)Z", "android-sdk-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nBrazeActionReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeActionReceiver.kt\ncom/braze/location/BrazeActionReceiver$ActionReceiver$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n1869#2,2:161\n1869#2,2:163\n*S KotlinDebug\n*F\n+ 1 BrazeActionReceiver.kt\ncom/braze/location/BrazeActionReceiver$ActionReceiver$Companion\n*L\n132#1:161,2\n142#1:163,2\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String handleGeofenceEvent$lambda$0(int i10) {
                return "Location Services error: " + i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String handleGeofenceEvent$lambda$3(int i10) {
                return "Unsupported transition type received: " + i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean handleSingleLocationUpdate(Context applicationContext, Location location) {
                try {
                    BrazeInternal.logLocationRecordedEvent(applicationContext, new BrazeLocation(location));
                    return true;
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: M3.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handleSingleLocationUpdate$lambda$0;
                            handleSingleLocationUpdate$lambda$0 = BrazeActionReceiver.ActionReceiver.Companion.handleSingleLocationUpdate$lambda$0();
                            return handleSingleLocationUpdate$lambda$0;
                        }
                    }, 4, (Object) null);
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String handleSingleLocationUpdate$lambda$0() {
                return "Exception while processing single location update";
            }

            public final boolean handleGeofenceEvent(@NotNull Context applicationContext, @NotNull C1754j geofenceEvent) {
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
                if (geofenceEvent.f()) {
                    final int b10 = geofenceEvent.b();
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handleGeofenceEvent$lambda$0;
                            handleGeofenceEvent$lambda$0 = BrazeActionReceiver.ActionReceiver.Companion.handleGeofenceEvent$lambda$0(b10);
                            return handleGeofenceEvent$lambda$0;
                        }
                    }, 6, (Object) null);
                    return false;
                }
                final int c10 = geofenceEvent.c();
                List d10 = geofenceEvent.d();
                if (1 == c10) {
                    if (d10 != null) {
                        Iterator it = d10.iterator();
                        while (it.hasNext()) {
                            String requestId = ((InterfaceC1750f) it.next()).getRequestId();
                            Intrinsics.checkNotNullExpressionValue(requestId, "getRequestId(...)");
                            BrazeInternal.recordGeofenceTransition(applicationContext, requestId, GeofenceTransitionType.ENTER);
                        }
                    }
                    return true;
                }
                if (2 != c10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handleGeofenceEvent$lambda$3;
                            handleGeofenceEvent$lambda$3 = BrazeActionReceiver.ActionReceiver.Companion.handleGeofenceEvent$lambda$3(c10);
                            return handleGeofenceEvent$lambda$3;
                        }
                    }, 6, (Object) null);
                    return false;
                }
                if (d10 != null) {
                    Iterator it2 = d10.iterator();
                    while (it2.hasNext()) {
                        String requestId2 = ((InterfaceC1750f) it2.next()).getRequestId();
                        Intrinsics.checkNotNullExpressionValue(requestId2, "getRequestId(...)");
                        BrazeInternal.recordGeofenceTransition(applicationContext, requestId2, GeofenceTransitionType.EXIT);
                    }
                }
                return true;
            }

            private Companion() {
            }
        }

        public ActionReceiver(@NotNull Context applicationContext, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.applicationContext = applicationContext;
            this.intent = intent;
            this.action = intent.getAction();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$0(ActionReceiver actionReceiver) {
            return "Received intent with action " + actionReceiver.action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$1() {
            return "Received intent with null action. Doing nothing.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$2(ActionReceiver actionReceiver) {
            return "BrazeActionReceiver received intent with geofence transition: " + actionReceiver.action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$4(ActionReceiver actionReceiver) {
            return "BrazeActionReceiver received intent with single location update: " + actionReceiver.action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$6(ActionReceiver actionReceiver) {
            return "Unknown intent received in BrazeActionReceiver with action: " + actionReceiver.action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String run$lambda$0(ActionReceiver actionReceiver) {
            return "Caught exception while performing the BrazeActionReceiver work. Action: " + actionReceiver.action + " Intent: " + actionReceiver.intent;
        }

        public final void performWork() {
            Object parcelable;
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String performWork$lambda$0;
                    performWork$lambda$0 = BrazeActionReceiver.ActionReceiver.performWork$lambda$0(BrazeActionReceiver.ActionReceiver.this);
                    return performWork$lambda$0;
                }
            }, 7, (Object) null);
            String str = this.action;
            if (str == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String performWork$lambda$1;
                        performWork$lambda$1 = BrazeActionReceiver.ActionReceiver.performWork$lambda$1();
                        return performWork$lambda$1;
                    }
                }, 7, (Object) null);
                return;
            }
            if (Intrinsics.areEqual(str, "com.braze.action.receiver.BRAZE_GEOFENCE_UPDATE")) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String performWork$lambda$2;
                        performWork$lambda$2 = BrazeActionReceiver.ActionReceiver.performWork$lambda$2(BrazeActionReceiver.ActionReceiver.this);
                        return performWork$lambda$2;
                    }
                }, 7, (Object) null);
                C1754j a10 = C1754j.a(this.intent);
                if (a10 != null) {
                    INSTANCE.handleGeofenceEvent(this.applicationContext, a10);
                    return;
                }
                return;
            }
            if (!Intrinsics.areEqual(str, "com.braze.action.receiver.SINGLE_LOCATION_UPDATE")) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String performWork$lambda$6;
                        performWork$lambda$6 = BrazeActionReceiver.ActionReceiver.performWork$lambda$6(BrazeActionReceiver.ActionReceiver.this);
                        return performWork$lambda$6;
                    }
                }, 6, (Object) null);
                return;
            }
            Location location = null;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String performWork$lambda$4;
                    performWork$lambda$4 = BrazeActionReceiver.ActionReceiver.performWork$lambda$4(BrazeActionReceiver.ActionReceiver.this);
                    return performWork$lambda$4;
                }
            }, 7, (Object) null);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle extras = this.intent.getExtras();
                if (extras != null) {
                    parcelable = extras.getParcelable("location", Location.class);
                    location = (Location) parcelable;
                }
            } else {
                Bundle extras2 = this.intent.getExtras();
                location = (Location) (extras2 != null ? extras2.get("location") : null);
            }
            if (location != null) {
                INSTANCE.handleSingleLocationUpdate(this.applicationContext, location);
            }
        }

        public final void run() {
            try {
                performWork();
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: M3.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String run$lambda$0;
                        run$lambda$0 = BrazeActionReceiver.ActionReceiver.run$lambda$0(BrazeActionReceiver.ActionReceiver.this);
                        return run$lambda$0;
                    }
                }, 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$0() {
        return "BrazeActionReceiver received null intent. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$1() {
        return "BrazeActionReceiver received null context. Doing nothing.";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onReceive$lambda$0;
                    onReceive$lambda$0 = BrazeActionReceiver.onReceive$lambda$0();
                    return onReceive$lambda$0;
                }
            }, 6, (Object) null);
            return;
        }
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onReceive$lambda$1;
                    onReceive$lambda$1 = BrazeActionReceiver.onReceive$lambda$1();
                    return onReceive$lambda$1;
                }
            }, 6, (Object) null);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver.PendingResult goAsync = goAsync();
        Intrinsics.checkNotNull(applicationContext);
        AbstractC1459k.d(C1483w0.f9135a, C1452g0.b(), null, new BrazeActionReceiver$onReceive$3(new ActionReceiver(applicationContext, intent), goAsync, null), 2, null);
    }
}

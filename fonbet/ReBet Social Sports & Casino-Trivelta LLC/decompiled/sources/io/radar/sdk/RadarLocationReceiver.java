package io.radar.sdk;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import io.radar.sdk.C4589c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/radar/sdk/RadarLocationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadarLocationReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: io.radar.sdk.RadarLocationReceiver$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context) {
            return new Intent(context, (Class<?>) RadarLocationReceiver.class);
        }

        public final PendingIntent b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent a10 = a(context);
            a10.setAction("io.radar.sdk.LocationReceiver.ACTIVITY");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 201605254, a10, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        public final PendingIntent c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent a10 = a(context);
            a10.setAction("io.radar.sdk.LocationReceiver.BEACON");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 201605253, a10, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        public final PendingIntent d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent a10 = a(context);
            a10.setAction("io.radar.sdk.LocationReceiver.GEOFENCE");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 201605251, a10, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        public final PendingIntent e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent a10 = a(context);
            a10.setAction("io.radar.sdk.LocationReceiver.LOCATION");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 201605250, a10, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        public final PendingIntent f(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent a10 = a(context);
            a10.setAction("io.radar.sdk.LocationReceiver.SYNCED_GEOFENCES");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 201605252, a10, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        public final PendingIntent g(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent a10 = a(context);
            a10.setAction("io.radar.sdk.LocationReceiver.VERIFIED_LOCATION");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 201605255, a10, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r1.equals("io.radar.sdk.LocationReceiver.GEOFENCE") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        r1 = r0.x().p(r11);
        r3 = r0.x().s(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        r0.J(r10, r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        if (r1.equals("io.radar.sdk.LocationReceiver.SYNCED_GEOFENCES") == false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        int intExtra;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        C4589c c4589c = C4589c.f49918a;
        if (!c4589c.v()) {
            C4589c.N(context, null, 2, null);
        }
        G0.b(c4589c.y(), "Received broadcast | action = " + intent.getAction(), null, null, 6, null);
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2035686220:
                    break;
                case -992172314:
                    break;
                case -930677989:
                    if (action.equals("io.radar.sdk.LocationReceiver.LOCATION")) {
                        Location q10 = c4589c.x().q(intent);
                        C4589c.EnumC4597i enumC4597i = C4589c.EnumC4597i.BACKGROUND_LOCATION;
                        if (q10 != null) {
                            if (Build.VERSION.SDK_INT < 26 || RadarForegroundService.INSTANCE.a()) {
                                c4589c.J(context, q10, enumC4597i);
                                break;
                            } else {
                                RadarJobScheduler.INSTANCE.a(context, q10, enumC4597i);
                                break;
                            }
                        }
                    }
                    break;
                case 798292259:
                    if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                        c4589c.I(context);
                        break;
                    }
                    break;
                case 1093389610:
                    if (action.equals("io.radar.sdk.LocationReceiver.BEACON") && Build.VERSION.SDK_INT >= 26 && (intExtra = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1)) != -1) {
                        try {
                            RadarJobScheduler.INSTANCE.b(context, C4631k0.f50118a.a(intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT")), intExtra == 4 ? C4589c.EnumC4597i.BEACON_EXIT : C4589c.EnumC4597i.BEACON_ENTER);
                            break;
                        } catch (Exception e10) {
                            C4589c.f49918a.y().c("Error scheduling beacons job", C4589c.EnumC4600l.SDK_EXCEPTION, e10);
                            break;
                        }
                    }
                    break;
            }
        }
        if (ActivityTransitionResult.i(intent)) {
            ActivityTransitionResult g10 = ActivityTransitionResult.g(intent);
            Intrinsics.checkNotNull(g10);
            for (ActivityTransitionEvent activityTransitionEvent : g10.h()) {
                C4589c.EnumC4590a a10 = P.f49775e.a(activityTransitionEvent.g());
                M0 m02 = M0.f49714a;
                JSONObject i10 = m02.i(context);
                if (i10 != null && Intrinsics.areEqual(i10.getString("type"), a10.toString())) {
                    G0.g(C4589c.f49918a.y(), "Activity detected but not initiating trackOnce for: " + a10, null, null, 6, null);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", a10.toString());
                jSONObject.put("dateTime", activityTransitionEvent.h());
                m02.y(context, jSONObject);
                G0.g(C4589c.f49918a.y(), "Activity detected and initiating trackOnce for: " + a10, null, null, 6, null);
            }
            C4589c.Y0(null, 1, null);
        }
    }
}

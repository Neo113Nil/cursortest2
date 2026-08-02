package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zsl extends BroadcastReceiver {
    public static final a a = new a(null);
    public static WeakReference b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            a aVar = a;
            if (hashCode == -1996491295) {
                if (action.equals("com.blaze.blazesdk.pip.ACTION_PAUSE")) {
                    aVar.getClass();
                    WeakReference weakReference = b;
                    twl twlVar = weakReference != null ? (twl) weakReference.get() : null;
                    if (twlVar != null) {
                        VideosPlayerActivity videosPlayerActivity = (VideosPlayerActivity) twlVar;
                        com.blaze.blazesdk.features.videos.players.ui.a aVar2 = videosPlayerActivity.m;
                        if (aVar2 != null && aVar2.t()) {
                            w3m w3mVar = (w3m) aVar2.getViewModel();
                            w3mVar.getClass();
                            mzm.f(w3mVar);
                            drm.onEvent$default(w3mVar.P0, l7m.a, false, 2, null);
                        }
                        videosPlayerActivity.u(false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (hashCode == -895676983 && action.equals("com.blaze.blazesdk.pip.ACTION_PLAY")) {
                aVar.getClass();
                WeakReference weakReference2 = b;
                twl twlVar2 = weakReference2 != null ? (twl) weakReference2.get() : null;
                if (twlVar2 != null) {
                    VideosPlayerActivity videosPlayerActivity2 = (VideosPlayerActivity) twlVar2;
                    com.blaze.blazesdk.features.videos.players.ui.a aVar3 = videosPlayerActivity2.m;
                    if (aVar3 != null && aVar3.t()) {
                        w3m w3mVar2 = (w3m) aVar3.getViewModel();
                        w3mVar2.getClass();
                        mzm.g(w3mVar2);
                        drm.onEvent$default(w3mVar2.P0, dam.a, false, 2, null);
                    }
                    videosPlayerActivity2.u(true);
                }
            }
        }
    }
}

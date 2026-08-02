package defpackage;

import com.blaze.blazesdk.players.a;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m7m implements wke {
    public final /* synthetic */ a a;
    public final /* synthetic */ n4m b;
    public final /* synthetic */ Function0 c;

    public m7m(a aVar, n4m n4mVar, Function0 function0) {
        this.a = aVar;
        this.b = n4mVar;
        this.c = function0;
    }

    @Override // defpackage.wke
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        n4m n4mVar = this.a.c;
        if (Intrinsics.c(n4mVar != null ? n4mVar.a : null, this.b.a) && i == 5) {
            this.c.invoke();
        }
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        SessionManager b;
        CastSession c;
        RemoteMediaClient k;
        MediaStatus h;
        a aVar = this.a;
        n4m n4mVar = aVar.c;
        Integer num = null;
        if (Intrinsics.c(n4mVar != null ? n4mVar.a : null, this.b.a)) {
            Function0 function0 = this.c;
            if (i != 1) {
                if (i != 4) {
                    return;
                }
                function0.invoke();
                return;
            }
            CastContext castContext = aVar.g;
            if (castContext != null && (b = castContext.b()) != null && (c = b.c()) != null && (k = c.k()) != null && (h = k.h()) != null) {
                num = Integer.valueOf(h.f);
            }
            if (num != null && num.intValue() == 1) {
                function0.invoke();
            }
        }
    }
}

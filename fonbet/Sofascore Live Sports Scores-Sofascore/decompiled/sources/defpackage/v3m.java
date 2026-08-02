package defpackage;

import android.os.Bundle;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v3m implements Function2 {
    public final /* synthetic */ VideosPlayerActivity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ boolean c;

    public v3m(VideosPlayerActivity videosPlayerActivity, Bundle bundle, boolean z) {
        this.a = videosPlayerActivity;
        this.b = bundle;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        VideosPlayerActivity.a aVar = VideosPlayerActivity.u;
        this.a.t(this.b, this.c, of3Var, 0);
        return Unit.a;
    }
}

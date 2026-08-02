package defpackage;

import com.inmobi.ads.InMobiNative;
import com.inmobi.media.Uc;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8k implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Uc b;

    public /* synthetic */ v8k(Uc uc, int i) {
        this.a = i;
        this.b = uc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Uc uc = this.b;
        InMobiNative inMobiNative = (InMobiNative) obj;
        switch (i) {
            case 0:
                return Uc.e(uc, inMobiNative);
            case 1:
                return Uc.d(uc, inMobiNative);
            case 2:
                return Uc.c(uc, inMobiNative);
            case 3:
                return Uc.f(uc, inMobiNative);
            case 4:
                return Uc.g(uc, inMobiNative);
            case 5:
                return Uc.h(uc, inMobiNative);
            case 6:
                return Uc.b(uc, inMobiNative);
            default:
                return Uc.a(uc, inMobiNative);
        }
    }
}

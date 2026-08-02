package defpackage;

import com.google.android.gms.ads.nativead.NativeAd;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zh2 implements ct8 {
    public static final zh2 b = new zh2(0);
    public static final zh2 c = new zh2(1);
    public static final zh2 d = new zh2(2);
    public static final zh2 e = new zh2(3);
    public static final zh2 f = new zh2(4);
    public static final zh2 g = new zh2(5);
    public static final zh2 h = new zh2(6);
    public final /* synthetic */ int a;

    public /* synthetic */ zh2(int i) {
        this.a = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                try {
                    dmi.u((d2g) obj2);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused) {
                }
                return Unit.a;
            case 1:
                of3 of3Var = (of3) obj2;
                int intValue = ((Number) obj3).intValue();
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    av8Var.W();
                }
                return Unit.a;
            case 2:
                ((Number) obj3).intValue();
                return Unit.a;
            case 3:
                long j = ((r13) obj).a;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Number) obj3).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    kq9.b(s6a.N(R.drawable.ic_chevron_up, 6, av8Var2), null, haa.v(bkh.l(utc.a, 16.0f), 180.0f), lz.D(R.color.surface_1, av8Var2), av8Var2, 432, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 4:
                d2g d2gVar = (d2g) obj2;
                ((Throwable) obj).getClass();
                d2gVar.getClass();
                ((CoroutineContext) obj3).getClass();
                wol.b(d2gVar);
                return Unit.a;
            case 5:
                NativeAd nativeAd = (NativeAd) obj2;
                ((Throwable) obj).getClass();
                ((CoroutineContext) obj3).getClass();
                if (nativeAd != null) {
                    nativeAd.destroy();
                }
                return Unit.a;
            default:
                return null;
        }
    }
}

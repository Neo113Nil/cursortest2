package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class iv3 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ iv3(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    j72.h(null, Integer.valueOf(R.drawable.no_data), Integer.valueOf(R.string.empty_search_title), null, false, l98.B(32.0f, 2), 0, this.b, av8Var, 196608, 89);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                kq9.b(s6a.N(R.drawable.ic_tv_channel_checkmark, 6, of3Var2), null, bkh.l(utc.a, 24.0f), this.b, of3Var2, 432, 0);
                break;
        }
        return Unit.a;
    }
}

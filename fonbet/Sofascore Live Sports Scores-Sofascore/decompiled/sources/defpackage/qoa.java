package defpackage;

import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class qoa implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qoa(MmaFightNightActivity mmaFightNightActivity, int i, boolean z) {
        this.d = mmaFightNightActivity;
        this.b = i;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        int i2 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ad5 ad5Var = (ad5) obj2;
                ((kx4) obj).getClass();
                if (!z) {
                    i2 = -i2;
                }
                return new r6a((ad5Var.a << 32) | (i2 & 4294967295L));
            default:
                ((Boolean) obj).getClass();
                int i3 = MmaFightNightActivity.R;
                ((MmaFightNightActivity) obj2).X().l(i2, true, z);
                return Unit.a;
        }
    }

    public /* synthetic */ qoa(boolean z, int i, ad5 ad5Var) {
        this.c = z;
        this.b = i;
        this.d = ad5Var;
    }
}

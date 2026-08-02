package defpackage;

import com.sofascore.results.ads.iml.banner.AdBannerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v0 extends f3 {
    public final f3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ArrayList arrayList, ArrayList arrayList2, f3 f3Var) {
        super(arrayList, arrayList2);
        arrayList.getClass();
        f3Var.getClass();
        this.o = f3Var;
    }

    @Override // defpackage.f3, defpackage.o02
    public final boolean H(int i, int i2) {
        return this.o.H(i, i2);
    }

    @Override // defpackage.o02
    public final boolean I(int i, int i2) {
        Object obj = this.m.get(i);
        Object obj2 = this.n.get(i2);
        return ((obj instanceof AdBannerView) && (obj2 instanceof AdBannerView)) ? obj == obj2 : this.o.I(i, i2);
    }
}

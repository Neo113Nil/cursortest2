package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum ye8 implements ze8 {
    Inactive(R.drawable.ic_star_empty, jq2.p),
    Active(R.drawable.ic_star, jq2.q);

    public final int a;
    public final Function2 b;

    ye8(int i, Function2 function2) {
        this.a = i;
        this.b = function2;
    }

    @Override // defpackage.ze8
    public final int d() {
        return this.a;
    }

    @Override // defpackage.ze8
    public final Function2 getColor() {
        return this.b;
    }
}

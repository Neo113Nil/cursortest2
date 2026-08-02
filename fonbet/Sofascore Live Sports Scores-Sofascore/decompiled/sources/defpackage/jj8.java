package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jj8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ kj8 a;
    public final /* synthetic */ LinkedHashMap b;
    public final /* synthetic */ ksk c;
    public final /* synthetic */ LinkedHashMap d;

    public jj8(kj8 kj8Var, LinkedHashMap linkedHashMap, ksk kskVar, LinkedHashMap linkedHashMap2) {
        this.a = kj8Var;
        this.b = linkedHashMap;
        this.c = kskVar;
        this.d = linkedHashMap2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        ksk kskVar = this.c;
        LinearLayout linearLayout = kskVar.d;
        kj8 kj8Var = this.a;
        kj8Var.w(this.b, linearLayout, true);
        kj8Var.w(this.d, kskVar.b, false);
    }
}

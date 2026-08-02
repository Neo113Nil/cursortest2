package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class axe implements wke {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ View b;

    public axe(View view, Function1 function1) {
        this.a = function1;
        this.b = view;
    }

    @Override // defpackage.wke
    public final void onSurfaceSizeChanged(int i, int i2) {
        this.a.invoke(this.b);
    }
}

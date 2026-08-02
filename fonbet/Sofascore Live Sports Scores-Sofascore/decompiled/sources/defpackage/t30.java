package defpackage;

import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t30 implements o8j {
    public final View a;
    public final Function1 b;
    public final Function0 c;
    public final q1d d = new q1d();
    public final a5f e = new a5f(new o30(this, 0));
    public final o30 f = new o30(this, 1);
    public final o30 g = new o30(this, 2);
    public ActionMode h;
    public p3 i;
    public Runnable j;

    public t30(View view, Function1 function1, Function0 function0) {
        this.a = view;
        this.b = function1;
        this.c = function0;
    }

    @Override // defpackage.o8j
    public final Object a(g8j g8jVar, hoi hoiVar) {
        Object a = q1d.a(this.d, new cl(this, g8jVar, null, 3), hoiVar);
        return a == lu3.a ? a : Unit.a;
    }
}

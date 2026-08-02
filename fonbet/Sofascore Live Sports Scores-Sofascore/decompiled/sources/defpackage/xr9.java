package defpackage;

import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xr9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ du9[] d;
    public final /* synthetic */ Function1 e;

    public xr9(View view, ImageView imageView, int i, du9[] du9VarArr, Function1 function1) {
        this.a = view;
        this.b = imageView;
        this.c = i;
        this.d = du9VarArr;
        this.e = function1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.a.removeOnAttachStateChangeListener(this);
        ImageView imageView = this.b;
        u6b w = qha.w(imageView);
        if (w != null) {
            g9i L = xw3.L(wca.x(w.getLifecycle()), null, null, new z23(this.c, this.d, imageView, (rq3) null), 3);
            Function1 function1 = this.e;
            if (function1 != null) {
                function1.invoke(L);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}

package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.model.branding.BrandLocation;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d32 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ BrandLocation c;
    public final /* synthetic */ String d;
    public final /* synthetic */ View e;
    public final /* synthetic */ FrameLayout f;

    public /* synthetic */ d32(View view, FrameLayout frameLayout, Integer num, BrandLocation brandLocation, String str, int i) {
        this.a = i;
        this.e = view;
        this.f = frameLayout;
        this.b = num;
        this.c = brandLocation;
        this.d = str;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        FrameLayout frameLayout = this.f;
        View view2 = this.e;
        view.getClass();
        switch (i) {
            case 0:
                ((f32) view2).removeOnAttachStateChangeListener(this);
                f32 f32Var = (f32) frameLayout;
                g6b t = qea.t(f32Var);
                if (t != null) {
                    zsk zskVar = new zsk(t, 30);
                    zskVar.b(f32Var, new e32(f32Var, this.b, this.c, this.d, 0), null);
                    f32Var.b = zskVar;
                    break;
                }
                break;
            default:
                view2.removeOnAttachStateChangeListener(this);
                f32 f32Var2 = (f32) frameLayout;
                g6b t2 = qea.t(f32Var2);
                if (t2 != null) {
                    zsk zskVar2 = new zsk(t2, 30);
                    zskVar2.b(f32Var2, new e32(f32Var2, this.b, this.c, this.d, 1), null);
                    f32Var2.b = zskVar2;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        view.getClass();
    }
}

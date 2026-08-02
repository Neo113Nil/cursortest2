package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class cc3 extends Dialog implements u6b, vpd, g8d, qqg {
    public y6b a;
    public final oqg b;
    public final mqi c;
    public final mqi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc3(Context context, int i) {
        super(context, i);
        context.getClass();
        this.b = new oqg(new pqg(this, new e6g(this, 8)));
        final int i2 = 0;
        this.c = ypa.b(new Function0(this) { // from class: bc3
            public final /* synthetic */ cc3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                cc3 cc3Var = this.b;
                switch (i3) {
                    case 0:
                        i35 i35Var = new i35();
                        cc3Var.getNavigationEventDispatcher().b(i35Var);
                        return i35Var;
                    default:
                        return new upd(new wb3(cc3Var, 1));
                }
            }
        });
        final int i3 = 1;
        this.d = ypa.b(new Function0(this) { // from class: bc3
            public final /* synthetic */ cc3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                cc3 cc3Var = this.b;
                switch (i32) {
                    case 0:
                        i35 i35Var = new i35();
                        cc3Var.getNavigationEventDispatcher().b(i35Var);
                        return i35Var;
                    default:
                        return new upd(new wb3(cc3Var, 1));
                }
            }
        });
    }

    public static final void c(cc3 cc3Var) {
        super.onBackPressed();
    }

    public final y6b a() {
        y6b y6bVar = this.a;
        if (y6bVar != null) {
            return y6bVar;
        }
        y6b y6bVar2 = new y6b(this, true);
        this.a = y6bVar2;
        return y6bVar2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.u6b
    public final g6b getLifecycle() {
        return a();
    }

    @Override // defpackage.g8d
    public final f8d getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // defpackage.vpd
    public final upd getOnBackPressedDispatcher() {
        return (upd) this.d.getValue();
    }

    @Override // defpackage.qqg
    public final nqg getSavedStateRegistry() {
        return this.b.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((i35) this.c.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            upd onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.d(onBackInvokedDispatcher);
        }
        this.b.a(bundle);
        a().g(d6b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.b.b(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a().g(d6b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a().g(d6b.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.setContentView(view, layoutParams);
    }
}

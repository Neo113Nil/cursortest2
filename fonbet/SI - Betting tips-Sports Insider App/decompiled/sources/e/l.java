package e;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g0;
import com.sports.insider.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class l extends Dialog implements androidx.lifecycle.e0, e0, q2.f {

    @Nullable
    private g0 _lifecycleRegistry;

    @NotNull
    private final gf.i onBackPressedDispatcher$delegate;

    @NotNull
    private final gf.i onBackPressedInput$delegate;

    @NotNull
    private final q2.e savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i5) {
        super(context, i5);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.savedStateRegistryController = new q2.e(new r2.a(this, new me.a(10, this)));
        final int i10 = 0;
        this.onBackPressedInput$delegate = gf.k.b(new Function0(this) { // from class: e.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f8435b;

            {
                this.f8435b = owner;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        d2.a aVar = new d2.a();
                        this.f8435b.getNavigationEventDispatcher().b(aVar);
                        return aVar;
                    default:
                        return new d0(new aa.c(17, this.f8435b));
                }
            }
        });
        final int i11 = 1;
        this.onBackPressedDispatcher$delegate = gf.k.b(new Function0(this) { // from class: e.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f8435b;

            {
                this.f8435b = owner;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        d2.a aVar = new d2.a();
                        this.f8435b.getNavigationEventDispatcher().b(aVar);
                        return aVar;
                    default:
                        return new d0(new aa.c(17, this.f8435b));
                }
            }
        });
    }

    public static void a(l lVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.e0
    @NotNull
    public androidx.lifecycle.y getLifecycle() {
        g0 g0Var = this._lifecycleRegistry;
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(this);
        this._lifecycleRegistry = g0Var2;
        return g0Var2;
    }

    @NotNull
    public d2.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().f8404b;
    }

    @Override // e.e0
    @NotNull
    public final d0 getOnBackPressedDispatcher() {
        return (d0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // q2.f
    @NotNull
    public q2.d getSavedStateRegistry() {
        return this.savedStateRegistryController.f21928b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        Intrinsics.checkNotNull(window4);
        View decorView4 = window4.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        ((d2.a) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            d0 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.b(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.b(bundle);
        g0 g0Var = this._lifecycleRegistry;
        if (g0Var == null) {
            g0Var = new g0(this);
            this._lifecycleRegistry = g0Var;
        }
        g0Var.e(androidx.lifecycle.w.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "onSaveInstanceState(...)");
        this.savedStateRegistryController.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        g0 g0Var = this._lifecycleRegistry;
        if (g0Var == null) {
            g0Var = new g0(this);
            this._lifecycleRegistry = g0Var;
        }
        g0Var.e(androidx.lifecycle.w.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        g0 g0Var = this._lifecycleRegistry;
        if (g0Var == null) {
            g0Var = new g0(this);
            this._lifecycleRegistry = g0Var;
        }
        g0Var.e(androidx.lifecycle.w.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        super.setContentView(i5);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}

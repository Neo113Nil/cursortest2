package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.sofascore.results.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rsc extends cc3 {
    public Function0 e;
    public dtc f;
    public long g;
    public final View h;
    public final osc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsc(Function0 function0, dtc dtcVar, long j, View view, ema emaVar, kx4 kx4Var, UUID uuid, q50 q50Var, ku3 ku3Var) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        boolean z = false;
        this.e = function0;
        this.f = dtcVar;
        this.g = j;
        this.h = view;
        Window window = getWindow();
        if (window == null) {
            a70.r("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        bea.L(window, false);
        osc oscVar = new osc(getContext(), window);
        oscVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        oscVar.setClipChildren(false);
        oscVar.setElevation(kx4Var.H0(8.0f));
        oscVar.setOutlineProvider(new yy2(2));
        this.i = oscVar;
        setContentView(oscVar);
        oscVar.setTag(R.id.view_tree_lifecycle_owner, qha.w(view));
        oscVar.setTag(R.id.view_tree_view_model_store_owner, sha.u(view));
        oscVar.setTag(R.id.view_tree_saved_state_registry_owner, rha.q(view));
        d(this.e, this.f, this.g, emaVar);
        bka bkaVar = new bka(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
        this.f.getClass();
        long j2 = this.g;
        long j3 = r13.h;
        aalVar.C(!e8k.a(j2, j3) && ((double) hkg.e0(j2)) <= 0.5d);
        this.f.getClass();
        if (!e8k.a(this.g, j3) && hkg.e0(r3) <= 0.5d) {
            z = true;
        }
        aalVar.B(z);
        upd onBackPressedDispatcher = getOnBackPressedDispatcher();
        this.f.getClass();
        onBackPressedDispatcher.a(this, new qsc(ku3Var, q50Var, new xxb(this, 8)));
    }

    public final void d(Function0 function0, dtc dtcVar, long j, ema emaVar) {
        this.e = function0;
        this.f = dtcVar;
        this.g = j;
        dtcVar.getClass();
        rzg rzgVar = rzg.a;
        ViewGroup.LayoutParams layoutParams = this.h.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int ordinal = emaVar.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            zzl.b();
            return;
        }
        this.i.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.e.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}

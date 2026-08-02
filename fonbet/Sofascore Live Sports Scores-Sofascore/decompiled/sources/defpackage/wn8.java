package defpackage;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wn8 extends no8 implements xpd, vqd, gqd, jqd, ttk, vpd, me, qqg, lp8, yec {
    public final /* synthetic */ FragmentActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn8(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.e = fragmentActivity;
    }

    @Override // defpackage.yec
    public final void addMenuProvider(zfc zfcVar) {
        this.e.addMenuProvider(zfcVar);
    }

    @Override // defpackage.yec
    public final void addMenuProvider(zfc zfcVar, u6b u6bVar, e6b e6bVar) {
        throw null;
    }

    @Override // defpackage.xpd
    public final void addOnConfigurationChangedListener(yn3 yn3Var) {
        this.e.addOnConfigurationChangedListener(yn3Var);
    }

    @Override // defpackage.gqd
    public final void addOnMultiWindowModeChangedListener(yn3 yn3Var) {
        this.e.addOnMultiWindowModeChangedListener(yn3Var);
    }

    @Override // defpackage.jqd
    public final void addOnPictureInPictureModeChangedListener(yn3 yn3Var) {
        this.e.addOnPictureInPictureModeChangedListener(yn3Var);
    }

    @Override // defpackage.vqd
    public final void addOnTrimMemoryListener(yn3 yn3Var) {
        this.e.addOnTrimMemoryListener(yn3Var);
    }

    @Override // defpackage.bo8
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override // defpackage.bo8
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.me
    public final je getActivityResultRegistry() {
        return this.e.getActivityResultRegistry();
    }

    @Override // defpackage.u6b
    public final g6b getLifecycle() {
        return this.e.c;
    }

    @Override // defpackage.vpd
    public final upd getOnBackPressedDispatcher() {
        return this.e.getOnBackPressedDispatcher();
    }

    @Override // defpackage.qqg
    public final nqg getSavedStateRegistry() {
        return this.e.getSavedStateRegistry();
    }

    @Override // defpackage.ttk
    public final stk getViewModelStore() {
        return this.e.getViewModelStore();
    }

    @Override // defpackage.yec
    public final void removeMenuProvider(zfc zfcVar) {
        this.e.removeMenuProvider(zfcVar);
    }

    @Override // defpackage.xpd
    public final void removeOnConfigurationChangedListener(yn3 yn3Var) {
        this.e.removeOnConfigurationChangedListener(yn3Var);
    }

    @Override // defpackage.gqd
    public final void removeOnMultiWindowModeChangedListener(yn3 yn3Var) {
        this.e.removeOnMultiWindowModeChangedListener(yn3Var);
    }

    @Override // defpackage.jqd
    public final void removeOnPictureInPictureModeChangedListener(yn3 yn3Var) {
        this.e.removeOnPictureInPictureModeChangedListener(yn3Var);
    }

    @Override // defpackage.vqd
    public final void removeOnTrimMemoryListener(yn3 yn3Var) {
        this.e.removeOnTrimMemoryListener(yn3Var);
    }

    @Override // defpackage.lp8
    public final void a(s sVar, Fragment fragment) {
    }
}

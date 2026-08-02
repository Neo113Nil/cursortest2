package com.vk.clips.favorites.impl.ui.folders.picker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ac;
import xsna.ao50;
import xsna.bwt0;
import xsna.c5e;
import xsna.dw20;
import xsna.e4e;
import xsna.fpf0;
import xsna.gm50;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.n4e;
import xsna.nwy;
import xsna.nz;
import xsna.p4e;
import xsna.pgn;
import xsna.qcy;
import xsna.qr0;
import xsna.s5e;
import xsna.td0;
import xsna.tzp0;
import xsna.u4e;
import xsna.vk50;
import xsna.w8i;
import xsna.yad;

/* compiled from: ClipsFavoritesFoldersPickerFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsFavoritesFoldersPickerFragment extends MviImplFragment<b, f, com.vk.clips.favorites.impl.ui.folders.picker.a> implements w8i {
    public static final a V;
    public static final /* synthetic */ qcy<Object>[] W;
    public final Object Q;
    public final Object R;
    public final pgn S;
    public p4e T;
    public final tzp0.c.a U;

    /* compiled from: ClipsFavoritesFoldersPickerFragment.kt */
    public static final class a {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ClipsFavoritesFoldersPickerFragment.class, "disposableHideTimer", "getDisposableHideTimer()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        W = new qcy[]{mutablePropertyReference1Impl};
        V = new a();
    }

    public ClipsFavoritesFoldersPickerFragment() {
        Window window;
        com.vk.movika.sdk.android.defaultplayer.interactive.a aVar = new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, aVar);
        this.R = msy.a(lazyThreadSafetyMode, new ac(this, 19));
        this.S = new pgn();
        this.U = new tzp0.c.a(this, true);
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setDimAmount(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.c(new View(requireContext()));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        this.T = new p4e(view.getContext(), new qr0(1, this, ClipsFavoritesFoldersPickerFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 2), this.U, go());
        gm50.a.b(this, ((f) ao50Var).a, new yad(this, 3));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        b bVar = (b) vk50Var;
        bVar.k.a(new td0(9, this, new Ref$ObjectRef()), this);
        bVar.l.a(new u4e(this, 0), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        p4e p4eVar = this.T;
        if (p4eVar == null) {
            p4eVar = null;
        }
        dw20 dw20Var = p4eVar.k;
        if (dw20Var != null) {
            dw20Var.hide();
        }
        p4eVar.k = null;
        super.dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsFavoritesComponentImpl fo() {
        return (ClipsFavoritesComponentImpl) this.Q.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        if (!go().J0()) {
            return super.mo2getContext();
        }
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext != null) {
            return bwt0.u(mo2getContext);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsFavoritesFoldersPickerParams go() {
        return (ClipsFavoritesFoldersPickerParams) this.R.getValue();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bn(2, 0);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentManager supportFragmentManager;
        FragmentActivity kn = kn();
        if (kn == null) {
            kn = null;
        }
        if (kn != null && (supportFragmentManager = kn.getSupportFragmentManager()) != null) {
            supportFragmentManager.l0("result", this, new nz(this, 12));
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        qcy<Object> qcyVar = W[0];
        this.S.b(null);
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        e eVar = new e(go(), new n4e(go()));
        ClipsFavoritesFoldersPickerParams go = go();
        c5e b = fo().b();
        s5e Ef = fo().Ef();
        nwy nwyVar = fo().g;
        qcy<Object> qcyVar = ClipsFavoritesComponentImpl.l[5];
        return new b(eVar, go, b, Ef, (e4e) nwyVar.c(), fo().Ff());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FAVORITES_FOLDERS_PICKER;
    }
}

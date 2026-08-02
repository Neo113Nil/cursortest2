package com.vk.clips.playlists.folders.root;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.bpn0;
import xsna.fpf0;
import xsna.gm50;
import xsna.i3b;
import xsna.km50;
import xsna.mk50;
import xsna.nf3;
import xsna.qcy;
import xsna.s1;
import xsna.t40;
import xsna.vk50;
import xsna.w8i;
import xsna.yte;

/* compiled from: ClipsPlaylistsFoldersRootFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsPlaylistsFoldersRootFragment extends MviImplFragment<c, g, b> implements w8i {
    public static final a S;
    public static final /* synthetic */ qcy<Object>[] T;
    public static final String U;
    public final bpn0 Q = new bpn0(new s1(this, 28));
    public final nf3 R = new nf3();

    /* compiled from: ClipsPlaylistsFoldersRootFragment.kt */
    public static final class a {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ClipsPlaylistsFoldersRootFragment.class, "proxyContentView", "getProxyContentView()Lcom/vk/clips/playlists/folders/root/ClipsPlaylistsFoldersProxyContentView;", 0);
        fpf0.a.getClass();
        T = new qcy[]{mutablePropertyReference1Impl};
        S = new a();
        U = "ClipsPlaylistsFoldersRootFragment";
    }

    public ClipsPlaylistsFoldersRootFragment() {
        Window window;
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
        Parcelable parcelable;
        Object parcelable2;
        g gVar = (g) ao50Var;
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("folder_input_params", ClipsPlaylistsFolderLaunchParams.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("folder_input_params");
            if (!(parcelable3 instanceof ClipsPlaylistsFolderLaunchParams)) {
                parcelable3 = null;
            }
            parcelable = (ClipsPlaylistsFolderLaunchParams) parcelable3;
        }
        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = (ClipsPlaylistsFolderLaunchParams) parcelable;
        if (clipsPlaylistsFolderLaunchParams == null) {
            throw new IllegalArgumentException("You must provide input params via bundle. See ClipsPlaylistsFolderLaunchParams.kt");
        }
        com.vk.clips.playlists.folders.root.a aVar = new com.vk.clips.playlists.folders.root.a(requireContext(), new yte(1, this, ClipsPlaylistsFoldersRootFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0), clipsPlaylistsFolderLaunchParams, (com.vk.clips.playlists.a) this.Q.getValue(), getParentFragmentManager(), new i3b(0, this, ClipsPlaylistsFoldersRootFragment.class, "dismiss", "dismiss()V", 0, 2));
        qcy<Object> qcyVar = T[0];
        this.R.c = aVar;
        gm50.a.b(this, gVar.a, new t40(this, 25));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bn(2, 0);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = (ClipsPlaylistsFolderLaunchParams) bundle.getParcelable("folder_input_params");
        if (clipsPlaylistsFolderLaunchParams != null) {
            return new c(clipsPlaylistsFolderLaunchParams);
        }
        throw new IllegalArgumentException("You must provide input params via bundle. See ClipsPlaylistsFolderLaunchParams.kt");
    }
}

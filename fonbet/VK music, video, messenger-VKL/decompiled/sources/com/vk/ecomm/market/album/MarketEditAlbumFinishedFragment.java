package com.vk.ecomm.market.album;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import kotlin.LazyThreadSafetyMode;
import xsna.ecm;
import xsna.jai;
import xsna.m1i;
import xsna.msy;
import xsna.oz50;
import xsna.zu3;

/* compiled from: MarketEditAlbumFinishedFragment.kt */
/* loaded from: classes18.dex */
public final class MarketEditAlbumFinishedFragment extends FragmentImpl {
    public static final /* synthetic */ int Q = 0;
    public GoodAlbumEditFlowEntity N;
    public final Object O;
    public final Object P;

    /* compiled from: MarketEditAlbumFinishedFragment.kt */
    public static final class a extends oz50 {
    }

    public MarketEditAlbumFinishedFragment() {
        ecm ecmVar = new ecm(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.O = msy.a(lazyThreadSafetyMode, ecmVar);
        this.P = msy.a(lazyThreadSafetyMode, new m1i(this, 27));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Mf(-1, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.os.Parcelable] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("album", GoodAlbumEditFlowEntity.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = arguments.getParcelable("album");
                parcelable = parcelable3 instanceof GoodAlbumEditFlowEntity ? parcelable3 : null;
            }
            r0 = (GoodAlbumEditFlowEntity) parcelable;
        }
        this.N = r0;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setContent(new jai(1665021716, new zu3(this, 9), true));
        return composeView;
    }
}

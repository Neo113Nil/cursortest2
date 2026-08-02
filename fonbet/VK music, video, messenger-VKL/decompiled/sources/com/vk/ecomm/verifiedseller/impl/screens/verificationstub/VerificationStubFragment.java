package com.vk.ecomm.verifiedseller.impl.screens.verificationstub;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import kotlin.LazyThreadSafetyMode;
import xsna.jai;
import xsna.msy;
import xsna.oz50;
import xsna.pnr0;
import xsna.u05;
import xsna.w8i;

/* compiled from: VerificationStubFragment.kt */
/* loaded from: classes18.dex */
public final class VerificationStubFragment extends FragmentImpl implements w8i {
    public static final /* synthetic */ int O = 0;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new pnr0(this, 0));

    /* compiled from: VerificationStubFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setContent(new jai(453264920, new u05(this, 12), true));
        return composeView;
    }
}

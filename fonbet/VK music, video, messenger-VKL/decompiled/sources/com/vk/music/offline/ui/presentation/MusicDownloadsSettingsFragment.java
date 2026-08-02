package com.vk.music.offline.ui.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.music.offline.ui.presentation.entity.MusicDownloadsSettingsState;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aii;
import xsna.bbw;
import xsna.bn50;
import xsna.e2s;
import xsna.fpf0;
import xsna.hue;
import xsna.izs;
import xsna.jai;
import xsna.lk1;
import xsna.msy;
import xsna.oz50;
import xsna.pvh;
import xsna.qcy;
import xsna.r37;
import xsna.u1h0;
import xsna.wcy;
import xsna.wi40;
import xsna.xi40;
import xsna.yzs;
import xsna.zi40;

/* compiled from: MusicDownloadsSettingsFragment.kt */
/* loaded from: classes3.dex */
public final class MusicDownloadsSettingsFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] P;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new pvh(this, 23));
    public final u1h0 O;

    /* compiled from: MusicDownloadsSettingsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(MusicDownloadsSettingsFragment.class, null, null);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicDownloadsSettingsFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        P = new qcy[]{propertyReference1Impl};
    }

    public MusicDownloadsSettingsFragment() {
        e2s e2sVar = new e2s(this, 15);
        int i = wcy.c;
        this.O = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(MusicDownloadsSettingsState.class)), wcy.a.a(fpf0.d(MusicDownloadsSettingsState.class)), wcy.a.a(fpf0.d(wi40.class)), wcy.a.a(fpf0.d(xi40.class))).toString(), this, this, e2sVar);
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-901993647);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-901993647, i2, -1, "com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment.ScreenContent (MusicDownloadsSettingsFragment.kt:59)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new bbw(this, 14);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new zi40(this, null);
                M.R(x2);
            }
            r37.a(izsVar, (yzs) x2, aii.a, M, 384, 0);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new hue(this, i, 9);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(-1115117396, new lk1(this, 8), true));
        return composeView;
    }
}

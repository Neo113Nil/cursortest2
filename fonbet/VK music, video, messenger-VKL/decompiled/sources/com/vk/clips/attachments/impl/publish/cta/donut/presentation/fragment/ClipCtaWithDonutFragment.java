package com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.clips.attachments.api.publish.cta.ClipsCtaAttachEntryParams;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.movika.sdk.base.logic.interactor.b;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.fpf0;
import xsna.jai;
import xsna.m7m;
import xsna.mhd;
import xsna.msy;
import xsna.no;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.qpc;
import xsna.qw6;
import xsna.rj1;
import xsna.v6;
import xsna.y6;

/* compiled from: ClipCtaWithDonutFragment.kt */
/* loaded from: classes16.dex */
public final class ClipCtaWithDonutFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] T;
    public final Object N;
    public final mhd O;
    public final bpn0 P;
    public final bpn0 Q;
    public final nzw R;
    public final Object S;

    /* compiled from: ClipCtaWithDonutFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipCtaWithDonutFragment.class, X3.i.U, "getStore()Lcom/vk/clips/attachments/impl/publish/cta/donut/presentation/feature/ClipCtaWithDonutMviStore;", 0);
        fpf0.a.getClass();
        T = new qcy[]{propertyReference1Impl};
    }

    public ClipCtaWithDonutFragment() {
        b bVar = new b(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, bVar);
        this.O = ((ClipsConfigAuthorsComponent) m7m.d(this).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
        this.P = new bpn0(new v6(this, 12));
        this.Q = new bpn0(new y6(this, 14));
        this.R = new nzw(fpf0.d(qpc.class).toString(), this, new rj1(this, 17));
        this.S = msy.a(lazyThreadSafetyMode, new no(this, 18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsCtaAttachEntryParams eo() {
        return (ClipsCtaAttachEntryParams) this.S.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(-86868614, new qw6(this, 1), true));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PUBLISH;
    }
}

package com.vk.music.playlist.display.audiobook.presentation.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.playlist.display.audiobook.presentation.model.AudioBookLoadState;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.disposables.g;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.ao50;
import xsna.bpn0;
import xsna.ch4;
import xsna.d1;
import xsna.dne;
import xsna.dw20;
import xsna.epx;
import xsna.gdn;
import xsna.geb0;
import xsna.hdn;
import xsna.hg1;
import xsna.i5f;
import xsna.jen;
import xsna.jnb;
import xsna.k840;
import xsna.ken;
import xsna.km50;
import xsna.krh;
import xsna.ldl;
import xsna.lz0;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.ndn;
import xsna.oz50;
import xsna.pdn;
import xsna.pff;
import xsna.qo0;
import xsna.r5v0;
import xsna.rzp0;
import xsna.s750;
import xsna.u2b0;
import xsna.u4e;
import xsna.vk50;
import xsna.xl40;
import xsna.zak0;

/* compiled from: DisplayAudioBookChaptersFragment.kt */
/* loaded from: classes3.dex */
public final class DisplayAudioBookChaptersFragment extends MviImplFragment<ndn, ken, gdn> {
    public static final /* synthetic */ int b0 = 0;
    public hdn Q;
    public dw20 R;
    public dw20 S;
    public final g T = new g();
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final bpn0 a0;

    /* compiled from: DisplayAudioBookChaptersFragment.kt */
    public static final class a extends oz50 {
        public a(int i) {
            super(DisplayAudioBookChaptersFragment.class, null, null);
            int i2 = DisplayAudioBookChaptersFragment.b0;
            this.j.putInt("audiobook_id", i);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MUSIC_AUDIO_BOOK_PAGE, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }

        public final void y(String str) {
            int i = DisplayAudioBookChaptersFragment.b0;
            this.j.putString("launch_origin", str);
        }

        public final void z(String str) {
            int i = DisplayAudioBookChaptersFragment.b0;
            this.j.putString("ref", str);
        }
    }

    public DisplayAudioBookChaptersFragment() {
        dne dneVar = new dne(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, dneVar);
        this.V = msy.a(lazyThreadSafetyMode, new krh(this, 9));
        this.W = msy.a(lazyThreadSafetyMode, new ldl(this, 5));
        this.X = msy.a(lazyThreadSafetyMode, new d1(12));
        this.Y = msy.a(lazyThreadSafetyMode, new i5f(this, 16));
        this.Z = msy.a(lazyThreadSafetyMode, new pff(this, 17));
        this.a0 = new bpn0(new qo0(15));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        hdn hdnVar = new hdn(new geb0(kn()), (KidsModeRestrictionRenderer) this.Y.getValue(), this.J, getViewLifecycleOwner(), requireContext());
        this.Q = hdnVar;
        return new mk50.c(hdnVar.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ken kenVar = (ken) ao50Var;
        hdn hdnVar = this.Q;
        if (hdnVar == null) {
            hdnVar = null;
        }
        hdnVar.f(kenVar, new jnb(1, this, DisplayAudioBookChaptersFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((ndn) vk50Var).m.a(new u4e(this, 11), this);
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        this.T.b(hg1.h(r5v0Var.a.a, new lz0(this, 29)));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        hdn hdnVar = this.Q;
        if (hdnVar == null) {
            hdnVar = null;
        }
        hdnVar.getClass();
        int i = rect2.top;
        if (i > 0) {
            ((zak0) hdnVar.i).setValue(Integer.valueOf(i));
        }
        rect2.top = 0;
        return true;
    }

    public final MusicPlaybackLaunchContext fo() {
        return MusicPlaybackLaunchContext.Fb(requireArguments().getString("ref", "")).Cb(requireArguments().getString("launch_origin", "unknown"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final BridgeComponent go() {
        return (BridgeComponent) this.V.getValue();
    }

    public final void ho() {
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        com.vk.music.notifications.restriction.a aVar2 = aVar != null ? aVar : null;
        Context requireContext = requireContext();
        Bundle arguments = getArguments();
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(arguments != null ? arguments.getString("ref", "") : null);
        Bundle arguments2 = getArguments();
        MusicRestrictionPopupDisplayer.e(aVar2, requireContext, epx.f(arguments2 != null ? arguments2.getString("launch_origin", "unknown") : null, "kids_section") ? "audio_kids" : "audiobook", Fb, null, null, null, 56);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.T.dispose();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        dw20 dw20Var = this.R;
        if (dw20Var != null) {
            dw20Var.hide();
        }
        dw20 dw20Var2 = this.S;
        if (dw20Var2 != null) {
            dw20Var2.hide();
        }
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("audiobook_id", 0) : 0;
        pdn pdnVar = new pdn(new jen(AudioBookLoadState.LOADING, AudioBook.y, k840.a.i.b(), false, ((Boolean) this.a0.getValue()).booleanValue(), null), go().p().a(), (xl40) this.W.getValue());
        ch4 ch4Var = (ch4) this.U.getValue();
        u2b0 b = k840.a.g().b();
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        return new ndn(i, pdnVar, ch4Var, b, s750Var, go().p().a(), fo(), this.J);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        if (epx.f(arguments != null ? arguments.getString("launch_origin", "unknown") : null, "kids_section")) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_KIDS_AUDIO_BOOK;
        }
    }
}

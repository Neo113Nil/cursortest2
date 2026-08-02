package com.vk.voip.ui.call_effects.beauty.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.c;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import kotlin.jvm.internal.PropertyReference0Impl;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import xsna.a000;
import xsna.cp0;
import xsna.cw6;
import xsna.ew6;
import xsna.fw6;
import xsna.j7i;
import xsna.p40;
import xsna.rct0;
import xsna.zzz;

/* compiled from: BeautyVideoFragment.kt */
/* loaded from: classes7.dex */
public class BeautyVideoFragment extends FragmentImpl {
    public static final /* synthetic */ int S = 0;
    public final b N = new b();
    public TextureViewRenderer O;
    public final OKVoipEngine P;
    public final rct0 Q;
    public final zzz R;

    /* compiled from: BeautyVideoFragment.kt */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Float.valueOf(((zzz) this.receiver).c());
        }
    }

    public BeautyVideoFragment() {
        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
        this.P = oKVoipEngine;
        this.Q = oKVoipEngine.getVideoController();
        c.b.getClass();
        this.R = (a000) c.T().a;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            tn();
            c.b.getClass();
            fw6 fw6Var = c.W;
            if (fw6Var != null) {
                fw6Var.a();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.voip_beauty_video, viewGroup);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        TextureViewRenderer textureViewRenderer = this.O;
        if (textureViewRenderer != null) {
            ConversationVideoTrackParticipantKey ownVideoTrack = this.P.getVideoController().getOwnVideoTrack();
            rct0 rct0Var = this.Q;
            if (ownVideoTrack != null) {
                rct0Var.removeParticipantView(ownVideoTrack, textureViewRenderer);
            }
            rct0Var.releaseParticipantView(textureViewRenderer);
        }
        this.O = null;
        this.N.e();
        c.b.getClass();
        fw6 fw6Var = c.W;
        if (fw6Var != null) {
            fw6Var.a();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        cw6 cw6Var;
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        rct0 rct0Var = this.Q;
        TextureViewRenderer mo349createVideoViewInstance = rct0Var.mo349createVideoViewInstance(requireContext);
        this.O = mo349createVideoViewInstance;
        ((ViewGroup) view).addView(mo349createVideoViewInstance, 0, new FrameLayout.LayoutParams(-1, -1));
        a aVar = new a(this.R, zzz.class, "currentAngle", "getCurrentAngle()F", 0);
        OKVoipEngine oKVoipEngine = this.P;
        oKVoipEngine.getClass();
        rct0Var.setParticipantView(oKVoipEngine.getVideoController().getOwnVideoTrack(), mo349createVideoViewInstance, new j7i(aVar, OKVoipEngine.f));
        c.b.getClass();
        fw6 fw6Var = c.W;
        if (fw6Var == null || (cw6Var = fw6Var.g) == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = (cw6Var.g ? q.T(ew6.a.a) : cw6Var.d).subscribe(new cp0(new p40(this, 13), 5));
        if (subscribe != null) {
            this.N.b(subscribe);
        }
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.FullScreenDialogDialog;
    }
}

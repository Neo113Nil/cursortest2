package com.vk.im.ui.fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.ImageViewer;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import xsna.a1w;
import xsna.au90;
import xsna.fyn0;
import xsna.g2v;
import xsna.i7o0;
import xsna.mxv;
import xsna.myc0;
import xsna.okr0;
import xsna.oz50;
import xsna.q1w;
import xsna.zdw;

/* compiled from: ChatAttachmentHistoryFragment.kt */
/* loaded from: classes2.dex */
public final class ChatAttachmentHistoryFragment extends FragmentImpl implements au90 {
    public fyn0 N;

    /* compiled from: ChatAttachmentHistoryFragment.kt */
    public static final class a extends oz50 {
        public a(Peer peer, ChatSettings chatSettings) {
            super(ChatAttachmentHistoryFragment.class, null, null);
            this.j.putParcelable("dialog_id", peer);
            this.j.putParcelable("chat_settings_arg", chatSettings);
        }
    }

    /* compiled from: ChatAttachmentHistoryFragment.kt */
    public final class b implements okr0 {
        public b() {
        }

        @Override // xsna.okr0
        public final void a() {
            ChatAttachmentHistoryFragment.this.finish();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fyn0 fyn0Var = this.N;
        if (fyn0Var == null) {
            fyn0Var = null;
        }
        fyn0Var.K0(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        zdw zdwVar;
        ChatSettings chatSettings;
        super.onCreate(bundle);
        Peer peer = (Peer) requireArguments().getParcelable("dialog_id");
        if (peer == null) {
            throw new IllegalStateException("no peer in args");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            chatSettings = (ChatSettings) arguments.getParcelable("chat_settings_arg");
            zdwVar = null;
        } else {
            zdwVar = null;
            chatSettings = null;
        }
        FragmentActivity kn = kn();
        mxv c = g2v.c();
        zdw zdwVar2 = i7o0.b;
        if (zdwVar2 == null) {
            zdwVar2 = zdwVar;
        }
        ImageViewer d = myc0.d();
        b bVar = new b();
        a1w a1wVar = q1w.a;
        a1w a1wVar2 = a1wVar;
        if (a1wVar == null) {
            a1wVar2 = zdwVar;
        }
        this.N = new fyn0(kn, c, zdwVar2, d, bVar, a1wVar2, peer, chatSettings);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fyn0 fyn0Var = this.N;
        if (fyn0Var == null) {
            fyn0Var = null;
        }
        return fyn0Var.E0(layoutInflater, viewGroup, null, bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        fyn0 fyn0Var = this.N;
        if (fyn0Var == null) {
            fyn0Var = null;
        }
        fyn0Var.G0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        fyn0 fyn0Var = this.N;
        if (fyn0Var == null) {
            fyn0Var = null;
        }
        fyn0Var.H0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        fyn0 fyn0Var = this.N;
        if (fyn0Var == null) {
            fyn0Var = null;
        }
        fyn0Var.P0(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        fyn0 fyn0Var = this.N;
        if (fyn0Var == null) {
            fyn0Var = null;
        }
        fyn0Var.V0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        fyn0 fyn0Var = this.N;
        if (fyn0Var == null) {
            fyn0Var = null;
        }
        fyn0Var.W0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        fyn0 fyn0Var = this.N;
        if (fyn0Var == null) {
            fyn0Var = null;
        }
        fyn0Var.O0(bundle);
    }

    @Override // xsna.au90
    public final boolean v8(long j) {
        Peer peer;
        Bundle arguments = getArguments();
        return (arguments == null || (peer = (Peer) arguments.getParcelable("dialog_id")) == null || peer.b != j) ? false : true;
    }
}

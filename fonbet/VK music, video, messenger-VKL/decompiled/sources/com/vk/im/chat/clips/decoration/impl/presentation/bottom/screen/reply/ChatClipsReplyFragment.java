package com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import androidx.fragment.app.Fragment;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.dto.common.Peer;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.view.linkedtext.LinkedMessageView;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.ImExperimentsScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.RichEditText;
import com.vk.im.ui.views.WriteBarDisabled;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.movika.sdk.base.ui.i;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stickers.keyboard.StickersView;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.apb;
import xsna.bo8;
import xsna.bpn0;
import xsna.cpb;
import xsna.dhr0;
import xsna.dpg0;
import xsna.e3m;
import xsna.e4g0;
import xsna.ep0;
import xsna.f4m;
import xsna.fpf0;
import xsna.fvr;
import xsna.g2v;
import xsna.gm50;
import xsna.iah0;
import xsna.ify;
import xsna.j1;
import xsna.kkm;
import xsna.km50;
import xsna.l7m;
import xsna.lzv;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.nob;
import xsna.o040;
import xsna.o1;
import xsna.o25;
import xsna.oob;
import xsna.p040;
import xsna.pob;
import xsna.qd0;
import xsna.s1;
import xsna.s2f;
import xsna.s3q0;
import xsna.sxv;
import xsna.t40;
import xsna.vk50;
import xsna.xq;
import xsna.y01;
import xsna.z5a;
import xsna.zcl;

/* compiled from: ChatClipsReplyFragment.kt */
/* loaded from: classes2.dex */
public final class ChatClipsReplyFragment extends MviImplFragment<c, h, a> implements ify.a {
    public static final /* synthetic */ int T = 0;
    public final Object Q = msy.a(LazyThreadSafetyMode.NONE, new s1(this, 15));
    public final bpn0 R = new bpn0(new j1(this, 17));
    public i S;

    @Override // xsna.xn50
    @SuppressLint({"InflateParams"})
    public final mk50 Fl() {
        LayoutInflater layoutInflater = getLayoutInflater();
        dhr0 dhr0Var = dhr0.a;
        Context requireContext = requireContext();
        dhr0Var.getClass();
        return new mk50.c(layoutInflater.cloneInContext(dhr0.t(requireContext)).inflate(R.layout.im_chat_clips_reply_fragment, (ViewGroup) null));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        h hVar = (h) ao50Var;
        String string = requireArguments().getString("text");
        Long e = bo8.e(requireArguments(), "person_id");
        View view2 = getView();
        LinkedMessageView linkedMessageView = view2 != null ? (LinkedMessageView) view2.findViewById(R.id.im_chat_clips_linked_msg_view) : null;
        if (string != null && e != null && linkedMessageView != null) {
            long longValue = e.longValue();
            linkedMessageView.setOnClickListener(new y01(this, 6));
            linkedMessageView.setOnSpanClickListener(new sxv(fo(), g2v.c(), linkedMessageView.getContext()));
            linkedMessageView.setUserName(new DisplayNameFormatter(null, 3, null).e(fo().b.Cb(Long.valueOf(longValue)), UserNameCase.NOM));
            linkedMessageView.setBody(o040.a(new o040(), string, 14));
            linkedMessageView.setBodyMaxLines(Integer.MAX_VALUE);
            linkedMessageView.setVisibility(0);
        }
        gm50.a.b(this, hVar.a, new z5a(2, this, view));
        gm50.a.b(this, hVar.b, new t40(this, 13));
    }

    @Override // xsna.ify.a
    public final void Y0() {
        i iVar = this.S;
        if (iVar != null) {
            iVar.invoke();
        }
    }

    public final DialogExt fo() {
        Bundle bundle = requireArguments().getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle, bundle.getString("dialog_ext_state_key"));
        return dialogExt == null ? new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null) : dialogExt;
    }

    public final oob go() {
        return (oob) this.R.getValue();
    }

    public final void ho(View view) {
        this.S = null;
        RichEditText richEditText = go().v;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.clearFocus();
        view.setBackground(null);
        View findViewById = view.findViewById(R.id.im_chat_clips_linked_msg_view);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.im_chat_clips_bottom_panel_container);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        View findViewById3 = view.findViewById(R.id.im_chat_clips_msg_sent_container);
        if (findViewById3 != null) {
            findViewById3.setBackground(new dpg0(new ColorDrawable(e3m.f(R.attr.vk_ui_avatar_overlay, findViewById3.getContext())), iah0.b(8.0f)));
            findViewById3.animate().setStartDelay(300L).setDuration(3000L).setInterpolator(new AccelerateInterpolator()).withStartAction(new o1(findViewById3, 5)).withEndAction(new ep0(this, 3)).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
        }
    }

    public final void io() {
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = e4g0.a;
        String text = go().getText();
        oob go = go();
        RichEditText richEditText = go.v;
        if (richEditText == null) {
            richEditText = null;
        }
        e4g0.b = new e4g0.a(text, go.f(richEditText.getEditableText()).b);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = ((mk50.c) Fl()).a;
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), new cpb(this));
        View findViewById = view.findViewById(R.id.im_chat_clips_closeable_area);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new apb(gestureDetector, 0));
        }
        oob go = go();
        go.z = new d(this);
        go.r = view;
        LayoutInflater.from(view.getContext()).inflate(R.layout.im_chat_clips_include_write_bar, (ViewGroup) view.findViewById(R.id.im_chat_clips_write_area), true);
        WriteBarDisabled writeBarDisabled = (WriteBarDisabled) view.findViewById(R.id.im_chat_clips_write_bar_disabled);
        kkm kkmVar = go.h;
        writeBarDisabled.setThemeBinder(kkmVar);
        go.s = writeBarDisabled;
        WriteBar writeBar = (WriteBar) view.findViewById(R.id.im_chat_clips_write_bar);
        go.q = writeBar;
        writeBar.setHidePopup(true);
        WriteBar writeBar2 = go.q;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.setBackgroundColor(0);
        WriteBar writeBar3 = go.q;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        go.t = writeBar3.findViewById(R.id.writebar_send);
        WriteBar writeBar4 = go.q;
        if (writeBar4 == null) {
            writeBar4 = null;
        }
        go.v = (RichEditText) writeBar4.findViewById(R.id.writebar_edit);
        WriteBar writeBar5 = go.q;
        if (writeBar5 == null) {
            writeBar5 = null;
        }
        go.u = writeBar5.findViewById(R.id.writebar_emoji);
        go.y = view.findViewById(R.id.im_chat_clips_keyboard_background);
        WriteBar writeBar6 = go.q;
        if (writeBar6 == null) {
            writeBar6 = null;
        }
        View findViewById2 = writeBar6.findViewById(R.id.writebar_left_button_container);
        if (findViewById2 != null) {
            f4m.j(findViewById2);
        }
        WriteBar writeBar7 = go.q;
        if (writeBar7 == null) {
            writeBar7 = null;
        }
        writeBar7.setDialogId(go.f);
        WriteBar writeBar8 = go.q;
        if (writeBar8 == null) {
            writeBar8 = null;
        }
        writeBar8.setThemeBinder(kkmVar);
        WriteBar writeBar9 = go.q;
        if (writeBar9 == null) {
            writeBar9 = null;
        }
        writeBar9.S(go.k, null);
        go.x = (ImAvatarView) view.findViewById(R.id.im_chat_clips_avatar);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.im_chat_clips_bottom_sheet_container);
        if (viewGroup2 != null) {
            WriteBar writeBar10 = go.q;
            if (writeBar10 == null) {
                writeBar10 = null;
            }
            writeBar10.setBottomSheetContainer(viewGroup2);
        }
        WriteBar writeBar11 = go.q;
        if (writeBar11 == null) {
            writeBar11 = null;
        }
        writeBar11.setOwnerId(o25.a().c());
        WriteBar writeBar12 = go.q;
        if (writeBar12 == null) {
            writeBar12 = null;
        }
        writeBar12.setIsSendButtonAlwaysEnabled(false);
        RichEditText richEditText = go.v;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.setImeOptions(268435456);
        go.w = new StickersView(view.getContext(), (StickersView.c) null, 6);
        go.F();
        go.I();
        p040 p040Var = (p040) go.J.getValue();
        RichEditText richEditText2 = go.v;
        if (richEditText2 == null) {
            richEditText2 = null;
        }
        p040Var.a(richEditText2);
        RichEditText richEditText3 = go.v;
        if (richEditText3 == null) {
            richEditText3 = null;
        }
        go.I = richEditText3.getKeyListener();
        RichEditText richEditText4 = go.v;
        go.H = (richEditText4 != null ? richEditText4 : null).getEllipsize();
        go().u(fo());
        go().G = new com.vk.movika.sdk.base.ui.f(this, 15);
        oob go2 = go();
        bo8.b(requireArguments(), "can_show_quick_stickers_suggest");
        go2.J(go2.n);
        RichEditText richEditText5 = go().v;
        if (richEditText5 == null) {
            richEditText5 = null;
        }
        richEditText5.requestFocus();
        if (!richEditText5.hasWindowFocus()) {
            richEditText5.getViewTreeObserver().addOnWindowFocusChangeListener(new pob(richEditText5));
        } else if (richEditText5.isFocused()) {
            richEditText5.post(new qd0(richEditText5, 4));
        }
        WriteBar writeBar13 = go().q;
        if (writeBar13 == null) {
            writeBar13 = null;
        }
        writeBar13.setEmojiAllowed(true);
        oob go3 = go();
        RichEditText richEditText6 = go3.v;
        if (richEditText6 == null) {
            richEditText6 = null;
        }
        richEditText6.setSingleLine(false);
        RichEditText richEditText7 = go3.v;
        if (richEditText7 == null) {
            richEditText7 = null;
        }
        richEditText7.setEllipsize(go3.H);
        RichEditText richEditText8 = go3.v;
        if (richEditText8 == null) {
            richEditText8 = null;
        }
        richEditText8.setKeyListener(go3.I);
        RichEditText richEditText9 = go3.v;
        (richEditText9 != null ? richEditText9 : null).setMaxHeight(oob.N);
        e4g0.a aVar = e4g0.b;
        if (aVar != null) {
            go().H(aVar.a, aVar.b);
        }
        return view;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        int i = ify.a;
        ify.g(this);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void tn() {
        io();
        e4g0.a.onNext(s3q0.a);
        super.tn();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        int i = ify.a;
        ify.a(this);
        long j = fo().e;
        int i2 = requireArguments().getInt("id");
        s2f e0 = ((ClipsViewerAdapterComponent) m7m.d(this).a(fpf0.a(ClipsViewerAdapterComponent.class))).e0();
        l7m d = m7m.d(this);
        ?? r5 = this.Q;
        com.vk.im.engine.models.c experiments = ((ImExperimentsScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) r5.getValue(), d).a(fpf0.a(ImExperimentsScopedComponent.class))).getExperiments();
        l7m d2 = m7m.d(this);
        lzv g = ((ImCmdRxExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) d2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) r5.getValue(), d2).a(fpf0.a(ImCmdRxExecutorScopedComponent.class))).g();
        l7m d3 = m7m.d(this);
        return new c(j, i2, new nob(e0, experiments, g, ((ImConfigurationScopedComponent) xq.f((ImFeatureScopeProviderComponent) d3.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) r5.getValue(), d3).a(fpf0.a(ImConfigurationScopedComponent.class))).b0()));
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setWindowAnimations(R.style.DisableDialogAnimation);
            window.setGravity(16);
            window.setSoftInputMode(16);
            dhr0 dhr0Var = dhr0.a;
            fvr.x(window, false);
            dhr0.u0(window, NavigationBarStyle.DARK);
        }
        yn.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.zob
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                ChatClipsReplyFragment chatClipsReplyFragment = ChatClipsReplyFragment.this;
                int i2 = ChatClipsReplyFragment.T;
                if (i != 4) {
                    return false;
                }
                try {
                    chatClipsReplyFragment.tn();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable unused) {
                }
                Fragment parentFragment = chatClipsReplyFragment.getParentFragment();
                while (parentFragment != null && parentFragment.getParentFragment() != null) {
                    parentFragment = parentFragment.getParentFragment();
                }
                FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                if (fragmentImpl == null) {
                    return true;
                }
                fragmentImpl.a0();
                return true;
            }
        });
        return yn;
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
    }
}

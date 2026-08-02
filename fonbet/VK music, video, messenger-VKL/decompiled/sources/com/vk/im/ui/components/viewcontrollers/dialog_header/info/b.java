package com.vk.im.ui.components.viewcontrollers.dialog_header.info;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.engine.models.typing.ComposingType;
import com.vk.im.ui.components.viewcontrollers.dialog_header.info.c;
import com.vk.im.ui.utils.TimeChangeReceiver;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.imageloader.view.VKImageView;
import com.vk.metrics.eventtracking.Event;
import com.vk.movika.tools.controls.seekbar.w;
import com.vk.utils.vectordrawable.EnhancedAnimatedVectorDrawable;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.abg0;
import xsna.awt0;
import xsna.baf0;
import xsna.biu;
import xsna.bpn0;
import xsna.bu1;
import xsna.bwt0;
import xsna.bzb0;
import xsna.c4g0;
import xsna.c9m;
import xsna.cn70;
import xsna.cs2;
import xsna.cwb0;
import xsna.dfm;
import xsna.dhr0;
import xsna.drm0;
import xsna.dtk0;
import xsna.e3m;
import xsna.e43;
import xsna.efm;
import xsna.el3;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.fai;
import xsna.fc1;
import xsna.fs2;
import xsna.g2v;
import xsna.gzs;
import xsna.hcm;
import xsna.iah0;
import xsna.j37;
import xsna.j5g;
import xsna.jcg;
import xsna.jjc;
import xsna.jpf0;
import xsna.k82;
import xsna.kkm;
import xsna.krv0;
import xsna.lfm;
import xsna.m33;
import xsna.m4g;
import xsna.m8;
import xsna.msy;
import xsna.n0v0;
import xsna.n5i;
import xsna.n720;
import xsna.ncg;
import xsna.nhe;
import xsna.nu0;
import xsna.o25;
import xsna.oce;
import xsna.owi;
import xsna.phg;
import xsna.qtd0;
import xsna.qv20;
import xsna.r0n0;
import xsna.r5i;
import xsna.rdw;
import xsna.s1m;
import xsna.s2n0;
import xsna.s3q0;
import xsna.t1e;
import xsna.u8m;
import xsna.u9h0;
import xsna.v8m;
import xsna.vh30;
import xsna.wra;
import xsna.wze;
import xsna.xuo0;
import xsna.y6c;
import xsna.yri;
import xsna.z0h;
import xsna.z8m;
import xsna.zh0;
import xsna.zk70;
import xsna.zkh;
import xsna.zmp0;
import xsna.zri;

/* compiled from: DialogHeaderInfoVcOld.kt */
/* loaded from: classes2.dex */
public final class b implements dfm {
    public static final int O = cn70.b(9);
    public final Object A;
    public final u9h0 B;
    public final r0n0 C;
    public final fai D;
    public final jpf0 E;
    public final zri F;
    public final TimeChangeReceiver G;
    public final bpn0 H;
    public boolean I;
    public final c9m J;
    public z8m K;
    public cs2 L;
    public final Object M;
    public final dtk0 N;
    public final kkm a;
    public final boolean b;
    public final s2n0 c;
    public final View d;
    public efm e;
    public final Context f;
    public final Toolbar g;
    public final ViewGroup h;
    public final View i;
    public final ViewGroup j;
    public final TextView k;
    public final VKImageView l;
    public final ImageView m;
    public final ViewStub n;
    public final ImAvatarView o;
    public final ImageView p;
    public final AppCompatImageView q;
    public final AppCompatImageView r;
    public final ImageView s;
    public final TextView t;
    public final ViewGroup u;
    public final ImageView v;
    public final ImageView w;
    public ImageView x;
    public final yri y;
    public final Handler z;

    /* compiled from: DialogHeaderInfoVcOld.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshInfo.values().length];
            try {
                iArr[RefreshInfo.REFRESHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DialogHeaderInfoVcOld.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.dialog_header.info.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1162b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            b bVar = (b) this.receiver;
            int i = b.O;
            bVar.D();
            return s3q0.a;
        }
    }

    public b(LayoutInflater layoutInflater, ViewStub viewStub, kkm kkmVar, boolean z, s2n0 s2n0Var) {
        this.a = kkmVar;
        this.b = z;
        this.c = s2n0Var;
        viewStub.setLayoutResource(R.layout.vkim_dialog_header_info_v2_old);
        View inflate = viewStub.inflate();
        this.d = inflate;
        Context context = layoutInflater.getContext();
        this.f = context;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.g = toolbar;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.content);
        this.h = viewGroup;
        View findViewById = toolbar.findViewById(R.id.avatar_wrapper);
        this.i = findViewById;
        this.j = (ViewGroup) toolbar.findViewById(R.id.title_container);
        this.k = (TextView) toolbar.findViewById(R.id.vkim_title_text);
        this.l = (VKImageView) toolbar.findViewById(R.id.title_emoji);
        ImageView imageView = (ImageView) toolbar.findViewById(R.id.title_donut);
        this.m = imageView;
        this.n = (ViewStub) toolbar.findViewById(R.id.verified_stub);
        ImAvatarView imAvatarView = (ImAvatarView) inflate.findViewById(R.id.avatar_content);
        this.o = imAvatarView;
        this.p = (ImageView) toolbar.findViewById(R.id.title_muted);
        this.q = (AppCompatImageView) toolbar.findViewById(R.id.title_casper);
        this.r = (AppCompatImageView) toolbar.findViewById(R.id.title_writing_disabled);
        ImageView imageView2 = (ImageView) toolbar.findViewById(R.id.title_dropdown);
        this.s = imageView2;
        this.t = (TextView) toolbar.findViewById(R.id.subtitle_text);
        this.u = (ViewGroup) toolbar.findViewById(R.id.subtitle_container);
        this.v = (ImageView) toolbar.findViewById(R.id.subtitle_online_mobile);
        ImageView imageView3 = (ImageView) toolbar.findViewById(R.id.typing_progress);
        this.w = imageView3;
        yri yriVar = new yri(context, e3m.f(R.attr.vk_ui_text_secondary, context));
        this.y = yriVar;
        this.z = new Handler();
        this.A = new Object();
        this.B = new u9h0(context);
        this.C = new r0n0(context);
        this.D = new fai();
        this.E = new jpf0(context);
        this.F = new zri(context);
        TimeChangeReceiver timeChangeReceiver = new TimeChangeReceiver(context, new C1162b(0, this, b.class, "invalidateDialogContent", "invalidateDialogContent()V", 0));
        this.G = timeChangeReceiver;
        this.H = new bpn0(new bu1(this, 26));
        this.J = new c9m(toolbar, kkmVar);
        this.M = msy.a(LazyThreadSafetyMode.NONE, new z0h(this, 5));
        this.N = new dtk0();
        toolbar.setNavigationOnClickListener(new zh0(this, 2));
        toolbar.l(R.menu.vkim_dialog_header_info_v2_old);
        toolbar.setOnMenuItemClickListener(new nu0(this, 18));
        if (!z) {
            jjc.g(viewGroup, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 0));
            jjc.g(findViewById, new zkh(this, 6));
        }
        yriVar.setAlpha(127);
        imageView3.setImageDrawable(yriVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        context.registerReceiver(timeChangeReceiver.c, intentFilter);
        kkmVar.b(toolbar, R.attr.vk_ui_icon_accent_themed);
        kkmVar.d(imageView2, R.attr.im_dropdown_arrow_tint);
        kkmVar.e(toolbar, new y6c(this, 3));
        kkmVar.e(imAvatarView, new phg(this, 2));
        i(false);
        EmptyList emptyList = EmptyList.b;
        b(emptyList);
        e(null);
        q(RefreshInfo.DISCONNECTED);
        u(emptyList);
        D();
        imageView.setImageResource(R.drawable.vk_icon_donut_color_12);
    }

    public static int K(boolean z) {
        return z ? 0 : 8;
    }

    public static int z(float f) {
        return Math.round(f * iah0.f().density);
    }

    public final void A(u8m u8mVar) {
        if (e43.l(u8m.l0.b, u8m.i0.b, u8m.e.b, u8m.d.b, u8m.f.b, u8m.w0.b, u8m.v0.b, u8m.g.b, u8m.h.b).contains(u8mVar)) {
            this.z.postDelayed(new fs2(this, 5), 500L);
        } else {
            y();
        }
    }

    public final bzb0 B() {
        return (bzb0) this.H.getValue();
    }

    public final void C(u8m u8mVar) {
        efm efmVar;
        v8m.a = null;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("IM.DIALOG_ACTION.SUCCEED");
        aVar.a(u8mVar, "action");
        aVar.a(Boolean.FALSE, "from_dialogs_list");
        bVar.k(aVar.e());
        if (u8mVar.equals(u8m.l0.b)) {
            efm efmVar2 = this.e;
            if (efmVar2 != null) {
                efmVar2.z();
            }
        } else if (u8mVar.equals(u8m.j0.b)) {
            efm efmVar3 = this.e;
            if (efmVar3 != null) {
                efmVar3.z();
            }
        } else if (u8mVar.equals(u8m.i0.b)) {
            efm efmVar4 = this.e;
            if (efmVar4 != null) {
                efmVar4.z();
            }
        } else if (u8mVar.equals(u8m.r0.b)) {
            efm efmVar5 = this.e;
            if (efmVar5 != null) {
                efmVar5.r();
            }
        } else if (u8mVar.equals(u8m.a.b)) {
            efm efmVar6 = this.e;
            if (efmVar6 != null) {
                efmVar6.y();
            }
        } else if (u8mVar.equals(u8m.a0.b)) {
            efm efmVar7 = this.e;
            if (efmVar7 != null) {
                efmVar7.B();
            }
        } else if (u8mVar.equals(u8m.j.b)) {
            efm efmVar8 = this.e;
            if (efmVar8 != null) {
                efmVar8.h();
            }
        } else if (u8mVar.equals(u8m.e.b) || u8mVar.equals(u8m.d.b) || u8mVar.equals(u8m.f.b)) {
            efm efmVar9 = this.e;
            if (efmVar9 != null) {
                efmVar9.u();
            }
        } else if (u8mVar.equals(u8m.g0.b)) {
            efm efmVar10 = this.e;
            if (efmVar10 != null) {
                efmVar10.m(true);
            }
        } else if (u8mVar.equals(u8m.f0.b)) {
            efm efmVar11 = this.e;
            if (efmVar11 != null) {
                efmVar11.m(false);
            }
        } else if (u8mVar.equals(u8m.x.b)) {
            efm efmVar12 = this.e;
            if (efmVar12 != null) {
                efmVar12.s(true);
            }
        } else if (u8mVar.equals(u8m.v.b)) {
            efm efmVar13 = this.e;
            if (efmVar13 != null) {
                efmVar13.s(false);
            }
        } else if (u8mVar.equals(u8m.y.b)) {
            efm efmVar14 = this.e;
            if (efmVar14 != null) {
                efmVar14.s(false);
            }
        } else if (u8mVar.equals(u8m.m.b)) {
            efm efmVar15 = this.e;
            if (efmVar15 != null) {
                efmVar15.v();
            }
            DialogExt b = this.N.b();
            Dialog Cb = b.Cb();
            if (Cb != null) {
                bzb0.e(B(), new cwb0.q(this.f, Cb, b.getTitle()), new nhe(this, 13));
            }
        } else if (u8mVar.equals(u8m.b0.b)) {
            J();
        } else if (u8mVar.equals(u8m.c0.b)) {
            J();
        } else if (u8mVar.equals(u8m.p0.b)) {
            efm efmVar16 = this.e;
            if (efmVar16 != null) {
                efmVar16.b();
            }
        } else if (u8mVar.equals(u8m.q0.b)) {
            efm efmVar17 = this.e;
            if (efmVar17 != null) {
                efmVar17.b();
            }
        } else if (u8mVar.equals(u8m.m0.b)) {
            efm efmVar18 = this.e;
            if (efmVar18 != null) {
                efmVar18.c();
            }
        } else if (u8mVar.equals(u8m.u0.b)) {
            efm efmVar19 = this.e;
            if (efmVar19 != null) {
                efmVar19.e();
            }
        } else if (u8mVar.equals(u8m.i.b)) {
            efm efmVar20 = this.e;
            if (efmVar20 != null) {
                efmVar20.q();
            }
        } else if (u8mVar.equals(u8m.e0.b)) {
            efm efmVar21 = this.e;
            if (efmVar21 != null) {
                efmVar21.d();
            }
            efm efmVar22 = this.e;
            if (efmVar22 != null) {
                efmVar22.onClose();
            }
        } else if (u8mVar.equals(u8m.h0.b)) {
            efm efmVar23 = this.e;
            if (efmVar23 != null) {
                efmVar23.i();
            }
        } else if (u8mVar.equals(u8m.k0.b)) {
            efm efmVar24 = this.e;
            if (efmVar24 != null) {
                efmVar24.k();
            }
        } else if ((u8mVar instanceof u8m.r) && (efmVar = this.e) != null) {
            efmVar.t((u8m.r) u8mVar);
        }
        A(u8mVar);
    }

    public final void D() {
        Dialog dialog;
        boolean z;
        qtd0 Ab;
        OnlineInfo mb;
        VisibleStatus zb;
        int i;
        dtk0 dtk0Var = this.N;
        boolean z2 = dtk0Var.a;
        ImageView imageView = this.m;
        ImAvatarView imAvatarView = this.o;
        ViewGroup viewGroup = this.h;
        Toolbar toolbar = this.g;
        Context context = this.f;
        if (z2) {
            toolbar.setClipChildren(true);
            toolbar.setClipToPadding(true);
            viewGroup.setClipChildren(true);
            viewGroup.setClipToPadding(true);
            ImStoryState imStoryState = ImStoryState.NONE;
            imAvatarView.setVisibility(0);
            if (imAvatarView.getVisibility() == 0) {
                imAvatarView.r1(null, null);
                imAvatarView.w1(imStoryState);
            }
            F(false, null);
            imageView.setVisibility(K(false));
            I(false, context.getString(R.string.vkim_loading), null, false, false, false, false, false);
            H(false, "", null, false);
            toolbar.getMenu().findItem(R.id.chat_add_members).setVisible(false);
            G(c.d.a);
            toolbar.getMenu().findItem(R.id.more).setVisible(false);
            return;
        }
        Dialog dialog2 = dtk0Var.b;
        ProfilesSimpleInfo profilesSimpleInfo = dtk0Var.c;
        boolean z3 = this.K != null;
        qtd0 Ab2 = profilesSimpleInfo.Ab(dialog2.Sb());
        ImageStatus E5 = Ab2 != null ? Ab2.E5() : null;
        qtd0 zb2 = profilesSimpleInfo.zb(dialog2.Zb());
        boolean k = zb2 != null ? qv20.k(zb2) : false;
        CharSequence a2 = this.B.a(dialog2, profilesSimpleInfo);
        toolbar.setClipChildren(true);
        toolbar.setClipToPadding(true);
        viewGroup.setClipChildren(true);
        viewGroup.setClipToPadding(true);
        ImStoryState imStoryState2 = dtk0Var.l;
        imAvatarView.setVisibility(0);
        if (imAvatarView.getVisibility() == 0) {
            imAvatarView.r1(dialog2, profilesSimpleInfo);
            imAvatarView.w1(imStoryState2);
        }
        F((dialog2.Jc() || E5 == null) ? false : true, E5);
        imageView.setVisibility(K(dialog2.o1()));
        this.D.getClass();
        VerifyInfo w = fai.w(dialog2, profilesSimpleInfo);
        xuo0.a.getClass();
        boolean z4 = !dialog2.Ac(xuo0.a());
        g2v.c().getClass();
        boolean z5 = this.I;
        n0v0 n0v0Var = n0v0.a;
        boolean c = n0v0Var.c(z5, z3);
        boolean z6 = this.b;
        if (!c || z6) {
            dialog = dialog2;
            z = false;
        } else {
            dialog = dialog2;
            z = true;
        }
        boolean z7 = z3;
        Dialog dialog3 = dialog;
        I(true, a2, w, z4, z, dialog.sc(), dialog.Kc(), k);
        toolbar.getMenu().findItem(R.id.chat_add_members).setVisible(dtk0Var.j);
        G(dtk0Var.a());
        g2v.c().getClass();
        toolbar.getMenu().findItem(R.id.more).setVisible(n0v0Var.f(this.I, z7) && !z6);
        toolbar.getMenu().findItem(R.id.search).setVisible(dialog3.Jc() || dialog3.rc());
        RefreshInfo refreshInfo = dtk0Var.e;
        hcm hcmVar = dtk0Var.f;
        Dialog dialog4 = dtk0Var.b;
        ProfilesSimpleInfo profilesSimpleInfo2 = dtk0Var.c;
        boolean z8 = dtk0Var.m;
        if (refreshInfo != RefreshInfo.CONNECTED) {
            H(true, this.E.a(refreshInfo), null, false);
        } else if (dialog4.Jc()) {
            H(true, context.getString(R.string.vkim_dialog_with_self_subtitle), null, false);
        } else if (dialog4.rc()) {
            H(true, context.getString(R.string.vkim_business_notify_count_default), null, false);
        } else if (hcmVar.c()) {
            H(true, this.F.b(hcmVar, dialog4, profilesSimpleInfo2), hcmVar.b(), false);
        } else if (z8 && dialog4.t1()) {
            H(true, context.getString(R.string.online), null, false);
        } else {
            boolean uc = dialog4.uc();
            r0n0 r0n0Var = this.C;
            H(!drm0.N(r1), (!uc || (i = dtk0Var.d) <= 0) ? r0n0Var.a(dialog4, profilesSimpleInfo2) : r0n0Var.b(dialog4, i), null, (profilesSimpleInfo2 == null || (Ab = profilesSimpleInfo2.Ab(dialog4.Sb())) == null || (mb = Ab.mb()) == null || (zb = mb.zb()) == null || zb.e != Platform.MOBILE || zb.Cb()) ? false : true);
        }
        int b = cn70.b(4);
        int b2 = cn70.b(44);
        awt0.x(this.i, 0, b, 0, 0, 13);
        ViewGroup.LayoutParams layoutParams = imAvatarView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = -1;
        layoutParams2.width = b2;
        layoutParams2.height = b2;
        imAvatarView.setLayoutParams(layoutParams2);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        bVar.i(constraintLayout);
        bVar.u(R.id.vkim_title_text).e.X = 2;
        bVar.h(R.id.avatar_wrapper, 4);
        bVar.b(constraintLayout);
    }

    public final void E(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.chat_add_members) {
            efm efmVar = this.e;
            if (efmVar != null) {
                efmVar.y();
                return;
            }
            return;
        }
        c9m c9mVar = this.J;
        dtk0 dtk0Var = this.N;
        if (itemId == R.id.call) {
            c a2 = dtk0Var.a();
            if ((a2 instanceof c.a) || epx.f(a2, c.f.a)) {
                if (dtk0Var.k) {
                    c9mVar.b(epx.f(a2, c.f.a) ? e43.l(u8m.w0.b, u8m.v0.b) : e43.l(u8m.g.b, u8m.h.b), new oce(this, 15));
                    return;
                }
                efm efmVar2 = this.e;
                if (efmVar2 != null) {
                    efmVar2.o(false);
                    return;
                }
                return;
            }
            if (a2 instanceof c.e) {
                biu biuVar = ((c.e) a2).a;
                efm efmVar3 = this.e;
                if (efmVar3 != null) {
                    efmVar3.j(biuVar);
                    return;
                }
                return;
            }
            return;
        }
        if (itemId == R.id.call_audio) {
            efm efmVar4 = this.e;
            if (efmVar4 != null) {
                efmVar4.o(false);
                return;
            }
            return;
        }
        if (itemId == R.id.call_video) {
            efm efmVar5 = this.e;
            if (efmVar5 != null) {
                efmVar5.o(true);
                return;
            }
            return;
        }
        if (itemId != R.id.call_more) {
            if (itemId != R.id.more) {
                if (itemId == R.id.search) {
                    C(u8m.r0.b);
                    return;
                }
                return;
            }
            z8m z8mVar = this.K;
            n0v0 n0v0Var = n0v0.a;
            if (z8mVar == null) {
                v8m.a = new Object();
                g2v.c().getClass();
                c9mVar.b(n0v0Var.a(this.K == null, dtk0Var.g, dtk0Var.b), new m8(1, this, b.class, "handleDialogActionClick", "handleDialogActionClick(Lcom/vk/im/ui/components/common/DialogAction;)V", 0, 2));
                return;
            } else {
                v8m.a = new Object();
                if (z8mVar != null) {
                    g2v.c().getClass();
                    z8mVar.b(n0v0Var.a(this.K == null, dtk0Var.g, dtk0Var.b), new j37(1, this, b.class, "handleDialogActionClick", "handleDialogActionClick(Lcom/vk/im/ui/components/common/DialogAction;)V", 0, 5));
                    return;
                }
                return;
            }
        }
        efm efmVar6 = this.e;
        if (efmVar6 != null) {
            efmVar6.w();
        }
        View actionView = this.g.getMenu().findItem(R.id.call_more).getActionView();
        if (actionView == null) {
            return;
        }
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        actionView.getContext();
        e.b bVar = new e.b(actionView, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        int f = this.a.f(R.attr.vk_ui_icon_accent_themed);
        Context context = this.f;
        VkContextMenu.c.c(bVar, R.string.vkim_msg_header_menu_call_with_video, enj.c(R.drawable.vk_icon_videocam_outline_28, f, context), false, null, new n5i(this, 5), 24);
        e3m.a aVar = e3m.a;
        VkContextMenu.c.c(bVar, R.string.vkim_msg_header_menu_call_with_max, m33.a(R.drawable.vk_icon_logo_max_color_24, context), false, null, new jcg(this, 10), 24);
        efm efmVar7 = this.e;
        if (efmVar7 != null) {
            efmVar7.x();
        }
        bVar.l(false);
    }

    public final void F(boolean z, ImageStatus imageStatus) {
        Image image;
        ImageSize Ab;
        int K = K(z);
        VKImageView vKImageView = this.l;
        vKImageView.setVisibility(K);
        if (vKImageView.getVisibility() == 0) {
            vKImageView.load((imageStatus == null || (image = imageStatus.d) == null || (Ab = image.Ab(z(20.0f), false)) == null) ? null : Ab.d.d);
            vKImageView.setContentDescription(imageStatus != null ? imageStatus.c : null);
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void G(c cVar) {
        Toolbar toolbar = this.g;
        MenuItem findItem = toolbar.getMenu().findItem(R.id.call);
        c.d dVar = c.d.a;
        boolean z = false;
        if (!epx.f(cVar, dVar) && !epx.f(cVar, c.b.a) && !epx.f(cVar, c.C1163c.a)) {
            if (!(cVar instanceof c.a) && !epx.f(cVar, c.f.a) && !(cVar instanceof c.e)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        findItem.setVisible(z);
        boolean z2 = cVar instanceof c.a;
        kkm kkmVar = this.a;
        if (z2) {
            findItem.setIcon(R.drawable.vk_icon_phone_outline_28);
            findItem.setTitle(R.string.vkim_msg_header_menu_call);
            n720.b(findItem, ColorStateList.valueOf(kkmVar.f(R.attr.vk_ui_icon_accent_themed)));
        } else if (cVar instanceof c.f) {
            findItem.setIcon(R.drawable.vk_icon_videocam_outline_28);
            findItem.setTitle(R.string.vkim_msg_header_menu_call);
            n720.b(findItem, ColorStateList.valueOf(kkmVar.f(R.attr.vk_ui_icon_accent_themed)));
        } else if (cVar instanceof c.e) {
            n720.b(findItem, null);
            ?? r6 = this.M;
            findItem.setIcon((EnhancedAnimatedVectorDrawable) r6.getValue());
            findItem.setTitle(R.string.vkim_msg_header_menu_join_to_call);
            ((EnhancedAnimatedVectorDrawable) r6.getValue()).start();
        }
        Menu menu = toolbar.getMenu();
        menu.removeItem(R.id.call_audio);
        menu.removeItem(R.id.call_video);
        menu.removeItem(R.id.call_more);
        if (epx.f(cVar, c.b.a)) {
            x(R.id.call_audio, R.string.vkim_msg_header_menu_call_with_audio, R.drawable.vk_icon_phone_outline_28, 1, z(40.0f));
            x(R.id.call_video, R.string.vkim_msg_header_menu_call_with_video, R.drawable.vk_icon_videocam_outline_28, 2, z(48.0f));
        } else if (epx.f(cVar, c.C1163c.a)) {
            x(R.id.call_audio, R.string.vkim_msg_header_menu_call_with_audio, R.drawable.vk_icon_phone_outline_28, 1, z(40.0f));
            x(R.id.call_more, R.string.more, R.drawable.vk_icon_more_vertical_28, 2, z(48.0f));
        } else if (!epx.f(cVar, dVar) && !z2 && !epx.f(cVar, c.f.a) && !(cVar instanceof c.e)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void H(boolean z, String str, ComposingType composingType, boolean z2) {
        int K = K(z);
        TextView textView = this.t;
        textView.setVisibility(K);
        textView.setText(str);
        ImageView imageView = this.v;
        ImageView imageView2 = this.w;
        yri yriVar = this.y;
        if (composingType == null) {
            yriVar.setVisible(false, false);
            f4m.j(imageView2);
            imageView.setVisibility(K(z2));
        } else {
            yriVar.a(composingType);
            yriVar.setVisible(true, false);
            imageView2.setVisibility(0);
            f4m.j(imageView);
        }
        ViewGroup viewGroup = this.u;
        if (f4m.h(viewGroup) != z) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            wra wraVar = new wra();
            wraVar.setDuration(100L);
            wraVar.excludeTarget((View) this.j, true);
            wraVar.excludeTarget(this.i, true);
            zmp0.a(viewGroup2, wraVar);
            int i = O;
            if (!z) {
                i /= 2;
            }
            TextView textView2 = this.k;
            f4m.t(i, textView2);
            ((ConstraintLayout.b) textView2.getLayoutParams()).F = z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.5f;
            viewGroup.setVisibility(K(z));
        }
    }

    public final void I(boolean z, CharSequence charSequence, VerifyInfo verifyInfo, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int K = K(z);
        TextView textView = this.k;
        textView.setVisibility(K);
        textView.setText(charSequence);
        int K2 = K(z4);
        AppCompatImageView appCompatImageView = this.q;
        appCompatImageView.setVisibility(K2);
        this.r.setVisibility(K(z5));
        this.i.setContentDescription(this.f.getString(R.string.vkim_accessibility_avatar_chat_name, charSequence));
        if (z4) {
            bwt0.o0(appCompatImageView, c4g0.t(this.N.b.hc()));
        }
        this.p.setVisibility(K(z2));
        this.s.setVisibility(K(z3));
        if (this.x == null && verifyInfo != null) {
            this.x = (ImageView) this.n.inflate().findViewById(R.id.avatar_verified);
        }
        if (verifyInfo == null && f4m.h(this.x)) {
            f4m.j(this.x);
        } else if (verifyInfo != null) {
            boolean b = o25.b(o25.a());
            kkm kkmVar = this.a;
            if (b && verifyInfo.b) {
                ImageView imageView = this.x;
                if (imageView != null) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.width = cn70.b(16);
                    layoutParams2.height = cn70.b(16);
                    imageView.setTranslationX(cn70.a() * 1.0f);
                    imageView.setTranslationY(cn70.a() * 3.0f);
                    int b2 = cn70.b(4);
                    layoutParams2.setMargins(b2, b2, b2, b2);
                    int b3 = cn70.b(2);
                    imageView.setPadding(b3, b3, b3, b3);
                    imageView.setElevation(cn70.a() * 1.0f);
                    layoutParams2.gravity = 8388693;
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setLayoutParams(layoutParams2);
                    kkmVar.e(imageView, new w(imageView, 5));
                }
            } else {
                ImageView imageView2 = this.x;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.width = cn70.b(24);
                    layoutParams4.height = cn70.b(24);
                    imageView2.setTranslationX(cn70.a() * 1.0f);
                    imageView2.setTranslationY(cn70.a() * 3.0f);
                    layoutParams4.setMargins(0, 0, 0, 0);
                    imageView2.setPadding(0, 0, 0, 0);
                    imageView2.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    layoutParams4.gravity = 8388693;
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView2.setLayoutParams(layoutParams4);
                    kkmVar.e(imageView2, new fc1(4, imageView2, verifyInfo));
                }
            }
        }
        ImAvatarView imAvatarView = this.o;
        if (z6) {
            ImAvatarView.x1(imAvatarView, dhr0.t.a(R.drawable.ic_cake_circle_fill_purple_composite_20));
        } else {
            ImAvatarView.x1(imAvatarView, null);
        }
    }

    public final void J() {
        bzb0.e(B(), new cwb0.h0(this.f, this.N.b()), new t1e(this, 13));
    }

    @Override // xsna.dfm
    public final void a() {
        B().c(new cwb0.p(null), new s1m(this, 1));
    }

    @Override // xsna.dfm
    public final void b(List<? extends u8m> list) {
        dtk0 dtk0Var = this.N;
        if (epx.f(dtk0Var.g, list)) {
            return;
        }
        dtk0Var.g = list;
    }

    @Override // xsna.dfm
    public final void c() {
        B().a();
    }

    @Override // xsna.dfm
    public final void d(Throwable th) {
        zk70.e(th);
    }

    @Override // xsna.dfm
    public final void destroy() {
        this.I = false;
        this.J.destroy();
        z8m z8mVar = this.K;
        if (z8mVar != null) {
            z8mVar.a(true);
        }
        owi.b(this.A);
        TimeChangeReceiver timeChangeReceiver = this.G;
        timeChangeReceiver.a.unregisterReceiver(timeChangeReceiver.c);
        B().a();
        y();
    }

    @Override // xsna.dfm
    public final void e(z8m z8mVar) {
        if (epx.f(this.K, z8mVar)) {
            return;
        }
        this.J.a(true);
        this.K = z8mVar;
        D();
    }

    @Override // xsna.dfm
    public final void f(lfm lfmVar) {
        dtk0 dtk0Var = this.N;
        dtk0Var.a = false;
        Dialog dialog = lfmVar.a;
        if (dialog == null) {
            dialog = new Dialog();
        }
        dtk0Var.b = dialog;
        dtk0Var.c = lfmVar.b;
        dtk0Var.d = lfmVar.c;
        D();
    }

    @Override // xsna.dfm
    public final void g(efm efmVar) {
        this.e = efmVar;
    }

    @Override // xsna.dfm
    public final View getView() {
        return this.d;
    }

    @Override // xsna.dfm
    public final void h(boolean z) {
        dtk0 dtk0Var = this.N;
        if (dtk0Var.j != z) {
            dtk0Var.j = z;
            D();
        }
    }

    @Override // xsna.dfm
    public final void i(boolean z) {
        Toolbar toolbar = this.g;
        if (!z) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        int i = this.b ? R.attr.im_ic_cancel : R.attr.im_ic_back;
        int f = this.a.f(R.attr.vk_ui_icon_accent_themed);
        abg0 abg0Var = dhr0.t;
        abg0Var.getClass();
        toolbar.setNavigationIcon(new baf0(abg0Var.d(i), f));
    }

    @Override // xsna.dfm
    public final void j() {
        y();
    }

    @Override // xsna.dfm
    public final void k() {
        B().a();
    }

    @Override // xsna.dfm
    public final void l() {
        B().a();
    }

    @Override // xsna.dfm
    public final void m() {
        this.N.m = true;
        D();
        cs2 cs2Var = this.L;
        Handler handler = this.z;
        if (cs2Var != null) {
            handler.removeCallbacks(cs2Var);
        }
        cs2 cs2Var2 = new cs2(this, 7);
        handler.postDelayed(cs2Var2, 7000L);
        this.L = cs2Var2;
    }

    @Override // xsna.dfm
    public final void n() {
        B().c(new cwb0.v0(this.N.b()), new r5i(this, 3));
    }

    @Override // xsna.dfm
    public final void o() {
        dtk0 dtk0Var = this.N;
        if (dtk0Var.a) {
            return;
        }
        dtk0Var.a = true;
        dtk0Var.b = new Dialog();
        dtk0Var.c = new ProfilesSimpleInfo();
        D();
    }

    @Override // xsna.dfm
    public final void p() {
        B().c(new cwb0.g0(this.N.b()), new ncg(this, 16));
    }

    @Override // xsna.dfm
    public final void q(RefreshInfo refreshInfo) {
        dtk0 dtk0Var = this.N;
        if (dtk0Var.e != refreshInfo) {
            dtk0Var.e = refreshInfo;
            int i = a.$EnumSwitchMapping$0[refreshInfo.ordinal()];
            s2n0 s2n0Var = this.c;
            if (i == 1) {
                s2n0Var.b();
            } else {
                s2n0Var.a();
            }
            D();
        }
    }

    @Override // xsna.dfm
    public final void r(boolean z) {
        dtk0 dtk0Var = this.N;
        if (dtk0Var.k == z) {
            return;
        }
        dtk0Var.k = z;
        D();
    }

    @Override // xsna.dfm
    public final void s(boolean z) {
        dtk0 dtk0Var = this.N;
        if (dtk0Var.i != z) {
            dtk0Var.i = z;
            D();
        }
    }

    @Override // xsna.dfm
    public final void t(boolean z) {
        if (this.I != z) {
            this.J.a(true);
            this.I = z;
            D();
        }
    }

    @Override // xsna.dfm
    public final void u(List<vh30> list) {
        dtk0 dtk0Var = this.N;
        if (dtk0Var.f.a(list)) {
            return;
        }
        hcm hcmVar = dtk0Var.f;
        hcmVar.getClass();
        hcmVar.b = j5g.O0(list);
        dtk0Var.m = false;
        D();
    }

    @Override // xsna.dfm
    public final void v(ImStoryState imStoryState) {
        dtk0 dtk0Var = this.N;
        dtk0Var.l = imStoryState;
        List<Peer.Type> list = rdw.a;
        boolean a2 = rdw.a(dtk0Var.b.Zb(), dtk0Var.b.Jc());
        ImAvatarView imAvatarView = this.o;
        if (a2 && dtk0Var.l.i()) {
            jjc.g(imAvatarView, new m4g(this, 11));
        } else {
            g2v.c().getClass();
            if (this.b) {
                imAvatarView.setOnClickListener(null);
            } else {
                jjc.g(imAvatarView, new wze(this, 15));
            }
        }
        D();
    }

    @Override // xsna.dfm
    public final void w(boolean z) {
        dtk0 dtk0Var = this.N;
        if (dtk0Var.h != z) {
            dtk0Var.h = z;
            D();
        }
    }

    @SuppressLint({"InflateParams"})
    public final void x(int i, int i2, int i3, int i4, int i5) {
        Toolbar toolbar = this.g;
        toolbar.getMenu().add(0, i, i4, i2);
        MenuItem findItem = toolbar.getMenu().findItem(i);
        Context context = this.f;
        View inflate = LayoutInflater.from(context).inflate(R.layout.vkim_dialog_header_call_menu_item, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(i5, -1));
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.vkim_dialog_header_call_menu_icon);
        appCompatImageView.setContentDescription(context.getString(i2));
        appCompatImageView.setImageResource(i3);
        this.a.d(appCompatImageView, R.attr.vk_ui_icon_accent_themed);
        findItem.setActionView(inflate);
        findItem.setShowAsAction(2);
        jjc.g(appCompatImageView, new k82(7, this, findItem));
    }

    public final void y() {
        z8m z8mVar;
        this.z.removeCallbacksAndMessages(null);
        c9m c9mVar = this.J;
        if (c9mVar.isVisible()) {
            c9mVar.a(true);
        }
        z8m z8mVar2 = this.K;
        if (z8mVar2 == null || !z8mVar2.isVisible() || (z8mVar = this.K) == null) {
            return;
        }
        z8mVar.a(true);
    }
}

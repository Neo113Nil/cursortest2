package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.c;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f;
import com.vk.im.ui.components.viewcontrollers.msg_list.decoration.MsgRegionImageMask;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.im.ui.views.msg.BombView;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vkontakte.android.R;
import java.util.Collection;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.abg0;
import xsna.abi0;
import xsna.bpn0;
import xsna.bs30;
import xsna.bwt0;
import xsna.chr;
import xsna.cn70;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.ev9;
import xsna.ezp;
import xsna.f4m;
import xsna.f5v;
import xsna.fmm;
import xsna.fot;
import xsna.h7j0;
import xsna.hbj0;
import xsna.hr30;
import xsna.hz30;
import xsna.iah0;
import xsna.ir30;
import xsna.jj3;
import xsna.k75;
import xsna.krs;
import xsna.ll8;
import xsna.lmn0;
import xsna.lsr0;
import xsna.msy;
import xsna.mvr0;
import xsna.nl8;
import xsna.nsr0;
import xsna.ntx0;
import xsna.oh30;
import xsna.osr0;
import xsna.oyt;
import xsna.p490;
import xsna.pfz;
import xsna.pi6;
import xsna.pk30;
import xsna.pwh0;
import xsna.q7v0;
import xsna.qkd0;
import xsna.qtd0;
import xsna.qv20;
import xsna.rk30;
import xsna.sho;
import xsna.t43;
import xsna.ub80;
import xsna.utr0;
import xsna.vb80;
import xsna.vpj0;
import xsna.wp10;
import xsna.xtr0;
import xsna.xzk0;
import xsna.y670;
import xsna.ypf0;

/* compiled from: VhMsg.kt */
/* loaded from: classes2.dex */
public class a extends osr0<nsr0> implements ntx0, lmn0.b, xtr0, ypf0, ev9.a, chr, rk30.a, f5v.a, fmm.a {
    public static final /* synthetic */ int T = 0;
    public final bpn0 A;
    public final bpn0 B;
    public final Rect C;
    public final Rect D;
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public final Rect H;
    public final StringBuilder I;
    public pk30 J;
    public ub80 K;
    public vb80 L;
    public ev9 M;
    public f5v N;
    public fmm O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final hr30<Attach, ir30> m;
    public final c n;
    public final VkOnboardingComponent o;
    public f p;
    public final ImAvatarView q;
    public final MsgBubbleView r;
    public final FluidHorizontalLayout s;
    public final Space t;
    public final FrameLayout u;
    public final ImageView v;
    public final Space w;
    public final Object x;
    public final Object y;
    public final int z;

    /* compiled from: VhMsg.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1168a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MsgBubblePart.values().length];
            try {
                iArr[MsgBubblePart.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgBubblePart.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgBubblePart.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MsgBubblePart.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VhStyle.values().length];
            try {
                iArr2[VhStyle.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VhStyle.TWO_LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: VhMsg.kt */
    public static final class b implements BombView.c {
        public b() {
        }

        @Override // com.vk.im.ui.views.msg.BombView.c
        public final void a(int i) {
            if (i == 2 || i == 3) {
                a.this.g6().setVisibility(0);
            }
        }
    }

    public a(View view, ViewGroup viewGroup, hr30<Attach, ir30> hr30Var, c cVar, VkOnboardingComponent vkOnboardingComponent) {
        super(view);
        this.m = hr30Var;
        this.n = cVar;
        this.o = vkOnboardingComponent;
        this.p = new f(null, null, 0, null, false, false, 0L, null, null, null, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, -1, 2047);
        ImAvatarView imAvatarView = (ImAvatarView) view.findViewById(R.id.avatar);
        this.q = imAvatarView;
        MsgBubbleView msgBubbleView = (MsgBubbleView) view.findViewById(R.id.bubble);
        this.r = msgBubbleView;
        this.s = (FluidHorizontalLayout) view;
        this.t = (Space) view.findViewById(R.id.avatar_space);
        this.u = (FrameLayout) view.findViewById(R.id.vkim_incoming_share_container);
        ImageView imageView = (ImageView) view.findViewById(R.id.vkim_incoming_share);
        this.v = imageView;
        this.w = (Space) view.findViewById(R.id.status_space);
        vpj0 vpj0Var = new vpj0(view, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = msy.a(lazyThreadSafetyMode, vpj0Var);
        this.y = msy.a(lazyThreadSafetyMode, new jj3(view, 3));
        this.z = viewGroup.getWidth();
        this.A = new bpn0(new hz30(view, 1));
        this.B = new bpn0(new krs(view, 2));
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        Rect rect = new Rect();
        this.F = rect;
        this.G = new Rect();
        this.H = new Rect();
        this.I = new StringBuilder();
        this.P = msy.a(lazyThreadSafetyMode, new qkd0(this, 19));
        this.Q = msy.a(lazyThreadSafetyMode, new hbj0(this, 17));
        this.R = msy.a(lazyThreadSafetyMode, new pwh0(this, 19));
        this.S = msy.a(lazyThreadSafetyMode, new k75(20, this, view));
        msgBubbleView.setContentView(hr30Var.q(LayoutInflater.from(view.getContext()), msgBubbleView));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgBubbleView.getLayoutParams();
        rect.left = marginLayoutParams.leftMargin;
        rect.right = marginLayoutParams.rightMargin;
        rect.top = marginLayoutParams.topMargin;
        rect.bottom = marginLayoutParams.bottomMargin;
        bwt0.h0(new oyt(this, 10), imAvatarView);
        imAvatarView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.ksr0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a.this;
                pk30 pk30Var = aVar.J;
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar2 = aVar.p.k;
                Boolean bool = null;
                Peer peer = cVar2 != null ? cVar2.j : null;
                if (pk30Var != null && peer != null) {
                    pk30Var.L(peer);
                    bool = Boolean.TRUE;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            }
        });
        bwt0.h0(new pi6(this, 7), imageView);
        Context context = this.itemView.getContext();
        Handler handler = new Handler(Looper.getMainLooper());
        y670 y670Var = new y670(context, handler, new lsr0(this));
        y670Var.d = true;
        y670Var.e = true;
        y670Var.c.setIsLongpressEnabled(true);
        this.itemView.setOnTouchListener(new t43(new fot(context, y670Var, handler), 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MsgBubblePart h6(f fVar) {
        boolean z;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar;
        boolean z2;
        c.C1166c c1166c;
        c.C1166c c1166c2;
        boolean g = fVar.g();
        utr0 utr0Var = fVar.o;
        if (g) {
            if (!(utr0Var != null ? utr0Var.N() : false)) {
                z = true;
                cVar = fVar.k;
                if (!((cVar != null || (c1166c2 = cVar.D) == null) ? false : c1166c2.k)) {
                    if (!((cVar == null || (c1166c = cVar.D) == null) ? false : c1166c.i)) {
                        z2 = false;
                        boolean z3 = (fVar.y0() || z2) ? false : true;
                        utr0 utr0Var2 = fVar.p;
                        boolean b0 = utr0Var2 != null ? utr0Var2.b0() : false;
                        return ((utr0Var != null ? utr0Var.N() : false) || fVar.f()) ? (!fVar.f() && b0 && z) ? MsgBubblePart.BOTTOM : (fVar.f() || !b0) ? (z || !fVar.f() || z3) ? (z || z3) ? fVar.f() ? MsgBubblePart.TOP : MsgBubblePart.FULL : MsgBubblePart.BOTTOM : MsgBubblePart.MIDDLE : MsgBubblePart.FULL : MsgBubblePart.FULL;
                    }
                }
                z2 = true;
                if (fVar.y0()) {
                }
                utr0 utr0Var22 = fVar.p;
                if (utr0Var22 != null) {
                }
                if (utr0Var != null ? utr0Var.N() : false) {
                }
            }
        }
        z = false;
        cVar = fVar.k;
        if (!((cVar != null || (c1166c2 = cVar.D) == null) ? false : c1166c2.k)) {
        }
        z2 = true;
        if (fVar.y0()) {
        }
        utr0 utr0Var222 = fVar.p;
        if (utr0Var222 != null) {
        }
        if (utr0Var != null ? utr0Var.N() : false) {
        }
    }

    @Override // xsna.lmn0.b, xsna.xtr0
    public final View B() {
        return this.itemView;
    }

    @Override // xsna.ntx0
    public final Msg G0() {
        return this.p.R;
    }

    @Override // xsna.ypf0
    public final MsgBubbleView G2() {
        return this.r;
    }

    @Override // xsna.f5v.a
    public final void J1(int i, boolean z) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.p.k;
        if (cVar == null || cVar.b != i) {
            return;
        }
        l6(z);
    }

    @Override // xsna.xtr0
    public final MsgBubbleView K3() {
        return this.r;
    }

    @Override // xsna.rk30.a
    public final Integer N4() {
        return Integer.valueOf(this.p.r0());
    }

    @Override // xsna.f5v.a
    public final void T3(int i, boolean z) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.p.k;
        if (cVar == null || cVar.c != i) {
            return;
        }
        l6(z);
    }

    @Override // xsna.ypf0
    public final pfz W4() {
        return this.p.r ? pfz.a.a : pfz.b.a;
    }

    @Override // xsna.osr0
    public final void W5() {
        View view = this.itemView;
        bwt0.Q(view, view.getId(), null);
        this.J = null;
        this.K = null;
        this.L = null;
        this.m.r();
        ev9 ev9Var = this.M;
        if (ev9Var != null) {
            ev9Var.a(this);
        }
        this.M = null;
        f5v f5vVar = this.N;
        if (f5vVar != null) {
            f5vVar.a(this);
        }
        this.N = null;
        fmm fmmVar = this.O;
        if (fmmVar != null) {
            fmmVar.a(this);
        }
        this.O = null;
        i6();
    }

    @Override // xsna.fmm.a
    public final void Y1() {
        f fVar = this.p;
        CharSequence charSequence = fVar.K;
        CharSequence charSequence2 = fVar.L;
        CharSequence charSequence3 = fVar.M;
        fmm fmmVar = fVar.P;
        String str = null;
        if (fmmVar != null) {
            boolean z = fVar.r;
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = fVar.k;
            str = fmmVar.b(z, cVar != null ? Integer.valueOf(cVar.c) : null);
        }
        if (str == null) {
            str = "";
        }
        j6(charSequence, charSequence2, charSequence3, str, this.p.N);
    }

    @Override // xsna.rk30.a
    public final boolean Z4() {
        f fVar = this.p;
        utr0 utr0Var = fVar.p;
        if (utr0Var != null) {
            return utr0Var.a(fVar);
        }
        return false;
    }

    @Override // xsna.ev9.a
    public final void a2(Msg msg, int i) {
        f fVar = this.p;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = fVar.k;
        if (cVar != null && cVar.c == msg.d && fVar.b0()) {
            hr30<Attach, ir30> hr30Var = this.m;
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.c cVar2 = hr30Var instanceof com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.c ? (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.c) hr30Var : null;
            if (cVar2 != null) {
                RecyclerView recyclerView = cVar2.g;
                (recyclerView != null ? recyclerView : null).smoothScrollToPosition(i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x03d4, code lost:
    
        if ((r2 != null ? r2.b0() : false) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c7, code lost:
    
        if ((r14 != null ? r14.I : false) == true) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0339 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b4  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a6(f fVar) {
        oh30 oh30Var;
        oh30 oh30Var2;
        boolean z;
        Rect rect;
        int i;
        AdapterEntryType adapterEntryType;
        boolean z2;
        c.C1166c c1166c;
        fmm fmmVar;
        String str;
        boolean z3;
        ImageView imageView;
        int i2;
        int a;
        AdapterEntryType adapterEntryType2;
        AdapterEntryType adapterEntryType3;
        Rect rect2 = this.F;
        Rect rect3 = this.G;
        rect3.set(rect2);
        Rect rect4 = this.H;
        rect4.setEmpty();
        boolean z4 = fVar.C;
        utr0 utr0Var = fVar.p;
        AdapterEntryType adapterEntryType4 = fVar.b;
        boolean z5 = fVar.z;
        boolean z6 = fVar.g;
        boolean z7 = fVar.q;
        boolean z8 = fVar.r;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = fVar.k;
        oh30 oh30Var3 = fVar.f;
        int i3 = z4 ? 8388613 : 8388611;
        FluidHorizontalLayout fluidHorizontalLayout = this.s;
        fluidHorizontalLayout.setOrder(z4 ? 1 : 0);
        fluidHorizontalLayout.setGravity(i3);
        boolean P = fVar.P();
        MsgBubbleView msgBubbleView = this.r;
        ((FluidHorizontalLayout.a) msgBubbleView.getLayoutParams()).b = P;
        boolean b0 = this.p.b0();
        FrameLayout frameLayout = this.u;
        Space space = this.w;
        Space space2 = this.t;
        ImAvatarView imAvatarView = this.q;
        if (b0) {
            imAvatarView.s1(null);
            imAvatarView.setVisibility(8);
            space2.setVisibility(8);
            space.setVisibility(8);
            frameLayout.setVisibility(8);
            i6();
            fluidHorizontalLayout.setPaddingRelative(0, 0, 0, 0);
            oh30 oh30Var4 = oh30.l;
            msgBubbleView.b(oh30.a.a(z8), h6(fVar), fVar.b(), z7);
            msgBubbleView.setClipToPadding(false);
            msgBubbleView.setClipChildren(false);
            msgBubbleView.setFwdNestLevel(0);
            msgBubbleView.i.set(0, 0, 0, 0);
            msgBubbleView.requestLayout();
            msgBubbleView.invalidate();
            msgBubbleView.setMaximumWidth(Integer.MAX_VALUE);
        } else {
            Object[] objArr = (oh30Var3 == null || oh30Var3.f) ? false : true;
            Object[] objArr2 = fVar.I() || fVar.J() || (fVar.x0() || fVar.P0()) == true;
            if (objArr == true && objArr2 != true && z7) {
                oh30 oh30Var5 = oh30.l;
                oh30Var = z8 ? oh30.o : oh30.p;
            } else {
                oh30Var = oh30Var3;
            }
            if (oh30Var != null) {
                oh30Var2 = new oh30(oh30Var.b, oh30Var.c, oh30Var.d, oh30Var.e, oh30Var.f, oh30Var.g, oh30Var.h, oh30Var.i, objArr == true && fVar.H, fVar.R != null ? !r10.i : false);
            } else {
                oh30Var2 = null;
            }
            msgBubbleView.b(oh30Var2, h6(fVar), fVar.b(), z7);
            msgBubbleView.setFwdNestLineColor((dhr0.M() ? fVar.m : fVar.n).o);
            qtd0 qtd0Var = fVar.D;
            if (z6) {
                int y = bwt0.y(R.dimen.vkim_chat_message_avatar_container_size, imAvatarView);
                bwt0.m0(y, y, imAvatarView);
                imAvatarView.s1(qtd0Var);
                imAvatarView.setVisibility(0);
                space2.setVisibility(8);
                Rect bubbleDrawablePadding = msgBubbleView.getBubbleDrawablePadding();
                rect3.left -= iah0.a(2);
                bwt0.e0(imAvatarView, 0, 0, 0, bubbleDrawablePadding.bottom);
                if (qv20.k(qtd0Var)) {
                    ImAvatarView.x1(imAvatarView, dhr0.t.a(R.drawable.ic_cake_circle_fill_purple_composite_16));
                } else {
                    ImAvatarView.x1(imAvatarView, null);
                }
            } else {
                imAvatarView.s1(null);
                imAvatarView.setVisibility(8);
                space2.setVisibility(8);
            }
            f5v f5vVar = fVar.O;
            if (f5vVar != null) {
                z = f5vVar.c(cVar != null ? Integer.valueOf(cVar.c) : null, cVar != null ? Integer.valueOf(cVar.b) : null);
            } else {
                z = false;
            }
            l6(z);
            boolean z9 = fVar.F;
            boolean z10 = fVar.B;
            ImageView imageView2 = this.v;
            if (z9) {
                abi0 abi0Var = fVar.Q;
                if (!(abi0Var != null ? abi0Var.b() : false)) {
                    f4m.j(space);
                    frameLayout.setVisibility(0);
                    imageView2.setVisibility(0);
                    m6(z10, fVar);
                    int i4 = fVar.d;
                    fluidHorizontalLayout.setPaddingRelative(z6 ? ((Number) this.B.getValue()).intValue() : ((Number) this.A.getValue()).intValue(), 0, 0, 0);
                    Context context = msgBubbleView.getContext();
                    rect = this.C;
                    rect.setEmpty();
                    if (fVar.d()) {
                        rect.left = e3m.d(R.attr.im_history_fwd_padding_start, context);
                    }
                    if (!fVar.g()) {
                        rect.top = e3m.d(R.attr.im_history_fwd_padding_top, context);
                    }
                    if (!fVar.f() && z5 && fVar.d()) {
                        rect.bottom = iah0.a(8);
                    }
                    msgBubbleView.setFwdNestLevel(i4);
                    VhStyle a2 = mvr0.a(adapterEntryType4);
                    int[] iArr = fVar.d() ? p490.g[a2.index] : p490.f[a2.index];
                    int a3 = iah0.a(iArr[0]);
                    int a4 = iah0.a(iArr[1]);
                    int a5 = iah0.a(iArr[2]);
                    int a6 = iah0.a(iArr[3]);
                    Rect rect5 = this.E;
                    rect5.set(a3, a4, a5, a6);
                    int i5 = rect5.left;
                    int i6 = rect5.right;
                    int i7 = rect5.top;
                    if (fVar.g()) {
                        if (!fVar.y0()) {
                            if (cVar != null) {
                                c.C1166c c1166c2 = cVar.D;
                            }
                            i7 = 0;
                        }
                        utr0 utr0Var2 = fVar.o;
                        if ((utr0Var2 != null ? utr0Var2.c : 0) > i4) {
                            if (utr0Var2 == null || (adapterEntryType3 = utr0Var2.b) == null) {
                                adapterEntryType3 = AdapterEntryType.TYPE_UNKNOWN;
                            }
                            i7 = p490.p(mvr0.a(adapterEntryType3), a2, false);
                        }
                    }
                    int i8 = rect5.bottom;
                    if (fVar.f()) {
                        if (i4 == (utr0Var != null ? utr0Var.c : 0)) {
                            if (utr0Var == null || (adapterEntryType2 = utr0Var.b) == null) {
                                adapterEntryType2 = AdapterEntryType.TYPE_UNKNOWN;
                            }
                            i = p490.p(a2, mvr0.a(adapterEntryType2), true);
                            if (!fVar.f() && z5) {
                                if (!fVar.l0()) {
                                    a = iah0.a(4);
                                } else if (fVar.d()) {
                                    a = iah0.a(8);
                                }
                                i += a;
                            }
                            if (fVar.g() && fVar.h()) {
                                float f = 4;
                                i5 = iah0.a(f);
                                i7 = iah0.a(f);
                                i6 = iah0.a(f);
                                i = iah0.a(f);
                            }
                            if (fVar.g() && fVar.F0()) {
                                float f2 = 8;
                                i5 = iah0.a(f2);
                                float f3 = 0;
                                i7 = iah0.a(f3);
                                int a7 = iah0.a(f2);
                                int a8 = iah0.a(f3);
                                i6 = a7;
                                i = a8;
                            }
                            Rect rect6 = this.D;
                            rect6.set(i5, i7, i6, i);
                            msgBubbleView.setFwdPadding(rect);
                            msgBubbleView.setContentPadding(rect6);
                            if (!fVar.t) {
                                if (oh30Var3 != null && !oh30Var3.f) {
                                    if (!((cVar == null || (c1166c = cVar.D) == null) ? false : c1166c.m) || !fVar.N()) {
                                        if (!fVar.g()) {
                                            if (fVar.f()) {
                                            }
                                        }
                                    }
                                }
                                z2 = false;
                                msgBubbleView.setContentFitAllWidth(z2);
                                msgBubbleView.setMaximumWidth(fVar.s);
                                CharSequence charSequence = fVar.K;
                                CharSequence charSequence2 = fVar.L;
                                CharSequence charSequence3 = fVar.M;
                                fmmVar = fVar.P;
                                if (fmmVar == null) {
                                    str = fmmVar.b(z8, cVar != null ? Integer.valueOf(cVar.c) : null);
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                j6(charSequence, charSequence2, charSequence3, str, fVar.N);
                                if (cVar != null || (cVar.l && !cVar.p)) {
                                    i6();
                                } else {
                                    g6().setStateListener(null);
                                    boolean z11 = fVar.C;
                                    if (this.x.isInitialized()) {
                                        g6().setBombGravity(z11 ? 8388693 : 8388691);
                                    }
                                    BombView g6 = g6();
                                    ViewGroup.LayoutParams layoutParams = g6.getLayoutParams();
                                    if (layoutParams == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.vk.core.tool.view.FluidHorizontalLayout.LayoutParams");
                                    }
                                    FluidHorizontalLayout.a aVar = (FluidHorizontalLayout.a) layoutParams;
                                    aVar.b = true;
                                    g6.setLayoutParams(aVar);
                                    g6().setVisibility(fVar.f() ? 4 : 0);
                                    if (!fVar.f()) {
                                        BombView g62 = g6();
                                        long j = cVar.h;
                                        Long l = cVar.f;
                                        if (l == null) {
                                            l = cVar.g;
                                        }
                                        g62.d(j, l, cVar.i);
                                        if (z5) {
                                            int currentState = g6().getCurrentState();
                                            if (!(currentState == 2 || currentState == 3)) {
                                                g6().setVisibility(4);
                                            }
                                            g6().setStateListener((BombView.c) this.P.getValue());
                                        }
                                    }
                                    int a9 = iah0.a(-12);
                                    int a10 = iah0.a(4);
                                    if (oh30Var3 != null) {
                                        i2 = 1;
                                        if (oh30Var3.f) {
                                            a9 = iah0.a(-4);
                                            bwt0.e0(g6(), a9, 0, 0, a10);
                                        }
                                    } else {
                                        i2 = 1;
                                    }
                                    int i9 = C1168a.$EnumSwitchMapping$1[mvr0.a(adapterEntryType4).ordinal()];
                                    a10 = i9 != i2 ? i9 != 2 ? iah0.a(6) : iah0.a(9) : iah0.a(12);
                                    bwt0.e0(g6(), a9, 0, 0, a10);
                                }
                                z3 = fVar.G;
                                ?? r2 = this.y;
                                if (!z3) {
                                    ImageView imageView3 = (ImageView) r2.getValue();
                                    if (imageView3 != null) {
                                        imageView3.setImageDrawable((Drawable) this.S.getValue());
                                    }
                                    ImageView imageView4 = (ImageView) r2.getValue();
                                    if (imageView4 != null) {
                                        bwt0.i0(imageView4, new xzk0(7, fVar, this));
                                    }
                                    ImageView imageView5 = (ImageView) r2.getValue();
                                    if (imageView5 != null) {
                                        bwt0.p0(imageView5, true);
                                    }
                                } else if (r2.isInitialized() && (imageView = (ImageView) r2.getValue()) != null) {
                                    bwt0.p0(imageView, false);
                                }
                            }
                            z2 = true;
                            msgBubbleView.setContentFitAllWidth(z2);
                            msgBubbleView.setMaximumWidth(fVar.s);
                            CharSequence charSequence4 = fVar.K;
                            CharSequence charSequence22 = fVar.L;
                            CharSequence charSequence32 = fVar.M;
                            fmmVar = fVar.P;
                            if (fmmVar == null) {
                            }
                            if (str == null) {
                            }
                            j6(charSequence4, charSequence22, charSequence32, str, fVar.N);
                            if (cVar != null) {
                            }
                            i6();
                            z3 = fVar.G;
                            ?? r22 = this.y;
                            if (!z3) {
                            }
                        }
                    }
                    if (fVar.f()) {
                        if (i4 < (utr0Var != null ? utr0Var.c : 0)) {
                            if (utr0Var == null || (adapterEntryType = utr0Var.b) == null) {
                                adapterEntryType = AdapterEntryType.TYPE_UNKNOWN;
                            }
                            i = p490.p(a2, mvr0.a(adapterEntryType), false);
                            if (!fVar.f()) {
                                if (!fVar.l0()) {
                                }
                                i += a;
                            }
                            if (fVar.g()) {
                                float f4 = 4;
                                i5 = iah0.a(f4);
                                i7 = iah0.a(f4);
                                i6 = iah0.a(f4);
                                i = iah0.a(f4);
                            }
                            if (fVar.g()) {
                                float f22 = 8;
                                i5 = iah0.a(f22);
                                float f32 = 0;
                                i7 = iah0.a(f32);
                                int a72 = iah0.a(f22);
                                int a82 = iah0.a(f32);
                                i6 = a72;
                                i = a82;
                            }
                            Rect rect62 = this.D;
                            rect62.set(i5, i7, i6, i);
                            msgBubbleView.setFwdPadding(rect);
                            msgBubbleView.setContentPadding(rect62);
                            if (!fVar.t) {
                            }
                            z2 = true;
                            msgBubbleView.setContentFitAllWidth(z2);
                            msgBubbleView.setMaximumWidth(fVar.s);
                            CharSequence charSequence42 = fVar.K;
                            CharSequence charSequence222 = fVar.L;
                            CharSequence charSequence322 = fVar.M;
                            fmmVar = fVar.P;
                            if (fmmVar == null) {
                            }
                            if (str == null) {
                            }
                            j6(charSequence42, charSequence222, charSequence322, str, fVar.N);
                            if (cVar != null) {
                            }
                            i6();
                            z3 = fVar.G;
                            ?? r222 = this.y;
                            if (!z3) {
                            }
                        }
                    }
                    i = fVar.f() ? 0 : i8;
                    if (!fVar.f()) {
                    }
                    if (fVar.g()) {
                    }
                    if (fVar.g()) {
                    }
                    Rect rect622 = this.D;
                    rect622.set(i5, i7, i6, i);
                    msgBubbleView.setFwdPadding(rect);
                    msgBubbleView.setContentPadding(rect622);
                    if (!fVar.t) {
                    }
                    z2 = true;
                    msgBubbleView.setContentFitAllWidth(z2);
                    msgBubbleView.setMaximumWidth(fVar.s);
                    CharSequence charSequence422 = fVar.K;
                    CharSequence charSequence2222 = fVar.L;
                    CharSequence charSequence3222 = fVar.M;
                    fmmVar = fVar.P;
                    if (fmmVar == null) {
                    }
                    if (str == null) {
                    }
                    j6(charSequence422, charSequence2222, charSequence3222, str, fVar.N);
                    if (cVar != null) {
                    }
                    i6();
                    z3 = fVar.G;
                    ?? r2222 = this.y;
                    if (!z3) {
                    }
                }
            }
            if (fVar.A) {
                if (cVar != null ? cVar.m : false) {
                    boolean f5 = this.p.f();
                    boolean z12 = !f5;
                    if (!f5) {
                        m6(z10, fVar);
                    }
                    f4m.j(space);
                    bwt0.p0(frameLayout, z12);
                    bwt0.p0(imageView2, z12);
                    int i42 = fVar.d;
                    fluidHorizontalLayout.setPaddingRelative(z6 ? ((Number) this.B.getValue()).intValue() : ((Number) this.A.getValue()).intValue(), 0, 0, 0);
                    Context context2 = msgBubbleView.getContext();
                    rect = this.C;
                    rect.setEmpty();
                    if (fVar.d()) {
                    }
                    if (!fVar.g()) {
                    }
                    if (!fVar.f()) {
                        rect.bottom = iah0.a(8);
                    }
                    msgBubbleView.setFwdNestLevel(i42);
                    VhStyle a22 = mvr0.a(adapterEntryType4);
                    if (fVar.d()) {
                    }
                    int a32 = iah0.a(iArr[0]);
                    int a42 = iah0.a(iArr[1]);
                    int a52 = iah0.a(iArr[2]);
                    int a62 = iah0.a(iArr[3]);
                    Rect rect52 = this.E;
                    rect52.set(a32, a42, a52, a62);
                    int i52 = rect52.left;
                    int i62 = rect52.right;
                    int i72 = rect52.top;
                    if (fVar.g()) {
                    }
                    int i82 = rect52.bottom;
                    if (fVar.f()) {
                    }
                    if (fVar.f()) {
                    }
                    if (fVar.f()) {
                    }
                    if (!fVar.f()) {
                    }
                    if (fVar.g()) {
                    }
                    if (fVar.g()) {
                    }
                    Rect rect6222 = this.D;
                    rect6222.set(i52, i72, i62, i);
                    msgBubbleView.setFwdPadding(rect);
                    msgBubbleView.setContentPadding(rect6222);
                    if (!fVar.t) {
                    }
                    z2 = true;
                    msgBubbleView.setContentFitAllWidth(z2);
                    msgBubbleView.setMaximumWidth(fVar.s);
                    CharSequence charSequence4222 = fVar.K;
                    CharSequence charSequence22222 = fVar.L;
                    CharSequence charSequence32222 = fVar.M;
                    fmmVar = fVar.P;
                    if (fmmVar == null) {
                    }
                    if (str == null) {
                    }
                    j6(charSequence4222, charSequence22222, charSequence32222, str, fVar.N);
                    if (cVar != null) {
                    }
                    i6();
                    z3 = fVar.G;
                    ?? r22222 = this.y;
                    if (!z3) {
                    }
                }
            }
            space.setVisibility(0);
            f4m.j(frameLayout);
            f4m.j(imageView2);
            int i422 = fVar.d;
            fluidHorizontalLayout.setPaddingRelative(z6 ? ((Number) this.B.getValue()).intValue() : ((Number) this.A.getValue()).intValue(), 0, 0, 0);
            Context context22 = msgBubbleView.getContext();
            rect = this.C;
            rect.setEmpty();
            if (fVar.d()) {
            }
            if (!fVar.g()) {
            }
            if (!fVar.f()) {
            }
            msgBubbleView.setFwdNestLevel(i422);
            VhStyle a222 = mvr0.a(adapterEntryType4);
            if (fVar.d()) {
            }
            int a322 = iah0.a(iArr[0]);
            int a422 = iah0.a(iArr[1]);
            int a522 = iah0.a(iArr[2]);
            int a622 = iah0.a(iArr[3]);
            Rect rect522 = this.E;
            rect522.set(a322, a422, a522, a622);
            int i522 = rect522.left;
            int i622 = rect522.right;
            int i722 = rect522.top;
            if (fVar.g()) {
            }
            int i822 = rect522.bottom;
            if (fVar.f()) {
            }
            if (fVar.f()) {
            }
            if (fVar.f()) {
            }
            if (!fVar.f()) {
            }
            if (fVar.g()) {
            }
            if (fVar.g()) {
            }
            Rect rect62222 = this.D;
            rect62222.set(i522, i722, i622, i);
            msgBubbleView.setFwdPadding(rect);
            msgBubbleView.setContentPadding(rect62222);
            if (!fVar.t) {
            }
            z2 = true;
            msgBubbleView.setContentFitAllWidth(z2);
            msgBubbleView.setMaximumWidth(fVar.s);
            CharSequence charSequence42222 = fVar.K;
            CharSequence charSequence222222 = fVar.L;
            CharSequence charSequence322222 = fVar.M;
            fmmVar = fVar.P;
            if (fmmVar == null) {
            }
            if (str == null) {
            }
            j6(charSequence42222, charSequence222222, charSequence322222, str, fVar.N);
            if (cVar != null) {
            }
            i6();
            z3 = fVar.G;
            ?? r222222 = this.y;
            if (!z3) {
            }
        }
        bwt0.e0(msgBubbleView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        msgBubbleView.setBackgroundMargin(rect4);
    }

    @Override // xsna.rk30.a
    public final int b3() {
        return this.p.c();
    }

    public final void b6(ir30 ir30Var) {
        if (ir30Var == null) {
            return;
        }
        boolean z = ir30Var instanceof nl8;
        int i = this.z;
        if (z) {
            ((nl8) ir30Var).Z(i);
        }
        if (ir30Var instanceof bs30) {
            wp10 wp10Var = ((bs30) ir30Var).c;
            if (wp10Var instanceof nl8) {
                ((nl8) wp10Var).Z(i);
            }
        }
        this.m.p(ir30Var, this.J, this.K, this.L);
    }

    @Override // xsna.rk30.a
    public final AdapterEntryType c2() {
        utr0 utr0Var = this.p.o;
        if (utr0Var != null) {
            return utr0Var.b;
        }
        return null;
    }

    @Override // xsna.rk30.a
    public final AdapterEntryType c5() {
        utr0 utr0Var = this.p.p;
        if (utr0Var != null) {
            return utr0Var.b;
        }
        return null;
    }

    @Override // xsna.xtr0
    public final ImAvatarView d2() {
        return this.q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final BombView g6() {
        return (BombView) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void i6() {
        if (this.x.isInitialized()) {
            g6().setStateListener(null);
            g6().setVisibility(8);
        }
    }

    @Override // xsna.lmn0.b
    public final int id() {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = this.p.k;
        if (cVar != null) {
            return cVar.b;
        }
        return 0;
    }

    public final void j6(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str, boolean z) {
        this.q.setContentDescription(charSequence);
        MsgBubbleView msgBubbleView = this.r;
        if (z) {
            msgBubbleView.setImportantForAccessibility(2);
            return;
        }
        StringBuilder sb = this.I;
        sb.setLength(0);
        sb.append(charSequence);
        sb.append(". ");
        if (!drm0.N(charSequence3)) {
            sb.append(charSequence3);
            sb.append(". ");
        }
        sb.append(charSequence2);
        sb.append(". ");
        sb.append((CharSequence) str);
        msgBubbleView.setContentDescription(sb);
    }

    public final void l6(boolean z) {
        ColorDrawable colorDrawable;
        View view = this.itemView;
        if (z) {
            bwt0.Q(view, view.getId(), Boolean.TRUE);
            colorDrawable = new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_secondary_alpha_active));
        } else {
            colorDrawable = null;
        }
        view.setBackground(colorDrawable);
    }

    @Override // xsna.ypf0
    public final MsgRegionImageMask m3() {
        f fVar = this.p;
        if (!fVar.q) {
            return null;
        }
        int i = C1168a.$EnumSwitchMapping$0[h6(fVar).ordinal()];
        if (i == 1) {
            return MsgRegionImageMask.FULL;
        }
        if (i == 2) {
            return MsgRegionImageMask.TOP;
        }
        if (i == 3) {
            return MsgRegionImageMask.MIDDLE;
        }
        if (i == 4) {
            return MsgRegionImageMask.BOTTOM;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0073, code lost:
    
        if (r12 == null) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6(boolean z, f fVar) {
        Rect rect;
        VkOnboardingComponent vkOnboardingComponent;
        ?? r0 = this.R;
        ?? r1 = this.Q;
        if (z) {
            Drawable drawable = (Drawable) r1.getValue();
            abg0 abg0Var = dhr0.t;
            drawable.setTint(abg0Var.c(R.attr.vk_ui_icon_contrast));
            ((Drawable) r0.getValue()).setTint(abg0Var.c(R.attr.vk_ui_icon_tertiary_alpha));
        } else {
            ((Drawable) r1.getValue()).setTint(dhr0.t.c(R.attr.vk_ui_icon_secondary));
            ((Drawable) r0.getValue()).setTint(fVar.b());
        }
        Drawable drawable2 = (Drawable) r0.getValue();
        ImageView imageView = this.v;
        imageView.setBackground(drawable2);
        imageView.setImageDrawable((Drawable) r1.getValue());
        oh30 oh30Var = fVar.f;
        if (oh30Var != null) {
            ll8 ll8Var = oh30Var.c;
            rect = oh30Var.f ? ll8Var.j(MsgBubblePart.BOTTOM) : ll8Var.e(MsgBubblePart.BOTTOM);
        }
        rect = new Rect();
        f4m.u(imageView, cn70.b(4) - rect.right, 0, 0, rect.bottom);
        h7j0 h7j0Var = fVar.I;
        if (h7j0Var == null || (vkOnboardingComponent = this.o) == null) {
            return;
        }
        q7v0 p3 = vkOnboardingComponent.p3();
        VkOnboardingCampaign vkOnboardingCampaign = h7j0Var.b;
        if (p3.b(vkOnboardingCampaign, false)) {
            ImageView imageView2 = this.v;
            bwt0.j(imageView2, new ezp(imageView2, h7j0Var, vkOnboardingComponent, p3, vkOnboardingCampaign, this, 1));
        }
    }

    @Override // xsna.ypf0
    public final sho o4() {
        if (this.p.e()) {
            return this.r;
        }
        return null;
    }

    @Override // xsna.rk30.a
    public final boolean q4() {
        f fVar = this.p;
        utr0 utr0Var = fVar.o;
        if (utr0Var != null) {
            return utr0Var.a(fVar);
        }
        return false;
    }

    @Override // xsna.chr
    public final View s5(int i) {
        return this.m.n(i);
    }

    @Override // xsna.lmn0.b
    public final boolean u3() {
        return this.p.w;
    }

    @Override // xsna.chr
    public final Collection<Integer> v(String str) {
        return this.m.v(str);
    }
}

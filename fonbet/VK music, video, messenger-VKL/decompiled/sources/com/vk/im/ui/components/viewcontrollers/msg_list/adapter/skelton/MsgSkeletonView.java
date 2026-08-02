package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonItemInfo;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import xsna.b6g;
import xsna.bpn0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fmm;
import xsna.hh6;
import xsna.j5g;
import xsna.k7z;
import xsna.k9x;
import xsna.mgl;
import xsna.ml8;
import xsna.oh30;
import xsna.p00;
import xsna.qz9;
import xsna.swe0;
import xsna.tf3;
import xsna.tvj;
import xsna.uog;
import xsna.wjl;
import xsna.wz30;
import xsna.wzs;
import xsna.zn;

/* compiled from: MsgSkeletonView.kt */
/* loaded from: classes2.dex */
public final class MsgSkeletonView extends hh6 {
    public wz30 c;
    public final ShimmerFrameLayout d;
    public final a e;
    public final Shimmer f;

    /* compiled from: MsgSkeletonView.kt */
    public final class a extends FrameLayout {
        public final b b;

        public a(Context context) {
            super(context);
            RecyclerView recyclerView = new RecyclerView(context);
            b bVar = MsgSkeletonView.this.new b();
            this.b = bVar;
            recyclerView.setAdapter(bVar);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.setReverseLayout(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        }

        public final ArrayList a(Random random, int i, wzs wzsVar) {
            Random random2;
            int n;
            int i2;
            int i3;
            boolean z;
            int i4;
            Rect rect;
            boolean z2;
            ArrayList arrayList = new ArrayList();
            MsgSkeletonView msgSkeletonView = MsgSkeletonView.this;
            Long l = msgSkeletonView.getSkeletonConfig().b;
            wz30 skeletonConfig = msgSkeletonView.getSkeletonConfig();
            Long l2 = skeletonConfig.b;
            long j = skeletonConfig.h.b;
            int i5 = 1;
            boolean z3 = l2 != null && l2.longValue() == j;
            boolean z4 = l == null;
            boolean z5 = l != null && l.longValue() > 2000000000;
            fmm dialogUnreadMsgMediator = msgSkeletonView.getDialogUnreadMsgMediator();
            int d = dialogUnreadMsgMediator != null ? dialogUnreadMsgMediator.d() : 0;
            int i6 = msgSkeletonView.getSkeletonConfig().d * msgSkeletonView.getSkeletonConfig().e;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = i - i7;
                boolean d2 = random.d();
                if (i11 >= i6 || i11 <= msgSkeletonView.getSkeletonConfig().d) {
                    if (z4 && d2) {
                        n = msgSkeletonView.getSkeletonConfig().e * 2;
                    } else if (z4) {
                        n = msgSkeletonView.getSkeletonConfig().e;
                    } else {
                        random2 = random;
                        n = swe0.n(new k9x(i5, msgSkeletonView.getSkeletonConfig().e, i5), random2);
                    }
                    random2 = random;
                } else {
                    random2 = random;
                    n = i5;
                }
                int i12 = msgSkeletonView.getSkeletonConfig().d * n;
                float max = (n <= 1 && !z4) ? Math.max(random2.i(), 0.2f) : 1.0f;
                if (z3) {
                    i2 = d;
                    i4 = i8;
                    i3 = i9;
                    z = false;
                } else if (z4) {
                    i2 = d;
                    i4 = i8;
                    i3 = i9;
                    z = true;
                } else {
                    if (i8 < msgSkeletonView.getSkeletonConfig().f || d <= 0) {
                        if (i8 >= msgSkeletonView.getSkeletonConfig().f) {
                            i2 = d;
                            i3 = i9 + 1;
                            z = false;
                        } else {
                            if (i9 >= msgSkeletonView.getSkeletonConfig().g) {
                                i2 = d - 1;
                                i4 = i8 + 1;
                                z = true;
                            } else if (d > 0) {
                                d--;
                            } else if (d2) {
                                i2 = d - 1;
                                i4 = i8 + 1;
                                z = d2;
                            } else {
                                i2 = d;
                                i3 = i9 + 1;
                                z = d2;
                            }
                            i3 = 0;
                        }
                        i4 = 0;
                    }
                    i2 = d;
                    z = true;
                    i4 = 1;
                    i3 = 0;
                }
                MsgSkeletonItemInfo msgSkeletonItemInfo = (MsgSkeletonItemInfo) j5g.k0(arrayList);
                MsgSkeletonItemInfo.AvatarState avatarState = (z5 && z) ? (msgSkeletonItemInfo == null || ((z2 = msgSkeletonItemInfo.c) && !d2) || !z2) ? MsgSkeletonItemInfo.AvatarState.VISIBLE : MsgSkeletonItemInfo.AvatarState.INVISIBLE : MsgSkeletonItemInfo.AvatarState.GONE;
                if (z) {
                    int i13 = mgl.a.$EnumSwitchMapping$0[MsgBubblePart.FULL.ordinal()];
                    if (i13 == 1) {
                        rect = ml8.a;
                    } else if (i13 == 2) {
                        rect = ml8.b;
                    } else if (i13 == 3) {
                        rect = ml8.c;
                    } else {
                        if (i13 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rect = ml8.d;
                    }
                } else {
                    int i14 = wjl.a.$EnumSwitchMapping$0[MsgBubblePart.FULL.ordinal()];
                    if (i14 == 1) {
                        rect = ml8.e;
                    } else if (i14 == 2) {
                        rect = ml8.f;
                    } else if (i14 == 3) {
                        rect = ml8.g;
                    } else {
                        if (i14 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rect = ml8.h;
                    }
                }
                int i15 = rect.top + i12 + rect.bottom + i7;
                int i16 = i10 + 1;
                if (!((Boolean) wzsVar.invoke(Integer.valueOf(i10), Integer.valueOf(i15))).booleanValue()) {
                    return arrayList;
                }
                arrayList.add(new MsgSkeletonItemInfo(max, i12, z, z4, avatarState));
                d = i2;
                i7 = i15;
                i10 = i16;
                i8 = i4;
                i9 = i3;
                i5 = 1;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            ArrayList a;
            int mode = View.MeasureSpec.getMode(i2);
            final int size = View.MeasureSpec.getSize(i2);
            MsgSkeletonView msgSkeletonView = MsgSkeletonView.this;
            Long l = msgSkeletonView.getSkeletonConfig().b;
            Random b = l != null ? qz9.b(l.longValue()) : Random.b;
            if (mode == 1073741824) {
                a = a(b, size, new wzs() { // from class: xsna.xz30
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj).intValue();
                        return Boolean.valueOf(((Integer) obj2).intValue() <= size);
                    }
                });
            } else {
                final int a2 = msgSkeletonView.a();
                if (a2 > 0) {
                    a = a(b, a2, new wzs() { // from class: xsna.yz30
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj).intValue();
                            return Boolean.valueOf(((Integer) obj2).intValue() <= a2);
                        }
                    });
                    if (a.isEmpty()) {
                        a = a(Random.b, 0, new p00(msgSkeletonView, 6));
                    }
                } else {
                    a = a(Random.b, 0, new uog(msgSkeletonView, 4));
                }
            }
            b bVar = this.b;
            if (!epx.f(bVar.c, a)) {
                bVar.c = a;
                bVar.notifyDataSetChanged();
            }
            super.onMeasure(i, i2);
        }
    }

    /* compiled from: MsgSkeletonView.kt */
    public final class b extends RecyclerView.Adapter<c> {
        public List<MsgSkeletonItemInfo> c = EmptyList.b;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(c cVar, int i) {
            c cVar2 = cVar;
            MsgSkeletonItemInfo msgSkeletonItemInfo = this.c.get(i);
            FluidHorizontalLayout fluidHorizontalLayout = cVar2.l;
            boolean z = msgSkeletonItemInfo.c;
            ImAvatarView imAvatarView = cVar2.m;
            MsgSkeletonItemInfo.AvatarState avatarState = msgSkeletonItemInfo.e;
            fluidHorizontalLayout.setPaddingRelative(avatarState != MsgSkeletonItemInfo.AvatarState.GONE ? ((Number) cVar2.r.getValue()).intValue() : ((Number) cVar2.q.getValue()).intValue(), 0, 0, 0);
            int i2 = c.b.$EnumSwitchMapping$0[avatarState.ordinal()];
            if (i2 == 1) {
                imAvatarView.setVisibility(0);
            } else if (i2 == 2) {
                imAvatarView.setVisibility(4);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f4m.j(imAvatarView);
            }
            int i3 = !z ? 1 : 0;
            int i4 = !z ? 8388613 : 8388611;
            fluidHorizontalLayout.setOrder(i3);
            fluidHorizontalLayout.setGravity(i4);
            View view = cVar2.p;
            MsgBubbleView msgBubbleView = cVar2.n;
            if (msgSkeletonItemInfo.d) {
                msgBubbleView.b(oh30.B, MsgBubblePart.FULL, -16711936, false);
                msgBubbleView.setMaximumWidth(e3m.a(R.dimen.msg_bubble_max_width, MsgSkeletonView.this.getContext()));
                msgBubbleView.setContentFitAllWidth(true);
                f4m.j(view);
            } else {
                oh30 oh30Var = oh30.l;
                msgBubbleView.b(oh30.a.b(z), MsgBubblePart.FULL, -16711936, false);
                msgBubbleView.setContentFitAllWidth(false);
                view.setVisibility(0);
            }
            c.a aVar = cVar2.o;
            aVar.setWidthPercent(msgSkeletonItemInfo.a);
            aVar.setContentHeight(msgSkeletonItemInfo.b);
            aVar.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return MsgSkeletonView.this.new c(tf3.b(viewGroup, R.layout.vkim_msg_list_item_msg_from_user, viewGroup, false));
        }
    }

    /* compiled from: MsgSkeletonView.kt */
    public final class c extends RecyclerView.e0 {
        public final FluidHorizontalLayout l;
        public final ImAvatarView m;
        public final MsgBubbleView n;
        public final a o;
        public final View p;
        public final bpn0 q;
        public final bpn0 r;

        /* compiled from: MsgSkeletonView.kt */
        public final class a extends View {
            public float b;
            public int c;

            public final int getContentHeight() {
                return this.c;
            }

            public final float getWidthPercent() {
                return this.b;
            }

            @Override // android.view.View
            public final void onMeasure(int i, int i2) {
                setMeasuredDimension((int) (View.MeasureSpec.getSize(i) * this.b), this.c);
            }

            public final void setContentHeight(int i) {
                this.c = i;
            }

            public final void setWidthPercent(float f) {
                this.b = f;
            }
        }

        /* compiled from: MsgSkeletonView.kt */
        public static final /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MsgSkeletonItemInfo.AvatarState.values().length];
                try {
                    iArr[MsgSkeletonItemInfo.AvatarState.VISIBLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MsgSkeletonItemInfo.AvatarState.INVISIBLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MsgSkeletonItemInfo.AvatarState.GONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c(View view) {
            super(view);
            this.l = (FluidHorizontalLayout) view.findViewById(R.id.fhl);
            ImAvatarView imAvatarView = (ImAvatarView) view.findViewById(R.id.avatar);
            this.m = imAvatarView;
            MsgBubbleView msgBubbleView = (MsgBubbleView) view.findViewById(R.id.bubble);
            this.n = msgBubbleView;
            a aVar = new a(view.getContext());
            this.o = aVar;
            this.p = this.itemView.findViewById(R.id.status_space);
            this.q = new bpn0(new tvj(this, 28));
            this.r = new bpn0(new k7z(this, 6));
            f4m.j(this.itemView.findViewById(R.id.vkim_incoming_share));
            f4m.j(this.itemView.findViewById(R.id.avatar_space));
            msgBubbleView.setContentView(aVar);
            ViewGroup.LayoutParams layoutParams = msgBubbleView.getLayoutParams();
            f4m.s((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) - cn70.b(2), msgBubbleView);
            imAvatarView.o1(new ImageList(null, 1, null), new ColorDrawable(-16777216));
        }
    }

    public MsgSkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.hh6
    public final void b() {
        this.d.d();
    }

    @Override // xsna.hh6
    public final void c() {
        this.d.e();
    }

    public final void d() {
        Pair pair = (getSkeletonConfig().a && dhr0.M()) ? new Pair(Integer.valueOf(getContext().getColor(R.color.vk_black_alpha35)), Integer.valueOf(getContext().getColor(R.color.vk_black_alpha12))) : getSkeletonConfig().a ? new Pair(Integer.valueOf(getContext().getColor(R.color.vk_white_alpha60)), Integer.valueOf(getContext().getColor(R.color.vk_white))) : new Pair(Integer.valueOf(b6g.a(R.attr.vk_ui_skeleton_from, getContext())), Integer.valueOf(b6g.a(R.attr.vk_ui_skeleton_to, getContext())));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        Shimmer shimmer = this.f;
        shimmer.e = intValue;
        shimmer.d = intValue2;
        shimmer.a();
    }

    @Override // xsna.hh6
    public wz30 getSkeletonConfig() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.b(this.f);
    }

    @Override // xsna.hh6
    public void setSkeletonConfig(wz30 wz30Var) {
        if (epx.f(this.c, wz30Var)) {
            return;
        }
        this.c = wz30Var;
        d();
        a aVar = this.e;
        aVar.forceLayout();
        aVar.getParent().requestLayout();
        invalidate();
    }

    public MsgSkeletonView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.c = new wz30(0);
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(context, null, 6);
        this.d = shimmerFrameLayout;
        a aVar = new a(context);
        this.e = aVar;
        this.f = ((Shimmer.c) ((Shimmer.c) ((Shimmer.c) zn.a(true)).i()).e(1200L).h()).a();
        d();
        shimmerFrameLayout.addView(aVar, new FrameLayout.LayoutParams(-1, -1));
        addView(shimmerFrameLayout, new FrameLayout.LayoutParams(-1, -1));
    }
}

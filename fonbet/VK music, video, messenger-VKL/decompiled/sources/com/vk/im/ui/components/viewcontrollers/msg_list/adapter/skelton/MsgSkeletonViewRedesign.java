package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonItemInfo;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import xsna.a040;
import xsna.b6g;
import xsna.bpn0;
import xsna.cn70;
import xsna.dhr0;
import xsna.epx;
import xsna.f4m;
import xsna.fmm;
import xsna.hh6;
import xsna.j5g;
import xsna.k9x;
import xsna.kqu0;
import xsna.mgl;
import xsna.ml8;
import xsna.p3l;
import xsna.p6y;
import xsna.qz9;
import xsna.swe0;
import xsna.tf3;
import xsna.v95;
import xsna.vc2;
import xsna.w1;
import xsna.wjl;
import xsna.wz30;
import xsna.wzs;

/* compiled from: MsgSkeletonViewRedesign.kt */
/* loaded from: classes2.dex */
public final class MsgSkeletonViewRedesign extends hh6 {
    public wz30 c;
    public final a d;
    public ThemableShimmer e;

    /* compiled from: MsgSkeletonViewRedesign.kt */
    public final class a extends FrameLayout {
        public final b b;
        public ArrayList c;
        public int d;

        public a(Context context) {
            super(context);
            RecyclerView recyclerView = new RecyclerView(context);
            b bVar = MsgSkeletonViewRedesign.this.new b();
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
            MsgSkeletonViewRedesign msgSkeletonViewRedesign = MsgSkeletonViewRedesign.this;
            Long l = msgSkeletonViewRedesign.getSkeletonConfig().b;
            wz30 skeletonConfig = msgSkeletonViewRedesign.getSkeletonConfig();
            Long l2 = skeletonConfig.b;
            long j = skeletonConfig.h.b;
            int i5 = 1;
            boolean z3 = l2 != null && l2.longValue() == j;
            boolean z4 = l == null;
            boolean z5 = l != null && l.longValue() > 2000000000;
            fmm dialogUnreadMsgMediator = msgSkeletonViewRedesign.getDialogUnreadMsgMediator();
            int d = dialogUnreadMsgMediator != null ? dialogUnreadMsgMediator.d() : 0;
            int i6 = msgSkeletonViewRedesign.getSkeletonConfig().d * msgSkeletonViewRedesign.getSkeletonConfig().e;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = i - i7;
                boolean d2 = random.d();
                if (i11 >= i6 || i11 <= msgSkeletonViewRedesign.getSkeletonConfig().d) {
                    if (z4 && d2) {
                        n = msgSkeletonViewRedesign.getSkeletonConfig().e * 2;
                    } else if (z4) {
                        n = msgSkeletonViewRedesign.getSkeletonConfig().e;
                    } else {
                        random2 = random;
                        n = swe0.n(new k9x(i5, msgSkeletonViewRedesign.getSkeletonConfig().e, i5), random2);
                    }
                    random2 = random;
                } else {
                    random2 = random;
                    n = i5;
                }
                int i12 = msgSkeletonViewRedesign.getSkeletonConfig().d * n;
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
                    if (i8 < msgSkeletonViewRedesign.getSkeletonConfig().f || d <= 0) {
                        if (i8 >= msgSkeletonViewRedesign.getSkeletonConfig().f) {
                            i2 = d;
                            i3 = i9 + 1;
                            z = false;
                        } else {
                            if (i9 >= msgSkeletonViewRedesign.getSkeletonConfig().g) {
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
            MsgSkeletonViewRedesign msgSkeletonViewRedesign = MsgSkeletonViewRedesign.this;
            int hashCode = msgSkeletonViewRedesign.getSkeletonConfig().hashCode();
            ArrayList arrayList = this.c;
            b bVar = this.b;
            if (arrayList == null || this.d != hashCode) {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                Long l = msgSkeletonViewRedesign.getSkeletonConfig().b;
                Random b = l != null ? qz9.b(l.longValue()) : Random.b;
                if (mode == 1073741824) {
                    a = a(b, size, new p3l(size));
                } else {
                    final int a2 = msgSkeletonViewRedesign.a();
                    if (a2 > 0) {
                        ArrayList a3 = a(b, a2, new wzs() { // from class: xsna.zz30
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj).intValue();
                                return Boolean.valueOf(((Integer) obj2).intValue() <= a2);
                            }
                        });
                        a = a3.isEmpty() ? a(Random.b, 0, new v95(msgSkeletonViewRedesign, 5)) : a3;
                    } else {
                        a = a(Random.b, 0, new w1(msgSkeletonViewRedesign, 4));
                    }
                }
                if (!epx.f(bVar.c, a) && !epx.f(bVar.c, a)) {
                    bVar.c = a;
                    bVar.notifyDataSetChanged();
                }
                this.c = a;
                this.d = hashCode;
            } else if (!epx.f(bVar.c, arrayList)) {
                ArrayList arrayList2 = this.c;
                if (!epx.f(bVar.c, arrayList2)) {
                    bVar.c = arrayList2;
                    bVar.notifyDataSetChanged();
                }
            }
            super.onMeasure(i, i2);
        }
    }

    /* compiled from: MsgSkeletonViewRedesign.kt */
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
            MsgSkeletonViewRedesign msgSkeletonViewRedesign = MsgSkeletonViewRedesign.this;
            FluidHorizontalLayout fluidHorizontalLayout = cVar2.m;
            boolean z = msgSkeletonItemInfo.c;
            VkSkeleton vkSkeleton = cVar2.n;
            MsgSkeletonItemInfo.AvatarState avatarState = msgSkeletonItemInfo.e;
            fluidHorizontalLayout.setPaddingRelative(avatarState != MsgSkeletonItemInfo.AvatarState.GONE ? ((Number) cVar2.r.getValue()).intValue() : ((Number) cVar2.q.getValue()).intValue(), 0, 0, 0);
            int i2 = c.a.$EnumSwitchMapping$0[avatarState.ordinal()];
            if (i2 == 1) {
                vkSkeleton.setVisibility(0);
            } else if (i2 == 2) {
                vkSkeleton.setVisibility(4);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f4m.j(vkSkeleton);
            }
            vkSkeleton.setType(VkSkeleton.a.b.a);
            vkSkeleton.setArea(cVar2.l);
            vkSkeleton.setShimmerManagedExternally(true);
            int i3 = !z ? 1 : 0;
            int i4 = !z ? 8388613 : 8388611;
            fluidHorizontalLayout.setOrder(i3);
            fluidHorizontalLayout.setGravity(i4);
            View view = cVar2.p;
            VkSkeleton vkSkeleton2 = cVar2.o;
            if (msgSkeletonItemInfo.d) {
                f4m.u(vkSkeleton2, cn70.b(16), cn70.b(4), cn70.b(16), cn70.b(4));
                f4m.j(view);
            } else {
                if (z) {
                    f4m.u(vkSkeleton2, cn70.b(16), cn70.b(4), cn70.b(8), cn70.b(4));
                } else {
                    f4m.u(vkSkeleton2, cn70.b(8), cn70.b(4), cn70.b(16), cn70.b(4));
                }
                view.setVisibility(0);
            }
            vkSkeleton2.setType(new VkSkeleton.a.C0862a(kqu0.e));
            vkSkeleton2.setArea(cVar2.l);
            vkSkeleton2.setShimmerManagedExternally(true);
            fluidHorizontalLayout.post(new vc2(cVar2, msgSkeletonItemInfo, msgSkeletonViewRedesign, 3));
            msgSkeletonViewRedesign.e.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return MsgSkeletonViewRedesign.this.new c(tf3.b(viewGroup, R.layout.vkim_msg_list_item_msg_from_user_skeleton, viewGroup, false));
        }
    }

    /* compiled from: MsgSkeletonViewRedesign.kt */
    public final class c extends RecyclerView.e0 {
        public final a.c l;
        public final FluidHorizontalLayout m;
        public final VkSkeleton n;
        public final VkSkeleton o;
        public final View p;
        public final bpn0 q;
        public final bpn0 r;

        /* compiled from: MsgSkeletonViewRedesign.kt */
        public static final /* synthetic */ class a {
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
            this.l = a.c.a;
            this.m = (FluidHorizontalLayout) view.findViewById(R.id.fhl);
            VkSkeleton vkSkeleton = (VkSkeleton) view.findViewById(R.id.avatar);
            this.n = vkSkeleton;
            VkSkeleton vkSkeleton2 = (VkSkeleton) view.findViewById(R.id.bubble);
            this.o = vkSkeleton2;
            this.p = this.itemView.findViewById(R.id.status_space);
            this.q = new bpn0(new a040(this, 0));
            this.r = new bpn0(new p6y(this, 8));
            MsgSkeletonViewRedesign.this.getContext();
            ViewGroup.LayoutParams layoutParams = vkSkeleton2.getLayoutParams();
            f4m.s((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) - cn70.b(2), vkSkeleton2);
            ThemableShimmer themableShimmer = MsgSkeletonViewRedesign.this.e;
            vkSkeleton.setShimmer(themableShimmer);
            vkSkeleton2.setShimmer(themableShimmer);
        }
    }

    public MsgSkeletonViewRedesign(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.hh6
    public final void b() {
        this.e.b();
    }

    @Override // xsna.hh6
    public final void c() {
        this.e.c();
    }

    public final ThemableShimmer d() {
        Pair pair = (getSkeletonConfig().a && dhr0.M()) ? new Pair(Integer.valueOf(getContext().getColor(R.color.vk_black_alpha35)), Integer.valueOf(getContext().getColor(R.color.vk_black_alpha12))) : getSkeletonConfig().a ? new Pair(Integer.valueOf(getContext().getColor(R.color.vk_white_alpha60)), Integer.valueOf(getContext().getColor(R.color.vk_white))) : new Pair(Integer.valueOf(b6g.a(R.attr.vk_ui_skeleton_from, getContext())), Integer.valueOf(b6g.a(R.attr.vk_ui_skeleton_to, getContext())));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        ThemableShimmer.a aVar = new ThemableShimmer.a(getContext());
        ThemableShimmer themableShimmer = aVar.a;
        themableShimmer.h = intValue;
        themableShimmer.j = Float.POSITIVE_INFINITY;
        themableShimmer.i = 0;
        themableShimmer.e = intValue2;
        themableShimmer.g = Float.POSITIVE_INFINITY;
        themableShimmer.f = 0;
        aVar.b();
        aVar.e();
        return aVar.a();
    }

    @Override // xsna.hh6
    public wz30 getSkeletonConfig() {
        return this.c;
    }

    @Override // xsna.hh6
    public void setSkeletonConfig(wz30 wz30Var) {
        if (epx.f(this.c, wz30Var)) {
            return;
        }
        this.c = wz30Var;
        this.e = d();
        a aVar = this.d;
        aVar.c = null;
        aVar.d = 0;
        if (aVar.getParent() != null) {
            aVar.requestLayout();
        }
        aVar.forceLayout();
        aVar.getParent().requestLayout();
        invalidate();
    }

    public MsgSkeletonViewRedesign(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.c = new wz30(0);
        a aVar = new a(context);
        this.d = aVar;
        this.e = d();
        addView(aVar, new FrameLayout.LayoutParams(-1, -1));
    }
}

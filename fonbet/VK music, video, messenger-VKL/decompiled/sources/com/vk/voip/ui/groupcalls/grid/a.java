package com.vk.voip.ui.groupcalls.grid;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.asr_online.AsrOnlineView;
import com.vk.voip.ui.asr_online.AsrOnlineViewHorizontal;
import com.vk.voip.ui.c;
import com.vk.voip.ui.groupcalls.ControlsBoundsProvider;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.grid.dots.GridPaginationDotsView;
import com.vk.voip.ui.groupcalls.grid.type.GridViewType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.participant.movie.Movie;
import xsna.a000;
import xsna.agu;
import xsna.bwt0;
import xsna.c5g;
import xsna.ckj0;
import xsna.cn70;
import xsna.dfn;
import xsna.dz5;
import xsna.e43;
import xsna.ehs0;
import xsna.eoi;
import xsna.epx;
import xsna.ha90;
import xsna.hfz;
import xsna.i6x0;
import xsna.iah0;
import xsna.icx0;
import xsna.iew0;
import xsna.j5g;
import xsna.j6x0;
import xsna.kcx0;
import xsna.kiu;
import xsna.lhu;
import xsna.ltw;
import xsna.mc0;
import xsna.mhu;
import xsna.nfw0;
import xsna.nhu;
import xsna.nit;
import xsna.ohu;
import xsna.phu;
import xsna.qfu;
import xsna.qhj0;
import xsna.qhu;
import xsna.qiu;
import xsna.qj80;
import xsna.rhu;
import xsna.s3q0;
import xsna.sgu;
import xsna.shu;
import xsna.sz7;
import xsna.tmg0;
import xsna.ven;
import xsna.w65;
import xsna.x680;
import xsna.yen;
import xsna.zzz;

/* compiled from: GroupCallGridViewPager.kt */
/* loaded from: classes7.dex */
public final class a extends ConstraintLayout implements tmg0, ckj0, ControlsBoundsProvider, qhj0 {
    public static final int N = cn70.b(12);
    public static final int O = cn70.b(96);
    public static final int P = cn70.b(32);
    public static final int Q = cn70.b(10);
    public final TextView A;
    public final AsrOnlineView B;
    public final AsrOnlineViewHorizontal C;
    public final j6x0 D;
    public final ltw E;
    public final zzz F;
    public final nfw0 G;
    public final kcx0 H;
    public final Guideline I;
    public final qhu J;
    public final icx0 K;
    public final List<TextView> L;
    public final EmptyList M;
    public final ha90 t;
    public final ViewPager2 u;
    public final phu v;
    public final agu w;
    public final io.reactivex.rxjava3.disposables.b x;
    public InterfaceC2053a y;
    public final GridPaginationDotsView z;

    /* compiled from: GroupCallGridViewPager.kt */
    /* renamed from: com.vk.voip.ui.groupcalls.grid.a$a, reason: collision with other inner class name */
    public interface InterfaceC2053a {
    }

    /* compiled from: View.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ a c;
        public final /* synthetic */ int d;

        public b(View view, a aVar, int i) {
            this.b = view;
            this.c = aVar;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.u.e(this.d, false);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        ha90 ha90Var = new ha90(groupCallViewModel, GroupCallViewModel.GroupCallViewMode.GridViewMode);
        this.t = ha90Var;
        c.b.getClass();
        OKVoipEngine oKVoipEngine = c.r;
        this.x = new io.reactivex.rxjava3.disposables.b();
        dz5 dz5Var = new dz5();
        j6x0 j6x0Var = new j6x0();
        this.D = j6x0Var;
        ltw ltwVar = new ltw();
        this.E = ltwVar;
        a000 a000Var = (a000) c.T().a;
        this.F = a000Var;
        nfw0 nfw0Var = c.D0;
        this.G = nfw0Var;
        ehs0 ehs0Var = new ehs0(new ohu(groupCallViewModel), a000Var);
        this.H = c.k0();
        this.J = new qhu(context, new mhu(1, this, a.class, "updateMargins", "updateMargins(Lcom/vk/voip/ui/groupcalls/grid/indent/GroupCallGridViewPagerMeasurer$Margins;)V", 0), new nhu(1, this, a.class, "updateDotsAndSpeakersMargins", "updateDotsAndSpeakersMargins(Lcom/vk/voip/ui/groupcalls/grid/indent/GroupCallGridViewPagerMeasurer$Margins;)V", 0), dz5Var, a000Var);
        View inflate = LayoutInflater.from(context).inflate(R.layout.voip_group_call_grid_view_pager, this);
        setBackgroundResource(R.color.vk_black);
        ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(R.id.viewPager);
        this.u = viewPager2;
        viewPager2.setOffscreenPageLimit(1);
        nit nitVar = new nit(this, 1);
        ven venVar = c.m0;
        dfn dfnVar = venVar.d;
        yen yenVar = venVar.e;
        oKVoipEngine.getClass();
        this.v = new phu(ehs0Var, nitVar, ha90Var, ltwVar, new qfu(a000Var, dfnVar, yenVar, oKVoipEngine.getVideoController(), OKVoipEngine.f, oKVoipEngine), new mc0(this, j6x0Var, c.k0()), nfw0Var);
        viewPager2.b(new lhu(this));
        GridPaginationDotsView gridPaginationDotsView = (GridPaginationDotsView) findViewById(R.id.pagination_dots_view);
        this.z = gridPaginationDotsView;
        this.w = new agu(viewPager2, gridPaginationDotsView);
        this.I = (Guideline) findViewById(R.id.voip_grid_labels_guideline);
        this.B = (AsrOnlineView) findViewById(R.id.asr_online_view);
        AsrOnlineViewHorizontal asrOnlineViewHorizontal = (AsrOnlineViewHorizontal) findViewById(R.id.asr_online_view_horizontal);
        this.C = asrOnlineViewHorizontal;
        asrOnlineViewHorizontal.setOrientationDelegate(a000Var);
        TextView textView = (TextView) findViewById(R.id.speakers);
        this.A = textView;
        int i = 1;
        textView.addOnLayoutChangeListener(new x680(new eoi(this, i)));
        asrOnlineViewHorizontal.addOnLayoutChangeListener(new x680(new sz7(this, i)));
        this.K = c.l0();
        this.L = Collections.singletonList(textView);
        this.M = EmptyList.b;
    }

    private final AsrOnlineView getAsrOnlineViewByOrientation() {
        return this.F.isHorizontal() ? this.C : this.B;
    }

    private final hfz getCurrentItem() {
        int currentItem = this.u.getCurrentItem();
        if (currentItem < 0) {
            return null;
        }
        phu phuVar = this.v;
        if (currentItem < phuVar.getItemCount()) {
            return phuVar.h.get(currentItem);
        }
        return null;
    }

    private final int getSpeakersBottomMarginHorizontal() {
        return (this.D.b && ((Boolean) this.H.b.invoke()).booleanValue() && this.K.b() != null) ? O : P;
    }

    private final void setAsrOnlineVisible(boolean z) {
        if (!z) {
            this.C.setVisibility(z ? 0 : 8);
        }
        int i = z ? 0 : 8;
        AsrOnlineView asrOnlineView = this.B;
        asrOnlineView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = asrOnlineView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = iah0.a(8);
        marginLayoutParams.bottomMargin = iah0.a(10);
        asrOnlineView.setLayoutParams(marginLayoutParams);
    }

    private final void setCurrentItem(int i) {
        ViewPager2 viewPager2 = this.u;
        if (i != viewPager2.getCurrentItem()) {
            if (i + 1 > this.v.getItemCount()) {
                i = 0;
            }
            qj80.a(viewPager2, new b(viewPager2, this, i));
        }
    }

    public final void P4(List<CallMemberId> list, boolean z) {
        qhu.b bVar;
        ArrayList arrayList = new ArrayList();
        for (CallMemberId callMemberId : list) {
            GroupCallViewModel.b.getClass();
            kiu b2 = GroupCallViewModel.b(callMemberId);
            if (b2 != null) {
                Movie movie = (Movie) j5g.a0(b2.a.s);
                if (movie != null) {
                    arrayList.add(new sgu.c(callMemberId, movie));
                }
                CallMember callMember = b2.a;
                if (callMember.i && !callMember.n) {
                    arrayList.add(new sgu.a(callMemberId));
                }
            }
        }
        ArrayList U0 = j5g.U0(list, 6, 6, true);
        ArrayList arrayList2 = new ArrayList(c5g.u(U0, 10));
        Iterator it = U0.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList2.add(new sgu.b(i, (List) next, z));
            i = i2;
        }
        arrayList.addAll(arrayList2);
        int size = arrayList.size();
        qhu qhuVar = this.J;
        qhu.b bVar2 = qhuVar.g;
        Context context = qhuVar.a;
        if (bVar2 != null) {
            GridViewType o = dz5.o(context);
            qiu qiuVar = qhuVar.f;
            bVar = qhu.b.a(bVar2, o, qiuVar != null ? qiuVar.a() : 0, size == 1, false, false, false, 56);
        } else {
            GridViewType o2 = dz5.o(context);
            qiu qiuVar2 = qhuVar.f;
            bVar = new qhu.b(o2, qiuVar2 != null ? qiuVar2.a() : 0, size == 1);
        }
        if (!bVar.equals(qhuVar.g)) {
            qhuVar.g = bVar;
            qhuVar.b(bVar);
        }
        qhuVar.g = bVar;
        hfz currentItem = getCurrentItem();
        this.v.setItems(arrayList);
        if (epx.f(currentItem, getCurrentItem())) {
            return;
        }
        GroupCallViewModel.b.getClass();
        Integer num = GroupCallViewModel.q;
        if (num == null) {
            this.t.c.onNext(Integer.valueOf(this.u.getCurrentItem()));
        } else {
            setCurrentItem(num.intValue());
        }
    }

    public final void Q4() {
        getAsrOnlineViewByOrientation().b.setText("");
    }

    public final void T4(View view) {
        float h = w65.h(view);
        float c = this.F.c();
        int i = Q;
        if (c == 90.0f) {
            view.setTranslationX((-h) + i);
        } else if (c == 270.0f) {
            view.setTranslationX(h - i);
        } else {
            view.setTranslationX(h);
        }
    }

    public final void U4(boolean z) {
        boolean z2;
        qhu.b bVar;
        qhu qhuVar = this.J;
        qhu.b bVar2 = qhuVar.g;
        if (bVar2 != null) {
            z2 = z;
            bVar = qhu.b.a(bVar2, null, 0, false, false, false, z2, 31);
            qhuVar.b(bVar);
        } else {
            z2 = z;
            bVar = null;
        }
        qhuVar.g = bVar;
        setAsrOnlineVisible(z2);
        this.A.setVisibility(8);
    }

    @Override // xsna.ckj0
    public final Collection g3() {
        return EmptyList.b;
    }

    @Override // xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        return this.M;
    }

    @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
    public int getBottomOffset() {
        int max;
        int i = ((ConstraintLayout.b) this.I.getLayoutParams()).b;
        boolean isHorizontal = this.F.isHorizontal();
        TextView textView = this.A;
        if (isHorizontal) {
            max = (-textView.getHeight()) / 2;
        } else {
            max = Math.max(cn70.b(12) + (textView.getHeight() / 2), cn70.b(28));
        }
        return i + max;
    }

    public ControlsBoundsProvider.Gravity getHorizontalGravity() {
        return ControlsBoundsProvider.Gravity.LEFT;
    }

    public final i6x0 getPlayerMediator() {
        return this.D;
    }

    public SpannableStringBuilder getSubtitlesTextSpannable() {
        return this.B.getSubtitlesTextSpannable();
    }

    @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
    public int getTopOffset() {
        ControlsBoundsProvider controlsBoundsProvider = (ControlsBoundsProvider) getParent();
        return (this.F.isHorizontal() && getHorizontalGravity() == ControlsBoundsProvider.Gravity.LEFT) ? controlsBoundsProvider.getTopOffset() : controlsBoundsProvider.getTopOffset() + N;
    }

    @Override // xsna.tmg0
    public List<TextView> getViewsToRotate() {
        return this.L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u.setAdapter(this.v);
        this.w.a();
        this.F.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u.setAdapter(null);
        this.F.b(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
        qhu qhuVar = this.J;
        dz5 dz5Var = qhuVar.d;
        int i3 = qhu.c.$EnumSwitchMapping$0[dz5.o(qhuVar.a).ordinal()];
        if (i3 == 1) {
            marginLayoutParams.height = (size2 - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
            marginLayoutParams.width = size;
            s3q0 s3q0Var = s3q0.a;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            marginLayoutParams.height = (size2 - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
            marginLayoutParams.width = size;
            s3q0 s3q0Var2 = s3q0.a;
        }
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        qhuVar.h = false;
    }

    public final void setListener(InterfaceC2053a interfaceC2053a) {
        this.y = interfaceC2053a;
    }

    public final void setTopIndent(qiu qiuVar) {
        qhu qhuVar = this.J;
        qiu qiuVar2 = qhuVar.f;
        if (qiuVar2 != null) {
            qiuVar2.a.remove(new rhu(qhuVar));
        }
        qhuVar.f = qiuVar;
        if (qiuVar != null) {
            shu shuVar = new shu(qhuVar);
            CopyOnWriteArrayList<qiu.a> copyOnWriteArrayList = qiuVar.a;
            if (copyOnWriteArrayList.contains(shuVar)) {
                return;
            }
            copyOnWriteArrayList.add(shuVar);
            shuVar.c();
        }
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        if (this.G.b.a().b) {
            AsrOnlineViewHorizontal asrOnlineViewHorizontal = this.C;
            ViewGroup.LayoutParams layoutParams = asrOnlineViewHorizontal.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.i = 0;
            bVar.l = 0;
            bVar.t = 0;
            bVar.v = -1;
            asrOnlineViewHorizontal.setLayoutParams(bVar);
            if (f != asrOnlineViewHorizontal.h) {
                bwt0.p0(asrOnlineViewHorizontal, false);
            }
            asrOnlineViewHorizontal.h = f;
            AsrOnlineView asrOnlineView = this.B;
            if (f == 90.0f) {
                asrOnlineView.setVisibility(8);
                asrOnlineViewHorizontal.setRotation(f);
                T4(asrOnlineViewHorizontal);
            } else if (f == 270.0f) {
                asrOnlineView.setVisibility(8);
                asrOnlineViewHorizontal.setRotation(f);
                T4(asrOnlineViewHorizontal);
            } else if (f == 180.0f) {
                asrOnlineViewHorizontal.setVisibility(8);
            } else if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                asrOnlineViewHorizontal.setVisibility(8);
                asrOnlineView.setVisibility(0);
            }
        }
        TextView textView = this.A;
        if (f == 90.0f) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.i = this.u.getId();
            bVar2.t = 0;
            bVar2.v = -1;
            bVar2.u = -1;
            bVar2.l = -1;
            bVar2.setMarginStart(getSpeakersBottomMarginHorizontal());
            bVar2.setMarginEnd(0);
            bVar2.E = 0.5f;
            textView.setLayoutParams(bVar2);
            return;
        }
        if (f == 270.0f) {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            bVar3.l = 0;
            bVar3.v = 0;
            bVar3.i = -1;
            bVar3.t = -1;
            bVar3.u = -1;
            bVar3.setMarginStart(0);
            bVar3.setMarginEnd(getSpeakersBottomMarginHorizontal());
            bVar3.E = 0.5f;
            textView.setLayoutParams(bVar3);
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
        Guideline guideline = this.I;
        bVar4.i = guideline.getId();
        bVar4.l = guideline.getId();
        bVar4.t = 0;
        bVar4.v = 0;
        bVar4.u = -1;
        bVar4.setMarginEnd(N);
        bVar4.setMarginStart(cn70.b(8));
        bVar4.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        textView.setLayoutParams(bVar4);
    }

    @Override // xsna.ckj0
    public final void w2(String str) {
        qhu.b bVar;
        boolean z = str != null;
        qhu qhuVar = this.J;
        qhu.b bVar2 = qhuVar.g;
        if (bVar2 != null) {
            bVar = qhu.b.a(bVar2, null, 0, false, false, z, false, 47);
            qhuVar.b(bVar);
        } else {
            bVar = null;
        }
        qhuVar.g = bVar;
        int i = z ? 0 : 8;
        TextView textView = this.A;
        textView.setVisibility(i);
        textView.setText(str);
    }

    @Override // xsna.qhj0
    public final void y3(List<iew0> list) {
        if (!list.isEmpty()) {
            getAsrOnlineViewByOrientation().a(list);
        } else {
            this.B.a(list);
            this.C.a(list);
        }
    }
}

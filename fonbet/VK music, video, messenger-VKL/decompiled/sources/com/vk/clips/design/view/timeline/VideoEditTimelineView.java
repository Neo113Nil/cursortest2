package com.vk.clips.design.view.timeline;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.clips.model.ClipsEditorNextButtonState;
import com.vk.lists.ListDataSet;
import com.vk.movika.sdk.base.logic.interactor.d;
import com.vk.movika.sdk.base.logic.interactor.f;
import com.vk.movika.tools.controls.seekbar.q;
import com.vk.movika.tools.controls.seekbar.s;
import com.vk.movika.tools.controls.seekbar.u;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ad0;
import xsna.alj0;
import xsna.avj0;
import xsna.awt0;
import xsna.b3m0;
import xsna.bfs;
import xsna.c3k0;
import xsna.c4g0;
import xsna.c5g;
import xsna.cck0;
import xsna.cqr0;
import xsna.dbj0;
import xsna.dck0;
import xsna.e1s0;
import xsna.e43;
import xsna.e5p0;
import xsna.efl;
import xsna.epx;
import xsna.f4m;
import xsna.g05;
import xsna.g2f;
import xsna.ga;
import xsna.gip0;
import xsna.gp6;
import xsna.gwo0;
import xsna.h440;
import xsna.h8n0;
import xsna.ia;
import xsna.iah0;
import xsna.igs;
import xsna.iwo0;
import xsna.ixd;
import xsna.j8n0;
import xsna.jds0;
import xsna.jjc;
import xsna.k05;
import xsna.ksq0;
import xsna.las;
import xsna.lbc0;
import xsna.m2l0;
import xsna.mlf0;
import xsna.mqe0;
import xsna.msy;
import xsna.mwo0;
import xsna.n52;
import xsna.n7b0;
import xsna.oy4;
import xsna.prq0;
import xsna.pwo0;
import xsna.ql2;
import xsna.r6i0;
import xsna.rka0;
import xsna.rwo0;
import xsna.s3q0;
import xsna.swo0;
import xsna.t60;
import xsna.u110;
import xsna.uho0;
import xsna.uke;
import xsna.v5n0;
import xsna.vlc0;
import xsna.vpj0;
import xsna.vwo0;
import xsna.wl0;
import xsna.wq3;
import xsna.wwo0;
import xsna.wzs;
import xsna.xka0;
import xsna.xl0;
import xsna.ym4;
import xsna.ywo0;
import xsna.z6f0;

/* compiled from: VideoEditTimelineView.kt */
/* loaded from: classes16.dex */
public final class VideoEditTimelineView extends ConstraintLayout {
    public static final /* synthetic */ int H = 0;
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public rwo0 F;
    public wzs<? super e5p0, ? super View, s3q0> G;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: VideoEditTimelineView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsEditorNextButtonState.values().length];
            try {
                iArr[ClipsEditorNextButtonState.Ready.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsEditorNextButtonState.Next.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoEditTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        u110 u110Var = new u110(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, u110Var);
        this.u = msy.a(lazyThreadSafetyMode, new e1s0(this, 3));
        this.v = msy.a(lazyThreadSafetyMode, new cqr0(this, 3));
        this.w = msy.a(lazyThreadSafetyMode, new ksq0(this, 3));
        this.x = msy.a(lazyThreadSafetyMode, new cck0(this, 13));
        this.y = msy.a(lazyThreadSafetyMode, new dck0(this, 12));
        this.z = msy.a(lazyThreadSafetyMode, new mqe0(this, 24));
        this.A = msy.a(lazyThreadSafetyMode, new dbj0(this, 13));
        this.B = msy.a(lazyThreadSafetyMode, new mlf0(this, 16));
        this.C = msy.a(lazyThreadSafetyMode, new rka0(this, 28));
        this.D = msy.a(lazyThreadSafetyMode, new prq0(this, 8));
        this.E = msy.a(lazyThreadSafetyMode, new vpj0(this, 15));
        LayoutInflater.from(context).inflate(R.layout.timeline_layout, this);
        setBackgroundResource(R.color.vk_gray_1000);
        VkImageSimple addBtn = getAddBtn();
        ixd ixdVar = ad0.g;
        ixd.b bVar = (ixdVar == null ? null : ixdVar).a;
        addBtn.setImageResource(R.drawable.vk_icon_add_16);
        VkImageSimple playBtn = getPlayBtn();
        ixd ixdVar2 = ad0.g;
        ixd.b bVar2 = (ixdVar2 == null ? null : ixdVar2).a;
        playBtn.setImageResource(R.drawable.vk_icon_play_28);
        VkImageSimple pauseBtn = getPauseBtn();
        ixd ixdVar3 = ad0.g;
        ixd.b bVar3 = (ixdVar3 == null ? null : ixdVar3).a;
        pauseBtn.setImageResource(R.drawable.vk_icon_pause_28);
        VkImageSimple undoBtn = getUndoBtn();
        ixd ixdVar4 = ad0.g;
        ixd.b bVar4 = (ixdVar4 == null ? null : ixdVar4).a;
        undoBtn.setImageResource(R.drawable.vk_icon_arrow_uturn_left_outline_20);
        VkImageSimple redoBtn = getRedoBtn();
        ixd ixdVar5 = ad0.g;
        ixd.b bVar5 = (ixdVar5 == null ? null : ixdVar5).a;
        redoBtn.setImageResource(R.drawable.vk_icon_arrow_uturn_right_outline_20);
        VkImageSimple expandBtn = getExpandBtn();
        ixd ixdVar6 = ad0.g;
        ixd.b bVar6 = (ixdVar6 != null ? ixdVar6 : null).a;
        expandBtn.setImageResource(R.drawable.vk_icon_fullscreen_16);
        getBottomActions().setOnActionListener$timeline_release(new q(this, 12));
        getBottomActions().setOnApplyListener$timeline_release(new lbc0(this, 29));
        getBottomActions().setShowOnboardingTooltip$timeline_release(new s(this, 17));
        getFragmentActions().setOnActionListener(new h440(this, 28));
        getTimeline().setSelectedListener(new u(this, 13));
        getTimeline().setChangePositionListener(new xka0(this, 23));
        getTimeline().setOnScrollEndListener(new v5n0(this, 13));
        getTimeline().setOnCropStartedListener(new jds0(this, 1));
        getTimeline().setOnOffsetFromStartChangeListener(new n7b0(this, 23));
        f4m.a(this, new h8n0(this, 10));
        int dimensionPixelSize = ((((int) igs.q) / 2) + ((int) igs.s)) - (context.getResources().getDimensionPixelSize(R.dimen.timeline_add_button_size) / 2);
        f4m.q(dimensionPixelSize, getAddBtn());
        jjc.g(getAddBtn(), new alj0(this, 20));
        f4m.q(dimensionPixelSize, getMuteBtn());
        jjc.g(getMuteBtn(), new m2l0(this, 18));
        jjc.g(getExpandBtn(), new c3k0(this, 10));
        jjc.g(getUndoBtn(), new r6i0(this, 17));
        jjc.g(getRedoBtn(), new b3m0(this, 14));
        jjc.g(getPlayBtn(), new z6f0(this, 27));
        jjc.g(getPauseBtn(), new vlc0(this, 26));
        getEditingActions().setOnCancel(new j8n0(this, 11));
        getEditingActions().setOnDone(new uho0(this, 7));
        getVoiceoverView().setOnRecordClickListener(new avj0(this, 18));
    }

    public static s3q0 P4(VideoEditTimelineView videoEditTimelineView, las lasVar) {
        rwo0 rwo0Var;
        gp6 selectedItem = videoEditTimelineView.getTimeline().getSelectedItem();
        if (selectedItem != null && (rwo0Var = videoEditTimelineView.F) != null) {
            rwo0Var.v(lasVar.a, selectedItem.D());
        }
        return s3q0.a;
    }

    public static s3q0 Q4(VideoEditTimelineView videoEditTimelineView) {
        Iterator<T> it = videoEditTimelineView.getTimeline().getSettings().i.iterator();
        while (it.hasNext()) {
            videoEditTimelineView.n5(videoEditTimelineView.getTimeline().getCursorItemInfo(), (iwo0) it.next(), false);
        }
        return s3q0.a;
    }

    public static s3q0 T4(VideoEditTimelineView videoEditTimelineView, int i) {
        videoEditTimelineView.getMuteBtn().setTranslationX((-i) - (iah0.f().widthPixels / 2));
        return s3q0.a;
    }

    public static s3q0 U4(VideoEditTimelineView videoEditTimelineView) {
        oy4 editingAudioItem = videoEditTimelineView.getTimeline().getEditingAudioItem();
        if (editingAudioItem != null) {
            TimelineView timeline = videoEditTimelineView.getTimeline();
            ym4 ym4Var = timeline.x;
            ym4Var.h.forceFinished(true);
            ym4Var.e(ym4.a.IDLE);
            vwo0 vwo0Var = timeline.g;
            vwo0Var.b.forceFinished(true);
            vwo0.a aVar = vwo0.a.IDLE;
            vwo0Var.b(aVar);
            vwo0Var.b(aVar);
            videoEditTimelineView.setEditingAudioItem(null);
            rwo0 rwo0Var = videoEditTimelineView.F;
            if (rwo0Var != null) {
                rwo0Var.d(gp6.a.a(editingAudioItem));
            }
        }
        return s3q0.a;
    }

    public static s3q0 V4(VideoEditTimelineView videoEditTimelineView) {
        gp6 gp6Var = videoEditTimelineView.getTimeline().getState().j;
        if (gp6Var != null) {
            videoEditTimelineView.getFragmentActions().e(gp6Var);
        }
        return s3q0.a;
    }

    public static s3q0 X4(VideoEditTimelineView videoEditTimelineView, iwo0 iwo0Var, View view) {
        rwo0 rwo0Var;
        ywo0.a cursorItemInfo = videoEditTimelineView.getTimeline().getCursorItemInfo();
        if (cursorItemInfo != null && (rwo0Var = videoEditTimelineView.F) != null) {
            rwo0Var.y(view, iwo0Var.a, cursorItemInfo.a, cursorItemInfo.c);
        }
        return s3q0.a;
    }

    public static s3q0 Y4(VideoEditTimelineView videoEditTimelineView, ywo0.a aVar) {
        Iterator<T> it = videoEditTimelineView.getTimeline().getSettings().i.iterator();
        while (it.hasNext()) {
            videoEditTimelineView.n5(aVar, (iwo0) it.next(), true);
        }
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getAddBtn() {
        return (VkImageSimple) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TimelineBottomActionsView getBottomActions() {
        return (TimelineBottomActionsView) this.C.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TimelineEditingActionsView getEditingActions() {
        return (TimelineEditingActionsView) this.D.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getExpandBtn() {
        return (VkImageSimple) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FragmentActionsView getFragmentActions() {
        return (FragmentActionsView) this.B.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getMuteBtn() {
        return (VkImageSimple) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getPauseBtn() {
        return (VkImageSimple) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getPlayBtn() {
        return (VkImageSimple) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getRedoBtn() {
        return (VkImageSimple) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TimelineView getTimeline() {
        return (TimelineView) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getUndoBtn() {
        return (VkImageSimple) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TimelineVoiceoverView getVoiceoverView() {
        return (TimelineVoiceoverView) this.E.getValue();
    }

    public final boolean Z4() {
        return getTimeline().getAreControlsLocked();
    }

    public final boolean a0() {
        if (!(getTimeline().getState().l instanceof swo0.b)) {
            return false;
        }
        e5();
        return true;
    }

    public final void a5() {
        mwo0 mwo0Var = getTimeline().e;
        mwo0Var.d.j = null;
        mwo0Var.a();
        j5(null, null);
    }

    public final void b5() {
        setClipToPadding(true);
        setClipChildren(true);
        ywo0 state = getTimeline().getState();
        swo0.a aVar = swo0.a.a;
        state.l = aVar;
        TimelineView timeline = getTimeline();
        k05 k05Var = timeline.i;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) k05Var.c;
        if (cVar != null) {
            cVar.dispose();
        }
        k05Var.b = null;
        timeline.e.d.l = aVar;
        getVoiceoverView().Q4(false, true);
        getVoiceoverView().setAmpsObservable(null);
        o5();
    }

    public final String c5(String str) {
        Object obj;
        Iterator it = c5g.v(getTimeline().e.d.c()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((gp6) obj).m(), str)) {
                break;
            }
        }
        gp6 gp6Var = (gp6) obj;
        if (gp6Var != null) {
            return gp6Var.getType();
        }
        return null;
    }

    public final void clear() {
        TimelineView timeline = getTimeline();
        gip0 gip0Var = timeline.j;
        gip0Var.i.evictAll();
        HashMap<String, g05.a> hashMap = gip0Var.g.b;
        Collection<g05.a> values = hashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof g05.d) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g05.d) it.next()).a.dispose();
        }
        hashMap.clear();
        HashMap<String, bfs.a> hashMap2 = timeline.f.b;
        for (bfs.a aVar : hashMap2.values()) {
            TreeMap<Long, Bitmap> treeMap = aVar.b;
            HashMap<Long, bfs.b> hashMap3 = aVar.c;
            Collection<bfs.b> values2 = hashMap3.values();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : values2) {
                if (obj2 instanceof bfs.e) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((bfs.e) it2.next()).a.dispose();
            }
            hashMap3.clear();
            Iterator<T> it3 = treeMap.values().iterator();
            while (it3.hasNext()) {
                ((Bitmap) it3.next()).recycle();
            }
            treeMap.clear();
            efl eflVar = aVar.a;
            w wVar = eflVar.c;
            if (wVar != null) {
                wVar.c(new n52(eflVar, 8));
            }
        }
        hashMap2.clear();
    }

    public final void d5() {
        TimelineView timeline = getTimeline();
        timeline.w = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        timeline.x.c(obtain);
        timeline.u.a(obtain);
        timeline.v.e(obtain);
    }

    public final void e5() {
        oy4 editingAudioItem = getTimeline().getEditingAudioItem();
        if (editingAudioItem != null) {
            TimelineView timeline = getTimeline();
            ym4 ym4Var = timeline.x;
            ym4Var.h.forceFinished(true);
            ym4Var.e(ym4.a.IDLE);
            vwo0 vwo0Var = timeline.g;
            vwo0Var.b.forceFinished(true);
            vwo0.a aVar = vwo0.a.IDLE;
            vwo0Var.b(aVar);
            vwo0Var.b(aVar);
            setEditingAudioItem(null);
            rwo0 rwo0Var = this.F;
            if (rwo0Var != null) {
                rwo0Var.c(gp6.a.a(editingAudioItem));
            }
        }
    }

    public final void f5() {
        setClipToPadding(true);
        setClipChildren(true);
        ywo0 state = getTimeline().getState();
        swo0.a aVar = swo0.a.a;
        state.l = aVar;
        TimelineView timeline = getTimeline();
        k05 k05Var = timeline.i;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) k05Var.c;
        if (cVar != null) {
            cVar.dispose();
        }
        k05Var.b = null;
        mwo0 mwo0Var = timeline.e;
        mwo0Var.d.l = aVar;
        rwo0 rwo0Var = mwo0Var.j;
        if (rwo0Var != null) {
            rwo0Var.k();
        }
        getVoiceoverView().setAmpsObservable(null);
        getVoiceoverView().Q4(false, true);
        o5();
    }

    public final void g5(long j) {
        TimelineView timeline = getTimeline();
        if (timeline.g.c == vwo0.a.IDLE && !timeline.b()) {
            mwo0 mwo0Var = timeline.e;
            ywo0 ywo0Var = mwo0Var.d;
            if (ywo0Var.s != j) {
                ywo0Var.s = j;
                ywo0Var.m();
                ywo0Var.o();
                ywo0Var.n();
                gp6 gp6Var = ywo0Var.j;
                if (gp6Var != null && !RectF.intersects(ywo0Var.o, gp6Var.u())) {
                    mwo0Var.e(null);
                }
                mwo0Var.a();
            }
        }
    }

    public final void h5(String str) {
        Object obj;
        TimelineView timeline = getTimeline();
        if (timeline.g.c != vwo0.a.IDLE) {
            return;
        }
        Iterator it = c5g.v(timeline.getState().g).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((gp6) obj).m(), str)) {
                    break;
                }
            }
        }
        gp6 gp6Var = (gp6) obj;
        if (gp6Var == null) {
            return;
        }
        timeline.e.c(0, (int) (gp6Var.u().top - timeline.j.d.top));
    }

    public final void i5(String str) {
        Object obj;
        Iterator it = c5g.v(getTimeline().getState().c()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((gp6) obj).m(), str)) {
                    break;
                }
            }
        }
        gp6 gp6Var = (gp6) obj;
        pwo0 h = getTimeline().getState().h(gp6Var);
        if (gp6Var == null || h == null) {
            return;
        }
        mwo0 mwo0Var = getTimeline().e;
        ywo0 ywo0Var = mwo0Var.d;
        if (!epx.f(ywo0Var.j, gp6Var)) {
            ywo0Var.j = gp6Var;
            mwo0Var.a();
            mwo0Var.d(gp6Var);
        }
        j5(h, gp6Var);
    }

    public final void j5(pwo0 pwo0Var, gp6 gp6Var) {
        List<las> v = (pwo0Var == null || gp6Var == null) ? EmptyList.b : gp6Var.v();
        FragmentActionsView fragmentActions = getFragmentActions();
        List<las> list = v;
        fragmentActions.b(!list.isEmpty(), !epx.f(gp6Var != null ? gp6Var.m() : null, "AUDIO_TIMELINE_ITEM_ADD_ID"));
        if (list.isEmpty()) {
            return;
        }
        fragmentActions.setActions(v);
        fragmentActions.e(gp6Var);
        fragmentActions.d();
    }

    public final void k5(g2f g2fVar, uke ukeVar) {
        mwo0 mwo0Var = getTimeline().e;
        mwo0Var.k = g2fVar;
        mwo0Var.l = ukeVar;
    }

    public final void l5(String str, boolean z, boolean z2, io.reactivex.rxjava3.core.q<Integer> qVar) {
        TimelineView timeline = getTimeline();
        k05 k05Var = timeline.i;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) k05Var.c;
        if (cVar != null) {
            cVar.dispose();
        }
        if (qVar != null) {
            k05Var.c = qVar.d(((long) ((mwo0) k05Var.a).d.r.c) / 10, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.a.a(), Integer.MAX_VALUE, ArrayListSupplier.INSTANCE).U(new ql2(new wq3(3), 4)).U(new xl0(new wl0(k05Var, 4), 4)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ga(new d(k05Var, 9), 6), new ia(new f(2), 6));
        }
        mwo0 mwo0Var = timeline.e;
        mwo0Var.d.l = new swo0.c(str, z);
        mwo0Var.a();
        if (z) {
            setClipToPadding(false);
            setClipChildren(false);
        }
        getVoiceoverView().setAmpsObservable(qVar);
        getVoiceoverView().Q4(z, z2);
        o5();
    }

    public final void m5() {
        getTimeline().w = false;
    }

    public final void n5(ywo0.a aVar, iwo0 iwo0Var, boolean z) {
        t60 t60Var = iwo0Var.d;
        if (!(t60Var instanceof t60.b) || aVar == null) {
            return;
        }
        gp6 gp6Var = aVar.b;
        long j = aVar.c;
        ((t60.b) t60Var).getClass();
        if (z) {
            return;
        }
        t60.b bVar = (t60.b) t60Var;
        boolean z2 = ((j > (gp6Var.E() + bVar.b) ? 1 : (j == (gp6Var.E() + bVar.b) ? 0 : -1)) <= 0) || ((j > (gp6Var.x() - bVar.b) ? 1 : (j == (gp6Var.x() - bVar.b) ? 0 : -1)) >= 0);
        boolean z3 = bVar.a != z2;
        bVar.a = z2;
        if (z3) {
            ListDataSet listDataSet = (ListDataSet) getBottomActions().y.c;
            ArrayList arrayList = listDataSet.d;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else {
                    if (((iwo0) arrayList.get(i)).a == iwo0Var.a) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (i >= 0) {
                listDataSet.h(i);
                arrayList.set(i, iwo0Var);
                listDataSet.d(i);
            }
        }
    }

    public final void o5() {
        wwo0 settings = getTimeline().getSettings();
        swo0 swo0Var = getTimeline().getState().l;
        if (epx.f(swo0Var, swo0.a.a)) {
            VkImageSimple undoBtn = getUndoBtn();
            boolean z = settings.c;
            undoBtn.setAlpha(z ? 1.0f : 0.64f);
            undoBtn.setEnabled(z);
            undoBtn.setClickable(z);
            VkImageSimple redoBtn = getRedoBtn();
            boolean z2 = settings.d;
            redoBtn.setAlpha(z2 ? 1.0f : 0.64f);
            redoBtn.setEnabled(z2);
            redoBtn.setClickable(z2);
            awt0.v(getAddBtn(), settings.a);
            VkImageSimple expandBtn = getExpandBtn();
            expandBtn.setAlpha(1.0f);
            expandBtn.setEnabled(true);
            expandBtn.setClickable(true);
            awt0.v(getMuteBtn(), settings.e);
            awt0.v(getBottomActions(), true);
            c4g0.C(e43.l(getEditingActions(), getVoiceoverView()));
            Iterator it = e43.l(getPlayBtn(), getPauseBtn()).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setAlpha(1.0f);
            }
            return;
        }
        if (swo0Var instanceof swo0.b) {
            for (View view : e43.l(getUndoBtn(), getRedoBtn(), getExpandBtn())) {
                view.setAlpha(0.64f);
                view.setEnabled(false);
                view.setClickable(false);
            }
            c4g0.C(e43.l(getAddBtn(), getMuteBtn(), getBottomActions(), getVoiceoverView()));
            awt0.v(getEditingActions(), true);
            return;
        }
        if (!(swo0Var instanceof swo0.c)) {
            throw new NoWhenBranchMatchedException();
        }
        List l = e43.l(getPlayBtn(), getPauseBtn());
        boolean z3 = ((swo0.c) swo0Var).b;
        Iterator it2 = l.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setAlpha(!z3 ? 1.0f : 0.64f);
        }
        for (View view2 : e43.l(getUndoBtn(), getRedoBtn(), getExpandBtn())) {
            view2.setAlpha(0.64f);
            view2.setEnabled(false);
            view2.setClickable(false);
        }
        c4g0.C(e43.l(getAddBtn(), getMuteBtn(), getBottomActions(), getEditingActions()));
        awt0.v(getVoiceoverView(), true);
    }

    public void setEditingAudioItem(String str) {
        getTimeline().setEditingAudioItem(str);
        o5();
    }

    public void setSettings(wwo0 wwo0Var) {
        int i;
        List<iwo0> list = wwo0Var.i;
        if (wwo0Var.f) {
            getPlayBtn().setVisibility(8);
            getPauseBtn().setVisibility(0);
        } else {
            getPlayBtn().setVisibility(0);
            getPauseBtn().setVisibility(8);
        }
        getBottomActions().setApplyButtonEnabled(wwo0Var.b);
        int i2 = a.$EnumSwitchMapping$0[wwo0Var.j.ordinal()];
        if (i2 == 1) {
            i = R.string.clips_editor_ready;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.clips_editor_next;
        }
        getBottomActions().setApplyButtonText(i);
        if (!epx.f(getTimeline().getSettings().i, list)) {
            getBottomActions().setActions(list);
        }
        if (wwo0Var.g) {
            VkImageSimple muteBtn = getMuteBtn();
            ixd ixdVar = ad0.g;
            ixd.b bVar = (ixdVar != null ? ixdVar : null).a;
            muteBtn.setImageResource(R.drawable.vk_icon_muted_16);
            getMuteBtn().setContentDescription(getContext().getResources().getString(R.string.accessibility_timeline_unmute));
        } else {
            VkImageSimple muteBtn2 = getMuteBtn();
            ixd ixdVar2 = ad0.g;
            ixd.b bVar2 = (ixdVar2 != null ? ixdVar2 : null).a;
            muteBtn2.setImageResource(R.drawable.vk_icon_volume_20);
            getMuteBtn().setContentDescription(getContext().getResources().getString(R.string.accessibility_timeline_mute));
        }
        getTimeline().setSettings(wwo0Var);
        o5();
    }

    public final void setShowOnboardingTooltipCallback(wzs<? super e5p0, ? super View, s3q0> wzsVar) {
        this.G = wzsVar;
    }

    public void setTimelineItems(gwo0 gwo0Var) {
        getTimeline().setMultitrackItems(gwo0Var);
    }

    public void setTimelineItemsWithAnimations(gwo0 gwo0Var) {
        getTimeline().setVideoItemsWithAnimations(gwo0Var);
    }

    public final void setTimelineListener(rwo0 rwo0Var) {
        this.F = rwo0Var;
        getTimeline().setTimelineListener(rwo0Var);
    }
}

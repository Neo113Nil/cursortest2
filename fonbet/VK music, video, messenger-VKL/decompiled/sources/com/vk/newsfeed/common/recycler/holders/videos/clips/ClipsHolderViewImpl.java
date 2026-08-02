package com.vk.newsfeed.common.recycler.holders.videos.clips;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.shortvideo.Clips;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.autoplay.b;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.log.L;
import defpackage.f;
import defpackage.g;
import defpackage.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ai5;
import xsna.akd;
import xsna.asu0;
import xsna.bpn0;
import xsna.c5g;
import xsna.cn70;
import xsna.cnc;
import xsna.e0f;
import xsna.epx;
import xsna.ez;
import xsna.fh5;
import xsna.g4f;
import xsna.g620;
import xsna.gaf;
import xsna.hpe;
import xsna.iah0;
import xsna.io1;
import xsna.j5g;
import xsna.j5j;
import xsna.kn4;
import xsna.msy;
import xsna.ni5;
import xsna.p8;
import xsna.pfe;
import xsna.pgn;
import xsna.pkd;
import xsna.qcy;
import xsna.qfe;
import xsna.rfe;
import xsna.s0t0;
import xsna.s3q0;
import xsna.ul1;
import xsna.une;
import xsna.v1f;
import xsna.v98;
import xsna.vu5;
import xsna.wjs0;
import xsna.x1f;
import xsna.xjd;
import xsna.xod;
import xsna.y24;
import xsna.y9t0;
import xsna.yor0;
import xsna.zof;

/* compiled from: ClipsHolderViewImpl.kt */
/* loaded from: classes4.dex */
public final class ClipsHolderViewImpl extends RecyclerPaginatedView implements rfe, ai5, s0t0 {
    public static final int d0 = cn70.b(8);
    public static final int e0 = cn70.b(16);
    public final Object N;
    public final Object O;
    public final Object P;
    public final GestureDetector Q;
    public final b R;
    public qfe S;
    public cnc T;
    public akd U;
    public final RecyclerView.k V;
    public final une W;

    @SuppressLint({"ResourceType"})
    public a a0;
    public pfe b0;
    public final int c0;

    /* compiled from: ClipsHolderViewImpl.kt */
    public interface a {

        /* compiled from: ClipsHolderViewImpl.kt */
        /* renamed from: com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl$a$a, reason: collision with other inner class name */
        public static final class C1372a implements a {
            public static final C1372a a = new C1372a();
        }

        /* compiled from: ClipsHolderViewImpl.kt */
        public static final class b implements a {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ExactHeight(height="), this.a, ')');
            }
        }

        /* compiled from: ClipsHolderViewImpl.kt */
        public static final class c implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                return Float.compare(2.2f, 2.2f) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(2.2f);
            }

            public final String toString() {
                return "ExactItemsCount(itemsCount=2.2)";
            }
        }
    }

    public ClipsHolderViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        f fVar = new f(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, fVar);
        this.O = msy.a(lazyThreadSafetyMode, new g(this, 27));
        this.P = msy.a(lazyThreadSafetyMode, new h(this, 23));
        this.Q = new GestureDetector(context, new yor0(context));
        bpn0 bpn0Var = b.B;
        this.R = b.C1208b.a();
        this.V = this.x.getEdgeEffectFactory();
        this.W = new une(this.x, new y24(0, this, ClipsHolderViewImpl.class, "showAllClipsOnOverscroll", "showAllClipsOnOverscroll()V", 0, 1));
        int layoutDimension = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height}).getLayoutDimension(0, 0);
        this.a0 = layoutDimension <= 0 ? a.C1372a.a : new a.b(layoutDimension);
        this.c0 = iah0.a(8);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, this);
        dVar.f = 0;
        dVar.a();
        RecyclerView recyclerView = this.x;
        int i = e0;
        recyclerView.addItemDecoration(new v98(d0, i, i, true));
        this.x.setNestedScrollingEnabled(true);
        this.x.setClipToPadding(false);
        this.x.setMotionEventSplittingEnabled(false);
        this.x.setHasFixedSize(true);
        setSwipeRefreshEnabled(false);
        setFooterLoadingViewProvider(null);
        setFooterErrorViewProvider(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final BridgeComponent getBridgesComponent() {
        return (BridgeComponent) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final xod getClipsDataFormatter() {
        return (xod) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final zof getExperiments() {
        return (zof) this.N.getValue();
    }

    public static List x(ClipFeedTab clipFeedTab) {
        pkd f = g620.f();
        int i = pkd.a;
        List<ClipFeedTab> p = f.p(null);
        ArrayList arrayList = new ArrayList(c5g.u(p, 10));
        for (ClipFeedTab clipFeedTab2 : p) {
            if (clipFeedTab2 instanceof ClipFeedTab.TopVideo) {
                clipFeedTab2 = clipFeedTab;
            }
            arrayList.add(clipFeedTab2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(Clips clips, String str, String str2) {
        qfe qfeVar = this.S;
        qfe qfeVar2 = qfeVar == null ? null : qfeVar;
        qfeVar2.getClass();
        String str3 = clips.c;
        List<ClipVideoFile> list = clips.b;
        qfeVar2.m = str2;
        qfeVar2.b.setRef(str);
        qfeVar2.b.setTrackCode(str2);
        if (!qfeVar2.g.isEmpty()) {
            xjd.a aVar = (xjd.a) j5g.a0(qfeVar2.g);
            if ((aVar != null ? aVar.a : null) == j5g.a0(list)) {
                ListDataSet<xjd> listDataSet = qfeVar2.f;
                listDataSet.l(0, listDataSet.d.size());
                if (qfeVar2.i == null) {
                    ClipsHolderViewImpl clipsHolderViewImpl = qfeVar2.b;
                    c cVar = new c(null, qfeVar2, clipsHolderViewImpl.getDataInfoProvider(), null, true, 5, true, 30, 1073741823, new j5j(qfeVar2.c.b), str3, null, null, null, false, false, true, true, true);
                    cVar.b(clipsHolderViewImpl, true, false, 0L, null);
                    qfeVar2.i = cVar;
                    cVar.r(true);
                }
                getAdapter().O0(str2);
            }
        }
        qfeVar2.d(list, true);
        boolean z = qfeVar2.d != null && qfeVar2.f.d.size() >= qfeVar2.d.intValue();
        c cVar2 = qfeVar2.i;
        if (cVar2 != null) {
            cVar2.r((str3 == null || str3.length() == 0 || list.isEmpty() || z) ? false : true);
        }
        c cVar3 = qfeVar2.i;
        if (cVar3 != null) {
            cVar3.s(str3);
        }
        RecyclerView recyclerView = qfeVar2.b.x;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        if (qfeVar2.i == null) {
        }
        getAdapter().O0(str2);
    }

    @Override // xsna.ai5
    public final y9t0 Eh(int i) {
        Object c = getAdapter().c.c(i);
        xjd.a aVar = c instanceof xjd.a ? (xjd.a) c : null;
        if (aVar == null) {
            return null;
        }
        VideoFile videoFile = aVar.a;
        bpn0 bpn0Var = b.B;
        return new y9t0(this.R.e(videoFile, null), new ni5(getAdapter().K0(), null, videoFile.r(), 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r0.b != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r4 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if ((r1 instanceof xsna.akd.c) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        r0 = com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.ClipsFromTrendsSource.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        com.vk.clips.viewer.api.routing.ClipsRouter.b(xsna.g620.f().a(), getContext(), r2, r12, null, xsna.fpf0.a(r0), null, false, 232);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        r0 = com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.ClipsFromShopsSource.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        if (r0.c != false) goto L48;
     */
    @Override // xsna.s0t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(fh5 fh5Var) {
        ClipFeedTab.SingleClipFromBlock.SourceBlockType sourceBlockType;
        List x;
        VideoFile videoFile = fh5Var.j != null ? fh5Var.o : null;
        if (videoFile == null) {
            return;
        }
        SdkVideoFile c = g620.f().e0().c(videoFile);
        String L0 = getAdapter().L0();
        if (L0 == null) {
            L0 = "null";
        }
        akd akdVar = this.U;
        if (akdVar == null) {
            akdVar = null;
        }
        if (akdVar instanceof akd.c) {
            sourceBlockType = ClipFeedTab.SingleClipFromBlock.SourceBlockType.RETENTION;
        } else if (akdVar instanceof akd.d) {
            sourceBlockType = ClipFeedTab.SingleClipFromBlock.SourceBlockType.SHOPS;
        } else if (akdVar instanceof akd.b) {
            sourceBlockType = ClipFeedTab.SingleClipFromBlock.SourceBlockType.RECOMMENDATION;
        } else {
            if (!(akdVar instanceof akd.a)) {
                throw new NoWhenBranchMatchedException();
            }
            sourceBlockType = ClipFeedTab.SingleClipFromBlock.SourceBlockType.OZON;
        }
        ClipFeedTab.SingleClipFromBlock singleClipFromBlock = new ClipFeedTab.SingleClipFromBlock(c, L0, sourceBlockType);
        cnc cncVar = this.T;
        if (cncVar == null) {
            cncVar = null;
        }
        cncVar.a(videoFile.I0(), Integer.valueOf(videoFile.o0()), getAdapter().L0());
        gaf A = getExperiments().A();
        if (getExperiments().I().a) {
            akd akdVar2 = this.U;
            akd akdVar3 = akdVar2 == null ? null : akdVar2;
            if (akdVar3 instanceof akd.d) {
                if (A.a) {
                }
            } else if (akdVar3 instanceof akd.c) {
                if (A.a) {
                }
            } else if (!(akdVar3 instanceof akd.a) && !(akdVar3 instanceof akd.b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        akd akdVar4 = this.U;
        r1 = akdVar4 != null ? akdVar4 : null;
        if ((r1 instanceof akd.c) || (r1 instanceof akd.b) || (r1 instanceof akd.a)) {
            x = x(singleClipFromBlock);
        } else {
            if (!(r1 instanceof akd.d)) {
                throw new NoWhenBranchMatchedException();
            }
            x = Collections.singletonList(singleClipFromBlock);
        }
        ClipsRouter.c(g620.f().a(), getContext(), x, fh5Var, null, null, null, null, false, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
    }

    public final pfe getAdapter() {
        pfe pfeVar = this.b0;
        if (pfeVar != null) {
            return pfeVar;
        }
        return null;
    }

    @Override // xsna.dkf0
    public int getAdapterOffset() {
        return 0;
    }

    @Override // xsna.dkf0
    public int getItemCount() {
        return getAdapter().getItemCount();
    }

    public final a getMeasureStrategy() {
        return this.a0;
    }

    @Override // xsna.ai5
    public VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return VideoAutoPlayDelayType.FEED_RECOMMENDED;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qfe qfeVar = this.S;
        if (qfeVar == null) {
            qfeVar = null;
        }
        qfeVar.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = wjs0.b.a0(asu0.a.d()).subscribe(new io1(new ul1(qfeVar, 25), 19), new ez(new p8(L.a, 2), 13));
        pgn pgnVar = qfeVar.l;
        qcy<Object> qcyVar = qfe.n[0];
        pgnVar.b(subscribe);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qfe qfeVar = this.S;
        if (qfeVar == null) {
            qfeVar = null;
        }
        pgn pgnVar = qfeVar.l;
        qcy<Object> qcyVar = qfe.n[0];
        pgnVar.b(null);
    }

    @Override // com.vk.lists.AbstractPaginatedView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        boolean onTouchEvent = this.Q.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!onTouchEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar = this.a0;
        if (aVar instanceof a.C1372a) {
            super.onMeasure(i, i2);
        } else if (aVar instanceof a.b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((a.b) aVar).a, 1073741824));
        } else {
            if (!(aVar instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a.c cVar = (a.c) aVar;
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != 1073741824 || size <= 0) {
                super.onMeasure(i, i2);
            } else {
                float paddingStart = (size - getPaddingStart()) - getPaddingEnd();
                float f = d0;
                cVar.getClass();
                int i3 = (int) ((((paddingStart - (f * 2.2f)) / 2.2f) / 9.0f) * 16.0f);
                measureChildren(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                setMeasuredDimension(size, i3);
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final void setAdapter(pfe pfeVar) {
        this.b0 = pfeVar;
    }

    public final void setMeasureStrategy(a aVar) {
        if (epx.f(this.a0, aVar)) {
            return;
        }
        this.a0 = aVar;
        requestLayout();
    }

    @Override // xsna.rfe
    public void setRef(String str) {
        getAdapter().N0(str);
    }

    @Override // xsna.rfe
    public void setTrackCode(String str) {
        getAdapter().O0(str);
    }

    public final void z(akd akdVar, boolean z) {
        Integer num;
        cnc g4fVar;
        v1f v1fVar;
        pfe pfeVar;
        this.U = akdVar;
        boolean z2 = akdVar instanceof akd.c;
        if (z2 || (akdVar instanceof akd.d) || (akdVar instanceof akd.a)) {
            num = 15;
        } else {
            if (!(akdVar instanceof akd.b)) {
                throw new NoWhenBranchMatchedException();
            }
            num = null;
        }
        qfe qfeVar = new qfe(this, getExperiments().T(), num, z);
        this.S = qfeVar;
        boolean z3 = akdVar instanceof akd.b;
        if (z3) {
            g4fVar = new kn4();
        } else if (z2) {
            g4fVar = new x1f();
        } else if (akdVar instanceof akd.a) {
            g4fVar = new hpe();
        } else {
            if (!(akdVar instanceof akd.d)) {
                throw new NoWhenBranchMatchedException();
            }
            g4fVar = new g4f();
        }
        this.T = g4fVar;
        ListDataSet<xjd> listDataSet = qfeVar.f;
        if (z3) {
            pfeVar = new e0f(listDataSet, this, this.c0);
        } else {
            if (z2) {
                v1fVar = new v1f(listDataSet, this, false, getBridgesComponent().x(), getClipsDataFormatter(), this.c0, 86);
            } else if (akdVar instanceof akd.a) {
                v1fVar = new v1f(listDataSet, this, false, getBridgesComponent().x(), getClipsDataFormatter(), this.c0, 102);
            } else {
                if (!(akdVar instanceof akd.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                v1fVar = new v1f(listDataSet, this, getExperiments().K(), getBridgesComponent().x(), getClipsDataFormatter(), this.c0, 54);
            }
            pfeVar = v1fVar;
        }
        setAdapter(pfeVar);
        setAdapter((RecyclerView.Adapter) getAdapter());
    }

    private static /* synthetic */ void getCornerRadius$annotations() {
    }
}

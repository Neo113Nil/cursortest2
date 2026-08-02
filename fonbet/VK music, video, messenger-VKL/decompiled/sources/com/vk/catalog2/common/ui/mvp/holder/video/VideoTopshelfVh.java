package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.pagination.VkPaginationDots;
import com.vk.core.view.components.pagination.a;
import com.vk.dto.common.VideoFileOld;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeTopshelfAction;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoChildProfileViews;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.b6l;
import xsna.bcp0;
import xsna.bdn;
import xsna.bwt0;
import xsna.caj0;
import xsna.ccp0;
import xsna.dnt0;
import xsna.ent0;
import xsna.f4m;
import xsna.g2u0;
import xsna.g470;
import xsna.glt0;
import xsna.hbh0;
import xsna.hlt0;
import xsna.hpj;
import xsna.hqu0;
import xsna.hrr0;
import xsna.ie00;
import xsna.iid0;
import xsna.j5g;
import xsna.l5m;
import xsna.lyd;
import xsna.myc0;
import xsna.nnt0;
import xsna.nsd0;
import xsna.qcy;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.u4a;
import xsna.wzs;
import xsna.xcp0;
import xsna.xh5;
import xsna.xlq0;
import xsna.ybp0;
import xsna.yg5;
import xsna.yok0;
import xsna.yvj;
import xsna.zvj;

/* compiled from: VideoTopshelfVh.kt */
/* loaded from: classes16.dex */
public final class VideoTopshelfVh implements CatalogViewHolder, View.OnClickListener, ent0 {
    public final u4a b;
    public final boolean c;
    public g470 d;
    public ViewPager2 e;
    public int f;
    public int g;
    public VkPaginationDots h;
    public xcp0 i;
    public yok0 k;
    public ViewGroup t;
    public glt0 u;
    public volatile boolean v;
    public final hpj j = zvj.a(hqu0.a());
    public final int l = 100;
    public final long m = 100;
    public final caj0 n = lyd.b(1, 0, null, 6);
    public final LinkedHashMap o = new LinkedHashMap();
    public final b p = new b();
    public final ccp0 q = new ccp0();
    public final hrr0 r = new hrr0();
    public final long s = SystemClock.elapsedRealtime();

    /* compiled from: VideoTopshelfVh.kt */
    public final class a extends ViewPager2.g {
        public int d = -1;
        public boolean e;

        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
            if (i == 1) {
                this.e = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0044  */
        @Override // androidx.viewpager2.widget.ViewPager2.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onPageSelected(int i) {
            String str;
            xcp0 xcp0Var;
            boolean z;
            yok0 yok0Var;
            yok0 yok0Var2;
            yg5 yg5Var;
            yg5 yg5Var2;
            boolean z2;
            bcp0.b bVar;
            UIBlockTopshelf.TopshelfItem topshelfItem;
            UIBlockTopshelf.a aVar;
            VideoTopshelfVh videoTopshelfVh = VideoTopshelfVh.this;
            xcp0 xcp0Var2 = videoTopshelfVh.i;
            if (xcp0Var2 != null && (bVar = xcp0Var2.q) != null) {
                List<UIBlockTopshelf.TopshelfItem> list = bVar.a;
                if (i >= 0 && i < list.size() && (topshelfItem = (UIBlockTopshelf.TopshelfItem) j5g.b0(i, list)) != null && (aVar = topshelfItem.d) != null) {
                    str = aVar.b.d();
                    iid0 iid0Var = new iid0();
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    MobileOfficialAppsVideoStat$TypeTopshelfAction.EventType eventType = i <= this.d ? MobileOfficialAppsVideoStat$TypeTopshelfAction.EventType.TOPSHELF_NEXT_CARD_SHOW : MobileOfficialAppsVideoStat$TypeTopshelfAction.EventType.TOPSHELF_PREV_CARD_SHOW;
                    MobileOfficialAppsVideoStat$TypeTopshelfAction.EventSubtype eventSubtype = !this.e ? MobileOfficialAppsVideoStat$TypeTopshelfAction.EventSubtype.MANUAL : MobileOfficialAppsVideoStat$TypeTopshelfAction.EventSubtype.AUTO;
                    if (str == null) {
                        str = "";
                    }
                    SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeTopshelfAction(eventType, eventSubtype, str), 3);
                    iid0Var.f = c;
                    iid0Var.g = b;
                    iid0Var.q();
                    xcp0Var = videoTopshelfVh.i;
                    if (xcp0Var != null) {
                        bcp0.b bVar2 = xcp0Var.q;
                        if (bVar2 != null) {
                            List<UIBlockTopshelf.TopshelfItem> list2 = bVar2.a;
                            if (i >= 0 && i < list2.size()) {
                                z2 = j5g.b0(i, list2) instanceof UIBlockTopshelf.TopshelfKids;
                                if (z2) {
                                    z = true;
                                    if (z) {
                                        nsd0 nsd0Var = new nsd0();
                                        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                                        SchemeStat$TypeView b2 = SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), "", "", null, new MobileOfficialAppsVideoStat$TypeVideoChildProfileViews(MobileOfficialAppsVideoStat$TypeVideoChildProfileViews.EventType.SHOW_BANNER, MobileOfficialAppsVideoStat$TypeVideoChildProfileViews.ObjectValue.KID_PROFILE_FOR_KIDS), 8);
                                        nsd0Var.f = c2;
                                        nsd0Var.g = b2;
                                        nsd0Var.q();
                                    }
                                    videoTopshelfVh.f = i;
                                    this.d = i;
                                    xh5 xh5Var = (xh5) videoTopshelfVh.o.get(Integer.valueOf(i));
                                    videoTopshelfVh.b((xh5Var != null || (yg5Var2 = xh5Var.a) == null) ? false : yg5Var2.v() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
                                    yok0Var = videoTopshelfVh.k;
                                    if (yok0Var != null) {
                                        yok0Var.b(null);
                                    }
                                    yok0Var2 = videoTopshelfVh.k;
                                    if (yok0Var2 != null) {
                                        yok0Var2.b(null);
                                    }
                                    if (videoTopshelfVh.g > 1) {
                                        VkPaginationDots vkPaginationDots = videoTopshelfVh.h;
                                        if (vkPaginationDots != null) {
                                            vkPaginationDots.setVisibility(0);
                                        }
                                        xh5 xh5Var2 = (xh5) videoTopshelfVh.o.get(Integer.valueOf(videoTopshelfVh.f));
                                        videoTopshelfVh.k = myc0.h(videoTopshelfVh.j, null, null, new hlt0((xh5Var2 == null || (yg5Var = xh5Var2.a) == null) ? false : yg5Var.v(), videoTopshelfVh, null), 3);
                                    } else {
                                        VkPaginationDots vkPaginationDots2 = videoTopshelfVh.h;
                                        if (vkPaginationDots2 != null) {
                                            f4m.j(vkPaginationDots2);
                                        }
                                    }
                                    videoTopshelfVh.n.e(new ybp0.d(i));
                                    this.e = false;
                                    if (videoTopshelfVh.v) {
                                        videoTopshelfVh.v = false;
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                    z = false;
                    if (z) {
                    }
                    videoTopshelfVh.f = i;
                    this.d = i;
                    xh5 xh5Var3 = (xh5) videoTopshelfVh.o.get(Integer.valueOf(i));
                    videoTopshelfVh.b((xh5Var3 != null || (yg5Var2 = xh5Var3.a) == null) ? false : yg5Var2.v() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
                    yok0Var = videoTopshelfVh.k;
                    if (yok0Var != null) {
                    }
                    yok0Var2 = videoTopshelfVh.k;
                    if (yok0Var2 != null) {
                    }
                    if (videoTopshelfVh.g > 1) {
                    }
                    videoTopshelfVh.n.e(new ybp0.d(i));
                    this.e = false;
                    if (videoTopshelfVh.v) {
                    }
                }
            }
            str = null;
            iid0 iid0Var2 = new iid0();
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
            if (i <= this.d) {
            }
            if (!this.e) {
            }
            if (str == null) {
            }
            SchemeStat$TypeAction b3 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeTopshelfAction(eventType, eventSubtype, str), 3);
            iid0Var2.f = c3;
            iid0Var2.g = b3;
            iid0Var2.q();
            xcp0Var = videoTopshelfVh.i;
            if (xcp0Var != null) {
            }
            z = false;
            if (z) {
            }
            videoTopshelfVh.f = i;
            this.d = i;
            xh5 xh5Var32 = (xh5) videoTopshelfVh.o.get(Integer.valueOf(i));
            videoTopshelfVh.b((xh5Var32 != null || (yg5Var2 = xh5Var32.a) == null) ? false : yg5Var2.v() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
            yok0Var = videoTopshelfVh.k;
            if (yok0Var != null) {
            }
            yok0Var2 = videoTopshelfVh.k;
            if (yok0Var2 != null) {
            }
            if (videoTopshelfVh.g > 1) {
            }
            videoTopshelfVh.n.e(new ybp0.d(i));
            this.e = false;
            if (videoTopshelfVh.v) {
            }
        }
    }

    /* compiled from: VideoTopshelfVh.kt */
    public final class b implements nnt0 {
        public boolean b;
        public boolean c;
        public final xh5 d;

        public b() {
            this.d = new xh5(new com.vk.libvideo.autoplay.d(new VideoFileOld()), new com.vk.libvideo.autoplay.a(false, null, null, false, false, false, null, null, null, null, null, null, false, null, 524287), null, null, VideoTopshelfVh.this);
        }

        @Override // xsna.dnt0
        public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
            return null;
        }

        @Override // xsna.dnt0
        public final boolean getVideoFocused() {
            return this.b;
        }

        @Override // xsna.nnt0
        public final xh5 i() {
            VideoTopshelfVh videoTopshelfVh = VideoTopshelfVh.this;
            LinkedHashMap linkedHashMap = videoTopshelfVh.o;
            ViewPager2 viewPager2 = videoTopshelfVh.e;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            xh5 xh5Var = (xh5) linkedHashMap.get(Integer.valueOf(viewPager2.getCurrentItem()));
            yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
            ViewPager2 viewPager22 = videoTopshelfVh.e;
            if (viewPager22 == null) {
                viewPager22 = null;
            }
            xh5 xh5Var2 = (xh5) linkedHashMap.get(Integer.valueOf(viewPager22.getCurrentItem()));
            VideoTextureView c = xh5Var2 != null ? xh5Var2.c() : null;
            xh5 xh5Var3 = (yg5Var == null || c == null) ? null : new xh5(yg5Var, yg5Var.getConfig(), c, null, videoTopshelfVh);
            if (xh5Var3 != null) {
                return xh5Var3;
            }
            if (this.c) {
                return this.d;
            }
            return null;
        }

        @Override // xsna.nnt0
        public final void onPause() {
            glt0 glt0Var = VideoTopshelfVh.this.u;
            if (glt0Var != null) {
                glt0Var.b();
            }
            VideoTopshelfVh.this.v = true;
            VideoTopshelfVh.this.n.e(ybp0.a.a);
        }

        @Override // xsna.nnt0
        public final void onResume() {
            VideoTopshelfVh.this.v = false;
            VideoTopshelfVh.this.n.e(ybp0.b.a);
        }

        @Override // xsna.dnt0
        public final void setVideoFocused(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: VideoTopshelfVh.kt */
    public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Boolean.valueOf(((b) this.receiver).b);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((b) this.receiver).b = ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: VideoTopshelfVh.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<Long, String, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(Long l, String str) {
            long longValue = l.longValue();
            ((ccp0) this.receiver).getClass();
            l5m l5mVar = new l5m(null, null, 3);
            l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CATALOG_TOPSHELF_IMAGE_LOAD_DURATION.h(), null, String.valueOf(longValue), null, str, null, "OLD CATALOG TOP SHELF LOAD DURATION", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -86, 3, null);
            l5mVar.q();
            return s3q0.a;
        }
    }

    /* compiled from: VideoTopshelfVh.kt */
    @b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh$createView$1", f = "VideoTopshelfVh.kt", l = {SQLiteStatementType.STATEMENT_OTHER}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: VideoTopshelfVh.kt */
        @b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh$createView$1$1", f = "VideoTopshelfVh.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<ybp0, spj<? super s3q0>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ VideoTopshelfVh this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VideoTopshelfVh videoTopshelfVh, spj<? super a> spjVar) {
                super(2, spjVar);
                this.this$0 = videoTopshelfVh;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.this$0, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(ybp0 ybp0Var, spj<? super s3q0> spjVar) {
                return ((a) create(ybp0Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ybp0 ybp0Var = (ybp0) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                VideoTopshelfVh videoTopshelfVh = this.this$0;
                if (ybp0Var instanceof ybp0.e) {
                    videoTopshelfVh.v = true;
                } else if (ybp0Var instanceof ybp0.f) {
                    videoTopshelfVh.v = false;
                } else {
                    videoTopshelfVh.getClass();
                }
                return s3q0.a;
            }
        }

        public e(spj<? super e> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return VideoTopshelfVh.this.new e(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                VideoTopshelfVh videoTopshelfVh = VideoTopshelfVh.this;
                caj0 caj0Var = videoTopshelfVh.n;
                a aVar = new a(videoTopshelfVh, null);
                this.label = 1;
                if (rsr.k(caj0Var, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public VideoTopshelfVh(u4a u4aVar, boolean z) {
        this.b = u4aVar;
        this.c = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        glt0 glt0Var = this.u;
        if (glt0Var != null) {
            glt0Var.b();
        }
        yok0 yok0Var = this.k;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        zvj.c(this.j, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        b bVar = this.p;
        ViewGroup viewGroup = this.t;
        Activity c2 = viewGroup != null ? g2u0.c(viewGroup) : null;
        FragmentActivity fragmentActivity = c2 instanceof FragmentActivity ? (FragmentActivity) c2 : null;
        if (fragmentActivity != null) {
            xcp0 xcp0Var = new xcp0(fragmentActivity, this.b.b.c, this.n, this.o, new c(bVar, b.class, "videoFocused", "getVideoFocused()Z", 0), this.c);
            this.i = xcp0Var;
            ViewPager2 viewPager2 = this.e;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            viewPager2.setAdapter(xcp0Var);
        }
        UIBlockTopshelf uIBlockTopshelf = uIBlock instanceof UIBlockTopshelf ? (UIBlockTopshelf) uIBlock : null;
        if (uIBlockTopshelf != null) {
            List<UIBlockTopshelf.TopshelfItem> list = uIBlockTopshelf.y;
            boolean z = true;
            bcp0.b bVar2 = new bcp0.b(list, uIBlockTopshelf.f, new d(2, this.q, ccp0.class, "onImageLoadFinished", "onImageLoadFinished(JLjava/lang/String;)V", 0), list.size() > 1);
            List<UIBlockTopshelf.TopshelfItem> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((UIBlockTopshelf.TopshelfItem) it.next()).d.f.g() != null) {
                        break;
                    }
                }
            }
            z = false;
            bVar.c = z;
            xcp0 xcp0Var2 = this.i;
            if (xcp0Var2 != null) {
                xcp0Var2.q = bVar2;
                xcp0Var2.notifyDataSetChanged();
            }
            int size = bVar2.a.size();
            this.g = size;
            if (size <= 0) {
                g470 g470Var = this.d;
                bwt0.c0(0, g470Var != null ? g470Var : null);
            } else {
                a();
            }
        }
        if (this.v) {
            this.v = false;
        }
    }

    public final void a() {
        float f;
        g470 g470Var = this.d;
        if (g470Var == null) {
            g470Var = null;
        }
        int i = g470Var.getContext().getResources().getDisplayMetrics().widthPixels;
        boolean z = this.b.b.c;
        if (z) {
            g470 g470Var2 = this.d;
            if (g470Var2 == null) {
                g470Var2 = null;
            }
            f = g470Var2.getResources().getDimension(R.dimen.video_topshelf_tablet_height);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            f = i / 0.89285713f;
        }
        int i2 = (int) f;
        g470 g470Var3 = this.d;
        (g470Var3 != null ? g470Var3 : null).setLayoutParams(new GridLayoutManager.b(-1, i2));
    }

    public final void b(float f, int i) {
        VkPaginationDots vkPaginationDots = this.h;
        if (vkPaginationDots != null) {
            vkPaginationDots.setDotsCount(this.g);
        }
        VkPaginationDots vkPaginationDots2 = this.h;
        if (vkPaginationDots2 != null) {
            vkPaginationDots2.setMode(new a.b(f));
        }
        VkPaginationDots vkPaginationDots3 = this.h;
        if (vkPaginationDots3 != null) {
            vkPaginationDots3.setCurrentDotIndex(i);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bdn bdnVar = bdn.a;
        myc0.h(zvj.a(ie00.a), null, null, new e(null), 3);
        g470 g470Var = new g470(layoutInflater.getContext());
        this.d = g470Var;
        g470Var.setId(R.id.video_topshelf_root);
        this.t = viewGroup;
        ViewPager2 viewPager2 = new ViewPager2(layoutInflater.getContext());
        this.e = viewPager2;
        viewPager2.setId(R.id.video_topshelf_view_pager);
        viewPager2.setLayoutParams(new ConstraintLayout.b(-1, -1));
        viewPager2.b(new a());
        viewPager2.setOffscreenPageLimit(-1);
        ViewPager2 viewPager22 = this.e;
        if (viewPager22 == null) {
            viewPager22 = null;
        }
        View childAt = viewPager22.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        this.u = recyclerView != null ? new glt0(recyclerView, new xlq0(5)) : null;
        g470Var.addView(viewPager2);
        VkPaginationDots vkPaginationDots = new VkPaginationDots(layoutInflater.getContext(), null, 6);
        vkPaginationDots.setId(R.id.video_topshelf_indicators);
        qcy<Object>[] qcyVarArr = bwt0.a;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, (int) vkPaginationDots.getResources().getDimension(R.dimen.video_topshelf_content_margin_bottom));
        bVar.l = 0;
        vkPaginationDots.setLayoutParams(bVar);
        vkPaginationDots.setMaxVisibleDots(12);
        vkPaginationDots.setPadding(0, hbh0.b(15, vkPaginationDots.getContext()), 0, hbh0.b(3, vkPaginationDots.getContext()));
        this.h = vkPaginationDots;
        g470Var.addView(vkPaginationDots);
        a();
        g470 g470Var2 = this.d;
        this.r.a("VideoTopshelfVh", g470Var2 != null ? g470Var2 : null, this.s);
        return g470Var;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.p;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}

package com.vk.profile.core.cover;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.profile.core.cover.ProfileCover;
import com.vk.profile.core.cover.a;
import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.awf;
import xsna.bpn0;
import xsna.bwt0;
import xsna.e3m;
import xsna.f20;
import xsna.f4m;
import xsna.iah0;
import xsna.im80;
import xsna.kv3;
import xsna.nvd0;
import xsna.pvd0;
import xsna.s3q0;
import xsna.swe0;
import xsna.tr;

/* compiled from: ProfileCoverDelegate.kt */
/* loaded from: classes5.dex */
public final class a {
    public final VkImage a;
    public final VkImage b;
    public final SnowballsCoverHolder c;
    public final RecyclerView d;
    public final Context e;
    public final int f;
    public final int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final ArrayList l;
    public final bpn0 m;
    public final bpn0 n;
    public final nvd0 o;
    public float p;
    public ProfileCover.Mode q;

    /* compiled from: ProfileCoverDelegate.kt */
    /* renamed from: com.vk.profile.core.cover.a$a, reason: collision with other inner class name */
    public interface InterfaceC1639a {
        void a(float f);
    }

    /* compiled from: ProfileCoverDelegate.kt */
    public final class b extends RecyclerView.t {
        public final Handler b = new Handler(Looper.getMainLooper());
        public boolean c = true;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            this.c = i == 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            View findViewByPosition;
            final a aVar = a.this;
            int i3 = aVar.i;
            Integer valueOf = Integer.valueOf(i3);
            if (i3 <= 0) {
                valueOf = null;
            }
            float intValue = (valueOf != null ? valueOf.intValue() : aVar.a.getMeasuredHeight()) - aVar.h;
            RecyclerView.o layoutManager = aVar.d.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            float top = (linearLayoutManager == null || (findViewByPosition = linearLayoutManager.findViewByPosition(0)) == null) ? 0.0f : findViewByPosition.getTop();
            if (top < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                aVar.a(1.0f);
                return;
            }
            if (intValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            float floatValue = ((Number) swe0.k(Float.valueOf(intValue - top), new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue))).floatValue();
            final float f = floatValue / intValue;
            aVar.a(f);
            if (!aVar.k || intValue <= floatValue) {
                return;
            }
            final float f2 = intValue - floatValue;
            Handler handler = this.b;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new Runnable() { // from class: xsna.qvd0
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.b.this.c) {
                        float f3 = f;
                        com.vk.profile.core.cover.a aVar2 = aVar;
                        float f4 = f2;
                        if (f3 > 0.5f) {
                            aVar2.d.smoothScrollBy(0, (int) f4, new LinearInterpolator());
                        } else {
                            aVar2.d.smoothScrollBy(0, -((int) f4), new LinearInterpolator());
                        }
                    }
                }
            }, 50L);
        }
    }

    /* compiled from: ProfileCoverDelegate.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfileCover.Mode.values().length];
            try {
                iArr[ProfileCover.Mode.GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileCover.Mode.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileCover.Mode.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileCover.Mode.SOLID_COLOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProfileCover.Mode.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [xsna.nvd0] */
    public a(VkImage vkImage, VkImage vkImage2, SnowballsCoverHolder snowballsCoverHolder, RecyclerView recyclerView) {
        this.a = vkImage;
        this.b = vkImage2;
        this.c = snowballsCoverHolder;
        this.d = recyclerView;
        Context context = vkImage.getContext();
        this.e = context;
        this.f = e3m.a(R.dimen.profile_avatar_background_offset, context);
        HashSet hashSet = iah0.a;
        this.g = context.getResources().getDisplayMetrics().heightPixels;
        this.k = true;
        this.l = new ArrayList();
        this.m = new bpn0(new f20(29));
        this.n = new bpn0(new im80(2));
        b bVar = new b();
        this.o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.nvd0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                com.vk.profile.core.cover.a aVar = com.vk.profile.core.cover.a.this;
                aVar.a.post(new wk(aVar, 16));
            }
        };
        recyclerView.addOnScrollListener(bVar);
        recyclerView.setClipToPadding(false);
        vkImage.addOnAttachStateChangeListener(new pvd0(this));
        vkImage2.setScaleY(-1.0f);
        this.l.add(new InterfaceC1639a() { // from class: xsna.ovd0
            @Override // com.vk.profile.core.cover.a.InterfaceC1639a
            public final void a(float f) {
                bwt0.p0(com.vk.profile.core.cover.a.this.b, f < 0.5f);
            }
        });
    }

    public final void a(float f) {
        this.p = f;
        float f2 = 1 - f;
        this.a.setAlpha(f2);
        this.c.a.setAlpha(f2);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((InterfaceC1639a) it.next()).a(f);
        }
    }

    public final void b(boolean z) {
        int i = this.i;
        Integer valueOf = Integer.valueOf(i);
        if (i <= 0) {
            valueOf = null;
        }
        VkImage vkImage = this.a;
        int intValue = valueOf != null ? valueOf.intValue() : swe0.g((int) (vkImage.getWidth() / 2.5f), 0, this.g);
        VkImage vkImage2 = this.b;
        f4m.t(intValue, vkImage2);
        bwt0.c0(intValue, vkImage);
        bwt0.c0(intValue, vkImage2);
        SnowballsCoverView snowballsCoverView = this.c.a;
        bwt0.c0(intValue, snowballsCoverView);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(0, 1073741823)), 0);
        int a = tr.a(intValue, 1073741823, 0, 1073741824);
        vkImage.measure(makeMeasureSpec, a);
        vkImage2.measure(makeMeasureSpec, a);
        snowballsCoverView.measure(makeMeasureSpec, a);
        RecyclerView recyclerView = this.d;
        int paddingTop = recyclerView.getPaddingTop();
        int i2 = this.q == ProfileCover.Mode.NONE ? this.j : (intValue - this.h) + this.f;
        f4m.y(i2, recyclerView);
        recyclerView.post(new kv3(this, 17));
        ((GradientDrawable) this.m.getValue()).setGradientRadius(Math.max(intValue, vkImage.getWidth() / 2.0f));
        if (z) {
            try {
                recyclerView.scrollBy(0, paddingTop - i2);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        }
    }
}

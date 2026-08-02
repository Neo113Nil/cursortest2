package com.vk.newsfeed.posting.market_picker.presentation.base.view;

import android.graphics.RectF;
import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;
import xsna.an10;
import xsna.bik;
import xsna.bqt;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.iah0;
import xsna.lpa0;
import xsna.o0o0;
import xsna.pha0;
import xsna.rhs;
import xsna.s3q0;
import xsna.tf3;
import xsna.u4q0;
import xsna.vam;
import xsna.x9g0;
import xsna.yiz;
import xsna.zik0;

/* compiled from: PhotoAdapter.kt */
/* loaded from: classes4.dex */
public final class h extends PagerAdapter {
    public final ArrayList b;
    public final LayoutInflater c;
    public final f d;
    public final e e;
    public final o0o0 f;
    public e.c g;
    public boolean l;
    public Integer m;
    public vam n;
    public bqt o;
    public final SparseArray<d> h = new SparseArray<>();
    public final SparseArray<ClippingImageView> i = new SparseArray<>();
    public final SparseBooleanArray j = new SparseBooleanArray();
    public final SparseBooleanArray k = new SparseBooleanArray();
    public final SparseArray<ViewTreeObserver.OnPreDrawListener> p = new SparseArray<>();

    /* compiled from: PhotoAdapter.kt */
    public final class a implements ViewTreeObserver.OnPreDrawListener {
        public final RectF b = new RectF();

        public a() {
        }

        public static boolean a(float f, float f2) {
            return ((double) Math.abs(f - f2)) < 0.001d;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            e.c cVar = h.this.g;
            RectF rectF = null;
            if (cVar != null) {
                e eVar = e.this;
                PhotoViewPager photoViewPager = eVar.s;
                d dVar = eVar.l.h.get(cVar.b);
                d dVar2 = dVar instanceof d ? dVar : null;
                RectF displayRect = dVar2 != null ? dVar2.k.getDisplayRect() : null;
                if (displayRect != null) {
                    rectF = e.x;
                    rectF.set(displayRect);
                    rectF.top = photoViewPager.getTranslationY() + rectF.top;
                    rectF.bottom = photoViewPager.getTranslationY() + rectF.bottom;
                    float f = rectF.left;
                    float f2 = eVar.o;
                    rectF.left = f - f2;
                    rectF.right -= f2;
                }
            }
            RectF rectF2 = this.b;
            if ((rectF != null && a(rectF.left, rectF2.left) && a(rectF.right, rectF2.right) && a(rectF.top, rectF2.top) && a(rectF.bottom, rectF2.bottom)) || rectF == null) {
                return true;
            }
            rectF2.set(rectF);
            return true;
        }
    }

    /* compiled from: PhotoAdapter.kt */
    public final class b {
        public b() {
        }
    }

    public h(ArrayList arrayList, LayoutInflater layoutInflater, f fVar, e eVar, o0o0 o0o0Var) {
        this.b = arrayList;
        this.c = layoutInflater;
        this.d = fVar;
        this.e = eVar;
        this.f = o0o0Var;
    }

    public final void b(int i) {
        ClippingImageView clippingImageView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        if (!this.l || !this.j.get(i) || (clippingImageView = this.i.get(i)) == null || (animate = clippingImageView.animate()) == null || (duration = animate.setDuration(50L)) == null) {
            return;
        }
        duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void c(Photo photo, ArrayList arrayList, boolean z) {
        u4q0 u4q0Var = zik0.a;
        int i = 0;
        while (true) {
            SparseArray<d> sparseArray = this.h;
            if (i >= sparseArray.size()) {
                return;
            }
            int i2 = i + 1;
            d valueAt = sparseArray.valueAt(i);
            if (epx.f(valueAt.c.d, photo)) {
                pha0 pha0Var = valueAt.j;
                ArrayList arrayList2 = pha0Var.e;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                pha0Var.f = z;
                pha0Var.b();
            }
            i = i2;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        d dVar;
        ViewGroup viewGroup2;
        ViewTreeObserver viewTreeObserver;
        viewGroup.removeView((View) obj);
        SparseArray<ViewTreeObserver.OnPreDrawListener> sparseArray = this.p;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = sparseArray.get(i);
        SparseArray<d> sparseArray2 = this.h;
        if (onPreDrawListener != null && (dVar = sparseArray2.get(i)) != null && (viewGroup2 = dVar.a) != null && (viewTreeObserver = viewGroup2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
        sparseArray.remove(i);
        d dVar2 = sparseArray2.get(i);
        if (dVar2 != null) {
            dVar2.a.removeCallbacks(dVar2.i);
        }
        sparseArray2.remove(i);
        this.i.remove(i);
        this.d.j.getClass();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        String str;
        e.b bVar = (e.b) this.b.get(i);
        ViewGroup viewGroup2 = (ViewGroup) this.c.inflate(R.layout.market_picker_viewer_container, viewGroup, false);
        ClippingImageView clippingImageView = (ClippingImageView) viewGroup2.findViewById(R.id.pv_preview_image);
        b bVar2 = new b();
        vam vamVar = this.n;
        bqt bqtVar = this.o;
        ViewGroup viewGroup3 = (ViewGroup) tf3.b(viewGroup2, R.layout.market_picker_page_item, viewGroup2, false);
        d dVar = new d(viewGroup3, i, bVar, bVar2, clippingImageView, vamVar, bqtVar);
        dVar.j.i = this.f;
        viewGroup2.addView(viewGroup3, new FrameLayout.LayoutParams(-1, -1));
        String str2 = bVar.c;
        ImageCropArea imageCropArea = bVar.e;
        bik bikVar = new bik();
        int i2 = bVar.h;
        int i3 = bVar.i;
        int max = Math.max(i2, i3);
        int z = iah0.z(viewGroup.getContext());
        float f = (z <= 0 || max <= z) ? 1.0f : z / max;
        if (imageCropArea != null) {
            int i4 = imageCropArea.g;
            str = str2;
            bikVar.f(an10.b(imageCropArea.f * f), an10.b(i4 * f));
            float f2 = imageCropArea.d * 100.0f;
            float f3 = bVar.f;
            float f4 = f2 / f3;
            float f5 = ((r3 + r13) * 100.0f) / f3;
            int i5 = imageCropArea.e;
            float f6 = bVar.g;
            bikVar.g(f4, f5, (i5 * 100.0f) / f6, ((i5 + i4) * 100.0f) / f6);
        } else {
            str = str2;
            bikVar = null;
        }
        int b2 = an10.b(i2 * f);
        int b3 = an10.b(f * i3);
        x9g0 x9g0Var = (b2 <= 0 || b3 <= 0) ? null : new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b2, b3, 12);
        ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
        h.d = x9g0Var;
        h.j = Priority.HIGH;
        h.k = bikVar;
        ImageRequest a2 = h.a();
        clippingImageView.getHierarchy().q(0);
        lpa0 lpa0Var = rhs.a().get();
        ListBuilder e = e43.e();
        e.add(a2);
        s3q0 s3q0Var = s3q0.a;
        lpa0Var.k(e.g().toArray(new ImageRequest[0]));
        yiz.b(lpa0Var, viewGroup.getContext(), null);
        lpa0Var.h = new i(this, i, clippingImageView);
        clippingImageView.setController(lpa0Var.b());
        this.i.put(i, clippingImageView);
        a aVar = new a();
        this.p.put(i, aVar);
        viewGroup2.getViewTreeObserver().addOnPreDrawListener(aVar);
        viewGroup.addView(viewGroup2);
        this.h.put(i, dVar);
        return viewGroup2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        d dVar;
        super.setPrimaryItem(viewGroup, i, obj);
        Integer num = this.m;
        if ((num == null || num.intValue() != i) && (dVar = this.h.get(i)) != null && dVar.h == 2 && enj.n(dVar.a.getContext())) {
            dVar.b(dVar.k);
        }
        this.m = Integer.valueOf(i);
    }
}

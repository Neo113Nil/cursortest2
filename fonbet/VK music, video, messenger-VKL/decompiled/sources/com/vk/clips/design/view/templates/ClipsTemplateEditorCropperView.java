package com.vk.clips.design.view.templates;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.b;
import androidx.viewpager2.widget.c;
import com.vk.clips.design.view.templates.ClipsTemplateEditorCropperView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.a7f;
import xsna.c7f;
import xsna.d7f;
import xsna.e4;
import xsna.eb;
import xsna.il1;
import xsna.jjc;
import xsna.m67;
import xsna.msy;
import xsna.nhe;
import xsna.p6f;
import xsna.q6f;
import xsna.t6f;
import xsna.u6f;
import xsna.v6f;
import xsna.y6f;
import xsna.z6f;
import xsna.zt4;

/* compiled from: ClipsTemplateEditorCropperView.kt */
/* loaded from: classes16.dex */
public final class ClipsTemplateEditorCropperView extends ConstraintLayout implements q6f {
    public static final /* synthetic */ int z = 0;
    public final z6f t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final y6f x;
    public d7f y;

    public ClipsTemplateEditorCropperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        z6f z6fVar = new z6f(this);
        this.t = z6fVar;
        eb ebVar = new eb(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.u = msy.a(lazyThreadSafetyMode, ebVar);
        this.v = msy.a(lazyThreadSafetyMode, new e4(this, 19));
        this.w = msy.a(lazyThreadSafetyMode, new il1(this, 26));
        y6f y6fVar = new y6f(z6fVar);
        this.x = y6fVar;
        LayoutInflater.from(context).inflate(R.layout.clips_template_editor_cropper_view, (ViewGroup) this, true);
        ViewPager2 viewPager = getViewPager();
        viewPager.setAdapter(y6fVar);
        viewPager.setOffscreenPageLimit(40);
        viewPager.setUserInputEnabled(false);
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        b bVar = new b();
        c cVar = new c(0);
        ArrayList arrayList = bVar.a;
        arrayList.add(cVar);
        arrayList.add(new t6f());
        arrayList.add(new v6f());
        viewPager.setPageTransformer(bVar);
        jjc.g(getSlideLeftControl(), new nhe(this, 2));
        jjc.g(getSlideRightControl(), new zt4(this, 19));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSlideLeftControl() {
        return (View) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSlideRightControl() {
        return (View) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewPager2 getViewPager() {
        return (ViewPager2) this.w.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCurrentItem$lambda$6(ClipsTemplateEditorCropperView clipsTemplateEditorCropperView) {
        clipsTemplateEditorCropperView.getViewPager().c();
    }

    public final void Q4(int i, boolean z2) {
        if (!z2) {
            getViewPager().e(i, false);
            getViewPager().postDelayed(new m67(this, 2), 100L);
            return;
        }
        d7f d7fVar = this.y;
        if (d7fVar != null) {
            d7fVar.dismiss();
        }
        ViewPager2 viewPager = getViewPager();
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (i - viewPager.getCurrentItem()) * ((viewPager.getWidth() - viewPager.getPaddingLeft()) - viewPager.getPaddingRight()));
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        View childAt = viewPager.getChildAt(0);
        final RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.b7f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = ClipsTemplateEditorCropperView.z;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                float f = intValue - ref$IntRef2.element;
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView2 != null) {
                    recyclerView2.scrollBy((int) f, 0);
                }
                ref$IntRef2.element = intValue;
            }
        });
        ofInt.addListener(new c7f(viewPager, i));
        ofInt.setInterpolator(accelerateDecelerateInterpolator);
        ofInt.setDuration(300L);
        ofInt.start();
        this.y = new d7f(ofInt);
    }

    public a7f getState() {
        return this.t.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t.b.dispose();
    }

    @Override // xsna.q6f
    @SuppressLint({"NotifyDataSetChanged"})
    public void setPagerItems(List<u6f> list) {
        y6f y6fVar = this.x;
        y6fVar.d = list;
        y6fVar.notifyDataSetChanged();
    }

    public final void setProvider(p6f p6fVar) {
        this.t.d = p6fVar;
    }

    public void setState(a7f a7fVar) {
        this.t.c = a7fVar;
    }
}

package com.vk.stickers.popup;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stickers.popup.PopupLayerGradientPositionType;
import com.vk.dto.stickers.popup.PopupLayerPositionXType;
import com.vk.dto.stickers.popup.PopupLayerPositionYType;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.stickers.popup.PopupStickerAnimationLayer;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.g;
import io.reactivex.rxjava3.internal.operators.observable.e3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.an10;
import xsna.bpn0;
import xsna.c5g;
import xsna.c7r0;
import xsna.cn70;
import xsna.da50;
import xsna.dy0;
import xsna.gzs;
import xsna.io60;
import xsna.juz;
import xsna.lav;
import xsna.mwb0;
import xsna.n9w;
import xsna.nuj;
import xsna.owv;
import xsna.pmu;
import xsna.qro0;
import xsna.rn9;
import xsna.s3q0;
import xsna.uxb0;
import xsna.vxb0;
import xsna.wxb0;
import xsna.x620;
import xsna.xwb0;
import xsna.xxb0;
import xsna.z8;

/* compiled from: PopupStickerView.kt */
/* loaded from: classes6.dex */
public final class PopupStickerView extends FrameLayout {
    public static final AtomicInteger q = new AtomicInteger(0);
    public static final int[] r = {Color.argb(255, 0, 0, 0), Color.argb(0, 0, 0, 0)};
    public static final int s = cn70.b(64);
    public PopupStickerAnimation b;
    public final vxb0 c;
    public xwb0 d;
    public final LinkedHashMap e;
    public int f;
    public int g;
    public Integer h;
    public final io.reactivex.rxjava3.disposables.b i;
    public Map<String, String> j;
    public gzs<s3q0> k;
    public gzs<s3q0> l;
    public boolean m;
    public boolean n;
    public BottomSheetBehavior<View> o;
    public b p;

    /* compiled from: PopupStickerView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PopupLayerGradientPositionType.values().length];
            try {
                iArr[PopupLayerGradientPositionType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PopupLayerGradientPositionType.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PopupLayerGradientPositionType.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PopupLayerGradientPositionType.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PopupLayerGradientPositionType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PopupLayerPositionXType.values().length];
            try {
                iArr2[PopupLayerPositionXType.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PopupLayerPositionXType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PopupLayerPositionXType.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PopupLayerPositionYType.values().length];
            try {
                iArr3[PopupLayerPositionYType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PopupLayerPositionYType.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PopupLayerPositionYType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public PopupStickerView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static /* synthetic */ void d(PopupStickerView popupStickerView, PopupStickerAnimation popupStickerAnimation, boolean z, nuj nujVar, int i) {
        if ((i & 8) != 0) {
            nujVar = null;
        }
        popupStickerView.c(popupStickerAnimation, z, null, nujVar);
    }

    private final List<PopupStickerAnimationLayer> getLayers() {
        List<PopupStickerAnimationLayer> list;
        PopupStickerAnimation popupStickerAnimation = this.b;
        return (popupStickerAnimation == null || (list = popupStickerAnimation.c) == null) ? EmptyList.b : list;
    }

    public final void a() {
        String str;
        int i;
        int intValue;
        String str2;
        int i2;
        int i3;
        int i4;
        if (!this.m) {
            requestLayout();
            return;
        }
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.clear();
        removeAllViews();
        for (PopupStickerAnimationLayer popupStickerAnimationLayer : getLayers()) {
            GradientDrawable.Orientation orientation = null;
            r5 = null;
            ViewGroup.LayoutParams layoutParams = null;
            if (popupStickerAnimationLayer instanceof PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer) {
                PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer popupStickerFullscreenAnimationLayer = (PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer) popupStickerAnimationLayer;
                mwb0 mwb0Var = new mwb0(getContext());
                mwb0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                mwb0Var.setScaleType(ImageView.ScaleType.CENTER_CROP);
                linkedHashMap.put(popupStickerFullscreenAnimationLayer, mwb0Var);
                addView(mwb0Var, new FrameLayout.LayoutParams(-1, -1));
                Map<String, String> map = this.j;
                if (map != null && (str = map.get(popupStickerFullscreenAnimationLayer.d)) != null) {
                    mwb0Var.W(str, null);
                }
            } else if (popupStickerAnimationLayer instanceof PopupStickerAnimationLayer.PopupStickerGradientLayer) {
                PopupStickerAnimationLayer.PopupStickerGradientLayer popupStickerGradientLayer = (PopupStickerAnimationLayer.PopupStickerGradientLayer) popupStickerAnimationLayer;
                PopupLayerGradientPositionType popupLayerGradientPositionType = popupStickerGradientLayer.b;
                int[] iArr = a.$EnumSwitchMapping$0;
                int i5 = iArr[popupLayerGradientPositionType.ordinal()];
                if (i5 == 1) {
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                } else if (i5 == 2) {
                    orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                } else if (i5 == 3) {
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                } else if (i5 == 4) {
                    orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                } else if (i5 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, r);
                gradientDrawable.setAlpha(102);
                View view = new View(getContext());
                if (orientation == null) {
                    gradientDrawable.setGradientType(1);
                    gradientDrawable.setGradientCenter(0.5f, 0.5f);
                    int i6 = iArr[popupStickerGradientLayer.b.ordinal()];
                    if (i6 == 1) {
                        i = this.g;
                        Integer num = this.h;
                        intValue = num != null ? num.intValue() : this.f;
                    } else if (i6 == 2) {
                        i = this.g;
                        Integer num2 = this.h;
                        intValue = num2 != null ? num2.intValue() : this.f;
                    } else if (i6 == 3) {
                        Integer num3 = this.h;
                        i = num3 != null ? num3.intValue() : this.g;
                        intValue = this.f;
                    } else if (i6 == 4) {
                        Integer num4 = this.h;
                        i = num4 != null ? num4.intValue() : this.g;
                        intValue = this.f;
                    } else {
                        if (i6 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = Math.min(this.g, this.f);
                        intValue = i;
                    }
                    Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(intValue));
                    gradientDrawable.setGradientRadius(Math.min(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue()) / 2);
                } else {
                    gradientDrawable.setOrientation(orientation);
                }
                view.setBackground(gradientDrawable);
                linkedHashMap.put(popupStickerGradientLayer, view);
                addView(view);
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                ofPropertyValuesHolder.setDuration(200L);
                ofPropertyValuesHolder.start();
            } else if (popupStickerAnimationLayer instanceof PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer) {
                PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer popupStickerFixedAnimationLayer = (PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer) popupStickerAnimationLayer;
                mwb0 mwb0Var2 = new mwb0(getContext());
                linkedHashMap.put(popupStickerFixedAnimationLayer, mwb0Var2);
                PopupLayerPositionXType popupLayerPositionXType = popupStickerFixedAnimationLayer.b;
                PopupLayerPositionYType popupLayerPositionYType = popupStickerFixedAnimationLayer.c;
                float f = popupStickerFixedAnimationLayer.f;
                if (this.f != 0 && (i2 = this.g) != 0) {
                    int b2 = an10.b(f * Math.min(i2, r12));
                    this.h = Integer.valueOf(b2);
                    int i7 = a.$EnumSwitchMapping$1[popupLayerPositionXType.ordinal()];
                    if (i7 == 1) {
                        i3 = 8388611;
                    } else if (i7 == 2) {
                        i3 = 1;
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 8388613;
                    }
                    int i8 = a.$EnumSwitchMapping$2[popupLayerPositionYType.ordinal()];
                    if (i8 == 1) {
                        i4 = 48;
                    } else if (i8 == 2) {
                        i4 = 16;
                    } else {
                        if (i8 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i4 = 80;
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b2, b2);
                    layoutParams2.gravity = i3 + i4;
                    layoutParams = layoutParams2;
                }
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                }
                addView(mwb0Var2, layoutParams);
                Map<String, String> map2 = this.j;
                if (map2 != null && (str2 = map2.get(popupStickerFixedAnimationLayer.d)) != null) {
                    mwb0Var2.W(str2, new xxb0(this));
                }
            } else {
                com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Unsupported layer type in popup sticker"));
            }
        }
    }

    public final void b() {
        qro0.e(100L, new io60(this, 12));
    }

    public final void c(PopupStickerAnimation popupStickerAnimation, boolean z, dy0 dy0Var, gzs gzsVar) {
        this.b = popupStickerAnimation;
        this.k = dy0Var;
        this.l = gzsVar;
        this.e.clear();
        removeAllViews();
        if (q.getAndIncrement() > 0) {
            b();
            return;
        }
        int i = 0;
        if (z) {
            setBackground(new ColorDrawable(-1));
            ObjectAnimator ofArgb = ObjectAnimator.ofArgb((ColorDrawable) getBackground(), "alpha", 0, 153);
            ofArgb.setDuration(200L);
            ofArgb.start();
        }
        xwb0 xwb0Var = this.d;
        if (xwb0Var != null) {
            xwb0Var.E();
        }
        this.c.getClass();
        ArrayList arrayList = new ArrayList();
        List<PopupStickerAnimationLayer> list = popupStickerAnimation.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer popupStickerFixedAnimationLayer = (PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer) it.next();
            bpn0 bpn0Var = c7r0.a;
            arrayList3.add(c7r0.i(popupStickerFixedAnimationLayer.d));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer popupStickerFullscreenAnimationLayer = (PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer) it2.next();
            bpn0 bpn0Var2 = c7r0.a;
            arrayList5.add(c7r0.i(popupStickerFullscreenAnimationLayer.d));
        }
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList5);
        this.i.b(new e3(null, arrayList, new uxb0(new juz(11), i), g.b).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new z8(new x620(16), 25)).subscribe(new lav(new owv(this, 27), 19), new pmu(new n9w(this, 15), 12)));
    }

    public final void e() {
        LinkedHashMap linkedHashMap = this.e;
        for (View view : linkedHashMap.values()) {
            mwb0 mwb0Var = view instanceof mwb0 ? (mwb0) view : null;
            if (mwb0Var != null) {
                mwb0Var.clear();
            }
        }
        linkedHashMap.clear();
        removeAllViews();
        q.decrementAndGet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        boolean z;
        super.onAttachedToWindow();
        View view2 = this;
        while (true) {
            if (view2 == null) {
                view = null;
                break;
            }
            view = view2.findViewById(R.id.sticker_suggestion_card);
            if (view != null) {
                break;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (view == null) {
            return;
        }
        BottomSheetBehavior<View> L = BottomSheetBehavior.L(view);
        this.o = L;
        int i = L.g ? -1 : L.f;
        List<PopupStickerAnimationLayer> layers = getLayers();
        int i2 = 0;
        if (!(layers instanceof Collection) || !layers.isEmpty()) {
            for (PopupStickerAnimationLayer popupStickerAnimationLayer : layers) {
                if (popupStickerAnimationLayer instanceof PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer) {
                    if (((PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer) popupStickerAnimationLayer).c == PopupLayerPositionYType.TOP) {
                        z = true;
                        break;
                    }
                } else if ((popupStickerAnimationLayer instanceof PopupStickerAnimationLayer.PopupStickerGradientLayer) && ((PopupStickerAnimationLayer.PopupStickerGradientLayer) popupStickerAnimationLayer).b == PopupLayerGradientPositionType.TOP) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (L.M != 5 && !z) {
            i2 = i - cn70.b(16);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = i2;
            setLayoutParams(marginLayoutParams);
            requestLayout();
        }
        b bVar = new b(z, i, this);
        this.p = bVar;
        L.D(bVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        this.i.e();
        this.e.clear();
        super.onDetachedFromWindow();
        AtomicInteger atomicInteger = q;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
        b bVar = this.p;
        if (bVar != null && (bottomSheetBehavior = this.o) != null) {
            bottomSheetBehavior.Q(bVar);
        }
        this.d = null;
        this.k = null;
        this.l = null;
        this.b = null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Map<String, String> map;
        super.onSizeChanged(i, i2, i3, i4);
        this.g = i;
        this.f = i2;
        int i5 = s;
        if (i2 <= i5 || i <= i5) {
            xwb0 xwb0Var = this.d;
            if (xwb0Var != null) {
                xwb0Var.k();
            }
            b();
            return;
        }
        this.m = true;
        LinkedHashMap linkedHashMap = this.e;
        if (linkedHashMap.isEmpty() && (map = this.j) != null && (!map.isEmpty())) {
            a();
        } else if (!linkedHashMap.isEmpty()) {
            da50 da50Var = new da50(this, 13);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat.setDuration(500L);
            ofFloat.addListener(new wxb0(this, da50Var));
            ofFloat.start();
        }
        requestLayout();
    }

    public final void setLoadingCallback(xwb0 xwb0Var) {
        this.d = xwb0Var;
    }

    public PopupStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PopupStickerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PopupStickerView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public PopupStickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new vxb0();
        this.e = new LinkedHashMap();
        this.i = new io.reactivex.rxjava3.disposables.b();
        setOnTouchListener(new rn9(this, 2));
    }

    /* compiled from: PopupStickerView.kt */
    public static final class b extends BottomSheetBehavior.d {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;
        public final /* synthetic */ PopupStickerView c;

        public b(boolean z, int i, PopupStickerView popupStickerView) {
            this.a = z;
            this.b = i;
            this.c = popupStickerView;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view, float f) {
            if (this.a) {
                return;
            }
            int height = view.getHeight();
            this.c.setTranslationY(-(f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f * (height - r1) : f * this.b));
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
        }
    }
}

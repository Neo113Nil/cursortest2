package com.vk.clips.design.view.author;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.author.a;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.gpo0;
import xsna.p31;
import xsna.pvc;
import xsna.s3q0;
import xsna.tlo0;

/* compiled from: ClipSubtitleCarouselView.kt */
/* loaded from: classes16.dex */
public final class b extends FrameLayout {
    public static final DecelerateInterpolator h = new DecelerateInterpolator();
    public final float b;
    public List<a.b.C0560b> c;
    public final ArrayList d;
    public int e;
    public boolean f;
    public final p31 g;

    /* compiled from: ClipSubtitleCarouselView.kt */
    public static final class a extends LinearLayout {
        public final VkText b;

        public a(Context context, a.b.C0560b c0560b) {
            super(context);
            setOrientation(0);
            setGravity(16);
            a.b.InterfaceC0557a interfaceC0557a = c0560b.b;
            if (!epx.f(interfaceC0557a, a.b.InterfaceC0557a.c.a)) {
                if (epx.f(interfaceC0557a, a.b.InterfaceC0557a.C0559b.a)) {
                    VkImage vkImage = new VkImage(context, null, 6, 0);
                    vkImage.setImageResource(R.drawable.vk_icon_flash_12);
                    gpo0.f(vkImage, Integer.valueOf(R.attr.vk_ui_icon_contrast));
                    int a = e3m.a(R.dimen.clips_author_cell_icon_size, context);
                    int a2 = e3m.a(R.dimen.clips_author_cell_icon_spacing, context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
                    layoutParams.setMarginEnd(a2);
                    s3q0 s3q0Var = s3q0.a;
                    addView(vkImage, layoutParams);
                } else {
                    if (!(interfaceC0557a instanceof a.b.InterfaceC0557a.C0558a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pvc pvcVar = new pvc(context);
                    pvcVar.setAnimating(((a.b.InterfaceC0557a.C0558a) interfaceC0557a).a);
                    int a3 = e3m.a(R.dimen.clips_author_cell_icon_size, context);
                    int a4 = e3m.a(R.dimen.clips_author_cell_icon_spacing, context);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a3, a3);
                    layoutParams2.setMarginEnd(a4);
                    s3q0 s3q0Var2 = s3q0.a;
                    addView(pvcVar, layoutParams2);
                }
            }
            VkText vkText = new VkText(context, null, 6, 0);
            vkText.setTextAppearance(e3m.g(R.attr.vk_ui_typography_footnote_semi_bold, context));
            int f = e3m.f(R.attr.vk_ui_text_contrast, context);
            Integer valueOf = f != 0 ? Integer.valueOf(f) : null;
            if (valueOf != null) {
                vkText.setTextColor(valueOf.intValue());
            }
            vkText.setSingleLine(true);
            vkText.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            vkText.setMarqueeRepeatLimit(-1);
            vkText.setHorizontallyScrolling(true);
            vkText.setHorizontalFadingEdgeEnabled(true);
            vkText.setFadingEdgeLength(e3m.a(R.dimen.clips_author_cell_fading_edge_length, context));
            vkText.setClickable(false);
            vkText.setFocusable(false);
            vkText.setText(tlo0.b.a(c0560b.a, context));
            this.b = vkText;
            addView(vkText, new LinearLayout.LayoutParams(0, -2, 1.0f));
        }
    }

    public b(Context context) {
        super(context, null, 0);
        this.b = e3m.a(R.dimen.clips_author_cell_carousel_translation_y, context);
        this.c = EmptyList.b;
        this.d = new ArrayList();
        this.g = new p31(this, 5);
    }

    public final void a() {
        if (!isAttachedToWindow() || this.d.size() < 2) {
            b();
        } else {
            if (this.f) {
                return;
            }
            this.f = true;
            postDelayed(this.g, 800L);
        }
    }

    public final void b() {
        if (this.f) {
            this.f = false;
            removeCallbacks(this.g);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).animate().cancel();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void setItems(List<a.b.C0560b> list) {
        if (list.equals(this.c)) {
            return;
        }
        this.c = list;
        removeAllViews();
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            a aVar = new a(getContext(), (a.b.C0560b) obj);
            addView(aVar, new FrameLayout.LayoutParams(-1, -2, 16));
            VkText vkText = aVar.b;
            if (i == 0) {
                aVar.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                aVar.setAlpha(1.0f);
                vkText.setSelected(true);
            } else {
                aVar.setTranslationY(this.b);
                aVar.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                vkText.setSelected(false);
            }
            arrayList.add(aVar);
            i = i2;
        }
        this.e = 0;
        a();
    }
}

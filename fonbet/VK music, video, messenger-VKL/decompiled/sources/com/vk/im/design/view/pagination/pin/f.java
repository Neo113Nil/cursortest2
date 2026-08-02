package com.vk.im.design.view.pagination.pin;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.im.design.view.pagination.pin.ImPinItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.abg0;
import xsna.awt0;
import xsna.bcr0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.f4m;
import xsna.gzs;
import xsna.hny;
import xsna.iah0;
import xsna.kn9;
import xsna.rlw;
import xsna.rq90;
import xsna.s3q0;
import xsna.slw;
import xsna.t9w;
import xsna.tlo0;
import xsna.ulw;
import xsna.vfz;
import xsna.vlw;

/* compiled from: MultiPinAttachViewHolder.kt */
/* loaded from: classes2.dex */
public final class f extends vfz<ImPinItem.WithAttach> {
    public final gzs<s3q0> l;
    public final VKImageController<ImageView> m;
    public final VkFadeText n;
    public final VkFadeText o;
    public final VkImageSimple p;
    public final VkImageSimple q;
    public final View r;

    /* compiled from: MultiPinAttachViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImPinItem.WithAttach.Style.values().length];
            try {
                iArr[ImPinItem.WithAttach.Style.Circle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImPinItem.WithAttach.Style.Rounded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImPinItem.WithAttach.Style.Stencil.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(t9w t9wVar, bcr0 bcr0Var, ViewGroup viewGroup) {
        super(R.layout.im_multi_pin_view_attach_item, viewGroup);
        this.l = t9wVar;
        VKImageController<ImageView> create = bcr0Var.create(this.itemView.getContext());
        this.m = create;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.left_container);
        VkFadeText vkFadeText = (VkFadeText) this.itemView.findViewById(R.id.title);
        this.n = vkFadeText;
        VkFadeText vkFadeText2 = (VkFadeText) this.itemView.findViewById(R.id.subtitle);
        this.o = vkFadeText2;
        VkImageSimple vkImageSimple = (VkImageSimple) this.itemView.findViewById(R.id.stack_item);
        this.p = vkImageSimple;
        this.q = (VkImageSimple) this.itemView.findViewById(R.id.overlay);
        this.r = this.itemView.findViewById(R.id.player_icon);
        abg0 abg0Var = dhr0.u;
        int c = abg0Var.c(R.attr.vk_ui_background_tertiary);
        int c2 = abg0Var.c(R.attr.vk_ui_stroke_contrast_secondary_alpha);
        int c3 = abg0Var.c(R.attr.vk_ui_avatar_overlay);
        int argb = Color.argb(51, Color.red(c3), Color.green(c3), Color.blue(c3));
        float b = iah0.b(9.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(c);
        gradientDrawable.setCornerRadius(b);
        gradientDrawable.setStroke((int) iah0.b(0.5f), c2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(argb);
        gradientDrawable2.setCornerRadius(b);
        vkImageSimple.setImageDrawable(new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2}));
        frameLayout.addView((ImageView) ((com.vk.core.ui.image.c) create).getView(), 0, new FrameLayout.LayoutParams(-1, -1, 17));
        vkFadeText.setFade(true);
        vkFadeText.setMaxTextLines(1);
        vkFadeText.setSingleLine();
        vkFadeText2.setFade(true);
        vkFadeText2.setMaxTextLines(1);
        vkFadeText2.setSingleLine();
        this.itemView.setOnClickListener(new kn9(this, 7));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(ImPinItem.WithAttach withAttach) {
        float f;
        VKImageController.b bVar;
        ImPinItem.WithAttach withAttach2 = withAttach;
        ImPinItem.WithAttach.a aVar = withAttach2.c;
        boolean z = aVar.c;
        ImPinItem.WithAttach.Style style = aVar.b;
        VKImageController<ImageView> vKImageController = this.m;
        vKImageController.clear();
        boolean z2 = withAttach2.f;
        awt0.v(this.p, z2);
        if (z2) {
            ImageView view = vKImageController.getView();
            float f2 = 28;
            f4m.C(iah0.a(f2), view);
            f4m.k(iah0.a(f2), view);
            view.setRotation(-8.0f);
        } else {
            ImageView view2 = vKImageController.getView();
            float f3 = 36;
            f4m.C(iah0.a(f3), view2);
            f4m.k(iah0.a(f3), view2);
            view2.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ImPinItem.WithAttach.b bVar2 = withAttach2.g;
        float f4 = 11.0f;
        if (bVar2 != null) {
            bVar2.a.invoke(vKImageController.getView());
            bwt0.d(vKImageController.getView(), iah0.b(11.0f), (r4 & 2) != 0, (r4 & 4) != 0);
        } else {
            if (style == ImPinItem.WithAttach.Style.Rounded) {
                f = 0.0f;
                bwt0.d(vKImageController.getView(), iah0.b(11.0f), (r4 & 2) != 0, (r4 & 4) != 0);
            } else {
                f = 0.0f;
            }
            rlw rlwVar = aVar.a;
            String str = aVar.d;
            int c = dhr0.u.c(R.attr.vk_ui_background_secondary_alpha);
            int i = a.$EnumSwitchMapping$0[style.ordinal()];
            if (i == 1) {
                bVar = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, null, 0.5f, c, null, null, null, 63995);
            } else if (i == 2) {
                bVar = new VKImageController.b(11.0f, null, false, 0, null, null, null, null, 0.5f, c, null, null, null, 63998);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int a2 = iah0.a(z2 ? 28 : 36);
                Path path = null;
                if (str != null) {
                    try {
                        Path d = rq90.d(str);
                        RectF rectF = new RectF();
                        d.computeBounds(rectF, true);
                        float max = Math.max(rectF.width(), rectF.height());
                        if (max > f) {
                            float f5 = a2 / max;
                            Matrix matrix = new Matrix();
                            matrix.postScale(f5, f5);
                            d.transform(matrix);
                            path = d;
                        }
                    } catch (Exception unused) {
                    }
                }
                bVar = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, null, null, 0.5f, c, null, null, path, 31231);
            }
            VKImageController.b bVar3 = bVar;
            if (rlwVar instanceof slw) {
                vKImageController.a(((slw) rlwVar).a, bVar3);
            } else if (rlwVar instanceof ulw) {
                vKImageController.j(((ulw) rlwVar).a, bVar3);
            } else {
                if (!(rlwVar instanceof vlw)) {
                    throw new NoWhenBranchMatchedException();
                }
                vKImageController.f(((vlw) rlwVar).a, bVar3);
            }
        }
        VkImageSimple vkImageSimple = this.q;
        awt0.v(vkImageSimple, z);
        hny hnyVar = new hny(this.itemView.getContext());
        int i2 = a.$EnumSwitchMapping$0[style.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            hnyVar.c(iah0.b(f4), R.attr.vk_ui_overlay_primary);
            vkImageSimple.setImageDrawable(hnyVar);
            awt0.v(this.r, z);
            this.n.setText(tlo0.b.a(withAttach2.d, this.itemView.getContext()));
            this.o.setText(tlo0.b.a(withAttach2.e, this.itemView.getContext()));
        }
        f4 = 100.0f;
        hnyVar.c(iah0.b(f4), R.attr.vk_ui_overlay_primary);
        vkImageSimple.setImageDrawable(hnyVar);
        awt0.v(this.r, z);
        this.n.setText(tlo0.b.a(withAttach2.d, this.itemView.getContext()));
        this.o.setText(tlo0.b.a(withAttach2.e, this.itemView.getContext()));
    }
}

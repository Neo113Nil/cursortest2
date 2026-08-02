package com.vk.catalog2.common.ui.mvp.holder.music;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.api.banner.BannerStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.cn70;
import xsna.f4m;

/* compiled from: PodcastBannerVh.kt */
/* loaded from: classes16.dex */
public final class PodcastBannerVh implements CatalogViewHolder, View.OnClickListener {
    public final com.vk.catalog2.common.ui.mvp.util.a b;
    public final b5a c;
    public UIBlockPlaceholder d;
    public UIBlockAction e;
    public TextView f;
    public VKImageView g;
    public VKImageView h;
    public TextView i;
    public TextView j;

    /* compiled from: PodcastBannerVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerStyle.values().length];
            try {
                iArr[BannerStyle.IMAGE_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerStyle.IMAGE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerStyle.IMAGE_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerStyle.IMAGE_CROPPED_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BannerStyle.WITHOUT_IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PodcastBannerVh(com.vk.catalog2.common.ui.mvp.util.a aVar, b5a b5aVar) {
        this.b = aVar;
        this.c = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPlaceholder) {
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            if (uIBlockPlaceholder.K == null) {
                return;
            }
            this.d = uIBlockPlaceholder;
            this.e = uIBlockPlaceholder.F;
            TextView textView = this.i;
            if (textView == null) {
                textView = null;
            }
            textView.setText(uIBlockPlaceholder.A);
            TextView textView2 = this.j;
            if (textView2 == null) {
                textView2 = null;
            }
            UIBlockPlaceholder uIBlockPlaceholder2 = this.d;
            textView2.setText(uIBlockPlaceholder2 != null ? uIBlockPlaceholder2.E : null);
            VKImageView vKImageView = this.g;
            if (vKImageView == null) {
                vKImageView = null;
            }
            UIBlockPlaceholder uIBlockPlaceholder3 = this.d;
            Image image = uIBlockPlaceholder3 != null ? uIBlockPlaceholder3.B : null;
            ImageSize Cb = image != null ? image.Cb(vKImageView.getLayoutParams().width, true, false) : null;
            vKImageView.load(Cb != null ? Cb.d.d : null);
            UIBlockPlaceholder uIBlockPlaceholder4 = this.d;
            BannerStyle bannerStyle = uIBlockPlaceholder4 != null ? uIBlockPlaceholder4.K : null;
            int i = bannerStyle == null ? -1 : a.$EnumSwitchMapping$0[bannerStyle.ordinal()];
            if (i == 1) {
                TextView textView3 = this.f;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setVisibility(0);
                VKImageView vKImageView2 = this.h;
                if (vKImageView2 == null) {
                    vKImageView2 = null;
                }
                vKImageView2.setVisibility(0);
                VKImageView vKImageView3 = this.h;
                if (vKImageView3 == null) {
                    vKImageView3 = null;
                }
                ViewGroup.LayoutParams layoutParams = vKImageView3.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.setMarginEnd(cn70.b(22));
                bVar.t = -1;
                VKImageView vKImageView4 = this.g;
                if (vKImageView4 == null) {
                    vKImageView4 = null;
                }
                bVar.v = vKImageView4.getId();
                vKImageView3.setLayoutParams(bVar);
                TextView textView4 = this.f;
                if (textView4 == null) {
                    textView4 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = textView4.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                bVar2.setMarginStart(cn70.b(16));
                bVar2.setMarginEnd(cn70.b(12));
                VKImageView vKImageView5 = this.g;
                if (vKImageView5 == null) {
                    vKImageView5 = null;
                }
                bVar2.t = vKImageView5.getId();
                VKImageView vKImageView6 = this.h;
                if (vKImageView6 == null) {
                    vKImageView6 = null;
                }
                bVar2.u = vKImageView6.getId();
                textView4.setLayoutParams(bVar2);
            } else if (i == 2) {
                TextView textView5 = this.f;
                if (textView5 == null) {
                    textView5 = null;
                }
                textView5.setVisibility(0);
                VKImageView vKImageView7 = this.h;
                if (vKImageView7 == null) {
                    vKImageView7 = null;
                }
                vKImageView7.setVisibility(0);
                VKImageView vKImageView8 = this.h;
                if (vKImageView8 == null) {
                    vKImageView8 = null;
                }
                ViewGroup.LayoutParams layoutParams3 = vKImageView8.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
                bVar3.setMarginStart(cn70.b(20));
                bVar3.v = -1;
                VKImageView vKImageView9 = this.g;
                if (vKImageView9 == null) {
                    vKImageView9 = null;
                }
                bVar3.t = vKImageView9.getId();
                vKImageView8.setLayoutParams(bVar3);
                TextView textView6 = this.f;
                if (textView6 == null) {
                    textView6 = null;
                }
                ViewGroup.LayoutParams layoutParams4 = textView6.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
                bVar4.setMarginStart(cn70.b(12));
                bVar4.setMarginEnd(cn70.b(16));
                bVar4.t = -1;
                bVar4.u = -1;
                VKImageView vKImageView10 = this.h;
                if (vKImageView10 == null) {
                    vKImageView10 = null;
                }
                bVar4.s = vKImageView10.getId();
                VKImageView vKImageView11 = this.g;
                if (vKImageView11 == null) {
                    vKImageView11 = null;
                }
                bVar4.v = vKImageView11.getId();
                textView6.setLayoutParams(bVar4);
            } else if (i == 3) {
                TextView textView7 = this.f;
                if (textView7 == null) {
                    textView7 = null;
                }
                f4m.j(textView7);
                VKImageView vKImageView12 = this.h;
                if (vKImageView12 == null) {
                    vKImageView12 = null;
                }
                vKImageView12.setVisibility(0);
                VKImageView vKImageView13 = this.h;
                if (vKImageView13 == null) {
                    vKImageView13 = null;
                }
                ViewGroup.LayoutParams layoutParams5 = vKImageView13.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar5 = (ConstraintLayout.b) layoutParams5;
                bVar5.setMarginStart(cn70.b(0));
                bVar5.setMarginEnd(cn70.b(0));
                VKImageView vKImageView14 = this.g;
                if (vKImageView14 == null) {
                    vKImageView14 = null;
                }
                bVar5.t = vKImageView14.getId();
                VKImageView vKImageView15 = this.g;
                if (vKImageView15 == null) {
                    vKImageView15 = null;
                }
                bVar5.v = vKImageView15.getId();
                vKImageView13.setLayoutParams(bVar5);
            } else if (i == 4) {
                TextView textView8 = this.f;
                if (textView8 == null) {
                    textView8 = null;
                }
                textView8.setVisibility(0);
                VKImageView vKImageView16 = this.h;
                if (vKImageView16 == null) {
                    vKImageView16 = null;
                }
                vKImageView16.setVisibility(0);
                VKImageView vKImageView17 = this.h;
                if (vKImageView17 == null) {
                    vKImageView17 = null;
                }
                ViewGroup.LayoutParams layoutParams6 = vKImageView17.getLayoutParams();
                if (layoutParams6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar6 = (ConstraintLayout.b) layoutParams6;
                bVar6.setMarginEnd(-50);
                bVar6.t = -1;
                VKImageView vKImageView18 = this.g;
                if (vKImageView18 == null) {
                    vKImageView18 = null;
                }
                bVar6.v = vKImageView18.getId();
                vKImageView17.setLayoutParams(bVar6);
                TextView textView9 = this.f;
                if (textView9 == null) {
                    textView9 = null;
                }
                ViewGroup.LayoutParams layoutParams7 = textView9.getLayoutParams();
                if (layoutParams7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar7 = (ConstraintLayout.b) layoutParams7;
                bVar7.setMarginStart(cn70.b(16));
                bVar7.setMarginEnd(cn70.b(12));
                VKImageView vKImageView19 = this.g;
                if (vKImageView19 == null) {
                    vKImageView19 = null;
                }
                bVar7.t = vKImageView19.getId();
                VKImageView vKImageView20 = this.h;
                if (vKImageView20 == null) {
                    vKImageView20 = null;
                }
                bVar7.u = vKImageView20.getId();
                textView9.setLayoutParams(bVar7);
            } else if (i == 5) {
                VKImageView vKImageView21 = this.h;
                if (vKImageView21 == null) {
                    vKImageView21 = null;
                }
                f4m.j(vKImageView21);
                TextView textView10 = this.f;
                if (textView10 == null) {
                    textView10 = null;
                }
                textView10.setVisibility(0);
                TextView textView11 = this.f;
                if (textView11 == null) {
                    textView11 = null;
                }
                ViewGroup.LayoutParams layoutParams8 = textView11.getLayoutParams();
                if (layoutParams8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar8 = (ConstraintLayout.b) layoutParams8;
                bVar8.setMarginStart(cn70.b(16));
                bVar8.setMarginEnd(cn70.b(15));
                VKImageView vKImageView22 = this.g;
                if (vKImageView22 == null) {
                    vKImageView22 = null;
                }
                bVar8.t = vKImageView22.getId();
                VKImageView vKImageView23 = this.g;
                if (vKImageView23 == null) {
                    vKImageView23 = null;
                }
                bVar8.v = vKImageView23.getId();
                textView11.setLayoutParams(bVar8);
            }
            TextView textView12 = this.f;
            if (textView12 == null) {
                textView12 = null;
            }
            if (textView12.getVisibility() == 0) {
                UIBlockPlaceholder uIBlockPlaceholder5 = this.d;
                textView12.setText(uIBlockPlaceholder5 != null ? uIBlockPlaceholder5.D : null);
            }
            VKImageView vKImageView24 = this.h;
            if (vKImageView24 == null) {
                vKImageView24 = null;
            }
            if (vKImageView24.getVisibility() == 0) {
                UIBlockPlaceholder uIBlockPlaceholder6 = this.d;
                Image image2 = uIBlockPlaceholder6 != null ? uIBlockPlaceholder6.J : null;
                ImageSize Cb2 = image2 != null ? image2.Cb(vKImageView24.getLayoutParams().width, true, false) : null;
                vKImageView24.load(Cb2 != null ? Cb2.d.d : null);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_podcast_banner, viewGroup, false);
        this.f = (TextView) inflate.findViewById(R.id.text_on_banner);
        this.g = (VKImageView) inflate.findViewById(R.id.image_banner_background);
        this.h = (VKImageView) inflate.findViewById(R.id.image_podcast_cover);
        this.i = (TextView) inflate.findViewById(R.id.text_title);
        this.j = (TextView) inflate.findViewById(R.id.text_subtitle);
        bwt0.h0(this, inflate);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        UIBlockPlaceholder uIBlockPlaceholder = this.d;
        UIBlockAction uIBlockAction = this.e;
        if (uIBlockPlaceholder == null || uIBlockAction == null) {
            return;
        }
        this.c.a(new cfp0(uIBlockPlaceholder, null));
        com.vk.catalog2.common.ui.mvp.util.a.e(this.b, view.getContext(), uIBlockPlaceholder, uIBlockAction, null, 56);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}

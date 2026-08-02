package com.vk.ecomm.design.view.tile;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.ecomm.design.view.MarketPaginationDotsView;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ad10;
import xsna.aek;
import xsna.awt0;
import xsna.baf0;
import xsna.bd10;
import xsna.bq00;
import xsna.c5g;
import xsna.epx;
import xsna.gph;
import xsna.gzs;
import xsna.i9r;
import xsna.iah0;
import xsna.iwt0;
import xsna.izs;
import xsna.j5g;
import xsna.jjc;
import xsna.krv0;
import xsna.lwh;
import xsna.m3v0;
import xsna.nnw;
import xsna.rzv;
import xsna.s3q0;
import xsna.t210;
import xsna.tjw;
import xsna.va10;
import xsna.wid0;
import xsna.ywo;

/* compiled from: MarketProductTileView.kt */
/* loaded from: classes18.dex */
public final class MarketProductTileView extends ConstraintLayout {
    public static final /* synthetic */ int L = 0;
    public final VkImageSimple A;
    public final VkImageSimple B;
    public final MarketItemRatingSnippetView C;
    public final VkText D;
    public final VkText E;
    public final RecyclerView F;
    public final VkButton G;
    public final VkButton H;
    public izs<? super Integer, s3q0> I;
    public gzs<s3q0> J;
    public va10 K;
    public final VkPicture t;
    public final MarketProductTilePaginatedImagesView u;
    public final ImageView v;
    public final VkText w;
    public final VkText x;
    public final VkText y;
    public final VkText z;

    /* compiled from: MarketProductTileView.kt */
    public static final class a extends ViewOutlineProvider {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            float dimension = this.a.getResources().getDimension(R.dimen.vk_ui_border_radius);
            Path path = new Path();
            path.addRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight(), new float[]{dimension, dimension, dimension, dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
            outline.setConvexPath(path);
        }
    }

    /* compiled from: MarketProductTileView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketProductTileConfig.DisplayCtaButtonType.values().length];
            try {
                iArr[MarketProductTileConfig.DisplayCtaButtonType.ABOVE_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketProductTileConfig.DisplayCtaButtonType.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MarketProductTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.market_product_tile, this);
        setPadding(0, 0, 0, iah0.a(8));
        setBackgroundResource(R.drawable.ecomm_ds_internal_bg_tile);
        VkBlurContentView vkBlurContentView = (VkBlurContentView) findViewById(R.id.main_image_video_blur_wrapper);
        if (vkBlurContentView != null) {
            vkBlurContentView.setClipToOutline(true);
            vkBlurContentView.setOutlineProvider(new a(context));
        }
        this.t = (VkPicture) findViewById(R.id.iv_main_image);
        this.v = (ImageView) findViewById(R.id.iv_moderation_icon);
        this.y = (VkText) findViewById(R.id.tv_name);
        this.w = (VkText) findViewById(R.id.tv_price);
        VkText vkText = (VkText) findViewById(R.id.ecomm_market_tile_second_price);
        this.x = vkText;
        this.z = (VkText) findViewById(R.id.tv_owner_name);
        this.A = (VkImageSimple) findViewById(R.id.iv_favorite);
        this.B = (VkImageSimple) findViewById(R.id.is_selected_tag);
        this.C = (MarketItemRatingSnippetView) findViewById(R.id.view_market_rating);
        this.D = (VkText) findViewById(R.id.tv_product_properties);
        this.E = (VkText) findViewById(R.id.tv_status_badge);
        this.F = (RecyclerView) findViewById(R.id.rv_badges);
        this.G = (VkButton) findViewById(R.id.cta_button);
        this.H = (VkButton) findViewById(R.id.square_cta_button);
        this.u = (MarketProductTilePaginatedImagesView) findViewById(R.id.view_paginated_images);
        vkText.setPaintFlags(vkText.getPaintFlags() | 16);
    }

    public final void P4(MarketProductTileConfig marketProductTileConfig) {
        int i;
        int i2;
        MarketProductTileConfig.d dVar = marketProductTileConfig.a;
        boolean z = dVar.f;
        Context context = getContext();
        if (context != null) {
            awt0.u(this.t, z);
            getContext();
            Image image = dVar.a;
            String str = dVar.b;
            Integer num = dVar.c;
            boolean z2 = dVar.e;
            boolean z3 = dVar.d;
            VkPicture vkPicture = this.t;
            ImageView imageView = this.v;
            b.a aVar = new b.a(context, vkPicture, imageView, image, str, num, z3);
            if (!z) {
                vkPicture.setContentDescription(null);
                imageView.setVisibility(8);
                vkPicture.setAlpha(1.0f);
                vkPicture.setVkPostprocessor(null);
                vkPicture.getBackend().t();
                vkPicture.setPlaceholderImage((Drawable) null);
                vkPicture.setOnLoadCallback(null);
                vkPicture.clear();
            } else if (z2) {
                com.vk.ecomm.design.view.tile.b.b(aVar);
            } else {
                com.vk.ecomm.design.view.tile.b.a(aVar);
            }
        }
        MarketProductTileConfig.g gVar = marketProductTileConfig.b;
        boolean z4 = gVar.g;
        int i3 = z4 ? 0 : 8;
        MarketProductTilePaginatedImagesView marketProductTilePaginatedImagesView = this.u;
        marketProductTilePaginatedImagesView.setVisibility(i3);
        t210 t210Var = new t210(this, 3);
        bq00 bq00Var = new bq00(this, 4);
        MarketPaginationDotsView marketPaginationDotsView = marketProductTilePaginatedImagesView.d;
        nnw nnwVar = marketProductTilePaginatedImagesView.b;
        if (!epx.f(marketProductTilePaginatedImagesView.g, gVar)) {
            marketProductTilePaginatedImagesView.g = gVar;
            marketProductTilePaginatedImagesView.h = 0;
            marketProductTilePaginatedImagesView.i = 0;
            marketProductTilePaginatedImagesView.e = 0;
            marketProductTilePaginatedImagesView.j = bq00Var;
            marketProductTilePaginatedImagesView.k = t210Var;
            if (z4) {
                List<Image> list = gVar.a;
                List<Image> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    marketProductTilePaginatedImagesView.f = Collections.singletonList(new tjw(null, gVar.c, gVar.d, gVar.e, gVar.f));
                    marketProductTilePaginatedImagesView.e = 1;
                } else {
                    int min = Math.min((gVar.f || gVar.e || gVar.b) ? 1 : 5, list.size());
                    marketProductTilePaginatedImagesView.e = min;
                    List H0 = j5g.H0(list, min);
                    ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
                    Iterator it = H0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new tjw((Image) it.next(), gVar.c, gVar.d, gVar.e, gVar.f));
                    }
                    marketProductTilePaginatedImagesView.f = arrayList;
                }
                marketPaginationDotsView.setVisibility(marketProductTilePaginatedImagesView.e > 1 ? 0 : 8);
                marketPaginationDotsView.setPages(marketProductTilePaginatedImagesView.e);
                marketPaginationDotsView.setCurrentPage(marketProductTilePaginatedImagesView.i);
                int i4 = marketProductTilePaginatedImagesView.e;
                if (i4 > 1) {
                    int i5 = i4 * 100;
                    int i6 = i5 / 2;
                    int i7 = i6 - ((marketProductTilePaginatedImagesView.i + i6) % i4);
                    List<tjw> list3 = marketProductTilePaginatedImagesView.f;
                    Integer valueOf = Integer.valueOf(i5);
                    if (!list3.equals(nnwVar.d)) {
                        nnwVar.e = valueOf;
                        nnwVar.d = list3;
                        nnwVar.notifyDataSetChanged();
                    }
                    marketProductTilePaginatedImagesView.c.scrollToPosition(i7);
                    int i8 = marketProductTilePaginatedImagesView.i - 1;
                    int i9 = marketProductTilePaginatedImagesView.e;
                    int i10 = i8 % i9;
                    if (i10 < 0) {
                        i10 += i9;
                    }
                    iwt0.a(marketProductTilePaginatedImagesView, new gph(i10, marketProductTilePaginatedImagesView));
                    iwt0.a(marketProductTilePaginatedImagesView, new gph((marketProductTilePaginatedImagesView.i + 1) % marketProductTilePaginatedImagesView.e, marketProductTilePaginatedImagesView));
                } else {
                    List<tjw> list4 = marketProductTilePaginatedImagesView.f;
                    if (!list4.equals(nnwVar.d)) {
                        nnwVar.e = null;
                        nnwVar.d = list4;
                        nnwVar.notifyDataSetChanged();
                    }
                }
            } else {
                marketPaginationDotsView.setVisibility(8);
                EmptyList emptyList = EmptyList.b;
                if (!emptyList.equals(nnwVar.d)) {
                    nnwVar.e = null;
                    nnwVar.d = emptyList;
                    nnwVar.notifyDataSetChanged();
                }
            }
        }
        Y4(marketProductTileConfig.c);
        X4(marketProductTileConfig.d);
        MarketProductTileConfig.f fVar = marketProductTileConfig.e;
        boolean z5 = fVar.c;
        VkText vkText = this.z;
        if (vkText != null) {
            vkText.setVisibility(z5 ? 0 : 8);
        }
        if (vkText != null) {
            Context context2 = getContext();
            Integer num2 = (Integer) fVar.d.c;
            vkText.setTextColor(krv0.m(num2 != null ? num2.intValue() : R.attr.vk_ui_text_tertiary, context2));
        }
        if (z5) {
            if (vkText != null) {
                vkText.setText(fVar.a);
            }
            if (fVar.b) {
                baf0 f = krv0.f(R.drawable.vk_icon_verified_16, R.attr.vk_ui_background_accent_tint, getContext());
                if (vkText != null) {
                    vkText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, f, (Drawable) null);
                }
            } else if (vkText != null) {
                vkText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else {
            if (vkText != null) {
                vkText.setText((CharSequence) null);
            }
            if (vkText != null) {
                vkText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        T4(marketProductTileConfig.f);
        MarketProductTileConfig.c cVar = marketProductTileConfig.g;
        boolean z6 = cVar.b;
        VkImageSimple vkImageSimple = this.B;
        if (z6) {
            i = 0;
            if (vkImageSimple != null) {
                vkImageSimple.setVisibility(0);
            }
            if (cVar.a) {
                if (vkImageSimple != null) {
                    vkImageSimple.setImageResource(R.drawable.vk_icon_check_circle_filled_blue_shadow_medium_48);
                }
                Context context3 = getContext();
                if (context3 != null && vkImageSimple != null) {
                    vkImageSimple.setContentDescription(context3.getString(R.string.ecomm_product_tile_accessibility_is_selected));
                }
            } else {
                if (vkImageSimple != null) {
                    vkImageSimple.setImageResource(R.drawable.vk_icon_circle_outline_shadow_medium_48);
                }
                Context context4 = getContext();
                if (context4 != null && vkImageSimple != null) {
                    vkImageSimple.setContentDescription(context4.getString(R.string.ecomm_product_tile_accessibility_is_not_selected));
                }
            }
        } else {
            if (vkImageSimple != null) {
                vkImageSimple.setVisibility(8);
            }
            if (vkImageSimple != null) {
                vkImageSimple.setImageDrawable(null);
            }
            if (vkImageSimple != null) {
                vkImageSimple.setContentDescription(null);
            }
            i = 0;
        }
        marketProductTileConfig.i.getClass();
        VkText vkText2 = this.D;
        if (vkText2 != null) {
            vkText2.setVisibility(8);
        }
        V4(marketProductTileConfig.k);
        MarketProductTileConfig.a aVar2 = marketProductTileConfig.l;
        Integer num3 = aVar2.d;
        VkButton.Appearance appearance = aVar2.b;
        VkButton.Mode mode = aVar2.a;
        boolean z7 = aVar2.e;
        int i11 = b.$EnumSwitchMapping$0[aVar2.f.ordinal()];
        VkButton vkButton = this.H;
        VkButton vkButton2 = this.G;
        if (i11 == 1) {
            if (vkButton != null) {
                vkButton.setVisibility(z7 ? i : 8);
            }
            if (vkButton != null) {
                vkButton.setMode(mode);
            }
            if (vkButton != null) {
                vkButton.setAppearance(appearance);
            }
            if (vkButton != null) {
                vkButton.a5(true, num3);
            }
            if (vkButton != null) {
                vkButton.setIconSize(Integer.valueOf(iah0.a(16)));
            }
            i2 = 8;
            vkButton2.setVisibility(8);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkButton2.setVisibility(z7 ? i : 8);
            vkButton2.setMode(mode);
            vkButton2.setAppearance(appearance);
            vkButton2.a5(true, num3);
            vkButton2.setIconSize(Integer.valueOf(iah0.a(16)));
            vkButton2.setText(aVar2.c);
            if (vkButton != null) {
                i2 = 8;
                vkButton.setVisibility(8);
            } else {
                i2 = 8;
            }
        }
        Z4(marketProductTileConfig.m);
        U4(marketProductTileConfig.n);
        Q4(marketProductTileConfig.o);
        this.I = null;
        MarketProductTileConfig.j jVar = marketProductTileConfig.h;
        boolean z8 = jVar.c;
        MarketItemRatingSnippetView marketItemRatingSnippetView = this.C;
        if (marketItemRatingSnippetView != null) {
            marketItemRatingSnippetView.setVisibility(z8 ? 4 : i2);
        }
        if (marketItemRatingSnippetView != null) {
            Float f2 = jVar.a;
            String str2 = jVar.b;
            aek aekVar = jVar.d;
            marketItemRatingSnippetView.a(z8, f2, str2, new ywo((Integer) aekVar.a, (Integer) aekVar.b, (Integer) aekVar.c));
        }
        MarketProductTileConfig.k kVar = marketProductTileConfig.j;
        boolean z9 = kVar.b;
        VkText vkText3 = this.E;
        if (vkText3 != null) {
            vkText3.setVisibility(z9 ? i : i2);
        }
        if (z9) {
            if (vkText3 != null) {
                vkText3.setText(kVar.a);
            }
        } else if (vkText3 != null) {
            vkText3.setText((CharSequence) null);
        }
    }

    public final void Q4(gzs<s3q0> gzsVar) {
        VkButton vkButton = this.H;
        VkButton vkButton2 = this.G;
        if (gzsVar != null) {
            jjc.g(vkButton2, new ad10(0, gzsVar));
            if (vkButton != null) {
                jjc.g(vkButton, new bd10(0, gzsVar));
                return;
            }
            return;
        }
        vkButton2.setOnClickListener(null);
        vkButton2.setClickable(false);
        if (vkButton != null) {
            vkButton.setOnClickListener(null);
        }
        if (vkButton != null) {
            vkButton.setClickable(false);
        }
    }

    public final void T4(MarketProductTileConfig.b bVar) {
        boolean z = bVar.b;
        Context context = getContext();
        if (context == null) {
            return;
        }
        VkImageSimple vkImageSimple = this.A;
        if (vkImageSimple != null) {
            vkImageSimple.setVisibility(z ? 0 : 8);
        }
        if (!z) {
            if (vkImageSimple != null) {
                vkImageSimple.setImageDrawable(null);
            }
            if (vkImageSimple != null) {
                vkImageSimple.setContentDescription(null);
                return;
            }
            return;
        }
        if (bVar.a) {
            if (vkImageSimple != null) {
                vkImageSimple.setImageResource(R.drawable.vk_icon_bookmark_shadow_medium_48);
            }
            if (vkImageSimple != null) {
                vkImageSimple.setContentDescription(context.getString(R.string.product_tile_content_description_remove_from_favorite));
                return;
            }
            return;
        }
        if (vkImageSimple != null) {
            vkImageSimple.setImageResource(R.drawable.vk_icon_bookmark_outline_shadow_medium_48);
        }
        if (vkImageSimple != null) {
            vkImageSimple.setContentDescription(context.getString(R.string.product_tile_content_description_add_to_favorite));
        }
    }

    public final void U4(gzs<s3q0> gzsVar) {
        VkImageSimple vkImageSimple = this.A;
        if (gzsVar != null) {
            if (vkImageSimple != null) {
                jjc.g(vkImageSimple, new rzv(1, gzsVar));
            }
        } else {
            if (vkImageSimple != null) {
                vkImageSimple.setOnClickListener(null);
            }
            if (vkImageSimple != null) {
                vkImageSimple.setClickable(false);
            }
        }
    }

    public final void V4(List<? extends wid0> list) {
        List<? extends wid0> list2 = list;
        boolean z = false;
        int i = !list2.isEmpty() ? 0 : 8;
        RecyclerView recyclerView = this.F;
        recyclerView.setVisibility(i);
        va10 va10Var = new va10();
        va10Var.c = EmptyList.b;
        this.K = va10Var;
        recyclerView.setAdapter(va10Var);
        ConstraintLayout.b bVar = (ConstraintLayout.b) recyclerView.getLayoutParams();
        List<? extends wid0> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (wid0 wid0Var : list3) {
                if ((wid0Var instanceof wid0.c) || (wid0Var instanceof wid0.d) || (wid0Var instanceof wid0.b)) {
                    z = true;
                    break;
                }
            }
        }
        bVar.W = !z;
        recyclerView.setLayoutParams(bVar);
        if (!list2.isEmpty()) {
            va10 va10Var2 = this.K;
            if (va10Var2 == null || list.equals(va10Var2.c)) {
                return;
            }
            va10Var2.c = list;
            va10Var2.notifyDataSetChanged();
            return;
        }
        va10 va10Var3 = this.K;
        if (va10Var3 != null) {
            EmptyList emptyList = EmptyList.b;
            if (emptyList.equals(va10Var3.c)) {
                return;
            }
            va10Var3.c = emptyList;
            va10Var3.notifyDataSetChanged();
        }
    }

    public final void X4(MarketProductTileConfig.e eVar) {
        Integer valueOf;
        baf0 baf0Var;
        Integer valueOf2;
        boolean z = eVar.d;
        int i = z ? 0 : 8;
        VkText vkText = this.y;
        vkText.setVisibility(i);
        Context context = getContext();
        Integer num = (Integer) eVar.e.b;
        vkText.setTextColor(krv0.m(num != null ? num.intValue() : R.attr.vk_ui_text_secondary, context));
        if (!z) {
            vkText.setText((CharSequence) null);
            vkText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        vkText.setText(eVar.a);
        if (!eVar.b) {
            vkText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Context context2 = getContext();
        MarketProductTileConfig.ProductStatus productStatus = eVar.c;
        int[] iArr = m3v0.$EnumSwitchMapping$0;
        switch (iArr[productStatus.ordinal()]) {
            case 1:
                valueOf = Integer.valueOf(R.attr.vk_ui_accent_red);
                break;
            case 2:
                valueOf = Integer.valueOf(R.attr.vk_ui_accent_gray);
                break;
            case 3:
            case 4:
            case 6:
                valueOf = Integer.valueOf(R.attr.vk_ui_accent_orange);
                break;
            case 5:
                valueOf = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            switch (iArr[productStatus.ordinal()]) {
                case 1:
                case 3:
                case 4:
                case 6:
                    valueOf2 = Integer.valueOf(R.drawable.vk_icon_error_circle_outline_16);
                    break;
                case 2:
                    valueOf2 = Integer.valueOf(R.drawable.vk_icon_clock_outline_16);
                    break;
                case 5:
                    valueOf2 = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (valueOf2 != null) {
                baf0Var = krv0.f(valueOf2.intValue(), intValue, context2);
                vkText.setCompoundDrawablesRelativeWithIntrinsicBounds(baf0Var, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        baf0Var = null;
        vkText.setCompoundDrawablesRelativeWithIntrinsicBounds(baf0Var, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void Y4(MarketProductTileConfig.h hVar) {
        int i;
        int i2;
        i9r i9rVar = hVar.g;
        String str = hVar.b;
        String str2 = hVar.a;
        String str3 = hVar.c;
        boolean z = hVar.f;
        int i3 = z ? 0 : 8;
        VkText vkText = this.w;
        vkText.setVisibility(i3);
        int i4 = z ? 0 : 8;
        VkText vkText2 = this.x;
        vkText2.setVisibility(i4);
        if (!z) {
            vkText.setText((CharSequence) null);
            if (str3 != null && str3.length() != 0 && (str == null || str.length() == 0)) {
                str = str2;
            }
            vkText2.setText(str);
            return;
        }
        vkText.setText((str3 == null || str3.length() == 0) ? str2 : str3);
        Context context = getContext();
        Integer num = (Integer) i9rVar.a;
        int i5 = R.attr.vk_ui_text_secondary;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = (!hVar.e && ((i = m3v0.$EnumSwitchMapping$0[hVar.d.ordinal()]) == 1 || i == 2 || i == 3 || i == 4)) ? R.attr.vk_ui_text_secondary : R.attr.vk_ui_text_primary;
        }
        vkText.setTextColor(krv0.m(i2, context));
        if (str3 != null && str3.length() != 0 && (str == null || str.length() == 0)) {
            str = str2;
        }
        vkText2.setText(str);
        Context context2 = getContext();
        Integer num2 = (Integer) i9rVar.b;
        if (num2 != null) {
            i5 = num2.intValue();
        }
        vkText2.setTextColor(krv0.m(i5, context2));
    }

    public final void Z4(gzs<s3q0> gzsVar) {
        if (gzsVar != null) {
            this.J = gzsVar;
            jjc.g(this, new lwh(this, 25));
        } else {
            this.J = null;
            setOnClickListener(null);
            setClickable(false);
        }
    }
}

package com.vk.catalog2.common.ui.holders.sticker;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.ui.core.analytics.tracking.StickerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackHorizontalPreviewListItemVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.utils.StickerPackButtonUtils;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.vas.design.view.VkDiscountTextView;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import xsna.b5a;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cfp0;
import xsna.dfp0;
import xsna.epx;
import xsna.f4m;
import xsna.f9l0;
import xsna.iah0;
import xsna.izs;
import xsna.jjc;
import xsna.jng;
import xsna.kpk0;
import xsna.lh;
import xsna.m33;
import xsna.n15;
import xsna.q4i0;
import xsna.swe0;
import xsna.tf3;
import xsna.vqf0;

/* compiled from: StickerPackHorizontalPreviewListItemVh.kt */
/* loaded from: classes16.dex */
public final class StickerPackHorizontalPreviewListItemVh implements CatalogViewHolder {
    public final f9l0 b;
    public final String c;
    public final GiftData d;
    public final ContextUser e;
    public final b5a f;
    public final SearchStatInfoProvider g;
    public View h;
    public TextView i;
    public ImageView j;
    public TextView k;
    public VkDiscountTextView l;
    public VkButton m;
    public VkButton n;
    public VKImageView o;
    public View p;
    public RecyclerView q;
    public View r;
    public int u;
    public final c s = new c();
    public int t = -1;
    public final bpn0 v = new bpn0(new vqf0(3));

    /* compiled from: StickerPackHorizontalPreviewListItemVh.kt */
    public static final class a extends m.e<StickerItem> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(StickerItem stickerItem, StickerItem stickerItem2) {
            return stickerItem.equals(stickerItem2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(StickerItem stickerItem, StickerItem stickerItem2) {
            return stickerItem.b == stickerItem2.b;
        }
    }

    /* compiled from: StickerPackHorizontalPreviewListItemVh.kt */
    public final class b extends RecyclerView.e0 {
        public final ImStickerView l;

        public b(StickerPackHorizontalPreviewListItemVh stickerPackHorizontalPreviewListItemVh, View view, int i) {
            super(view);
            ImStickerView imStickerView = (ImStickerView) view.findViewById(R.id.sticker_view);
            this.l = imStickerView;
            StickerItem stickerItem = StickerItem.l;
            imStickerView.setAnimationAllowed(((Boolean) stickerPackHorizontalPreviewListItemVh.v.getValue()).booleanValue());
            imStickerView.setFadeDuration(100);
            imStickerView.getLayoutParams().width = i;
            imStickerView.getLayoutParams().height = i;
        }
    }

    /* compiled from: StickerPackHorizontalPreviewListItemVh.kt */
    public final class c extends x<StickerItem, b> {
        public n15 c;

        public c() {
            super(new a());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            b bVar = (b) e0Var;
            StickerItem item = getItem(i);
            if (item.b < 0) {
                ImStickerView.b(bVar.l, StickerItem.l, null, 6);
            } else {
                ImStickerView.b(bVar.l, item, null, 4);
            }
            jjc.g(bVar.itemView, new lh(26, this, item));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View b = tf3.b(viewGroup, R.layout.catalog_sticker_preview_item, viewGroup, false);
            StickerPackHorizontalPreviewListItemVh stickerPackHorizontalPreviewListItemVh = StickerPackHorizontalPreviewListItemVh.this;
            return new b(stickerPackHorizontalPreviewListItemVh, b, stickerPackHorizontalPreviewListItemVh.u);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.e0 e0Var) {
            b bVar = (b) e0Var;
            super.onViewRecycled(bVar);
            bVar.itemView.setOnClickListener(null);
            StickerItem stickerItem = StickerItem.l;
            ImStickerView.b(bVar.l, StickerItem.l, null, 6);
        }
    }

    public StickerPackHorizontalPreviewListItemVh(f9l0 f9l0Var, String str, GiftData giftData, ContextUser contextUser, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this.b = f9l0Var;
        this.c = str;
        this.d = giftData;
        this.e = contextUser;
        this.f = b5aVar;
        this.g = searchStatInfoProvider;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.s.submitList(null);
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01da  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        boolean z;
        boolean z2;
        ContextUser contextUser;
        VKImageView vKImageView;
        View view;
        View view2;
        Collection<Integer> collection;
        Collection<Integer> collection2;
        if (uIBlock instanceof UIBlockStickerPackPreview) {
            final UIBlockStickerPackPreview uIBlockStickerPackPreview = (UIBlockStickerPackPreview) uIBlock;
            StickerPackPreview stickerPackPreview = uIBlockStickerPackPreview.y;
            int i = this.t;
            final int i2 = stickerPackPreview.b;
            boolean z3 = stickerPackPreview.g;
            boolean z4 = stickerPackPreview.k;
            String str = stickerPackPreview.e;
            boolean z5 = i == i2;
            this.t = i2;
            TextView textView = this.i;
            if (textView == null) {
                textView = null;
            }
            textView.setText(stickerPackPreview.c);
            if (epx.f(stickerPackPreview.s, Boolean.TRUE)) {
                ImageView imageView = this.j;
                if (imageView == null) {
                    imageView = null;
                }
                imageView.setImageResource(R.drawable.vk_icon_pop_up_sticker_circle_fill_red_16);
                ImageView imageView2 = this.j;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                imageView2.setVisibility(0);
            } else if (stickerPackPreview.f) {
                ImageView imageView3 = this.j;
                if (imageView3 == null) {
                    imageView3 = null;
                }
                imageView3.setImageResource(R.drawable.vk_icon_play_circle_fill_azure_16);
                ImageView imageView4 = this.j;
                if (imageView4 == null) {
                    imageView4 = null;
                }
                imageView4.setVisibility(0);
            } else {
                ImageView imageView5 = this.j;
                if (imageView5 == null) {
                    imageView5 = null;
                }
                f4m.j(imageView5);
            }
            if (str == null || str.length() == 0) {
                TextView textView2 = this.k;
                if (textView2 == null) {
                    textView2 = null;
                }
                f4m.j(textView2);
            } else {
                TextView textView3 = this.k;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setVisibility(0);
                TextView textView4 = this.k;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setText(str);
            }
            boolean z6 = z3 && z4;
            if (z6) {
                VkDiscountTextView vkDiscountTextView = this.l;
                if (vkDiscountTextView == null) {
                    vkDiscountTextView = null;
                }
                vkDiscountTextView.setVisibility(0);
                View view3 = this.h;
                if (view3 == null) {
                    view3 = null;
                }
                Context context = view3.getContext();
                VkDiscountTextView vkDiscountTextView2 = this.l;
                if (vkDiscountTextView2 == null) {
                    vkDiscountTextView2 = null;
                }
                vkDiscountTextView2.setButtonStyle(VkDiscountTextView.ButtonStyle.COMMERCE);
                VkDiscountTextView vkDiscountTextView3 = this.l;
                if (vkDiscountTextView3 == null) {
                    vkDiscountTextView3 = null;
                }
                vkDiscountTextView3.setText(context.getString(R.string.stickers_gift));
                VkDiscountTextView vkDiscountTextView4 = this.l;
                if (vkDiscountTextView4 == null) {
                    vkDiscountTextView4 = null;
                }
                vkDiscountTextView4.setEnabled(true);
                Drawable a2 = m33.a(R.drawable.vk_icon_gift_16, context);
                if (a2 != null) {
                    a2.setTint(-1);
                }
                VkDiscountTextView vkDiscountTextView5 = this.l;
                if (vkDiscountTextView5 == null) {
                    vkDiscountTextView5 = null;
                }
                vkDiscountTextView5.setCompoundDrawablesWithIntrinsicBounds(a2, (Drawable) null, (Drawable) null, (Drawable) null);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.sticker_gift_button_padding_left);
                VkDiscountTextView vkDiscountTextView6 = this.l;
                if (vkDiscountTextView6 == null) {
                    vkDiscountTextView6 = null;
                }
                int paddingRight = vkDiscountTextView6.getPaddingRight();
                VkDiscountTextView vkDiscountTextView7 = this.l;
                if (vkDiscountTextView7 == null) {
                    vkDiscountTextView7 = null;
                }
                int paddingTop = vkDiscountTextView7.getPaddingTop();
                VkDiscountTextView vkDiscountTextView8 = this.l;
                if (vkDiscountTextView8 == null) {
                    vkDiscountTextView8 = null;
                }
                int paddingBottom = vkDiscountTextView8.getPaddingBottom();
                VkDiscountTextView vkDiscountTextView9 = this.l;
                if (vkDiscountTextView9 == null) {
                    vkDiscountTextView9 = null;
                }
                vkDiscountTextView9.setPadding(dimensionPixelSize, paddingTop, paddingRight, paddingBottom);
                VkDiscountTextView vkDiscountTextView10 = this.l;
                if (vkDiscountTextView10 == null) {
                    vkDiscountTextView10 = null;
                }
                vkDiscountTextView10.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.sticker_gift_button_drawable_padding));
            } else if (z3) {
                VkDiscountTextView vkDiscountTextView11 = this.l;
                if (vkDiscountTextView11 == null) {
                    vkDiscountTextView11 = null;
                }
                f4m.j(vkDiscountTextView11);
            } else {
                VkDiscountTextView vkDiscountTextView12 = this.l;
                if (vkDiscountTextView12 == null) {
                    vkDiscountTextView12 = null;
                }
                vkDiscountTextView12.setVisibility(0);
                View view4 = this.h;
                if (view4 == null) {
                    view4 = null;
                }
                TextView textView5 = new TextView(view4.getContext());
                f4m.j(textView5);
                View view5 = this.h;
                if (view5 == null) {
                    view5 = null;
                }
                Context context2 = view5.getContext();
                VkDiscountTextView vkDiscountTextView13 = this.l;
                if (vkDiscountTextView13 == null) {
                    vkDiscountTextView13 = null;
                }
                StickerPackButtonUtils.d(context2, stickerPackPreview, vkDiscountTextView13, textView5);
                VkDiscountTextView vkDiscountTextView14 = this.l;
                if (vkDiscountTextView14 == null) {
                    vkDiscountTextView14 = null;
                }
                vkDiscountTextView14.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            VkDiscountTextView vkDiscountTextView15 = this.l;
            if (vkDiscountTextView15 == null) {
                vkDiscountTextView15 = null;
            }
            jjc.g(vkDiscountTextView15, new q4i0(z6, this, stickerPackPreview));
            b();
            if (z3 && z4) {
                VkButton vkButton = this.n;
                if (vkButton == null) {
                    vkButton = null;
                }
                vkButton.setVisibility(0);
                VkButton vkButton2 = this.n;
                if (vkButton2 == null) {
                    vkButton2 = null;
                }
                vkButton2.setEnabled(false);
                VkButton vkButton3 = this.m;
                if (vkButton3 == null) {
                    vkButton3 = null;
                }
                f4m.j(vkButton3);
            } else if (!z3 || z4) {
                VkButton vkButton4 = this.n;
                if (vkButton4 == null) {
                    vkButton4 = null;
                }
                f4m.j(vkButton4);
                VkButton vkButton5 = this.m;
                if (vkButton5 == null) {
                    vkButton5 = null;
                }
                bwt0.p0(vkButton5, z4);
            } else {
                VkButton vkButton6 = this.n;
                if (vkButton6 == null) {
                    vkButton6 = null;
                }
                vkButton6.setVisibility(0);
                VkButton vkButton7 = this.n;
                if (vkButton7 == null) {
                    vkButton7 = null;
                }
                vkButton7.setEnabled(false);
                VkButton vkButton8 = this.m;
                if (vkButton8 == null) {
                    vkButton8 = null;
                }
                f4m.j(vkButton8);
            }
            Collection<UserId> collection3 = this.d.b;
            if (collection3 != null) {
                z = true;
                if (collection3.size() == 1) {
                    z2 = true;
                    contextUser = this.e;
                    if (contextUser != null && (collection = contextUser.e) != null) {
                        collection2 = collection;
                        if (!collection2.isEmpty()) {
                            Iterator<T> it = collection2.iterator();
                            while (it.hasNext()) {
                                if (((Number) it.next()).intValue() == i2) {
                                }
                            }
                        }
                        if (contextUser == null && z4 && z2 && z) {
                            VKImageView vKImageView2 = this.o;
                            if (vKImageView2 == null) {
                                vKImageView2 = null;
                            }
                            vKImageView2.setVisibility(0);
                            View view6 = this.p;
                            if (view6 == null) {
                                view6 = null;
                            }
                            view6.setVisibility(0);
                            VKImageView vKImageView3 = this.o;
                            if (vKImageView3 == null) {
                                vKImageView3 = null;
                            }
                            vKImageView3.load(contextUser.d);
                        } else {
                            vKImageView = this.o;
                            if (vKImageView == null) {
                                vKImageView = null;
                            }
                            f4m.j(vKImageView);
                            view = this.p;
                            if (view == null) {
                                view = null;
                            }
                            f4m.j(view);
                        }
                        if (z4) {
                            VkButton vkButton9 = this.m;
                            if (vkButton9 == null) {
                                vkButton9 = null;
                            }
                            jjc.g(vkButton9, new kpk0(2, this, stickerPackPreview));
                        }
                        b();
                        c cVar = this.s;
                        if (z5) {
                            RecyclerView recyclerView = this.q;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            recyclerView.setVisibility(0);
                            RecyclerView recyclerView2 = this.q;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            int childCount = recyclerView2.getChildCount();
                            for (int i3 = 0; i3 < childCount; i3++) {
                                RecyclerView recyclerView3 = this.q;
                                if (recyclerView3 == null) {
                                    recyclerView3 = null;
                                }
                                View childAt = recyclerView3.getChildAt(i3);
                                RecyclerView recyclerView4 = this.q;
                                if (recyclerView4 == null) {
                                    recyclerView4 = null;
                                }
                                RecyclerView.e0 childViewHolder = recyclerView4.getChildViewHolder(childAt);
                                b bVar = childViewHolder instanceof b ? (b) childViewHolder : null;
                                if (bVar != null) {
                                    ImStickerView.b(bVar.l, StickerItem.l, null, 6);
                                }
                            }
                            cVar.submitList(stickerPackPreview.q);
                        } else {
                            RecyclerView recyclerView5 = this.q;
                            if (recyclerView5 == null) {
                                recyclerView5 = null;
                            }
                            recyclerView5.setVisibility(0);
                        }
                        view2 = this.r;
                        if (view2 == null) {
                            view2 = null;
                        }
                        jjc.g(view2, new jng(this, uIBlockStickerPackPreview, i2, 1));
                        TextView textView6 = this.k;
                        jjc.g(textView6 != null ? textView6 : null, new izs() { // from class: xsna.l5l0
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                StickerPackHorizontalPreviewListItemVh.this.a(i2, uIBlockStickerPackPreview);
                                return s3q0.a;
                            }
                        });
                        cVar.c = new n15(this, uIBlockStickerPackPreview, stickerPackPreview, 9);
                    }
                    z = false;
                    if (contextUser == null) {
                    }
                    vKImageView = this.o;
                    if (vKImageView == null) {
                    }
                    f4m.j(vKImageView);
                    view = this.p;
                    if (view == null) {
                    }
                    f4m.j(view);
                    if (z4) {
                    }
                    b();
                    c cVar2 = this.s;
                    if (z5) {
                    }
                    view2 = this.r;
                    if (view2 == null) {
                    }
                    jjc.g(view2, new jng(this, uIBlockStickerPackPreview, i2, 1));
                    TextView textView62 = this.k;
                    jjc.g(textView62 != null ? textView62 : null, new izs() { // from class: xsna.l5l0
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            StickerPackHorizontalPreviewListItemVh.this.a(i2, uIBlockStickerPackPreview);
                            return s3q0.a;
                        }
                    });
                    cVar2.c = new n15(this, uIBlockStickerPackPreview, stickerPackPreview, 9);
                }
            } else {
                z = true;
            }
            z2 = false;
            contextUser = this.e;
            if (contextUser != null) {
                collection2 = collection;
                if (!collection2.isEmpty()) {
                }
                if (contextUser == null) {
                }
                vKImageView = this.o;
                if (vKImageView == null) {
                }
                f4m.j(vKImageView);
                view = this.p;
                if (view == null) {
                }
                f4m.j(view);
                if (z4) {
                }
                b();
                c cVar22 = this.s;
                if (z5) {
                }
                view2 = this.r;
                if (view2 == null) {
                }
                jjc.g(view2, new jng(this, uIBlockStickerPackPreview, i2, 1));
                TextView textView622 = this.k;
                jjc.g(textView622 != null ? textView622 : null, new izs() { // from class: xsna.l5l0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        StickerPackHorizontalPreviewListItemVh.this.a(i2, uIBlockStickerPackPreview);
                        return s3q0.a;
                    }
                });
                cVar22.c = new n15(this, uIBlockStickerPackPreview, stickerPackPreview, 9);
            }
            z = false;
            if (contextUser == null) {
            }
            vKImageView = this.o;
            if (vKImageView == null) {
            }
            f4m.j(vKImageView);
            view = this.p;
            if (view == null) {
            }
            f4m.j(view);
            if (z4) {
            }
            b();
            c cVar222 = this.s;
            if (z5) {
            }
            view2 = this.r;
            if (view2 == null) {
            }
            jjc.g(view2, new jng(this, uIBlockStickerPackPreview, i2, 1));
            TextView textView6222 = this.k;
            jjc.g(textView6222 != null ? textView6222 : null, new izs() { // from class: xsna.l5l0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    StickerPackHorizontalPreviewListItemVh.this.a(i2, uIBlockStickerPackPreview);
                    return s3q0.a;
                }
            });
            cVar222.c = new n15(this, uIBlockStickerPackPreview, stickerPackPreview, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, UIBlock uIBlock) {
        String str;
        this.f.a(new cfp0(uIBlock, new StickerAnalyticsInfo(StickerAnalyticsInfo.ClickTarget.Tap)));
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.STICKERS;
        dfp0 dfp0Var = uIBlock instanceof dfp0 ? (dfp0) uIBlock : null;
        if (dfp0Var == null || (str = dfp0Var.r()) == null) {
            str = "";
        }
        SearchStatsLoggingInfo b2 = this.g.b(type, str, false);
        View view = this.h;
        this.b.b((view != null ? view : null).getContext(), i, this.c, this.d, this.e, b2);
    }

    public final void b() {
        VkButton vkButton = this.n;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.K(vkButton);
        VkDiscountTextView vkDiscountTextView = this.l;
        if (vkDiscountTextView == null) {
            vkDiscountTextView = null;
        }
        boolean K = bwt0.K(vkDiscountTextView);
        VkButton vkButton2 = this.m;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        boolean K2 = bwt0.K(vkButton2);
        VkButton vkButton3 = this.n;
        if (vkButton3 == null) {
            vkButton3 = null;
        }
        ViewGroup.LayoutParams layoutParams = vkButton3.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        VkDiscountTextView vkDiscountTextView2 = this.l;
        if (vkDiscountTextView2 == null) {
            vkDiscountTextView2 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = vkDiscountTextView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        VkButton vkButton4 = this.m;
        if (vkButton4 == null) {
            vkButton4 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = vkButton4.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int a2 = iah0.a(8);
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd((K || K2) ? a2 : 0);
        }
        if (marginLayoutParams2 != null) {
            if (!K2) {
                a2 = 0;
            }
            marginLayoutParams2.setMarginEnd(a2);
        }
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.setMarginEnd(0);
        }
        VkButton vkButton5 = this.n;
        if (vkButton5 == null) {
            vkButton5 = null;
        }
        vkButton5.setLayoutParams(marginLayoutParams);
        VkDiscountTextView vkDiscountTextView3 = this.l;
        if (vkDiscountTextView3 == null) {
            vkDiscountTextView3 = null;
        }
        vkDiscountTextView3.setLayoutParams(marginLayoutParams2);
        VkButton vkButton6 = this.m;
        (vkButton6 != null ? vkButton6 : null).setLayoutParams(marginLayoutParams3);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_stickers_horizontal_preview_list_item, viewGroup, false);
        Context context = inflate.getContext();
        int i = context.getResources().getDisplayMetrics().widthPixels;
        float f = context.getResources().getDisplayMetrics().density;
        int paddingStart = inflate.getPaddingStart();
        this.u = swe0.g((int) ((((i - paddingStart) - inflate.getPaddingEnd()) - ((((int) 4.5f) - 1) * context.getResources().getDimensionPixelSize(R.dimen.sticker_preview_margin_end))) / 4.5f), (int) (72 * f), (int) (88 * f));
        this.h = inflate;
        this.r = inflate.findViewById(R.id.title_container);
        this.i = (TextView) inflate.findViewById(R.id.pack_title);
        this.j = (ImageView) inflate.findViewById(R.id.pack_icon);
        this.k = (TextView) inflate.findViewById(R.id.pack_subtitle);
        this.l = (VkDiscountTextView) inflate.findViewById(R.id.pack_buy);
        this.m = (VkButton) inflate.findViewById(R.id.pack_gift);
        this.n = (VkButton) inflate.findViewById(R.id.pack_check);
        this.o = (VKImageView) inflate.findViewById(R.id.context_user_avatar);
        this.p = inflate.findViewById(R.id.context_user_check);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.stickers_recycler_preview);
        this.q = recyclerView;
        recyclerView.setAdapter(this.s);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}

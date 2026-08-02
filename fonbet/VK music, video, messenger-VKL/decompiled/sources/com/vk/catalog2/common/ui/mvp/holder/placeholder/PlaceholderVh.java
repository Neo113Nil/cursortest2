package com.vk.catalog2.common.ui.mvp.holder.placeholder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;
import xsna.ey2;
import xsna.i3u;
import xsna.iah0;
import xsna.l8g;
import xsna.mba;
import xsna.nda;
import xsna.shy;
import xsna.vu5;
import xsna.wng0;

/* compiled from: PlaceholderVh.kt */
/* loaded from: classes16.dex */
public class PlaceholderVh implements CatalogViewHolder, View.OnClickListener {
    public final com.vk.catalog2.common.ui.mvp.util.a b;
    public final boolean c;
    public final boolean d;
    public final b e;
    public final mba f;
    public final int g;
    public final nda h;
    public final int i;
    public TextView j;
    public TextView k;
    public TextView l;
    public VkImage m;
    public View n;
    public VkSimpleButton o;
    public VkSimpleButton p;
    public UIBlockPlaceholder q;
    public UIBlockAction r;
    public UIBlockAction s;

    /* compiled from: PlaceholderVh.kt */
    public static final class a {
    }

    /* compiled from: PlaceholderVh.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final float d;
        public final int e;

        public b() {
            this(31);
        }

        public final void a(ImageView imageView) {
            int i = this.a;
            if (i != -1) {
                bwt0.p0(imageView, true);
                imageView.setImageResource(i);
                int i2 = this.b;
                if (i2 != -1) {
                    imageView.setBackground(new wng0(l8g.f(this.d, imageView.getContext().getColor(i2)), iah0.a(12)));
                    int a = iah0.a(this.e);
                    imageView.setPadding(a, a, a, a);
                }
                int i3 = this.c;
                imageView.setImageTintList(ColorStateList.valueOf(i3 == -1 ? dhr0.t.c(R.attr.vk_ui_icon_secondary) : imageView.getContext().getColor(i3)));
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Float.compare(this.d, bVar.d) == 0 && this.e == bVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaceholderImage(imageRes=");
            sb.append(this.a);
            sb.append(", imageBg=");
            sb.append(this.b);
            sb.append(", imageTint=");
            sb.append(this.c);
            sb.append(", alpha=");
            sb.append(this.d);
            sb.append(", padding=");
            return vu5.b(sb, this.e, ')');
        }

        public /* synthetic */ b(int i) {
            this((i & 1) != 0 ? -1 : R.drawable.vk_icon_download_square_outline_56, 1.0f, -1, -1, 0);
        }

        public b(int i, float f, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = f;
            this.e = i4;
        }
    }

    public PlaceholderVh(com.vk.catalog2.common.ui.mvp.util.a aVar, boolean z, boolean z2, b bVar, i3u i3uVar, int i, nda ndaVar, int i2, int i3) {
        z = (i3 & 2) != 0 ? true : z;
        z2 = (i3 & 4) != 0 ? false : z2;
        bVar = (i3 & 8) != 0 ? new b(31) : bVar;
        i3uVar = (i3 & 16) != 0 ? null : i3uVar;
        i = (i3 & 32) != 0 ? R.layout.catalog_placeholder_view : i;
        ndaVar = (i3 & 64) != 0 ? null : ndaVar;
        i2 = (i3 & 128) != 0 ? -1 : i2;
        this.b = aVar;
        this.c = z;
        this.d = z2;
        this.e = bVar;
        this.f = i3uVar;
        this.g = i;
        this.h = ndaVar;
        this.i = i2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        this.b.f();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        CatalogViewType catalogViewType;
        ImageSize Cb;
        ImageSize Cb2;
        ImageSize Cb3;
        if (uIBlock instanceof UIBlockPlaceholder) {
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            String str = uIBlockPlaceholder.D;
            String str2 = uIBlockPlaceholder.A;
            Image image = uIBlockPlaceholder.B;
            a(uIBlockPlaceholder);
            boolean z = this.d;
            com.vk.catalog2.common.ui.mvp.util.a aVar = this.b;
            b bVar = this.e;
            if (z) {
                TextView textView = this.l;
                if (textView == null) {
                    textView = null;
                }
                bwt0.p0(textView, true);
                TextView textView2 = this.k;
                if (textView2 == null) {
                    textView2 = null;
                }
                bwt0.p0(textView2, false);
                TextView textView3 = this.l;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setText(str);
                View view = this.n;
                if (view == null) {
                    view = null;
                }
                view.setVisibility(0);
                int a2 = iah0.a(b(uIBlockPlaceholder));
                VkImage vkImage = this.m;
                if (vkImage == null) {
                    vkImage = null;
                }
                bwt0.r0(a2, vkImage);
                VkImage vkImage2 = this.m;
                if (vkImage2 == null) {
                    vkImage2 = null;
                }
                bwt0.c0(a2, vkImage2);
                if (bVar.a == -1) {
                    String str3 = (image == null || (Cb3 = image.Cb(a2, true, false)) == null) ? null : Cb3.d.d;
                    VkImage vkImage3 = this.m;
                    if (vkImage3 == null) {
                        vkImage3 = null;
                    }
                    bwt0.p0(vkImage3, str3 != null);
                    VkImage vkImage4 = this.m;
                    if (vkImage4 == null) {
                        vkImage4 = null;
                    }
                    vkImage4.o0(str3, null);
                }
                TextView textView4 = this.j;
                if (textView4 == null) {
                    textView4 = null;
                }
                ey2.i(textView4, str2);
                VkSimpleButton vkSimpleButton = this.o;
                if (vkSimpleButton != null) {
                    aVar.a(vkSimpleButton, this.r);
                }
                VkSimpleButton vkSimpleButton2 = this.p;
                if (vkSimpleButton2 != null) {
                    aVar.a(vkSimpleButton2, this.s);
                }
            } else {
                String str4 = uIBlockPlaceholder.D;
                if ((str4 != null && str4.length() != 0) || (catalogViewType = uIBlockPlaceholder.d) == CatalogViewType.PLACEHOLDER_BIG || catalogViewType == CatalogViewType.PLACEHOLDER) {
                    TextView textView5 = this.l;
                    if (textView5 == null) {
                        textView5 = null;
                    }
                    bwt0.p0(textView5, false);
                    TextView textView6 = this.k;
                    if (textView6 == null) {
                        textView6 = null;
                    }
                    bwt0.p0(textView6, true);
                    TextView textView7 = this.k;
                    if (textView7 == null) {
                        textView7 = null;
                    }
                    textView7.setText(str);
                    View view2 = this.n;
                    if (view2 == null) {
                        view2 = null;
                    }
                    view2.setVisibility(0);
                    int a3 = iah0.a(b(uIBlockPlaceholder));
                    VkImage vkImage5 = this.m;
                    if (vkImage5 == null) {
                        vkImage5 = null;
                    }
                    bwt0.r0(a3, vkImage5);
                    VkImage vkImage6 = this.m;
                    if (vkImage6 == null) {
                        vkImage6 = null;
                    }
                    bwt0.c0(a3, vkImage6);
                    if (bVar.a == -1) {
                        String str5 = (image == null || (Cb2 = image.Cb(a3, true, false)) == null) ? null : Cb2.d.d;
                        VkImage vkImage7 = this.m;
                        if (vkImage7 == null) {
                            vkImage7 = null;
                        }
                        bwt0.p0(vkImage7, str5 != null);
                        VkImage vkImage8 = this.m;
                        if (vkImage8 == null) {
                            vkImage8 = null;
                        }
                        vkImage8.o0(str5, null);
                    }
                    TextView textView8 = this.j;
                    if (textView8 == null) {
                        textView8 = null;
                    }
                    ey2.i(textView8, str2);
                    VkSimpleButton vkSimpleButton3 = this.o;
                    if (vkSimpleButton3 != null) {
                        aVar.a(vkSimpleButton3, this.r);
                    }
                    VkSimpleButton vkSimpleButton4 = this.p;
                    if (vkSimpleButton4 != null) {
                        aVar.a(vkSimpleButton4, this.s);
                    }
                } else {
                    TextView textView9 = this.l;
                    if (textView9 == null) {
                        textView9 = null;
                    }
                    bwt0.p0(textView9, false);
                    TextView textView10 = this.k;
                    if (textView10 == null) {
                        textView10 = null;
                    }
                    bwt0.p0(textView10, true);
                    TextView textView11 = this.k;
                    if (textView11 == null) {
                        textView11 = null;
                    }
                    textView11.setText(str2);
                    View view3 = this.n;
                    if (view3 == null) {
                        view3 = null;
                    }
                    view3.setVisibility(0);
                    int a4 = iah0.a(b(uIBlockPlaceholder));
                    VkImage vkImage9 = this.m;
                    if (vkImage9 == null) {
                        vkImage9 = null;
                    }
                    bwt0.r0(a4, vkImage9);
                    VkImage vkImage10 = this.m;
                    if (vkImage10 == null) {
                        vkImage10 = null;
                    }
                    bwt0.c0(a4, vkImage10);
                    if (bVar.a == -1) {
                        String str6 = (image == null || (Cb = image.Cb(a4, true, false)) == null) ? null : Cb.d.d;
                        VkImage vkImage11 = this.m;
                        if (vkImage11 == null) {
                            vkImage11 = null;
                        }
                        bwt0.p0(vkImage11, str6 != null);
                        VkImage vkImage12 = this.m;
                        if (vkImage12 == null) {
                            vkImage12 = null;
                        }
                        vkImage12.o0(str6, null);
                    }
                    TextView textView12 = this.j;
                    if (textView12 == null) {
                        textView12 = null;
                    }
                    textView12.setVisibility(8);
                    VkSimpleButton vkSimpleButton5 = this.o;
                    if (vkSimpleButton5 != null) {
                        aVar.a(vkSimpleButton5, this.r);
                    }
                    VkSimpleButton vkSimpleButton6 = this.p;
                    if (vkSimpleButton6 != null) {
                        aVar.a(vkSimpleButton6, this.s);
                    }
                }
            }
            VkImage vkImage13 = this.m;
            if (vkImage13 == null) {
                vkImage13 = null;
            }
            bVar.a(vkImage13);
            this.q = uIBlockPlaceholder;
            View view4 = this.n;
            bwt0.Q(view4 != null ? view4 : null, R.id.catalog_ui_test_placeholder, uIBlock.b);
        }
    }

    public void a(UIBlockPlaceholder uIBlockPlaceholder) {
        this.r = null;
        this.s = null;
        for (UIBlockAction uIBlockAction : uIBlockPlaceholder.G) {
            UIBlockAction uIBlockAction2 = this.r;
            com.vk.catalog2.common.ui.mvp.util.a aVar = this.b;
            if (uIBlockAction2 == null) {
                aVar.getClass();
                if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
                    this.r = uIBlockAction;
                }
            } else if (this.s == null) {
                aVar.getClass();
                if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
                    this.s = uIBlockAction;
                }
            }
        }
    }

    public int b(UIBlockPlaceholder uIBlockPlaceholder) {
        CatalogViewType catalogViewType;
        int i = this.i;
        if (i > 0) {
            return i;
        }
        if (this.e.a != -1) {
            return 56;
        }
        CatalogViewType catalogViewType2 = uIBlockPlaceholder.d;
        if (catalogViewType2 != CatalogViewType.PLACEHOLDER_SMALL) {
            return catalogViewType2 == CatalogViewType.PLACEHOLDER_BIG ? 160 : 72;
        }
        String str = uIBlockPlaceholder.D;
        return ((str != null && str.length() != 0) || (catalogViewType = uIBlockPlaceholder.d) == CatalogViewType.PLACEHOLDER_BIG || catalogViewType == CatalogViewType.PLACEHOLDER) ? 100 : 72;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.g, viewGroup, false);
        this.j = (TextView) inflate.findViewById(R.id.catalog_placeholder_view_title);
        this.k = (TextView) inflate.findViewById(R.id.catalog_placeholder_view_description);
        this.l = (TextView) inflate.findViewById(R.id.catalog_placeholder_view_hint_description);
        this.o = (VkSimpleButton) inflate.findViewById(R.id.primary_button);
        this.p = (VkSimpleButton) inflate.findViewById(R.id.secondary_button);
        this.m = (VkImage) inflate.findViewById(R.id.catalog_placeholder_view_image);
        if (this.c) {
            int c = dhr0.t.c(R.attr.vk_ui_icon_secondary);
            VkImage vkImage = this.m;
            if (vkImage == null) {
                vkImage = null;
            }
            vkImage.setActualColorFilter(new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_ATOP));
        }
        inflate.setVisibility(4);
        VkSimpleButton vkSimpleButton = this.o;
        if (vkSimpleButton != null) {
            vkSimpleButton.setOnClickListener(this);
        }
        VkSimpleButton vkSimpleButton2 = this.p;
        if (vkSimpleButton2 != null) {
            vkSimpleButton2.setOnClickListener(this);
        }
        this.n = inflate;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        UIBlockPlaceholder uIBlockPlaceholder = this.q;
        if (uIBlockPlaceholder == null || view == null || (context = view.getContext()) == null) {
            return;
        }
        int id = view.getId();
        mba mbaVar = this.f;
        if (id == R.id.primary_button) {
            com.vk.catalog2.common.ui.mvp.util.a.e(this.b, context, uIBlockPlaceholder, this.r, this.h, 48);
            if (mbaVar != null) {
                mbaVar.z(view.getId(), uIBlockPlaceholder);
                return;
            }
            return;
        }
        if (id == R.id.secondary_button) {
            com.vk.catalog2.common.ui.mvp.util.a.e(this.b, context, uIBlockPlaceholder, this.s, this.h, 48);
            if (mbaVar != null) {
                mbaVar.z(view.getId(), uIBlockPlaceholder);
            }
        }
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

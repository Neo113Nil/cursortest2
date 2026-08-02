package com.vk.catalog2.common.ui.holders;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.LinkListViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.hints.HintId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.tooltips.VideoTooltip;
import com.vk.libvideo.tooltips.WatchLaterTooltip;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.b5a;
import xsna.bwt0;
import xsna.bye;
import xsna.c98;
import xsna.cfp0;
import xsna.dhr0;
import xsna.ecz;
import xsna.epx;
import xsna.erb;
import xsna.g5g;
import xsna.hcz;
import xsna.iah0;
import xsna.icz;
import xsna.jcz;
import xsna.k7a;
import xsna.maz;
import xsna.ozl;
import xsna.pmu;
import xsna.pwk;
import xsna.xwk;

/* compiled from: LinkVh.kt */
@ozl
/* loaded from: classes16.dex */
public final class LinkVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final int c;
    public final int d;
    public final k7a e;
    public final SearchStatInfoProvider f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final a j;
    public final boolean k;
    public View l;
    public TextView m;
    public ImageView n;
    public TextView o;
    public ImageView p;
    public VKImageView q;
    public UIBlockLink r;
    public View s;
    public ConstraintLayout t;
    public Integer u;
    public io.reactivex.rxjava3.disposables.c v;

    /* compiled from: LinkVh.kt */
    public static final class a {
        public final boolean a;
        public final Integer b;

        public a(boolean z, Integer num) {
            this.a = z;
            this.b = num;
        }
    }

    /* compiled from: LinkVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HintId.values().length];
            try {
                iArr[HintId.INFO_CLIPS_ONBOARDING_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HintId.INFO_VIDEO_WATCH_LATER_MENU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LinkVh(b5a b5aVar, int i, int i2, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider, a aVar, int i3) {
        boolean z = (i3 & 32) == 0;
        boolean z2 = (i3 & 64) != 0;
        boolean z3 = (i3 & 256) != 0;
        aVar = (i3 & 1024) != 0 ? null : aVar;
        boolean z4 = (i3 & 4096) == 0;
        this.b = b5aVar;
        this.c = i;
        this.d = i2;
        this.e = k7aVar;
        this.f = searchStatInfoProvider;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = aVar;
        this.k = z4;
    }

    public static void c(LinkVh linkVh, View view, String str, VideoTooltip.Type type, icz iczVar, int i) {
        Object obj = null;
        Integer num = (i & 4) != 0 ? 80 : null;
        long j = (i & 8) != 0 ? 350L : 10L;
        if ((i & 16) != 0) {
            type = VideoTooltip.Type.SCROLLABLE;
        }
        VideoTooltip.Type type2 = type;
        if ((i & 32) != 0) {
            iczVar = null;
        }
        Iterator<E> it = HintId.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((HintId) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        HintId hintId = (HintId) obj;
        if (hintId == null) {
            return;
        }
        VideoTooltip.b(new VideoTooltip(view), hintId, new jcz(iczVar), new VideoTooltip.b(j, num, new VideoTooltip.c(iah0.a(10), iah0.a(8)), type2, new ecz(), 4));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        io.reactivex.rxjava3.disposables.c cVar = this.v;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        float[] fArr;
        float[] fArr2;
        ImageView imageView;
        Object obj;
        UIBlockLink uIBlockLink = uIBlock instanceof UIBlockLink ? (UIBlockLink) uIBlock : null;
        if (uIBlockLink == null) {
            return;
        }
        CatalogLink catalogLink = uIBlockLink.y;
        TextView textView = this.m;
        if (textView == null) {
            textView = null;
        }
        Resources resources = textView.getResources();
        VKImageView vKImageView = this.q;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.getContext();
        TextView textView2 = this.m;
        if (textView2 == null) {
            textView2 = null;
        }
        String str = catalogLink.c;
        Meta meta = catalogLink.g;
        Image image = catalogLink.f;
        String str2 = catalogLink.d;
        textView2.setText(str);
        textView2.setMaxLines(1);
        TextView textView3 = this.o;
        if (textView3 != null) {
            textView3.setText(str2);
            textView3.setVisibility(str2.length() > 0 ? 0 : 8);
        }
        ContentType contentType = meta != null ? meta.c : null;
        boolean z = contentType == ContentType.MINIAPP || contentType == ContentType.SEARCH_ADS;
        if (this.i || !z) {
            VKImageView vKImageView2 = this.q;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            vKImageView2.setRound(true);
        } else {
            VKImageView vKImageView3 = this.q;
            if (vKImageView3 == null) {
                vKImageView3 = null;
            }
            vKImageView3.setRound(false);
            VKImageView vKImageView4 = this.q;
            VKImageView vKImageView5 = vKImageView4 == null ? null : vKImageView4;
            if (vKImageView4 == null) {
                vKImageView4 = null;
            }
            vKImageView5.setCornerRadius(vKImageView4.getResources().getDimension(R.dimen.catalog_app_corner_radius));
        }
        a aVar = this.j;
        if (aVar != null) {
            Integer num = aVar.b;
            VKImageView vKImageView6 = this.q;
            if (vKImageView6 == null) {
                vKImageView6 = null;
            }
            vKImageView6.setRound(false);
            if (num != null) {
                vKImageView6.setCornerRadius(vKImageView6.getResources().getDimension(num.intValue()));
            }
            RoundingParams roundingParams = vKImageView6.getHierarchy().c;
            if (roundingParams != null) {
                roundingParams.i = aVar.a;
            }
        }
        VKImageView vKImageView7 = this.q;
        if (vKImageView7 == null) {
            vKImageView7 = null;
        }
        RoundingParams roundingParams2 = vKImageView7.getHierarchy().c;
        if (roundingParams2 != null) {
            roundingParams2.d(0.5f);
        }
        VKImageView vKImageView8 = this.q;
        if (vKImageView8 == null) {
            vKImageView8 = null;
        }
        vKImageView8.setPostprocessor(null);
        if (contentType == ContentType.URL) {
            VKImageView vKImageView9 = this.q;
            if (vKImageView9 == null) {
                vKImageView9 = null;
            }
            vKImageView9.setBackgroundResource(R.drawable.vk_button_muted_background_circle);
            VKImageView vKImageView10 = this.q;
            if (vKImageView10 == null) {
                vKImageView10 = null;
            }
            vKImageView10.F0(dhr0.t.b(R.drawable.vk_icon_link_outline_28, R.attr.vk_ui_icon_secondary), ImageView.ScaleType.CENTER);
            VKImageView vKImageView11 = this.q;
            if (vKImageView11 == null) {
                vKImageView11 = null;
            }
            vKImageView11.load(null);
            ImageView imageView2 = this.n;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            View view = this.s;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            VKImageView vKImageView12 = this.q;
            if (vKImageView12 == null) {
                vKImageView12 = null;
            }
            vKImageView12.setEmptyImagePlaceholder((Drawable) null);
            if (this.h) {
                VKImageView vKImageView13 = this.q;
                VKImageView vKImageView14 = vKImageView13 == null ? null : vKImageView13;
                ContentType contentType2 = meta != null ? meta.c : null;
                CatalogDataType catalogDataType = uIBlockLink.e;
                CatalogViewType catalogViewType = uIBlockLink.d;
                if (vKImageView13 == null) {
                    vKImageView13 = null;
                }
                RoundingParams roundingParams3 = vKImageView13.getHierarchy().c;
                float f = -1.0f;
                this.e.b(vKImageView14, contentType2, catalogDataType, catalogViewType, (roundingParams3 == null || (fArr2 = roundingParams3.c) == null) ? -1.0f : fArr2[0]);
                VKImageView vKImageView15 = this.q;
                VKImageView vKImageView16 = vKImageView15 == null ? null : vKImageView15;
                CatalogDataType catalogDataType2 = uIBlockLink.e;
                CatalogViewType catalogViewType2 = uIBlockLink.d;
                if (vKImageView15 == null) {
                    vKImageView15 = null;
                }
                RoundingParams roundingParams4 = vKImageView15.getHierarchy().c;
                if (roundingParams4 != null && (fArr = roundingParams4.c) != null) {
                    f = fArr[0];
                }
                this.e.d(vKImageView16, catalogDataType2, catalogViewType2, f);
            } else {
                VKImageView vKImageView17 = this.q;
                if (vKImageView17 == null) {
                    vKImageView17 = null;
                }
                vKImageView17.setBackgroundImage(null);
                VKImageView vKImageView18 = this.q;
                if (vKImageView18 == null) {
                    vKImageView18 = null;
                }
                vKImageView18.setPlaceholderImage(R.drawable.user_placeholder);
            }
            ArrayList arrayList = image.c;
            if (arrayList.size() > 1) {
                g5g.L(arrayList, new bye(1));
            }
            VKImageView vKImageView19 = this.q;
            if (vKImageView19 == null) {
                vKImageView19 = null;
            }
            ImageSize Cb = image.Cb(resources.getDimensionPixelSize(this.d), true, false);
            vKImageView19.s0(Cb != null ? Cb.d.d : null);
            if (BuildInfo.q()) {
                VKImageView vKImageView20 = this.q;
                if (vKImageView20 == null) {
                    vKImageView20 = null;
                }
                bwt0.o0(vKImageView20, R.attr.vk_ui_icon_accent_themed);
            }
            VerifyInfo verifyInfo = meta != null ? meta.b : null;
            ImageView imageView3 = this.n;
            if (imageView3 != null) {
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                VerifyInfoHelper.k(imageView3, this.g, verifyInfo, false, false, 16);
            }
            View view2 = this.s;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        UIBlockHint uIBlockHint = uIBlock.j;
        if (uIBlockHint != null) {
            Iterator<E> it = HintId.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((HintId) obj).getId(), uIBlockHint.y)) {
                        break;
                    }
                }
            }
            HintId hintId = (HintId) obj;
            if (hintId != null) {
                View view3 = this.l;
                if (view3 == null) {
                    view3 = null;
                }
                if (view3.isAttachedToWindow()) {
                    int i = b.$EnumSwitchMapping$0[hintId.ordinal()];
                    if (i == 1) {
                        TextView textView4 = this.o;
                        if (textView4 != null) {
                            c(this, textView4, hintId.getId(), VideoTooltip.Type.NOT_SCROLLABLE, new icz(this, 0), 4);
                        }
                    } else if (i != 2) {
                        View view4 = this.l;
                        if (view4 == null) {
                            view4 = null;
                        }
                        c(this, view4, hintId.getId(), null, null, 56);
                    } else {
                        VKImageView vKImageView21 = this.q;
                        new WatchLaterTooltip(vKImageView21 != null ? vKImageView21 : null).a(WatchLaterTooltip.Hint.MENU);
                    }
                } else {
                    view3.addOnAttachStateChangeListener(new hcz(view3, hintId, this));
                }
            }
        }
        CatalogViewStyle catalogViewStyle = uIBlock.l;
        if ((catalogViewStyle instanceof LinkListViewStyle) && (imageView = this.p) != null) {
            imageView.setVisibility(((LinkListViewStyle) catalogViewStyle).b == LinkListViewStyle.Style.WithArrowButton ? 0 : 8);
        }
        this.r = uIBlockLink;
    }

    public final void a() {
        View view = this.l;
        if (view == null) {
            view = null;
        }
        int i = view.getResources().getConfiguration().screenWidthDp / 4;
        ConstraintLayout constraintLayout = this.t;
        if (constraintLayout != null) {
            bwt0.r0(iah0.a(i) - iah0.a(25), constraintLayout);
        }
    }

    public final void b(Context context) {
        UIBlockLink uIBlockLink = this.r;
        CatalogLink catalogLink = uIBlockLink != null ? uIBlockLink.y : null;
        if (uIBlockLink == null || catalogLink == null) {
            return;
        }
        Meta meta = catalogLink.g;
        this.b.a(new cfp0(uIBlockLink, meta != null ? meta.c : null));
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.LINK;
        String r = uIBlockLink.r();
        if (r == null) {
            r = "";
        }
        SearchStatsLoggingInfo b2 = this.f.b(type, r, false);
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.d = uIBlockLink.f;
        aVar.e = uIBlockLink.p.h();
        if (b2 != null) {
            aVar.m = b2;
        }
        maz.c(xwk.d().e(), context, catalogLink.e, aVar.a(), null, null, 24);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.c, viewGroup, false);
        this.l = inflate;
        this.m = (TextView) inflate.findViewById(R.id.title);
        this.n = (ImageView) inflate.findViewById(R.id.icon_meta);
        this.p = (ImageView) inflate.findViewById(R.id.icon_end);
        this.o = (TextView) inflate.findViewById(R.id.subtitle);
        this.q = (VKImageView) inflate.findViewById(R.id.icon);
        View findViewById = inflate.findViewById(R.id.action);
        this.s = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new c98(this, 1));
        }
        this.t = (ConstraintLayout) inflate.findViewById(R.id.container);
        inflate.setOnClickListener(new c98(this, 1));
        this.u = Integer.valueOf(inflate.getResources().getConfiguration().orientation);
        if (this.k) {
            a();
            this.v = new y(new q(new erb(3, inflate, this)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new pmu(new pwk(this, 28), 4));
        }
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        b(view.getContext());
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

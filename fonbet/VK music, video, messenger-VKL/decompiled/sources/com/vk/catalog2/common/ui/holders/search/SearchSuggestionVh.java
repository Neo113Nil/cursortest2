package com.vk.catalog2.common.ui.holders.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchSuggestionAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.SearchSuggestion;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.af50;
import xsna.an10;
import xsna.awt0;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.dko;
import xsna.e3m;
import xsna.eko;
import xsna.epx;
import xsna.gko;
import xsna.gzs;
import xsna.ho8;
import xsna.iah0;
import xsna.izs;
import xsna.jjc;
import xsna.k1u0;
import xsna.m33;
import xsna.mba;
import xsna.myc0;
import xsna.on00;
import xsna.r8a0;
import xsna.s490;
import xsna.tlo0;
import xsna.u11;
import xsna.uzp;
import xsna.vev0;
import xsna.x7g;
import xsna.yqd0;

/* compiled from: SearchSuggestionVh.kt */
/* loaded from: classes16.dex */
public final class SearchSuggestionVh extends CatalogClickableViewHolder {
    public static final Map<String, Integer> g = on00.f(new Pair("vk_video_kids_black_32", Integer.valueOf(R.attr.vk_ui_text_primary)));
    public final int e;
    public VkCell f;

    /* compiled from: SearchSuggestionVh.kt */
    public static final class a implements VkCell.d {
        public final VKImageView a;

        public a(Context context) {
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            vKImageView.setCornerRadius(iah0.b(2.0f));
            vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof b) {
                this.a.o0(((b) fVar).a, null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: SearchSuggestionVh.kt */
    public static final class b implements VkCell.f {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MetaChannelIconViewParams(iconUrl="), this.a, ')');
        }
    }

    /* compiled from: SearchSuggestionVh.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchSuggestion.Type.values().length];
            try {
                iArr[SearchSuggestion.Type.Recent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchSuggestion.Type.RecentWithoutClear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchSuggestion.Type.Popular.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchSuggestion.Type.SectionLink.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchSuggestion.Type.MetaChannelLink.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchSuggestion.Type.MovieLink.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SearchSuggestionVh(int i, mba mbaVar, b5a b5aVar) {
        super(mbaVar, b5aVar);
        this.e = i;
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final cfp0 a(int i, UIBlock uIBlock) {
        return i == R.id.search_suggestion_close ? new cfp0(uIBlock, new SearchSuggestionAnalyticsInfo(SearchSuggestionAnalyticsInfo.ClickTarget.Remove)) : i == R.id.search_suggestion ? new cfp0(uIBlock, new SearchSuggestionAnalyticsInfo(SearchSuggestionAnalyticsInfo.ClickTarget.Open)) : super.a(i, uIBlock);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(UIBlock uIBlock) {
        Context context;
        dko gkoVar;
        gko gkoVar2;
        VkCell.Left.b bVar;
        int i;
        VkCell vkCell = this.f;
        if (vkCell == null || (context = vkCell.getContext()) == null || !(uIBlock instanceof UIBlockSearchSuggestion)) {
            return;
        }
        SearchSuggestion searchSuggestion = ((UIBlockSearchSuggestion) uIBlock).y;
        VkCell vkCell2 = this.f;
        if (vkCell2 == null) {
            return;
        }
        tlo0.a aVar = tlo0.Companion;
        SearchSuggestion.Type type = searchSuggestion.g;
        String str = searchSuggestion.i;
        String str2 = searchSuggestion.e;
        String str3 = searchSuggestion.d;
        CharSequence charSequence = searchSuggestion.c;
        SearchSuggestion.Type type2 = SearchSuggestion.Type.MetaChannelLink;
        if (type != type2) {
            if (myc0.f(str3)) {
                charSequence = Html.fromHtml(str3, 0);
            } else if (myc0.f(str2)) {
                charSequence = s490.d(context, charSequence, str2, R.attr.vk_ui_text_secondary);
            }
        }
        tlo0.h f = u11.f(aVar, charSequence);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Right.d dVar = null;
        vkCell2.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(f, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), type == type2 ? new VkCell.Middle.d(new tlo0.h(str2), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50) : null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        int[] iArr = c.$EnumSwitchMapping$0;
        switch (iArr[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                switch (iArr[type.ordinal()]) {
                    case 1:
                    case 2:
                        gkoVar = new gko(R.drawable.vk_icon_history_backward_outline_24);
                        if (gkoVar != null) {
                            VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Small;
                            Integer num = g.get(str);
                            bVar = new VkCell.Left.b(new VkCell.Left.Main.c(gkoVar, size, new k1u0.a(new x7g(num != null ? num.intValue() : R.attr.vk_ui_icon_accent)), 8), null);
                            vkCell2.setLeft(bVar);
                            i = iArr[type.ordinal()];
                            int i2 = 5;
                            if (i != 1) {
                                dVar = new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_cancel_24), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) new tlo0.f(R.string.accessibility_remove_recent_query), false, (gzs) new yqd0(this, i2), 20), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29);
                            } else if (i == 4 || i == 5) {
                                dVar = new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), 3), 23);
                            }
                            vkCell2.setRight(dVar);
                            if (iArr[type.ordinal()] != 4) {
                                e3m.a aVar2 = e3m.a;
                                vkCell2.setBackground(m33.a(R.drawable.catalog_search_suggestion_link_bg, context));
                                float f2 = vev0.e;
                                bwt0.f0(vkCell2, 0, an10.b(f2), 0, an10.b(f2), 5);
                                return;
                            }
                            return;
                        }
                        bVar = null;
                        vkCell2.setLeft(bVar);
                        i = iArr[type.ordinal()];
                        int i22 = 5;
                        if (i != 1) {
                        }
                        vkCell2.setRight(dVar);
                        if (iArr[type.ordinal()] != 4) {
                        }
                    case 3:
                    case 5:
                        gkoVar2 = new gko(R.drawable.vk_icon_search_24);
                        gkoVar = gkoVar2;
                        if (gkoVar != null) {
                        }
                        bVar = null;
                        vkCell2.setLeft(bVar);
                        i = iArr[type.ordinal()];
                        int i222 = 5;
                        if (i != 1) {
                        }
                        vkCell2.setRight(dVar);
                        if (iArr[type.ordinal()] != 4) {
                        }
                        break;
                    case 4:
                        if (str != null) {
                            Drawable k = uzp.k(str);
                            if (k == null) {
                                k = null;
                            }
                            eko ekoVar = k != null ? new eko(k) : null;
                            Drawable drawable = ekoVar != null ? ekoVar.a : null;
                            if (drawable != null) {
                                gkoVar = new eko(drawable);
                                if (gkoVar != null) {
                                }
                                bVar = null;
                                vkCell2.setLeft(bVar);
                                i = iArr[type.ordinal()];
                                int i2222 = 5;
                                if (i != 1) {
                                }
                                vkCell2.setRight(dVar);
                                if (iArr[type.ordinal()] != 4) {
                                }
                            }
                        }
                        gkoVar2 = new gko(R.drawable.vk_icon_search_24);
                        gkoVar = gkoVar2;
                        if (gkoVar != null) {
                        }
                        bVar = null;
                        vkCell2.setLeft(bVar);
                        i = iArr[type.ordinal()];
                        int i22222 = 5;
                        if (i != 1) {
                        }
                        vkCell2.setRight(dVar);
                        if (iArr[type.ordinal()] != 4) {
                        }
                        break;
                    case 6:
                        gkoVar = null;
                        if (gkoVar != null) {
                        }
                        bVar = null;
                        vkCell2.setLeft(bVar);
                        i = iArr[type.ordinal()];
                        int i222222 = 5;
                        if (i != 1) {
                        }
                        vkCell2.setRight(dVar);
                        if (iArr[type.ordinal()] != 4) {
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 5:
                vkCell2.setLeftMainViewController(new d());
                bVar = new VkCell.Left.b(new VkCell.Left.Main.e(new b(str), new Size(iah0.a(24), iah0.a(32))), null);
                vkCell2.setLeft(bVar);
                i = iArr[type.ordinal()];
                int i2222222 = 5;
                if (i != 1) {
                }
                vkCell2.setRight(dVar);
                if (iArr[type.ordinal()] != 4) {
                }
                break;
            case 6:
                bVar = null;
                vkCell2.setLeft(bVar);
                i = iArr[type.ordinal()];
                int i22222222 = 5;
                if (i != 1) {
                }
                vkCell2.setRight(dVar);
                if (iArr[type.ordinal()] != 4) {
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(this.e, viewGroup, false);
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.search_suggestion);
        this.f = vkCell;
        if (vkCell != null) {
            jjc.g(vkCell, new af50(this, 25));
            awt0.o(vkCell, new r8a0(vkCell, 15));
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}

package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.holders.HeaderVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllHighlightVh;
import com.vk.catalog2.common.ui.mvp.util.a;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vkontakte.android.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import xsna.ams;
import xsna.b5a;
import xsna.b9s0;
import xsna.bjc;
import xsna.bvt0;
import xsna.c98;
import xsna.cfp0;
import xsna.dhr0;
import xsna.drm0;
import xsna.dyu;
import xsna.eda;
import xsna.epx;
import xsna.h7v;
import xsna.i4a;
import xsna.j5g;
import xsna.msy;
import xsna.n9;
import xsna.nda;
import xsna.ozl;
import xsna.q3a;
import xsna.qj80;
import xsna.s3q0;
import xsna.se0;
import xsna.utk0;
import xsna.uzp0;
import xsna.vtk0;
import xsna.ysg0;

/* compiled from: HeaderShowAllHighlightVh.kt */
@ozl
/* loaded from: classes16.dex */
public class HeaderShowAllHighlightVh extends HeaderVh {
    public static final SchemeStat$EventItem D = new SchemeStat$EventItem(SchemeStat$EventItem.Type.ONBOARDING, null, null, null, null, null, 62, null);
    public static final CommonOnboardingStat$TypeOnboardingEvent.OnboardingType E = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.BLOCK;
    public final utk0 A;
    public VkOnboardingHighlighter B;
    public final Object C;
    public final b9s0 s;
    public final nda t;
    public final eda u;
    public final b5a v;
    public final a w;
    public final SearchStatInfoProvider x;
    public final h7v y;
    public VKImageView z;

    public HeaderShowAllHighlightVh(b9s0 b9s0Var, nda ndaVar, eda edaVar, b5a b5aVar, a aVar, int i, SearchStatInfoProvider searchStatInfoProvider, q3a q3aVar, h7v h7vVar) {
        super(i, q3aVar, b5aVar, 8);
        this.s = b9s0Var;
        this.t = ndaVar;
        this.u = edaVar;
        this.v = b5aVar;
        this.w = aVar;
        this.x = searchStatInfoProvider;
        this.y = h7vVar;
        this.A = vtk0.a(Boolean.FALSE);
        this.C = msy.a(LazyThreadSafetyMode.NONE, new se0(20));
    }

    public static void b(String str) {
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(D, "", "", null, new CommonOnboardingStat$TypeOnboardingEvent(E, CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW, str, -1, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null), 8)).q();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        View view;
        UIBlockHint uIBlockHint;
        final String str = uIBlock.q;
        UIBlockHint uIBlockHint2 = uIBlock.j;
        super.N6(uIBlock);
        final boolean z = false;
        boolean z2 = (uIBlock instanceof UIBlockHeader) && ((UIBlockHeader) uIBlock).L != null;
        UIBlockHint uIBlockHint3 = ((UIBlockHeader) uIBlock).j;
        CatalogHintType catalogHintType = uIBlockHint3 != null ? uIBlockHint3.B : null;
        CatalogHintType catalogHintType2 = CatalogHintType.HIGHLIGHT;
        utk0 utk0Var = this.A;
        if (catalogHintType == catalogHintType2) {
            String str2 = uIBlockHint2 != null ? uIBlockHint2.y : null;
            if (str2 == null) {
                str2 = "";
            }
            Set<String> stringSet = ((SharedPreferences) this.C.getValue()).getStringSet("highlighted_headers_clicked", EmptySet.b);
            if (!(stringSet != null ? j5g.R0(stringSet) : new LinkedHashSet()).contains(str2)) {
                if (str == null) {
                    str = "";
                }
                if (!((Boolean) utk0Var.getValue()).booleanValue()) {
                    UIBlockHeader uIBlockHeader = this.k;
                    if (uIBlockHeader != null && (uIBlockHint = uIBlockHeader.j) != null) {
                        z = drm0.D(uIBlockHint.y, "animate", false);
                    }
                    utk0Var.i(null, Boolean.TRUE);
                    final VkOnboardingHighlighter vkOnboardingHighlighter = this.B;
                    if (vkOnboardingHighlighter != null) {
                        Resources resources = vkOnboardingHighlighter.getResources();
                        UIBlockHeader uIBlockHeader2 = this.k;
                        String str3 = uIBlockHeader2 != null ? uIBlockHeader2.y : null;
                        vkOnboardingHighlighter.setText(resources.getString(R.string.higlighted_text, str3 != null ? str3 : ""));
                        vkOnboardingHighlighter.requestLayout();
                        vkOnboardingHighlighter.post(new Runnable() { // from class: xsna.cyu
                            @Override // java.lang.Runnable
                            public final void run() {
                                SchemeStat$EventItem schemeStat$EventItem = HeaderShowAllHighlightVh.D;
                                HeaderShowAllHighlightVh headerShowAllHighlightVh = this;
                                VkOnboardingHighlighter.e(VkOnboardingHighlighter.this, z, null, false, new kbe(headerShowAllHighlightVh, 28), 4);
                                VkOnboardingHighlighter vkOnboardingHighlighter2 = headerShowAllHighlightVh.B;
                                if (vkOnboardingHighlighter2 != null) {
                                    vkOnboardingHighlighter2.setVisibility(0);
                                }
                                HeaderShowAllHighlightVh.b(str);
                            }
                        });
                    }
                }
                view = this.f;
                if (view == null) {
                    view = null;
                }
                c98 c98Var = new c98(this, 1);
                if (!z2) {
                    c98Var = null;
                }
                view.setOnClickListener(c98Var);
                view.setClickable(z2);
                view.setFocusable(z2);
                view.setForeground(z2 ? dhr0.t.d(R.attr.selectableItemBackground) : null);
            }
        }
        if (epx.f(uIBlockHint2 != null ? uIBlockHint2.y : null, HintId.SELECT_HEADLINE_CHILD_RED_CHALK.getId())) {
            if (str == null) {
                str = "";
            }
            if (!((Boolean) utk0Var.getValue()).booleanValue()) {
                utk0Var.i(null, Boolean.TRUE);
                VkOnboardingHighlighter vkOnboardingHighlighter2 = this.B;
                if (vkOnboardingHighlighter2 != null) {
                    vkOnboardingHighlighter2.setVisibility(8);
                }
                VKImageView vKImageView = this.z;
                if (vKImageView != null) {
                    vKImageView.setImageResource(R.drawable.vk_video_kids_logo_short_26h);
                    vKImageView.setVisibility(0);
                }
                b(str);
            }
        }
        view = this.f;
        if (view == null) {
        }
        c98 c98Var2 = new c98(this, 1);
        if (!z2) {
        }
        view.setOnClickListener(c98Var2);
        view.setClickable(z2);
        view.setFocusable(z2);
        view.setForeground(z2 ? dhr0.t.d(R.attr.selectableItemBackground) : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        this.z = (VKImageView) k5.findViewById(R.id.titleImage);
        this.B = (VkOnboardingHighlighter) k5.findViewById(R.id.highlight_header_title);
        TextView textView = this.j;
        if (textView != null) {
            textView.setOnClickListener(new c98(this, 1));
        }
        ImageView imageView = (ImageView) k5.findViewById(R.id.show_all_btn_icon);
        if (imageView != null) {
            imageView.setOnClickListener(new c98(this, 1));
        }
        return k5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Context context;
        UIBlockHeader uIBlockHeader;
        s3q0 s3q0Var;
        UIBlockHeader uIBlockHeader2;
        s3q0 s3q0Var2;
        s3q0 s3q0Var3;
        UIBlockActionOpenUrl uIBlockActionOpenUrl;
        UIBlockHint uIBlockHint;
        UIBlockHint uIBlockHint2;
        String str;
        Hint p;
        if (view == null || (context = view.getContext()) == null || (uIBlockHeader = this.k) == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.header_show_all || id == R.id.show_all_btn || id == R.id.show_all_btn_icon) {
            UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockHeader.D;
            if (uIBlockActionShowFilters != null) {
                i4a.b(context, uIBlockActionShowFilters.A, null, new n9(9, this, context));
                s3q0 s3q0Var4 = s3q0.a;
            } else {
                UIBlockActionOpenScreen uIBlockActionOpenScreen = uIBlockHeader.I;
                if (uIBlockActionOpenScreen != null) {
                    String str2 = uIBlockActionOpenScreen.A;
                    int hashCode = str2.hashCode();
                    if (hashCode != -1822967846) {
                        if (hashCode != -1209078378) {
                            if (hashCode == -1004912850 && str2.equals("friends_requests")) {
                                ams.a().m(context);
                            }
                        } else if (str2.equals("birthdays")) {
                            ams.a().h(context);
                        }
                    } else if (str2.equals("recommendations")) {
                        ams.a().a(context, true);
                    }
                    s3q0 s3q0Var5 = s3q0.a;
                } else {
                    UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockHeader.E;
                    b5a b5aVar = this.v;
                    if (uIBlockActionOpenSection != null) {
                        SearchStatInfoProvider searchStatInfoProvider = this.x;
                        SearchStatsLoggingInfo b = searchStatInfoProvider != null ? searchStatInfoProvider.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", true) : null;
                        b5aVar.a(new cfp0(uIBlockActionOpenSection, null));
                        String str3 = uIBlockActionOpenSection.B;
                        String str4 = uIBlockHeader.y;
                        nda.e(this.t, context, this.s, str3, str4 == null ? "" : str4, uIBlockActionOpenSection.E, b, null, PsExtractor.AUDIO_STREAM);
                        s3q0Var = s3q0.a;
                    } else {
                        s3q0Var = null;
                    }
                    if (s3q0Var == null) {
                        UIBlockActionSwitchSection uIBlockActionSwitchSection = uIBlockHeader.F;
                        if (uIBlockActionSwitchSection != null) {
                            b5aVar.a(new cfp0(uIBlockActionSwitchSection, null));
                            uIBlockHeader2 = uIBlockHeader;
                            a.e(this.w, context, uIBlockHeader2, uIBlockActionSwitchSection, null, 56);
                            s3q0Var2 = s3q0.a;
                        } else {
                            uIBlockHeader2 = uIBlockHeader;
                            s3q0Var2 = null;
                        }
                        if (s3q0Var2 == null) {
                            UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = uIBlockHeader2.G;
                            if (uIBlockActionOpenSearchTab != null) {
                                b5aVar.a(new cfp0(uIBlockActionOpenSearchTab, null));
                                ysg0.b.a(new UIBlockActionOpenSearchTab.a(uIBlockActionOpenSearchTab.A));
                                s3q0Var3 = s3q0.a;
                            } else {
                                s3q0Var3 = null;
                            }
                            if (s3q0Var3 == null && (uIBlockActionOpenUrl = uIBlockHeader2.J) != null) {
                                b5aVar.a(new cfp0(uIBlockActionOpenUrl, null));
                                a.e(this.w, context, uIBlockHeader2, uIBlockActionOpenUrl, null, 56);
                                s3q0 s3q0Var6 = s3q0.a;
                            }
                        }
                        uIBlockHint = uIBlockHeader2.j;
                        if ((uIBlockHint == null ? uIBlockHint.B : null) != CatalogHintType.HIGHLIGHT) {
                            VkOnboardingHighlighter vkOnboardingHighlighter = this.B;
                            if (vkOnboardingHighlighter != null) {
                                UIBlockHeader uIBlockHeader3 = this.k;
                                vkOnboardingHighlighter.setText(uIBlockHeader3 != null ? uIBlockHeader3.y : null);
                                vkOnboardingHighlighter.requestLayout();
                                qj80.a(vkOnboardingHighlighter, new dyu(vkOnboardingHighlighter, vkOnboardingHighlighter));
                            }
                            TextView textView = this.g;
                            (textView != null ? textView : null).setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                            UIBlockHeader uIBlockHeader4 = this.k;
                            if (uIBlockHeader4 != null && (uIBlockHint2 = uIBlockHeader4.j) != null && (str = uIBlockHint2.y) != null) {
                                ?? r2 = this.C;
                                Set<String> stringSet = ((SharedPreferences) r2.getValue()).getStringSet("highlighted_headers_clicked", EmptySet.b);
                                Set<String> R0 = stringSet != null ? j5g.R0(stringSet) : new LinkedHashSet<>();
                                R0.add(str);
                                SharedPreferences.Editor edit = ((SharedPreferences) r2.getValue()).edit();
                                edit.putStringSet("highlighted_headers_clicked", R0);
                                edit.apply();
                                h7v h7vVar = this.y;
                                if (h7vVar != null && (p = h7vVar.p(str)) != null) {
                                    h7vVar.s(p);
                                }
                            }
                            String str5 = uIBlockHeader2.q;
                            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(D, new CommonOnboardingStat$TypeOnboardingEvent(E, CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK, str5 == null ? "" : str5, -1, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null), 2);
                            UiTracker uiTracker = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                            uzp0 uzp0Var = UiTracker.h;
                            uzp0Var.getClass();
                            new bjc(c, b2, uzp0Var.a).q();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        uIBlockHeader2 = uIBlockHeader;
        uIBlockHint = uIBlockHeader2.j;
        if ((uIBlockHint == null ? uIBlockHint.B : null) != CatalogHintType.HIGHLIGHT) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}

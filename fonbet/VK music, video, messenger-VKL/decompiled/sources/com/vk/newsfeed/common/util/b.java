package com.vk.newsfeed.common.util;

import android.content.Context;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.util.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.ajx;
import xsna.b520;
import xsna.ba60;
import xsna.dhr0;
import xsna.di60;
import xsna.e43;
import xsna.egz0;
import xsna.epx;
import xsna.fb60;
import xsna.gjx;
import xsna.hd60;
import xsna.ho8;
import xsna.je40;
import xsna.myc0;
import xsna.urd0;
import xsna.w8i;
import xsna.z960;

/* compiled from: AdsActionsMenuRedesignBuilder.kt */
/* loaded from: classes4.dex */
public final class b extends c implements w8i {
    public final NewsEntry c;
    public final NewsEntry d;
    public boolean e = true;
    public boolean f = true;
    public final boolean g = true;
    public boolean h;
    public ArrayList i;

    /* compiled from: AdsActionsMenuRedesignBuilder.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdChoiceWrapper(alias=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public b(NewsEntry newsEntry, NewsEntry newsEntry2) {
        this.c = newsEntry;
        this.d = newsEntry2;
    }

    public static void f(ba60 ba60Var, NewsEntry newsEntry) {
        String b = di60.b(newsEntry);
        if (b == null || b.length() == 0) {
            return;
        }
        int h = PostActions.ACTION_COPY_AD_MARKER.h();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ba60.N0(ba60Var, h, context.getString(R.string.ad_marker_template, di60.b(newsEntry)), R.drawable.vk_icon_info_circle_outline_24);
    }

    public static void i(ba60 ba60Var, NewsEntry newsEntry) {
        String e = di60.e(newsEntry);
        if (e == null || e.length() == 0) {
            return;
        }
        ba60.L0(ba60Var, PostActions.ACTION_SHOW_ADVERTISER_INFO.h(), R.string.show_advertiser_info, R.drawable.vk_icon_link_circle_24, 0, 24);
    }

    @Override // com.vk.newsfeed.common.util.c, com.vk.newsfeed.common.util.a
    public final com.vk.newsfeed.common.util.a b(z960 z960Var) {
        this.b = z960Var;
        return this;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.vk.newsfeed.common.util.b] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.vk.newsfeed.common.util.c
    public final boolean c(ba60 ba60Var) {
        ?? r2;
        egz0 c;
        ArrayList arrayList;
        Post R;
        Caption caption;
        String str;
        boolean z = this.h;
        NewsEntry newsEntry = this.c;
        if (z && (R = di60.R(newsEntry)) != null && this.h && !di60.z(R) && (caption = R.x) != null && (str = caption.c) != null) {
            ba60Var.h = true;
            if (ba60Var.j) {
                ba60Var.j = false;
                ba60Var.x0(new fb60(0, str, true));
            } else {
                ba60Var.x0(new fb60(0, str, false));
            }
            ba60Var.j = true;
        }
        boolean z2 = newsEntry instanceof PromoPost;
        if (z2) {
            PromoPost promoPost = (PromoPost) newsEntry;
            if (this.g && hd60.a().D() && promoPost.n.Mb()) {
                boolean X = promoPost.n.X();
                ba60.L0(ba60Var, PostActions.ACTION_TOGGLE_FAVE.h(), X ? R.string.fave_remove_title : R.string.menu_item_fave_add_title, X ? R.drawable.vk_icon_bookmark_slash_outline_24 : R.drawable.vk_icon_bookmark_outline_24, 0, 24);
            }
            if (myc0.f(di60.d(promoPost))) {
                ba60.L0(ba60Var, PostActions.ACTION_COPY_ADS_URL.h(), R.string.ads_copy_url, R.drawable.vk_icon_copy_outline_24, 0, 24);
            }
            i(ba60Var, promoPost);
            if (myc0.f(di60.t(promoPost))) {
                ba60.L0(ba60Var, PostActions.ACTION_OPEN_RECOMMENDATION_URL.h(), R.string.ads_recommendations_info, R.drawable.vk_icon_document_outline_24, 0, 24);
            }
            f(ba60Var, promoPost);
            ba60Var.j = true;
            g(ba60Var, promoPost);
            h(ba60Var);
            return true;
        }
        boolean z3 = newsEntry instanceof ShitAttachment;
        String str2 = null;
        if (z3 || (newsEntry instanceof Html5Entry)) {
            if (z3) {
                str2 = ((ShitAttachment) newsEntry).P;
            } else if (z2) {
                str2 = ((PromoPost) newsEntry).r;
            }
            if (str2 != null && str2.length() != 0) {
                ba60.N0(ba60Var, PostActions.ACTION_SHOW_AD_DEBUG_INFO.h(), "Ads Debug", R.drawable.vk_icon_bug_outline_28);
            }
            if (myc0.f(di60.d(newsEntry))) {
                ba60.L0(ba60Var, PostActions.ACTION_COPY_ADS_URL.h(), R.string.ads_copy_url, R.drawable.vk_icon_copy_outline_24, 0, 24);
            }
            i(ba60Var, newsEntry);
            if (myc0.f(di60.t(newsEntry))) {
                ba60.L0(ba60Var, PostActions.ACTION_OPEN_RECOMMENDATION_URL.h(), R.string.ads_recommendations_info, R.drawable.vk_icon_document_outline_24, 0, 24);
            }
            f(ba60Var, newsEntry);
            ba60Var.j = true;
            g(ba60Var, newsEntry);
            h(ba60Var);
            return true;
        }
        if (!(newsEntry instanceof MyTargetNativeAdEntry)) {
            if (!(newsEntry instanceof OptionalNativeAdEntry) && !(newsEntry instanceof YandexNativeAdEntry)) {
                return false;
            }
            g(ba60Var, newsEntry);
            return true;
        }
        MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) newsEntry;
        this.f = false;
        this.e = false;
        gjx gjxVar = myTargetNativeAdEntry.B;
        if (gjxVar == null || (c = gjxVar.c()) == null || (arrayList = c.b) == null) {
            ArrayList<b520> arrayList2 = this.i;
            if (arrayList2 != null) {
                r2 = new ArrayList();
                for (b520 b520Var : arrayList2) {
                    String str3 = b520Var.c;
                    a aVar = str3 != null ? new a(str3, b520Var.b, b520Var.a) : null;
                    if (aVar != null) {
                        r2.add(aVar);
                    }
                }
            } else {
                r2 = EmptyList.b;
            }
        } else {
            r2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ajx ajxVar = (ajx) it.next();
                String b = ajxVar.b();
                a aVar2 = b != null ? new a(b, ajxVar.getType(), ajxVar.getTitle()) : null;
                if (aVar2 != null) {
                    r2.add(aVar2);
                }
            }
        }
        for (a aVar3 : (Iterable) r2) {
            String str4 = aVar3.a;
            String str5 = aVar3.b;
            String str6 = aVar3.c;
            if (epx.f(str5, "hide")) {
                this.f = true;
            } else if (!epx.f(str5, "complain")) {
                switch (str4.hashCode()) {
                    case -1209704364:
                        if (str4.equals("ads_copy_url")) {
                            ba60.L0(ba60Var, PostActions.ACTION_COPY_ADS_URL.h(), R.string.ads_copy_url, R.drawable.vk_icon_copy_outline_24, 0, 24);
                            break;
                        } else {
                            break;
                        }
                    case 95458899:
                        if (str4.equals("debug")) {
                            ba60.N0(ba60Var, PostActions.ACTION_SHOW_AD_DEBUG_INFO.h(), "Ads Debug", R.drawable.vk_icon_bug_outline_28);
                            break;
                        } else {
                            break;
                        }
                    case 895502019:
                        if (str4.equals("ad_marker_template")) {
                            ba60.N0(ba60Var, PostActions.ACTION_COPY_AD_MARKER.h(), str6, R.drawable.vk_icon_info_circle_outline_24);
                            break;
                        } else {
                            break;
                        }
                    case 1042034210:
                        if (str4.equals("ads_recommendations_info")) {
                            ba60.L0(ba60Var, PostActions.ACTION_OPEN_RECOMMENDATION_URL.h(), R.string.ads_recommendations_info, R.drawable.vk_icon_document_outline_24, 0, 24);
                            break;
                        } else {
                            break;
                        }
                    case 1789286912:
                        if (str4.equals("show_advertiser_info")) {
                            ba60.L0(ba60Var, PostActions.ACTION_SHOW_ADVERTISER_INFO.h(), R.string.show_advertiser_info, R.drawable.vk_icon_link_circle_24, 0, 24);
                            break;
                        } else {
                            break;
                        }
                }
            } else {
                this.e = true;
            }
        }
        if (this.i != null && (!r1.isEmpty())) {
            ba60Var.j = true;
        }
        g(ba60Var, myTargetNativeAdEntry);
        h(ba60Var);
        return true;
    }

    @Override // com.vk.newsfeed.common.util.c
    public final VkContextMenu d(Context context, a.AbstractC1374a abstractC1374a) {
        com.vk.metrics.eventtracking.b.a.a(new Exception("Not implemented type of news entry. Fallback to default actions menu"));
        if (this.b == null) {
            return null;
        }
        g gVar = new g(this.c, this.d);
        gVar.t = this.b;
        return gVar.a(context, abstractC1374a);
    }

    @Override // com.vk.newsfeed.common.util.c
    /* renamed from: e */
    public final c b(je40 je40Var) {
        this.b = je40Var;
        return this;
    }

    public final void g(ba60 ba60Var, NewsEntry newsEntry) {
        int h;
        if (this.f) {
            if (newsEntry instanceof ShitAttachment) {
                h = PostActions.ACTION_HIDE_AD.h();
            } else if (newsEntry instanceof Html5Entry) {
                h = PostActions.ACTION_HIDE_AD_HTML.h();
            } else if (newsEntry instanceof PromoPost) {
                h = PostActions.ACTION_HIDE_AD_PROMO_POST.h();
            } else if (newsEntry instanceof MyTargetNativeAdEntry) {
                h = PostActions.ACTION_HIDE_AD_MY_TARGET_NATIVE_AD.h();
            } else if (!(newsEntry instanceof OptionalNativeAdEntry) && !(newsEntry instanceof YandexNativeAdEntry)) {
                return;
            } else {
                h = PostActions.ACTION_HIDE_AD_OPTIONAL_NATIVE_AD.h();
            }
            ba60.L0(ba60Var, h, R.string.menu_item_hide_not_interesting, R.drawable.vk_icon_unblock_outline_24, 0, 24);
        }
    }

    public final void h(ba60 ba60Var) {
        if (this.e) {
            ba60.L0(ba60Var, PostActions.ACTION_REPORT.h(), R.string.report_content, R.drawable.vk_icon_report_outline_24, dhr0.t.c(R.attr.vk_ui_background_negative), 8);
        }
    }
}

package W8;

import V8.C1728i;
import V8.U;
import V8.a0;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.User;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.pagination.GPHContent;
import java.util.ArrayList;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b {
    public static final void a(a aVar, Media media, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(media, "media");
        Future<?> fetchEmojiVariationsJob$giphy_ui_2_3_17_release = aVar.getFetchEmojiVariationsJob$giphy_ui_2_3_17_release();
        if (fetchEmojiVariationsJob$giphy_ui_2_3_17_release != null) {
            fetchEmojiVariationsJob$giphy_ui_2_3_17_release.cancel(true);
        }
        Integer variationCount = media.getVariationCount();
        if ((variationCount != null ? variationCount.intValue() : 0) <= 0 || aVar.getGiphySettings$giphy_ui_2_3_17_release().getDisableEmojiVariations()) {
            if (aVar.getGiphySettings$giphy_ui_2_3_17_release().getShowConfirmationScreen()) {
                g.l(aVar, media);
                return;
            } else {
                aVar.a(media);
                return;
            }
        }
        C1728i c1728i = new C1728i();
        Integer variationCount2 = media.getVariationCount();
        int intValue = variationCount2 != null ? variationCount2.intValue() : 0;
        ArrayList arrayList = new ArrayList(intValue);
        for (int i11 = 0; i11 < intValue; i11++) {
            arrayList.add(null);
        }
        n.j(aVar, c1728i, media, arrayList, i10, false, 16, null);
        c1728i.p();
    }

    public static final void b(a aVar, T8.l itemData, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        if (itemData.d() == T8.m.f11331c || itemData.d() == T8.m.f11332d || itemData.d() == T8.m.f11333e || itemData.d() == T8.m.f11330b) {
            Object a10 = itemData.a();
            Media media = a10 instanceof Media ? (Media) a10 : null;
            if (media == null) {
                return;
            }
            h.a(aVar, media, i10);
        }
    }

    public static final void c(a aVar, T8.l itemData, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        timber.log.a.a("onItemSelected " + itemData.d() + " position=" + i10, new Object[0]);
        Object a10 = itemData.a();
        Media media = a10 instanceof Media ? (Media) a10 : null;
        if (media != null && aVar.getTextState$giphy_ui_2_3_17_release() == U.c.Search && media.getIsDynamic()) {
            p.b(aVar, U.c.Create);
            p.a(aVar);
            return;
        }
        Object a11 = itemData.a();
        Media media2 = a11 instanceof Media ? (Media) a11 : null;
        if (media2 != null) {
            if (Intrinsics.areEqual(N8.j.a(media2), Boolean.TRUE)) {
                a(aVar, media2, i10);
                return;
            }
            if (N8.j.c(media2)) {
                w.l(aVar, media2);
            } else if (aVar.getGiphySettings$giphy_ui_2_3_17_release().getShowConfirmationScreen()) {
                g.l(aVar, media2);
            } else {
                aVar.a(media2);
            }
        }
    }

    public static final void d(a aVar, String str) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.recents) {
            O8.k.f8390a.g().d(str);
            aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().l2(GPHContent.f31771h.getRecents());
        }
    }

    public static final void e(a aVar, O8.g item) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.b() == O8.f.Text) {
            p.b(aVar, U.c.Create);
            p.a(aVar);
            return;
        }
        aVar.getRecentSearches$giphy_ui_2_3_17_release().a(item.a());
        a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release != null) {
            searchBar$giphy_ui_2_3_17_release.setText(item.a());
        }
    }

    public static final void f(a aVar, T8.l itemData) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        if (itemData.d() == T8.m.f11334f) {
            Object a10 = itemData.a();
            User user = a10 instanceof User ? (User) a10 : null;
            if (user != null) {
                h.b(aVar, user);
            }
        }
    }
}

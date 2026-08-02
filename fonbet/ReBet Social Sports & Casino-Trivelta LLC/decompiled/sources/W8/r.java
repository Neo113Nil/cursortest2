package W8;

import V8.C1743y;
import V8.U;
import V8.a0;
import com.giphy.sdk.ui.GPHContentType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class r {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GPHContentType.values().length];
            try {
                iArr[GPHContentType.sticker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GPHContentType.text.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(W8.a aVar, C1743y.a oldLayoutType, C1743y.a newLayoutType) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(oldLayoutType, "oldLayoutType");
        Intrinsics.checkNotNullParameter(newLayoutType, "newLayoutType");
        timber.log.a.a("changeLayoutType " + oldLayoutType + ' ' + newLayoutType, new Object[0]);
        C1743y.a aVar2 = C1743y.a.Browse;
        if (oldLayoutType == aVar2 && newLayoutType == C1743y.a.SearchFocus) {
            q.b(aVar);
            return;
        }
        C1743y.a aVar3 = C1743y.a.SearchResults;
        if (oldLayoutType == aVar3 && newLayoutType == aVar2) {
            q.d(aVar);
            return;
        }
        C1743y.a aVar4 = C1743y.a.SearchFocus;
        if (oldLayoutType == aVar4 && newLayoutType == aVar2) {
            q.c(aVar);
        } else if (oldLayoutType == aVar3 && newLayoutType == aVar4) {
            q.a(aVar);
        }
    }

    public static final void b(W8.a aVar, GPHContentType contentType) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        timber.log.a.a("changeMediaType", new Object[0]);
        p.b(aVar, U.c.Search);
        aVar.setContentType$giphy_ui_2_3_17_release(contentType);
        c(aVar);
        i.c(aVar, aVar.getQuery$giphy_ui_2_3_17_release());
    }

    public static final void c(W8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        timber.log.a.a("setGridTypeFromContentType", new Object[0]);
        int i10 = a.$EnumSwitchMapping$0[aVar.getContentType$giphy_ui_2_3_17_release().ordinal()];
        if (i10 == 1 || i10 == 2) {
            aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().k2(Integer.valueOf(GPHContentType.text == aVar.getContentType$giphy_ui_2_3_17_release() ? aVar.getTextSpanCount$giphy_ui_2_3_17_release() : aVar.getGiphySettings$giphy_ui_2_3_17_release().getStickerColumnCount()), aVar.getContentType$giphy_ui_2_3_17_release());
            aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().getGifsAdapter().k().s(true);
        } else {
            aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().k2(null, aVar.getContentType$giphy_ui_2_3_17_release());
            aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().getGifsAdapter().k().s(false);
        }
    }

    public static final void d(W8.a aVar, U.d state) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        aVar.setPKeyboardState$giphy_ui_2_3_17_release(state);
        a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release != null) {
            searchBar$giphy_ui_2_3_17_release.setKeyboardState(state);
        }
        if (aVar.getPKeyboardState$giphy_ui_2_3_17_release() == U.d.OPEN) {
            j.a(aVar);
        } else {
            j.e(aVar);
        }
        o.f(aVar);
    }

    public static final void e(W8.a aVar, int i10) {
        C1743y mediaSelectorView$giphy_ui_2_3_17_release;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String query$giphy_ui_2_3_17_release = aVar.getQuery$giphy_ui_2_3_17_release();
        if (query$giphy_ui_2_3_17_release != null && query$giphy_ui_2_3_17_release.length() != 0 && (mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release()) != null) {
            mediaSelectorView$giphy_ui_2_3_17_release.D();
        }
        p.b(aVar, (i10 <= 0 || !aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().b2()) ? U.c.Search : U.c.Create);
    }
}

package W8;

import V8.C1743y;
import com.giphy.sdk.ui.GPHContentType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class q {
    public static final void a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        timber.log.a.a("transitionBackToSearchFocus", new Object[0]);
        r.c(aVar);
    }

    public static final void b(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        timber.log.a.a("transitionForwardToSearchFocus", new Object[0]);
        boolean z10 = true;
        boolean z11 = aVar.getContentType$giphy_ui_2_3_17_release() != aVar.getBrowseContentType$giphy_ui_2_3_17_release();
        aVar.setBrowseContentType$giphy_ui_2_3_17_release(aVar.getContentType$giphy_ui_2_3_17_release());
        if (aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.emoji || aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.recents) {
            aVar.setContentType$giphy_ui_2_3_17_release(GPHContentType.gif);
        } else {
            z10 = z11;
        }
        C1743y mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release();
        if (mediaSelectorView$giphy_ui_2_3_17_release != null) {
            mediaSelectorView$giphy_ui_2_3_17_release.setGphContentType(aVar.getContentType$giphy_ui_2_3_17_release());
        }
        if (z10) {
            r.c(aVar);
            i.c(aVar, "");
        }
    }

    public static final void c(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        timber.log.a.a("transitionFromFocusToBrowse", new Object[0]);
        boolean z10 = aVar.getContentType$giphy_ui_2_3_17_release() != aVar.getBrowseContentType$giphy_ui_2_3_17_release();
        aVar.setContentType$giphy_ui_2_3_17_release(aVar.getBrowseContentType$giphy_ui_2_3_17_release());
        C1743y mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release();
        if (mediaSelectorView$giphy_ui_2_3_17_release != null) {
            mediaSelectorView$giphy_ui_2_3_17_release.setGphContentType(aVar.getContentType$giphy_ui_2_3_17_release());
        }
        r.c(aVar);
        if (z10) {
            i.c(aVar, "");
        }
    }

    public static final void d(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        timber.log.a.a("transitionFromResultsToBrowse", new Object[0]);
        aVar.setContentType$giphy_ui_2_3_17_release(aVar.getBrowseContentType$giphy_ui_2_3_17_release());
        C1743y mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release();
        if (mediaSelectorView$giphy_ui_2_3_17_release != null) {
            mediaSelectorView$giphy_ui_2_3_17_release.setGphContentType(aVar.getContentType$giphy_ui_2_3_17_release());
        }
        r.c(aVar);
        i.c(aVar, null);
    }
}

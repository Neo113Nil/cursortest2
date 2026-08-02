package W8;

import V8.C1743y;
import V8.U;
import V8.a0;
import W8.a;
import android.widget.EditText;
import android.widget.ImageView;
import com.giphy.sdk.ui.GPHContentType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class j {
    public static final void a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        timber.log.a.a("focusSearch", new Object[0]);
        a.b listener = aVar.getListener();
        if (listener != null) {
            listener.b();
        }
        C1743y mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release();
        if (mediaSelectorView$giphy_ui_2_3_17_release != null) {
            mediaSelectorView$giphy_ui_2_3_17_release.A(true);
        }
    }

    public static final void b(a aVar, String str) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (str != null) {
            aVar.getRecentSearches$giphy_ui_2_3_17_release().a(str);
        }
        f(aVar, str, true);
    }

    public static final void c(a aVar, String str) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        f(aVar, str, false);
    }

    public static final void d(a aVar, String str) {
        EditText searchInput;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release == null || (searchInput = searchBar$giphy_ui_2_3_17_release.getSearchInput()) == null) {
            return;
        }
        searchInput.setText('@' + str);
    }

    public static final void e(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        timber.log.a.a("releaseFocus", new Object[0]);
        C1743y mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release();
        if (mediaSelectorView$giphy_ui_2_3_17_release != null) {
            mediaSelectorView$giphy_ui_2_3_17_release.A(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r6 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(a aVar, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        boolean z11 = str == null || str.length() == 0;
        ImageView searchBackButton$giphy_ui_2_3_17_release = aVar.getSearchBackButton$giphy_ui_2_3_17_release();
        if (searchBackButton$giphy_ui_2_3_17_release != null) {
            searchBackButton$giphy_ui_2_3_17_release.setVisibility(!z11 ? 0 : 8);
        }
        if (aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.emoji) {
            if ((str != null ? str.length() : 0) > 0) {
                aVar.setContentType$giphy_ui_2_3_17_release(GPHContentType.gif);
                r.c(aVar);
            }
        }
        if (aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.text && aVar.getTextState$giphy_ui_2_3_17_release() == U.c.Create) {
            if (!(str == null || str.length() == 0)) {
            }
        }
        i.c(aVar, str);
        if (str == null || str.length() == 0) {
            U.d pKeyboardState$giphy_ui_2_3_17_release = aVar.getPKeyboardState$giphy_ui_2_3_17_release();
            U.d dVar = U.d.OPEN;
            if (pKeyboardState$giphy_ui_2_3_17_release == dVar) {
                a(aVar);
            }
            C1743y mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release();
            if (mediaSelectorView$giphy_ui_2_3_17_release != null) {
                mediaSelectorView$giphy_ui_2_3_17_release.C(aVar.getPKeyboardState$giphy_ui_2_3_17_release() == dVar);
            }
        }
    }
}

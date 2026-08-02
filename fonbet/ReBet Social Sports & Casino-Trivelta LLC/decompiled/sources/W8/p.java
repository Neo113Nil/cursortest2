package W8;

import V8.C1743y;
import V8.U;
import V8.a0;
import android.graphics.drawable.Drawable;
import com.giphy.sdk.ui.GPHContentType;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes2.dex */
public abstract class p {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[U.c.values().length];
            try {
                iArr[U.c.Create.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U.c.Search.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(W8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        o.f(aVar);
        C1743y mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release();
        if (mediaSelectorView$giphy_ui_2_3_17_release != null) {
            mediaSelectorView$giphy_ui_2_3_17_release.setGphContentType(GPHContentType.text);
        }
        aVar.setContentType$giphy_ui_2_3_17_release(GPHContentType.text);
        r.c(aVar);
        i.c(aVar, aVar.getQuery$giphy_ui_2_3_17_release());
    }

    public static final void b(W8.a aVar, U.c state) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        aVar.setTextState$giphy_ui_2_3_17_release(state);
        int i10 = a.$EnumSwitchMapping$0[state.ordinal()];
        if (i10 == 1) {
            a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
            if (searchBar$giphy_ui_2_3_17_release != null) {
                searchBar$giphy_ui_2_3_17_release.P(O8.r.f8431s);
                return;
            }
            return;
        }
        if (i10 != 2) {
            return;
        }
        Drawable p10 = O8.k.f8390a.h().p();
        if (p10 == null) {
            p10 = AbstractC5338c.getDrawable(aVar.getContext(), O8.r.f8426n);
        }
        a0 searchBar$giphy_ui_2_3_17_release2 = aVar.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release2 != null) {
            searchBar$giphy_ui_2_3_17_release2.Q(p10);
        }
    }
}

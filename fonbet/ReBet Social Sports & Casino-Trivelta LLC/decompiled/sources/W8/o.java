package W8;

import O8.h;
import V8.D;
import V8.U;
import V8.a0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.giphy.sdk.ui.GPHContentType;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class o {

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, W8.b.class, "onSuggestionPressed", "onSuggestionPressed(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Lcom/giphy/sdk/ui/GPHSuggestion;)V", 1);
        }

        public final void a(O8.g p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            W8.b.e((W8.a) this.receiver, p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((O8.g) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ W8.a f13149d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f13150e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(W8.a aVar, String str) {
            super(2);
            this.f13149d = aVar;
            this.f13150e = str;
        }

        public final void a(List result, Throwable th2) {
            Intrinsics.checkNotNullParameter(result, "result");
            List a10 = o.a(this.f13149d, result, this.f13150e);
            this.f13149d.setCanShowSuggestions$giphy_ui_2_3_17_release(!a10.isEmpty());
            if (a10.isEmpty()) {
                o.b(this.f13149d);
            } else {
                o.e(this.f13149d);
            }
            D suggestionsView$giphy_ui_2_3_17_release = this.f13149d.getSuggestionsView$giphy_ui_2_3_17_release();
            if (suggestionsView$giphy_ui_2_3_17_release != null) {
                suggestionsView$giphy_ui_2_3_17_release.x(a10);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((List) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }
    }

    public static final List a(W8.a aVar, List suggestions, String str) {
        Character firstOrNull;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        if (aVar.getGiphySettings$giphy_ui_2_3_17_release().getEnableDynamicText()) {
            GPHContentType[] mediaTypeConfig = aVar.getGiphySettings$giphy_ui_2_3_17_release().getMediaTypeConfig();
            GPHContentType gPHContentType = GPHContentType.text;
            if (ArraysKt.contains(mediaTypeConfig, gPHContentType) && !CollectionsKt.listOf(gPHContentType).contains(aVar.getContentType$giphy_ui_2_3_17_release()) && str != null && str.length() != 0 && ((firstOrNull = StringsKt.firstOrNull(str)) == null || firstOrNull.charValue() != '@')) {
                List mutableList = CollectionsKt.toMutableList((Collection) suggestions);
                mutableList.add(0, new O8.g(O8.f.Text, str));
                return mutableList;
            }
        }
        return suggestions;
    }

    public static final synchronized void b(W8.a aVar) {
        synchronized (o.class) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            D suggestionsView$giphy_ui_2_3_17_release = aVar.getSuggestionsView$giphy_ui_2_3_17_release();
            if (suggestionsView$giphy_ui_2_3_17_release != null) {
                suggestionsView$giphy_ui_2_3_17_release.setVisibility(8);
            }
            View suggestionsPlaceholderView$giphy_ui_2_3_17_release = aVar.getSuggestionsPlaceholderView$giphy_ui_2_3_17_release();
            if (suggestionsPlaceholderView$giphy_ui_2_3_17_release != null) {
                suggestionsPlaceholderView$giphy_ui_2_3_17_release.setVisibility(0);
            }
        }
    }

    public static final void c(W8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Context context = aVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        aVar.setSuggestionsView$giphy_ui_2_3_17_release(new D(context, O8.k.f8390a.h(), new a(aVar)));
        aVar.setSuggestionsPlaceholderView$giphy_ui_2_3_17_release(new View(aVar.getContext()));
        D suggestionsView$giphy_ui_2_3_17_release = aVar.getSuggestionsView$giphy_ui_2_3_17_release();
        Intrinsics.checkNotNull(suggestionsView$giphy_ui_2_3_17_release);
        View suggestionsPlaceholderView$giphy_ui_2_3_17_release = aVar.getSuggestionsPlaceholderView$giphy_ui_2_3_17_release();
        Intrinsics.checkNotNull(suggestionsPlaceholderView$giphy_ui_2_3_17_release);
        View[] viewArr = {suggestionsView$giphy_ui_2_3_17_release, suggestionsPlaceholderView$giphy_ui_2_3_17_release};
        for (int i10 = 0; i10 < 2; i10++) {
            View view = viewArr[i10];
            view.setBackgroundColor(O8.k.f8390a.h().a());
            view.setId(Intrinsics.areEqual(view, aVar.getSuggestionsView$giphy_ui_2_3_17_release()) ? O8.s.f8443C : O8.s.f8441B);
            aVar.getSearchBarContainer$giphy_ui_2_3_17_release().addView(view);
            androidx.constraintlayout.widget.d searchBarConstrains$giphy_ui_2_3_17_release = aVar.getSearchBarConstrains$giphy_ui_2_3_17_release();
            int id2 = view.getId();
            a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
            Intrinsics.checkNotNull(searchBar$giphy_ui_2_3_17_release);
            searchBarConstrains$giphy_ui_2_3_17_release.h(id2, 3, searchBar$giphy_ui_2_3_17_release.getId(), 4);
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(view.getId(), 6, 0, 6);
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(view.getId(), 7, 0, 7);
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(view.getId(), 4, 0, 4);
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().m(view.getId(), 0);
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().l(view.getId(), Intrinsics.areEqual(view, aVar.getSuggestionsView$giphy_ui_2_3_17_release()) ? aVar.getSuggestionsHeight$giphy_ui_2_3_17_release() : aVar.getSearchBarMarginBottom$giphy_ui_2_3_17_release());
            if (Intrinsics.areEqual(view, aVar.getSuggestionsView$giphy_ui_2_3_17_release())) {
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().y(view.getId(), 3, aVar.getSearchBarMarginTop$giphy_ui_2_3_17_release() / 2);
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().y(view.getId(), 4, aVar.getSearchBarMarginTop$giphy_ui_2_3_17_release() / 2);
            }
        }
    }

    public static final boolean d(W8.a aVar) {
        Configuration configuration;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Resources resources = aVar.getContext().getResources();
        if ((resources == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) && aVar.getGiphySettings$giphy_ui_2_3_17_release().getShowSuggestionsBar()) {
            return (aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.text && aVar.getTextState$giphy_ui_2_3_17_release() == U.c.Create) || aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.clips || aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.emoji;
        }
        return true;
    }

    public static final synchronized void e(W8.a aVar) {
        Configuration configuration;
        synchronized (o.class) {
            try {
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                Resources resources = aVar.getContext().getResources();
                if ((resources == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) && aVar.getCanShowSuggestions$giphy_ui_2_3_17_release() && !d(aVar)) {
                    D suggestionsView$giphy_ui_2_3_17_release = aVar.getSuggestionsView$giphy_ui_2_3_17_release();
                    if (suggestionsView$giphy_ui_2_3_17_release != null) {
                        suggestionsView$giphy_ui_2_3_17_release.setVisibility(0);
                    }
                    View suggestionsPlaceholderView$giphy_ui_2_3_17_release = aVar.getSuggestionsPlaceholderView$giphy_ui_2_3_17_release();
                    if (suggestionsPlaceholderView$giphy_ui_2_3_17_release != null) {
                        suggestionsPlaceholderView$giphy_ui_2_3_17_release.setVisibility(8);
                    }
                    return;
                }
                b(aVar);
            } finally {
            }
        }
    }

    public static final void f(W8.a aVar) {
        O8.f fVar;
        String query$giphy_ui_2_3_17_release;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (d(aVar)) {
            b(aVar);
            return;
        }
        if (aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.recents || (((query$giphy_ui_2_3_17_release = aVar.getQuery$giphy_ui_2_3_17_release()) == null || query$giphy_ui_2_3_17_release.length() == 0) && aVar.getPKeyboardState$giphy_ui_2_3_17_release() == U.d.OPEN)) {
            fVar = O8.f.Recents;
        } else {
            String query$giphy_ui_2_3_17_release2 = aVar.getQuery$giphy_ui_2_3_17_release();
            fVar = ((query$giphy_ui_2_3_17_release2 == null || query$giphy_ui_2_3_17_release2.length() == 0) && aVar.getPKeyboardState$giphy_ui_2_3_17_release() == U.d.CLOSED) ? O8.f.Trending : O8.f.Channels;
        }
        O8.f fVar2 = fVar;
        String query$giphy_ui_2_3_17_release3 = aVar.getQuery$giphy_ui_2_3_17_release();
        if (query$giphy_ui_2_3_17_release3 == null) {
            query$giphy_ui_2_3_17_release3 = "";
        }
        String str = query$giphy_ui_2_3_17_release3;
        h.a.a(aVar.getGphSuggestions$giphy_ui_2_3_17_release(), fVar2, str, false, new b(aVar, str), 4, null);
    }
}

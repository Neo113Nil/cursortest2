package ru.ozon.app.android.yandexsearchsheet;

import B0.A0;
import G.g;
import Tl.b;
import androidx.lifecycle.P;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002!\"J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel;", "", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "suggest", "", "position", "", "inputQuery", "", "suggestClicked", "(Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;ILjava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "suggestWarningClicked", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "data", "bindInitial", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;)V", SearchIntents.EXTRA_QUERY, "onTypedQuery", "(Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$ScreenUI;", "getScreenUI", "()Landroidx/lifecycle/P;", "screenUI", "", "getLoader", "loader", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action;", "getAction", "action", "Action", "ScreenUI", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface YandexSearchSheetViewModel {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action;", "", "<init>", "()V", "Dismiss", "DismissAndRedirect", "ChangeQuery", "SuggestSelected", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$ChangeQuery;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$Dismiss;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$DismissAndRedirect;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$SuggestSelected;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$ChangeQuery;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action;", "", SearchIntents.EXTRA_QUERY, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuery", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangeQuery extends Action {

            @NotNull
            private final String query;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChangeQuery(@NotNull String query) {
                super(null);
                Intrinsics.checkNotNullParameter(query, "query");
                this.query = query;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChangeQuery) && Intrinsics.d(this.query, ((ChangeQuery) other).query);
            }

            @NotNull
            public final String getQuery() {
                return this.query;
            }

            public int hashCode() {
                return this.query.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ChangeQuery(query=", this.query, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$Dismiss;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action;", "<init>", "()V", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Dismiss extends Action {

            @NotNull
            public static final Dismiss INSTANCE = new Dismiss();

            private Dismiss() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$DismissAndRedirect;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action;", "", "link", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DismissAndRedirect extends Action {

            @NotNull
            private final String link;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DismissAndRedirect(@NotNull String link) {
                super(null);
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DismissAndRedirect) && Intrinsics.d(this.link, ((DismissAndRedirect) other).link);
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                return this.link.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("DismissAndRedirect(link=", this.link, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$SuggestSelected;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "data", "<init>", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "getData", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuggestSelected extends Action {

            @NotNull
            private final YandexSearchSheetFragment.Data data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuggestSelected(@NotNull YandexSearchSheetFragment.Data data) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SuggestSelected) && Intrinsics.d(this.data, ((SuggestSelected) other).data);
            }

            @NotNull
            public final YandexSearchSheetFragment.Data getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            @NotNull
            public String toString() {
                return "SuggestSelected(data=" + this.data + ")";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$ScreenUI;", "", "", "screenTitle", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "subtitle", "hint", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO;", SuggestionDTO.TYPE_SUGGEST, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/yandexsearchsheet/SuggestVO;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/yandexsearchsheet/SuggestVO;)Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$ScreenUI;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreenTitle", "Ljava/util/List;", "getSubtitle", "()Ljava/util/List;", "getHint", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO;", "getSuggests", "()Lru/ozon/app/android/yandexsearchsheet/SuggestVO;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScreenUI {

        @NotNull
        private final String hint;
        private final String screenTitle;

        @NotNull
        private final List<AtomDTO> subtitle;

        @NotNull
        private final SuggestVO suggests;

        /* JADX WARN: Multi-variable type inference failed */
        public ScreenUI(String str, @NotNull List<? extends AtomDTO> subtitle, @NotNull String hint, @NotNull SuggestVO suggests) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(suggests, "suggests");
            this.screenTitle = str;
            this.subtitle = subtitle;
            this.hint = hint;
            this.suggests = suggests;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ScreenUI copy$default(ScreenUI screenUI, String str, List list, String str2, SuggestVO suggestVO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = screenUI.screenTitle;
            }
            if ((i11 & 2) != 0) {
                list = screenUI.subtitle;
            }
            if ((i11 & 4) != 0) {
                str2 = screenUI.hint;
            }
            if ((i11 & 8) != 0) {
                suggestVO = screenUI.suggests;
            }
            return screenUI.copy(str, list, str2, suggestVO);
        }

        @NotNull
        public final ScreenUI copy(String screenTitle, @NotNull List<? extends AtomDTO> subtitle, @NotNull String hint, @NotNull SuggestVO suggests) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(suggests, "suggests");
            return new ScreenUI(screenTitle, subtitle, hint, suggests);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenUI)) {
                return false;
            }
            ScreenUI screenUI = (ScreenUI) other;
            return Intrinsics.d(this.screenTitle, screenUI.screenTitle) && Intrinsics.d(this.subtitle, screenUI.subtitle) && Intrinsics.d(this.hint, screenUI.hint) && Intrinsics.d(this.suggests, screenUI.suggests);
        }

        @NotNull
        public final String getHint() {
            return this.hint;
        }

        public final String getScreenTitle() {
            return this.screenTitle;
        }

        @NotNull
        public final List<AtomDTO> getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final SuggestVO getSuggests() {
            return this.suggests;
        }

        public int hashCode() {
            String str = this.screenTitle;
            return this.suggests.hashCode() + g.a(g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.subtitle), 31, this.hint);
        }

        @NotNull
        public String toString() {
            String str = this.screenTitle;
            List<AtomDTO> list = this.subtitle;
            String str2 = this.hint;
            SuggestVO suggestVO = this.suggests;
            StringBuilder f7 = b.f("ScreenUI(screenTitle=", str, ", subtitle=", ", hint=", list);
            f7.append(str2);
            f7.append(", suggests=");
            f7.append(suggestVO);
            f7.append(")");
            return f7.toString();
        }
    }

    void bindInitial(@NotNull YandexSearchSheetFragment.Data data);

    @NotNull
    P<Action> getAction();

    @NotNull
    P<Boolean> getLoader();

    @NotNull
    P<ScreenUI> getScreenUI();

    void onTypedQuery(@NotNull String query);

    void suggestClicked(@NotNull SuggestVO.Suggest.SuggestInfo suggest, int position, @NotNull String inputQuery);

    void suggestWarningClicked(@NotNull AtomAction atomAction);
}

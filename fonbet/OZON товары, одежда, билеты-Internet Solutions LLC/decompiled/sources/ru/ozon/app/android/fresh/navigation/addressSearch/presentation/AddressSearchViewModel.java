package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import B0.A0;
import H3.c;
import android.content.Context;
import androidx.lifecycle.P;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.MapSdkSuggestionVO;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u001c\u001dJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel;", "", "", SearchIntents.EXTRA_QUERY, "", "bindInitial", "(Ljava/lang/String;)V", "searchText", "onQueryChanged", "Landroid/content/Context;", "context", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "suggest", "", "index", "suggestClicked", "(Landroid/content/Context;Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;I)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$ScreenUI;", "getScreenUI", "()Landroidx/lifecycle/P;", "screenUI", "", "getLoader", "loader", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action;", "getAction", "action", "Action", "ScreenUI", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AddressSearchViewModel {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action;", "", "<init>", "()V", "ChangeQuery", "ShowError", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action$ChangeQuery;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action$ShowError;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action$ChangeQuery;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action;", "", SearchIntents.EXTRA_QUERY, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuery", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action$ShowError;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowError extends Action {

            @NotNull
            private final String error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowError(@NotNull String error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowError) && Intrinsics.d(this.error, ((ShowError) other).error);
            }

            @NotNull
            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ShowError(error=", this.error, ")");
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$ScreenUI;", "", "", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", SuggestionDTO.TYPE_SUGGEST, "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSuggests", "()Ljava/util/List;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScreenUI {

        @NotNull
        private final List<MapSdkSuggestionVO> suggests;

        public ScreenUI(@NotNull List<MapSdkSuggestionVO> suggests) {
            Intrinsics.checkNotNullParameter(suggests, "suggests");
            this.suggests = suggests;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScreenUI) && Intrinsics.d(this.suggests, ((ScreenUI) other).suggests);
        }

        @NotNull
        public final List<MapSdkSuggestionVO> getSuggests() {
            return this.suggests;
        }

        public int hashCode() {
            return this.suggests.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("ScreenUI(suggests=", ")", this.suggests);
        }
    }

    void bindInitial(String query);

    @NotNull
    P<Action> getAction();

    @NotNull
    P<Boolean> getLoader();

    @NotNull
    P<ScreenUI> getScreenUI();

    void onQueryChanged(@NotNull String searchText);

    void suggestClicked(@NotNull Context context, @NotNull MapSdkSuggestionVO suggest, int index);
}

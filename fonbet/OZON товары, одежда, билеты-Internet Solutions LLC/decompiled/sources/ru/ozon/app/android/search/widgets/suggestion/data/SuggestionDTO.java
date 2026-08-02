package ru.ozon.app.android.search.widgets.suggestion.data;

import B0.A0;
import B4.V;
import C.o0;
import G.g;
import I1.w;
import N3.C3660k;
import Sh.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001b\u001c\u001dB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "items", "", "Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO;", "removeHistoryActionName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getRemoveHistoryActionName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "SuggestionItemDTO", "BreadcrumbsDTO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionDTO {

    @Deprecated
    @NotNull
    public static final String TYPE_CONTEXT_SUGGEST = "context";

    @Deprecated
    @NotNull
    public static final String TYPE_HISTORY = "history";

    @Deprecated
    @NotNull
    public static final String TYPE_SUGGEST = "suggests";
    private final List<SuggestionItemDTO> items;
    private final String removeHistoryActionName;
    private final String title;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$BreadcrumbsDTO;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class BreadcrumbsDTO {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        public BreadcrumbsDTO(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public static /* synthetic */ BreadcrumbsDTO copy$default(BreadcrumbsDTO breadcrumbsDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = breadcrumbsDTO.text;
            }
            return breadcrumbsDTO.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final BreadcrumbsDTO copy(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new BreadcrumbsDTO(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BreadcrumbsDTO) && Intrinsics.d(this.text, ((BreadcrumbsDTO) other).text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("BreadcrumbsDTO(text=", this.text, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$Companion;", "", "<init>", "()V", "TYPE_SUGGEST", "", "TYPE_CONTEXT_SUGGEST", "TYPE_HISTORY", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003JÂ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&¨\u0006="}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "queryText", "breadCrumbs", "", "Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$BreadcrumbsDTO;", "deeplink", "shouldPrefetch", "", "image", "note", "meta", "Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO$MetaDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "searchTrackingInfo", "removeTrackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO$MetaDTO;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getQueryText", "getBreadCrumbs", "()Ljava/util/List;", "getDeeplink", "getShouldPrefetch", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getImage", "getNote", "getMeta", "()Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO$MetaDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getSearchTrackingInfo", "getRemoveTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO$MetaDTO;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO;", "equals", "other", "hashCode", "", "toString", "MetaDTO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    /* loaded from: classes7.dex */
    public static final /* data */ class SuggestionItemDTO {
        public static final int $stable = 8;
        private final List<BreadcrumbsDTO> breadCrumbs;

        @NotNull
        private final String deeplink;
        private final String image;
        private final MetaDTO meta;
        private final String note;

        @NotNull
        private final String queryText;
        private final Map<String, TokenizedTrackingInfo> removeTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> searchTrackingInfo;
        private final Boolean shouldPrefetch;
        private final String subtitle;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO$MetaDTO;", "", "type", "", "isPromotedProduct", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getType", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isSuggest", "isHistory", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO$MetaDTO;", "equals", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MetaDTO {
            public static final int $stable = 0;
            private final Boolean isPromotedProduct;
            private final String type;

            public MetaDTO(String str, Boolean bool) {
                this.type = str;
                this.isPromotedProduct = bool;
            }

            public static /* synthetic */ MetaDTO copy$default(MetaDTO metaDTO, String str, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = metaDTO.type;
                }
                if ((i11 & 2) != 0) {
                    bool = metaDTO.isPromotedProduct;
                }
                return metaDTO.copy(str, bool);
            }

            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getIsPromotedProduct() {
                return this.isPromotedProduct;
            }

            @NotNull
            public final MetaDTO copy(String type, Boolean isPromotedProduct) {
                return new MetaDTO(type, isPromotedProduct);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MetaDTO)) {
                    return false;
                }
                MetaDTO metaDTO = (MetaDTO) other;
                return Intrinsics.d(this.type, metaDTO.type) && Intrinsics.d(this.isPromotedProduct, metaDTO.isPromotedProduct);
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                String str = this.type;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Boolean bool = this.isPromotedProduct;
                return hashCode + (bool != null ? bool.hashCode() : 0);
            }

            public final boolean isHistory() {
                return Intrinsics.d(this.type, SuggestionDTO.TYPE_HISTORY);
            }

            public final Boolean isPromotedProduct() {
                return this.isPromotedProduct;
            }

            public final boolean isSuggest() {
                return Intrinsics.d(this.type, SuggestionDTO.TYPE_SUGGEST) || Intrinsics.d(this.type, "context");
            }

            @NotNull
            public String toString() {
                return "MetaDTO(type=" + this.type + ", isPromotedProduct=" + this.isPromotedProduct + ")";
            }
        }

        public SuggestionItemDTO(@NotNull String title, String str, @NotNull String queryText, List<BreadcrumbsDTO> list, @NotNull String deeplink, Boolean bool, String str2, String str3, MetaDTO metaDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(queryText, "queryText");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.subtitle = str;
            this.queryText = queryText;
            this.breadCrumbs = list;
            this.deeplink = deeplink;
            this.shouldPrefetch = bool;
            this.image = str2;
            this.note = str3;
            this.meta = metaDTO;
            this.trackingInfo = map;
            this.searchTrackingInfo = map2;
            this.removeTrackingInfo = map3;
        }

        public static /* synthetic */ SuggestionItemDTO copy$default(SuggestionItemDTO suggestionItemDTO, String str, String str2, String str3, List list, String str4, Boolean bool, String str5, String str6, MetaDTO metaDTO, Map map, Map map2, Map map3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = suggestionItemDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = suggestionItemDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                str3 = suggestionItemDTO.queryText;
            }
            if ((i11 & 8) != 0) {
                list = suggestionItemDTO.breadCrumbs;
            }
            if ((i11 & 16) != 0) {
                str4 = suggestionItemDTO.deeplink;
            }
            if ((i11 & 32) != 0) {
                bool = suggestionItemDTO.shouldPrefetch;
            }
            if ((i11 & 64) != 0) {
                str5 = suggestionItemDTO.image;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str6 = suggestionItemDTO.note;
            }
            if ((i11 & 256) != 0) {
                metaDTO = suggestionItemDTO.meta;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = suggestionItemDTO.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                map2 = suggestionItemDTO.searchTrackingInfo;
            }
            if ((i11 & 2048) != 0) {
                map3 = suggestionItemDTO.removeTrackingInfo;
            }
            Map map4 = map2;
            Map map5 = map3;
            MetaDTO metaDTO2 = metaDTO;
            Map map6 = map;
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            Boolean bool2 = bool;
            return suggestionItemDTO.copy(str, str2, str3, list, str9, bool2, str7, str8, metaDTO2, map6, map4, map5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.searchTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component12() {
            return this.removeTrackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getQueryText() {
            return this.queryText;
        }

        public final List<BreadcrumbsDTO> component4() {
            return this.breadCrumbs;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getShouldPrefetch() {
            return this.shouldPrefetch;
        }

        /* renamed from: component7, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component8, reason: from getter */
        public final String getNote() {
            return this.note;
        }

        /* renamed from: component9, reason: from getter */
        public final MetaDTO getMeta() {
            return this.meta;
        }

        @NotNull
        public final SuggestionItemDTO copy(@NotNull String title, String subtitle, @NotNull String queryText, List<BreadcrumbsDTO> breadCrumbs, @NotNull String deeplink, Boolean shouldPrefetch, String image, String note, MetaDTO meta, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> searchTrackingInfo, Map<String, TokenizedTrackingInfo> removeTrackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(queryText, "queryText");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new SuggestionItemDTO(title, subtitle, queryText, breadCrumbs, deeplink, shouldPrefetch, image, note, meta, trackingInfo, searchTrackingInfo, removeTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestionItemDTO)) {
                return false;
            }
            SuggestionItemDTO suggestionItemDTO = (SuggestionItemDTO) other;
            return Intrinsics.d(this.title, suggestionItemDTO.title) && Intrinsics.d(this.subtitle, suggestionItemDTO.subtitle) && Intrinsics.d(this.queryText, suggestionItemDTO.queryText) && Intrinsics.d(this.breadCrumbs, suggestionItemDTO.breadCrumbs) && Intrinsics.d(this.deeplink, suggestionItemDTO.deeplink) && Intrinsics.d(this.shouldPrefetch, suggestionItemDTO.shouldPrefetch) && Intrinsics.d(this.image, suggestionItemDTO.image) && Intrinsics.d(this.note, suggestionItemDTO.note) && Intrinsics.d(this.meta, suggestionItemDTO.meta) && Intrinsics.d(this.trackingInfo, suggestionItemDTO.trackingInfo) && Intrinsics.d(this.searchTrackingInfo, suggestionItemDTO.searchTrackingInfo) && Intrinsics.d(this.removeTrackingInfo, suggestionItemDTO.removeTrackingInfo);
        }

        public final List<BreadcrumbsDTO> getBreadCrumbs() {
            return this.breadCrumbs;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getImage() {
            return this.image;
        }

        public final MetaDTO getMeta() {
            return this.meta;
        }

        public final String getNote() {
            return this.note;
        }

        @NotNull
        public final String getQueryText() {
            return this.queryText;
        }

        public final Map<String, TokenizedTrackingInfo> getRemoveTrackingInfo() {
            return this.removeTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getSearchTrackingInfo() {
            return this.searchTrackingInfo;
        }

        public final Boolean getShouldPrefetch() {
            return this.shouldPrefetch;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.queryText);
            List<BreadcrumbsDTO> list = this.breadCrumbs;
            int a12 = g.a((a11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.deeplink);
            Boolean bool = this.shouldPrefetch;
            int hashCode2 = (a12 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.image;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.note;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            MetaDTO metaDTO = this.meta;
            int hashCode5 = (hashCode4 + (metaDTO == null ? 0 : metaDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.searchTrackingInfo;
            int hashCode7 = (hashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.removeTrackingInfo;
            return hashCode7 + (map3 != null ? map3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.queryText;
            List<BreadcrumbsDTO> list = this.breadCrumbs;
            String str4 = this.deeplink;
            Boolean bool = this.shouldPrefetch;
            String str5 = this.image;
            String str6 = this.note;
            MetaDTO metaDTO = this.meta;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.searchTrackingInfo;
            Map<String, TokenizedTrackingInfo> map3 = this.removeTrackingInfo;
            StringBuilder d11 = C3660k.d("SuggestionItemDTO(title=", str, ", subtitle=", str2, ", queryText=");
            w.d(str3, ", breadCrumbs=", ", deeplink=", d11, list);
            a.d(bool, str4, ", shouldPrefetch=", ", image=", d11);
            Nh.a.h(d11, str5, ", note=", str6, ", meta=");
            d11.append(metaDTO);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", searchTrackingInfo=");
            return V.c(d11, map2, ", removeTrackingInfo=", map3, ")");
        }
    }

    public SuggestionDTO(String str, List<SuggestionItemDTO> list, String str2) {
        this.title = str;
        this.items = list;
        this.removeHistoryActionName = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestionDTO copy$default(SuggestionDTO suggestionDTO, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = suggestionDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = suggestionDTO.items;
        }
        if ((i11 & 4) != 0) {
            str2 = suggestionDTO.removeHistoryActionName;
        }
        return suggestionDTO.copy(str, list, str2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<SuggestionItemDTO> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemoveHistoryActionName() {
        return this.removeHistoryActionName;
    }

    @NotNull
    public final SuggestionDTO copy(String title, List<SuggestionItemDTO> items, String removeHistoryActionName) {
        return new SuggestionDTO(title, items, removeHistoryActionName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionDTO)) {
            return false;
        }
        SuggestionDTO suggestionDTO = (SuggestionDTO) other;
        return Intrinsics.d(this.title, suggestionDTO.title) && Intrinsics.d(this.items, suggestionDTO.items) && Intrinsics.d(this.removeHistoryActionName, suggestionDTO.removeHistoryActionName);
    }

    public final List<SuggestionItemDTO> getItems() {
        return this.items;
    }

    public final String getRemoveHistoryActionName() {
        return this.removeHistoryActionName;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SuggestionItemDTO> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.removeHistoryActionName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<SuggestionItemDTO> list = this.items;
        return o0.c(b.f("SuggestionDTO(title=", str, ", items=", ", removeHistoryActionName=", list), this.removeHistoryActionName, ")");
    }
}

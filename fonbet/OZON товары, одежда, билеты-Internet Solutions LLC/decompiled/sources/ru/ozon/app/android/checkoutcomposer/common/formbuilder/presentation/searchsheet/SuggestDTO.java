package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestDTO;", "", SuggestionDTO.TYPE_SUGGEST, "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestDTO$Suggest;", "<init>", "(Ljava/util/List;)V", "getSuggests", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Suggest", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SuggestDTO {

    @NotNull
    private final List<Suggest> suggests;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestDTO$Suggest;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "link", "notExact", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getLink", "getNotExact", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Suggest {

        @NotNull
        private final String link;
        private final boolean notExact;
        private final String subtitle;

        @NotNull
        private final String title;

        public Suggest(@NotNull String title, String str, @NotNull String link, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(link, "link");
            this.title = title;
            this.subtitle = str;
            this.link = link;
            this.notExact = z11;
        }

        public static /* synthetic */ Suggest copy$default(Suggest suggest, String str, String str2, String str3, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = suggest.title;
            }
            if ((i11 & 2) != 0) {
                str2 = suggest.subtitle;
            }
            if ((i11 & 4) != 0) {
                str3 = suggest.link;
            }
            if ((i11 & 8) != 0) {
                z11 = suggest.notExact;
            }
            return suggest.copy(str, str2, str3, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getNotExact() {
            return this.notExact;
        }

        @NotNull
        public final Suggest copy(@NotNull String title, String subtitle, @NotNull String link, boolean notExact) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(link, "link");
            return new Suggest(title, subtitle, link, notExact);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Suggest)) {
                return false;
            }
            Suggest suggest = (Suggest) other;
            return Intrinsics.d(this.title, suggest.title) && Intrinsics.d(this.subtitle, suggest.subtitle) && Intrinsics.d(this.link, suggest.link) && this.notExact == suggest.notExact;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final boolean getNotExact() {
            return this.notExact;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return Boolean.hashCode(this.notExact) + g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.link);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.link;
            boolean z11 = this.notExact;
            StringBuilder d11 = C3660k.d("Suggest(title=", str, ", subtitle=", str2, ", link=");
            d11.append(str3);
            d11.append(", notExact=");
            d11.append(z11);
            d11.append(")");
            return d11.toString();
        }
    }

    public SuggestDTO(@NotNull List<Suggest> suggests) {
        Intrinsics.checkNotNullParameter(suggests, "suggests");
        this.suggests = suggests;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestDTO copy$default(SuggestDTO suggestDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = suggestDTO.suggests;
        }
        return suggestDTO.copy(list);
    }

    @NotNull
    public final List<Suggest> component1() {
        return this.suggests;
    }

    @NotNull
    public final SuggestDTO copy(@NotNull List<Suggest> suggests) {
        Intrinsics.checkNotNullParameter(suggests, "suggests");
        return new SuggestDTO(suggests);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SuggestDTO) && Intrinsics.d(this.suggests, ((SuggestDTO) other).suggests);
    }

    @NotNull
    public final List<Suggest> getSuggests() {
        return this.suggests;
    }

    public int hashCode() {
        return this.suggests.hashCode();
    }

    @NotNull
    public String toString() {
        return H3.c.a("SuggestDTO(suggests=", ")", this.suggests);
    }
}

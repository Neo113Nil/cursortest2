package ru.ozon.id.nativeauth.credentials.countryCode;

import B0.A0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO;", "", "navBar", "Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO$NavBar;", "countrySelect", "", "Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO$CountrySelect;", "<init>", "(Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO$NavBar;Ljava/util/List;)V", "getNavBar", "()Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO$NavBar;", "getCountrySelect", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "NavBar", "CountrySelect", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PhoneCodeCountrySelectDTO {

    @NotNull
    private final List<CountrySelect> countrySelect;

    @NotNull
    private final NavBar navBar;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO$NavBar;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavBar {

        @NotNull
        private final String title;

        public NavBar(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public static /* synthetic */ NavBar copy$default(NavBar navBar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = navBar.title;
            }
            return navBar.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final NavBar copy(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new NavBar(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavBar) && Intrinsics.d(this.title, ((NavBar) other).title);
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("NavBar(title=", this.title, ")");
        }
    }

    public PhoneCodeCountrySelectDTO(@NotNull NavBar navBar, @NotNull List<CountrySelect> countrySelect) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(countrySelect, "countrySelect");
        this.navBar = navBar;
        this.countrySelect = countrySelect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneCodeCountrySelectDTO copy$default(PhoneCodeCountrySelectDTO phoneCodeCountrySelectDTO, NavBar navBar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            navBar = phoneCodeCountrySelectDTO.navBar;
        }
        if ((i11 & 2) != 0) {
            list = phoneCodeCountrySelectDTO.countrySelect;
        }
        return phoneCodeCountrySelectDTO.copy(navBar, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NavBar getNavBar() {
        return this.navBar;
    }

    @NotNull
    public final List<CountrySelect> component2() {
        return this.countrySelect;
    }

    @NotNull
    public final PhoneCodeCountrySelectDTO copy(@NotNull NavBar navBar, @NotNull List<CountrySelect> countrySelect) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(countrySelect, "countrySelect");
        return new PhoneCodeCountrySelectDTO(navBar, countrySelect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneCodeCountrySelectDTO)) {
            return false;
        }
        PhoneCodeCountrySelectDTO phoneCodeCountrySelectDTO = (PhoneCodeCountrySelectDTO) other;
        return Intrinsics.d(this.navBar, phoneCodeCountrySelectDTO.navBar) && Intrinsics.d(this.countrySelect, phoneCodeCountrySelectDTO.countrySelect);
    }

    @NotNull
    public final List<CountrySelect> getCountrySelect() {
        return this.countrySelect;
    }

    @NotNull
    public final NavBar getNavBar() {
        return this.navBar;
    }

    public int hashCode() {
        return this.countrySelect.hashCode() + (this.navBar.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PhoneCodeCountrySelectDTO(navBar=" + this.navBar + ", countrySelect=" + this.countrySelect + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO$CountrySelect;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "link", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getLink", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountrySelect {
        private final boolean isSelected;

        @NotNull
        private final String link;

        @NotNull
        private final String title;

        public CountrySelect(@NotNull String title, @NotNull String link, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(link, "link");
            this.title = title;
            this.link = link;
            this.isSelected = z11;
        }

        public static /* synthetic */ CountrySelect copy$default(CountrySelect countrySelect, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = countrySelect.title;
            }
            if ((i11 & 2) != 0) {
                str2 = countrySelect.link;
            }
            if ((i11 & 4) != 0) {
                z11 = countrySelect.isSelected;
            }
            return countrySelect.copy(str, str2, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public final CountrySelect copy(@NotNull String title, @NotNull String link, boolean isSelected) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(link, "link");
            return new CountrySelect(title, link, isSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountrySelect)) {
                return false;
            }
            CountrySelect countrySelect = (CountrySelect) other;
            return Intrinsics.d(this.title, countrySelect.title) && Intrinsics.d(this.link, countrySelect.link) && this.isSelected == countrySelect.isSelected;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected) + g.a(this.title.hashCode() * 31, 31, this.link);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.link;
            return Pk0.a.a(")", C3660k.d("CountrySelect(title=", str, ", link=", str2, ", isSelected="), this.isSelected);
        }

        public /* synthetic */ CountrySelect(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? false : z11);
        }
    }
}

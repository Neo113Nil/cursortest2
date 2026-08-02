package ru.ozon.app.android.yandexsearchsheet;

import C.o0;
import G.g;
import H3.c;
import Kk.C3532b;
import N3.C3660k;
import TY.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.yandexsearchsheet.adapter.YandexSuggestionsAdapter;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/SuggestVO;", "", "", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", SuggestionDTO.TYPE_SUGGEST, "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSuggests", "()Ljava/util/List;", "Suggest", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SuggestVO {

    @NotNull
    private final List<Suggest> suggests;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", "", "type", "Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$ViewType;", "<init>", "(Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$ViewType;)V", "getType", "()Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$ViewType;", "SuggestInfo", "Coordinates", "Warning", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Warning;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Suggest {

        @NotNull
        private final YandexSuggestionsAdapter.ViewType type;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Coordinates;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getLatitude", "()Ljava/lang/Double;", "getLongitude", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Coordinates implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Coordinates> CREATOR = new Creator();
            private final Double latitude;
            private final Double longitude;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Coordinates> {
                @Override // android.os.Parcelable.Creator
                public final Coordinates createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Coordinates(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Coordinates[] newArray(int i11) {
                    return new Coordinates[i11];
                }
            }

            public Coordinates(Double d11, Double d12) {
                this.latitude = d11;
                this.longitude = d12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Coordinates)) {
                    return false;
                }
                Coordinates coordinates = (Coordinates) other;
                return Intrinsics.d(this.latitude, coordinates.latitude) && Intrinsics.d(this.longitude, coordinates.longitude);
            }

            public int hashCode() {
                Double d11 = this.latitude;
                int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
                Double d12 = this.longitude;
                return hashCode + (d12 != null ? d12.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return this.latitude + "," + this.longitude;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Double d11 = this.latitude;
                if (d11 == null) {
                    dest.writeInt(0);
                } else {
                    a.d(dest, 1, d11);
                }
                Double d12 = this.longitude;
                if (d12 == null) {
                    dest.writeInt(0);
                } else {
                    a.d(dest, 1, d12);
                }
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b'\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b(\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b\r\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b/\u0010\u001d¨\u00060"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", "Landroid/os/Parcelable;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "displayFullAddress", "searchText", "updateLink", "contextLocationUid", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Coordinates;", "coordinates", "", "isTrustCoordinates", "numberPVZ", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Coordinates;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Coordinates;ZLjava/lang/String;)Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDisplayFullAddress", "getSearchText", "getUpdateLink", "getContextLocationUid", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Coordinates;", "getCoordinates", "()Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Coordinates;", "Z", "()Z", "getNumberPVZ", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuggestInfo extends Suggest implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<SuggestInfo> CREATOR = new Creator();
            private final String contextLocationUid;
            private final Coordinates coordinates;

            @NotNull
            private final String displayFullAddress;
            private final boolean isTrustCoordinates;
            private final String numberPVZ;

            @NotNull
            private final String searchText;
            private final String subtitle;

            @NotNull
            private final String title;
            private final String updateLink;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SuggestInfo> {
                @Override // android.os.Parcelable.Creator
                public final SuggestInfo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SuggestInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SuggestInfo[] newArray(int i11) {
                    return new SuggestInfo[i11];
                }
            }

            public /* synthetic */ SuggestInfo(String str, String str2, String str3, String str4, String str5, String str6, Coordinates coordinates, boolean z11, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : coordinates, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, (i11 & 256) != 0 ? null : str7);
            }

            public static /* synthetic */ SuggestInfo copy$default(SuggestInfo suggestInfo, String str, String str2, String str3, String str4, String str5, String str6, Coordinates coordinates, boolean z11, String str7, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = suggestInfo.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = suggestInfo.subtitle;
                }
                if ((i11 & 4) != 0) {
                    str3 = suggestInfo.displayFullAddress;
                }
                if ((i11 & 8) != 0) {
                    str4 = suggestInfo.searchText;
                }
                if ((i11 & 16) != 0) {
                    str5 = suggestInfo.updateLink;
                }
                if ((i11 & 32) != 0) {
                    str6 = suggestInfo.contextLocationUid;
                }
                if ((i11 & 64) != 0) {
                    coordinates = suggestInfo.coordinates;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    z11 = suggestInfo.isTrustCoordinates;
                }
                if ((i11 & 256) != 0) {
                    str7 = suggestInfo.numberPVZ;
                }
                boolean z12 = z11;
                String str8 = str7;
                String str9 = str6;
                Coordinates coordinates2 = coordinates;
                String str10 = str5;
                String str11 = str3;
                return suggestInfo.copy(str, str2, str11, str4, str10, str9, coordinates2, z12, str8);
            }

            @NotNull
            public final SuggestInfo copy(@NotNull String title, String subtitle, @NotNull String displayFullAddress, @NotNull String searchText, String updateLink, String contextLocationUid, Coordinates coordinates, boolean isTrustCoordinates, String numberPVZ) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(displayFullAddress, "displayFullAddress");
                Intrinsics.checkNotNullParameter(searchText, "searchText");
                return new SuggestInfo(title, subtitle, displayFullAddress, searchText, updateLink, contextLocationUid, coordinates, isTrustCoordinates, numberPVZ);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SuggestInfo)) {
                    return false;
                }
                SuggestInfo suggestInfo = (SuggestInfo) other;
                return Intrinsics.d(this.title, suggestInfo.title) && Intrinsics.d(this.subtitle, suggestInfo.subtitle) && Intrinsics.d(this.displayFullAddress, suggestInfo.displayFullAddress) && Intrinsics.d(this.searchText, suggestInfo.searchText) && Intrinsics.d(this.updateLink, suggestInfo.updateLink) && Intrinsics.d(this.contextLocationUid, suggestInfo.contextLocationUid) && Intrinsics.d(this.coordinates, suggestInfo.coordinates) && this.isTrustCoordinates == suggestInfo.isTrustCoordinates && Intrinsics.d(this.numberPVZ, suggestInfo.numberPVZ);
            }

            public final String getContextLocationUid() {
                return this.contextLocationUid;
            }

            public final Coordinates getCoordinates() {
                return this.coordinates;
            }

            @NotNull
            public final String getDisplayFullAddress() {
                return this.displayFullAddress;
            }

            public final String getNumberPVZ() {
                return this.numberPVZ;
            }

            @NotNull
            public final String getSearchText() {
                return this.searchText;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final String getUpdateLink() {
                return this.updateLink;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                int a11 = g.a(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.displayFullAddress), 31, this.searchText);
                String str2 = this.updateLink;
                int hashCode2 = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.contextLocationUid;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Coordinates coordinates = this.coordinates;
                int a12 = C3532b.a((hashCode3 + (coordinates == null ? 0 : coordinates.hashCode())) * 31, 31, this.isTrustCoordinates);
                String str4 = this.numberPVZ;
                return a12 + (str4 != null ? str4.hashCode() : 0);
            }

            /* renamed from: isTrustCoordinates, reason: from getter */
            public final boolean getIsTrustCoordinates() {
                return this.isTrustCoordinates;
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.displayFullAddress;
                String str4 = this.searchText;
                String str5 = this.updateLink;
                String str6 = this.contextLocationUid;
                Coordinates coordinates = this.coordinates;
                boolean z11 = this.isTrustCoordinates;
                String str7 = this.numberPVZ;
                StringBuilder d11 = C3660k.d("SuggestInfo(title=", str, ", subtitle=", str2, ", displayFullAddress=");
                Nh.a.h(d11, str3, ", searchText=", str4, ", updateLink=");
                Nh.a.h(d11, str5, ", contextLocationUid=", str6, ", coordinates=");
                d11.append(coordinates);
                d11.append(", isTrustCoordinates=");
                d11.append(z11);
                d11.append(", numberPVZ=");
                return o0.c(d11, str7, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.subtitle);
                dest.writeString(this.displayFullAddress);
                dest.writeString(this.searchText);
                dest.writeString(this.updateLink);
                dest.writeString(this.contextLocationUid);
                Coordinates coordinates = this.coordinates;
                if (coordinates == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    coordinates.writeToParcel(dest, flags);
                }
                dest.writeInt(this.isTrustCoordinates ? 1 : 0);
                dest.writeString(this.numberPVZ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuggestInfo(@NotNull String title, String str, @NotNull String displayFullAddress, @NotNull String searchText, String str2, String str3, Coordinates coordinates, boolean z11, String str4) {
                super(YandexSuggestionsAdapter.ViewType.SUGGEST, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(displayFullAddress, "displayFullAddress");
                Intrinsics.checkNotNullParameter(searchText, "searchText");
                this.title = title;
                this.subtitle = str;
                this.displayFullAddress = displayFullAddress;
                this.searchText = searchText;
                this.updateLink = str2;
                this.contextLocationUid = str3;
                this.coordinates = coordinates;
                this.isTrustCoordinates = z11;
                this.numberPVZ = str4;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Warning;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "info", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInfo", "()Ljava/util/List;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Warning extends Suggest {

            @NotNull
            private final List<AtomDTO> info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Warning(@NotNull List<? extends AtomDTO> info) {
                super(YandexSuggestionsAdapter.ViewType.WARNING, null);
                Intrinsics.checkNotNullParameter(info, "info");
                this.info = info;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Warning) && Intrinsics.d(this.info, ((Warning) other).info);
            }

            @NotNull
            public final List<AtomDTO> getInfo() {
                return this.info;
            }

            public int hashCode() {
                return this.info.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("Warning(info=", ")", this.info);
            }
        }

        public /* synthetic */ Suggest(YandexSuggestionsAdapter.ViewType viewType, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewType);
        }

        @NotNull
        public final YandexSuggestionsAdapter.ViewType getType() {
            return this.type;
        }

        private Suggest(YandexSuggestionsAdapter.ViewType viewType) {
            this.type = viewType;
        }
    }

    public SuggestVO() {
        this(null, 1, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SuggestVO) && Intrinsics.d(this.suggests, ((SuggestVO) other).suggests);
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
        return c.a("SuggestVO(suggests=", ")", this.suggests);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuggestVO(@NotNull List<? extends Suggest> suggests) {
        Intrinsics.checkNotNullParameter(suggests, "suggests");
        this.suggests = suggests;
    }

    public SuggestVO(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list);
    }
}

package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import Ak.C2436a;
import De.C2860c;
import G.g;
import Nh.a;
import Pk0.b;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.storefront.navBar.Savable;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b$\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004:\u0001OB\u0095\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0016¢\u0006\u0004\b%\u0010&J¼\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010.\u001a\u00020\u00182\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010*R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010*R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b6\u0010*R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b7\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\bD\u0010*R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\bE\u0010*R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010I\u001a\u0004\b\u0019\u0010JR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u001c\u0010F\u001a\u0004\bN\u0010H¨\u0006P"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/storefront/navBar/Savable;", "Landroid/os/Parcelable;", "", "id", "", "searchText", "hint", "deeplink", "link", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "returnKeyType", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "keyboardSearchTrackingInfo", "searchDelay", "", "cornerRadius", "backgroundColor", "searchBarTintColor", "", "maxSearchQueryTextLength", "", "isDynamicUpdateDisabled", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;", "searchByImage", "minTextLength", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;LWZ/t;Ljava/lang/Long;FLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;LWZ/t;Ljava/lang/Long;FLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;Ljava/lang/Integer;)Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getSearchText", "getHint", "getDeeplink", "getLink", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "getReturnKeyType", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "LWZ/t;", "getKeyboardSearchTrackingInfo", "()LWZ/t;", "Ljava/lang/Long;", "getSearchDelay", "()Ljava/lang/Long;", "F", "getCornerRadius", "()F", "getBackgroundColor", "getSearchBarTintColor", "Ljava/lang/Integer;", "getMaxSearchQueryTextLength", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;", "getSearchByImage", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;", "getMinTextLength", "SearchByImageVO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActiveSearchBarVO implements c, Savable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActiveSearchBarVO> CREATOR = new Creator();
    private final String backgroundColor;
    private final float cornerRadius;

    @NotNull
    private final String deeplink;

    @NotNull
    private final String hint;
    private final long id;
    private final Boolean isDynamicUpdateDisabled;
    private final t keyboardSearchTrackingInfo;

    @NotNull
    private final String link;
    private final Integer maxSearchQueryTextLength;
    private final Integer minTextLength;

    @NotNull
    private final SearchBarVO.ReturnKeyType returnKeyType;
    private final String searchBarTintColor;
    private final SearchByImageVO searchByImage;
    private final Long searchDelay;

    @NotNull
    private final String searchText;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActiveSearchBarVO> {
        @Override // android.os.Parcelable.Creator
        public final ActiveSearchBarVO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            SearchBarVO.ReturnKeyType valueOf2 = SearchBarVO.ReturnKeyType.valueOf(parcel.readString());
            t tVar = (t) parcel.readParcelable(ActiveSearchBarVO.class.getClassLoader());
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            float readFloat = parcel.readFloat();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ActiveSearchBarVO(readLong, readString, readString2, readString3, readString4, valueOf2, tVar, valueOf3, readFloat, readString5, readString6, valueOf4, valueOf, parcel.readInt() == 0 ? null : SearchByImageVO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActiveSearchBarVO[] newArray(int i11) {
            return new ActiveSearchBarVO[i11];
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b'\u0010 ¨\u0006("}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;", "Landroid/os/Parcelable;", "LWZ/t;", "buttonTrackingInfo", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "openOnboardingControl", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "errorNotification", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "loadPhotoTrackingInfo", "<init>", "(LWZ/t;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/notification/NotificationDTO;LWZ/t;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getButtonTrackingInfo", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getOpenOnboardingControl", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getLoadPhotoTrackingInfo", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchByImageVO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SearchByImageVO> CREATOR = new Creator();
        private final t buttonTrackingInfo;
        private final NotificationDTO errorNotification;
        private final t loadPhotoTrackingInfo;
        private final CommonControlSettings openOnboardingControl;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SearchByImageVO> {
            @Override // android.os.Parcelable.Creator
            public final SearchByImageVO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SearchByImageVO((t) parcel.readParcelable(SearchByImageVO.class.getClassLoader()), (CommonControlSettings) parcel.readParcelable(SearchByImageVO.class.getClassLoader()), (NotificationDTO) parcel.readParcelable(SearchByImageVO.class.getClassLoader()), (t) parcel.readParcelable(SearchByImageVO.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SearchByImageVO[] newArray(int i11) {
                return new SearchByImageVO[i11];
            }
        }

        public SearchByImageVO(t tVar, CommonControlSettings commonControlSettings, NotificationDTO notificationDTO, t tVar2) {
            this.buttonTrackingInfo = tVar;
            this.openOnboardingControl = commonControlSettings;
            this.errorNotification = notificationDTO;
            this.loadPhotoTrackingInfo = tVar2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchByImageVO)) {
                return false;
            }
            SearchByImageVO searchByImageVO = (SearchByImageVO) other;
            return Intrinsics.d(this.buttonTrackingInfo, searchByImageVO.buttonTrackingInfo) && Intrinsics.d(this.openOnboardingControl, searchByImageVO.openOnboardingControl) && Intrinsics.d(this.errorNotification, searchByImageVO.errorNotification) && Intrinsics.d(this.loadPhotoTrackingInfo, searchByImageVO.loadPhotoTrackingInfo);
        }

        public final t getButtonTrackingInfo() {
            return this.buttonTrackingInfo;
        }

        public final NotificationDTO getErrorNotification() {
            return this.errorNotification;
        }

        public final t getLoadPhotoTrackingInfo() {
            return this.loadPhotoTrackingInfo;
        }

        public final CommonControlSettings getOpenOnboardingControl() {
            return this.openOnboardingControl;
        }

        public int hashCode() {
            t tVar = this.buttonTrackingInfo;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            CommonControlSettings commonControlSettings = this.openOnboardingControl;
            int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            NotificationDTO notificationDTO = this.errorNotification;
            int hashCode3 = (hashCode2 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
            t tVar2 = this.loadPhotoTrackingInfo;
            return hashCode3 + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SearchByImageVO(buttonTrackingInfo=" + this.buttonTrackingInfo + ", openOnboardingControl=" + this.openOnboardingControl + ", errorNotification=" + this.errorNotification + ", loadPhotoTrackingInfo=" + this.loadPhotoTrackingInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.buttonTrackingInfo, flags);
            dest.writeParcelable(this.openOnboardingControl, flags);
            dest.writeParcelable(this.errorNotification, flags);
            dest.writeParcelable(this.loadPhotoTrackingInfo, flags);
        }
    }

    public ActiveSearchBarVO(long j11, @NotNull String searchText, @NotNull String hint, @NotNull String deeplink, @NotNull String link, @NotNull SearchBarVO.ReturnKeyType returnKeyType, t tVar, Long l11, float f7, String str, String str2, Integer num, Boolean bool, SearchByImageVO searchByImageVO, Integer num2) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(returnKeyType, "returnKeyType");
        this.id = j11;
        this.searchText = searchText;
        this.hint = hint;
        this.deeplink = deeplink;
        this.link = link;
        this.returnKeyType = returnKeyType;
        this.keyboardSearchTrackingInfo = tVar;
        this.searchDelay = l11;
        this.cornerRadius = f7;
        this.backgroundColor = str;
        this.searchBarTintColor = str2;
        this.maxSearchQueryTextLength = num;
        this.isDynamicUpdateDisabled = bool;
        this.searchByImage = searchByImageVO;
        this.minTextLength = num2;
    }

    @NotNull
    public final ActiveSearchBarVO copy(long id2, @NotNull String searchText, @NotNull String hint, @NotNull String deeplink, @NotNull String link, @NotNull SearchBarVO.ReturnKeyType returnKeyType, t keyboardSearchTrackingInfo, Long searchDelay, float cornerRadius, String backgroundColor, String searchBarTintColor, Integer maxSearchQueryTextLength, Boolean isDynamicUpdateDisabled, SearchByImageVO searchByImage, Integer minTextLength) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(returnKeyType, "returnKeyType");
        return new ActiveSearchBarVO(id2, searchText, hint, deeplink, link, returnKeyType, keyboardSearchTrackingInfo, searchDelay, cornerRadius, backgroundColor, searchBarTintColor, maxSearchQueryTextLength, isDynamicUpdateDisabled, searchByImage, minTextLength);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveSearchBarVO)) {
            return false;
        }
        ActiveSearchBarVO activeSearchBarVO = (ActiveSearchBarVO) other;
        return this.id == activeSearchBarVO.id && Intrinsics.d(this.searchText, activeSearchBarVO.searchText) && Intrinsics.d(this.hint, activeSearchBarVO.hint) && Intrinsics.d(this.deeplink, activeSearchBarVO.deeplink) && Intrinsics.d(this.link, activeSearchBarVO.link) && this.returnKeyType == activeSearchBarVO.returnKeyType && Intrinsics.d(this.keyboardSearchTrackingInfo, activeSearchBarVO.keyboardSearchTrackingInfo) && Intrinsics.d(this.searchDelay, activeSearchBarVO.searchDelay) && Float.compare(this.cornerRadius, activeSearchBarVO.cornerRadius) == 0 && Intrinsics.d(this.backgroundColor, activeSearchBarVO.backgroundColor) && Intrinsics.d(this.searchBarTintColor, activeSearchBarVO.searchBarTintColor) && Intrinsics.d(this.maxSearchQueryTextLength, activeSearchBarVO.maxSearchQueryTextLength) && Intrinsics.d(this.isDynamicUpdateDisabled, activeSearchBarVO.isDynamicUpdateDisabled) && Intrinsics.d(this.searchByImage, activeSearchBarVO.searchByImage) && Intrinsics.d(this.minTextLength, activeSearchBarVO.minTextLength);
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final t getKeyboardSearchTrackingInfo() {
        return this.keyboardSearchTrackingInfo;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final Integer getMaxSearchQueryTextLength() {
        return this.maxSearchQueryTextLength;
    }

    public final Integer getMinTextLength() {
        return this.minTextLength;
    }

    @NotNull
    public final SearchBarVO.ReturnKeyType getReturnKeyType() {
        return this.returnKeyType;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SearchByImageVO getSearchByImage() {
        return this.searchByImage;
    }

    public final Long getSearchDelay() {
        return this.searchDelay;
    }

    @NotNull
    public final String getSearchText() {
        return this.searchText;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.returnKeyType.hashCode() + g.a(g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.searchText), 31, this.hint), 31, this.deeplink), 31, this.link)) * 31;
        t tVar = this.keyboardSearchTrackingInfo;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Long l11 = this.searchDelay;
        int a11 = b.a(this.cornerRadius, (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31, 31);
        String str = this.backgroundColor;
        int hashCode3 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.searchBarTintColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.maxSearchQueryTextLength;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isDynamicUpdateDisabled;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        SearchByImageVO searchByImageVO = this.searchByImage;
        int hashCode7 = (hashCode6 + (searchByImageVO == null ? 0 : searchByImageVO.hashCode())) * 31;
        Integer num2 = this.minTextLength;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    /* renamed from: isDynamicUpdateDisabled, reason: from getter */
    public final Boolean getIsDynamicUpdateDisabled() {
        return this.isDynamicUpdateDisabled;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.searchText;
        String str2 = this.hint;
        String str3 = this.deeplink;
        String str4 = this.link;
        SearchBarVO.ReturnKeyType returnKeyType = this.returnKeyType;
        t tVar = this.keyboardSearchTrackingInfo;
        Long l11 = this.searchDelay;
        float f7 = this.cornerRadius;
        String str5 = this.backgroundColor;
        String str6 = this.searchBarTintColor;
        Integer num = this.maxSearchQueryTextLength;
        Boolean bool = this.isDynamicUpdateDisabled;
        SearchByImageVO searchByImageVO = this.searchByImage;
        Integer num2 = this.minTextLength;
        StringBuilder c11 = C2436a.c(j11, "ActiveSearchBarVO(id=", ", searchText=", str);
        a.h(c11, ", hint=", str2, ", deeplink=", str3);
        c11.append(", link=");
        c11.append(str4);
        c11.append(", returnKeyType=");
        c11.append(returnKeyType);
        c11.append(", keyboardSearchTrackingInfo=");
        c11.append(tVar);
        c11.append(", searchDelay=");
        c11.append(l11);
        c11.append(", cornerRadius=");
        c11.append(f7);
        c11.append(", backgroundColor=");
        c11.append(str5);
        c11.append(", searchBarTintColor=");
        c11.append(str6);
        c11.append(", maxSearchQueryTextLength=");
        c11.append(num);
        c11.append(", isDynamicUpdateDisabled=");
        c11.append(bool);
        c11.append(", searchByImage=");
        c11.append(searchByImageVO);
        c11.append(", minTextLength=");
        c11.append(num2);
        c11.append(")");
        return c11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.searchText);
        dest.writeString(this.hint);
        dest.writeString(this.deeplink);
        dest.writeString(this.link);
        dest.writeString(this.returnKeyType.name());
        dest.writeParcelable(this.keyboardSearchTrackingInfo, flags);
        Long l11 = this.searchDelay;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l11);
        }
        dest.writeFloat(this.cornerRadius);
        dest.writeString(this.backgroundColor);
        dest.writeString(this.searchBarTintColor);
        Integer num = this.maxSearchQueryTextLength;
        if (num == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num);
        }
        Boolean bool = this.isDynamicUpdateDisabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool);
        }
        SearchByImageVO searchByImageVO = this.searchByImage;
        if (searchByImageVO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            searchByImageVO.writeToParcel(dest, flags);
        }
        Integer num2 = this.minTextLength;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num2);
        }
    }
}

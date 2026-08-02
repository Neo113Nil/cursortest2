package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Kk.C3532b;
import Pk0.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.utils.SelectUtilsKt;
import ru.ozon.app.android.storefront.navBar.NavBarColors;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u0000 22\u00020\u0001:\u0003234BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018JZ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "searchBarVo", "", "showScanItIcon", "showPhotoSearchIcon", "showSearchCompoundDrawable", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$SearchButton;", "searchButton", "", "searchBarBackgroundColor", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo;", "navBarInfo", "<init>", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;ZZZLru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$SearchButton;Ljava/lang/String;Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;ZZZLru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$SearchButton;Ljava/lang/String;Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo;)Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "getSearchBarVo", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "Z", "getShowScanItIcon", "()Z", "getShowPhotoSearchIcon", "getShowSearchCompoundDrawable", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$SearchButton;", "getSearchButton", "()Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$SearchButton;", "Ljava/lang/String;", "getSearchBarBackgroundColor", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo;", "getNavBarInfo", "()Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo;", "Companion", "SearchButton", "NavBarInfo", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StaticNavBarModel implements Parcelable {

    @NotNull
    private final NavBarInfo navBarInfo;
    private final String searchBarBackgroundColor;

    @NotNull
    private final ActiveSearchBarVO searchBarVo;
    private final SearchButton searchButton;
    private final boolean showPhotoSearchIcon;
    private final boolean showScanItIcon;
    private final boolean showSearchCompoundDrawable;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StaticNavBarModel> CREATOR = new Creator();

    @NotNull
    private static final String DEFAULT_SEARCHBAR_BACKGROUND_COLOR = UniColors.BG_SECONDARY.getToken();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$Companion;", "", "<init>", "()V", "NO_RADIUS", "", "DEFAULT_SEARCHBAR_BACKGROUND_COLOR", "", "MIN_SEARCH_QUERY_LENGTH", "", "createEmpty", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "context", "Landroid/content/Context;", "deeplink", "searchText", "cornerRadius", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StaticNavBarModel createEmpty(@NotNull Context context, @NotNull String deeplink, @NotNull String searchText, float cornerRadius) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            return new StaticNavBarModel(new ActiveSearchBarVO(1L, searchText, "", deeplink, "", SearchBarVO.ReturnKeyType.SEARCH, null, null, cornerRadius, null, null, null, null, null, 2), false, false, true, null, StaticNavBarModel.DEFAULT_SEARCHBAR_BACKGROUND_COLOR, NavBarInfo.INSTANCE.createEmpty(context));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StaticNavBarModel> {
        @Override // android.os.Parcelable.Creator
        public final StaticNavBarModel createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ActiveSearchBarVO createFromParcel = ActiveSearchBarVO.CREATOR.createFromParcel(parcel);
            boolean z13 = false;
            boolean z14 = true;
            if (parcel.readInt() != 0) {
                z11 = false;
                z13 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = true;
                z14 = z11;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            return new StaticNavBarModel(createFromParcel, z13, z14, z12, parcel.readInt() == 0 ? null : SearchButton.CREATOR.createFromParcel(parcel), parcel.readString(), NavBarInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StaticNavBarModel[] newArray(int i11) {
            return new StaticNavBarModel[i11];
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002&'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo;", "Landroid/os/Parcelable;", "", "showBackButton", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo$ActionsSnapshot;", "snapshots", "Lru/ozon/app/android/storefront/navBar/NavBarColors;", "colors", "<init>", "(ZLru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo$ActionsSnapshot;Lru/ozon/app/android/storefront/navBar/NavBarColors;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(ZLru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo$ActionsSnapshot;Lru/ozon/app/android/storefront/navBar/NavBarColors;)Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowBackButton", "()Z", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo$ActionsSnapshot;", "getSnapshots", "()Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo$ActionsSnapshot;", "Lru/ozon/app/android/storefront/navBar/NavBarColors;", "getColors", "()Lru/ozon/app/android/storefront/navBar/NavBarColors;", "Companion", "ActionsSnapshot", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavBarInfo implements Parcelable {

        @NotNull
        private final ru.ozon.app.android.storefront.navBar.NavBarColors colors;
        private final boolean showBackButton;

        @NotNull
        private final ActionsSnapshot snapshots;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<NavBarInfo> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo$ActionsSnapshot;", "Landroid/os/Parcelable;", "Landroid/graphics/Bitmap;", "left", "right", "<init>", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Bitmap;", "getLeft", "()Landroid/graphics/Bitmap;", "getRight", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActionsSnapshot implements Parcelable {
            private final Bitmap left;
            private final Bitmap right;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<ActionsSnapshot> CREATOR = new Creator();

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo$ActionsSnapshot$Companion;", "", "<init>", "()V", "createEmpty", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo$ActionsSnapshot;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final ActionsSnapshot createEmpty() {
                    return new ActionsSnapshot(null, null);
                }

                private Companion() {
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ActionsSnapshot> {
                @Override // android.os.Parcelable.Creator
                public final ActionsSnapshot createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ActionsSnapshot((Bitmap) parcel.readParcelable(ActionsSnapshot.class.getClassLoader()), (Bitmap) parcel.readParcelable(ActionsSnapshot.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ActionsSnapshot[] newArray(int i11) {
                    return new ActionsSnapshot[i11];
                }
            }

            public ActionsSnapshot(Bitmap bitmap, Bitmap bitmap2) {
                this.left = bitmap;
                this.right = bitmap2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionsSnapshot)) {
                    return false;
                }
                ActionsSnapshot actionsSnapshot = (ActionsSnapshot) other;
                return Intrinsics.d(this.left, actionsSnapshot.left) && Intrinsics.d(this.right, actionsSnapshot.right);
            }

            public final Bitmap getLeft() {
                return this.left;
            }

            public final Bitmap getRight() {
                return this.right;
            }

            public int hashCode() {
                Bitmap bitmap = this.left;
                int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
                Bitmap bitmap2 = this.right;
                return hashCode + (bitmap2 != null ? bitmap2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "ActionsSnapshot(left=" + this.left + ", right=" + this.right + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.left, flags);
                dest.writeParcelable(this.right, flags);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo$Companion;", "", "<init>", "()V", "COLOR_WHITE", "", "COLOR_BLACK", "ICON_COLOR_WHITE", "ICON_COLOR_BLACK", "createDefaultColors", "Lru/ozon/app/android/storefront/navBar/NavBarColors;", "context", "Landroid/content/Context;", "createEmpty", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$NavBarInfo;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ru.ozon.app.android.storefront.navBar.NavBarColors createDefaultColors(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                boolean isDarkThemeActive = ThemeExtKt.isDarkThemeActive(context);
                int themeColor = SelectUtilsKt.isSelect(context) ? ThemeExtKt.themeColor(context, R$attr.layerFloor0) : isDarkThemeActive ? -14868444 : -1;
                return new NavBarColors.Default(themeColor, themeColor, isDarkThemeActive ? -854535 : -16770508, isDarkThemeActive);
            }

            @NotNull
            public final NavBarInfo createEmpty(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new NavBarInfo(false, ActionsSnapshot.INSTANCE.createEmpty(), createDefaultColors(context));
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NavBarInfo> {
            @Override // android.os.Parcelable.Creator
            public final NavBarInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavBarInfo(parcel.readInt() != 0, ActionsSnapshot.CREATOR.createFromParcel(parcel), (ru.ozon.app.android.storefront.navBar.NavBarColors) parcel.readParcelable(NavBarInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NavBarInfo[] newArray(int i11) {
                return new NavBarInfo[i11];
            }
        }

        public NavBarInfo(boolean z11, @NotNull ActionsSnapshot snapshots, @NotNull ru.ozon.app.android.storefront.navBar.NavBarColors colors) {
            Intrinsics.checkNotNullParameter(snapshots, "snapshots");
            Intrinsics.checkNotNullParameter(colors, "colors");
            this.showBackButton = z11;
            this.snapshots = snapshots;
            this.colors = colors;
        }

        public static /* synthetic */ NavBarInfo copy$default(NavBarInfo navBarInfo, boolean z11, ActionsSnapshot actionsSnapshot, ru.ozon.app.android.storefront.navBar.NavBarColors navBarColors, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = navBarInfo.showBackButton;
            }
            if ((i11 & 2) != 0) {
                actionsSnapshot = navBarInfo.snapshots;
            }
            if ((i11 & 4) != 0) {
                navBarColors = navBarInfo.colors;
            }
            return navBarInfo.copy(z11, actionsSnapshot, navBarColors);
        }

        @NotNull
        public final NavBarInfo copy(boolean showBackButton, @NotNull ActionsSnapshot snapshots, @NotNull ru.ozon.app.android.storefront.navBar.NavBarColors colors) {
            Intrinsics.checkNotNullParameter(snapshots, "snapshots");
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new NavBarInfo(showBackButton, snapshots, colors);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavBarInfo)) {
                return false;
            }
            NavBarInfo navBarInfo = (NavBarInfo) other;
            return this.showBackButton == navBarInfo.showBackButton && Intrinsics.d(this.snapshots, navBarInfo.snapshots) && Intrinsics.d(this.colors, navBarInfo.colors);
        }

        @NotNull
        public final ru.ozon.app.android.storefront.navBar.NavBarColors getColors() {
            return this.colors;
        }

        public final boolean getShowBackButton() {
            return this.showBackButton;
        }

        @NotNull
        public final ActionsSnapshot getSnapshots() {
            return this.snapshots;
        }

        public int hashCode() {
            return this.colors.hashCode() + ((this.snapshots.hashCode() + (Boolean.hashCode(this.showBackButton) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "NavBarInfo(showBackButton=" + this.showBackButton + ", snapshots=" + this.snapshots + ", colors=" + this.colors + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showBackButton ? 1 : 0);
            this.snapshots.writeToParcel(dest, flags);
            dest.writeParcelable(this.colors, flags);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel$SearchButton;", "Landroid/os/Parcelable;", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/TestInfo;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchButton implements Parcelable {
        public static final int $stable = TestInfo.$stable | Icon.$stable;

        @NotNull
        public static final Parcelable.Creator<SearchButton> CREATOR = new Creator();
        private final Icon icon;
        private final TestInfo testInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SearchButton> {
            @Override // android.os.Parcelable.Creator
            public final SearchButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SearchButton((Icon) parcel.readParcelable(SearchButton.class.getClassLoader()), (TestInfo) parcel.readParcelable(SearchButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SearchButton[] newArray(int i11) {
                return new SearchButton[i11];
            }
        }

        public SearchButton(Icon icon, TestInfo testInfo) {
            this.icon = icon;
            this.testInfo = testInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchButton)) {
                return false;
            }
            SearchButton searchButton = (SearchButton) other;
            return Intrinsics.d(this.icon, searchButton.icon) && Intrinsics.d(this.testInfo, searchButton.testInfo);
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            Icon icon = this.icon;
            int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SearchButton(icon=" + this.icon + ", testInfo=" + this.testInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.icon, flags);
            dest.writeParcelable(this.testInfo, flags);
        }
    }

    public StaticNavBarModel(@NotNull ActiveSearchBarVO searchBarVo, boolean z11, boolean z12, boolean z13, SearchButton searchButton, String str, @NotNull NavBarInfo navBarInfo) {
        Intrinsics.checkNotNullParameter(searchBarVo, "searchBarVo");
        Intrinsics.checkNotNullParameter(navBarInfo, "navBarInfo");
        this.searchBarVo = searchBarVo;
        this.showScanItIcon = z11;
        this.showPhotoSearchIcon = z12;
        this.showSearchCompoundDrawable = z13;
        this.searchButton = searchButton;
        this.searchBarBackgroundColor = str;
        this.navBarInfo = navBarInfo;
    }

    public static /* synthetic */ StaticNavBarModel copy$default(StaticNavBarModel staticNavBarModel, ActiveSearchBarVO activeSearchBarVO, boolean z11, boolean z12, boolean z13, SearchButton searchButton, String str, NavBarInfo navBarInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            activeSearchBarVO = staticNavBarModel.searchBarVo;
        }
        if ((i11 & 2) != 0) {
            z11 = staticNavBarModel.showScanItIcon;
        }
        if ((i11 & 4) != 0) {
            z12 = staticNavBarModel.showPhotoSearchIcon;
        }
        if ((i11 & 8) != 0) {
            z13 = staticNavBarModel.showSearchCompoundDrawable;
        }
        if ((i11 & 16) != 0) {
            searchButton = staticNavBarModel.searchButton;
        }
        if ((i11 & 32) != 0) {
            str = staticNavBarModel.searchBarBackgroundColor;
        }
        if ((i11 & 64) != 0) {
            navBarInfo = staticNavBarModel.navBarInfo;
        }
        String str2 = str;
        NavBarInfo navBarInfo2 = navBarInfo;
        SearchButton searchButton2 = searchButton;
        boolean z14 = z12;
        return staticNavBarModel.copy(activeSearchBarVO, z11, z14, z13, searchButton2, str2, navBarInfo2);
    }

    @NotNull
    public final StaticNavBarModel copy(@NotNull ActiveSearchBarVO searchBarVo, boolean showScanItIcon, boolean showPhotoSearchIcon, boolean showSearchCompoundDrawable, SearchButton searchButton, String searchBarBackgroundColor, @NotNull NavBarInfo navBarInfo) {
        Intrinsics.checkNotNullParameter(searchBarVo, "searchBarVo");
        Intrinsics.checkNotNullParameter(navBarInfo, "navBarInfo");
        return new StaticNavBarModel(searchBarVo, showScanItIcon, showPhotoSearchIcon, showSearchCompoundDrawable, searchButton, searchBarBackgroundColor, navBarInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticNavBarModel)) {
            return false;
        }
        StaticNavBarModel staticNavBarModel = (StaticNavBarModel) other;
        return Intrinsics.d(this.searchBarVo, staticNavBarModel.searchBarVo) && this.showScanItIcon == staticNavBarModel.showScanItIcon && this.showPhotoSearchIcon == staticNavBarModel.showPhotoSearchIcon && this.showSearchCompoundDrawable == staticNavBarModel.showSearchCompoundDrawable && Intrinsics.d(this.searchButton, staticNavBarModel.searchButton) && Intrinsics.d(this.searchBarBackgroundColor, staticNavBarModel.searchBarBackgroundColor) && Intrinsics.d(this.navBarInfo, staticNavBarModel.navBarInfo);
    }

    @NotNull
    public final NavBarInfo getNavBarInfo() {
        return this.navBarInfo;
    }

    public final String getSearchBarBackgroundColor() {
        return this.searchBarBackgroundColor;
    }

    @NotNull
    public final ActiveSearchBarVO getSearchBarVo() {
        return this.searchBarVo;
    }

    public final SearchButton getSearchButton() {
        return this.searchButton;
    }

    public final boolean getShowPhotoSearchIcon() {
        return this.showPhotoSearchIcon;
    }

    public final boolean getShowScanItIcon() {
        return this.showScanItIcon;
    }

    public final boolean getShowSearchCompoundDrawable() {
        return this.showSearchCompoundDrawable;
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a(C3532b.a(this.searchBarVo.hashCode() * 31, 31, this.showScanItIcon), 31, this.showPhotoSearchIcon), 31, this.showSearchCompoundDrawable);
        SearchButton searchButton = this.searchButton;
        int hashCode = (a11 + (searchButton == null ? 0 : searchButton.hashCode())) * 31;
        String str = this.searchBarBackgroundColor;
        return this.navBarInfo.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        ActiveSearchBarVO activeSearchBarVO = this.searchBarVo;
        boolean z11 = this.showScanItIcon;
        boolean z12 = this.showPhotoSearchIcon;
        boolean z13 = this.showSearchCompoundDrawable;
        SearchButton searchButton = this.searchButton;
        String str = this.searchBarBackgroundColor;
        NavBarInfo navBarInfo = this.navBarInfo;
        StringBuilder sb2 = new StringBuilder("StaticNavBarModel(searchBarVo=");
        sb2.append(activeSearchBarVO);
        sb2.append(", showScanItIcon=");
        sb2.append(z11);
        sb2.append(", showPhotoSearchIcon=");
        f.c(", showSearchCompoundDrawable=", ", searchButton=", sb2, z12, z13);
        sb2.append(searchButton);
        sb2.append(", searchBarBackgroundColor=");
        sb2.append(str);
        sb2.append(", navBarInfo=");
        sb2.append(navBarInfo);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.searchBarVo.writeToParcel(dest, flags);
        dest.writeInt(this.showScanItIcon ? 1 : 0);
        dest.writeInt(this.showPhotoSearchIcon ? 1 : 0);
        dest.writeInt(this.showSearchCompoundDrawable ? 1 : 0);
        SearchButton searchButton = this.searchButton;
        if (searchButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            searchButton.writeToParcel(dest, flags);
        }
        dest.writeString(this.searchBarBackgroundColor);
        this.navBarInfo.writeToParcel(dest, flags);
    }
}

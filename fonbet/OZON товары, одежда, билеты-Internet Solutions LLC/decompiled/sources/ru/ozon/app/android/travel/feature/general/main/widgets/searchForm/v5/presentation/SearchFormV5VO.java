package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation;

import B90.C2618u;
import Bi.a;
import C.o0;
import De.C2859b;
import G.g;
import Kk.C3532b;
import Pk0.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.data.SearchFormV5DTO;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;", "content", "", "asyncData", "<init>", "(JLru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;Ljava/lang/String;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;", "getContent", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;", "Ljava/lang/String;", "getAsyncData", "Content", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchFormV5VO implements c {
    private final String asyncData;

    @NotNull
    private final Content content;
    private final long id;

    public SearchFormV5VO(long j11, @NotNull Content content, String str) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j11;
        this.content = content;
        this.asyncData = str;
    }

    public static /* synthetic */ SearchFormV5VO copy$default(SearchFormV5VO searchFormV5VO, long j11, Content content, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = searchFormV5VO.id;
        }
        if ((i11 & 2) != 0) {
            content = searchFormV5VO.content;
        }
        if ((i11 & 4) != 0) {
            str = searchFormV5VO.asyncData;
        }
        return searchFormV5VO.copy(j11, content, str);
    }

    @NotNull
    public final SearchFormV5VO copy(long id2, @NotNull Content content, String asyncData) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new SearchFormV5VO(id2, content, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchFormV5VO)) {
            return false;
        }
        SearchFormV5VO searchFormV5VO = (SearchFormV5VO) other;
        return this.id == searchFormV5VO.id && Intrinsics.d(this.content, searchFormV5VO.content) && Intrinsics.d(this.asyncData, searchFormV5VO.asyncData);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @NotNull
    public final Content getContent() {
        return this.content;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.asyncData;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Content content = this.content;
        String str = this.asyncData;
        StringBuilder sb2 = new StringBuilder("SearchFormV5VO(id=");
        sb2.append(j11);
        sb2.append(", content=");
        sb2.append(content);
        return C6594f.a(", asyncData=", str, ")", sb2);
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001:\u0002EFB\u008f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ°\u0001\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b6\u0010\u001eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;", "locations", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "dateField", "rightField", "touristField", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "searchButton", "", "backgroundColor", "", "cornerRadius", "leftPatchColor", "rightPatchColor", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "toggleCell", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "areLocationsSwapped", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$AsyncFetchConfig;", "asyncFetchConfig", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;ZLru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$AsyncFetchConfig;)V", "copy", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;ZLru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$AsyncFetchConfig;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;", "getLocations", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "getDateField", "()Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "getRightField", "getTouristField", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSearchButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getBackgroundColor", "F", "getCornerRadius", "()F", "getLeftPatchColor", "getRightPatchColor", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getToggleCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Z", "getAreLocationsSwapped", "()Z", "setAreLocationsSwapped", "(Z)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$AsyncFetchConfig;", "getAsyncFetchConfig", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$AsyncFetchConfig;", "Locations", "TextField", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {
        private boolean areLocationsSwapped;
        private final SearchFormV5DTO.AsyncFetchConfig asyncFetchConfig;

        @NotNull
        private final String backgroundColor;
        private final float cornerRadius;
        private final IconFieldVO dateField;
        private final String leftPatchColor;
        private final Locations locations;
        private final IconFieldVO rightField;
        private final String rightPatchColor;

        @NotNull
        private final ButtonV3DTO searchButton;
        private final CellDTO toggleCell;
        private final IconFieldVO touristField;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b\f\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$TextField;", "departure", "destination", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "swapButton", "", "isSeparatorVisible", "separatorColor", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$TextField;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$TextField;Ljava/lang/String;FLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$TextField;", "getDeparture", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$TextField;", "getDestination", "Ljava/lang/String;", "getBackgroundColor", "F", "getCornerRadius", "()F", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSwapButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Z", "()Z", "getSeparatorColor", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Locations {

            @NotNull
            private final String backgroundColor;
            private final float cornerRadius;

            @NotNull
            private final TextField departure;
            private final TextField destination;
            private final boolean isSeparatorVisible;
            private final String separatorColor;
            private final IconButtonV3DTO swapButton;

            public Locations(@NotNull TextField departure, TextField textField, @NotNull String backgroundColor, float f7, IconButtonV3DTO iconButtonV3DTO, boolean z11, String str) {
                Intrinsics.checkNotNullParameter(departure, "departure");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.departure = departure;
                this.destination = textField;
                this.backgroundColor = backgroundColor;
                this.cornerRadius = f7;
                this.swapButton = iconButtonV3DTO;
                this.isSeparatorVisible = z11;
                this.separatorColor = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Locations)) {
                    return false;
                }
                Locations locations = (Locations) other;
                return Intrinsics.d(this.departure, locations.departure) && Intrinsics.d(this.destination, locations.destination) && Intrinsics.d(this.backgroundColor, locations.backgroundColor) && Float.compare(this.cornerRadius, locations.cornerRadius) == 0 && Intrinsics.d(this.swapButton, locations.swapButton) && this.isSeparatorVisible == locations.isSeparatorVisible && Intrinsics.d(this.separatorColor, locations.separatorColor);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final float getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final TextField getDeparture() {
                return this.departure;
            }

            public final TextField getDestination() {
                return this.destination;
            }

            public final String getSeparatorColor() {
                return this.separatorColor;
            }

            public final IconButtonV3DTO getSwapButton() {
                return this.swapButton;
            }

            public int hashCode() {
                int hashCode = this.departure.hashCode() * 31;
                TextField textField = this.destination;
                int a11 = b.a(this.cornerRadius, g.a((hashCode + (textField == null ? 0 : textField.hashCode())) * 31, 31, this.backgroundColor), 31);
                IconButtonV3DTO iconButtonV3DTO = this.swapButton;
                int a12 = C3532b.a((a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31, this.isSeparatorVisible);
                String str = this.separatorColor;
                return a12 + (str != null ? str.hashCode() : 0);
            }

            /* renamed from: isSeparatorVisible, reason: from getter */
            public final boolean getIsSeparatorVisible() {
                return this.isSeparatorVisible;
            }

            @NotNull
            public String toString() {
                TextField textField = this.departure;
                TextField textField2 = this.destination;
                String str = this.backgroundColor;
                float f7 = this.cornerRadius;
                IconButtonV3DTO iconButtonV3DTO = this.swapButton;
                boolean z11 = this.isSeparatorVisible;
                String str2 = this.separatorColor;
                StringBuilder sb2 = new StringBuilder("Locations(departure=");
                sb2.append(textField);
                sb2.append(", destination=");
                sb2.append(textField2);
                sb2.append(", backgroundColor=");
                sb2.append(str);
                sb2.append(", cornerRadius=");
                sb2.append(f7);
                sb2.append(", swapButton=");
                sb2.append(iconButtonV3DTO);
                sb2.append(", isSeparatorVisible=");
                sb2.append(z11);
                sb2.append(", separatorColor=");
                return o0.c(sb2, str2, ")");
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$TextField;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettings", "", "destinations", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Ljava/util/List;", "getDestinations", "()Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextField {

            @NotNull
            private final CommonControlSettings commonControlSettings;
            private final List<TextDTO> destinations;

            @NotNull
            private final TextDTO text;

            public TextField(@NotNull TextDTO text, @NotNull CommonControlSettings commonControlSettings, List<TextDTO> list) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
                this.text = text;
                this.commonControlSettings = commonControlSettings;
                this.destinations = list;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextField)) {
                    return false;
                }
                TextField textField = (TextField) other;
                return Intrinsics.d(this.text, textField.text) && Intrinsics.d(this.commonControlSettings, textField.commonControlSettings) && Intrinsics.d(this.destinations, textField.destinations);
            }

            @NotNull
            public final CommonControlSettings getCommonControlSettings() {
                return this.commonControlSettings;
            }

            public final List<TextDTO> getDestinations() {
                return this.destinations;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int a11 = a.a(this.commonControlSettings, this.text.hashCode() * 31, 31);
                List<TextDTO> list = this.destinations;
                return a11 + (list == null ? 0 : list.hashCode());
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.text;
                CommonControlSettings commonControlSettings = this.commonControlSettings;
                List<TextDTO> list = this.destinations;
                StringBuilder sb2 = new StringBuilder("TextField(text=");
                sb2.append(textDTO);
                sb2.append(", commonControlSettings=");
                sb2.append(commonControlSettings);
                sb2.append(", destinations=");
                return C2618u.h(sb2, list, ")");
            }
        }

        public Content(Locations locations, IconFieldVO iconFieldVO, IconFieldVO iconFieldVO2, IconFieldVO iconFieldVO3, @NotNull ButtonV3DTO searchButton, @NotNull String backgroundColor, float f7, String str, String str2, CellDTO cellDTO, Map<String, TokenizedTrackingInfo> map, boolean z11, SearchFormV5DTO.AsyncFetchConfig asyncFetchConfig) {
            Intrinsics.checkNotNullParameter(searchButton, "searchButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.locations = locations;
            this.dateField = iconFieldVO;
            this.rightField = iconFieldVO2;
            this.touristField = iconFieldVO3;
            this.searchButton = searchButton;
            this.backgroundColor = backgroundColor;
            this.cornerRadius = f7;
            this.leftPatchColor = str;
            this.rightPatchColor = str2;
            this.toggleCell = cellDTO;
            this.trackingInfo = map;
            this.areLocationsSwapped = z11;
            this.asyncFetchConfig = asyncFetchConfig;
        }

        public static /* synthetic */ Content copy$default(Content content, Locations locations, IconFieldVO iconFieldVO, IconFieldVO iconFieldVO2, IconFieldVO iconFieldVO3, ButtonV3DTO buttonV3DTO, String str, float f7, String str2, String str3, CellDTO cellDTO, Map map, boolean z11, SearchFormV5DTO.AsyncFetchConfig asyncFetchConfig, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                locations = content.locations;
            }
            return content.copy(locations, (i11 & 2) != 0 ? content.dateField : iconFieldVO, (i11 & 4) != 0 ? content.rightField : iconFieldVO2, (i11 & 8) != 0 ? content.touristField : iconFieldVO3, (i11 & 16) != 0 ? content.searchButton : buttonV3DTO, (i11 & 32) != 0 ? content.backgroundColor : str, (i11 & 64) != 0 ? content.cornerRadius : f7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? content.leftPatchColor : str2, (i11 & 256) != 0 ? content.rightPatchColor : str3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? content.toggleCell : cellDTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? content.trackingInfo : map, (i11 & 2048) != 0 ? content.areLocationsSwapped : z11, (i11 & 4096) != 0 ? content.asyncFetchConfig : asyncFetchConfig);
        }

        @NotNull
        public final Content copy(Locations locations, IconFieldVO dateField, IconFieldVO rightField, IconFieldVO touristField, @NotNull ButtonV3DTO searchButton, @NotNull String backgroundColor, float cornerRadius, String leftPatchColor, String rightPatchColor, CellDTO toggleCell, Map<String, TokenizedTrackingInfo> trackingInfo, boolean areLocationsSwapped, SearchFormV5DTO.AsyncFetchConfig asyncFetchConfig) {
            Intrinsics.checkNotNullParameter(searchButton, "searchButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new Content(locations, dateField, rightField, touristField, searchButton, backgroundColor, cornerRadius, leftPatchColor, rightPatchColor, toggleCell, trackingInfo, areLocationsSwapped, asyncFetchConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.locations, content.locations) && Intrinsics.d(this.dateField, content.dateField) && Intrinsics.d(this.rightField, content.rightField) && Intrinsics.d(this.touristField, content.touristField) && Intrinsics.d(this.searchButton, content.searchButton) && Intrinsics.d(this.backgroundColor, content.backgroundColor) && Float.compare(this.cornerRadius, content.cornerRadius) == 0 && Intrinsics.d(this.leftPatchColor, content.leftPatchColor) && Intrinsics.d(this.rightPatchColor, content.rightPatchColor) && Intrinsics.d(this.toggleCell, content.toggleCell) && Intrinsics.d(this.trackingInfo, content.trackingInfo) && this.areLocationsSwapped == content.areLocationsSwapped && Intrinsics.d(this.asyncFetchConfig, content.asyncFetchConfig);
        }

        public final boolean getAreLocationsSwapped() {
            return this.areLocationsSwapped;
        }

        public final SearchFormV5DTO.AsyncFetchConfig getAsyncFetchConfig() {
            return this.asyncFetchConfig;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final IconFieldVO getDateField() {
            return this.dateField;
        }

        public final String getLeftPatchColor() {
            return this.leftPatchColor;
        }

        public final Locations getLocations() {
            return this.locations;
        }

        public final IconFieldVO getRightField() {
            return this.rightField;
        }

        public final String getRightPatchColor() {
            return this.rightPatchColor;
        }

        @NotNull
        public final ButtonV3DTO getSearchButton() {
            return this.searchButton;
        }

        public final CellDTO getToggleCell() {
            return this.toggleCell;
        }

        public final IconFieldVO getTouristField() {
            return this.touristField;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Locations locations = this.locations;
            int hashCode = (locations == null ? 0 : locations.hashCode()) * 31;
            IconFieldVO iconFieldVO = this.dateField;
            int hashCode2 = (hashCode + (iconFieldVO == null ? 0 : iconFieldVO.hashCode())) * 31;
            IconFieldVO iconFieldVO2 = this.rightField;
            int hashCode3 = (hashCode2 + (iconFieldVO2 == null ? 0 : iconFieldVO2.hashCode())) * 31;
            IconFieldVO iconFieldVO3 = this.touristField;
            int a11 = b.a(this.cornerRadius, g.a(C2859b.c(this.searchButton, (hashCode3 + (iconFieldVO3 == null ? 0 : iconFieldVO3.hashCode())) * 31, 31), 31, this.backgroundColor), 31);
            String str = this.leftPatchColor;
            int hashCode4 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.rightPatchColor;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            CellDTO cellDTO = this.toggleCell;
            int hashCode6 = (hashCode5 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int a12 = C3532b.a((hashCode6 + (map == null ? 0 : map.hashCode())) * 31, 31, this.areLocationsSwapped);
            SearchFormV5DTO.AsyncFetchConfig asyncFetchConfig = this.asyncFetchConfig;
            return a12 + (asyncFetchConfig != null ? asyncFetchConfig.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Content(locations=" + this.locations + ", dateField=" + this.dateField + ", rightField=" + this.rightField + ", touristField=" + this.touristField + ", searchButton=" + this.searchButton + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ", leftPatchColor=" + this.leftPatchColor + ", rightPatchColor=" + this.rightPatchColor + ", toggleCell=" + this.toggleCell + ", trackingInfo=" + this.trackingInfo + ", areLocationsSwapped=" + this.areLocationsSwapped + ", asyncFetchConfig=" + this.asyncFetchConfig + ")";
        }

        public /* synthetic */ Content(Locations locations, IconFieldVO iconFieldVO, IconFieldVO iconFieldVO2, IconFieldVO iconFieldVO3, ButtonV3DTO buttonV3DTO, String str, float f7, String str2, String str3, CellDTO cellDTO, Map map, boolean z11, SearchFormV5DTO.AsyncFetchConfig asyncFetchConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(locations, iconFieldVO, iconFieldVO2, iconFieldVO3, buttonV3DTO, str, f7, str2, str3, cellDTO, map, (i11 & 2048) != 0 ? false : z11, asyncFetchConfig);
        }
    }
}

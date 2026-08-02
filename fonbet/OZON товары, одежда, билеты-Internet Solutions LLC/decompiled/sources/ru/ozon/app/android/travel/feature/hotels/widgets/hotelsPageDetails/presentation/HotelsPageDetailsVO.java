package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation;

import Ak.C2436a;
import B0.C2454a;
import Ds.C2880a;
import G.g;
import J0.P;
import Kk.C3532b;
import Lh.b;
import N3.C3660k;
import Pk0.a;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.molecules.view.iconWithText.v2.IconWithTextV2VO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003*+,B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010JP\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u0017R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$TabInfoVO;", DynamicElementDTO.TABS, "", "hasTabs", "", "selectedTabIndex", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLjava/util/List;ZILWZ/t;)V", "copy", "(JLjava/util/List;ZILWZ/t;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Z", "getHasTabs", "()Z", "I", "getSelectedTabIndex", "LWZ/t;", "getViewEvent", "()LWZ/t;", "TabInfoVO", "FacilitiesVO", "ShortDescription", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageDetailsVO implements c {
    private final boolean hasTabs;
    private final long id;
    private final int selectedTabIndex;

    @NotNull
    private final List<TabInfoVO> tabs;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$FacilitiesVO;", "", "", "id", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getKey", "getValue", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FacilitiesVO {
        private final long id;

        @NotNull
        private final String key;

        @NotNull
        private final String value;

        public FacilitiesVO(long j11, @NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.id = j11;
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FacilitiesVO)) {
                return false;
            }
            FacilitiesVO facilitiesVO = (FacilitiesVO) other;
            return this.id == facilitiesVO.id && Intrinsics.d(this.key, facilitiesVO.key) && Intrinsics.d(this.value, facilitiesVO.value);
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + g.a(Long.hashCode(this.id) * 31, 31, this.key);
        }

        @NotNull
        public String toString() {
            return C6594f.a(", value=", this.value, ")", C2436a.c(this.id, "FacilitiesVO(id=", ", key=", this.key));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\"\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$ShortDescription;", "", "", "text", "", "spanStartIndex", "spanEndIndex", "spanColor", "<init>", "(Ljava/lang/String;III)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "I", "getSpanStartIndex", "getSpanEndIndex", "getSpanColor", "isFullDescriptionShown", "Z", "()Z", "setFullDescriptionShown", "(Z)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShortDescription {
        private boolean isFullDescriptionShown;
        private final int spanColor;
        private final int spanEndIndex;
        private final int spanStartIndex;

        @NotNull
        private final String text;

        public ShortDescription(@NotNull String text, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.spanStartIndex = i11;
            this.spanEndIndex = i12;
            this.spanColor = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShortDescription)) {
                return false;
            }
            ShortDescription shortDescription = (ShortDescription) other;
            return Intrinsics.d(this.text, shortDescription.text) && this.spanStartIndex == shortDescription.spanStartIndex && this.spanEndIndex == shortDescription.spanEndIndex && this.spanColor == shortDescription.spanColor;
        }

        public final int getSpanColor() {
            return this.spanColor;
        }

        public final int getSpanEndIndex() {
            return this.spanEndIndex;
        }

        public final int getSpanStartIndex() {
            return this.spanStartIndex;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Integer.hashCode(this.spanColor) + C2454a.a(this.spanEndIndex, C2454a.a(this.spanStartIndex, this.text.hashCode() * 31, 31), 31);
        }

        /* renamed from: isFullDescriptionShown, reason: from getter */
        public final boolean getIsFullDescriptionShown() {
            return this.isFullDescriptionShown;
        }

        public final void setFullDescriptionShown(boolean z11) {
            this.isFullDescriptionShown = z11;
        }

        @NotNull
        public String toString() {
            String str = this.text;
            return P.a(this.spanEndIndex, this.spanColor, ", spanColor=", ")", C3660k.c(this.spanStartIndex, "ShortDescription(text=", str, ", spanStartIndex=", ", spanEndIndex="));
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b!\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010#R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\f\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b*\u0010&R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b\u0011\u0010#¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$TabInfoVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$ShortDescription;", "shortDescription", "fullDescription", "", "isDescriptionVisible", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$FacilitiesVO;", "facilities", "isFacilitiesVisible", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "extendButton", "Lru/ozon/app/android/travel/molecules/view/iconWithText/v2/IconWithTextV2VO;", "additionalInfo", "isAdditionalInfoVisible", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$ShortDescription;Ljava/lang/String;ZLjava/util/List;ZLru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$ShortDescription;", "getShortDescription", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$ShortDescription;", "getFullDescription", "Z", "()Z", "Ljava/util/List;", "getFacilities", "()Ljava/util/List;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getExtendButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getAdditionalInfo", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabInfoVO {
        private final List<IconWithTextV2VO> additionalInfo;
        private final LinkButtonVO extendButton;
        private final List<FacilitiesVO> facilities;
        private final String fullDescription;
        private final boolean isAdditionalInfoVisible;
        private final boolean isDescriptionVisible;
        private final boolean isFacilitiesVisible;
        private final ShortDescription shortDescription;

        @NotNull
        private final String title;

        public TabInfoVO(@NotNull String title, ShortDescription shortDescription, String str, boolean z11, List<FacilitiesVO> list, boolean z12, LinkButtonVO linkButtonVO, List<IconWithTextV2VO> list2, boolean z13) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.shortDescription = shortDescription;
            this.fullDescription = str;
            this.isDescriptionVisible = z11;
            this.facilities = list;
            this.isFacilitiesVisible = z12;
            this.extendButton = linkButtonVO;
            this.additionalInfo = list2;
            this.isAdditionalInfoVisible = z13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabInfoVO)) {
                return false;
            }
            TabInfoVO tabInfoVO = (TabInfoVO) other;
            return Intrinsics.d(this.title, tabInfoVO.title) && Intrinsics.d(this.shortDescription, tabInfoVO.shortDescription) && Intrinsics.d(this.fullDescription, tabInfoVO.fullDescription) && this.isDescriptionVisible == tabInfoVO.isDescriptionVisible && Intrinsics.d(this.facilities, tabInfoVO.facilities) && this.isFacilitiesVisible == tabInfoVO.isFacilitiesVisible && Intrinsics.d(this.extendButton, tabInfoVO.extendButton) && Intrinsics.d(this.additionalInfo, tabInfoVO.additionalInfo) && this.isAdditionalInfoVisible == tabInfoVO.isAdditionalInfoVisible;
        }

        public final List<IconWithTextV2VO> getAdditionalInfo() {
            return this.additionalInfo;
        }

        public final LinkButtonVO getExtendButton() {
            return this.extendButton;
        }

        public final List<FacilitiesVO> getFacilities() {
            return this.facilities;
        }

        public final String getFullDescription() {
            return this.fullDescription;
        }

        public final ShortDescription getShortDescription() {
            return this.shortDescription;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            ShortDescription shortDescription = this.shortDescription;
            int hashCode2 = (hashCode + (shortDescription == null ? 0 : shortDescription.hashCode())) * 31;
            String str = this.fullDescription;
            int a11 = C3532b.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isDescriptionVisible);
            List<FacilitiesVO> list = this.facilities;
            int a12 = C3532b.a((a11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isFacilitiesVisible);
            LinkButtonVO linkButtonVO = this.extendButton;
            int hashCode3 = (a12 + (linkButtonVO == null ? 0 : linkButtonVO.hashCode())) * 31;
            List<IconWithTextV2VO> list2 = this.additionalInfo;
            return Boolean.hashCode(this.isAdditionalInfoVisible) + ((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31);
        }

        /* renamed from: isAdditionalInfoVisible, reason: from getter */
        public final boolean getIsAdditionalInfoVisible() {
            return this.isAdditionalInfoVisible;
        }

        /* renamed from: isDescriptionVisible, reason: from getter */
        public final boolean getIsDescriptionVisible() {
            return this.isDescriptionVisible;
        }

        /* renamed from: isFacilitiesVisible, reason: from getter */
        public final boolean getIsFacilitiesVisible() {
            return this.isFacilitiesVisible;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            ShortDescription shortDescription = this.shortDescription;
            String str2 = this.fullDescription;
            boolean z11 = this.isDescriptionVisible;
            List<FacilitiesVO> list = this.facilities;
            boolean z12 = this.isFacilitiesVisible;
            LinkButtonVO linkButtonVO = this.extendButton;
            List<IconWithTextV2VO> list2 = this.additionalInfo;
            boolean z13 = this.isAdditionalInfoVisible;
            StringBuilder sb2 = new StringBuilder("TabInfoVO(title=");
            sb2.append(str);
            sb2.append(", shortDescription=");
            sb2.append(shortDescription);
            sb2.append(", fullDescription=");
            C2880a.c(str2, ", isDescriptionVisible=", ", facilities=", sb2, z11);
            sb2.append(list);
            sb2.append(", isFacilitiesVisible=");
            sb2.append(z12);
            sb2.append(", extendButton=");
            sb2.append(linkButtonVO);
            sb2.append(", additionalInfo=");
            sb2.append(list2);
            sb2.append(", isAdditionalInfoVisible=");
            return a.a(")", sb2, z13);
        }
    }

    public HotelsPageDetailsVO(long j11, @NotNull List<TabInfoVO> tabs, boolean z11, int i11, t tVar) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.tabs = tabs;
        this.hasTabs = z11;
        this.selectedTabIndex = i11;
        this.viewEvent = tVar;
    }

    public static /* synthetic */ HotelsPageDetailsVO copy$default(HotelsPageDetailsVO hotelsPageDetailsVO, long j11, List list, boolean z11, int i11, t tVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = hotelsPageDetailsVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            list = hotelsPageDetailsVO.tabs;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            z11 = hotelsPageDetailsVO.hasTabs;
        }
        boolean z12 = z11;
        if ((i12 & 8) != 0) {
            i11 = hotelsPageDetailsVO.selectedTabIndex;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            tVar = hotelsPageDetailsVO.viewEvent;
        }
        return hotelsPageDetailsVO.copy(j12, list2, z12, i13, tVar);
    }

    @NotNull
    public final HotelsPageDetailsVO copy(long id2, @NotNull List<TabInfoVO> tabs, boolean hasTabs, int selectedTabIndex, t viewEvent) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new HotelsPageDetailsVO(id2, tabs, hasTabs, selectedTabIndex, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageDetailsVO)) {
            return false;
        }
        HotelsPageDetailsVO hotelsPageDetailsVO = (HotelsPageDetailsVO) other;
        return this.id == hotelsPageDetailsVO.id && Intrinsics.d(this.tabs, hotelsPageDetailsVO.tabs) && this.hasTabs == hotelsPageDetailsVO.hasTabs && this.selectedTabIndex == hotelsPageDetailsVO.selectedTabIndex && Intrinsics.d(this.viewEvent, hotelsPageDetailsVO.viewEvent);
    }

    public final boolean getHasTabs() {
        return this.hasTabs;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    @NotNull
    public final List<TabInfoVO> getTabs() {
        return this.tabs;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.selectedTabIndex, C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.tabs), 31, this.hasTabs), 31);
        t tVar = this.viewEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TabInfoVO> list = this.tabs;
        boolean z11 = this.hasTabs;
        int i11 = this.selectedTabIndex;
        t tVar = this.viewEvent;
        StringBuilder b11 = b.b(j11, "HotelsPageDetailsVO(id=", ", tabs=", list);
        b11.append(", hasTabs=");
        b11.append(z11);
        b11.append(", selectedTabIndex=");
        b11.append(i11);
        return Lh.a.b(b11, ", viewEvent=", tVar, ")");
    }
}

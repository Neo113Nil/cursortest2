package ru.ozon.app.android.cart.familyGroup.data;

import B3.p;
import D3.g;
import Lh.a;
import Pk0.h;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003#$%B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "rightBlock", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$RightBlock;", "settings", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;", "common", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupCommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$RightBlock;Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupCommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getRightBlock", "()Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$RightBlock;", "getSettings", "()Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;", "getCommon", "()Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupCommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RightBlock", "FamilyGroupSettingsDTO", "FamilyGroupCommonControlSettings", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FamilyGroupDTO {
    public static final int $stable = 8;
    private final FamilyGroupCommonControlSettings common;
    private final RightBlock rightBlock;
    private final FamilyGroupSettingsDTO settings;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupCommonControlSettings;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FamilyGroupCommonControlSettings {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public FamilyGroupCommonControlSettings() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FamilyGroupCommonControlSettings copy$default(FamilyGroupCommonControlSettings familyGroupCommonControlSettings, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = familyGroupCommonControlSettings.action;
            }
            if ((i11 & 2) != 0) {
                map = familyGroupCommonControlSettings.trackingInfo;
            }
            if ((i11 & 4) != 0) {
                testInfo = familyGroupCommonControlSettings.testInfo;
            }
            return familyGroupCommonControlSettings.copy(atomActionDTO, map, testInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final FamilyGroupCommonControlSettings copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            return new FamilyGroupCommonControlSettings(action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FamilyGroupCommonControlSettings)) {
                return false;
            }
            FamilyGroupCommonControlSettings familyGroupCommonControlSettings = (FamilyGroupCommonControlSettings) other;
            return Intrinsics.d(this.action, familyGroupCommonControlSettings.action) && Intrinsics.d(this.trackingInfo, familyGroupCommonControlSettings.trackingInfo) && Intrinsics.d(this.testInfo, familyGroupCommonControlSettings.testInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("FamilyGroupCommonControlSettings(action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }

        public FamilyGroupCommonControlSettings(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public /* synthetic */ FamilyGroupCommonControlSettings(AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : atomActionDTO, (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? null : testInfo);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;", "", "horizontalMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getHorizontalMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getPaddingTop", "getPaddingBottom", "getPaddingLeft", "getPaddingRight", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FamilyGroupSettingsDTO {
        public static final int $stable = 0;
        private final CornerRadius cornerRadius;
        private final Paddings horizontalMargin;
        private final Paddings paddingBottom;
        private final Paddings paddingLeft;
        private final Paddings paddingRight;
        private final Paddings paddingTop;

        public FamilyGroupSettingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, CornerRadius cornerRadius) {
            this.horizontalMargin = paddings;
            this.paddingTop = paddings2;
            this.paddingBottom = paddings3;
            this.paddingLeft = paddings4;
            this.paddingRight = paddings5;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ FamilyGroupSettingsDTO copy$default(FamilyGroupSettingsDTO familyGroupSettingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = familyGroupSettingsDTO.horizontalMargin;
            }
            if ((i11 & 2) != 0) {
                paddings2 = familyGroupSettingsDTO.paddingTop;
            }
            if ((i11 & 4) != 0) {
                paddings3 = familyGroupSettingsDTO.paddingBottom;
            }
            if ((i11 & 8) != 0) {
                paddings4 = familyGroupSettingsDTO.paddingLeft;
            }
            if ((i11 & 16) != 0) {
                paddings5 = familyGroupSettingsDTO.paddingRight;
            }
            if ((i11 & 32) != 0) {
                cornerRadius = familyGroupSettingsDTO.cornerRadius;
            }
            Paddings paddings6 = paddings5;
            CornerRadius cornerRadius2 = cornerRadius;
            return familyGroupSettingsDTO.copy(paddings, paddings2, paddings3, paddings4, paddings6, cornerRadius2);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getHorizontalMargin() {
            return this.horizontalMargin;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getPaddingTop() {
            return this.paddingTop;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getPaddingBottom() {
            return this.paddingBottom;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getPaddingLeft() {
            return this.paddingLeft;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getPaddingRight() {
            return this.paddingRight;
        }

        /* renamed from: component6, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final FamilyGroupSettingsDTO copy(Paddings horizontalMargin, Paddings paddingTop, Paddings paddingBottom, Paddings paddingLeft, Paddings paddingRight, CornerRadius cornerRadius) {
            return new FamilyGroupSettingsDTO(horizontalMargin, paddingTop, paddingBottom, paddingLeft, paddingRight, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FamilyGroupSettingsDTO)) {
                return false;
            }
            FamilyGroupSettingsDTO familyGroupSettingsDTO = (FamilyGroupSettingsDTO) other;
            return this.horizontalMargin == familyGroupSettingsDTO.horizontalMargin && this.paddingTop == familyGroupSettingsDTO.paddingTop && this.paddingBottom == familyGroupSettingsDTO.paddingBottom && this.paddingLeft == familyGroupSettingsDTO.paddingLeft && this.paddingRight == familyGroupSettingsDTO.paddingRight && this.cornerRadius == familyGroupSettingsDTO.cornerRadius;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final Paddings getHorizontalMargin() {
            return this.horizontalMargin;
        }

        public final Paddings getPaddingBottom() {
            return this.paddingBottom;
        }

        public final Paddings getPaddingLeft() {
            return this.paddingLeft;
        }

        public final Paddings getPaddingRight() {
            return this.paddingRight;
        }

        public final Paddings getPaddingTop() {
            return this.paddingTop;
        }

        public int hashCode() {
            Paddings paddings = this.horizontalMargin;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.paddingTop;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.paddingBottom;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.paddingLeft;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.paddingRight;
            int hashCode5 = (hashCode4 + (paddings5 == null ? 0 : paddings5.hashCode())) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            return hashCode5 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.horizontalMargin;
            Paddings paddings2 = this.paddingTop;
            Paddings paddings3 = this.paddingBottom;
            Paddings paddings4 = this.paddingLeft;
            Paddings paddings5 = this.paddingRight;
            CornerRadius cornerRadius = this.cornerRadius;
            StringBuilder b11 = p.b("FamilyGroupSettingsDTO(horizontalMargin=", paddings, ", paddingTop=", paddings2, ", paddingBottom=");
            a.e(b11, paddings3, ", paddingLeft=", paddings4, ", paddingRight=");
            b11.append(paddings5);
            b11.append(", cornerRadius=");
            b11.append(cornerRadius);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$RightBlock;", "", "icons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "getIcons", "()Ljava/util/List;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RightBlock {
        public static final int $stable = 8;

        @NotNull
        private final List<IconDTO> icons;
        private final IndicatorDTO indicator;

        public RightBlock(@NotNull List<IconDTO> icons, IndicatorDTO indicatorDTO) {
            Intrinsics.checkNotNullParameter(icons, "icons");
            this.icons = icons;
            this.indicator = indicatorDTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RightBlock copy$default(RightBlock rightBlock, List list, IndicatorDTO indicatorDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = rightBlock.icons;
            }
            if ((i11 & 2) != 0) {
                indicatorDTO = rightBlock.indicator;
            }
            return rightBlock.copy(list, indicatorDTO);
        }

        @NotNull
        public final List<IconDTO> component1() {
            return this.icons;
        }

        /* renamed from: component2, reason: from getter */
        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final RightBlock copy(@NotNull List<IconDTO> icons, IndicatorDTO indicator) {
            Intrinsics.checkNotNullParameter(icons, "icons");
            return new RightBlock(icons, indicator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RightBlock)) {
                return false;
            }
            RightBlock rightBlock = (RightBlock) other;
            return Intrinsics.d(this.icons, rightBlock.icons) && Intrinsics.d(this.indicator, rightBlock.indicator);
        }

        @NotNull
        public final List<IconDTO> getIcons() {
            return this.icons;
        }

        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        public int hashCode() {
            int hashCode = this.icons.hashCode() * 31;
            IndicatorDTO indicatorDTO = this.indicator;
            return hashCode + (indicatorDTO == null ? 0 : indicatorDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "RightBlock(icons=" + this.icons + ", indicator=" + this.indicator + ")";
        }
    }

    public FamilyGroupDTO(@NotNull TextDTO title, TextDTO textDTO, RightBlock rightBlock, FamilyGroupSettingsDTO familyGroupSettingsDTO, FamilyGroupCommonControlSettings familyGroupCommonControlSettings) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = textDTO;
        this.rightBlock = rightBlock;
        this.settings = familyGroupSettingsDTO;
        this.common = familyGroupCommonControlSettings;
    }

    public static /* synthetic */ FamilyGroupDTO copy$default(FamilyGroupDTO familyGroupDTO, TextDTO textDTO, TextDTO textDTO2, RightBlock rightBlock, FamilyGroupSettingsDTO familyGroupSettingsDTO, FamilyGroupCommonControlSettings familyGroupCommonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = familyGroupDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = familyGroupDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            rightBlock = familyGroupDTO.rightBlock;
        }
        if ((i11 & 8) != 0) {
            familyGroupSettingsDTO = familyGroupDTO.settings;
        }
        if ((i11 & 16) != 0) {
            familyGroupCommonControlSettings = familyGroupDTO.common;
        }
        FamilyGroupCommonControlSettings familyGroupCommonControlSettings2 = familyGroupCommonControlSettings;
        RightBlock rightBlock2 = rightBlock;
        return familyGroupDTO.copy(textDTO, textDTO2, rightBlock2, familyGroupSettingsDTO, familyGroupCommonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final RightBlock getRightBlock() {
        return this.rightBlock;
    }

    /* renamed from: component4, reason: from getter */
    public final FamilyGroupSettingsDTO getSettings() {
        return this.settings;
    }

    /* renamed from: component5, reason: from getter */
    public final FamilyGroupCommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final FamilyGroupDTO copy(@NotNull TextDTO title, TextDTO subtitle, RightBlock rightBlock, FamilyGroupSettingsDTO settings, FamilyGroupCommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new FamilyGroupDTO(title, subtitle, rightBlock, settings, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyGroupDTO)) {
            return false;
        }
        FamilyGroupDTO familyGroupDTO = (FamilyGroupDTO) other;
        return Intrinsics.d(this.title, familyGroupDTO.title) && Intrinsics.d(this.subtitle, familyGroupDTO.subtitle) && Intrinsics.d(this.rightBlock, familyGroupDTO.rightBlock) && Intrinsics.d(this.settings, familyGroupDTO.settings) && Intrinsics.d(this.common, familyGroupDTO.common);
    }

    public final FamilyGroupCommonControlSettings getCommon() {
        return this.common;
    }

    public final RightBlock getRightBlock() {
        return this.rightBlock;
    }

    public final FamilyGroupSettingsDTO getSettings() {
        return this.settings;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        RightBlock rightBlock = this.rightBlock;
        int hashCode3 = (hashCode2 + (rightBlock == null ? 0 : rightBlock.hashCode())) * 31;
        FamilyGroupSettingsDTO familyGroupSettingsDTO = this.settings;
        int hashCode4 = (hashCode3 + (familyGroupSettingsDTO == null ? 0 : familyGroupSettingsDTO.hashCode())) * 31;
        FamilyGroupCommonControlSettings familyGroupCommonControlSettings = this.common;
        return hashCode4 + (familyGroupCommonControlSettings != null ? familyGroupCommonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        RightBlock rightBlock = this.rightBlock;
        FamilyGroupSettingsDTO familyGroupSettingsDTO = this.settings;
        FamilyGroupCommonControlSettings familyGroupCommonControlSettings = this.common;
        StringBuilder g10 = g.g("FamilyGroupDTO(title=", textDTO, ", subtitle=", textDTO2, ", rightBlock=");
        g10.append(rightBlock);
        g10.append(", settings=");
        g10.append(familyGroupSettingsDTO);
        g10.append(", common=");
        g10.append(familyGroupCommonControlSettings);
        g10.append(")");
        return g10.toString();
    }
}

package ru.ozon.app.android.storefront.widgets.navbarv2.data;

import D3.h;
import Ef0.c;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\bB\b\u0087\b\u0018\u00002\u00020\u0001:\u0002abB\u0083\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010L\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010M\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010N\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0017\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0003Jº\u0002\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0001¢\u0006\u0002\u0010\\J\u0013\u0010]\u001a\u00020\u00062\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020\rHÖ\u0001J\t\u0010`\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\t\u0010(R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\b,\u0010(R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u000b\u0010(R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010/\u001a\u0004\b1\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010/\u001a\u0004\b5\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\b<\u0010(R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\b=\u0010(R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;", "", "backgroundColor", "", "overlayColor", "forceWhiteStatusBar", "", "backgroundImage", "darkBackgroundImage", "isRounded", "disableRounding", "isStickyThirdLevel", "statusBarBottomSpacing", "", "level0BottomSpacing", "level1BottomSpacing", "level1LeftPaddingApps", "Lru/ozon/uni/atoms/data/common/Paddings;", "level1RightPaddingApps", "level2BottomSpacing", "level2LeftPaddingApps", "level2RightPaddingApps", "level3LeftPadding", "level3RightPadding", "showFullNavbarMode", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;", "hasScrollLevel", "hasTeeth", "backButtonColor", "dynamicOnScrollColors", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getOverlayColor", "getForceWhiteStatusBar", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundImage", "getDarkBackgroundImage", "getDisableRounding", "getStatusBarBottomSpacing", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLevel0BottomSpacing", "getLevel1BottomSpacing", "getLevel1LeftPaddingApps", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getLevel1RightPaddingApps", "getLevel2BottomSpacing", "getLevel2LeftPaddingApps", "getLevel2RightPaddingApps", "getLevel3LeftPadding", "getLevel3RightPadding", "getShowFullNavbarMode", "()Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;", "getHasScrollLevel", "getHasTeeth", "getBackButtonColor", "getDynamicOnScrollColors", "()Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;Ljava/util/Map;)Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;", "equals", "other", "hashCode", "toString", "NestedPlaceholders", "ShowFullNavBarMode", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ShellNavBarDTO {
    public static final int $stable = 8;
    private final String backButtonColor;
    private final String backgroundColor;
    private final String backgroundImage;
    private final String darkBackgroundImage;
    private final Boolean disableRounding;
    private final DynamicOnScrollColors dynamicOnScrollColors;
    private final Boolean forceWhiteStatusBar;
    private final Boolean hasScrollLevel;
    private final Boolean hasTeeth;
    private final Boolean isRounded;
    private final Boolean isStickyThirdLevel;
    private final Integer level0BottomSpacing;
    private final Integer level1BottomSpacing;
    private final Paddings level1LeftPaddingApps;
    private final Paddings level1RightPaddingApps;
    private final Integer level2BottomSpacing;
    private final Paddings level2LeftPaddingApps;
    private final Paddings level2RightPaddingApps;
    private final Paddings level3LeftPadding;
    private final Paddings level3RightPadding;
    private final String overlayColor;
    private final ShowFullNavBarMode showFullNavbarMode;
    private final Integer statusBarBottomSpacing;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$NestedPlaceholders;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NESTED_PLACEHOLDER_ZERO_DEFAULT", "NESTED_PLACEHOLDER_ZERO_RIGHT", "NESTED_PLACEHOLDER_TOP_DEFAULT", "NESTED_PLACEHOLDER_TOP_RIGHT", "NESTED_PLACEHOLDER_SECOND_COLLAPSED_DEFAULT", "NESTED_PLACEHOLDER_SECOND_COLLAPSED_RIGHT", "NESTED_PLACEHOLDER_SECOND_DEFAULT", "NESTED_PLACEHOLDER_SECOND_RIGHT", "NESTED_PLACEHOLDER_THIRD_DEFAULT", "NESTED_PLACEHOLDER_SCROLL_FLOOR_DEFAULT", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NestedPlaceholders {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ NestedPlaceholders[] $VALUES;

        @NotNull
        private final String value;
        public static final NestedPlaceholders NESTED_PLACEHOLDER_ZERO_DEFAULT = new NestedPlaceholders("NESTED_PLACEHOLDER_ZERO_DEFAULT", 0, "zeroDefault");
        public static final NestedPlaceholders NESTED_PLACEHOLDER_ZERO_RIGHT = new NestedPlaceholders("NESTED_PLACEHOLDER_ZERO_RIGHT", 1, "zeroRight");
        public static final NestedPlaceholders NESTED_PLACEHOLDER_TOP_DEFAULT = new NestedPlaceholders("NESTED_PLACEHOLDER_TOP_DEFAULT", 2, "topDefault");
        public static final NestedPlaceholders NESTED_PLACEHOLDER_TOP_RIGHT = new NestedPlaceholders("NESTED_PLACEHOLDER_TOP_RIGHT", 3, "topRight");
        public static final NestedPlaceholders NESTED_PLACEHOLDER_SECOND_COLLAPSED_DEFAULT = new NestedPlaceholders("NESTED_PLACEHOLDER_SECOND_COLLAPSED_DEFAULT", 4, "secondCollapsedDefault");
        public static final NestedPlaceholders NESTED_PLACEHOLDER_SECOND_COLLAPSED_RIGHT = new NestedPlaceholders("NESTED_PLACEHOLDER_SECOND_COLLAPSED_RIGHT", 5, "secondCollapsedRight");
        public static final NestedPlaceholders NESTED_PLACEHOLDER_SECOND_DEFAULT = new NestedPlaceholders("NESTED_PLACEHOLDER_SECOND_DEFAULT", 6, "secondDefault");
        public static final NestedPlaceholders NESTED_PLACEHOLDER_SECOND_RIGHT = new NestedPlaceholders("NESTED_PLACEHOLDER_SECOND_RIGHT", 7, "secondRight");
        public static final NestedPlaceholders NESTED_PLACEHOLDER_THIRD_DEFAULT = new NestedPlaceholders("NESTED_PLACEHOLDER_THIRD_DEFAULT", 8, "thirdDefault");
        public static final NestedPlaceholders NESTED_PLACEHOLDER_SCROLL_FLOOR_DEFAULT = new NestedPlaceholders("NESTED_PLACEHOLDER_SCROLL_FLOOR_DEFAULT", 9, "scrollDefault");

        private static final /* synthetic */ NestedPlaceholders[] $values() {
            return new NestedPlaceholders[]{NESTED_PLACEHOLDER_ZERO_DEFAULT, NESTED_PLACEHOLDER_ZERO_RIGHT, NESTED_PLACEHOLDER_TOP_DEFAULT, NESTED_PLACEHOLDER_TOP_RIGHT, NESTED_PLACEHOLDER_SECOND_COLLAPSED_DEFAULT, NESTED_PLACEHOLDER_SECOND_COLLAPSED_RIGHT, NESTED_PLACEHOLDER_SECOND_DEFAULT, NESTED_PLACEHOLDER_SECOND_RIGHT, NESTED_PLACEHOLDER_THIRD_DEFAULT, NESTED_PLACEHOLDER_SCROLL_FLOOR_DEFAULT};
        }

        static {
            NestedPlaceholders[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private NestedPlaceholders(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a<NestedPlaceholders> getEntries() {
            return $ENTRIES;
        }

        public static NestedPlaceholders valueOf(String str) {
            return (NestedPlaceholders) Enum.valueOf(NestedPlaceholders.class, str);
        }

        public static NestedPlaceholders[] values() {
            return (NestedPlaceholders[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "ANY_POINT", "PAGE_START", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowFullNavBarMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ShowFullNavBarMode[] $VALUES;
        public static final ShowFullNavBarMode INVALID = new ShowFullNavBarMode("INVALID", 0);
        public static final ShowFullNavBarMode ANY_POINT = new ShowFullNavBarMode("ANY_POINT", 1);
        public static final ShowFullNavBarMode PAGE_START = new ShowFullNavBarMode("PAGE_START", 2);

        private static final /* synthetic */ ShowFullNavBarMode[] $values() {
            return new ShowFullNavBarMode[]{INVALID, ANY_POINT, PAGE_START};
        }

        static {
            ShowFullNavBarMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ShowFullNavBarMode(String str, int i11) {
        }

        public static ShowFullNavBarMode valueOf(String str) {
            return (ShowFullNavBarMode) Enum.valueOf(ShowFullNavBarMode.class, str);
        }

        public static ShowFullNavBarMode[] values() {
            return (ShowFullNavBarMode[]) $VALUES.clone();
        }
    }

    public ShellNavBarDTO(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, Paddings paddings, Paddings paddings2, Integer num4, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, ShowFullNavBarMode showFullNavBarMode, Boolean bool5, Boolean bool6, String str5, DynamicOnScrollColors dynamicOnScrollColors, Map<String, TokenizedTrackingInfo> map) {
        this.backgroundColor = str;
        this.overlayColor = str2;
        this.forceWhiteStatusBar = bool;
        this.backgroundImage = str3;
        this.darkBackgroundImage = str4;
        this.isRounded = bool2;
        this.disableRounding = bool3;
        this.isStickyThirdLevel = bool4;
        this.statusBarBottomSpacing = num;
        this.level0BottomSpacing = num2;
        this.level1BottomSpacing = num3;
        this.level1LeftPaddingApps = paddings;
        this.level1RightPaddingApps = paddings2;
        this.level2BottomSpacing = num4;
        this.level2LeftPaddingApps = paddings3;
        this.level2RightPaddingApps = paddings4;
        this.level3LeftPadding = paddings5;
        this.level3RightPadding = paddings6;
        this.showFullNavbarMode = showFullNavBarMode;
        this.hasScrollLevel = bool5;
        this.hasTeeth = bool6;
        this.backButtonColor = str5;
        this.dynamicOnScrollColors = dynamicOnScrollColors;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ShellNavBarDTO copy$default(ShellNavBarDTO shellNavBarDTO, String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, Paddings paddings, Paddings paddings2, Integer num4, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, ShowFullNavBarMode showFullNavBarMode, Boolean bool5, Boolean bool6, String str5, DynamicOnScrollColors dynamicOnScrollColors, Map map, int i11, Object obj) {
        Map map2;
        DynamicOnScrollColors dynamicOnScrollColors2;
        String str6 = (i11 & 1) != 0 ? shellNavBarDTO.backgroundColor : str;
        String str7 = (i11 & 2) != 0 ? shellNavBarDTO.overlayColor : str2;
        Boolean bool7 = (i11 & 4) != 0 ? shellNavBarDTO.forceWhiteStatusBar : bool;
        String str8 = (i11 & 8) != 0 ? shellNavBarDTO.backgroundImage : str3;
        String str9 = (i11 & 16) != 0 ? shellNavBarDTO.darkBackgroundImage : str4;
        Boolean bool8 = (i11 & 32) != 0 ? shellNavBarDTO.isRounded : bool2;
        Boolean bool9 = (i11 & 64) != 0 ? shellNavBarDTO.disableRounding : bool3;
        Boolean bool10 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? shellNavBarDTO.isStickyThirdLevel : bool4;
        Integer num5 = (i11 & 256) != 0 ? shellNavBarDTO.statusBarBottomSpacing : num;
        Integer num6 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? shellNavBarDTO.level0BottomSpacing : num2;
        Integer num7 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? shellNavBarDTO.level1BottomSpacing : num3;
        Paddings paddings7 = (i11 & 2048) != 0 ? shellNavBarDTO.level1LeftPaddingApps : paddings;
        Paddings paddings8 = (i11 & 4096) != 0 ? shellNavBarDTO.level1RightPaddingApps : paddings2;
        Integer num8 = (i11 & 8192) != 0 ? shellNavBarDTO.level2BottomSpacing : num4;
        String str10 = str6;
        Paddings paddings9 = (i11 & 16384) != 0 ? shellNavBarDTO.level2LeftPaddingApps : paddings3;
        Paddings paddings10 = (i11 & 32768) != 0 ? shellNavBarDTO.level2RightPaddingApps : paddings4;
        Paddings paddings11 = (i11 & 65536) != 0 ? shellNavBarDTO.level3LeftPadding : paddings5;
        Paddings paddings12 = (i11 & 131072) != 0 ? shellNavBarDTO.level3RightPadding : paddings6;
        ShowFullNavBarMode showFullNavBarMode2 = (i11 & 262144) != 0 ? shellNavBarDTO.showFullNavbarMode : showFullNavBarMode;
        Boolean bool11 = (i11 & 524288) != 0 ? shellNavBarDTO.hasScrollLevel : bool5;
        Boolean bool12 = (i11 & 1048576) != 0 ? shellNavBarDTO.hasTeeth : bool6;
        String str11 = (i11 & 2097152) != 0 ? shellNavBarDTO.backButtonColor : str5;
        DynamicOnScrollColors dynamicOnScrollColors3 = (i11 & 4194304) != 0 ? shellNavBarDTO.dynamicOnScrollColors : dynamicOnScrollColors;
        if ((i11 & 8388608) != 0) {
            dynamicOnScrollColors2 = dynamicOnScrollColors3;
            map2 = shellNavBarDTO.trackingInfo;
        } else {
            map2 = map;
            dynamicOnScrollColors2 = dynamicOnScrollColors3;
        }
        return shellNavBarDTO.copy(str10, str7, bool7, str8, str9, bool8, bool9, bool10, num5, num6, num7, paddings7, paddings8, num8, paddings9, paddings10, paddings11, paddings12, showFullNavBarMode2, bool11, bool12, str11, dynamicOnScrollColors2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getLevel0BottomSpacing() {
        return this.level0BottomSpacing;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getLevel1BottomSpacing() {
        return this.level1BottomSpacing;
    }

    /* renamed from: component12, reason: from getter */
    public final Paddings getLevel1LeftPaddingApps() {
        return this.level1LeftPaddingApps;
    }

    /* renamed from: component13, reason: from getter */
    public final Paddings getLevel1RightPaddingApps() {
        return this.level1RightPaddingApps;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getLevel2BottomSpacing() {
        return this.level2BottomSpacing;
    }

    /* renamed from: component15, reason: from getter */
    public final Paddings getLevel2LeftPaddingApps() {
        return this.level2LeftPaddingApps;
    }

    /* renamed from: component16, reason: from getter */
    public final Paddings getLevel2RightPaddingApps() {
        return this.level2RightPaddingApps;
    }

    /* renamed from: component17, reason: from getter */
    public final Paddings getLevel3LeftPadding() {
        return this.level3LeftPadding;
    }

    /* renamed from: component18, reason: from getter */
    public final Paddings getLevel3RightPadding() {
        return this.level3RightPadding;
    }

    /* renamed from: component19, reason: from getter */
    public final ShowFullNavBarMode getShowFullNavbarMode() {
        return this.showFullNavbarMode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOverlayColor() {
        return this.overlayColor;
    }

    /* renamed from: component20, reason: from getter */
    public final Boolean getHasScrollLevel() {
        return this.hasScrollLevel;
    }

    /* renamed from: component21, reason: from getter */
    public final Boolean getHasTeeth() {
        return this.hasTeeth;
    }

    /* renamed from: component22, reason: from getter */
    public final String getBackButtonColor() {
        return this.backButtonColor;
    }

    /* renamed from: component23, reason: from getter */
    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    public final Map<String, TokenizedTrackingInfo> component24() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getForceWhiteStatusBar() {
        return this.forceWhiteStatusBar;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDarkBackgroundImage() {
        return this.darkBackgroundImage;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsRounded() {
        return this.isRounded;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getDisableRounding() {
        return this.disableRounding;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsStickyThirdLevel() {
        return this.isStickyThirdLevel;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getStatusBarBottomSpacing() {
        return this.statusBarBottomSpacing;
    }

    @NotNull
    public final ShellNavBarDTO copy(String backgroundColor, String overlayColor, Boolean forceWhiteStatusBar, String backgroundImage, String darkBackgroundImage, Boolean isRounded, Boolean disableRounding, Boolean isStickyThirdLevel, Integer statusBarBottomSpacing, Integer level0BottomSpacing, Integer level1BottomSpacing, Paddings level1LeftPaddingApps, Paddings level1RightPaddingApps, Integer level2BottomSpacing, Paddings level2LeftPaddingApps, Paddings level2RightPaddingApps, Paddings level3LeftPadding, Paddings level3RightPadding, ShowFullNavBarMode showFullNavbarMode, Boolean hasScrollLevel, Boolean hasTeeth, String backButtonColor, DynamicOnScrollColors dynamicOnScrollColors, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new ShellNavBarDTO(backgroundColor, overlayColor, forceWhiteStatusBar, backgroundImage, darkBackgroundImage, isRounded, disableRounding, isStickyThirdLevel, statusBarBottomSpacing, level0BottomSpacing, level1BottomSpacing, level1LeftPaddingApps, level1RightPaddingApps, level2BottomSpacing, level2LeftPaddingApps, level2RightPaddingApps, level3LeftPadding, level3RightPadding, showFullNavbarMode, hasScrollLevel, hasTeeth, backButtonColor, dynamicOnScrollColors, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShellNavBarDTO)) {
            return false;
        }
        ShellNavBarDTO shellNavBarDTO = (ShellNavBarDTO) other;
        return Intrinsics.d(this.backgroundColor, shellNavBarDTO.backgroundColor) && Intrinsics.d(this.overlayColor, shellNavBarDTO.overlayColor) && Intrinsics.d(this.forceWhiteStatusBar, shellNavBarDTO.forceWhiteStatusBar) && Intrinsics.d(this.backgroundImage, shellNavBarDTO.backgroundImage) && Intrinsics.d(this.darkBackgroundImage, shellNavBarDTO.darkBackgroundImage) && Intrinsics.d(this.isRounded, shellNavBarDTO.isRounded) && Intrinsics.d(this.disableRounding, shellNavBarDTO.disableRounding) && Intrinsics.d(this.isStickyThirdLevel, shellNavBarDTO.isStickyThirdLevel) && Intrinsics.d(this.statusBarBottomSpacing, shellNavBarDTO.statusBarBottomSpacing) && Intrinsics.d(this.level0BottomSpacing, shellNavBarDTO.level0BottomSpacing) && Intrinsics.d(this.level1BottomSpacing, shellNavBarDTO.level1BottomSpacing) && this.level1LeftPaddingApps == shellNavBarDTO.level1LeftPaddingApps && this.level1RightPaddingApps == shellNavBarDTO.level1RightPaddingApps && Intrinsics.d(this.level2BottomSpacing, shellNavBarDTO.level2BottomSpacing) && this.level2LeftPaddingApps == shellNavBarDTO.level2LeftPaddingApps && this.level2RightPaddingApps == shellNavBarDTO.level2RightPaddingApps && this.level3LeftPadding == shellNavBarDTO.level3LeftPadding && this.level3RightPadding == shellNavBarDTO.level3RightPadding && this.showFullNavbarMode == shellNavBarDTO.showFullNavbarMode && Intrinsics.d(this.hasScrollLevel, shellNavBarDTO.hasScrollLevel) && Intrinsics.d(this.hasTeeth, shellNavBarDTO.hasTeeth) && Intrinsics.d(this.backButtonColor, shellNavBarDTO.backButtonColor) && Intrinsics.d(this.dynamicOnScrollColors, shellNavBarDTO.dynamicOnScrollColors) && Intrinsics.d(this.trackingInfo, shellNavBarDTO.trackingInfo);
    }

    public final String getBackButtonColor() {
        return this.backButtonColor;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getDarkBackgroundImage() {
        return this.darkBackgroundImage;
    }

    public final Boolean getDisableRounding() {
        return this.disableRounding;
    }

    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    public final Boolean getForceWhiteStatusBar() {
        return this.forceWhiteStatusBar;
    }

    public final Boolean getHasScrollLevel() {
        return this.hasScrollLevel;
    }

    public final Boolean getHasTeeth() {
        return this.hasTeeth;
    }

    public final Integer getLevel0BottomSpacing() {
        return this.level0BottomSpacing;
    }

    public final Integer getLevel1BottomSpacing() {
        return this.level1BottomSpacing;
    }

    public final Paddings getLevel1LeftPaddingApps() {
        return this.level1LeftPaddingApps;
    }

    public final Paddings getLevel1RightPaddingApps() {
        return this.level1RightPaddingApps;
    }

    public final Integer getLevel2BottomSpacing() {
        return this.level2BottomSpacing;
    }

    public final Paddings getLevel2LeftPaddingApps() {
        return this.level2LeftPaddingApps;
    }

    public final Paddings getLevel2RightPaddingApps() {
        return this.level2RightPaddingApps;
    }

    public final Paddings getLevel3LeftPadding() {
        return this.level3LeftPadding;
    }

    public final Paddings getLevel3RightPadding() {
        return this.level3RightPadding;
    }

    public final String getOverlayColor() {
        return this.overlayColor;
    }

    public final ShowFullNavBarMode getShowFullNavbarMode() {
        return this.showFullNavbarMode;
    }

    public final Integer getStatusBarBottomSpacing() {
        return this.statusBarBottomSpacing;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.overlayColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.forceWhiteStatusBar;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.backgroundImage;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkBackgroundImage;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isRounded;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.disableRounding;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isStickyThirdLevel;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.statusBarBottomSpacing;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.level0BottomSpacing;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.level1BottomSpacing;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Paddings paddings = this.level1LeftPaddingApps;
        int hashCode12 = (hashCode11 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.level1RightPaddingApps;
        int hashCode13 = (hashCode12 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Integer num4 = this.level2BottomSpacing;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Paddings paddings3 = this.level2LeftPaddingApps;
        int hashCode15 = (hashCode14 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.level2RightPaddingApps;
        int hashCode16 = (hashCode15 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
        Paddings paddings5 = this.level3LeftPadding;
        int hashCode17 = (hashCode16 + (paddings5 == null ? 0 : paddings5.hashCode())) * 31;
        Paddings paddings6 = this.level3RightPadding;
        int hashCode18 = (hashCode17 + (paddings6 == null ? 0 : paddings6.hashCode())) * 31;
        ShowFullNavBarMode showFullNavBarMode = this.showFullNavbarMode;
        int hashCode19 = (hashCode18 + (showFullNavBarMode == null ? 0 : showFullNavBarMode.hashCode())) * 31;
        Boolean bool5 = this.hasScrollLevel;
        int hashCode20 = (hashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasTeeth;
        int hashCode21 = (hashCode20 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str5 = this.backButtonColor;
        int hashCode22 = (hashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        int hashCode23 = (hashCode22 + (dynamicOnScrollColors == null ? 0 : dynamicOnScrollColors.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode23 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isRounded() {
        return this.isRounded;
    }

    public final Boolean isStickyThirdLevel() {
        return this.isStickyThirdLevel;
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.overlayColor;
        Boolean bool = this.forceWhiteStatusBar;
        String str3 = this.backgroundImage;
        String str4 = this.darkBackgroundImage;
        Boolean bool2 = this.isRounded;
        Boolean bool3 = this.disableRounding;
        Boolean bool4 = this.isStickyThirdLevel;
        Integer num = this.statusBarBottomSpacing;
        Integer num2 = this.level0BottomSpacing;
        Integer num3 = this.level1BottomSpacing;
        Paddings paddings = this.level1LeftPaddingApps;
        Paddings paddings2 = this.level1RightPaddingApps;
        Integer num4 = this.level2BottomSpacing;
        Paddings paddings3 = this.level2LeftPaddingApps;
        Paddings paddings4 = this.level2RightPaddingApps;
        Paddings paddings5 = this.level3LeftPadding;
        Paddings paddings6 = this.level3RightPadding;
        ShowFullNavBarMode showFullNavBarMode = this.showFullNavbarMode;
        Boolean bool5 = this.hasScrollLevel;
        Boolean bool6 = this.hasTeeth;
        String str5 = this.backButtonColor;
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("ShellNavBarDTO(backgroundColor=", str, ", overlayColor=", str2, ", forceWhiteStatusBar=");
        HY.b.c(bool, ", backgroundImage=", str3, ", darkBackgroundImage=", d11);
        Sh.a.d(bool2, str4, ", isRounded=", ", disableRounding=", d11);
        h.h(d11, bool3, ", isStickyThirdLevel=", bool4, ", statusBarBottomSpacing=");
        c.e(d11, num, ", level0BottomSpacing=", num2, ", level1BottomSpacing=");
        d11.append(num3);
        d11.append(", level1LeftPaddingApps=");
        d11.append(paddings);
        d11.append(", level1RightPaddingApps=");
        d11.append(paddings2);
        d11.append(", level2BottomSpacing=");
        d11.append(num4);
        d11.append(", level2LeftPaddingApps=");
        Lh.a.e(d11, paddings3, ", level2RightPaddingApps=", paddings4, ", level3LeftPadding=");
        Lh.a.e(d11, paddings5, ", level3RightPadding=", paddings6, ", showFullNavbarMode=");
        d11.append(showFullNavBarMode);
        d11.append(", hasScrollLevel=");
        d11.append(bool5);
        d11.append(", hasTeeth=");
        HY.b.c(bool6, ", backButtonColor=", str5, ", dynamicOnScrollColors=", d11);
        d11.append(dynamicOnScrollColors);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}

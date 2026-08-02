package ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.utils;

import Sc.InterfaceC4008j;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper$ScreenSize;", "getScreenSize", "()Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper$ScreenSize;", "", "visibleTilesCount", "", "itemWidth", "fullTilesCount", "calculateAvgSpacing", "(FII)F", "itemCount", "", "isCompactStyle", "isScrollable", "(IZ)Z", "calculateSpacingDp", "(Z)I", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "displayMetrics$delegate", "LSc/j;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "displayMetrics", "screenWidthDp$delegate", "getScreenWidthDp", "()F", "screenWidthDp", "Companion", "ScreenSize", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderV3Helper {

    /* renamed from: displayMetrics$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j displayMetrics;

    /* renamed from: screenWidthDp$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j screenWidthDp;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper$Companion;", "", "<init>", "()V", "VISIBLE_FULL_TILES_COUNT_WIDE", "", "VISIBLE_TILES_COUNT_WIDE", "", "VISIBLE_FULL_TILES_COUNT_COMPACT", "VISIBLE_TILES_COUNT_COMPACT", "ITEM_WIDTH_COMPACT", "ITEM_WIDTH_WIDE", "HORIZONTAL_PADDING", "ITEM_SPACING_SMALL_COMPACT", "ITEM_SPACING_SMALL_WIDE", "ITEM_SPACING_LARGE", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper$ScreenSize;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "AVERAGE", "LARGE", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ScreenSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ScreenSize[] $VALUES;
        public static final ScreenSize SMALL = new ScreenSize("SMALL", 0);
        public static final ScreenSize AVERAGE = new ScreenSize("AVERAGE", 1);
        public static final ScreenSize LARGE = new ScreenSize("LARGE", 2);

        private static final /* synthetic */ ScreenSize[] $values() {
            return new ScreenSize[]{SMALL, AVERAGE, LARGE};
        }

        static {
            ScreenSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ScreenSize(String str, int i11) {
        }

        public static ScreenSize valueOf(String str) {
            return (ScreenSize) Enum.valueOf(ScreenSize.class, str);
        }

        public static ScreenSize[] values() {
            return (ScreenSize[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenSize.values().length];
            try {
                iArr[ScreenSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenSize.AVERAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenSize.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NavigationSliderV3Helper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.displayMetrics = LazyUtilsKt.unsafeLazy(new NavigationSliderV3Helper$displayMetrics$2(context));
        this.screenWidthDp = LazyUtilsKt.unsafeLazy(new NavigationSliderV3Helper$screenWidthDp$2(this));
    }

    private final float calculateAvgSpacing(float visibleTilesCount, int itemWidth, int fullTilesCount) {
        return ((getScreenWidthDp() - (visibleTilesCount * itemWidth)) - 12) / fullTilesCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisplayMetrics getDisplayMetrics() {
        return (DisplayMetrics) this.displayMetrics.getValue();
    }

    private final ScreenSize getScreenSize() {
        if (getScreenWidthDp() <= 360.0f) {
            return ScreenSize.SMALL;
        }
        float screenWidthDp = getScreenWidthDp();
        return (361.0f > screenWidthDp || screenWidthDp > 430.0f) ? ScreenSize.LARGE : ScreenSize.AVERAGE;
    }

    private final float getScreenWidthDp() {
        return ((Number) this.screenWidthDp.getValue()).floatValue();
    }

    public final int calculateSpacingDp(boolean isCompactStyle) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getScreenSize().ordinal()];
        if (i11 == 1) {
            return isCompactStyle ? 8 : 6;
        }
        if (i11 == 2) {
            return (int) (isCompactStyle ? calculateAvgSpacing(5.5f, 56, 5) : calculateAvgSpacing(4.5f, 72, 4));
        }
        if (i11 == 3) {
            return 10;
        }
        throw new o();
    }

    public final boolean isScrollable(int itemCount, boolean isCompactStyle) {
        return ((float) ((((isCompactStyle ? 56 : 72) * itemCount) + (itemCount > 1 ? (itemCount - 1) * calculateSpacingDp(isCompactStyle) : 0)) + 24)) > getScreenWidthDp();
    }
}

package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.core;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorAtomDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.data.MorkovskTabbarDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.MorkovskTabbarVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 42*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u00014B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\r\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010 \u001a\u00020\u00022\n\u0010\"\u001a\u00060\u0003j\u0002`!H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u001b\u0010*\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010-\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u001b\u00100\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001b\u00102\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/core/MorkovskTabbarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/data/MorkovskTabbarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "id", "toVO", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/data/MorkovskTabbarDTO;J)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/data/MorkovskTabbarDTO$MorkovskTabItemDTO;", "", "index", "size", "animationTime", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/data/MorkovskTabbarDTO$MorkovskTabItemDTO;JIILjava/lang/Long;)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;", "", "isSide", "getBlockWidth", "(Z)I", "blockWidth", "getImageHeight", "(IZ)I", "seconds", "mapToMillis", "(Ljava/lang/Integer;)Ljava/lang/Long;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/data/MorkovskTabbarDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "screenSize$delegate", "LSc/j;", "getScreenSize", "()I", "screenSize", "sideBlockWidthForSmallScreen$delegate", "getSideBlockWidthForSmallScreen", "sideBlockWidthForSmallScreen", "centerBlockWidthForSmallScreen$delegate", "getCenterBlockWidthForSmallScreen", "centerBlockWidthForSmallScreen", "isSmallScreen$delegate", "isSmallScreen", "()Z", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarMapper implements Function2<MorkovskTabbarDTO, d, List<? extends MorkovskTabbarVO>> {

    /* renamed from: centerBlockWidthForSmallScreen$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j centerBlockWidthForSmallScreen;

    @NotNull
    private final Context context;

    /* renamed from: isSmallScreen$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isSmallScreen;

    /* renamed from: screenSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j screenSize;

    /* renamed from: sideBlockWidthForSmallScreen$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sideBlockWidthForSmallScreen;
    public static final int $stable = 8;
    private static final int paddingsForSmallScreen = UiExtKt.toPx(22);
    private static final int sideBlockWidth = UiExtKt.toPx(78);
    private static final int centerBlockWidth = UiExtKt.toPx(92);
    private static final int dp375 = UiExtKt.toPx(375);

    public MorkovskTabbarMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.screenSize = k.b(new MorkovskTabbarMapper$screenSize$2(this));
        this.sideBlockWidthForSmallScreen = k.b(new MorkovskTabbarMapper$sideBlockWidthForSmallScreen$2(this));
        this.centerBlockWidthForSmallScreen = k.b(new MorkovskTabbarMapper$centerBlockWidthForSmallScreen$2(this));
        this.isSmallScreen = k.b(new MorkovskTabbarMapper$isSmallScreen$2(this));
    }

    private final int getBlockWidth(boolean isSide) {
        return (isSide && isSmallScreen()) ? getSideBlockWidthForSmallScreen() : (isSide || !isSmallScreen()) ? (!isSide || isSmallScreen()) ? centerBlockWidth : sideBlockWidth : getCenterBlockWidthForSmallScreen();
    }

    private final int getCenterBlockWidthForSmallScreen() {
        return ((Number) this.centerBlockWidthForSmallScreen.getValue()).intValue();
    }

    private final int getImageHeight(int blockWidth, boolean isSide) {
        return C6915b.b(blockWidth * (isSide ? 0.91d : 1.304d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getScreenSize() {
        return ((Number) this.screenSize.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSideBlockWidthForSmallScreen() {
        return ((Number) this.sideBlockWidthForSmallScreen.getValue()).intValue();
    }

    private final Long mapToMillis(Integer seconds) {
        if (seconds == null || seconds.intValue() <= 0) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(seconds.intValue()));
    }

    private final MorkovskTabbarVO toVO(MorkovskTabbarDTO morkovskTabbarDTO, long j11) {
        Long mapToMillis = mapToMillis(morkovskTabbarDTO.getAnimationTime());
        List<MorkovskTabbarDTO.MorkovskTabItemDTO> tabs = morkovskTabbarDTO.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it = tabs.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                long j12 = j11;
                List<String> bgGradientColors = morkovskTabbarDTO.getBgGradientColors();
                Map<String, TokenizedTrackingInfo> trackingInfo = morkovskTabbarDTO.getTrackingInfo();
                return new MorkovskTabbarVO(j12, arrayList, bgGradientColors, mapToMillis, true, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j12), null, 2, null) : null);
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            long j13 = j11;
            Long l11 = mapToMillis;
            mapToMillis = l11;
            arrayList.add(toVO((MorkovskTabbarDTO.MorkovskTabItemDTO) next, j13, i11, morkovskTabbarDTO.getTabs().size(), l11));
            j11 = j13;
            i11 = i12;
        }
    }

    public final boolean isSmallScreen() {
        return ((Boolean) this.isSmallScreen.getValue()).booleanValue();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MorkovskTabbarVO> invoke(@NotNull MorkovskTabbarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final MorkovskTabbarVO.MorkovskTabItemVO toVO(MorkovskTabbarDTO.MorkovskTabItemDTO morkovskTabItemDTO, long j11, int i11, int i12, Long l11) {
        boolean z11 = true;
        if (i11 != 0 && i11 != i12 - 1) {
            z11 = false;
        }
        boolean z12 = z11;
        int blockWidth = getBlockWidth(z12);
        String title = morkovskTabItemDTO.getTitle();
        String imageUrl = morkovskTabItemDTO.getImageUrl();
        String backgroundImage = morkovskTabItemDTO.getBackgroundImage();
        IndicatorAtomDTO indicator = morkovskTabItemDTO.getIndicator();
        int sideBlockWidthForSmallScreen = isSmallScreen() ? getSideBlockWidthForSmallScreen() : sideBlockWidth;
        int imageHeight = getImageHeight(blockWidth, z12);
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(morkovskTabItemDTO.getAction(), morkovskTabItemDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = morkovskTabItemDTO.getTrackingInfo();
        return new MorkovskTabbarVO.MorkovskTabItemVO(title, imageUrl, backgroundImage, blockWidth, sideBlockWidthForSmallScreen, imageHeight, z12, indicator, l11, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}

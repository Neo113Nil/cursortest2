package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core;

import Sc.o;
import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.data.MorkovskTabbarDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u000eB\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/core/MorkovskTabbarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;Ll20/d;)Ljava/util/List;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarMapper implements Function2<MorkovskTabbarDTO, d, List<? extends MorkovskTabbarVI>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/core/MorkovskTabbarMapper$Companion;", "", "<init>", "()V", "TABS_LIMIT", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MorkovskTabbarDTO.IndicatorStyle.values().length];
            try {
                iArr[MorkovskTabbarDTO.IndicatorStyle.INDICATOR_STYLE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MorkovskTabbarDTO.IndicatorStyle.INDICATOR_STYLE_PIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MorkovskTabbarDTO.IndicatorStyle.INDICATOR_STYLE_BADGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<MorkovskTabbarVI> invoke(@NotNull MorkovskTabbarDTO state, @NotNull d widgetInfo) {
        MorkovskTabbarVI.Tab.Indicator indicator;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        int size = 4 - state.getTabs().size();
        if (size < 0) {
            size = 0;
        }
        List<MorkovskTabbarDTO.Tab> tabs = state.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        for (MorkovskTabbarDTO.Tab tab : tabs) {
            String title = tab.getTitle();
            String imagePath = tab.getImagePath();
            t tVar = null;
            if (tab.getIndicator() != null && tab.getIndicatorStyle() != null) {
                MorkovskTabbarDTO.IndicatorStyle indicatorStyle = tab.getIndicatorStyle();
                int i11 = indicatorStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[indicatorStyle.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        indicator = new MorkovskTabbarVI.Tab.Indicator.Pin(tab.getIndicator().getBgImage());
                    } else {
                        if (i11 != 3) {
                            throw new o();
                        }
                        indicator = new MorkovskTabbarVI.Tab.Indicator.Badge(tab.getIndicator().getBgImage());
                    }
                    float f7 = tab.isBigItem() ? 1.0f + size : 1.0f;
                    MorkovskTabbarVI.Tab.Layout layout = !tab.isBigItem() ? MorkovskTabbarVI.Tab.Layout.Horizontal : MorkovskTabbarVI.Tab.Layout.Vertical;
                    AtomAction atomAction = AtomActionMapperKt.toAtomAction(tab.getAction(), null);
                    trackingInfo = tab.getTrackingInfo();
                    if (trackingInfo == null) {
                        tVar = x.d(trackingInfo, widgetInfo);
                    }
                    arrayList.add(new MorkovskTabbarVI.Tab(title, imagePath, indicator, f7, layout, atomAction, tVar, tab.getTestInfo()));
                }
            }
            indicator = null;
            if (tab.isBigItem()) {
            }
            if (!tab.isBigItem()) {
            }
            AtomAction atomAction2 = AtomActionMapperKt.toAtomAction(tab.getAction(), null);
            trackingInfo = tab.getTrackingInfo();
            if (trackingInfo == null) {
            }
            arrayList.add(new MorkovskTabbarVI.Tab(title, imagePath, indicator, f7, layout, atomAction2, tVar, tab.getTestInfo()));
        }
        return C7714v.a0(new MorkovskTabbarVI(hashCode, arrayList));
    }
}

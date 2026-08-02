package ru.ozon.app.android.commonwidgets.widgets.curtainSettings.core;

import Ih.a;
import Sc.o;
import WZ.t;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.data.CurtainSettingsDTO;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.di.CurtainSettingsComponent;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.presentation.CurtainSettingsVO;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.presentation.CurtainSettingsViewHolder;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00020!j\b\u0012\u0004\u0012\u00020\u0002`\"2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/core/CurtainSettingsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/di/CurtainSettingsComponent;", "Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO;", "Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/presentation/CurtainSettingsVO;", "<init>", "()V", "Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO$HeightMode;", "", "toBottomSheetBehavior", "(Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO$HeightMode;)I", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/presentation/CurtainSettingsVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainSettingsViewMapper extends OverlayWidgetScreenViewItemMapper2<CurtainSettingsComponent, CurtainSettingsDTO, CurtainSettingsVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurtainSettingsDTO.HeightMode.values().length];
            try {
                iArr[CurtainSettingsDTO.HeightMode.HALF_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurtainSettingsDTO.HeightMode.HUG_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurtainSettingsDTO.HeightMode.FULL_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int toBottomSheetBehavior(CurtainSettingsDTO.HeightMode heightMode) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[heightMode.ordinal()];
        if (i11 == 1) {
            return 6;
        }
        if (i11 == 2 || i11 == 3) {
            return 3;
        }
        throw new o();
    }

    private final CurtainSettingsVO toVO(CurtainSettingsDTO curtainSettingsDTO, String str) {
        long j11;
        long a11 = a.a("CurtainV2", str);
        Boolean showCloseButton = curtainSettingsDTO.getShowCloseButton();
        boolean booleanValue = showCloseButton != null ? showCloseButton.booleanValue() : false;
        Boolean scrollableContent = curtainSettingsDTO.getScrollableContent();
        boolean booleanValue2 = scrollableContent != null ? scrollableContent.booleanValue() : false;
        String containerBackgroundColor = curtainSettingsDTO.getContainerBackgroundColor();
        Boolean allowResizeByGesture = curtainSettingsDTO.getAllowResizeByGesture();
        boolean booleanValue3 = allowResizeByGesture != null ? allowResizeByGesture.booleanValue() : false;
        Boolean hideToungle = curtainSettingsDTO.getHideToungle();
        boolean z11 = hideToungle == null || !hideToungle.booleanValue();
        int bottomSheetBehavior = toBottomSheetBehavior(curtainSettingsDTO.getHeightMode());
        boolean z12 = curtainSettingsDTO.getHeightMode() == CurtainSettingsDTO.HeightMode.HUG_CONTENT;
        Integer minHeight = curtainSettingsDTO.getMinHeight();
        boolean z13 = !curtainSettingsDTO.getDisableCloseByGestures();
        AtomActionDTO onCloseAction = curtainSettingsDTO.getOnCloseAction();
        t tVar = null;
        AtomAction atomAction = onCloseAction != null ? AtomActionMapperKt.toAtomAction(onCloseAction, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = curtainSettingsDTO.getTrackingInfo();
        if (trackingInfo != null) {
            j11 = a11;
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null);
        } else {
            j11 = a11;
        }
        return new CurtainSettingsVO(j11, booleanValue, booleanValue2, containerBackgroundColor, curtainSettingsDTO.getCloseButtonBgColor(), curtainSettingsDTO.getCloseButtonIconColor(), booleanValue3, z11, minHeight, bottomSheetBehavior, z12, z13, atomAction, tVar);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CurtainSettingsDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CurtainSettingsVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new CurtainSettingsViewHolder(container, component().getTokenizedAnalytics(), component().getCustomActionHandlersStoreFactory());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CurtainSettingsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CurtainSettingsComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CurtainSettingsVO> map(@NotNull CurtainSettingsDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info.d()));
    }
}

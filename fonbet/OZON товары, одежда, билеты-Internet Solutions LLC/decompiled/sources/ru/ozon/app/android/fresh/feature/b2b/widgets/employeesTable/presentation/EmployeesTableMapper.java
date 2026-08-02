package ru.ozon.app.android.fresh.feature.b2b.widgets.employeesTable.presentation;

import WZ.t;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.employeesTable.data.EmployeesTableDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.employeesTable.domain.EmployeesTableVO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/presentation/EmployeesTableMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$ButtonsDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$ButtonsVO;", "toVO", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$ButtonsDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$ButtonsVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$SettingsDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$SettingsVO;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$SettingsDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$SettingsVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO;Ll20/d;)Ljava/util/List;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmployeesTableMapper implements Function2<EmployeesTableDTO, d, List<? extends EmployeesTableVO>> {

    @NotNull
    private static final Paddings defaultBottomPadding;

    @NotNull
    private static final Paddings defaultLeftPadding;

    @NotNull
    private static final Paddings defaultRightPadding;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Paddings defaultTopPadding = Paddings.PADDING_200;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/presentation/EmployeesTableMapper$Companion;", "", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Paddings paddings = Paddings.PADDING_500;
        defaultBottomPadding = paddings;
        defaultLeftPadding = paddings;
        defaultRightPadding = paddings;
    }

    private final EmployeesTableVO.ButtonsVO toVO(EmployeesTableDTO.ButtonsDTO buttonsDTO) {
        EmployeesTableVO.SettingsVO settingsVO;
        EmployeesTableDTO.SettingsDTO settings = buttonsDTO.getSettings();
        if (settings == null || (settingsVO = toVO(settings)) == null) {
            settingsVO = new EmployeesTableVO.SettingsVO(defaultTopPadding, defaultBottomPadding, defaultLeftPadding, defaultRightPadding, false);
        }
        return new EmployeesTableVO.ButtonsVO(settingsVO, buttonsDTO.getButtons());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EmployeesTableVO> invoke(@NotNull EmployeesTableDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<EmployeesTableDTO.ItemDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (EmployeesTableDTO.ItemDTO itemDTO : items) {
            long hashCode = itemDTO.getId().hashCode();
            String id2 = itemDTO.getId();
            CellDTO cell = itemDTO.getCell();
            List<CellDTO> cells = itemDTO.getCells();
            EmployeesTableDTO.ButtonsDTO buttons = itemDTO.getButtons();
            t tVar = null;
            EmployeesTableVO.ButtonsVO vo = buttons != null ? toVO(buttons) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            }
            arrayList.add(new EmployeesTableVO(hashCode, id2, cell, cells, vo, tVar));
        }
        return arrayList;
    }

    private final EmployeesTableVO.SettingsVO toVO(EmployeesTableDTO.SettingsDTO settingsDTO) {
        Paddings topPadding = settingsDTO.getTopPadding();
        if (topPadding == null) {
            topPadding = defaultTopPadding;
        }
        Paddings bottomPadding = settingsDTO.getBottomPadding();
        if (bottomPadding == null) {
            bottomPadding = defaultBottomPadding;
        }
        Paddings leftPadding = settingsDTO.getLeftPadding();
        if (leftPadding == null) {
            leftPadding = defaultLeftPadding;
        }
        Paddings rightPadding = settingsDTO.getRightPadding();
        if (rightPadding == null) {
            rightPadding = defaultRightPadding;
        }
        Boolean disableSeparator = settingsDTO.getDisableSeparator();
        return new EmployeesTableVO.SettingsVO(topPadding, bottomPadding, leftPadding, rightPadding, disableSeparator != null ? disableSeparator.booleanValue() : false);
    }
}

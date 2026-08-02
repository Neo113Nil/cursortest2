package ru.ozon.app.android.marketing.widgets.ladderActions.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.ladderActions.data.LadderActionsDTO;
import ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO;Ll20/d;)Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LadderActionsMapper implements Function2<LadderActionsDTO, d, List<? extends LadderActionsVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsMapper$Companion;", "", "<init>", "()V", "SKU_ID", "", "QUANTITY", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<LadderActionsVO> invoke(@NotNull LadderActionsDTO state, @NotNull d widgetInfo) {
        Map<String, String> params;
        String str;
        Map<String, String> params2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String backgroundColor = state.getBackgroundColor();
        String cellSeparatorColor = state.getCellSeparatorColor();
        List<LadderActionsDTO.LadderActionsCellDTO> cells = state.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        Iterator<T> it = cells.iterator();
        while (true) {
            r8 = null;
            r8 = null;
            Integer num = null;
            if (!it.hasNext()) {
                break;
            }
            LadderActionsDTO.LadderActionsCellDTO ladderActionsCellDTO = (LadderActionsDTO.LadderActionsCellDTO) it.next();
            CommonControlSettings common = ladderActionsCellDTO.getDefaultButton().getCommon();
            AtomActionDTO action = common != null ? common.getAction() : null;
            String str2 = (action == null || (params2 = action.getParams()) == null) ? null : params2.get("id");
            if (action != null && (params = action.getParams()) != null && (str = params.get("quantity")) != null) {
                num = h.w0(str);
            }
            arrayList.add(new LadderActionsVO.LadderActionsCellVO(str2, num, ladderActionsCellDTO.getPrimaryPrice(), ladderActionsCellDTO.getSecondaryPrice(), ladderActionsCellDTO.getDefaultButton(), ladderActionsCellDTO.getActiveButton(), ladderActionsCellDTO.isActive()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new LadderActionsVO(hashCode, backgroundColor, cellSeparatorColor, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}

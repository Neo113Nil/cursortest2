package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row;

import java.util.Map;
import kotlin.Metadata;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3DTO;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3ItemVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002¨\u0006\t"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Data;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Data;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Settings;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Settings;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationSliderV3RowMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationSliderV3ItemVO.Data toVO(NavigationSliderV3DTO.Item.Data data, Map<String, TokenizedTrackingInfo> map) {
        TextAtom title = data.getTitle();
        String backgroundColor = data.getBackgroundColor();
        String image = data.getImage();
        AtomActionDTO action = data.getAction();
        return new NavigationSliderV3ItemVO.Data(title, backgroundColor, image, action != null ? AtomActionMapperKt.toAtomAction(action, map) : null, data.getAdvBadgeV2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationSliderV3ItemVO.Settings toVO(NavigationSliderV3DTO.Item.Settings settings) {
        return new NavigationSliderV3ItemVO.Settings(settings.getRightIndent(), NavigationSliderV3ItemVO.PositionType.INSTANCE.fromValue(settings.getPosition().name()));
    }
}

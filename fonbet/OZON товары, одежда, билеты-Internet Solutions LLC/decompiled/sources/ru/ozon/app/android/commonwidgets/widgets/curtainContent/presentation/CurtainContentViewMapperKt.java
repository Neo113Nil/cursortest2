package ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation;

import java.util.List;
import kotlin.Metadata;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.data.CurtainContentDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"isValid", "", "Lru/ozon/app/android/commonwidgets/widgets/curtainContent/data/CurtainContentDTO;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CurtainContentViewMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValid(CurtainContentDTO curtainContentDTO) {
        if (curtainContentDTO.getImage() != null) {
            return true;
        }
        List<TextDTO> titles = curtainContentDTO.getTitles();
        if (titles != null && !titles.isEmpty()) {
            return true;
        }
        List<ButtonV3DTO> buttons = curtainContentDTO.getButtons();
        return (buttons == null || buttons.isEmpty()) ? false : true;
    }
}

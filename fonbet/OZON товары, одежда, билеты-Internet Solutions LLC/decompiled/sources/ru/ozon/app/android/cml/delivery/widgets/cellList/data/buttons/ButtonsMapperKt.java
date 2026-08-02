package ru.ozon.app.android.cml.delivery.widgets.cellList.data.buttons;

import Tc.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"copyWithParams", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "key", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonsMapperKt {
    @NotNull
    public static final ButtonV3DTO copyWithParams(@NotNull ButtonV3DTO buttonV3DTO, @NotNull String key, @NotNull String value) {
        AtomActionDTO action;
        AtomActionDTO action2;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(buttonV3DTO, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        CommonControlSettings common = buttonV3DTO.getCommon();
        CommonControlSettings commonControlSettings = null;
        r2 = null;
        AtomActionDTO atomActionDTO = null;
        if (common != null) {
            CommonControlSettings common2 = buttonV3DTO.getCommon();
            if (common2 != null && (action = common2.getAction()) != null) {
                d builder = new d();
                CommonControlSettings common3 = buttonV3DTO.getCommon();
                if (common3 != null && (action2 = common3.getAction()) != null && (params = action2.getParams()) != null) {
                    builder.putAll(params);
                }
                builder.put(key, value);
                Unit unit = Unit.f71690a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                atomActionDTO = AtomActionDTO.copy$default(action, null, null, null, builder.u(), null, 23, null);
            }
            commonControlSettings = CommonControlSettings.copy$default(common, atomActionDTO, null, null, 6, null);
        }
        return ButtonV3DTO.copy$default(buttonV3DTO, null, null, null, null, null, null, null, null, null, null, null, null, null, commonControlSettings, null, null, null, 122879, null);
    }
}

package ru.ozon.app.android.account.orders.recipientWidget.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/data/RecipientMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/recipientWidget/data/RecipientDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/recipientWidget/data/RecipientDTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RecipientMapper implements Function2<RecipientDTO, d, List<? extends RecipientVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RecipientVO> invoke(@NotNull RecipientDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String namePlaceholder = state.getNamePlaceholder();
        String nameValue = state.getNameValue();
        if (nameValue == null) {
            nameValue = "";
        }
        RecipientVO.TextInput textInput = new RecipientVO.TextInput(namePlaceholder, nameValue);
        String phonePlaceholder = state.getPhonePlaceholder();
        String phoneValue = state.getPhoneValue();
        return C7714v.a0(new RecipientVO(hashCode, textInput, new RecipientVO.TextInput(phonePlaceholder, phoneValue != null ? phoneValue : ""), state.getRegularId(), state.getOrderNumber(), new ButtonV3DTO(null, ButtonV3DTO.Sizes.SIZE_600, state.getSaveButtonTitle(), null, null, null, Boolean.TRUE, null, null, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, state.getRegularId(), null, 10, null), state.getTrackingInfo(), null, 4, null), null, null, null, null, 253881, null)));
    }
}

package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import Vg.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.session.userAdultModalMobileV2.data.models.UserAdultModalV2DTO;
import ru.ozon.app.android.session.userAdultModalMobileV2.di.IUserAdultContentComponent;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;
import ru.ozon.composer.compose.widget.overlay.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ComposeAdultConfirmationViewHolderKt$adultWidget$1$4$defaultActionHandlers$2 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ e<UserAdultModalV2DTO, UserAdultModalV2VO> $this_overlayViewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeAdultConfirmationViewHolderKt$adultWidget$1$4$defaultActionHandlers$2(e<UserAdultModalV2DTO, UserAdultModalV2VO> eVar) {
        super(0);
        this.$this_overlayViewMapper = eVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return ((IUserAdultContentComponent) this.$this_overlayViewMapper.getWidgetComponentStorage().getComponent(IUserAdultContentComponent.class)).getDefaultActionHandlers();
    }
}

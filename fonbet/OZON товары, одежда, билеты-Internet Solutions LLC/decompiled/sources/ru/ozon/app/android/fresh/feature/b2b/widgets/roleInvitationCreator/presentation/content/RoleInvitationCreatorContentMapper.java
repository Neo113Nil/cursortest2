package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.data.RoleInvitationCreatorDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.RoleInvitationCreatorContentVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u0011*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/content/RoleInvitationCreatorContentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Field;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Field;", "toVo", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Field;)Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Field;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Input;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Input;)Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Size;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Size;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Size;)Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Size;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RoleInvitationCreatorContentMapper implements Function2<RoleInvitationCreatorDTO, d, List<? extends RoleInvitationCreatorContentVO>> {
    private final RoleInvitationCreatorContentVO.Field toVo(RoleInvitationCreatorDTO.Field field) {
        RoleInvitationCreatorDTO.Input input = field.getInput();
        return new RoleInvitationCreatorContentVO.Field(input != null ? toVo(input) : null, field.getDeleteInputButton(), field.getAddInputButton(), field.getMaxEmailCount(), field.getLexemes());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RoleInvitationCreatorContentVO> invoke(@NotNull RoleInvitationCreatorDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        RoleInvitationCreatorContentVO.Field vo = toVo(state.getField());
        TextDTO agreement = state.getAgreement();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new RoleInvitationCreatorContentVO(hashCode, title, subtitle, vo, agreement, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null));
    }

    private final RoleInvitationCreatorContentVO.Input toVo(RoleInvitationCreatorDTO.Input input) {
        return new RoleInvitationCreatorContentVO.Input(input.getValue(), input.getPlaceholder(), input.getCaption(), toVo(input.getSize()));
    }

    private final RoleInvitationCreatorContentVO.Size toVo(RoleInvitationCreatorDTO.Size size) {
        if (size == RoleInvitationCreatorDTO.Size.SIZE_500) {
            return RoleInvitationCreatorContentVO.Size.SIZE_500;
        }
        return RoleInvitationCreatorContentVO.Size.SIZE_600;
    }
}

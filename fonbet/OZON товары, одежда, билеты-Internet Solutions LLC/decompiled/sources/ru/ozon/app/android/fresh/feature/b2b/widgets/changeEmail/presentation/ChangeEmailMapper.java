package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.data.ChangeEmailDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailVO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ChangeEmailInputDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$ChangeEmailInputVO;", "toVO", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$ChangeEmailInputDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$ChangeEmailInputVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$InputDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$InputVO;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO$InputDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$InputVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/data/ChangeEmailDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeEmailMapper implements Function2<ChangeEmailDTO, d, List<? extends ChangeEmailVO>> {
    private final ChangeEmailVO.ChangeEmailInputVO toVO(ChangeEmailDTO.ChangeEmailInputDTO changeEmailInputDTO) {
        return new ChangeEmailVO.ChangeEmailInputVO(changeEmailInputDTO.getTitle(), changeEmailInputDTO.getCommon());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ChangeEmailVO> invoke(@NotNull ChangeEmailDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String state2 = state.getState();
        ChangeEmailDTO.ChangeEmailInputDTO changeEmail = state.getChangeEmail();
        ChangeEmailVO.ChangeEmailInputVO vo = changeEmail != null ? toVO(changeEmail) : null;
        List<ChangeEmailDTO.InputDTO> inputs = state.getInputs();
        if (inputs == null) {
            inputs = K.f71697a;
        }
        List<ChangeEmailDTO.InputDTO> list = inputs;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((ChangeEmailDTO.InputDTO) it.next()));
        }
        CellDTO cell = state.getCell();
        List<ChangeEmailDTO.ButtonDTO> buttons = state.getButtons();
        if (buttons == null) {
            buttons = K.f71697a;
        }
        ArrayList I11 = C7714v.I(buttons);
        ArrayList arrayList2 = new ArrayList(C7714v.z(I11, 10));
        Iterator it2 = I11.iterator();
        while (it2.hasNext()) {
            ChangeEmailDTO.ButtonDTO buttonDTO = (ChangeEmailDTO.ButtonDTO) it2.next();
            arrayList2.add(new ChangeEmailVO.ButtonVO(buttonDTO.getButton(), buttonDTO.getTimer()));
        }
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ChangeEmailVO(hashCode, state2, vo, arrayList, cell, arrayList2, title, subtitle, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null));
    }

    private final ChangeEmailVO.InputVO toVO(ChangeEmailDTO.InputDTO inputDTO) {
        return new ChangeEmailVO.InputVO(inputDTO.getName(), inputDTO.getValue(), inputDTO.getPlaceholder(), inputDTO.getRequired(), inputDTO.getCommon(), inputDTO.getMaskOtp(), inputDTO.getLexemes());
    }
}

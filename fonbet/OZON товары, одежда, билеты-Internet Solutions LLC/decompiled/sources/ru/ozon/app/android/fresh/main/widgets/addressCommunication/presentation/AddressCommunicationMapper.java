package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.data.AddressCommunicationDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/AddressCommunicationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVo", "(Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/AddressCommunicationDTO;J)Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/AddressCommunicationDTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressCommunicationMapper implements Function2<AddressCommunicationDTO, d, List<? extends AddressCommunicationVO>> {
    private final AddressCommunicationVO toVo(AddressCommunicationDTO addressCommunicationDTO, long j11) {
        TextAtom title = addressCommunicationDTO.getTitle();
        TextAtom subtitle = addressCommunicationDTO.getSubtitle();
        ButtonV3Atom.SmallButton noButton = addressCommunicationDTO.getNoButton();
        ButtonV3Atom.SmallButton yesButton = addressCommunicationDTO.getYesButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = addressCommunicationDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = addressCommunicationDTO.getNoButton().getTrackingInfo();
        return new AddressCommunicationVO(j11, title, subtitle, noButton, yesButton, tokenizedEvent$default, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressCommunicationVO> invoke(@NotNull AddressCommunicationDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, ExtentionsKt.getId(widgetInfo)));
    }
}

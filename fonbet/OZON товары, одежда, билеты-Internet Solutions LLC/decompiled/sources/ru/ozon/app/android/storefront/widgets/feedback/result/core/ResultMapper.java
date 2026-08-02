package ru.ozon.app.android.storefront.widgets.feedback.result.core;

import java.util.ArrayList;
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
import ru.ozon.app.android.composer.widgets.base.config.ParseException;
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarVO;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model.ResultServiceCell;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model.ResultVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/core/ResultMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$ServiceBody;", "body", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell;", "mapServices", "(Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO;Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$ServiceBody;)Ljava/util/List;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultMapper implements Function2<ResultDTO, d, List<? extends ResultVO>> {
    private final List<ResultServiceCell> mapServices(ResultDTO state, ResultDTO.ServiceBody body) {
        List b02 = C7714v.b0(new ResultServiceCell.ServiceCellText(state.getTitle().hashCode(), state.getTitle()), new ResultServiceCell.ServiceCellText(state.getTitle().hashCode(), state.getSubtitle()));
        List<ResultDTO.Service> services = body.getServices();
        ArrayList arrayList = new ArrayList(C7714v.z(services, 10));
        for (ResultDTO.Service service : services) {
            arrayList.add(new ResultServiceCell.ServiceCellImage(service.getImageUrl().hashCode(), service.getImageUrl(), AtomActionMapperKt.toAtomAction(service.getAction(), state.getTrackingInfo())));
        }
        return C7714v.p0(arrayList, b02);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ResultVO> invoke(@NotNull ResultDTO state, @NotNull d widgetInfo) {
        List<ResultServiceCell> mapServices;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String c11 = widgetInfo.c().c();
        long hashCode = c11 != null ? c11.hashCode() : 0;
        TextAtom title = state.getNavbar().getTitle();
        Integer maxLines = state.getNavbar().getTitle().getMaxLines();
        TextAtom copy$default = TextAtom.copy$default(title, null, null, null, Integer.valueOf(maxLines != null ? maxLines.intValue() : 1), null, null, null, 119, null);
        ButtonV3Atom.SmallIconButton closeButton = state.getNavbar().getCloseButton();
        AtomActionDTO action2 = state.getNavbar().getCloseButton().getAction();
        FeedbackNavbarVO feedbackNavbarVO = new FeedbackNavbarVO(hashCode, null, copy$default, closeButton, action2 != null ? AtomActionMapperKt.toAtomAction(action2, state.getTrackingInfo()) : null);
        Object body = state.getBody();
        if (body instanceof ResultDTO.ImageBody) {
            mapServices = C7714v.a0(new ResultServiceCell.ImageBody(state.getTitle().hashCode(), state.getTitle(), state.getSubtitle(), ((ResultDTO.ImageBody) body).getImageUrl()));
        } else {
            if (!(body instanceof ResultDTO.ServiceBody)) {
                throw new ParseException("Body type must be \"imageBody\" or \"services\"");
            }
            mapServices = mapServices(state, (ResultDTO.ServiceBody) body);
        }
        List<ResultServiceCell> list = mapServices;
        ButtonV3Atom.SmallIconButton closeButton2 = feedbackNavbarVO.getCloseButton();
        AtomAction atomAction = (closeButton2 == null || (action = closeButton2.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, closeButton2.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ResultVO(hashCode, feedbackNavbarVO, list, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}

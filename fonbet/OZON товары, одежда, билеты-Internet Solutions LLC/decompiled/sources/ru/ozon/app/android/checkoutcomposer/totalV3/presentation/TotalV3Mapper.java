package ru.ozon.app.android.checkoutcomposer.totalV3.presentation;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.totalV3.data.TotalV3DTO;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.TotalV3VO;
import ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarDTO;
import ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\n\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u0013\u0010\n\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\n\u0010\u0011J\u0013\u0010\n\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\n\u0010\u0014J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "info", "toVO", "(Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveActionsDTO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveActionsVO;", "(Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveActionsDTO;)Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveActionsVO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$HintDTO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$HintVO;", "(Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$HintDTO;)Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$HintVO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveSummaryDTO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveSummaryVO;", "(Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveSummaryDTO;)Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveSummaryVO;", "state", "invoke", "(Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO;Ll20/d;)Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalV3Mapper implements Function2<TotalV3DTO, d, List<? extends TotalV3VO>> {
    private final TotalV3VO toVO(TotalV3DTO totalV3DTO, d dVar) {
        long hashCode = dVar.hashCode();
        TotalV3VO.InteractiveActionsVO vo = toVO(totalV3DTO.getInteractiveActions());
        Map<String, TokenizedTrackingInfo> trackingInfo = totalV3DTO.getTrackingInfo();
        t d11 = trackingInfo != null ? x.d(trackingInfo, dVar) : null;
        ProgressBarDTO progressBar = totalV3DTO.getProgressBar();
        return new TotalV3VO(hashCode, vo, progressBar != null ? ProgressBarMapperKt.toVO(progressBar, dVar) : null, d11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TotalV3VO> invoke(@NotNull TotalV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info));
    }

    private final TotalV3VO.InteractiveActionsVO toVO(TotalV3DTO.InteractiveActionsDTO interactiveActionsDTO) {
        ArrayList arrayList;
        ButtonV3DTO button = interactiveActionsDTO.getButton();
        List<TotalV3DTO.HintDTO> hints = interactiveActionsDTO.getHints();
        ArrayList arrayList2 = null;
        if (hints != null) {
            List<TotalV3DTO.HintDTO> list = hints;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((TotalV3DTO.HintDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<TotalV3DTO.InteractiveSummaryDTO> interactiveSummary = interactiveActionsDTO.getInteractiveSummary();
        if (interactiveSummary != null) {
            List<TotalV3DTO.InteractiveSummaryDTO> list2 = interactiveSummary;
            arrayList2 = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(toVO((TotalV3DTO.InteractiveSummaryDTO) it2.next()));
            }
        }
        return new TotalV3VO.InteractiveActionsVO(button, arrayList, arrayList2);
    }

    private final TotalV3VO.HintVO toVO(TotalV3DTO.HintDTO hintDTO) {
        TextDTO message = hintDTO.getMessage();
        if (message != null) {
            message.setTagSupported(true);
        } else {
            message = null;
        }
        return new TotalV3VO.HintVO(message);
    }

    private final TotalV3VO.InteractiveSummaryVO toVO(TotalV3DTO.InteractiveSummaryDTO interactiveSummaryDTO) {
        return new TotalV3VO.InteractiveSummaryVO(interactiveSummaryDTO.getTitle(), interactiveSummaryDTO.getSubtitle(), interactiveSummaryDTO.getIcon(), interactiveSummaryDTO.getInfo(), interactiveSummaryDTO.getBackgroundColor(), interactiveSummaryDTO.getCommon());
    }
}

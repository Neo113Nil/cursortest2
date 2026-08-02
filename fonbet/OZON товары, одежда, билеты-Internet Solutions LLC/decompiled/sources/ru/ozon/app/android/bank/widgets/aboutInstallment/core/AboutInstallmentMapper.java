package ru.ozon.app.android.bank.widgets.aboutInstallment.core;

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
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.bank.widgets.aboutInstallment.data.AboutInstallmentDTO;
import ru.ozon.app.android.bank.widgets.aboutInstallment.presentation.AboutInstallmentVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/bank/widgets/aboutInstallment/core/AboutInstallmentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/bank/widgets/aboutInstallment/data/AboutInstallmentDTO;", "Ll20/d;", "", "Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/bank/widgets/aboutInstallment/data/AboutInstallmentDTO$Item;", "", "Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO$ItemVO;", "convertToVO", "(Ljava/util/List;)Ljava/util/List;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/bank/widgets/aboutInstallment/data/AboutInstallmentDTO;Ll20/d;)Ljava/util/List;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AboutInstallmentMapper implements Function2<AboutInstallmentDTO, d, List<? extends AboutInstallmentVO>> {
    private final List<AboutInstallmentVO.ItemVO> convertToVO(List<AboutInstallmentDTO.Item> list) {
        ArrayList arrayList = new ArrayList();
        for (AboutInstallmentDTO.Item item : list) {
            arrayList.add(new AboutInstallmentVO.ItemVO(item.getText(), item.getImage()));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AboutInstallmentVO> invoke(@NotNull AboutInstallmentDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = dto.hashCode();
        TextAtom title = dto.getTitle();
        TextAtom subTitle = dto.getSubTitle();
        DisclosureAtom moreDisclosure = dto.getMoreDisclosure();
        List<AboutInstallmentVO.ItemVO> convertToVO = convertToVO(dto.getItems());
        AtomActionDTO action = dto.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, dto.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new AboutInstallmentVO(hashCode, title, subTitle, moreDisclosure, convertToVO, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}

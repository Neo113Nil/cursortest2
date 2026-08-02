package ru.ozon.app.android.pdp.widgets.sellerSimple.core;

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
import ru.ozon.app.android.pdp.widgets.sellerSimple.data.SellerSimpleDto;
import ru.ozon.app.android.pdp.widgets.sellerSimple.presentation.SellerSimpleVo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerSimple/core/SellerSimpleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/sellerSimple/data/SellerSimpleDto;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/sellerSimple/presentation/SellerSimpleVo;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/pdp/widgets/sellerSimple/data/SellerSimpleDto;J)Lru/ozon/app/android/pdp/widgets/sellerSimple/presentation/SellerSimpleVo;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/sellerSimple/data/SellerSimpleDto;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerSimpleMapper implements Function2<SellerSimpleDto, d, List<? extends SellerSimpleVo>> {
    private final SellerSimpleVo toVo(SellerSimpleDto sellerSimpleDto, long j11) {
        TextAtom personType = sellerSimpleDto.getPersonType();
        TextDTO dsTextAtom = personType != null ? TextMapperKt.getDsTextAtom(personType) : null;
        TextAtom sellerName = sellerSimpleDto.getSellerName();
        TextDTO dsTextAtom2 = sellerName != null ? TextMapperKt.getDsTextAtom(sellerName) : null;
        TextAtom dateText = sellerSimpleDto.getDateText();
        TextDTO dsTextAtom3 = dateText != null ? TextMapperKt.getDsTextAtom(dateText) : null;
        Avatar avatar = sellerSimpleDto.getAvatar();
        AtomActionDTO action = sellerSimpleDto.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, sellerSimpleDto.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = sellerSimpleDto.getTrackingInfo();
        return new SellerSimpleVo(j11, dsTextAtom, dsTextAtom2, dsTextAtom3, avatar, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SellerSimpleVo> invoke(@NotNull SellerSimpleDto state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}

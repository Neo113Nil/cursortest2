package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.pack;

import WZ.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack.AspectsCompactPackVariantV2VO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTOKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "variants", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsCompactV2PackMapper$invoke$1 extends AbstractC7737t implements Function1<List<? extends AspectsV2DTO.VariantV2>, List<? extends AspectsCompactVO$Variant>> {
    final /* synthetic */ long $id;
    final /* synthetic */ AspectsCompactV2PackMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsCompactV2PackMapper$invoke$1(AspectsCompactV2PackMapper aspectsCompactV2PackMapper, long j11) {
        super(1);
        this.this$0 = aspectsCompactV2PackMapper;
        this.$id = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends AspectsCompactVO$Variant> invoke(List<? extends AspectsV2DTO.VariantV2> list) {
        return invoke2((List<AspectsV2DTO.VariantV2>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[LOOP:1: B:73:0x0026->B:90:?, LOOP_END, SYNTHETIC] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AspectsCompactVO$Variant> invoke2(List<AspectsV2DTO.VariantV2> variants) {
        boolean z11;
        AspectsCompactV2PackMapper$invoke$1 aspectsCompactV2PackMapper$invoke$1;
        boolean z12;
        String str;
        long j11;
        TextDTO textDTO;
        AspectsCompactPackVariantV2VO aspectsCompactPackVariantV2VO;
        String token;
        String str2;
        OzonSpannableString ozonSpannableString;
        t tVar;
        TextDTO textDTO2;
        String token2;
        Intrinsics.checkNotNullParameter(variants, "variants");
        List<AspectsV2DTO.VariantV2> list = variants;
        String str3 = null;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AspectsV2DTO.VariantType variant = ((AspectsV2DTO.VariantV2) it.next()).getVariant();
                AspectsV2DTO.VariantType.Pack pack = variant instanceof AspectsV2DTO.VariantType.Pack ? (AspectsV2DTO.VariantType.Pack) variant : null;
                if (pack != null && pack.getBadge() != null) {
                    Boolean isBadgeTop = pack.isBadgeTop();
                    if (isBadgeTop != null ? isBadgeTop.booleanValue() : false) {
                        z11 = true;
                        if (!z11) {
                            aspectsCompactV2PackMapper$invoke$1 = this;
                            z12 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                }
            }
        }
        aspectsCompactV2PackMapper$invoke$1 = this;
        z12 = false;
        long j12 = aspectsCompactV2PackMapper$invoke$1.$id;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (AspectsV2DTO.VariantV2 variantV2 : list) {
            Object variant2 = variantV2.getVariant();
            Object obj = variant2 instanceof AspectsV2DTO.VariantType.Pack ? (AspectsV2DTO.VariantType.Pack) variant2 : str3;
            if (obj != null) {
                OzonSpannableString ozonSpannableString2 = new OzonSpannableString();
                String refreshDeeplink = variantV2.getRefreshDeeplink();
                boolean isAvailable = AspectsV2DTOKt.isAvailable(variantV2);
                boolean isSelected = AspectsV2DTOKt.isSelected(variantV2);
                AspectsV2DTO.VariantType.Pack pack2 = obj;
                boolean isEnabled = AspectsV2DTOKt.isEnabled(variantV2);
                Map<String, TokenizedTrackingInfo> trackingInfo = variantV2.getTrackingInfo();
                if (trackingInfo != null) {
                    ozonSpannableString = ozonSpannableString2;
                    tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j12), str3, 2, str3);
                    str2 = str3;
                } else {
                    str2 = str3;
                    ozonSpannableString = ozonSpannableString2;
                    tVar = str2;
                }
                j11 = j12;
                str = str2;
                TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(pack2.getTitle(), null, null, null, null, null, null, null, null, AspectsV2DTOKt.isAvailable(variantV2) ? ((AspectsV2DTO.VariantType.Pack) variantV2.getVariant()).getTitle().getTextColor() : UniColors.TEXT_SECONDARY.getToken(), 1, null, false, 3327, null);
                TextAtom subtitle = pack2.getSubtitle();
                if (subtitle != null) {
                    if (AspectsV2DTOKt.isAvailable(variantV2)) {
                        TextAtom subtitle2 = ((AspectsV2DTO.VariantType.Pack) variantV2.getVariant()).getSubtitle();
                        if (subtitle2 == null || (token2 = subtitle2.getTextColor()) == null) {
                            token2 = UniColors.TEXT_SECONDARY.getToken();
                        }
                    } else {
                        token2 = UniColors.TEXT_SECONDARY.getToken();
                    }
                    textDTO2 = TextMapperKt.dsTextAtom$default(subtitle, null, null, null, null, null, null, null, null, token2, 1, null, false, 3327, null);
                } else {
                    textDTO2 = str;
                }
                Badge badge = pack2.getBadge();
                Boolean isBadgeTop2 = pack2.isBadgeTop();
                aspectsCompactPackVariantV2VO = new AspectsCompactPackVariantV2VO(ozonSpannableString, refreshDeeplink, isSelected, isAvailable, isEnabled, tVar, dsTextAtom$default, textDTO2, badge, isBadgeTop2 != null ? isBadgeTop2.booleanValue() : true, z12);
            } else {
                str = str3;
                j11 = j12;
                AspectsV2DTO.VariantType variant3 = variantV2.getVariant();
                Intrinsics.g(variant3, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO.VariantType.Markdown");
                AspectsV2DTO.VariantType.Markdown markdown = (AspectsV2DTO.VariantType.Markdown) variant3;
                OzonSpannableString ozonSpannableString3 = new OzonSpannableString();
                String refreshDeeplink2 = variantV2.getRefreshDeeplink();
                boolean isAvailable2 = AspectsV2DTOKt.isAvailable(variantV2);
                boolean isSelected2 = AspectsV2DTOKt.isSelected(variantV2);
                boolean isEnabled2 = AspectsV2DTOKt.isEnabled(variantV2);
                Map<String, TokenizedTrackingInfo> trackingInfo2 = variantV2.getTrackingInfo();
                t tokenizedEvent$default = trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), str, 2, str) : str;
                TextDTO dsTextAtom$default2 = TextMapperKt.dsTextAtom$default(markdown.getTitle(), null, null, null, null, null, null, null, null, AspectsV2DTOKt.isAvailable(variantV2) ? ((AspectsV2DTO.VariantType.Markdown) variantV2.getVariant()).getTitle().getTextColor() : UniColors.TEXT_SECONDARY.getToken(), 1, null, false, 3327, null);
                TextAtom subtitle3 = markdown.getSubtitle();
                if (subtitle3 != null) {
                    if (AspectsV2DTOKt.isAvailable(variantV2)) {
                        TextAtom subtitle4 = ((AspectsV2DTO.VariantType.Markdown) variantV2.getVariant()).getSubtitle();
                        if (subtitle4 == null || (token = subtitle4.getTextColor()) == null) {
                            token = UniColors.TEXT_SECONDARY.getToken();
                        }
                    } else {
                        token = UniColors.TEXT_SECONDARY.getToken();
                    }
                    textDTO = TextMapperKt.dsTextAtom$default(subtitle3, null, null, null, null, null, null, null, null, token, 1, null, false, 3327, null);
                } else {
                    textDTO = str;
                }
                aspectsCompactPackVariantV2VO = new AspectsCompactPackVariantV2VO(ozonSpannableString3, refreshDeeplink2, isSelected2, isAvailable2, isEnabled2, tokenizedEvent$default, dsTextAtom$default2, textDTO, null, false, false, 1536, null);
            }
            arrayList.add(aspectsCompactPackVariantV2VO);
            str3 = str;
            j12 = j11;
        }
        return arrayList;
    }
}

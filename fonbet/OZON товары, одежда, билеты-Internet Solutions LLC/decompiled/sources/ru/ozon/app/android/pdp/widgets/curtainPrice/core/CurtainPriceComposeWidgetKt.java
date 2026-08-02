package ru.ozon.app.android.pdp.widgets.curtainPrice.core;

import WZ.t;
import WZ.x;
import d00.C6020f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.widgets.curtainPrice.data.CurtainPriceDTO;
import ru.ozon.app.android.pdp.widgets.curtainPrice.presentation.CurtainPriceVI;
import ru.ozon.composer.compose.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "CurtainPriceComposeWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$Island$BankLogoDTO;", "", "widgetId", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "externalAction", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$BankLogo;", "toVO", "(Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$Island$BankLogoDTO;JLru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$BankLogo;", "", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$AdditionalInfoDTO;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$AdditionalInfo;", "(Ljava/util/List;J)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CurtainPriceComposeWidgetKt {
    @NotNull
    public static final i CurtainPriceComposeWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.a("pdp", "curtainPrice", k.a(1), new CurtainPriceComposeWidgetKt$CurtainPriceComposeWidget$1(jsonDeserializer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurtainPriceVI.BankLogo toVO(CurtainPriceDTO.Island.BankLogoDTO bankLogoDTO, long j11, AtomActionDTO atomActionDTO) {
        String image = bankLogoDTO.getImage();
        String darkImage = bankLogoDTO.getDarkImage();
        AtomActionDTO action = bankLogoDTO.getAction();
        if (action != null) {
            atomActionDTO = action;
        }
        AtomAction atomAction = atomActionDTO != null ? AtomActionMapperKt.toAtomAction(atomActionDTO, bankLogoDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = bankLogoDTO.getTrackingInfo();
        return new CurtainPriceVI.BankLogo(image, darkImage, atomAction, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null, bankLogoDTO.getTestInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CurtainPriceVI.AdditionalInfo> toVO(List<CurtainPriceDTO.AdditionalInfoDTO> list, long j11) {
        List<CurtainPriceDTO.AdditionalInfoDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (CurtainPriceDTO.AdditionalInfoDTO additionalInfoDTO : list2) {
            CommonAtomIconDTO icon = additionalInfoDTO.getIcon();
            t tVar = null;
            TextDTO copy$default = TextDTO.copy$default(additionalInfoDTO.getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null);
            AtomActionDTO action = additionalInfoDTO.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, additionalInfoDTO.getTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = additionalInfoDTO.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = x.b(trackingInfo, Long.valueOf(j11), null);
            }
            arrayList.add(new CurtainPriceVI.AdditionalInfo(icon, copy$default, atomAction, tVar));
        }
        return arrayList;
    }
}

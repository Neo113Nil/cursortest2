package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.data.MercuryCertificatesInfoDTO;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.presentation.vo.MercuryCertificatesInfoVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\t\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$SettingsDTO;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$SettingsVO;", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$SettingsDTO;)Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$SettingsVO;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$AspectListDTO;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO;", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/data/MercuryCertificatesInfoDTO$AspectListDTO;)Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MercuryCertificatesInfoMapperKt {
    @NotNull
    public static final MercuryCertificatesInfoVO toVO(@NotNull MercuryCertificatesInfoDTO mercuryCertificatesInfoDTO, @NotNull d info) {
        TextDTO textDTO;
        Intrinsics.checkNotNullParameter(mercuryCertificatesInfoDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        TextDTO title = mercuryCertificatesInfoDTO.getTitle();
        TextDTO subtitle = mercuryCertificatesInfoDTO.getSubtitle();
        MercuryCertificatesInfoDTO.AspectListDTO aspectList = mercuryCertificatesInfoDTO.getAspectList();
        MercuryCertificatesInfoVO.AspectListVO vo = aspectList != null ? toVO(aspectList) : null;
        CellDTO address = mercuryCertificatesInfoDTO.getAddress();
        TextDTO caption = mercuryCertificatesInfoDTO.getCaption();
        if (caption != null) {
            caption.setTagSupported(true);
            Unit unit = Unit.f71690a;
            textDTO = caption;
        } else {
            textDTO = null;
        }
        MercuryCertificatesInfoDTO.SettingsDTO settings = mercuryCertificatesInfoDTO.getSettings();
        MercuryCertificatesInfoVO.SettingsVO vo2 = settings != null ? toVO(settings) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = mercuryCertificatesInfoDTO.getTrackingInfo();
        return new MercuryCertificatesInfoVO(hashCode, title, subtitle, vo, address, textDTO, vo2, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    private static final MercuryCertificatesInfoVO.SettingsVO toVO(MercuryCertificatesInfoDTO.SettingsDTO settingsDTO) {
        return new MercuryCertificatesInfoVO.SettingsVO(settingsDTO.getBackgroundColor());
    }

    private static final MercuryCertificatesInfoVO.AspectListVO toVO(MercuryCertificatesInfoDTO.AspectListDTO aspectListDTO) {
        List<MercuryCertificatesInfoDTO.AspectListDTO.AspectItemDTO> items = aspectListDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (MercuryCertificatesInfoDTO.AspectListDTO.AspectItemDTO aspectItemDTO : items) {
            TextDTO text = aspectItemDTO.getText();
            CommonControlSettings common = aspectItemDTO.getCommon();
            arrayList.add(new MercuryCertificatesInfoVO.AspectListVO.AspectItemVO(text, common != null ? common.toAtomAction() : null));
        }
        return new MercuryCertificatesInfoVO.AspectListVO(arrayList, aspectListDTO.getSelectedItemIndex());
    }
}

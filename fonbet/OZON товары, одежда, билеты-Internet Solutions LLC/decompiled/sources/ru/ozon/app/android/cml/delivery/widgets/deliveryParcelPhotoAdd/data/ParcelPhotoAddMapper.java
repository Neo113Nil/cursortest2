package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data;

import WZ.t;
import WZ.x;
import We.C;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data.ParcelPhotoAddDTO;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhoto;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001b2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001bB\u0007¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004*\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$PhotoItemDTO;", "state", "LWZ/t;", "deletePhotoEvent", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoVO;", "toVO", "(Ljava/util/List;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO;LWZ/t;)Ljava/util/List;", "", "LWe/C;", "getMediaType", "(Ljava/lang/String;)LWe/C;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "toComposerAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO;Ll20/d;)Ljava/util/List;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParcelPhotoAddMapper implements Function2<ParcelPhotoAddDTO, d, List<? extends ParcelPhotoAddVO>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final IconDTO cancelIcon;

    @NotNull
    private static final IconDTO retryIcon;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddMapper$Companion;", "", "<init>", "()V", "RETRY_ICON", "", "CANCEL_ICON", "retryIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRetryIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "cancelIcon", "getCancelIcon", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IconDTO getCancelIcon() {
            return ParcelPhotoAddMapper.cancelIcon;
        }

        @NotNull
        public final IconDTO getRetryIcon() {
            return ParcelPhotoAddMapper.retryIcon;
        }

        private Companion() {
        }
    }

    static {
        IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_500;
        IconDTO.IconShape iconShape = IconDTO.IconShape.CIRCLE;
        UniColors uniColors = UniColors.CLEAR_DARK_KEY_600;
        String token = uniColors.getToken();
        UniColors uniColors2 = UniColors.GRAPHIC_LIGHT_KEY;
        int i11 = 65450;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str6 = null;
        TestInfo testInfo = null;
        Map map = null;
        retryIcon = new IconDTO(iconSize, bool, iconShape, str, new CommonAtomIconDTO("ic_m_reload_filled", uniColors2.getToken()), str2, token, str3, str4, str5, num, bool2, bool3, str6, testInfo, map, i11, defaultConstructorMarker);
        cancelIcon = new IconDTO(iconSize, bool, iconShape, str, new CommonAtomIconDTO("ic_m_cross_filled_compact", uniColors2.getToken()), str2, uniColors.getToken(), str3, str4, str5, num, bool2, bool3, str6, testInfo, map, i11, defaultConstructorMarker);
    }

    private final C getMediaType(String str) {
        String str2;
        String j02 = str != null ? h.j0('.', str, "") : null;
        if (j02 == null || (str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(j02)) == null) {
            str2 = "application/octet-stream";
        }
        C.f33536g.getClass();
        return C.a.b(str2);
    }

    private final AtomAction.ComposerAction toComposerAction(AtomActionDTO atomActionDTO) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, null);
        if (atomAction instanceof AtomAction.ComposerAction) {
            return (AtomAction.ComposerAction) atomAction;
        }
        return null;
    }

    private final List<ParcelPhotoAddVO.PhotoVO> toVO(List<ParcelPhotoAddDTO.PhotoItemDTO> list, ParcelPhotoAddDTO parcelPhotoAddDTO, t tVar) {
        Uri uri;
        List<ParcelPhotoAddDTO.PhotoItemDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (ParcelPhotoAddDTO.PhotoItemDTO photoItemDTO : list2) {
            ImageDTO image = photoItemDTO.getImage();
            String cdnUrl = photoItemDTO.getCdnUrl();
            IconDTO removeIcon = parcelPhotoAddDTO.getRemoveIcon();
            String valueOf = String.valueOf(photoItemDTO.getCdnUrl());
            String cdnUrl2 = photoItemDTO.getCdnUrl();
            String photoId = photoItemDTO.getPhotoId();
            String cdnUrl3 = photoItemDTO.getCdnUrl();
            if (cdnUrl3 == null || (uri = Uri.parse(cdnUrl3)) == null) {
                uri = Uri.EMPTY;
            }
            Uri uri2 = uri;
            Intrinsics.f(uri2);
            String image2 = photoItemDTO.getImage().getImage();
            arrayList.add(new ParcelPhotoAddVO.PhotoVO(image, removeIcon, cdnUrl, new AttachedPhoto(valueOf, cdnUrl2, photoId, uri2, image2 != null ? getMediaType(image2) : null, "", AttachedPhoto.Status.UPLOADED, toComposerAction(parcelPhotoAddDTO.getPhotoConfig().getUploadPhotoAction()), toComposerAction(parcelPhotoAddDTO.getPhotoConfig().getDeletePhotoAction())), tVar));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ParcelPhotoAddVO> invoke(@NotNull ParcelPhotoAddDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ParcelPhotoAddDTO.PhotoItemDTO> photos = state.getPhotos();
        if (photos == null) {
            photos = K.f71697a;
        }
        Map<String, TokenizedTrackingInfo> deleteErrorTrackingInfo = state.getDeleteErrorTrackingInfo();
        List<ParcelPhotoAddVO.PhotoVO> vo = toVO(photos, state, deleteErrorTrackingInfo != null ? x.b(deleteErrorTrackingInfo, Long.valueOf(hashCode), null) : null);
        ImageDTO image = state.getPickerItem().getImage();
        IconDTO icon = state.getPickerItem().getIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getPickerItem().getTrackingInfo();
        ParcelPhotoAddVO.PickerVO pickerVO = new ParcelPhotoAddVO.PickerVO(image, icon, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
        ParcelPhotoAddVO.EmptyVO emptyVO = new ParcelPhotoAddVO.EmptyVO(state.getEmptyItem().getImage(), state.getBorderColor());
        IconDTO removeIcon = state.getRemoveIcon();
        int maxItemsCount = state.getMaxItemsCount();
        String deliveryNumber = state.getDeliveryNumber();
        String postingNumber = state.getPostingNumber();
        ParcelPhotoAddVO.PhotoConfig photoConfig = new ParcelPhotoAddVO.PhotoConfig(toComposerAction(state.getPhotoConfig().getUploadPhotoAction()), toComposerAction(state.getPhotoConfig().getDeletePhotoAction()));
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
        t b11 = trackingInfo2 != null ? x.b(trackingInfo2, Long.valueOf(hashCode), null) : null;
        Map<String, TokenizedTrackingInfo> uploadTrackingInfo = state.getUploadTrackingInfo();
        t b12 = uploadTrackingInfo != null ? x.b(uploadTrackingInfo, Long.valueOf(hashCode), null) : null;
        Map<String, TokenizedTrackingInfo> uploadErrorTrackingInfo = state.getUploadErrorTrackingInfo();
        t b13 = uploadErrorTrackingInfo != null ? x.b(uploadErrorTrackingInfo, Long.valueOf(hashCode), null) : null;
        Map<String, TokenizedTrackingInfo> deleteTrackingInfo = state.getDeleteTrackingInfo();
        t b14 = deleteTrackingInfo != null ? x.b(deleteTrackingInfo, Long.valueOf(hashCode), null) : null;
        Map<String, TokenizedTrackingInfo> deleteErrorTrackingInfo2 = state.getDeleteErrorTrackingInfo();
        return C7714v.a0(new ParcelPhotoAddVO(hashCode, vo, pickerVO, removeIcon, emptyVO, maxItemsCount, deliveryNumber, postingNumber, photoConfig, b11, b12, b13, b14, deleteErrorTrackingInfo2 != null ? x.b(deleteErrorTrackingInfo2, Long.valueOf(hashCode), null) : null));
    }
}

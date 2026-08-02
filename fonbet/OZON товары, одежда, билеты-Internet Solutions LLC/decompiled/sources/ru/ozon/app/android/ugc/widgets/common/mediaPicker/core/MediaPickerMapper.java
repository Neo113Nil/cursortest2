package ru.ozon.app.android.ugc.widgets.common.mediaPicker.core;

import Kk.c;
import Sc.o;
import T00.a;
import WZ.t;
import We.C;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Content;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.pdp.utils.UriExtKt;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.data.MediaPickerDTO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 #2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001#B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0014\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u001dJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;)V", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$MediaDTO;", "", "voId", "state", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData$CachedMedia;", "cachedMedias", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "toVO", "(Ljava/util/List;JLru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO;Ljava/util/List;)Ljava/util/List;", "", "LWe/C;", "getMediaType", "(Ljava/lang/String;)LWe/C;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$OnBoardingConfigDTO;", "id", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$OnBoardingConfigVO;", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$OnBoardingConfigDTO;J)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$OnBoardingConfigVO;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaPickerMapper implements Function2<MediaPickerDTO, d, List<? extends MediaPickerVO>> {

    @NotNull
    private static final IconDTO cancelIcon;

    @NotNull
    private static final IconDTO retryIcon;

    @NotNull
    private final Context context;

    @NotNull
    private final ReviewFormRepository reviewFormRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerMapper$Companion;", "", "<init>", "()V", "RETRY_ICON", "", "CANCEL_ICON", "retryIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRetryIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "cancelIcon", "getCancelIcon", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IconDTO getCancelIcon() {
            return MediaPickerMapper.cancelIcon;
        }

        @NotNull
        public final IconDTO getRetryIcon() {
            return MediaPickerMapper.retryIcon;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaPickerDTO.MediaDTO.MediaType.values().length];
            try {
                iArr[MediaPickerDTO.MediaDTO.MediaType.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerDTO.MediaDTO.MediaType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_500;
        IconDTO.IconShape iconShape = IconDTO.IconShape.CIRCLE;
        UniColors uniColors = UniColors.CLEAR_DARK_KEY_600;
        String token = uniColors.getToken();
        UniColors uniColors2 = UniColors.GRAPHIC_LIGHT_KEY;
        retryIcon = new IconDTO(iconSize, null, iconShape, null, new CommonAtomIconDTO("ic_m_reload_filled", uniColors2.getToken()), null, token, null, null, null, null, null, null, null, null, null, 65450, null);
        cancelIcon = new IconDTO(iconSize, null, iconShape, null, new CommonAtomIconDTO("ic_m_cross_filled_compact", uniColors2.getToken()), null, uniColors.getToken(), null, null, null, null, null, null, null, null, null, 65450, null);
    }

    public MediaPickerMapper(@NotNull Context context, @NotNull ReviewFormRepository reviewFormRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reviewFormRepository, "reviewFormRepository");
        this.context = context;
        this.reviewFormRepository = reviewFormRepository;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO$VideoVO] */
    /* JADX WARN: Type inference failed for: r7v11, types: [ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO$PhotoVO] */
    private final List<MediaPickerVO.MediaVO> toVO(List<MediaPickerDTO.MediaDTO> list, long j11, MediaPickerDTO mediaPickerDTO, List<ReviewFormData.CachedMedia> list2) {
        MediaPickerVO.PhotoVO photoVO;
        ImageDTO copy;
        MediaPickerVO.PhotoVO photoVO2;
        ImageDTO copy2;
        MediaPickerVO.VideoVO videoVO;
        Uri parse;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (MediaPickerDTO.MediaDTO mediaDTO : list) {
                String image = mediaDTO.getImage().getImage();
                if (image == null || (parse = Uri.parse(image)) == null) {
                    videoVO = null;
                } else {
                    int i11 = WhenMappings.$EnumSwitchMapping$0[mediaDTO.getType().ordinal()];
                    if (i11 == 1) {
                        ImageDTO image2 = mediaDTO.getImage();
                        IconDTO removeIcon = mediaPickerDTO.getRemoveIcon();
                        String image3 = mediaDTO.getImage().getImage();
                        String width = mediaDTO.getWidth();
                        Integer w02 = width != null ? h.w0(width) : null;
                        String height = mediaDTO.getHeight();
                        Integer w03 = height != null ? h.w0(height) : null;
                        String id2 = mediaPickerDTO.getPhotoConfig().getUploadImageAction().getId();
                        Map<String, String> params = mediaPickerDTO.getPhotoConfig().getUploadImageAction().getParams();
                        long hashCode = mediaDTO.getUuid().hashCode();
                        String uuid = mediaDTO.getUuid();
                        String fileName = mediaDTO.getFileName();
                        String str = fileName == null ? "" : fileName;
                        String bucket = mediaDTO.getBucket();
                        AttachmentVO.Status.UPLOADED uploaded = AttachmentVO.Status.UPLOADED.INSTANCE;
                        String image4 = mediaDTO.getImage().getImage();
                        AttachmentVO.AttachedImageVO attachedImageVO = new AttachmentVO.AttachedImageVO(AttachmentVO.AttachedImageVO.ImageType.REVIEW, null, image3, bucket, null, w02, w03, id2, params, hashCode, uuid, str, "", parse, image4 != null ? getMediaType(image4) : null, uploaded, null, false, 65552, null);
                        Map<String, TokenizedTrackingInfo> removeTrackingInfo = mediaDTO.getRemoveTrackingInfo();
                        videoVO = new MediaPickerVO.PhotoVO(image2, removeTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(removeTrackingInfo, Long.valueOf(j11), null, 2, null) : null, removeIcon, attachedImageVO, null, 16, null);
                    } else {
                        if (i11 != 2) {
                            throw new o();
                        }
                        ImageDTO image5 = mediaDTO.getImage();
                        IconDTO removeIcon2 = mediaPickerDTO.getRemoveIcon();
                        IconDTO playIcon = mediaPickerDTO.getPlayIcon();
                        long hashCode2 = mediaDTO.getUuid().hashCode();
                        String uuid2 = mediaDTO.getUuid();
                        AttachmentVO.Status.UPLOADED uploaded2 = AttachmentVO.Status.UPLOADED.INSTANCE;
                        String uploadId = mediaDTO.getUploadId();
                        MediaPickerDTO.VideoConfig videoConfig = mediaPickerDTO.getVideoConfig();
                        String uploadVideoActionId = videoConfig != null ? videoConfig.getUploadVideoActionId() : null;
                        MediaPickerDTO.VideoConfig videoConfig2 = mediaPickerDTO.getVideoConfig();
                        AttachmentVO.AttachedVideoVO attachedVideoVO = new AttachmentVO.AttachedVideoVO(null, uploadId, uploadVideoActionId, videoConfig2 != null ? videoConfig2.getVideoType() : null, hashCode2, uuid2, "", "", parse, null, uploaded2, null, false, 2049, null);
                        Map<String, TokenizedTrackingInfo> removeTrackingInfo2 = mediaDTO.getRemoveTrackingInfo();
                        videoVO = new MediaPickerVO.VideoVO(image5, removeTrackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(removeTrackingInfo2, Long.valueOf(j11), null, 2, null) : null, removeIcon2, attachedVideoVO, playIcon);
                    }
                }
                if (videoVO != null) {
                    arrayList.add(videoVO);
                }
            }
            return arrayList;
        }
        List<ReviewFormData.CachedMedia> list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            return K.f71697a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ReviewFormData.CachedMedia cachedMedia : list2) {
            Uri parse2 = Uri.parse(cachedMedia.getUri());
            if (UriExtKt.isExist(parse2, this.context)) {
                Content.Photo photo = cachedMedia.getPhoto();
                Content.Video video = cachedMedia.getVideo();
                if (photo != null) {
                    copy2 = r10.copy((r34 & 1) != 0 ? r10.image : cachedMedia.getUri(), (r34 & 2) != 0 ? r10.backgroundColor : null, (r34 & 4) != 0 ? r10.aspectRatio : null, (r34 & 8) != 0 ? r10.hasParanja : true, (r34 & 16) != 0 ? r10.layoutPaddingLeft : null, (r34 & 32) != 0 ? r10.layoutPaddingRight : null, (r34 & 64) != 0 ? r10.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r10.layoutPaddingBottom : null, (r34 & 256) != 0 ? r10.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r10.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r10.testInfo : null, (r34 & 2048) != 0 ? r10.trackingInfo : null, (r34 & 4096) != 0 ? r10.imageWidth : null, (r34 & 8192) != 0 ? r10.imageType : null, (r34 & 16384) != 0 ? r10.fitType : null, (r34 & 32768) != 0 ? mediaPickerDTO.getEmptyItem().getImage().customRatio : null);
                    IconDTO removeIcon3 = mediaPickerDTO.getRemoveIcon();
                    String url = photo.getUrl();
                    String width2 = photo.getWidth();
                    Integer w04 = width2 != null ? h.w0(width2) : null;
                    String height2 = photo.getHeight();
                    Integer w05 = height2 != null ? h.w0(height2) : null;
                    String id3 = mediaPickerDTO.getPhotoConfig().getUploadImageAction().getId();
                    Map<String, String> params2 = mediaPickerDTO.getPhotoConfig().getUploadImageAction().getParams();
                    long hashCode3 = cachedMedia.getUri().hashCode();
                    String fileName2 = photo.getFileName();
                    String str2 = fileName2 == null ? "" : fileName2;
                    AttachmentVO.Status.UPLOADED uploaded3 = AttachmentVO.Status.UPLOADED.INSTANCE;
                    C.a aVar = C.f33536g;
                    String uri = cachedMedia.getUri();
                    aVar.getClass();
                    AttachmentVO.AttachedImageVO attachedImageVO2 = new AttachmentVO.AttachedImageVO(AttachmentVO.AttachedImageVO.ImageType.REVIEW, null, url, photo.getBucket(), null, w04, w05, id3, params2, hashCode3, null, str2, "", parse2, C.a.b(uri), uploaded3, null, false, 66576, null);
                    Map<String, TokenizedTrackingInfo> trackingInfo = mediaPickerDTO.getEmptyItem().getTrackingInfo();
                    photoVO = new MediaPickerVO.PhotoVO(copy2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, removeIcon3, attachedImageVO2, null, 16, null);
                } else if (video != null) {
                    copy = r19.copy((r34 & 1) != 0 ? r19.image : cachedMedia.getUri(), (r34 & 2) != 0 ? r19.backgroundColor : null, (r34 & 4) != 0 ? r19.aspectRatio : null, (r34 & 8) != 0 ? r19.hasParanja : true, (r34 & 16) != 0 ? r19.layoutPaddingLeft : null, (r34 & 32) != 0 ? r19.layoutPaddingRight : null, (r34 & 64) != 0 ? r19.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r19.layoutPaddingBottom : null, (r34 & 256) != 0 ? r19.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r19.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r19.testInfo : null, (r34 & 2048) != 0 ? r19.trackingInfo : null, (r34 & 4096) != 0 ? r19.imageWidth : null, (r34 & 8192) != 0 ? r19.imageType : null, (r34 & 16384) != 0 ? r19.fitType : null, (r34 & 32768) != 0 ? mediaPickerDTO.getEmptyItem().getImage().customRatio : null);
                    IconDTO removeIcon4 = mediaPickerDTO.getRemoveIcon();
                    IconDTO playIcon2 = mediaPickerDTO.getPlayIcon();
                    String url2 = video.getUrl();
                    MediaPickerDTO.VideoConfig videoConfig3 = mediaPickerDTO.getVideoConfig();
                    String uploadVideoActionId2 = videoConfig3 != null ? videoConfig3.getUploadVideoActionId() : null;
                    MediaPickerDTO.VideoConfig videoConfig4 = mediaPickerDTO.getVideoConfig();
                    AttachmentVO.AttachedVideoVO attachedVideoVO2 = new AttachmentVO.AttachedVideoVO(null, url2, uploadVideoActionId2, videoConfig4 != null ? videoConfig4.getVideoType() : null, cachedMedia.getUri().hashCode(), null, "", "", parse2, null, AttachmentVO.Status.UPLOADED.INSTANCE, null, false, 2081, null);
                    Map<String, TokenizedTrackingInfo> trackingInfo2 = mediaPickerDTO.getEmptyItem().getTrackingInfo();
                    photoVO = new MediaPickerVO.VideoVO(copy, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null, removeIcon4, attachedVideoVO2, playIcon2);
                } else {
                    photoVO = null;
                }
                photoVO2 = photoVO;
            } else {
                photoVO2 = null;
            }
            if (photoVO2 != null) {
                arrayList2.add(photoVO2);
            }
        }
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MediaPickerVO> invoke(@NotNull MediaPickerDTO state, @NotNull d widgetInfo) {
        String c11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), SelectionItemFormDTO.MEDIA_PICKER_FIELD_NAME);
        a b11 = widgetInfo.b();
        boolean z11 = false;
        if (b11 != null && (c11 = b11.c()) != null) {
            z11 = h.t(c11, "modal", false);
        }
        boolean z12 = z11;
        ReviewFormData formData = this.reviewFormRepository.getFormData();
        List<ReviewFormData.CachedMedia> medias = formData != null ? formData.getMedias() : null;
        List<MediaPickerDTO.MediaDTO> medias2 = state.getMedias();
        if (medias2 == null) {
            medias2 = K.f71697a;
        }
        List<MediaPickerVO.MediaVO> vo = toVO(medias2, a11, state, medias);
        ImageDTO image = state.getPickerItem().getImage();
        IconDTO icon = state.getPickerItem().getIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getPickerItem().getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null) : null;
        MediaPickerDTO.PickerItemBadgeDTO pickerItemBadge = state.getPickerItemBadge();
        MediaPickerVO.PickerVO pickerVO = new MediaPickerVO.PickerVO(image, tokenizedEvent$default, icon, pickerItemBadge != null ? pickerItemBadge.getBadge() : null);
        ImageDTO image2 = state.getEmptyItem().getImage();
        IconDTO playIcon = state.getPlayIcon();
        IconDTO removeIcon = state.getRemoveIcon();
        String borderColor = state.getBorderColor();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getEmptyItem().getTrackingInfo();
        MediaPickerVO.EmptyVO emptyVO = new MediaPickerVO.EmptyVO(image2, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(a11), null, 2, null) : null, playIcon, removeIcon, borderColor);
        IconDTO removeIcon2 = state.getRemoveIcon();
        IconDTO playIcon2 = state.getPlayIcon();
        int maxItemsCount = state.getMaxItemsCount();
        MediaPickerDTO.PhotoConfig photoConfig = state.getPhotoConfig();
        MediaPickerDTO.VideoConfig videoConfig = state.getVideoConfig();
        Map<String, TokenizedTrackingInfo> uploadTrackingInfo = state.getUploadTrackingInfo();
        t tokenizedEvent$default2 = uploadTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(uploadTrackingInfo, Long.valueOf(a11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> uploadErrorTrackingInfo = state.getUploadErrorTrackingInfo();
        t tokenizedEvent$default3 = uploadErrorTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(uploadErrorTrackingInfo, Long.valueOf(a11), null, 2, null) : null;
        MediaPickerDTO.PickerItemBadgeDTO pickerItemBadge2 = state.getPickerItemBadge();
        MediaPickerDTO.PickerItemBadgeDTO.HideCondition hideCondition = pickerItemBadge2 != null ? pickerItemBadge2.getHideCondition() : null;
        MediaPickerDTO.OnBoardingConfigDTO onBoardingConfig = state.getOnBoardingConfig();
        return C7714v.a0(new MediaPickerVO(a11, vo, pickerVO, removeIcon2, playIcon2, emptyVO, maxItemsCount, photoConfig, videoConfig, tokenizedEvent$default2, tokenizedEvent$default3, hideCondition, onBoardingConfig != null ? toVO(onBoardingConfig, a11) : null, false, z12));
    }

    private final MediaPickerVO.OnBoardingConfigVO toVO(MediaPickerDTO.OnBoardingConfigDTO onBoardingConfigDTO, long j11) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(onBoardingConfigDTO.getAction(), onBoardingConfigDTO.getTracking());
        Map<String, TokenizedTrackingInfo> tracking = onBoardingConfigDTO.getTracking();
        return new MediaPickerVO.OnBoardingConfigVO(atomAction, tracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent(tracking, Long.valueOf(j11), ActionType.VIEW.INSTANCE.getType()) : null, onBoardingConfigDTO.getOnBoardingKey());
    }
}

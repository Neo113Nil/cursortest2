package ru.ozon.app.android.ads.widgets.advVideoBannerV2.data;

import Sc.InterfaceC4008j;
import WZ.t;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.ads.data.analytics.SwitchModeTracking;
import ru.ozon.app.android.ads.data.pixel.presentation.PixelKt;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2TrackerAnalyticsDelegate;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2DTO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.OffsetResolveData;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 *2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001*B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u0003j\u0002`\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010#R\u001b\u0010)\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;", "", "stateId", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "toTokenizedEvents", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;J)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "toSwitchModeTracking", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;J)Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "fixSize", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TextWrapper;", "wrap", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TextWrapper;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "", "targetMargin", "I", "imageWidth", "screenWidth$delegate", "LSc/j;", "getScreenWidth", "()I", "screenWidth", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2Mapper implements Function2<AdvVideoBannerV2DTO, d, List<? extends AdvBannerVideoV2VO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;
    private final int imageWidth;

    /* renamed from: screenWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j screenWidth;
    private final int targetMargin;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2Mapper$Companion;", "", "<init>", "()V", "PACKSHOT_IMAGE_WIDTH", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageAspectRatio.values().length];
            try {
                iArr[ImageAspectRatio.RATIO_3_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageAspectRatio.RATIO_4_3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AdvVideoBannerV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.targetMargin = OffsetResolveData.INSTANCE.getTARGET_END_MARGIN();
        this.imageWidth = 72;
        this.screenWidth = LazyUtilsKt.unsafeLazy(new AdvVideoBannerV2Mapper$screenWidth$2(this));
    }

    private final ImageDTO fixSize(ImageDTO imageDTO) {
        ImageDTO copy;
        ImageAspectRatio aspectRatio = imageDTO.getAspectRatio();
        int i11 = aspectRatio == null ? -1 : WhenMappings.$EnumSwitchMapping$0[aspectRatio.ordinal()];
        copy = imageDTO.copy((r34 & 1) != 0 ? imageDTO.image : null, (r34 & 2) != 0 ? imageDTO.backgroundColor : null, (r34 & 4) != 0 ? imageDTO.aspectRatio : null, (r34 & 8) != 0 ? imageDTO.hasParanja : false, (r34 & 16) != 0 ? imageDTO.layoutPaddingLeft : null, (r34 & 32) != 0 ? imageDTO.layoutPaddingRight : null, (r34 & 64) != 0 ? imageDTO.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? imageDTO.layoutPaddingBottom : null, (r34 & 256) != 0 ? imageDTO.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? imageDTO.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? imageDTO.testInfo : null, (r34 & 2048) != 0 ? imageDTO.trackingInfo : null, (r34 & 4096) != 0 ? imageDTO.imageWidth : Integer.valueOf((i11 != 1 ? i11 != 2 ? ProductImageAspectRatio.RATIO_1_1 : ProductImageAspectRatio.RATIO_4_3 : ProductImageAspectRatio.RATIO_3_4).getImageWidth()), (r34 & 8192) != 0 ? imageDTO.imageType : ImageDTO.ImageType.FIX, (r34 & 16384) != 0 ? imageDTO.fitType : null, (r34 & 32768) != 0 ? imageDTO.customRatio : null);
        return copy;
    }

    private final int getScreenWidth() {
        return ((Number) this.screenWidth.getValue()).intValue();
    }

    private final SwitchModeTracking toSwitchModeTracking(AdvVideoBannerV2DTO.TrackingInfos trackingInfos, long j11) {
        return new SwitchModeTracking(TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoSoundOn(), Long.valueOf(j11), null, 2, null), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoSoundOff(), Long.valueOf(j11), null, 2, null));
    }

    private final AdvBannerVideoV2VO.TokenizedEvents toTokenizedEvents(AdvVideoBannerV2DTO.TrackingInfos trackingInfos, long j11) {
        return new AdvBannerVideoV2VO.TokenizedEvents(TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoView(), Long.valueOf(j11), null, 2, null), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoStart(), Long.valueOf(j11), null, 2, null), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoClick(), Long.valueOf(j11), null, 2, null), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoQ1(), Long.valueOf(j11), null, 2, null), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoQ2(), Long.valueOf(j11), null, 2, null), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoQ3(), Long.valueOf(j11), null, 2, null), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoEnd(), Long.valueOf(j11), null, 2, null), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfos.getVideoViewableImpressions(), Long.valueOf(j11), null, 2, null));
    }

    private final AdvBannerVideoV2VO.TextWrapper wrap(TextAtom textAtom) {
        return new AdvBannerVideoV2VO.TextWrapper(textAtom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0236  */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r18v7, types: [ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO$SmallPreviewProduct] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO$PackShotVO] */
    /* JADX WARN: Type inference failed for: r19v6 */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<AdvBannerVideoV2VO> invoke(@NotNull AdvVideoBannerV2DTO state, @NotNull d widgetInfo) {
        AdvBannerVideoV2VO.PackshotOptions packshotOptions;
        AdvBannerVideoV2VO.SmallPreviewProduct smallPreviewProduct;
        List list;
        AdvBannerVideoV2VO.SmallPreviewProduct smallPreviewProduct2;
        ?? r19;
        List<PixelDTO> pixel;
        AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents;
        ?? r16;
        float f7;
        Object obj;
        AdvVideoBannerV2DTO.PackshotOptions packshotOptions2;
        ImageDTO copy;
        ImageDTO copy2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String deeplink = state.getVideo().getDeeplink();
        if (state.getProductType() != ProductType.OZON_PRODUCT || state.getProduct() == null) {
            packshotOptions = null;
            if (state.getProductType() != ProductType.EXTERNAL_PRODUCT || state.getExternalProduct() == null) {
                smallPreviewProduct = null;
                list = null;
                if (smallPreviewProduct == null) {
                    CornerRadius cornerRadius = smallPreviewProduct.getImage().getCornerRadius() == CornerRadius.NO_RADIUS ? CornerRadius.RADIUS_500 : smallPreviewProduct.getImage().getCornerRadius();
                    AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType = smallPreviewProduct.getEventType();
                    copy2 = r19.copy((r34 & 1) != 0 ? r19.image : null, (r34 & 2) != 0 ? r19.backgroundColor : null, (r34 & 4) != 0 ? r19.aspectRatio : null, (r34 & 8) != 0 ? r19.hasParanja : false, (r34 & 16) != 0 ? r19.layoutPaddingLeft : null, (r34 & 32) != 0 ? r19.layoutPaddingRight : null, (r34 & 64) != 0 ? r19.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r19.layoutPaddingBottom : null, (r34 & 256) != 0 ? r19.cornerRadius : cornerRadius, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r19.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r19.testInfo : null, (r34 & 2048) != 0 ? r19.trackingInfo : null, (r34 & 4096) != 0 ? r19.imageWidth : Integer.valueOf(this.imageWidth), (r34 & 8192) != 0 ? r19.imageType : ImageDTO.ImageType.FIX, (r34 & 16384) != 0 ? r19.fitType : null, (r34 & 32768) != 0 ? smallPreviewProduct.getImage().customRatio : null);
                    if (list == null) {
                        list = K.f71697a;
                    }
                    t tokenizedEvent = smallPreviewProduct.getTokenizedEvent();
                    AtomAction action = smallPreviewProduct.getAction();
                    OffsetResolveData offsetResolveData = OffsetResolveData.INSTANCE;
                    r19 = new AdvBannerVideoV2VO.PackShotVO(eventType, copy2, action, list, tokenizedEvent, (this.targetMargin * getScreenWidth()) / offsetResolveData.getTARGET_SCREEN_WIDTH(), (offsetResolveData.getTARGET_START_MARGIN() * getScreenWidth()) / offsetResolveData.getTARGET_SCREEN_WIDTH());
                } else {
                    r19 = packshotOptions;
                }
                String playlistUrl = state.getVideo().getPlaylistUrl();
                String previewUrl = state.getVideo().getPreviewUrl();
                float initialVolume = (float) state.getVideo().getInitialVolume();
                AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents2 = toTokenizedEvents(state.getVideo().getTrackingInfos(), hashCode);
                SwitchModeTracking switchModeTracking = toSwitchModeTracking(state.getVideo().getTrackingInfos(), hashCode);
                pixel = state.getPixel();
                if (pixel == null) {
                    List<PixelDTO> list2 = pixel;
                    ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(PixelKt.toVO((PixelDTO) it.next()));
                    }
                    tokenizedEvents = tokenizedEvents2;
                    r16 = arrayList;
                } else {
                    tokenizedEvents = tokenizedEvents2;
                    r16 = packshotOptions;
                }
                ProductType productType = state.getProductType();
                if (smallPreviewProduct == null) {
                    copy = r21.copy((r34 & 1) != 0 ? r21.image : null, (r34 & 2) != 0 ? r21.backgroundColor : null, (r34 & 4) != 0 ? r21.aspectRatio : null, (r34 & 8) != 0 ? r21.hasParanja : false, (r34 & 16) != 0 ? r21.layoutPaddingLeft : null, (r34 & 32) != 0 ? r21.layoutPaddingRight : null, (r34 & 64) != 0 ? r21.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r21.layoutPaddingBottom : null, (r34 & 256) != 0 ? r21.cornerRadius : CornerRadius.RADIUS_300, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r21.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r21.testInfo : null, (r34 & 2048) != 0 ? r21.trackingInfo : null, (r34 & 4096) != 0 ? r21.imageWidth : null, (r34 & 8192) != 0 ? r21.imageType : null, (r34 & 16384) != 0 ? r21.fitType : null, (r34 & 32768) != 0 ? smallPreviewProduct.getImage().customRatio : null);
                    f7 = initialVolume;
                    obj = AdvBannerVideoV2VO.SmallPreviewProduct.copy$default(smallPreviewProduct, null, copy, null, null, null, 29, null);
                } else {
                    f7 = initialVolume;
                    obj = packshotOptions;
                }
                BadgeDTO badgeV2 = state.getBadgeV2();
                TextAtom legalInformation = state.getLegalInformation();
                Boolean videoCoverDisabled = state.getVideoCoverDisabled();
                boolean booleanValue = videoCoverDisabled == null ? videoCoverDisabled.booleanValue() : false;
                Boolean disableOverlayDisclaimer = state.getDisableOverlayDisclaimer();
                boolean booleanValue2 = disableOverlayDisclaimer == null ? disableOverlayDisclaimer.booleanValue() : false;
                packshotOptions2 = state.getPackshotOptions();
                if (packshotOptions2 != null) {
                    String lastFrameUrl = packshotOptions2.getLastFrameUrl();
                    Boolean isLastFrameBlurred = packshotOptions2.isLastFrameBlurred();
                    packshotOptions = new AdvBannerVideoV2VO.PackshotOptions(lastFrameUrl, isLastFrameBlurred != null ? isLastFrameBlurred.booleanValue() : false);
                }
                return C7714v.a0(new AdvBannerVideoV2VO(hashCode, playlistUrl, previewUrl, deeplink, f7, tokenizedEvents, switchModeTracking, false, false, 0L, badgeV2, r16, productType, obj, r19, legalInformation, booleanValue, booleanValue2, packshotOptions, state.getBackgroundColor(), state.getDesignOptions()));
            }
            AdvVideoBannerV2DTO.ExternalProductDTO externalProduct = state.getExternalProduct();
            list = C7714v.b0(wrap(TextAtom.copy$default(externalProduct.getTitle(), null, UniTextStyles.HEADLINE_400_SMALL.getToken(), null, null, null, null, null, 125, null)), wrap(TextAtom.copy$default(externalProduct.getSubtitle(), null, StyleParser.TextStyle.BODY_M.getStyleName(), null, 2, null, null, null, 117, null)));
            ImageDTO fixSize = fixSize(externalProduct.getImage());
            List b02 = C7714v.b0(wrap(TextAtom.copy$default(externalProduct.getTitle(), null, null, null, 1, null, null, null, 119, null)), wrap(TextAtom.copy$default(externalProduct.getSubtitle(), null, null, null, 1, null, null, null, 119, null)));
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(externalProduct.getAction(), null);
            Map<String, TokenizedTrackingInfo> trackingInfo = externalProduct.getTrackingInfo();
            smallPreviewProduct2 = new AdvBannerVideoV2VO.SmallPreviewProduct(AdvVideoBannerV2TrackerAnalyticsDelegate.EventType.EXTERNAL_CONTAINER_CLICK, fixSize, b02, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
        } else {
            AdvVideoBannerV2DTO.InternalProductDTO product = state.getProduct();
            list = C7714v.b0(Price.copy$default(product.getPrice(), null, Price.StyleType.STYLE_TYPE_MEDIUM, null, null, null, null, null, null, null, null, null, null, 4093, null), wrap(TextAtom.copy$default(product.getName(), null, StyleParser.TextStyle.BODY_M.getStyleName(), null, 2, null, null, null, 117, null)));
            ImageDTO fixSize2 = fixSize(product.getImage());
            Price price = product.getPrice();
            TextAtom name = product.getName();
            packshotOptions = null;
            List b03 = C7714v.b0(price, wrap(TextAtom.copy$default(name, null, null, null, 1, null, null, null, 119, null)));
            AtomAction atomAction2 = AtomActionMapperKt.toAtomAction(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, deeplink, null, null, 12, null), null);
            Map<String, TokenizedTrackingInfo> trackingInfo2 = product.getTrackingInfo();
            smallPreviewProduct2 = new AdvBannerVideoV2VO.SmallPreviewProduct(AdvVideoBannerV2TrackerAnalyticsDelegate.EventType.INTERNAL_CONTAINER_CLICK, fixSize2, b03, atomAction2, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null);
        }
        smallPreviewProduct = smallPreviewProduct2;
        if (smallPreviewProduct == null) {
        }
        String playlistUrl2 = state.getVideo().getPlaylistUrl();
        String previewUrl2 = state.getVideo().getPreviewUrl();
        float initialVolume2 = (float) state.getVideo().getInitialVolume();
        AdvBannerVideoV2VO.TokenizedEvents tokenizedEvents22 = toTokenizedEvents(state.getVideo().getTrackingInfos(), hashCode);
        SwitchModeTracking switchModeTracking2 = toSwitchModeTracking(state.getVideo().getTrackingInfos(), hashCode);
        pixel = state.getPixel();
        if (pixel == null) {
        }
        ProductType productType2 = state.getProductType();
        if (smallPreviewProduct == null) {
        }
        BadgeDTO badgeV22 = state.getBadgeV2();
        TextAtom legalInformation2 = state.getLegalInformation();
        Boolean videoCoverDisabled2 = state.getVideoCoverDisabled();
        if (videoCoverDisabled2 == null) {
        }
        Boolean disableOverlayDisclaimer2 = state.getDisableOverlayDisclaimer();
        if (disableOverlayDisclaimer2 == null) {
        }
        packshotOptions2 = state.getPackshotOptions();
        if (packshotOptions2 != null) {
        }
        return C7714v.a0(new AdvBannerVideoV2VO(hashCode, playlistUrl2, previewUrl2, deeplink, f7, tokenizedEvents, switchModeTracking2, false, false, 0L, badgeV22, r16, productType2, obj, r19, legalInformation2, booleanValue, booleanValue2, packshotOptions, state.getBackgroundColor(), state.getDesignOptions()));
    }
}

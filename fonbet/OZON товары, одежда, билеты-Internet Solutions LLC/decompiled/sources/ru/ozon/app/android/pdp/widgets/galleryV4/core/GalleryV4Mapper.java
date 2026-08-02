package ru.ozon.app.android.pdp.widgets.galleryV4.core;

import Sc.o;
import WZ.t;
import android.content.Context;
import android.util.Size;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.utils.AtomExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV4.data.GalleryV4DTO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerStateKt;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 O2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u00020\u0007:\u0001OB#\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004*\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010!\u001a\u00020 *\u00020\u001c2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002¢\u0006\u0004\b!\u0010\"J?\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0004*\b\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020 2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*JG\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020#2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b3\u00104JG\u00107\u001a\u0002062\u0006\u0010+\u001a\u00020#2\u0006\u0010-\u001a\u0002052\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b7\u00108JW\u0010<\u001a\u00020(2\u0006\u0010+\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u000b2\u0006\u00101\u001a\u00020.2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020.0:2\b\u00100\u001a\u0004\u0018\u00010.2\u0006\u0010%\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010B\u001a\u00020A*\u00020>2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u0004\u0018\u00010&*\u00020&2\b\u0010D\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/core/GalleryV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/widgets/galleryV4/utils/GalleryV4Utils;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "", "updateConfig", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO;Ll20/d;)Ljava/util/List;", "invokeUpdate", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$Button;", "", "widgetId", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button;", "toButtonsVo", "(Ljava/util/List;J)Ljava/util/List;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "toAction", "(Ljava/lang/String;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem;", "config", "action", "", "galleryRatio", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item;", "toGalleryItemsVo", "(Ljava/util/List;JLru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;Lru/ozon/uni/atoms/af/AtomAction;D)Ljava/util/List;", "galleryItem", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem$ContentWrapper$Ugc;", "content", "", "height", "width", "index", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Ugc;", "createUgcItem", "(Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem;Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem$ContentWrapper$Ugc;IJIID)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem$ContentWrapper$Info;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Info;", "createInfoItem", "(Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem;Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem$ContentWrapper$Info;IJIID)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Info;", ImagesContract.URL, "Ljava/util/Queue;", "containerWidthQueue", "createImageItem", "(Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem;JLjava/lang/String;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;ILjava/util/Queue;Ljava/lang/Integer;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$Button$OnBoarding;", "", "notHidableOnboarding", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button$OnBoarding;", "toOnBoardingVo", "(Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$Button$OnBoarding;Z)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Button$OnBoarding;", "containerRatio", "checkingEqualImageContainerOrNull", "(DLjava/lang/Double;)Ljava/lang/Double;", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function1;", "newConfig", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "lastState", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO;", "lastWidgetId", "Ljava/lang/Long;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4Mapper implements Function2<GalleryV4DTO, d, List<? extends GalleryV4VO>>, GalleryV4Utils {

    @NotNull
    private final Context context;
    private GalleryV4DTO lastState;
    private Long lastWidgetId;
    private GalleryV4PreCreationConfig newConfig;

    @NotNull
    private final Function1<GalleryV4PreCreationConfig, Unit> updateConfig;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/core/GalleryV4Mapper$Companion;", "", "<init>", "()V", "MAX_ON_BOARDING_LENGTH", "", "EMPTY_PREVIEW_CONTAINER_RATIO", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV4Mapper(@NotNull Context context, @NotNull Function1<? super GalleryV4PreCreationConfig, Unit> updateConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updateConfig, "updateConfig");
        this.context = context;
        this.updateConfig = updateConfig;
    }

    private final Double checkingEqualImageContainerOrNull(double d11, Double d12) {
        if (d11 == -1.0d && d12 != null) {
            return d12;
        }
        if (d12 != null && d11 == d12.doubleValue()) {
            return d12;
        }
        GalleryV4PreCreationConfig galleryV4PreCreationConfig = this.newConfig;
        this.newConfig = galleryV4PreCreationConfig != null ? galleryV4PreCreationConfig.copy((r32 & 1) != 0 ? galleryV4PreCreationConfig.height : 0, (r32 & 2) != 0 ? galleryV4PreCreationConfig.width : 0, (r32 & 4) != 0 ? galleryV4PreCreationConfig.defaultContainersWidth : 0, (r32 & 8) != 0 ? galleryV4PreCreationConfig.containerWidthQueue : null, (r32 & 16) != 0 ? galleryV4PreCreationConfig.infoContainerWidth : null, (r32 & 32) != 0 ? galleryV4PreCreationConfig.ugcContainerWidth : null, (r32 & 64) != 0 ? galleryV4PreCreationConfig.videoContainerWidth : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV4PreCreationConfig.isBigStateInfo : false, (r32 & 256) != 0 ? galleryV4PreCreationConfig.isVerticalStateUgc : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV4PreCreationConfig.isCreateOnBoarding : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV4PreCreationConfig.buttonsTintRes : null, (r32 & 2048) != 0 ? galleryV4PreCreationConfig.icons : null, (r32 & 4096) != 0 ? galleryV4PreCreationConfig.hasWave : false, (r32 & 8192) != 0 ? galleryV4PreCreationConfig.hasVideoContent : false, (r32 & 16384) != 0 ? galleryV4PreCreationConfig.hasDifferentContainers : true) : null;
        return null;
    }

    private final GalleryV4VO.Item createImageItem(GalleryV4DTO.GalleryItem galleryItem, long widgetId, String url, GalleryV4PreCreationConfig config, int index, Queue<Integer> containerWidthQueue, Integer width, AtomAction action) {
        GalleryV4PreCreationConfig galleryV4PreCreationConfig;
        if (index < getPrefetchImageItemCount()) {
            containerWidthQueue.add(width);
        } else {
            GalleryV4PreCreationConfig galleryV4PreCreationConfig2 = this.newConfig;
            if (galleryV4PreCreationConfig2 != null) {
                Integer peek = containerWidthQueue.peek();
                galleryV4PreCreationConfig = galleryV4PreCreationConfig2.copy((r32 & 1) != 0 ? galleryV4PreCreationConfig2.height : 0, (r32 & 2) != 0 ? galleryV4PreCreationConfig2.width : 0, (r32 & 4) != 0 ? galleryV4PreCreationConfig2.defaultContainersWidth : peek != null ? peek.intValue() : config.getDefaultContainersWidth(), (r32 & 8) != 0 ? galleryV4PreCreationConfig2.containerWidthQueue : containerWidthQueue, (r32 & 16) != 0 ? galleryV4PreCreationConfig2.infoContainerWidth : null, (r32 & 32) != 0 ? galleryV4PreCreationConfig2.ugcContainerWidth : null, (r32 & 64) != 0 ? galleryV4PreCreationConfig2.videoContainerWidth : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV4PreCreationConfig2.isBigStateInfo : false, (r32 & 256) != 0 ? galleryV4PreCreationConfig2.isVerticalStateUgc : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV4PreCreationConfig2.isCreateOnBoarding : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV4PreCreationConfig2.buttonsTintRes : null, (r32 & 2048) != 0 ? galleryV4PreCreationConfig2.icons : null, (r32 & 4096) != 0 ? galleryV4PreCreationConfig2.hasWave : false, (r32 & 8192) != 0 ? galleryV4PreCreationConfig2.hasVideoContent : false, (r32 & 16384) != 0 ? galleryV4PreCreationConfig2.hasDifferentContainers : false);
            } else {
                galleryV4PreCreationConfig = null;
            }
            this.newConfig = galleryV4PreCreationConfig;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
        return new GalleryV4VO.Item.Image(index, widgetId, ((galleryItem.getHasWaves() && index == 0) ? GalleryV4VO.ItemViewType.WAVE_IMAGE : GalleryV4VO.ItemViewType.IMAGE).ordinal(), new GalleryV4VO.ContainerConfig(config.getHeight(), width), action, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null, url);
    }

    private final GalleryV4VO.Item.Info createInfoItem(GalleryV4DTO.GalleryItem galleryItem, GalleryV4DTO.GalleryItem.ContentWrapper.Info content, int height, long widgetId, int width, int index, double galleryRatio) {
        Double containerRatio = galleryItem.getContainerRatio();
        boolean hasVerticalState = hasVerticalState(containerRatio != null ? containerRatio.doubleValue() : galleryRatio);
        GalleryV4PreCreationConfig galleryV4PreCreationConfig = this.newConfig;
        this.newConfig = galleryV4PreCreationConfig != null ? galleryV4PreCreationConfig.copy((r32 & 1) != 0 ? galleryV4PreCreationConfig.height : 0, (r32 & 2) != 0 ? galleryV4PreCreationConfig.width : 0, (r32 & 4) != 0 ? galleryV4PreCreationConfig.defaultContainersWidth : 0, (r32 & 8) != 0 ? galleryV4PreCreationConfig.containerWidthQueue : null, (r32 & 16) != 0 ? galleryV4PreCreationConfig.infoContainerWidth : Integer.valueOf(width), (r32 & 32) != 0 ? galleryV4PreCreationConfig.ugcContainerWidth : null, (r32 & 64) != 0 ? galleryV4PreCreationConfig.videoContainerWidth : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV4PreCreationConfig.isBigStateInfo : hasVerticalState, (r32 & 256) != 0 ? galleryV4PreCreationConfig.isVerticalStateUgc : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV4PreCreationConfig.isCreateOnBoarding : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV4PreCreationConfig.buttonsTintRes : null, (r32 & 2048) != 0 ? galleryV4PreCreationConfig.icons : null, (r32 & 4096) != 0 ? galleryV4PreCreationConfig.hasWave : false, (r32 & 8192) != 0 ? galleryV4PreCreationConfig.hasVideoContent : false, (r32 & 16384) != 0 ? galleryV4PreCreationConfig.hasDifferentContainers : false) : null;
        GalleryV4VO.ContainerConfig containerConfig = new GalleryV4VO.ContainerConfig(height, Integer.valueOf(width));
        Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null;
        Icon icon = content.getIcon();
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(content.getTitle(), null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, 3, null, false, 3581, null);
        String backgroundColor = content.getBackgroundColor();
        AtomActionDTO action = galleryItem.getAction();
        return new GalleryV4VO.Item.Info(index, widgetId, 0, containerConfig, action != null ? AtomActionMapperKt.toAtomAction(action, galleryItem.getTrackingInfo()) : null, tokenizedEvent$default, dsTextAtom$default, icon, backgroundColor, hasVerticalState, 4, null);
    }

    private final GalleryV4VO.Item.Ugc createUgcItem(GalleryV4DTO.GalleryItem galleryItem, GalleryV4DTO.GalleryItem.ContentWrapper.Ugc content, int height, long widgetId, int width, int index, double galleryRatio) {
        Double containerRatio = galleryItem.getContainerRatio();
        boolean hasVerticalState = hasVerticalState(containerRatio != null ? containerRatio.doubleValue() : galleryRatio);
        GalleryV4PreCreationConfig galleryV4PreCreationConfig = this.newConfig;
        this.newConfig = galleryV4PreCreationConfig != null ? galleryV4PreCreationConfig.copy((r32 & 1) != 0 ? galleryV4PreCreationConfig.height : 0, (r32 & 2) != 0 ? galleryV4PreCreationConfig.width : 0, (r32 & 4) != 0 ? galleryV4PreCreationConfig.defaultContainersWidth : 0, (r32 & 8) != 0 ? galleryV4PreCreationConfig.containerWidthQueue : null, (r32 & 16) != 0 ? galleryV4PreCreationConfig.infoContainerWidth : null, (r32 & 32) != 0 ? galleryV4PreCreationConfig.ugcContainerWidth : Integer.valueOf(width), (r32 & 64) != 0 ? galleryV4PreCreationConfig.videoContainerWidth : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV4PreCreationConfig.isBigStateInfo : false, (r32 & 256) != 0 ? galleryV4PreCreationConfig.isVerticalStateUgc : hasVerticalState, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV4PreCreationConfig.isCreateOnBoarding : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV4PreCreationConfig.buttonsTintRes : null, (r32 & 2048) != 0 ? galleryV4PreCreationConfig.icons : null, (r32 & 4096) != 0 ? galleryV4PreCreationConfig.hasWave : false, (r32 & 8192) != 0 ? galleryV4PreCreationConfig.hasVideoContent : false, (r32 & 16384) != 0 ? galleryV4PreCreationConfig.hasDifferentContainers : false) : null;
        GalleryV4VO.ContainerConfig containerConfig = new GalleryV4VO.ContainerConfig(height, Integer.valueOf(width));
        Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null;
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(content.getTitle(), null, null, null, null, null, null, null, null, null, 1, null, false, 3583, null);
        String backgroundColor = content.getBackgroundColor();
        AtomActionDTO action = galleryItem.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, galleryItem.getTrackingInfo()) : null;
        String previewUrl = content.getPreviewUrl();
        TextDTO dsTextAtom$default2 = TextMapperKt.dsTextAtom$default(content.getSubtitle(), null, null, null, null, null, null, null, null, null, Integer.valueOf(hasVerticalState ? 2 : 3), null, false, 3583, null);
        GalleryV4VO.GalleryIcon icon = toIcon(content.getTitleIcon(), this.context);
        Icon previewIcon = content.getPreviewIcon();
        return new GalleryV4VO.Item.Ugc(index, widgetId, 0, containerConfig, atomAction, tokenizedEvent$default, previewUrl, previewIcon != null ? toIcon(previewIcon, this.context) : null, dsTextAtom$default, icon, dsTextAtom$default2, hasVerticalState, new Size(width, height), backgroundColor, 4, null);
    }

    private final AtomAction toAction(String str, Map<String, TokenizedTrackingInfo> map) {
        return AtomActionMapperKt.toAtomAction(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, str, null, null, 12, null), map);
    }

    private final List<GalleryV4VO.Button> toButtonsVo(List<GalleryV4DTO.Button> list, long j11) {
        GalleryV4VO.Button.OnBoarding onBoarding;
        List<GalleryV4DTO.Button> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            GalleryV4DTO.Button button = (GalleryV4DTO.Button) obj;
            GalleryV4DTO.Button.OnBoarding onboarding = button.getOnboarding();
            if (onboarding != null) {
                Boolean notHidableOnboarding = button.getNotHidableOnboarding();
                onBoarding = toOnBoardingVo(onboarding, notHidableOnboarding != null ? notHidableOnboarding.booleanValue() : false);
            } else {
                onBoarding = null;
            }
            int ordinal = (onBoarding == null ? GalleryV4VO.ButtonViewType.SINGLE : GalleryV4VO.ButtonViewType.ON_BOARDING).ordinal();
            Icon icon = button.getIcon();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(button.getAction(), null);
            String backgroundColor = button.getBackgroundColor();
            Map<String, TokenizedTrackingInfo> trackingInfo = button.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
            }
            arrayList.add(new GalleryV4VO.Button(i11, ordinal, icon, atomAction, onBoarding, backgroundColor, tVar));
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<GalleryV4VO.Item> toGalleryItemsVo(List<GalleryV4DTO.GalleryItem> list, long j11, GalleryV4PreCreationConfig galleryV4PreCreationConfig, AtomAction atomAction, double d11) {
        Integer valueOf;
        Integer num;
        GalleryV4DTO.GalleryItem.ContentWrapper content;
        LinkedList linkedList;
        GalleryV4VO.Item video;
        Map<String, TokenizedTrackingInfo> endVideo;
        Map<String, TokenizedTrackingInfo> startVideo;
        double d12 = d11;
        LinkedList linkedList2 = new LinkedList();
        Double valueOf2 = Double.valueOf(-1.0d);
        List<GalleryV4DTO.GalleryItem> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Double d13 = valueOf2;
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            t tVar = null;
            tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            GalleryV4DTO.GalleryItem galleryItem = (GalleryV4DTO.GalleryItem) obj;
            if (list.size() != 1) {
                Double containerRatio = galleryItem.getContainerRatio();
                if (containerRatio != null) {
                    valueOf = Integer.valueOf(calculateWidth(containerRatio.doubleValue(), galleryV4PreCreationConfig.getHeight()));
                } else {
                    num = null;
                    if (galleryItem.getHasWaves() && i11 == 0) {
                        GalleryV4PreCreationConfig galleryV4PreCreationConfig2 = this.newConfig;
                        this.newConfig = galleryV4PreCreationConfig2 == null ? galleryV4PreCreationConfig2.copy((r32 & 1) != 0 ? galleryV4PreCreationConfig2.height : 0, (r32 & 2) != 0 ? galleryV4PreCreationConfig2.width : 0, (r32 & 4) != 0 ? galleryV4PreCreationConfig2.defaultContainersWidth : 0, (r32 & 8) != 0 ? galleryV4PreCreationConfig2.containerWidthQueue : null, (r32 & 16) != 0 ? galleryV4PreCreationConfig2.infoContainerWidth : null, (r32 & 32) != 0 ? galleryV4PreCreationConfig2.ugcContainerWidth : null, (r32 & 64) != 0 ? galleryV4PreCreationConfig2.videoContainerWidth : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV4PreCreationConfig2.isBigStateInfo : false, (r32 & 256) != 0 ? galleryV4PreCreationConfig2.isVerticalStateUgc : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV4PreCreationConfig2.isCreateOnBoarding : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV4PreCreationConfig2.buttonsTintRes : null, (r32 & 2048) != 0 ? galleryV4PreCreationConfig2.icons : null, (r32 & 4096) != 0 ? galleryV4PreCreationConfig2.hasWave : true, (r32 & 8192) != 0 ? galleryV4PreCreationConfig2.hasVideoContent : false, (r32 & 16384) != 0 ? galleryV4PreCreationConfig2.hasDifferentContainers : false) : null;
                    }
                    content = galleryItem.getContent();
                    if (content instanceof GalleryV4DTO.GalleryItem.ContentWrapper.Image) {
                        linkedList = linkedList2;
                        int i13 = i11;
                        if (content instanceof GalleryV4DTO.GalleryItem.ContentWrapper.Info) {
                            video = createInfoItem(galleryItem, (GalleryV4DTO.GalleryItem.ContentWrapper.Info) galleryItem.getContent(), galleryV4PreCreationConfig.getHeight(), j11, num != null ? num.intValue() : calculateWidth(d12, galleryV4PreCreationConfig.getHeight()), i13, d12);
                        } else if (content instanceof GalleryV4DTO.GalleryItem.ContentWrapper.Ugc) {
                            video = createUgcItem(galleryItem, (GalleryV4DTO.GalleryItem.ContentWrapper.Ugc) galleryItem.getContent(), galleryV4PreCreationConfig.getHeight(), j11, num != null ? num.intValue() : calculateWidth(d12, galleryV4PreCreationConfig.getHeight()), i13, d12);
                        } else {
                            if (!(content instanceof GalleryV4DTO.GalleryItem.ContentWrapper.Video)) {
                                throw new o();
                            }
                            Double checkingEqualImageContainerOrNull = d13 != null ? checkingEqualImageContainerOrNull(d13.doubleValue(), galleryItem.getContainerRatio()) : null;
                            GalleryV4PreCreationConfig galleryV4PreCreationConfig3 = this.newConfig;
                            if ((galleryV4PreCreationConfig3 != null ? galleryV4PreCreationConfig3.getVideoContainerWidth() : null) == null) {
                                GalleryV4PreCreationConfig galleryV4PreCreationConfig4 = this.newConfig;
                                this.newConfig = galleryV4PreCreationConfig4 != null ? galleryV4PreCreationConfig4.copy((r32 & 1) != 0 ? galleryV4PreCreationConfig4.height : 0, (r32 & 2) != 0 ? galleryV4PreCreationConfig4.width : 0, (r32 & 4) != 0 ? galleryV4PreCreationConfig4.defaultContainersWidth : 0, (r32 & 8) != 0 ? galleryV4PreCreationConfig4.containerWidthQueue : null, (r32 & 16) != 0 ? galleryV4PreCreationConfig4.infoContainerWidth : null, (r32 & 32) != 0 ? galleryV4PreCreationConfig4.ugcContainerWidth : null, (r32 & 64) != 0 ? galleryV4PreCreationConfig4.videoContainerWidth : num, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV4PreCreationConfig4.isBigStateInfo : false, (r32 & 256) != 0 ? galleryV4PreCreationConfig4.isVerticalStateUgc : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV4PreCreationConfig4.isCreateOnBoarding : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV4PreCreationConfig4.buttonsTintRes : null, (r32 & 2048) != 0 ? galleryV4PreCreationConfig4.icons : null, (r32 & 4096) != 0 ? galleryV4PreCreationConfig4.hasWave : false, (r32 & 8192) != 0 ? galleryV4PreCreationConfig4.hasVideoContent : true, (r32 & 16384) != 0 ? galleryV4PreCreationConfig4.hasDifferentContainers : false) : null;
                            }
                            int ordinal = ((i13 == 0 && galleryItem.getHasWaves()) ? GalleryV4VO.ItemViewType.WAVE_VIDEO : GalleryV4VO.ItemViewType.VIDEO).ordinal();
                            GalleryV4VO.ContainerConfig containerConfig = new GalleryV4VO.ContainerConfig(galleryV4PreCreationConfig.getHeight(), num);
                            Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
                            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
                            VideoMolecule video2 = ((GalleryV4DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).getVideo();
                            PlayerStateKt.updateShouldRepeat(video2, true);
                            Unit unit = Unit.f71690a;
                            String previewUrl = ((GalleryV4DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).getPreviewUrl();
                            Boolean isAutoPlay = ((GalleryV4DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).isAutoPlay();
                            boolean booleanValue = isAutoPlay != null ? isAutoPlay.booleanValue() : true;
                            GalleryV4DTO.GalleryItem.VideoTrackingInfo videoTrackingInfo = ((GalleryV4DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).getVideoTrackingInfo();
                            t tokenizedEvent$default2 = (videoTrackingInfo == null || (startVideo = videoTrackingInfo.getStartVideo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(startVideo, Long.valueOf(j11), null, 2, null);
                            GalleryV4DTO.GalleryItem.VideoTrackingInfo videoTrackingInfo2 = ((GalleryV4DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).getVideoTrackingInfo();
                            if (videoTrackingInfo2 != null && (endVideo = videoTrackingInfo2.getEndVideo()) != null) {
                                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(endVideo, Long.valueOf(j11), null, 2, null);
                            }
                            d13 = checkingEqualImageContainerOrNull;
                            video = new GalleryV4VO.Item.Video(i13, j11, ordinal, containerConfig, atomAction, tokenizedEvent$default, video2, previewUrl, booleanValue, new GalleryV4VO.VideoEvents(tokenizedEvent$default2, tVar));
                        }
                    } else {
                        d13 = d13 != null ? checkingEqualImageContainerOrNull(d13.doubleValue(), galleryItem.getContainerRatio()) : null;
                        video = createImageItem(galleryItem, j11, ((GalleryV4DTO.GalleryItem.ContentWrapper.Image) galleryItem.getContent()).getUrl(), galleryV4PreCreationConfig, i11, linkedList2, num, atomAction);
                        linkedList = linkedList2;
                    }
                    arrayList.add(video);
                    d12 = d11;
                    i11 = i12;
                    linkedList2 = linkedList;
                }
            } else {
                valueOf = Integer.valueOf(this.context.getResources().getDisplayMetrics().widthPixels - getDp8());
            }
            num = valueOf;
            if (galleryItem.getHasWaves()) {
                GalleryV4PreCreationConfig galleryV4PreCreationConfig22 = this.newConfig;
                this.newConfig = galleryV4PreCreationConfig22 == null ? galleryV4PreCreationConfig22.copy((r32 & 1) != 0 ? galleryV4PreCreationConfig22.height : 0, (r32 & 2) != 0 ? galleryV4PreCreationConfig22.width : 0, (r32 & 4) != 0 ? galleryV4PreCreationConfig22.defaultContainersWidth : 0, (r32 & 8) != 0 ? galleryV4PreCreationConfig22.containerWidthQueue : null, (r32 & 16) != 0 ? galleryV4PreCreationConfig22.infoContainerWidth : null, (r32 & 32) != 0 ? galleryV4PreCreationConfig22.ugcContainerWidth : null, (r32 & 64) != 0 ? galleryV4PreCreationConfig22.videoContainerWidth : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV4PreCreationConfig22.isBigStateInfo : false, (r32 & 256) != 0 ? galleryV4PreCreationConfig22.isVerticalStateUgc : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV4PreCreationConfig22.isCreateOnBoarding : false, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV4PreCreationConfig22.buttonsTintRes : null, (r32 & 2048) != 0 ? galleryV4PreCreationConfig22.icons : null, (r32 & 4096) != 0 ? galleryV4PreCreationConfig22.hasWave : true, (r32 & 8192) != 0 ? galleryV4PreCreationConfig22.hasVideoContent : false, (r32 & 16384) != 0 ? galleryV4PreCreationConfig22.hasDifferentContainers : false) : null;
            }
            content = galleryItem.getContent();
            if (content instanceof GalleryV4DTO.GalleryItem.ContentWrapper.Image) {
            }
            arrayList.add(video);
            d12 = d11;
            i11 = i12;
            linkedList2 = linkedList;
        }
        return arrayList;
    }

    private final GalleryV4VO.Button.OnBoarding toOnBoardingVo(GalleryV4DTO.Button.OnBoarding onBoarding, boolean z11) {
        CharSequence text;
        GalleryV4PreCreationConfig galleryV4PreCreationConfig = this.newConfig;
        if (galleryV4PreCreationConfig != null && !galleryV4PreCreationConfig.getIsCreateOnBoarding()) {
            GalleryV4PreCreationConfig galleryV4PreCreationConfig2 = this.newConfig;
            this.newConfig = galleryV4PreCreationConfig2 != null ? galleryV4PreCreationConfig2.copy((r32 & 1) != 0 ? galleryV4PreCreationConfig2.height : 0, (r32 & 2) != 0 ? galleryV4PreCreationConfig2.width : 0, (r32 & 4) != 0 ? galleryV4PreCreationConfig2.defaultContainersWidth : 0, (r32 & 8) != 0 ? galleryV4PreCreationConfig2.containerWidthQueue : null, (r32 & 16) != 0 ? galleryV4PreCreationConfig2.infoContainerWidth : null, (r32 & 32) != 0 ? galleryV4PreCreationConfig2.ugcContainerWidth : null, (r32 & 64) != 0 ? galleryV4PreCreationConfig2.videoContainerWidth : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV4PreCreationConfig2.isBigStateInfo : false, (r32 & 256) != 0 ? galleryV4PreCreationConfig2.isVerticalStateUgc : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV4PreCreationConfig2.isCreateOnBoarding : true, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV4PreCreationConfig2.buttonsTintRes : null, (r32 & 2048) != 0 ? galleryV4PreCreationConfig2.icons : null, (r32 & 4096) != 0 ? galleryV4PreCreationConfig2.hasWave : false, (r32 & 8192) != 0 ? galleryV4PreCreationConfig2.hasVideoContent : false, (r32 & 16384) != 0 ? galleryV4PreCreationConfig2.hasDifferentContainers : false) : null;
        }
        if (onBoarding.getText().getText().length() > 20) {
            text = ((Object) h.p0(onBoarding.getText().getText(), 20)) + "...";
        } else {
            text = onBoarding.getText().getText();
        }
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(TextAtom.copy$default(onBoarding.getText(), OzonSpannableStringKt.toOzonSpannableString(text), null, null, 1, null, null, null, 118, null));
        int measuredWidth = AtomExtKt.getMeasuredWidth(dsTextAtom, this.context, C7714v.b0(Integer.valueOf(getDp8()), Integer.valueOf(getDp36()), Integer.valueOf(getDp8()), Integer.valueOf(getDp10())));
        Integer daysToShowAgain = onBoarding.getDaysToShowAgain();
        return new GalleryV4VO.Button.OnBoarding(onBoarding.getOnboardingId(), dsTextAtom, daysToShowAgain != null ? daysToShowAgain.intValue() : 0, measuredWidth, z11);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils
    public int calculateHeight(double d11, @NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.calculateHeight(this, d11, context);
    }

    public int calculateWidth(double d11, int i11) {
        return GalleryV4Utils.DefaultImpls.calculateWidth(this, d11, i11);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getDefaultGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    public int getDp10() {
        return GalleryV4Utils.DefaultImpls.getDp10(this);
    }

    public int getDp36() {
        return GalleryV4Utils.DefaultImpls.getDp36(this);
    }

    public int getDp8() {
        return GalleryV4Utils.DefaultImpls.getDp8(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public int getGalleryPadding() {
        return GalleryV4Utils.DefaultImpls.getGalleryPadding(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxVerticalStateRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinContainerRatio() {
        return GalleryV4Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    public int getPrefetchImageItemCount() {
        return GalleryV4Utils.DefaultImpls.getPrefetchImageItemCount(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public float getWavesAmount() {
        return GalleryV4Utils.DefaultImpls.getWavesAmount(this);
    }

    public boolean hasVerticalState(double d11) {
        return GalleryV4Utils.DefaultImpls.hasVerticalState(this, d11);
    }

    @NotNull
    public final List<GalleryV4VO> invokeUpdate() {
        Long l11;
        GalleryV4DTO galleryV4DTO = this.lastState;
        if (galleryV4DTO != null && (l11 = this.lastWidgetId) != null) {
            Pair pair = new Pair(galleryV4DTO, l11);
            GalleryV4DTO galleryV4DTO2 = (GalleryV4DTO) pair.a();
            long longValue = ((Number) pair.b()).longValue();
            GalleryV4PreCreationConfig galleryV4PreCreationConfig = new GalleryV4PreCreationConfig(calculateHeight(galleryV4DTO2.getGalleryRatio(), this.context), this.context.getResources().getDisplayMetrics().widthPixels, this.context.getResources().getDisplayMetrics().widthPixels - getGalleryPadding(), null, null, null, null, false, false, false, null, null, false, false, false, 32760, null);
            this.newConfig = galleryV4PreCreationConfig;
            List<GalleryV4VO.Item> galleryItemsVo = toGalleryItemsVo(galleryV4DTO2.getItems(), longValue, galleryV4PreCreationConfig, toAction(galleryV4DTO2.getFullViewDeeplink(), galleryV4DTO2.getTrackingInfo()), galleryV4DTO2.getGalleryRatio());
            String galleryId = galleryV4DTO2.getGalleryId();
            List<GalleryV4DTO.Button> buttons = galleryV4DTO2.getButtons();
            List<GalleryV4VO.Button> buttonsVo = buttons != null ? toButtonsVo(buttons, longValue) : null;
            GalleryV4PreCreationConfig galleryV4PreCreationConfig2 = this.newConfig;
            GalleryV4PreCreationConfig galleryV4PreCreationConfig3 = galleryV4PreCreationConfig2 == null ? galleryV4PreCreationConfig : galleryV4PreCreationConfig2;
            this.updateConfig.invoke(galleryV4PreCreationConfig3);
            String backgroundColor = galleryV4DTO2.getBackgroundColor();
            Map<String, TokenizedTrackingInfo> trackingInfo = galleryV4DTO2.getTrackingInfo();
            return C7714v.a0(new GalleryV4VO(longValue, galleryItemsVo, galleryV4PreCreationConfig3, galleryId, buttonsVo, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(longValue), null, 2, null) : null, null, UserVerificationMethods.USER_VERIFY_PATTERN, null));
        }
        return K.f71697a;
    }

    @NotNull
    public GalleryV4VO.GalleryIcon toIcon(@NotNull Icon icon, @NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.toIcon(this, icon, context);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<GalleryV4VO> invoke(@NotNull GalleryV4DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        this.lastState = state;
        this.lastWidgetId = Long.valueOf(hashCode);
        return invokeUpdate();
    }
}

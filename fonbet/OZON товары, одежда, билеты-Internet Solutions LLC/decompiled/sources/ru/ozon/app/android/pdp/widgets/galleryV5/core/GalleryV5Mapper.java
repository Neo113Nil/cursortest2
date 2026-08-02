package ru.ozon.app.android.pdp.widgets.galleryV5.core;

import Sc.o;
import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.pdp.utils.AtomActionExtKt;
import ru.ozon.app.android.pdp.utils.AtomExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV5.data.GalleryV5ButtonsOnBoardingRepository;
import ru.ozon.app.android.pdp.widgets.galleryV5.data.GalleryV5DTO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerStateKt;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 W2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u00020\u0007:\u0001WB;\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004*\b\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J)\u0010'\u001a\u00020&*\u00020\"2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002¢\u0006\u0004\b'\u0010(J?\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0004*\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020&2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100JG\u00109\u001a\u0002082\u0006\u00101\u001a\u00020)2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b9\u0010:JG\u0010=\u001a\u00020<2\u0006\u00101\u001a\u00020)2\u0006\u00103\u001a\u00020;2\u0006\u00105\u001a\u0002042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b=\u0010>JU\u0010B\u001a\u00020.2\u0006\u00101\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u000f2\u0006\u00107\u001a\u0002042\f\u0010A\u001a\b\u0012\u0004\u0012\u0002040@2\u0006\u00106\u001a\u0002042\u0006\u0010+\u001a\u00020&H\u0002¢\u0006\u0004\bB\u0010CJ\u001b\u0010G\u001a\u00020F*\u00020D2\u0006\u0010E\u001a\u00020\u0012H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010J\u001a\u0004\u0018\u00010,*\u00020,2\b\u0010I\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010NR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010S\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/core/GalleryV5Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/widgets/galleryV5/utils/GalleryV5Utils;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5ButtonsOnBoardingRepository;", "buttonsOnBoardingRepository", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "", "updateConfig", "", "isSingleButton", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5ButtonsOnBoardingRepository;Lkotlin/jvm/functions/Function1;Z)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO;Ll20/d;)Ljava/util/List;", "invokeUpdate", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button;", "", "widgetId", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "toButtonsVo", "(Ljava/util/List;J)Ljava/util/List;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "toAction", "(Ljava/lang/String;Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem;", "config", "action", "", "galleryRatio", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item;", "toGalleryItemsVo", "(Ljava/util/List;JLru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;Lru/ozon/uni/atoms/af/AtomAction;D)Ljava/util/List;", "galleryItem", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Ugc;", "content", "", "height", "width", "index", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Ugc;", "createUgcItem", "(Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Ugc;IJIID)Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Info;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Info;", "createInfoItem", "(Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Info;IJIID)Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Info;", ImagesContract.URL, "Ljava/util/Queue;", "containerWidthQueue", "createImageItem", "(Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem;JLjava/lang/String;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;ILjava/util/Queue;ILru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button$OnBoarding;", "notHidableOnboarding", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button$OnBoarding;", "toOnBoardingVo", "(Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button$OnBoarding;Z)Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button$OnBoarding;", "containerRatio", "checkingEqualImageContainerOrNull", "(DLjava/lang/Double;)Ljava/lang/Double;", "Landroid/content/Context;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5ButtonsOnBoardingRepository;", "Lkotlin/jvm/functions/Function1;", "Z", "newConfig", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "lastState", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO;", "lastWidgetId", "Ljava/lang/Long;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5Mapper implements Function2<GalleryV5DTO, d, List<? extends GalleryV5VO>>, GalleryV5Utils {

    @NotNull
    private final AppType appType;

    @NotNull
    private final GalleryV5ButtonsOnBoardingRepository buttonsOnBoardingRepository;

    @NotNull
    private final Context context;
    private final boolean isSingleButton;
    private GalleryV5DTO lastState;
    private Long lastWidgetId;
    private GalleryV5PreCreationConfig newConfig;

    @NotNull
    private final Function1<GalleryV5PreCreationConfig, Unit> updateConfig;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/core/GalleryV5Mapper$Companion;", "", "<init>", "()V", "MAX_ON_BOARDING_LENGTH", "", "EMPTY_PREVIEW_CONTAINER_RATIO", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV5Mapper(@NotNull Context context, @NotNull AppType appType, @NotNull GalleryV5ButtonsOnBoardingRepository buttonsOnBoardingRepository, @NotNull Function1<? super GalleryV5PreCreationConfig, Unit> updateConfig, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(buttonsOnBoardingRepository, "buttonsOnBoardingRepository");
        Intrinsics.checkNotNullParameter(updateConfig, "updateConfig");
        this.context = context;
        this.appType = appType;
        this.buttonsOnBoardingRepository = buttonsOnBoardingRepository;
        this.updateConfig = updateConfig;
        this.isSingleButton = z11;
    }

    private final Double checkingEqualImageContainerOrNull(double d11, Double d12) {
        if (d11 == -1.0d && d12 != null) {
            return d12;
        }
        if (d12 != null && d11 == d12.doubleValue()) {
            return d12;
        }
        GalleryV5PreCreationConfig galleryV5PreCreationConfig = this.newConfig;
        this.newConfig = galleryV5PreCreationConfig != null ? GalleryV5PreCreationConfig.copy$default(galleryV5PreCreationConfig, 0, 0, 0, null, null, null, null, false, false, false, null, null, false, false, true, false, false, false, 245759, null) : null;
        return null;
    }

    private final GalleryV5VO.Item createImageItem(GalleryV5DTO.GalleryItem galleryItem, long widgetId, String url, GalleryV5PreCreationConfig config, int index, Queue<Integer> containerWidthQueue, int width, AtomAction action) {
        GalleryV5PreCreationConfig galleryV5PreCreationConfig;
        if (index < getPrefetchImageItemCount()) {
            containerWidthQueue.add(Integer.valueOf(width));
        } else {
            GalleryV5PreCreationConfig galleryV5PreCreationConfig2 = this.newConfig;
            if (galleryV5PreCreationConfig2 != null) {
                Integer peek = containerWidthQueue.peek();
                galleryV5PreCreationConfig = GalleryV5PreCreationConfig.copy$default(galleryV5PreCreationConfig2, 0, 0, peek != null ? peek.intValue() : config.getDefaultContainersWidth(), containerWidthQueue, null, null, null, false, false, false, null, null, false, false, false, false, false, false, 262131, null);
            } else {
                galleryV5PreCreationConfig = null;
            }
            this.newConfig = galleryV5PreCreationConfig;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(widgetId), null) : null;
        GalleryV5VO.ContainerConfig containerConfig = new GalleryV5VO.ContainerConfig(config.getHeight(), width);
        int ordinal = ((galleryItem.getHasWaves() && index == 0) ? GalleryV5VO.ItemViewType.WAVE_IMAGE : GalleryV5VO.ItemViewType.IMAGE).ordinal();
        Map<String, TokenizedTrackingInfo> zoomTrackingInfo = galleryItem.getZoomTrackingInfo();
        return new GalleryV5VO.Item.Image(index, widgetId, ordinal, containerConfig, action, b11, url, zoomTrackingInfo != null ? x.b(zoomTrackingInfo, Long.valueOf(widgetId), null) : null);
    }

    private final GalleryV5VO.Item.Info createInfoItem(GalleryV5DTO.GalleryItem galleryItem, GalleryV5DTO.GalleryItem.ContentWrapper.Info content, int height, long widgetId, int width, int index, double galleryRatio) {
        Double containerRatio = galleryItem.getContainerRatio();
        boolean hasVerticalState = hasVerticalState(containerRatio != null ? containerRatio.doubleValue() : galleryRatio);
        GalleryV5PreCreationConfig galleryV5PreCreationConfig = this.newConfig;
        this.newConfig = galleryV5PreCreationConfig != null ? GalleryV5PreCreationConfig.copy$default(galleryV5PreCreationConfig, 0, 0, 0, null, Integer.valueOf(width), null, null, hasVerticalState, false, false, null, null, false, false, false, false, false, false, 261999, null) : null;
        GalleryV5VO.ContainerConfig containerConfig = new GalleryV5VO.ContainerConfig(height, width);
        Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(widgetId), null) : null;
        Icon icon = content.getIcon();
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(content.getTitle(), null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, 3, null, false, 3581, null);
        String backgroundColor = content.getBackgroundColor();
        AtomActionDTO action = galleryItem.getAction();
        return new GalleryV5VO.Item.Info(index, widgetId, 0, containerConfig, action != null ? AtomActionMapperKt.toAtomAction(action, galleryItem.getTrackingInfo()) : null, b11, dsTextAtom$default, icon, backgroundColor, hasVerticalState, 4, null);
    }

    private final GalleryV5VO.Item.Ugc createUgcItem(GalleryV5DTO.GalleryItem galleryItem, GalleryV5DTO.GalleryItem.ContentWrapper.Ugc content, int height, long widgetId, int width, int index, double galleryRatio) {
        Double containerRatio = galleryItem.getContainerRatio();
        boolean hasVerticalState = hasVerticalState(containerRatio != null ? containerRatio.doubleValue() : galleryRatio);
        GalleryV5PreCreationConfig galleryV5PreCreationConfig = this.newConfig;
        this.newConfig = galleryV5PreCreationConfig != null ? GalleryV5PreCreationConfig.copy$default(galleryV5PreCreationConfig, 0, 0, 0, null, null, Integer.valueOf(width), null, false, hasVerticalState, false, null, null, false, false, false, false, false, false, 261855, null) : null;
        GalleryV5VO.ContainerConfig containerConfig = new GalleryV5VO.ContainerConfig(height, width);
        Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(widgetId), null) : null;
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(content.getTitle(), null, null, null, null, null, null, null, null, null, 1, null, false, 3583, null);
        String backgroundColor = content.getBackgroundColor();
        AtomActionDTO action = galleryItem.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, galleryItem.getTrackingInfo()) : null;
        String previewUrl = content.getPreviewUrl();
        TextDTO dsTextAtom$default2 = TextMapperKt.dsTextAtom$default(content.getSubtitle(), null, null, null, null, null, null, null, null, null, Integer.valueOf(hasVerticalState ? 2 : 3), null, false, 3583, null);
        GalleryV5VO.GalleryIcon icon = toIcon(content.getTitleIcon(), this.context);
        Icon previewIcon = content.getPreviewIcon();
        return new GalleryV5VO.Item.Ugc(index, widgetId, 0, containerConfig, atomAction, b11, previewUrl, previewIcon != null ? toIcon(previewIcon, this.context) : null, dsTextAtom$default, icon, dsTextAtom$default2, hasVerticalState, new Size(width, height), backgroundColor, 4, null);
    }

    private final AtomAction toAction(String str, Map<String, TokenizedTrackingInfo> map) {
        return AtomActionMapperKt.toAtomAction(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, str, null, null, 12, null), map);
    }

    private final List<GalleryV5VO.Button> toButtonsVo(List<GalleryV5DTO.Button> list, long j11) {
        boolean booleanValue;
        int ordinal;
        List<GalleryV5DTO.Button> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            GalleryV5DTO.Button button = (GalleryV5DTO.Button) obj;
            if (button.getIcon() != null || button.getOnboarding() == null) {
                Boolean notHidableOnboarding = button.getNotHidableOnboarding();
                booleanValue = notHidableOnboarding != null ? notHidableOnboarding.booleanValue() : false;
            } else {
                booleanValue = true;
            }
            GalleryV5DTO.Button.OnBoarding onboarding = button.getOnboarding();
            GalleryV5VO.Button.OnBoarding onBoardingVo = onboarding != null ? toOnBoardingVo(onboarding, booleanValue) : null;
            boolean canShown = onBoardingVo != null ? this.buttonsOnBoardingRepository.canShown(onBoardingVo.getId(), onBoardingVo.getDaysToShowAgain()) : false;
            if (onBoardingVo != null && button.getIcon() == null) {
                GalleryV5PreCreationConfig galleryV5PreCreationConfig = this.newConfig;
                if (galleryV5PreCreationConfig != null && !galleryV5PreCreationConfig.getIsCreateOnBoarding()) {
                    GalleryV5PreCreationConfig galleryV5PreCreationConfig2 = this.newConfig;
                    this.newConfig = galleryV5PreCreationConfig2 != null ? GalleryV5PreCreationConfig.copy$default(galleryV5PreCreationConfig2, 0, 0, 0, null, null, null, null, false, false, true, null, null, false, false, false, false, false, false, 261631, null) : null;
                }
                ordinal = GalleryV5VO.ButtonViewType.ON_BOARDING.ordinal();
            } else if ((button.getIcon() == null || booleanValue || !canShown) && (button.getIcon() == null || !booleanValue)) {
                ordinal = GalleryV5VO.ButtonViewType.SINGLE_ICON.ordinal();
            } else {
                GalleryV5PreCreationConfig galleryV5PreCreationConfig3 = this.newConfig;
                if (galleryV5PreCreationConfig3 != null && !galleryV5PreCreationConfig3.getIsCreateOnBoarding()) {
                    GalleryV5PreCreationConfig galleryV5PreCreationConfig4 = this.newConfig;
                    this.newConfig = galleryV5PreCreationConfig4 != null ? GalleryV5PreCreationConfig.copy$default(galleryV5PreCreationConfig4, 0, 0, 0, null, null, null, null, false, false, true, null, null, false, false, false, false, false, false, 261631, null) : null;
                }
                ordinal = GalleryV5VO.ButtonViewType.ON_BOARDING_ICON.ordinal();
            }
            Icon icon = button.getIcon();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(AtomActionExtKt.withUrlEncodedParameter$default(button.getAction(), button.getTemplateLink(), button.getPlaceholderValue(), null, 4, null), null);
            String backgroundColor = button.getBackgroundColor();
            Map<String, TokenizedTrackingInfo> trackingInfo = button.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = x.b(trackingInfo, Long.valueOf(j11), null);
            }
            arrayList.add(new GalleryV5VO.Button(i11, ordinal, icon, atomAction, onBoardingVo, backgroundColor, tVar));
            i11 = i12;
        }
        return arrayList;
    }

    private final List<GalleryV5VO.Item> toGalleryItemsVo(List<GalleryV5DTO.GalleryItem> list, long j11, GalleryV5PreCreationConfig galleryV5PreCreationConfig, AtomAction atomAction, double d11) {
        LinkedList linkedList;
        GalleryV5VO.Item video;
        Map<String, TokenizedTrackingInfo> endVideo;
        Map<String, TokenizedTrackingInfo> startVideo;
        GalleryV5Mapper galleryV5Mapper = this;
        LinkedList linkedList2 = new LinkedList();
        Double valueOf = Double.valueOf(-1.0d);
        List<GalleryV5DTO.GalleryItem> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Double d12 = valueOf;
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            t tVar = null;
            tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            GalleryV5DTO.GalleryItem galleryItem = (GalleryV5DTO.GalleryItem) obj;
            int calculateWidth = list.size() != 1 ? galleryV5Mapper.calculateWidth(galleryItem.getContainerRatio(), galleryV5Mapper.context, galleryV5PreCreationConfig.getHeight()) : galleryV5Mapper.context.getResources().getDisplayMetrics().widthPixels;
            if (galleryItem.getHasWaves() && i11 == 0) {
                GalleryV5PreCreationConfig galleryV5PreCreationConfig2 = galleryV5Mapper.newConfig;
                galleryV5Mapper.newConfig = galleryV5PreCreationConfig2 != null ? GalleryV5PreCreationConfig.copy$default(galleryV5PreCreationConfig2, 0, 0, 0, null, null, null, null, false, false, false, null, null, true, false, false, false, false, false, 258047, null) : null;
            }
            GalleryV5DTO.GalleryItem.ContentWrapper content = galleryItem.getContent();
            if (content instanceof GalleryV5DTO.GalleryItem.ContentWrapper.Image) {
                d12 = d12 != null ? galleryV5Mapper.checkingEqualImageContainerOrNull(d12.doubleValue(), galleryItem.getContainerRatio()) : null;
                video = galleryV5Mapper.createImageItem(galleryItem, j11, ((GalleryV5DTO.GalleryItem.ContentWrapper.Image) galleryItem.getContent()).getUrl(), galleryV5PreCreationConfig, i11, linkedList2, calculateWidth, atomAction);
                linkedList = linkedList2;
                galleryV5Mapper = this;
            } else {
                linkedList = linkedList2;
                int i13 = i11;
                if (content instanceof GalleryV5DTO.GalleryItem.ContentWrapper.Info) {
                    galleryV5Mapper = this;
                    video = galleryV5Mapper.createInfoItem(galleryItem, (GalleryV5DTO.GalleryItem.ContentWrapper.Info) galleryItem.getContent(), galleryV5PreCreationConfig.getHeight(), j11, calculateWidth, i13, d11);
                } else if (content instanceof GalleryV5DTO.GalleryItem.ContentWrapper.Ugc) {
                    galleryV5Mapper = this;
                    video = galleryV5Mapper.createUgcItem(galleryItem, (GalleryV5DTO.GalleryItem.ContentWrapper.Ugc) galleryItem.getContent(), galleryV5PreCreationConfig.getHeight(), j11, calculateWidth, i13, d11);
                } else {
                    galleryV5Mapper = this;
                    if (!(content instanceof GalleryV5DTO.GalleryItem.ContentWrapper.Video)) {
                        throw new o();
                    }
                    Double checkingEqualImageContainerOrNull = d12 != null ? galleryV5Mapper.checkingEqualImageContainerOrNull(d12.doubleValue(), galleryItem.getContainerRatio()) : null;
                    GalleryV5PreCreationConfig galleryV5PreCreationConfig3 = galleryV5Mapper.newConfig;
                    if ((galleryV5PreCreationConfig3 != null ? galleryV5PreCreationConfig3.getVideoContainerWidth() : null) == null) {
                        GalleryV5PreCreationConfig galleryV5PreCreationConfig4 = galleryV5Mapper.newConfig;
                        galleryV5Mapper.newConfig = galleryV5PreCreationConfig4 != null ? GalleryV5PreCreationConfig.copy$default(galleryV5PreCreationConfig4, 0, 0, 0, null, null, null, Integer.valueOf(calculateWidth), false, false, false, null, null, false, true, false, false, false, false, 253887, null) : null;
                    }
                    int ordinal = ((i13 == 0 && galleryItem.getHasWaves()) ? GalleryV5VO.ItemViewType.WAVE_VIDEO : GalleryV5VO.ItemViewType.VIDEO).ordinal();
                    GalleryV5VO.ContainerConfig containerConfig = new GalleryV5VO.ContainerConfig(galleryV5PreCreationConfig.getHeight(), calculateWidth);
                    Map<String, TokenizedTrackingInfo> trackingInfo = galleryItem.getTrackingInfo();
                    t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null;
                    VideoMolecule video2 = ((GalleryV5DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).getVideo();
                    PlayerStateKt.updateShouldRepeat(video2, true);
                    Unit unit = Unit.f71690a;
                    String previewUrl = ((GalleryV5DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).getPreviewUrl();
                    Boolean isAutoPlay = ((GalleryV5DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).isAutoPlay();
                    boolean booleanValue = isAutoPlay != null ? isAutoPlay.booleanValue() : true;
                    GalleryV5DTO.GalleryItem.VideoTrackingInfo videoTrackingInfo = ((GalleryV5DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).getVideoTrackingInfo();
                    t b12 = (videoTrackingInfo == null || (startVideo = videoTrackingInfo.getStartVideo()) == null) ? null : x.b(startVideo, Long.valueOf(j11), null);
                    GalleryV5DTO.GalleryItem.VideoTrackingInfo videoTrackingInfo2 = ((GalleryV5DTO.GalleryItem.ContentWrapper.Video) galleryItem.getContent()).getVideoTrackingInfo();
                    if (videoTrackingInfo2 != null && (endVideo = videoTrackingInfo2.getEndVideo()) != null) {
                        tVar = x.b(endVideo, Long.valueOf(j11), null);
                    }
                    d12 = checkingEqualImageContainerOrNull;
                    video = new GalleryV5VO.Item.Video(i13, j11, ordinal, containerConfig, atomAction, b11, video2, previewUrl, booleanValue, new GalleryV5VO.VideoEvents(b12, tVar));
                }
            }
            arrayList.add(video);
            i11 = i12;
            linkedList2 = linkedList;
        }
        return arrayList;
    }

    private final GalleryV5VO.Button.OnBoarding toOnBoardingVo(GalleryV5DTO.Button.OnBoarding onBoarding, boolean z11) {
        CharSequence text;
        if (onBoarding.getText().getText().length() > 20) {
            text = ((Object) h.p0(onBoarding.getText().getText(), 20)) + "...";
        } else {
            text = onBoarding.getText().getText();
        }
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(TextAtom.copy$default(onBoarding.getText(), OzonSpannableStringKt.toOzonSpannableString(text), null, null, 1, null, null, null, 118, null));
        int measuredWidth = AtomExtKt.getMeasuredWidth(dsTextAtom, this.context, C7714v.b0(Integer.valueOf(getDp8()), Integer.valueOf(getDp36()), Integer.valueOf(getDp8()), Integer.valueOf(getDp10())));
        Integer daysToShowAgain = onBoarding.getDaysToShowAgain();
        return new GalleryV5VO.Button.OnBoarding(onBoarding.getOnboardingId(), dsTextAtom, daysToShowAgain != null ? daysToShowAgain.intValue() : 0, measuredWidth, z11);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils
    public int calculateHeight(Double d11, @NotNull Context context, double d12) {
        return GalleryV5Utils.DefaultImpls.calculateHeight(this, d11, context, d12);
    }

    public int calculateWidth(Double d11, @NotNull Context context, int i11) {
        return GalleryV5Utils.DefaultImpls.calculateWidth(this, d11, context, i11);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getDefaultGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    public int getDp10() {
        return GalleryV5Utils.DefaultImpls.getDp10(this);
    }

    public int getDp36() {
        return GalleryV5Utils.DefaultImpls.getDp36(this);
    }

    public int getDp8() {
        return GalleryV5Utils.DefaultImpls.getDp8(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxVerticalStateRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinContainerRatio() {
        return GalleryV5Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    public int getPrefetchImageItemCount() {
        return GalleryV5Utils.DefaultImpls.getPrefetchImageItemCount(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public float getWavesAmount() {
        return GalleryV5Utils.DefaultImpls.getWavesAmount(this);
    }

    public boolean hasVerticalState(double d11) {
        return GalleryV5Utils.DefaultImpls.hasVerticalState(this, d11);
    }

    @NotNull
    public final List<GalleryV5VO> invokeUpdate() {
        Long l11;
        GalleryV5DTO.Button button;
        GalleryV5DTO galleryV5DTO = this.lastState;
        if (galleryV5DTO != null && (l11 = this.lastWidgetId) != null) {
            Pair pair = new Pair(galleryV5DTO, l11);
            GalleryV5DTO galleryV5DTO2 = (GalleryV5DTO) pair.a();
            long longValue = ((Number) pair.b()).longValue();
            int calculateHeight = calculateHeight(galleryV5DTO2.getContainerRatioOrDefault(), this.context, galleryV5DTO2.getGalleryRatioOrDefault());
            int i11 = this.context.getResources().getDisplayMetrics().widthPixels;
            int i12 = this.context.getResources().getDisplayMetrics().widthPixels;
            List<GalleryV5DTO.Button> buttons = galleryV5DTO2.getButtons();
            GalleryV5PreCreationConfig galleryV5PreCreationConfig = new GalleryV5PreCreationConfig(calculateHeight, i11, i12, null, null, null, null, false, false, false, (buttons == null || (button = (GalleryV5DTO.Button) C7714v.M(buttons)) == null) ? null : button.getBackgroundColor(), null, false, false, false, galleryV5DTO2.getZoom() != null, this.appType == AppType.SELECT, this.isSingleButton, 31736, null);
            this.newConfig = galleryV5PreCreationConfig;
            List<GalleryV5VO.Item> galleryItemsVo = toGalleryItemsVo(galleryV5DTO2.getItems(), longValue, galleryV5PreCreationConfig, toAction(galleryV5DTO2.getFullViewDeeplink(), galleryV5DTO2.getTrackingInfo()), galleryV5DTO2.getGalleryRatioOrDefault());
            String galleryId = galleryV5DTO2.getGalleryId();
            List<GalleryV5DTO.Button> buttons2 = galleryV5DTO2.getButtons();
            List<GalleryV5VO.Button> buttonsVo = buttons2 != null ? toButtonsVo(buttons2, longValue) : null;
            GalleryV5PreCreationConfig galleryV5PreCreationConfig2 = this.newConfig;
            GalleryV5PreCreationConfig galleryV5PreCreationConfig3 = galleryV5PreCreationConfig2 == null ? galleryV5PreCreationConfig : galleryV5PreCreationConfig2;
            this.updateConfig.invoke(galleryV5PreCreationConfig3);
            String backgroundColor = galleryV5DTO2.getBackgroundColor();
            Map<String, TokenizedTrackingInfo> trackingInfo = galleryV5DTO2.getTrackingInfo();
            t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(longValue), null) : null;
            GalleryV5DTO.Zoom zoom = galleryV5DTO2.getZoom();
            return C7714v.a0(new GalleryV5VO(longValue, galleryItemsVo, galleryV5PreCreationConfig3, galleryId, buttonsVo, backgroundColor, b11, null, zoom != null ? new GalleryV5VO.Zoom(zoom.getOnboardingTitle()) : null, UserVerificationMethods.USER_VERIFY_PATTERN, null));
        }
        return K.f71697a;
    }

    @NotNull
    public GalleryV5VO.GalleryIcon toIcon(@NotNull Icon icon, @NotNull Context context) {
        return GalleryV5Utils.DefaultImpls.toIcon(this, icon, context);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<GalleryV5VO> invoke(@NotNull GalleryV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        this.lastState = state;
        this.lastWidgetId = Long.valueOf(hashCode);
        return invokeUpdate();
    }
}

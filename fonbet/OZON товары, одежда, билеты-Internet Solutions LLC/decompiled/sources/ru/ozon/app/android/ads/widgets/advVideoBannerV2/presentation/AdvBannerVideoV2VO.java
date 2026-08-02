package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import Ak.C2436a;
import B0.C2454a;
import G.g;
import Gl.C3124a;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.analytics.SwitchModeTracking;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2TrackerAnalyticsDelegate;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2DTO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.ProductType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b@\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005ijklmBÃ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010*R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b7\u0010*R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b8\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010AR(\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010B\u0012\u0004\bG\u0010H\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010\u0011\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010B\u0012\u0004\bJ\u0010H\u001a\u0004\b\u0011\u0010D\"\u0004\bI\u0010FR\"\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\bK\u00104\"\u0004\bL\u0010MR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bO\u0010PR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010 \u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b \u0010B\u001a\u0004\b`\u0010DR\u0017\u0010!\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b!\u0010B\u001a\u0004\ba\u0010DR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010$\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\be\u0010*R\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010f\u001a\u0004\bg\u0010h¨\u0006n"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "playlistUrl", "previewUrl", "deeplink", "", "initialVolume", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "tokenizedEvents", "Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "switchVolumeTracking", "", "volumeOn", "isVisible", "position", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixel", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;", "productType", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$SmallPreviewProduct;", "previewProduct", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackShotVO;", "packshotVO", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "legalInformation", "videoCoverDisabled", "disableOverlayDisclaimer", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackshotOptions;", "packshotOptions", "backgroundColor", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;", "designOptions", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;ZZJLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$SmallPreviewProduct;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackShotVO;Lru/ozon/uni/atoms/data/texts/TextAtom;ZZLru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackshotOptions;Ljava/lang/String;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getPlaylistUrl", "getPreviewUrl", "getDeeplink", "F", "getInitialVolume", "()F", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "getTokenizedEvents", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "getSwitchVolumeTracking", "()Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "Z", "getVolumeOn", "()Z", "setVolumeOn", "(Z)V", "getVolumeOn$annotations", "()V", "setVisible", "isVisible$annotations", "getPosition", "setPosition", "(J)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getPixel", "()Ljava/util/List;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;", "getProductType", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$SmallPreviewProduct;", "getPreviewProduct", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$SmallPreviewProduct;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackShotVO;", "getPackshotVO", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackShotVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getLegalInformation", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getVideoCoverDisabled", "getDisableOverlayDisclaimer", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackshotOptions;", "getPackshotOptions", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackshotOptions;", "getBackgroundColor", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;", "getDesignOptions", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;", "SmallPreviewProduct", "TextWrapper", "PackShotVO", "TokenizedEvents", "PackshotOptions", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdvBannerVideoV2VO implements c {
    private final String backgroundColor;

    @NotNull
    private final BadgeDTO badge;

    @NotNull
    private final String deeplink;
    private final AdvVideoBannerV2DTO.DesignOptions designOptions;
    private final boolean disableOverlayDisclaimer;
    private final long id;
    private final float initialVolume;
    private boolean isVisible;
    private final TextAtom legalInformation;
    private final PackshotOptions packshotOptions;
    private final PackShotVO packshotVO;
    private final List<Pixel> pixel;

    @NotNull
    private final String playlistUrl;
    private long position;
    private final SmallPreviewProduct previewProduct;

    @NotNull
    private final String previewUrl;

    @NotNull
    private final ProductType productType;

    @NotNull
    private final SwitchModeTracking switchVolumeTracking;

    @NotNull
    private final TokenizedEvents tokenizedEvents;
    private final boolean videoCoverDisabled;
    private boolean volumeOn;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b,\u0010\u0016¨\u0006-"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackShotVO;", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "eventType", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "mainState", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "marginEnd", "marginStart", "<init>", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/List;LWZ/t;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "getEventType", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/List;", "getMainState", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "I", "getMarginEnd", "getMarginStart", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class PackShotVO {
        private final AtomAction action;

        @NotNull
        private final AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final List<Object> mainState;
        private final int marginEnd;
        private final int marginStart;
        private final t tokenizedEvent;

        public PackShotVO(@NotNull AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType, @NotNull ImageDTO image, AtomAction atomAction, @NotNull List<? extends Object> mainState, t tVar, int i11, int i12) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(mainState, "mainState");
            this.eventType = eventType;
            this.image = image;
            this.action = atomAction;
            this.mainState = mainState;
            this.tokenizedEvent = tVar;
            this.marginEnd = i11;
            this.marginStart = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackShotVO)) {
                return false;
            }
            PackShotVO packShotVO = (PackShotVO) other;
            return this.eventType == packShotVO.eventType && Intrinsics.d(this.image, packShotVO.image) && Intrinsics.d(this.action, packShotVO.action) && Intrinsics.d(this.mainState, packShotVO.mainState) && Intrinsics.d(this.tokenizedEvent, packShotVO.tokenizedEvent) && this.marginEnd == packShotVO.marginEnd && this.marginStart == packShotVO.marginStart;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final AdvVideoBannerV2TrackerAnalyticsDelegate.EventType getEventType() {
            return this.eventType;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final List<Object> getMainState() {
            return this.mainState;
        }

        public final int getMarginEnd() {
            return this.marginEnd;
        }

        public final int getMarginStart() {
            return this.marginStart;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int b11 = Nh.a.b(this.image, this.eventType.hashCode() * 31, 31);
            AtomAction atomAction = this.action;
            int b12 = g.b((b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.mainState);
            t tVar = this.tokenizedEvent;
            return Integer.hashCode(this.marginStart) + C2454a.a(this.marginEnd, (b12 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType = this.eventType;
            ImageDTO imageDTO = this.image;
            AtomAction atomAction = this.action;
            List<Object> list = this.mainState;
            t tVar = this.tokenizedEvent;
            int i11 = this.marginEnd;
            int i12 = this.marginStart;
            StringBuilder sb2 = new StringBuilder("PackShotVO(eventType=");
            sb2.append(eventType);
            sb2.append(", image=");
            sb2.append(imageDTO);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", mainState=");
            sb2.append(list);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", marginEnd=");
            sb2.append(i11);
            sb2.append(", marginStart=");
            return K00.b.e(i12, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$PackshotOptions;", "", "", "lastFrameUrl", "", "isLastFrameBlurred", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLastFrameUrl", "Z", "()Z", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PackshotOptions {
        private final boolean isLastFrameBlurred;
        private final String lastFrameUrl;

        public PackshotOptions(String str, boolean z11) {
            this.lastFrameUrl = str;
            this.isLastFrameBlurred = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackshotOptions)) {
                return false;
            }
            PackshotOptions packshotOptions = (PackshotOptions) other;
            return Intrinsics.d(this.lastFrameUrl, packshotOptions.lastFrameUrl) && this.isLastFrameBlurred == packshotOptions.isLastFrameBlurred;
        }

        public final String getLastFrameUrl() {
            return this.lastFrameUrl;
        }

        public int hashCode() {
            String str = this.lastFrameUrl;
            return Boolean.hashCode(this.isLastFrameBlurred) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        /* renamed from: isLastFrameBlurred, reason: from getter */
        public final boolean getIsLastFrameBlurred() {
            return this.isLastFrameBlurred;
        }

        @NotNull
        public String toString() {
            return Ak.b.f("PackshotOptions(lastFrameUrl=", this.lastFrameUrl, ", isLastFrameBlurred=", ")", this.isLastFrameBlurred);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$SmallPreviewProduct;", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "eventType", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "state", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "copy", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$SmallPreviewProduct;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "getEventType", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/util/List;", "getState", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class SmallPreviewProduct {
        private final AtomAction action;

        @NotNull
        private final AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final List<Object> state;
        private final t tokenizedEvent;

        public SmallPreviewProduct(@NotNull AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType, @NotNull ImageDTO image, @NotNull List<? extends Object> state, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(state, "state");
            this.eventType = eventType;
            this.image = image;
            this.state = state;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public static /* synthetic */ SmallPreviewProduct copy$default(SmallPreviewProduct smallPreviewProduct, AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType, ImageDTO imageDTO, List list, AtomAction atomAction, t tVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eventType = smallPreviewProduct.eventType;
            }
            if ((i11 & 2) != 0) {
                imageDTO = smallPreviewProduct.image;
            }
            if ((i11 & 4) != 0) {
                list = smallPreviewProduct.state;
            }
            if ((i11 & 8) != 0) {
                atomAction = smallPreviewProduct.action;
            }
            if ((i11 & 16) != 0) {
                tVar = smallPreviewProduct.tokenizedEvent;
            }
            t tVar2 = tVar;
            List list2 = list;
            return smallPreviewProduct.copy(eventType, imageDTO, list2, atomAction, tVar2);
        }

        @NotNull
        public final SmallPreviewProduct copy(@NotNull AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType, @NotNull ImageDTO image, @NotNull List<? extends Object> state, AtomAction action, t tokenizedEvent) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(state, "state");
            return new SmallPreviewProduct(eventType, image, state, action, tokenizedEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmallPreviewProduct)) {
                return false;
            }
            SmallPreviewProduct smallPreviewProduct = (SmallPreviewProduct) other;
            return this.eventType == smallPreviewProduct.eventType && Intrinsics.d(this.image, smallPreviewProduct.image) && Intrinsics.d(this.state, smallPreviewProduct.state) && Intrinsics.d(this.action, smallPreviewProduct.action) && Intrinsics.d(this.tokenizedEvent, smallPreviewProduct.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final AdvVideoBannerV2TrackerAnalyticsDelegate.EventType getEventType() {
            return this.eventType;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final List<Object> getState() {
            return this.state;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int b11 = g.b(Nh.a.b(this.image, this.eventType.hashCode() * 31, 31), 31, this.state);
            AtomAction atomAction = this.action;
            int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType = this.eventType;
            ImageDTO imageDTO = this.image;
            List<Object> list = this.state;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("SmallPreviewProduct(eventType=");
            sb2.append(eventType);
            sb2.append(", image=");
            sb2.append(imageDTO);
            sb2.append(", state=");
            sb2.append(list);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", tokenizedEvent=");
            return Tl.b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TextWrapper;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class TextWrapper {

        @NotNull
        private final TextAtom text;

        public TextWrapper(@NotNull TextAtom text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextWrapper) && Intrinsics.d(this.text, ((TextWrapper) other).text);
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return "TextWrapper(text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\t\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001b\u0010\u0007\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001b\u0010\t\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001b\u0010\n\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001b\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "videoView", "videoStart", "videoClick", "videoQ1", "videoQ2", "videoQ3", "videoEnd", "videoViewableImpressions", "<init>", "(LWZ/t;LWZ/t;LWZ/t;LWZ/t;LWZ/t;LWZ/t;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getVideoView", "()LWZ/t;", "getVideoStart", "getVideoClick", "getVideoQ1", "getVideoQ2", "getVideoQ3", "getVideoEnd", "getVideoViewableImpressions", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TokenizedEvents {

        @NotNull
        private final t videoClick;

        @NotNull
        private final t videoEnd;

        @NotNull
        private final t videoQ1;

        @NotNull
        private final t videoQ2;

        @NotNull
        private final t videoQ3;

        @NotNull
        private final t videoStart;

        @NotNull
        private final t videoView;

        @NotNull
        private final t videoViewableImpressions;

        public TokenizedEvents(@NotNull t videoView, @NotNull t videoStart, @NotNull t videoClick, @NotNull t videoQ1, @NotNull t videoQ2, @NotNull t videoQ3, @NotNull t videoEnd, @NotNull t videoViewableImpressions) {
            Intrinsics.checkNotNullParameter(videoView, "videoView");
            Intrinsics.checkNotNullParameter(videoStart, "videoStart");
            Intrinsics.checkNotNullParameter(videoClick, "videoClick");
            Intrinsics.checkNotNullParameter(videoQ1, "videoQ1");
            Intrinsics.checkNotNullParameter(videoQ2, "videoQ2");
            Intrinsics.checkNotNullParameter(videoQ3, "videoQ3");
            Intrinsics.checkNotNullParameter(videoEnd, "videoEnd");
            Intrinsics.checkNotNullParameter(videoViewableImpressions, "videoViewableImpressions");
            this.videoView = videoView;
            this.videoStart = videoStart;
            this.videoClick = videoClick;
            this.videoQ1 = videoQ1;
            this.videoQ2 = videoQ2;
            this.videoQ3 = videoQ3;
            this.videoEnd = videoEnd;
            this.videoViewableImpressions = videoViewableImpressions;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenizedEvents)) {
                return false;
            }
            TokenizedEvents tokenizedEvents = (TokenizedEvents) other;
            return Intrinsics.d(this.videoView, tokenizedEvents.videoView) && Intrinsics.d(this.videoStart, tokenizedEvents.videoStart) && Intrinsics.d(this.videoClick, tokenizedEvents.videoClick) && Intrinsics.d(this.videoQ1, tokenizedEvents.videoQ1) && Intrinsics.d(this.videoQ2, tokenizedEvents.videoQ2) && Intrinsics.d(this.videoQ3, tokenizedEvents.videoQ3) && Intrinsics.d(this.videoEnd, tokenizedEvents.videoEnd) && Intrinsics.d(this.videoViewableImpressions, tokenizedEvents.videoViewableImpressions);
        }

        @NotNull
        public final t getVideoClick() {
            return this.videoClick;
        }

        @NotNull
        public final t getVideoEnd() {
            return this.videoEnd;
        }

        @NotNull
        public final t getVideoQ1() {
            return this.videoQ1;
        }

        @NotNull
        public final t getVideoQ2() {
            return this.videoQ2;
        }

        @NotNull
        public final t getVideoQ3() {
            return this.videoQ3;
        }

        @NotNull
        public final t getVideoStart() {
            return this.videoStart;
        }

        @NotNull
        public final t getVideoView() {
            return this.videoView;
        }

        @NotNull
        public final t getVideoViewableImpressions() {
            return this.videoViewableImpressions;
        }

        public int hashCode() {
            return this.videoViewableImpressions.hashCode() + ((this.videoEnd.hashCode() + ((this.videoQ3.hashCode() + ((this.videoQ2.hashCode() + ((this.videoQ1.hashCode() + ((this.videoClick.hashCode() + ((this.videoStart.hashCode() + (this.videoView.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "TokenizedEvents(videoView=" + this.videoView + ", videoStart=" + this.videoStart + ", videoClick=" + this.videoClick + ", videoQ1=" + this.videoQ1 + ", videoQ2=" + this.videoQ2 + ", videoQ3=" + this.videoQ3 + ", videoEnd=" + this.videoEnd + ", videoViewableImpressions=" + this.videoViewableImpressions + ")";
        }
    }

    public AdvBannerVideoV2VO(long j11, @NotNull String playlistUrl, @NotNull String previewUrl, @NotNull String deeplink, float f7, @NotNull TokenizedEvents tokenizedEvents, @NotNull SwitchModeTracking switchVolumeTracking, boolean z11, boolean z12, long j12, @NotNull BadgeDTO badge, List<Pixel> list, @NotNull ProductType productType, SmallPreviewProduct smallPreviewProduct, PackShotVO packShotVO, TextAtom textAtom, boolean z13, boolean z14, PackshotOptions packshotOptions, String str, AdvVideoBannerV2DTO.DesignOptions designOptions) {
        Intrinsics.checkNotNullParameter(playlistUrl, "playlistUrl");
        Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(tokenizedEvents, "tokenizedEvents");
        Intrinsics.checkNotNullParameter(switchVolumeTracking, "switchVolumeTracking");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.id = j11;
        this.playlistUrl = playlistUrl;
        this.previewUrl = previewUrl;
        this.deeplink = deeplink;
        this.initialVolume = f7;
        this.tokenizedEvents = tokenizedEvents;
        this.switchVolumeTracking = switchVolumeTracking;
        this.volumeOn = z11;
        this.isVisible = z12;
        this.position = j12;
        this.badge = badge;
        this.pixel = list;
        this.productType = productType;
        this.previewProduct = smallPreviewProduct;
        this.packshotVO = packShotVO;
        this.legalInformation = textAtom;
        this.videoCoverDisabled = z13;
        this.disableOverlayDisclaimer = z14;
        this.packshotOptions = packshotOptions;
        this.backgroundColor = str;
        this.designOptions = designOptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvBannerVideoV2VO)) {
            return false;
        }
        AdvBannerVideoV2VO advBannerVideoV2VO = (AdvBannerVideoV2VO) other;
        return this.id == advBannerVideoV2VO.id && Intrinsics.d(this.playlistUrl, advBannerVideoV2VO.playlistUrl) && Intrinsics.d(this.previewUrl, advBannerVideoV2VO.previewUrl) && Intrinsics.d(this.deeplink, advBannerVideoV2VO.deeplink) && Float.compare(this.initialVolume, advBannerVideoV2VO.initialVolume) == 0 && Intrinsics.d(this.tokenizedEvents, advBannerVideoV2VO.tokenizedEvents) && Intrinsics.d(this.switchVolumeTracking, advBannerVideoV2VO.switchVolumeTracking) && this.volumeOn == advBannerVideoV2VO.volumeOn && this.isVisible == advBannerVideoV2VO.isVisible && this.position == advBannerVideoV2VO.position && Intrinsics.d(this.badge, advBannerVideoV2VO.badge) && Intrinsics.d(this.pixel, advBannerVideoV2VO.pixel) && this.productType == advBannerVideoV2VO.productType && Intrinsics.d(this.previewProduct, advBannerVideoV2VO.previewProduct) && Intrinsics.d(this.packshotVO, advBannerVideoV2VO.packshotVO) && Intrinsics.d(this.legalInformation, advBannerVideoV2VO.legalInformation) && this.videoCoverDisabled == advBannerVideoV2VO.videoCoverDisabled && this.disableOverlayDisclaimer == advBannerVideoV2VO.disableOverlayDisclaimer && Intrinsics.d(this.packshotOptions, advBannerVideoV2VO.packshotOptions) && Intrinsics.d(this.backgroundColor, advBannerVideoV2VO.backgroundColor) && Intrinsics.d(this.designOptions, advBannerVideoV2VO.designOptions);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final AdvVideoBannerV2DTO.DesignOptions getDesignOptions() {
        return this.designOptions;
    }

    public final boolean getDisableOverlayDisclaimer() {
        return this.disableOverlayDisclaimer;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final float getInitialVolume() {
        return this.initialVolume;
    }

    public final TextAtom getLegalInformation() {
        return this.legalInformation;
    }

    public final PackshotOptions getPackshotOptions() {
        return this.packshotOptions;
    }

    public final PackShotVO getPackshotVO() {
        return this.packshotVO;
    }

    public final List<Pixel> getPixel() {
        return this.pixel;
    }

    @NotNull
    public final String getPlaylistUrl() {
        return this.playlistUrl;
    }

    public final long getPosition() {
        return this.position;
    }

    public final SmallPreviewProduct getPreviewProduct() {
        return this.previewProduct;
    }

    @NotNull
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final SwitchModeTracking getSwitchVolumeTracking() {
        return this.switchVolumeTracking;
    }

    @NotNull
    public final TokenizedEvents getTokenizedEvents() {
        return this.tokenizedEvents;
    }

    public final boolean getVideoCoverDisabled() {
        return this.videoCoverDisabled;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C3124a.c(this.badge, Pk0.c.a(C3532b.a(C3532b.a((this.switchVolumeTracking.hashCode() + ((this.tokenizedEvents.hashCode() + Pk0.b.a(this.initialVolume, g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.playlistUrl), 31, this.previewUrl), 31, this.deeplink), 31)) * 31)) * 31, 31, this.volumeOn), 31, this.isVisible), 31, this.position), 31);
        List<Pixel> list = this.pixel;
        int hashCode = (this.productType.hashCode() + ((c11 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        SmallPreviewProduct smallPreviewProduct = this.previewProduct;
        int hashCode2 = (hashCode + (smallPreviewProduct == null ? 0 : smallPreviewProduct.hashCode())) * 31;
        PackShotVO packShotVO = this.packshotVO;
        int hashCode3 = (hashCode2 + (packShotVO == null ? 0 : packShotVO.hashCode())) * 31;
        TextAtom textAtom = this.legalInformation;
        int a11 = C3532b.a(C3532b.a((hashCode3 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.videoCoverDisabled), 31, this.disableOverlayDisclaimer);
        PackshotOptions packshotOptions = this.packshotOptions;
        int hashCode4 = (a11 + (packshotOptions == null ? 0 : packshotOptions.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        AdvVideoBannerV2DTO.DesignOptions designOptions = this.designOptions;
        return hashCode5 + (designOptions != null ? designOptions.hashCode() : 0);
    }

    public final void setPosition(long j11) {
        this.position = j11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.playlistUrl;
        String str2 = this.previewUrl;
        String str3 = this.deeplink;
        float f7 = this.initialVolume;
        TokenizedEvents tokenizedEvents = this.tokenizedEvents;
        SwitchModeTracking switchModeTracking = this.switchVolumeTracking;
        boolean z11 = this.volumeOn;
        boolean z12 = this.isVisible;
        long j12 = this.position;
        BadgeDTO badgeDTO = this.badge;
        List<Pixel> list = this.pixel;
        ProductType productType = this.productType;
        SmallPreviewProduct smallPreviewProduct = this.previewProduct;
        PackShotVO packShotVO = this.packshotVO;
        TextAtom textAtom = this.legalInformation;
        boolean z13 = this.videoCoverDisabled;
        boolean z14 = this.disableOverlayDisclaimer;
        PackshotOptions packshotOptions = this.packshotOptions;
        String str4 = this.backgroundColor;
        AdvVideoBannerV2DTO.DesignOptions designOptions = this.designOptions;
        StringBuilder c11 = C2436a.c(j11, "AdvBannerVideoV2VO(id=", ", playlistUrl=", str);
        Nh.a.h(c11, ", previewUrl=", str2, ", deeplink=", str3);
        c11.append(", initialVolume=");
        c11.append(f7);
        c11.append(", tokenizedEvents=");
        c11.append(tokenizedEvents);
        c11.append(", switchVolumeTracking=");
        c11.append(switchModeTracking);
        c11.append(", volumeOn=");
        c11.append(z11);
        c11.append(", isVisible=");
        c11.append(z12);
        c11.append(", position=");
        c11.append(j12);
        c11.append(", badge=");
        c11.append(badgeDTO);
        c11.append(", pixel=");
        c11.append(list);
        c11.append(", productType=");
        c11.append(productType);
        c11.append(", previewProduct=");
        c11.append(smallPreviewProduct);
        c11.append(", packshotVO=");
        c11.append(packShotVO);
        c11.append(", legalInformation=");
        c11.append(textAtom);
        c11.append(", videoCoverDisabled=");
        c11.append(z13);
        c11.append(", disableOverlayDisclaimer=");
        c11.append(z14);
        c11.append(", packshotOptions=");
        c11.append(packshotOptions);
        c11.append(", backgroundColor=");
        c11.append(str4);
        c11.append(", designOptions=");
        c11.append(designOptions);
        c11.append(")");
        return c11.toString();
    }
}

package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import B0.C2454a;
import D3.h;
import D40.a;
import G.g;
import Kk.C3532b;
import Pk0.b;
import Pk0.i;
import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00066789:;Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R.\u0010\u0013\u001a\u000e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u00105¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "items", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;", "buttons", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Settings;", "mobileSettings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "lastPlaceholder", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "lastAsyncUpdatedState", "<init>", "(JLjava/util/List;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Settings;LWZ/t;Lru/ozon/app/android/travel/utils/placeholder/Placeholder;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getButtons", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Settings;", "getMobileSettings", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Settings;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "getLastPlaceholder", "()Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "setLastPlaceholder", "(Lru/ozon/app/android/travel/utils/placeholder/Placeholder;)V", "getLastAsyncUpdatedState", "setLastAsyncUpdatedState", "(Ljava/util/List;)V", "GalleryItem", "Video", "Photo", "VideoButton", "VideoTokenizedEvent", "Settings", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsGalleryVO implements c {
    private final List<VideoButton> buttons;
    private final long id;

    @NotNull
    private final List<GalleryItem> items;
    private List<l> lastAsyncUpdatedState;
    private Placeholder lastPlaceholder;

    @NotNull
    private final Settings mobileSettings;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "", "", "getId", "()J", "id", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Photo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface GalleryItem {
        long getId();
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Photo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "", ImagesContract.URL, "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Ljava/lang/String;", "getUrl", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Photo implements GalleryItem {
        private final AtomAction action;
        private final long id;
        private final t trackingInfo;

        @NotNull
        private final String url;

        public Photo(long j11, AtomAction atomAction, t tVar, @NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.id = j11;
            this.action = atomAction;
            this.trackingInfo = tVar;
            this.url = url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) other;
            return this.id == photo.id && Intrinsics.d(this.action, photo.action) && Intrinsics.d(this.trackingInfo, photo.trackingInfo) && Intrinsics.d(this.url, photo.url);
        }

        public AtomAction getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO.GalleryItem
        public long getId() {
            return this.id;
        }

        public t getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.trackingInfo;
            return this.url.hashCode() + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "Photo(id=" + this.id + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", url=" + this.url + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b!\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Settings;", "", "", "backgroundColor", "", "islandRadius", "", "islandTopPadding", "islandBackgroundColor", "galleryAspectRatio", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;", "pageControl", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "hotelsGalleryFeedAtomAction", "<init>", "(Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "F", "getIslandRadius", "()F", "I", "getIslandTopPadding", "getIslandBackgroundColor", "getGalleryAspectRatio", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;", "getPageControl", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getHotelsGalleryFeedAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings {
        public static final int $stable = AtomAction.$stable;
        private final String backgroundColor;
        private final BadgeDTO badge;
        private final String galleryAspectRatio;
        private final AtomAction hotelsGalleryFeedAtomAction;
        private final String islandBackgroundColor;
        private final float islandRadius;
        private final int islandTopPadding;

        @NotNull
        private final HotelsGalleryDTO.MobileSettings.PageControl pageControl;

        public Settings(String str, float f7, int i11, String str2, String str3, @NotNull HotelsGalleryDTO.MobileSettings.PageControl pageControl, BadgeDTO badgeDTO, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(pageControl, "pageControl");
            this.backgroundColor = str;
            this.islandRadius = f7;
            this.islandTopPadding = i11;
            this.islandBackgroundColor = str2;
            this.galleryAspectRatio = str3;
            this.pageControl = pageControl;
            this.badge = badgeDTO;
            this.hotelsGalleryFeedAtomAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return Intrinsics.d(this.backgroundColor, settings.backgroundColor) && Float.compare(this.islandRadius, settings.islandRadius) == 0 && this.islandTopPadding == settings.islandTopPadding && Intrinsics.d(this.islandBackgroundColor, settings.islandBackgroundColor) && Intrinsics.d(this.galleryAspectRatio, settings.galleryAspectRatio) && Intrinsics.d(this.pageControl, settings.pageControl) && Intrinsics.d(this.badge, settings.badge) && Intrinsics.d(this.hotelsGalleryFeedAtomAction, settings.hotelsGalleryFeedAtomAction);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final String getGalleryAspectRatio() {
            return this.galleryAspectRatio;
        }

        public final AtomAction getHotelsGalleryFeedAtomAction() {
            return this.hotelsGalleryFeedAtomAction;
        }

        public final String getIslandBackgroundColor() {
            return this.islandBackgroundColor;
        }

        public final float getIslandRadius() {
            return this.islandRadius;
        }

        public final int getIslandTopPadding() {
            return this.islandTopPadding;
        }

        @NotNull
        public final HotelsGalleryDTO.MobileSettings.PageControl getPageControl() {
            return this.pageControl;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int a11 = C2454a.a(this.islandTopPadding, b.a(this.islandRadius, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
            String str2 = this.islandBackgroundColor;
            int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.galleryAspectRatio;
            int hashCode2 = (this.pageControl.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            AtomAction atomAction = this.hotelsGalleryFeedAtomAction;
            return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            float f7 = this.islandRadius;
            int i11 = this.islandTopPadding;
            String str2 = this.islandBackgroundColor;
            String str3 = this.galleryAspectRatio;
            HotelsGalleryDTO.MobileSettings.PageControl pageControl = this.pageControl;
            BadgeDTO badgeDTO = this.badge;
            AtomAction atomAction = this.hotelsGalleryFeedAtomAction;
            StringBuilder sb2 = new StringBuilder("Settings(backgroundColor=");
            sb2.append(str);
            sb2.append(", islandRadius=");
            sb2.append(f7);
            sb2.append(", islandTopPadding=");
            i.c(i11, ", islandBackgroundColor=", str2, ", galleryAspectRatio=", sb2);
            sb2.append(str3);
            sb2.append(", pageControl=");
            sb2.append(pageControl);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", hotelsGalleryFeedAtomAction=");
            sb2.append(atomAction);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b\u000e\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "video", "", "previewImageUrl", "", "isAutoPlay", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoTokenizedEvent;", "videoTrackingInfo", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;ZLru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoTokenizedEvent;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "Ljava/lang/String;", "getPreviewImageUrl", "Z", "()Z", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoTokenizedEvent;", "getVideoTrackingInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoTokenizedEvent;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Video implements GalleryItem {
        private final AtomAction action;
        private final long id;
        private final boolean isAutoPlay;

        @NotNull
        private final String previewImageUrl;
        private final t trackingInfo;

        @NotNull
        private final VideoMolecule video;
        private final VideoTokenizedEvent videoTrackingInfo;

        public Video(long j11, AtomAction atomAction, t tVar, @NotNull VideoMolecule video, @NotNull String previewImageUrl, boolean z11, VideoTokenizedEvent videoTokenizedEvent) {
            Intrinsics.checkNotNullParameter(video, "video");
            Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
            this.id = j11;
            this.action = atomAction;
            this.trackingInfo = tVar;
            this.video = video;
            this.previewImageUrl = previewImageUrl;
            this.isAutoPlay = z11;
            this.videoTrackingInfo = videoTokenizedEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return this.id == video.id && Intrinsics.d(this.action, video.action) && Intrinsics.d(this.trackingInfo, video.trackingInfo) && Intrinsics.d(this.video, video.video) && Intrinsics.d(this.previewImageUrl, video.previewImageUrl) && this.isAutoPlay == video.isAutoPlay && Intrinsics.d(this.videoTrackingInfo, video.videoTrackingInfo);
        }

        public AtomAction getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO.GalleryItem
        public long getId() {
            return this.id;
        }

        @NotNull
        public final String getPreviewImageUrl() {
            return this.previewImageUrl;
        }

        public t getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final VideoMolecule getVideo() {
            return this.video;
        }

        public final VideoTokenizedEvent getVideoTrackingInfo() {
            return this.videoTrackingInfo;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.trackingInfo;
            int a11 = C3532b.a(g.a((this.video.hashCode() + ((hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31, 31, this.previewImageUrl), 31, this.isAutoPlay);
            VideoTokenizedEvent videoTokenizedEvent = this.videoTrackingInfo;
            return a11 + (videoTokenizedEvent != null ? videoTokenizedEvent.hashCode() : 0);
        }

        /* renamed from: isAutoPlay, reason: from getter */
        public final boolean getIsAutoPlay() {
            return this.isAutoPlay;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            AtomAction atomAction = this.action;
            t tVar = this.trackingInfo;
            VideoMolecule videoMolecule = this.video;
            String str = this.previewImageUrl;
            boolean z11 = this.isAutoPlay;
            VideoTokenizedEvent videoTokenizedEvent = this.videoTrackingInfo;
            StringBuilder sb2 = new StringBuilder("Video(id=");
            sb2.append(j11);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", trackingInfo=");
            sb2.append(tVar);
            sb2.append(", video=");
            sb2.append(videoMolecule);
            a.g(", previewImageUrl=", str, ", isAutoPlay=", sb2, z11);
            sb2.append(", videoTrackingInfo=");
            sb2.append(videoTokenizedEvent);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;", "", "", "id", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "enableButton", "disableButton", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getEnableButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDisableButton", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoButton {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO disableButton;

        @NotNull
        private final IconButtonV3DTO enableButton;
        private final long id;

        public VideoButton(long j11, @NotNull IconButtonV3DTO enableButton, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(enableButton, "enableButton");
            this.id = j11;
            this.enableButton = enableButton;
            this.disableButton = iconButtonV3DTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoButton)) {
                return false;
            }
            VideoButton videoButton = (VideoButton) other;
            return this.id == videoButton.id && Intrinsics.d(this.enableButton, videoButton.enableButton) && Intrinsics.d(this.disableButton, videoButton.disableButton);
        }

        public final IconButtonV3DTO getDisableButton() {
            return this.disableButton;
        }

        @NotNull
        public final IconButtonV3DTO getEnableButton() {
            return this.enableButton;
        }

        public final long getId() {
            return this.id;
        }

        public int hashCode() {
            int c11 = GR.b.c(this.enableButton, Long.hashCode(this.id) * 31, 31);
            IconButtonV3DTO iconButtonV3DTO = this.disableButton;
            return c11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "VideoButton(id=" + this.id + ", enableButton=" + this.enableButton + ", disableButton=" + this.disableButton + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoTokenizedEvent;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "startVideo", "endVideo", "<init>", "(LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getStartVideo", "()LWZ/t;", "getEndVideo", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoTokenizedEvent {
        private final t endVideo;
        private final t startVideo;

        public VideoTokenizedEvent(t tVar, t tVar2) {
            this.startVideo = tVar;
            this.endVideo = tVar2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoTokenizedEvent)) {
                return false;
            }
            VideoTokenizedEvent videoTokenizedEvent = (VideoTokenizedEvent) other;
            return Intrinsics.d(this.startVideo, videoTokenizedEvent.startVideo) && Intrinsics.d(this.endVideo, videoTokenizedEvent.endVideo);
        }

        public final t getEndVideo() {
            return this.endVideo;
        }

        public final t getStartVideo() {
            return this.startVideo;
        }

        public int hashCode() {
            t tVar = this.startVideo;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            t tVar2 = this.endVideo;
            return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VideoTokenizedEvent(startVideo=" + this.startVideo + ", endVideo=" + this.endVideo + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotelsGalleryVO(long j11, @NotNull List<? extends GalleryItem> items, List<VideoButton> list, @NotNull Settings mobileSettings, t tVar, Placeholder placeholder, List<l> list2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(mobileSettings, "mobileSettings");
        this.id = j11;
        this.items = items;
        this.buttons = list;
        this.mobileSettings = mobileSettings;
        this.tokenizedEvent = tVar;
        this.lastPlaceholder = placeholder;
        this.lastAsyncUpdatedState = list2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsGalleryVO)) {
            return false;
        }
        HotelsGalleryVO hotelsGalleryVO = (HotelsGalleryVO) other;
        return this.id == hotelsGalleryVO.id && Intrinsics.d(this.items, hotelsGalleryVO.items) && Intrinsics.d(this.buttons, hotelsGalleryVO.buttons) && Intrinsics.d(this.mobileSettings, hotelsGalleryVO.mobileSettings) && Intrinsics.d(this.tokenizedEvent, hotelsGalleryVO.tokenizedEvent) && Intrinsics.d(this.lastPlaceholder, hotelsGalleryVO.lastPlaceholder) && Intrinsics.d(this.lastAsyncUpdatedState, hotelsGalleryVO.lastAsyncUpdatedState);
    }

    public final List<VideoButton> getButtons() {
        return this.buttons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    public final List<l> getLastAsyncUpdatedState() {
        return this.lastAsyncUpdatedState;
    }

    public final Placeholder getLastPlaceholder() {
        return this.lastPlaceholder;
    }

    @NotNull
    public final Settings getMobileSettings() {
        return this.mobileSettings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.items);
        List<VideoButton> list = this.buttons;
        int hashCode = (this.mobileSettings.hashCode() + ((b11 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Placeholder placeholder = this.lastPlaceholder;
        int hashCode3 = (hashCode2 + (placeholder == null ? 0 : placeholder.hashCode())) * 31;
        List<l> list2 = this.lastAsyncUpdatedState;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setLastAsyncUpdatedState(List<l> list) {
        this.lastAsyncUpdatedState = list;
    }

    public final void setLastPlaceholder(Placeholder placeholder) {
        this.lastPlaceholder = placeholder;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<GalleryItem> list = this.items;
        List<VideoButton> list2 = this.buttons;
        Settings settings = this.mobileSettings;
        t tVar = this.tokenizedEvent;
        Placeholder placeholder = this.lastPlaceholder;
        List<l> list3 = this.lastAsyncUpdatedState;
        StringBuilder b11 = Lh.b.b(j11, "HotelsGalleryVO(id=", ", items=", list);
        b11.append(", buttons=");
        b11.append(list2);
        b11.append(", mobileSettings=");
        b11.append(settings);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", lastPlaceholder=");
        b11.append(placeholder);
        return h.c(b11, ", lastAsyncUpdatedState=", list3, ")");
    }

    public /* synthetic */ HotelsGalleryVO(long j11, List list, List list2, Settings settings, t tVar, Placeholder placeholder, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, list2, settings, tVar, (i11 & 32) != 0 ? null : placeholder, (i11 & 64) != 0 ? null : list3);
    }
}

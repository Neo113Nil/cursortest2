package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation;

import B0.C2454a;
import El.C2971a;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ns.b;
import P4.f;
import Tz.C4055a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001:\u0004&'()B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "items", "", "initialItemIndex", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "backButton", "<init>", "(JLjava/util/List;ILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "copy", "(JLjava/util/List;ILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "getInitialItemIndex", "setInitialItemIndex", "(I)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBackButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "GalleryItem", "Video", "Photo", "VideoTokenizedEvent", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsGalleryFullV2VI implements c {

    @NotNull
    private final IconButtonV3DTO backButton;
    private final long id;
    private int initialItemIndex;

    @NotNull
    private final List<GalleryItem> items;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\u0010\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "", "", "getId", "()I", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "titleText", "getCounterText", "counterText", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTrackingInfo", "()LWZ/t;", "trackingInfo", "", "isSelected", "()Z", "setSelected", "(Z)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$Photo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$Video;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface GalleryItem {
        @NotNull
        TextDTO getCounterText();

        int getId();

        TextDTO getTitleText();

        t getTrackingInfo();

        /* renamed from: isSelected */
        boolean getIsSelected();

        void setSelected(boolean z11);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#\"\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$Photo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleText", "counterText", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "", "isSelected", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;ZLru/ozon/uni/atoms/data/image/ImageDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCounterText", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Z", "()Z", "setSelected", "(Z)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Photo implements GalleryItem {

        @NotNull
        private final TextDTO counterText;
        private final int id;

        @NotNull
        private final ImageDTO image;
        private boolean isSelected;
        private final TextDTO titleText;
        private final t trackingInfo;

        public Photo(int i11, TextDTO textDTO, @NotNull TextDTO counterText, t tVar, boolean z11, @NotNull ImageDTO image) {
            Intrinsics.checkNotNullParameter(counterText, "counterText");
            Intrinsics.checkNotNullParameter(image, "image");
            this.id = i11;
            this.titleText = textDTO;
            this.counterText = counterText;
            this.trackingInfo = tVar;
            this.isSelected = z11;
            this.image = image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) other;
            return this.id == photo.id && Intrinsics.d(this.titleText, photo.titleText) && Intrinsics.d(this.counterText, photo.counterText) && Intrinsics.d(this.trackingInfo, photo.trackingInfo) && this.isSelected == photo.isSelected && Intrinsics.d(this.image, photo.image);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        @NotNull
        public TextDTO getCounterText() {
            return this.counterText;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        public TextDTO getTitleText() {
            return this.titleText;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        public t getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            TextDTO textDTO = this.titleText;
            int a11 = b.a(this.counterText, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
            t tVar = this.trackingInfo;
            return this.image.hashCode() + C3532b.a((a11 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.isSelected);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        /* renamed from: isSelected, reason: from getter */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        public void setSelected(boolean z11) {
            this.isSelected = z11;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.titleText;
            TextDTO textDTO2 = this.counterText;
            t tVar = this.trackingInfo;
            boolean z11 = this.isSelected;
            ImageDTO imageDTO = this.image;
            StringBuilder b11 = C4055a.b(textDTO, "Photo(id=", ", titleText=", ", counterText=", i11);
            b11.append(textDTO2);
            b11.append(", trackingInfo=");
            b11.append(tVar);
            b11.append(", isSelected=");
            b11.append(z11);
            b11.append(", image=");
            b11.append(imageDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$VideoTokenizedEvent;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "startVideo", "endVideo", "<init>", "(LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getStartVideo", "()LWZ/t;", "getEndVideo", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public HotelsGalleryFullV2VI(long j11, @NotNull List<? extends GalleryItem> items, int i11, @NotNull IconButtonV3DTO backButton) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        this.id = j11;
        this.items = items;
        this.initialItemIndex = i11;
        this.backButton = backButton;
    }

    public static /* synthetic */ HotelsGalleryFullV2VI copy$default(HotelsGalleryFullV2VI hotelsGalleryFullV2VI, long j11, List list, int i11, IconButtonV3DTO iconButtonV3DTO, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = hotelsGalleryFullV2VI.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            list = hotelsGalleryFullV2VI.items;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            i11 = hotelsGalleryFullV2VI.initialItemIndex;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            iconButtonV3DTO = hotelsGalleryFullV2VI.backButton;
        }
        return hotelsGalleryFullV2VI.copy(j12, list2, i13, iconButtonV3DTO);
    }

    @NotNull
    public final HotelsGalleryFullV2VI copy(long id2, @NotNull List<? extends GalleryItem> items, int initialItemIndex, @NotNull IconButtonV3DTO backButton) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        return new HotelsGalleryFullV2VI(id2, items, initialItemIndex, backButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsGalleryFullV2VI)) {
            return false;
        }
        HotelsGalleryFullV2VI hotelsGalleryFullV2VI = (HotelsGalleryFullV2VI) other;
        return this.id == hotelsGalleryFullV2VI.id && Intrinsics.d(this.items, hotelsGalleryFullV2VI.items) && this.initialItemIndex == hotelsGalleryFullV2VI.initialItemIndex && Intrinsics.d(this.backButton, hotelsGalleryFullV2VI.backButton);
    }

    @NotNull
    public final IconButtonV3DTO getBackButton() {
        return this.backButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.backButton.hashCode() + C2454a.a(this.initialItemIndex, g.b(Long.hashCode(this.id) * 31, 31, this.items), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<GalleryItem> list = this.items;
        int i11 = this.initialItemIndex;
        IconButtonV3DTO iconButtonV3DTO = this.backButton;
        StringBuilder b11 = Lh.b.b(j11, "HotelsGalleryFullV2VI(id=", ", items=", list);
        b11.append(", initialItemIndex=");
        b11.append(i11);
        b11.append(", backButton=");
        b11.append(iconButtonV3DTO);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b'\u0010&R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010+\u001a\u0004\b\u000b\u0010,\"\u0004\b-\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b\u000e\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$Video;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleText", "counterText", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "", "isSelected", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "video", "isAutoplay", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "previewImage", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "videoControlIcon", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$VideoTokenizedEvent;", "videoTrackingInfo", "", "savedPlayerPosition", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;ZLru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;ZLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$VideoTokenizedEvent;J)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCounterText", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Z", "()Z", "setSelected", "(Z)V", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getPreviewImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getVideoControlIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$VideoTokenizedEvent;", "getVideoTrackingInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$VideoTokenizedEvent;", "J", "getSavedPlayerPosition", "()J", "setSavedPlayerPosition", "(J)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Video implements GalleryItem {

        @NotNull
        private final TextDTO counterText;
        private final int id;
        private final boolean isAutoplay;
        private boolean isSelected;

        @NotNull
        private final ImageDTO previewImage;
        private long savedPlayerPosition;
        private final TextDTO titleText;
        private final t trackingInfo;

        @NotNull
        private final VideoMolecule video;

        @NotNull
        private final IconDTO videoControlIcon;
        private final VideoTokenizedEvent videoTrackingInfo;

        public Video(int i11, TextDTO textDTO, @NotNull TextDTO counterText, t tVar, boolean z11, @NotNull VideoMolecule video, boolean z12, @NotNull ImageDTO previewImage, @NotNull IconDTO videoControlIcon, VideoTokenizedEvent videoTokenizedEvent, long j11) {
            Intrinsics.checkNotNullParameter(counterText, "counterText");
            Intrinsics.checkNotNullParameter(video, "video");
            Intrinsics.checkNotNullParameter(previewImage, "previewImage");
            Intrinsics.checkNotNullParameter(videoControlIcon, "videoControlIcon");
            this.id = i11;
            this.titleText = textDTO;
            this.counterText = counterText;
            this.trackingInfo = tVar;
            this.isSelected = z11;
            this.video = video;
            this.isAutoplay = z12;
            this.previewImage = previewImage;
            this.videoControlIcon = videoControlIcon;
            this.videoTrackingInfo = videoTokenizedEvent;
            this.savedPlayerPosition = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return this.id == video.id && Intrinsics.d(this.titleText, video.titleText) && Intrinsics.d(this.counterText, video.counterText) && Intrinsics.d(this.trackingInfo, video.trackingInfo) && this.isSelected == video.isSelected && Intrinsics.d(this.video, video.video) && this.isAutoplay == video.isAutoplay && Intrinsics.d(this.previewImage, video.previewImage) && Intrinsics.d(this.videoControlIcon, video.videoControlIcon) && Intrinsics.d(this.videoTrackingInfo, video.videoTrackingInfo) && this.savedPlayerPosition == video.savedPlayerPosition;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        @NotNull
        public TextDTO getCounterText() {
            return this.counterText;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final ImageDTO getPreviewImage() {
            return this.previewImage;
        }

        public final long getSavedPlayerPosition() {
            return this.savedPlayerPosition;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        public TextDTO getTitleText() {
            return this.titleText;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        public t getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final VideoMolecule getVideo() {
            return this.video;
        }

        @NotNull
        public final IconDTO getVideoControlIcon() {
            return this.videoControlIcon;
        }

        public final VideoTokenizedEvent getVideoTrackingInfo() {
            return this.videoTrackingInfo;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            TextDTO textDTO = this.titleText;
            int a11 = b.a(this.counterText, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
            t tVar = this.trackingInfo;
            int a12 = C2971a.a(this.videoControlIcon, a.b(this.previewImage, C3532b.a((this.video.hashCode() + C3532b.a((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.isSelected)) * 31, 31, this.isAutoplay), 31), 31);
            VideoTokenizedEvent videoTokenizedEvent = this.videoTrackingInfo;
            return Long.hashCode(this.savedPlayerPosition) + ((a12 + (videoTokenizedEvent != null ? videoTokenizedEvent.hashCode() : 0)) * 31);
        }

        /* renamed from: isAutoplay, reason: from getter */
        public final boolean getIsAutoplay() {
            return this.isAutoplay;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        /* renamed from: isSelected, reason: from getter */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        public final void setSavedPlayerPosition(long j11) {
            this.savedPlayerPosition = j11;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.GalleryItem
        public void setSelected(boolean z11) {
            this.isSelected = z11;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.titleText;
            TextDTO textDTO2 = this.counterText;
            t tVar = this.trackingInfo;
            boolean z11 = this.isSelected;
            VideoMolecule videoMolecule = this.video;
            boolean z12 = this.isAutoplay;
            ImageDTO imageDTO = this.previewImage;
            IconDTO iconDTO = this.videoControlIcon;
            VideoTokenizedEvent videoTokenizedEvent = this.videoTrackingInfo;
            long j11 = this.savedPlayerPosition;
            StringBuilder b11 = C4055a.b(textDTO, "Video(id=", ", titleText=", ", counterText=", i11);
            b11.append(textDTO2);
            b11.append(", trackingInfo=");
            b11.append(tVar);
            b11.append(", isSelected=");
            b11.append(z11);
            b11.append(", video=");
            b11.append(videoMolecule);
            b11.append(", isAutoplay=");
            b11.append(z12);
            b11.append(", previewImage=");
            b11.append(imageDTO);
            b11.append(", videoControlIcon=");
            b11.append(iconDTO);
            b11.append(", videoTrackingInfo=");
            b11.append(videoTokenizedEvent);
            b11.append(", savedPlayerPosition=");
            return f.a(j11, ")", b11);
        }

        public /* synthetic */ Video(int i11, TextDTO textDTO, TextDTO textDTO2, t tVar, boolean z11, VideoMolecule videoMolecule, boolean z12, ImageDTO imageDTO, IconDTO iconDTO, VideoTokenizedEvent videoTokenizedEvent, long j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, textDTO, textDTO2, tVar, z11, videoMolecule, z12, imageDTO, iconDTO, videoTokenizedEvent, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0L : j11);
        }
    }
}

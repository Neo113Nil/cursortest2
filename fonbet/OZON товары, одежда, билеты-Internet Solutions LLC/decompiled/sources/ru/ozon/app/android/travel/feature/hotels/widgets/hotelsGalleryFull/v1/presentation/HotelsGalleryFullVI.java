package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation;

import D3.h;
import El.C2971a;
import G.g;
import Kk.C3532b;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001:\u0006+,-./0B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010*¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;", "items", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;", "navigationButton", "", "initialItemIndex", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;I)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;", "getNavigationButton", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;", "I", "getInitialItemIndex", "setInitialItemIndex", "(I)V", "GalleryItem", "Video", "Photo", "VideoTokenizedEvent", "NavigationButton", "ButtonPosition", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsGalleryFullVI implements c {
    private final long id;
    private int initialItemIndex;

    @NotNull
    private final List<GalleryItem> items;
    private final NavigationButton navigationButton;

    @NotNull
    private final TextDTO text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$ButtonPosition;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonPosition[] $VALUES;
        public static final ButtonPosition LEFT = new ButtonPosition("LEFT", 0);
        public static final ButtonPosition RIGHT = new ButtonPosition("RIGHT", 1);

        private static final /* synthetic */ ButtonPosition[] $values() {
            return new ButtonPosition[]{LEFT, RIGHT};
        }

        static {
            ButtonPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonPosition(String str, int i11) {
        }

        public static ButtonPosition valueOf(String str) {
            return (ButtonPosition) Enum.valueOf(ButtonPosition.class, str);
        }

        public static ButtonPosition[] values() {
            return (ButtonPosition[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;", "", "", "getId", "()I", "id", "", "isSelected", "()Z", "setSelected", "(Z)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Photo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Video;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface GalleryItem {
        int getId();

        /* renamed from: isSelected */
        boolean getIsSelected();

        void setSelected(boolean z11);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$NavigationButton;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "button", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$ButtonPosition;", "position", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$ButtonPosition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$ButtonPosition;", "getPosition", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$ButtonPosition;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigationButton {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO button;

        @NotNull
        private final ButtonPosition position;

        public NavigationButton(@NotNull IconButtonV3DTO button, @NotNull ButtonPosition position) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(position, "position");
            this.button = button;
            this.position = position;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationButton)) {
                return false;
            }
            NavigationButton navigationButton = (NavigationButton) other;
            return Intrinsics.d(this.button, navigationButton.button) && this.position == navigationButton.position;
        }

        @NotNull
        public final IconButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final ButtonPosition getPosition() {
            return this.position;
        }

        public int hashCode() {
            return this.position.hashCode() + (this.button.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "NavigationButton(button=" + this.button + ", position=" + this.position + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\"\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Photo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;", "", "id", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "", "isSelected", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "<init>", "(ILWZ/t;ZLru/ozon/uni/atoms/data/image/ImageDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Z", "()Z", "setSelected", "(Z)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Photo implements GalleryItem {
        private final int id;

        @NotNull
        private final ImageDTO image;
        private boolean isSelected;
        private final t trackingInfo;

        public Photo(int i11, t tVar, boolean z11, @NotNull ImageDTO image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.id = i11;
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
            return this.id == photo.id && Intrinsics.d(this.trackingInfo, photo.trackingInfo) && this.isSelected == photo.isSelected && Intrinsics.d(this.image, photo.image);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI.GalleryItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public t getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            t tVar = this.trackingInfo;
            return this.image.hashCode() + C3532b.a((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.isSelected);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI.GalleryItem
        /* renamed from: isSelected, reason: from getter */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI.GalleryItem
        public void setSelected(boolean z11) {
            this.isSelected = z11;
        }

        @NotNull
        public String toString() {
            return "Photo(id=" + this.id + ", trackingInfo=" + this.trackingInfo + ", isSelected=" + this.isSelected + ", image=" + this.image + ")";
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\"\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010#\"\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Video;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;", "", "id", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "", "isSelected", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "video", "isAutoplay", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "previewImage", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "videoControlIcon", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$VideoTokenizedEvent;", "videoTrackingInfo", "<init>", "(ILWZ/t;ZLru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;ZLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$VideoTokenizedEvent;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Z", "()Z", "setSelected", "(Z)V", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getPreviewImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getVideoControlIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$VideoTokenizedEvent;", "getVideoTrackingInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$VideoTokenizedEvent;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Video implements GalleryItem {
        private final int id;
        private final boolean isAutoplay;
        private boolean isSelected;

        @NotNull
        private final ImageDTO previewImage;
        private final t trackingInfo;

        @NotNull
        private final VideoMolecule video;

        @NotNull
        private final IconDTO videoControlIcon;
        private final VideoTokenizedEvent videoTrackingInfo;

        public Video(int i11, t tVar, boolean z11, @NotNull VideoMolecule video, boolean z12, @NotNull ImageDTO previewImage, @NotNull IconDTO videoControlIcon, VideoTokenizedEvent videoTokenizedEvent) {
            Intrinsics.checkNotNullParameter(video, "video");
            Intrinsics.checkNotNullParameter(previewImage, "previewImage");
            Intrinsics.checkNotNullParameter(videoControlIcon, "videoControlIcon");
            this.id = i11;
            this.trackingInfo = tVar;
            this.isSelected = z11;
            this.video = video;
            this.isAutoplay = z12;
            this.previewImage = previewImage;
            this.videoControlIcon = videoControlIcon;
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
            return this.id == video.id && Intrinsics.d(this.trackingInfo, video.trackingInfo) && this.isSelected == video.isSelected && Intrinsics.d(this.video, video.video) && this.isAutoplay == video.isAutoplay && Intrinsics.d(this.previewImage, video.previewImage) && Intrinsics.d(this.videoControlIcon, video.videoControlIcon) && Intrinsics.d(this.videoTrackingInfo, video.videoTrackingInfo);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI.GalleryItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final ImageDTO getPreviewImage() {
            return this.previewImage;
        }

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
            t tVar = this.trackingInfo;
            int a11 = C2971a.a(this.videoControlIcon, Nh.a.b(this.previewImage, C3532b.a((this.video.hashCode() + C3532b.a((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.isSelected)) * 31, 31, this.isAutoplay), 31), 31);
            VideoTokenizedEvent videoTokenizedEvent = this.videoTrackingInfo;
            return a11 + (videoTokenizedEvent != null ? videoTokenizedEvent.hashCode() : 0);
        }

        /* renamed from: isAutoplay, reason: from getter */
        public final boolean getIsAutoplay() {
            return this.isAutoplay;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI.GalleryItem
        /* renamed from: isSelected, reason: from getter */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI.GalleryItem
        public void setSelected(boolean z11) {
            this.isSelected = z11;
        }

        @NotNull
        public String toString() {
            return "Video(id=" + this.id + ", trackingInfo=" + this.trackingInfo + ", isSelected=" + this.isSelected + ", video=" + this.video + ", isAutoplay=" + this.isAutoplay + ", previewImage=" + this.previewImage + ", videoControlIcon=" + this.videoControlIcon + ", videoTrackingInfo=" + this.videoTrackingInfo + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$VideoTokenizedEvent;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "startVideo", "endVideo", "<init>", "(LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getStartVideo", "()LWZ/t;", "getEndVideo", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public HotelsGalleryFullVI(long j11, @NotNull List<? extends GalleryItem> items, @NotNull TextDTO text, NavigationButton navigationButton, int i11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.items = items;
        this.text = text;
        this.navigationButton = navigationButton;
        this.initialItemIndex = i11;
    }

    public static /* synthetic */ HotelsGalleryFullVI copy$default(HotelsGalleryFullVI hotelsGalleryFullVI, long j11, List list, TextDTO textDTO, NavigationButton navigationButton, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = hotelsGalleryFullVI.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            list = hotelsGalleryFullVI.items;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            textDTO = hotelsGalleryFullVI.text;
        }
        TextDTO textDTO2 = textDTO;
        if ((i12 & 8) != 0) {
            navigationButton = hotelsGalleryFullVI.navigationButton;
        }
        NavigationButton navigationButton2 = navigationButton;
        if ((i12 & 16) != 0) {
            i11 = hotelsGalleryFullVI.initialItemIndex;
        }
        return hotelsGalleryFullVI.copy(j12, list2, textDTO2, navigationButton2, i11);
    }

    @NotNull
    public final HotelsGalleryFullVI copy(long id2, @NotNull List<? extends GalleryItem> items, @NotNull TextDTO text, NavigationButton navigationButton, int initialItemIndex) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(text, "text");
        return new HotelsGalleryFullVI(id2, items, text, navigationButton, initialItemIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsGalleryFullVI)) {
            return false;
        }
        HotelsGalleryFullVI hotelsGalleryFullVI = (HotelsGalleryFullVI) other;
        return this.id == hotelsGalleryFullVI.id && Intrinsics.d(this.items, hotelsGalleryFullVI.items) && Intrinsics.d(this.text, hotelsGalleryFullVI.text) && Intrinsics.d(this.navigationButton, hotelsGalleryFullVI.navigationButton) && this.initialItemIndex == hotelsGalleryFullVI.initialItemIndex;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getInitialItemIndex() {
        return this.initialItemIndex;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    public final NavigationButton getNavigationButton() {
        return this.navigationButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.text, g.b(Long.hashCode(this.id) * 31, 31, this.items), 31);
        NavigationButton navigationButton = this.navigationButton;
        return Integer.hashCode(this.initialItemIndex) + ((a11 + (navigationButton == null ? 0 : navigationButton.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<GalleryItem> list = this.items;
        TextDTO textDTO = this.text;
        NavigationButton navigationButton = this.navigationButton;
        int i11 = this.initialItemIndex;
        StringBuilder b11 = Lh.b.b(j11, "HotelsGalleryFullVI(id=", ", items=", list);
        b11.append(", text=");
        b11.append(textDTO);
        b11.append(", navigationButton=");
        b11.append(navigationButton);
        return h.b(b11, ", initialItemIndex=", i11, ")");
    }
}

package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation;

import F3.G;
import Kk.C3532b;
import Nh.a;
import Nh.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;", "Ll20/c;", "", "id", "<init>", "(J)V", "J", "getId", "()J", "GalleryImageItem", "MoreButtonItem", "TagTextItem", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI$GalleryImageItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI$MoreButtonItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI$TagTextItem;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class HotelsGalleryFeedV2VI implements c {
    private final long id;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b+\u0010'R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b\u0010\u0010'\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI$GalleryImageItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "videoControlIcon", "", "isLarge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "hasTopPadding", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "isViewEventSent", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;ZLru/ozon/uni/atoms/af/AtomAction;ZLWZ/t;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getVideoControlIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getHasTopPadding", "LWZ/t;", "getViewEvent", "()LWZ/t;", "setViewEventSent", "(Z)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryImageItem extends HotelsGalleryFeedV2VI {
        private final AtomAction action;
        private final boolean hasTopPadding;
        private final long id;

        @NotNull
        private final ImageDTO image;
        private final boolean isLarge;
        private boolean isViewEventSent;
        private final IconDTO videoControlIcon;
        private final t viewEvent;

        public /* synthetic */ GalleryImageItem(long j11, ImageDTO imageDTO, IconDTO iconDTO, boolean z11, AtomAction atomAction, boolean z12, t tVar, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, imageDTO, iconDTO, z11, atomAction, z12, tVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z13);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryImageItem)) {
                return false;
            }
            GalleryImageItem galleryImageItem = (GalleryImageItem) other;
            return this.id == galleryImageItem.id && Intrinsics.d(this.image, galleryImageItem.image) && Intrinsics.d(this.videoControlIcon, galleryImageItem.videoControlIcon) && this.isLarge == galleryImageItem.isLarge && Intrinsics.d(this.action, galleryImageItem.action) && this.hasTopPadding == galleryImageItem.hasTopPadding && Intrinsics.d(this.viewEvent, galleryImageItem.viewEvent) && this.isViewEventSent == galleryImageItem.isViewEventSent;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final boolean getHasTopPadding() {
            return this.hasTopPadding;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation.HotelsGalleryFeedV2VI, l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final IconDTO getVideoControlIcon() {
            return this.videoControlIcon;
        }

        public final t getViewEvent() {
            return this.viewEvent;
        }

        public int hashCode() {
            int b11 = a.b(this.image, Long.hashCode(this.id) * 31, 31);
            IconDTO iconDTO = this.videoControlIcon;
            int a11 = C3532b.a((b11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.isLarge);
            AtomAction atomAction = this.action;
            int a12 = C3532b.a((a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.hasTopPadding);
            t tVar = this.viewEvent;
            return Boolean.hashCode(this.isViewEventSent) + ((a12 + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        /* renamed from: isLarge, reason: from getter */
        public final boolean getIsLarge() {
            return this.isLarge;
        }

        /* renamed from: isViewEventSent, reason: from getter */
        public final boolean getIsViewEventSent() {
            return this.isViewEventSent;
        }

        public final void setViewEventSent(boolean z11) {
            this.isViewEventSent = z11;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            ImageDTO imageDTO = this.image;
            IconDTO iconDTO = this.videoControlIcon;
            boolean z11 = this.isLarge;
            AtomAction atomAction = this.action;
            boolean z12 = this.hasTopPadding;
            t tVar = this.viewEvent;
            boolean z13 = this.isViewEventSent;
            StringBuilder c11 = b.c("GalleryImageItem(id=", j11, ", image=", imageDTO);
            c11.append(", videoControlIcon=");
            c11.append(iconDTO);
            c11.append(", isLarge=");
            c11.append(z11);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", hasTopPadding=");
            c11.append(z12);
            c11.append(", viewEvent=");
            c11.append(tVar);
            c11.append(", isViewEventSent=");
            c11.append(z13);
            c11.append(")");
            return c11.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GalleryImageItem(long j11, @NotNull ImageDTO image, IconDTO iconDTO, boolean z11, AtomAction atomAction, boolean z12, t tVar, boolean z13) {
            super(j11, null);
            Intrinsics.checkNotNullParameter(image, "image");
            this.id = j11;
            this.image = image;
            this.videoControlIcon = iconDTO;
            this.isLarge = z11;
            this.action = atomAction;
            this.hasTopPadding = z12;
            this.viewEvent = tVar;
            this.isViewEventSent = z13;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI$MoreButtonItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MoreButtonItem extends HotelsGalleryFeedV2VI {

        @NotNull
        private final ButtonV3DTO button;
        private final long id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoreButtonItem(long j11, @NotNull ButtonV3DTO button) {
            super(j11, null);
            Intrinsics.checkNotNullParameter(button, "button");
            this.id = j11;
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoreButtonItem)) {
                return false;
            }
            MoreButtonItem moreButtonItem = (MoreButtonItem) other;
            return this.id == moreButtonItem.id && Intrinsics.d(this.button, moreButtonItem.button);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation.HotelsGalleryFeedV2VI, l20.c
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return this.button.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = G.c("MoreButtonItem(id=", this.id, ", button=", this.button);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI$TagTextItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TagTextItem extends HotelsGalleryFeedV2VI {
        private final long id;

        @NotNull
        private final TextDTO text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TagTextItem(long j11, @NotNull TextDTO text) {
            super(j11, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = j11;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TagTextItem)) {
                return false;
            }
            TagTextItem tagTextItem = (TagTextItem) other;
            return this.id == tagTextItem.id && Intrinsics.d(this.text, tagTextItem.text);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation.HotelsGalleryFeedV2VI, l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder b11 = TY.a.b("TagTextItem(id=", this.id, ", text=", this.text);
            b11.append(")");
            return b11.toString();
        }
    }

    public /* synthetic */ HotelsGalleryFeedV2VI(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    private HotelsGalleryFeedV2VI(long j11) {
        this.id = j11;
    }
}

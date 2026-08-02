package ru.ozon.app.android.pdp.widgets.galleryV3.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.TokenizedVideoEvents;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "", "<init>", "()V", "event", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "getEvent", "()Lru/ozon/app/android/video/TokenizedVideoEvents;", "Open", "Start", "End", "SoundMute", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState$End;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState$Open;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState$SoundMute;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState$Start;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GalleryV3VideoState {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState$End;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "event", "<init>", "(Lru/ozon/app/android/video/TokenizedVideoEvents;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "getEvent", "()Lru/ozon/app/android/video/TokenizedVideoEvents;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class End extends GalleryV3VideoState {
        public static final int $stable = TokenizedVideoEvents.$stable;

        @NotNull
        private final TokenizedVideoEvents event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public End(@NotNull TokenizedVideoEvents event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof End) && Intrinsics.d(this.event, ((End) other).event);
        }

        @Override // ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3VideoState
        @NotNull
        public TokenizedVideoEvents getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @NotNull
        public String toString() {
            return "End(event=" + this.event + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState$Open;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "event", "<init>", "(Lru/ozon/app/android/video/TokenizedVideoEvents;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "getEvent", "()Lru/ozon/app/android/video/TokenizedVideoEvents;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Open extends GalleryV3VideoState {
        public static final int $stable = TokenizedVideoEvents.$stable;

        @NotNull
        private final TokenizedVideoEvents event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Open(@NotNull TokenizedVideoEvents event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Open) && Intrinsics.d(this.event, ((Open) other).event);
        }

        @Override // ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3VideoState
        @NotNull
        public TokenizedVideoEvents getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @NotNull
        public String toString() {
            return "Open(event=" + this.event + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState$SoundMute;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "", "isMute", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "event", "<init>", "(ZLru/ozon/app/android/video/TokenizedVideoEvents;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "getEvent", "()Lru/ozon/app/android/video/TokenizedVideoEvents;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SoundMute extends GalleryV3VideoState {
        public static final int $stable = TokenizedVideoEvents.$stable;
        private final TokenizedVideoEvents event;
        private final boolean isMute;

        public SoundMute(boolean z11, TokenizedVideoEvents tokenizedVideoEvents) {
            super(null);
            this.isMute = z11;
            this.event = tokenizedVideoEvents;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SoundMute)) {
                return false;
            }
            SoundMute soundMute = (SoundMute) other;
            return this.isMute == soundMute.isMute && Intrinsics.d(this.event, soundMute.event);
        }

        @Override // ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3VideoState
        public TokenizedVideoEvents getEvent() {
            return this.event;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isMute) * 31;
            TokenizedVideoEvents tokenizedVideoEvents = this.event;
            return hashCode + (tokenizedVideoEvents == null ? 0 : tokenizedVideoEvents.hashCode());
        }

        @NotNull
        public String toString() {
            return "SoundMute(isMute=" + this.isMute + ", event=" + this.event + ")";
        }

        public /* synthetic */ SoundMute(boolean z11, TokenizedVideoEvents tokenizedVideoEvents, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, (i11 & 2) != 0 ? null : tokenizedVideoEvents);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState$Start;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "event", "<init>", "(Lru/ozon/app/android/video/TokenizedVideoEvents;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "getEvent", "()Lru/ozon/app/android/video/TokenizedVideoEvents;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Start extends GalleryV3VideoState {
        public static final int $stable = TokenizedVideoEvents.$stable;

        @NotNull
        private final TokenizedVideoEvents event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Start(@NotNull TokenizedVideoEvents event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Start) && Intrinsics.d(this.event, ((Start) other).event);
        }

        @Override // ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3VideoState
        @NotNull
        public TokenizedVideoEvents getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @NotNull
        public String toString() {
            return "Start(event=" + this.event + ")";
        }
    }

    public /* synthetic */ GalleryV3VideoState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TokenizedVideoEvents getEvent();

    private GalleryV3VideoState() {
    }
}

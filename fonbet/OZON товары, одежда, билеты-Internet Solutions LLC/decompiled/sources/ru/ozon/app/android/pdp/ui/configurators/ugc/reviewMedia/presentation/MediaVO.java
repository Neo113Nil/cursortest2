package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation;

import B0.A0;
import Cm.e;
import Ep.a;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0003$%&B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State;", "state", "", "deeplink", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;", "type", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$SupportIcon;", "supportIcon", "", "size", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State;Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$SupportIcon;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State;", "getState", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State;", "Ljava/lang/String;", "getDeeplink", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;", "getType", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$SupportIcon;", "getSupportIcon", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$SupportIcon;", "Ljava/lang/Integer;", "getSize", "()Ljava/lang/Integer;", "MediaType", "State", "SupportIcon", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MediaVO {
    public static final int $stable = 0;
    private final String deeplink;
    private final Integer size;

    @NotNull
    private final State state;
    private final SupportIcon supportIcon;

    @NotNull
    private final MediaType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;", "", "<init>", "()V", "PHOTO", "VIDEO", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType$PHOTO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType$VIDEO;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MediaType {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType$PHOTO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;", "<init>", "()V", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PHOTO extends MediaType {

            @NotNull
            public static final PHOTO INSTANCE = new PHOTO();

            private PHOTO() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType$VIDEO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "videoInfo", "<init>", "(Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VIDEO extends MediaType {
            public static final int $stable = PreloadVideoInfo.$stable;
            private final PreloadVideoInfo videoInfo;

            public VIDEO(PreloadVideoInfo preloadVideoInfo) {
                super(null);
                this.videoInfo = preloadVideoInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VIDEO) && Intrinsics.d(this.videoInfo, ((VIDEO) other).videoInfo);
            }

            public final PreloadVideoInfo getVideoInfo() {
                return this.videoInfo;
            }

            public int hashCode() {
                PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                if (preloadVideoInfo == null) {
                    return 0;
                }
                return preloadVideoInfo.hashCode();
            }

            @NotNull
            public String toString() {
                return "VIDEO(videoInfo=" + this.videoInfo + ")";
            }
        }

        public /* synthetic */ MediaType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MediaType() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State;", "", "<init>", "()V", "Processing", "Ready", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State$Processing;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State$Ready;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class State {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State$Processing;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State;", "<init>", "()V", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Processing extends State {

            @NotNull
            public static final Processing INSTANCE = new Processing();

            private Processing() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State$Ready;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State;", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Ready extends State {

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ready(@NotNull String url) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ready) && Intrinsics.d(this.url, ((Ready) other).url);
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Ready(url=", this.url, ")");
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$SupportIcon;", "", "", "iconId", "tintColor", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIconId", "getTintColor", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SupportIcon {
        private final int iconId;
        private final int tintColor;

        public SupportIcon(int i11, int i12) {
            this.iconId = i11;
            this.tintColor = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportIcon)) {
                return false;
            }
            SupportIcon supportIcon = (SupportIcon) other;
            return this.iconId == supportIcon.iconId && this.tintColor == supportIcon.tintColor;
        }

        public final int getIconId() {
            return this.iconId;
        }

        public final int getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.tintColor) + (Integer.hashCode(this.iconId) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("SupportIcon(iconId=", this.iconId, ", tintColor=", ")", this.tintColor);
        }
    }

    public MediaVO(@NotNull State state, String str, @NotNull MediaType type, SupportIcon supportIcon, Integer num) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        this.state = state;
        this.deeplink = str;
        this.type = type;
        this.supportIcon = supportIcon;
        this.size = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaVO)) {
            return false;
        }
        MediaVO mediaVO = (MediaVO) other;
        return Intrinsics.d(this.state, mediaVO.state) && Intrinsics.d(this.deeplink, mediaVO.deeplink) && Intrinsics.d(this.type, mediaVO.type) && Intrinsics.d(this.supportIcon, mediaVO.supportIcon) && Intrinsics.d(this.size, mediaVO.size);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Integer getSize() {
        return this.size;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    public final SupportIcon getSupportIcon() {
        return this.supportIcon;
    }

    @NotNull
    public final MediaType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        String str = this.deeplink;
        int hashCode2 = (this.type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        SupportIcon supportIcon = this.supportIcon;
        int hashCode3 = (hashCode2 + (supportIcon == null ? 0 : supportIcon.hashCode())) * 31;
        Integer num = this.size;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        State state = this.state;
        String str = this.deeplink;
        MediaType mediaType = this.type;
        SupportIcon supportIcon = this.supportIcon;
        Integer num = this.size;
        StringBuilder sb2 = new StringBuilder("MediaVO(state=");
        sb2.append(state);
        sb2.append(", deeplink=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(mediaType);
        sb2.append(", supportIcon=");
        sb2.append(supportIcon);
        sb2.append(", size=");
        return a.c(sb2, num, ")");
    }

    public /* synthetic */ MediaVO(State state, String str, MediaType mediaType, SupportIcon supportIcon, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(state, str, mediaType, supportIcon, (i11 & 16) != 0 ? null : num);
    }
}

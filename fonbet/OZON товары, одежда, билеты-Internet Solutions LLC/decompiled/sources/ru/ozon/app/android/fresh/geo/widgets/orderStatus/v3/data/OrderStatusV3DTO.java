package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.data;

import G.g;
import Lc.a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "progress", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getProgress", "()Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Progress", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderStatusV3DTO {

    @NotNull
    private final Progress progress;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress;", "", "progress", "", "ringProgressColor", "", "type", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType;", "<init>", "(FLjava/lang/String;Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType;)V", "getProgress", "()F", "getRingProgressColor", "()Ljava/lang/String;", "getType", "()Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ProgressType", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Progress {
        private final float progress;

        @NotNull
        private final String ringProgressColor;

        @NotNull
        private final ProgressType type;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType;", "", "<init>", "()V", "ProgressIcon", "ProgressText", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType$ProgressIcon;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType$ProgressText;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class ProgressType {

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType$ProgressIcon;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ProgressIcon extends ProgressType {

                @NotNull
                private final IconDTO icon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ProgressIcon(@NotNull IconDTO icon) {
                    super(null);
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    this.icon = icon;
                }

                public static /* synthetic */ ProgressIcon copy$default(ProgressIcon progressIcon, IconDTO iconDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        iconDTO = progressIcon.icon;
                    }
                    return progressIcon.copy(iconDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final IconDTO getIcon() {
                    return this.icon;
                }

                @NotNull
                public final ProgressIcon copy(@NotNull IconDTO icon) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    return new ProgressIcon(icon);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ProgressIcon) && Intrinsics.d(this.icon, ((ProgressIcon) other).icon);
                }

                @NotNull
                public final IconDTO getIcon() {
                    return this.icon;
                }

                public int hashCode() {
                    return this.icon.hashCode();
                }

                @NotNull
                public String toString() {
                    return "ProgressIcon(icon=" + this.icon + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType$ProgressText;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ProgressText extends ProgressType {

                @NotNull
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ProgressText(@NotNull TextDTO title, @NotNull TextDTO subtitle) {
                    super(null);
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    this.title = title;
                    this.subtitle = subtitle;
                }

                public static /* synthetic */ ProgressText copy$default(ProgressText progressText, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = progressText.title;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO2 = progressText.subtitle;
                    }
                    return progressText.copy(textDTO, textDTO2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final ProgressText copy(@NotNull TextDTO title, @NotNull TextDTO subtitle) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    return new ProgressText(title, subtitle);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ProgressText)) {
                        return false;
                    }
                    ProgressText progressText = (ProgressText) other;
                    return Intrinsics.d(this.title, progressText.title) && Intrinsics.d(this.subtitle, progressText.subtitle);
                }

                @NotNull
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.subtitle.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return a.b("ProgressText(title=", this.title, ", subtitle=", this.subtitle, ")");
                }
            }

            public /* synthetic */ ProgressType(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ProgressType() {
            }
        }

        public Progress(float f7, @NotNull String ringProgressColor, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "progressText", type = ProgressType.ProgressText.class), @ProtoOneOfSignature(name = "progressIcon", type = ProgressType.ProgressIcon.class)}) @NotNull @ProtoOneOf(label = "type") ProgressType type) {
            Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
            Intrinsics.checkNotNullParameter(type, "type");
            this.progress = f7;
            this.ringProgressColor = ringProgressColor;
            this.type = type;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, float f7, String str, ProgressType progressType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f7 = progress.progress;
            }
            if ((i11 & 2) != 0) {
                str = progress.ringProgressColor;
            }
            if ((i11 & 4) != 0) {
                progressType = progress.type;
            }
            return progress.copy(f7, str, progressType);
        }

        /* renamed from: component1, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRingProgressColor() {
            return this.ringProgressColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ProgressType getType() {
            return this.type;
        }

        @NotNull
        public final Progress copy(float progress, @NotNull String ringProgressColor, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "progressText", type = ProgressType.ProgressText.class), @ProtoOneOfSignature(name = "progressIcon", type = ProgressType.ProgressIcon.class)}) @NotNull @ProtoOneOf(label = "type") ProgressType type) {
            Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Progress(progress, ringProgressColor, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Float.compare(this.progress, progress.progress) == 0 && Intrinsics.d(this.ringProgressColor, progress.ringProgressColor) && Intrinsics.d(this.type, progress.type);
        }

        public final float getProgress() {
            return this.progress;
        }

        @NotNull
        public final String getRingProgressColor() {
            return this.ringProgressColor;
        }

        @NotNull
        public final ProgressType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + g.a(Float.hashCode(this.progress) * 31, 31, this.ringProgressColor);
        }

        @NotNull
        public String toString() {
            return "Progress(progress=" + this.progress + ", ringProgressColor=" + this.ringProgressColor + ", type=" + this.type + ")";
        }
    }

    public OrderStatusV3DTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull Progress progress, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.title = title;
        this.subtitle = subtitle;
        this.progress = progress;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderStatusV3DTO copy$default(OrderStatusV3DTO orderStatusV3DTO, TextDTO textDTO, TextDTO textDTO2, Progress progress, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = orderStatusV3DTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = orderStatusV3DTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            progress = orderStatusV3DTO.progress;
        }
        if ((i11 & 8) != 0) {
            map = orderStatusV3DTO.trackingInfo;
        }
        return orderStatusV3DTO.copy(textDTO, textDTO2, progress, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Progress getProgress() {
        return this.progress;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final OrderStatusV3DTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull Progress progress, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new OrderStatusV3DTO(title, subtitle, progress, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderStatusV3DTO)) {
            return false;
        }
        OrderStatusV3DTO orderStatusV3DTO = (OrderStatusV3DTO) other;
        return Intrinsics.d(this.title, orderStatusV3DTO.title) && Intrinsics.d(this.subtitle, orderStatusV3DTO.subtitle) && Intrinsics.d(this.progress, orderStatusV3DTO.progress) && Intrinsics.d(this.trackingInfo, orderStatusV3DTO.trackingInfo);
    }

    @NotNull
    public final Progress getProgress() {
        return this.progress;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.progress.hashCode() + b.a(this.subtitle, this.title.hashCode() * 31, 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        Progress progress = this.progress;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("OrderStatusV3DTO(title=", textDTO, ", subtitle=", textDTO2, ", progress=");
        g10.append(progress);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}

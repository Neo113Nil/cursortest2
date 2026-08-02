package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import com.ironsource.mediationsdk.j;
import defpackage.b6h;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002QRB\u008b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000f\u0012\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u00109\u001a\u00020:*\u00020\u0005H\u0000¢\u0006\u0002\b;J\u0011\u0010<\u001a\u00020=*\u00020\u0003H\u0000¢\u0006\u0002\b>J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0013\u0010E\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fHÆ\u0003J\u0013\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fHÆ\u0003J\u0013\u0010G\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000fHÆ\u0003J\u0013\u0010H\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000fHÆ\u0003J¦\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000f2\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0010HÖ\u0001J\t\u0010O\u001a\u00020PHÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R(\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00100\"\u0004\b6\u00102R(\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00100\"\u0004\b8\u00102¨\u0006S"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto;", "", "position", "Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeWidgetPositionDto;", "thumbnailType", "Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeThumbnailTypeDto;", "margins", "Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "border", "Lcom/blaze/blazesdk/widgets/models/WidgetItemImageContainerBorderStyleRemoteDto;", "cornerRadius", "", "gradientOverlay", "Lcom/blaze/blazesdk/widgets/models/WidgetItemImageGradientOverlayStyleRemoteDto;", "width", "Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "", "height", "ratio", "cornerRadiusRatio", "<init>", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeWidgetPositionDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeThumbnailTypeDto;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemImageContainerBorderStyleRemoteDto;Ljava/lang/Float;Lcom/blaze/blazesdk/widgets/models/WidgetItemImageGradientOverlayStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "getPosition", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeWidgetPositionDto;", "setPosition", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeWidgetPositionDto;)V", "getThumbnailType", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeThumbnailTypeDto;", "setThumbnailType", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeThumbnailTypeDto;)V", "getMargins", "()Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;", "setMargins", "(Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;)V", "getBorder", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemImageContainerBorderStyleRemoteDto;", "setBorder", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemImageContainerBorderStyleRemoteDto;)V", "getCornerRadius", "()Ljava/lang/Float;", "setCornerRadius", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getGradientOverlay", "()Lcom/blaze/blazesdk/widgets/models/WidgetItemImageGradientOverlayStyleRemoteDto;", "setGradientOverlay", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemImageGradientOverlayStyleRemoteDto;)V", "getWidth", "()Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;", "setWidth", "(Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)V", "getHeight", "setHeight", "getRatio", "setRatio", "getCornerRadiusRatio", "setCornerRadiusRatio", "toBlazeThumbnailType", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeThumbnailType;", "toBlazeThumbnailType$blazesdk_release", "toBlazeImagePosition", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeImagePosition;", "toBlazeImagePosition$blazesdk_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeWidgetPositionDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeThumbnailTypeDto;Lcom/blaze/blazesdk/widgets/models/InsetsRemoteDto;Lcom/blaze/blazesdk/widgets/models/WidgetItemImageContainerBorderStyleRemoteDto;Ljava/lang/Float;Lcom/blaze/blazesdk/widgets/models/WidgetItemImageGradientOverlayStyleRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;Lcom/blaze/blazesdk/widgets/models/OverridableValueRemoteDto;)Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto;", "equals", "", "other", "hashCode", "toString", "", "BlazeWidgetPositionDto", "BlazeThumbnailTypeDto", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WidgetItemImageStyleRemoteDto {
    public static final int $stable = 8;

    @b6h("border")
    @Nullable
    private WidgetItemImageContainerBorderStyleRemoteDto border;

    @b6h("cornerRadius")
    @Nullable
    private Float cornerRadius;

    @b6h("cornerRadiusRatio")
    @Nullable
    private OverridableValueRemoteDto<Float> cornerRadiusRatio;

    @b6h("gradientOverlay")
    @Nullable
    private WidgetItemImageGradientOverlayStyleRemoteDto gradientOverlay;

    @b6h("height")
    @Nullable
    private OverridableValueRemoteDto<Integer> height;

    @b6h("margins")
    @Nullable
    private InsetsRemoteDto margins;

    @b6h("position")
    @Nullable
    private BlazeWidgetPositionDto position;

    @b6h("ratio")
    @Nullable
    private OverridableValueRemoteDto<Float> ratio;

    @b6h("thumbnailType")
    @Nullable
    private BlazeThumbnailTypeDto thumbnailType;

    @b6h("width")
    @Nullable
    private OverridableValueRemoteDto<Integer> width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeThumbnailTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "SQUARE_ICON", "VERTICAL_TWO_BY_THREE", j.f, "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlazeThumbnailTypeDto {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeThumbnailTypeDto[] $VALUES;

        @b6h("SquareIcon")
        public static final BlazeThumbnailTypeDto SQUARE_ICON = new BlazeThumbnailTypeDto("SQUARE_ICON", 0);

        @b6h("VerticalTwoByThree")
        public static final BlazeThumbnailTypeDto VERTICAL_TWO_BY_THREE = new BlazeThumbnailTypeDto("VERTICAL_TWO_BY_THREE", 1);

        @b6h("Custom")
        public static final BlazeThumbnailTypeDto CUSTOM = new BlazeThumbnailTypeDto(j.f, 2);

        private static final /* synthetic */ BlazeThumbnailTypeDto[] $values() {
            return new BlazeThumbnailTypeDto[]{SQUARE_ICON, VERTICAL_TWO_BY_THREE, CUSTOM};
        }

        static {
            BlazeThumbnailTypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeThumbnailTypeDto(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeThumbnailTypeDto valueOf(String str) {
            return (BlazeThumbnailTypeDto) Enum.valueOf(BlazeThumbnailTypeDto.class, str);
        }

        public static BlazeThumbnailTypeDto[] values() {
            return (BlazeThumbnailTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetItemImageStyleRemoteDto$BlazeWidgetPositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_START", "TOP_CENTER", "TOP_END", "CENTER_START", "CENTER", "CENTER_END", "BOTTOM_START", "BOTTOM_CENTER", "BOTTOM_END", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlazeWidgetPositionDto {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeWidgetPositionDto[] $VALUES;

        @b6h("TopStart")
        public static final BlazeWidgetPositionDto TOP_START = new BlazeWidgetPositionDto("TOP_START", 0);

        @b6h("TopCenter")
        public static final BlazeWidgetPositionDto TOP_CENTER = new BlazeWidgetPositionDto("TOP_CENTER", 1);

        @b6h("TopEnd")
        public static final BlazeWidgetPositionDto TOP_END = new BlazeWidgetPositionDto("TOP_END", 2);

        @b6h("CenterStart")
        public static final BlazeWidgetPositionDto CENTER_START = new BlazeWidgetPositionDto("CENTER_START", 3);

        @b6h("Center")
        public static final BlazeWidgetPositionDto CENTER = new BlazeWidgetPositionDto("CENTER", 4);

        @b6h("CenterEnd")
        public static final BlazeWidgetPositionDto CENTER_END = new BlazeWidgetPositionDto("CENTER_END", 5);

        @b6h("BottomStart")
        public static final BlazeWidgetPositionDto BOTTOM_START = new BlazeWidgetPositionDto("BOTTOM_START", 6);

        @b6h("BottomCenter")
        public static final BlazeWidgetPositionDto BOTTOM_CENTER = new BlazeWidgetPositionDto("BOTTOM_CENTER", 7);

        @b6h("BottomEnd")
        public static final BlazeWidgetPositionDto BOTTOM_END = new BlazeWidgetPositionDto("BOTTOM_END", 8);

        private static final /* synthetic */ BlazeWidgetPositionDto[] $values() {
            return new BlazeWidgetPositionDto[]{TOP_START, TOP_CENTER, TOP_END, CENTER_START, CENTER, CENTER_END, BOTTOM_START, BOTTOM_CENTER, BOTTOM_END};
        }

        static {
            BlazeWidgetPositionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeWidgetPositionDto(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeWidgetPositionDto valueOf(String str) {
            return (BlazeWidgetPositionDto) Enum.valueOf(BlazeWidgetPositionDto.class, str);
        }

        public static BlazeWidgetPositionDto[] values() {
            return (BlazeWidgetPositionDto[]) $VALUES.clone();
        }
    }

    public WidgetItemImageStyleRemoteDto(@Nullable BlazeWidgetPositionDto blazeWidgetPositionDto, @Nullable BlazeThumbnailTypeDto blazeThumbnailTypeDto, @Nullable InsetsRemoteDto insetsRemoteDto, @Nullable WidgetItemImageContainerBorderStyleRemoteDto widgetItemImageContainerBorderStyleRemoteDto, @Nullable Float f, @Nullable WidgetItemImageGradientOverlayStyleRemoteDto widgetItemImageGradientOverlayStyleRemoteDto, @Nullable OverridableValueRemoteDto<Integer> overridableValueRemoteDto, @Nullable OverridableValueRemoteDto<Integer> overridableValueRemoteDto2, @Nullable OverridableValueRemoteDto<Float> overridableValueRemoteDto3, @Nullable OverridableValueRemoteDto<Float> overridableValueRemoteDto4) {
        this.position = blazeWidgetPositionDto;
        this.thumbnailType = blazeThumbnailTypeDto;
        this.margins = insetsRemoteDto;
        this.border = widgetItemImageContainerBorderStyleRemoteDto;
        this.cornerRadius = f;
        this.gradientOverlay = widgetItemImageGradientOverlayStyleRemoteDto;
        this.width = overridableValueRemoteDto;
        this.height = overridableValueRemoteDto2;
        this.ratio = overridableValueRemoteDto3;
        this.cornerRadiusRatio = overridableValueRemoteDto4;
    }

    public static /* synthetic */ WidgetItemImageStyleRemoteDto copy$default(WidgetItemImageStyleRemoteDto widgetItemImageStyleRemoteDto, BlazeWidgetPositionDto blazeWidgetPositionDto, BlazeThumbnailTypeDto blazeThumbnailTypeDto, InsetsRemoteDto insetsRemoteDto, WidgetItemImageContainerBorderStyleRemoteDto widgetItemImageContainerBorderStyleRemoteDto, Float f, WidgetItemImageGradientOverlayStyleRemoteDto widgetItemImageGradientOverlayStyleRemoteDto, OverridableValueRemoteDto overridableValueRemoteDto, OverridableValueRemoteDto overridableValueRemoteDto2, OverridableValueRemoteDto overridableValueRemoteDto3, OverridableValueRemoteDto overridableValueRemoteDto4, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeWidgetPositionDto = widgetItemImageStyleRemoteDto.position;
        }
        if ((i & 2) != 0) {
            blazeThumbnailTypeDto = widgetItemImageStyleRemoteDto.thumbnailType;
        }
        if ((i & 4) != 0) {
            insetsRemoteDto = widgetItemImageStyleRemoteDto.margins;
        }
        if ((i & 8) != 0) {
            widgetItemImageContainerBorderStyleRemoteDto = widgetItemImageStyleRemoteDto.border;
        }
        if ((i & 16) != 0) {
            f = widgetItemImageStyleRemoteDto.cornerRadius;
        }
        if ((i & 32) != 0) {
            widgetItemImageGradientOverlayStyleRemoteDto = widgetItemImageStyleRemoteDto.gradientOverlay;
        }
        if ((i & 64) != 0) {
            overridableValueRemoteDto = widgetItemImageStyleRemoteDto.width;
        }
        if ((i & 128) != 0) {
            overridableValueRemoteDto2 = widgetItemImageStyleRemoteDto.height;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            overridableValueRemoteDto3 = widgetItemImageStyleRemoteDto.ratio;
        }
        if ((i & 512) != 0) {
            overridableValueRemoteDto4 = widgetItemImageStyleRemoteDto.cornerRadiusRatio;
        }
        OverridableValueRemoteDto overridableValueRemoteDto5 = overridableValueRemoteDto3;
        OverridableValueRemoteDto overridableValueRemoteDto6 = overridableValueRemoteDto4;
        OverridableValueRemoteDto overridableValueRemoteDto7 = overridableValueRemoteDto;
        OverridableValueRemoteDto overridableValueRemoteDto8 = overridableValueRemoteDto2;
        Float f2 = f;
        WidgetItemImageGradientOverlayStyleRemoteDto widgetItemImageGradientOverlayStyleRemoteDto2 = widgetItemImageGradientOverlayStyleRemoteDto;
        return widgetItemImageStyleRemoteDto.copy(blazeWidgetPositionDto, blazeThumbnailTypeDto, insetsRemoteDto, widgetItemImageContainerBorderStyleRemoteDto, f2, widgetItemImageGradientOverlayStyleRemoteDto2, overridableValueRemoteDto7, overridableValueRemoteDto8, overridableValueRemoteDto5, overridableValueRemoteDto6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final BlazeWidgetPositionDto getPosition() {
        return this.position;
    }

    @Nullable
    public final OverridableValueRemoteDto<Float> component10() {
        return this.cornerRadiusRatio;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BlazeThumbnailTypeDto getThumbnailType() {
        return this.thumbnailType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final InsetsRemoteDto getMargins() {
        return this.margins;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final WidgetItemImageContainerBorderStyleRemoteDto getBorder() {
        return this.border;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final WidgetItemImageGradientOverlayStyleRemoteDto getGradientOverlay() {
        return this.gradientOverlay;
    }

    @Nullable
    public final OverridableValueRemoteDto<Integer> component7() {
        return this.width;
    }

    @Nullable
    public final OverridableValueRemoteDto<Integer> component8() {
        return this.height;
    }

    @Nullable
    public final OverridableValueRemoteDto<Float> component9() {
        return this.ratio;
    }

    @NotNull
    public final WidgetItemImageStyleRemoteDto copy(@Nullable BlazeWidgetPositionDto position, @Nullable BlazeThumbnailTypeDto thumbnailType, @Nullable InsetsRemoteDto margins, @Nullable WidgetItemImageContainerBorderStyleRemoteDto border, @Nullable Float cornerRadius, @Nullable WidgetItemImageGradientOverlayStyleRemoteDto gradientOverlay, @Nullable OverridableValueRemoteDto<Integer> width, @Nullable OverridableValueRemoteDto<Integer> height, @Nullable OverridableValueRemoteDto<Float> ratio, @Nullable OverridableValueRemoteDto<Float> cornerRadiusRatio) {
        return new WidgetItemImageStyleRemoteDto(position, thumbnailType, margins, border, cornerRadius, gradientOverlay, width, height, ratio, cornerRadiusRatio);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetItemImageStyleRemoteDto)) {
            return false;
        }
        WidgetItemImageStyleRemoteDto widgetItemImageStyleRemoteDto = (WidgetItemImageStyleRemoteDto) other;
        return this.position == widgetItemImageStyleRemoteDto.position && this.thumbnailType == widgetItemImageStyleRemoteDto.thumbnailType && Intrinsics.c(this.margins, widgetItemImageStyleRemoteDto.margins) && Intrinsics.c(this.border, widgetItemImageStyleRemoteDto.border) && Intrinsics.c(this.cornerRadius, widgetItemImageStyleRemoteDto.cornerRadius) && Intrinsics.c(this.gradientOverlay, widgetItemImageStyleRemoteDto.gradientOverlay) && Intrinsics.c(this.width, widgetItemImageStyleRemoteDto.width) && Intrinsics.c(this.height, widgetItemImageStyleRemoteDto.height) && Intrinsics.c(this.ratio, widgetItemImageStyleRemoteDto.ratio) && Intrinsics.c(this.cornerRadiusRatio, widgetItemImageStyleRemoteDto.cornerRadiusRatio);
    }

    @Nullable
    public final WidgetItemImageContainerBorderStyleRemoteDto getBorder() {
        return this.border;
    }

    @Nullable
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public final OverridableValueRemoteDto<Float> getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    @Nullable
    public final WidgetItemImageGradientOverlayStyleRemoteDto getGradientOverlay() {
        return this.gradientOverlay;
    }

    @Nullable
    public final OverridableValueRemoteDto<Integer> getHeight() {
        return this.height;
    }

    @Nullable
    public final InsetsRemoteDto getMargins() {
        return this.margins;
    }

    @Nullable
    public final BlazeWidgetPositionDto getPosition() {
        return this.position;
    }

    @Nullable
    public final OverridableValueRemoteDto<Float> getRatio() {
        return this.ratio;
    }

    @Nullable
    public final BlazeThumbnailTypeDto getThumbnailType() {
        return this.thumbnailType;
    }

    @Nullable
    public final OverridableValueRemoteDto<Integer> getWidth() {
        return this.width;
    }

    public int hashCode() {
        BlazeWidgetPositionDto blazeWidgetPositionDto = this.position;
        int hashCode = (blazeWidgetPositionDto == null ? 0 : blazeWidgetPositionDto.hashCode()) * 31;
        BlazeThumbnailTypeDto blazeThumbnailTypeDto = this.thumbnailType;
        int hashCode2 = (hashCode + (blazeThumbnailTypeDto == null ? 0 : blazeThumbnailTypeDto.hashCode())) * 31;
        InsetsRemoteDto insetsRemoteDto = this.margins;
        int hashCode3 = (hashCode2 + (insetsRemoteDto == null ? 0 : insetsRemoteDto.hashCode())) * 31;
        WidgetItemImageContainerBorderStyleRemoteDto widgetItemImageContainerBorderStyleRemoteDto = this.border;
        int hashCode4 = (hashCode3 + (widgetItemImageContainerBorderStyleRemoteDto == null ? 0 : widgetItemImageContainerBorderStyleRemoteDto.hashCode())) * 31;
        Float f = this.cornerRadius;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        WidgetItemImageGradientOverlayStyleRemoteDto widgetItemImageGradientOverlayStyleRemoteDto = this.gradientOverlay;
        int hashCode6 = (hashCode5 + (widgetItemImageGradientOverlayStyleRemoteDto == null ? 0 : widgetItemImageGradientOverlayStyleRemoteDto.hashCode())) * 31;
        OverridableValueRemoteDto<Integer> overridableValueRemoteDto = this.width;
        int hashCode7 = (hashCode6 + (overridableValueRemoteDto == null ? 0 : overridableValueRemoteDto.hashCode())) * 31;
        OverridableValueRemoteDto<Integer> overridableValueRemoteDto2 = this.height;
        int hashCode8 = (hashCode7 + (overridableValueRemoteDto2 == null ? 0 : overridableValueRemoteDto2.hashCode())) * 31;
        OverridableValueRemoteDto<Float> overridableValueRemoteDto3 = this.ratio;
        int hashCode9 = (hashCode8 + (overridableValueRemoteDto3 == null ? 0 : overridableValueRemoteDto3.hashCode())) * 31;
        OverridableValueRemoteDto<Float> overridableValueRemoteDto4 = this.cornerRadiusRatio;
        return hashCode9 + (overridableValueRemoteDto4 != null ? overridableValueRemoteDto4.hashCode() : 0);
    }

    public final void setBorder(@Nullable WidgetItemImageContainerBorderStyleRemoteDto widgetItemImageContainerBorderStyleRemoteDto) {
        this.border = widgetItemImageContainerBorderStyleRemoteDto;
    }

    public final void setCornerRadius(@Nullable Float f) {
        this.cornerRadius = f;
    }

    public final void setCornerRadiusRatio(@Nullable OverridableValueRemoteDto<Float> overridableValueRemoteDto) {
        this.cornerRadiusRatio = overridableValueRemoteDto;
    }

    public final void setGradientOverlay(@Nullable WidgetItemImageGradientOverlayStyleRemoteDto widgetItemImageGradientOverlayStyleRemoteDto) {
        this.gradientOverlay = widgetItemImageGradientOverlayStyleRemoteDto;
    }

    public final void setHeight(@Nullable OverridableValueRemoteDto<Integer> overridableValueRemoteDto) {
        this.height = overridableValueRemoteDto;
    }

    public final void setMargins(@Nullable InsetsRemoteDto insetsRemoteDto) {
        this.margins = insetsRemoteDto;
    }

    public final void setPosition(@Nullable BlazeWidgetPositionDto blazeWidgetPositionDto) {
        this.position = blazeWidgetPositionDto;
    }

    public final void setRatio(@Nullable OverridableValueRemoteDto<Float> overridableValueRemoteDto) {
        this.ratio = overridableValueRemoteDto;
    }

    public final void setThumbnailType(@Nullable BlazeThumbnailTypeDto blazeThumbnailTypeDto) {
        this.thumbnailType = blazeThumbnailTypeDto;
    }

    public final void setWidth(@Nullable OverridableValueRemoteDto<Integer> overridableValueRemoteDto) {
        this.width = overridableValueRemoteDto;
    }

    @NotNull
    public final BlazeWidgetItemImageStyle.BlazeImagePosition toBlazeImagePosition$blazesdk_release(@NotNull BlazeWidgetPositionDto blazeWidgetPositionDto) {
        blazeWidgetPositionDto.getClass();
        switch (b.b[blazeWidgetPositionDto.ordinal()]) {
            case 1:
                return BlazeWidgetItemImageStyle.BlazeImagePosition.TopStart;
            case 2:
                return BlazeWidgetItemImageStyle.BlazeImagePosition.TopCenter;
            case 3:
                return BlazeWidgetItemImageStyle.BlazeImagePosition.TopEnd;
            case 4:
                return BlazeWidgetItemImageStyle.BlazeImagePosition.CenterStart;
            case 5:
                return BlazeWidgetItemImageStyle.BlazeImagePosition.Center;
            case 6:
                return BlazeWidgetItemImageStyle.BlazeImagePosition.CenterEnd;
            case 7:
                return BlazeWidgetItemImageStyle.BlazeImagePosition.BottomStart;
            case 8:
                return BlazeWidgetItemImageStyle.BlazeImagePosition.BottomCenter;
            case 9:
                return BlazeWidgetItemImageStyle.BlazeImagePosition.BottomEnd;
            default:
                zzl.b();
                return null;
        }
    }

    @NotNull
    public final BlazeWidgetItemImageStyle.BlazeThumbnailType toBlazeThumbnailType$blazesdk_release(@NotNull BlazeThumbnailTypeDto blazeThumbnailTypeDto) {
        blazeThumbnailTypeDto.getClass();
        int i = b.a[blazeThumbnailTypeDto.ordinal()];
        if (i == 1) {
            return BlazeWidgetItemImageStyle.BlazeThumbnailType.SQUARE_ICON;
        }
        if (i == 2) {
            return BlazeWidgetItemImageStyle.BlazeThumbnailType.VERTICAL_TWO_BY_THREE;
        }
        if (i == 3) {
            return BlazeWidgetItemImageStyle.BlazeThumbnailType.CUSTOM;
        }
        zzl.b();
        return null;
    }

    @NotNull
    public String toString() {
        return "WidgetItemImageStyleRemoteDto(position=" + this.position + ", thumbnailType=" + this.thumbnailType + ", margins=" + this.margins + ", border=" + this.border + ", cornerRadius=" + this.cornerRadius + ", gradientOverlay=" + this.gradientOverlay + ", width=" + this.width + ", height=" + this.height + ", ratio=" + this.ratio + ", cornerRadiusRatio=" + this.cornerRadiusRatio + ')';
    }
}

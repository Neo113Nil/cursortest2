package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.mediationsdk.j;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.s6a;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002YZBi\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010B\u001a\u00020\nHÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010F\u001a\u00020\u0010HÆ\u0003J\t\u0010G\u001a\u00020\u0012HÆ\u0003J\t\u0010H\u001a\u00020\u0014HÆ\u0003J\u0084\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010JJ\u0006\u0010K\u001a\u00020LJ\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020LHÖ\u0001J\t\u0010R\u001a\u00020SHÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020LR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006["}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "position", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeImagePosition;", "width", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "height", "ratio", "", "border", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;", "thumbnailType", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeThumbnailType;", "cornerRadius", "cornerRadiusRatio", "margins", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "gradientOverlay", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle;", "animatedThumbnail", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageAnimatedThumbnailStyle;", "<init>", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeImagePosition;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeThumbnailType;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageAnimatedThumbnailStyle;)V", "getPosition", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeImagePosition;", "setPosition", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeImagePosition;)V", "getWidth", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setWidth", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getHeight", "setHeight", "getRatio", "()Ljava/lang/Float;", "setRatio", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getBorder", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;", "setBorder", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;)V", "getThumbnailType", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeThumbnailType;", "setThumbnailType", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeThumbnailType;)V", "getCornerRadius", "setCornerRadius", "getCornerRadiusRatio", "setCornerRadiusRatio", "getMargins", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setMargins", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "getGradientOverlay", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle;", "setGradientOverlay", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle;)V", "getAnimatedThumbnail", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageAnimatedThumbnailStyle;", "setAnimatedThumbnail", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageAnimatedThumbnailStyle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeImagePosition;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeThumbnailType;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Ljava/lang/Float;Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageAnimatedThumbnailStyle;)Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeImagePosition", "BlazeThumbnailType", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemImageStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemImageStyle> CREATOR = new a();

    @NotNull
    private BlazeWidgetItemImageAnimatedThumbnailStyle animatedThumbnail;

    @NotNull
    private BlazeWidgetItemImageContainerBorderStyle border;

    @NotNull
    private BlazeDp cornerRadius;

    @Nullable
    private Float cornerRadiusRatio;

    @NotNull
    private BlazeWidgetItemImageGradientOverlayStyle gradientOverlay;

    @Nullable
    private BlazeDp height;

    @NotNull
    private BlazeInsets margins;

    @NotNull
    private BlazeImagePosition position;

    @Nullable
    private Float ratio;

    @NotNull
    private BlazeThumbnailType thumbnailType;

    @Nullable
    private BlazeDp width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeImagePosition;", "", "<init>", "(Ljava/lang/String;I)V", "TopStart", "TopCenter", "TopEnd", "CenterStart", "Center", "CenterEnd", "BottomStart", "BottomCenter", "BottomEnd", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlazeImagePosition {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeImagePosition[] $VALUES;
        public static final BlazeImagePosition TopStart = new BlazeImagePosition("TopStart", 0);
        public static final BlazeImagePosition TopCenter = new BlazeImagePosition("TopCenter", 1);
        public static final BlazeImagePosition TopEnd = new BlazeImagePosition("TopEnd", 2);
        public static final BlazeImagePosition CenterStart = new BlazeImagePosition("CenterStart", 3);
        public static final BlazeImagePosition Center = new BlazeImagePosition("Center", 4);
        public static final BlazeImagePosition CenterEnd = new BlazeImagePosition("CenterEnd", 5);
        public static final BlazeImagePosition BottomStart = new BlazeImagePosition("BottomStart", 6);
        public static final BlazeImagePosition BottomCenter = new BlazeImagePosition("BottomCenter", 7);
        public static final BlazeImagePosition BottomEnd = new BlazeImagePosition("BottomEnd", 8);

        private static final /* synthetic */ BlazeImagePosition[] $values() {
            return new BlazeImagePosition[]{TopStart, TopCenter, TopEnd, CenterStart, Center, CenterEnd, BottomStart, BottomCenter, BottomEnd};
        }

        static {
            BlazeImagePosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeImagePosition(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeImagePosition valueOf(String str) {
            return (BlazeImagePosition) Enum.valueOf(BlazeImagePosition.class, str);
        }

        public static BlazeImagePosition[] values() {
            return (BlazeImagePosition[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeThumbnailType;", "", "SQUARE_ICON", "VERTICAL_TWO_BY_THREE", j.f, "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum BlazeThumbnailType {
        SQUARE_ICON,
        VERTICAL_TWO_BY_THREE,
        CUSTOM,
        GIF,
        ANIMATED_THUMBNAIL_POSTER
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeWidgetItemImageStyle(BlazeImagePosition.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BlazeDp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BlazeDp.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), BlazeWidgetItemImageContainerBorderStyle.CREATOR.createFromParcel(parcel), BlazeThumbnailType.valueOf(parcel.readString()), BlazeDp.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, BlazeInsets.CREATOR.createFromParcel(parcel), BlazeWidgetItemImageGradientOverlayStyle.CREATOR.createFromParcel(parcel), BlazeWidgetItemImageAnimatedThumbnailStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemImageStyle[i];
        }
    }

    public BlazeWidgetItemImageStyle(@NotNull BlazeImagePosition blazeImagePosition, @Nullable BlazeDp blazeDp, @Nullable BlazeDp blazeDp2, @Nullable Float f, @NotNull BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle, @NotNull BlazeThumbnailType blazeThumbnailType, @NotNull BlazeDp blazeDp3, @Nullable Float f2, @NotNull BlazeInsets blazeInsets, @NotNull BlazeWidgetItemImageGradientOverlayStyle blazeWidgetItemImageGradientOverlayStyle, @NotNull BlazeWidgetItemImageAnimatedThumbnailStyle blazeWidgetItemImageAnimatedThumbnailStyle) {
        blazeImagePosition.getClass();
        blazeWidgetItemImageContainerBorderStyle.getClass();
        blazeThumbnailType.getClass();
        blazeDp3.getClass();
        blazeInsets.getClass();
        blazeWidgetItemImageGradientOverlayStyle.getClass();
        blazeWidgetItemImageAnimatedThumbnailStyle.getClass();
        this.position = blazeImagePosition;
        this.width = blazeDp;
        this.height = blazeDp2;
        this.ratio = f;
        this.border = blazeWidgetItemImageContainerBorderStyle;
        this.thumbnailType = blazeThumbnailType;
        this.cornerRadius = blazeDp3;
        this.cornerRadiusRatio = f2;
        this.margins = blazeInsets;
        this.gradientOverlay = blazeWidgetItemImageGradientOverlayStyle;
        this.animatedThumbnail = blazeWidgetItemImageAnimatedThumbnailStyle;
    }

    public static /* synthetic */ BlazeWidgetItemImageStyle copy$default(BlazeWidgetItemImageStyle blazeWidgetItemImageStyle, BlazeImagePosition blazeImagePosition, BlazeDp blazeDp, BlazeDp blazeDp2, Float f, BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle, BlazeThumbnailType blazeThumbnailType, BlazeDp blazeDp3, Float f2, BlazeInsets blazeInsets, BlazeWidgetItemImageGradientOverlayStyle blazeWidgetItemImageGradientOverlayStyle, BlazeWidgetItemImageAnimatedThumbnailStyle blazeWidgetItemImageAnimatedThumbnailStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeImagePosition = blazeWidgetItemImageStyle.position;
        }
        if ((i & 2) != 0) {
            blazeDp = blazeWidgetItemImageStyle.width;
        }
        if ((i & 4) != 0) {
            blazeDp2 = blazeWidgetItemImageStyle.height;
        }
        if ((i & 8) != 0) {
            f = blazeWidgetItemImageStyle.ratio;
        }
        if ((i & 16) != 0) {
            blazeWidgetItemImageContainerBorderStyle = blazeWidgetItemImageStyle.border;
        }
        if ((i & 32) != 0) {
            blazeThumbnailType = blazeWidgetItemImageStyle.thumbnailType;
        }
        if ((i & 64) != 0) {
            blazeDp3 = blazeWidgetItemImageStyle.cornerRadius;
        }
        if ((i & 128) != 0) {
            f2 = blazeWidgetItemImageStyle.cornerRadiusRatio;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            blazeInsets = blazeWidgetItemImageStyle.margins;
        }
        if ((i & 512) != 0) {
            blazeWidgetItemImageGradientOverlayStyle = blazeWidgetItemImageStyle.gradientOverlay;
        }
        if ((i & 1024) != 0) {
            blazeWidgetItemImageAnimatedThumbnailStyle = blazeWidgetItemImageStyle.animatedThumbnail;
        }
        BlazeWidgetItemImageGradientOverlayStyle blazeWidgetItemImageGradientOverlayStyle2 = blazeWidgetItemImageGradientOverlayStyle;
        BlazeWidgetItemImageAnimatedThumbnailStyle blazeWidgetItemImageAnimatedThumbnailStyle2 = blazeWidgetItemImageAnimatedThumbnailStyle;
        Float f3 = f2;
        BlazeInsets blazeInsets2 = blazeInsets;
        BlazeThumbnailType blazeThumbnailType2 = blazeThumbnailType;
        BlazeDp blazeDp4 = blazeDp3;
        BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle2 = blazeWidgetItemImageContainerBorderStyle;
        BlazeDp blazeDp5 = blazeDp2;
        return blazeWidgetItemImageStyle.copy(blazeImagePosition, blazeDp, blazeDp5, f, blazeWidgetItemImageContainerBorderStyle2, blazeThumbnailType2, blazeDp4, f3, blazeInsets2, blazeWidgetItemImageGradientOverlayStyle2, blazeWidgetItemImageAnimatedThumbnailStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeImagePosition getPosition() {
        return this.position;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final BlazeWidgetItemImageGradientOverlayStyle getGradientOverlay() {
        return this.gradientOverlay;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final BlazeWidgetItemImageAnimatedThumbnailStyle getAnimatedThumbnail() {
        return this.animatedThumbnail;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BlazeDp getWidth() {
        return this.width;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final BlazeDp getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getRatio() {
        return this.ratio;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeWidgetItemImageContainerBorderStyle getBorder() {
        return this.border;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeThumbnailType getThumbnailType() {
        return this.thumbnailType;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Float getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    @NotNull
    public final BlazeWidgetItemImageStyle copy(@NotNull BlazeImagePosition position, @Nullable BlazeDp width, @Nullable BlazeDp height, @Nullable Float ratio, @NotNull BlazeWidgetItemImageContainerBorderStyle border, @NotNull BlazeThumbnailType thumbnailType, @NotNull BlazeDp cornerRadius, @Nullable Float cornerRadiusRatio, @NotNull BlazeInsets margins, @NotNull BlazeWidgetItemImageGradientOverlayStyle gradientOverlay, @NotNull BlazeWidgetItemImageAnimatedThumbnailStyle animatedThumbnail) {
        position.getClass();
        border.getClass();
        thumbnailType.getClass();
        cornerRadius.getClass();
        margins.getClass();
        gradientOverlay.getClass();
        animatedThumbnail.getClass();
        return new BlazeWidgetItemImageStyle(position, width, height, ratio, border, thumbnailType, cornerRadius, cornerRadiusRatio, margins, gradientOverlay, animatedThumbnail);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemImageStyle)) {
            return false;
        }
        BlazeWidgetItemImageStyle blazeWidgetItemImageStyle = (BlazeWidgetItemImageStyle) other;
        return this.position == blazeWidgetItemImageStyle.position && Intrinsics.c(this.width, blazeWidgetItemImageStyle.width) && Intrinsics.c(this.height, blazeWidgetItemImageStyle.height) && Intrinsics.c(this.ratio, blazeWidgetItemImageStyle.ratio) && Intrinsics.c(this.border, blazeWidgetItemImageStyle.border) && this.thumbnailType == blazeWidgetItemImageStyle.thumbnailType && Intrinsics.c(this.cornerRadius, blazeWidgetItemImageStyle.cornerRadius) && Intrinsics.c(this.cornerRadiusRatio, blazeWidgetItemImageStyle.cornerRadiusRatio) && Intrinsics.c(this.margins, blazeWidgetItemImageStyle.margins) && Intrinsics.c(this.gradientOverlay, blazeWidgetItemImageStyle.gradientOverlay) && Intrinsics.c(this.animatedThumbnail, blazeWidgetItemImageStyle.animatedThumbnail);
    }

    @NotNull
    public final BlazeWidgetItemImageAnimatedThumbnailStyle getAnimatedThumbnail() {
        return this.animatedThumbnail;
    }

    @NotNull
    public final BlazeWidgetItemImageContainerBorderStyle getBorder() {
        return this.border;
    }

    @NotNull
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public final Float getCornerRadiusRatio() {
        return this.cornerRadiusRatio;
    }

    @NotNull
    public final BlazeWidgetItemImageGradientOverlayStyle getGradientOverlay() {
        return this.gradientOverlay;
    }

    @Nullable
    public final BlazeDp getHeight() {
        return this.height;
    }

    @NotNull
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    @NotNull
    public final BlazeImagePosition getPosition() {
        return this.position;
    }

    @Nullable
    public final Float getRatio() {
        return this.ratio;
    }

    @NotNull
    public final BlazeThumbnailType getThumbnailType() {
        return this.thumbnailType;
    }

    @Nullable
    public final BlazeDp getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.position.hashCode() * 31;
        BlazeDp blazeDp = this.width;
        int hashCode2 = (hashCode + (blazeDp == null ? 0 : blazeDp.hashCode())) * 31;
        BlazeDp blazeDp2 = this.height;
        int hashCode3 = (hashCode2 + (blazeDp2 == null ? 0 : blazeDp2.hashCode())) * 31;
        Float f = this.ratio;
        int n = s6a.n(this.cornerRadius, (this.thumbnailType.hashCode() + ((this.border.hashCode() + ((hashCode3 + (f == null ? 0 : f.hashCode())) * 31)) * 31)) * 31);
        Float f2 = this.cornerRadiusRatio;
        return this.animatedThumbnail.hashCode() + ((this.gradientOverlay.hashCode() + ((this.margins.hashCode() + ((n + (f2 != null ? f2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final void setAnimatedThumbnail(@NotNull BlazeWidgetItemImageAnimatedThumbnailStyle blazeWidgetItemImageAnimatedThumbnailStyle) {
        blazeWidgetItemImageAnimatedThumbnailStyle.getClass();
        this.animatedThumbnail = blazeWidgetItemImageAnimatedThumbnailStyle;
    }

    public final void setBorder(@NotNull BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle) {
        blazeWidgetItemImageContainerBorderStyle.getClass();
        this.border = blazeWidgetItemImageContainerBorderStyle;
    }

    public final void setCornerRadius(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.cornerRadius = blazeDp;
    }

    public final void setCornerRadiusRatio(@Nullable Float f) {
        this.cornerRadiusRatio = f;
    }

    public final void setGradientOverlay(@NotNull BlazeWidgetItemImageGradientOverlayStyle blazeWidgetItemImageGradientOverlayStyle) {
        blazeWidgetItemImageGradientOverlayStyle.getClass();
        this.gradientOverlay = blazeWidgetItemImageGradientOverlayStyle;
    }

    public final void setHeight(@Nullable BlazeDp blazeDp) {
        this.height = blazeDp;
    }

    public final void setMargins(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.margins = blazeInsets;
    }

    public final void setPosition(@NotNull BlazeImagePosition blazeImagePosition) {
        blazeImagePosition.getClass();
        this.position = blazeImagePosition;
    }

    public final void setRatio(@Nullable Float f) {
        this.ratio = f;
    }

    public final void setThumbnailType(@NotNull BlazeThumbnailType blazeThumbnailType) {
        blazeThumbnailType.getClass();
        this.thumbnailType = blazeThumbnailType;
    }

    public final void setWidth(@Nullable BlazeDp blazeDp) {
        this.width = blazeDp;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemImageStyle(position=" + this.position + ", width=" + this.width + ", height=" + this.height + ", ratio=" + this.ratio + ", border=" + this.border + ", thumbnailType=" + this.thumbnailType + ", cornerRadius=" + this.cornerRadius + ", cornerRadiusRatio=" + this.cornerRadiusRatio + ", margins=" + this.margins + ", gradientOverlay=" + this.gradientOverlay + ", animatedThumbnail=" + this.animatedThumbnail + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.position.name());
        BlazeDp blazeDp = this.width;
        if (blazeDp == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeDp.writeToParcel(dest, flags);
        }
        BlazeDp blazeDp2 = this.height;
        if (blazeDp2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeDp2.writeToParcel(dest, flags);
        }
        Float f = this.ratio;
        if (f == null) {
            dest.writeInt(0);
        } else {
            wt3.w(dest, 1, f);
        }
        this.border.writeToParcel(dest, flags);
        dest.writeString(this.thumbnailType.name());
        this.cornerRadius.writeToParcel(dest, flags);
        Float f2 = this.cornerRadiusRatio;
        if (f2 == null) {
            dest.writeInt(0);
        } else {
            wt3.w(dest, 1, f2);
        }
        this.margins.writeToParcel(dest, flags);
        this.gradientOverlay.writeToParcel(dest, flags);
        this.animatedThumbnail.writeToParcel(dest, flags);
    }
}

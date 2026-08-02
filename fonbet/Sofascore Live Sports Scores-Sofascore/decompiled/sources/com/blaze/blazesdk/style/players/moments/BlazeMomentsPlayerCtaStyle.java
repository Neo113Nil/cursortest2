package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.b6a;
import defpackage.g7a;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.lnb;
import defpackage.s6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002KLBY\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003Jn\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010>J\u0006\u0010?\u001a\u00020\u0007J\u0013\u0010@\u001a\u00020\u00112\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\u0007HÖ\u0001J\t\u0010D\u001a\u00020EHÖ\u0001J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u00101\"\u0004\b2\u00103¨\u0006M"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "cornerRadius", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "textSize", "", "fontResId", "", "width", "height", "icon", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaIconStyle;", "layoutPositioning", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAPositioning;", "horizontalAlignment", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAHorizontalAlignment;", C4018c8.k, "", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;FLjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaIconStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAPositioning;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAHorizontalAlignment;Z)V", "getCornerRadius", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getTextSize", "()F", "setTextSize", "(F)V", "getFontResId", "()Ljava/lang/Integer;", "setFontResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getWidth", "setWidth", "getHeight", "setHeight", "getIcon", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaIconStyle;", "setIcon", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaIconStyle;)V", "getLayoutPositioning", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAPositioning;", "setLayoutPositioning", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAPositioning;)V", "getHorizontalAlignment", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAHorizontalAlignment;", "setHorizontalAlignment", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAHorizontalAlignment;)V", "()Z", "setVisible", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;FLjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaIconStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAPositioning;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAHorizontalAlignment;Z)Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeCTAPositioning", "BlazeCTAHorizontalAlignment", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeMomentsPlayerCtaStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerCtaStyle> CREATOR = new a();

    @NotNull
    private BlazeDp cornerRadius;

    @Nullable
    private Integer fontResId;

    @NotNull
    private BlazeDp height;

    @NotNull
    private BlazeCTAHorizontalAlignment horizontalAlignment;

    @Nullable
    private BlazeMomentsPlayerCtaIconStyle icon;
    private boolean isVisible;

    @NotNull
    private BlazeCTAPositioning layoutPositioning;
    private float textSize;

    @Nullable
    private BlazeDp width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAHorizontalAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "START", "CENTER", "END", "FULL_AVAILABLE_WIDTH", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlazeCTAHorizontalAlignment {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeCTAHorizontalAlignment[] $VALUES;
        public static final BlazeCTAHorizontalAlignment START = new BlazeCTAHorizontalAlignment("START", 0);
        public static final BlazeCTAHorizontalAlignment CENTER = new BlazeCTAHorizontalAlignment("CENTER", 1);
        public static final BlazeCTAHorizontalAlignment END = new BlazeCTAHorizontalAlignment("END", 2);
        public static final BlazeCTAHorizontalAlignment FULL_AVAILABLE_WIDTH = new BlazeCTAHorizontalAlignment("FULL_AVAILABLE_WIDTH", 3);

        private static final /* synthetic */ BlazeCTAHorizontalAlignment[] $values() {
            return new BlazeCTAHorizontalAlignment[]{START, CENTER, END, FULL_AVAILABLE_WIDTH};
        }

        static {
            BlazeCTAHorizontalAlignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeCTAHorizontalAlignment(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeCTAHorizontalAlignment valueOf(String str) {
            return (BlazeCTAHorizontalAlignment) Enum.valueOf(BlazeCTAHorizontalAlignment.class, str);
        }

        public static BlazeCTAHorizontalAlignment[] values() {
            return (BlazeCTAHorizontalAlignment[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCtaStyle$BlazeCTAPositioning;", "", "<init>", "(Ljava/lang/String;I)V", "CTA_BELLOW_BOTTOM_BUTTONS_BOX", "CTA_NEXT_TO_BOTTOM_BUTTONS_BOX", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlazeCTAPositioning {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeCTAPositioning[] $VALUES;
        public static final BlazeCTAPositioning CTA_BELLOW_BOTTOM_BUTTONS_BOX = new BlazeCTAPositioning("CTA_BELLOW_BOTTOM_BUTTONS_BOX", 0);
        public static final BlazeCTAPositioning CTA_NEXT_TO_BOTTOM_BUTTONS_BOX = new BlazeCTAPositioning("CTA_NEXT_TO_BOTTOM_BUTTONS_BOX", 1);

        private static final /* synthetic */ BlazeCTAPositioning[] $values() {
            return new BlazeCTAPositioning[]{CTA_BELLOW_BOTTOM_BUTTONS_BOX, CTA_NEXT_TO_BOTTOM_BUTTONS_BOX};
        }

        static {
            BlazeCTAPositioning[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeCTAPositioning(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeCTAPositioning valueOf(String str) {
            return (BlazeCTAPositioning) Enum.valueOf(BlazeCTAPositioning.class, str);
        }

        public static BlazeCTAPositioning[] values() {
            return (BlazeCTAPositioning[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeMomentsPlayerCtaStyle(creator.createFromParcel(parcel), parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0 ? BlazeMomentsPlayerCtaIconStyle.CREATOR.createFromParcel(parcel) : null, BlazeCTAPositioning.valueOf(parcel.readString()), BlazeCTAHorizontalAlignment.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerCtaStyle[i];
        }
    }

    public BlazeMomentsPlayerCtaStyle(@NotNull BlazeDp blazeDp, float f, @Nullable Integer num, @Nullable BlazeDp blazeDp2, @NotNull BlazeDp blazeDp3, @Nullable BlazeMomentsPlayerCtaIconStyle blazeMomentsPlayerCtaIconStyle, @NotNull BlazeCTAPositioning blazeCTAPositioning, @NotNull BlazeCTAHorizontalAlignment blazeCTAHorizontalAlignment, boolean z) {
        blazeDp.getClass();
        blazeDp3.getClass();
        blazeCTAPositioning.getClass();
        blazeCTAHorizontalAlignment.getClass();
        this.cornerRadius = blazeDp;
        this.textSize = f;
        this.fontResId = num;
        this.width = blazeDp2;
        this.height = blazeDp3;
        this.icon = blazeMomentsPlayerCtaIconStyle;
        this.layoutPositioning = blazeCTAPositioning;
        this.horizontalAlignment = blazeCTAHorizontalAlignment;
        this.isVisible = z;
    }

    public static /* synthetic */ BlazeMomentsPlayerCtaStyle copy$default(BlazeMomentsPlayerCtaStyle blazeMomentsPlayerCtaStyle, BlazeDp blazeDp, float f, Integer num, BlazeDp blazeDp2, BlazeDp blazeDp3, BlazeMomentsPlayerCtaIconStyle blazeMomentsPlayerCtaIconStyle, BlazeCTAPositioning blazeCTAPositioning, BlazeCTAHorizontalAlignment blazeCTAHorizontalAlignment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeDp = blazeMomentsPlayerCtaStyle.cornerRadius;
        }
        if ((i & 2) != 0) {
            f = blazeMomentsPlayerCtaStyle.textSize;
        }
        if ((i & 4) != 0) {
            num = blazeMomentsPlayerCtaStyle.fontResId;
        }
        if ((i & 8) != 0) {
            blazeDp2 = blazeMomentsPlayerCtaStyle.width;
        }
        if ((i & 16) != 0) {
            blazeDp3 = blazeMomentsPlayerCtaStyle.height;
        }
        if ((i & 32) != 0) {
            blazeMomentsPlayerCtaIconStyle = blazeMomentsPlayerCtaStyle.icon;
        }
        if ((i & 64) != 0) {
            blazeCTAPositioning = blazeMomentsPlayerCtaStyle.layoutPositioning;
        }
        if ((i & 128) != 0) {
            blazeCTAHorizontalAlignment = blazeMomentsPlayerCtaStyle.horizontalAlignment;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z = blazeMomentsPlayerCtaStyle.isVisible;
        }
        BlazeCTAHorizontalAlignment blazeCTAHorizontalAlignment2 = blazeCTAHorizontalAlignment;
        boolean z2 = z;
        BlazeMomentsPlayerCtaIconStyle blazeMomentsPlayerCtaIconStyle2 = blazeMomentsPlayerCtaIconStyle;
        BlazeCTAPositioning blazeCTAPositioning2 = blazeCTAPositioning;
        BlazeDp blazeDp4 = blazeDp3;
        Integer num2 = num;
        return blazeMomentsPlayerCtaStyle.copy(blazeDp, f, num2, blazeDp2, blazeDp4, blazeMomentsPlayerCtaIconStyle2, blazeCTAPositioning2, blazeCTAHorizontalAlignment2, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getFontResId() {
        return this.fontResId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final BlazeDp getWidth() {
        return this.width;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeDp getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final BlazeMomentsPlayerCtaIconStyle getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeCTAPositioning getLayoutPositioning() {
        return this.layoutPositioning;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeCTAHorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public final BlazeMomentsPlayerCtaStyle copy(@NotNull BlazeDp cornerRadius, float textSize, @Nullable Integer fontResId, @Nullable BlazeDp width, @NotNull BlazeDp height, @Nullable BlazeMomentsPlayerCtaIconStyle icon, @NotNull BlazeCTAPositioning layoutPositioning, @NotNull BlazeCTAHorizontalAlignment horizontalAlignment, boolean isVisible) {
        cornerRadius.getClass();
        height.getClass();
        layoutPositioning.getClass();
        horizontalAlignment.getClass();
        return new BlazeMomentsPlayerCtaStyle(cornerRadius, textSize, fontResId, width, height, icon, layoutPositioning, horizontalAlignment, isVisible);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerCtaStyle)) {
            return false;
        }
        BlazeMomentsPlayerCtaStyle blazeMomentsPlayerCtaStyle = (BlazeMomentsPlayerCtaStyle) other;
        return Intrinsics.c(this.cornerRadius, blazeMomentsPlayerCtaStyle.cornerRadius) && Float.compare(this.textSize, blazeMomentsPlayerCtaStyle.textSize) == 0 && Intrinsics.c(this.fontResId, blazeMomentsPlayerCtaStyle.fontResId) && Intrinsics.c(this.width, blazeMomentsPlayerCtaStyle.width) && Intrinsics.c(this.height, blazeMomentsPlayerCtaStyle.height) && Intrinsics.c(this.icon, blazeMomentsPlayerCtaStyle.icon) && this.layoutPositioning == blazeMomentsPlayerCtaStyle.layoutPositioning && this.horizontalAlignment == blazeMomentsPlayerCtaStyle.horizontalAlignment && this.isVisible == blazeMomentsPlayerCtaStyle.isVisible;
    }

    @NotNull
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public final Integer getFontResId() {
        return this.fontResId;
    }

    @NotNull
    public final BlazeDp getHeight() {
        return this.height;
    }

    @NotNull
    public final BlazeCTAHorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    @Nullable
    public final BlazeMomentsPlayerCtaIconStyle getIcon() {
        return this.icon;
    }

    @NotNull
    public final BlazeCTAPositioning getLayoutPositioning() {
        return this.layoutPositioning;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @Nullable
    public final BlazeDp getWidth() {
        return this.width;
    }

    public int hashCode() {
        int o = g7a.o(this.textSize, this.cornerRadius.hashCode() * 31);
        Integer num = this.fontResId;
        int hashCode = (o + (num == null ? 0 : num.hashCode())) * 31;
        BlazeDp blazeDp = this.width;
        int n = s6a.n(this.height, (hashCode + (blazeDp == null ? 0 : blazeDp.hashCode())) * 31);
        BlazeMomentsPlayerCtaIconStyle blazeMomentsPlayerCtaIconStyle = this.icon;
        return Boolean.hashCode(this.isVisible) + ((this.horizontalAlignment.hashCode() + ((this.layoutPositioning.hashCode() + ((n + (blazeMomentsPlayerCtaIconStyle != null ? blazeMomentsPlayerCtaIconStyle.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setCornerRadius(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.cornerRadius = blazeDp;
    }

    public final void setFontResId(@Nullable Integer num) {
        this.fontResId = num;
    }

    public final void setHeight(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.height = blazeDp;
    }

    public final void setHorizontalAlignment(@NotNull BlazeCTAHorizontalAlignment blazeCTAHorizontalAlignment) {
        blazeCTAHorizontalAlignment.getClass();
        this.horizontalAlignment = blazeCTAHorizontalAlignment;
    }

    public final void setIcon(@Nullable BlazeMomentsPlayerCtaIconStyle blazeMomentsPlayerCtaIconStyle) {
        this.icon = blazeMomentsPlayerCtaIconStyle;
    }

    public final void setLayoutPositioning(@NotNull BlazeCTAPositioning blazeCTAPositioning) {
        blazeCTAPositioning.getClass();
        this.layoutPositioning = blazeCTAPositioning;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public final void setWidth(@Nullable BlazeDp blazeDp) {
        this.width = blazeDp;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeMomentsPlayerCtaStyle(cornerRadius=");
        sb.append(this.cornerRadius);
        sb.append(", textSize=");
        sb.append(this.textSize);
        sb.append(", fontResId=");
        sb.append(this.fontResId);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", layoutPositioning=");
        sb.append(this.layoutPositioning);
        sb.append(", horizontalAlignment=");
        sb.append(this.horizontalAlignment);
        sb.append(", isVisible=");
        return lnb.r(sb, this.isVisible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.cornerRadius.writeToParcel(dest, flags);
        dest.writeFloat(this.textSize);
        Integer num = this.fontResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        BlazeDp blazeDp = this.width;
        if (blazeDp == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeDp.writeToParcel(dest, flags);
        }
        this.height.writeToParcel(dest, flags);
        BlazeMomentsPlayerCtaIconStyle blazeMomentsPlayerCtaIconStyle = this.icon;
        if (blazeMomentsPlayerCtaIconStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeMomentsPlayerCtaIconStyle.writeToParcel(dest, flags);
        }
        dest.writeString(this.layoutPositioning.name());
        dest.writeString(this.horizontalAlignment.name());
        dest.writeInt(this.isVisible ? 1 : 0);
    }
}

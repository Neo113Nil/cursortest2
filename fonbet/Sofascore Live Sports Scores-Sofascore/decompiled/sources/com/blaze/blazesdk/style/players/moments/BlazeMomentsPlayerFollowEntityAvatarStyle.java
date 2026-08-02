package com.blaze.blazesdk.style.players.moments;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001'B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityAvatarStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "borderWidth", "", "borderColor", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component2", "copy", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;I)Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityAvatarStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getBorderWidth", "setBorderWidth", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "I", "getBorderColor", "setBorderColor", "(I)V", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeMomentsPlayerFollowEntityAvatarStyle implements BlazeParcelable {
    private int borderColor;

    @NotNull
    private BlazeDp borderWidth;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerFollowEntityAvatarStyle> CREATOR = new b();
    private static final int DEFAULT_AVATAR_BORDER_COLOR = Color.parseColor("#FFFFFFFF");

    @NotNull
    private static final BlazeDp DEFAULT_AVATAR_BORDER_WIDTH = new BlazeDp(2);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityAvatarStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsPlayerFollowEntityAvatarStyle(BlazeDp.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerFollowEntityAvatarStyle[i];
        }
    }

    public BlazeMomentsPlayerFollowEntityAvatarStyle(@NotNull BlazeDp blazeDp, int i) {
        blazeDp.getClass();
        this.borderWidth = blazeDp;
        this.borderColor = i;
    }

    public static /* synthetic */ BlazeMomentsPlayerFollowEntityAvatarStyle copy$default(BlazeMomentsPlayerFollowEntityAvatarStyle blazeMomentsPlayerFollowEntityAvatarStyle, BlazeDp blazeDp, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeDp = blazeMomentsPlayerFollowEntityAvatarStyle.borderWidth;
        }
        if ((i2 & 2) != 0) {
            i = blazeMomentsPlayerFollowEntityAvatarStyle.borderColor;
        }
        return blazeMomentsPlayerFollowEntityAvatarStyle.copy(blazeDp, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeDp getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityAvatarStyle copy(@NotNull BlazeDp borderWidth, int borderColor) {
        borderWidth.getClass();
        return new BlazeMomentsPlayerFollowEntityAvatarStyle(borderWidth, borderColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerFollowEntityAvatarStyle)) {
            return false;
        }
        BlazeMomentsPlayerFollowEntityAvatarStyle blazeMomentsPlayerFollowEntityAvatarStyle = (BlazeMomentsPlayerFollowEntityAvatarStyle) other;
        return Intrinsics.c(this.borderWidth, blazeMomentsPlayerFollowEntityAvatarStyle.borderWidth) && this.borderColor == blazeMomentsPlayerFollowEntityAvatarStyle.borderColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final BlazeDp getBorderWidth() {
        return this.borderWidth;
    }

    public int hashCode() {
        return Integer.hashCode(this.borderColor) + (this.borderWidth.hashCode() * 31);
    }

    public final void setBorderColor(int i) {
        this.borderColor = i;
    }

    public final void setBorderWidth(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.borderWidth = blazeDp;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeMomentsPlayerFollowEntityAvatarStyle(borderWidth=");
        sb.append(this.borderWidth);
        sb.append(", borderColor=");
        return wv8.j(sb, this.borderColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.borderWidth.writeToParcel(dest, flags);
        dest.writeInt(this.borderColor);
    }
}

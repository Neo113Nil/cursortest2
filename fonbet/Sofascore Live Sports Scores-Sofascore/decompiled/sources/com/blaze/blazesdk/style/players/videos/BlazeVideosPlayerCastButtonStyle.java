package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.s6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006#"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCastButtonStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "width", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "height", "<init>", "(ZLcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "()Z", "setVisible", "(Z)V", "getWidth", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setWidth", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getHeight", "setHeight", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerCastButtonStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerCastButtonStyle> CREATOR = new a();

    @NotNull
    private BlazeDp height;
    private boolean isVisible;

    @NotNull
    private BlazeDp width;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeVideosPlayerCastButtonStyle(z, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerCastButtonStyle[i];
        }
    }

    public BlazeVideosPlayerCastButtonStyle(boolean z, @NotNull BlazeDp blazeDp, @NotNull BlazeDp blazeDp2) {
        blazeDp.getClass();
        blazeDp2.getClass();
        this.isVisible = z;
        this.width = blazeDp;
        this.height = blazeDp2;
    }

    public static /* synthetic */ BlazeVideosPlayerCastButtonStyle copy$default(BlazeVideosPlayerCastButtonStyle blazeVideosPlayerCastButtonStyle, boolean z, BlazeDp blazeDp, BlazeDp blazeDp2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeVideosPlayerCastButtonStyle.isVisible;
        }
        if ((i & 2) != 0) {
            blazeDp = blazeVideosPlayerCastButtonStyle.width;
        }
        if ((i & 4) != 0) {
            blazeDp2 = blazeVideosPlayerCastButtonStyle.height;
        }
        return blazeVideosPlayerCastButtonStyle.copy(z, blazeDp, blazeDp2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeDp getWidth() {
        return this.width;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeDp getHeight() {
        return this.height;
    }

    @NotNull
    public final BlazeVideosPlayerCastButtonStyle copy(boolean isVisible, @NotNull BlazeDp width, @NotNull BlazeDp height) {
        width.getClass();
        height.getClass();
        return new BlazeVideosPlayerCastButtonStyle(isVisible, width, height);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerCastButtonStyle)) {
            return false;
        }
        BlazeVideosPlayerCastButtonStyle blazeVideosPlayerCastButtonStyle = (BlazeVideosPlayerCastButtonStyle) other;
        return this.isVisible == blazeVideosPlayerCastButtonStyle.isVisible && Intrinsics.c(this.width, blazeVideosPlayerCastButtonStyle.width) && Intrinsics.c(this.height, blazeVideosPlayerCastButtonStyle.height);
    }

    @NotNull
    public final BlazeDp getHeight() {
        return this.height;
    }

    @NotNull
    public final BlazeDp getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.height.hashCode() + s6a.n(this.width, Boolean.hashCode(this.isVisible) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setHeight(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.height = blazeDp;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public final void setWidth(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.width = blazeDp;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerCastButtonStyle(isVisible=" + this.isVisible + ", width=" + this.width + ", height=" + this.height + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        this.width.writeToParcel(dest, flags);
        this.height.writeToParcel(dest, flags);
    }
}

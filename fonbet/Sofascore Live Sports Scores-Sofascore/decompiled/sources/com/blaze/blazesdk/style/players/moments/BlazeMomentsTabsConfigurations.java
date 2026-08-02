package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0011\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0012J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsTabsConfigurations;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "headerButtonsTopMargin", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "isActive", "", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Z)V", "getHeaderButtonsTopMargin", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setHeaderButtonsTopMargin", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "isActive$blazesdk_release", "()Z", "setActive$blazesdk_release", "(Z)V", "component1", "component2", "component2$blazesdk_release", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeMomentsTabsConfigurations implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsTabsConfigurations> CREATOR = new a();

    @NotNull
    private BlazeDp headerButtonsTopMargin;
    private boolean isActive;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsTabsConfigurations(BlazeDp.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsTabsConfigurations[i];
        }
    }

    public BlazeMomentsTabsConfigurations(@NotNull BlazeDp blazeDp, boolean z) {
        blazeDp.getClass();
        this.headerButtonsTopMargin = blazeDp;
        this.isActive = z;
    }

    public static /* synthetic */ BlazeMomentsTabsConfigurations copy$default(BlazeMomentsTabsConfigurations blazeMomentsTabsConfigurations, BlazeDp blazeDp, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeDp = blazeMomentsTabsConfigurations.headerButtonsTopMargin;
        }
        if ((i & 2) != 0) {
            z = blazeMomentsTabsConfigurations.isActive;
        }
        return blazeMomentsTabsConfigurations.copy(blazeDp, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeDp getHeaderButtonsTopMargin() {
        return this.headerButtonsTopMargin;
    }

    /* renamed from: component2$blazesdk_release, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final BlazeMomentsTabsConfigurations copy(@NotNull BlazeDp headerButtonsTopMargin, boolean isActive) {
        headerButtonsTopMargin.getClass();
        return new BlazeMomentsTabsConfigurations(headerButtonsTopMargin, isActive);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsTabsConfigurations)) {
            return false;
        }
        BlazeMomentsTabsConfigurations blazeMomentsTabsConfigurations = (BlazeMomentsTabsConfigurations) other;
        return Intrinsics.c(this.headerButtonsTopMargin, blazeMomentsTabsConfigurations.headerButtonsTopMargin) && this.isActive == blazeMomentsTabsConfigurations.isActive;
    }

    @NotNull
    public final BlazeDp getHeaderButtonsTopMargin() {
        return this.headerButtonsTopMargin;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isActive) + (this.headerButtonsTopMargin.hashCode() * 31);
    }

    public final boolean isActive$blazesdk_release() {
        return this.isActive;
    }

    public final void setActive$blazesdk_release(boolean z) {
        this.isActive = z;
    }

    public final void setHeaderButtonsTopMargin(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.headerButtonsTopMargin = blazeDp;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeMomentsTabsConfigurations(headerButtonsTopMargin=");
        sb.append(this.headerButtonsTopMargin);
        sb.append(", isActive=");
        return lnb.r(sb, this.isActive, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.headerButtonsTopMargin.writeToParcel(dest, flags);
        dest.writeInt(this.isActive ? 1 : 0);
    }
}

package com.blaze.blazesdk.delegates.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import defpackage.l4a;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0005J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/OnMomentStartParams;", "Landroid/os/Parcelable;", "momentId", "", "momentIndex", "", "totalMomentsCount", "<init>", "(Ljava/lang/String;II)V", "getMomentId", "()Ljava/lang/String;", "getMomentIndex", "()I", "getTotalMomentsCount", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OnMomentStartParams implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OnMomentStartParams> CREATOR = new a();

    @NotNull
    private final String momentId;
    private final int momentIndex;
    private final int totalMomentsCount;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OnMomentStartParams(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnMomentStartParams[i];
        }
    }

    public OnMomentStartParams(@NotNull String str, int i, int i2) {
        str.getClass();
        this.momentId = str;
        this.momentIndex = i;
        this.totalMomentsCount = i2;
    }

    public static /* synthetic */ OnMomentStartParams copy$default(OnMomentStartParams onMomentStartParams, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = onMomentStartParams.momentId;
        }
        if ((i3 & 2) != 0) {
            i = onMomentStartParams.momentIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = onMomentStartParams.totalMomentsCount;
        }
        return onMomentStartParams.copy(str, i, i2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMomentId() {
        return this.momentId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMomentIndex() {
        return this.momentIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalMomentsCount() {
        return this.totalMomentsCount;
    }

    @NotNull
    public final OnMomentStartParams copy(@NotNull String momentId, int momentIndex, int totalMomentsCount) {
        momentId.getClass();
        return new OnMomentStartParams(momentId, momentIndex, totalMomentsCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnMomentStartParams)) {
            return false;
        }
        OnMomentStartParams onMomentStartParams = (OnMomentStartParams) other;
        return Intrinsics.c(this.momentId, onMomentStartParams.momentId) && this.momentIndex == onMomentStartParams.momentIndex && this.totalMomentsCount == onMomentStartParams.totalMomentsCount;
    }

    @NotNull
    public final String getMomentId() {
        return this.momentId;
    }

    public final int getMomentIndex() {
        return this.momentIndex;
    }

    public final int getTotalMomentsCount() {
        return this.totalMomentsCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalMomentsCount) + l4a.e(this.momentIndex, this.momentId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OnMomentStartParams(momentId=");
        sb.append(this.momentId);
        sb.append(", momentIndex=");
        sb.append(this.momentIndex);
        sb.append(", totalMomentsCount=");
        return wv8.j(sb, this.totalMomentsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.momentId);
        dest.writeInt(this.momentIndex);
        dest.writeInt(this.totalMomentsCount);
    }
}

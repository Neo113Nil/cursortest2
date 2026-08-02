package com.blaze.blazesdk.delegates.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/OnStoryStartParams;", "Landroid/os/Parcelable;", "storyId", "", "<init>", "(Ljava/lang/String;)V", "getStoryId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OnStoryStartParams implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OnStoryStartParams> CREATOR = new a();

    @NotNull
    private final String storyId;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OnStoryStartParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnStoryStartParams[i];
        }
    }

    public OnStoryStartParams(@NotNull String str) {
        str.getClass();
        this.storyId = str;
    }

    public static /* synthetic */ OnStoryStartParams copy$default(OnStoryStartParams onStoryStartParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onStoryStartParams.storyId;
        }
        return onStoryStartParams.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStoryId() {
        return this.storyId;
    }

    @NotNull
    public final OnStoryStartParams copy(@NotNull String storyId) {
        storyId.getClass();
        return new OnStoryStartParams(storyId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnStoryStartParams) && Intrinsics.c(this.storyId, ((OnStoryStartParams) other).storyId);
    }

    @NotNull
    public final String getStoryId() {
        return this.storyId;
    }

    public int hashCode() {
        return this.storyId.hashCode();
    }

    @NotNull
    public String toString() {
        return lnb.q(new StringBuilder("OnStoryStartParams(storyId="), this.storyId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.storyId);
    }
}

package com.blaze.blazesdk.style.players;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.b6a;
import defpackage.bf3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ$\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "imageUnselectedPathResId", "", "imageSelectedPathResId", "<init>", "(ILjava/lang/Integer;)V", "getImageUnselectedPathResId", "()I", "setImageUnselectedPathResId", "(I)V", "getImageSelectedPathResId", "()Ljava/lang/Integer;", "setImageSelectedPathResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazePlayerButtonCustomImageStates implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazePlayerButtonCustomImageStates> CREATOR = new a();

    @Nullable
    private Integer imageSelectedPathResId;
    private int imageUnselectedPathResId;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazePlayerButtonCustomImageStates(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazePlayerButtonCustomImageStates[i];
        }
    }

    public BlazePlayerButtonCustomImageStates(int i, @Nullable Integer num) {
        this.imageUnselectedPathResId = i;
        this.imageSelectedPathResId = num;
    }

    public static /* synthetic */ BlazePlayerButtonCustomImageStates copy$default(BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = blazePlayerButtonCustomImageStates.imageUnselectedPathResId;
        }
        if ((i2 & 2) != 0) {
            num = blazePlayerButtonCustomImageStates.imageSelectedPathResId;
        }
        return blazePlayerButtonCustomImageStates.copy(i, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getImageUnselectedPathResId() {
        return this.imageUnselectedPathResId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getImageSelectedPathResId() {
        return this.imageSelectedPathResId;
    }

    @NotNull
    public final BlazePlayerButtonCustomImageStates copy(int imageUnselectedPathResId, @Nullable Integer imageSelectedPathResId) {
        return new BlazePlayerButtonCustomImageStates(imageUnselectedPathResId, imageSelectedPathResId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazePlayerButtonCustomImageStates)) {
            return false;
        }
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates = (BlazePlayerButtonCustomImageStates) other;
        return this.imageUnselectedPathResId == blazePlayerButtonCustomImageStates.imageUnselectedPathResId && Intrinsics.c(this.imageSelectedPathResId, blazePlayerButtonCustomImageStates.imageSelectedPathResId);
    }

    @Nullable
    public final Integer getImageSelectedPathResId() {
        return this.imageSelectedPathResId;
    }

    public final int getImageUnselectedPathResId() {
        return this.imageUnselectedPathResId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.imageUnselectedPathResId) * 31;
        Integer num = this.imageSelectedPathResId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setImageSelectedPathResId(@Nullable Integer num) {
        this.imageSelectedPathResId = num;
    }

    public final void setImageUnselectedPathResId(int i) {
        this.imageUnselectedPathResId = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazePlayerButtonCustomImageStates(imageUnselectedPathResId=");
        sb.append(this.imageUnselectedPathResId);
        sb.append(", imageSelectedPathResId=");
        return bf3.n(sb, this.imageSelectedPathResId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.imageUnselectedPathResId);
        Integer num = this.imageSelectedPathResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
    }
}

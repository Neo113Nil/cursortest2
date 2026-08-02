package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/giphy/sdk/core/models/BottleData;", "Landroid/os/Parcelable;", "tid", "", "tags", "", "tData", "Lcom/giphy/sdk/core/models/TData;", "(Ljava/lang/String;Ljava/util/List;Lcom/giphy/sdk/core/models/TData;)V", "getTData", "()Lcom/giphy/sdk/core/models/TData;", "setTData", "(Lcom/giphy/sdk/core/models/TData;)V", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "getTid", "()Ljava/lang/String;", "setTid", "(Ljava/lang/String;)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BottleData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BottleData> CREATOR = new Creator();

    @c("tdata")
    @Nullable
    private TData tData;

    @Nullable
    private List<String> tags;

    @Nullable
    private String tid;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BottleData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BottleData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BottleData(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : TData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BottleData[] newArray(int i10) {
            return new BottleData[i10];
        }
    }

    public BottleData() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final TData getTData() {
        return this.tData;
    }

    @Nullable
    public final List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getTid() {
        return this.tid;
    }

    public final void setTData(@Nullable TData tData) {
        this.tData = tData;
    }

    public final void setTags(@Nullable List<String> list) {
        this.tags = list;
    }

    public final void setTid(@Nullable String str) {
        this.tid = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.tid);
        parcel.writeStringList(this.tags);
        TData tData = this.tData;
        if (tData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tData.writeToParcel(parcel, flags);
        }
    }

    public BottleData(@Nullable String str, @Nullable List<String> list, @Nullable TData tData) {
        this.tid = str;
        this.tags = list;
        this.tData = tData;
    }

    public /* synthetic */ BottleData(String str, List list, TData tData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : tData);
    }
}

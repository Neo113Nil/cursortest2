package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/giphy/sdk/core/models/Pagination;", "Landroid/os/Parcelable;", "totalCount", "", "count", "offset", "nextPage", "", "nextCursor", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCount", "()I", "getNextCursor", "()Ljava/lang/String;", "getNextPage", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalCount", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Pagination implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Pagination> CREATOR = new Creator();
    private final int count;

    @c("next_cursor")
    @Nullable
    private final String nextCursor;

    @c("next_page")
    @Nullable
    private final String nextPage;

    @Nullable
    private final Integer offset;

    @c("total_count")
    private final int totalCount;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Pagination> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Pagination createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Pagination(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Pagination[] newArray(int i10) {
            return new Pagination[i10];
        }
    }

    public Pagination(int i10, int i11, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.totalCount = i10;
        this.count = i11;
        this.offset = num;
        this.nextPage = str;
        this.nextCursor = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final String getNextCursor() {
        return this.nextCursor;
    }

    @Nullable
    public final String getNextPage() {
        return this.nextPage;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int intValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.count);
        Integer num = this.offset;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.nextPage);
        parcel.writeString(this.nextCursor);
    }

    public /* synthetic */ Pagination(int i10, int i11, Integer num, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, num, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : str2);
    }
}

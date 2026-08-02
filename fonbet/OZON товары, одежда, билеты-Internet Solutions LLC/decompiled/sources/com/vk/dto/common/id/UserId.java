package com.vk.dto.common.id;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.m;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class UserId implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserId> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final long f60502a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/dto/common/id/UserId$GsonSerializer;", "Lcom/google/gson/m;", "Lcom/vk/dto/common/id/UserId;", "Lcom/google/gson/i;", "id_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GsonSerializer implements m<UserId>, i<UserId> {
        @Override // com.google.gson.m
        public final JsonPrimitive a(Object obj) {
            UserId userId = (UserId) obj;
            return new JsonPrimitive(Long.valueOf(userId == null ? -1L : userId.a()));
        }

        @Override // com.google.gson.i
        public final UserId deserialize(JsonElement jsonElement, Type type, h hVar) {
            if (jsonElement == null || jsonElement.isJsonNull()) {
                return null;
            }
            return new UserId(jsonElement.getAsLong());
        }
    }

    public static final class a implements Parcelable.Creator<UserId> {
        @Override // android.os.Parcelable.Creator
        public final UserId createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "source");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserId(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final UserId[] newArray(int i11) {
            return new UserId[i11];
        }
    }

    public UserId(long j11) {
        this.f60502a = j11;
    }

    public final long a() {
        return this.f60502a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserId) && this.f60502a == ((UserId) obj).f60502a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f60502a);
    }

    @NotNull
    public final String toString() {
        return String.valueOf(this.f60502a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f60502a);
    }
}

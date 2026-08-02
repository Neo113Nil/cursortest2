package ru.ozon.android.messenger.framework.composer.navigation.config;

import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C1549a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f86716a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f86717b;

    /* renamed from: ru.ozon.android.messenger.framework.composer.navigation.config.a$a, reason: collision with other inner class name */
    public static final class C1549a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = B6.b.a(parcel, linkedHashMap, parcel.readString(), i11, 1);
            }
            return new a(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(@NotNull String deeplink, @NotNull Map<String, String> bodyParams) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(bodyParams, "bodyParams");
        this.f86716a = deeplink;
        this.f86717b = bodyParams;
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f86717b;
    }

    @NotNull
    public final String b() {
        return this.f86716a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f86716a, aVar.f86716a) && Intrinsics.d(this.f86717b, aVar.f86717b);
    }

    public final int hashCode() {
        return this.f86717b.hashCode() + (this.f86716a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposerPage(deeplink=");
        sb2.append(this.f86716a);
        sb2.append(", bodyParams=");
        return P.f(sb2, this.f86717b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86716a);
        Map<String, String> map = this.f86717b;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }
}

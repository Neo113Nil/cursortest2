package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class V9 implements Parcelable {

    @NotNull
    public static final U9 CREATOR = new U9();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f13030a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f13031b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13032c;

    public V9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f13030a = bool;
        this.f13031b = identifierStatus;
        this.f13032c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V9)) {
            return false;
        }
        V9 v92 = (V9) obj;
        return Intrinsics.areEqual(this.f13030a, v92.f13030a) && this.f13031b == v92.f13031b && Intrinsics.areEqual(this.f13032c, v92.f13032c);
    }

    public final int hashCode() {
        Boolean bool = this.f13030a;
        int hashCode = (this.f13031b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f13032c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeaturesInternal(sslPinning=");
        sb2.append(this.f13030a);
        sb2.append(", status=");
        sb2.append(this.f13031b);
        sb2.append(", errorExplanation=");
        return d9.e.k(sb2, this.f13032c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeValue(this.f13030a);
        parcel.writeString(this.f13031b.getValue());
        parcel.writeString(this.f13032c);
    }

    public V9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}

package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import h8.b;
import y6.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class ChannelIdValue extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new n(8);

    /* renamed from: a, reason: collision with root package name */
    public final ChannelIdValueType f4785a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4786b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4787c;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public enum ChannelIdValueType implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f4790a;

        ChannelIdValueType(int i5) {
            this.f4790a = i5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f4790a);
        }
    }

    static {
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    public ChannelIdValue(int i5, String str, String str2) {
        try {
            this.f4785a = c(i5);
            this.f4786b = str;
            this.f4787c = str2;
        } catch (z6.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static ChannelIdValueType c(int i5) {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i5 == channelIdValueType.f4790a) {
                return channelIdValueType;
            }
        }
        throw new z6.a(e.f(i5, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.f4785a;
        ChannelIdValueType channelIdValueType2 = this.f4785a;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int ordinal = channelIdValueType2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.f4786b.equals(channelIdValue.f4786b);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.f4787c.equals(channelIdValue.f4787c);
    }

    public final int hashCode() {
        int i5;
        int hashCode;
        ChannelIdValueType channelIdValueType = this.f4785a;
        int hashCode2 = channelIdValueType.hashCode() + 31;
        int ordinal = channelIdValueType.ordinal();
        if (ordinal == 1) {
            i5 = hashCode2 * 31;
            hashCode = this.f4786b.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i5 = hashCode2 * 31;
            hashCode = this.f4787c.hashCode();
        }
        return hashCode + i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        int i10 = this.f4785a.f4790a;
        b.U(parcel, 2, 4);
        parcel.writeInt(i10);
        b.O(parcel, 3, this.f4786b, false);
        b.O(parcel, 4, this.f4787c, false);
        b.W(parcel, V);
    }

    public ChannelIdValue(String str) {
        this.f4786b = str;
        this.f4785a = ChannelIdValueType.STRING;
        this.f4787c = null;
    }
}

package com.blaze.blazesdk.players.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class B implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<B> CREATOR = new a();
    public final F a;
    public b b;
    public H c;
    public P d;
    public D e;
    public D f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new B(F.CREATOR.createFromParcel(parcel), (b) parcel.readParcelable(B.class.getClassLoader()), parcel.readInt() == 0 ? null : H.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : P.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : D.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? D.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new B[i];
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class b implements EnumWithValue, Parcelable {
        public final String a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a extends b {

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C0019a();
            public final F b;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            /* renamed from: com.blaze.blazesdk.players.models.B$b$a$a, reason: collision with other inner class name */
            public static final class C0019a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new a(F.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new a[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull F f) {
                super(f.a, null);
                f.getClass();
                this.b = f;
            }

            public static a copy$default(a aVar, F f, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = aVar.b;
                }
                aVar.getClass();
                f.getClass();
                return new a(f);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Origin(trigger=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                F f = this.b;
                f.getClass();
                parcel.getClass();
                parcel.writeString(f.name());
            }
        }

        public b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this.a = str;
        }

        @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
        public final String getValue() {
            return this.a;
        }
    }

    public /* synthetic */ B(F f, b bVar, H h, P p, D d, D d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? new b.a(f) : bVar, (i & 4) != 0 ? null : h, (i & 8) != 0 ? null : p, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : d2);
    }

    public static B copy$default(B b2, F f, b bVar, H h, P p, D d, D d2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = b2.a;
        }
        if ((i & 2) != 0) {
            bVar = b2.b;
        }
        if ((i & 4) != 0) {
            h = b2.c;
        }
        if ((i & 8) != 0) {
            p = b2.d;
        }
        if ((i & 16) != 0) {
            d = b2.e;
        }
        if ((i & 32) != 0) {
            d2 = b2.f;
        }
        D d3 = d2;
        b2.getClass();
        f.getClass();
        bVar.getClass();
        D d4 = d;
        H h2 = h;
        return new B(f, bVar, h2, p, d4, d3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        return this.a == b2.a && Intrinsics.c(this.b, b2.b) && this.c == b2.c && this.d == b2.d && this.e == b2.e && this.f == b2.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        H h = this.c;
        int hashCode2 = (hashCode + (h == null ? 0 : h.hashCode())) * 31;
        P p = this.d;
        int hashCode3 = (hashCode2 + (p == null ? 0 : p.hashCode())) * 31;
        D d = this.e;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        D d2 = this.f;
        return hashCode4 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerSessionTracker(originTrigger=" + this.a + ", progressionStartTrigger=" + this.b + ", progressionEndTrigger=" + this.c + ", orientationChangeTrigger=" + this.d + ", sensorDeviceOrientation=" + this.e + ", configDeviceOrientation=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        F f = this.a;
        f.getClass();
        parcel.getClass();
        parcel.writeString(f.name());
        parcel.writeParcelable(this.b, i);
        H h = this.c;
        if (h == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(h.name());
        }
        P p = this.d;
        if (p == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(p.name());
        }
        D d = this.e;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(d.name());
        }
        D d2 = this.f;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(d2.name());
        }
    }

    public B(@NotNull F f, @NotNull b bVar, @Nullable H h, @Nullable P p, @Nullable D d, @Nullable D d2) {
        f.getClass();
        bVar.getClass();
        this.a = f;
        this.b = bVar;
        this.c = h;
        this.d = p;
        this.e = d;
        this.f = d2;
    }
}

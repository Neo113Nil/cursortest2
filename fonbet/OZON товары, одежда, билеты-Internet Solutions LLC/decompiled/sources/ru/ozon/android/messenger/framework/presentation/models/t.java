package ru.ozon.android.messenger.framework.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class t implements Parcelable {

    public static final class a extends t {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C1712a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f91547a;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.models.t$a$a, reason: collision with other inner class name */
        public static final class C1712a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a() {
            this(true);
        }

        public final boolean a() {
            return this.f91547a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f91547a == ((a) obj).f91547a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f91547a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("AvatarMessage(isVisible="), this.f91547a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f91547a ? 1 : 0);
        }

        public a(boolean z11) {
            super(0);
            this.f91547a = z11;
        }
    }

    public static final class b extends t {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f91548a = new b(0);

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return b.f91548a;
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1946018039;
        }

        @NotNull
        public final String toString() {
            return "Empty";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class c extends t {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f91549a = new c(0);

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return c.f91549a;
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -52553741;
        }

        @NotNull
        public final String toString() {
            return "PlainMessage";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class d extends t {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f91550a = new d(0);

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return d.f91550a;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1599261207;
        }

        @NotNull
        public final String toString() {
            return "Wide";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ t(int i11) {
        this();
    }

    private t() {
    }
}

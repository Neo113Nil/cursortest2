package ru.ozon.android.messenger.blocks.rateoperator.message;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class c implements Parcelable {

    public static final class a extends c {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C1525a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final UUID f86259a;

        /* renamed from: ru.ozon.android.messenger.blocks.rateoperator.message.c$a$a, reason: collision with other inner class name */
        public static final class C1525a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f86259a, ((a) obj).f86259a);
        }

        public final int hashCode() {
            return this.f86259a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Refresh(randomId=" + this.f86259a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f86259a);
        }

        public /* synthetic */ a(int i11) {
            this(UUID.randomUUID());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull UUID randomId) {
            super(0);
            Intrinsics.checkNotNullParameter(randomId, "randomId");
            this.f86259a = randomId;
        }
    }

    public static final class b extends c {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final UUID f86260a;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f86260a, ((b) obj).f86260a);
        }

        public final int hashCode() {
            return this.f86260a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(randomId=" + this.f86260a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f86260a);
        }

        public /* synthetic */ b(int i11) {
            this(UUID.randomUUID());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull UUID randomId) {
            super(0);
            Intrinsics.checkNotNullParameter(randomId, "randomId");
            this.f86260a = randomId;
        }
    }

    public /* synthetic */ c(int i11) {
        this();
    }

    private c() {
    }
}

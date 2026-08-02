package ru.ozon.android.inAppUpdate.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateResponseDTO;

/* loaded from: classes10.dex */
public abstract class e implements Parcelable {

    public static final class a extends e {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C1450a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final CheckUpdateResponseDTO f83895a;

        /* renamed from: ru.ozon.android.inAppUpdate.internal.ui.e$a$a, reason: collision with other inner class name */
        public static final class C1450a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(CheckUpdateResponseDTO.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull CheckUpdateResponseDTO response) {
            super(0);
            Intrinsics.checkNotNullParameter(response, "response");
            this.f83895a = response;
        }

        @Override // ru.ozon.android.inAppUpdate.internal.ui.e
        @NotNull
        public final CheckUpdateResponseDTO a() {
            return this.f83895a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f83895a, ((a) obj).f83895a);
        }

        public final int hashCode() {
            return this.f83895a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Download(response=" + this.f83895a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f83895a.writeToParcel(dest, i11);
        }
    }

    public static final class b extends e {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final CheckUpdateResponseDTO f83896a;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(CheckUpdateResponseDTO.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull CheckUpdateResponseDTO response) {
            super(0);
            Intrinsics.checkNotNullParameter(response, "response");
            this.f83896a = response;
        }

        @Override // ru.ozon.android.inAppUpdate.internal.ui.e
        @NotNull
        public final CheckUpdateResponseDTO a() {
            return this.f83896a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f83896a, ((b) obj).f83896a);
        }

        public final int hashCode() {
            return this.f83896a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "InstallAlternativeStore(response=" + this.f83896a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f83896a.writeToParcel(dest, i11);
        }
    }

    public static final class c extends e {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final CheckUpdateResponseDTO f83897a;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c(CheckUpdateResponseDTO.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull CheckUpdateResponseDTO response) {
            super(0);
            Intrinsics.checkNotNullParameter(response, "response");
            this.f83897a = response;
        }

        @Override // ru.ozon.android.inAppUpdate.internal.ui.e
        @NotNull
        public final CheckUpdateResponseDTO a() {
            return this.f83897a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f83897a, ((c) obj).f83897a);
        }

        public final int hashCode() {
            return this.f83897a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "InstallGooglePlayStore(response=" + this.f83897a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f83897a.writeToParcel(dest, i11);
        }
    }

    public static final class d extends e {

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final CheckUpdateResponseDTO f83898a;

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new d(CheckUpdateResponseDTO.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull CheckUpdateResponseDTO response) {
            super(0);
            Intrinsics.checkNotNullParameter(response, "response");
            this.f83898a = response;
        }

        @Override // ru.ozon.android.inAppUpdate.internal.ui.e
        @NotNull
        public final CheckUpdateResponseDTO a() {
            return this.f83898a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f83898a, ((d) obj).f83898a);
        }

        public final int hashCode() {
            return this.f83898a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "RequestPermissionAlternativeStore(response=" + this.f83898a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f83898a.writeToParcel(dest, i11);
        }
    }

    /* renamed from: ru.ozon.android.inAppUpdate.internal.ui.e$e, reason: collision with other inner class name */
    public static final class C1451e extends e {

        @NotNull
        public static final Parcelable.Creator<C1451e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final CheckUpdateResponseDTO f83899a;

        /* renamed from: ru.ozon.android.inAppUpdate.internal.ui.e$e$a */
        public static final class a implements Parcelable.Creator<C1451e> {
            @Override // android.os.Parcelable.Creator
            public final C1451e createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C1451e(CheckUpdateResponseDTO.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final C1451e[] newArray(int i11) {
                return new C1451e[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1451e(@NotNull CheckUpdateResponseDTO response) {
            super(0);
            Intrinsics.checkNotNullParameter(response, "response");
            this.f83899a = response;
        }

        @Override // ru.ozon.android.inAppUpdate.internal.ui.e
        @NotNull
        public final CheckUpdateResponseDTO a() {
            return this.f83899a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1451e) && Intrinsics.d(this.f83899a, ((C1451e) obj).f83899a);
        }

        public final int hashCode() {
            return this.f83899a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "RequestPermissionGooglePlayStore(response=" + this.f83899a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f83899a.writeToParcel(dest, i11);
        }
    }

    public /* synthetic */ e(int i11) {
        this();
    }

    @NotNull
    public abstract CheckUpdateResponseDTO a();

    private e() {
    }
}

package ru.ozon.android.messenger.blocks.input.attachments.presentation;

import B0.C2454a;
import C.o0;
import Kk.C3532b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final UUID f85451a;

    /* renamed from: b, reason: collision with root package name */
    private final String f85452b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Uri f85453c;

    /* renamed from: d, reason: collision with root package name */
    private final String f85454d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final c f85455e;

    /* renamed from: f, reason: collision with root package name */
    private final int f85456f;

    /* renamed from: g, reason: collision with root package name */
    private final int f85457g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f85458h;

    public static final class a extends b {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C1499a();

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final UUID f85459i;

        /* renamed from: j, reason: collision with root package name */
        private final String f85460j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final Uri f85461k;

        /* renamed from: l, reason: collision with root package name */
        private final String f85462l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final c f85463m;

        /* renamed from: n, reason: collision with root package name */
        private final int f85464n;

        /* renamed from: o, reason: collision with root package name */
        private final int f85465o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f85466p;

        /* renamed from: q, reason: collision with root package name */
        private final String f85467q;

        /* renamed from: r, reason: collision with root package name */
        private final String f85468r;

        /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.presentation.b$a$a, reason: collision with other inner class name */
        public static final class C1499a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a((UUID) parcel.readSerializable(), parcel.readString(), (Uri) parcel.readParcelable(a.class.getClassLoader()), parcel.readString(), (c) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull UUID id2, String str, @NotNull Uri localUri, String str2, @NotNull c uploadingStatus, int i11, int i12, boolean z11, String str3, String str4) {
            super(id2, str, localUri, str2, uploadingStatus, i11, i12, z11);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(localUri, "localUri");
            Intrinsics.checkNotNullParameter(uploadingStatus, "uploadingStatus");
            this.f85459i = id2;
            this.f85460j = str;
            this.f85461k = localUri;
            this.f85462l = str2;
            this.f85463m = uploadingStatus;
            this.f85464n = i11;
            this.f85465o = i12;
            this.f85466p = z11;
            this.f85467q = str3;
            this.f85468r = str4;
        }

        public static a i(a aVar, c uploadingStatus, int i11, int i12) {
            UUID id2 = aVar.f85459i;
            String str = aVar.f85460j;
            Uri localUri = aVar.f85461k;
            String str2 = aVar.f85462l;
            int i13 = aVar.f85464n;
            if ((i12 & 64) != 0) {
                i11 = aVar.f85465o;
            }
            int i14 = i11;
            boolean z11 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? aVar.f85466p : true;
            String str3 = aVar.f85467q;
            String str4 = aVar.f85468r;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(localUri, "localUri");
            Intrinsics.checkNotNullParameter(uploadingStatus, "uploadingStatus");
            return new a(id2, str, localUri, str2, uploadingStatus, i13, i14, z11, str3, str4);
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final int a() {
            return this.f85465o;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        @NotNull
        public final UUID b() {
            return this.f85459i;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        @NotNull
        public final Uri c() {
            return this.f85461k;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final String d() {
            return this.f85462l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final int e() {
            return this.f85464n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f85459i, aVar.f85459i) && Intrinsics.d(this.f85460j, aVar.f85460j) && Intrinsics.d(this.f85461k, aVar.f85461k) && Intrinsics.d(this.f85462l, aVar.f85462l) && Intrinsics.d(this.f85463m, aVar.f85463m) && this.f85464n == aVar.f85464n && this.f85465o == aVar.f85465o && this.f85466p == aVar.f85466p && Intrinsics.d(this.f85467q, aVar.f85467q) && Intrinsics.d(this.f85468r, aVar.f85468r);
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        @NotNull
        public final c f() {
            return this.f85463m;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final String g() {
            return this.f85460j;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final boolean h() {
            return this.f85466p;
        }

        public final int hashCode() {
            int hashCode = this.f85459i.hashCode() * 31;
            String str = this.f85460j;
            int hashCode2 = (this.f85461k.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.f85462l;
            int a11 = C3532b.a(C2454a.a(this.f85465o, C2454a.a(this.f85464n, (this.f85463m.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31), 31, this.f85466p);
            String str3 = this.f85467q;
            int hashCode3 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f85468r;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String j() {
            return this.f85467q;
        }

        public final String k() {
            return this.f85468r;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AttachedFileVO(id=");
            sb2.append(this.f85459i);
            sb2.append(", url=");
            sb2.append(this.f85460j);
            sb2.append(", localUri=");
            sb2.append(this.f85461k);
            sb2.append(", mediaType=");
            sb2.append(this.f85462l);
            sb2.append(", uploadingStatus=");
            sb2.append(this.f85463m);
            sb2.append(", position=");
            sb2.append(this.f85464n);
            sb2.append(", group=");
            sb2.append(this.f85465o);
            sb2.append(", wasMovedToEndOfGroup=");
            sb2.append(this.f85466p);
            sb2.append(", filename=");
            sb2.append(this.f85467q);
            sb2.append(", size=");
            return o0.c(sb2, this.f85468r, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85459i);
            dest.writeString(this.f85460j);
            dest.writeParcelable(this.f85461k, i11);
            dest.writeString(this.f85462l);
            dest.writeParcelable(this.f85463m, i11);
            dest.writeInt(this.f85464n);
            dest.writeInt(this.f85465o);
            dest.writeInt(this.f85466p ? 1 : 0);
            dest.writeString(this.f85467q);
            dest.writeString(this.f85468r);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.presentation.b$b, reason: collision with other inner class name */
    public static final class C1500b extends b {

        @NotNull
        public static final Parcelable.Creator<C1500b> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final UUID f85469i;

        /* renamed from: j, reason: collision with root package name */
        private final String f85470j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final Uri f85471k;

        /* renamed from: l, reason: collision with root package name */
        private final String f85472l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final c f85473m;

        /* renamed from: n, reason: collision with root package name */
        private final int f85474n;

        /* renamed from: o, reason: collision with root package name */
        private final int f85475o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f85476p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f85477q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f85478r;

        /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.presentation.b$b$a */
        public static final class a implements Parcelable.Creator<C1500b> {
            @Override // android.os.Parcelable.Creator
            public final C1500b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C1500b((UUID) parcel.readSerializable(), parcel.readString(), (Uri) parcel.readParcelable(C1500b.class.getClassLoader()), parcel.readString(), (c) parcel.readParcelable(C1500b.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final C1500b[] newArray(int i11) {
                return new C1500b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1500b(@NotNull UUID id2, String str, @NotNull Uri localUri, String str2, @NotNull c uploadingStatus, int i11, int i12, boolean z11, Integer num, Integer num2) {
            super(id2, str, localUri, str2, uploadingStatus, i11, i12, z11);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(localUri, "localUri");
            Intrinsics.checkNotNullParameter(uploadingStatus, "uploadingStatus");
            this.f85469i = id2;
            this.f85470j = str;
            this.f85471k = localUri;
            this.f85472l = str2;
            this.f85473m = uploadingStatus;
            this.f85474n = i11;
            this.f85475o = i12;
            this.f85476p = z11;
            this.f85477q = num;
            this.f85478r = num2;
        }

        public static C1500b i(C1500b c1500b, c uploadingStatus, int i11, int i12) {
            UUID id2 = c1500b.f85469i;
            String str = c1500b.f85470j;
            Uri localUri = c1500b.f85471k;
            String str2 = c1500b.f85472l;
            int i13 = c1500b.f85474n;
            if ((i12 & 64) != 0) {
                i11 = c1500b.f85475o;
            }
            int i14 = i11;
            boolean z11 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c1500b.f85476p : true;
            Integer num = c1500b.f85477q;
            Integer num2 = c1500b.f85478r;
            c1500b.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(localUri, "localUri");
            Intrinsics.checkNotNullParameter(uploadingStatus, "uploadingStatus");
            return new C1500b(id2, str, localUri, str2, uploadingStatus, i13, i14, z11, num, num2);
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final int a() {
            return this.f85475o;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        @NotNull
        public final UUID b() {
            return this.f85469i;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        @NotNull
        public final Uri c() {
            return this.f85471k;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final String d() {
            return this.f85472l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final int e() {
            return this.f85474n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1500b)) {
                return false;
            }
            C1500b c1500b = (C1500b) obj;
            return Intrinsics.d(this.f85469i, c1500b.f85469i) && Intrinsics.d(this.f85470j, c1500b.f85470j) && Intrinsics.d(this.f85471k, c1500b.f85471k) && Intrinsics.d(this.f85472l, c1500b.f85472l) && Intrinsics.d(this.f85473m, c1500b.f85473m) && this.f85474n == c1500b.f85474n && this.f85475o == c1500b.f85475o && this.f85476p == c1500b.f85476p && Intrinsics.d(this.f85477q, c1500b.f85477q) && Intrinsics.d(this.f85478r, c1500b.f85478r);
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        @NotNull
        public final c f() {
            return this.f85473m;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final String g() {
            return this.f85470j;
        }

        public final Integer getHeight() {
            return this.f85478r;
        }

        public final Integer getWidth() {
            return this.f85477q;
        }

        @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b
        public final boolean h() {
            return this.f85476p;
        }

        public final int hashCode() {
            int hashCode = this.f85469i.hashCode() * 31;
            String str = this.f85470j;
            int hashCode2 = (this.f85471k.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.f85472l;
            int a11 = C3532b.a(C2454a.a(this.f85475o, C2454a.a(this.f85474n, (this.f85473m.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31), 31, this.f85476p);
            Integer num = this.f85477q;
            int hashCode3 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f85478r;
            return hashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AttachedImageVO(id=");
            sb2.append(this.f85469i);
            sb2.append(", url=");
            sb2.append(this.f85470j);
            sb2.append(", localUri=");
            sb2.append(this.f85471k);
            sb2.append(", mediaType=");
            sb2.append(this.f85472l);
            sb2.append(", uploadingStatus=");
            sb2.append(this.f85473m);
            sb2.append(", position=");
            sb2.append(this.f85474n);
            sb2.append(", group=");
            sb2.append(this.f85475o);
            sb2.append(", wasMovedToEndOfGroup=");
            sb2.append(this.f85476p);
            sb2.append(", width=");
            sb2.append(this.f85477q);
            sb2.append(", height=");
            return Ep.a.c(sb2, this.f85478r, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85469i);
            dest.writeString(this.f85470j);
            dest.writeParcelable(this.f85471k, i11);
            dest.writeString(this.f85472l);
            dest.writeParcelable(this.f85473m, i11);
            dest.writeInt(this.f85474n);
            dest.writeInt(this.f85475o);
            dest.writeInt(this.f85476p ? 1 : 0);
            Integer num = this.f85477q;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Integer num2 = this.f85478r;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
        }
    }

    public interface c extends Parcelable {

        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f85479a = new a();

            /* renamed from: b, reason: collision with root package name */
            private static final boolean f85480b = true;

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C1501a();

            /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.presentation.b$c$a$a, reason: collision with other inner class name */
            public static final class C1501a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return a.f85479a;
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean L() {
                return false;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean R1() {
                return false;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean S1() {
                return false;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean a1() {
                return false;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean d0() {
                return f85480b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1049123120;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean m1() {
                return false;
            }

            @NotNull
            public final String toString() {
                return "UPLOADED";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.presentation.b$c$b, reason: collision with other inner class name */
        public static final class C1502b implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1502b f85481a = new C1502b();

            /* renamed from: b, reason: collision with root package name */
            private static final boolean f85482b = true;

            /* renamed from: c, reason: collision with root package name */
            private static final boolean f85483c = true;

            /* renamed from: d, reason: collision with root package name */
            private static final boolean f85484d = true;

            @NotNull
            public static final Parcelable.Creator<C1502b> CREATOR = new a();

            /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.presentation.b$c$b$a */
            public static final class a implements Parcelable.Creator<C1502b> {
                @Override // android.os.Parcelable.Creator
                public final C1502b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C1502b.f85481a;
                }

                @Override // android.os.Parcelable.Creator
                public final C1502b[] newArray(int i11) {
                    return new C1502b[i11];
                }
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean L() {
                return false;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean R1() {
                return f85483c;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean S1() {
                return f85484d;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean a1() {
                return f85482b;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean d0() {
                return false;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1502b);
            }

            public final int hashCode() {
                return -1836917423;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean m1() {
                return false;
            }

            @NotNull
            public final String toString() {
                return "UPLOADING";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.presentation.b$c$c, reason: collision with other inner class name */
        public static final class C1503c implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1503c f85485a = new C1503c();

            /* renamed from: b, reason: collision with root package name */
            private static final boolean f85486b = true;

            /* renamed from: c, reason: collision with root package name */
            private static final boolean f85487c = true;

            /* renamed from: d, reason: collision with root package name */
            private static final boolean f85488d = true;

            /* renamed from: e, reason: collision with root package name */
            private static final boolean f85489e = true;

            @NotNull
            public static final Parcelable.Creator<C1503c> CREATOR = new a();

            /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.presentation.b$c$c$a */
            public static final class a implements Parcelable.Creator<C1503c> {
                @Override // android.os.Parcelable.Creator
                public final C1503c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C1503c.f85485a;
                }

                @Override // android.os.Parcelable.Creator
                public final C1503c[] newArray(int i11) {
                    return new C1503c[i11];
                }
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean L() {
                return f85489e;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean R1() {
                return f85488d;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean S1() {
                return false;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean a1() {
                return false;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean d0() {
                return f85486b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1503c);
            }

            public final int hashCode() {
                return 1292966266;
            }

            @Override // ru.ozon.android.messenger.blocks.input.attachments.presentation.b.c
            public final boolean m1() {
                return f85487c;
            }

            @NotNull
            public final String toString() {
                return "UPLOADING_ERROR";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        boolean L();

        boolean R1();

        boolean S1();

        boolean a1();

        boolean d0();

        boolean m1();
    }

    public b(UUID uuid, String str, Uri uri, String str2, c cVar, int i11, int i12, boolean z11) {
        this.f85451a = uuid;
        this.f85452b = str;
        this.f85453c = uri;
        this.f85454d = str2;
        this.f85455e = cVar;
        this.f85456f = i11;
        this.f85457g = i12;
        this.f85458h = z11;
    }

    public int a() {
        return this.f85457g;
    }

    @NotNull
    public UUID b() {
        return this.f85451a;
    }

    @NotNull
    public Uri c() {
        return this.f85453c;
    }

    public String d() {
        return this.f85454d;
    }

    public int e() {
        return this.f85456f;
    }

    @NotNull
    public c f() {
        return this.f85455e;
    }

    public String g() {
        return this.f85452b;
    }

    public boolean h() {
        return this.f85458h;
    }
}

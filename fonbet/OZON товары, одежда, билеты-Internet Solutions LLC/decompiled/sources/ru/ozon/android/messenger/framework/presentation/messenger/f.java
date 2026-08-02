package ru.ozon.android.messenger.framework.presentation.messenger;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatlist.v;

/* loaded from: classes10.dex */
public interface f extends Parcelable {

    public static final class c implements f {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final e f91353a;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c(e.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        public c() {
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
            return (obj instanceof c) && Intrinsics.d(this.f91353a, ((c) obj).f91353a);
        }

        public final int hashCode() {
            return this.f91353a.hashCode();
        }

        @Override // ru.ozon.android.messenger.framework.presentation.messenger.f
        @NotNull
        public final e s() {
            return this.f91353a;
        }

        @NotNull
        public final String toString() {
            return "ChatListScreen(config=" + this.f91353a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f91353a.writeToParcel(dest, i11);
        }

        public c(@NotNull e config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f91353a = config;
        }

        public /* synthetic */ c(int i11) {
            this(new e(null));
        }
    }

    @NotNull
    e s();

    public static final class d implements f {

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final v f91354a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final e f91355b;

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new d(parcel.readInt() == 0 ? null : v.CREATOR.createFromParcel(parcel), e.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        public d(v vVar, @NotNull e config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f91354a = vVar;
            this.f91355b = config;
        }

        public final v a() {
            return this.f91354a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.d(this.f91354a, dVar.f91354a) && Intrinsics.d(this.f91355b, dVar.f91355b);
        }

        public final int hashCode() {
            v vVar = this.f91354a;
            return this.f91355b.hashCode() + ((vVar == null ? 0 : vVar.hashCode()) * 31);
        }

        @Override // ru.ozon.android.messenger.framework.presentation.messenger.f
        @NotNull
        public final e s() {
            return this.f91355b;
        }

        @NotNull
        public final String toString() {
            return "ChatListScreenWithFilter(filter=" + this.f91354a + ", config=" + this.f91355b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            v vVar = this.f91354a;
            if (vVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                vVar.writeToParcel(dest, i11);
            }
            this.f91355b.writeToParcel(dest, i11);
        }

        public d() {
            this(null, new e(null));
        }
    }

    public static final class a implements f {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C1705a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f91346a;

        /* renamed from: b, reason: collision with root package name */
        private final String f91347b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final e f91348c;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.messenger.f$a$a, reason: collision with other inner class name */
        public static final class C1705a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a((Uri) parcel.readParcelable(a.class.getClassLoader()), parcel.readString(), e.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(@NotNull Uri deeplink, String str, @NotNull e config) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f91346a = deeplink;
            this.f91347b = str;
            this.f91348c = config;
        }

        public final String a() {
            return this.f91347b;
        }

        @NotNull
        public final Uri b() {
            return this.f91346a;
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
            return Intrinsics.d(this.f91346a, aVar.f91346a) && Intrinsics.d(this.f91347b, aVar.f91347b) && Intrinsics.d(this.f91348c, aVar.f91348c);
        }

        public final int hashCode() {
            int hashCode = this.f91346a.hashCode() * 31;
            String str = this.f91347b;
            return this.f91348c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // ru.ozon.android.messenger.framework.presentation.messenger.f
        @NotNull
        public final e s() {
            return this.f91348c;
        }

        @NotNull
        public final String toString() {
            return "AiAssistant(deeplink=" + this.f91346a + ", chatId=" + this.f91347b + ", config=" + this.f91348c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91346a, i11);
            dest.writeString(this.f91347b);
            this.f91348c.writeToParcel(dest, i11);
        }

        public /* synthetic */ a(Uri uri) {
            this(uri, null, new e(null));
        }
    }

    public static final class b implements f {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f91349a;

        /* renamed from: b, reason: collision with root package name */
        private final String f91350b;

        /* renamed from: c, reason: collision with root package name */
        private final String f91351c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final e f91352d;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b((Uri) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), e.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(@NotNull Uri deeplink, String str, String str2, @NotNull e config) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f91349a = deeplink;
            this.f91350b = str;
            this.f91351c = str2;
            this.f91352d = config;
        }

        public final String a() {
            return this.f91350b;
        }

        @NotNull
        public final Uri b() {
            return this.f91349a;
        }

        public final String c() {
            return this.f91351c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f91349a, bVar.f91349a) && Intrinsics.d(this.f91350b, bVar.f91350b) && Intrinsics.d(this.f91351c, bVar.f91351c) && Intrinsics.d(this.f91352d, bVar.f91352d);
        }

        public final int hashCode() {
            int hashCode = this.f91349a.hashCode() * 31;
            String str = this.f91350b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f91351c;
            return this.f91352d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // ru.ozon.android.messenger.framework.presentation.messenger.f
        @NotNull
        public final e s() {
            return this.f91352d;
        }

        @NotNull
        public final String toString() {
            return "ChatDetailsScreen(deeplink=" + this.f91349a + ", chatId=" + this.f91350b + ", firstUnreadMsgId=" + this.f91351c + ", config=" + this.f91352d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91349a, i11);
            dest.writeString(this.f91350b);
            dest.writeString(this.f91351c);
            this.f91352d.writeToParcel(dest, i11);
        }

        public /* synthetic */ b(Uri uri, String str) {
            this(uri, null, str, new e(null));
        }
    }
}

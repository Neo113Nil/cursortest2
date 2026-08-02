package ru.ozon.android.inAppUpdate.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.inAppUpdate.internal.ui.e;

/* loaded from: classes10.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f83902a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f83903b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f83904c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f83905d;

    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new g((e) parcel.readParcelable(g.class.getClassLoader()), parcel.readString(), d.CREATOR.createFromParcel(parcel), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i11) {
            return new g[i11];
        }
    }

    public static final class b implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f83906a;

        /* renamed from: b, reason: collision with root package name */
        private final String f83907b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f83908c;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(String str, String str2, Integer num) {
            this.f83906a = str;
            this.f83907b = str2;
            this.f83908c = num;
        }

        public final String a() {
            return this.f83907b;
        }

        public final Integer b() {
            return this.f83908c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getTitle() {
            return this.f83906a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83906a);
            dest.writeString(this.f83907b);
            Integer num = this.f83908c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c GOOGLE_PLAY_STORE;
        public static final c OTHER_STORE;

        static {
            c cVar = new c("GOOGLE_PLAY_STORE", 0);
            GOOGLE_PLAY_STORE = cVar;
            c cVar2 = new c("OTHER_STORE", 1);
            OTHER_STORE = cVar2;
            c[] cVarArr = {cVar, cVar2};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public static final class d implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f83909a;

        /* renamed from: b, reason: collision with root package name */
        private final b f83910b;

        /* renamed from: c, reason: collision with root package name */
        private final b f83911c;

        /* renamed from: d, reason: collision with root package name */
        private final b f83912d;

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new d(parcel.readString(), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        public d(@NotNull String appName, b bVar, b bVar2, b bVar3) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.f83909a = appName;
            this.f83910b = bVar;
            this.f83911c = bVar2;
            this.f83912d = bVar3;
        }

        @NotNull
        public final String a() {
            return this.f83909a;
        }

        public final b b() {
            return this.f83910b;
        }

        public final b c() {
            return this.f83911c;
        }

        public final b d() {
            return this.f83912d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83909a);
            b bVar = this.f83910b;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                bVar.writeToParcel(dest, i11);
            }
            b bVar2 = this.f83911c;
            if (bVar2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                bVar2.writeToParcel(dest, i11);
            }
            b bVar3 = this.f83912d;
            if (bVar3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                bVar3.writeToParcel(dest, i11);
            }
        }
    }

    public g(@NotNull e screenType, @NotNull String apkName, @NotNull d uiData, @NotNull c storeType) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        Intrinsics.checkNotNullParameter(storeType, "storeType");
        this.f83902a = screenType;
        this.f83903b = apkName;
        this.f83904c = uiData;
        this.f83905d = storeType;
    }

    public static g a(g gVar, e.c screenType) {
        String apkName = gVar.f83903b;
        d uiData = gVar.f83904c;
        c storeType = gVar.f83905d;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        Intrinsics.checkNotNullParameter(storeType, "storeType");
        return new g(screenType, apkName, uiData, storeType);
    }

    @NotNull
    public final String b() {
        return this.f83903b;
    }

    @NotNull
    public final e c() {
        return this.f83902a;
    }

    @NotNull
    public final c d() {
        return this.f83905d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final d e() {
        return this.f83904c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f83902a, gVar.f83902a) && Intrinsics.d(this.f83903b, gVar.f83903b) && Intrinsics.d(this.f83904c, gVar.f83904c) && this.f83905d == gVar.f83905d;
    }

    public final int hashCode() {
        return this.f83905d.hashCode() + ((this.f83904c.hashCode() + G.g.a(this.f83902a.hashCode() * 31, 31, this.f83903b)) * 31);
    }

    @NotNull
    public final String toString() {
        return "SdkConfig(screenType=" + this.f83902a + ", apkName=" + this.f83903b + ", uiData=" + this.f83904c + ", storeType=" + this.f83905d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83902a, i11);
        dest.writeString(this.f83903b);
        this.f83904c.writeToParcel(dest, i11);
        dest.writeString(this.f83905d.name());
    }
}

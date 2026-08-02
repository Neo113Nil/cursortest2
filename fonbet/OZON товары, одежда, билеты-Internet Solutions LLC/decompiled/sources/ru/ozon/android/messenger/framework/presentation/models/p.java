package ru.ozon.android.messenger.framework.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class p implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f91451a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91452b;

    /* renamed from: c, reason: collision with root package name */
    private final double f91453c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f91454d;

    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new p(parcel.readString(), parcel.readInt(), parcel.readDouble(), b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i11) {
            return new p[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b implements Parcelable {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<b> CREATOR;
        public static final b DEFAULT;
        public static final b FIRST;
        public static final b LAST;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        static {
            b bVar = new b("FIRST", 0);
            FIRST = bVar;
            b bVar2 = new b("LAST", 1);
            LAST = bVar2;
            b bVar3 = new b("DEFAULT", 2);
            DEFAULT = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
            CREATOR = new a();
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    public p(@NotNull String id2, int i11, double d11, @NotNull b insertPosition) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(insertPosition, "insertPosition");
        this.f91451a = id2;
        this.f91452b = i11;
        this.f91453c = d11;
        this.f91454d = insertPosition;
    }

    public int a() {
        return this.f91452b;
    }

    @NotNull
    public final b b() {
        return this.f91454d;
    }

    public double c() {
        return this.f91453c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(getId(), pVar.getId()) && c() == pVar.c() && a() == pVar.a() && this.f91454d == pVar.f91454d;
    }

    @NotNull
    public String getId() {
        return this.f91451a;
    }

    public int hashCode() {
        return this.f91454d.hashCode() + ((Integer.hashCode(a()) + ((Double.hashCode(c()) + ((getId().hashCode() + (super.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91451a);
        dest.writeInt(this.f91452b);
        dest.writeDouble(this.f91453c);
        this.f91454d.writeToParcel(dest, i11);
    }

    public /* synthetic */ p(String str, int i11) {
        this(str, 1, 0.0d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull String id2, int i11, double d11) {
        this(id2, i11, d11, b.DEFAULT);
        Intrinsics.checkNotNullParameter(id2, "id");
    }
}

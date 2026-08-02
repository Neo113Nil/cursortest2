package xi;

import B0.C2454a;
import Ci.C2779a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: xi.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10779a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C10779a> CREATOR = new C2282a();

    /* renamed from: a, reason: collision with root package name */
    private final int f105573a;

    /* renamed from: b, reason: collision with root package name */
    private final int f105574b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f105575c;

    /* renamed from: d, reason: collision with root package name */
    private final String f105576d;

    /* renamed from: e, reason: collision with root package name */
    private final Hi.a f105577e;

    /* renamed from: xi.a$a, reason: collision with other inner class name */
    public static final class C2282a implements Parcelable.Creator<C10779a> {
        @Override // android.os.Parcelable.Creator
        public final C10779a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C10779a(parcel.readInt(), parcel.readInt(), b.valueOf(parcel.readString()), parcel.readString(), (Hi.a) parcel.readParcelable(C10779a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final C10779a[] newArray(int i11) {
            return new C10779a[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: xi.a$b */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b PHOTO;
        public static final b PHOTO_AND_VIDEO;
        public static final b VIDEO;

        static {
            b bVar = new b("PHOTO", 0);
            PHOTO = bVar;
            b bVar2 = new b("VIDEO", 1);
            VIDEO = bVar2;
            b bVar3 = new b("PHOTO_AND_VIDEO", 2);
            PHOTO_AND_VIDEO = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
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
    }

    public C10779a(int i11, int i12, @NotNull b mode, String str, Hi.a aVar) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f105573a = i11;
        this.f105574b = i12;
        this.f105575c = mode;
        this.f105576d = str;
        this.f105577e = aVar;
    }

    public static C10779a a(C10779a c10779a, Hi.a aVar) {
        int i11 = c10779a.f105573a;
        int i12 = c10779a.f105574b;
        b mode = c10779a.f105575c;
        String str = c10779a.f105576d;
        c10779a.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new C10779a(i11, i12, mode, str, aVar);
    }

    public final String b() {
        return this.f105576d;
    }

    @NotNull
    public final b c() {
        return this.f105575c;
    }

    public final Hi.a d() {
        return this.f105577e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f105574b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10779a)) {
            return false;
        }
        C10779a c10779a = (C10779a) obj;
        return this.f105573a == c10779a.f105573a && this.f105574b == c10779a.f105574b && this.f105575c == c10779a.f105575c && Intrinsics.d(this.f105576d, c10779a.f105576d) && Intrinsics.d(this.f105577e, c10779a.f105577e);
    }

    public final int f() {
        return this.f105573a;
    }

    public final int hashCode() {
        int hashCode = (this.f105575c.hashCode() + C2454a.a(this.f105574b, Integer.hashCode(this.f105573a) * 31, 31)) * 31;
        String str = this.f105576d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Hi.a aVar = this.f105577e;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "OzonCameraConfig(themeId=" + this.f105573a + ", resultCode=" + this.f105574b + ", mode=" + this.f105575c + ", dirName=" + this.f105576d + ", restorableState=" + this.f105577e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f105573a);
        dest.writeInt(this.f105574b);
        dest.writeString(this.f105575c.name());
        dest.writeString(this.f105576d);
        dest.writeParcelable(this.f105577e, i11);
    }

    public /* synthetic */ C10779a(b bVar) {
        this(R.style.OzonGalleryTheme, -1, bVar, C2779a.c(), null);
    }
}

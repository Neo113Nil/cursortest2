package g;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6589a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C6589a> CREATOR = new C1030a();

    /* renamed from: a, reason: collision with root package name */
    private final int f63651a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f63652b;

    /* renamed from: g.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C1030a implements Parcelable.Creator<C6589a> {
        C1030a() {
        }

        @Override // android.os.Parcelable.Creator
        public final C6589a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C6589a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final C6589a[] newArray(int i11) {
            return new C6589a[i11];
        }
    }

    /* renamed from: g.a$b */
    /* loaded from: classes8.dex */
    public static final class b {
        @NotNull
        public static String a(int i11) {
            return i11 != -1 ? i11 != 0 ? String.valueOf(i11) : "RESULT_CANCELED" : "RESULT_OK";
        }
    }

    public C6589a(int i11, Intent intent) {
        this.f63651a = i11;
        this.f63652b = intent;
    }

    public final Intent a() {
        return this.f63652b;
    }

    public final int b() {
        return this.f63651a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String toString() {
        return "ActivityResult{resultCode=" + b.a(this.f63651a) + ", data=" + this.f63652b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f63651a);
        Intent intent = this.f63652b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i11);
        }
    }
}

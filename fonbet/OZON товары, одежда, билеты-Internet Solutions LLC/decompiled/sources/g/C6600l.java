package g;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: g.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6600l implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C6600l> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IntentSender f63675a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f63676b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63677c;

    /* renamed from: d, reason: collision with root package name */
    private final int f63678d;

    /* renamed from: g.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final IntentSender f63679a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f63680b;

        /* renamed from: c, reason: collision with root package name */
        private int f63681c;

        /* renamed from: d, reason: collision with root package name */
        private int f63682d;

        public a(@NotNull IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f63679a = intentSender;
        }

        @NotNull
        public final C6600l a() {
            return new C6600l(this.f63679a, this.f63680b, this.f63681c, this.f63682d);
        }

        @NotNull
        public final void b(Intent intent) {
            this.f63680b = intent;
        }

        @NotNull
        public final void c(int i11, int i12) {
            this.f63682d = i11;
            this.f63681c = i12;
        }
    }

    /* renamed from: g.l$b */
    public static final class b implements Parcelable.Creator<C6600l> {
        @Override // android.os.Parcelable.Creator
        public final C6600l createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "inParcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            Intrinsics.f(readParcelable);
            return new C6600l((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C6600l[] newArray(int i11) {
            return new C6600l[i11];
        }
    }

    public C6600l(@NotNull IntentSender intentSender, Intent intent, int i11, int i12) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f63675a = intentSender;
        this.f63676b = intent;
        this.f63677c = i11;
        this.f63678d = i12;
    }

    public final Intent a() {
        return this.f63676b;
    }

    public final int b() {
        return this.f63677c;
    }

    public final int c() {
        return this.f63678d;
    }

    @NotNull
    public final IntentSender d() {
        return this.f63675a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63675a, i11);
        dest.writeParcelable(this.f63676b, i11);
        dest.writeInt(this.f63677c);
        dest.writeInt(this.f63678d);
    }
}

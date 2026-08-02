package z6;

import B90.C2618u;
import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10992a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C10992a> CREATOR = new C2324a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f107264a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f107265b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f107266c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f107267d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f107268e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<String> f107269f;

    /* renamed from: z6.a$a, reason: collision with other inner class name */
    public static final class C2324a implements Parcelable.Creator<C10992a> {
        @Override // android.os.Parcelable.Creator
        public final C10992a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C10992a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final C10992a[] newArray(int i11) {
            return new C10992a[i11];
        }
    }

    public C10992a(@NotNull String clientId, @NotNull String clientSecret, @NotNull String time, @NotNull String state, @NotNull String redirectUrl, @NotNull List<String> scopes) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f107264a = clientId;
        this.f107265b = clientSecret;
        this.f107266c = time;
        this.f107267d = state;
        this.f107268e = redirectUrl;
        this.f107269f = scopes;
    }

    public static C10992a a(C10992a c10992a, List scopes) {
        String clientId = c10992a.f107264a;
        String clientSecret = c10992a.f107265b;
        String time = c10992a.f107266c;
        String state = c10992a.f107267d;
        String redirectUrl = c10992a.f107268e;
        c10992a.getClass();
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        return new C10992a(clientId, clientSecret, time, state, redirectUrl, scopes);
    }

    @NotNull
    public final String b() {
        return this.f107264a;
    }

    @NotNull
    public final String c() {
        return this.f107265b;
    }

    @NotNull
    public final String d() {
        return this.f107268e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final List<String> e() {
        return this.f107269f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10992a)) {
            return false;
        }
        C10992a c10992a = (C10992a) obj;
        return Intrinsics.d(this.f107264a, c10992a.f107264a) && Intrinsics.d(this.f107265b, c10992a.f107265b) && Intrinsics.d(this.f107266c, c10992a.f107266c) && Intrinsics.d(this.f107267d, c10992a.f107267d) && Intrinsics.d(this.f107268e, c10992a.f107268e) && Intrinsics.d(this.f107269f, c10992a.f107269f);
    }

    @NotNull
    public final String f() {
        return this.f107267d;
    }

    @NotNull
    public final String g() {
        return this.f107266c;
    }

    public final int hashCode() {
        return this.f107269f.hashCode() + g.a(g.a(g.a(g.a(this.f107264a.hashCode() * 31, 31, this.f107265b), 31, this.f107266c), 31, this.f107267d), 31, this.f107268e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientSessionInfo(clientId=");
        sb2.append(this.f107264a);
        sb2.append(", clientSecret=");
        sb2.append(this.f107265b);
        sb2.append(", time=");
        sb2.append(this.f107266c);
        sb2.append(", state=");
        sb2.append(this.f107267d);
        sb2.append(", redirectUrl=");
        sb2.append(this.f107268e);
        sb2.append(", scopes=");
        return C2618u.h(sb2, this.f107269f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f107264a);
        out.writeString(this.f107265b);
        out.writeString(this.f107266c);
        out.writeString(this.f107267d);
        out.writeString(this.f107268e);
        out.writeStringList(this.f107269f);
    }
}

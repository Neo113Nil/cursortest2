package kb;

import com.google.firebase.auth.AuthCredential;

/* loaded from: classes3.dex */
public final class r extends C5226k {

    /* renamed from: b, reason: collision with root package name */
    public AuthCredential f54410b;

    /* renamed from: c, reason: collision with root package name */
    public String f54411c;

    public r(String str, String str2) {
        super(str, str2);
    }

    public final AuthCredential b() {
        return this.f54410b;
    }

    public final r c(AuthCredential authCredential) {
        this.f54410b = authCredential;
        return this;
    }

    public final r d(String str) {
        this.f54411c = str;
        return this;
    }
}

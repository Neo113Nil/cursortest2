package io.sentry;

/* loaded from: classes.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f66603a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f66604b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f66605c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f66606d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f66607e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66608f = true;

    /* loaded from: classes10.dex */
    public interface a {
    }

    public final boolean a() {
        return this.f66605c;
    }

    public final boolean b() {
        return this.f66603a;
    }

    public final boolean c() {
        return this.f66608f;
    }

    public final boolean d() {
        return this.f66606d;
    }

    public final boolean e() {
        return this.f66604b;
    }

    public final boolean f() {
        return this.f66607e;
    }

    public final void g(boolean z11) {
        this.f66605c = z11;
    }

    public final void h(boolean z11) {
        this.f66603a = z11;
    }

    public final void i(boolean z11) {
        this.f66608f = z11;
    }

    public final void j(boolean z11) {
        this.f66606d = z11;
    }

    public final void k(boolean z11) {
        this.f66604b = z11;
    }

    public final void l(boolean z11) {
        this.f66607e = z11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SentryFeedbackOptions{isNameRequired=");
        sb2.append(this.f66603a);
        sb2.append(", showName=");
        sb2.append(this.f66604b);
        sb2.append(", isEmailRequired=");
        sb2.append(this.f66605c);
        sb2.append(", showEmail=");
        sb2.append(this.f66606d);
        sb2.append(", useSentryUser=");
        sb2.append(this.f66607e);
        sb2.append(", showBranding=");
        return Pk0.a.a(", formTitle='Report a Bug', submitButtonLabel='Send Bug Report', cancelButtonLabel='Cancel', nameLabel='Name', namePlaceholder='Your Name', emailLabel='Email', emailPlaceholder='your.email@example.org', isRequiredLabel=' (Required)', messageLabel='Description', messagePlaceholder='What's the bug? What did you expect?'}", sb2, this.f66608f);
    }
}

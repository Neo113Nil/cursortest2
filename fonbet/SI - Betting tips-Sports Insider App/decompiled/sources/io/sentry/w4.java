package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17231a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17232b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17233c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17234d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17235e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17236f;

    public final boolean a() {
        return this.f17233c;
    }

    public final boolean b() {
        return this.f17231a;
    }

    public final boolean c() {
        return this.f17236f;
    }

    public final boolean d() {
        return this.f17234d;
    }

    public final boolean e() {
        return this.f17232b;
    }

    public final boolean f() {
        return this.f17235e;
    }

    public final void g(boolean z5) {
        this.f17233c = z5;
    }

    public final void h(boolean z5) {
        this.f17231a = z5;
    }

    public final void i(boolean z5) {
        this.f17236f = z5;
    }

    public final void j(boolean z5) {
        this.f17234d = z5;
    }

    public final void k(boolean z5) {
        this.f17232b = z5;
    }

    public final void l(boolean z5) {
        this.f17235e = z5;
    }

    public final String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.f17231a + ", showName=" + this.f17232b + ", isEmailRequired=" + this.f17233c + ", showEmail=" + this.f17234d + ", useSentryUser=" + this.f17235e + ", showBranding=" + this.f17236f + ", formTitle='Report a Bug', submitButtonLabel='Send Bug Report', cancelButtonLabel='Cancel', nameLabel='Name', namePlaceholder='Your Name', emailLabel='Email', emailPlaceholder='your.email@example.org', isRequiredLabel=' (Required)', messageLabel='Description', messagePlaceholder='What's the bug? What did you expect?'}";
    }
}

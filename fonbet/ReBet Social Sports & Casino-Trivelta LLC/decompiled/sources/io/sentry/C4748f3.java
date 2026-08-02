package io.sentry;

/* renamed from: io.sentry.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4748f3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f52051a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52052b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52053c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52054d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52055e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52056f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52057g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f52058h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f52059i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f52060j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f52061k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f52062l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f52063m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f52064n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f52065o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f52066p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f52067q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f52068r;

    /* renamed from: s, reason: collision with root package name */
    public Runnable f52069s;

    /* renamed from: t, reason: collision with root package name */
    public Runnable f52070t;

    /* renamed from: u, reason: collision with root package name */
    public a f52071u;

    /* renamed from: io.sentry.f3$a */
    public interface a {
    }

    /* renamed from: io.sentry.f3$b */
    public interface b {
        void a(C4748f3 c4748f3);
    }

    /* renamed from: io.sentry.f3$c */
    public interface c {
    }

    public C4748f3(a aVar) {
        this.f52051a = false;
        this.f52052b = true;
        this.f52053c = false;
        this.f52054d = true;
        this.f52055e = true;
        this.f52056f = true;
        this.f52057g = false;
        this.f52058h = "Report a Bug";
        this.f52059i = "Send Bug Report";
        this.f52060j = "Cancel";
        this.f52061k = "Name";
        this.f52062l = "Your Name";
        this.f52063m = "Email";
        this.f52064n = "your.email@example.org";
        this.f52065o = " (Required)";
        this.f52066p = "Description";
        this.f52067q = "What's the bug? What did you expect?";
        this.f52068r = "Thank you for your report!";
        this.f52071u = aVar;
    }

    public void A(boolean z10) {
        this.f52056f = z10;
    }

    public void B(boolean z10) {
        this.f52054d = z10;
    }

    public void C(boolean z10) {
        this.f52052b = z10;
    }

    public void D(boolean z10) {
        this.f52055e = z10;
    }

    public void E(boolean z10) {
        this.f52057g = z10;
    }

    public CharSequence a() {
        return this.f52060j;
    }

    public CharSequence b() {
        return this.f52063m;
    }

    public CharSequence c() {
        return this.f52064n;
    }

    public CharSequence d() {
        return this.f52058h;
    }

    public CharSequence e() {
        return this.f52065o;
    }

    public CharSequence f() {
        return this.f52066p;
    }

    public CharSequence g() {
        return this.f52067q;
    }

    public CharSequence h() {
        return this.f52061k;
    }

    public CharSequence i() {
        return this.f52062l;
    }

    public Runnable j() {
        return this.f52070t;
    }

    public Runnable k() {
        return this.f52069s;
    }

    public c l() {
        return null;
    }

    public c m() {
        return null;
    }

    public CharSequence n() {
        return this.f52059i;
    }

    public CharSequence o() {
        return this.f52068r;
    }

    public boolean p() {
        return this.f52053c;
    }

    public boolean q() {
        return this.f52051a;
    }

    public boolean r() {
        return this.f52056f;
    }

    public boolean s() {
        return this.f52054d;
    }

    public boolean t() {
        return this.f52052b;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.f52051a + ", showName=" + this.f52052b + ", isEmailRequired=" + this.f52053c + ", showEmail=" + this.f52054d + ", useSentryUser=" + this.f52055e + ", showBranding=" + this.f52056f + ", useShakeGesture=" + this.f52057g + ", formTitle='" + ((Object) this.f52058h) + "', submitButtonLabel='" + ((Object) this.f52059i) + "', cancelButtonLabel='" + ((Object) this.f52060j) + "', nameLabel='" + ((Object) this.f52061k) + "', namePlaceholder='" + ((Object) this.f52062l) + "', emailLabel='" + ((Object) this.f52063m) + "', emailPlaceholder='" + ((Object) this.f52064n) + "', isRequiredLabel='" + ((Object) this.f52065o) + "', messageLabel='" + ((Object) this.f52066p) + "', messagePlaceholder='" + ((Object) this.f52067q) + "'}";
    }

    public boolean u() {
        return this.f52055e;
    }

    public boolean v() {
        return this.f52057g;
    }

    public void w(boolean z10) {
        this.f52053c = z10;
    }

    public void x(a aVar) {
        this.f52071u = aVar;
    }

    public void y(boolean z10) {
        this.f52051a = z10;
    }

    public void z(Runnable runnable) {
        this.f52070t = runnable;
    }

    public C4748f3(C4748f3 c4748f3) {
        this.f52051a = false;
        this.f52052b = true;
        this.f52053c = false;
        this.f52054d = true;
        this.f52055e = true;
        this.f52056f = true;
        this.f52057g = false;
        this.f52058h = "Report a Bug";
        this.f52059i = "Send Bug Report";
        this.f52060j = "Cancel";
        this.f52061k = "Name";
        this.f52062l = "Your Name";
        this.f52063m = "Email";
        this.f52064n = "your.email@example.org";
        this.f52065o = " (Required)";
        this.f52066p = "Description";
        this.f52067q = "What's the bug? What did you expect?";
        this.f52068r = "Thank you for your report!";
        this.f52051a = c4748f3.f52051a;
        this.f52052b = c4748f3.f52052b;
        this.f52053c = c4748f3.f52053c;
        this.f52054d = c4748f3.f52054d;
        this.f52055e = c4748f3.f52055e;
        this.f52056f = c4748f3.f52056f;
        this.f52057g = c4748f3.f52057g;
        this.f52058h = c4748f3.f52058h;
        this.f52059i = c4748f3.f52059i;
        this.f52060j = c4748f3.f52060j;
        this.f52061k = c4748f3.f52061k;
        this.f52062l = c4748f3.f52062l;
        this.f52063m = c4748f3.f52063m;
        this.f52064n = c4748f3.f52064n;
        this.f52065o = c4748f3.f52065o;
        this.f52066p = c4748f3.f52066p;
        this.f52067q = c4748f3.f52067q;
        this.f52068r = c4748f3.f52068r;
        this.f52069s = c4748f3.f52069s;
        this.f52070t = c4748f3.f52070t;
        this.f52071u = c4748f3.f52071u;
    }
}

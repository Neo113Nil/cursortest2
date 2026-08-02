package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15432a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.j0 f15433b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.firebase.messaging.i f15434c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15435d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15436e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15437f;

    public a(byte[] bArr) {
        this.f15432a = bArr;
        this.f15433b = null;
        this.f15434c = null;
        this.f15435d = "thread-dump.txt";
        this.f15436e = "text/plain";
        this.f15437f = "event.attachment";
    }

    public a(io.sentry.protocol.j0 j0Var) {
        this.f15432a = null;
        this.f15433b = j0Var;
        this.f15434c = null;
        this.f15435d = "view-hierarchy.json";
        this.f15436e = "application/json";
        this.f15437f = "event.view_hierarchy";
    }

    public a(com.google.firebase.messaging.i iVar) {
        this.f15432a = null;
        this.f15433b = null;
        this.f15434c = iVar;
        this.f15435d = "screenshot.png";
        this.f15436e = "image/png";
        this.f15437f = "event.attachment";
    }
}

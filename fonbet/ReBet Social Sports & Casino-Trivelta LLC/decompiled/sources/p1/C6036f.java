package p1;

/* renamed from: p1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6036f {

    /* renamed from: a, reason: collision with root package name */
    public final String f62929a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62930b;

    /* renamed from: c, reason: collision with root package name */
    public final long f62931c;
    public final S1.a[] events;
    public final long[] presentationTimesUs;

    public C6036f(String str, String str2, long j10, long[] jArr, S1.a[] aVarArr) {
        this.f62929a = str;
        this.f62930b = str2;
        this.f62931c = j10;
        this.presentationTimesUs = jArr;
        this.events = aVarArr;
    }

    public String a() {
        return this.f62929a + "/" + this.f62930b;
    }
}

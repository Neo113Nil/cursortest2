package wg;

/* renamed from: wg.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6751f extends Throwable {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public int f67722a;

    /* renamed from: b, reason: collision with root package name */
    public String f67723b;

    public C6751f(int i10, String str) {
        this.f67722a = i10;
        this.f67723b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f67723b;
    }
}

package H7;

import java.util.Map;

/* loaded from: classes2.dex */
public class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final int f4863a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4864b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4865c;

    /* renamed from: d, reason: collision with root package name */
    public final p f4866d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f4867e;

    public n(int i10, int i11, int i12, p pVar, Map map) {
        this.f4863a = i10;
        this.f4864b = i11;
        this.f4865c = i12;
        this.f4866d = pVar;
        this.f4867e = map;
    }

    @Override // H7.l, n7.InterfaceC5672a
    public Map getExtras() {
        return this.f4867e;
    }

    @Override // H7.m
    public int getHeight() {
        return this.f4864b;
    }

    @Override // H7.m
    public int getWidth() {
        return this.f4863a;
    }
}

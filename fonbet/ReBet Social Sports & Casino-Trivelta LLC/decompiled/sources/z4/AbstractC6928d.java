package z4;

import java.io.File;
import z4.InterfaceC6925a;

/* renamed from: z4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6928d implements InterfaceC6925a.InterfaceC0980a {

    /* renamed from: a, reason: collision with root package name */
    public final long f68568a;

    /* renamed from: b, reason: collision with root package name */
    public final a f68569b;

    /* renamed from: z4.d$a */
    public interface a {
        File a();
    }

    public AbstractC6928d(a aVar, long j10) {
        this.f68568a = j10;
        this.f68569b = aVar;
    }

    @Override // z4.InterfaceC6925a.InterfaceC0980a
    public InterfaceC6925a build() {
        File a10 = this.f68569b.a();
        if (a10 == null) {
            return null;
        }
        if (a10.isDirectory() || a10.mkdirs()) {
            return C6929e.c(a10, this.f68568a);
        }
        return null;
    }
}

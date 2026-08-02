package gZ;

import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import bZ.C5612f;
import bZ.C5613g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.cdn.chooser.internal.data.dto.CdnConfigResponse;

/* renamed from: gZ.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6699g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5612f f64188a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6696d f64189b;

    /* renamed from: c, reason: collision with root package name */
    private long f64190c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AtomicBoolean f64191d;

    public C6699g(@NotNull C5612f repository, @NotNull C6696d cachedConfigInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(cachedConfigInteractor, "cachedConfigInteractor");
        this.f64188a = repository;
        this.f64189b = cachedConfigInteractor;
        this.f64191d = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x0026, B:12:0x0061, B:14:0x0067, B:15:0x0075, B:17:0x0079), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x0026, B:12:0x0061, B:14:0x0067, B:15:0x0075, B:17:0x0079), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6698f c6698f;
        int i11;
        C6699g c6699g;
        Object b11;
        if (cVar instanceof C6698f) {
            c6698f = (C6698f) cVar;
            int i12 = c6698f.f64187g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6698f.f64187g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6698f.f64185e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6698f.f64187g;
                if (i11 != 0) {
                    s.b(obj);
                    if (!this.f64191d.compareAndSet(false, true)) {
                        r.Companion companion = r.INSTANCE;
                        return s.a(new IllegalStateException("CDN config request already in progress"));
                    }
                    try {
                        C5612f c5612f = this.f64188a;
                        c6698f.f64184d = this;
                        c6698f.f64187g = 1;
                        b11 = c5612f.b(c6698f);
                        if (b11 == aVar) {
                            return aVar;
                        }
                        c6699g = this;
                    } catch (Throwable th2) {
                        th = th2;
                        c6699g = this;
                        c6699g.f64191d.set(false);
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6699g = c6698f.f64184d;
                    try {
                        s.b(obj);
                        b11 = ((r) obj).getF26106a();
                    } catch (Throwable th3) {
                        th = th3;
                        c6699g.f64191d.set(false);
                        throw th;
                    }
                }
                r.Companion companion2 = r.INSTANCE;
                if (!(b11 instanceof r.b)) {
                    c6699g.f64190c = System.currentTimeMillis();
                    c6699g.f64189b.d((CdnConfigResponse) b11);
                }
                if (!(b11 instanceof r.b)) {
                    b11 = C5613g.a((CdnConfigResponse) b11);
                }
                c6699g.f64191d.set(false);
                return b11;
            }
        }
        c6698f = new C6698f(this, cVar);
        Object obj2 = c6698f.f64185e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6698f.f64187g;
        if (i11 != 0) {
        }
        r.Companion companion22 = r.INSTANCE;
        if (!(b11 instanceof r.b)) {
        }
        if (!(b11 instanceof r.b)) {
        }
        c6699g.f64191d.set(false);
        return b11;
    }

    public final long b() {
        return (System.currentTimeMillis() - this.f64190c) / 1000;
    }
}

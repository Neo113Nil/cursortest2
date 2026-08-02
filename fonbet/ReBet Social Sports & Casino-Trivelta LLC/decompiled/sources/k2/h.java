package k2;

import e1.Z;
import e2.InterfaceC4169k;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements InterfaceC4169k {

    /* renamed from: a, reason: collision with root package name */
    public final C5148c f54197a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f54198b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f54199c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f54200d;
    private final long[] eventTimesUs;

    public h(C5148c c5148c, Map map, Map map2, Map map3) {
        this.f54197a = c5148c;
        this.f54199c = map2;
        this.f54200d = map3;
        this.f54198b = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.eventTimesUs = c5148c.j();
    }

    @Override // e2.InterfaceC4169k
    public int a(long j10) {
        int d10 = Z.d(this.eventTimesUs, j10, false, false);
        if (d10 < this.eventTimesUs.length) {
            return d10;
        }
        return -1;
    }

    @Override // e2.InterfaceC4169k
    public List b(long j10) {
        return this.f54197a.h(j10, this.f54198b, this.f54199c, this.f54200d);
    }

    @Override // e2.InterfaceC4169k
    public long c(int i10) {
        return this.eventTimesUs[i10];
    }

    @Override // e2.InterfaceC4169k
    public int d() {
        return this.eventTimesUs.length;
    }
}

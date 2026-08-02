package k4;

import com.google.common.collect.AbstractC5880y;
import java.util.List;
import l3.C7855a;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5880y<C7855a> f70451a;

    /* renamed from: b, reason: collision with root package name */
    public final long f70452b;

    /* renamed from: c, reason: collision with root package name */
    public final long f70453c;

    /* renamed from: d, reason: collision with root package name */
    public final long f70454d;

    public c(List<C7855a> list, long j11, long j12) {
        this.f70451a = AbstractC5880y.n(list);
        this.f70452b = j11;
        this.f70453c = j12;
        long j13 = -9223372036854775807L;
        if (j11 != -9223372036854775807L && j12 != -9223372036854775807L) {
            j13 = j11 + j12;
        }
        this.f70454d = j13;
    }
}

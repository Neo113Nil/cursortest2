package e2;

import com.google.common.collect.AbstractC3445z;
import java.util.List;

/* renamed from: e2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4163e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3445z f45594a;

    /* renamed from: b, reason: collision with root package name */
    public final long f45595b;

    /* renamed from: c, reason: collision with root package name */
    public final long f45596c;

    /* renamed from: d, reason: collision with root package name */
    public final long f45597d;

    public C4163e(List list, long j10, long j11) {
        this.f45594a = AbstractC3445z.o(list);
        this.f45595b = j10;
        this.f45596c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f45597d = j12;
    }
}

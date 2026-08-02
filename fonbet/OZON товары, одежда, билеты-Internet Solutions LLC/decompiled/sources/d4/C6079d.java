package d4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.C8050C;
import m3.C8056I;

/* renamed from: d4.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6079d extends AbstractC6077b {

    /* renamed from: a, reason: collision with root package name */
    public final long f61134a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61135b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f61136c;

    /* renamed from: d4.d$a */
    public static final class a {
    }

    private C6079d(long j11, List list, long j12) {
        this.f61134a = j11;
        this.f61135b = j12;
        this.f61136c = Collections.unmodifiableList(list);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    static C6079d d(C8050C c8050c, long j11, C8056I c8056i) {
        long j12;
        List list;
        c8050c.G();
        boolean z11 = (c8050c.E() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
        ?? r72 = Collections.EMPTY_LIST;
        if (z11) {
            j12 = -9223372036854775807L;
            list = r72;
        } else {
            int E11 = c8050c.E();
            boolean z12 = (E11 & 64) != 0;
            boolean z13 = (E11 & 32) != 0;
            boolean z14 = (E11 & 16) != 0;
            long e11 = (!z12 || z14) ? -9223372036854775807L : C6082g.e(j11, c8050c);
            if (!z12) {
                int E12 = c8050c.E();
                r72 = new ArrayList(E12);
                for (int i11 = 0; i11 < E12; i11++) {
                    c8050c.E();
                    c8056i.b(!z14 ? C6082g.e(j11, c8050c) : -9223372036854775807L);
                    r72.add(new a());
                }
            }
            if (z13) {
                c8050c.E();
                c8050c.G();
            }
            c8050c.L();
            c8050c.E();
            c8050c.E();
            j12 = e11;
            list = r72;
        }
        return new C6079d(j12, list, c8056i.b(j12));
    }

    @Override // d4.AbstractC6077b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f61134a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return P4.f.a(this.f61135b, " }", sb2);
    }
}

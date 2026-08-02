package zendesk.talk.android.internal.call;

import Dj.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zendesk.talk.android.internal.call.a;

/* loaded from: classes5.dex */
public abstract class c {
    public static final a a(a aVar, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof a.d) {
            return new a.d(((a.d) aVar).a(), j10, z10);
        }
        if (aVar instanceof a.c) {
            return new a.c(((a.c) aVar).a(), j10, z10);
        }
        if (aVar instanceof a.AbstractC0988a.c) {
            return new a.AbstractC0988a.c(((a.AbstractC0988a.c) aVar).a(), j10, z10);
        }
        if (aVar instanceof a.AbstractC0988a.b) {
            return new a.AbstractC0988a.b(((a.AbstractC0988a.b) aVar).a(), j10, z10);
        }
        if (aVar instanceof a.AbstractC0988a.C0989a) {
            return new a.AbstractC0988a.C0989a(((a.AbstractC0988a.C0989a) aVar).a(), j10, z10);
        }
        if (aVar instanceof a.b.C0990a) {
            return new a.b.C0990a(((a.b.C0990a) aVar).a(), j10, z10);
        }
        if (aVar instanceof a.b.C0991b) {
            return new a.b.C0991b(((a.b.C0991b) aVar).a(), j10, z10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ a b(a aVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.c();
        }
        if ((i10 & 2) != 0) {
            z10 = aVar.b();
        }
        return a(aVar, j10, z10);
    }

    public static final int c(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof a.d) {
            return m.f2883h;
        }
        if (aVar instanceof a.c) {
            return m.f2884i;
        }
        if (aVar instanceof a.AbstractC0988a) {
            return m.f2881f;
        }
        if (aVar instanceof a.b) {
            return m.f2882g;
        }
        throw new NoWhenBranchMatchedException();
    }
}

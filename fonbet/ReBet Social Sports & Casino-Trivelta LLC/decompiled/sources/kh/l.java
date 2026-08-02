package kh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;

/* loaded from: classes3.dex */
public final class l extends n {

    /* renamed from: i, reason: collision with root package name */
    public static final a f54499i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final l f54500j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a() {
            return l.f54500j;
        }

        public a() {
        }
    }

    static {
        C5466a.e eVar = C5466a.f55859j;
        f54500j = new l(eVar.a(), 0L, eVar.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C5466a head, long j10, mh.f pool) {
        super(head, j10, pool);
        Intrinsics.checkNotNullParameter(head, "head");
        Intrinsics.checkNotNullParameter(pool, "pool");
        g2();
    }

    public String toString() {
        return "ByteReadPacket(" + f2() + " bytes remaining)";
    }

    @Override // kh.n
    public final C5466a y1() {
        return null;
    }

    @Override // kh.n
    public final void J() {
    }
}

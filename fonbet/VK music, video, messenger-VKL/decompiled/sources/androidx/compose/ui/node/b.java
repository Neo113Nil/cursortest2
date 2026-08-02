package androidx.compose.ui.node;

import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.mio;
import xsna.s3q0;

/* compiled from: BackwardsCompatNode.kt */
/* loaded from: classes11.dex */
public final class b {
    public static final C0015b a = C0015b.i;
    public static final c b = c.i;

    /* compiled from: BackwardsCompatNode.kt */
    public static final class a {
    }

    /* compiled from: BackwardsCompatNode.kt */
    /* renamed from: androidx.compose.ui.node.b$b, reason: collision with other inner class name */
    public static final class C0015b extends Lambda implements izs<androidx.compose.ui.node.a, s3q0> {
        public static final C0015b i = new C0015b(1);

        @Override // xsna.izs
        public final s3q0 invoke(androidx.compose.ui.node.a aVar) {
            androidx.compose.ui.node.a aVar2 = aVar;
            aVar2.q = true;
            mio.a(aVar2);
            return s3q0.a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    public static final class c extends Lambda implements izs<androidx.compose.ui.node.a, s3q0> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final s3q0 invoke(androidx.compose.ui.node.a aVar) {
            aVar.k2();
            return s3q0.a;
        }
    }
}

package O8;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public interface h {

    public static final class a {
        public static /* synthetic */ void a(h hVar, f fVar, String str, boolean z10, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: suggestions");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            hVar.a(fVar, str, z10, function2);
        }
    }

    void a(f fVar, String str, boolean z10, Function2 function2);
}

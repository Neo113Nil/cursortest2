package K8;

import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public interface c {

    public static final class a {
        public static /* synthetic */ Future a(c cVar, String str, int i10, int i11, K8.a aVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: channelsSearch");
            }
            if ((i12 & 2) != 0) {
                i10 = 25;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return cVar.a(str, i10, i11, aVar);
        }
    }

    Future a(String str, int i10, int i11, K8.a aVar);
}

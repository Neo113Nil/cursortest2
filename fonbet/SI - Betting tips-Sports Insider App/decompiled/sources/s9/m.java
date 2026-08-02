package s9;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile m f23354a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f23355b;

    static {
        m mVar = new m();
        Map map = Collections.EMPTY_MAP;
        f23355b = mVar;
    }

    public static m a() {
        m mVar;
        Class cls = c.f23286a;
        m mVar2 = f23354a;
        if (mVar2 != null) {
            return mVar2;
        }
        synchronized (m.class) {
            try {
                mVar = f23354a;
                if (mVar == null) {
                    Class cls2 = l.f23349a;
                    m mVar3 = null;
                    if (cls2 != null) {
                        try {
                            mVar3 = (m) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    mVar = mVar3 != null ? mVar3 : f23355b;
                    f23354a = mVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }
}

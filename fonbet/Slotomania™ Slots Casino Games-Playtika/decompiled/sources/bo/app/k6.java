package bo.app;

import android.util.Base64;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;

/* loaded from: classes6.dex */
public abstract class k6 implements t2 {
    private static final String d = BrazeLogger.getBrazeLogTag((Class<?>) k6.class);
    private final long a;
    private final long b;
    private x1 c;

    protected k6() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.b = nowInMilliseconds;
        this.a = nowInMilliseconds / 1000;
    }

    @Override // bo.app.t2
    public x1 a() {
        return this.c;
    }

    @Override // bo.app.t2
    public long b() {
        return this.a;
    }

    @Override // bo.app.t2
    public long e() {
        return this.b;
    }

    protected String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            BrazeLogger.e(d, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }

    protected k6(x1 x1Var) {
        this();
        this.c = x1Var;
    }
}

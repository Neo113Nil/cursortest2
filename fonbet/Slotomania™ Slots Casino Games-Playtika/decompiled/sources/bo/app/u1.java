package bo.app;

import com.braze.Constants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lbo/app/u1;", "", "Lbo/app/i2;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/i2;", "getHttpConnector$annotations", "()V", "httpConnector", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class u1 {
    public static final u1 a = new u1();
    private static final int b = (int) TimeUnit.SECONDS.toMillis(5);
    private static i2 c;

    private u1() {
    }

    public static final i2 a() {
        i2 i2Var = c;
        return i2Var == null ? new j3(new t1(b)) : i2Var;
    }
}

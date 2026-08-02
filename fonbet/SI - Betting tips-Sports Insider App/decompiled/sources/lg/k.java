package lg;

import java.util.concurrent.TimeUnit;
import jg.w;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20071a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f20072b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20073c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20074d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f20075e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f20076f;

    static {
        String str;
        int i5 = w.f18529a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f20071a = str;
        f20072b = jg.h.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, LongCompanionObject.MAX_VALUE);
        int i10 = w.f18529a;
        if (i10 < 2) {
            i10 = 2;
        }
        f20073c = jg.h.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f20074d = jg.h.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f20075e = TimeUnit.SECONDS.toNanos(jg.h.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, LongCompanionObject.MAX_VALUE));
        f20076f = g.f20066a;
    }
}

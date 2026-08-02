package xj;

import Ej.p;
import Ej.q;
import Sc.o;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements q {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105595a;

        static {
            int[] iArr = new int[p.b.values().length];
            try {
                iArr[p.b.ASSERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.b.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f105595a = iArr;
        }
    }

    @Override // Ej.q
    public final void a(@NotNull p.b priority, @NotNull String message, Throwable th2) {
        int i11;
        String str;
        Intrinsics.checkNotNullParameter("OzonLoggerInternal", "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        int i12 = a.f105595a[priority.ordinal()];
        if (i12 == 1) {
            i11 = 7;
        } else if (i12 != 2) {
            i11 = 3;
            if (i12 != 3) {
                throw new o();
            }
        } else {
            i11 = 6;
        }
        if (th2 == null || (str = Nk.a.b("\n", Log.getStackTraceString(th2))) == null) {
            str = "";
        }
        Log.println(i11, "OzonLoggerInternal", message + str);
    }
}

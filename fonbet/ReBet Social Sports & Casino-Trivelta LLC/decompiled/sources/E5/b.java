package E5;

import android.util.Log;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3006a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3007b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[E5.a.values().length];
            try {
                iArr[E5.a.f3001a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E5.a.f3002b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[E5.a.f3003c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[E5.a.f3004d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void h(b bVar, E5.a aVar, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        bVar.g(aVar, str, th2);
    }

    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(this, E5.a.f3001a, message, null, 4, null);
    }

    public void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(this, E5.a.f3004d, message, null, 4, null);
    }

    public void c(String message, Throwable t10) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(t10, "t");
        g(E5.a.f3004d, message, t10);
    }

    public final String d(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNull(className);
        return (String) CollectionsKt.first(StringsKt.split$default((CharSequence) CollectionsKt.last(StringsKt.split$default((CharSequence) className, new String[]{"."}, false, 0, 6, (Object) null)), new String[]{"$"}, false, 0, 6, (Object) null));
    }

    public final int e(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null) {
            if (stackTraceElementArr.length > 2) {
                String name = b.class.getName();
                int length = stackTraceElementArr.length;
                for (int i10 = 2; i10 < length; i10++) {
                    String className = stackTraceElementArr[i10].getClassName();
                    if (className == null) {
                        className = "";
                    }
                    if (!Intrinsics.areEqual(className, name)) {
                        return i10;
                    }
                }
            }
        }
        return 0;
    }

    public void f(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(this, E5.a.f3002b, message, null, 4, null);
    }

    public final void g(E5.a aVar, String str, Throwable th2) {
        int i10;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int e10 = e(stackTrace);
        if (e10 == 0) {
            return;
        }
        StackTraceElement stackTraceElement = stackTrace[e10];
        Intrinsics.checkNotNull(stackTraceElement);
        String d10 = d(stackTraceElement);
        String str2 = "[" + aVar + "] [" + d10 + " : " + stackTraceElement.getLineNumber() + "] " + str;
        String str3 = "[" + aVar + "] " + str;
        if (j() && (i10 = a.$EnumSwitchMapping$0[aVar.ordinal()]) != 1) {
            if (i10 == 2) {
                Log.i(d10, str3);
                return;
            }
            if (i10 == 3) {
                Log.w(d10, str3);
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (th2 != null) {
                    Log.e(d10, str2, th2);
                } else {
                    Log.e(d10, str3);
                }
            }
        }
    }

    public final void i(boolean z10) {
        f3007b = z10;
    }

    public final boolean j() {
        return f3007b;
    }

    public void k(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(this, E5.a.f3003c, message, null, 4, null);
    }
}

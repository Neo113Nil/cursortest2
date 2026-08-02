package pj;

import G.g;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* renamed from: pj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8938a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f81235a;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f81236b = Pattern.compile("(\\$\\d+)+$");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f81237c = 0;

    private static void a(int i11, Exception exc, String str) {
        int i12;
        if (f81235a) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            int i13 = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!Intrinsics.d(stackTraceElement.getClassName(), C8938a.class.getName())) {
                    String className = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                    String j02 = h.j0('.', className, className);
                    Matcher matcher = f81236b.matcher(j02);
                    if (matcher.find()) {
                        j02 = matcher.replaceAll("");
                    }
                    if (str == null || str.length() == 0) {
                        if (exc == null) {
                            return;
                        }
                        StringWriter stringWriter = new StringWriter(256);
                        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                        exc.printStackTrace(printWriter);
                        printWriter.flush();
                        String stringWriter2 = stringWriter.toString();
                        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
                        str = exc + "\n" + stringWriter2;
                    } else if (exc != null) {
                        StringWriter stringWriter3 = new StringWriter(256);
                        PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter3, false);
                        exc.printStackTrace(printWriter2);
                        printWriter2.flush();
                        String stringWriter4 = stringWriter3.toString();
                        Intrinsics.checkNotNullExpressionValue(stringWriter4, "toString(...)");
                        str = g.c(str, "\n", stringWriter4);
                    }
                    String c11 = g.c(j02, ": ", str);
                    if (c11.length() < 4000) {
                        if (i11 == 7) {
                            Log.wtf("OzonInAppUpdateSdk", c11);
                            return;
                        } else {
                            Log.println(i11, "OzonInAppUpdateSdk", c11);
                            return;
                        }
                    }
                    int length = c11.length();
                    while (i13 < length) {
                        int I11 = h.I('\n', i13, 4, c11);
                        if (I11 == -1) {
                            I11 = length;
                        }
                        while (true) {
                            i12 = i13 + 4000;
                            if (I11 <= i12) {
                                i12 = I11;
                            }
                            String substring = c11.substring(i13, i12);
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            if (i11 == 7) {
                                Log.wtf("OzonInAppUpdateSdk", substring);
                            } else {
                                Log.println(i11, "OzonInAppUpdateSdk", substring);
                            }
                            if (i12 >= I11) {
                                break;
                            } else {
                                i13 = i12;
                            }
                        }
                        i13 = i12 + 1;
                    }
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    public static void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        a(3, null, message);
    }

    public static void c(String str, Exception exc) {
        a(6, exc, str);
    }

    public static void d(boolean z11) {
        f81235a = z11;
    }
}

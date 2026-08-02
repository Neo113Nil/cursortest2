package xe;

import com.sports.insider.util.common.JavaScriptActionInterface;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void c(JavaScriptActionInterface javaScriptActionInterface, int i5, String language) {
        Intrinsics.checkNotNullParameter(language, "language");
    }

    public static int g(JavaScriptActionInterface javaScriptActionInterface) {
        return 123;
    }

    public static /* synthetic */ void o(JavaScriptActionInterface javaScriptActionInterface, int i5, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadPreview");
        }
        if ((i10 & 1) != 0) {
            i5 = -1;
        }
        if ((i10 & 2) != 0) {
            str = "en";
        }
        javaScriptActionInterface.loadPreview(i5, str);
    }

    public static void b(JavaScriptActionInterface javaScriptActionInterface) {
    }

    public static void f(JavaScriptActionInterface javaScriptActionInterface) {
    }

    public static void a(JavaScriptActionInterface javaScriptActionInterface, boolean z5) {
    }

    public static void d(JavaScriptActionInterface javaScriptActionInterface, String str) {
    }

    public static void e(JavaScriptActionInterface javaScriptActionInterface, String str, String str2) {
    }
}

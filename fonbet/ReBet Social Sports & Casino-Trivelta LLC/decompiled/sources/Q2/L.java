package Q2;

import R2.Y;
import android.content.Context;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9242a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public L a() {
            Y m10 = Y.m();
            if (m10 != null) {
                return m10;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }

        public L b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Y n10 = Y.n(context);
            Intrinsics.checkNotNullExpressionValue(n10, "getInstance(context)");
            return n10;
        }

        public void c(Context context, androidx.work.a configuration) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Y.j(context, configuration);
        }

        public a() {
        }
    }

    public static L g() {
        return f9242a.a();
    }

    public static L h(Context context) {
        return f9242a.b(context);
    }

    public static void j(Context context, androidx.work.a aVar) {
        f9242a.c(context, aVar);
    }

    public abstract x a(UUID uuid);

    public final x b(M request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return c(CollectionsKt.listOf(request));
    }

    public abstract x c(List list);

    public x d(String uniqueWorkName, EnumC1497h existingWorkPolicy, w request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return e(uniqueWorkName, existingWorkPolicy, CollectionsKt.listOf(request));
    }

    public abstract x e(String str, EnumC1497h enumC1497h, List list);

    public abstract androidx.work.a f();

    public abstract LiveData i(UUID uuid);
}

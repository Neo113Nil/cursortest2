package q8;

import android.content.Context;
import android.os.Process;
import e1.c;
import f1.j;
import f1.k;
import io.sentry.android.core.w0;
import java.util.LinkedHashSet;
import kotlin.collections.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f22060b;

    public /* synthetic */ a(b bVar, int i5) {
        this.f22059a = i5;
        this.f22060b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22059a) {
            case 0:
                c1.b ex = (c1.b) obj;
                Intrinsics.checkNotNullParameter(ex, "ex");
                w0.n(Reflection.getOrCreateKotlinClass(b.class).getSimpleName(), "CorruptionException in " + this.f22060b.f22062a + " DataStore running in process " + Process.myPid(), ex);
                return new g1.a(true);
            default:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "it");
                String sharedPreferencesName = this.f22060b.f22062a;
                LinkedHashSet keysToMigrate = k.f9316a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
                Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
                return t.c(new e1.b(context, sharedPreferencesName, c.f8466a, new ab.b(keysToMigrate, (Continuation) null, 7), new j(3, null)));
        }
    }
}

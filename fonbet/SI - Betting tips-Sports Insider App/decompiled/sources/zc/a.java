package zc;

import c4.w;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import eg.x;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import te.k0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f25907a = new w(x.f9236a, 2);

    public static void a(String str, Throwable ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (ex instanceof CancellationException) {
            return;
        }
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = m0.f9201a;
        c0.t(dVar, lg.d.f20063c, null, new k0(ex, str, null, 3), 2);
    }
}

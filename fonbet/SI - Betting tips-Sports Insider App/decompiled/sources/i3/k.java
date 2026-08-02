package i3;

import com.android.billingclient.api.m;
import e3.x;
import eg.c0;
import eg.t1;
import eg.w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m3.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10922a;

    static {
        String g10 = x.g("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f10922a = g10;
    }

    public static final t1 a(m mVar, o spec, w dispatcher, g listener) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return c0.t(c0.b(dispatcher), null, null, new androidx.lifecycle.o(mVar, spec, listener, (Continuation) null, 13), 3);
    }
}

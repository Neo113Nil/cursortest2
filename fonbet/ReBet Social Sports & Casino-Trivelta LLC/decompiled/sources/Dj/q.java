package Dj;

import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zendesk.core.Zendesk;

/* loaded from: classes5.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2898a = a.f2899a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f2899a = new a();

        public final q a(Zendesk zendesk2) {
            Intrinsics.checkNotNullParameter(zendesk2, "zendesk");
            if (zendesk2.isInitialized()) {
                return Ej.s.f3210e.a();
            }
            throw new IllegalStateException("Cannot use the TalkSDK without initialising. Call Zendesk.INSTANCE.init(...) before using Talk SDK");
        }
    }

    static q e(Zendesk zendesk2) {
        return f2898a.a(zendesk2);
    }

    Object a(String str, Continuation continuation);

    Object b(c cVar, Continuation continuation);

    void c(Context context, String str, Intent intent);

    boolean d();
}

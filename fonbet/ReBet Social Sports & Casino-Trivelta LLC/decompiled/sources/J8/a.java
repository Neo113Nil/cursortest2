package J8;

import com.giphy.sdk.core.network.response.MediaResponse;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5957a = new a();

    /* renamed from: J8.a$a, reason: collision with other inner class name */
    public static final class C0130a implements K8.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f5958a;

        public C0130a(Function2 function2) {
            this.f5958a = function2;
        }

        @Override // K8.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaResponse mediaResponse, Throwable th2) {
            this.f5958a.invoke(mediaResponse, th2);
        }
    }

    public final void a(String gifId, Function2 completionHandler) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        d.f5962a.d().m(gifId, new C0130a(completionHandler));
    }
}

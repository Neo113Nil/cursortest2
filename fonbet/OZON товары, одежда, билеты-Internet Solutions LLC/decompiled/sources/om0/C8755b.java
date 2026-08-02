package om0;

import Ve.C4444mf;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qm0.C9085a;
import rm0.C9316a;
import tm0.d;

/* renamed from: om0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8755b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9316a f78441a;

    /* renamed from: b, reason: collision with root package name */
    private final d f78442b;

    /* renamed from: om0.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f78443a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f78444b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Context f78445c;

        /* renamed from: d, reason: collision with root package name */
        private C4444mf f78446d;

        public a(@NotNull Context context, @NotNull String apiKey, @NotNull String url) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f78443a = apiKey;
            this.f78444b = url;
            this.f78445c = context;
        }

        @NotNull
        public final C8755b a() {
            C9085a c9085a = new C9085a(this.f78444b, this.f78443a);
            int i11 = vm0.a.f103025d;
            C4444mf c4444mf = this.f78446d;
            if (c4444mf != null) {
                return new C8755b(vm0.a.a(this.f78445c, c4444mf, c9085a), vm0.a.b());
            }
            throw new IllegalStateException("NetworkClientBuilder must be set");
        }

        @NotNull
        public final void b(@NotNull C4444mf networkClientBuilder) {
            Intrinsics.checkNotNullParameter(networkClientBuilder, "networkClientBuilder");
            this.f78446d = networkClientBuilder;
        }
    }

    public C8755b(C9316a c9316a, d dVar) {
        this.f78441a = c9316a;
        this.f78442b = dVar;
    }

    public final void a(@NotNull C8754a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f78441a.a(event);
    }

    public final void b(@NotNull String hashUserLoginId) {
        Intrinsics.checkNotNullParameter(hashUserLoginId, "hashUserLoginId");
        d dVar = this.f78442b;
        if (dVar != null) {
            dVar.c(hashUserLoginId);
        }
    }
}

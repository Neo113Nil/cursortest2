package kj;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8919b;
import pf0.h;
import pf0.i;
import pj.C8938a;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateApiV2;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateResponseDTO;

/* renamed from: kj.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7687c extends AbstractC7685a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f71659a;

    /* renamed from: b, reason: collision with root package name */
    private CheckUpdateApiV2 f71660b;

    /* renamed from: kj.c$a */
    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        private final C1183a f71661a = new C1183a();

        /* renamed from: kj.c$a$a, reason: collision with other inner class name */
        public static final class C1183a extends AbstractC8919b.c {

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC8919b.AbstractC1361b.d f71662a = AbstractC8919b.AbstractC1361b.d.f80506b;

            /* renamed from: b, reason: collision with root package name */
            private final String f71663b = "4.7.0";

            C1183a() {
            }

            @Override // pf0.AbstractC8919b.c
            public final AbstractC8919b.AbstractC1361b getName() {
                return this.f71662a;
            }

            @Override // pf0.AbstractC8919b.c
            public final String getVersion() {
                return this.f71663b;
            }
        }

        a() {
        }

        @Override // pf0.i
        public final AbstractC8919b getConsumer() {
            return this.f71661a;
        }
    }

    public C7687c(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        this.f71659a = diStore;
    }

    @Override // kj.AbstractC7685a
    protected final void b() {
        Retrofit build = ((h) this.f71659a.e(h.class)).j(new a()).newBuilder().addConverterFactory(MoshiConverterFactory.create(new Moshi(new Moshi.a()))).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.f71660b = (CheckUpdateApiV2) build.create(CheckUpdateApiV2.class);
    }

    @Override // kj.AbstractC7685a
    @NotNull
    public final Call<CheckUpdateResponseDTO> c() {
        CheckUpdateApiV2 checkUpdateApiV2 = this.f71660b;
        if (checkUpdateApiV2 != null) {
            return checkUpdateApiV2.checkUpdate();
        }
        int i11 = C8938a.f81237c;
        C8938a.b("CheckUpdateApiV2 is null. Make sure UpdateCheckerV2::createApi is called.");
        throw new IllegalStateException("CheckUpdateApiV2 is null");
    }
}

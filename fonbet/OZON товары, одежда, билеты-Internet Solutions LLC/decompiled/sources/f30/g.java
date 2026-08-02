package f30;

import d30.InterfaceC6070a;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.fintech.analytic.db.GraylogDatabase;
import ru.ozon.fintech.auth.network.AuthNetworkApiV2;

/* loaded from: classes3.dex */
public final class g implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62517a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f62518b;

    public /* synthetic */ g(Pc.a aVar, int i11) {
        this.f62517a = i11;
        this.f62518b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f62517a) {
            case 0:
                GraylogDatabase db2 = (GraylogDatabase) this.f62518b.get();
                Intrinsics.checkNotNullParameter(db2, "db");
                InterfaceC6070a a11 = db2.a();
                Jb.j.d(a11);
                return a11;
            case 1:
                Retrofit retrofit = (Retrofit) this.f62518b.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object create = retrofit.create(AuthNetworkApiV2.class);
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                AuthNetworkApiV2 authNetworkApiV2 = (AuthNetworkApiV2) create;
                Jb.j.d(authNetworkApiV2);
                return authNetworkApiV2;
            default:
                return new ru.ozon.android.messenger.framework.data.remote.parser.c((JsonParser) ((ru.ozon.android.messenger.framework.data.remote.serialize.d) this.f62518b).get());
        }
    }
}

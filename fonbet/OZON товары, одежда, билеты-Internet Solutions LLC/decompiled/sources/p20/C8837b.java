package p20;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q20.InterfaceC8978a;
import q20.InterfaceC8979b;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolLibsApi;

/* renamed from: p20.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8837b implements InterfaceC8978a, InterfaceC8979b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f80026a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Nd0.b f80027b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f80028c;

    /* renamed from: p20.b$a */
    static final class a extends AbstractC7737t implements Function0<AbToolLibsApi> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbToolLibsApi invoke() {
            return (AbToolLibsApi) C8837b.this.f80026a.d(AbToolBaseApi.class);
        }
    }

    public C8837b(@NotNull Ld0.c store, @NotNull Nd0.b buildType) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(buildType, "buildType");
        this.f80026a = store;
        this.f80027b = buildType;
        this.f80028c = k.b(new a());
    }

    @Override // q20.InterfaceC8978a
    @NotNull
    public final q20.c c() {
        if (C8839d.a() || this.f80027b == Nd0.b.DEBUG) {
            return q20.c.QA_BUILDS_OR_AUTOTEST;
        }
        AbToolLibsApi abToolLibsApi = (AbToolLibsApi) this.f80028c.getValue();
        return abToolLibsApi == null ? q20.c.PROD_BUILDS_ALL_USERS : abToolLibsApi.isOzonQa() ? q20.c.PROD_BUILDS_OZON_QA : abToolLibsApi.isOzonEmployee() ? q20.c.PROD_BUILDS_OZON_EMPLOYEE : q20.c.PROD_BUILDS_ALL_USERS;
    }

    @Override // Ld0.e
    public final void onInstantPluginsCreated() {
    }
}

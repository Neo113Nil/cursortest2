package c30;

import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Sc.C4005g;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.wallet.manager.domain.WalletManager;
import ta0.InterfaceC9791a;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f56447a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S30.a f56448b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final R30.a f56449c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f56450d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private String f56451e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f56452f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C0 f56453g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<List<Pair<String, String>>> f56454h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.base.providers.providers.DeviceIdsProvider$init$1", f = "DeviceIdsProvider.kt", l = {123}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56455d;

        /* renamed from: c30.b$a$a, reason: collision with other inner class name */
        static final class C0851a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f56457a;

            C0851a(b bVar) {
                this.f56457a = bVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                b bVar = this.f56457a;
                ArrayList W02 = C7714v.W0(bVar.g().getValue());
                W02.add((Pair) obj);
                bVar.g().setValue(W02);
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56455d;
            if (i11 == 0) {
                s.b(obj);
                b bVar = b.this;
                C0 c02 = bVar.f56453g;
                C0851a c0851a = new C0851a(bVar);
                this.f56455d = 1;
                if (c02.collect(c0851a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    public b(@NotNull Context context, @NotNull S30.a applicationInfoDataSource, @NotNull R30.a appCoroutineScopes, @NotNull WalletManager walletManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(walletManager, "walletManager");
        this.f56447a = context;
        this.f56448b = applicationInfoDataSource;
        this.f56449c = appCoroutineScopes;
        this.f56450d = k.a(n.PUBLICATION, new A50.a(walletManager, 1));
        this.f56451e = "";
        this.f56453g = E0.b(0, 5, null, 5);
        this.f56454h = O0.a(C7714v.a0(new Pair("a_build_fingerprint", Build.FINGERPRINT)));
    }

    public static final String c(b bVar) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter("com.google.android.providers.gsf.permission.READ_GSERVICES", "permission");
        Context context = bVar.f56447a;
        String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        String str = "";
        if (strArr != null) {
            for (String str2 : strArr) {
                if (Intrinsics.d(str2, "com.google.android.providers.gsf.permission.READ_GSERVICES")) {
                    try {
                        Cursor query = context.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, (String[]) C7714v.a0("android_id").toArray(new String[0]), null);
                        while (true) {
                            if (query == null) {
                                break;
                            }
                            try {
                                if (!query.moveToFirst()) {
                                    break;
                                }
                                if (Intrinsics.d(query.getString(0), "android_id")) {
                                    str = query.getString(1);
                                    break;
                                }
                            } finally {
                            }
                        }
                        Unit unit = Unit.f71690a;
                        Vd0.b.a(query, null);
                        return str;
                    } catch (Exception e11) {
                        L80.a.c("DeviceIdsProvider", "Error while get gms info", e11);
                        return str;
                    }
                }
            }
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final InterfaceC9791a e(b bVar) {
        return (InterfaceC9791a) bVar.f56450d.getValue();
    }

    public static final String f(b bVar) {
        return Settings.Secure.getString(bVar.f56447a.getContentResolver(), "android_id");
    }

    @NotNull
    public final x0<List<Pair<String, String>>> g() {
        return this.f56454h;
    }

    public final void h(@NotNull String bankId) {
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        if (this.f56452f) {
            return;
        }
        this.f56452f = true;
        R30.a aVar = this.f56449c;
        C10727i.c(aVar.b(), null, null, new c(this, null), 3);
        C10727i.c(aVar.b(), null, null, new d(this, null), 3);
        C10727i.c(aVar.b(), null, null, new e(this, null), 3);
        C10727i.c(aVar.b(), null, null, new g(this, null), 3);
        this.f56451e = bankId;
        C10727i.c(aVar.b(), null, null, new a(null), 3);
    }
}

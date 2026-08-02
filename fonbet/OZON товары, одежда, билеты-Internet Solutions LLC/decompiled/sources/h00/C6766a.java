package h00;

import Ld0.c;
import Ld0.f;
import Od0.e;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Intent;
import f00.InterfaceC6395a;
import i00.InterfaceC6980a;
import j00.C7234a;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import o00.C8624a;
import o00.C8625b;
import o00.InterfaceC8626c;
import org.jetbrains.annotations.NotNull;
import q00.C8970a;
import ru.ozon.composer.debug.menu.api.ui.ComposerDebugMenuActivity;
import s20.d;

/* renamed from: h00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6766a extends e<InterfaceC6395a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? extends InterfaceC6395a> f64583a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f64584b;

    /* renamed from: h00.a$a, reason: collision with other inner class name */
    public static final class C1047a extends s20.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f64585a;

        /* renamed from: h00.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C1048a extends d.a {

            /* renamed from: a, reason: collision with root package name */
            private final String f64586a = "COMPOSER_DEBUG_MENU_ID";

            /* renamed from: b, reason: collision with root package name */
            private final String f64587b = "Composer";

            /* renamed from: c, reason: collision with root package name */
            private final Function1<s20.c, Intent> f64588c;

            /* renamed from: h00.a$a$a$a, reason: collision with other inner class name */
            static final class C1049a extends AbstractC7737t implements Function1<s20.c, Intent> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f64589b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1049a(c cVar) {
                    super(1);
                    this.f64589b = cVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Intent invoke(s20.c cVar) {
                    s20.c request = cVar;
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intent intent = new Intent(this.f64589b.c().a(), (Class<?>) ComposerDebugMenuActivity.class);
                    intent.setData(request.a());
                    return intent;
                }
            }

            C1048a(c cVar) {
                this.f64588c = new C1049a(cVar);
            }

            @Override // s20.d.a
            public final String getId() {
                return this.f64586a;
            }

            @Override // s20.d.a
            public final Function1<s20.c, Intent> getIntent() {
                return this.f64588c;
            }

            @Override // s20.d.a
            public final String getName() {
                return this.f64587b;
            }
        }

        C1047a(c cVar) {
            this.f64585a = cVar;
        }

        @Override // s20.b
        public final d provide() {
            return new C1048a(this.f64585a);
        }
    }

    public C6766a() {
        InterfaceC6980a logger = w00.b.a();
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f64583a = InterfaceC6395a.class;
        this.f64584b = k.b(C6767b.f64590b);
        int i11 = w00.c.f103326b;
        w00.c.b(logger);
    }

    @Override // Od0.d
    public final Ld0.e create(c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        if (store.c().b() == Nd0.b.DEBUG) {
            int i11 = w00.c.f103326b;
            w00.c.b(w00.b.a());
        }
        InterfaceC8626c a11 = C8625b.a().a(store.c(), store);
        int i12 = C8624a.f77454b;
        C8624a.b(store.c().a(), a11);
        C7234a a12 = a11.a();
        a11.d().a();
        return a12;
    }

    @Override // Od0.d
    @NotNull
    public final List<f> createPluginProviderIntegration(@NotNull c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        return C7714v.a0(new C1047a(diStore));
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends InterfaceC6395a> getKey() {
        return this.f64583a;
    }

    @Override // Od0.e
    @NotNull
    public final e.a handleDeeplink(@NotNull c store, @NotNull e.b deeplink) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return ((C8970a) this.f64584b.getValue()).a(store, deeplink);
    }

    @Override // Od0.d
    public final boolean isLazyInitializationEnabled() {
        return false;
    }
}

package ob0;

import Hb0.f;
import Sc.InterfaceC4008j;
import We.L;
import dc0.C6144H;
import dc0.C6171q;
import id0.C7050a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.api.ErrorCode;
import wb0.C10469a;

/* loaded from: classes7.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6144H> f77906a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<B> f77907b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f77908c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f77909d;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f77910b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C10469a f77911c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E f77912d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ We.A f77913e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L l11, C10469a c10469a, E e11, We.A a11) {
            super(0);
            this.f77910b = l11;
            this.f77911c = c10469a;
            this.f77912d = e11;
            this.f77913e = a11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String c11;
            L l11 = this.f77910b;
            int m11 = l11.m();
            C10469a c10469a = this.f77911c;
            if ((c10469a == null || (c11 = c10469a.f()) == null) && (c11 = l11.r().c("x-o3-trace-id")) == null) {
                c11 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
            }
            String id2 = c11;
            E e11 = this.f77912d;
            String f7 = C6171q.f("__Secure-ETC", ((C6144H) e11.f77906a.getValue()).i());
            String a11 = this.f77913e.toString();
            String m02 = kotlin.text.h.m0(a11, "?");
            String i02 = kotlin.text.h.i0(a11, "?");
            B b11 = (B) e11.f77907b.getValue();
            b11.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            return B.n(b11, "tcresult", "error.tcresult", i02, f7, Integer.valueOf(m11), id2, m02, "error", null, 256);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(@NotNull InterfaceC4008j<C6144H> localCookieDataSource, @NotNull InterfaceC4008j<B> ozonIdTrackingManager, @NotNull InterfaceC4008j<C7050a> composerTrackingRepository, @NotNull InterfaceC4008j<? extends Hb0.c> featureFlagsStore) {
        Intrinsics.checkNotNullParameter(localCookieDataSource, "localCookieDataSource");
        Intrinsics.checkNotNullParameter(ozonIdTrackingManager, "ozonIdTrackingManager");
        Intrinsics.checkNotNullParameter(composerTrackingRepository, "composerTrackingRepository");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f77906a = localCookieDataSource;
        this.f77907b = ozonIdTrackingManager;
        this.f77908c = composerTrackingRepository;
        this.f77909d = featureFlagsStore;
    }

    public final void c(@NotNull L response, C10469a c10469a) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (((Boolean) this.f77909d.getValue().b(f.q.f10815a)).booleanValue()) {
            We.A j11 = response.L().j();
            if (j11.q().contains("__rr")) {
                this.f77908c.getValue().c(new a(response, c10469a, this, j11));
            }
        }
    }
}

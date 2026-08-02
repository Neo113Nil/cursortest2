package nm0;

import Sc.InterfaceC4008j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import vl0.C10327a;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final u f77415a;

    /* renamed from: b, reason: collision with root package name */
    public final C8610E f77416b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4008j f77417c;

    public static final class a extends AbstractC7737t implements Function0<Map<String, ? extends String>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            C.D d11 = p.this.f77416b.f77386a;
            String type = C10327a.C2235a.a().a().a();
            Intrinsics.checkNotNullParameter("ru.rustore.sdk:review", AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Intrinsics.checkNotNullParameter(type, "value");
            Intrinsics.checkNotNullParameter("6.1.0", AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Intrinsics.checkNotNullParameter("ru.rustore.sdk:review", AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter("6.1.0", "version");
            return U.j(new Pair("sdkName", "ru.rustore.sdk:review"), new Pair("sdkType", type), new Pair("sdkVersion", "6.1.0"));
        }
    }

    public p(u reviewAnalyticsRepository, C8610E sdkInfoRepository) {
        Intrinsics.checkNotNullParameter(reviewAnalyticsRepository, "reviewAnalyticsRepository");
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        this.f77415a = reviewAnalyticsRepository;
        this.f77416b = sdkInfoRepository;
        this.f77417c = Sc.k.b(new a());
    }
}

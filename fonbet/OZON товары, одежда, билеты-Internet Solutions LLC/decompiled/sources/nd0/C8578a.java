package nd0;

import Fb0.f;
import Sc.InterfaceC4008j;
import java.util.Map;
import jc0.AbstractC7345h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: nd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8578a extends AbstractC7345h {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f f77067d;

    /* renamed from: nd0.a$a, reason: collision with other inner class name */
    static final class C1298a extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f77069c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f77070d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f77071e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f77072f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f77073g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f77074h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f77075i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f77076j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f77077k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1298a(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
            super(1);
            this.f77069c = j11;
            this.f77070d = j12;
            this.f77071e = j13;
            this.f77072f = j14;
            this.f77073g = j15;
            this.f77074h = j16;
            this.f77075i = j17;
            this.f77076j = j18;
            this.f77077k = j19;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, Object> map) {
            Map<String, Object> addPayload = map;
            Intrinsics.checkNotNullParameter(addPayload, "$this$addPayload");
            addPayload.put("widgetName", C8578a.this.f77067d.getAppName().a());
            addPayload.put("custom_dimension1", String.valueOf(this.f77069c));
            addPayload.put("custom_dimension2", String.valueOf(this.f77070d));
            addPayload.put("custom_dimension3", String.valueOf(this.f77071e));
            addPayload.put("custom_dimension4", String.valueOf(this.f77072f));
            addPayload.put("custom_dimension5", String.valueOf(this.f77073g));
            addPayload.put("custom_dimension6", String.valueOf(this.f77074h));
            addPayload.put("custom_dimension7", String.valueOf(this.f77075i));
            addPayload.put("custom_dimension8", String.valueOf(this.f77076j));
            addPayload.put("custom_dimension10", String.valueOf(this.f77077k));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8578a(@NotNull f ozonIdConfig, @NotNull InterfaceC4008j moshi) {
        super(ozonIdConfig, moshi);
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        this.f77067d = ozonIdConfig;
    }

    @NotNull
    public final String f(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        return b(c("ozonid_init"), new C1298a(j11, j13, j14, j12, j15, j16, j17, j18, j19));
    }
}

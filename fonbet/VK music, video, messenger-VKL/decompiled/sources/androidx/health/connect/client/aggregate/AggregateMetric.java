package androidx.health.connect.client.aggregate;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.X3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.epx;
import xsna.g0t;
import xsna.izs;
import xsna.xzs;
import xsna.zrp;

/* compiled from: AggregateMetric.kt */
/* loaded from: classes12.dex */
public final class AggregateMetric<T> {
    public final b<?, T> a;
    public final String b;
    public final AggregationType c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregateMetric.kt */
    public static final class AggregationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AggregationType[] $VALUES;
        public static final AggregationType AVERAGE;
        public static final AggregationType COUNT;
        public static final AggregationType DURATION;
        public static final AggregationType MAXIMUM;
        public static final AggregationType MINIMUM;
        public static final AggregationType TOTAL;
        private final String aggregationTypeString;

        static {
            AggregationType aggregationType = new AggregationType("DURATION", 0, "duration");
            DURATION = aggregationType;
            AggregationType aggregationType2 = new AggregationType("AVERAGE", 1, "avg");
            AVERAGE = aggregationType2;
            AggregationType aggregationType3 = new AggregationType("MINIMUM", 2, UcumUtils.UCUM_MINUTES);
            MINIMUM = aggregationType3;
            AggregationType aggregationType4 = new AggregationType("MAXIMUM", 3, InneractiveMediationNameConsts.MAX);
            MAXIMUM = aggregationType4;
            AggregationType aggregationType5 = new AggregationType("TOTAL", 4, X3.i.l);
            TOTAL = aggregationType5;
            AggregationType aggregationType6 = new AggregationType("COUNT", 5, "count");
            COUNT = aggregationType6;
            AggregationType[] aggregationTypeArr = {aggregationType, aggregationType2, aggregationType3, aggregationType4, aggregationType5, aggregationType6};
            $VALUES = aggregationTypeArr;
            $ENTRIES = new asp(aggregationTypeArr);
        }

        public AggregationType(String str, int i, String str2) {
            this.aggregationTypeString = str2;
        }

        public static AggregationType valueOf(String str) {
            return (AggregationType) Enum.valueOf(AggregationType.class, str);
        }

        public static AggregationType[] values() {
            return (AggregationType[]) $VALUES.clone();
        }

        public final String h() {
            return this.aggregationTypeString;
        }
    }

    /* compiled from: AggregateMetric.kt */
    public static final class a {
        public static AggregateMetric a(AggregationType aggregationType, String str, izs izsVar) {
            return new AggregateMetric(new c(izsVar), "Nutrition", aggregationType, str);
        }
    }

    /* compiled from: AggregateMetric.kt */
    public interface b<T, R> extends izs<T, R> {

        /* compiled from: AggregateMetric.kt */
        public interface a<R> extends b<Double, R> {
        }

        /* compiled from: AggregateMetric.kt */
        /* renamed from: androidx.health.connect.client.aggregate.AggregateMetric$b$b, reason: collision with other inner class name */
        public interface InterfaceC0035b<R> extends b<Long, R> {
        }
    }

    /* compiled from: AggregateMetric.kt */
    public static final class c implements b.a, g0t {
        public final /* synthetic */ FunctionReferenceImpl b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(izs izsVar) {
            this.b = (FunctionReferenceImpl) izsVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof b.a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
        @Override // xsna.izs
        public final /* synthetic */ Object invoke(Object obj) {
            return this.b.invoke(Double.valueOf(((Number) obj).doubleValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AggregateMetric(b<?, ? extends T> bVar, String str, AggregationType aggregationType, String str2) {
        this.a = bVar;
        this.b = str;
        this.c = aggregationType;
        this.d = str2;
    }

    public final String a() {
        String h = this.c.h();
        String str = this.b;
        String str2 = this.d;
        if (str2 == null) {
            return str + '_' + h;
        }
        return str + '_' + str2 + '_' + h;
    }
}

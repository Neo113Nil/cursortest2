package ru.ozon.tracker.performance;

import Qj0.InterfaceC3892l;
import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bA\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bI¨\u0006J"}, d2 = {"Lru/ozon/tracker/performance/MetricType;", "LQj0/l;", "", "<init>", "(Ljava/lang/String;I)V", "", "isInterval", "Z", "()Z", "", "metricName$delegate", "LSc/j;", "getMetricName", "()Ljava/lang/String;", "metricName", "REQUEST_PREPARE_TIME_START", "REQUEST_PREPARE_TIME_END", "DECODING_TIME_START", "DECODING_TIME_END", "DNS_TIME_START", "DNS_TIME_END", "CREATION_TIME_START", "CREATION_TIME_END", "BIND_TIME_START", "BIND_TIME_END", "LAYOUT_TIME_START", "LAYOUT_TIME_END", "RESPONSE_TIME_START", "RESPONSE_TIME_END", "SERVER_TIME_START", "SERVER_TIME_END", "TCP_TIME_START", "TCP_TIME_END", "TIME_TO_FIRST_BYTE_START", "TIME_TO_FIRST_BYTE_END", "TIME_TO_LAST_BYTE_START", "TIME_TO_LAST_BYTE_END", "NETWORK_LB_REDIRECT_TIME_START", "NETWORK_LB_REDIRECT_TIME_END", "NETWORK_ANTIBOT_TIME_START", "NETWORK_ANTIBOT_TIME_END", "TLS_TIME_START", "TLS_TIME_END", "TOTAL_TIME_START", "TOTAL_TIME_END", "LOADER_TIME_START", "LOADER_TIME_END", "ADDITIONAL_REQUESTS_TIME_START", "ADDITIONAL_REQUESTS_TIME_END", "PREPARE_PRESENTATION_DATA_TIME_START", "PREPARE_PRESENTATION_DATA_TIME_END", "PRESENTATION_TIME", "ROUTING_TIME", "PREPARE_PAGE_TIME", "FETCH_TIME", "CACHE_TIME", "PREFETCH_TIME", "DECODED_SIZE", "ENCODED_SIZE", "REDIRECT_TIME", "PLACEHOLDER_TIME", "TRANSFER_SIZE", "X_NGENIX_CACHE", "HITCH_TIME", "SCROLL_TIME", "WIDGET_VIEWS", "ST_TOTAL", "ST_INTERNAL", "ST_WIDGETS", "ST_RESOLVE", "ST_COMPOSER_FB", "IMG_RESIZE_TIME", "EDGE_TIME", "PROTOCOL_VERSION", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class MetricType implements InterfaceC3892l {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ MetricType[] $VALUES;
    public static final MetricType CACHE_TIME;
    public static final MetricType DECODED_SIZE;
    public static final MetricType EDGE_TIME;
    public static final MetricType ENCODED_SIZE;
    public static final MetricType FETCH_TIME;
    public static final MetricType HITCH_TIME;
    public static final MetricType IMG_RESIZE_TIME;
    public static final MetricType PLACEHOLDER_TIME;
    public static final MetricType PREFETCH_TIME;
    public static final MetricType PREPARE_PAGE_TIME;
    public static final MetricType PRESENTATION_TIME;
    public static final MetricType PROTOCOL_VERSION;
    public static final MetricType REDIRECT_TIME;
    public static final MetricType ROUTING_TIME;
    public static final MetricType SCROLL_TIME;
    public static final MetricType ST_COMPOSER_FB;
    public static final MetricType ST_INTERNAL;
    public static final MetricType ST_RESOLVE;
    public static final MetricType ST_TOTAL;
    public static final MetricType ST_WIDGETS;
    public static final MetricType TRANSFER_SIZE;
    public static final MetricType WIDGET_VIEWS;
    public static final MetricType X_NGENIX_CACHE;
    private final boolean isInterval;

    /* renamed from: metricName$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j metricName;
    public static final MetricType REQUEST_PREPARE_TIME_START = new MetricType("REQUEST_PREPARE_TIME_START", 0);
    public static final MetricType REQUEST_PREPARE_TIME_END = new MetricType("REQUEST_PREPARE_TIME_END", 1);
    public static final MetricType DECODING_TIME_START = new MetricType("DECODING_TIME_START", 2);
    public static final MetricType DECODING_TIME_END = new MetricType("DECODING_TIME_END", 3);
    public static final MetricType DNS_TIME_START = new MetricType("DNS_TIME_START", 4);
    public static final MetricType DNS_TIME_END = new MetricType("DNS_TIME_END", 5);
    public static final MetricType CREATION_TIME_START = new MetricType("CREATION_TIME_START", 6);
    public static final MetricType CREATION_TIME_END = new MetricType("CREATION_TIME_END", 7);
    public static final MetricType BIND_TIME_START = new MetricType("BIND_TIME_START", 8);
    public static final MetricType BIND_TIME_END = new MetricType("BIND_TIME_END", 9);
    public static final MetricType LAYOUT_TIME_START = new MetricType("LAYOUT_TIME_START", 10);
    public static final MetricType LAYOUT_TIME_END = new MetricType("LAYOUT_TIME_END", 11);
    public static final MetricType RESPONSE_TIME_START = new MetricType("RESPONSE_TIME_START", 12);
    public static final MetricType RESPONSE_TIME_END = new MetricType("RESPONSE_TIME_END", 13);
    public static final MetricType SERVER_TIME_START = new MetricType("SERVER_TIME_START", 14);
    public static final MetricType SERVER_TIME_END = new MetricType("SERVER_TIME_END", 15);
    public static final MetricType TCP_TIME_START = new MetricType("TCP_TIME_START", 16);
    public static final MetricType TCP_TIME_END = new MetricType("TCP_TIME_END", 17);
    public static final MetricType TIME_TO_FIRST_BYTE_START = new MetricType("TIME_TO_FIRST_BYTE_START", 18);
    public static final MetricType TIME_TO_FIRST_BYTE_END = new MetricType("TIME_TO_FIRST_BYTE_END", 19);
    public static final MetricType TIME_TO_LAST_BYTE_START = new MetricType("TIME_TO_LAST_BYTE_START", 20);
    public static final MetricType TIME_TO_LAST_BYTE_END = new MetricType("TIME_TO_LAST_BYTE_END", 21);
    public static final MetricType NETWORK_LB_REDIRECT_TIME_START = new MetricType("NETWORK_LB_REDIRECT_TIME_START", 22);
    public static final MetricType NETWORK_LB_REDIRECT_TIME_END = new MetricType("NETWORK_LB_REDIRECT_TIME_END", 23);
    public static final MetricType NETWORK_ANTIBOT_TIME_START = new MetricType("NETWORK_ANTIBOT_TIME_START", 24);
    public static final MetricType NETWORK_ANTIBOT_TIME_END = new MetricType("NETWORK_ANTIBOT_TIME_END", 25);
    public static final MetricType TLS_TIME_START = new MetricType("TLS_TIME_START", 26);
    public static final MetricType TLS_TIME_END = new MetricType("TLS_TIME_END", 27);
    public static final MetricType TOTAL_TIME_START = new MetricType("TOTAL_TIME_START", 28);
    public static final MetricType TOTAL_TIME_END = new MetricType("TOTAL_TIME_END", 29);
    public static final MetricType LOADER_TIME_START = new MetricType("LOADER_TIME_START", 30);
    public static final MetricType LOADER_TIME_END = new MetricType("LOADER_TIME_END", 31);
    public static final MetricType ADDITIONAL_REQUESTS_TIME_START = new MetricType("ADDITIONAL_REQUESTS_TIME_START", 32);
    public static final MetricType ADDITIONAL_REQUESTS_TIME_END = new MetricType("ADDITIONAL_REQUESTS_TIME_END", 33);
    public static final MetricType PREPARE_PRESENTATION_DATA_TIME_START = new MetricType("PREPARE_PRESENTATION_DATA_TIME_START", 34);
    public static final MetricType PREPARE_PRESENTATION_DATA_TIME_END = new MetricType("PREPARE_PRESENTATION_DATA_TIME_END", 35);

    static final class a extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class b extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class c extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class d extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class e extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class f extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class g extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class h extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class i extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class j extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class k extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class l extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class m extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class n extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class o extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class p extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class q extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class r extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class s extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class t extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class u extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class v extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class w extends MetricType {
        private final boolean isInterval;

        @Override // ru.ozon.tracker.performance.MetricType, Qj0.InterfaceC3892l
        /* renamed from: isInterval */
        public final boolean getIsInterval() {
            return this.isInterval;
        }
    }

    static final class x extends AbstractC7737t implements Function0<String> {
        x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            MetricType metricType = MetricType.this;
            boolean isInterval = metricType.getIsInterval();
            String name = metricType.name();
            return isInterval ? kotlin.text.h.U(kotlin.text.h.U(name, "_END"), "_START") : name;
        }
    }

    private static final /* synthetic */ MetricType[] $values() {
        return new MetricType[]{REQUEST_PREPARE_TIME_START, REQUEST_PREPARE_TIME_END, DECODING_TIME_START, DECODING_TIME_END, DNS_TIME_START, DNS_TIME_END, CREATION_TIME_START, CREATION_TIME_END, BIND_TIME_START, BIND_TIME_END, LAYOUT_TIME_START, LAYOUT_TIME_END, RESPONSE_TIME_START, RESPONSE_TIME_END, SERVER_TIME_START, SERVER_TIME_END, TCP_TIME_START, TCP_TIME_END, TIME_TO_FIRST_BYTE_START, TIME_TO_FIRST_BYTE_END, TIME_TO_LAST_BYTE_START, TIME_TO_LAST_BYTE_END, NETWORK_LB_REDIRECT_TIME_START, NETWORK_LB_REDIRECT_TIME_END, NETWORK_ANTIBOT_TIME_START, NETWORK_ANTIBOT_TIME_END, TLS_TIME_START, TLS_TIME_END, TOTAL_TIME_START, TOTAL_TIME_END, LOADER_TIME_START, LOADER_TIME_END, ADDITIONAL_REQUESTS_TIME_START, ADDITIONAL_REQUESTS_TIME_END, PREPARE_PRESENTATION_DATA_TIME_START, PREPARE_PRESENTATION_DATA_TIME_END, PRESENTATION_TIME, ROUTING_TIME, PREPARE_PAGE_TIME, FETCH_TIME, CACHE_TIME, PREFETCH_TIME, DECODED_SIZE, ENCODED_SIZE, REDIRECT_TIME, PLACEHOLDER_TIME, TRANSFER_SIZE, X_NGENIX_CACHE, HITCH_TIME, SCROLL_TIME, WIDGET_VIEWS, ST_TOTAL, ST_INTERNAL, ST_WIDGETS, ST_RESOLVE, ST_COMPOSER_FB, IMG_RESIZE_TIME, EDGE_TIME, PROTOCOL_VERSION};
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        PRESENTATION_TIME = new k("PRESENTATION_TIME", 36, defaultConstructorMarker);
        ROUTING_TIME = new n("ROUTING_TIME", 37, defaultConstructorMarker);
        PREPARE_PAGE_TIME = new j("PREPARE_PAGE_TIME", 38, defaultConstructorMarker);
        FETCH_TIME = new e("FETCH_TIME", 39, defaultConstructorMarker);
        CACHE_TIME = new a("CACHE_TIME", 40, defaultConstructorMarker);
        PREFETCH_TIME = new i("PREFETCH_TIME", 41, defaultConstructorMarker);
        DECODED_SIZE = new b("DECODED_SIZE", 42, defaultConstructorMarker);
        ENCODED_SIZE = new d("ENCODED_SIZE", 43, defaultConstructorMarker);
        REDIRECT_TIME = new m("REDIRECT_TIME", 44, defaultConstructorMarker);
        PLACEHOLDER_TIME = new h("PLACEHOLDER_TIME", 45, defaultConstructorMarker);
        TRANSFER_SIZE = new u("TRANSFER_SIZE", 46, defaultConstructorMarker);
        X_NGENIX_CACHE = new w("X_NGENIX_CACHE", 47, defaultConstructorMarker);
        HITCH_TIME = new f("HITCH_TIME", 48, defaultConstructorMarker);
        SCROLL_TIME = new o("SCROLL_TIME", 49, defaultConstructorMarker);
        WIDGET_VIEWS = new v("WIDGET_VIEWS", 50, defaultConstructorMarker);
        ST_TOTAL = new s("ST_TOTAL", 51, defaultConstructorMarker);
        ST_INTERNAL = new q("ST_INTERNAL", 52, defaultConstructorMarker);
        ST_WIDGETS = new t("ST_WIDGETS", 53, defaultConstructorMarker);
        ST_RESOLVE = new r("ST_RESOLVE", 54, defaultConstructorMarker);
        ST_COMPOSER_FB = new p("ST_COMPOSER_FB", 55, defaultConstructorMarker);
        IMG_RESIZE_TIME = new g("IMG_RESIZE_TIME", 56, defaultConstructorMarker);
        EDGE_TIME = new c("EDGE_TIME", 57, defaultConstructorMarker);
        PROTOCOL_VERSION = new l("PROTOCOL_VERSION", 58, defaultConstructorMarker);
        MetricType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    public /* synthetic */ MetricType(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11);
    }

    @NotNull
    public static Xc.a<MetricType> getEntries() {
        return $ENTRIES;
    }

    public static MetricType valueOf(String str) {
        return (MetricType) Enum.valueOf(MetricType.class, str);
    }

    public static MetricType[] values() {
        return (MetricType[]) $VALUES.clone();
    }

    @Override // Qj0.InterfaceC3892l
    @NotNull
    public String getMetricName() {
        return (String) this.metricName.getValue();
    }

    @Override // Qj0.InterfaceC3892l
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // Qj0.InterfaceC3892l
    /* renamed from: isInterval, reason: from getter */
    public boolean getIsInterval() {
        return this.isInterval;
    }

    private MetricType(String str, int i11) {
        this.isInterval = true;
        this.metricName = Sc.k.b(new x());
    }
}

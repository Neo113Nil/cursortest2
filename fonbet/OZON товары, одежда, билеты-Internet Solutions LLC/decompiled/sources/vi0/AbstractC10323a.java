package vi0;

import Sc.InterfaceC4008j;
import fj0.AbstractC6574a;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: vi0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10323a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<Set<fj0.d<? extends Object>>> f102981a = Sc.k.b(b.f102984b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f102982b = 0;

    /* renamed from: vi0.a$a, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C2233a extends fj0.e {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C2233a f102983c = new C2233a("tracker_batch_size", 10);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2233a);
        }

        public final int hashCode() {
            return -2087666518;
        }

        @NotNull
        public final String toString() {
            return "BatchSize";
        }
    }

    /* renamed from: vi0.a$b */
    static final class b extends AbstractC7737t implements Function0<Set<? extends fj0.d<? extends Object>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f102984b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Set<? extends fj0.d<? extends Object>> invoke() {
            fj0.d[] elements = {C2233a.f102983c, i.f102991c, k.f102993c, j.f102992c, g.f102989c, e.f102987c, c.f102985c, f.f102988c, d.f102986c, h.f102990c};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }
    }

    /* renamed from: vi0.a$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC6574a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final c f102985c = new c("delayed_sending_events", true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1618168542;
        }

        @NotNull
        public final String toString() {
            return "DelayedSendingEvents";
        }
    }

    /* renamed from: vi0.a$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC6574a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final d f102986c = new d("delayed_sending_traces", true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1192555561;
        }

        @NotNull
        public final String toString() {
            return "DelayedSendingTraces";
        }
    }

    /* renamed from: vi0.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC6574a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final e f102987c = new e("force_sending_events_on_minimize", true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1925039350;
        }

        @NotNull
        public final String toString() {
            return "ForceSendingEventsOnMinimize";
        }
    }

    /* renamed from: vi0.a$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC6574a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final f f102988c = new f("force_sending_traces_on_minimize", true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 140180843;
        }

        @NotNull
        public final String toString() {
            return "ForceSendingTracesOnMinimize";
        }
    }

    /* renamed from: vi0.a$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC6574a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final g f102989c = new g("tracker_is_need_logs", false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 607261184;
        }

        @NotNull
        public final String toString() {
            return "Logs";
        }
    }

    /* renamed from: vi0.a$h */
    /* loaded from: classes7.dex */
    public static final class h extends fj0.e {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final h f102990c = new h("performance_life_time_event", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1028572206;
        }

        @NotNull
        public final String toString() {
            return "PerformanceLifetimeEvent";
        }
    }

    /* renamed from: vi0.a$i */
    /* loaded from: classes7.dex */
    public static final class i extends fj0.e {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final i f102991c = new i("tracker_product_sending_period", 30000);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 574020445;
        }

        @NotNull
        public final String toString() {
            return "ProductSendingPeriod";
        }
    }

    /* renamed from: vi0.a$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC6574a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final j f102992c = new j("tracker_is_test_mode", false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -74377946;
        }

        @NotNull
        public final String toString() {
            return "TestMode";
        }
    }

    /* renamed from: vi0.a$k */
    /* loaded from: classes7.dex */
    public static final class k extends AbstractC6574a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final k f102993c = new k("tracker_track_lifecycle", true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 6632816;
        }

        @NotNull
        public final String toString() {
            return "TrackLifecycle";
        }
    }
}

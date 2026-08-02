package ru.ozon.composer.compose.widget.scrollable;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.h;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0006\u0003\b\t\n\u0007\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/m;", "", "Lru/ozon/composer/ui/widget/h;", "a", "Lru/ozon/composer/ui/widget/h;", "()Lru/ozon/composer/ui/widget/h;", "span", "b", "c", "f", "e", "d", "Lru/ozon/composer/compose/widget/scrollable/m$b;", "Lru/ozon/composer/compose/widget/scrollable/m$c;", "Lru/ozon/composer/compose/widget/scrollable/m$d;", "Lru/ozon/composer/compose/widget/scrollable/m$e;", "Lru/ozon/composer/compose/widget/scrollable/m$f;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f94767c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final int f94768d = 1200;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final ru.ozon.composer.ui.widget.h span;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/m$a;", "", "<init>", "()V", "", "count", "Lru/ozon/composer/compose/widget/scrollable/m;", "a", "(I)Lru/ozon/composer/compose/widget/scrollable/m;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "b", "MAX_SIZE", "I", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.composer.compose.widget.scrollable.m$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m a(int count) {
            return count <= 1 ? c.f94772e : new d(m.f94768d / count);
        }

        @NotNull
        public final m b(int value) {
            return new d(Math.min(value, m.f94768d));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/m$b;", "Lru/ozon/composer/compose/widget/scrollable/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public static final b f94770e = new b();

        /* renamed from: f, reason: collision with root package name */
        public static final int f94771f = 0;

        private b() {
            super(h.d.f94872b, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1922437364;
        }

        @NotNull
        public String toString() {
            return "Four";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/m$c;", "Lru/ozon/composer/compose/widget/scrollable/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends m {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public static final c f94772e = new c();

        /* renamed from: f, reason: collision with root package name */
        public static final int f94773f = 0;

        private c() {
            super(h.f.f94874b, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -2001668160;
        }

        @NotNull
        public String toString() {
            return "One";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/m$d;", "Lru/ozon/composer/compose/widget/scrollable/m;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(I)V", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends m {

        /* renamed from: e, reason: collision with root package name */
        public static final int f94774e = 0;

        public d(int i11) {
            super(new h.a(i11), null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/m$e;", "Lru/ozon/composer/compose/widget/scrollable/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class e extends m {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public static final e f94775e = new e();

        /* renamed from: f, reason: collision with root package name */
        public static final int f94776f = 0;

        private e() {
            super(h.c.f94871b, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 546701432;
        }

        @NotNull
        public String toString() {
            return "Three";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/m$f;", "Lru/ozon/composer/compose/widget/scrollable/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class f extends m {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public static final f f94777e = new f();

        /* renamed from: f, reason: collision with root package name */
        public static final int f94778f = 0;

        private f() {
            super(h.b.f94870b, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -2001663066;
        }

        @NotNull
        public String toString() {
            return "Two";
        }
    }

    public m(ru.ozon.composer.ui.widget.h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.span = hVar;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final ru.ozon.composer.ui.widget.h getSpan() {
        return this.span;
    }
}

package e5;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.e;
import bi.l;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@n(with = f.class)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \t2\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Le5/a;", "", "", "unit", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "Companion", C4527h.f48087o, com.bumptech.glide.gifdecoder.e.f29601m, "g", W9.d.f13160a, com.google.crypto.tink.integration.android.b.f37029b, com.google.android.material.shape.i.f35755A, "c", "f", "Le5/a$b;", "Le5/a$c;", "Le5/a$d;", "Le5/a$e;", "Le5/a$g;", "Le5/a$h;", "Le5/a$i;", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4178a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String unit;

    /* renamed from: e5.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return f.f45652a;
        }

        public Companion() {
        }
    }

    /* renamed from: e5.a$b */
    public static final class b extends AbstractC4178a {

        /* renamed from: b, reason: collision with root package name */
        public static final b f45649b = new b();

        public b() {
            super("count", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1965576296;
        }

        public String toString() {
            return "Count";
        }
    }

    /* renamed from: e5.a$c */
    public static final class c extends AbstractC4178a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String unit) {
            super(unit, null);
            Intrinsics.checkNotNullParameter(unit, "unit");
        }
    }

    /* renamed from: e5.a$d */
    public static final class d extends AbstractC4178a {

        /* renamed from: b, reason: collision with root package name */
        public static final d f45650b = new d();

        public d() {
            super("fps", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 305958530;
        }

        public String toString() {
            return "Fps";
        }
    }

    /* renamed from: e5.a$e */
    public static final class e extends AbstractC4178a {

        /* renamed from: b, reason: collision with root package name */
        public static final e f45651b = new e();

        public e() {
            super("kb", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1680553059;
        }

        public String toString() {
            return "KiloBytes";
        }
    }

    /* renamed from: e5.a$f */
    public static final class f implements InterfaceC1901b {

        /* renamed from: a, reason: collision with root package name */
        public static final f f45652a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final bi.f f45653b = l.c("MeasurementUnits", e.i.f25213a);

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC4178a deserialize(ci.e decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            String E10 = decoder.E();
            int hashCode = E10.hashCode();
            if (hashCode != -921832806) {
                if (hashCode != 3415) {
                    if (hashCode != 3477) {
                        if (hashCode != 3494) {
                            if (hashCode != 101609) {
                                if (hashCode == 94851343 && E10.equals("count")) {
                                    return b.f45649b;
                                }
                            } else if (E10.equals("fps")) {
                                return d.f45650b;
                            }
                        } else if (E10.equals("ms")) {
                            return h.f45655b;
                        }
                    } else if (E10.equals("mb")) {
                        return g.f45654b;
                    }
                } else if (E10.equals("kb")) {
                    return e.f45651b;
                }
            } else if (E10.equals("percentage")) {
                return i.f45656b;
            }
            return new c(E10);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(ci.f encoder, AbstractC4178a value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.H(value.getUnit());
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public bi.f getDescriptor() {
            return f45653b;
        }
    }

    /* renamed from: e5.a$g */
    public static final class g extends AbstractC4178a {

        /* renamed from: b, reason: collision with root package name */
        public static final g f45654b = new g();

        public g() {
            super("mb", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -859021838;
        }

        public String toString() {
            return "MegaBytes";
        }
    }

    /* renamed from: e5.a$h */
    public static final class h extends AbstractC4178a {

        /* renamed from: b, reason: collision with root package name */
        public static final h f45655b = new h();

        public h() {
            super("ms", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return -1903250279;
        }

        public String toString() {
            return "Milliseconds";
        }
    }

    /* renamed from: e5.a$i */
    public static final class i extends AbstractC4178a {

        /* renamed from: b, reason: collision with root package name */
        public static final i f45656b = new i();

        public i() {
            super("percentage", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return -986471711;
        }

        public String toString() {
            return "Percentage";
        }
    }

    public /* synthetic */ AbstractC4178a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public AbstractC4178a(String str) {
        this.unit = str;
    }
}

package Q5;

import Zh.InterfaceC1901b;
import bi.e;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Zh.n(with = C0182b.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0006\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"LQ5/b;", "", "", "level", "<init>", "(I)V", "a", "I", "()I", "Companion", W9.d.f13160a, "g", "f", C4527h.f48087o, com.bumptech.glide.gifdecoder.e.f29601m, "c", com.google.crypto.tink.integration.android.b.f37029b, "LQ5/b$c;", "LQ5/b$d;", "LQ5/b$e;", "LQ5/b$f;", "LQ5/b$g;", "LQ5/b$h;", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int level;

    /* renamed from: Q5.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i10) {
            switch (i10) {
                case 1:
                    return d.f9375b;
                case 2:
                    return g.f9378b;
                case 3:
                    return f.f9377b;
                case 4:
                    return h.f9379b;
                case 5:
                    return e.f9376b;
                case 6:
                    return c.f9374b;
                default:
                    E5.b.f3006a.a("Unknown severity level in CoralogixLogSeverity#fromLevel: " + i10 + ", defaulting to Info");
                    return f.f9377b;
            }
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return C0182b.f9372a;
        }

        public Companion() {
        }
    }

    /* renamed from: Q5.b$b, reason: collision with other inner class name */
    public static final class C0182b implements InterfaceC1901b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0182b f9372a = new C0182b();

        /* renamed from: b, reason: collision with root package name */
        public static final bi.f f9373b = bi.l.c("CoralogixLogSeverity", e.f.f25210a);

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b deserialize(ci.e decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return b.INSTANCE.a(decoder.k());
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(ci.f encoder, b value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.E(value.getLevel());
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public bi.f getDescriptor() {
            return f9373b;
        }
    }

    public static final class c extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final c f9374b = new c();

        public c() {
            super(6, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -269915703;
        }

        public String toString() {
            return "Critical";
        }
    }

    public static final class d extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final d f9375b = new d();

        public d() {
            super(1, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1073865833;
        }

        public String toString() {
            return "Debug";
        }
    }

    public static final class e extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final e f9376b = new e();

        public e() {
            super(5, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1075191838;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class f extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final f f9377b = new f();

        public f() {
            super(3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 34798552;
        }

        public String toString() {
            return "Info";
        }
    }

    public static final class g extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final g f9378b = new g();

        public g() {
            super(2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 2333208;
        }

        public String toString() {
            return "Verbose";
        }
    }

    public static final class h extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final h f9379b = new h();

        public h() {
            super(4, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 35203504;
        }

        public String toString() {
            return "Warn";
        }
    }

    public /* synthetic */ b(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    /* renamed from: a, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    public b(int i10) {
        this.level = i10;
    }
}

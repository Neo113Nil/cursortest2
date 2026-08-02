package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f49466a;

    /* renamed from: b, reason: collision with root package name */
    public final h f49467b;

    public static final class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final a f49468c = new a();

        public a() {
            super(io.ktor.utils.io.internal.g.a(), io.ktor.utils.io.internal.g.b(), null);
        }

        public String toString() {
            return "IDLE(empty)";
        }
    }

    public static final class b extends f {

        /* renamed from: c, reason: collision with root package name */
        public final c f49469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c initial) {
            super(initial.f49466a, initial.f49467b, null);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.f49469c = initial;
        }

        public final c g() {
            return this.f49469c;
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d c() {
            return this.f49469c.h();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public g d() {
            return this.f49469c.j();
        }

        public String toString() {
            return "IDLE(with buffer)";
        }
    }

    public static final class c extends f {

        /* renamed from: c, reason: collision with root package name */
        public final ByteBuffer f49470c;

        /* renamed from: d, reason: collision with root package name */
        public final ByteBuffer f49471d;

        /* renamed from: e, reason: collision with root package name */
        public final b f49472e;

        /* renamed from: f, reason: collision with root package name */
        public final d f49473f;

        /* renamed from: g, reason: collision with root package name */
        public final g f49474g;

        /* renamed from: h, reason: collision with root package name */
        public final e f49475h;

        public /* synthetic */ c(ByteBuffer byteBuffer, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(byteBuffer, (i11 & 2) != 0 ? 8 : i10);
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer a() {
            return this.f49471d;
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer b() {
            return this.f49470c;
        }

        public final b g() {
            return this.f49472e;
        }

        public final d h() {
            return this.f49473f;
        }

        public final e i() {
            return this.f49475h;
        }

        public final g j() {
            return this.f49474g;
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public d c() {
            return this.f49473f;
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public g d() {
            return this.f49474g;
        }

        public String toString() {
            return "Initial";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ByteBuffer backingBuffer, int i10) {
            super(backingBuffer, new h(backingBuffer.capacity() - i10), null);
            Intrinsics.checkNotNullParameter(backingBuffer, "backingBuffer");
            if (backingBuffer.position() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (backingBuffer.limit() != backingBuffer.capacity()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ByteBuffer duplicate = backingBuffer.duplicate();
            Intrinsics.checkNotNullExpressionValue(duplicate, "backingBuffer.duplicate()");
            this.f49470c = duplicate;
            ByteBuffer duplicate2 = backingBuffer.duplicate();
            Intrinsics.checkNotNullExpressionValue(duplicate2, "backingBuffer.duplicate()");
            this.f49471d = duplicate2;
            this.f49472e = new b(this);
            this.f49473f = new d(this);
            this.f49474g = new g(this);
            this.f49475h = new e(this);
        }
    }

    public static final class d extends f {

        /* renamed from: c, reason: collision with root package name */
        public final c f49476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c initial) {
            super(initial.f49466a, initial.f49467b, null);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.f49476c = initial;
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer a() {
            return this.f49476c.a();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e d() {
            return this.f49476c.i();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this.f49476c.g();
        }

        public String toString() {
            return "Reading";
        }
    }

    public static final class e extends f {

        /* renamed from: c, reason: collision with root package name */
        public final c f49477c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c initial) {
            super(initial.f49466a, initial.f49467b, null);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.f49477c = initial;
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer a() {
            return this.f49477c.a();
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer b() {
            return this.f49477c.b();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g e() {
            return this.f49477c.j();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d f() {
            return this.f49477c.h();
        }

        public String toString() {
            return "Reading+Writing";
        }
    }

    /* renamed from: io.ktor.utils.io.internal.f$f, reason: collision with other inner class name */
    public static final class C0732f extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final C0732f f49478c = new C0732f();

        public C0732f() {
            super(io.ktor.utils.io.internal.g.a(), io.ktor.utils.io.internal.g.b(), null);
        }

        public String toString() {
            return "Terminated";
        }
    }

    public static final class g extends f {

        /* renamed from: c, reason: collision with root package name */
        public final c f49479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c initial) {
            super(initial.f49466a, initial.f49467b, null);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.f49479c = initial;
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer b() {
            return this.f49479c.b();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e c() {
            return this.f49479c.i();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b f() {
            return this.f49479c.g();
        }

        public String toString() {
            return "Writing";
        }
    }

    public /* synthetic */ f(ByteBuffer byteBuffer, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, hVar);
    }

    public ByteBuffer a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    public ByteBuffer b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public f c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public f d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public f e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public f f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }

    public f(ByteBuffer byteBuffer, h hVar) {
        this.f49466a = byteBuffer;
        this.f49467b = hVar;
    }
}

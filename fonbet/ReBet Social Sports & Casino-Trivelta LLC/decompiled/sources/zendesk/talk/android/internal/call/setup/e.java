package zendesk.talk.android.internal.call.setup;

import Dj.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f68910a = new a();

        public a() {
            super(null);
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f68911a = new b();

        public b() {
            super(null);
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f68912a = new c();

        public c() {
            super(null);
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f68913a = new d();

        public d() {
            super(null);
        }
    }

    /* renamed from: zendesk.talk.android.internal.call.setup.e$e, reason: collision with other inner class name */
    public static final class C1007e extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final C1007e f68914a = new C1007e();

        public C1007e() {
            super(null);
        }
    }

    public static final class f extends e {

        /* renamed from: a, reason: collision with root package name */
        public final p f68915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p answer) {
            super(null);
            Intrinsics.checkNotNullParameter(answer, "answer");
            this.f68915a = answer;
        }

        public final p a() {
            return this.f68915a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f68915a == ((f) obj).f68915a;
        }

        public int hashCode() {
            return this.f68915a.hashCode();
        }

        public String toString() {
            return "StartCall(answer=" + this.f68915a + ')';
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public e() {
    }
}

package zendesk.talk.android.internal.call;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Dj.b f68780a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Dj.b audioOutput) {
            super(null);
            Intrinsics.checkNotNullParameter(audioOutput, "audioOutput");
            this.f68780a = audioOutput;
        }

        public final Dj.b a() {
            return this.f68780a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f68780a == ((a) obj).f68780a;
        }

        public int hashCode() {
            return this.f68780a.hashCode();
        }

        public String toString() {
            return "ChangeAudio(audioOutput=" + this.f68780a + ')';
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f68781a = new b();

        public b() {
            super(null);
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f68782a = new c();

        public c() {
            super(null);
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f68783a = new d();

        public d() {
            super(null);
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public e() {
    }
}

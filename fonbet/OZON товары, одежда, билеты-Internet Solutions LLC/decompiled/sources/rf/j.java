package rf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Serializable;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rf.n;
import sf.InterfaceC9682h;

/* loaded from: classes10.dex */
public final class j<T> implements n<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f83402a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83403b;

    /* renamed from: c, reason: collision with root package name */
    private final long f83404c;

    /* renamed from: d, reason: collision with root package name */
    private final a<T> f83405d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f83406e;

    /* renamed from: f, reason: collision with root package name */
    private final T f83407f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f83408g;

    public interface a<T> {
        T a(@NotNull q qVar);

        void b(@NotNull r rVar, T t2);
    }

    static final class b extends AbstractC7737t implements Function1<InterfaceC9682h, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f83410c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f83411d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar, Object obj) {
            super(1);
            this.f83410c = rVar;
            this.f83411d = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC9682h interfaceC9682h) {
            InterfaceC9682h it = interfaceC9682h;
            Intrinsics.checkNotNullParameter(it, "it");
            j.this.f83405d.b(this.f83410c, this.f83411d);
            return Unit.f71690a;
        }
    }

    public j(@NotNull String name, int i11, long j11, @NotNull a<T> codec, boolean z11, T t2, boolean z12) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f83402a = name;
        this.f83403b = i11;
        this.f83404c = j11;
        this.f83405d = codec;
        this.f83406e = z11;
        this.f83407f = t2;
        this.f83408g = z12;
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(j11 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static j f(j jVar, long j11, Serializable serializable, int i11) {
        String name = jVar.f83402a;
        int i12 = (i11 & 2) != 0 ? jVar.f83403b : UserVerificationMethods.USER_VERIFY_PATTERN;
        if ((i11 & 4) != 0) {
            j11 = jVar.f83404c;
        }
        long j12 = j11;
        a<T> codec = jVar.f83405d;
        boolean z11 = (i11 & 16) != 0 ? jVar.f83406e : true;
        if ((i11 & 32) != 0) {
            serializable = jVar.f83407f;
        }
        Serializable serializable2 = serializable;
        boolean z12 = (i11 & 64) != 0 ? jVar.f83408g : true;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(codec, "codec");
        return new j(name, i12, j12, codec, z11, serializable2, z12);
    }

    public static j j(j jVar, long j11) {
        jVar.getClass();
        return f(jVar, j11, null, 121);
    }

    @Override // rf.n
    @NotNull
    public final j a(long j11, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return n.a.a(this, name, j11);
    }

    @Override // rf.n
    public final void b(@NotNull r writer, T t2) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (this.f83408g) {
            writer.c(t2);
        }
        if (this.f83406e && Intrinsics.d(t2, this.f83407f)) {
            return;
        }
        b bVar = new b(writer, t2);
        writer.f(this.f83402a, this.f83403b, this.f83404c, bVar);
    }

    @Override // rf.n
    public final boolean c(@NotNull p header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return header.d() == this.f83403b && header.c() == this.f83404c;
    }

    @Override // rf.n
    public final T d(@NotNull q reader) {
        p pVar;
        long j11;
        boolean z11;
        long j12;
        ArrayList arrayList;
        ArrayList arrayList2;
        long i11;
        ArrayList arrayList3;
        long i12;
        Intrinsics.checkNotNullParameter(reader, "reader");
        p l11 = reader.l();
        if (l11 == null || l11.d() != this.f83403b || l11.c() != this.f83404c) {
            if (this.f83406e) {
                return this.f83407f;
            }
            throw new ProtocolException("expected " + this + " but was " + l11 + " at " + reader);
        }
        if (reader.l() == null) {
            throw new ProtocolException("expected a value");
        }
        pVar = reader.f83460g;
        Intrinsics.f(pVar);
        reader.f83460g = null;
        j11 = reader.f83456c;
        z11 = reader.f83459f;
        if (pVar.b() != -1) {
            i12 = reader.i();
            j12 = pVar.b() + i12;
        } else {
            j12 = -1;
        }
        if (j11 != -1 && j12 > j11) {
            throw new ProtocolException("enclosed object too large");
        }
        reader.f83456c = j12;
        reader.f83459f = pVar.a();
        String str = this.f83402a;
        if (str != null) {
            arrayList3 = reader.f83458e;
            arrayList3.add(str);
        }
        try {
            T a11 = this.f83405d.a(reader);
            if (j12 != -1) {
                i11 = reader.i();
                if (i11 > j12) {
                    throw new ProtocolException("unexpected byte count at " + reader);
                }
            }
            if (this.f83408g) {
                reader.v(a11);
            }
            return a11;
        } finally {
            reader.f83460g = null;
            reader.f83456c = j11;
            reader.f83459f = z11;
            if (str != null) {
                arrayList = reader.f83458e;
                arrayList2 = reader.f83458e;
                arrayList.remove(arrayList2.size() - 1);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f83402a, jVar.f83402a) && this.f83403b == jVar.f83403b && this.f83404c == jVar.f83404c && Intrinsics.d(this.f83405d, jVar.f83405d) && this.f83406e == jVar.f83406e && Intrinsics.d(this.f83407f, jVar.f83407f) && this.f83408g == jVar.f83408g;
    }

    public final long g() {
        return this.f83404c;
    }

    public final int h() {
        return this.f83403b;
    }

    public final int hashCode() {
        int hashCode = (((this.f83405d.hashCode() + (((((this.f83402a.hashCode() * 31) + this.f83403b) * 31) + ((int) this.f83404c)) * 31)) * 31) + (this.f83406e ? 1 : 0)) * 31;
        T t2 = this.f83407f;
        return ((hashCode + (t2 != null ? t2.hashCode() : 0)) * 31) + (this.f83408g ? 1 : 0);
    }

    @NotNull
    public final j i(Serializable serializable) {
        return f(this, 0L, serializable, 79);
    }

    @NotNull
    public final String toString() {
        return this.f83402a + " [" + this.f83403b + '/' + this.f83404c + ']';
    }
}

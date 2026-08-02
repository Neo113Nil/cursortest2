package gh;

import androidx.appcompat.widget.a4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final l f10234e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f10235f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10236a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10237b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f10238c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f10239d;

    static {
        j jVar = j.f10226r;
        j jVar2 = j.f10227s;
        j jVar3 = j.f10228t;
        j jVar4 = j.f10221l;
        j jVar5 = j.f10223n;
        j jVar6 = j.f10222m;
        j jVar7 = j.f10224o;
        j jVar8 = j.q;
        j jVar9 = j.f10225p;
        List f6 = kotlin.collections.u.f(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9);
        List f10 = kotlin.collections.u.f(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, j.j, j.f10220k, j.f10218h, j.f10219i, j.f10216f, j.f10217g, j.f10215e);
        a4 a4Var = new a4();
        j[] jVarArr = (j[]) f6.toArray(new j[0]);
        a4Var.b((j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        t0 t0Var = t0.f10308c;
        t0 t0Var2 = t0.f10309d;
        a4Var.d(t0Var, t0Var2);
        a4Var.f696b = true;
        a4Var.a();
        a4 a4Var2 = new a4();
        j[] jVarArr2 = (j[]) f10.toArray(new j[0]);
        a4Var2.b((j[]) Arrays.copyOf(jVarArr2, jVarArr2.length));
        a4Var2.d(t0Var, t0Var2);
        a4Var2.f696b = true;
        f10234e = a4Var2.a();
        a4 a4Var3 = new a4();
        j[] jVarArr3 = (j[]) f10.toArray(new j[0]);
        a4Var3.b((j[]) Arrays.copyOf(jVarArr3, jVarArr3.length));
        a4Var3.d(t0Var, t0Var2, t0.f10310e, t0.f10311f);
        a4Var3.f696b = true;
        a4Var3.a();
        f10235f = new l(false, false, null, null);
    }

    public l(boolean z5, boolean z7, String[] strArr, String[] strArr2) {
        this.f10236a = z5;
        this.f10237b = z7;
        this.f10238c = strArr;
        this.f10239d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    public final void a(SSLSocket sslSocket, boolean z5) {
        String[] enabledProtocols;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] socketEnabledCipherSuites = sslSocket.getEnabledCipherSuites();
        Intrinsics.checkNotNull(socketEnabledCipherSuites);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        String[] strArr = this.f10238c;
        if (strArr != null) {
            socketEnabledCipherSuites = hh.e.i(strArr, socketEnabledCipherSuites, j.f10213c);
        }
        ?? r32 = this.f10239d;
        if (r32 != 0) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            jf.b bVar = jf.b.f18481a;
            Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            enabledProtocols = hh.e.i(enabledProtocols2, r32, bVar);
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNull(supportedCipherSuites);
        i comparator = j.f10213c;
        byte[] bArr = hh.e.f10821a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i5], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i5++;
            }
        }
        if (z5 && i5 != -1) {
            String value = supportedCipherSuites[i5];
            Intrinsics.checkNotNullExpressionValue(value, "get(...)");
            Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(socketEnabledCipherSuites, socketEnabledCipherSuites.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            socketEnabledCipherSuites = (String[]) copyOf;
            Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "<this>");
            socketEnabledCipherSuites[socketEnabledCipherSuites.length - 1] = value;
        }
        Intrinsics.checkNotNullParameter(this, "connectionSpec");
        a4 a4Var = new a4();
        a4Var.f695a = this.f10236a;
        a4Var.f697c = strArr;
        a4Var.f698d = r32;
        a4Var.f696b = this.f10237b;
        a4Var.c((String[]) Arrays.copyOf(socketEnabledCipherSuites, socketEnabledCipherSuites.length));
        a4Var.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        l a7 = a4Var.a();
        if (a7.c() != null) {
            sslSocket.setEnabledProtocols(a7.f10239d);
        }
        if (a7.b() != null) {
            sslSocket.setEnabledCipherSuites(a7.f10238c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f10238c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(j.f10212b.d(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f10239d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            t0.f10307b.getClass();
            arrayList.add(o.e(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        boolean z5 = lVar.f10236a;
        boolean z7 = this.f10236a;
        if (z7 != z5) {
            return false;
        }
        if (z7) {
            return Arrays.equals(this.f10238c, lVar.f10238c) && Arrays.equals(this.f10239d, lVar.f10239d) && this.f10237b == lVar.f10237b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f10236a) {
            return 17;
        }
        String[] strArr = this.f10238c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f10239d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f10237b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f10236a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f10237b + ')';
    }
}

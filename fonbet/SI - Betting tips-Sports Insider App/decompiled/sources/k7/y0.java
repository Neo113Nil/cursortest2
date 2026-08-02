package k7;

import com.google.android.gms.internal.measurement.y4;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18940a;

    /* renamed from: b, reason: collision with root package name */
    public final r f18941b;

    public y0(r rVar) {
        rVar.getClass();
        this.f18941b = rVar;
        c0 d10 = rVar.entrySet().d();
        int i5 = 0;
        while (d10.hasNext()) {
            Map.Entry entry = (Map.Entry) d10.next();
            int b10 = ((b1) entry.getKey()).b();
            i5 = i5 < b10 ? b10 : i5;
            int b11 = ((b1) entry.getValue()).b();
            if (i5 < b11) {
                i5 = b11;
            }
        }
        int i10 = i5 + 1;
        this.f18940a = i10;
        if (i10 > 8) {
            throw new y4("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // k7.b1
    public final int a() {
        return b1.d((byte) -96);
    }

    @Override // k7.b1
    public final int b() {
        return this.f18940a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        b1 b1Var = (b1) obj;
        int a7 = b1Var.a();
        int d10 = b1.d((byte) -96);
        if (d10 != a7) {
            return d10 - b1Var.a();
        }
        r rVar = ((y0) b1Var).f18941b;
        r rVar2 = this.f18941b;
        if (rVar2.f18911d.size() != rVar.f18911d.size()) {
            return rVar2.f18911d.size() - rVar.f18911d.size();
        }
        c0 d11 = rVar2.entrySet().d();
        c0 d12 = rVar.entrySet().d();
        do {
            if (!d11.hasNext() && !d12.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) d11.next();
            Map.Entry entry2 = (Map.Entry) d12.next();
            int compareTo2 = ((b1) entry.getKey()).compareTo((b1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((b1) entry.getValue()).compareTo((b1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            return this.f18941b.equals(((y0) obj).f18941b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(b1.d((byte) -96)), this.f18941b});
    }

    public final String toString() {
        r rVar = this.f18941b;
        if (rVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c0 d10 = rVar.entrySet().d();
        while (d10.hasNext()) {
            Map.Entry entry = (Map.Entry) d10.next();
            linkedHashMap.put(((b1) entry.getKey()).toString().replace("\n", "\n  "), ((b1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        m3.f fVar = new m3.f(26);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.h(sb2, linkedHashMap.entrySet().iterator(), fVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}

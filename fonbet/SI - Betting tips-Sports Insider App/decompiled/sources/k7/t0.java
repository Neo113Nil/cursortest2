package k7;

import com.google.android.gms.internal.measurement.y4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final m f18921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18922b;

    public t0(w wVar) {
        wVar.getClass();
        this.f18921a = wVar;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            m mVar = this.f18921a;
            if (i5 >= mVar.size()) {
                break;
            }
            int b10 = ((b1) mVar.get(i5)).b();
            if (i10 < b10) {
                i10 = b10;
            }
            i5++;
        }
        int i11 = i10 + 1;
        this.f18922b = i11;
        if (i11 > 8) {
            throw new y4("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // k7.b1
    public final int a() {
        return b1.d(ByteCompanionObject.MIN_VALUE);
    }

    @Override // k7.b1
    public final int b() {
        return this.f18922b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        b1 b1Var = (b1) obj;
        int a7 = b1Var.a();
        int d10 = b1.d(ByteCompanionObject.MIN_VALUE);
        if (d10 != a7) {
            return d10 - b1Var.a();
        }
        m mVar = ((t0) b1Var).f18921a;
        m mVar2 = this.f18921a;
        if (mVar2.size() != mVar.size()) {
            return mVar2.size() - mVar.size();
        }
        for (int i5 = 0; i5 < mVar2.size(); i5++) {
            int compareTo = ((b1) mVar2.get(i5)).compareTo((b1) mVar.get(i5));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            return this.f18921a.equals(((t0) obj).f18921a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(b1.d(ByteCompanionObject.MIN_VALUE)), this.f18921a});
    }

    public final String toString() {
        m mVar = this.f18921a;
        if (mVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = mVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(((b1) mVar.get(i5)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(m3.f.v(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(m3.f.v(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}

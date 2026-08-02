package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e[] f17382a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17383b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(List list, boolean z5) {
        this((e[]) r2.toArray(new e[r2.size()]), z5);
        ArrayList arrayList = (ArrayList) list;
    }

    public d(e[] eVarArr, boolean z5) {
        this.f17382a = eVarArr;
        this.f17383b = z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(y yVar, StringBuilder sb2) {
        int length = sb2.length();
        boolean z5 = this.f17383b;
        if (z5) {
            yVar.f17469c++;
        }
        try {
            for (e eVar : this.f17382a) {
                if (!eVar.i(yVar, sb2)) {
                    sb2.setLength(length);
                }
            }
        } finally {
            if (z5) {
                yVar.f17469c--;
            }
        }
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        boolean z5 = this.f17383b;
        e[] eVarArr = this.f17382a;
        int i10 = 0;
        if (z5) {
            ArrayList arrayList = vVar.f17461d;
            d0 c2 = vVar.c();
            c2.getClass();
            d0 d0Var = new d0();
            ((HashMap) d0Var.f17384a).putAll(c2.f17384a);
            d0Var.f17385b = c2.f17385b;
            d0Var.f17386c = c2.f17386c;
            d0Var.f17387d = c2.f17387d;
            arrayList.add(d0Var);
            int length = eVarArr.length;
            int i11 = i5;
            while (i10 < length) {
                i11 = eVarArr[i10].j(vVar, charSequence, i11);
                if (i11 < 0) {
                    vVar.f17461d.remove(r8.size() - 1);
                    return i5;
                }
                i10++;
            }
            vVar.f17461d.remove(r8.size() - 2);
            return i11;
        }
        int length2 = eVarArr.length;
        while (i10 < length2) {
            i5 = eVarArr[i10].j(vVar, charSequence, i5);
            if (i5 < 0) {
                return i5;
            }
            i10++;
        }
        return i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        e[] eVarArr = this.f17382a;
        if (eVarArr != null) {
            boolean z5 = this.f17383b;
            sb2.append(z5 ? "[" : "(");
            for (e eVar : eVarArr) {
                sb2.append(eVar);
            }
            sb2.append(z5 ? "]" : ")");
        }
        return sb2.toString();
    }
}

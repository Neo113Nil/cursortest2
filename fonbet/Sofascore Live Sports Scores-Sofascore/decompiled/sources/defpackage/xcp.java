package defpackage;

import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzj;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xcp extends zzzj {
    public Object[] a;
    public int b;

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final zzyl b(int i) {
        if (i < this.b) {
            return (zzyl) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object c(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object d(zzyl zzylVar) {
        int f = f(zzylVar);
        if (f == -1) {
            return null;
        }
        return zzylVar.b.cast(this.a[f + f + 1]);
    }

    public final void e(zzyl zzylVar, Object obj) {
        int f;
        if (!zzylVar.c && (f = f(zzylVar)) != -1) {
            this.a[f + f + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            objArr = Arrays.copyOf(objArr, length + length);
            this.a = objArr;
        }
        int i2 = this.b;
        int i3 = i2 + i2;
        objArr[i3] = zzylVar;
        objArr[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final int f(zzyl zzylVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(zzylVar)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(b(i));
            sb.append("': ");
            sb.append(c(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}

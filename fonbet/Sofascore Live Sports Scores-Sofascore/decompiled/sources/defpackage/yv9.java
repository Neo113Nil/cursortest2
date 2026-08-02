package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yv9 extends tv9 {
    public final Comparator d;

    public yv9(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.d = comparator;
    }

    @Override // defpackage.tv9, defpackage.vu9
    public final vu9 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // defpackage.tv9
    /* renamed from: g */
    public final tv9 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // defpackage.tv9
    public final /* bridge */ /* synthetic */ vv9 h() {
        throw null;
    }

    public final fwf i() {
        fwf fwfVar;
        Object[] objArr = this.a;
        int i = this.b;
        Comparator comparator = this.d;
        if (i == 0) {
            fwfVar = aw9.y(comparator);
        } else {
            int i2 = aw9.f;
            qha.p(i, objArr);
            Arrays.sort(objArr, 0, i, comparator);
            int i3 = 1;
            for (int i4 = 1; i4 < i; i4++) {
                Object obj = objArr[i4];
                if (comparator.compare(obj, objArr[i3 - 1]) != 0) {
                    objArr[i3] = obj;
                    i3++;
                }
            }
            Arrays.fill(objArr, i3, i, (Object) null);
            if (i3 < objArr.length / 2) {
                objArr = Arrays.copyOf(objArr, i3);
            }
            fwfVar = new fwf(hv9.r(i3, objArr), comparator);
        }
        this.b = fwfVar.g.size();
        this.c = true;
        return fwfVar;
    }
}

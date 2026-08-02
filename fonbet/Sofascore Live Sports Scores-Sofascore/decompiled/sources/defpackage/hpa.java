package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hpa {
    public final int a;
    public final gpa[] b;
    public final wj9 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public hpa(int i, gpa[] gpaVarArr, wj9 wj9Var, List list, int i2) {
        this.a = i;
        this.b = gpaVarArr;
        this.c = wj9Var;
        this.d = list;
        this.e = i2;
        int i3 = 0;
        for (gpa gpaVar : gpaVarArr) {
            i3 = Math.max(i3, gpaVar.n);
        }
        this.f = i3;
        int i4 = i3 + this.e;
        this.g = i4 >= 0 ? i4 : 0;
    }

    public final gpa[] a(int i, int i2, int i3) {
        gpa[] gpaVarArr = this.b;
        int length = gpaVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            gpa gpaVar = gpaVarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((o39) this.d.get(i5)).a;
            int i9 = i;
            gpaVar.l(i9, ((int[]) this.c.c)[i6], i2, i3, this.a, i6);
            Unit unit = Unit.a;
            i6 += i8;
            i4++;
            i = i9;
            i5 = i7;
        }
        return gpaVarArr;
    }
}

package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ql5 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public Object f;
    public Object g;

    public ql5(int[] iArr) {
        this.a = 2;
        this.e = iArr;
        yap yapVar = new yap(-1, -1);
        this.f = yapVar;
        this.g = yapVar;
    }

    public VolumeProvider a() {
        ql5 ql5Var;
        if (((VolumeProvider) this.f) != null) {
            ql5Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            ql5Var = this;
            ql5Var.f = new qxk(ql5Var, this.b, this.c, this.d, (String) this.e);
        } else {
            ql5Var = this;
            ql5Var.f = new rxk(ql5Var, ql5Var.b, ql5Var.c, ql5Var.d);
        }
        return (VolumeProvider) ql5Var.f;
    }

    public void b() {
        this.b = 1;
        this.f = (bjc) this.e;
        this.d = 0;
    }

    public boolean c() {
        xic b = ((bjc) this.f).b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.d).get(a + b.a) == 0) || this.c == 65039;
    }

    public void d() {
        if (this.c == 0) {
            return;
        }
        HashMap hashMap = ((yap) this.g).d;
        int[] iArr = (int[]) this.e;
        yap yapVar = (yap) hashMap.get(Integer.valueOf(iArr[this.b]));
        while (true) {
            int i = (yapVar.b - yapVar.a) + 1;
            int i2 = this.c;
            if (i > i2) {
                return;
            }
            int i3 = this.b + i;
            this.b = i3;
            this.g = yapVar;
            int i4 = i2 - i;
            this.c = i4;
            if (i4 > 0) {
                yapVar = (yap) yapVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public void e() {
        yap yapVar = ((yap) this.g).c;
        if (yapVar != null) {
            this.g = yapVar;
        } else {
            this.g = (yap) this.f;
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
            }
            if (this.d > 0) {
                this.b++;
            }
        }
        d();
    }

    public void f(yap yapVar, StringBuilder sb) {
        for (yap yapVar2 : yapVar.d.values()) {
            sb.append("  ");
            sb.append(yapVar);
            sb.append(" -> ");
            sb.append(yapVar2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, yapVar2.a, Math.min(iArr.length, yapVar2.b + 1))));
            sb.append("\"]\n");
            f(yapVar2, sb);
        }
    }

    public boolean g(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.e;
        int length = iArr.length;
        int min = Math.min(length, i2);
        if (min - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= min; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("digraph {\n");
                f((yap) this.f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ql5(ejg ejgVar, int i, int i2, int i3, String str) {
        this.a = 1;
        this.g = ejgVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public ql5(bjc bjcVar) {
        this.a = 0;
        this.b = 1;
        this.e = bjcVar;
        this.f = bjcVar;
    }
}

package defpackage;

import android.util.Log;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.moloco.sdk.internal.n;
import com.moloco.sdk.internal.ortb.model.q;
import com.moloco.sdk.internal.ortb.model.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kn4 {
    public final int a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kn4(int i) {
        this.c = new fp4(27);
        this.d = new wmb(0);
        this.e = new HashMap();
        this.f = new HashMap();
        this.a = i;
    }

    public long a(int i, int i2) {
        int i3;
        wj9 wj9Var = (wj9) this.c;
        int[] iArr = (int[]) wj9Var.b;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) wj9Var.c;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            t3a.a("width must be >= 0");
        }
        return cn3.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public void b(int i, Class cls) {
        NavigableMap h = h(cls);
        Integer num = (Integer) h.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                h.remove(Integer.valueOf(i));
                return;
            } else {
                h.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void c(int i) {
        String str;
        while (this.b > i) {
            Object I = ((fp4) this.c).I();
            w1a.l(I);
            m92 e = e(I.getClass());
            this.b -= e.b() * e.a(I);
            b(e.a(I), I.getClass());
            switch (e.a) {
                case 0:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                e.a(I);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002d, B:18:0x003d, B:19:0x0041, B:20:0x0060, B:25:0x004a, B:27:0x0056, B:28:0x005a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002d, B:18:0x003d, B:19:0x0041, B:20:0x0060, B:25:0x004a, B:27:0x0056, B:28:0x005a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Object d(int i, Class cls) {
        boolean z;
        vmb vmbVar;
        int i2;
        try {
            Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.b) != 0 && this.a / i2 < 2 && num.intValue() > i * 8)) {
                z = false;
                wmb wmbVar = (wmb) this.d;
                if (z) {
                    h0f h0fVar = (h0f) ((ArrayDeque) wmbVar.b).poll();
                    if (h0fVar == null) {
                        h0fVar = wmbVar.R();
                    }
                    vmbVar = (vmb) h0fVar;
                    vmbVar.b = i;
                    vmbVar.c = cls;
                } else {
                    int intValue = num.intValue();
                    h0f h0fVar2 = (h0f) ((ArrayDeque) wmbVar.b).poll();
                    if (h0fVar2 == null) {
                        h0fVar2 = wmbVar.R();
                    }
                    vmbVar = (vmb) h0fVar2;
                    vmbVar.b = intValue;
                    vmbVar.c = cls;
                }
            }
            z = true;
            wmb wmbVar2 = (wmb) this.d;
            if (z) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return g(vmbVar, cls);
    }

    public m92 e(Class cls) {
        m92 m92Var;
        HashMap hashMap = (HashMap) this.f;
        m92 m92Var2 = (m92) hashMap.get(cls);
        if (m92Var2 != null) {
            return m92Var2;
        }
        if (cls.equals(int[].class)) {
            m92Var = new m92(1);
        } else {
            if (!cls.equals(byte[].class)) {
                a70.p("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            m92Var = new m92(0);
        }
        hashMap.put(cls, m92Var);
        return m92Var;
    }

    public hpa f(int i) {
        mu4 b = ((lpa) this.e).b(i);
        int i2 = b.a;
        int size = b.b.size();
        int i3 = 0;
        gpa[] gpaVarArr = new gpa[size];
        int i4 = 0;
        int i5 = (size == 0 || i2 + size == this.a) ? 0 : this.b;
        while (true) {
            List list = b.b;
            if (i3 >= size) {
                return new hpa(i, gpaVarArr, (wj9) this.f, list, i5);
            }
            int i6 = (int) ((o39) list.get(i3)).a;
            int i7 = i5;
            gpa R = ((cpa) this.d).R(i2 + i3, i4, i6, i7, a(i4, i6));
            i5 = i7;
            i4 += i6;
            Unit unit = Unit.a;
            gpaVarArr[i3] = R;
            i3++;
        }
    }

    public Object g(vmb vmbVar, Class cls) {
        m92 e = e(cls);
        Object B = ((fp4) this.c).B(vmbVar);
        if (B != null) {
            this.b -= e.b() * e.a(B);
            b(e.a(B), cls);
        }
        if (B != null) {
            return B;
        }
        int i = vmbVar.b;
        switch (e.a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap h(Class cls) {
        HashMap hashMap = (HashMap) this.e;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public boolean i() {
        return Objects.equals(((b) this.c).o, MimeTypes.AUDIO_RAW);
    }

    public synchronized void j(Object obj) {
        Class<?> cls = obj.getClass();
        m92 e = e(cls);
        int a = e.a(obj);
        int b = e.b() * a;
        if (b <= this.a / 2) {
            wmb wmbVar = (wmb) this.d;
            h0f h0fVar = (h0f) ((ArrayDeque) wmbVar.b).poll();
            if (h0fVar == null) {
                h0fVar = wmbVar.R();
            }
            vmb vmbVar = (vmb) h0fVar;
            vmbVar.b = a;
            vmbVar.c = cls;
            ((fp4) this.c).G(vmbVar, obj);
            NavigableMap h = h(cls);
            Integer num = (Integer) h.get(Integer.valueOf(vmbVar.b));
            Integer valueOf = Integer.valueOf(vmbVar.b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            h.put(valueOf, Integer.valueOf(i));
            this.b += b;
            c(this.a);
        }
    }

    public kn4(wj9 wj9Var, int i, int i2, cpa cpaVar, lpa lpaVar) {
        this.f = wj9Var;
        this.c = wj9Var;
        this.a = i;
        this.b = i2;
        this.d = cpaVar;
        this.e = lpaVar;
    }

    public kn4(int i, e eVar, int i2, n nVar, q qVar, s sVar) {
        this.a = i;
        this.c = eVar;
        this.b = i2;
        this.d = nVar;
        this.e = qVar;
        this.f = sVar;
    }

    public kn4(b bVar, b bVar2, int i, int i2, do0 do0Var, fo0 fo0Var) {
        this.c = bVar;
        this.d = bVar2;
        this.a = i;
        this.b = i2;
        this.e = do0Var;
        this.f = fo0Var;
    }
}

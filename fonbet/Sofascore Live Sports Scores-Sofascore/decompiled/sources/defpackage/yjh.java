package defpackage;

import android.graphics.Bitmap;
import com.ironsource.U3;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yjh {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final wmb a = new wmb(1);
    public final fp4 b = new fp4(27);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return U3.j.d + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String c = c(kik.r(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(c);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int s = kik.s(config) * i * i2;
        wmb wmbVar = this.a;
        ArrayDeque arrayDeque = (ArrayDeque) wmbVar.b;
        h0f h0fVar = (h0f) arrayDeque.poll();
        if (h0fVar == null) {
            h0fVar = wmbVar.R();
        }
        xjh xjhVar = (xjh) h0fVar;
        xjhVar.b = s;
        xjhVar.c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = e;
        } else {
            int i3 = wjh.a[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(s));
            if (num == null || num.intValue() > s * 8) {
                i4++;
            } else if (num.intValue() != s || (config2 != null ? !config2.equals(config) : config != null)) {
                wmbVar.D(xjhVar);
                int intValue = num.intValue();
                Object obj = (h0f) arrayDeque.poll();
                if (obj == null) {
                    obj = wmbVar.R();
                }
                xjhVar = (xjh) obj;
                xjhVar.b = intValue;
                xjhVar.c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.B(xjhVar);
        if (bitmap != null) {
            a(Integer.valueOf(xjhVar.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int r = kik.r(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        wmb wmbVar = this.a;
        h0f h0fVar = (h0f) ((ArrayDeque) wmbVar.b).poll();
        if (h0fVar == null) {
            h0fVar = wmbVar.R();
        }
        xjh xjhVar = (xjh) h0fVar;
        xjhVar.b = r;
        xjhVar.c = config;
        this.b.G(xjhVar, bitmap);
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num = (Integer) d2.get(Integer.valueOf(xjhVar.b));
        d2.put(Integer.valueOf(xjhVar.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder q = fc6.q("SizeConfigStrategy{groupedMap=");
        q.append(this.b);
        q.append(", sortedSizes=(");
        HashMap hashMap = this.c;
        for (Map.Entry entry : hashMap.entrySet()) {
            q.append(entry.getKey());
            q.append('[');
            q.append(entry.getValue());
            q.append("], ");
        }
        if (!hashMap.isEmpty()) {
            q.replace(q.length() - 2, q.length(), "");
        }
        q.append(")}");
        return q.toString();
    }
}

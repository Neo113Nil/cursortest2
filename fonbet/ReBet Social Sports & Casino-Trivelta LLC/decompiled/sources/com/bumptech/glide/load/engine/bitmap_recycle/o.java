package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class o implements l {
    private static final Bitmap.Config[] ALPHA_8_IN_CONFIGS;
    private static final Bitmap.Config[] ARGB_4444_IN_CONFIGS;
    private static final Bitmap.Config[] ARGB_8888_IN_CONFIGS;
    private static final Bitmap.Config[] RGBA_F16_IN_CONFIGS;
    private static final Bitmap.Config[] RGB_565_IN_CONFIGS;

    /* renamed from: a, reason: collision with root package name */
    public final c f29731a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final g f29732b = new g();

    /* renamed from: c, reason: collision with root package name */
    public final Map f29733c = new HashMap();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        public final c f29734a;

        /* renamed from: b, reason: collision with root package name */
        public int f29735b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f29736c;

        public b(c cVar) {
            this.f29734a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f29734a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f29735b = i10;
            this.f29736c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f29735b == bVar.f29735b && com.bumptech.glide.util.l.e(this.f29736c, bVar.f29736c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f29735b * 31;
            Bitmap.Config config = this.f29736c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f29735b, this.f29736c);
        }
    }

    public static class c extends com.bumptech.glide.load.engine.bitmap_recycle.c {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        ARGB_8888_IN_CONFIGS = configArr;
        RGBA_F16_IN_CONFIGS = configArr;
        RGB_565_IN_CONFIGS = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        ARGB_4444_IN_CONFIGS = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        ALPHA_8_IN_CONFIGS = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public static Bitmap.Config[] i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return RGBA_F16_IN_CONFIGS;
            }
        }
        int i10 = a.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : ALPHA_8_IN_CONFIGS : ARGB_4444_IN_CONFIGS : RGB_565_IN_CONFIGS : ARGB_8888_IN_CONFIGS;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(Bitmap bitmap) {
        return h(com.bumptech.glide.util.l.i(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String b(int i10, int i11, Bitmap.Config config) {
        return h(com.bumptech.glide.util.l.h(i10, i11, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void c(Bitmap bitmap) {
        b e10 = this.f29731a.e(com.bumptech.glide.util.l.i(bitmap), bitmap.getConfig());
        this.f29732b.d(e10, bitmap);
        NavigableMap j10 = j(bitmap.getConfig());
        Integer num = (Integer) j10.get(Integer.valueOf(e10.f29735b));
        j10.put(Integer.valueOf(e10.f29735b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b g10 = g(com.bumptech.glide.util.l.h(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f29732b.a(g10);
        if (bitmap != null) {
            f(Integer.valueOf(g10.f29735b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int e(Bitmap bitmap) {
        return com.bumptech.glide.util.l.i(bitmap);
    }

    public final void f(Integer num, Bitmap bitmap) {
        NavigableMap j10 = j(bitmap.getConfig());
        Integer num2 = (Integer) j10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j10.remove(num);
                return;
            } else {
                j10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    public final b g(int i10, Bitmap.Config config) {
        b e10 = this.f29731a.e(i10, config);
        Bitmap.Config[] i11 = i(config);
        int length = i11.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            Bitmap.Config config2 = i11[i12];
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i10));
            if (num == null || num.intValue() > i10 * 8) {
                i12++;
            } else if (num.intValue() != i10 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f29731a.c(e10);
                return this.f29731a.e(num.intValue(), config2);
            }
        }
        return e10;
    }

    public final NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f29733c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f29733c.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f29732b.f();
        if (bitmap != null) {
            f(Integer.valueOf(com.bumptech.glide.util.l.i(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f29732b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f29733c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f29733c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}

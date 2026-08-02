package com.ironsource;

import android.os.Debug;
import defpackage.fc6;
import defpackage.lnb;
import defpackage.wv8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Kb {
    private final int a;
    private final int b;
    private final int c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.Kb$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0185a implements a {
            @Override // com.ironsource.Kb.a
            @NotNull
            public Kb get() {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                int i = memoryInfo.dalvikPss;
                int i2 = memoryInfo.nativePss;
                return new Kb(i, i2, Math.max(0, (memoryInfo.getTotalPss() - i2) - i));
            }
        }

        @NotNull
        Kb get();
    }

    public Kb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static /* synthetic */ Kb a(Kb kb, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kb.a;
        }
        if ((i4 & 2) != 0) {
            i2 = kb.b;
        }
        if ((i4 & 4) != 0) {
            i3 = kb.c;
        }
        return kb.a(i, i2, i3);
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kb)) {
            return false;
        }
        Kb kb = (Kb) obj;
        return this.a == kb.a && this.b == kb.b && this.c == kb.c;
    }

    public final int f() {
        return this.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @NotNull
    public String toString() {
        return fc6.h(this.c, ")", lnb.s(this.a, this.b, "MemoryInfo(javaHeapKb=", ", nativeHeapKb=", ", sharedOtherKb="));
    }

    @NotNull
    public final Kb a(int i, int i2, int i3) {
        return new Kb(i, i2, i3);
    }

    public final int a() {
        return this.a;
    }
}

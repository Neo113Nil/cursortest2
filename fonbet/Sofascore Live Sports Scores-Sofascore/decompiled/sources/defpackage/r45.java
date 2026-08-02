package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r45 implements e3g {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;

    public r45(int i) {
        switch (i) {
            case 1:
                this.a = true;
                this.d = new x0d();
                break;
            default:
                this.a = true;
                this.d = new ArrayDeque();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:7:0x000b, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:17:0x0022, B:20:0x002a), top: B:6:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        boolean z;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (!arrayDeque.isEmpty()) {
                if (!this.b && this.a) {
                    z = false;
                    if (z) {
                        break;
                    }
                    Runnable runnable = (Runnable) arrayDeque.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                z = true;
                if (z) {
                }
            }
        } finally {
            this.c = false;
        }
    }

    public void b() {
        x0d x0dVar = (x0d) this.d;
        Object[] objArr = x0dVar.c;
        long[] jArr = x0dVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof l0d) {
                                l0d l0dVar = (l0d) obj;
                                Object[] objArr2 = l0dVar.a;
                                int i4 = l0dVar.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        x0dVar.a();
    }
}

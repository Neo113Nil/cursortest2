package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3694q4 {
    public final C3745s4 a;
    public final C3719r4 b;

    public C3694q4(C3745s4 c3745s4, C3719r4 c3719r4) {
        c3745s4.getClass();
        c3719r4.getClass();
        this.a = c3745s4;
        this.b = c3719r4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[LOOP:0: B:11:0x004a->B:13:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        C3564l4 c3564l4;
        int i;
        if (sq3Var instanceof C3564l4) {
            c3564l4 = (C3564l4) sq3Var;
            int i2 = c3564l4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3564l4.c = i2 - Integer.MIN_VALUE;
                Object obj = c3564l4.a;
                lu3 lu3Var = lu3.a;
                i = c3564l4.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3487i4 c3487i4 = (C3487i4) this.b.b.getValue();
                    c3564l4.c = 1;
                    obj = c3487i4.a(c3564l4);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                for (Config config : (Iterable) obj) {
                    config.getType();
                    this.a.b.put(config.getType(), config);
                }
                return Unit.a;
            }
        }
        c3564l4 = new C3564l4(this, sq3Var);
        Object obj2 = c3564l4.a;
        lu3 lu3Var2 = lu3.a;
        i = c3564l4.c;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        C3642o4 c3642o4;
        int i;
        int i2;
        if (sq3Var instanceof C3642o4) {
            c3642o4 = (C3642o4) sq3Var;
            int i3 = c3642o4.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3642o4.c = i3 - Integer.MIN_VALUE;
                Object obj = c3642o4.a;
                Object obj2 = lu3.a;
                i = c3642o4.c;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.a.a.getAndSet(true)) {
                        return Unit.a;
                    }
                    c3642o4.c = 1;
                    if (a(c3642o4) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                String[] strArr = C3927z4.a;
                for (i2 = 0; i2 < 5; i2++) {
                    String str = strArr[i2];
                    if (this.a.b.get(str) == null) {
                        this.a.b.put(str, AbstractC3798u5.a(str));
                    }
                }
                xw3.L(this.b.a, null, null, new C3668p4(this, null), 3);
                return Unit.a;
            }
        }
        c3642o4 = new C3642o4(this, sq3Var);
        Object obj3 = c3642o4.a;
        Object obj22 = lu3.a;
        i = c3642o4.c;
        if (i != 0) {
        }
        String[] strArr2 = C3927z4.a;
        while (i2 < 5) {
        }
        xw3.L(this.b.a, null, null, new C3668p4(this, null), 3);
        return Unit.a;
    }

    public final Config a(Class cls) {
        cls.getClass();
        String a = B4.a(cls);
        Config config = (Config) this.a.b.get(a);
        if (config == null) {
            String[] strArr = C3927z4.a;
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                if (this.a.b.get(str) == null) {
                    this.a.b.put(str, AbstractC3798u5.a(str));
                }
            }
            config = (Config) this.a.b.get(a);
            xw3.L(this.b.a, null, null, new C3616n4(this, null), 3);
        }
        config.getClass();
        return config;
    }
}

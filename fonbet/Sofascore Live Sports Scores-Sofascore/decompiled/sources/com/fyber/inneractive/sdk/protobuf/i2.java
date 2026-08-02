package com.fyber.inneractive.sdk.protobuf;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.i3c;
import defpackage.ilg;
import defpackage.lnb;
import defpackage.pvd;
import defpackage.sw9;
import defpackage.wt3;
import defpackage.zzl;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i2 implements t2 {
    public static final int[] q = new int[0];
    public static final Unsafe r;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final d2 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final k2 l;
    public final t1 m;
    public final o3 n;
    public final j0 o;
    public final z1 p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new s3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        r = unsafe;
    }

    public i2(int[] iArr, Object[] objArr, int i, int i2, d2 d2Var, boolean z, int[] iArr2, int i3, int i4, k2 k2Var, t1 t1Var, o3 o3Var, j0 j0Var, z1 z1Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = d2Var instanceof z0;
        this.h = z;
        this.f = j0Var != null && (d2Var instanceof GeneratedMessageLite$ExtendableMessage);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = k2Var;
        this.m = t1Var;
        this.n = o3Var;
        this.o = j0Var;
        this.e = d2Var;
        this.p = z1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b83  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e7  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, c0 c0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Map.Entry entry2;
        Iterator it2;
        int length2;
        c0Var.getClass();
        int i6 = 267386880;
        int i7 = 0;
        int i8 = 1;
        int i9 = 1048575;
        if (q4.ASCENDING == q4.DESCENDING) {
            this.n.getClass();
            ((z0) obj).unknownFields.a(c0Var);
            if (this.f) {
                this.o.getClass();
                n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                if (!n0Var.a.isEmpty()) {
                    boolean z = n0Var.c;
                    e3 e3Var = n0Var.a;
                    if (z) {
                        if (e3Var.g == null) {
                            e3Var.g = new x2(e3Var);
                        }
                        it2 = new o1(new w2(e3Var.g.b));
                    } else {
                        if (e3Var.g == null) {
                            e3Var.g = new x2(e3Var);
                        }
                        it2 = new w2(e3Var.g.b);
                    }
                    entry2 = (Map.Entry) it2.next();
                    for (length2 = this.a.length - 3; length2 >= 0; length2 -= 3) {
                        int[] iArr = this.a;
                        int i10 = iArr[length2 + 1];
                        int i11 = iArr[length2];
                        while (entry2 != null) {
                            this.o.getClass();
                            if (((w0) entry2.getKey()).b > i11) {
                                this.o.getClass();
                                j0.a(c0Var, entry2);
                                entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                            } else {
                                switch ((i10 & 267386880) >>> 20) {
                                    case 0:
                                        if (a(length2, obj)) {
                                            c0Var.a(i11, x3.c.c(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        if (a(length2, obj)) {
                                            c0Var.a(i11, x3.c.d(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        if (a(length2, obj)) {
                                            c0Var.a.b(i11, x3.d(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        if (a(length2, obj)) {
                                            c0Var.a.b(i11, x3.d(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 4:
                                        if (a(length2, obj)) {
                                            c0Var.a.b(i11, x3.c(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 5:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i11, x3.d(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 6:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i11, x3.c(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 7:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i11, x3.c.a(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 8:
                                        if (a(length2, obj)) {
                                            a(i11, x3.e(obj, i10 & 1048575), c0Var);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 9:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i11, (d2) x3.e(obj, i10 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 10:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i11, (s) x3.e(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 11:
                                        if (a(length2, obj)) {
                                            c0Var.a.d(i11, x3.c(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 12:
                                        if (a(length2, obj)) {
                                            c0Var.a.b(i11, x3.c(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 13:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i11, x3.c(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 14:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i11, x3.d(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 15:
                                        if (a(length2, obj)) {
                                            c0Var.a(i11, x3.c(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 16:
                                        if (a(length2, obj)) {
                                            c0Var.a(i11, x3.d(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 17:
                                        if (a(length2, obj)) {
                                            c0Var.a(i11, x3.e(obj, i10 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 18:
                                        u2.b(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 19:
                                        u2.f(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 20:
                                        u2.h(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 21:
                                        u2.n(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 22:
                                        u2.g(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 23:
                                        u2.e(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 24:
                                        u2.d(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 25:
                                        u2.a(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 26:
                                        u2.b(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var);
                                        break;
                                    case 27:
                                        u2.b(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, c(length2));
                                        break;
                                    case 28:
                                        u2.a(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var);
                                        break;
                                    case 29:
                                        u2.m(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 30:
                                        u2.c(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 31:
                                        u2.i(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 32:
                                        u2.j(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 33:
                                        u2.k(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 34:
                                        u2.l(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, false);
                                        break;
                                    case 35:
                                        u2.b(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 36:
                                        u2.f(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 37:
                                        u2.h(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 38:
                                        u2.n(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 39:
                                        u2.g(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 40:
                                        u2.e(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 41:
                                        u2.d(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 42:
                                        u2.a(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 43:
                                        u2.m(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 44:
                                        u2.c(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 45:
                                        u2.i(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 46:
                                        u2.j(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 47:
                                        u2.k(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 48:
                                        u2.l(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, true);
                                        break;
                                    case 49:
                                        u2.a(this.a[length2], (List) x3.e(obj, i10 & 1048575), c0Var, c(length2));
                                        break;
                                    case 50:
                                        if (x3.e(obj, i10 & 1048575) != null) {
                                            z1 z1Var = this.p;
                                            Object b = b(length2);
                                            z1Var.getClass();
                                            b.getClass();
                                            pvd.j();
                                            return;
                                        }
                                        break;
                                    case 51:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a(i11, ((Double) x3.e(obj, i10 & 1048575)).doubleValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 52:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a(i11, ((Float) x3.e(obj, i10 & 1048575)).floatValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 53:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.b(i11, ((Long) x3.e(obj, i10 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 54:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.b(i11, ((Long) x3.e(obj, i10 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 55:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.b(i11, ((Integer) x3.e(obj, i10 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 56:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.a(i11, ((Long) x3.e(obj, i10 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 57:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.a(i11, ((Integer) x3.e(obj, i10 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 58:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.a(i11, ((Boolean) x3.e(obj, i10 & 1048575)).booleanValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 59:
                                        if (a(obj, i11, length2)) {
                                            a(i11, x3.e(obj, i10 & 1048575), c0Var);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 60:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.a(i11, (d2) x3.e(obj, i10 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 61:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.a(i11, (s) x3.e(obj, i10 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 62:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.d(i11, ((Integer) x3.e(obj, i10 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 63:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.b(i11, ((Integer) x3.e(obj, i10 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 64:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.a(i11, ((Integer) x3.e(obj, i10 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 65:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a.a(i11, ((Long) x3.e(obj, i10 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 66:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a(i11, ((Integer) x3.e(obj, i10 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 67:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a(i11, ((Long) x3.e(obj, i10 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 68:
                                        if (a(obj, i11, length2)) {
                                            c0Var.a(i11, x3.e(obj, i10 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
                        switch ((i10 & 267386880) >>> 20) {
                        }
                    }
                    while (entry2 != null) {
                        this.o.getClass();
                        j0.a(c0Var, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            entry2 = null;
            it2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
            return;
        }
        if (this.h) {
            b(obj, c0Var);
            return;
        }
        if (this.f) {
            this.o.getClass();
            n0 n0Var2 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (!n0Var2.a.isEmpty()) {
                it = n0Var2.d();
                entry = (Map.Entry) it.next();
                length = this.a.length;
                Unsafe unsafe = r;
                i = 0;
                int i12 = 0;
                int i13 = 1048575;
                while (i < length) {
                    int[] iArr2 = this.a;
                    int i14 = iArr2[i + 1];
                    int i15 = i6;
                    int i16 = iArr2[i];
                    int i17 = (i14 & i15) >>> 20;
                    int i18 = i9;
                    if (i17 <= 17) {
                        int i19 = iArr2[i + 2];
                        int i20 = i19 & i18;
                        if (i20 != i13) {
                            i12 = unsafe.getInt(obj, i20);
                            i13 = i20;
                        }
                        i2 = i8 << (i19 >>> 20);
                    } else {
                        i2 = i7;
                    }
                    while (entry != null) {
                        this.o.getClass();
                        if (((w0) entry.getKey()).b > i16) {
                            long j = i14 & i18;
                            switch (i17) {
                                case 0:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a(i16, x3.c.c(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 1:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a(i16, x3.c.d(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 2:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.b(i16, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 3:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.b(i16, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 4:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.b(i16, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 5:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.a(i16, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 6:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.a(i16, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 7:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.a(i16, x3.c.a(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 8:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        a(i16, unsafe.getObject(obj, j), c0Var);
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 9:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.a(i16, (d2) unsafe.getObject(obj, j), c(i));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 10:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.a(i16, (s) unsafe.getObject(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 11:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.d(i16, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 12:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.b(i16, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 13:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.a(i16, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 14:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a.a(i16, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 15:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a(i16, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 16:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a(i16, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 17:
                                    i3 = 1;
                                    i4 = 0;
                                    if ((i12 & i2) != 0) {
                                        c0Var.a(i16, unsafe.getObject(obj, j), c(i));
                                    }
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 18:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.b(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 19:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.f(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 20:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.h(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 21:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.n(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 22:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.g(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 23:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.e(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 24:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.d(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 25:
                                    i3 = 1;
                                    i5 = 0;
                                    u2.a(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 26:
                                    i3 = 1;
                                    u2.b(this.a[i], (List) unsafe.getObject(obj, j), c0Var);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 27:
                                    i3 = 1;
                                    u2.b(this.a[i], (List) unsafe.getObject(obj, j), c0Var, c(i));
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 28:
                                    i3 = 1;
                                    u2.a(this.a[i], (List) unsafe.getObject(obj, j), c0Var);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 29:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.m(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 30:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.c(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 31:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.i(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 32:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.j(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 33:
                                    i5 = 0;
                                    i3 = 1;
                                    u2.k(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 34:
                                    i3 = 1;
                                    i5 = 0;
                                    u2.l(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i4 = i5;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 35:
                                    i3 = 1;
                                    u2.b(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 36:
                                    i3 = 1;
                                    u2.f(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 37:
                                    i3 = 1;
                                    u2.h(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 38:
                                    i3 = 1;
                                    u2.n(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 39:
                                    i3 = 1;
                                    u2.g(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 40:
                                    i3 = 1;
                                    u2.e(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 41:
                                    i3 = 1;
                                    u2.d(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 42:
                                    i3 = 1;
                                    u2.a(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 43:
                                    i3 = 1;
                                    u2.m(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 44:
                                    i3 = 1;
                                    u2.c(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 45:
                                    i3 = 1;
                                    u2.i(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 46:
                                    i3 = 1;
                                    u2.j(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 47:
                                    i3 = 1;
                                    u2.k(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 48:
                                    i3 = 1;
                                    u2.l(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 49:
                                    u2.a(this.a[i], (List) unsafe.getObject(obj, j), c0Var, c(i));
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 50:
                                    if (unsafe.getObject(obj, j) != null) {
                                        z1 z1Var2 = this.p;
                                        Object b2 = b(i);
                                        z1Var2.getClass();
                                        b2.getClass();
                                        pvd.j();
                                        break;
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 51:
                                    if (a(obj, i16, i)) {
                                        c0Var.a(i16, ((Double) x3.e(obj, j)).doubleValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 52:
                                    if (a(obj, i16, i)) {
                                        c0Var.a(i16, ((Float) x3.e(obj, j)).floatValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 53:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.b(i16, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 54:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.b(i16, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 55:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.b(i16, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 56:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.a(i16, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 57:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.a(i16, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 58:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.a(i16, ((Boolean) x3.e(obj, j)).booleanValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 59:
                                    if (a(obj, i16, i)) {
                                        a(i16, unsafe.getObject(obj, j), c0Var);
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 60:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.a(i16, (d2) unsafe.getObject(obj, j), c(i));
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 61:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.a(i16, (s) unsafe.getObject(obj, j));
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 62:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.d(i16, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 63:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.b(i16, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 64:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.a(i16, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 65:
                                    if (a(obj, i16, i)) {
                                        c0Var.a.a(i16, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 66:
                                    if (a(obj, i16, i)) {
                                        c0Var.a(i16, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 67:
                                    if (a(obj, i16, i)) {
                                        c0Var.a(i16, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                case 68:
                                    if (a(obj, i16, i)) {
                                        c0Var.a(i16, unsafe.getObject(obj, j), c(i));
                                    }
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                                default:
                                    i3 = 1;
                                    i4 = 0;
                                    i += 3;
                                    i8 = i3;
                                    i7 = i4;
                                    i6 = i15;
                                    i9 = i18;
                            }
                            return;
                        }
                        this.o.getClass();
                        j0.a(c0Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j2 = i14 & i18;
                    switch (i17) {
                    }
                    return;
                }
                while (entry != null) {
                    this.o.getClass();
                    j0.a(c0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                this.n.getClass();
                ((z0) obj).unknownFields.a(c0Var);
            }
        }
        it = null;
        entry = null;
        length = this.a.length;
        Unsafe unsafe2 = r;
        i = 0;
        int i122 = 0;
        int i132 = 1048575;
        while (i < length) {
        }
        while (entry != null) {
        }
        this.n.getClass();
        ((z0) obj).unknownFields.a(c0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int b(Object obj) {
        int i;
        int i2;
        int b;
        int a;
        int i3;
        int b2;
        int a2;
        int i4;
        int b3;
        int b4;
        int serializedSize;
        int a3;
        int b5;
        int b6;
        int a4;
        int a5;
        int b7;
        int a6;
        int a7;
        int b8;
        int c;
        int b9;
        int a8;
        int b10;
        int i5 = 267386880;
        int i6 = 1048575;
        int i7 = 1;
        int i8 = 0;
        if (this.h) {
            Unsafe unsafe = r;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int[] iArr = this.a;
                if (i9 >= iArr.length) {
                    this.n.getClass();
                    return ((z0) obj).unknownFields.a() + i10;
                }
                int i11 = iArr[i9 + 1];
                int i12 = (i11 & i5) >>> 20;
                int i13 = iArr[i9];
                int i14 = i5;
                long j = i11 & 1048575;
                if (i12 >= FieldType.DOUBLE_LIST_PACKED.id() && i12 <= FieldType.SINT64_LIST_PACKED.id()) {
                    int i15 = this.a[i9 + 2];
                }
                switch (i12) {
                    case 0:
                        if (a(i9, obj)) {
                            a5 = g2.a(i13, 8, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 1:
                        if (a(i9, obj)) {
                            a5 = g2.a(i13, 4, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 2:
                        if (a(i9, obj)) {
                            long d = x3.d(obj, j);
                            b7 = b0.b(i13);
                            a6 = b0.a(d);
                            a7 = a6 + b7;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 3:
                        if (a(i9, obj)) {
                            a7 = b0.a(x3.d(obj, j)) + b0.b(i13);
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 4:
                        if (a(i9, obj)) {
                            int c2 = x3.c(obj, j);
                            b8 = b0.b(i13);
                            if (c2 >= 0) {
                                c = b0.c(c2);
                                a7 = c + b8;
                                a5 = a7 + i10;
                                i10 = a5;
                                i9 += 3;
                                i5 = i14;
                            }
                            c = 10;
                            a7 = c + b8;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 5:
                        if (a(i9, obj)) {
                            a5 = g2.a(i13, 8, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 6:
                        if (a(i9, obj)) {
                            a5 = g2.a(i13, 4, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 7:
                        if (a(i9, obj)) {
                            a5 = g2.a(i13, 1, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 8:
                        if (a(i9, obj)) {
                            Object e = x3.e(obj, j);
                            if (e instanceof s) {
                                b9 = b0.b(i13);
                                a8 = b0.a((s) e);
                            } else {
                                b9 = b0.b(i13);
                                a8 = b0.a((String) e);
                            }
                            a7 = a8 + b9;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 9:
                        if (a(i9, obj)) {
                            Object e2 = x3.e(obj, j);
                            t2 c3 = c(i9);
                            Class cls = u2.a;
                            int b11 = b0.b(i13);
                            int serializedSize2 = ((b) ((d2) e2)).getSerializedSize(c3);
                            a5 = l0.a(serializedSize2, serializedSize2, b11, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 10:
                        if (a(i9, obj)) {
                            s sVar = (s) x3.e(obj, j);
                            b9 = b0.b(i13);
                            a8 = b0.a(sVar);
                            a7 = a8 + b9;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 11:
                        if (a(i9, obj)) {
                            int c4 = x3.c(obj, j);
                            b9 = b0.b(i13);
                            a8 = b0.c(c4);
                            a7 = a8 + b9;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 12:
                        if (a(i9, obj)) {
                            int c5 = x3.c(obj, j);
                            b9 = b0.b(i13);
                            a8 = b0.a(c5);
                            a7 = a8 + b9;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 13:
                        if (a(i9, obj)) {
                            a5 = g2.a(i13, 4, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 14:
                        if (a(i9, obj)) {
                            a5 = g2.a(i13, 8, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 15:
                        if (a(i9, obj)) {
                            int c6 = x3.c(obj, j);
                            b7 = b0.b(i13);
                            a6 = b0.c(b0.d(c6));
                            a7 = a6 + b7;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 16:
                        if (a(i9, obj)) {
                            long d2 = x3.d(obj, j);
                            b7 = b0.b(i13);
                            a6 = b0.a(b0.b(d2));
                            a7 = a6 + b7;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 17:
                        if (a(i9, obj)) {
                            d2 d2Var = (d2) x3.e(obj, j);
                            t2 c7 = c(i9);
                            b7 = b0.b(i13) * 2;
                            a6 = ((b) d2Var).getSerializedSize(c7);
                            a7 = a6 + b7;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 18:
                        a7 = u2.b(i13, (List) x3.e(obj, j));
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 19:
                        a7 = u2.a(i13, (List) x3.e(obj, j));
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 20:
                        List list = (List) x3.e(obj, j);
                        Class cls2 = u2.a;
                        if (list.size() != 0) {
                            a7 = h2.a(i13, list.size(), u2.c(list));
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        }
                        a7 = 0;
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 21:
                        List list2 = (List) x3.e(obj, j);
                        Class cls3 = u2.a;
                        int size = list2.size();
                        if (size != 0) {
                            a7 = h2.a(i13, size, u2.g(list2));
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        }
                        a7 = 0;
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 22:
                        List list3 = (List) x3.e(obj, j);
                        Class cls4 = u2.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            a7 = h2.a(i13, size2, u2.b(list3));
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        }
                        a7 = 0;
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 23:
                        a7 = u2.b(i13, (List) x3.e(obj, j));
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 24:
                        a7 = u2.a(i13, (List) x3.e(obj, j));
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 25:
                        List list4 = (List) x3.e(obj, j);
                        Class cls5 = u2.a;
                        int size3 = list4.size();
                        i10 = (size3 == 0 ? 0 : (b0.b(i13) + 1) * size3) + i10;
                        i9 += 3;
                        i5 = i14;
                    case 26:
                        a7 = u2.c(i13, (List) x3.e(obj, j));
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 27:
                        List list5 = (List) x3.e(obj, j);
                        t2 c8 = c(i9);
                        Class cls6 = u2.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            b10 = b0.b(i13) * size4;
                            for (int i16 = 0; i16 < size4; i16++) {
                                int serializedSize3 = ((b) ((d2) list5.get(i16))).getSerializedSize(c8);
                                b10 = b0.c(serializedSize3) + serializedSize3 + b10;
                            }
                            i10 = b10 + i10;
                            i9 += 3;
                            i5 = i14;
                        }
                        b10 = 0;
                        i10 = b10 + i10;
                        i9 += 3;
                        i5 = i14;
                    case 28:
                        List list6 = (List) x3.e(obj, j);
                        Class cls7 = u2.a;
                        int size5 = list6.size();
                        if (size5 != 0) {
                            b10 = b0.b(i13) * size5;
                            for (int i17 = 0; i17 < list6.size(); i17++) {
                                b10 = b0.a((s) list6.get(i17)) + b10;
                            }
                            i10 = b10 + i10;
                            i9 += 3;
                            i5 = i14;
                        }
                        b10 = 0;
                        i10 = b10 + i10;
                        i9 += 3;
                        i5 = i14;
                    case 29:
                        List list7 = (List) x3.e(obj, j);
                        Class cls8 = u2.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            a7 = h2.a(i13, size6, u2.f(list7));
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        }
                        a7 = 0;
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 30:
                        List list8 = (List) x3.e(obj, j);
                        Class cls9 = u2.a;
                        int size7 = list8.size();
                        if (size7 != 0) {
                            a7 = h2.a(i13, size7, u2.a(list8));
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        }
                        a7 = 0;
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 31:
                        a7 = u2.a(i13, (List) x3.e(obj, j));
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 32:
                        a7 = u2.b(i13, (List) x3.e(obj, j));
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 33:
                        List list9 = (List) x3.e(obj, j);
                        Class cls10 = u2.a;
                        int size8 = list9.size();
                        if (size8 != 0) {
                            a7 = h2.a(i13, size8, u2.d(list9));
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        }
                        a7 = 0;
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 34:
                        List list10 = (List) x3.e(obj, j);
                        Class cls11 = u2.a;
                        int size9 = list10.size();
                        if (size9 != 0) {
                            a7 = h2.a(i13, size9, u2.e(list10));
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        }
                        a7 = 0;
                        a5 = a7 + i10;
                        i10 = a5;
                        i9 += 3;
                        i5 = i14;
                    case 35:
                        List list11 = (List) unsafe.getObject(obj, j);
                        Class cls12 = u2.a;
                        int size10 = list11.size() * 8;
                        if (size10 > 0) {
                            a5 = l0.a(size10, b0.b(i13), size10, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 36:
                        List list12 = (List) unsafe.getObject(obj, j);
                        Class cls13 = u2.a;
                        int size11 = list12.size() * 4;
                        if (size11 > 0) {
                            a5 = l0.a(size11, b0.b(i13), size11, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 37:
                        int c9 = u2.c((List) unsafe.getObject(obj, j));
                        if (c9 > 0) {
                            a5 = l0.a(c9, b0.b(i13), c9, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 38:
                        int g = u2.g((List) unsafe.getObject(obj, j));
                        if (g > 0) {
                            a5 = l0.a(g, b0.b(i13), g, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 39:
                        int b12 = u2.b((List) unsafe.getObject(obj, j));
                        if (b12 > 0) {
                            a5 = l0.a(b12, b0.b(i13), b12, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 40:
                        List list13 = (List) unsafe.getObject(obj, j);
                        Class cls14 = u2.a;
                        int size12 = list13.size() * 8;
                        if (size12 > 0) {
                            a5 = l0.a(size12, b0.b(i13), size12, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 41:
                        List list14 = (List) unsafe.getObject(obj, j);
                        Class cls15 = u2.a;
                        int size13 = list14.size() * 4;
                        if (size13 > 0) {
                            a5 = l0.a(size13, b0.b(i13), size13, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 42:
                        List list15 = (List) unsafe.getObject(obj, j);
                        Class cls16 = u2.a;
                        int size14 = list15.size();
                        if (size14 > 0) {
                            a5 = l0.a(size14, b0.b(i13), size14, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 43:
                        int f = u2.f((List) unsafe.getObject(obj, j));
                        if (f > 0) {
                            a5 = l0.a(f, b0.b(i13), f, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 44:
                        int a9 = u2.a((List) unsafe.getObject(obj, j));
                        if (a9 > 0) {
                            a5 = l0.a(a9, b0.b(i13), a9, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 45:
                        List list16 = (List) unsafe.getObject(obj, j);
                        Class cls17 = u2.a;
                        int size15 = list16.size() * 4;
                        if (size15 > 0) {
                            a5 = l0.a(size15, b0.b(i13), size15, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 46:
                        List list17 = (List) unsafe.getObject(obj, j);
                        Class cls18 = u2.a;
                        int size16 = list17.size() * 8;
                        if (size16 > 0) {
                            a5 = l0.a(size16, b0.b(i13), size16, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 47:
                        int d3 = u2.d((List) unsafe.getObject(obj, j));
                        if (d3 > 0) {
                            a5 = l0.a(d3, b0.b(i13), d3, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 48:
                        int e3 = u2.e((List) unsafe.getObject(obj, j));
                        if (e3 > 0) {
                            a5 = l0.a(e3, b0.b(i13), e3, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 49:
                        List list18 = (List) x3.e(obj, j);
                        t2 c10 = c(i9);
                        Class cls19 = u2.a;
                        int size17 = list18.size();
                        if (size17 != 0) {
                            b10 = 0;
                            for (int i18 = 0; i18 < size17; i18++) {
                                b10 = ((b) ((d2) list18.get(i18))).getSerializedSize(c10) + (b0.b(i13) * 2) + b10;
                            }
                            i10 = b10 + i10;
                            i9 += 3;
                            i5 = i14;
                        }
                        b10 = 0;
                        i10 = b10 + i10;
                        i9 += 3;
                        i5 = i14;
                    case 50:
                        z1 z1Var = this.p;
                        Object e4 = x3.e(obj, j);
                        Object b13 = b(i9);
                        z1Var.getClass();
                        y1 y1Var = (y1) e4;
                        if (b13 != null) {
                            pvd.j();
                            return 0;
                        }
                        if (y1Var.isEmpty()) {
                            continue;
                        } else {
                            Iterator it = y1Var.entrySet().iterator();
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getKey();
                                entry.getValue();
                                throw null;
                            }
                        }
                        i9 += 3;
                        i5 = i14;
                    case 51:
                        if (a(obj, i13, i9)) {
                            a5 = g2.a(i13, 8, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 52:
                        if (a(obj, i13, i9)) {
                            a5 = g2.a(i13, 4, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 53:
                        if (a(obj, i13, i9)) {
                            long longValue = ((Long) x3.e(obj, j)).longValue();
                            b7 = b0.b(i13);
                            a6 = b0.a(longValue);
                            a7 = a6 + b7;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 54:
                        if (a(obj, i13, i9)) {
                            long longValue2 = ((Long) x3.e(obj, j)).longValue();
                            b7 = b0.b(i13);
                            a6 = b0.a(longValue2);
                            a7 = a6 + b7;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 55:
                        if (a(obj, i13, i9)) {
                            int intValue = ((Integer) x3.e(obj, j)).intValue();
                            b8 = b0.b(i13);
                            if (intValue >= 0) {
                                c = b0.c(intValue);
                                a7 = c + b8;
                                a5 = a7 + i10;
                                i10 = a5;
                                i9 += 3;
                                i5 = i14;
                            }
                            c = 10;
                            a7 = c + b8;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 56:
                        if (a(obj, i13, i9)) {
                            a5 = g2.a(i13, 8, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 57:
                        if (a(obj, i13, i9)) {
                            a5 = g2.a(i13, 4, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 58:
                        if (a(obj, i13, i9)) {
                            a5 = g2.a(i13, 1, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 59:
                        if (a(obj, i13, i9)) {
                            Object e5 = x3.e(obj, j);
                            if (e5 instanceof s) {
                                b9 = b0.b(i13);
                                a8 = b0.a((s) e5);
                            } else {
                                b9 = b0.b(i13);
                                a8 = b0.a((String) e5);
                            }
                            a7 = a8 + b9;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 60:
                        if (a(obj, i13, i9)) {
                            Object e6 = x3.e(obj, j);
                            t2 c11 = c(i9);
                            Class cls20 = u2.a;
                            int b14 = b0.b(i13);
                            int serializedSize4 = ((b) ((d2) e6)).getSerializedSize(c11);
                            a5 = l0.a(serializedSize4, serializedSize4, b14, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 61:
                        if (a(obj, i13, i9)) {
                            s sVar2 = (s) x3.e(obj, j);
                            b9 = b0.b(i13);
                            a8 = b0.a(sVar2);
                            a7 = a8 + b9;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 62:
                        if (a(obj, i13, i9)) {
                            int intValue2 = ((Integer) x3.e(obj, j)).intValue();
                            b9 = b0.b(i13);
                            a8 = b0.c(intValue2);
                            a7 = a8 + b9;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 63:
                        if (a(obj, i13, i9)) {
                            int intValue3 = ((Integer) x3.e(obj, j)).intValue();
                            b9 = b0.b(i13);
                            a8 = b0.a(intValue3);
                            a7 = a8 + b9;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 64:
                        if (a(obj, i13, i9)) {
                            a5 = g2.a(i13, 4, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 65:
                        if (a(obj, i13, i9)) {
                            a5 = g2.a(i13, 8, i10);
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 66:
                        if (a(obj, i13, i9)) {
                            int intValue4 = ((Integer) x3.e(obj, j)).intValue();
                            b7 = b0.b(i13);
                            a6 = b0.c(b0.d(intValue4));
                            a7 = a6 + b7;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 67:
                        if (a(obj, i13, i9)) {
                            long longValue3 = ((Long) x3.e(obj, j)).longValue();
                            b7 = b0.b(i13);
                            a6 = b0.a(b0.b(longValue3));
                            a7 = a6 + b7;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    case 68:
                        if (a(obj, i13, i9)) {
                            d2 d2Var2 = (d2) x3.e(obj, j);
                            t2 c12 = c(i9);
                            b7 = b0.b(i13) * 2;
                            a6 = ((b) d2Var2).getSerializedSize(c12);
                            a7 = a6 + b7;
                            a5 = a7 + i10;
                            i10 = a5;
                            i9 += 3;
                            i5 = i14;
                        } else {
                            i9 += 3;
                            i5 = i14;
                        }
                    default:
                        i9 += 3;
                        i5 = i14;
                }
            }
        } else {
            Unsafe unsafe2 = r;
            int i19 = 1048575;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                int[] iArr2 = this.a;
                if (i20 >= iArr2.length) {
                    this.n.getClass();
                    int a10 = ((z0) obj).unknownFields.a() + i21;
                    if (!this.f) {
                        return a10;
                    }
                    this.o.getClass();
                    return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.b() + a10;
                }
                int i23 = iArr2[i20 + 1];
                int i24 = iArr2[i20];
                int i25 = (i23 & 267386880) >>> 20;
                int i26 = i6;
                if (i25 <= 17) {
                    int i27 = iArr2[i20 + 2];
                    int i28 = i27 & i26;
                    i2 = i7 << (i27 >>> 20);
                    i = i8;
                    if (i28 != i19) {
                        i22 = unsafe2.getInt(obj, i28);
                        i19 = i28;
                    }
                } else {
                    i = i8;
                    i2 = i;
                }
                long j2 = i23 & i26;
                switch (i25) {
                    case 0:
                        if ((i2 & i22) != 0) {
                            i21 = g2.a(i24, 8, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 1:
                        if ((i2 & i22) != 0) {
                            i21 = g2.a(i24, 4, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 2:
                        if ((i2 & i22) != 0) {
                            long j3 = unsafe2.getLong(obj, j2);
                            b = b0.b(i24);
                            a = b0.a(j3);
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 3:
                        if ((i2 & i22) != 0) {
                            long j4 = unsafe2.getLong(obj, j2);
                            b = b0.b(i24);
                            a = b0.a(j4);
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 4:
                        if ((i2 & i22) != 0) {
                            int i29 = unsafe2.getInt(obj, j2);
                            a = b0.b(i24);
                            if (i29 >= 0) {
                                b = b0.c(i29);
                                i4 = b + a;
                                i21 = i4 + i21;
                                i20 += 3;
                                i6 = i26;
                                i8 = i;
                            }
                            b = 10;
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 5:
                        if ((i2 & i22) != 0) {
                            i21 = g2.a(i24, 8, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 6:
                        if ((i2 & i22) != 0) {
                            i21 = g2.a(i24, 4, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 7:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            i7 = i3;
                            i21 = g2.a(i24, i7, i21);
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 8:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            Object object = unsafe2.getObject(obj, j2);
                            if (object instanceof s) {
                                b2 = b0.b(i24);
                                a2 = b0.a((s) object);
                            } else {
                                b2 = b0.b(i24);
                                a2 = b0.a((String) object);
                            }
                            i4 = a2 + b2;
                            i7 = i3;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 9:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            Object object2 = unsafe2.getObject(obj, j2);
                            t2 c13 = c(i20);
                            Class cls21 = u2.a;
                            int b15 = b0.b(i24);
                            int serializedSize5 = ((b) ((d2) object2)).getSerializedSize(c13);
                            i21 = l0.a(serializedSize5, serializedSize5, b15, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 10:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            s sVar3 = (s) unsafe2.getObject(obj, j2);
                            b2 = b0.b(i24);
                            a2 = b0.a(sVar3);
                            i4 = a2 + b2;
                            i7 = i3;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 11:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            int i30 = unsafe2.getInt(obj, j2);
                            b2 = b0.b(i24);
                            a2 = b0.c(i30);
                            i4 = a2 + b2;
                            i7 = i3;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 12:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            int i31 = unsafe2.getInt(obj, j2);
                            b2 = b0.b(i24);
                            a2 = b0.a(i31);
                            i4 = a2 + b2;
                            i7 = i3;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 13:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            i21 = g2.a(i24, 4, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 14:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            i21 = g2.a(i24, 8, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 15:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            int i32 = unsafe2.getInt(obj, j2);
                            b3 = b0.b(i24);
                            a = b0.c(b0.d(i32));
                            b = b3;
                            i7 = i3;
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 16:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            long j5 = unsafe2.getLong(obj, j2);
                            b3 = b0.b(i24);
                            a = b0.a(b0.b(j5));
                            b = b3;
                            i7 = i3;
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 17:
                        i3 = i7;
                        if ((i2 & i22) != 0) {
                            d2 d2Var3 = (d2) unsafe2.getObject(obj, j2);
                            t2 c14 = c(i20);
                            b4 = b0.b(i24) * 2;
                            serializedSize = ((b) d2Var3).getSerializedSize(c14);
                            i4 = serializedSize + b4;
                            i7 = i3;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 18:
                        i4 = u2.b(i24, (List) unsafe2.getObject(obj, j2));
                        i21 = i4 + i21;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 19:
                        i4 = u2.a(i24, (List) unsafe2.getObject(obj, j2));
                        i21 = i4 + i21;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 20:
                        i3 = i7;
                        List list19 = (List) unsafe2.getObject(obj, j2);
                        Class cls22 = u2.a;
                        if (list19.size() != 0) {
                            a3 = h2.a(i24, list19.size(), u2.c(list19));
                            i21 = a3 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        a3 = i;
                        i21 = a3 + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 21:
                        i3 = i7;
                        List list20 = (List) unsafe2.getObject(obj, j2);
                        Class cls23 = u2.a;
                        int size18 = list20.size();
                        if (size18 != 0) {
                            a3 = h2.a(i24, size18, u2.g(list20));
                            i21 = a3 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        a3 = i;
                        i21 = a3 + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 22:
                        i3 = i7;
                        List list21 = (List) unsafe2.getObject(obj, j2);
                        Class cls24 = u2.a;
                        int size19 = list21.size();
                        if (size19 != 0) {
                            a3 = h2.a(i24, size19, u2.b(list21));
                            i21 = a3 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        a3 = i;
                        i21 = a3 + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 23:
                        i4 = u2.b(i24, (List) unsafe2.getObject(obj, j2));
                        i21 = i4 + i21;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 24:
                        i4 = u2.a(i24, (List) unsafe2.getObject(obj, j2));
                        i21 = i4 + i21;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 25:
                        i3 = i7;
                        List list22 = (List) unsafe2.getObject(obj, j2);
                        Class cls25 = u2.a;
                        int size20 = list22.size();
                        i21 = (size20 == 0 ? i : (b0.b(i24) + 1) * size20) + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 26:
                        i4 = u2.c(i24, (List) unsafe2.getObject(obj, j2));
                        i21 = i4 + i21;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 27:
                        i3 = i7;
                        List list23 = (List) unsafe2.getObject(obj, j2);
                        t2 c15 = c(i20);
                        Class cls26 = u2.a;
                        int size21 = list23.size();
                        if (size21 != 0) {
                            b5 = b0.b(i24) * size21;
                            for (int i33 = i; i33 < size21; i33++) {
                                int serializedSize6 = ((b) ((d2) list23.get(i33))).getSerializedSize(c15);
                                b5 += b0.c(serializedSize6) + serializedSize6;
                            }
                            i21 = b5 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        b5 = i;
                        i21 = b5 + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 28:
                        i3 = i7;
                        List list24 = (List) unsafe2.getObject(obj, j2);
                        Class cls27 = u2.a;
                        int size22 = list24.size();
                        if (size22 != 0) {
                            b5 = b0.b(i24) * size22;
                            for (int i34 = i; i34 < list24.size(); i34++) {
                                b5 += b0.a((s) list24.get(i34));
                            }
                            i21 = b5 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        b5 = i;
                        i21 = b5 + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 29:
                        i3 = i7;
                        List list25 = (List) unsafe2.getObject(obj, j2);
                        Class cls28 = u2.a;
                        int size23 = list25.size();
                        if (size23 != 0) {
                            a3 = h2.a(i24, size23, u2.f(list25));
                            i21 = a3 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        a3 = i;
                        i21 = a3 + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 30:
                        i3 = i7;
                        List list26 = (List) unsafe2.getObject(obj, j2);
                        Class cls29 = u2.a;
                        int size24 = list26.size();
                        if (size24 != 0) {
                            a3 = h2.a(i24, size24, u2.a(list26));
                            i21 = a3 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        a3 = i;
                        i21 = a3 + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 31:
                        i4 = u2.a(i24, (List) unsafe2.getObject(obj, j2));
                        i21 = i4 + i21;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 32:
                        i4 = u2.b(i24, (List) unsafe2.getObject(obj, j2));
                        i21 = i4 + i21;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 33:
                        i3 = i7;
                        List list27 = (List) unsafe2.getObject(obj, j2);
                        Class cls30 = u2.a;
                        int size25 = list27.size();
                        if (size25 != 0) {
                            a3 = h2.a(i24, size25, u2.d(list27));
                            i21 = a3 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        a3 = i;
                        i21 = a3 + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 34:
                        i3 = i7;
                        List list28 = (List) unsafe2.getObject(obj, j2);
                        Class cls31 = u2.a;
                        int size26 = list28.size();
                        if (size26 != 0) {
                            a3 = h2.a(i24, size26, u2.e(list28));
                            i21 = a3 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                        a3 = i;
                        i21 = a3 + i21;
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 35:
                        i3 = i7;
                        List list29 = (List) unsafe2.getObject(obj, j2);
                        Class cls32 = u2.a;
                        int size27 = list29.size() * 8;
                        if (size27 > 0) {
                            i21 = l0.a(size27, b0.b(i24), size27, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 36:
                        i3 = i7;
                        List list30 = (List) unsafe2.getObject(obj, j2);
                        Class cls33 = u2.a;
                        int size28 = list30.size() * 4;
                        if (size28 > 0) {
                            i21 = l0.a(size28, b0.b(i24), size28, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 37:
                        i3 = i7;
                        int c16 = u2.c((List) unsafe2.getObject(obj, j2));
                        if (c16 > 0) {
                            i21 = l0.a(c16, b0.b(i24), c16, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 38:
                        i3 = i7;
                        int g2 = u2.g((List) unsafe2.getObject(obj, j2));
                        if (g2 > 0) {
                            i21 = l0.a(g2, b0.b(i24), g2, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 39:
                        i3 = i7;
                        int b16 = u2.b((List) unsafe2.getObject(obj, j2));
                        if (b16 > 0) {
                            i21 = l0.a(b16, b0.b(i24), b16, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 40:
                        i3 = i7;
                        List list31 = (List) unsafe2.getObject(obj, j2);
                        Class cls34 = u2.a;
                        int size29 = list31.size() * 8;
                        if (size29 > 0) {
                            i21 = l0.a(size29, b0.b(i24), size29, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 41:
                        i3 = i7;
                        List list32 = (List) unsafe2.getObject(obj, j2);
                        Class cls35 = u2.a;
                        int size30 = list32.size() * 4;
                        if (size30 > 0) {
                            i21 = l0.a(size30, b0.b(i24), size30, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 42:
                        i3 = i7;
                        List list33 = (List) unsafe2.getObject(obj, j2);
                        Class cls36 = u2.a;
                        int size31 = list33.size();
                        if (size31 > 0) {
                            i21 = l0.a(size31, b0.b(i24), size31, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 43:
                        i3 = i7;
                        int f2 = u2.f((List) unsafe2.getObject(obj, j2));
                        if (f2 > 0) {
                            i21 = l0.a(f2, b0.b(i24), f2, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 44:
                        i3 = i7;
                        int a11 = u2.a((List) unsafe2.getObject(obj, j2));
                        if (a11 > 0) {
                            i21 = l0.a(a11, b0.b(i24), a11, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 45:
                        i3 = i7;
                        List list34 = (List) unsafe2.getObject(obj, j2);
                        Class cls37 = u2.a;
                        int size32 = list34.size() * 4;
                        if (size32 > 0) {
                            i21 = l0.a(size32, b0.b(i24), size32, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 46:
                        i3 = i7;
                        List list35 = (List) unsafe2.getObject(obj, j2);
                        Class cls38 = u2.a;
                        int size33 = list35.size() * 8;
                        if (size33 > 0) {
                            i21 = l0.a(size33, b0.b(i24), size33, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 47:
                        i3 = i7;
                        int d4 = u2.d((List) unsafe2.getObject(obj, j2));
                        if (d4 > 0) {
                            i21 = l0.a(d4, b0.b(i24), d4, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 48:
                        i3 = i7;
                        int e7 = u2.e((List) unsafe2.getObject(obj, j2));
                        if (e7 > 0) {
                            i21 = l0.a(e7, b0.b(i24), e7, i21);
                        }
                        i7 = i3;
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 49:
                        List list36 = (List) unsafe2.getObject(obj, j2);
                        t2 c17 = c(i20);
                        Class cls39 = u2.a;
                        int size34 = list36.size();
                        if (size34 == 0) {
                            i3 = i7;
                            b5 = i;
                            i21 = b5 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            int i35 = i;
                            b5 = i35;
                            while (i35 < size34) {
                                b5 += ((b) ((d2) list36.get(i35))).getSerializedSize(c17) + (b0.b(i24) * 2);
                                i35++;
                                i7 = i7;
                            }
                            i3 = i7;
                            i21 = b5 + i21;
                            i7 = i3;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 50:
                        z1 z1Var2 = this.p;
                        Object object3 = unsafe2.getObject(obj, j2);
                        Object b17 = b(i20);
                        z1Var2.getClass();
                        y1 y1Var2 = (y1) object3;
                        if (b17 != null) {
                            pvd.j();
                            return i;
                        }
                        if (y1Var2.isEmpty()) {
                            continue;
                        } else {
                            Iterator it2 = y1Var2.entrySet().iterator();
                            if (it2.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it2.next();
                                entry2.getKey();
                                entry2.getValue();
                                throw null;
                            }
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 51:
                        if (a(obj, i24, i20)) {
                            i21 = g2.a(i24, 8, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 52:
                        if (a(obj, i24, i20)) {
                            i21 = g2.a(i24, 4, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 53:
                        if (a(obj, i24, i20)) {
                            long longValue4 = ((Long) x3.e(obj, j2)).longValue();
                            b = b0.b(i24);
                            a = b0.a(longValue4);
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 54:
                        if (a(obj, i24, i20)) {
                            long longValue5 = ((Long) x3.e(obj, j2)).longValue();
                            b = b0.b(i24);
                            a = b0.a(longValue5);
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 55:
                        if (a(obj, i24, i20)) {
                            int intValue5 = ((Integer) x3.e(obj, j2)).intValue();
                            a = b0.b(i24);
                            if (intValue5 >= 0) {
                                b = b0.c(intValue5);
                                i4 = b + a;
                                i21 = i4 + i21;
                                i20 += 3;
                                i6 = i26;
                                i8 = i;
                            }
                            b = 10;
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 56:
                        if (a(obj, i24, i20)) {
                            i21 = g2.a(i24, 8, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 57:
                        if (a(obj, i24, i20)) {
                            i21 = g2.a(i24, 4, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 58:
                        if (a(obj, i24, i20)) {
                            i21 = g2.a(i24, i7, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 59:
                        if (a(obj, i24, i20)) {
                            Object object4 = unsafe2.getObject(obj, j2);
                            if (object4 instanceof s) {
                                b6 = b0.b(i24);
                                a4 = b0.a((s) object4);
                            } else {
                                b6 = b0.b(i24);
                                a4 = b0.a((String) object4);
                            }
                            i4 = a4 + b6;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 60:
                        if (a(obj, i24, i20)) {
                            Object object5 = unsafe2.getObject(obj, j2);
                            t2 c18 = c(i20);
                            Class cls40 = u2.a;
                            int b18 = b0.b(i24);
                            int serializedSize7 = ((b) ((d2) object5)).getSerializedSize(c18);
                            i21 = l0.a(serializedSize7, serializedSize7, b18, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 61:
                        if (a(obj, i24, i20)) {
                            s sVar4 = (s) unsafe2.getObject(obj, j2);
                            b6 = b0.b(i24);
                            a4 = b0.a(sVar4);
                            i4 = a4 + b6;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 62:
                        if (a(obj, i24, i20)) {
                            int intValue6 = ((Integer) x3.e(obj, j2)).intValue();
                            b6 = b0.b(i24);
                            a4 = b0.c(intValue6);
                            i4 = a4 + b6;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 63:
                        if (a(obj, i24, i20)) {
                            int intValue7 = ((Integer) x3.e(obj, j2)).intValue();
                            b6 = b0.b(i24);
                            a4 = b0.a(intValue7);
                            i4 = a4 + b6;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 64:
                        if (a(obj, i24, i20)) {
                            i21 = g2.a(i24, 4, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 65:
                        if (a(obj, i24, i20)) {
                            i21 = g2.a(i24, 8, i21);
                        }
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                    case 66:
                        if (a(obj, i24, i20)) {
                            int intValue8 = ((Integer) x3.e(obj, j2)).intValue();
                            int b19 = b0.b(i24);
                            a = b0.c(b0.d(intValue8));
                            b = b19;
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 67:
                        if (a(obj, i24, i20)) {
                            long longValue6 = ((Long) x3.e(obj, j2)).longValue();
                            b = b0.b(i24);
                            a = b0.a(b0.b(longValue6));
                            i4 = b + a;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    case 68:
                        if (a(obj, i24, i20)) {
                            d2 d2Var4 = (d2) unsafe2.getObject(obj, j2);
                            t2 c19 = c(i20);
                            b4 = b0.b(i24) * 2;
                            serializedSize = ((b) d2Var4).getSerializedSize(c19);
                            i3 = i7;
                            i4 = serializedSize + b4;
                            i7 = i3;
                            i21 = i4 + i21;
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        } else {
                            i20 += 3;
                            i6 = i26;
                            i8 = i;
                        }
                    default:
                        i20 += 3;
                        i6 = i26;
                        i8 = i;
                }
            }
        }
    }

    public final void c(int i, Object obj, Object obj2) {
        long j = this.a[i + 1] & 1048575;
        Object e = x3.e(obj, j);
        z1 z1Var = this.p;
        if (e != null) {
            z1Var.getClass();
            if (!((y1) e).a) {
                this.p.getClass();
                y1 y1Var = y1.b;
                y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                this.p.getClass();
                z1.a(y1Var2, e);
                x3.a(j, obj, y1Var2);
                e = y1Var2;
            }
        } else {
            z1Var.getClass();
            y1 y1Var3 = y1.b;
            e = y1Var3.isEmpty() ? new y1() : new y1(y1Var3);
            x3.a(j, obj, e);
        }
        this.p.getClass();
        this.p.getClass();
        obj2.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0227, code lost:
    
        if (r3 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (r3 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        r8 = r8 + r2;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int length = this.a.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int[] iArr = this.a;
            int i7 = iArr[i6 + 1];
            int i8 = iArr[i6];
            long j = 1048575 & i7;
            int i9 = 37;
            int i10 = 1237;
            switch ((i7 & 267386880) >>> 20) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(x3.c.c(obj, j));
                    Charset charset = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(x3.c.d(obj, j));
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset2 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset3 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 4:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset4 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 6:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 7:
                    i3 = i5 * 53;
                    boolean a = x3.c.a(obj, j);
                    Charset charset5 = l1.a;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((String) x3.e(obj, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 9:
                    Object e = x3.e(obj, j);
                    if (e != null) {
                        i9 = e.hashCode();
                    }
                    floatToIntBits = i5 * 53;
                    i2 = i9;
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = x3.e(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 11:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 12:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 13:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset6 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 15:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset7 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 17:
                    Object e2 = x3.e(obj, j);
                    if (e2 != null) {
                        i9 = e2.hashCode();
                    }
                    floatToIntBits = i5 * 53;
                    i2 = i9;
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i5 * 53;
                    floatToIntBits = x3.e(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = x3.e(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 51:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) x3.e(obj, j)).doubleValue());
                        Charset charset8 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) x3.e(obj, j)).floatValue());
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset9 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset10 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset11 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a(obj, i8, i6)) {
                        i3 = i5 * 53;
                        boolean booleanValue = ((Boolean) x3.e(obj, j)).booleanValue();
                        Charset charset12 = l1.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((String) x3.e(obj, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = x3.e(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = x3.e(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset13 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset14 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = x3.e(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.n.getClass();
        int hashCode = ((z0) obj).unknownFields.hashCode() + (i5 * 53);
        if (!this.f) {
            return hashCode;
        }
        this.o.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a.hashCode() + (hashCode * 53);
    }

    public final void e(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j = i2 & 1048575;
        if (a(obj2, i3, i)) {
            Object e = a(obj, i3, i) ? x3.e(obj, j) : null;
            Object e2 = x3.e(obj2, j);
            if (e != null && e2 != null) {
                x3.a(j, obj, l1.a(e, e2));
                b(obj, i3, i);
            } else if (e2 != null) {
                x3.a(j, obj, e2);
                b(obj, i3, i);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(Object obj) {
        int i;
        int[] iArr;
        int i2 = this.j;
        while (true) {
            i = this.k;
            iArr = this.i;
            if (i2 >= i) {
                break;
            }
            long j = this.a[iArr[i2] + 1] & 1048575;
            Object e = x3.e(obj, j);
            if (e != null) {
                this.p.getClass();
                ((y1) e).a = false;
                x3.a(j, obj, e);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.m.a(obj, this.i[i]);
            i++;
        }
        this.n.getClass();
        ((z0) obj).unknownFields.e = false;
        if (this.f) {
            this.o.getClass();
            ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
        }
    }

    public final t2 c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        t2 t2Var = (t2) objArr[i2];
        if (t2Var != null) {
            return t2Var;
        }
        t2 a = p2.c.a((Class) objArr[i2 + 1]);
        this.b[i2] = a;
        return a;
    }

    public static long d(int i) {
        return i & 1048575;
    }

    public final void d(int i, Object obj, Object obj2) {
        long j = this.a[i + 1] & 1048575;
        if (a(i, obj2)) {
            Object e = x3.e(obj, j);
            Object e2 = x3.e(obj2, j);
            if (e != null && e2 != null) {
                x3.a(j, obj, l1.a(e, e2));
                b(i, obj);
            } else if (e2 != null) {
                x3.a(j, obj, e2);
                b(i, obj);
            }
        }
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder q2 = wt3.q("Field ", str, " for ");
            q2.append(cls.getName());
            q2.append(" not found. Known fields are ");
            i3c.n(q2, Arrays.toString(declaredFields));
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final Object a() {
        k2 k2Var = this.l;
        d2 d2Var = this.e;
        k2Var.getClass();
        return ((z0) d2Var).dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, Object obj2) {
        Object obj3;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = iArr[i + 1];
                long j = 1048575 & i2;
                int i3 = iArr[i];
                switch ((i2 & 267386880) >>> 20) {
                    case 0:
                        if (a(i, obj2)) {
                            w3 w3Var = x3.c;
                            obj3 = obj;
                            w3Var.a(obj3, j, w3Var.c(obj2, j));
                            b(i, obj3);
                            break;
                        }
                        obj3 = obj;
                        break;
                    case 1:
                        if (a(i, obj2)) {
                            w3 w3Var2 = x3.c;
                            w3Var2.a(obj, j, w3Var2.d(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 2:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 3:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 4:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 5:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 6:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 7:
                        if (a(i, obj2)) {
                            w3 w3Var3 = x3.c;
                            w3Var3.a(obj, j, w3Var3.a(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 8:
                        if (a(i, obj2)) {
                            x3.a(j, obj, x3.e(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 9:
                        d(i, obj, obj2);
                        obj3 = obj;
                        break;
                    case 10:
                        if (a(i, obj2)) {
                            x3.a(j, obj, x3.e(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 11:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 12:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 13:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 14:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 15:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 16:
                        if (a(i, obj2)) {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                        }
                        obj3 = obj;
                        break;
                    case 17:
                        d(i, obj, obj2);
                        obj3 = obj;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.m.a(j, obj, obj2);
                        obj3 = obj;
                        break;
                    case 50:
                        z1 z1Var = this.p;
                        Class cls = u2.a;
                        Object e = x3.e(obj, j);
                        Object e2 = x3.e(obj2, j);
                        z1Var.getClass();
                        x3.a(j, obj, z1.a(e, e2));
                        obj3 = obj;
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (a(obj2, i3, i)) {
                            x3.a(j, obj, x3.e(obj2, j));
                            b(obj, i3, i);
                        }
                        obj3 = obj;
                        break;
                    case 60:
                        e(i, obj, obj2);
                        obj3 = obj;
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (a(obj2, i3, i)) {
                            x3.a(j, obj, x3.e(obj2, j));
                            b(obj, i3, i);
                        }
                        obj3 = obj;
                        break;
                    case 68:
                        e(i, obj, obj2);
                        obj3 = obj;
                        break;
                    default:
                        obj3 = obj;
                        break;
                }
                i += 3;
                obj = obj3;
            } else {
                Object obj4 = obj;
                o3 o3Var = this.n;
                Class cls2 = u2.a;
                o3Var.getClass();
                z0 z0Var = (z0) obj4;
                n3 n3Var = z0Var.unknownFields;
                n3 n3Var2 = ((z0) obj2).unknownFields;
                if (!n3Var2.equals(n3.f)) {
                    n3Var = n3.a(n3Var, n3Var2);
                }
                z0Var.unknownFields = n3Var;
                if (this.f) {
                    this.o.getClass();
                    n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
                    if (n0Var.a.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite$ExtendableMessage) obj4).ensureExtensionsAreMutable().a(n0Var);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i2 a(r2 r2Var, k2 k2Var, t1 t1Var, o3 o3Var, j0 j0Var, z1 z1Var) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i2;
        int charAt5;
        int i3;
        int[] iArr;
        int i4;
        char charAt6;
        int i5;
        char charAt7;
        int i6;
        char charAt8;
        int i7;
        char charAt9;
        int i8;
        char charAt10;
        int i9;
        char charAt11;
        int i10;
        char charAt12;
        int i11;
        char charAt13;
        int i12;
        int i13;
        boolean z;
        int i14;
        int objectFieldOffset;
        String str;
        Class<?> cls;
        int i15;
        int i16;
        int i17;
        int i18;
        Field a;
        int i19;
        char charAt14;
        int i20;
        int i21;
        Field a2;
        Field a3;
        int i22;
        char charAt15;
        int i23;
        char charAt16;
        int i24;
        int i25;
        char charAt17;
        int i26;
        int i27;
        char charAt18;
        if (r2Var != null) {
            int i28 = 0;
            boolean z2 = ((r2Var.d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO3;
            String str2 = r2Var.b;
            int length = str2.length();
            if (str2.charAt(0) >= 55296) {
                int i29 = 1;
                while (true) {
                    i = i29 + 1;
                    if (str2.charAt(i29) < 55296) {
                        break;
                    }
                    i29 = i;
                }
            } else {
                i = 1;
            }
            int i30 = i + 1;
            int charAt19 = str2.charAt(i);
            if (charAt19 >= 55296) {
                int i31 = charAt19 & 8191;
                int i32 = 13;
                while (true) {
                    i27 = i30 + 1;
                    charAt18 = str2.charAt(i30);
                    if (charAt18 < 55296) {
                        break;
                    }
                    i31 |= (charAt18 & 8191) << i32;
                    i32 += 13;
                    i30 = i27;
                }
                charAt19 = i31 | (charAt18 << i32);
                i30 = i27;
            }
            if (charAt19 == 0) {
                charAt2 = 0;
                charAt3 = 0;
                charAt4 = 0;
                i3 = 0;
                charAt5 = 0;
                i2 = i30;
                iArr = q;
                charAt = 0;
            } else {
                int i33 = i30 + 1;
                charAt = str2.charAt(i30);
                if (charAt >= 55296) {
                    int i34 = charAt & 8191;
                    int i35 = 13;
                    while (true) {
                        i11 = i33 + 1;
                        charAt13 = str2.charAt(i33);
                        if (charAt13 < 55296) {
                            break;
                        }
                        i34 |= (charAt13 & 8191) << i35;
                        i35 += 13;
                        i33 = i11;
                    }
                    charAt = i34 | (charAt13 << i35);
                    i33 = i11;
                }
                int i36 = i33 + 1;
                int charAt20 = str2.charAt(i33);
                if (charAt20 >= 55296) {
                    int i37 = charAt20 & 8191;
                    int i38 = 13;
                    while (true) {
                        i10 = i36 + 1;
                        charAt12 = str2.charAt(i36);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i37 |= (charAt12 & 8191) << i38;
                        i38 += 13;
                        i36 = i10;
                    }
                    charAt20 = i37 | (charAt12 << i38);
                    i36 = i10;
                }
                int i39 = i36 + 1;
                charAt2 = str2.charAt(i36);
                if (charAt2 >= 55296) {
                    int i40 = charAt2 & 8191;
                    int i41 = 13;
                    while (true) {
                        i9 = i39 + 1;
                        charAt11 = str2.charAt(i39);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i40 |= (charAt11 & 8191) << i41;
                        i41 += 13;
                        i39 = i9;
                    }
                    charAt2 = i40 | (charAt11 << i41);
                    i39 = i9;
                }
                int i42 = i39 + 1;
                charAt3 = str2.charAt(i39);
                if (charAt3 >= 55296) {
                    int i43 = charAt3 & 8191;
                    int i44 = 13;
                    while (true) {
                        i8 = i42 + 1;
                        charAt10 = str2.charAt(i42);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i43 |= (charAt10 & 8191) << i44;
                        i44 += 13;
                        i42 = i8;
                    }
                    charAt3 = i43 | (charAt10 << i44);
                    i42 = i8;
                }
                int i45 = i42 + 1;
                int charAt21 = str2.charAt(i42);
                if (charAt21 >= 55296) {
                    int i46 = charAt21 & 8191;
                    int i47 = 13;
                    while (true) {
                        i7 = i45 + 1;
                        charAt9 = str2.charAt(i45);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i46 |= (charAt9 & 8191) << i47;
                        i47 += 13;
                        i45 = i7;
                    }
                    charAt21 = i46 | (charAt9 << i47);
                    i45 = i7;
                }
                int i48 = i45 + 1;
                charAt4 = str2.charAt(i45);
                if (charAt4 >= 55296) {
                    int i49 = charAt4 & 8191;
                    int i50 = 13;
                    while (true) {
                        i6 = i48 + 1;
                        charAt8 = str2.charAt(i48);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i49 |= (charAt8 & 8191) << i50;
                        i50 += 13;
                        i48 = i6;
                    }
                    charAt4 = i49 | (charAt8 << i50);
                    i48 = i6;
                }
                int i51 = i48 + 1;
                int charAt22 = str2.charAt(i48);
                if (charAt22 >= 55296) {
                    int i52 = charAt22 & 8191;
                    int i53 = 13;
                    while (true) {
                        i5 = i51 + 1;
                        charAt7 = str2.charAt(i51);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i52 |= (charAt7 & 8191) << i53;
                        i53 += 13;
                        i51 = i5;
                    }
                    charAt22 = i52 | (charAt7 << i53);
                    i51 = i5;
                }
                i2 = i51 + 1;
                charAt5 = str2.charAt(i51);
                if (charAt5 >= 55296) {
                    int i54 = charAt5 & 8191;
                    int i55 = i2;
                    int i56 = 13;
                    while (true) {
                        i4 = i55 + 1;
                        charAt6 = str2.charAt(i55);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i54 |= (charAt6 & 8191) << i56;
                        i56 += 13;
                        i55 = i4;
                    }
                    charAt5 = i54 | (charAt6 << i56);
                    i2 = i4;
                }
                int[] iArr2 = new int[charAt5 + charAt4 + charAt22];
                i3 = (charAt * 2) + charAt20;
                int i57 = charAt21;
                iArr = iArr2;
                i28 = i57;
            }
            Unsafe unsafe = r;
            Object[] objArr = r2Var.c;
            Class<?> cls2 = r2Var.a.getClass();
            int[] iArr3 = new int[i28 * 3];
            int i58 = 2;
            Object[] objArr2 = new Object[i28 * 2];
            int i59 = charAt4 + charAt5;
            int i60 = i2;
            int i61 = charAt;
            int i62 = i59;
            int i63 = charAt5;
            int i64 = 0;
            int i65 = 0;
            while (i60 < length) {
                int i66 = i60 + 1;
                int charAt23 = str2.charAt(i60);
                int i67 = length;
                if (charAt23 >= 55296) {
                    int i68 = charAt23 & 8191;
                    int i69 = i66;
                    int i70 = 13;
                    while (true) {
                        i25 = i69 + 1;
                        charAt17 = str2.charAt(i69);
                        i26 = i68;
                        if (charAt17 < 55296) {
                            break;
                        }
                        i68 = i26 | ((charAt17 & 8191) << i70);
                        i70 += 13;
                        i69 = i25;
                    }
                    charAt23 = i26 | (charAt17 << i70);
                    i12 = i25;
                } else {
                    i12 = i66;
                }
                int i71 = i12 + 1;
                int charAt24 = str2.charAt(i12);
                int i72 = charAt23;
                if (charAt24 >= 55296) {
                    int i73 = charAt24 & 8191;
                    int i74 = i71;
                    int i75 = 13;
                    while (true) {
                        i23 = i74 + 1;
                        charAt16 = str2.charAt(i74);
                        i24 = i73;
                        if (charAt16 < 55296) {
                            break;
                        }
                        i73 = i24 | ((charAt16 & 8191) << i75);
                        i75 += 13;
                        i74 = i23;
                    }
                    charAt24 = i24 | (charAt16 << i75);
                    i60 = i23;
                } else {
                    i60 = i71;
                }
                int[] iArr4 = iArr3;
                int i76 = charAt24 & 255;
                Object[] objArr3 = objArr;
                if ((charAt24 & 1024) != 0) {
                    iArr[i65] = i64;
                    i65++;
                }
                int i77 = charAt2;
                if (i76 >= 51) {
                    int i78 = i60 + 1;
                    int charAt25 = str2.charAt(i60);
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i79 = charAt25 & 8191;
                        int i80 = 13;
                        while (true) {
                            i22 = i78 + 1;
                            charAt15 = str2.charAt(i78);
                            if (charAt15 < c) {
                                break;
                            }
                            i79 |= (charAt15 & 8191) << i80;
                            i80 += 13;
                            i78 = i22;
                            c = 55296;
                        }
                        charAt25 = i79 | (charAt15 << i80);
                        i78 = i22;
                    }
                    int i81 = i76 - 51;
                    int i82 = charAt25;
                    if (i81 == 9 || i81 == 17) {
                        i21 = i78;
                        objArr2[lnb.d(i64, 3, i58, 1)] = objArr3[i3];
                        i3++;
                    } else if (i81 != 12 || z2) {
                        i21 = i78;
                    } else {
                        i21 = i78;
                        objArr2[lnb.d(i64, 3, i58, 1)] = objArr3[i3];
                        i3++;
                    }
                    int i83 = i82 * 2;
                    Object obj = objArr3[i83];
                    if (obj instanceof Field) {
                        a2 = (Field) obj;
                    } else {
                        a2 = a((Class) cls2, (String) obj);
                        objArr3[i83] = a2;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(a2);
                    int i84 = i83 + 1;
                    Object obj2 = objArr3[i84];
                    if (obj2 instanceof Field) {
                        a3 = (Field) obj2;
                    } else {
                        a3 = a((Class) cls2, (String) obj2);
                        objArr3[i84] = a3;
                    }
                    cls = cls2;
                    i15 = (int) unsafe.objectFieldOffset(a3);
                    i13 = charAt3;
                    i17 = i3;
                    i58 = 2;
                    str = str2;
                    i18 = objectFieldOffset2;
                    i60 = i21;
                    i16 = 0;
                    z = z2;
                } else {
                    int i85 = i3 + 1;
                    Field a4 = a((Class) cls2, (String) objArr3[i3]);
                    if (i76 == 9 || i76 == 17) {
                        i13 = charAt3;
                        z = z2;
                        objArr2[lnb.d(i64, 3, 2, 1)] = a4.getType();
                    } else {
                        if (i76 == 27 || i76 == 49) {
                            i13 = charAt3;
                            z = z2;
                            i20 = i3 + 2;
                            objArr2[lnb.d(i64, 3, 2, 1)] = objArr3[i85];
                        } else {
                            if (i76 == 12 || i76 == 30 || i76 == 44) {
                                if (!z2) {
                                    i13 = charAt3;
                                    z = z2;
                                    i20 = i3 + 2;
                                    objArr2[lnb.d(i64, 3, 2, 1)] = objArr3[i85];
                                }
                            } else if (i76 == 50) {
                                int i86 = i63 + 1;
                                iArr[i63] = i64;
                                int i87 = (i64 / 3) * 2;
                                int i88 = i3 + 2;
                                objArr2[i87] = objArr3[i85];
                                if ((charAt24 & com.ironsource.mediationsdk.metadata.a.o) != 0) {
                                    i14 = i3 + 3;
                                    objArr2[i87 + 1] = objArr3[i88];
                                    i13 = charAt3;
                                    z = z2;
                                    i63 = i86;
                                } else {
                                    i13 = charAt3;
                                    i14 = i88;
                                    i63 = i86;
                                    z = z2;
                                }
                                objectFieldOffset = (int) unsafe.objectFieldOffset(a4);
                                if ((charAt24 & 4096) == 4096 || i76 > 17) {
                                    str = str2;
                                    cls = cls2;
                                    i58 = 2;
                                    i15 = 1048575;
                                    i16 = 0;
                                } else {
                                    int i89 = i60 + 1;
                                    int charAt26 = str2.charAt(i60);
                                    if (charAt26 >= 55296) {
                                        int i90 = charAt26 & 8191;
                                        int i91 = 13;
                                        while (true) {
                                            i19 = i89 + 1;
                                            charAt14 = str2.charAt(i89);
                                            if (charAt14 < 55296) {
                                                break;
                                            }
                                            i90 |= (charAt14 & 8191) << i91;
                                            i91 += 13;
                                            i89 = i19;
                                        }
                                        charAt26 = i90 | (charAt14 << i91);
                                        i89 = i19;
                                    }
                                    i58 = 2;
                                    int i92 = (charAt26 / 32) + (i61 * 2);
                                    Object obj3 = objArr3[i92];
                                    if (obj3 instanceof Field) {
                                        a = (Field) obj3;
                                    } else {
                                        a = a((Class) cls2, (String) obj3);
                                        objArr3[i92] = a;
                                    }
                                    str = str2;
                                    cls = cls2;
                                    i15 = (int) unsafe.objectFieldOffset(a);
                                    i16 = charAt26 % 32;
                                    i60 = i89;
                                }
                                if (i76 >= 18 || i76 > 49) {
                                    i17 = i14;
                                    i18 = objectFieldOffset;
                                } else {
                                    iArr[i62] = objectFieldOffset;
                                    i17 = i14;
                                    i18 = objectFieldOffset;
                                    i62++;
                                }
                            }
                            i13 = charAt3;
                            z = z2;
                        }
                        i14 = i20;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(a4);
                        if ((charAt24 & 4096) == 4096) {
                        }
                        str = str2;
                        cls = cls2;
                        i58 = 2;
                        i15 = 1048575;
                        i16 = 0;
                        if (i76 >= 18) {
                        }
                        i17 = i14;
                        i18 = objectFieldOffset;
                    }
                    i14 = i85;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(a4);
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = str2;
                    cls = cls2;
                    i58 = 2;
                    i15 = 1048575;
                    i16 = 0;
                    if (i76 >= 18) {
                    }
                    i17 = i14;
                    i18 = objectFieldOffset;
                }
                int i93 = i64 + 1;
                iArr4[i64] = i72;
                int i94 = i64 + 2;
                int i95 = i16;
                iArr4[i93] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i76 << 20) | i18;
                i64 += 3;
                iArr4[i94] = (i95 << 20) | i15;
                str2 = str;
                charAt3 = i13;
                iArr3 = iArr4;
                length = i67;
                objArr = objArr3;
                z2 = z;
                cls2 = cls;
                i3 = i17;
                charAt2 = i77;
            }
            return new i2(iArr3, objArr2, charAt2, charAt3, r2Var.a, z2, iArr, charAt5, i59, k2Var, t1Var, o3Var, j0Var, z1Var);
        }
        r2Var.getClass();
        pvd.j();
        return null;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, s2 s2Var, h0 h0Var) {
        h0Var.getClass();
        a(this.n, this.o, obj, s2Var, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:291:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0710 A[Catch: all -> 0x0721, TryCatch #1 {all -> 0x0721, blocks: (B:36:0x070b, B:38:0x0710, B:40:0x0719, B:42:0x0724), top: B:35:0x070b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x072a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0749 A[LOOP:3: B:62:0x0745->B:64:0x0749, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(o3 o3Var, j0 j0Var, Object obj, s2 s2Var, h0 h0Var) {
        o3 o3Var2;
        Object obj2;
        i2 i2Var;
        int i;
        int s;
        int a;
        int i2;
        x0 a2;
        s2 s2Var2;
        h0 h0Var2;
        s2 s2Var3;
        Object a3;
        i2 i2Var2 = this;
        Object obj3 = obj;
        h0 h0Var3 = h0Var;
        Object obj4 = null;
        n0 n0Var = null;
        while (true) {
            try {
                s = s2Var.s();
            } catch (Throwable th) {
                th = th;
                o3Var2 = o3Var;
            }
            if (s >= i2Var2.c) {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    o3Var2 = o3Var;
                }
                if (s <= i2Var2.d) {
                    a = i2Var2.a(s, 0);
                    i2 = a;
                    if (i2 >= 0) {
                        if (s == Integer.MAX_VALUE) {
                            for (int i3 = i2Var2.j; i3 < i2Var2.k; i3++) {
                                obj4 = i2Var2.b(i2Var2.i[i3], obj3, obj4);
                            }
                            if (obj4 != null) {
                                o3Var.getClass();
                                o3.a(obj3, obj4);
                                return;
                            }
                            return;
                        }
                        if (i2Var2.f) {
                            d2 d2Var = i2Var2.e;
                            j0Var.getClass();
                            a2 = h0Var3.a(s, d2Var);
                        } else {
                            a2 = null;
                        }
                        if (a2 != null) {
                            if (n0Var == null) {
                                j0Var.getClass();
                                n0Var = ((GeneratedMessageLite$ExtendableMessage) obj3).ensureExtensionsAreMutable();
                            }
                            n0 n0Var2 = n0Var;
                            j0Var.getClass();
                            try {
                                obj4 = j0.a(s2Var, a2, h0Var3, n0Var2, obj4, o3Var);
                                n0Var = n0Var2;
                                obj2 = obj3;
                                h0Var3 = h0Var;
                            } catch (Throwable th3) {
                                th = th3;
                                o3Var2 = o3Var;
                            }
                        } else {
                            o3Var2 = o3Var;
                            Object obj5 = obj4;
                            try {
                                o3Var2.getClass();
                                if (obj5 == null) {
                                    z0 z0Var = (z0) obj3;
                                    n3 n3Var = z0Var.unknownFields;
                                    if (n3Var == n3.f) {
                                        n3Var = new n3();
                                        z0Var.unknownFields = n3Var;
                                    }
                                    obj4 = n3Var;
                                } else {
                                    obj4 = obj5;
                                }
                                try {
                                    if (!o3.a(obj4, s2Var)) {
                                        for (int i4 = i2Var2.j; i4 < i2Var2.k; i4++) {
                                            obj4 = i2Var2.b(i2Var2.i[i4], obj3, obj4);
                                        }
                                        if (obj4 != null) {
                                            o3.a(obj3, obj4);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj2 = obj3;
                                obj4 = obj5;
                            }
                        }
                        obj2 = obj3;
                        i2Var = i2Var2;
                        for (i = i2Var.j; i < i2Var.k; i++) {
                            obj4 = i2Var.b(i2Var.i[i], obj2, obj4);
                        }
                        if (obj4 != null) {
                            o3Var2.getClass();
                            o3.a(obj2, obj4);
                        }
                        throw th;
                    }
                    o3Var2 = o3Var;
                    Object obj6 = obj4;
                    try {
                        int i5 = i2Var2.a[i2 + 1];
                        switch ((267386880 & i5) >>> 20) {
                            case 0:
                                s2Var2 = s2Var;
                                h0Var2 = h0Var3;
                                i2Var = i2Var2;
                                try {
                                } catch (m1 unused) {
                                    obj2 = obj;
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj2 = obj;
                                }
                                try {
                                    x3.c.a(obj, d(i5), s2Var2.h());
                                    obj2 = obj;
                                    i2Var.b(i2, obj2);
                                    i2Var2 = i2Var;
                                    obj4 = obj6;
                                } catch (m1 unused2) {
                                    obj2 = obj;
                                    obj4 = obj6;
                                    try {
                                        o3Var2.getClass();
                                        if (obj4 == null) {
                                        }
                                        if (o3.a(obj4, s2Var2)) {
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    obj2 = obj;
                                    obj4 = obj6;
                                    while (i < i2Var.k) {
                                    }
                                    if (obj4 != null) {
                                    }
                                    throw th;
                                }
                                h0Var3 = h0Var2;
                                break;
                            case 1:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.c.a(obj2, d(i5), s2Var.k());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 2:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.o());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 3:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.f());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 4:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.d());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 5:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.g());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 6:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.q());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 7:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.c.a(obj2, d(i5), s2Var.r());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 8:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                if ((i5 & 536870912) != 0) {
                                    x3.a(i5 & 1048575, obj2, s2Var.p());
                                } else if (i2Var.g) {
                                    x3.a(i5 & 1048575, obj2, s2Var.n());
                                } else {
                                    x3.a(i5 & 1048575, obj2, s2Var.a());
                                }
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 9:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                if (i2Var.a(i2, obj2)) {
                                    x3.a(d(i5), obj2, l1.a(x3.e(obj2, d(i5)), s2Var.b(i2Var.c(i2), h0Var2)));
                                } else {
                                    x3.a(d(i5), obj2, s2Var.b(i2Var.c(i2), h0Var2));
                                    i2Var.b(i2, obj2);
                                }
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 10:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(d(i5), obj2, s2Var.a());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 11:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.c());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 12:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                int b = s2Var.b();
                                i2Var.a(i2);
                                x3.a(obj2, d(i5), b);
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 13:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.m());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 14:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.t());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 15:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.j());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 16:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.l());
                                i2Var.b(i2, obj2);
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 17:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                if (i2Var.a(i2, obj2)) {
                                    x3.a(d(i5), obj2, l1.a(x3.e(obj2, d(i5)), s2Var.a(i2Var.c(i2), h0Var2)));
                                } else {
                                    x3.a(d(i5), obj2, s2Var.a(i2Var.c(i2), h0Var2));
                                    i2Var.b(i2, obj2);
                                }
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 18:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.j(i2Var.m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 19:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.d(i2Var.m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 20:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.k(i2Var.m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 21:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.a(i2Var.m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 22:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.o(i2Var.m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 23:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.n(i2Var.m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 24:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.e(i2Var.m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 25:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.l(i2Var.m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 26:
                                s2Var2 = s2Var;
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                try {
                                    i2Var.a(obj2, i5, s2Var2);
                                    i2Var2 = i2Var;
                                    obj4 = obj6;
                                } catch (m1 unused3) {
                                    obj4 = obj6;
                                    o3Var2.getClass();
                                    if (obj4 == null) {
                                    }
                                    if (o3.a(obj4, s2Var2)) {
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    obj4 = obj6;
                                    while (i < i2Var.k) {
                                    }
                                    if (obj4 != null) {
                                    }
                                    throw th;
                                }
                                h0Var3 = h0Var2;
                                break;
                            case 27:
                                obj2 = obj3;
                                try {
                                    i2Var2.a(obj2, i5, s2Var, i2Var2.c(i2), h0Var);
                                    i2Var = i2Var2;
                                    h0Var2 = h0Var;
                                    i2Var2 = i2Var;
                                    obj4 = obj6;
                                } catch (m1 unused4) {
                                    i2Var = i2Var2;
                                    s2Var2 = s2Var;
                                    h0Var2 = h0Var;
                                    obj4 = obj6;
                                    o3Var2.getClass();
                                    if (obj4 == null) {
                                    }
                                    if (o3.a(obj4, s2Var2)) {
                                    }
                                }
                                h0Var3 = h0Var2;
                                break;
                            case 28:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.h(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 29:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.i(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 30:
                                obj2 = obj3;
                                List b2 = i2Var2.m.b(obj2, d(i5));
                                s2Var.p(b2);
                                i2Var2.a(i2);
                                a3 = u2.a(s, b2, obj6, o3Var2);
                                obj4 = a3;
                                h0Var3 = h0Var;
                                break;
                            case 31:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.f(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 32:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.m(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 33:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.c(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 34:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.g(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 35:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.j(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 36:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.d(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 37:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.k(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 38:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.a(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 39:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.o(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 40:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.n(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 41:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.e(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 42:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.l(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 43:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.i(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 44:
                                obj2 = obj3;
                                List b3 = i2Var2.m.b(obj2, d(i5));
                                s2Var.p(b3);
                                i2Var2.a(i2);
                                a3 = u2.a(s, b3, obj6, o3Var2);
                                obj4 = a3;
                                h0Var3 = h0Var;
                                break;
                            case 45:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.f(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 46:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.m(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 47:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.c(i2Var2.m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 48:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                try {
                                    s2Var3.g(i2Var2.m.b(obj2, d(i5)));
                                    h0Var2 = h0Var;
                                    i2Var = i2Var2;
                                    i2Var2 = i2Var;
                                    obj4 = obj6;
                                } catch (m1 unused5) {
                                    h0Var2 = h0Var;
                                    i2Var = i2Var2;
                                    s2Var2 = s2Var3;
                                    obj4 = obj6;
                                    o3Var2.getClass();
                                    if (obj4 == null) {
                                    }
                                    if (o3.a(obj4, s2Var2)) {
                                    }
                                }
                                h0Var3 = h0Var2;
                                break;
                            case 49:
                                try {
                                    obj2 = obj3;
                                } catch (m1 unused6) {
                                    h0Var2 = h0Var;
                                    s2Var2 = s2Var;
                                    obj2 = obj3;
                                    i2Var = i2Var2;
                                    obj4 = obj6;
                                    o3Var2.getClass();
                                    if (obj4 == null) {
                                    }
                                    if (o3.a(obj4, s2Var2)) {
                                    }
                                }
                                try {
                                    try {
                                        i2Var2.a(obj2, d(i5), s2Var, i2Var2.c(i2), h0Var);
                                        s2Var3 = s2Var;
                                        h0Var2 = h0Var;
                                        i2Var = i2Var2;
                                        i2Var2 = i2Var;
                                        obj4 = obj6;
                                    } catch (m1 unused7) {
                                        h0Var2 = h0Var;
                                        i2Var = i2Var2;
                                        s2Var2 = s2Var;
                                        obj4 = obj6;
                                        o3Var2.getClass();
                                        if (obj4 == null) {
                                        }
                                        if (o3.a(obj4, s2Var2)) {
                                        }
                                    }
                                    h0Var3 = h0Var2;
                                    break;
                                } catch (Throwable th10) {
                                    th = th10;
                                    i2Var = i2Var2;
                                    obj4 = obj6;
                                    while (i < i2Var.k) {
                                    }
                                    if (obj4 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                i2Var2.c(i2, obj3, i2Var2.b(i2));
                                throw null;
                                break;
                            case 51:
                                x3.a(d(i5), obj3, Double.valueOf(s2Var.h()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 52:
                                x3.a(d(i5), obj3, Float.valueOf(s2Var.k()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 53:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.o()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 54:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.f()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 55:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.d()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 56:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.g()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 57:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.q()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 58:
                                x3.a(d(i5), obj3, Boolean.valueOf(s2Var.r()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 59:
                                if ((i5 & 536870912) != 0) {
                                    x3.a(i5 & 1048575, obj3, s2Var.p());
                                } else if (i2Var2.g) {
                                    x3.a(i5 & 1048575, obj3, s2Var.n());
                                } else {
                                    x3.a(i5 & 1048575, obj3, s2Var.a());
                                }
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 60:
                                if (i2Var2.a(obj3, s, i2)) {
                                    x3.a(d(i5), obj3, l1.a(x3.e(obj3, d(i5)), s2Var.b(i2Var2.c(i2), h0Var3)));
                                } else {
                                    x3.a(d(i5), obj3, s2Var.b(i2Var2.c(i2), h0Var3));
                                    i2Var2.b(i2, obj3);
                                }
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 61:
                                x3.a(d(i5), obj3, s2Var.a());
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 62:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.c()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 63:
                                int b4 = s2Var.b();
                                i2Var2.a(i2);
                                x3.a(d(i5), obj3, Integer.valueOf(b4));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 64:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.m()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 65:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.t()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 66:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.j()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 67:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.l()));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            case 68:
                                x3.a(d(i5), obj3, s2Var.a(i2Var2.c(i2), h0Var3));
                                i2Var2.b(obj3, s, i2);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                obj4 = obj6;
                                h0Var3 = h0Var2;
                                break;
                            default:
                                if (obj6 == null) {
                                    try {
                                        o3Var2.getClass();
                                        obj4 = new n3();
                                    } catch (m1 unused8) {
                                        s2Var2 = s2Var;
                                        h0Var2 = h0Var3;
                                        obj2 = obj3;
                                        i2Var = i2Var2;
                                        obj4 = obj6;
                                        o3Var2.getClass();
                                        if (obj4 == null) {
                                            z0 z0Var2 = (z0) obj2;
                                            n3 n3Var2 = z0Var2.unknownFields;
                                            if (n3Var2 == n3.f) {
                                                n3Var2 = new n3();
                                                z0Var2.unknownFields = n3Var2;
                                            }
                                            obj4 = n3Var2;
                                        }
                                        if (o3.a(obj4, s2Var2)) {
                                            for (int i6 = i2Var.j; i6 < i2Var.k; i6++) {
                                                obj4 = i2Var.b(i2Var.i[i6], obj2, obj4);
                                            }
                                            if (obj4 != null) {
                                                o3.a(obj2, obj4);
                                                return;
                                            }
                                            return;
                                        }
                                        i2Var2 = i2Var;
                                        h0Var3 = h0Var2;
                                        obj3 = obj2;
                                    }
                                } else {
                                    obj4 = obj6;
                                }
                                try {
                                    o3Var2.getClass();
                                } catch (m1 unused9) {
                                    s2Var2 = s2Var;
                                    h0Var2 = h0Var3;
                                    obj2 = obj3;
                                    i2Var = i2Var2;
                                    o3Var2.getClass();
                                    if (obj4 == null) {
                                    }
                                    if (o3.a(obj4, s2Var2)) {
                                    }
                                }
                                if (!o3.a(obj4, s2Var)) {
                                    for (int i7 = i2Var2.j; i7 < i2Var2.k; i7++) {
                                        obj4 = i2Var2.b(i2Var2.i[i7], obj3, obj4);
                                    }
                                    if (obj4 != null) {
                                        o3.a(obj3, obj4);
                                        return;
                                    }
                                    return;
                                }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj2 = obj3;
                    }
                    obj3 = obj2;
                }
            }
            a = -1;
            i2 = a;
            if (i2 >= 0) {
            }
            obj3 = obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r4.a(r11, r7) == r4.a(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r4.d(r11, r7)) == java.lang.Float.floatToIntBits(r4.d(r12, r7))) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r4.c(r11, r7)) == java.lang.Double.doubleToLongBits(r4.c(r12, r7))) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj, Object obj2) {
        int length = this.a.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int[] iArr = this.a;
                int i2 = iArr[i + 1];
                long j = i2 & 1048575;
                switch ((i2 & 267386880) >>> 20) {
                    case 0:
                        if (a(i, obj, obj2)) {
                            w3 w3Var = x3.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (a(i, obj, obj2)) {
                            w3 w3Var2 = x3.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (a(i, obj, obj2)) {
                            w3 w3Var3 = x3.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (a(i, obj, obj2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z = u2.a(x3.e(obj, j), x3.e(obj2, j));
                        break;
                    case 50:
                        z = u2.a(x3.e(obj, j), x3.e(obj2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (x3.c(obj, j2) == x3.c(obj2, j2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else {
                this.n.getClass();
                n3 n3Var = ((z0) obj).unknownFields;
                this.n.getClass();
                if (!n3Var.equals(((z0) obj2).unknownFields)) {
                    return false;
                }
                if (!this.f) {
                    return true;
                }
                this.o.getClass();
                n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                this.o.getClass();
                return n0Var.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
            }
        }
    }

    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, f fVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int c;
        Unsafe unsafe = r;
        k1 k1Var = (k1) unsafe.getObject(obj, j2);
        if (!((c) k1Var).a) {
            int size = k1Var.size();
            k1Var = k1Var.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, k1Var);
        }
        k1 k1Var2 = k1Var;
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    d0 d0Var = (d0) k1Var2;
                    int d = g.d(bArr, i, fVar);
                    int i12 = fVar.a + d;
                    while (d < i12) {
                        d0Var.a(Double.longBitsToDouble(g.b(d, bArr)));
                        d += 8;
                    }
                    if (d == i12) {
                        return d;
                    }
                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
                if (i4 != 1) {
                    return i;
                }
                d0 d0Var2 = (d0) k1Var2;
                d0Var2.a(Double.longBitsToDouble(g.b(i, bArr)));
                int i13 = i + 8;
                while (i13 < i2) {
                    int i14 = i13 + 1;
                    byte b = bArr[i13];
                    if (b >= 0) {
                        fVar.a = b;
                    } else {
                        i14 = g.a(b, bArr, i14, fVar);
                    }
                    if (i3 != fVar.a) {
                        return i13;
                    }
                    d0Var2.a(Double.longBitsToDouble(g.b(i14, bArr)));
                    i13 = i14 + 8;
                }
                return i13;
            case 19:
            case 36:
                if (i4 == 2) {
                    q0 q0Var = (q0) k1Var2;
                    int d2 = g.d(bArr, i, fVar);
                    int i15 = fVar.a + d2;
                    while (d2 < i15) {
                        q0Var.a(Float.intBitsToFloat(g.a(d2, bArr)));
                        d2 += 4;
                    }
                    if (d2 == i15) {
                        return d2;
                    }
                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
                if (i4 != 5) {
                    return i;
                }
                q0 q0Var2 = (q0) k1Var2;
                q0Var2.a(Float.intBitsToFloat(g.a(i, bArr)));
                for (int i16 = i + 4; i16 < i2; i16 = i7 + 4) {
                    i7 = i16 + 1;
                    byte b2 = bArr[i16];
                    if (b2 >= 0) {
                        fVar.a = b2;
                    } else {
                        i7 = g.a(b2, bArr, i7, fVar);
                    }
                    if (i3 != fVar.a) {
                        return i16;
                    }
                    q0Var2.a(Float.intBitsToFloat(g.a(i7, bArr)));
                }
                return i16;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    u1 u1Var = (u1) k1Var2;
                    int d3 = g.d(bArr, i, fVar);
                    int i17 = fVar.a + d3;
                    while (d3 < i17) {
                        d3 = g.e(bArr, d3, fVar);
                        u1Var.a(fVar.b);
                    }
                    if (d3 == i17) {
                        return d3;
                    }
                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
                if (i4 != 0) {
                    return i;
                }
                u1 u1Var2 = (u1) k1Var2;
                int e = g.e(bArr, i, fVar);
                u1Var2.a(fVar.b);
                while (e < i2) {
                    int i18 = e + 1;
                    byte b3 = bArr[e];
                    if (b3 >= 0) {
                        fVar.a = b3;
                    } else {
                        i18 = g.a(b3, bArr, i18, fVar);
                    }
                    if (i3 != fVar.a) {
                        return e;
                    }
                    e = g.e(bArr, i18, fVar);
                    u1Var2.a(fVar.b);
                }
                return e;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 == 2) {
                    return g.a(bArr, i, k1Var2, fVar);
                }
                return i4 == 0 ? g.c(i3, bArr, i, i2, k1Var2, fVar) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    u1 u1Var3 = (u1) k1Var2;
                    int d4 = g.d(bArr, i, fVar);
                    int i19 = fVar.a + d4;
                    while (d4 < i19) {
                        u1Var3.a(g.b(d4, bArr));
                        d4 += 8;
                    }
                    if (d4 == i19) {
                        return d4;
                    }
                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
                if (i4 != 1) {
                    return i;
                }
                u1 u1Var4 = (u1) k1Var2;
                u1Var4.a(g.b(i, bArr));
                for (int i20 = i + 8; i20 < i2; i20 = i8 + 8) {
                    i8 = i20 + 1;
                    byte b4 = bArr[i20];
                    if (b4 >= 0) {
                        fVar.a = b4;
                    } else {
                        i8 = g.a(b4, bArr, i8, fVar);
                    }
                    if (i3 != fVar.a) {
                        return i20;
                    }
                    u1Var4.a(g.b(i8, bArr));
                }
                return i20;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    a1 a1Var = (a1) k1Var2;
                    int d5 = g.d(bArr, i, fVar);
                    int i21 = fVar.a + d5;
                    while (d5 < i21) {
                        a1Var.c(g.a(d5, bArr));
                        d5 += 4;
                    }
                    if (d5 == i21) {
                        return d5;
                    }
                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
                if (i4 != 5) {
                    return i;
                }
                a1 a1Var2 = (a1) k1Var2;
                a1Var2.c(g.a(i, bArr));
                for (int i22 = i + 4; i22 < i2; i22 = i9 + 4) {
                    i9 = i22 + 1;
                    byte b5 = bArr[i22];
                    if (b5 >= 0) {
                        fVar.a = b5;
                    } else {
                        i9 = g.a(b5, bArr, i9, fVar);
                    }
                    if (i3 != fVar.a) {
                        return i22;
                    }
                    a1Var2.c(g.a(i9, bArr));
                }
                return i22;
            case 25:
            case 42:
                if (i4 == 2) {
                    j jVar = (j) k1Var2;
                    int d6 = g.d(bArr, i, fVar);
                    int i23 = fVar.a + d6;
                    while (d6 < i23) {
                        d6 = g.e(bArr, d6, fVar);
                        jVar.a(fVar.b != 0);
                    }
                    if (d6 == i23) {
                        return d6;
                    }
                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
                if (i4 != 0) {
                    return i;
                }
                j jVar2 = (j) k1Var2;
                int e2 = g.e(bArr, i, fVar);
                jVar2.a(fVar.b != 0);
                while (e2 < i2) {
                    int i24 = e2 + 1;
                    byte b6 = bArr[e2];
                    if (b6 >= 0) {
                        fVar.a = b6;
                    } else {
                        i24 = g.a(b6, bArr, i24, fVar);
                    }
                    if (i3 != fVar.a) {
                        return e2;
                    }
                    e2 = g.e(bArr, i24, fVar);
                    jVar2.a(fVar.b != 0);
                }
                return e2;
            case 26:
                i10 = i;
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        return g.a(i3, bArr, i10, i2, k1Var2, fVar);
                    }
                    return g.b(i3, bArr, i10, i2, k1Var2, fVar);
                }
                return i10;
            case 27:
                i10 = i;
                if (i4 == 2) {
                    t2 c2 = c(i5);
                    int a = g.a(c2, bArr, i10, i2, fVar);
                    k1Var2.add(fVar.c);
                    while (a < i2) {
                        int i25 = a + 1;
                        byte b7 = bArr[a];
                        if (b7 >= 0) {
                            fVar.a = b7;
                        } else {
                            i25 = g.a(b7, bArr, i25, fVar);
                        }
                        if (i3 != fVar.a) {
                            return a;
                        }
                        a = g.a(c2, bArr, i25, i2, fVar);
                        k1Var2.add(fVar.c);
                    }
                    return a;
                }
                return i10;
            case 28:
                i10 = i;
                if (i4 == 2) {
                    int d7 = g.d(bArr, i10, fVar);
                    int i26 = fVar.a;
                    if (i26 >= 0) {
                        if (i26 > bArr.length - d7) {
                            zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            return 0;
                        }
                        if (i26 == 0) {
                            k1Var2.add(s.b);
                        } else {
                            int i27 = d7 + i26;
                            s.a(d7, i27, bArr.length);
                            k1Var2.add(new q(s.c.a(bArr, d7, i26)));
                            d7 = i27;
                        }
                        while (d7 < i2) {
                            int i28 = d7 + 1;
                            byte b8 = bArr[d7];
                            if (b8 >= 0) {
                                fVar.a = b8;
                            } else {
                                i28 = g.a(b8, bArr, i28, fVar);
                            }
                            if (i3 != fVar.a) {
                                return d7;
                            }
                            d7 = i28 + 1;
                            byte b9 = bArr[i28];
                            if (b9 >= 0) {
                                fVar.a = b9;
                            } else {
                                d7 = g.a(b9, bArr, d7, fVar);
                            }
                            int i29 = fVar.a;
                            if (i29 >= 0) {
                                if (i29 > bArr.length - d7) {
                                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                    return 0;
                                }
                                if (i29 == 0) {
                                    k1Var2.add(s.b);
                                } else {
                                    int i30 = d7 + i29;
                                    s.a(d7, i30, bArr.length);
                                    k1Var2.add(new q(s.c.a(bArr, d7, i29)));
                                    d7 = i30;
                                }
                            } else {
                                zzl.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                return 0;
                            }
                        }
                        return d7;
                    }
                    zzl.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                }
                return i10;
            case 30:
            case 44:
                i11 = i;
                if (i4 != 2) {
                    if (i4 == 0) {
                        c = g.c(i3, bArr, i11, i2, k1Var2, fVar);
                    }
                    return i11;
                }
                c = g.a(bArr, i11, k1Var2, fVar);
                z0 z0Var = (z0) obj;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f) {
                    n3Var = null;
                }
                a(i5);
                Class cls = u2.a;
                if (n3Var != null) {
                    z0Var.unknownFields = n3Var;
                }
                return c;
            case 33:
            case 47:
                i11 = i;
                if (i4 == 2) {
                    a1 a1Var3 = (a1) k1Var2;
                    int d8 = g.d(bArr, i11, fVar);
                    int i31 = fVar.a + d8;
                    while (d8 < i31) {
                        int i32 = d8 + 1;
                        byte b10 = bArr[d8];
                        if (b10 >= 0) {
                            fVar.a = b10;
                            d8 = i32;
                        } else {
                            d8 = g.a(b10, bArr, i32, fVar);
                        }
                        a1Var3.c(w.b(fVar.a));
                    }
                    if (d8 == i31) {
                        return d8;
                    }
                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
                if (i4 == 0) {
                    a1 a1Var4 = (a1) k1Var2;
                    int d9 = g.d(bArr, i11, fVar);
                    a1Var4.c(w.b(fVar.a));
                    while (d9 < i2) {
                        int i33 = d9 + 1;
                        byte b11 = bArr[d9];
                        if (b11 >= 0) {
                            fVar.a = b11;
                        } else {
                            i33 = g.a(b11, bArr, i33, fVar);
                        }
                        if (i3 != fVar.a) {
                            return d9;
                        }
                        d9 = i33 + 1;
                        byte b12 = bArr[i33];
                        if (b12 >= 0) {
                            fVar.a = b12;
                        } else {
                            d9 = g.a(b12, bArr, d9, fVar);
                        }
                        a1Var4.c(w.b(fVar.a));
                    }
                    return d9;
                }
                return i11;
            case 34:
            case 48:
                i11 = i;
                if (i4 == 2) {
                    u1 u1Var5 = (u1) k1Var2;
                    int d10 = g.d(bArr, i11, fVar);
                    int i34 = fVar.a + d10;
                    while (d10 < i34) {
                        d10 = g.e(bArr, d10, fVar);
                        u1Var5.a(w.a(fVar.b));
                    }
                    if (d10 == i34) {
                        return d10;
                    }
                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
                if (i4 == 0) {
                    u1 u1Var6 = (u1) k1Var2;
                    int e3 = g.e(bArr, i11, fVar);
                    u1Var6.a(w.a(fVar.b));
                    while (e3 < i2) {
                        int i35 = e3 + 1;
                        byte b13 = bArr[e3];
                        if (b13 >= 0) {
                            fVar.a = b13;
                        } else {
                            i35 = g.a(b13, bArr, i35, fVar);
                        }
                        if (i3 != fVar.a) {
                            return e3;
                        }
                        e3 = g.e(bArr, i35, fVar);
                        u1Var6.a(w.a(fVar.b));
                    }
                    return e3;
                }
                return i11;
            case 49:
                if (i4 == 3) {
                    t2 c3 = c(i5);
                    int i36 = (i3 & (-8)) | 4;
                    int a2 = g.a(c3, bArr, i, i2, i36, fVar);
                    byte[] bArr2 = bArr;
                    int i37 = i2;
                    int i38 = i36;
                    f fVar2 = fVar;
                    k1Var2.add(fVar2.c);
                    while (a2 < i37) {
                        int d11 = g.d(bArr2, a2, fVar2);
                        if (i3 != fVar2.a) {
                            return a2;
                        }
                        byte[] bArr3 = bArr2;
                        int i39 = i38;
                        int i40 = i37;
                        f fVar3 = fVar2;
                        a2 = g.a(c3, bArr3, d11, i40, i39, fVar3);
                        k1Var2.add(fVar3.c);
                        i38 = i39;
                        bArr2 = bArr3;
                        i37 = i40;
                        fVar2 = fVar3;
                    }
                    return a2;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, c0 c0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        if (this.f) {
            this.o.getClass();
            n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (!n0Var.a.isEmpty()) {
                it = n0Var.d();
                entry = (Map.Entry) it.next();
                length = this.a.length;
                for (i = 0; i < length; i += 3) {
                    int[] iArr = this.a;
                    int i2 = iArr[i + 1];
                    int i3 = iArr[i];
                    while (entry != null) {
                        this.o.getClass();
                        if (((w0) entry.getKey()).b <= i3) {
                            this.o.getClass();
                            j0.a(c0Var, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        } else {
                            switch ((267386880 & i2) >>> 20) {
                                case 0:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.c.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.c.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 2:
                                    if (a(i, obj)) {
                                        c0Var.a.b(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 3:
                                    if (a(i, obj)) {
                                        c0Var.a.b(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
                                    if (a(i, obj)) {
                                        c0Var.a.b(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 7:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.c.a(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 8:
                                    if (a(i, obj)) {
                                        a(i3, x3.e(obj, i2 & 1048575), c0Var);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 9:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, (d2) x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, (s) x3.e(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 11:
                                    if (a(i, obj)) {
                                        c0Var.a.d(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 12:
                                    if (a(i, obj)) {
                                        c0Var.a.b(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 13:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 14:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 15:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 16:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    u2.b(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 19:
                                    u2.f(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 20:
                                    u2.h(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 21:
                                    u2.n(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 22:
                                    u2.g(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 23:
                                    u2.e(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 24:
                                    u2.d(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 25:
                                    u2.a(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 26:
                                    u2.b(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var);
                                    break;
                                case 27:
                                    u2.b(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, c(i));
                                    break;
                                case 28:
                                    u2.a(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var);
                                    break;
                                case 29:
                                    u2.m(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 30:
                                    u2.c(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 31:
                                    u2.i(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 32:
                                    u2.j(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 33:
                                    u2.k(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 34:
                                    u2.l(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 35:
                                    u2.b(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 36:
                                    u2.f(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 37:
                                    u2.h(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 38:
                                    u2.n(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 39:
                                    u2.g(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 40:
                                    u2.e(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 41:
                                    u2.d(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 42:
                                    u2.a(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 43:
                                    u2.m(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 44:
                                    u2.c(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 45:
                                    u2.i(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 46:
                                    u2.j(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 47:
                                    u2.k(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 48:
                                    u2.l(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 49:
                                    u2.a(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, c(i));
                                    break;
                                case 50:
                                    if (x3.e(obj, i2 & 1048575) != null) {
                                        z1 z1Var = this.p;
                                        Object b = b(i);
                                        z1Var.getClass();
                                        b.getClass();
                                        pvd.j();
                                        return;
                                    }
                                    break;
                                case 51:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((Double) x3.e(obj, i2 & 1048575)).doubleValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 52:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((Float) x3.e(obj, i2 & 1048575)).floatValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 53:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.b(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 54:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.b(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 55:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.b(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 56:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 57:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 58:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Boolean) x3.e(obj, i2 & 1048575)).booleanValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 59:
                                    if (a(obj, i3, i)) {
                                        a(i3, x3.e(obj, i2 & 1048575), c0Var);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 60:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, (d2) x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 61:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, (s) x3.e(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 62:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.d(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 63:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.b(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 64:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 65:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 66:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 67:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 68:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                    }
                    switch ((267386880 & i2) >>> 20) {
                    }
                }
                while (entry != null) {
                    this.o.getClass();
                    j0.a(c0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                this.n.getClass();
                ((z0) obj).unknownFields.a(c0Var);
            }
        }
        it = null;
        entry = null;
        length = this.a.length;
        while (i < length) {
        }
        while (entry != null) {
        }
        this.n.getClass();
        ((z0) obj).unknownFields.a(c0Var);
    }

    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, f fVar) {
        Object object;
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(g.b(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(g.a(i, bArr))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int e = g.e(bArr, i, fVar);
                unsafe.putObject(obj, j, Long.valueOf(fVar.b));
                unsafe.putInt(obj, j2, i4);
                return e;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int d = g.d(bArr, i, fVar);
                unsafe.putObject(obj, j, Integer.valueOf(fVar.a));
                unsafe.putInt(obj, j2, i4);
                return d;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(g.b(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(g.a(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int e2 = g.e(bArr, i, fVar);
                unsafe.putObject(obj, j, Boolean.valueOf(fVar.b != 0));
                unsafe.putInt(obj, j2, i4);
                return e2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int d2 = g.d(bArr, i, fVar);
                int i13 = fVar.a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!d4.a.b(bArr, d2, d2 + i13)) {
                            zzl.j("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, d2, i13, l1.a));
                    d2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return d2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int a = g.a(c(i8), bArr, i, i2, fVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, fVar.c);
                } else {
                    unsafe.putObject(obj, j, l1.a(object, fVar.c));
                }
                unsafe.putInt(obj, j2, i4);
                return a;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int a2 = g.a(bArr, i, fVar);
                unsafe.putObject(obj, j, fVar.c);
                unsafe.putInt(obj, j2, i4);
                return a2;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int d3 = g.d(bArr, i, fVar);
                int i14 = fVar.a;
                a(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return d3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int d4 = g.d(bArr, i, fVar);
                unsafe.putObject(obj, j, Integer.valueOf(w.b(fVar.a)));
                unsafe.putInt(obj, j2, i4);
                return d4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int e3 = g.e(bArr, i, fVar);
                unsafe.putObject(obj, j, Long.valueOf(w.a(fVar.b)));
                unsafe.putInt(obj, j2, i4);
                return e3;
            case 68:
                if (i5 == 3) {
                    int a3 = g.a(c(i8), bArr, i, i2, (i3 & (-8)) | 4, fVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, fVar.c);
                    } else {
                        unsafe.putObject(obj, j, l1.a(object, fVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return a3;
                }
                break;
        }
        return i;
    }

    public final void a(int i) {
        if (this.b[lnb.d(i, 3, 2, 1)] == null) {
            return;
        }
        pvd.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0474, code lost:
    
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0812, code lost:
    
        if (r0 == 1048575) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0814, code lost:
    
        r18.putInt(r9, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x081a, code lost:
    
        r0 = r8.j;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0820, code lost:
    
        if (r0 >= r8.k) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0822, code lost:
    
        r1 = (com.fyber.inneractive.sdk.protobuf.n3) r8.b(r8.i[r0], r9, r1);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x082f, code lost:
    
        if (r1 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0831, code lost:
    
        r8.n.getClass();
        ((com.fyber.inneractive.sdk.protobuf.z0) r9).unknownFields = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x083d, code lost:
    
        if (r35 != 0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x083f, code lost:
    
        if (r4 != r3) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0842, code lost:
    
        defpackage.zzl.j("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0845, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x084a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0846, code lost:
    
        if (r4 > r3) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0848, code lost:
    
        if (r13 != r35) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x084b, code lost:
    
        defpackage.zzl.j("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x084e, code lost:
    
        return r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x046e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x047f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, f fVar) {
        int i4;
        Unsafe unsafe;
        int i5;
        i2 i2Var;
        Object obj2;
        int a;
        int i6;
        boolean z;
        int i7;
        int i8;
        f fVar2;
        int i9;
        n3 n3Var;
        int i10;
        Object obj3;
        w0 w0Var;
        int d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        int i16;
        Unsafe unsafe2;
        f fVar3;
        int i17;
        Unsafe unsafe3;
        Unsafe unsafe4;
        int i18;
        int i19;
        int c;
        int a2;
        i2 i2Var2;
        int i20;
        int i21;
        int i22;
        int a3;
        i2 i2Var3 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i23 = i2;
        f fVar4 = fVar;
        Unsafe unsafe5 = r;
        int i24 = i;
        int i25 = -1;
        int i26 = 0;
        int i27 = 1048575;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            Object obj5 = null;
            if (i24 < i23) {
                int i30 = i24 + 1;
                int i31 = bArr2[i24];
                if (i31 < 0) {
                    i30 = g.a(i31, bArr2, i30, fVar4);
                    i31 = fVar4.a;
                }
                int i32 = i30;
                int i33 = i31;
                int i34 = i33 >>> 3;
                int i35 = i33 & 7;
                int i36 = i2Var3.c;
                if (i34 > i25) {
                    int i37 = i26 / 3;
                    if (i34 >= i36 && i34 <= i2Var3.d) {
                        a = i2Var3.a(i34, i37);
                        if (a != -1) {
                            i25 = i34;
                            i4 = i27;
                            unsafe = unsafe5;
                            i6 = 0;
                            i5 = 0;
                            z = true;
                            i2Var = i2Var3;
                            obj2 = obj4;
                            i7 = i32;
                            i8 = i33;
                            fVar2 = fVar;
                        } else {
                            int[] iArr = i2Var3.a;
                            int i38 = iArr[a + 1];
                            int i39 = (i38 & 267386880) >>> 20;
                            long j = i38 & 1048575;
                            if (i39 <= 17) {
                                int i40 = iArr[a + 2];
                                int i41 = 1 << (i40 >>> 20);
                                int i42 = i40 & 1048575;
                                if (i42 != i27) {
                                    i11 = i34;
                                    if (i27 != 1048575) {
                                        unsafe5.putInt(obj4, i27, i28);
                                    }
                                    i12 = unsafe5.getInt(obj4, i42);
                                    i13 = i42;
                                } else {
                                    i11 = i34;
                                    i12 = i28;
                                    i13 = i27;
                                }
                                switch (i39) {
                                    case 0:
                                        i14 = i2;
                                        i15 = i13;
                                        z2 = true;
                                        i16 = i32;
                                        i6 = a;
                                        unsafe2 = unsafe5;
                                        fVar3 = fVar;
                                        if (i35 == 1) {
                                            x3.c.a(obj4, j, Double.longBitsToDouble(g.b(i16, bArr)));
                                            i17 = i16 + 8;
                                            int i43 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i43;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 1:
                                        i14 = i2;
                                        i15 = i13;
                                        i16 = i32;
                                        i6 = a;
                                        unsafe2 = unsafe5;
                                        fVar3 = fVar;
                                        if (i35 == 5) {
                                            x3.c.a(obj4, j, Float.intBitsToFloat(g.a(i16, bArr)));
                                            i17 = i16 + 4;
                                            int i432 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i432;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        z2 = true;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 2:
                                    case 3:
                                        i14 = i2;
                                        unsafe3 = unsafe5;
                                        i15 = i13;
                                        fVar3 = fVar;
                                        i16 = i32;
                                        i6 = a;
                                        if (i35 == 0) {
                                            i17 = g.e(bArr, i16, fVar3);
                                            unsafe3.putLong(obj4, j, fVar3.b);
                                            unsafe2 = unsafe3;
                                            int i4322 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i4322;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        unsafe2 = unsafe3;
                                        z2 = true;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 4:
                                    case 11:
                                        i14 = i2;
                                        unsafe3 = unsafe5;
                                        i15 = i13;
                                        fVar3 = fVar;
                                        i16 = i32;
                                        i6 = a;
                                        if (i35 == 0) {
                                            int i44 = i16 + 1;
                                            byte b = bArr[i16];
                                            if (b >= 0) {
                                                fVar3.a = b;
                                            } else {
                                                i44 = g.a(b, bArr, i44, fVar3);
                                            }
                                            i17 = i44;
                                            unsafe3.putInt(obj4, j, fVar3.a);
                                            unsafe2 = unsafe3;
                                            int i43222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i43222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        unsafe2 = unsafe3;
                                        z2 = true;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 5:
                                    case 14:
                                        i14 = i2;
                                        unsafe4 = unsafe5;
                                        i15 = i13;
                                        z2 = true;
                                        fVar3 = fVar;
                                        i6 = a;
                                        if (i35 != 1) {
                                            i16 = i32;
                                            unsafe2 = unsafe4;
                                            i4 = i15;
                                            i2Var = i2Var3;
                                            z = z2;
                                            unsafe = unsafe2;
                                            i8 = i33;
                                            i25 = i11;
                                            i28 = i12;
                                            i5 = 0;
                                            fVar2 = fVar3;
                                            obj2 = obj4;
                                            i7 = i16;
                                            break;
                                        } else {
                                            unsafe3 = unsafe4;
                                            unsafe3.putLong(obj4, j, g.b(i32, bArr));
                                            i17 = i32 + 8;
                                            unsafe2 = unsafe3;
                                            int i432222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i432222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                    case 6:
                                    case 13:
                                        i14 = i2;
                                        i18 = i32;
                                        unsafe4 = unsafe5;
                                        i15 = i13;
                                        fVar3 = fVar;
                                        i6 = a;
                                        if (i35 == 5) {
                                            unsafe4.putInt(obj4, j, g.a(i18, bArr));
                                            i17 = i18 + 4;
                                            unsafe2 = unsafe4;
                                            int i4322222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i4322222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        i16 = i18;
                                        unsafe2 = unsafe4;
                                        z2 = true;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 7:
                                        i14 = i2;
                                        i18 = i32;
                                        unsafe4 = unsafe5;
                                        fVar3 = fVar;
                                        i6 = a;
                                        if (i35 != 0) {
                                            i15 = i13;
                                            i16 = i18;
                                            unsafe2 = unsafe4;
                                            z2 = true;
                                            i4 = i15;
                                            i2Var = i2Var3;
                                            z = z2;
                                            unsafe = unsafe2;
                                            i8 = i33;
                                            i25 = i11;
                                            i28 = i12;
                                            i5 = 0;
                                            fVar2 = fVar3;
                                            obj2 = obj4;
                                            i7 = i16;
                                            break;
                                        } else {
                                            i17 = g.e(bArr, i18, fVar3);
                                            i15 = i13;
                                            x3.c.a(obj4, j, fVar3.b != 0);
                                            unsafe2 = unsafe4;
                                            int i43222222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i43222222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                    case 8:
                                        i14 = i2;
                                        i19 = i32;
                                        unsafe4 = unsafe5;
                                        fVar3 = fVar;
                                        i6 = a;
                                        if (i35 == 2) {
                                            if ((i38 & 536870912) == 0) {
                                                c = g.b(bArr, i19, fVar3);
                                            } else {
                                                c = g.c(bArr, i19, fVar3);
                                            }
                                            i17 = c;
                                            unsafe4.putObject(obj4, j, fVar3.c);
                                            i15 = i13;
                                            unsafe2 = unsafe4;
                                            int i432222222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i432222222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        i16 = i19;
                                        i15 = i13;
                                        z2 = true;
                                        unsafe2 = unsafe4;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 9:
                                        i14 = i2;
                                        i19 = i32;
                                        unsafe4 = unsafe5;
                                        fVar3 = fVar;
                                        i6 = a;
                                        if (i35 == 2) {
                                            a2 = g.a(i2Var3.c(i6), bArr, i19, i14, fVar3);
                                            if ((i12 & i41) == 0) {
                                                unsafe4.putObject(obj4, j, fVar3.c);
                                            } else {
                                                unsafe4.putObject(obj4, j, l1.a(unsafe4.getObject(obj4, j), fVar3.c));
                                            }
                                            i17 = a2;
                                            i15 = i13;
                                            unsafe2 = unsafe4;
                                            int i4322222222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i4322222222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        i16 = i19;
                                        i15 = i13;
                                        z2 = true;
                                        unsafe2 = unsafe4;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 10:
                                        i14 = i2;
                                        i19 = i32;
                                        unsafe4 = unsafe5;
                                        fVar3 = fVar;
                                        i6 = a;
                                        if (i35 == 2) {
                                            i17 = g.a(bArr, i19, fVar3);
                                            unsafe4.putObject(obj4, j, fVar3.c);
                                            i15 = i13;
                                            unsafe2 = unsafe4;
                                            int i43222222222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i43222222222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        i16 = i19;
                                        i15 = i13;
                                        z2 = true;
                                        unsafe2 = unsafe4;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 12:
                                        i14 = i2;
                                        i19 = i32;
                                        unsafe4 = unsafe5;
                                        fVar3 = fVar;
                                        i6 = a;
                                        if (i35 == 0) {
                                            int i45 = i19 + 1;
                                            byte b2 = bArr[i19];
                                            if (b2 >= 0) {
                                                fVar3.a = b2;
                                            } else {
                                                i45 = g.a(b2, bArr, i45, fVar3);
                                            }
                                            i17 = i45;
                                            int i46 = fVar3.a;
                                            i2Var3.a(i6);
                                            unsafe4.putInt(obj4, j, i46);
                                            i15 = i13;
                                            unsafe2 = unsafe4;
                                            int i432222222222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i432222222222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        i16 = i19;
                                        i15 = i13;
                                        z2 = true;
                                        unsafe2 = unsafe4;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 15:
                                        i14 = i2;
                                        i19 = i32;
                                        unsafe4 = unsafe5;
                                        fVar3 = fVar;
                                        i6 = a;
                                        if (i35 == 0) {
                                            int i47 = i19 + 1;
                                            byte b3 = bArr[i19];
                                            if (b3 >= 0) {
                                                fVar3.a = b3;
                                            } else {
                                                i47 = g.a(b3, bArr, i47, fVar3);
                                            }
                                            i17 = i47;
                                            unsafe4.putInt(obj4, j, w.b(fVar3.a));
                                            i15 = i13;
                                            unsafe2 = unsafe4;
                                            int i4322222222222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i4322222222222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                        i16 = i19;
                                        i15 = i13;
                                        z2 = true;
                                        unsafe2 = unsafe4;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                    case 16:
                                        i14 = i2;
                                        i19 = i32;
                                        int i48 = a;
                                        if (i35 != 0) {
                                            Unsafe unsafe6 = unsafe5;
                                            fVar3 = fVar;
                                            unsafe4 = unsafe6;
                                            i6 = i48;
                                            i16 = i19;
                                            i15 = i13;
                                            z2 = true;
                                            unsafe2 = unsafe4;
                                            i4 = i15;
                                            i2Var = i2Var3;
                                            z = z2;
                                            unsafe = unsafe2;
                                            i8 = i33;
                                            i25 = i11;
                                            i28 = i12;
                                            i5 = 0;
                                            fVar2 = fVar3;
                                            obj2 = obj4;
                                            i7 = i16;
                                            break;
                                        } else {
                                            i17 = g.e(bArr, i19, fVar);
                                            i6 = i48;
                                            unsafe3 = unsafe5;
                                            unsafe3.putLong(obj4, j, w.a(fVar.b));
                                            i15 = i13;
                                            unsafe2 = unsafe3;
                                            int i43222222222222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i43222222222222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                    case 17:
                                        if (i35 == 3) {
                                            int i49 = a;
                                            a2 = g.a(i2Var3.c(a), bArr, i32, i2, (i11 << 3) | 4, fVar);
                                            i14 = i2;
                                            if ((i12 & i41) == 0) {
                                                unsafe5.putObject(obj4, j, fVar.c);
                                            } else {
                                                unsafe5.putObject(obj4, j, l1.a(unsafe5.getObject(obj4, j), fVar.c));
                                            }
                                            unsafe4 = unsafe5;
                                            i6 = i49;
                                            i17 = a2;
                                            i15 = i13;
                                            unsafe2 = unsafe4;
                                            int i432222222222222 = i12 | i41;
                                            i4 = i15;
                                            obj2 = obj4;
                                            i23 = i14;
                                            i26 = i6;
                                            unsafe = unsafe2;
                                            i9 = i33;
                                            i24 = i17;
                                            i25 = i11;
                                            i2Var = i2Var3;
                                            i28 = i432222222222222;
                                            bArr2 = bArr;
                                            i29 = i9;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                            fVar4 = fVar;
                                        }
                                    default:
                                        i16 = i32;
                                        i6 = a;
                                        i15 = i13;
                                        z2 = true;
                                        unsafe2 = unsafe5;
                                        fVar3 = fVar;
                                        i4 = i15;
                                        i2Var = i2Var3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i8 = i33;
                                        i25 = i11;
                                        i28 = i12;
                                        i5 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj4;
                                        i7 = i16;
                                        break;
                                }
                            } else {
                                int i50 = i33;
                                Unsafe unsafe7 = unsafe5;
                                i6 = a;
                                int i51 = i28;
                                if (i39 == 27) {
                                    if (i35 == 2) {
                                        k1 k1Var = (k1) unsafe7.getObject(obj4, j);
                                        if (!((c) k1Var).a) {
                                            int size = k1Var.size();
                                            k1Var = k1Var.b(size == 0 ? 10 : size * 2);
                                            unsafe7.putObject(obj4, j, k1Var);
                                        }
                                        t2 c2 = i2Var3.c(i6);
                                        int a4 = g.a(c2, bArr, i32, i23, fVar);
                                        k1Var.add(fVar.c);
                                        while (true) {
                                            if (a4 < i23) {
                                                int i52 = a4 + 1;
                                                byte b4 = bArr[a4];
                                                if (b4 >= 0) {
                                                    fVar.a = b4;
                                                } else {
                                                    i52 = g.a(b4, bArr, i52, fVar);
                                                }
                                                i22 = i50;
                                                if (i22 == fVar.a) {
                                                    a4 = g.a(c2, bArr, i52, i23, fVar);
                                                    k1Var.add(fVar.c);
                                                    i50 = i22;
                                                }
                                            } else {
                                                i22 = i50;
                                            }
                                        }
                                        obj2 = obj4;
                                        unsafe = unsafe7;
                                        i28 = i51;
                                        i4 = i27;
                                        i26 = i6;
                                        i24 = a4;
                                        i9 = i22;
                                        i25 = i34;
                                        i2Var = i2Var3;
                                        bArr2 = bArr;
                                        i29 = i9;
                                        i2Var3 = i2Var;
                                        obj4 = obj2;
                                        unsafe5 = unsafe;
                                        i27 = i4;
                                        fVar4 = fVar;
                                    } else {
                                        i2Var2 = i2Var3;
                                        unsafe = unsafe7;
                                        i4 = i27;
                                        i20 = i32;
                                        i5 = 0;
                                        z = true;
                                        i8 = i50;
                                        i21 = i51;
                                    }
                                } else if (i39 <= 49) {
                                    i4 = i27;
                                    unsafe = unsafe7;
                                    i21 = i51;
                                    i5 = 0;
                                    z = true;
                                    i8 = i50;
                                    Object obj6 = obj4;
                                    fVar2 = fVar;
                                    int a5 = a(obj6, bArr, i32, i23, i8, i35, i6, i38, i39, j, fVar2);
                                    i6 = i6;
                                    i2Var = this;
                                    obj2 = obj6;
                                    if (a5 != i32) {
                                        i24 = a5;
                                        i25 = i34;
                                        f fVar5 = fVar2;
                                        i29 = i8;
                                        fVar4 = fVar5;
                                        bArr2 = bArr;
                                        i28 = i21;
                                        i23 = i2;
                                        i2Var3 = i2Var;
                                        obj4 = obj2;
                                        i26 = i6;
                                        unsafe5 = unsafe;
                                        i27 = i4;
                                    } else {
                                        a3 = a5;
                                        i25 = i34;
                                        i28 = i21;
                                        i7 = a3;
                                    }
                                } else {
                                    unsafe = unsafe7;
                                    i21 = i51;
                                    i4 = i27;
                                    i20 = i32;
                                    i5 = 0;
                                    z = true;
                                    i8 = i50;
                                    i2Var2 = this;
                                    if (i39 != 50) {
                                        fVar2 = fVar;
                                        Object obj7 = obj4;
                                        i25 = i34;
                                        a3 = i2Var2.a(obj7, bArr, i20, i2, i8, i25, i35, i38, i39, j, i6, fVar2);
                                        i2Var = i2Var2;
                                        obj2 = obj7;
                                        i6 = i6;
                                        if (a3 != i20) {
                                            i24 = a3;
                                            f fVar52 = fVar2;
                                            i29 = i8;
                                            fVar4 = fVar52;
                                            bArr2 = bArr;
                                            i28 = i21;
                                            i23 = i2;
                                            i2Var3 = i2Var;
                                            obj4 = obj2;
                                            i26 = i6;
                                            unsafe5 = unsafe;
                                            i27 = i4;
                                        } else {
                                            i28 = i21;
                                            i7 = a3;
                                        }
                                    } else if (i35 == 2) {
                                        Unsafe unsafe8 = r;
                                        Object b5 = i2Var2.b(i6);
                                        Object object = unsafe8.getObject(obj4, j);
                                        i2Var2.p.getClass();
                                        if (!((y1) object).a) {
                                            i2Var2.p.getClass();
                                            y1 y1Var = y1.b;
                                            y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                                            i2Var2.p.getClass();
                                            z1.a(y1Var2, object);
                                            unsafe8.putObject(obj4, j, y1Var2);
                                        }
                                        i2Var2.p.getClass();
                                        b5.getClass();
                                        pvd.j();
                                        return 0;
                                    }
                                }
                                i28 = i21;
                                fVar2 = fVar;
                                i2Var = i2Var2;
                                obj2 = obj4;
                                i7 = i20;
                                i25 = i34;
                            }
                        }
                        if (i8 == i3 || i3 == 0) {
                            if (!i2Var.f && fVar2.d != h0.a()) {
                                d2 d2Var = i2Var.e;
                                o3 o3Var = i2Var.n;
                                x0 a6 = fVar2.d.a(i25, d2Var);
                                if (a6 == null) {
                                    z0 z0Var = (z0) obj2;
                                    n3 n3Var2 = z0Var.unknownFields;
                                    if (n3Var2 == n3.f) {
                                        n3Var2 = new n3();
                                        z0Var.unknownFields = n3Var2;
                                    }
                                    i23 = i2;
                                    int i53 = i8;
                                    i9 = i53;
                                    i24 = g.a(i53, bArr, i7, i23, n3Var2, fVar2);
                                    i26 = i6;
                                } else {
                                    i23 = i2;
                                    int i54 = i8;
                                    f fVar6 = fVar2;
                                    GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj2;
                                    generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
                                    n0 n0Var = generatedMessageLite$ExtendableMessage.extensions;
                                    w0 w0Var2 = a6.d;
                                    int i55 = i6;
                                    if (w0Var2.d && w0Var2.e) {
                                        switch (e.a[w0Var2.c.ordinal()]) {
                                            case 1:
                                                i10 = i54;
                                                d0 d0Var = new d0();
                                                d = g.d(bArr, i7, fVar6);
                                                int i56 = fVar6.a + d;
                                                while (d < i56) {
                                                    d0Var.a(Double.longBitsToDouble(g.b(d, bArr)));
                                                    d += 8;
                                                }
                                                if (d == i56) {
                                                    n0Var.c(a6.d, d0Var);
                                                    i26 = i55;
                                                    i24 = d;
                                                    break;
                                                } else {
                                                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            case 2:
                                                i10 = i54;
                                                q0 q0Var = new q0();
                                                d = g.d(bArr, i7, fVar6);
                                                int i57 = fVar6.a + d;
                                                while (d < i57) {
                                                    q0Var.a(Float.intBitsToFloat(g.a(d, bArr)));
                                                    d += 4;
                                                }
                                                if (d == i57) {
                                                    n0Var.c(a6.d, q0Var);
                                                    i26 = i55;
                                                    i24 = d;
                                                    break;
                                                } else {
                                                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            case 3:
                                            case 4:
                                                i10 = i54;
                                                u1 u1Var = new u1();
                                                d = g.d(bArr, i7, fVar6);
                                                int i58 = fVar6.a + d;
                                                while (d < i58) {
                                                    d = g.e(bArr, d, fVar6);
                                                    u1Var.a(fVar6.b);
                                                }
                                                if (d == i58) {
                                                    n0Var.c(a6.d, u1Var);
                                                    i26 = i55;
                                                    i24 = d;
                                                    break;
                                                } else {
                                                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            case 5:
                                            case 6:
                                                i10 = i54;
                                                a1 a1Var = new a1();
                                                d = g.a(bArr, i7, a1Var, fVar6);
                                                n0Var.c(a6.d, a1Var);
                                                i26 = i55;
                                                i24 = d;
                                                break;
                                            case 7:
                                            case 8:
                                                i10 = i54;
                                                u1 u1Var2 = new u1();
                                                d = g.d(bArr, i7, fVar6);
                                                int i59 = fVar6.a + d;
                                                while (d < i59) {
                                                    u1Var2.a(g.b(d, bArr));
                                                    d += 8;
                                                }
                                                if (d == i59) {
                                                    n0Var.c(a6.d, u1Var2);
                                                    i26 = i55;
                                                    i24 = d;
                                                    break;
                                                } else {
                                                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            case 9:
                                            case 10:
                                                i10 = i54;
                                                a1 a1Var2 = new a1();
                                                d = g.d(bArr, i7, fVar6);
                                                int i60 = fVar6.a + d;
                                                while (d < i60) {
                                                    a1Var2.c(g.a(d, bArr));
                                                    d += 4;
                                                }
                                                if (d == i60) {
                                                    n0Var.c(a6.d, a1Var2);
                                                    i26 = i55;
                                                    i24 = d;
                                                    break;
                                                } else {
                                                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            case 11:
                                                i10 = i54;
                                                j jVar = new j();
                                                d = g.d(bArr, i7, fVar6);
                                                int i61 = fVar6.a + d;
                                                while (d < i61) {
                                                    d = g.e(bArr, d, fVar6);
                                                    jVar.a(fVar6.b != 0 ? z : i5);
                                                }
                                                if (d == i61) {
                                                    n0Var.c(a6.d, jVar);
                                                    i26 = i55;
                                                    i24 = d;
                                                    break;
                                                } else {
                                                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            case 12:
                                                i10 = i54;
                                                a1 a1Var3 = new a1();
                                                d = g.d(bArr, i7, fVar6);
                                                int i62 = fVar6.a + d;
                                                while (d < i62) {
                                                    int i63 = d + 1;
                                                    byte b6 = bArr[d];
                                                    if (b6 >= 0) {
                                                        fVar6.a = b6;
                                                        d = i63;
                                                    } else {
                                                        d = g.a(b6, bArr, i63, fVar6);
                                                    }
                                                    a1Var3.c(w.b(fVar6.a));
                                                }
                                                if (d == i62) {
                                                    n0Var.c(a6.d, a1Var3);
                                                    i26 = i55;
                                                    i24 = d;
                                                    break;
                                                } else {
                                                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            case 13:
                                                u1 u1Var3 = new u1();
                                                d = g.d(bArr, i7, fVar6);
                                                int i64 = fVar6.a + d;
                                                while (d < i64) {
                                                    d = g.e(bArr, d, fVar6);
                                                    u1Var3.a(w.a(fVar6.b));
                                                    i54 = i54;
                                                }
                                                i10 = i54;
                                                if (d == i64) {
                                                    n0Var.c(a6.d, u1Var3);
                                                    i26 = i55;
                                                    i24 = d;
                                                    break;
                                                } else {
                                                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return i5;
                                                }
                                            case 14:
                                                a1 a1Var4 = new a1();
                                                int a7 = g.a(bArr, i7, a1Var4, fVar6);
                                                n3 n3Var3 = generatedMessageLite$ExtendableMessage.unknownFields;
                                                if (n3Var3 == n3.f) {
                                                    n3Var3 = null;
                                                }
                                                n3 n3Var4 = (n3) u2.a(i25, a1Var4, a6.d.a, n3Var3, o3Var);
                                                if (n3Var4 != null) {
                                                    generatedMessageLite$ExtendableMessage.unknownFields = n3Var4;
                                                }
                                                n0Var.c(a6.d, a1Var4);
                                                i26 = i55;
                                                i9 = i54;
                                                i24 = a7;
                                                break;
                                            default:
                                                sw9.i(a6.d.c, "Type cannot be packed: ");
                                                return i5;
                                        }
                                    } else {
                                        i10 = i54;
                                        j4 j4Var = w0Var2.c;
                                        if (j4Var == j4.ENUM) {
                                            i7 = g.d(bArr, i7, fVar6);
                                            if (a6.d.a.a(fVar6.a) == null) {
                                                n3 n3Var5 = generatedMessageLite$ExtendableMessage.unknownFields;
                                                if (n3Var5 == n3.f) {
                                                    n3Var5 = new n3();
                                                    generatedMessageLite$ExtendableMessage.unknownFields = n3Var5;
                                                }
                                                u2.a(i25, fVar6.a, n3Var5, o3Var);
                                                i26 = i55;
                                                i24 = i7;
                                            } else {
                                                obj5 = Integer.valueOf(fVar6.a);
                                            }
                                        } else {
                                            switch (e.a[j4Var.ordinal()]) {
                                                case 1:
                                                    obj5 = Double.valueOf(Double.longBitsToDouble(g.b(i7, bArr)));
                                                    i7 += 8;
                                                    obj3 = obj5;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                        n0Var.a(w0Var, obj3);
                                                    } else {
                                                        int i65 = e.a[w0Var.c.ordinal()];
                                                        if (i65 == 17 || i65 == 18) {
                                                            Object obj8 = n0Var.a.get(a6.d);
                                                            if (obj8 != null) {
                                                                obj3 = l1.a(obj8, obj3);
                                                            }
                                                        }
                                                        n0Var.c(a6.d, obj3);
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 2:
                                                    obj5 = Float.valueOf(Float.intBitsToFloat(g.a(i7, bArr)));
                                                    i7 += 4;
                                                    obj3 = obj5;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 3:
                                                case 4:
                                                    i7 = g.e(bArr, i7, fVar6);
                                                    obj5 = Long.valueOf(fVar6.b);
                                                    obj3 = obj5;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 5:
                                                case 6:
                                                    i7 = g.d(bArr, i7, fVar6);
                                                    obj5 = Integer.valueOf(fVar6.a);
                                                    obj3 = obj5;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 7:
                                                case 8:
                                                    obj5 = Long.valueOf(g.b(i7, bArr));
                                                    i7 += 8;
                                                    obj3 = obj5;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 9:
                                                case 10:
                                                    obj5 = Integer.valueOf(g.a(i7, bArr));
                                                    i7 += 4;
                                                    obj3 = obj5;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 11:
                                                    i7 = g.e(bArr, i7, fVar6);
                                                    obj5 = Boolean.valueOf(fVar6.b != 0 ? z : i5);
                                                    obj3 = obj5;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 12:
                                                    i7 = g.d(bArr, i7, fVar6);
                                                    obj5 = Integer.valueOf(w.b(fVar6.a));
                                                    obj3 = obj5;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 13:
                                                    i7 = g.e(bArr, i7, fVar6);
                                                    obj5 = Long.valueOf(w.a(fVar6.b));
                                                    obj3 = obj5;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 14:
                                                    a70.r("Shouldn't reach here.");
                                                    return i5;
                                                case 15:
                                                    i7 = g.a(bArr, i7, fVar6);
                                                    obj3 = fVar6.c;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 16:
                                                    i7 = g.b(bArr, i7, fVar6);
                                                    obj3 = fVar6.c;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 17:
                                                    i7 = g.a(p2.c.a(a6.c.getClass()), bArr, i7, i23, (i25 << 3) | 4, fVar6);
                                                    obj3 = fVar6.c;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                                case 18:
                                                    i7 = g.a(p2.c.a(a6.c.getClass()), bArr, i7, i23, fVar6);
                                                    obj3 = fVar6.c;
                                                    w0Var = a6.d;
                                                    if (!w0Var.d) {
                                                    }
                                                    i26 = i55;
                                                    i23 = i2;
                                                    i24 = i7;
                                                    break;
                                            }
                                        }
                                        obj3 = obj5;
                                        w0Var = a6.d;
                                        if (!w0Var.d) {
                                        }
                                        i26 = i55;
                                        i23 = i2;
                                        i24 = i7;
                                    }
                                    i9 = i10;
                                }
                            } else {
                                int i66 = i8;
                                int i67 = i6;
                                f fVar7 = fVar2;
                                z0 z0Var2 = (z0) obj2;
                                n3Var = z0Var2.unknownFields;
                                if (n3Var == n3.f) {
                                    n3Var = new n3();
                                    z0Var2.unknownFields = n3Var;
                                }
                                n3 n3Var6 = n3Var;
                                i23 = i2;
                                int a8 = g.a(i66, bArr, i7, i23, n3Var6, fVar7);
                                i9 = i66;
                                i26 = i67;
                                i24 = a8;
                            }
                            bArr2 = bArr;
                            i29 = i9;
                            i2Var3 = i2Var;
                            obj4 = obj2;
                            unsafe5 = unsafe;
                            i27 = i4;
                            fVar4 = fVar;
                        } else {
                            i23 = i2;
                            i24 = i7;
                            i29 = i8;
                        }
                    }
                    a = -1;
                    if (a != -1) {
                    }
                    if (i8 == i3) {
                    }
                    if (!i2Var.f) {
                    }
                    int i662 = i8;
                    int i672 = i6;
                    f fVar72 = fVar2;
                    z0 z0Var22 = (z0) obj2;
                    n3Var = z0Var22.unknownFields;
                    if (n3Var == n3.f) {
                    }
                    n3 n3Var62 = n3Var;
                    i23 = i2;
                    int a82 = g.a(i662, bArr, i7, i23, n3Var62, fVar72);
                    i9 = i662;
                    i26 = i672;
                    i24 = a82;
                    bArr2 = bArr;
                    i29 = i9;
                    i2Var3 = i2Var;
                    obj4 = obj2;
                    unsafe5 = unsafe;
                    i27 = i4;
                    fVar4 = fVar;
                } else {
                    if (i34 >= i36 && i34 <= i2Var3.d) {
                        a = i2Var3.a(i34, 0);
                        if (a != -1) {
                        }
                        if (i8 == i3) {
                        }
                        if (!i2Var.f) {
                        }
                        int i6622 = i8;
                        int i6722 = i6;
                        f fVar722 = fVar2;
                        z0 z0Var222 = (z0) obj2;
                        n3Var = z0Var222.unknownFields;
                        if (n3Var == n3.f) {
                        }
                        n3 n3Var622 = n3Var;
                        i23 = i2;
                        int a822 = g.a(i6622, bArr, i7, i23, n3Var622, fVar722);
                        i9 = i6622;
                        i26 = i6722;
                        i24 = a822;
                        bArr2 = bArr;
                        i29 = i9;
                        i2Var3 = i2Var;
                        obj4 = obj2;
                        unsafe5 = unsafe;
                        i27 = i4;
                        fVar4 = fVar;
                    }
                    a = -1;
                    if (a != -1) {
                    }
                    if (i8 == i3) {
                    }
                    if (!i2Var.f) {
                    }
                    int i66222 = i8;
                    int i67222 = i6;
                    f fVar7222 = fVar2;
                    z0 z0Var2222 = (z0) obj2;
                    n3Var = z0Var2222.unknownFields;
                    if (n3Var == n3.f) {
                    }
                    n3 n3Var6222 = n3Var;
                    i23 = i2;
                    int a8222 = g.a(i66222, bArr, i7, i23, n3Var6222, fVar7222);
                    i9 = i66222;
                    i26 = i67222;
                    i24 = a8222;
                    bArr2 = bArr;
                    i29 = i9;
                    i2Var3 = i2Var;
                    obj4 = obj2;
                    unsafe5 = unsafe;
                    i27 = i4;
                    fVar4 = fVar;
                }
            } else {
                i4 = i27;
                unsafe = unsafe5;
                i5 = 0;
                i2Var = i2Var3;
                obj2 = obj4;
            }
        }
    }

    public final Object b(int i) {
        return this.b[(i / 3) * 2];
    }

    public final Object b(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (x3.e(obj, r0[i + 1] & 1048575) == null) {
            return obj2;
        }
        a(i);
        return obj2;
    }

    public final void b(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        x3.a(obj, j, (1 << (i2 >>> 20)) | x3.c(obj, j));
    }

    public final void b(Object obj, int i, int i2) {
        x3.a(obj, this.a[i2 + 2] & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x009d. Please report as an issue. */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, byte[] bArr, int i, int i2, f fVar) {
        int a;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Unsafe unsafe;
        Object obj2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int c;
        int i15;
        i2 i2Var = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i16 = i2;
        f fVar2 = fVar;
        if (i2Var.h) {
            Unsafe unsafe2 = r;
            int i17 = 0;
            int i18 = i;
            int i19 = 0;
            int i20 = 0;
            int i21 = 1048575;
            int i22 = -1;
            while (i18 < i16) {
                int i23 = i18 + 1;
                int i24 = bArr2[i18];
                if (i24 < 0) {
                    i23 = g.a(i24, bArr2, i23, fVar2);
                    i24 = fVar2.a;
                }
                int i25 = i24 >>> 3;
                int i26 = i24 & 7;
                int i27 = i2Var.c;
                if (i25 > i22) {
                    int i28 = i20 / 3;
                    if (i25 >= i27 && i25 <= i2Var.d) {
                        a = i2Var.a(i25, i28);
                        i20 = a;
                    }
                    i20 = -1;
                } else {
                    if (i25 >= i27 && i25 <= i2Var.d) {
                        a = i2Var.a(i25, i17);
                        i20 = a;
                    }
                    i20 = -1;
                }
                if (i20 == -1) {
                    unsafe = unsafe2;
                    obj2 = obj3;
                    i3 = i21;
                    i10 = i23;
                    i4 = i25;
                    i20 = i17;
                    i8 = i19;
                    i6 = i24;
                } else {
                    int[] iArr = i2Var.a;
                    int i29 = iArr[i20 + 1];
                    int i30 = (i29 & 267386880) >>> 20;
                    long j = i29 & 1048575;
                    if (i30 <= 17) {
                        int i31 = iArr[i20 + 2];
                        int i32 = 1 << (i31 >>> 20);
                        int i33 = i31 & 1048575;
                        int i34 = 1048575;
                        if (i33 != i21) {
                            if (i21 != 1048575) {
                                unsafe2.putInt(obj3, i21, i19);
                                i34 = 1048575;
                            }
                            if (i33 != i34) {
                                i19 = unsafe2.getInt(obj3, i33);
                            }
                            i11 = i33;
                        } else {
                            i11 = i21;
                        }
                        int i35 = i19;
                        switch (i30) {
                            case 0:
                                i12 = i2;
                                unsafe = unsafe2;
                                if (i26 == 1) {
                                    x3.c.a(obj3, j, Double.longBitsToDouble(g.b(i23, bArr2)));
                                    i13 = i23 + 8;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 1:
                                i12 = i2;
                                unsafe = unsafe2;
                                if (i26 == 5) {
                                    x3.c.a(obj3, j, Float.intBitsToFloat(g.a(i23, bArr2)));
                                    i13 = i23 + 4;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 2:
                            case 3:
                                i12 = i2;
                                if (i26 == 0) {
                                    i13 = g.e(bArr2, i23, fVar2);
                                    unsafe2.putLong(obj3, j, fVar2.b);
                                    unsafe = unsafe2;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 4:
                            case 11:
                                i12 = i2;
                                if (i26 == 0) {
                                    int i36 = i23 + 1;
                                    byte b = bArr2[i23];
                                    if (b >= 0) {
                                        fVar2.a = b;
                                    } else {
                                        i36 = g.a(b, bArr2, i36, fVar2);
                                    }
                                    i13 = i36;
                                    unsafe2.putInt(obj3, j, fVar2.a);
                                    unsafe = unsafe2;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 5:
                            case 14:
                                i12 = i2;
                                if (i26 == 1) {
                                    unsafe2.putLong(obj3, j, g.b(i23, bArr2));
                                    i13 = i23 + 8;
                                    unsafe = unsafe2;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 6:
                            case 13:
                                i12 = i2;
                                if (i26 == 5) {
                                    unsafe2.putInt(obj3, j, g.a(i23, bArr2));
                                    i13 = i23 + 4;
                                    unsafe = unsafe2;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 7:
                                i14 = i2;
                                if (i26 == 0) {
                                    i13 = g.e(bArr2, i23, fVar2);
                                    x3.c.a(obj3, j, fVar2.b != 0);
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 8:
                                i14 = i2;
                                if (i26 == 2) {
                                    if ((536870912 & i29) == 0) {
                                        c = g.b(bArr2, i23, fVar2);
                                    } else {
                                        c = g.c(bArr2, i23, fVar2);
                                    }
                                    i13 = c;
                                    unsafe2.putObject(obj3, j, fVar2.c);
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 9:
                                if (i26 == 2) {
                                    i14 = i2;
                                    i13 = g.a(i2Var.c(i20), bArr2, i23, i14, fVar2);
                                    Object object = unsafe2.getObject(obj3, j);
                                    if (object == null) {
                                        unsafe2.putObject(obj3, j, fVar2.c);
                                    } else {
                                        unsafe2.putObject(obj3, j, l1.a(object, fVar2.c));
                                    }
                                    unsafe = unsafe2;
                                    i12 = i14;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 10:
                                if (i26 == 2) {
                                    i13 = g.a(bArr2, i23, fVar2);
                                    unsafe2.putObject(obj3, j, fVar2.c);
                                    i12 = i2;
                                    unsafe = unsafe2;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 12:
                                if (i26 == 0) {
                                    int i37 = i23 + 1;
                                    byte b2 = bArr2[i23];
                                    if (b2 >= 0) {
                                        fVar2.a = b2;
                                    } else {
                                        i37 = g.a(b2, bArr2, i37, fVar2);
                                    }
                                    i13 = i37;
                                    unsafe2.putInt(obj3, j, fVar2.a);
                                    i12 = i2;
                                    unsafe = unsafe2;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 15:
                                if (i26 == 0) {
                                    int i38 = i23 + 1;
                                    byte b3 = bArr2[i23];
                                    if (b3 >= 0) {
                                        fVar2.a = b3;
                                    } else {
                                        i38 = g.a(b3, bArr2, i38, fVar2);
                                    }
                                    i13 = i38;
                                    unsafe2.putInt(obj3, j, w.b(fVar2.a));
                                    i12 = i2;
                                    unsafe = unsafe2;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            case 16:
                                if (i26 == 0) {
                                    i13 = g.e(bArr2, i23, fVar2);
                                    unsafe2.putLong(obj3, j, w.a(fVar2.b));
                                    i12 = i2;
                                    unsafe = unsafe2;
                                    i19 = i35 | i32;
                                    obj2 = obj3;
                                    i15 = i12;
                                    i3 = i11;
                                    i18 = i13;
                                    i4 = i25;
                                    break;
                                }
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                            default:
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i6 = i24;
                                i3 = i11;
                                i10 = i23;
                                i4 = i25;
                                i8 = i35;
                                break;
                        }
                        i2Var = this;
                        bArr2 = bArr;
                        fVar2 = fVar;
                        i16 = i15;
                        obj3 = obj2;
                        unsafe2 = unsafe;
                        i22 = i4;
                        i21 = i3;
                        i17 = 0;
                    } else {
                        i16 = i2;
                        int i39 = i19;
                        i3 = i21;
                        if (i30 != 27) {
                            if (i30 <= 49) {
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                byte[] bArr3 = bArr2;
                                int i40 = i20;
                                i4 = i25;
                                i6 = i24;
                                int i41 = i23;
                                int a2 = i2Var.a(obj4, bArr3, i41, i2, i6, i26, i40, i29, i30, j, fVar2);
                                i5 = i40;
                                if (a2 != i41) {
                                    i18 = a2;
                                    i3 = i3;
                                    i8 = i39;
                                    unsafe = unsafe3;
                                    obj2 = obj4;
                                    i2Var = this;
                                    bArr2 = bArr;
                                    i16 = i2;
                                    fVar2 = fVar;
                                    obj3 = obj2;
                                    i20 = i5;
                                    unsafe2 = unsafe;
                                    i19 = i8;
                                } else {
                                    i9 = a2;
                                    i3 = i3;
                                    i8 = i39;
                                    unsafe = unsafe3;
                                    obj2 = obj4;
                                    i10 = i9;
                                    i20 = i5;
                                }
                            } else {
                                i4 = i25;
                                i5 = i20;
                                i6 = i24;
                                i7 = i23;
                                if (i30 != 50) {
                                    i8 = i39;
                                    unsafe = unsafe2;
                                    Object obj5 = obj3;
                                    int a3 = i2Var.a(obj5, bArr, i7, i2, i6, i4, i26, i29, i30, j, i5, fVar);
                                    obj2 = obj5;
                                    if (a3 != i7) {
                                        i18 = a3;
                                        i2Var = this;
                                        bArr2 = bArr;
                                        i16 = i2;
                                        fVar2 = fVar;
                                        obj3 = obj2;
                                        i20 = i5;
                                        unsafe2 = unsafe;
                                        i19 = i8;
                                    } else {
                                        i9 = a3;
                                        i10 = i9;
                                        i20 = i5;
                                    }
                                } else if (i26 == 2) {
                                    Unsafe unsafe4 = r;
                                    Object b4 = i2Var.b(i5);
                                    Object object2 = unsafe4.getObject(obj3, j);
                                    i2Var.p.getClass();
                                    if (!((y1) object2).a) {
                                        i2Var.p.getClass();
                                        y1 y1Var = y1.b;
                                        y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                                        i2Var.p.getClass();
                                        z1.a(y1Var2, object2);
                                        unsafe4.putObject(obj3, j, y1Var2);
                                    }
                                    i2Var.p.getClass();
                                    b4.getClass();
                                    pvd.j();
                                    return;
                                }
                            }
                            i22 = i4;
                            i21 = i3;
                            i17 = 0;
                        } else if (i26 == 2) {
                            k1 k1Var = (k1) unsafe2.getObject(obj3, j);
                            if (!((c) k1Var).a) {
                                int size = k1Var.size();
                                k1Var = k1Var.b(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, j, k1Var);
                            }
                            t2 c2 = i2Var.c(i20);
                            int a4 = g.a(c2, bArr2, i23, i16, fVar2);
                            k1Var.add(fVar2.c);
                            while (a4 < i16) {
                                int i42 = a4 + 1;
                                byte b5 = bArr2[a4];
                                if (b5 >= 0) {
                                    fVar2.a = b5;
                                } else {
                                    i42 = g.a(b5, bArr2, i42, fVar2);
                                }
                                if (i24 != fVar2.a) {
                                    i18 = a4;
                                    i22 = i25;
                                    i19 = i39;
                                    i21 = i3;
                                    i17 = 0;
                                } else {
                                    a4 = g.a(c2, bArr2, i42, i16, fVar2);
                                    k1Var.add(fVar2.c);
                                }
                            }
                            i18 = a4;
                            i22 = i25;
                            i19 = i39;
                            i21 = i3;
                            i17 = 0;
                        } else {
                            i6 = i24;
                            i7 = i23;
                            i4 = i25;
                            i5 = i20;
                        }
                        unsafe = unsafe2;
                        obj2 = obj3;
                        i10 = i7;
                        i20 = i5;
                        i8 = i39;
                    }
                }
                z0 z0Var = (z0) obj2;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f) {
                    n3Var = new n3();
                    z0Var.unknownFields = n3Var;
                }
                i15 = i2;
                i18 = g.a(i6, bArr, i10, i2, n3Var, fVar);
                i19 = i8;
                i2Var = this;
                bArr2 = bArr;
                fVar2 = fVar;
                i16 = i15;
                obj3 = obj2;
                unsafe2 = unsafe;
                i22 = i4;
                i21 = i3;
                i17 = 0;
            }
            Unsafe unsafe5 = unsafe2;
            Object obj6 = obj3;
            int i43 = i21;
            int i44 = i19;
            int i45 = i16;
            if (i43 != 1048575) {
                unsafe5.putInt(obj6, i43, i44);
            }
            if (i18 == i45) {
                return;
            }
            zzl.j("Failed to parse the message.");
            return;
        }
        a(obj3, bArr, i, i16, 0, fVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean a(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < this.j) {
                int i4 = this.i[i2];
                int[] iArr = this.a;
                int i5 = iArr[i4];
                int i6 = iArr[i4 + 1];
                int i7 = iArr[i4 + 2];
                int i8 = i7 & 1048575;
                int i9 = 1 << (i7 >>> 20);
                if (i8 != i) {
                    if (i8 != 1048575) {
                        i3 = r.getInt(obj, i8);
                    }
                    i = i8;
                }
                if ((268435456 & i6) != 0) {
                    if (i == 1048575) {
                        z = a(i4, obj);
                    } else {
                        z = (i3 & i9) != 0;
                    }
                    if (!z) {
                        return false;
                    }
                }
                int i10 = (267386880 & i6) >>> 20;
                if (i10 != 9 && i10 != 17) {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            if (a(obj, i5, i4) && !c(i4).a(x3.e(obj, i6 & 1048575))) {
                                return false;
                            }
                        } else if (i10 != 49) {
                            if (i10 != 50) {
                                continue;
                            } else {
                                z1 z1Var = this.p;
                                Object e = x3.e(obj, i6 & 1048575);
                                z1Var.getClass();
                                if (!((y1) e).isEmpty()) {
                                    Object b = b(i4);
                                    this.p.getClass();
                                    b.getClass();
                                    pvd.j();
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) x3.e(obj, i6 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        t2 c = c(i4);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!c.a(list.get(i11))) {
                                return false;
                            }
                        }
                    }
                } else {
                    if (i == 1048575) {
                        z2 = a(i4, obj);
                    } else if ((i9 & i3) == 0) {
                        z2 = false;
                    }
                    if (z2 && !c(i4).a(x3.e(obj, i6 & 1048575))) {
                        return false;
                    }
                }
                i2++;
            } else {
                if (this.f) {
                    this.o.getClass();
                    if (!((GeneratedMessageLite$ExtendableMessage) obj).extensions.c()) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static void a(int i, Object obj, c0 c0Var) {
        if (obj instanceof String) {
            c0Var.a.a((String) obj, i);
        } else {
            c0Var.a.a(i, (s) obj);
        }
    }

    public final void a(Object obj, int i, s2 s2Var) {
        int i2 = 536870912 & i;
        t1 t1Var = this.m;
        if (i2 != 0) {
            s2Var.b(t1Var.b(obj, i & 1048575));
        } else {
            s2Var.q(t1Var.b(obj, i & 1048575));
        }
    }

    public final void a(Object obj, int i, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.b(this.m.b(obj, i & 1048575), t2Var, h0Var);
    }

    public final void a(Object obj, long j, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.a(this.m.b(obj, j), t2Var, h0Var);
    }

    public final boolean a(int i, Object obj) {
        int[] iArr = this.a;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & x3.c(obj, j)) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return x3.c.c(obj, j2) != 0.0d;
            case 1:
                return x3.c.d(obj, j2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            case 2:
                return x3.d(obj, j2) != 0;
            case 3:
                return x3.d(obj, j2) != 0;
            case 4:
                return x3.c(obj, j2) != 0;
            case 5:
                return x3.d(obj, j2) != 0;
            case 6:
                return x3.c(obj, j2) != 0;
            case 7:
                return x3.c.a(obj, j2);
            case 8:
                Object e = x3.e(obj, j2);
                if (e instanceof String) {
                    return !((String) e).isEmpty();
                }
                if (e instanceof s) {
                    return !s.b.equals(e);
                }
                ilg.c();
                return false;
            case 9:
                return x3.e(obj, j2) != null;
            case 10:
                return !s.b.equals(x3.e(obj, j2));
            case 11:
                return x3.c(obj, j2) != 0;
            case 12:
                return x3.c(obj, j2) != 0;
            case 13:
                return x3.c(obj, j2) != 0;
            case 14:
                return x3.d(obj, j2) != 0;
            case 15:
                return x3.c(obj, j2) != 0;
            case 16:
                return x3.d(obj, j2) != 0;
            case 17:
                return x3.e(obj, j2) != null;
            default:
                ilg.c();
                return false;
        }
    }

    public final boolean a(Object obj, int i, int i2) {
        return x3.c(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final boolean a(int i, Object obj, Object obj2) {
        return a(i, obj) == a(i, obj2);
    }

    public final int a(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}

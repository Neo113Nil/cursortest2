package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class o extends j {

    /* renamed from: h, reason: collision with root package name */
    public static final j$.sun.misc.a f17672h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f17673i;

    /* renamed from: e, reason: collision with root package name */
    public p f17674e;

    /* renamed from: f, reason: collision with root package name */
    public volatile p f17675f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Thread f17676g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVar = j$.sun.misc.a.f17277b;
        f17672h = aVar;
        f17673i = aVar.h(o.class, "lockState");
    }

    public static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    public o(p pVar) {
        super(-2, null, null);
        int i5;
        this.f17675f = pVar;
        p pVar2 = null;
        while (pVar != null) {
            p pVar3 = (p) pVar.f17659d;
            pVar.f17679g = null;
            pVar.f17678f = null;
            if (pVar2 == null) {
                pVar.f17677e = null;
                pVar.f17681i = false;
            } else {
                Object obj = pVar.f17657b;
                int i10 = pVar.f17656a;
                p pVar4 = pVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = pVar4.f17657b;
                    int i11 = pVar4.f17656a;
                    if (i11 > i10) {
                        i5 = -1;
                    } else if (i11 < i10) {
                        i5 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i12 = ConcurrentHashMap.f17625g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i5 = compareTo;
                            }
                        }
                        i5 = i(obj, obj2);
                    }
                    p pVar5 = i5 <= 0 ? pVar4.f17678f : pVar4.f17679g;
                    if (pVar5 == null) {
                        break;
                    } else {
                        pVar4 = pVar5;
                    }
                }
                pVar.f17677e = pVar4;
                if (i5 <= 0) {
                    pVar4.f17678f = pVar;
                } else {
                    pVar4.f17679g = pVar;
                }
                pVar = c(pVar2, pVar);
            }
            pVar2 = pVar;
            pVar = pVar3;
        }
        this.f17674e = pVar2;
    }

    public final void d() {
        if (f17672h.c(this, f17673i, 0, 1)) {
            return;
        }
        boolean z5 = false;
        while (true) {
            int i5 = this.lockState;
            if ((i5 & (-3)) == 0) {
                if (f17672h.c(this, f17673i, i5, 1)) {
                    break;
                }
            } else if ((i5 & 2) == 0) {
                if (f17672h.c(this, f17673i, i5, i5 | 2)) {
                    this.f17676g = Thread.currentThread();
                    z5 = true;
                }
            } else if (z5) {
                LockSupport.park(this);
            }
        }
        if (z5) {
            this.f17676g = null;
        }
    }

    @Override // j$.util.concurrent.j
    public final j a(int i5, Object obj) {
        Object obj2;
        Thread thread;
        j jVar = this.f17675f;
        while (true) {
            p pVar = null;
            if (jVar == null) {
                return null;
            }
            int i10 = this.lockState;
            if ((i10 & 3) != 0) {
                if (jVar.f17656a != i5 || ((obj2 = jVar.f17657b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    jVar = jVar.f17659d;
                }
            } else {
                j$.sun.misc.a aVar = f17672h;
                long j = f17673i;
                if (aVar.c(this, j, i10, i10 + 4)) {
                    try {
                        p pVar2 = this.f17674e;
                        if (pVar2 != null) {
                            pVar = pVar2.b(i5, obj, null);
                        }
                        if (aVar.e(this, j) == 6 && (thread = this.f17676g) != null) {
                            LockSupport.unpark(thread);
                        }
                        return pVar;
                    } finally {
                    }
                }
            }
        }
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9 A[LOOP:0: B:2:0x0007->B:10:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p e(int i5, Object obj, Object obj2) {
        int i10;
        int i11;
        p b10;
        p b11;
        p pVar;
        p pVar2 = this.f17674e;
        Class<?> cls = null;
        boolean z5 = false;
        while (pVar2 != null) {
            int i12 = pVar2.f17656a;
            if (i12 > i5) {
                i11 = -1;
            } else {
                if (i12 < i5) {
                    i10 = 1;
                } else {
                    Object obj3 = pVar2.f17657b;
                    if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                        return pVar2;
                    }
                    if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                        int i13 = ConcurrentHashMap.f17625g;
                        int compareTo = (obj3 == null || obj3.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj3);
                        if (compareTo != 0) {
                            i10 = compareTo;
                        }
                    }
                    if (!z5) {
                        p pVar3 = pVar2.f17678f;
                        if (pVar3 != null && (b11 = pVar3.b(i5, obj, cls)) != null) {
                            return b11;
                        }
                        p pVar4 = pVar2.f17679g;
                        if (pVar4 != null && (b10 = pVar4.b(i5, obj, cls)) != null) {
                            return b10;
                        }
                        z5 = true;
                    }
                    i11 = i(obj, obj3);
                }
                pVar = i10 > 0 ? pVar2.f17678f : pVar2.f17679g;
                if (pVar != null) {
                    p pVar5 = this.f17675f;
                    p pVar6 = new p(i5, obj, obj2, pVar5, pVar2);
                    this.f17675f = pVar6;
                    if (pVar5 != null) {
                        pVar5.f17680h = pVar6;
                    }
                    if (i10 <= 0) {
                        pVar2.f17678f = pVar6;
                    } else {
                        pVar2.f17679g = pVar6;
                    }
                    if (!pVar2.f17681i) {
                        pVar6.f17681i = true;
                        return null;
                    }
                    d();
                    try {
                        this.f17674e = c(this.f17674e, pVar6);
                        return null;
                    } finally {
                        this.lockState = 0;
                    }
                }
                pVar2 = pVar;
            }
            i10 = i11;
            if (i10 > 0) {
            }
            if (pVar != null) {
            }
        }
        p pVar7 = new p(i5, obj, obj2, null, null);
        this.f17674e = pVar7;
        this.f17675f = pVar7;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(p pVar) {
        p pVar2;
        p pVar3;
        p pVar4 = (p) pVar.f17659d;
        p pVar5 = pVar.f17680h;
        if (pVar5 == null) {
            this.f17675f = pVar4;
        } else {
            pVar5.f17659d = pVar4;
        }
        if (pVar4 != null) {
            pVar4.f17680h = pVar5;
        }
        if (this.f17675f == null) {
            this.f17674e = null;
            return true;
        }
        p pVar6 = this.f17674e;
        if (pVar6 == null || pVar6.f17679g == null || (pVar2 = pVar6.f17678f) == null || pVar2.f17678f == null) {
            return true;
        }
        d();
        try {
            p pVar7 = pVar.f17678f;
            p pVar8 = pVar.f17679g;
            if (pVar7 != null && pVar8 != null) {
                p pVar9 = pVar8;
                while (true) {
                    p pVar10 = pVar9.f17678f;
                    if (pVar10 == null) {
                        break;
                    }
                    pVar9 = pVar10;
                }
                boolean z5 = pVar9.f17681i;
                pVar9.f17681i = pVar.f17681i;
                pVar.f17681i = z5;
                p pVar11 = pVar9.f17679g;
                p pVar12 = pVar.f17677e;
                if (pVar9 == pVar8) {
                    pVar.f17677e = pVar9;
                    pVar9.f17679g = pVar;
                } else {
                    p pVar13 = pVar9.f17677e;
                    pVar.f17677e = pVar13;
                    if (pVar13 != null) {
                        if (pVar9 == pVar13.f17678f) {
                            pVar13.f17678f = pVar;
                        } else {
                            pVar13.f17679g = pVar;
                        }
                    }
                    pVar9.f17679g = pVar8;
                    pVar8.f17677e = pVar9;
                }
                pVar.f17678f = null;
                pVar.f17679g = pVar11;
                if (pVar11 != null) {
                    pVar11.f17677e = pVar;
                }
                pVar9.f17678f = pVar7;
                pVar7.f17677e = pVar9;
                pVar9.f17677e = pVar12;
                if (pVar12 == null) {
                    pVar6 = pVar9;
                } else if (pVar == pVar12.f17678f) {
                    pVar12.f17678f = pVar9;
                } else {
                    pVar12.f17679g = pVar9;
                }
                if (pVar11 != null) {
                    pVar7 = pVar11;
                    if (pVar7 != pVar) {
                    }
                    if (!pVar.f17681i) {
                    }
                    this.f17674e = pVar6;
                    if (pVar == pVar7) {
                        if (pVar != pVar3.f17678f) {
                        }
                        pVar.f17677e = null;
                    }
                    this.lockState = 0;
                    return false;
                }
                pVar7 = pVar;
                if (pVar7 != pVar) {
                }
                if (!pVar.f17681i) {
                }
                this.f17674e = pVar6;
                if (pVar == pVar7) {
                }
                this.lockState = 0;
                return false;
            }
            if (pVar7 == null) {
                if (pVar8 != null) {
                    pVar7 = pVar8;
                }
                pVar7 = pVar;
            }
            if (pVar7 != pVar) {
                p pVar14 = pVar.f17677e;
                pVar7.f17677e = pVar14;
                if (pVar14 == null) {
                    pVar6 = pVar7;
                } else if (pVar == pVar14.f17678f) {
                    pVar14.f17678f = pVar7;
                } else {
                    pVar14.f17679g = pVar7;
                }
                pVar.f17677e = null;
                pVar.f17679g = null;
                pVar.f17678f = null;
            }
            if (!pVar.f17681i) {
                pVar6 = b(pVar6, pVar7);
            }
            this.f17674e = pVar6;
            if (pVar == pVar7 && (pVar3 = pVar.f17677e) != null) {
                if (pVar != pVar3.f17678f) {
                    pVar3.f17678f = null;
                } else if (pVar == pVar3.f17679g) {
                    pVar3.f17679g = null;
                }
                pVar.f17677e = null;
            }
            this.lockState = 0;
            return false;
        } catch (Throwable th2) {
            this.lockState = 0;
            throw th2;
        }
    }

    public static p g(p pVar, p pVar2) {
        p pVar3;
        if (pVar2 != null && (pVar3 = pVar2.f17679g) != null) {
            p pVar4 = pVar3.f17678f;
            pVar2.f17679g = pVar4;
            if (pVar4 != null) {
                pVar4.f17677e = pVar2;
            }
            p pVar5 = pVar2.f17677e;
            pVar3.f17677e = pVar5;
            if (pVar5 == null) {
                pVar3.f17681i = false;
                pVar = pVar3;
            } else if (pVar5.f17678f == pVar2) {
                pVar5.f17678f = pVar3;
            } else {
                pVar5.f17679g = pVar3;
            }
            pVar3.f17678f = pVar2;
            pVar2.f17677e = pVar3;
        }
        return pVar;
    }

    public static p h(p pVar, p pVar2) {
        p pVar3;
        if (pVar2 != null && (pVar3 = pVar2.f17678f) != null) {
            p pVar4 = pVar3.f17679g;
            pVar2.f17678f = pVar4;
            if (pVar4 != null) {
                pVar4.f17677e = pVar2;
            }
            p pVar5 = pVar2.f17677e;
            pVar3.f17677e = pVar5;
            if (pVar5 == null) {
                pVar3.f17681i = false;
                pVar = pVar3;
            } else if (pVar5.f17679g == pVar2) {
                pVar5.f17679g = pVar3;
            } else {
                pVar5.f17678f = pVar3;
            }
            pVar3.f17679g = pVar2;
            pVar2.f17677e = pVar3;
        }
        return pVar;
    }

    public static p c(p pVar, p pVar2) {
        p pVar3;
        pVar2.f17681i = true;
        while (true) {
            p pVar4 = pVar2.f17677e;
            if (pVar4 == null) {
                pVar2.f17681i = false;
                return pVar2;
            }
            if (!pVar4.f17681i || (pVar3 = pVar4.f17677e) == null) {
                break;
            }
            p pVar5 = pVar3.f17678f;
            if (pVar4 == pVar5) {
                p pVar6 = pVar3.f17679g;
                if (pVar6 != null && pVar6.f17681i) {
                    pVar6.f17681i = false;
                    pVar4.f17681i = false;
                    pVar3.f17681i = true;
                    pVar2 = pVar3;
                } else {
                    if (pVar2 == pVar4.f17679g) {
                        pVar = g(pVar, pVar4);
                        p pVar7 = pVar4.f17677e;
                        pVar3 = pVar7 == null ? null : pVar7.f17677e;
                        pVar4 = pVar7;
                        pVar2 = pVar4;
                    }
                    if (pVar4 != null) {
                        pVar4.f17681i = false;
                        if (pVar3 != null) {
                            pVar3.f17681i = true;
                            pVar = h(pVar, pVar3);
                        }
                    }
                }
            } else if (pVar5 != null && pVar5.f17681i) {
                pVar5.f17681i = false;
                pVar4.f17681i = false;
                pVar3.f17681i = true;
                pVar2 = pVar3;
            } else {
                if (pVar2 == pVar4.f17678f) {
                    pVar = h(pVar, pVar4);
                    p pVar8 = pVar4.f17677e;
                    pVar3 = pVar8 == null ? null : pVar8.f17677e;
                    pVar4 = pVar8;
                    pVar2 = pVar4;
                }
                if (pVar4 != null) {
                    pVar4.f17681i = false;
                    if (pVar3 != null) {
                        pVar3.f17681i = true;
                        pVar = g(pVar, pVar3);
                    }
                }
            }
        }
        return pVar;
    }

    public static p b(p pVar, p pVar2) {
        while (pVar2 != null && pVar2 != pVar) {
            p pVar3 = pVar2.f17677e;
            if (pVar3 == null) {
                pVar2.f17681i = false;
                return pVar2;
            }
            if (pVar2.f17681i) {
                pVar2.f17681i = false;
                return pVar;
            }
            p pVar4 = pVar3.f17678f;
            if (pVar4 == pVar2) {
                p pVar5 = pVar3.f17679g;
                if (pVar5 != null && pVar5.f17681i) {
                    pVar5.f17681i = false;
                    pVar3.f17681i = true;
                    pVar = g(pVar, pVar3);
                    pVar3 = pVar2.f17677e;
                    pVar5 = pVar3 == null ? null : pVar3.f17679g;
                }
                if (pVar5 != null) {
                    p pVar6 = pVar5.f17678f;
                    p pVar7 = pVar5.f17679g;
                    if ((pVar7 == null || !pVar7.f17681i) && (pVar6 == null || !pVar6.f17681i)) {
                        pVar5.f17681i = true;
                    } else {
                        if (pVar7 == null || !pVar7.f17681i) {
                            if (pVar6 != null) {
                                pVar6.f17681i = false;
                            }
                            pVar5.f17681i = true;
                            pVar = h(pVar, pVar5);
                            pVar3 = pVar2.f17677e;
                            pVar5 = pVar3 != null ? pVar3.f17679g : null;
                        }
                        if (pVar5 != null) {
                            pVar5.f17681i = pVar3 == null ? false : pVar3.f17681i;
                            p pVar8 = pVar5.f17679g;
                            if (pVar8 != null) {
                                pVar8.f17681i = false;
                            }
                        }
                        if (pVar3 != null) {
                            pVar3.f17681i = false;
                            pVar = g(pVar, pVar3);
                        }
                        pVar2 = pVar;
                    }
                }
                pVar2 = pVar3;
            } else {
                if (pVar4 != null && pVar4.f17681i) {
                    pVar4.f17681i = false;
                    pVar3.f17681i = true;
                    pVar = h(pVar, pVar3);
                    pVar3 = pVar2.f17677e;
                    pVar4 = pVar3 == null ? null : pVar3.f17678f;
                }
                if (pVar4 != null) {
                    p pVar9 = pVar4.f17678f;
                    p pVar10 = pVar4.f17679g;
                    if ((pVar9 == null || !pVar9.f17681i) && (pVar10 == null || !pVar10.f17681i)) {
                        pVar4.f17681i = true;
                    } else {
                        if (pVar9 == null || !pVar9.f17681i) {
                            if (pVar10 != null) {
                                pVar10.f17681i = false;
                            }
                            pVar4.f17681i = true;
                            pVar = g(pVar, pVar4);
                            pVar3 = pVar2.f17677e;
                            pVar4 = pVar3 != null ? pVar3.f17678f : null;
                        }
                        if (pVar4 != null) {
                            pVar4.f17681i = pVar3 == null ? false : pVar3.f17681i;
                            p pVar11 = pVar4.f17678f;
                            if (pVar11 != null) {
                                pVar11.f17681i = false;
                            }
                        }
                        if (pVar3 != null) {
                            pVar3.f17681i = false;
                            pVar = h(pVar, pVar3);
                        }
                        pVar2 = pVar;
                    }
                }
                pVar2 = pVar3;
            }
        }
        return pVar;
    }
}

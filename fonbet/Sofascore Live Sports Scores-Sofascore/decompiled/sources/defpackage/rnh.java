package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rnh implements Iterable, eia {
    public static final rnh e = new rnh(null, 0, 0, 0);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    public rnh(long[] jArr, long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final rnh a(rnh rnhVar) {
        long[] jArr;
        rnh rnhVar2 = this;
        rnh rnhVar3 = e;
        if (rnhVar == rnhVar3) {
            return rnhVar2;
        }
        if (rnhVar2 == rnhVar3) {
            return rnhVar3;
        }
        long j = rnhVar.c;
        long j2 = rnhVar.c;
        long[] jArr2 = rnhVar.d;
        long j3 = rnhVar.b;
        long j4 = rnhVar.a;
        long j5 = rnhVar2.c;
        if (j == j5 && jArr2 == (jArr = rnhVar2.d)) {
            return new rnh(jArr, rnhVar2.a & (~j4), rnhVar2.b & (~j3), j5);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                rnhVar2 = rnhVar2.c(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    rnhVar2 = rnhVar2.c(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    rnhVar2 = rnhVar2.c(i2 + j2 + 64);
                }
            }
        }
        return rnhVar2;
    }

    public final rnh c(long j) {
        long[] jArr;
        int o;
        long[] jArr2;
        long j2 = j - this.c;
        if (Intrinsics.e(j2, 0L) >= 0 && Intrinsics.e(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new rnh(this.d, this.a, j4 & (~j3), this.c);
            }
        } else if (Intrinsics.e(j2, 64L) >= 0 && Intrinsics.e(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new rnh(this.d, j6 & (~j5), this.b, this.c);
            }
        } else if (Intrinsics.e(j2, 0L) < 0 && (jArr = this.d) != null && (o = pea.o(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (o > 0) {
                    mh0.h(jArr, jArr3, 0, 0, o);
                }
                if (o < i) {
                    mh0.h(jArr, jArr3, o, o + 1, length);
                }
                jArr2 = jArr3;
            }
            return new rnh(jArr2, this.a, this.b, this.c);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.c;
        return (Intrinsics.e(j2, 0L) < 0 || Intrinsics.e(j2, 64L) >= 0) ? (Intrinsics.e(j2, 64L) < 0 || Intrinsics.e(j2, 128L) >= 0) ? Intrinsics.e(j2, 0L) <= 0 && (jArr = this.d) != null && pea.o(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.a) != 0 : ((1 << ((int) j2)) & this.b) != 0;
    }

    public final rnh e(rnh rnhVar) {
        rnh rnhVar2;
        long[] jArr;
        rnh rnhVar3 = this;
        rnh rnhVar4 = e;
        if (rnhVar == rnhVar4) {
            return rnhVar3;
        }
        if (rnhVar3 == rnhVar4) {
            return rnhVar;
        }
        long j = rnhVar.c;
        long j2 = rnhVar.c;
        long[] jArr2 = rnhVar.d;
        long j3 = rnhVar.b;
        long j4 = rnhVar.a;
        long j5 = rnhVar3.c;
        long j6 = rnhVar3.b;
        long j7 = rnhVar3.a;
        if (j == j5 && jArr2 == (jArr = rnhVar3.d)) {
            return new rnh(jArr, j7 | j4, j6 | j3, j5);
        }
        long[] jArr3 = rnhVar3.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    rnhVar3 = rnhVar3.m(j8);
                }
            }
            if (j3 != 0) {
                for (int i = 0; i < 64; i++) {
                    if (((1 << i) & j3) != 0) {
                        rnhVar3 = rnhVar3.m(i + j2);
                    }
                }
            }
            if (j4 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j4) != 0) {
                        rnhVar3 = rnhVar3.m(i2 + j2 + 64);
                    }
                }
            }
            return rnhVar3;
        }
        if (jArr3 != null) {
            rnhVar2 = rnhVar;
            for (long j9 : jArr3) {
                rnhVar2 = rnhVar2.m(j9);
            }
        } else {
            rnhVar2 = rnhVar;
        }
        long j10 = rnhVar3.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    rnhVar2 = rnhVar2.m(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j7) != 0) {
                    rnhVar2 = rnhVar2.m(i4 + j10 + 64);
                }
            }
        }
        return rnhVar2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return b5h.a(new qnh(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
    
        if (r5 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
    
        r0 = (defpackage.a0d) r5.a;
        r3 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
    
        if (r3 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0147, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
    
        r22 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015b, code lost:
    
        return new defpackage.rnh(r22, r23, r7, r27).m(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
    
        r4 = new long[r3];
        r0 = r0.a;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013d, code lost:
    
        if (r6 >= r3) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013f, code lost:
    
        r4[r6] = r0[r6];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014f, code lost:
    
        r22 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rnh m(long j) {
        long[] jArr;
        long j2;
        long j3;
        long j4;
        int i;
        a0d a0dVar;
        long j5 = this.c;
        long j6 = j - j5;
        long j7 = 0;
        int e2 = Intrinsics.e(j6, 0L);
        long j8 = this.b;
        if (e2 < 0 || Intrinsics.e(j6, 64L) >= 0) {
            int e3 = Intrinsics.e(j6, 64L);
            long j9 = this.a;
            int i2 = 64;
            if (e3 < 0 || Intrinsics.e(j6, 128L) >= 0) {
                int e4 = Intrinsics.e(j6, 128L);
                long[] jArr2 = this.d;
                if (e4 < 0) {
                    if (jArr2 == null) {
                        return new rnh(new long[]{j}, this.a, this.b, this.c);
                    }
                    int o = pea.o(jArr2, j);
                    if (o < 0) {
                        int i3 = -(o + 1);
                        int length = jArr2.length;
                        long[] jArr3 = new long[length + 1];
                        mh0.h(jArr2, jArr3, 0, 0, i3);
                        mh0.h(jArr2, jArr3, i3 + 1, i3, length);
                        jArr3[i3] = j;
                        return new rnh(jArr3, this.a, this.b, this.c);
                    }
                } else if (!d(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (Intrinsics.e(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    cqa cqaVar = null;
                    while (true) {
                        if (Intrinsics.e(j5, j10) >= 0) {
                            jArr = null;
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (cqaVar == null) {
                                cqaVar = new cqa();
                                if (jArr2 != null) {
                                    long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
                                    jArr = null;
                                    a0dVar = new a0d(copyOf.length);
                                    int i4 = a0dVar.b;
                                    if (i4 < 0) {
                                        zzl.r("");
                                        throw null;
                                    }
                                    j4 = j7;
                                    if (copyOf.length != 0) {
                                        int length2 = copyOf.length + i4;
                                        long[] jArr4 = a0dVar.a;
                                        if (jArr4.length < length2) {
                                            jArr4 = Arrays.copyOf(jArr4, Math.max(length2, (jArr4.length * 3) / 2));
                                            a0dVar.a = jArr4;
                                        }
                                        int i5 = a0dVar.b;
                                        if (i4 != i5) {
                                            mh0.h(jArr4, jArr4, copyOf.length + i4, i4, i5);
                                        }
                                        mh0.h(copyOf, jArr4, i4, 0, copyOf.length);
                                        a0dVar.b += copyOf.length;
                                    }
                                } else {
                                    j4 = j7;
                                    jArr = null;
                                    a0dVar = new a0d();
                                }
                                cqaVar.a = a0dVar;
                            } else {
                                j4 = j7;
                                jArr = null;
                            }
                            i = i2;
                            for (int i6 = 0; i6 < i; i6++) {
                                if (((1 << i6) & j8) != j4) {
                                    ((a0d) cqaVar.a).a(i6 + j5);
                                }
                            }
                        } else {
                            j4 = j7;
                            i = i2;
                            jArr = null;
                        }
                        if (j11 == j4) {
                            j2 = j10;
                            j3 = j4;
                            break;
                        }
                        j5 += 64;
                        i2 = i;
                        j7 = j4;
                        j8 = j11;
                        j11 = j7;
                    }
                }
            } else {
                long j12 = 1 << (((int) j6) - 64);
                if ((j9 & j12) == 0) {
                    return new rnh(this.d, j9 | j12, this.b, this.c);
                }
            }
        } else {
            long j13 = 1 << ((int) j6);
            if ((j8 & j13) == 0) {
                return new rnh(this.d, this.a, j8 | j13, this.c);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(k13.r(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}

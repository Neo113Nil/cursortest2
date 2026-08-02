package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzwo;
import com.google.android.gms.internal.measurement.zzwq;
import com.google.android.gms.internal.measurement.zzws;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class k9p implements zzws {
    public final k9p a = null;
    public final UUID b;
    public final String c;
    public final String d;
    public Thread e;

    public k9p(String str, UUID uuid, String str2, zzwq zzwqVar) {
        this.d = str;
        this.b = uuid;
        this.c = str2;
        zzwqVar.getClass();
        this.e = Thread.currentThread();
    }

    public static String e(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzwq c = zzvy.c();
        zzws zzwsVar = c.b;
        String str = this.d;
        if (zzwsVar == null) {
            throw new kx2(wt3.m("Tried to end [", str, new StringBuilder(str.length() + 101), "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."), 10);
        }
        if (this == zzwsVar) {
            zzvy.b(c, zzwsVar.zzb());
            this.e = null;
            return;
        }
        String zze = zzwsVar.zze();
        StringBuilder sb = new StringBuilder(str.length() + 79 + String.valueOf(zze).length() + 1);
        bf3.v(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", zze);
        sb.append(".");
        throw new kx2(sb.toString(), 11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        r9 = r9.d;
        r15 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ac, code lost:
    
        if (r9.containsKey(r15) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ae, code lost:
    
        ((defpackage.yap) r1.g).d.put(r15, new defpackage.yap(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
    
        if (r14 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        r14.c = (defpackage.yap) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cf, code lost:
    
        if (r14 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d1, code lost:
    
        r14.c = (defpackage.yap) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d7, code lost:
    
        r1.b = r7;
        r1.c++;
        r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01db, code lost:
    
        if (r1.g(r13, r14, r15, (r15 + r14) - r13) != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        int i2;
        zzwo zzwoVar;
        Iterator it;
        wap wapVar;
        int i3;
        String str;
        AtomicReference atomicReference = zzvy.a;
        int i4 = 0;
        int i5 = 0;
        zzws zzwsVar = this;
        while (zzwsVar != null) {
            i4++;
            i5 += zzwsVar.zze().length();
            zzwsVar = zzwsVar.zzb();
            if (zzwsVar != null) {
                i5 += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            zzws zzwsVar2 = this;
            for (int i6 = i4 - 1; i6 >= 0; i6--) {
                strArr[i6] = zzwsVar2.zze();
                zzwsVar2 = zzwsVar2.zzb();
            }
            b10 d = lv9.d();
            cck it2 = vv9.u(strArr).iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                d.A(it2.next(), Integer.valueOf(i7));
                i7++;
            }
            int i8 = 1;
            awf c = d.c(true);
            int i9 = c.f;
            int i10 = i4 >> 2;
            if (i9 <= i10) {
                int i11 = i4 + 1;
                int[] iArr = new int[i11];
                for (int i12 = 0; i12 < i4; i12++) {
                    iArr[i12] = ((Integer) c.get(strArr[i12])).intValue();
                }
                iArr[i4] = i9;
                ql5 ql5Var = new ql5(iArr);
                int i13 = 0;
                while (true) {
                    int i14 = -1;
                    if (i13 >= i11) {
                        break;
                    }
                    ql5Var.d += i8;
                    int i15 = iArr[i13];
                    while (true) {
                        yap yapVar = null;
                        while (true) {
                            if (ql5Var.d <= 0) {
                                i3 = i8;
                                break;
                            }
                            int i16 = ql5Var.c;
                            yap yapVar2 = (yap) ql5Var.g;
                            i3 = i8;
                            if (i16 == 0) {
                                break;
                            }
                            int i17 = ((yap) yapVar2.d.get(Integer.valueOf(iArr[ql5Var.b]))).a;
                            int i18 = ql5Var.c;
                            if (iArr[i17 + i18] == i15) {
                                if (yapVar != null) {
                                    yapVar.c = (yap) ql5Var.g;
                                }
                                ql5Var.c = i18 + 1;
                                ql5Var.d();
                            } else {
                                yap yapVar3 = (yap) ((yap) ql5Var.g).d.get(Integer.valueOf(iArr[ql5Var.b]));
                                int i19 = i14;
                                yap yapVar4 = new yap(yapVar3.a, (ql5Var.c + r0) - 1);
                                ((yap) ql5Var.g).d.put(Integer.valueOf(iArr[ql5Var.b]), yapVar4);
                                int i20 = yapVar4.b + 1;
                                Integer valueOf = Integer.valueOf(iArr[i20]);
                                HashMap hashMap = yapVar4.d;
                                hashMap.put(valueOf, yapVar3);
                                yapVar3.a = i20;
                                if (yapVar != null) {
                                    yapVar.c = yapVar4;
                                }
                                hashMap.put(Integer.valueOf(i15), new yap(i13, 1073741824));
                                ql5Var.d--;
                                ql5Var.e();
                                yapVar = yapVar4;
                                i8 = i3;
                                i14 = i19;
                            }
                        }
                        ql5Var.d += i14;
                        ql5Var.e();
                        i8 = i3;
                    }
                    i13++;
                    i8 = i3;
                }
                int i21 = i8;
                ArrayDeque arrayDeque = new ArrayDeque();
                yap yapVar5 = (yap) ql5Var.f;
                wap wapVar2 = new wap(yapVar5, 0, -1, -1);
                arrayDeque.push(wapVar2);
                while (!arrayDeque.isEmpty()) {
                    wap wapVar3 = (wap) arrayDeque.pop();
                    Iterator it3 = wapVar3.d.d.values().iterator();
                    while (it3.hasNext()) {
                        yap yapVar6 = (yap) it3.next();
                        int i22 = wapVar3.b;
                        int i23 = wapVar3.c;
                        int i24 = yapVar6.a;
                        yap yapVar7 = yapVar5;
                        int i25 = yapVar6.b;
                        if (ql5Var.g(i22, i23, i24, i25)) {
                            it = it3;
                        } else {
                            if (yapVar6.d.isEmpty()) {
                                int i26 = yapVar6.a;
                                it = it3;
                            } else {
                                it = it3;
                            }
                            wapVar = new wap(yapVar6, i21, yapVar6.a, i25);
                            if (wapVar2.a >= wapVar.a) {
                                wapVar2 = wapVar;
                            }
                            arrayDeque.push(wapVar);
                            yapVar5 = yapVar7;
                            it3 = it;
                            i21 = 1;
                        }
                        wapVar = new wap(yapVar6, wapVar3.a + i21, i22, i23);
                        if (wapVar2.a >= wapVar.a) {
                        }
                        arrayDeque.push(wapVar);
                        yapVar5 = yapVar7;
                        it3 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int min = Math.min(iArr.length, wapVar2.c + 1);
                int i27 = 0;
                loop9: while (true) {
                    i = wapVar2.b;
                    i2 = min - i;
                    yapVar5 = (yap) yapVar5.d.get(Integer.valueOf(iArr[(i27 % i2) + i]));
                    if (yapVar5 == null) {
                        break;
                    }
                    for (int i28 = yapVar5.a; i28 < yapVar5.b + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i2) + i] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i2;
                zzwo zzwoVar2 = new zzwo(i, min, i29);
                if (i2 * i29 >= i10) {
                    zzwoVar = zzwoVar2;
                    str = "";
                    if (zzwoVar != null) {
                        int i30 = zzwoVar.a;
                        String concat = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                        int i31 = zzwoVar.b;
                        int i32 = zzwoVar.c;
                        int i33 = ((i31 - i30) * i32) + i30;
                        str = i33 < i4 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i4)))) : "";
                        String join = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                        Locale locale = Locale.US;
                        str = concat + "{" + join + "}x" + i32 + str;
                    }
                    if (!str.isEmpty()) {
                        return str;
                    }
                }
            }
            zzwoVar = null;
            str = "";
            if (zzwoVar != null) {
            }
            if (!str.isEmpty()) {
            }
        }
        char[] cArr = new char[i5];
        zzws zzwsVar3 = this;
        while (zzwsVar3 != null) {
            String zze = zzwsVar3.zze();
            i5 -= zze.length();
            zze.getChars(0, zze.length(), cArr, i5);
            zzwsVar3 = zzwsVar3.zzb();
            if (zzwsVar3 != null) {
                i5 -= 4;
                " -> ".getChars(0, 4, cArr, i5);
            }
        }
        return new String(cArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final Thread zza() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzb() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final UUID zzc() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zzd() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zze() {
        return this.d;
    }
}

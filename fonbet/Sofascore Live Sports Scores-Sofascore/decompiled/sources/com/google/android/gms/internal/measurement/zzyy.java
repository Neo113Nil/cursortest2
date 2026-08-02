package com.google.android.gms.internal.measurement;

import com.ironsource.U3;
import defpackage.a70;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzyy extends zzabm implements zzabi {
    public final Object[] d;
    public final StringBuilder e;
    public int f;

    public zzyy(zzaaf zzaafVar, Object[] objArr, StringBuilder sb) {
        super(zzaafVar);
        this.f = 0;
        this.d = objArr;
        this.e = sb;
    }

    public static void b(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(zzzh.a(obj));
        sb.append(U3.j.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((r8 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        if ((r8 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, zzyz zzyzVar, zzza zzzaVar) {
        String simpleName;
        zzza zzzaVar2;
        boolean z;
        zzzb zzzbVar = zzyzVar.b;
        String str = zzyzVar.d;
        int ordinal = zzzbVar.ordinal();
        StringBuilder sb = this.e;
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = obj instanceof Boolean;
            } else if (ordinal == 2) {
                if (!(obj instanceof Character)) {
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        z = Character.isValidCodePoint(((Number) obj).intValue());
                    }
                    z = false;
                }
                z = true;
            } else if (ordinal == 3) {
                if (!(obj instanceof Integer)) {
                    if (!(obj instanceof Long)) {
                        if (!(obj instanceof Byte)) {
                            if (!(obj instanceof Short)) {
                            }
                        }
                    }
                }
                z = true;
            } else {
                if (ordinal != 4) {
                    throw null;
                }
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                    }
                }
                z = true;
            }
            if (!z) {
                b(sb, obj, str);
                return;
            }
        }
        int ordinal2 = zzyzVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5) {
                            if (!zzzaVar.a()) {
                                int i = zzzaVar.a;
                                int i2 = i & 128;
                                if (i2 == 0) {
                                    zzzaVar2 = zzza.e;
                                } else if (i2 != i || zzzaVar.b != -1 || zzzaVar.c != -1) {
                                    zzzaVar2 = new zzza(i2, -1, -1);
                                }
                                if (zzzaVar2.equals(zzzaVar)) {
                                    Number number = (Number) obj;
                                    Locale locale = zzzh.a;
                                    boolean c = zzzaVar.c();
                                    long longValue = number.longValue();
                                    if (number instanceof Long) {
                                        zzzh.b(sb, longValue, c);
                                        return;
                                    }
                                    if (number instanceof Integer) {
                                        zzzh.b(sb, longValue & 4294967295L, c);
                                        return;
                                    }
                                    if (number instanceof Byte) {
                                        zzzh.b(sb, longValue & 255, c);
                                        return;
                                    }
                                    if (number instanceof Short) {
                                        zzzh.b(sb, longValue & 65535, c);
                                        return;
                                    }
                                    if (!(number instanceof BigInteger)) {
                                        a70.r("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                        return;
                                    }
                                    String bigInteger = ((BigInteger) number).toString(16);
                                    if (c) {
                                        bigInteger = bigInteger.toUpperCase(zzzh.a);
                                    }
                                    sb.append(bigInteger);
                                    return;
                                }
                            }
                            zzzaVar2 = zzzaVar;
                            if (zzzaVar2.equals(zzzaVar)) {
                            }
                        }
                    }
                } else if (zzzaVar.a()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    int intValue = ((Number) obj).intValue();
                    if ((intValue >>> 16) == 0) {
                        sb.append((char) intValue);
                        return;
                    } else {
                        sb.append(Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (zzzaVar.a()) {
                sb.append(obj);
                return;
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = zzzh.a;
                int i3 = zzzaVar.a;
                int i4 = i3 & 162;
                if (i4 != 0) {
                    i4 = ((i3 & 32) == 0 ? 0 : 1) | ((i3 & 128) != 0 ? 2 : 0) | ((i3 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, zzzh.a);
                try {
                    formattable.formatTo(formatter, i4, zzzaVar.b, zzzaVar.c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable out = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        out.append(zzzh.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (zzzaVar.a()) {
                sb.append(zzzh.a(obj));
                return;
            }
        }
        if (!zzzaVar.a()) {
            int i5 = zzyzVar.a;
            if (zzzaVar.c()) {
                i5 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            zzzaVar.d(sb2);
            sb2.append((char) i5);
            str = sb2.toString();
        }
        sb.append(String.format(zzzh.a, str, obj));
    }
}

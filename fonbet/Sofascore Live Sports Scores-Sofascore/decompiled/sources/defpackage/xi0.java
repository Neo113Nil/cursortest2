package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64$PaddingOption;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xi0 implements dz7 {
    public final /* synthetic */ int a;
    public final eek b;
    public final tvd c;

    public /* synthetic */ xi0(eek eekVar, tvd tvdVar, int i) {
        this.a = i;
        this.b = eekVar;
        this.c = tvdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x03cb, code lost:
    
        if (r13 == r12) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03ce, code lost:
    
        if (r13 == (-8)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03d0, code lost:
    
        if (r1 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03d3, code lost:
    
        r0 = kotlin.io.encoding.Base64$PaddingOption.a;
        defpackage.a70.p("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03dc, code lost:
    
        if (r17 != 0) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03de, code lost:
    
        if (r9 != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03e1, code lost:
    
        if (r7 >= r2) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03ec, code lost:
    
        if (defpackage.f01.b[r19[r7] & com.inmobi.media.core.config.models.AdConfig.NETWORK_LOAD_LIMIT_DISABLED] == (-1)) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03ef, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03f2, code lost:
    
        if (r7 < r2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03f4, code lost:
    
        if (r10 != r4) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03f6, code lost:
    
        r1 = new defpackage.x52();
        r1.write(r14, 0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:?, code lost:
    
        return new defpackage.fwh(defpackage.c6o.i(r1, r0.f), r5, defpackage.pe4.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x040d, code lost:
    
        defpackage.a70.r("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0414, code lost:
    
        r0 = r19[r7] & com.inmobi.media.core.config.models.AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        r2 = (char) r0;
        r0 = java.lang.Integer.toString(r0, kotlin.text.CharsKt.checkRadix(8));
        r0.getClass();
        r3 = new java.lang.StringBuilder("Symbol '");
        r3.append(r2);
        r3.append("'(");
        r3.append(r0);
        r3.append(") at index ");
        r3.append(r7 - 1);
        r3.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x044a, code lost:
    
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x044b, code lost:
    
        defpackage.a70.p("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0452, code lost:
    
        defpackage.a70.p("The last unit of input does not have enough bits");
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    @Override // defpackage.dz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zn5 zn5Var) {
        String str;
        int i;
        int i2;
        byte[] bArr;
        boolean z;
        char c;
        int i3;
        Integer intOrNull;
        String str2;
        Drawable drawable;
        int i4 = this.a;
        char c2 = 6;
        eek eekVar = this.b;
        tvd tvdVar = this.c;
        String str3 = null;
        switch (i4) {
            case 0:
                String f0 = CollectionsKt.f0(CollectionsKt.S(nq8.E(eekVar), 1), "/", null, null, null, 62);
                hwh hwhVar = new hwh(new lof(f6a.I(tvdVar.a.getAssets().open(f0))), tvdVar.f, new ti0(f0));
                if (!StringsKt.R(f0)) {
                    String i0 = StringsKt.i0(StringsKt.i0(f0, '#'), '?');
                    String e0 = StringsKt.e0('.', StringsKt.e0('/', i0, i0), "");
                    if (!StringsKt.R(e0)) {
                        String lowerCase = e0.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        str = (String) tjc.a.get(lowerCase);
                        if (str == null) {
                            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                        return new fwh(hwhVar, str, pe4.c);
                    }
                }
                str = null;
                return new fwh(hwhVar, str, pe4.c);
            case 1:
                String str4 = eekVar.a;
                int P = StringsKt.P(str4, ";base64,", 0, false, 6);
                if (P != -1) {
                    int O = StringsKt.O(str4, ':', 0, 6);
                    if (O != -1) {
                        String substring = str4.substring(O + 1, P);
                        d01 d01Var = e01.e;
                        int i5 = P + 8;
                        int length = str4.length();
                        d01Var.getClass();
                        boolean z2 = d01Var.b;
                        int length2 = str4.length();
                        q4 q4Var = u4.Companion;
                        q4Var.getClass();
                        q4.a(i5, length, length2);
                        byte[] bytes = str4.substring(i5, length).getBytes(Charsets.e);
                        bytes.getClass();
                        int length3 = bytes.length;
                        int length4 = bytes.length;
                        q4Var.getClass();
                        q4.a(0, length3, length4);
                        int i6 = -2;
                        if (length3 == 0) {
                            i2 = 0;
                        } else if (length3 != 1) {
                            if (z2) {
                                i = length3;
                                int i7 = 0;
                                while (true) {
                                    char c3 = c2;
                                    if (i7 < length3) {
                                        int i8 = f01.b[bytes[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                                        if (i8 < 0) {
                                            if (i8 == -2) {
                                                i -= length3 - i7;
                                            } else {
                                                i--;
                                            }
                                        }
                                        i7++;
                                        c2 = c3;
                                    }
                                }
                            } else if (bytes[length3 - 1] == 61) {
                                i = length3 - 1;
                                if (bytes[length3 - 2] == 61) {
                                    i = length3 - 2;
                                }
                            } else {
                                i = length3;
                            }
                            i2 = (int) ((i * 6) / 8);
                        } else {
                            a70.p(ljg.j(length3, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                        }
                        byte[] bArr2 = new byte[i2];
                        int[] iArr = d01Var.a ? f01.d : f01.b;
                        int i9 = -8;
                        int i10 = 0;
                        int i11 = 0;
                        int i12 = 0;
                        int i13 = -8;
                        while (true) {
                            if (i10 >= length3) {
                                bArr = bytes;
                                z = false;
                                break;
                            } else {
                                if (i13 != i9 || (i3 = i10 + 3) >= length3) {
                                    bArr = bytes;
                                } else {
                                    bArr = bytes;
                                    int i14 = i10 + 4;
                                    int i15 = (iArr[bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 6) | (iArr[bytes[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 12) | (iArr[bytes[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 18) | iArr[bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                                    if (i15 >= 0) {
                                        bArr2[i11] = (byte) (i15 >> 16);
                                        int i16 = i11 + 2;
                                        bArr2[i11 + 1] = (byte) (i15 >> 8);
                                        i11 += 3;
                                        bArr2[i16] = (byte) i15;
                                        bytes = bArr;
                                        i10 = i14;
                                        i6 = -2;
                                        i9 = -8;
                                    }
                                }
                                int i17 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                int i18 = iArr[i17];
                                if (i18 >= 0) {
                                    c = C4427z5.U;
                                    i10++;
                                    i12 = (i12 << 6) | i18;
                                    int i19 = i13 + 6;
                                    if (i19 >= 0) {
                                        bArr2[i11] = (byte) (i12 >>> i19);
                                        i12 &= (1 << i19) - 1;
                                        i13 -= 2;
                                        i11++;
                                    } else {
                                        i13 = i19;
                                    }
                                } else if (i18 != -2) {
                                    c = C4427z5.U;
                                    if (z2) {
                                        i10++;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Invalid symbol '");
                                        sb.append((char) i17);
                                        sb.append("'(");
                                        String num = Integer.toString(i17, CharsKt.checkRadix(8));
                                        num.getClass();
                                        sb.append(num);
                                        a70.p(me4.g(i10, ") at index ", sb));
                                    }
                                } else if (i13 != -8) {
                                    if (i13 == -6) {
                                        Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.a;
                                    } else if (i13 == -4) {
                                        Base64$PaddingOption[] base64$PaddingOptionArr2 = Base64$PaddingOption.a;
                                        int i20 = i10 + 1;
                                        if (z2) {
                                            while (i20 < length3) {
                                                if (f01.b[bArr[i20] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] == -1) {
                                                    i20++;
                                                }
                                            }
                                        }
                                        if (i20 != length3 && bArr[i20] == 61) {
                                            i10 = i20 + 1;
                                            z = true;
                                            i6 = -2;
                                            break;
                                        } else {
                                            a70.p(ljg.j(i20, "Missing one pad character at index "));
                                        }
                                    } else if (i13 != -2) {
                                        a70.r("Unreachable");
                                    }
                                    i10++;
                                    z = true;
                                    i6 = -2;
                                } else {
                                    a70.p(ljg.j(i10, "Redundant pad character at index "));
                                }
                                bytes = bArr;
                                i6 = -2;
                                i9 = -8;
                            }
                        }
                    } else {
                        i3c.i(eekVar, "invalid data uri: ");
                    }
                } else {
                    i3c.i(eekVar, "invalid data uri: ");
                }
                return null;
            case 2:
                String str5 = uae.b;
                String D = nq8.D(eekVar);
                if (D == null) {
                    a70.r("filePath == null");
                    return null;
                }
                uae j = tnf.j(D, false);
                b18 h = c6o.h(j, tvdVar.f, null, null, 28);
                String e02 = StringsKt.e0('.', j.b(), "");
                if (!StringsKt.R(e02)) {
                    String lowerCase2 = e02.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str3 = (String) tjc.a.get(lowerCase2);
                    if (str3 == null) {
                        str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new fwh(h, str3, pe4.c);
            case 3:
                String str6 = eekVar.e;
                if (str6 == null) {
                    str6 = "";
                }
                int O2 = StringsKt.O(str6, '!', 0, 6);
                if (O2 == -1) {
                    i3c.i(eekVar, "Invalid jar:file URI: ");
                    return null;
                }
                String str7 = uae.b;
                uae j2 = tnf.j(str6.substring(0, O2), false);
                uae j3 = tnf.j(str6.substring(O2 + 1, str6.length()), false);
                s18 s18Var = tvdVar.f;
                s18Var.getClass();
                b18 h2 = c6o.h(j3, qha.H(j2, s18Var, new pcl(20)), null, null, 28);
                String e03 = StringsKt.e0('.', j3.b(), "");
                if (!StringsKt.R(e03)) {
                    String lowerCase3 = e03.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    str3 = (String) tjc.a.get(lowerCase3);
                    if (str3 == null) {
                        str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new fwh(h2, str3, pe4.c);
            default:
                String str8 = eekVar.d;
                if (str8 != null) {
                    if (StringsKt.R(str8)) {
                        str8 = null;
                    }
                    if (str8 != null) {
                        String str9 = (String) CollectionsKt.j0(nq8.E(eekVar));
                        if (str9 == null || (intOrNull = StringsKt.toIntOrNull(str9)) == null) {
                            yhk.r(eekVar, "Invalid android.resource URI: ");
                            return null;
                        }
                        int intValue = intOrNull.intValue();
                        Context context = tvdVar.a;
                        Resources resources = str8.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str8);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        String obj = typedValue.string.toString();
                        if (!StringsKt.R(obj)) {
                            String i02 = StringsKt.i0(StringsKt.i0(obj, '#'), '?');
                            String e04 = StringsKt.e0('.', StringsKt.e0('/', i02, i02), "");
                            if (!StringsKt.R(e04)) {
                                String lowerCase4 = e04.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                str2 = (String) tjc.a.get(lowerCase4);
                                if (str2 == null) {
                                    str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                                if (Intrinsics.c(str2, "text/xml")) {
                                    return new fwh(new hwh(new lof(f6a.I(resources.openRawResource(intValue, new TypedValue()))), tvdVar.f, new u1g(str8, intValue)), str2, pe4.c);
                                }
                                if (str8.equals(context.getPackageName())) {
                                    drawable = rd0.H(intValue, context);
                                } else {
                                    XmlResourceParser xml = resources.getXml(intValue);
                                    int next = xml.next();
                                    while (next != 2 && next != 1) {
                                        next = xml.next();
                                    }
                                    if (next != 2) {
                                        pvd.r("No start tag found.");
                                        return null;
                                    }
                                    Resources.Theme theme = context.getTheme();
                                    ThreadLocal threadLocal = z1g.a;
                                    drawable = resources.getDrawable(intValue, theme);
                                    if (drawable == null) {
                                        hc5.f(ljg.j(intValue, "Invalid resource ID: "));
                                        return null;
                                    }
                                }
                                Drawable drawable2 = drawable;
                                Bitmap.Config[] configArr = gjk.a;
                                boolean z3 = (drawable2 instanceof VectorDrawable) || (drawable2 instanceof gmk);
                                if (z3) {
                                    drawable2 = new BitmapDrawable(context.getResources(), m6k.y(drawable2, (Bitmap.Config) fqj.x(tvdVar, vt9.b), tvdVar.b, tvdVar.c, (kjh) fqj.x(tvdVar, st9.b), tvdVar.d == e3f.b));
                                }
                                return new bs9(rfo.u(drawable2), z3, pe4.c);
                            }
                        }
                        str2 = null;
                        if (Intrinsics.c(str2, "text/xml")) {
                        }
                    }
                }
                yhk.r(eekVar, "Invalid android.resource URI: ");
                return null;
        }
    }
}

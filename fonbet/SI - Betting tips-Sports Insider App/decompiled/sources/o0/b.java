package o0;

import android.text.SpannableStringBuilder;
import com.android.billingclient.api.u0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f21065b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f21066c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f21067d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f21068e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21069a;

    static {
        u0 u0Var = f.f21077c;
        f21065b = Character.toString((char) 8206);
        f21066c = Character.toString((char) 8207);
        f21067d = new b(false);
        f21068e = new b(true);
    }

    public b(boolean z5) {
        u0 u0Var = f.f21075a;
        this.f21069a = z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.f21063c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f21063c = 0;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = aVar.f21063c;
            if (i12 < aVar.f21062b && i5 == 0) {
                CharSequence charSequence2 = aVar.f21061a;
                char charAt = charSequence2.charAt(i12);
                aVar.f21064d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.f21063c);
                    aVar.f21063c = Character.charCount(codePointAt) + aVar.f21063c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.f21063c++;
                    char c2 = aVar.f21064d;
                    directionality = c2 < 1792 ? a.f21060e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i11 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i11++;
                                i10 = -1;
                                continue;
                            case 16:
                            case 17:
                                i11++;
                                i10 = 1;
                                continue;
                            case 18:
                                i11--;
                                i10 = 0;
                                continue;
                        }
                    }
                } else if (i11 == 0) {
                }
                i5 = i11;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f21063c = aVar.f21062b;
        int i5 = 0;
        while (true) {
            int i10 = i5;
            while (aVar.f21063c > 0) {
                byte a7 = aVar.a();
                if (a7 != 0) {
                    if (a7 == 1 || a7 == 2) {
                        if (i5 != 0) {
                            if (i10 == 0) {
                                break;
                            }
                        }
                    } else if (a7 != 9) {
                        switch (a7) {
                            case 14:
                            case 15:
                                if (i10 == i5) {
                                    return -1;
                                }
                                i5--;
                                break;
                            case 16:
                            case 17:
                                if (i10 == i5) {
                                    break;
                                }
                                i5--;
                                break;
                            case 18:
                                i5++;
                                break;
                            default:
                                if (i10 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i5 == 0) {
                        return -1;
                    }
                    if (i10 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        u0 u0Var = f.f21077c;
        if (charSequence == null) {
            return null;
        }
        boolean b10 = u0Var.b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean b11 = (b10 ? f.f21076b : f.f21075a).b(charSequence.length(), charSequence);
        String str = "";
        String str2 = f21066c;
        String str3 = f21065b;
        boolean z5 = this.f21069a;
        spannableStringBuilder.append((CharSequence) ((z5 || !(b11 || a(charSequence) == 1)) ? (!z5 || (b11 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (b10 != z5) {
            spannableStringBuilder.append(b10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b12 = (b10 ? f.f21076b : f.f21075a).b(charSequence.length(), charSequence);
        if (!z5 && (b12 || b(charSequence) == 1)) {
            str = str3;
        } else if (z5 && (!b12 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}

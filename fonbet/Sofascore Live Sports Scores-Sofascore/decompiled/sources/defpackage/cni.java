package defpackage;

import com.ironsource.U3;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cni implements glg {
    public final dni a;

    public cni(dni dniVar) {
        dniVar.getClass();
        this.a = dniVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00be, code lost:
    
        if (r2.equals("END") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ca, code lost:
    
        r4 = defpackage.ini.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c7, code lost:
    
        if (r2.equals("COM") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.glg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nlg V0(String str) {
        ini iniVar;
        int i;
        str.getClass();
        dni dniVar = this.a;
        q1f q1fVar = null;
        if (!dniVar.isOpen()) {
            b0a.R(21, "connection is closed");
            throw null;
        }
        String upperCase = StringsKt.l0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (i3 < length) {
                char charAt = upperCase.charAt(i3);
                if (Intrinsics.d(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) == '*') {
                                do {
                                    i4 = StringsKt.O(upperCase, '*', i4 + 1, 4);
                                    if (i4 >= 0) {
                                        i = i4 + 1;
                                        if (i >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                i3 = i4 + 2;
                            }
                        }
                        i2 = i3;
                        break;
                    }
                    if (upperCase.charAt(i3 + 1) == '-') {
                        i3 = StringsKt.O(upperCase, '\n', i3 + 2, 4);
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                i3++;
            }
        }
        String substring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (substring == null) {
            return new jni(dniVar, str);
        }
        switch (substring.hashCode()) {
            case 65636:
                if (substring.equals("BEG")) {
                    if (!StringsKt.J(upperCase, "EXCLUSIVE", false)) {
                        if (!StringsKt.J(upperCase, "IMMEDIATE", false)) {
                            iniVar = ini.e;
                            break;
                        } else {
                            iniVar = ini.d;
                            break;
                        }
                    } else {
                        iniVar = ini.c;
                        break;
                    }
                }
                iniVar = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (substring.equals("ROL") && !StringsKt.J(upperCase, " TO ", false)) {
                    iniVar = ini.b;
                    break;
                }
                iniVar = null;
                break;
            default:
                iniVar = null;
                break;
        }
        if (iniVar != null) {
            return new jni(dniVar, str, iniVar);
        }
        if (substring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt.J(StringsKt.d0(lowerCase, "journal_mode", ""), U3.j.b, false)) {
                q1fVar = q1f.g;
            }
        }
        if (q1fVar != null) {
            return new jni(dniVar, str, new kni(dniVar, str));
        }
        int hashCode = substring.hashCode();
        return (hashCode == 79487 ? !substring.equals("PRA") : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) ? new jni(dniVar, str) : new kni(dniVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.glg
    public final boolean y() {
        return this.a.y();
    }
}

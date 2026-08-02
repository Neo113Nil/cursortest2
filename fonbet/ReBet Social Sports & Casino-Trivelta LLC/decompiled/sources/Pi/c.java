package Pi;

import Aj.h;
import Oi.e;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.InterfaceC5946y;
import org.spongycastle.asn1.k0;
import org.spongycastle.util.encoders.f;

/* loaded from: classes5.dex */
public abstract class c {
    public static void a(StringBuffer stringBuffer, Oi.b bVar, Hashtable hashtable) {
        if (!bVar.g()) {
            if (bVar.c() != null) {
                b(stringBuffer, bVar.c(), hashtable);
                return;
            }
            return;
        }
        Oi.a[] f10 = bVar.f();
        boolean z10 = true;
        for (int i10 = 0; i10 != f10.length; i10++) {
            if (z10) {
                z10 = false;
            } else {
                stringBuffer.append('+');
            }
            b(stringBuffer, f10[i10], hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, Oi.a aVar, Hashtable hashtable) {
        String str = (String) hashtable.get(aVar.e());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(aVar.e().o());
        }
        stringBuffer.append('=');
        stringBuffer.append(q(aVar.f()));
    }

    public static boolean c(Oi.a aVar, Oi.a aVar2) {
        if (aVar == aVar2) {
            return true;
        }
        return aVar != null && aVar2 != null && aVar.e().equals(aVar2.e()) && e(q(aVar.f())).equals(e(q(aVar2.f())));
    }

    public static String d(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) (bArr[i10] & UByte.MAX_VALUE);
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r0 >= (r6.length() - 1)) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e(String str) {
        String g10 = h.g(str);
        int i10 = 0;
        if (g10.length() > 0 && g10.charAt(0) == '#') {
            InterfaceC5927e h10 = h(g10);
            if (h10 instanceof InterfaceC5946y) {
                g10 = h.g(((InterfaceC5946y) h10).getString());
            }
        }
        if (g10.length() > 1) {
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= g10.length() || g10.charAt(i10) != '\\' || g10.charAt(i11) != ' ') {
                    break;
                }
                i10 += 2;
            }
            int length = g10.length() - 1;
            while (true) {
                int i12 = length - 1;
                if (i12 <= 0 || g10.charAt(i12) != '\\' || g10.charAt(length) != ' ') {
                    break;
                }
                length -= 2;
            }
            g10 = g10.substring(i10, length + 1);
        }
        return l(g10);
    }

    public static int f(char c10) {
        return ('0' > c10 || c10 > '9') ? ('a' > c10 || c10 > 'f') ? c10 - '7' : c10 - 'W' : c10 - '0';
    }

    public static C5936n g(String str, Hashtable hashtable) {
        if (h.k(str).startsWith("OID.")) {
            return new C5936n(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new C5936n(str);
        }
        C5936n c5936n = (C5936n) hashtable.get(h.g(str));
        if (c5936n != null) {
            return c5936n;
        }
        throw new IllegalArgumentException("Unknown object id - " + str + " - passed to distinguished name");
    }

    public static AbstractC5940s h(String str) {
        try {
            return AbstractC5940s.g(f.a(str.substring(1)));
        } catch (IOException e10) {
            throw new IllegalStateException("unknown encoding in name: " + e10);
        }
    }

    public static boolean i(char c10) {
        if ('0' <= c10 && c10 <= '9') {
            return true;
        }
        if ('a' > c10 || c10 > 'f') {
            return 'A' <= c10 && c10 <= 'F';
        }
        return true;
    }

    public static boolean j(Oi.b bVar, Oi.b bVar2) {
        if (!bVar.g()) {
            if (bVar2.g()) {
                return false;
            }
            return c(bVar.c(), bVar2.c());
        }
        if (!bVar2.g()) {
            return false;
        }
        Oi.a[] f10 = bVar.f();
        Oi.a[] f11 = bVar2.f();
        if (f10.length != f11.length) {
            return false;
        }
        for (int i10 = 0; i10 != f10.length; i10++) {
            if (!c(f10[i10], f11[i10])) {
                return false;
            }
        }
        return true;
    }

    public static Oi.b[] k(String str, e eVar) {
        d dVar = new d(str);
        Oi.d dVar2 = new Oi.d(eVar);
        while (dVar.a()) {
            String b10 = dVar.b();
            if (b10.indexOf(43) > 0) {
                d dVar3 = new d(b10, '+');
                d dVar4 = new d(dVar3.b(), '=');
                String b11 = dVar4.b();
                if (!dVar4.a()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                String b12 = dVar4.b();
                C5936n attrNameToOID = eVar.attrNameToOID(b11.trim());
                if (dVar3.a()) {
                    Vector vector = new Vector();
                    Vector vector2 = new Vector();
                    vector.addElement(attrNameToOID);
                    vector2.addElement(o(b12));
                    while (dVar3.a()) {
                        d dVar5 = new d(dVar3.b(), '=');
                        String b13 = dVar5.b();
                        if (!dVar5.a()) {
                            throw new IllegalArgumentException("badly formatted directory string");
                        }
                        String b14 = dVar5.b();
                        vector.addElement(eVar.attrNameToOID(b13.trim()));
                        vector2.addElement(o(b14));
                    }
                    dVar2.b(m(vector), n(vector2));
                } else {
                    dVar2.d(attrNameToOID, o(b12));
                }
            } else {
                d dVar6 = new d(b10, '=');
                String b15 = dVar6.b();
                if (!dVar6.a()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                dVar2.d(eVar.attrNameToOID(b15.trim()), o(dVar6.b()));
            }
        }
        return dVar2.f().f();
    }

    public static String l(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i10 = 1;
            while (i10 < str.length()) {
                char charAt2 = str.charAt(i10);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i10++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static C5936n[] m(Vector vector) {
        int size = vector.size();
        C5936n[] c5936nArr = new C5936n[size];
        for (int i10 = 0; i10 != size; i10++) {
            c5936nArr[i10] = (C5936n) vector.elementAt(i10);
        }
        return c5936nArr;
    }

    public static String[] n(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 != size; i10++) {
            strArr[i10] = (String) vector.elementAt(i10);
        }
        return strArr;
    }

    public static String o(String str) {
        int i10;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i10 = 2;
        } else {
            i10 = 0;
        }
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        char c10 = 0;
        while (i10 != charArray.length) {
            char c11 = charArray[i10];
            if (c11 != ' ') {
                z12 = true;
            }
            if (c11 != '\"') {
                if (c11 == '\\' && !z10 && !z11) {
                    i11 = stringBuffer.length();
                    z10 = true;
                } else if (c11 != ' ' || z10 || z12) {
                    if (!z10 || !i(c11)) {
                        stringBuffer.append(c11);
                    } else if (c10 != 0) {
                        stringBuffer.append((char) ((f(c10) * 16) + f(c11)));
                        z10 = false;
                        c10 = 0;
                    } else {
                        c10 = c11;
                    }
                }
                i10++;
            } else if (z10) {
                stringBuffer.append(c11);
            } else {
                z11 = !z11;
            }
            z10 = false;
            i10++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i11 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static InterfaceC5927e p(String str, int i10) {
        int length = (str.length() - i10) / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            int i12 = (i11 * 2) + i10;
            char charAt = str.charAt(i12);
            char charAt2 = str.charAt(i12 + 1);
            bArr[i11] = (byte) (f(charAt2) | (f(charAt) << 4));
        }
        return AbstractC5940s.g(bArr);
    }

    public static String q(InterfaceC5927e interfaceC5927e) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(interfaceC5927e instanceof InterfaceC5946y) || (interfaceC5927e instanceof k0)) {
            try {
                stringBuffer.append("#" + d(f.b(interfaceC5927e.toASN1Primitive().b(ASN1Encoding.DER))));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((InterfaceC5946y) interfaceC5927e).getString();
            if (string.length() <= 0 || string.charAt(0) != '#') {
                stringBuffer.append(string);
            } else {
                stringBuffer.append("\\" + string);
            }
        }
        int length = stringBuffer.length();
        int i10 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i10 != length) {
            if (stringBuffer.charAt(i10) == ',' || stringBuffer.charAt(i10) == '\"' || stringBuffer.charAt(i10) == '\\' || stringBuffer.charAt(i10) == '+' || stringBuffer.charAt(i10) == '=' || stringBuffer.charAt(i10) == '<' || stringBuffer.charAt(i10) == '>' || stringBuffer.charAt(i10) == ';') {
                stringBuffer.insert(i10, "\\");
                i10++;
                length++;
            }
            i10++;
        }
        if (stringBuffer.length() > 0) {
            for (int i11 = 0; stringBuffer.length() > i11 && stringBuffer.charAt(i11) == ' '; i11 += 2) {
                stringBuffer.insert(i11, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, '\\');
        }
        return stringBuffer.toString();
    }
}

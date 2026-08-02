package defpackage;

import java.io.IOException;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ad2 implements ku3 {
    public final /* synthetic */ int a = 1;
    public final CoroutineContext b;

    public ad2(CoroutineContext coroutineContext, db2 db2Var, String str, Long l) {
        char c;
        char c2;
        coroutineContext.getClass();
        this.b = coroutineContext;
        fc2 fc2Var = jzc.a;
        up3 up3Var = sp3.a;
        if (!StringsKt.b0(str, "multipart/", true)) {
            throw new jz2("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) str));
        }
        int length = str.length();
        int i = 0;
        char c3 = 0;
        int i2 = 0;
        while (true) {
            c = 3;
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str.charAt(i);
            if (c3 != 0) {
                if (c3 != 1) {
                    if (c3 == 2) {
                        if (charAt != '\"') {
                            if (charAt != ',') {
                                if (charAt != ';') {
                                }
                                c3 = 1;
                            }
                            c3 = 0;
                        }
                        c3 = 3;
                    } else if (c3 != 3) {
                        if (c3 != 4) {
                        }
                        c3 = 3;
                    } else {
                        if (charAt != '\"') {
                            if (charAt == '\\') {
                                c3 = 4;
                            }
                        }
                        c3 = 1;
                    }
                } else if (charAt == '=') {
                    c3 = 2;
                } else if (charAt != ';') {
                    if (charAt != ',') {
                        if (charAt != ' ') {
                            if (i2 == 0 && StringsKt.a0(i, str, "boundary=", true)) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            continue;
                        }
                    }
                    c3 = 0;
                }
            } else {
                i = charAt != ';' ? i + 1 : i;
                c3 = 1;
            }
            i2 = 0;
        }
        if (i == -1) {
            is8.e("Failed to parse multipart: Content-Type's boundary parameter is missing");
            throw null;
        }
        int i3 = i + 9;
        byte[] bArr = new byte[74];
        dsf dsfVar = new dsf();
        jzc.a(dsfVar, bArr, (byte) 13);
        jzc.a(dsfVar, bArr, (byte) 10);
        jzc.a(dsfVar, bArr, (byte) 45);
        jzc.a(dsfVar, bArr, (byte) 45);
        int length2 = str.length();
        char c4 = 0;
        while (i3 < length2) {
            char charAt2 = str.charAt(i3);
            int i4 = charAt2 & 65535;
            if (i4 > 127) {
                String num = Integer.toString(i4, CharsKt.checkRadix(16));
                num.getClass();
                throw new IOException("Failed to parse multipart: wrong boundary byte 0x" + num + " - should be 7bit character");
            }
            if (c4 == 0) {
                c2 = ';';
                if (charAt2 == ' ') {
                    continue;
                } else if (charAt2 == '\"') {
                    c4 = 2;
                } else {
                    if (charAt2 == ',' || charAt2 == ';') {
                        break;
                    }
                    jzc.a(dsfVar, bArr, (byte) i4);
                    c4 = 1;
                }
                i3++;
                c = 3;
            } else if (c4 == 1) {
                if (charAt2 != ' ' && charAt2 != ',') {
                    c2 = ';';
                    if (charAt2 == ';') {
                        break;
                    }
                    jzc.a(dsfVar, bArr, (byte) i4);
                    i3++;
                    c = 3;
                } else {
                    break;
                }
            } else {
                if (c4 == 2) {
                    if (charAt2 == '\"') {
                        break;
                    } else if (charAt2 != '\\') {
                        jzc.a(dsfVar, bArr, (byte) i4);
                    } else {
                        c4 = c;
                    }
                } else if (c4 == c) {
                    jzc.a(dsfVar, bArr, (byte) i4);
                    c4 = 2;
                }
                c2 = ';';
                i3++;
                c = 3;
            }
        }
        int i5 = dsfVar.a;
        if (i5 != 4) {
            v7a.z(this, new qj6(db2Var, new fc2(mh0.k(0, i5, bArr), 0), l, (rq3) null));
        } else {
            is8.e("Empty multipart boundary is not allowed");
            throw null;
        }
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        switch (this.a) {
        }
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "CoroutineScope(coroutineContext=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public ad2(CoroutineContext coroutineContext) {
        this.b = coroutineContext;
    }
}

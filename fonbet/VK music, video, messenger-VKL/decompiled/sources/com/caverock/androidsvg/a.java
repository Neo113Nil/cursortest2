package com.caverock.androidsvg;

import android.util.Log;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.c;
import com.ironsource.B5;
import com.ironsource.C4217a2;
import com.ironsource.X3;
import com.vk.dto.common.ImageSizeKey;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ev8;
import xsna.v9x;
import xsna.vp;
import xsna.vu5;
import xsna.zr;

/* compiled from: CSSParser.java */
/* loaded from: classes12.dex */
public final class a {
    public f a;
    public t b;
    public boolean c;

    /* compiled from: CSSParser.java */
    /* renamed from: com.caverock.androidsvg.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0102a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j.values().length];
            b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: CSSParser.java */
    public static class b {
        public final String a;
        public final c b;
        public final String c;

        public b(String str, c cVar, String str2) {
            this.a = str;
            this.b = cVar;
            this.c = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CSSParser.java */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c DASHMATCH;
        public static final c EQUALS;
        public static final c EXISTS;
        public static final c INCLUDES;

        static {
            c cVar = new c("EXISTS", 0);
            EXISTS = cVar;
            c cVar2 = new c("EQUALS", 1);
            EQUALS = cVar2;
            c cVar3 = new c("INCLUDES", 2);
            INCLUDES = cVar3;
            c cVar4 = new c("DASHMATCH", 3);
            DASHMATCH = cVar4;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: CSSParser.java */
    public static class d extends c.i {

        /* compiled from: CSSParser.java */
        /* renamed from: com.caverock.androidsvg.a$d$a, reason: collision with other inner class name */
        public static class C0103a {
            public final int a;
            public final int b;

            public C0103a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }
        }

        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public static int r(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        public final String s() {
            int r;
            if (f()) {
                return null;
            }
            char charAt = this.a.charAt(this.b);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.b++;
            int intValue = h().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = h().intValue();
                    if (intValue != -1) {
                        if (intValue == 10 || intValue == 13 || intValue == 12) {
                            intValue = h().intValue();
                        } else {
                            int r2 = r(intValue);
                            if (r2 != -1) {
                                for (int i = 1; i <= 5 && (r = r((intValue = h().intValue()))) != -1; i++) {
                                    r2 = (r2 * 16) + r;
                                }
                                sb.append((char) r2);
                            }
                        }
                    }
                }
                sb.append((char) intValue);
                intValue = h().intValue();
            }
            return sb.toString();
        }

        public final String t() {
            int i;
            int i2;
            boolean f = f();
            String str = this.a;
            if (f) {
                i2 = this.b;
            } else {
                int i3 = this.b;
                int charAt = str.charAt(i3);
                if (charAt == 45) {
                    charAt = a();
                }
                if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                    i = i3;
                } else {
                    int a = a();
                    while (true) {
                        if ((a < 65 || a > 90) && ((a < 97 || a > 122) && !((a >= 48 && a <= 57) || a == 45 || a == 95))) {
                            break;
                        }
                        a = a();
                    }
                    i = this.b;
                }
                this.b = i3;
                i2 = i;
            }
            int i4 = this.b;
            if (i2 == i4) {
                return null;
            }
            String substring = str.substring(i4, i2);
            this.b = i2;
            return substring;
        }

        /* JADX WARN: Code restructure failed: missing block: B:218:0x043e, code lost:
        
            r2 = r4.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:219:0x0440, code lost:
        
            if (r2 == null) goto L266;
         */
        /* JADX WARN: Code restructure failed: missing block: B:221:0x0446, code lost:
        
            if (r2.isEmpty() == false) goto L265;
         */
        /* JADX WARN: Code restructure failed: missing block: B:222:0x0449, code lost:
        
            r1.add(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:223:0x044c, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0360  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x037c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x035b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x041a  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x043c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x03ff  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0264 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v11, types: [com.caverock.androidsvg.a$m] */
        /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v21, types: [com.caverock.androidsvg.a$k, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v24, types: [com.caverock.androidsvg.a$l] */
        /* JADX WARN: Type inference failed for: r10v28, types: [com.caverock.androidsvg.a$l] */
        /* JADX WARN: Type inference failed for: r10v7, types: [com.caverock.androidsvg.a$m] */
        /* JADX WARN: Type inference failed for: r11v12, types: [com.caverock.androidsvg.a$c] */
        /* JADX WARN: Type inference failed for: r11v38 */
        /* JADX WARN: Type inference failed for: r11v42, types: [com.caverock.androidsvg.a$d$a] */
        /* JADX WARN: Type inference failed for: r11v43 */
        /* JADX WARN: Type inference failed for: r11v55 */
        /* JADX WARN: Type inference failed for: r11v56 */
        /* JADX WARN: Type inference failed for: r11v57, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v60 */
        /* JADX WARN: Type inference failed for: r11v61 */
        /* JADX WARN: Type inference failed for: r11v62 */
        /* JADX WARN: Type inference failed for: r11v69 */
        /* JADX WARN: Type inference failed for: r11v70 */
        /* JADX WARN: Type inference failed for: r20v0 */
        /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r20v2 */
        /* JADX WARN: Type inference failed for: r21v0 */
        /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r21v2 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v2, types: [com.caverock.androidsvg.a$e] */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r8v10, types: [com.caverock.androidsvg.a$s] */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v12, types: [com.caverock.androidsvg.a$s] */
        /* JADX WARN: Type inference failed for: r8v13, types: [com.caverock.androidsvg.a$s] */
        /* JADX WARN: Type inference failed for: r8v14, types: [com.caverock.androidsvg.a$s] */
        /* JADX WARN: Type inference failed for: r8v15, types: [com.caverock.androidsvg.a$s] */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v20 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v9, types: [com.caverock.androidsvg.a$s] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ArrayList u() throws ev8 {
            ?? r6;
            ?? r8;
            String str;
            s sVar;
            h hVar;
            h hVar2;
            h hVar3;
            s sVar2;
            int i;
            v9x v9xVar;
            int i2;
            int i3;
            C0103a c0103a;
            ?? r11;
            C0103a c0103a2;
            ArrayList u;
            ArrayList arrayList;
            ArrayList arrayList2;
            h hVar4;
            String str2 = null;
            if (f()) {
                return null;
            }
            int i4 = 1;
            ArrayList arrayList3 = new ArrayList(1);
            r rVar = new r();
            while (true) {
                if (!f() && !f()) {
                    int i5 = this.b;
                    ArrayList arrayList4 = rVar.a;
                    char c = '+';
                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                        if (d('>')) {
                            e eVar = e.CHILD;
                            q();
                            r6 = eVar;
                        } else if (d('+')) {
                            e eVar2 = e.FOLLOWS;
                            q();
                            r6 = eVar2;
                        }
                        if (d(ImageSizeKey.SIZE_KEY_BASE)) {
                            String t = t();
                            if (t != null) {
                                s sVar3 = new s(r6, t);
                                rVar.b += i4;
                                r8 = sVar3;
                            } else {
                                r8 = str2;
                            }
                        } else {
                            r8 = new s(r6, str2);
                        }
                        while (!f()) {
                            if (d(JwtParser.SEPARATOR_CHAR)) {
                                if (r8 == 0) {
                                    r8 = new s(r6, str2);
                                }
                                String t2 = t();
                                if (t2 == null) {
                                    throw new ev8("Invalid \".class\" simpleSelectors");
                                }
                                r8.a("class", c.EQUALS, t2);
                                rVar.a();
                            } else if (d('#')) {
                                if (r8 == 0) {
                                    r8 = new s(r6, str2);
                                }
                                String t3 = t();
                                if (t3 == null) {
                                    throw new ev8("Invalid \"#id\" simpleSelectors");
                                }
                                r8.a("id", c.EQUALS, t3);
                                rVar.b += 1000000;
                            } else if (d('[')) {
                                if (r8 == 0) {
                                    r8 = new s(r6, str2);
                                }
                                q();
                                String t4 = t();
                                if (t4 == null) {
                                    throw new ev8("Invalid attribute simpleSelectors");
                                }
                                q();
                                Object obj = d(B5.U) ? c.EQUALS : e("~=") ? c.INCLUDES : e("|=") ? c.DASHMATCH : str2;
                                if (obj != null) {
                                    q();
                                    if (f()) {
                                        str = str2;
                                    } else {
                                        str = k();
                                        if (str == null) {
                                            str = t();
                                        }
                                    }
                                    if (str == null) {
                                        throw new ev8("Invalid attribute simpleSelectors");
                                    }
                                    q();
                                } else {
                                    str = str2;
                                }
                                ?? r112 = obj;
                                if (!d(']')) {
                                    throw new ev8("Invalid attribute simpleSelectors");
                                }
                                if (obj == null) {
                                    r112 = c.EXISTS;
                                }
                                r8.a(t4, r112, str);
                                rVar.a();
                            } else {
                                s sVar4 = r8;
                                if (d(':')) {
                                    if (r8 == 0) {
                                        sVar4 = new s(r6, str2);
                                    }
                                    String t5 = t();
                                    if (t5 == null) {
                                        throw new ev8("Invalid pseudo class");
                                    }
                                    j a = j.a(t5);
                                    switch (C0102a.b[a.ordinal()]) {
                                        case 1:
                                            sVar = sVar4;
                                            h hVar5 = new h(0, 1, null, true, false);
                                            rVar.a();
                                            hVar = hVar5;
                                            if (sVar.d == null) {
                                                sVar.d = new ArrayList();
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 2:
                                            sVar = sVar4;
                                            h hVar6 = new h(0, 1, null, false, false);
                                            rVar.a();
                                            hVar = hVar6;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 3:
                                            sVar = sVar4;
                                            str2 = null;
                                            ?? mVar = new m(false, null);
                                            rVar.a();
                                            hVar = mVar;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 4:
                                            sVar = sVar4;
                                            h hVar7 = new h(0, 1, sVar.b, true, true);
                                            rVar.a();
                                            hVar2 = hVar7;
                                            str2 = null;
                                            hVar = hVar2;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 5:
                                            sVar = sVar4;
                                            h hVar8 = new h(0, 1, sVar.b, false, true);
                                            rVar.a();
                                            hVar2 = hVar8;
                                            str2 = null;
                                            hVar = hVar2;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 6:
                                            sVar = sVar4;
                                            i4 = 1;
                                            ?? mVar2 = new m(true, sVar.b);
                                            rVar.a();
                                            hVar2 = mVar2;
                                            str2 = null;
                                            hVar = hVar2;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 7:
                                            sVar = sVar4;
                                            ?? nVar = new n();
                                            rVar.a();
                                            hVar3 = nVar;
                                            str2 = null;
                                            i4 = 1;
                                            hVar = hVar3;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 8:
                                            sVar = sVar4;
                                            ?? iVar = new i();
                                            rVar.a();
                                            hVar3 = iVar;
                                            str2 = null;
                                            i4 = 1;
                                            hVar = hVar3;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                            ?? r20 = (a == j.nth_child || a == j.nth_of_type) ? i4 : 0;
                                            ?? r21 = (a == j.nth_of_type || a == j.nth_last_of_type) ? i4 : 0;
                                            if (!f()) {
                                                int i6 = this.b;
                                                if (d('(')) {
                                                    q();
                                                    if (e("odd")) {
                                                        c0103a2 = new C0103a(2, i4);
                                                    } else if (e("even")) {
                                                        c0103a2 = new C0103a(2, 0);
                                                    } else {
                                                        int i7 = (!d(c) && d('-')) ? -1 : i4;
                                                        int i8 = this.b;
                                                        int i9 = this.c;
                                                        String str3 = this.a;
                                                        v9x a2 = v9x.a(i8, i9, str3);
                                                        if (a2 != null) {
                                                            this.b = a2.a;
                                                        }
                                                        if (d('n') || d('N')) {
                                                            if (a2 != null) {
                                                                sVar2 = sVar4;
                                                            } else {
                                                                sVar2 = sVar4;
                                                                a2 = new v9x(1L, this.b);
                                                            }
                                                            q();
                                                            boolean d = d('+');
                                                            i = (d || !(d = d('-'))) ? 1 : -1;
                                                            if (d) {
                                                                q();
                                                                v9xVar = v9x.a(this.b, i9, str3);
                                                                if (v9xVar != null) {
                                                                    this.b = v9xVar.a;
                                                                } else {
                                                                    this.b = i6;
                                                                    r11 = 0;
                                                                    if (r11 != 0) {
                                                                        throw new ev8("Invalid or missing parameter section for pseudo class: ".concat(t5));
                                                                    }
                                                                    sVar = sVar2;
                                                                    h hVar9 = new h(r11.a, r11.b, sVar.b, r20, r21);
                                                                    rVar.a();
                                                                    hVar3 = hVar9;
                                                                    str2 = null;
                                                                    i4 = 1;
                                                                    hVar = hVar3;
                                                                    if (sVar.d == null) {
                                                                    }
                                                                    sVar.d.add(hVar);
                                                                    r8 = sVar;
                                                                    c = '+';
                                                                    break;
                                                                }
                                                            } else {
                                                                v9xVar = null;
                                                            }
                                                        } else {
                                                            v9xVar = a2;
                                                            sVar2 = sVar4;
                                                            i = i7;
                                                            a2 = null;
                                                            i7 = 1;
                                                        }
                                                        if (a2 == null) {
                                                            i2 = i;
                                                            i3 = 0;
                                                        } else {
                                                            i2 = i;
                                                            i3 = i7 * ((int) a2.b);
                                                        }
                                                        c0103a = new C0103a(i3, v9xVar == null ? 0 : i2 * ((int) v9xVar.b));
                                                        q();
                                                        r11 = c0103a;
                                                        if (!d(')')) {
                                                            this.b = i6;
                                                            r11 = 0;
                                                        }
                                                        if (r11 != 0) {
                                                        }
                                                    }
                                                    sVar2 = sVar4;
                                                    c0103a = c0103a2;
                                                    q();
                                                    r11 = c0103a;
                                                    if (!d(')')) {
                                                    }
                                                    if (r11 != 0) {
                                                    }
                                                }
                                            }
                                            r11 = str2;
                                            sVar2 = sVar4;
                                            if (r11 != 0) {
                                            }
                                            break;
                                        case 13:
                                            if (!f()) {
                                                int i10 = this.b;
                                                if (d('(')) {
                                                    q();
                                                    u = u();
                                                    if (u == null) {
                                                        this.b = i10;
                                                    } else if (d(')')) {
                                                        Iterator it = u.iterator();
                                                        while (it.hasNext() && (arrayList = ((r) it.next()).a) != null) {
                                                            Iterator it2 = arrayList.iterator();
                                                            while (it2.hasNext() && (arrayList2 = ((s) it2.next()).d) != null) {
                                                                Iterator it3 = arrayList2.iterator();
                                                                while (it3.hasNext()) {
                                                                    if (((g) it3.next()) instanceof k) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (u != null) {
                                                            throw new ev8("Invalid or missing parameter section for pseudo class: ".concat(t5));
                                                        }
                                                        ?? kVar = new k();
                                                        kVar.a = u;
                                                        Iterator it4 = u.iterator();
                                                        int i11 = Integer.MIN_VALUE;
                                                        while (it4.hasNext()) {
                                                            int i12 = ((r) it4.next()).b;
                                                            if (i12 > i11) {
                                                                i11 = i12;
                                                            }
                                                        }
                                                        rVar.b = i11;
                                                        hVar4 = kVar;
                                                        sVar = sVar4;
                                                        hVar = hVar4;
                                                        if (sVar.d == null) {
                                                        }
                                                        sVar.d.add(hVar);
                                                        r8 = sVar;
                                                        c = '+';
                                                        break;
                                                    } else {
                                                        this.b = i10;
                                                    }
                                                }
                                            }
                                            u = str2;
                                            if (u != null) {
                                            }
                                            break;
                                        case 14:
                                            ?? oVar = new o();
                                            rVar.a();
                                            hVar4 = oVar;
                                            sVar = sVar4;
                                            hVar = hVar4;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 15:
                                            if (!f()) {
                                                int i13 = this.b;
                                                if (d('(')) {
                                                    q();
                                                    ?? r113 = str2;
                                                    while (true) {
                                                        String t6 = t();
                                                        r113 = r113;
                                                        if (t6 == null) {
                                                            this.b = i13;
                                                        } else {
                                                            if (r113 == 0) {
                                                                r113 = new ArrayList();
                                                            }
                                                            r113.add(t6);
                                                            q();
                                                            if (!p()) {
                                                                if (!d(')')) {
                                                                    this.b = i13;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            ?? lVar = new l(t5);
                                            rVar.a();
                                            hVar4 = lVar;
                                            sVar = sVar4;
                                            hVar = hVar4;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                            ?? lVar2 = new l(t5);
                                            rVar.a();
                                            hVar4 = lVar2;
                                            sVar = sVar4;
                                            hVar = hVar4;
                                            if (sVar.d == null) {
                                            }
                                            sVar.d.add(hVar);
                                            r8 = sVar;
                                            c = '+';
                                            break;
                                        default:
                                            throw new ev8("Unsupported pseudo class: ".concat(t5));
                                    }
                                } else if (r8 != 0) {
                                    if (rVar.a == null) {
                                        rVar.a = new ArrayList();
                                    }
                                    rVar.a.add(r8);
                                    if (p()) {
                                        arrayList3.add(rVar);
                                        rVar = new r();
                                    }
                                } else {
                                    this.b = i5;
                                }
                            }
                        }
                        if (r8 != 0) {
                        }
                    }
                    r6 = str2;
                    if (d(ImageSizeKey.SIZE_KEY_BASE)) {
                    }
                    while (!f()) {
                    }
                    if (r8 != 0) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CSSParser.java */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e CHILD;
        public static final e DESCENDANT;
        public static final e FOLLOWS;

        static {
            e eVar = new e("DESCENDANT", 0);
            DESCENDANT = eVar;
            e eVar2 = new e("CHILD", 1);
            CHILD = eVar2;
            e eVar3 = new e("FOLLOWS", 2);
            FOLLOWS = eVar3;
            $VALUES = new e[]{eVar, eVar2, eVar3};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CSSParser.java */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f all;
        public static final f aural;
        public static final f braille;
        public static final f embossed;
        public static final f handheld;
        public static final f print;
        public static final f projection;
        public static final f screen;
        public static final f speech;
        public static final f tty;
        public static final f tv;

        static {
            f fVar = new f("all", 0);
            all = fVar;
            f fVar2 = new f("aural", 1);
            aural = fVar2;
            f fVar3 = new f("braille", 2);
            braille = fVar3;
            f fVar4 = new f("embossed", 3);
            embossed = fVar4;
            f fVar5 = new f("handheld", 4);
            handheld = fVar5;
            f fVar6 = new f("print", 5);
            print = fVar6;
            f fVar7 = new f("projection", 6);
            projection = fVar7;
            f fVar8 = new f("screen", 7);
            screen = fVar8;
            f fVar9 = new f("speech", 8);
            speech = fVar9;
            f fVar10 = new f("tty", 9);
            tty = fVar10;
            f fVar11 = new f("tv", 10);
            tv = fVar11;
            $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    /* compiled from: CSSParser.java */
    public interface g {
        boolean a(SVG.k0 k0Var);
    }

    /* compiled from: CSSParser.java */
    public static class h implements g {
        public final int a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;

        public h(int i, int i2, String str, boolean z, boolean z2) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            this.e = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[RETURN] */
        @Override // com.caverock.androidsvg.a.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(SVG.k0 k0Var) {
            int i;
            int i2;
            boolean z = this.d;
            String str = this.e;
            if (z && str == null) {
                str = k0Var.m();
            }
            SVG.i0 i0Var = k0Var.b;
            if (i0Var != null) {
                Iterator<SVG.m0> it = i0Var.n().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    SVG.k0 k0Var2 = (SVG.k0) it.next();
                    if (k0Var2 == k0Var) {
                        i = i2;
                    }
                    if (str == null || k0Var2.m().equals(str)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.c ? i + 1 : i2 - i;
            int i4 = this.a;
            int i5 = this.b;
            if (i4 == 0) {
                return i3 == i5;
            }
            int i6 = i3 - i5;
            if (i6 % i4 != 0 || (Integer.signum(i6) != 0 && Integer.signum(i6) != Integer.signum(i4))) {
            }
        }

        public final String toString() {
            String str = this.c ? "" : "last-";
            boolean z = this.d;
            int i = this.b;
            int i2 = this.a;
            return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    /* compiled from: CSSParser.java */
    public static class i implements g {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.a.g
        public final boolean a(SVG.k0 k0Var) {
            return !(k0Var instanceof SVG.i0) || ((SVG.i0) k0Var).n().size() == 0;
        }

        public final String toString() {
            return "empty";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CSSParser.java */
    public static final class j {
        private static final /* synthetic */ j[] $VALUES;
        public static final j UNSUPPORTED;
        public static final j active;
        private static final Map<String, j> cache;
        public static final j checked;
        public static final j disabled;
        public static final j empty;
        public static final j enabled;
        public static final j first_child;
        public static final j first_of_type;
        public static final j focus;
        public static final j hover;
        public static final j indeterminate;
        public static final j lang;
        public static final j last_child;
        public static final j last_of_type;
        public static final j link;
        public static final j not;
        public static final j nth_child;
        public static final j nth_last_child;
        public static final j nth_last_of_type;
        public static final j nth_of_type;
        public static final j only_child;
        public static final j only_of_type;
        public static final j root;
        public static final j target;
        public static final j visited;

        static {
            j jVar = new j("target", 0);
            target = jVar;
            j jVar2 = new j("root", 1);
            root = jVar2;
            j jVar3 = new j("nth_child", 2);
            nth_child = jVar3;
            j jVar4 = new j("nth_last_child", 3);
            nth_last_child = jVar4;
            j jVar5 = new j("nth_of_type", 4);
            nth_of_type = jVar5;
            j jVar6 = new j("nth_last_of_type", 5);
            nth_last_of_type = jVar6;
            j jVar7 = new j("first_child", 6);
            first_child = jVar7;
            j jVar8 = new j("last_child", 7);
            last_child = jVar8;
            j jVar9 = new j("first_of_type", 8);
            first_of_type = jVar9;
            j jVar10 = new j("last_of_type", 9);
            last_of_type = jVar10;
            j jVar11 = new j("only_child", 10);
            only_child = jVar11;
            j jVar12 = new j("only_of_type", 11);
            only_of_type = jVar12;
            j jVar13 = new j("empty", 12);
            empty = jVar13;
            j jVar14 = new j("not", 13);
            not = jVar14;
            j jVar15 = new j("lang", 14);
            lang = jVar15;
            j jVar16 = new j("link", 15);
            link = jVar16;
            j jVar17 = new j("visited", 16);
            visited = jVar17;
            j jVar18 = new j("hover", 17);
            hover = jVar18;
            j jVar19 = new j(SignalingProtocol.KEY_ACTIVE, 18);
            active = jVar19;
            j jVar20 = new j("focus", 19);
            focus = jVar20;
            j jVar21 = new j("enabled", 20);
            enabled = jVar21;
            j jVar22 = new j(C4217a2.e, 21);
            disabled = jVar22;
            j jVar23 = new j("checked", 22);
            checked = jVar23;
            j jVar24 = new j("indeterminate", 23);
            indeterminate = jVar24;
            j jVar25 = new j("UNSUPPORTED", 24);
            UNSUPPORTED = jVar25;
            $VALUES = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16, jVar17, jVar18, jVar19, jVar20, jVar21, jVar22, jVar23, jVar24, jVar25};
            cache = new HashMap();
            for (j jVar26 : values()) {
                if (jVar26 != UNSUPPORTED) {
                    cache.put(jVar26.name().replace('_', '-'), jVar26);
                }
            }
        }

        public j() {
            throw null;
        }

        public static j a(String str) {
            j jVar = cache.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }
    }

    /* compiled from: CSSParser.java */
    public static class k implements g {
        public List<r> a;

        @Override // com.caverock.androidsvg.a.g
        public final boolean a(SVG.k0 k0Var) {
            Iterator<r> it = this.a.iterator();
            while (it.hasNext()) {
                if (a.g(it.next(), k0Var)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return vp.b(")", new StringBuilder("not("), this.a);
        }
    }

    /* compiled from: CSSParser.java */
    public static class l implements g {
        public final String a;

        public l(String str) {
            this.a = str;
        }

        @Override // com.caverock.androidsvg.a.g
        public final boolean a(SVG.k0 k0Var) {
            return false;
        }

        public final String toString() {
            return this.a;
        }
    }

    /* compiled from: CSSParser.java */
    public static class m implements g {
        public final boolean a;
        public final String b;

        public m(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // com.caverock.androidsvg.a.g
        public final boolean a(SVG.k0 k0Var) {
            int i;
            boolean z = this.a;
            String str = this.b;
            if (z && str == null) {
                str = k0Var.m();
            }
            SVG.i0 i0Var = k0Var.b;
            if (i0Var != null) {
                Iterator<SVG.m0> it = i0Var.n().iterator();
                i = 0;
                while (it.hasNext()) {
                    SVG.k0 k0Var2 = (SVG.k0) it.next();
                    if (str == null || k0Var2.m().equals(str)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public final String toString() {
            return this.a ? zr.a("only-of-type <", this.b, ">") : "only-child";
        }
    }

    /* compiled from: CSSParser.java */
    public static class n implements g {
        @Override // com.caverock.androidsvg.a.g
        public final boolean a(SVG.k0 k0Var) {
            return k0Var.b == null;
        }

        public final String toString() {
            return "root";
        }
    }

    /* compiled from: CSSParser.java */
    public static class o implements g {
        @Override // com.caverock.androidsvg.a.g
        public final boolean a(SVG.k0 k0Var) {
            return false;
        }

        public final String toString() {
            return "target";
        }
    }

    /* compiled from: CSSParser.java */
    public static class p {
        public r a;
        public SVG.Style b;
        public t c;

        public final String toString() {
            return String.valueOf(this.a) + " {...} (src=" + this.c + ")";
        }
    }

    /* compiled from: CSSParser.java */
    public static class q {
        public ArrayList a = null;

        public final void a(p pVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            for (int i = 0; i < this.a.size(); i++) {
                if (((p) this.a.get(i)).a.b > pVar.a.b) {
                    this.a.add(i, pVar);
                    return;
                }
            }
            this.a.add(pVar);
        }

        public final void b(q qVar) {
            if (qVar.a == null) {
                return;
            }
            if (this.a == null) {
                this.a = new ArrayList(qVar.a.size());
            }
            Iterator it = qVar.a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        public final String toString() {
            if (this.a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(((p) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    /* compiled from: CSSParser.java */
    public static class r {
        public ArrayList a = null;
        public int b = 0;

        public final void a() {
            this.b += 1000;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                sb.append((s) it.next());
                sb.append(' ');
            }
            sb.append('[');
            return vu5.b(sb, this.b, ']');
        }
    }

    /* compiled from: CSSParser.java */
    public static class s {
        public final e a;
        public final String b;
        public ArrayList c = null;
        public ArrayList d = null;

        public s(e eVar, String str) {
            this.a = null;
            this.b = null;
            this.a = eVar == null ? e.DESCENDANT : eVar;
            this.b = str;
        }

        public final void a(String str, c cVar, String str2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new b(str, cVar, str2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            e eVar = e.CHILD;
            e eVar2 = this.a;
            if (eVar2 == eVar) {
                sb.append("> ");
            } else if (eVar2 == e.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    sb.append('[');
                    String str2 = bVar.a;
                    String str3 = bVar.c;
                    sb.append(str2);
                    int i = C0102a.a[bVar.b.ordinal()];
                    if (i == 1) {
                        sb.append(B5.U);
                        sb.append(str3);
                    } else if (i == 2) {
                        sb.append("~=");
                        sb.append(str3);
                    } else if (i == 3) {
                        sb.append("|=");
                        sb.append(str3);
                    }
                    sb.append(']');
                }
            }
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    g gVar = (g) it2.next();
                    sb.append(':');
                    sb.append(gVar);
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CSSParser.java */
    public static final class t {
        private static final /* synthetic */ t[] $VALUES;
        public static final t Document;
        public static final t RenderOptions;

        static {
            t tVar = new t("Document", 0);
            Document = tVar;
            t tVar2 = new t("RenderOptions", 1);
            RenderOptions = tVar2;
            $VALUES = new t[]{tVar, tVar2};
        }

        public t() {
            throw null;
        }

        public static t valueOf(String str) {
            return (t) Enum.valueOf(t.class, str);
        }

        public static t[] values() {
            return (t[]) $VALUES.clone();
        }
    }

    public static int a(ArrayList arrayList, int i2, SVG.k0 k0Var) {
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i2);
        SVG.i0 i0Var = k0Var.b;
        if (obj != i0Var) {
            return -1;
        }
        Iterator<SVG.m0> it = i0Var.n().iterator();
        while (it.hasNext()) {
            if (it.next() == k0Var) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static ArrayList c(d dVar) {
        ArrayList arrayList = new ArrayList();
        while (!dVar.f()) {
            String str = dVar.a;
            String str2 = null;
            if (!dVar.f()) {
                int i2 = dVar.b;
                char charAt = str.charAt(i2);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    dVar.b = i2;
                } else {
                    int a = dVar.a();
                    while (true) {
                        if ((a < 65 || a > 90) && (a < 97 || a > 122)) {
                            break;
                        }
                        a = dVar.a();
                    }
                    str2 = str.substring(i2, dVar.b);
                }
            }
            if (str2 == null) {
                break;
            }
            try {
                arrayList.add(f.valueOf(str2));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.p()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(r rVar, int i2, ArrayList arrayList, int i3, SVG.k0 k0Var) {
        s sVar = (s) rVar.a.get(i2);
        if (!i(sVar, k0Var)) {
            return false;
        }
        e eVar = sVar.a;
        if (eVar == e.DESCENDANT) {
            if (i2 != 0) {
                while (i3 >= 0) {
                    if (!h(rVar, i2 - 1, arrayList, i3)) {
                        i3--;
                    }
                }
                return false;
            }
            return true;
        }
        if (eVar == e.CHILD) {
            return h(rVar, i2 - 1, arrayList, i3);
        }
        int a = a(arrayList, i3, k0Var);
        if (a <= 0) {
            return false;
        }
        return f(rVar, i2 - 1, arrayList, i3, (SVG.k0) k0Var.b.n().get(a - 1));
    }

    public static boolean g(r rVar, SVG.k0 k0Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = k0Var.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((SVG.m0) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = rVar.a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return i((s) rVar.a.get(0), k0Var);
        }
        ArrayList arrayList3 = rVar.a;
        return f(rVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, k0Var);
    }

    public static boolean h(r rVar, int i2, ArrayList arrayList, int i3) {
        s sVar = (s) rVar.a.get(i2);
        SVG.k0 k0Var = (SVG.k0) arrayList.get(i3);
        if (!i(sVar, k0Var)) {
            return false;
        }
        e eVar = sVar.a;
        if (eVar == e.DESCENDANT) {
            if (i2 != 0) {
                while (i3 > 0) {
                    i3--;
                    if (h(rVar, i2 - 1, arrayList, i3)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (eVar == e.CHILD) {
            return h(rVar, i2 - 1, arrayList, i3 - 1);
        }
        int a = a(arrayList, i3, k0Var);
        if (a <= 0) {
            return false;
        }
        return f(rVar, i2 - 1, arrayList, i3, (SVG.k0) k0Var.b.n().get(a - 1));
    }

    public static boolean i(s sVar, SVG.k0 k0Var) {
        ArrayList arrayList;
        String str = sVar.b;
        if (str != null && !str.equals(k0Var.m().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = sVar.c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                String str2 = bVar.a;
                String str3 = bVar.c;
                if (str2.equals("id")) {
                    if (!str3.equals(k0Var.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = k0Var.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = sVar.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((g) it2.next()).a(k0Var)) {
                return false;
            }
        }
        return true;
    }

    public final void b(q qVar, d dVar) throws ev8 {
        int intValue;
        char charAt;
        int r2;
        String t2 = dVar.t();
        dVar.q();
        if (t2 == null) {
            throw new ev8("Invalid '@' rule");
        }
        int i2 = 0;
        if (!this.c && t2.equals(X3.i.I0)) {
            ArrayList c2 = c(dVar);
            if (!dVar.d('{')) {
                throw new ev8("Invalid @media rule: missing rule set");
            }
            dVar.q();
            f fVar = this.a;
            Iterator it = c2.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (fVar2 == f.all || fVar2 == fVar) {
                    this.c = true;
                    qVar.b(e(dVar));
                    this.c = false;
                    break;
                }
            }
            e(dVar);
            if (!dVar.f() && !dVar.d('}')) {
                throw new ev8("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.c || !t2.equals("import")) {
            while (!dVar.f() && ((intValue = dVar.h().intValue()) != 59 || i2 != 0)) {
                if (intValue == 123) {
                    i2++;
                } else if (intValue == 125 && i2 > 0 && i2 - 1 == 0) {
                    break;
                }
            }
        } else {
            String str = null;
            if (!dVar.f()) {
                int i3 = dVar.b;
                if (dVar.e("url(")) {
                    dVar.q();
                    String s2 = dVar.s();
                    if (s2 == null) {
                        String str2 = dVar.a;
                        StringBuilder sb = new StringBuilder();
                        while (!dVar.f() && (charAt = str2.charAt(dVar.b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !c.i.g(charAt) && !Character.isISOControl((int) charAt)) {
                            dVar.b++;
                            if (charAt == '\\') {
                                if (!dVar.f()) {
                                    int i4 = dVar.b;
                                    dVar.b = i4 + 1;
                                    charAt = str2.charAt(i4);
                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                        int r3 = d.r(charAt);
                                        if (r3 != -1) {
                                            for (int i5 = 1; i5 <= 5 && !dVar.f() && (r2 = d.r(str2.charAt(dVar.b))) != -1; i5++) {
                                                dVar.b++;
                                                r3 = (r3 * 16) + r2;
                                            }
                                            sb.append((char) r3);
                                        }
                                    }
                                }
                            }
                            sb.append(charAt);
                        }
                        s2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (s2 == null) {
                        dVar.b = i3;
                    } else {
                        dVar.q();
                        if (dVar.f() || dVar.e(")")) {
                            str = s2;
                        } else {
                            dVar.b = i3;
                        }
                    }
                }
            }
            if (str == null) {
                str = dVar.s();
            }
            if (str == null) {
                throw new ev8("Invalid @import rule: expected string or url()");
            }
            dVar.q();
            c(dVar);
            if (!dVar.f() && !dVar.d(';')) {
                throw new ev8("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        dVar.q();
    }

    public final boolean d(q qVar, d dVar) throws ev8 {
        ArrayList u = dVar.u();
        if (u == null || u.isEmpty()) {
            return false;
        }
        if (!dVar.d('{')) {
            throw new ev8("Malformed rule block: expected '{'");
        }
        dVar.q();
        SVG.Style style = new SVG.Style();
        do {
            String t2 = dVar.t();
            dVar.q();
            if (!dVar.d(':')) {
                throw new ev8("Expected ':'");
            }
            dVar.q();
            String str = dVar.a;
            String str2 = null;
            if (!dVar.f()) {
                int i2 = dVar.b;
                int charAt = str.charAt(i2);
                int i3 = i2;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                    if (!c.i.g(charAt)) {
                        i3 = dVar.b + 1;
                    }
                    charAt = dVar.a();
                }
                if (dVar.b > i2) {
                    str2 = str.substring(i2, i3);
                } else {
                    dVar.b = i2;
                }
            }
            if (str2 == null) {
                throw new ev8("Expected property value");
            }
            dVar.q();
            if (dVar.d('!')) {
                dVar.q();
                if (!dVar.e("important")) {
                    throw new ev8("Malformed rule set: found unexpected '!'");
                }
                dVar.q();
            }
            dVar.d(';');
            com.caverock.androidsvg.c.D(style, t2, str2);
            dVar.q();
            if (dVar.f()) {
                break;
            }
        } while (!dVar.d('}'));
        dVar.q();
        Iterator it = u.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            t tVar = this.b;
            p pVar = new p();
            pVar.a = rVar;
            pVar.b = style;
            pVar.c = tVar;
            qVar.a(pVar);
        }
        return true;
    }

    public final q e(d dVar) {
        q qVar = new q();
        while (!dVar.f()) {
            try {
                if (!dVar.e("<!--") && !dVar.e("-->")) {
                    if (!dVar.d('@')) {
                        if (!d(qVar, dVar)) {
                            break;
                        }
                    } else {
                        b(qVar, dVar);
                    }
                }
            } catch (ev8 e2) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e2.getMessage());
                return qVar;
            }
        }
        return qVar;
    }
}

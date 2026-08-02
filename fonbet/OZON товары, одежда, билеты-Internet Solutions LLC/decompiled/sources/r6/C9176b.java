package r6;

import B90.C2618u;
import C.o0;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import r6.C9181g;
import r6.C9209j;

/* renamed from: r6.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9176b {

    /* renamed from: a, reason: collision with root package name */
    private f f82900a;

    /* renamed from: b, reason: collision with root package name */
    private t f82901b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f82902c = false;

    /* renamed from: r6.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82903a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f82904b;

        static {
            int[] iArr = new int[j.values().length];
            f82904b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82904b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82904b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82904b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82904b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82904b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82904b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f82904b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f82904b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f82904b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f82904b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f82904b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f82904b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f82904b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f82904b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f82904b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f82904b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f82904b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f82904b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f82904b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f82904b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f82904b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f82904b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f82904b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f82903a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f82903a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f82903a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: r6.b$b, reason: collision with other inner class name */
    private static class C1410b {

        /* renamed from: a, reason: collision with root package name */
        public final String f82905a;

        /* renamed from: b, reason: collision with root package name */
        final c f82906b;

        /* renamed from: c, reason: collision with root package name */
        public final String f82907c;

        C1410b(String str, c cVar, String str2) {
            this.f82905a = str;
            this.f82906b = cVar;
            this.f82907c = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r6.b$c */
    private static final class c {
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

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6.b$d */
    static class d extends C9209j.i {

        /* renamed from: r6.b$d$a */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f82908a;

            /* renamed from: b, reason: collision with root package name */
            public int f82909b;

            a(int i11, int i12) {
                this.f82908a = i11;
                this.f82909b = i12;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private static int s(int i11) {
            if (i11 >= 48 && i11 <= 57) {
                return i11 - 48;
            }
            if (i11 >= 65 && i11 <= 70) {
                return i11 - 55;
            }
            if (i11 < 97 || i11 > 102) {
                return -1;
            }
            return i11 - 87;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:213:0x0458, code lost:
        
            r2 = r4.f82923a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:214:0x045a, code lost:
        
            if (r2 == null) goto L266;
         */
        /* JADX WARN: Code restructure failed: missing block: B:216:0x0460, code lost:
        
            if (r2.isEmpty() == false) goto L265;
         */
        /* JADX WARN: Code restructure failed: missing block: B:217:0x0463, code lost:
        
            r1.add(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:218:0x0466, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0364  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0380 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x035e  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0432  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0456 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0418  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x025d A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v10, types: [r6.b$m] */
        /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v38, types: [r6.b$k] */
        /* JADX WARN: Type inference failed for: r11v39, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v41, types: [r6.b$l] */
        /* JADX WARN: Type inference failed for: r11v45, types: [r6.b$l] */
        /* JADX WARN: Type inference failed for: r11v7, types: [r6.b$m] */
        /* JADX WARN: Type inference failed for: r12v12, types: [r6.b$c] */
        /* JADX WARN: Type inference failed for: r12v30 */
        /* JADX WARN: Type inference failed for: r12v31 */
        /* JADX WARN: Type inference failed for: r12v32, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v35 */
        /* JADX WARN: Type inference failed for: r12v36 */
        /* JADX WARN: Type inference failed for: r12v40 */
        /* JADX WARN: Type inference failed for: r12v41 */
        /* JADX WARN: Type inference failed for: r22v1 */
        /* JADX WARN: Type inference failed for: r22v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r22v3 */
        /* JADX WARN: Type inference failed for: r23v1 */
        /* JADX WARN: Type inference failed for: r23v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r23v3 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [r6.b$e] */
        /* JADX WARN: Type inference failed for: r9v10, types: [r6.b$s] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12, types: [r6.b$s] */
        /* JADX WARN: Type inference failed for: r9v13, types: [r6.b$s] */
        /* JADX WARN: Type inference failed for: r9v14, types: [r6.b$s] */
        /* JADX WARN: Type inference failed for: r9v15, types: [r6.b$s] */
        /* JADX WARN: Type inference failed for: r9v19, types: [r6.b$s] */
        /* JADX WARN: Type inference failed for: r9v22 */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v26 */
        /* JADX WARN: Type inference failed for: r9v27 */
        /* JADX WARN: Type inference failed for: r9v28 */
        /* JADX WARN: Type inference failed for: r9v29 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v30 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9, types: [r6.b$s] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ArrayList v() throws C9175a {
            ?? r72;
            ?? r92;
            String str;
            char c11;
            h hVar;
            h hVar2;
            h hVar3;
            s sVar;
            s sVar2;
            int i11;
            C9177c c9177c;
            a aVar;
            ArrayList v11;
            ArrayList arrayList;
            ArrayList arrayList2;
            h hVar4;
            String str2 = null;
            if (f()) {
                return null;
            }
            int i12 = 1;
            ArrayList arrayList3 = new ArrayList(1);
            int i13 = 0;
            r rVar = new r(i13);
            while (true) {
                if (!f() && !f()) {
                    int i14 = this.f83182b;
                    ArrayList arrayList4 = rVar.f82923a;
                    char c12 = '+';
                    if (((arrayList4 == null || arrayList4.isEmpty()) ? i12 : i13) == 0) {
                        if (d('>')) {
                            e eVar = e.CHILD;
                            q();
                            r72 = eVar;
                        } else if (d('+')) {
                            e eVar2 = e.FOLLOWS;
                            q();
                            r72 = eVar2;
                        }
                        if (d('*')) {
                            String u11 = u();
                            if (u11 != null) {
                                s sVar3 = new s(r72, u11);
                                rVar.f82924b += i12;
                                r92 = sVar3;
                            } else {
                                r92 = str2;
                            }
                        } else {
                            r92 = new s(r72, str2);
                        }
                        while (!f()) {
                            if (d('.')) {
                                if (r92 == 0) {
                                    r92 = new s(r72, str2);
                                }
                                String u12 = u();
                                if (u12 == null) {
                                    throw new C9175a("Invalid \".class\" simpleSelectors");
                                }
                                r92.a("class", c.EQUALS, u12);
                                rVar.a();
                            } else if (d('#')) {
                                if (r92 == 0) {
                                    r92 = new s(r72, str2);
                                }
                                String u13 = u();
                                if (u13 == null) {
                                    throw new C9175a("Invalid \"#id\" simpleSelectors");
                                }
                                r92.a("id", c.EQUALS, u13);
                                rVar.f82924b += 1000000;
                            } else if (d('[')) {
                                if (r92 == 0) {
                                    r92 = new s(r72, str2);
                                }
                                q();
                                String u14 = u();
                                if (u14 == null) {
                                    throw new C9175a("Invalid attribute simpleSelectors");
                                }
                                q();
                                Object obj = d('=') ? c.EQUALS : e("~=") ? c.INCLUDES : e("|=") ? c.DASHMATCH : str2;
                                if (obj != null) {
                                    q();
                                    if (f()) {
                                        str = str2;
                                    } else {
                                        str = k();
                                        if (str == null) {
                                            str = u();
                                        }
                                    }
                                    if (str == null) {
                                        throw new C9175a("Invalid attribute simpleSelectors");
                                    }
                                    q();
                                } else {
                                    str = str2;
                                }
                                ?? r12 = obj;
                                if (!d(']')) {
                                    throw new C9175a("Invalid attribute simpleSelectors");
                                }
                                if (obj == null) {
                                    r12 = c.EXISTS;
                                }
                                r92.a(u14, r12, str);
                                rVar.a();
                            } else {
                                s sVar4 = r92;
                                if (d(':')) {
                                    if (r92 == 0) {
                                        sVar4 = new s(r72, str2);
                                    }
                                    String u15 = u();
                                    if (u15 == null) {
                                        throw new C9175a("Invalid pseudo class");
                                    }
                                    j a11 = j.a(u15);
                                    switch (a.f82904b[a11.ordinal()]) {
                                        case 1:
                                            c11 = c12;
                                            h hVar5 = new h(0, 1, null, true, false);
                                            rVar.a();
                                            hVar = hVar5;
                                            r92 = sVar4;
                                            if (r92.f82928d == null) {
                                                r92.f82928d = new ArrayList();
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        case 2:
                                            c11 = c12;
                                            h hVar6 = new h(0, 1, null, false, false);
                                            rVar.a();
                                            hVar = hVar6;
                                            r92 = sVar4;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        case 3:
                                            c11 = c12;
                                            str2 = null;
                                            ?? mVar = new m(false, null);
                                            rVar.a();
                                            r92 = sVar4;
                                            hVar = mVar;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        case 4:
                                            c11 = c12;
                                            h hVar7 = new h(0, 1, sVar4.f82926b, true, true);
                                            rVar.a();
                                            hVar2 = hVar7;
                                            str2 = null;
                                            r92 = sVar4;
                                            hVar = hVar2;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        case 5:
                                            c11 = c12;
                                            h hVar8 = new h(0, 1, sVar4.f82926b, false, true);
                                            rVar.a();
                                            hVar2 = hVar8;
                                            str2 = null;
                                            r92 = sVar4;
                                            hVar = hVar2;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        case 6:
                                            c11 = c12;
                                            i12 = 1;
                                            ?? mVar2 = new m(true, sVar4.f82926b);
                                            rVar.a();
                                            hVar2 = mVar2;
                                            str2 = null;
                                            r92 = sVar4;
                                            hVar = hVar2;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        case 7:
                                            c11 = c12;
                                            ?? nVar = new n();
                                            rVar.a();
                                            sVar = sVar4;
                                            hVar3 = nVar;
                                            str2 = null;
                                            i12 = 1;
                                            r92 = sVar;
                                            hVar = hVar3;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        case 8:
                                            c11 = c12;
                                            ?? iVar = new i();
                                            rVar.a();
                                            sVar = sVar4;
                                            hVar3 = iVar;
                                            str2 = null;
                                            i12 = 1;
                                            r92 = sVar;
                                            hVar = hVar3;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                            ?? r22 = (a11 == j.nth_child || a11 == j.nth_of_type) ? i12 : i13;
                                            ?? r23 = (a11 == j.nth_of_type || a11 == j.nth_last_of_type) ? i12 : i13;
                                            if (!f()) {
                                                int i15 = this.f83182b;
                                                if (d('(')) {
                                                    q();
                                                    if (e("odd")) {
                                                        aVar = new a(2, i12);
                                                    } else if (e("even")) {
                                                        aVar = new a(2, i13);
                                                    } else {
                                                        int i16 = (!d(c12) && d('-')) ? -1 : i12;
                                                        int i17 = this.f83182b;
                                                        String str3 = this.f83181a;
                                                        int i18 = this.f83183c;
                                                        C9177c b11 = C9177c.b(i17, i18, str3);
                                                        if (b11 != null) {
                                                            this.f83182b = b11.a();
                                                        }
                                                        if (d('n') || d('N')) {
                                                            if (b11 != null) {
                                                                sVar2 = sVar4;
                                                            } else {
                                                                sVar2 = sVar4;
                                                                b11 = new C9177c(1L, this.f83182b);
                                                            }
                                                            q();
                                                            c11 = '+';
                                                            boolean d11 = d('+');
                                                            i11 = (d11 || !(d11 = d('-'))) ? 1 : -1;
                                                            if (d11) {
                                                                q();
                                                                c9177c = C9177c.b(this.f83182b, i18, str3);
                                                                if (c9177c != null) {
                                                                    this.f83182b = c9177c.a();
                                                                } else {
                                                                    this.f83182b = i15;
                                                                    aVar = null;
                                                                    if (aVar != null) {
                                                                        throw new C9175a("Invalid or missing parameter section for pseudo class: ".concat(u15));
                                                                    }
                                                                    s sVar5 = sVar2;
                                                                    h hVar9 = new h(aVar.f82908a, aVar.f82909b, sVar5.f82926b, r22, r23);
                                                                    rVar.a();
                                                                    hVar3 = hVar9;
                                                                    sVar = sVar5;
                                                                    str2 = null;
                                                                    i12 = 1;
                                                                    r92 = sVar;
                                                                    hVar = hVar3;
                                                                    if (r92.f82928d == null) {
                                                                    }
                                                                    r92.f82928d.add(hVar);
                                                                    c12 = c11;
                                                                    i13 = 0;
                                                                    break;
                                                                }
                                                            } else {
                                                                c9177c = null;
                                                            }
                                                        } else {
                                                            c11 = c12;
                                                            sVar2 = sVar4;
                                                            i11 = i16;
                                                            c9177c = b11;
                                                            i16 = 1;
                                                            b11 = null;
                                                        }
                                                        aVar = new a(b11 == null ? 0 : b11.c() * i16, c9177c == null ? 0 : c9177c.c() * i11);
                                                        q();
                                                        if (!d(')')) {
                                                            this.f83182b = i15;
                                                            aVar = null;
                                                        }
                                                        if (aVar != null) {
                                                        }
                                                    }
                                                    c11 = c12;
                                                    sVar2 = sVar4;
                                                    q();
                                                    if (!d(')')) {
                                                    }
                                                    if (aVar != null) {
                                                    }
                                                }
                                            }
                                            c11 = c12;
                                            sVar2 = sVar4;
                                            aVar = null;
                                            if (aVar != null) {
                                            }
                                            break;
                                        case 13:
                                            if (!f()) {
                                                int i19 = this.f83182b;
                                                if (d('(')) {
                                                    q();
                                                    v11 = v();
                                                    if (v11 == null) {
                                                        this.f83182b = i19;
                                                    } else if (d(')')) {
                                                        Iterator it = v11.iterator();
                                                        while (true) {
                                                            if (it.hasNext() && (arrayList = ((r) it.next()).f82923a) != null) {
                                                                Iterator it2 = arrayList.iterator();
                                                                while (it2.hasNext() && (arrayList2 = ((s) it2.next()).f82928d) != null) {
                                                                    Iterator it3 = arrayList2.iterator();
                                                                    while (it3.hasNext()) {
                                                                        if (((g) it3.next()) instanceof k) {
                                                                            v11 = null;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (v11 != null) {
                                                            throw new C9175a("Invalid or missing parameter section for pseudo class: ".concat(u15));
                                                        }
                                                        ?? kVar = new k(v11);
                                                        rVar.f82924b = kVar.b();
                                                        c11 = c12;
                                                        hVar2 = kVar;
                                                        str2 = null;
                                                        r92 = sVar4;
                                                        hVar = hVar2;
                                                        if (r92.f82928d == null) {
                                                        }
                                                        r92.f82928d.add(hVar);
                                                        c12 = c11;
                                                        i13 = 0;
                                                        break;
                                                    } else {
                                                        this.f83182b = i19;
                                                    }
                                                }
                                            }
                                            v11 = str2;
                                            if (v11 != null) {
                                            }
                                            break;
                                        case 14:
                                            ?? oVar = new o();
                                            rVar.a();
                                            hVar4 = oVar;
                                            c11 = c12;
                                            r92 = sVar4;
                                            hVar = hVar4;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        case 15:
                                            if (!f()) {
                                                int i21 = this.f83182b;
                                                if (d('(')) {
                                                    q();
                                                    ?? r122 = str2;
                                                    while (true) {
                                                        String u16 = u();
                                                        r122 = r122;
                                                        if (u16 == null) {
                                                            this.f83182b = i21;
                                                        } else {
                                                            if (r122 == 0) {
                                                                r122 = new ArrayList();
                                                            }
                                                            r122.add(u16);
                                                            q();
                                                            if (!p()) {
                                                                if (!d(')')) {
                                                                    this.f83182b = i21;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            ?? lVar = new l(u15);
                                            rVar.a();
                                            hVar4 = lVar;
                                            c11 = c12;
                                            r92 = sVar4;
                                            hVar = hVar4;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
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
                                            ?? lVar2 = new l(u15);
                                            rVar.a();
                                            hVar4 = lVar2;
                                            c11 = c12;
                                            r92 = sVar4;
                                            hVar = hVar4;
                                            if (r92.f82928d == null) {
                                            }
                                            r92.f82928d.add(hVar);
                                            c12 = c11;
                                            i13 = 0;
                                            break;
                                        default:
                                            throw new C9175a("Unsupported pseudo class: ".concat(u15));
                                    }
                                } else if (r92 != 0) {
                                    if (rVar.f82923a == null) {
                                        rVar.f82923a = new ArrayList();
                                    }
                                    rVar.f82923a.add(r92);
                                    if (p()) {
                                        arrayList3.add(rVar);
                                        i13 = 0;
                                        rVar = new r(i13);
                                    } else {
                                        i13 = 0;
                                    }
                                } else {
                                    this.f83182b = i14;
                                }
                            }
                        }
                        if (r92 != 0) {
                        }
                    }
                    r72 = str2;
                    if (d('*')) {
                    }
                    while (!f()) {
                    }
                    if (r92 != 0) {
                    }
                }
            }
        }

        final String t() {
            int s11;
            if (f()) {
                return null;
            }
            char charAt = this.f83181a.charAt(this.f83182b);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f83182b++;
            int intValue = h().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = h().intValue();
                    if (intValue != -1) {
                        if (intValue == 10 || intValue == 13 || intValue == 12) {
                            intValue = h().intValue();
                        } else {
                            int s12 = s(intValue);
                            if (s12 != -1) {
                                for (int i11 = 1; i11 <= 5 && (s11 = s((intValue = h().intValue()))) != -1; i11++) {
                                    s12 = (s12 * 16) + s11;
                                }
                                sb2.append((char) s12);
                            }
                        }
                    }
                }
                sb2.append((char) intValue);
                intValue = h().intValue();
            }
            return sb2.toString();
        }

        final String u() {
            int i11;
            int i12;
            boolean f7 = f();
            String str = this.f83181a;
            if (f7) {
                i12 = this.f83182b;
            } else {
                int i13 = this.f83182b;
                int charAt = str.charAt(i13);
                if (charAt == 45) {
                    charAt = a();
                }
                if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                    i11 = i13;
                } else {
                    int a11 = a();
                    while (true) {
                        if ((a11 < 65 || a11 > 90) && ((a11 < 97 || a11 > 122) && !((a11 >= 48 && a11 <= 57) || a11 == 45 || a11 == 95))) {
                            break;
                        }
                        a11 = a();
                    }
                    i11 = this.f83182b;
                }
                this.f83182b = i13;
                i12 = i11;
            }
            int i14 = this.f83182b;
            if (i12 == i14) {
                return null;
            }
            String substring = str.substring(i14, i12);
            this.f83182b = i12;
            return substring;
        }

        final String w() {
            int s11;
            if (!f()) {
                int i11 = this.f83182b;
                if (e("url(")) {
                    q();
                    String t2 = t();
                    if (t2 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        while (!f()) {
                            int i12 = this.f83182b;
                            String str = this.f83181a;
                            char charAt = str.charAt(i12);
                            if (charAt == '\'' || charAt == '\"' || charAt == '(' || charAt == ')' || C9209j.i.g(charAt) || Character.isISOControl((int) charAt)) {
                                break;
                            }
                            this.f83182b++;
                            if (charAt == '\\') {
                                if (!f()) {
                                    int i13 = this.f83182b;
                                    this.f83182b = i13 + 1;
                                    charAt = str.charAt(i13);
                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                        int s12 = s(charAt);
                                        if (s12 != -1) {
                                            for (int i14 = 1; i14 <= 5 && !f() && (s11 = s(str.charAt(this.f83182b))) != -1; i14++) {
                                                this.f83182b++;
                                                s12 = (s12 * 16) + s11;
                                            }
                                            sb2.append((char) s12);
                                        }
                                    }
                                }
                            }
                            sb2.append(charAt);
                        }
                        t2 = sb2.length() == 0 ? null : sb2.toString();
                    }
                    if (t2 == null) {
                        this.f83182b = i11;
                        return null;
                    }
                    q();
                    if (f() || e(")")) {
                        return t2;
                    }
                    this.f83182b = i11;
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r6.b$e */
    private static final class e {
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

        private e() {
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
    /* renamed from: r6.b$f */
    static final class f {
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

        private f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    /* renamed from: r6.b$g */
    private interface g {
        boolean a(C9181g.L l11);
    }

    /* renamed from: r6.b$h */
    private static class h implements g {

        /* renamed from: a, reason: collision with root package name */
        private int f82910a;

        /* renamed from: b, reason: collision with root package name */
        private int f82911b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f82912c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f82913d;

        /* renamed from: e, reason: collision with root package name */
        private String f82914e;

        h(int i11, int i12, String str, boolean z11, boolean z12) {
            this.f82910a = i11;
            this.f82911b = i12;
            this.f82912c = z11;
            this.f82913d = z12;
            this.f82914e = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[RETURN] */
        @Override // r6.C9176b.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(C9181g.L l11) {
            int i11;
            int i12;
            boolean z11 = this.f82913d;
            String str = this.f82914e;
            if (z11 && str == null) {
                str = l11.n();
            }
            C9181g.J j11 = l11.f83014b;
            if (j11 != null) {
                Iterator<C9181g.N> it = j11.d().iterator();
                i12 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    C9181g.L l12 = (C9181g.L) it.next();
                    if (l12 == l11) {
                        i12 = i11;
                    }
                    if (str == null || l12.n().equals(str)) {
                        i11++;
                    }
                }
            } else {
                i11 = 1;
                i12 = 0;
            }
            int i13 = this.f82912c ? i12 + 1 : i11 - i12;
            int i14 = this.f82910a;
            int i15 = this.f82911b;
            if (i14 == 0) {
                return i13 == i15;
            }
            int i16 = i13 - i15;
            if (i16 % i14 != 0 || (Integer.signum(i16) != 0 && Integer.signum(i16) != Integer.signum(i14))) {
            }
        }

        public final String toString() {
            String str = this.f82912c ? "" : "last-";
            boolean z11 = this.f82913d;
            int i11 = this.f82911b;
            int i12 = this.f82910a;
            return z11 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i12), Integer.valueOf(i11), this.f82914e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i12), Integer.valueOf(i11));
        }
    }

    /* renamed from: r6.b$i */
    private static class i implements g {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r6.C9176b.g
        public final boolean a(C9181g.L l11) {
            return !(l11 instanceof C9181g.J) || ((C9181g.J) l11).d().size() == 0;
        }

        public final String toString() {
            return "empty";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r6.b$j */
    private static final class j {
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
            j jVar19 = new j(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, 18);
            active = jVar19;
            j jVar20 = new j("focus", 19);
            focus = jVar20;
            j jVar21 = new j("enabled", 20);
            enabled = jVar21;
            j jVar22 = new j("disabled", 21);
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

        private j() {
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

    /* renamed from: r6.b$k */
    private static class k implements g {

        /* renamed from: a, reason: collision with root package name */
        private List<r> f82915a;

        k(List<r> list) {
            this.f82915a = list;
        }

        @Override // r6.C9176b.g
        public final boolean a(C9181g.L l11) {
            Iterator<r> it = this.f82915a.iterator();
            while (it.hasNext()) {
                if (C9176b.i(it.next(), l11)) {
                    return false;
                }
            }
            return true;
        }

        final int b() {
            Iterator<r> it = this.f82915a.iterator();
            int i11 = LinearLayoutManager.INVALID_OFFSET;
            while (it.hasNext()) {
                int i12 = it.next().f82924b;
                if (i12 > i11) {
                    i11 = i12;
                }
            }
            return i11;
        }

        public final String toString() {
            return C2618u.h(new StringBuilder("not("), this.f82915a, ")");
        }
    }

    /* renamed from: r6.b$l */
    private static class l implements g {

        /* renamed from: a, reason: collision with root package name */
        private String f82916a;

        l(String str) {
            this.f82916a = str;
        }

        @Override // r6.C9176b.g
        public final boolean a(C9181g.L l11) {
            return false;
        }

        public final String toString() {
            return this.f82916a;
        }
    }

    /* renamed from: r6.b$m */
    private static class m implements g {

        /* renamed from: a, reason: collision with root package name */
        private boolean f82917a;

        /* renamed from: b, reason: collision with root package name */
        private String f82918b;

        public m(boolean z11, String str) {
            this.f82917a = z11;
            this.f82918b = str;
        }

        @Override // r6.C9176b.g
        public final boolean a(C9181g.L l11) {
            int i11;
            boolean z11 = this.f82917a;
            String str = this.f82918b;
            if (z11 && str == null) {
                str = l11.n();
            }
            C9181g.J j11 = l11.f83014b;
            if (j11 != null) {
                Iterator<C9181g.N> it = j11.d().iterator();
                i11 = 0;
                while (it.hasNext()) {
                    C9181g.L l12 = (C9181g.L) it.next();
                    if (str == null || l12.n().equals(str)) {
                        i11++;
                    }
                }
            } else {
                i11 = 1;
            }
            return i11 == 1;
        }

        public final String toString() {
            return this.f82917a ? o0.c(new StringBuilder("only-of-type <"), this.f82918b, ">") : "only-child";
        }
    }

    /* renamed from: r6.b$n */
    private static class n implements g {
        @Override // r6.C9176b.g
        public final boolean a(C9181g.L l11) {
            return l11.f83014b == null;
        }

        public final String toString() {
            return "root";
        }
    }

    /* renamed from: r6.b$o */
    private static class o implements g {
        @Override // r6.C9176b.g
        public final boolean a(C9181g.L l11) {
            return false;
        }

        public final String toString() {
            return "target";
        }
    }

    /* renamed from: r6.b$p */
    static class p {

        /* renamed from: a, reason: collision with root package name */
        r f82919a;

        /* renamed from: b, reason: collision with root package name */
        C9181g.E f82920b;

        /* renamed from: c, reason: collision with root package name */
        t f82921c;

        public final String toString() {
            return String.valueOf(this.f82919a) + " {...} (src=" + this.f82921c + ")";
        }
    }

    /* renamed from: r6.b$q */
    static class q {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList f82922a = null;

        q() {
        }

        final void a(p pVar) {
            if (this.f82922a == null) {
                this.f82922a = new ArrayList();
            }
            for (int i11 = 0; i11 < this.f82922a.size(); i11++) {
                if (((p) this.f82922a.get(i11)).f82919a.f82924b > pVar.f82919a.f82924b) {
                    this.f82922a.add(i11, pVar);
                    return;
                }
            }
            this.f82922a.add(pVar);
        }

        final void b(q qVar) {
            if (qVar.f82922a == null) {
                return;
            }
            if (this.f82922a == null) {
                this.f82922a = new ArrayList(qVar.f82922a.size());
            }
            Iterator it = qVar.f82922a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        final List<p> c() {
            return this.f82922a;
        }

        final boolean d() {
            ArrayList arrayList = this.f82922a;
            return arrayList == null || arrayList.isEmpty();
        }

        final void e(t tVar) {
            ArrayList arrayList = this.f82922a;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((p) it.next()).f82921c == tVar) {
                    it.remove();
                }
            }
        }

        final int f() {
            ArrayList arrayList = this.f82922a;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        public final String toString() {
            if (this.f82922a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f82922a.iterator();
            while (it.hasNext()) {
                sb2.append(((p) it.next()).toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    /* renamed from: r6.b$s */
    private static class s {

        /* renamed from: a, reason: collision with root package name */
        e f82925a;

        /* renamed from: b, reason: collision with root package name */
        String f82926b;

        /* renamed from: c, reason: collision with root package name */
        ArrayList f82927c = null;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f82928d = null;

        s(e eVar, String str) {
            this.f82925a = null;
            this.f82926b = null;
            this.f82925a = eVar == null ? e.DESCENDANT : eVar;
            this.f82926b = str;
        }

        final void a(String str, c cVar, String str2) {
            if (this.f82927c == null) {
                this.f82927c = new ArrayList();
            }
            this.f82927c.add(new C1410b(str, cVar, str2));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = e.CHILD;
            e eVar2 = this.f82925a;
            if (eVar2 == eVar) {
                sb2.append("> ");
            } else if (eVar2 == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f82926b;
            if (str == null) {
                str = "*";
            }
            sb2.append(str);
            ArrayList arrayList = this.f82927c;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1410b c1410b = (C1410b) it.next();
                    sb2.append('[');
                    sb2.append(c1410b.f82905a);
                    int i11 = a.f82903a[c1410b.f82906b.ordinal()];
                    String str2 = c1410b.f82907c;
                    if (i11 == 1) {
                        sb2.append('=');
                        sb2.append(str2);
                    } else if (i11 == 2) {
                        sb2.append("~=");
                        sb2.append(str2);
                    } else if (i11 == 3) {
                        sb2.append("|=");
                        sb2.append(str2);
                    }
                    sb2.append(']');
                }
            }
            ArrayList arrayList2 = this.f82928d;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    g gVar = (g) it2.next();
                    sb2.append(':');
                    sb2.append(gVar);
                }
            }
            return sb2.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r6.b$t */
    static final class t {
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

        private t() {
            throw null;
        }

        public static t valueOf(String str) {
            return (t) Enum.valueOf(t.class, str);
        }

        public static t[] values() {
            return (t[]) $VALUES.clone();
        }
    }

    C9176b(f fVar, t tVar) {
        this.f82900a = fVar;
        this.f82901b = tVar;
    }

    private static int a(ArrayList arrayList, int i11, C9181g.L l11) {
        int i12 = 0;
        if (i11 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i11);
        C9181g.J j11 = l11.f83014b;
        if (obj != j11) {
            return -1;
        }
        Iterator<C9181g.N> it = j11.d().iterator();
        while (it.hasNext()) {
            if (it.next() == l11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.q();
        Iterator it = e(dVar).iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    private void d(q qVar, d dVar) throws C9175a {
        int intValue;
        String u11 = dVar.u();
        dVar.q();
        if (u11 == null) {
            throw new C9175a("Invalid '@' rule");
        }
        int i11 = 0;
        if (!this.f82902c && u11.equals("media")) {
            ArrayList e11 = e(dVar);
            if (!dVar.d('{')) {
                throw new C9175a("Invalid @media rule: missing rule set");
            }
            dVar.q();
            f fVar = this.f82900a;
            Iterator it = e11.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (fVar2 == f.all || fVar2 == fVar) {
                    this.f82902c = true;
                    qVar.b(g(dVar));
                    this.f82902c = false;
                    break;
                }
            }
            g(dVar);
            if (!dVar.f() && !dVar.d('}')) {
                throw new C9175a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f82902c || !u11.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + u11 + " rule");
            while (!dVar.f() && ((intValue = dVar.h().intValue()) != 59 || i11 != 0)) {
                if (intValue != 123) {
                    if (intValue == 125 && i11 > 0 && i11 - 1 == 0) {
                        break;
                    }
                } else {
                    i11++;
                }
            }
        } else {
            String w11 = dVar.w();
            if (w11 == null) {
                w11 = dVar.t();
            }
            if (w11 == null) {
                throw new C9175a("Invalid @import rule: expected string or url()");
            }
            dVar.q();
            e(dVar);
            if (!dVar.f() && !dVar.d(';')) {
                throw new C9175a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        dVar.q();
    }

    private static ArrayList e(d dVar) {
        ArrayList arrayList = new ArrayList();
        while (!dVar.f()) {
            String str = null;
            if (!dVar.f()) {
                int i11 = dVar.f83182b;
                String str2 = dVar.f83181a;
                char charAt = str2.charAt(i11);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    dVar.f83182b = i11;
                } else {
                    int a11 = dVar.a();
                    while (true) {
                        if ((a11 < 65 || a11 > 90) && (a11 < 97 || a11 > 122)) {
                            break;
                        }
                        a11 = dVar.a();
                    }
                    str = str2.substring(i11, dVar.f83182b);
                }
            }
            if (str == null) {
                break;
            }
            try {
                arrayList.add(f.valueOf(str));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.p()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean f(q qVar, d dVar) throws C9175a {
        ArrayList v11 = dVar.v();
        if (v11 == null || v11.isEmpty()) {
            return false;
        }
        if (!dVar.d('{')) {
            throw new C9175a("Malformed rule block: expected '{'");
        }
        dVar.q();
        C9181g.E e11 = new C9181g.E();
        do {
            String u11 = dVar.u();
            dVar.q();
            if (!dVar.d(':')) {
                throw new C9175a("Expected ':'");
            }
            dVar.q();
            String str = null;
            if (!dVar.f()) {
                int i11 = dVar.f83182b;
                String str2 = dVar.f83181a;
                int charAt = str2.charAt(i11);
                int i12 = i11;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                    if (!C9209j.i.g(charAt)) {
                        i12 = dVar.f83182b + 1;
                    }
                    charAt = dVar.a();
                }
                if (dVar.f83182b > i11) {
                    str = str2.substring(i11, i12);
                } else {
                    dVar.f83182b = i11;
                }
            }
            if (str == null) {
                throw new C9175a("Expected property value");
            }
            dVar.q();
            if (dVar.d('!')) {
                dVar.q();
                if (!dVar.e("important")) {
                    throw new C9175a("Malformed rule set: found unexpected '!'");
                }
                dVar.q();
            }
            dVar.d(';');
            C9209j.J(e11, u11, str);
            dVar.q();
            if (dVar.f()) {
                break;
            }
        } while (!dVar.d('}'));
        dVar.q();
        Iterator it = v11.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            p pVar = new p();
            pVar.f82919a = rVar;
            pVar.f82920b = e11;
            pVar.f82921c = this.f82901b;
            qVar.a(pVar);
        }
        return true;
    }

    private q g(d dVar) {
        q qVar = new q();
        while (!dVar.f()) {
            try {
                if (!dVar.e("<!--") && !dVar.e("-->")) {
                    if (!dVar.d('@')) {
                        if (!f(qVar, dVar)) {
                            break;
                        }
                    } else {
                        d(qVar, dVar);
                    }
                }
            } catch (C9175a e11) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e11.getMessage());
            }
        }
        return qVar;
    }

    private static boolean h(r rVar, int i11, ArrayList arrayList, int i12, C9181g.L l11) {
        s sVar = (s) rVar.f82923a.get(i11);
        if (!k(sVar, l11)) {
            return false;
        }
        e eVar = e.DESCENDANT;
        e eVar2 = sVar.f82925a;
        if (eVar2 == eVar) {
            if (i11 != 0) {
                while (i12 >= 0) {
                    if (!j(rVar, i11 - 1, arrayList, i12)) {
                        i12--;
                    }
                }
                return false;
            }
            return true;
        }
        if (eVar2 == e.CHILD) {
            return j(rVar, i11 - 1, arrayList, i12);
        }
        int a11 = a(arrayList, i12, l11);
        if (a11 <= 0) {
            return false;
        }
        return h(rVar, i11 - 1, arrayList, i12, (C9181g.L) l11.f83014b.d().get(a11 - 1));
    }

    static boolean i(r rVar, C9181g.L l11) {
        ArrayList arrayList = new ArrayList();
        Object obj = l11.f83014b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((C9181g.N) obj).f83014b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = rVar.f82923a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return k((s) rVar.f82923a.get(0), l11);
        }
        ArrayList arrayList3 = rVar.f82923a;
        return h(rVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, l11);
    }

    private static boolean j(r rVar, int i11, ArrayList arrayList, int i12) {
        s sVar = (s) rVar.f82923a.get(i11);
        C9181g.L l11 = (C9181g.L) arrayList.get(i12);
        if (!k(sVar, l11)) {
            return false;
        }
        e eVar = e.DESCENDANT;
        e eVar2 = sVar.f82925a;
        if (eVar2 == eVar) {
            if (i11 != 0) {
                while (i12 > 0) {
                    i12--;
                    if (j(rVar, i11 - 1, arrayList, i12)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (eVar2 == e.CHILD) {
            return j(rVar, i11 - 1, arrayList, i12 - 1);
        }
        int a11 = a(arrayList, i12, l11);
        if (a11 <= 0) {
            return false;
        }
        return h(rVar, i11 - 1, arrayList, i12, (C9181g.L) l11.f83014b.d().get(a11 - 1));
    }

    private static boolean k(s sVar, C9181g.L l11) {
        ArrayList arrayList;
        String str = sVar.f82926b;
        if (str != null && !str.equals(l11.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = sVar.f82927c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C1410b c1410b = (C1410b) it.next();
                String str2 = c1410b.f82905a;
                String str3 = c1410b.f82907c;
                if (str2.equals("id")) {
                    if (!str3.equals(l11.f83004c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = l11.f83008g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = sVar.f82928d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((g) it2.next()).a(l11)) {
                return false;
            }
        }
        return true;
    }

    final q c(String str) {
        d dVar = new d(str);
        dVar.q();
        return g(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6.b$r */
    static class r {

        /* renamed from: a, reason: collision with root package name */
        ArrayList f82923a;

        /* renamed from: b, reason: collision with root package name */
        int f82924b;

        private r() {
            this.f82923a = null;
            this.f82924b = 0;
        }

        final void a() {
            this.f82924b += 1000;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f82923a.iterator();
            while (it.hasNext()) {
                sb2.append((s) it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            return Ek.a.d(sb2, this.f82924b, ']');
        }

        /* synthetic */ r(int i11) {
            this();
        }
    }
}

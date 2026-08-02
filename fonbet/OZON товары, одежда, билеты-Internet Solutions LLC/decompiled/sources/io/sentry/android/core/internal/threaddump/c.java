package io.sentry.android.core.internal.threaddump;

import io.sentry.I2;
import io.sentry.J2;
import io.sentry.W2;
import io.sentry.a3;
import io.sentry.android.core.internal.util.l;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f67146f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f67147g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f67148h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f67149i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f67150j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f67151k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f67152l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f67153m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f67154n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f67155o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f67156p = Pattern.compile(" *- waiting to lock an unknown object");

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f67157q = Pattern.compile("\\s+");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f67158a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f67159b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a3 f67160c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final HashMap f67161d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f67162e = new ArrayList();

    public c(@NotNull W2 w22, boolean z11) {
        this.f67158a = w22;
        this.f67159b = z11;
        this.f67160c = new a3(w22);
    }

    private static void a(@NotNull z zVar, @NotNull J2 j22) {
        Map<String, J2> k11 = zVar.k();
        if (k11 == null) {
            k11 = new HashMap<>();
        }
        J2 j23 = k11.get(j22.f());
        if (j23 != null) {
            j23.l(Math.max(j23.g(), j22.g()));
        } else {
            k11.put(j22.f(), new J2(j22));
        }
        zVar.t(k11);
    }

    private static Long c(@NotNull Matcher matcher, int i11) {
        String group = matcher.group(i11);
        if (group == null || group.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(group));
    }

    private static boolean e(@NotNull Matcher matcher, @NotNull String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    @NotNull
    public final ArrayList b() {
        return new ArrayList(this.f67161d.values());
    }

    @NotNull
    public final ArrayList d() {
        return this.f67162e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e2, code lost:
    
        if (r6 >= 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0434 A[EDGE_INSN: B:127:0x0434->B:122:0x0434 BREAK  A[LOOP:1: B:44:0x0166->B:62:0x042a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(@NotNull b bVar) {
        String m11;
        Matcher matcher;
        Pattern pattern;
        Matcher matcher2;
        Pattern pattern2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        String str;
        W2 w22;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Integer num;
        b bVar2 = bVar;
        Pattern pattern3 = f67146f;
        String str2 = "";
        Matcher matcher10 = pattern3.matcher("");
        Pattern pattern4 = f67147g;
        Matcher matcher11 = pattern4.matcher("");
        while (bVar2.a()) {
            a b11 = bVar2.b();
            String str3 = "Internal error while parsing thread dump.";
            W2 w23 = this.f67158a;
            if (b11 == null) {
                w23.getLogger().c(I2.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str4 = b11.f67142a;
            if (e(matcher10, str4) || e(matcher11, str4)) {
                bVar2.f67145c--;
                z zVar = new z();
                Matcher matcher12 = pattern3.matcher(str2);
                Matcher matcher13 = pattern4.matcher(str2);
                if (bVar2.a()) {
                    a b12 = bVar2.b();
                    if (b12 == null) {
                        w23.getLogger().c(I2.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                    } else {
                        String str5 = b12.f67142a;
                        if (e(matcher12, str5)) {
                            Long c11 = c(matcher12, 4);
                            if (c11 == null) {
                                w23.getLogger().c(I2.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                            } else {
                                zVar.u(c11);
                                zVar.w(matcher12.group(1));
                                String group = matcher12.group(5);
                                if (group != null) {
                                    if (group.contains(" ")) {
                                        zVar.z(group.substring(0, group.indexOf(32)));
                                    } else {
                                        zVar.z(group);
                                    }
                                }
                                m11 = zVar.m();
                                if (m11 != null) {
                                    boolean equals = m11.equals("main");
                                    zVar.v(Boolean.valueOf(equals));
                                    zVar.q(Boolean.valueOf(equals));
                                    zVar.r(Boolean.valueOf(equals && !this.f67159b));
                                }
                                ArrayList arrayList = new ArrayList();
                                Matcher matcher14 = f67148h.matcher(str2);
                                matcher = f67149i.matcher(str2);
                                Matcher matcher15 = f67150j.matcher(str2);
                                Matcher matcher16 = f67151k.matcher(str2);
                                Matcher matcher17 = f67153m.matcher(str2);
                                Matcher matcher18 = f67152l.matcher(str2);
                                pattern = pattern3;
                                Matcher matcher19 = f67155o.matcher(str2);
                                matcher2 = matcher10;
                                Matcher matcher20 = f67154n.matcher(str2);
                                pattern2 = pattern4;
                                matcher3 = f67156p.matcher(str2);
                                matcher4 = matcher11;
                                matcher5 = f67157q.matcher(str2);
                                str = str2;
                                x xVar = null;
                                while (true) {
                                    if (bVar.a()) {
                                        break;
                                    }
                                    w22 = w23;
                                    a b13 = bVar.b();
                                    if (b13 == null) {
                                        w22.getLogger().c(I2.WARNING, str3, new Object[0]);
                                        break;
                                    }
                                    String str6 = b13.f67142a;
                                    boolean e11 = e(matcher, str6);
                                    String str7 = str3;
                                    a3 a3Var = this.f67160c;
                                    Matcher matcher21 = matcher5;
                                    Matcher matcher22 = matcher3;
                                    if (e11) {
                                        xVar = new x();
                                        matcher6 = matcher20;
                                        String str8 = matcher.group(1) + "." + matcher.group(2);
                                        xVar.D(str8);
                                        xVar.y(matcher.group(3));
                                        xVar.x(matcher.group(4));
                                        String group2 = matcher.group(5);
                                        if (group2 != null && group2.length() != 0) {
                                            int parseInt = Integer.parseInt(group2);
                                            num = Integer.valueOf(parseInt);
                                        }
                                        num = null;
                                        xVar.B(num);
                                        xVar.z(a3Var.b(str8));
                                        arrayList.add(xVar);
                                        matcher7 = matcher;
                                    } else {
                                        matcher6 = matcher20;
                                        if (e(matcher14, str6)) {
                                            x xVar2 = new x();
                                            xVar2.F(matcher14.group(3));
                                            xVar2.y(matcher14.group(6));
                                            String group3 = matcher14.group(7);
                                            xVar2.B((group3 == null || group3.length() == 0) ? null : Integer.valueOf(Integer.parseInt(group3)));
                                            xVar2.A("0x" + matcher14.group(2));
                                            xVar2.G("native");
                                            String group4 = matcher14.group(8);
                                            String a11 = group4 == null ? null : l.a(group4);
                                            if (a11 != null) {
                                                HashMap hashMap = this.f67161d;
                                                if (hashMap.containsKey(a11)) {
                                                    matcher7 = matcher;
                                                } else {
                                                    DebugImage debugImage = new DebugImage();
                                                    debugImage.setDebugId(a11);
                                                    debugImage.setType("elf");
                                                    matcher7 = matcher;
                                                    debugImage.setCodeFile(matcher14.group(4));
                                                    debugImage.setCodeId(group4);
                                                    hashMap.put(a11, debugImage);
                                                }
                                                xVar2.w("rel:".concat(a11));
                                            } else {
                                                matcher7 = matcher;
                                            }
                                            arrayList.add(xVar2);
                                            matcher20 = matcher6;
                                            matcher9 = matcher21;
                                            matcher8 = matcher22;
                                            xVar = null;
                                            matcher5 = matcher9;
                                            matcher3 = matcher8;
                                            w23 = w22;
                                            str3 = str7;
                                            matcher = matcher7;
                                        } else {
                                            matcher7 = matcher;
                                            if (e(matcher15, str6)) {
                                                xVar = new x();
                                                String str9 = matcher15.group(1) + "." + matcher15.group(2);
                                                xVar.D(str9);
                                                xVar.y(matcher15.group(3));
                                                xVar.z(a3Var.b(str9));
                                                xVar.E(Boolean.TRUE);
                                                arrayList.add(xVar);
                                            } else if (e(matcher16, str6)) {
                                                if (xVar != null) {
                                                    J2 j22 = new J2();
                                                    j22.l(1);
                                                    j22.h(matcher16.group(1));
                                                    j22.j(matcher16.group(2));
                                                    j22.i(matcher16.group(3));
                                                    xVar.C(j22);
                                                    a(zVar, j22);
                                                }
                                            } else if (e(matcher17, str6)) {
                                                if (xVar != null) {
                                                    J2 j23 = new J2();
                                                    j23.l(2);
                                                    j23.h(matcher17.group(1));
                                                    j23.j(matcher17.group(2));
                                                    j23.i(matcher17.group(3));
                                                    xVar.C(j23);
                                                    a(zVar, j23);
                                                }
                                            } else if (e(matcher18, str6)) {
                                                if (xVar != null) {
                                                    J2 j24 = new J2();
                                                    j24.l(4);
                                                    j24.h(matcher18.group(1));
                                                    j24.j(matcher18.group(2));
                                                    j24.i(matcher18.group(3));
                                                    xVar.C(j24);
                                                    a(zVar, j24);
                                                }
                                            } else if (e(matcher19, str6)) {
                                                if (xVar != null) {
                                                    J2 j25 = new J2();
                                                    j25.l(8);
                                                    j25.h(matcher19.group(1));
                                                    j25.j(matcher19.group(2));
                                                    j25.i(matcher19.group(3));
                                                    j25.k(c(matcher19, 4));
                                                    xVar.C(j25);
                                                    a(zVar, j25);
                                                }
                                                matcher20 = matcher6;
                                                matcher9 = matcher21;
                                                matcher8 = matcher22;
                                                matcher5 = matcher9;
                                                matcher3 = matcher8;
                                                w23 = w22;
                                                str3 = str7;
                                                matcher = matcher7;
                                            } else {
                                                matcher20 = matcher6;
                                                if (!e(matcher20, str6)) {
                                                    matcher8 = matcher22;
                                                    if (!e(matcher8, str6)) {
                                                        if (str6.length() == 0) {
                                                            break;
                                                        }
                                                        matcher9 = matcher21;
                                                        if (e(matcher9, str6)) {
                                                            break;
                                                        }
                                                    } else {
                                                        if (xVar != null) {
                                                            J2 j26 = new J2();
                                                            j26.l(8);
                                                            xVar.C(j26);
                                                            a(zVar, j26);
                                                        }
                                                        matcher9 = matcher21;
                                                    }
                                                } else if (xVar != null) {
                                                    J2 j27 = new J2();
                                                    j27.l(8);
                                                    j27.h(matcher20.group(1));
                                                    j27.j(matcher20.group(2));
                                                    j27.i(matcher20.group(3));
                                                    xVar.C(j27);
                                                    a(zVar, j27);
                                                    matcher9 = matcher21;
                                                    matcher8 = matcher22;
                                                } else {
                                                    matcher9 = matcher21;
                                                    matcher8 = matcher22;
                                                }
                                                matcher5 = matcher9;
                                                matcher3 = matcher8;
                                                w23 = w22;
                                                str3 = str7;
                                                matcher = matcher7;
                                            }
                                        }
                                    }
                                    matcher20 = matcher6;
                                    matcher9 = matcher21;
                                    matcher8 = matcher22;
                                    matcher5 = matcher9;
                                    matcher3 = matcher8;
                                    w23 = w22;
                                    str3 = str7;
                                    matcher = matcher7;
                                }
                                Collections.reverse(arrayList);
                                y yVar = new y(arrayList);
                                yVar.i();
                                zVar.y(yVar);
                            }
                        } else {
                            if (e(matcher13, str5)) {
                                Long c12 = c(matcher13, 3);
                                if (c12 == null) {
                                    w23.getLogger().c(I2.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                } else {
                                    zVar.u(c12);
                                    zVar.w(matcher13.group(1));
                                }
                            }
                            m11 = zVar.m();
                            if (m11 != null) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Matcher matcher142 = f67148h.matcher(str2);
                            matcher = f67149i.matcher(str2);
                            Matcher matcher152 = f67150j.matcher(str2);
                            Matcher matcher162 = f67151k.matcher(str2);
                            Matcher matcher172 = f67153m.matcher(str2);
                            Matcher matcher182 = f67152l.matcher(str2);
                            pattern = pattern3;
                            Matcher matcher192 = f67155o.matcher(str2);
                            matcher2 = matcher10;
                            Matcher matcher202 = f67154n.matcher(str2);
                            pattern2 = pattern4;
                            matcher3 = f67156p.matcher(str2);
                            matcher4 = matcher11;
                            matcher5 = f67157q.matcher(str2);
                            str = str2;
                            x xVar3 = null;
                            while (true) {
                                if (bVar.a()) {
                                }
                                matcher5 = matcher9;
                                matcher3 = matcher8;
                                w23 = w22;
                                str3 = str7;
                                matcher = matcher7;
                            }
                            Collections.reverse(arrayList2);
                            y yVar2 = new y(arrayList2);
                            yVar2.i();
                            zVar.y(yVar2);
                        }
                        if (zVar == null) {
                            this.f67162e.add(zVar);
                        }
                    }
                }
                pattern = pattern3;
                str = str2;
                matcher2 = matcher10;
                pattern2 = pattern4;
                matcher4 = matcher11;
                zVar = null;
                if (zVar == null) {
                }
            } else {
                pattern = pattern3;
                str = str2;
                matcher2 = matcher10;
                pattern2 = pattern4;
                matcher4 = matcher11;
            }
            bVar2 = bVar;
            pattern3 = pattern;
            matcher10 = matcher2;
            pattern4 = pattern2;
            matcher11 = matcher4;
            str2 = str;
        }
    }
}

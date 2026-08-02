package io.sentry.android.core.internal.threaddump;

import io.sentry.C4793o3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.J3;
import io.sentry.android.core.internal.util.s;
import io.sentry.protocol.A;
import io.sentry.protocol.C4800b;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f51054h = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f51055i = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f51056j = Pattern.compile("----- pid (\\d+) at .*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f51057k = Pattern.compile("\\s*\\|\\s*sysTid=(\\d+).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f51058l = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f51059m = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f51060n = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f51061o = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f51062p = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f51063q = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f51064r = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f51065s = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f51066t = Pattern.compile(" *- waiting to lock an unknown object");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f51067u = Pattern.compile("\\s+");

    /* renamed from: a, reason: collision with root package name */
    public final F3 f51068a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f51069b;

    /* renamed from: c, reason: collision with root package name */
    public Long f51070c;

    /* renamed from: d, reason: collision with root package name */
    public final J3 f51071d;

    /* renamed from: g, reason: collision with root package name */
    public final a f51074g = new a();

    /* renamed from: e, reason: collision with root package name */
    public final Map f51072e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final List f51073f = new ArrayList();

    public d(F3 f32, boolean z10) {
        this.f51068a = f32;
        this.f51069b = z10;
        this.f51071d = new J3(f32);
    }

    public final void a(A a10, C4793o3 c4793o3) {
        Map k10 = a10.k();
        if (k10 == null) {
            k10 = new HashMap();
        }
        C4793o3 c4793o32 = (C4793o3) k10.get(c4793o3.f());
        if (c4793o32 != null) {
            c4793o32.l(Math.max(c4793o32.g(), c4793o3.g()));
        } else {
            k10.put(c4793o3.f(), new C4793o3(c4793o3));
        }
        a10.t(k10);
    }

    public C4800b b() {
        return this.f51074g.a();
    }

    public List c() {
        return new ArrayList(this.f51072e.values());
    }

    public final Integer d(Matcher matcher, int i10, Integer num) {
        String group = matcher.group(i10);
        return (group == null || group.length() == 0) ? num : Integer.valueOf(Integer.parseInt(group));
    }

    public final Long e(Matcher matcher, int i10, Long l10) {
        String group = matcher.group(i10);
        return (group == null || group.length() == 0) ? l10 : Long.valueOf(Long.parseLong(group));
    }

    public List f() {
        return this.f51073f;
    }

    public final Integer g(Matcher matcher, int i10, Integer num) {
        String group = matcher.group(i10);
        if (group != null && group.length() != 0) {
            int parseInt = Integer.parseInt(group);
            Integer valueOf = Integer.valueOf(parseInt);
            if (parseInt >= 0) {
                return valueOf;
            }
        }
        return num;
    }

    public final void h() {
        for (A a10 : this.f51073f) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(a10.p())) {
                a10.w("main");
                a10.q(bool);
                a10.r(Boolean.valueOf(!this.f51069b));
            } else {
                Boolean bool2 = Boolean.FALSE;
                a10.q(bool2);
                a10.r(bool2);
                a10.v(bool2);
            }
        }
    }

    public final boolean i(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    public void j(c cVar) {
        Matcher matcher = f51054h.matcher("");
        Matcher matcher2 = f51055i.matcher("");
        Matcher matcher3 = f51056j.matcher("");
        while (cVar.a()) {
            b b10 = cVar.b();
            if (b10 == null) {
                this.f51068a.getLogger().c(EnumC4788n3.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str = b10.f51049b;
            if (i(matcher, str) || i(matcher2, str)) {
                cVar.d();
                A l10 = l(cVar);
                if (l10 != null) {
                    this.f51073f.add(l10);
                }
            } else if (i(matcher3, str)) {
                this.f51070c = e(matcher3, 1, null);
            } else {
                this.f51074g.c(str);
            }
        }
        h();
    }

    public final z k(c cVar, A a10) {
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        ArrayList arrayList = new ArrayList();
        Matcher matcher4 = f51058l.matcher("");
        Matcher matcher5 = f51059m.matcher("");
        Matcher matcher6 = f51060n.matcher("");
        Matcher matcher7 = f51061o.matcher("");
        Matcher matcher8 = f51063q.matcher("");
        Matcher matcher9 = f51062p.matcher("");
        Matcher matcher10 = f51065s.matcher("");
        Matcher matcher11 = f51064r.matcher("");
        Matcher matcher12 = f51066t.matcher("");
        Matcher matcher13 = f51067u.matcher("");
        Matcher matcher14 = f51057k.matcher("");
        y yVar = null;
        while (true) {
            if (!cVar.a()) {
                break;
            }
            b b10 = cVar.b();
            if (b10 == null) {
                this.f51068a.getLogger().c(EnumC4788n3.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = b10.f51049b;
            Matcher matcher15 = matcher13;
            if (i(matcher14, str)) {
                matcher = matcher12;
                Long e10 = e(matcher14, 1, null);
                if (e10 != null && e10.equals(this.f51070c)) {
                    a10.v(Boolean.TRUE);
                }
                matcher2 = matcher14;
            } else {
                matcher = matcher12;
                matcher2 = matcher14;
                if (i(matcher5, str)) {
                    yVar = new y();
                    String format = String.format("%s.%s", matcher5.group(1), matcher5.group(2));
                    yVar.E(format);
                    yVar.z(matcher5.group(3));
                    yVar.y(matcher5.group(4));
                    yVar.C(g(matcher5, 5, null));
                    yVar.A(this.f51071d.b(format));
                    arrayList.add(yVar);
                } else {
                    if (i(matcher4, str)) {
                        y yVar2 = new y();
                        yVar2.G(matcher4.group(3));
                        yVar2.z(matcher4.group(6));
                        yVar2.C(d(matcher4, 7, null));
                        yVar2.B("0x" + matcher4.group(2));
                        yVar2.H("native");
                        String group = matcher4.group(8);
                        String a11 = group == null ? null : s.a(group);
                        if (a11 != null) {
                            if (!this.f51072e.containsKey(a11)) {
                                DebugImage debugImage = new DebugImage();
                                debugImage.setDebugId(a11);
                                debugImage.setType("elf");
                                debugImage.setCodeFile(matcher4.group(4));
                                debugImage.setCodeId(group);
                                this.f51072e.put(a11, debugImage);
                            }
                            yVar2.x("rel:" + a11);
                        }
                        arrayList.add(yVar2);
                        matcher12 = matcher;
                        matcher3 = matcher15;
                        yVar = null;
                    } else if (i(matcher6, str)) {
                        yVar = new y();
                        String format2 = String.format("%s.%s", matcher6.group(1), matcher6.group(2));
                        yVar.E(format2);
                        yVar.z(matcher6.group(3));
                        yVar.A(this.f51071d.b(format2));
                        yVar.F(Boolean.TRUE);
                        arrayList.add(yVar);
                    } else if (i(matcher7, str)) {
                        if (yVar != null) {
                            C4793o3 c4793o3 = new C4793o3();
                            c4793o3.l(1);
                            c4793o3.h(matcher7.group(1));
                            c4793o3.j(matcher7.group(2));
                            c4793o3.i(matcher7.group(3));
                            yVar.D(c4793o3);
                            a(a10, c4793o3);
                        }
                    } else if (i(matcher8, str)) {
                        if (yVar != null) {
                            C4793o3 c4793o32 = new C4793o3();
                            c4793o32.l(2);
                            c4793o32.h(matcher8.group(1));
                            c4793o32.j(matcher8.group(2));
                            c4793o32.i(matcher8.group(3));
                            yVar.D(c4793o32);
                            a(a10, c4793o32);
                        }
                    } else if (!i(matcher9, str)) {
                        if (!i(matcher10, str)) {
                            if (!i(matcher11, str)) {
                                matcher12 = matcher;
                                if (!i(matcher12, str)) {
                                    if (str.length() == 0) {
                                        break;
                                    }
                                    matcher3 = matcher15;
                                    if (i(matcher3, str)) {
                                        break;
                                    }
                                } else {
                                    if (yVar != null) {
                                        C4793o3 c4793o33 = new C4793o3();
                                        c4793o33.l(8);
                                        yVar.D(c4793o33);
                                        a(a10, c4793o33);
                                    }
                                    matcher3 = matcher15;
                                }
                            } else if (yVar != null) {
                                C4793o3 c4793o34 = new C4793o3();
                                c4793o34.l(8);
                                c4793o34.h(matcher11.group(1));
                                c4793o34.j(matcher11.group(2));
                                c4793o34.i(matcher11.group(3));
                                yVar.D(c4793o34);
                                a(a10, c4793o34);
                            }
                        } else if (yVar != null) {
                            C4793o3 c4793o35 = new C4793o3();
                            c4793o35.l(8);
                            c4793o35.h(matcher10.group(1));
                            c4793o35.j(matcher10.group(2));
                            c4793o35.i(matcher10.group(3));
                            c4793o35.k(e(matcher10, 4, null));
                            yVar.D(c4793o35);
                            a(a10, c4793o35);
                        }
                        matcher12 = matcher;
                        matcher3 = matcher15;
                    } else if (yVar != null) {
                        C4793o3 c4793o36 = new C4793o3();
                        c4793o36.l(4);
                        c4793o36.h(matcher9.group(1));
                        c4793o36.j(matcher9.group(2));
                        c4793o36.i(matcher9.group(3));
                        yVar.D(c4793o36);
                        a(a10, c4793o36);
                    }
                    matcher13 = matcher3;
                    matcher14 = matcher2;
                }
            }
            matcher12 = matcher;
            matcher3 = matcher15;
            matcher13 = matcher3;
            matcher14 = matcher2;
        }
        Collections.reverse(arrayList);
        z zVar = new z(arrayList);
        zVar.i(Boolean.TRUE);
        return zVar;
    }

    public final A l(c cVar) {
        A a10 = new A();
        Matcher matcher = f51054h.matcher("");
        Matcher matcher2 = f51055i.matcher("");
        if (!cVar.a()) {
            return null;
        }
        b b10 = cVar.b();
        if (b10 == null) {
            this.f51068a.getLogger().c(EnumC4788n3.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (i(matcher, b10.f51049b)) {
            Long e10 = e(matcher, 4, null);
            if (e10 == null) {
                this.f51068a.getLogger().c(EnumC4788n3.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            a10.u(e10);
            String group = matcher.group(1);
            a10.w(group);
            if ("main".equals(group)) {
                a10.v(Boolean.TRUE);
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                if (group2.contains(" ")) {
                    a10.z(group2.substring(0, group2.indexOf(32)));
                } else {
                    a10.z(group2);
                }
            }
        } else if (i(matcher2, b10.f51049b)) {
            Long e11 = e(matcher2, 3, null);
            if (e11 == null) {
                this.f51068a.getLogger().c(EnumC4788n3.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            a10.u(e11);
            a10.w(matcher2.group(1));
            if (e11.equals(this.f51070c)) {
                a10.v(Boolean.TRUE);
            }
        }
        z k10 = k(cVar, a10);
        List e12 = k10.e();
        if (e12 == null || e12.isEmpty()) {
            return null;
        }
        a10.y(k10);
        return a10;
    }
}

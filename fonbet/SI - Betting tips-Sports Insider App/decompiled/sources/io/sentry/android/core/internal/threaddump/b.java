package io.sentry.android.core.internal.threaddump;

import b6.q;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.c5;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.b0;
import io.sentry.protocol.d0;
import io.sentry.protocol.z;
import io.sentry.t;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f15662f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f15663g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f15664h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f15665i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f15666k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f15667l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f15668m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f15669n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f15670o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f15671p = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern q = Pattern.compile("\\s+");

    /* renamed from: a, reason: collision with root package name */
    public final b6 f15672a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15673b;

    /* renamed from: c, reason: collision with root package name */
    public final t f15674c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15675d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15676e = new ArrayList();

    public b(b6 b6Var, boolean z5) {
        this.f15672a = b6Var;
        this.f15673b = z5;
        this.f15674c = new t(b6Var, 2);
    }

    public static void a(d0 d0Var, c5 c5Var) {
        Map map = d0Var.j;
        if (map == null) {
            map = new HashMap();
        }
        c5 c5Var2 = (c5) map.get(c5Var.f16234b);
        if (c5Var2 != null) {
            c5Var2.f16233a = Math.max(c5Var2.f16233a, c5Var.f16233a);
        } else {
            String str = c5Var.f16234b;
            c5 c5Var3 = new c5();
            c5Var3.f16233a = c5Var.f16233a;
            c5Var3.f16234b = str;
            c5Var3.f16235c = c5Var.f16235c;
            c5Var3.f16236d = c5Var.f16236d;
            c5Var3.f16237e = c5Var.f16237e;
            c5Var3.f16238f = com.google.android.play.core.appupdate.b.A(c5Var.f16238f);
            map.put(str, c5Var3);
        }
        d0Var.j = map;
    }

    public static Long b(Matcher matcher, int i5) {
        String group = matcher.group(i5);
        if (group == null || group.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(group));
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01cb, code lost:
    
        if (r10 >= 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x047f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x017e A[EDGE_INSN: B:143:0x017e->B:142:0x017e BREAK  A[LOOP:1: B:39:0x0168->B:53:0x0458], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(q qVar) {
        int i5;
        Pattern pattern;
        String str;
        Matcher matcher;
        Pattern pattern2;
        Matcher matcher2;
        String str2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        String str3;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        String str4;
        Integer valueOf;
        Short valueOf2;
        Short valueOf3;
        Short valueOf4;
        Short valueOf5;
        Integer valueOf6;
        Object[] objArr;
        Integer num;
        b bVar = this;
        q qVar2 = qVar;
        int i10 = qVar2.f3082a;
        Pattern pattern3 = f15662f;
        String str5 = "";
        Matcher matcher9 = pattern3.matcher("");
        Pattern pattern4 = f15663g;
        Matcher matcher10 = pattern4.matcher("");
        while (qVar2.f3083b < i10) {
            a a7 = qVar2.a();
            String str6 = "Internal error while parsing thread dump.";
            b6 b6Var = bVar.f15672a;
            if (a7 == null) {
                b6Var.getLogger().h(b5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str7 = a7.f15661a;
            if (c(matcher9, str7) || c(matcher10, str7)) {
                qVar2.f3083b--;
                d0 d0Var = new d0();
                Matcher matcher11 = pattern3.matcher(str5);
                Matcher matcher12 = pattern4.matcher(str5);
                if (qVar2.f3083b < i10) {
                    a a10 = qVar2.a();
                    if (a10 == null) {
                        b6Var.getLogger().h(b5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                    } else {
                        String str8 = a10.f15661a;
                        if (c(matcher11, str8)) {
                            Long b10 = b(matcher11, 4);
                            if (b10 == null) {
                                b6Var.getLogger().h(b5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                            } else {
                                d0Var.f16760a = b10;
                                d0Var.f16762c = matcher11.group(1);
                                String group = matcher11.group(5);
                                if (group != null) {
                                    if (group.contains(" ")) {
                                        d0Var.f16763d = group.substring(0, group.indexOf(32));
                                    } else {
                                        d0Var.f16763d = group;
                                    }
                                }
                                str2 = d0Var.f16762c;
                                if (str2 != null) {
                                    boolean equals = str2.equals("main");
                                    d0Var.f16767h = Boolean.valueOf(equals);
                                    d0Var.f16764e = Boolean.valueOf(equals);
                                    d0Var.f16765f = Boolean.valueOf(equals && !bVar.f15673b);
                                }
                                ArrayList arrayList = new ArrayList();
                                Matcher matcher13 = f15664h.matcher(str5);
                                matcher3 = f15665i.matcher(str5);
                                Matcher matcher14 = j.matcher(str5);
                                Matcher matcher15 = f15666k.matcher(str5);
                                pattern = pattern3;
                                Matcher matcher16 = f15668m.matcher(str5);
                                matcher = matcher9;
                                Matcher matcher17 = f15667l.matcher(str5);
                                pattern2 = pattern4;
                                Matcher matcher18 = f15670o.matcher(str5);
                                matcher2 = matcher10;
                                Matcher matcher19 = f15669n.matcher(str5);
                                matcher4 = f15671p.matcher(str5);
                                str = str5;
                                matcher5 = q.matcher(str5);
                                z zVar = null;
                                while (true) {
                                    if (qVar2.f3083b >= i10) {
                                        break;
                                    }
                                    a a11 = qVar2.a();
                                    if (a11 == null) {
                                        b6Var.getLogger().h(b5.WARNING, str6, new Object[0]);
                                        break;
                                    }
                                    String str9 = a11.f15661a;
                                    boolean c2 = c(matcher3, str9);
                                    t tVar = bVar.f15674c;
                                    i5 = i10;
                                    if (c2) {
                                        zVar = new z();
                                        str3 = str6;
                                        String m6 = k.m(matcher3.group(1), ".", matcher3.group(2));
                                        zVar.f16948f = m6;
                                        zVar.f16947e = matcher3.group(3);
                                        zVar.f16946d = matcher3.group(4);
                                        String group2 = matcher3.group(5);
                                        if (group2 != null && group2.length() != 0) {
                                            int parseInt = Integer.parseInt(group2);
                                            num = Integer.valueOf(parseInt);
                                        }
                                        num = null;
                                        zVar.f16949g = num;
                                        zVar.f16952k = tVar.d(m6);
                                        arrayList.add(zVar);
                                        matcher6 = matcher3;
                                        matcher7 = matcher4;
                                        matcher8 = matcher5;
                                    } else {
                                        str3 = str6;
                                        if (c(matcher13, str9)) {
                                            z zVar2 = new z();
                                            zVar2.f16953l = matcher13.group(3);
                                            zVar2.f16947e = matcher13.group(6);
                                            String group3 = matcher13.group(7);
                                            zVar2.f16949g = (group3 == null || group3.length() == 0) ? null : Integer.valueOf(Integer.parseInt(group3));
                                            zVar2.q = "0x" + matcher13.group(2);
                                            zVar2.f16955n = "native";
                                            String group4 = matcher13.group(8);
                                            if (group4 == null) {
                                                str4 = null;
                                            } else {
                                                try {
                                                    ByteBuffer wrap = ByteBuffer.wrap(new BigInteger("10".concat(group4), 16).toByteArray());
                                                    wrap.get();
                                                    valueOf = Integer.valueOf(wrap.order(ByteOrder.LITTLE_ENDIAN).getInt());
                                                    valueOf2 = Short.valueOf(wrap.getShort());
                                                    valueOf3 = Short.valueOf(wrap.getShort());
                                                    valueOf4 = Short.valueOf(wrap.order(ByteOrder.BIG_ENDIAN).getShort());
                                                    valueOf5 = Short.valueOf(wrap.getShort());
                                                    valueOf6 = Integer.valueOf(wrap.getInt());
                                                    objArr = new Object[6];
                                                } catch (NumberFormatException | BufferUnderflowException unused) {
                                                }
                                                try {
                                                    objArr[0] = valueOf;
                                                    objArr[1] = valueOf2;
                                                    objArr[2] = valueOf3;
                                                    objArr[3] = valueOf4;
                                                    objArr[4] = valueOf5;
                                                    try {
                                                        objArr[5] = valueOf6;
                                                        str4 = String.format("%08x-%04x-%04x-%04x-%04x%08x", objArr);
                                                    } catch (NumberFormatException | BufferUnderflowException unused2) {
                                                        str4 = null;
                                                        if (str4 != null) {
                                                        }
                                                        arrayList.add(zVar2);
                                                        zVar = null;
                                                        matcher7 = matcher4;
                                                        matcher8 = matcher5;
                                                        qVar2 = qVar;
                                                        matcher4 = matcher7;
                                                        matcher5 = matcher8;
                                                        str6 = str3;
                                                        i10 = i5;
                                                        matcher3 = matcher6;
                                                        bVar = this;
                                                    }
                                                } catch (NumberFormatException | BufferUnderflowException unused3) {
                                                    str4 = null;
                                                    if (str4 != null) {
                                                    }
                                                    arrayList.add(zVar2);
                                                    zVar = null;
                                                    matcher7 = matcher4;
                                                    matcher8 = matcher5;
                                                    qVar2 = qVar;
                                                    matcher4 = matcher7;
                                                    matcher5 = matcher8;
                                                    str6 = str3;
                                                    i10 = i5;
                                                    matcher3 = matcher6;
                                                    bVar = this;
                                                }
                                            }
                                            if (str4 != null) {
                                                HashMap hashMap = bVar.f15675d;
                                                if (hashMap.containsKey(str4)) {
                                                    matcher6 = matcher3;
                                                } else {
                                                    DebugImage debugImage = new DebugImage();
                                                    debugImage.setDebugId(str4);
                                                    matcher6 = matcher3;
                                                    debugImage.setType("elf");
                                                    debugImage.setCodeFile(matcher13.group(4));
                                                    debugImage.setCodeId(group4);
                                                    hashMap.put(str4, debugImage);
                                                }
                                                zVar2.f16958r = "rel:".concat(str4);
                                            } else {
                                                matcher6 = matcher3;
                                            }
                                            arrayList.add(zVar2);
                                            zVar = null;
                                        } else {
                                            matcher6 = matcher3;
                                            if (c(matcher14, str9)) {
                                                zVar = new z();
                                                String m10 = k.m(matcher14.group(1), ".", matcher14.group(2));
                                                zVar.f16948f = m10;
                                                zVar.f16947e = matcher14.group(3);
                                                zVar.f16952k = tVar.d(m10);
                                                zVar.f16954m = Boolean.TRUE;
                                                arrayList.add(zVar);
                                            } else if (c(matcher15, str9)) {
                                                if (zVar != null) {
                                                    c5 c5Var = new c5();
                                                    c5Var.f16233a = 1;
                                                    c5Var.f16234b = matcher15.group(1);
                                                    c5Var.f16235c = matcher15.group(2);
                                                    c5Var.f16236d = matcher15.group(3);
                                                    zVar.f16962v = c5Var;
                                                    a(d0Var, c5Var);
                                                }
                                            } else if (c(matcher16, str9)) {
                                                if (zVar != null) {
                                                    c5 c5Var2 = new c5();
                                                    c5Var2.f16233a = 2;
                                                    c5Var2.f16234b = matcher16.group(1);
                                                    c5Var2.f16235c = matcher16.group(2);
                                                    c5Var2.f16236d = matcher16.group(3);
                                                    zVar.f16962v = c5Var2;
                                                    a(d0Var, c5Var2);
                                                }
                                            } else if (c(matcher17, str9)) {
                                                if (zVar != null) {
                                                    c5 c5Var3 = new c5();
                                                    c5Var3.f16233a = 4;
                                                    c5Var3.f16234b = matcher17.group(1);
                                                    c5Var3.f16235c = matcher17.group(2);
                                                    c5Var3.f16236d = matcher17.group(3);
                                                    zVar.f16962v = c5Var3;
                                                    a(d0Var, c5Var3);
                                                }
                                            } else if (c(matcher18, str9)) {
                                                if (zVar != null) {
                                                    c5 c5Var4 = new c5();
                                                    c5Var4.f16233a = 8;
                                                    c5Var4.f16234b = matcher18.group(1);
                                                    c5Var4.f16235c = matcher18.group(2);
                                                    c5Var4.f16236d = matcher18.group(3);
                                                    c5Var4.f16237e = b(matcher18, 4);
                                                    zVar.f16962v = c5Var4;
                                                    a(d0Var, c5Var4);
                                                }
                                                matcher7 = matcher4;
                                                matcher8 = matcher5;
                                            } else {
                                                if (!c(matcher19, str9)) {
                                                    matcher7 = matcher4;
                                                    if (!c(matcher7, str9)) {
                                                        if (str9.length() == 0) {
                                                            break;
                                                        }
                                                        matcher8 = matcher5;
                                                        if (c(matcher8, str9)) {
                                                            break;
                                                        }
                                                    } else if (zVar != null) {
                                                        c5 c5Var5 = new c5();
                                                        c5Var5.f16233a = 8;
                                                        zVar.f16962v = c5Var5;
                                                        a(d0Var, c5Var5);
                                                    }
                                                } else {
                                                    if (zVar != null) {
                                                        c5 c5Var6 = new c5();
                                                        c5Var6.f16233a = 8;
                                                        c5Var6.f16234b = matcher19.group(1);
                                                        c5Var6.f16235c = matcher19.group(2);
                                                        c5Var6.f16236d = matcher19.group(3);
                                                        zVar.f16962v = c5Var6;
                                                        a(d0Var, c5Var6);
                                                    }
                                                    matcher7 = matcher4;
                                                }
                                                matcher8 = matcher5;
                                            }
                                        }
                                        matcher7 = matcher4;
                                        matcher8 = matcher5;
                                    }
                                    qVar2 = qVar;
                                    matcher4 = matcher7;
                                    matcher5 = matcher8;
                                    str6 = str3;
                                    i10 = i5;
                                    matcher3 = matcher6;
                                    bVar = this;
                                }
                                i5 = i10;
                                Collections.reverse(arrayList);
                                b0 b0Var = new b0(arrayList);
                                b0Var.f16751c = Boolean.TRUE;
                                d0Var.f16768i = b0Var;
                            }
                        } else {
                            if (c(matcher12, str8)) {
                                Long b11 = b(matcher12, 3);
                                if (b11 == null) {
                                    b6Var.getLogger().h(b5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                } else {
                                    d0Var.f16760a = b11;
                                    d0Var.f16762c = matcher12.group(1);
                                }
                            }
                            str2 = d0Var.f16762c;
                            if (str2 != null) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Matcher matcher132 = f15664h.matcher(str5);
                            matcher3 = f15665i.matcher(str5);
                            Matcher matcher142 = j.matcher(str5);
                            Matcher matcher152 = f15666k.matcher(str5);
                            pattern = pattern3;
                            Matcher matcher162 = f15668m.matcher(str5);
                            matcher = matcher9;
                            Matcher matcher172 = f15667l.matcher(str5);
                            pattern2 = pattern4;
                            Matcher matcher182 = f15670o.matcher(str5);
                            matcher2 = matcher10;
                            Matcher matcher192 = f15669n.matcher(str5);
                            matcher4 = f15671p.matcher(str5);
                            str = str5;
                            matcher5 = q.matcher(str5);
                            z zVar3 = null;
                            while (true) {
                                if (qVar2.f3083b >= i10) {
                                }
                                qVar2 = qVar;
                                matcher4 = matcher7;
                                matcher5 = matcher8;
                                str6 = str3;
                                i10 = i5;
                                matcher3 = matcher6;
                                bVar = this;
                            }
                            i5 = i10;
                            Collections.reverse(arrayList2);
                            b0 b0Var2 = new b0(arrayList2);
                            b0Var2.f16751c = Boolean.TRUE;
                            d0Var.f16768i = b0Var2;
                        }
                        bVar = this;
                        if (d0Var == null) {
                            bVar.f15676e.add(d0Var);
                        }
                    }
                }
                i5 = i10;
                pattern = pattern3;
                str = str5;
                matcher = matcher9;
                pattern2 = pattern4;
                matcher2 = matcher10;
                d0Var = null;
                bVar = this;
                if (d0Var == null) {
                }
            } else {
                i5 = i10;
                pattern = pattern3;
                str = str5;
                matcher = matcher9;
                pattern2 = pattern4;
                matcher2 = matcher10;
            }
            qVar2 = qVar;
            pattern3 = pattern;
            matcher9 = matcher;
            pattern4 = pattern2;
            matcher10 = matcher2;
            str5 = str;
            i10 = i5;
        }
    }
}

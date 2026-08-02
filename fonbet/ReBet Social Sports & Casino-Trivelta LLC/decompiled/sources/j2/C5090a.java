package j2;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.AbstractC3445z;
import d1.C3985a;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.InterfaceC4148o;
import e1.J;
import e2.C4163e;
import e2.s;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5090a implements s {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f53655d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f53656e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f53657a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f53658b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final J f53659c = new J();

    private Charset e(J j10) {
        Charset W10 = j10.W();
        return W10 != null ? W10 : StandardCharsets.UTF_8;
    }

    public static float f(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long g(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0L) + (Long.parseLong((String) AbstractC4134a.e(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) AbstractC4134a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    @Override // e2.s
    public void a(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC4148o interfaceC4148o) {
        long j10;
        String y10;
        String str;
        this.f53659c.Z(bArr, i10 + i11);
        this.f53659c.b0(i10);
        Charset e10 = e(this.f53659c);
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f45619a == -9223372036854775807L || !bVar.f45620b) ? null : new ArrayList();
        while (true) {
            String y11 = this.f53659c.y(e10);
            if (y11 == null) {
                break;
            }
            if (!y11.isEmpty()) {
                try {
                    Integer.parseInt(y11);
                    y10 = this.f53659c.y(e10);
                } catch (NumberFormatException unused) {
                    j10 = j11;
                    AbstractC4156x.i("SubripParser", "Skipping invalid index: " + y11);
                }
                if (y10 == null) {
                    AbstractC4156x.i("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f53655d.matcher(y10);
                if (matcher.matches()) {
                    long g10 = g(matcher, 1);
                    long g11 = g(matcher, 6);
                    int i12 = 0;
                    this.f53657a.setLength(0);
                    this.f53658b.clear();
                    String y12 = this.f53659c.y(e10);
                    while (!TextUtils.isEmpty(y12)) {
                        if (this.f53657a.length() > 0) {
                            this.f53657a.append("<br>");
                        }
                        this.f53657a.append(h(y12, this.f53658b));
                        y12 = this.f53659c.y(e10);
                    }
                    Spanned fromHtml = Html.fromHtml(this.f53657a.toString());
                    while (true) {
                        if (i12 >= this.f53658b.size()) {
                            str = null;
                            break;
                        }
                        str = (String) this.f53658b.get(i12);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    j10 = j11;
                    long j12 = bVar.f45619a;
                    if (j12 == j10 || g11 >= j12) {
                        interfaceC4148o.accept(new C4163e(AbstractC3445z.u(d(fromHtml, str)), g10, g11 - g10));
                    } else if (arrayList != null) {
                        arrayList.add(new C4163e(AbstractC3445z.u(d(fromHtml, str)), g10, g11 - g10));
                    }
                } else {
                    j10 = j11;
                    AbstractC4156x.i("SubripParser", "Skipping invalid timing: " + y10);
                }
                j11 = j10;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC4148o.accept((C4163e) it.next());
            }
        }
    }

    @Override // e2.s
    public int c() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        r14.l(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r15.equals("{\\an9}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        r14.i(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (r15.equals("{\\an8}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r15.equals("{\\an7}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r15.equals("{\\an3}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        r14.i(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r15.equals("{\\an2}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r15.equals("{\\an1}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        if (r15.equals("{\\an7}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        r14.l(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0044, code lost:
    
        if (r15.equals("{\\an6}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0050, code lost:
    
        if (r15.equals("{\\an4}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r15.equals("{\\an3}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0066, code lost:
    
        if (r15.equals("{\\an1}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r15.equals("{\\an9}") != false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3985a d(Spanned spanned, String str) {
        C3985a.b o10 = new C3985a.b().o(spanned);
        if (str == null) {
            return o10.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                break;
            case -685620679:
                str.equals("{\\an2}");
                o10.l(1);
                break;
            case -685620648:
                break;
            case -685620617:
                break;
            case -685620586:
                str.equals("{\\an5}");
                o10.l(1);
                break;
            case -685620555:
                break;
            case -685620524:
                break;
            case -685620493:
                str.equals("{\\an8}");
                o10.l(1);
                break;
            case -685620462:
                break;
            default:
                o10.l(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                break;
            case -685620679:
                break;
            case -685620648:
                break;
            case -685620617:
                str.equals("{\\an4}");
                o10.i(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                o10.i(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                o10.i(1);
                break;
            case -685620524:
                break;
            case -685620493:
                break;
            case -685620462:
                break;
            default:
                o10.i(1);
                break;
        }
        return o10.k(f(o10.d())).h(f(o10.c()), 0).a();
    }

    public final String h(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f53656e.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }
}

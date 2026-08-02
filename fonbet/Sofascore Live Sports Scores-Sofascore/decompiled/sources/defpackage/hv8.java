package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hv8 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = nik.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r7.b.equals("com.apple.iTunes") && r7.c.equals("iTunSMPB")) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ric ricVar) {
        lic licVar;
        ricVar.getClass();
        zu9 s = hv9.s();
        lic[] licVarArr = ricVar.a;
        int length = licVarArr.length;
        int i = 0;
        while (true) {
            lic licVar2 = null;
            if (i >= length) {
                break;
            }
            lic licVar3 = licVarArr[i];
            if (u33.class.isAssignableFrom(licVar3.getClass())) {
                lic licVar4 = (lic) u33.class.cast(licVar3);
                if (((u33) licVar4).c.equals("iTunSMPB")) {
                    licVar2 = licVar4;
                }
            }
            if (licVar2 != null) {
                s.c(licVar2);
            }
            i++;
        }
        av9 listIterator = s.g().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((u33) listIterator.next()).d)) {
                return;
            }
        }
        zu9 s2 = hv9.s();
        for (lic licVar5 : licVarArr) {
            if (d8a.class.isAssignableFrom(licVar5.getClass())) {
                licVar = (lic) d8a.class.cast(licVar5);
                d8a d8aVar = (d8a) licVar;
            }
            licVar = null;
            if (licVar != null) {
                s2.c(licVar);
            }
        }
        av9 listIterator2 = s2.g().listIterator(0);
        while (listIterator2.hasNext() && !a(((d8a) listIterator2.next()).d)) {
        }
    }
}

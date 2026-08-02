package com.google.android.gms.internal.ads;

import defpackage.gfn;
import defpackage.mio;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaha {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r0.zza(r6) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zzap zzapVar) {
        zzao zzaoVar;
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        zzao[] zzaoVarArr = zzapVar.a;
        int length = zzaoVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            zzao zzaoVar2 = null;
            if (i2 >= length) {
                break;
            }
            zzao zzaoVar3 = zzaoVarArr[i2];
            if (zzajt.class.isAssignableFrom(zzaoVar3.getClass())) {
                zzao zzaoVar4 = (zzao) zzajt.class.cast(zzaoVar3);
                if (((zzajt) zzaoVar4).c.equals("iTunSMPB")) {
                    zzaoVar2 = zzaoVar4;
                }
            }
            if (zzaoVar2 != null) {
                zzgxjVar.c(zzaoVar2);
            }
            i2++;
        }
        s f = zzgxjVar.f();
        int i3 = f.d;
        int i4 = 0;
        while (i4 < i3) {
            boolean b = b(((zzajt) f.get(i4)).d);
            i4++;
            if (b) {
                return;
            }
        }
        gfn gfnVar = gfn.b;
        mio mioVar2 = zzgxm.b;
        zzgxj zzgxjVar2 = new zzgxj();
        for (zzao zzaoVar5 : zzapVar.a) {
            if (zzakb.class.isAssignableFrom(zzaoVar5.getClass())) {
                zzaoVar = (zzao) zzakb.class.cast(zzaoVar5);
            }
            zzaoVar = null;
            if (zzaoVar != null) {
                zzgxjVar2.c(zzaoVar);
            }
        }
        s f2 = zzgxjVar2.f();
        int i5 = f2.d;
        while (i < i5) {
            boolean b2 = b(((zzakb) f2.get(i)).d);
            i++;
            if (b2) {
                return;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = zzfm.a;
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
}

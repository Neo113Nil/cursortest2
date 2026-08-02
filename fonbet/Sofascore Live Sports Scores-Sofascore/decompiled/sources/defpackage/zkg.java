package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zkg implements fkg {
    public static final /* synthetic */ int d = 0;
    public final String a;
    public final String b;
    public final boolean c;

    public zkg(String str, String str2) {
        this.a = str;
        this.b = str2;
        lig a = lig.a(str);
        boolean z = true;
        if (!lig.e.contains(a)) {
            if (!lig.d.contains(a)) {
                fjg.c().f(1);
            }
            z = false;
        }
        this.c = z;
    }

    @Override // defpackage.fkg
    public final String a() {
        return this.b;
    }

    @Override // defpackage.fkg
    public final String c() {
        return this.a;
    }

    @Override // defpackage.fkg
    public final boolean d() {
        return this.c;
    }
}

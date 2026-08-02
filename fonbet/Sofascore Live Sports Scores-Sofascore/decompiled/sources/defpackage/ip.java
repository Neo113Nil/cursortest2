package defpackage;

import kotlin.text.Regex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ip implements tsi {
    public static final ip c;
    public static final ip d;
    public static final ip e;
    public static final /* synthetic */ ip[] f;
    public static final /* synthetic */ kp5 g;
    public final String a;
    public final Regex b;

    static {
        ip ipVar = new ip("AFC", 0, "afc", new Regex("afc|american"));
        c = ipVar;
        ip ipVar2 = new ip("NFC", 1, "nfc", new Regex("nfc|national"));
        d = ipVar2;
        ip ipVar3 = new ip("OVERALL", 2, "overall", new Regex("^(?!.*(afc|nfc|american|national)).*$"));
        e = ipVar3;
        ip[] ipVarArr = {ipVar, ipVar2, ipVar3};
        f = ipVarArr;
        g = new kp5(ipVarArr);
    }

    public ip(String str, int i, String str2, Regex regex) {
        this.a = str2;
        this.b = regex;
    }

    public static ip valueOf(String str) {
        return (ip) Enum.valueOf(ip.class, str);
    }

    public static ip[] values() {
        return (ip[]) f.clone();
    }

    @Override // defpackage.tsi
    public final String d() {
        return this.a;
    }
}

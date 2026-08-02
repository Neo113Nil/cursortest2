package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class c1h {

    @NotNull
    public static final y0h Companion = new y0h();
    public static final joa[] e = {null, null, null, ypa.a(ysa.b, zg3.K)};
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public /* synthetic */ c1h(int i, String str, String str2, String str3, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = new LinkedHashMap();
        } else {
            this.d = map;
        }
    }

    public c1h(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = null;
        this.b = str;
        this.c = str2;
        this.d = linkedHashMap;
    }
}

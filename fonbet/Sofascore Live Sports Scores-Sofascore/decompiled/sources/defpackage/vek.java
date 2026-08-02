package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class vek {

    @NotNull
    public static final uek Companion = new uek();
    public static final joa[] k;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Set g;
    public Map h;
    public Map i;
    public String j;

    static {
        ysa ysaVar = ysa.b;
        k = new joa[]{null, null, null, null, null, null, ypa.a(ysaVar, ptj.n), ypa.a(ysaVar, ptj.o), ypa.a(ysaVar, ptj.p), null};
    }

    public vek(String str, LinkedHashSet linkedHashSet, int i) {
        str = (i & 1) != 0 ? null : str;
        linkedHashSet = (i & 64) != 0 ? null : linkedHashSet;
        this.a = str;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = linkedHashSet;
        this.h = null;
        this.i = null;
        this.j = null;
    }
}

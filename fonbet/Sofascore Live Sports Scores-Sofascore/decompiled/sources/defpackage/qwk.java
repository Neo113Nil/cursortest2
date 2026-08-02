package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qwk implements b0i {
    public static final qwk e;
    public static final /* synthetic */ qwk[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final List b;
    public final Function1 c;
    public final boolean d;

    static {
        pwk pwkVar = pwk.g;
        pwk pwkVar2 = pwk.h;
        pwk pwkVar3 = pwk.i;
        qwk qwkVar = new qwk("Basic", 0, R.string.legend_info_button_title, b.j(pwkVar, pwkVar2, pwkVar3, pwk.j), new owk(22), true);
        e = qwkVar;
        qwk[] qwkVarArr = {qwkVar, new qwk("Points", 1, R.string.volleyball_points, b.j(pwk.k, pwk.l, pwk.m, pwk.n), new owk(23), false), new qwk("Serve", 2, R.string.volleyball_serve, b.j(pwk.o, pwk.p, pwkVar3), new owk(24), false), new qwk("Reception", 3, R.string.volleyball_reception, b.j(pwk.q, pwk.r, pwk.s, pwk.t), new owk(25), false), new qwk("Attack", 4, R.string.volleyball_attack, b.j(pwk.u, pwk.v, pwk.w, pwk.x, pwk.y), new owk(26), false)};
        f = qwkVarArr;
        g = new kp5(qwkVarArr);
    }

    public qwk(String str, int i, int i2, List list, Function1 function1, boolean z) {
        this.a = i2;
        this.b = list;
        this.c = function1;
        this.d = z;
    }

    public static qwk valueOf(String str) {
        return (qwk) Enum.valueOf(qwk.class, str);
    }

    public static qwk[] values() {
        return (qwk[]) f.clone();
    }

    @Override // defpackage.b0i
    public final String d() {
        return name();
    }

    @Override // defpackage.b0i
    public final int g() {
        return this.a;
    }

    @Override // defpackage.b0i
    public final Function1 h() {
        return this.c;
    }

    @Override // defpackage.b0i
    public final List i() {
        return this.b;
    }
}

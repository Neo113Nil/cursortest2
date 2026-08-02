package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l9g implements b0i {
    public static final /* synthetic */ l9g[] c;
    public static final /* synthetic */ kp5 d;
    public final List a;
    public final j9g b;

    static {
        l9g[] l9gVarArr = {new l9g(k9g.g, new j9g(22))};
        c = l9gVarArr;
        d = new kp5(l9gVarArr);
    }

    public l9g(kp5 kp5Var, j9g j9gVar) {
        this.a = kp5Var;
        this.b = j9gVar;
    }

    public static l9g valueOf(String str) {
        return (l9g) Enum.valueOf(l9g.class, str);
    }

    public static l9g[] values() {
        return (l9g[]) c.clone();
    }

    @Override // defpackage.b0i
    public final String d() {
        return name();
    }

    @Override // defpackage.b0i
    public final int g() {
        return R.string.legend_info_button_title;
    }

    @Override // defpackage.b0i
    public final Function1 h() {
        return this.b;
    }

    @Override // defpackage.b0i
    public final List i() {
        return this.a;
    }
}

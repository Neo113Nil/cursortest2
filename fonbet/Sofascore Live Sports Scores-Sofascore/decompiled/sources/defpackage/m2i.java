package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m2i {
    public static final m2i c;
    public static final m2i d;
    public static final m2i e;
    public static final /* synthetic */ m2i[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final Function1 b;

    static {
        m2i m2iVar = new m2i("STAGE_CONSTRUCTOR_INFO", 0, R.string.tab_info, new z1h(27));
        m2i m2iVar2 = new m2i("STAGE_CONSTRUCTOR_STANDINGS", 1, R.string.standings, new z1h(28));
        c = m2iVar2;
        m2i m2iVar3 = new m2i("STAGE_CONSTRUCTOR_RACES", 2, R.string.formula_races, new z1h(29));
        d = m2iVar3;
        m2i m2iVar4 = new m2i("STAGE_CONSTRUCTOR_CAREER", 3, R.string.record, new l2i(0));
        e = m2iVar4;
        m2i[] m2iVarArr = {m2iVar, m2iVar2, m2iVar3, m2iVar4};
        f = m2iVarArr;
        g = new kp5(m2iVarArr);
    }

    public m2i(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static m2i valueOf(String str) {
        return (m2i) Enum.valueOf(m2i.class, str);
    }

    public static m2i[] values() {
        return (m2i[]) f.clone();
    }
}

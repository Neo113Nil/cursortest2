package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r1k {
    public static final r1k c;
    public static final r1k d;
    public static final /* synthetic */ r1k[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;
    public final Function1 b;

    static {
        r1k r1kVar = new r1k("MajorTrophy", 0, R.string.major_trophies, new crj(12));
        c = r1kVar;
        r1k r1kVar2 = new r1k("All", 1, R.string.all_trophies, new crj(13));
        d = r1kVar2;
        r1k[] r1kVarArr = {r1kVar, r1kVar2};
        e = r1kVarArr;
        f = new kp5(r1kVarArr);
    }

    public r1k(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static r1k valueOf(String str) {
        return (r1k) Enum.valueOf(r1k.class, str);
    }

    public static r1k[] values() {
        return (r1k[]) e.clone();
    }
}

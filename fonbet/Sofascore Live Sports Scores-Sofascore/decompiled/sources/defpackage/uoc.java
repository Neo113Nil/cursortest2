package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uoc {
    public static final uoc c;
    public static final /* synthetic */ uoc[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;

    static {
        uoc uocVar = new uoc("DETAILS", 0, R.string.details, new clc(2));
        uoc uocVar2 = new uoc("STATISTICS", 1, R.string.statistics, soc.b);
        c = uocVar2;
        uoc[] uocVarArr = {uocVar, uocVar2, new uoc("FIGHTS", 2, R.string.fights, toc.b)};
        d = uocVarArr;
        e = new kp5(uocVarArr);
    }

    public uoc(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static uoc valueOf(String str) {
        return (uoc) Enum.valueOf(uoc.class, str);
    }

    public static uoc[] values() {
        return (uoc[]) d.clone();
    }
}

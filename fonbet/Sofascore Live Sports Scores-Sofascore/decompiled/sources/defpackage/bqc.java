package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bqc {
    public static final /* synthetic */ bqc[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;
    public final Function1 b;

    static {
        bqc[] bqcVarArr = {new bqc("DETAILS", 0, R.string.details, new clc(3)), new bqc("EVENTS", 1, R.string.events_title, new clc(4)), new bqc("RANKINGS", 2, R.string.rankings, new clc(5))};
        c = bqcVarArr;
        d = new kp5(bqcVarArr);
    }

    public bqc(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static bqc valueOf(String str) {
        return (bqc) Enum.valueOf(bqc.class, str);
    }

    public static bqc[] values() {
        return (bqc[]) c.clone();
    }
}

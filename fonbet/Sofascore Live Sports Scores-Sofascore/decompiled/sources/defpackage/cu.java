package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cu {
    public static final cu e;
    public static final cu f;
    public static final cu g;
    public static final /* synthetic */ cu[] h;
    public static final /* synthetic */ kp5 i;
    public final String a;
    public final Function1 b;
    public final boolean c;
    public final boolean d;

    static {
        cu cuVar = new cu("REFERRAL_REWARD", 0, "referral-reward", new dt(2), false, false);
        cu cuVar2 = new cu("WORLD_CUP_FREE_TRIAL_OFFER", 1, "world-cup-2026-free-trial", new dt(3), true, false);
        e = cuVar2;
        cu cuVar3 = new cu("WORLD_CUP_OFFER", 2, "world-cup-2026", new dt(4), true, false);
        f = cuVar3;
        cu cuVar4 = new cu("BLACK_FRIDAY", 3, "black-friday-2025", new dt(5), true, true);
        g = cuVar4;
        cu[] cuVarArr = {cuVar, cuVar2, cuVar3, cuVar4, new cu("FREE_TRIAL", 4, "freetrial1m", new dt(6), false, false), new cu("DISCOUNT_3_FOR_HALF", 5, "discount3m", new dt(7), true, false)};
        h = cuVarArr;
        i = new kp5(cuVarArr);
    }

    public cu(String str, int i2, String str2, Function1 function1, boolean z, boolean z2) {
        this.a = str2;
        this.b = function1;
        this.c = z;
        this.d = z2;
    }

    public static cu valueOf(String str) {
        return (cu) Enum.valueOf(cu.class, str);
    }

    public static cu[] values() {
        return (cu[]) h.clone();
    }
}

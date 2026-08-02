package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class veh {
    public static final veh a;
    public static final veh b;
    public static final veh c;
    public static final /* synthetic */ veh[] d;

    static {
        veh vehVar = new veh("START", 0);
        a = vehVar;
        veh vehVar2 = new veh("STOP", 1);
        b = vehVar2;
        veh vehVar3 = new veh("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = vehVar3;
        d = new veh[]{vehVar, vehVar2, vehVar3};
    }

    public static veh valueOf(String str) {
        return (veh) Enum.valueOf(veh.class, str);
    }

    public static veh[] values() {
        return (veh[]) d.clone();
    }
}

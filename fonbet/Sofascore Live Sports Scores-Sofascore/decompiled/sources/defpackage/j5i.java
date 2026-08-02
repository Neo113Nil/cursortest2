package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j5i {
    public static final j5i b;
    public static final j5i c;
    public static final /* synthetic */ j5i[] d;
    public static final /* synthetic */ kp5 e;
    public final String a;

    static {
        j5i j5iVar = new j5i("DRIVER", 0, "competitor");
        b = j5iVar;
        j5i j5iVar2 = new j5i("CONSTRUCTOR", 1, "team");
        c = j5iVar2;
        j5i[] j5iVarArr = {j5iVar, j5iVar2};
        d = j5iVarArr;
        e = new kp5(j5iVarArr);
    }

    public j5i(String str, int i, String str2) {
        this.a = str2;
    }

    public static j5i valueOf(String str) {
        return (j5i) Enum.valueOf(j5i.class, str);
    }

    public static j5i[] values() {
        return (j5i[]) d.clone();
    }
}

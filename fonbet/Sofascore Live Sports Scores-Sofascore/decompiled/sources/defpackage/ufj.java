package defpackage;

import com.blaze.blazesdk.widgets.models.WidgetRemoteConfigRemoteResponse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ufj {
    public static final w9f b;
    public static final ufj c;
    public static final ufj d;
    public static final /* synthetic */ ufj[] e;
    public static final /* synthetic */ kp5 f;
    public final String a;

    static {
        ufj ufjVar = new ufj("LIGHT", 0, WidgetRemoteConfigRemoteResponse.DEFAULT_LAYOUT_KEY);
        c = ufjVar;
        ufj ufjVar2 = new ufj("DARK", 1, "dark_black");
        d = ufjVar2;
        ufj[] ufjVarArr = {ufjVar, ufjVar2};
        e = ufjVarArr;
        f = new kp5(ufjVarArr);
        b = new w9f(4);
    }

    public ufj(String str, int i, String str2) {
        this.a = str2;
    }

    public static ufj valueOf(String str) {
        return (ufj) Enum.valueOf(ufj.class, str);
    }

    public static ufj[] values() {
        return (ufj[]) e.clone();
    }
}

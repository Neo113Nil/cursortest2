package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d3h {
    public static final d3h a;
    public static final d3h b;
    public static final d3h c;
    public static final /* synthetic */ d3h[] d;

    static {
        d3h d3hVar = new d3h(PlayerKt.PREFERRED_FOOT_LEFT, 0);
        a = d3hVar;
        d3h d3hVar2 = new d3h("Middle", 1);
        b = d3hVar2;
        d3h d3hVar3 = new d3h(PlayerKt.PREFERRED_FOOT_RIGHT, 2);
        c = d3hVar3;
        d = new d3h[]{d3hVar, d3hVar2, d3hVar3};
    }

    public static d3h valueOf(String str) {
        return (d3h) Enum.valueOf(d3h.class, str);
    }

    public static d3h[] values() {
        return (d3h[]) d.clone();
    }
}

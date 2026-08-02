package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zxe {
    public static final zxe c;
    public static final zxe d;
    public static final zxe e;
    public static final zxe f;
    public static final zxe g;
    public static final zxe h;
    public static final /* synthetic */ zxe[] i;
    public static final /* synthetic */ kp5 j;
    public final int a;
    public final Function1 b;

    static {
        zxe zxeVar = new zxe("DETAILS", 0, R.string.details, new jie(18));
        c = zxeVar;
        zxe zxeVar2 = new zxe("STATISTICS", 1, R.string.statistics, uxe.b);
        d = zxeVar2;
        zxe zxeVar3 = new zxe("MATCHES", 2, R.string.matches, vxe.b);
        e = zxeVar3;
        zxe zxeVar4 = new zxe("CAREER_STATISTICS", 3, R.string.am_football_career_tab, wxe.b);
        f = zxeVar4;
        zxe zxeVar5 = new zxe("MEDIA", 4, R.string.media, xxe.b);
        g = zxeVar5;
        zxe zxeVar6 = new zxe("FANTASY", 5, R.string.fantasy, yxe.b);
        h = zxeVar6;
        zxe[] zxeVarArr = {zxeVar, zxeVar2, zxeVar3, zxeVar4, zxeVar5, zxeVar6};
        i = zxeVarArr;
        j = new kp5(zxeVarArr);
    }

    public zxe(String str, int i2, int i3, Function1 function1) {
        this.a = i3;
        this.b = function1;
    }

    public static zxe valueOf(String str) {
        return (zxe) Enum.valueOf(zxe.class, str);
    }

    public static zxe[] values() {
        return (zxe[]) i.clone();
    }
}

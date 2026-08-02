package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zaf {
    public static final /* synthetic */ zaf[] b;
    public static final /* synthetic */ kp5 c;
    public final int a;

    static {
        zaf[] zafVarArr = {new zaf("UPCOMING", 0, R.string.upcoming), new zaf("FINISHED", 1, R.string.finished), new zaf("STATISTICS", 2, R.string.statistics)};
        b = zafVarArr;
        c = new kp5(zafVarArr);
    }

    public zaf(String str, int i, int i2) {
        this.a = i2;
    }

    public static zaf valueOf(String str) {
        return (zaf) Enum.valueOf(zaf.class, str);
    }

    public static zaf[] values() {
        return (zaf[]) b.clone();
    }
}

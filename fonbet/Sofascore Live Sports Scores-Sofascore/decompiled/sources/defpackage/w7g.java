package defpackage;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class w7g {
    public static final w7g a;
    public static final w7g b;
    public static final /* synthetic */ w7g[] c;

    static {
        w7g w7gVar = new w7g(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH, 0);
        a = w7gVar;
        w7g w7gVar2 = new w7g("QUERY", 1);
        b = w7gVar2;
        c = new w7g[]{w7gVar, w7gVar2};
    }

    public static w7g valueOf(String str) {
        return (w7g) Enum.valueOf(w7g.class, str);
    }

    public static w7g[] values() {
        return (w7g[]) c.clone();
    }
}

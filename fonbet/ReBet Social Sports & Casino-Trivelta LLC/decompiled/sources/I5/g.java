package I5;

import com.twilio.voice.EventKeys;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;

    /* renamed from: b, reason: collision with root package name */
    public static final g f5409b = new g("CONSOLE", 0, "console");

    /* renamed from: c, reason: collision with root package name */
    public static final g f5410c = new g("CODE", 1, EventKeys.ERROR_CODE);

    /* renamed from: d, reason: collision with root package name */
    public static final g f5411d = new g("FETCH", 2, "fetch");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f5412e;

    /* renamed from: a, reason: collision with root package name */
    public final String f5413a;

    static {
        g[] a10 = a();
        $VALUES = a10;
        f5412e = EnumEntriesKt.enumEntries(a10);
    }

    public g(String str, int i10, String str2) {
        this.f5413a = str2;
    }

    public static final /* synthetic */ g[] a() {
        return new g[]{f5409b, f5410c, f5411d};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final String b() {
        return this.f5413a;
    }
}

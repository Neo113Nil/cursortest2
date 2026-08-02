package kotlinx.coroutines.flow;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class G {
    private static final /* synthetic */ G[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final G f54633a = new G("START", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final G f54634b = new G("STOP", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final G f54635c = new G("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f54636d;

    static {
        G[] a10 = a();
        $VALUES = a10;
        f54636d = EnumEntriesKt.enumEntries(a10);
    }

    public G(String str, int i10) {
    }

    public static final /* synthetic */ G[] a() {
        return new G[]{f54633a, f54634b, f54635c};
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }
}

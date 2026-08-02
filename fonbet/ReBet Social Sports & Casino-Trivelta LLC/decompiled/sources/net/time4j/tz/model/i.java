package net.time4j.tz.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class i {
    private static final /* synthetic */ i[] $VALUES;
    static final i[] VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final i f58389a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f58390b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f58391c;

    public enum a extends i {
        public a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("UTC_TIME", 0);
        f58389a = aVar;
        i iVar = new i("STANDARD_TIME", 1) { // from class: net.time4j.tz.model.i.b
            {
                a aVar2 = null;
            }
        };
        f58390b = iVar;
        i iVar2 = new i("WALL_TIME", 2) { // from class: net.time4j.tz.model.i.c
            {
                a aVar2 = null;
            }
        };
        f58391c = iVar2;
        $VALUES = new i[]{aVar, iVar, iVar2};
        VALUES = values();
    }

    public i(String str, int i10) {
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public /* synthetic */ i(String str, int i10, a aVar) {
        this(str, i10);
    }
}

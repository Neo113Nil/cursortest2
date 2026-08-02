package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d6b {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ d6b[] $VALUES;

    @NotNull
    public static final b6b Companion;
    public static final d6b ON_ANY;
    public static final d6b ON_CREATE;
    public static final d6b ON_DESTROY;
    public static final d6b ON_PAUSE;
    public static final d6b ON_RESUME;
    public static final d6b ON_START;
    public static final d6b ON_STOP;

    static {
        d6b d6bVar = new d6b("ON_CREATE", 0);
        ON_CREATE = d6bVar;
        d6b d6bVar2 = new d6b("ON_START", 1);
        ON_START = d6bVar2;
        d6b d6bVar3 = new d6b("ON_RESUME", 2);
        ON_RESUME = d6bVar3;
        d6b d6bVar4 = new d6b("ON_PAUSE", 3);
        ON_PAUSE = d6bVar4;
        d6b d6bVar5 = new d6b("ON_STOP", 4);
        ON_STOP = d6bVar5;
        d6b d6bVar6 = new d6b("ON_DESTROY", 5);
        ON_DESTROY = d6bVar6;
        d6b d6bVar7 = new d6b("ON_ANY", 6);
        ON_ANY = d6bVar7;
        d6b[] d6bVarArr = {d6bVar, d6bVar2, d6bVar3, d6bVar4, d6bVar5, d6bVar6, d6bVar7};
        $VALUES = d6bVarArr;
        $ENTRIES = new kp5(d6bVarArr);
        Companion = new b6b();
    }

    public static d6b valueOf(String str) {
        return (d6b) Enum.valueOf(d6b.class, str);
    }

    public static d6b[] values() {
        return (d6b[]) $VALUES.clone();
    }

    public final e6b d() {
        switch (c6b.a[ordinal()]) {
            case 1:
            case 2:
                return e6b.c;
            case 3:
            case 4:
                return e6b.d;
            case 5:
                return e6b.e;
            case 6:
                return e6b.a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                zzl.b();
                return null;
        }
    }
}

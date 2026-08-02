package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ nf.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;

    @NotNull
    public static final u Companion;
    public static final w ON_ANY;
    public static final w ON_CREATE;
    public static final w ON_DESTROY;
    public static final w ON_PAUSE;
    public static final w ON_RESUME;
    public static final w ON_START;
    public static final w ON_STOP;

    static {
        w wVar = new w("ON_CREATE", 0);
        ON_CREATE = wVar;
        w wVar2 = new w("ON_START", 1);
        ON_START = wVar2;
        w wVar3 = new w("ON_RESUME", 2);
        ON_RESUME = wVar3;
        w wVar4 = new w("ON_PAUSE", 3);
        ON_PAUSE = wVar4;
        w wVar5 = new w("ON_STOP", 4);
        ON_STOP = wVar5;
        w wVar6 = new w("ON_DESTROY", 5);
        ON_DESTROY = wVar6;
        w wVar7 = new w("ON_ANY", 6);
        ON_ANY = wVar7;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7};
        $VALUES = wVarArr;
        $ENTRIES = com.google.android.play.core.appupdate.b.l(wVarArr);
        Companion = new u();
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public final x a() {
        switch (v.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return x.f2255c;
            case 3:
            case 4:
                return x.f2256d;
            case 5:
                return x.f2257e;
            case 6:
                return x.f2253a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new gf.m();
        }
    }
}

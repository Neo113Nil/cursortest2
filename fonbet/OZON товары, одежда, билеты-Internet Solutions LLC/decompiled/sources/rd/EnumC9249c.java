package rd;

import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rd.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC9249c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9249c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final EnumC9249c Function;
    public static final EnumC9249c KFunction;
    public static final EnumC9249c KSuspendFunction;
    public static final EnumC9249c SuspendFunction;
    public static final EnumC9249c UNKNOWN;

    /* renamed from: rd.c$a */
    public static final class a {
    }

    static {
        EnumC9249c enumC9249c = new EnumC9249c("Function", 0);
        Function = enumC9249c;
        EnumC9249c enumC9249c2 = new EnumC9249c("SuspendFunction", 1);
        SuspendFunction = enumC9249c2;
        EnumC9249c enumC9249c3 = new EnumC9249c("KFunction", 2);
        KFunction = enumC9249c3;
        EnumC9249c enumC9249c4 = new EnumC9249c("KSuspendFunction", 3);
        KSuspendFunction = enumC9249c4;
        EnumC9249c enumC9249c5 = new EnumC9249c(FraudMonInfo.UNKNOWN, 4);
        UNKNOWN = enumC9249c5;
        EnumC9249c[] enumC9249cArr = {enumC9249c, enumC9249c2, enumC9249c3, enumC9249c4, enumC9249c5};
        $VALUES = enumC9249cArr;
        $ENTRIES = Xc.b.a(enumC9249cArr);
        Companion = new a();
    }

    private EnumC9249c() {
        throw null;
    }

    public static EnumC9249c valueOf(String str) {
        return (EnumC9249c) Enum.valueOf(EnumC9249c.class, str);
    }

    public static EnumC9249c[] values() {
        return (EnumC9249c[]) $VALUES.clone();
    }
}

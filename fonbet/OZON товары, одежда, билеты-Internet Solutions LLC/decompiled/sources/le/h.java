package le;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CAPTURED_TYPE_SCOPE;
    public static final h ERASED_RECEIVER_TYPE_SCOPE;
    public static final h ERROR_TYPE_SCOPE;
    public static final h INTEGER_LITERAL_TYPE_SCOPE;
    public static final h NON_CLASSIFIER_SUPER_TYPE_SCOPE;
    public static final h SCOPE_FOR_ABBREVIATION_TYPE;
    public static final h SCOPE_FOR_ERROR_CLASS;
    public static final h SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE;
    public static final h STUB_TYPE_SCOPE;
    public static final h UNSUPPORTED_TYPE_SCOPE;

    @NotNull
    private final String debugMessage;

    static {
        h hVar = new h("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
        CAPTURED_TYPE_SCOPE = hVar;
        h hVar2 = new h("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
        INTEGER_LITERAL_TYPE_SCOPE = hVar2;
        h hVar3 = new h("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
        ERASED_RECEIVER_TYPE_SCOPE = hVar3;
        h hVar4 = new h("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
        SCOPE_FOR_ABBREVIATION_TYPE = hVar4;
        h hVar5 = new h("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
        STUB_TYPE_SCOPE = hVar5;
        h hVar6 = new h("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
        NON_CLASSIFIER_SUPER_TYPE_SCOPE = hVar6;
        h hVar7 = new h("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
        ERROR_TYPE_SCOPE = hVar7;
        h hVar8 = new h("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
        UNSUPPORTED_TYPE_SCOPE = hVar8;
        h hVar9 = new h("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
        SCOPE_FOR_ERROR_CLASS = hVar9;
        h hVar10 = new h("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");
        SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = hVar10;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10};
        $VALUES = hVarArr;
        $ENTRIES = Xc.b.a(hVarArr);
    }

    private h(String str, int i11, String str2) {
        this.debugMessage = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.debugMessage;
    }
}

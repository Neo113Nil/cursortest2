package com.margelo.nitro.playagerangedeclaration;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppleAgeRangeDeclarationUserStatusValues.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECKEDBYOTHERMETHOD", "GOVERNMENTIDCHECKED", "GUARDIANCHECKEDBYOTHERMETHOD", "GUARDIANDECLARED", "GUARDIANGOVERNMENTIDCHECKED", "GUARDIANPAYMENTCHECKED", "PAYMENTCHECKED", "SELFDECLARED", "DECLINED", "UNKNOWN", "Companion", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppleAgeRangeDeclarationUserStatusValues {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppleAgeRangeDeclarationUserStatusValues[] $VALUES;
    private final int value;
    public static final AppleAgeRangeDeclarationUserStatusValues CHECKEDBYOTHERMETHOD = new AppleAgeRangeDeclarationUserStatusValues("CHECKEDBYOTHERMETHOD", 0, 0);
    public static final AppleAgeRangeDeclarationUserStatusValues GOVERNMENTIDCHECKED = new AppleAgeRangeDeclarationUserStatusValues("GOVERNMENTIDCHECKED", 1, 1);
    public static final AppleAgeRangeDeclarationUserStatusValues GUARDIANCHECKEDBYOTHERMETHOD = new AppleAgeRangeDeclarationUserStatusValues("GUARDIANCHECKEDBYOTHERMETHOD", 2, 2);
    public static final AppleAgeRangeDeclarationUserStatusValues GUARDIANDECLARED = new AppleAgeRangeDeclarationUserStatusValues("GUARDIANDECLARED", 3, 3);
    public static final AppleAgeRangeDeclarationUserStatusValues GUARDIANGOVERNMENTIDCHECKED = new AppleAgeRangeDeclarationUserStatusValues("GUARDIANGOVERNMENTIDCHECKED", 4, 4);
    public static final AppleAgeRangeDeclarationUserStatusValues GUARDIANPAYMENTCHECKED = new AppleAgeRangeDeclarationUserStatusValues("GUARDIANPAYMENTCHECKED", 5, 5);
    public static final AppleAgeRangeDeclarationUserStatusValues PAYMENTCHECKED = new AppleAgeRangeDeclarationUserStatusValues("PAYMENTCHECKED", 6, 6);
    public static final AppleAgeRangeDeclarationUserStatusValues SELFDECLARED = new AppleAgeRangeDeclarationUserStatusValues("SELFDECLARED", 7, 7);
    public static final AppleAgeRangeDeclarationUserStatusValues DECLINED = new AppleAgeRangeDeclarationUserStatusValues("DECLINED", 8, 8);
    public static final AppleAgeRangeDeclarationUserStatusValues UNKNOWN = new AppleAgeRangeDeclarationUserStatusValues("UNKNOWN", 9, 9);

    private static final /* synthetic */ AppleAgeRangeDeclarationUserStatusValues[] $values() {
        return new AppleAgeRangeDeclarationUserStatusValues[]{CHECKEDBYOTHERMETHOD, GOVERNMENTIDCHECKED, GUARDIANCHECKEDBYOTHERMETHOD, GUARDIANDECLARED, GUARDIANGOVERNMENTIDCHECKED, GUARDIANPAYMENTCHECKED, PAYMENTCHECKED, SELFDECLARED, DECLINED, UNKNOWN};
    }

    public static EnumEntries<AppleAgeRangeDeclarationUserStatusValues> getEntries() {
        return $ENTRIES;
    }

    private AppleAgeRangeDeclarationUserStatusValues(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        AppleAgeRangeDeclarationUserStatusValues[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static AppleAgeRangeDeclarationUserStatusValues valueOf(String str) {
        return (AppleAgeRangeDeclarationUserStatusValues) Enum.valueOf(AppleAgeRangeDeclarationUserStatusValues.class, str);
    }

    public static AppleAgeRangeDeclarationUserStatusValues[] values() {
        return (AppleAgeRangeDeclarationUserStatusValues[]) $VALUES.clone();
    }
}

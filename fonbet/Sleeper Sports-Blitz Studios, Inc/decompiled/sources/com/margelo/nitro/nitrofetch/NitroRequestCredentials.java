package com.margelo.nitro.nitrofetch;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NitroRequestCredentials.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroRequestCredentials;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INCLUDE", "OMIT", "SAME_ORIGIN", "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroRequestCredentials {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NitroRequestCredentials[] $VALUES;
    public static final NitroRequestCredentials INCLUDE = new NitroRequestCredentials("INCLUDE", 0, 0);
    public static final NitroRequestCredentials OMIT = new NitroRequestCredentials("OMIT", 1, 1);
    public static final NitroRequestCredentials SAME_ORIGIN = new NitroRequestCredentials("SAME_ORIGIN", 2, 2);
    private final int value;

    private static final /* synthetic */ NitroRequestCredentials[] $values() {
        return new NitroRequestCredentials[]{INCLUDE, OMIT, SAME_ORIGIN};
    }

    public static EnumEntries<NitroRequestCredentials> getEntries() {
        return $ENTRIES;
    }

    private NitroRequestCredentials(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        NitroRequestCredentials[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static NitroRequestCredentials valueOf(String str) {
        return (NitroRequestCredentials) Enum.valueOf(NitroRequestCredentials.class, str);
    }

    public static NitroRequestCredentials[] values() {
        return (NitroRequestCredentials[]) $VALUES.clone();
    }
}

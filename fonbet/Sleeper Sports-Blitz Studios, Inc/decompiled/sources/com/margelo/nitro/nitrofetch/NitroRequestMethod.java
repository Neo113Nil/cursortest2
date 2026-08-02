package com.margelo.nitro.nitrofetch;

import com.google.firebase.perf.FirebasePerformance;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NitroRequestMethod.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroRequestMethod;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GET", FirebasePerformance.HttpMethod.HEAD, "POST", "PUT", "PATCH", "DELETE", FirebasePerformance.HttpMethod.OPTIONS, "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroRequestMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NitroRequestMethod[] $VALUES;
    private final int value;
    public static final NitroRequestMethod GET = new NitroRequestMethod("GET", 0, 0);
    public static final NitroRequestMethod HEAD = new NitroRequestMethod(FirebasePerformance.HttpMethod.HEAD, 1, 1);
    public static final NitroRequestMethod POST = new NitroRequestMethod("POST", 2, 2);
    public static final NitroRequestMethod PUT = new NitroRequestMethod("PUT", 3, 3);
    public static final NitroRequestMethod PATCH = new NitroRequestMethod("PATCH", 4, 4);
    public static final NitroRequestMethod DELETE = new NitroRequestMethod("DELETE", 5, 5);
    public static final NitroRequestMethod OPTIONS = new NitroRequestMethod(FirebasePerformance.HttpMethod.OPTIONS, 6, 6);

    private static final /* synthetic */ NitroRequestMethod[] $values() {
        return new NitroRequestMethod[]{GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS};
    }

    public static EnumEntries<NitroRequestMethod> getEntries() {
        return $ENTRIES;
    }

    private NitroRequestMethod(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        NitroRequestMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static NitroRequestMethod valueOf(String str) {
        return (NitroRequestMethod) Enum.valueOf(NitroRequestMethod.class, str);
    }

    public static NitroRequestMethod[] values() {
        return (NitroRequestMethod[]) $VALUES.clone();
    }
}

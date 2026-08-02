package ru.ozon.app.android.update;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateType;", "", "storeName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStoreName", "()Ljava/lang/String;", "RUSTORE", "GP", "INTERNAL", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppUpdateType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InAppUpdateType[] $VALUES;

    @NotNull
    private final String storeName;
    public static final InAppUpdateType RUSTORE = new InAppUpdateType("RUSTORE", 0, "RuStore");
    public static final InAppUpdateType GP = new InAppUpdateType("GP", 1, "GooglePlay");
    public static final InAppUpdateType INTERNAL = new InAppUpdateType("INTERNAL", 2, "Ozon");

    private static final /* synthetic */ InAppUpdateType[] $values() {
        return new InAppUpdateType[]{RUSTORE, GP, INTERNAL};
    }

    static {
        InAppUpdateType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private InAppUpdateType(String str, int i11, String str2) {
        this.storeName = str2;
    }

    public static InAppUpdateType valueOf(String str) {
        return (InAppUpdateType) Enum.valueOf(InAppUpdateType.class, str);
    }

    public static InAppUpdateType[] values() {
        return (InAppUpdateType[]) $VALUES.clone();
    }

    @NotNull
    public final String getStoreName() {
        return this.storeName;
    }
}

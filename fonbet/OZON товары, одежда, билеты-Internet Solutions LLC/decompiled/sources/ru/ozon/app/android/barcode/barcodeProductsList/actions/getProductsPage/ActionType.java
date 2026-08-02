package ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/ActionType;", "", "actionId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "APPEND_PRODUCTS", "REPLACE_PRODUCTS", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    public static final ActionType APPEND_PRODUCTS = new ActionType("APPEND_PRODUCTS", 0, "appendProducts");
    public static final ActionType REPLACE_PRODUCTS = new ActionType("REPLACE_PRODUCTS", 1, "replaceProducts");

    @NotNull
    private final String actionId;

    private static final /* synthetic */ ActionType[] $values() {
        return new ActionType[]{APPEND_PRODUCTS, REPLACE_PRODUCTS};
    }

    static {
        ActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ActionType(String str, int i11, String str2) {
        this.actionId = str2;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }

    @NotNull
    public final String getActionId() {
        return this.actionId;
    }
}

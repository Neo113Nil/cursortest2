package ru.ozon.app.android.account.orders.cancel;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/CancelOrderFlowActions;", "", "actionId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "CANCEL_ORDER", "GET_CANCEL_POSTINGS", "ACCEPT_E_POINTS", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelOrderFlowActions {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CancelOrderFlowActions[] $VALUES;

    @NotNull
    private final String actionId;
    public static final CancelOrderFlowActions CANCEL_ORDER = new CancelOrderFlowActions("CANCEL_ORDER", 0, "cancelOrders");
    public static final CancelOrderFlowActions GET_CANCEL_POSTINGS = new CancelOrderFlowActions("GET_CANCEL_POSTINGS", 1, "fetchCancelPostingsAction");
    public static final CancelOrderFlowActions ACCEPT_E_POINTS = new CancelOrderFlowActions("ACCEPT_E_POINTS", 2, "declineCancelPostings");

    private static final /* synthetic */ CancelOrderFlowActions[] $values() {
        return new CancelOrderFlowActions[]{CANCEL_ORDER, GET_CANCEL_POSTINGS, ACCEPT_E_POINTS};
    }

    static {
        CancelOrderFlowActions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CancelOrderFlowActions(String str, int i11, String str2) {
        this.actionId = str2;
    }

    public static CancelOrderFlowActions valueOf(String str) {
        return (CancelOrderFlowActions) Enum.valueOf(CancelOrderFlowActions.class, str);
    }

    public static CancelOrderFlowActions[] values() {
        return (CancelOrderFlowActions[]) $VALUES.clone();
    }

    @NotNull
    public final String getActionId() {
        return this.actionId;
    }
}

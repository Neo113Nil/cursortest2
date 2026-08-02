package ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$Result$ActionResult", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$Result$ActionResult;", "<init>", "(Ljava/lang/String;I)V", "SUCCEED", "FAILED", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectionProductEvent$Result$ActionResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SelectionProductEvent$Result$ActionResult[] $VALUES;
    public static final SelectionProductEvent$Result$ActionResult SUCCEED = new SelectionProductEvent$Result$ActionResult("SUCCEED", 0);
    public static final SelectionProductEvent$Result$ActionResult FAILED = new SelectionProductEvent$Result$ActionResult("FAILED", 1);

    private static final /* synthetic */ SelectionProductEvent$Result$ActionResult[] $values() {
        return new SelectionProductEvent$Result$ActionResult[]{SUCCEED, FAILED};
    }

    static {
        SelectionProductEvent$Result$ActionResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SelectionProductEvent$Result$ActionResult(String str, int i11) {
    }

    public static SelectionProductEvent$Result$ActionResult valueOf(String str) {
        return (SelectionProductEvent$Result$ActionResult) Enum.valueOf(SelectionProductEvent$Result$ActionResult.class, str);
    }

    public static SelectionProductEvent$Result$ActionResult[] values() {
        return (SelectionProductEvent$Result$ActionResult[]) $VALUES.clone();
    }
}

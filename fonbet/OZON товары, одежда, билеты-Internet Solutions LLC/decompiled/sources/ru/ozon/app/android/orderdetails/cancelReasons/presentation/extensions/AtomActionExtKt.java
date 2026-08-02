package ru.ozon.app.android.orderdetails.cancelReasons.presentation.extensions;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.models.SelectCancelReasonVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/orderdetails/cancelReasons/presentation/models/SelectCancelReasonVO;", "item", "", "comment", "addState", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/orderdetails/cancelReasons/presentation/models/SelectCancelReasonVO;Ljava/lang/String;)Lru/ozon/uni/atoms/af/AtomAction;", "", "addStateInParams", "(Ljava/util/Map;Lru/ozon/app/android/orderdetails/cancelReasons/presentation/models/SelectCancelReasonVO;Ljava/lang/String;)Ljava/util/Map;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AtomActionExtKt {
    @NotNull
    public static final AtomAction addState(@NotNull AtomAction atomAction, @NotNull SelectCancelReasonVO item, String str) {
        Intrinsics.checkNotNullParameter(atomAction, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        if (!(atomAction instanceof AtomAction.Click)) {
            return atomAction;
        }
        AtomAction.Click click = (AtomAction.Click) atomAction;
        return AtomAction.Click.copy$default(click, null, null, null, addStateInParams(click.getParams(), item, str), null, null, 55, null);
    }

    private static final Map<String, String> addStateInParams(Map<String, String> map, SelectCancelReasonVO selectCancelReasonVO, String str) {
        if (map == null) {
            map = U.c();
        }
        LinkedHashMap u11 = U.u(map);
        String state = selectCancelReasonVO.getState();
        if (state == null) {
            state = "";
        }
        u11.put("state", state);
        if (str != null) {
            u11.put("comment", str);
        }
        return u11;
    }
}

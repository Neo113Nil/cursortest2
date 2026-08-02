package ru.ozon.app.android.ui.switchingbutton.delegates;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ui.switchingbutton.SwitchingButtonAction;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"canHandle", "", "", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonActionDelegate;", "action", "Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchingButtonActionDelegateKt {
    public static final boolean canHandle(@NotNull Set<? extends SwitchingButtonActionDelegate> set, @NotNull SwitchingButtonAction action) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((SwitchingButtonActionDelegate) it.next()).canHandle(action)) {
                return true;
            }
        }
        return false;
    }
}

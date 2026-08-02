package ru.ozon.android.messenger.framework.presentation.chatlist.popup;

import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {
    public static final d a(@NotNull ru.ozon.android.messenger.framework.core.d dVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List<ComponentCallbacksC5392m> r02 = dVar.d().getChildFragmentManager().r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        Iterator<T> it = r02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ComponentCallbacksC5392m) obj) instanceof d) {
                break;
            }
        }
        if (obj instanceof d) {
            return (d) obj;
        }
        return null;
    }
}

package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;

/* loaded from: classes10.dex */
public final class n {
    public static final q a(@NotNull m mVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<T> it = mVar.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(r.d((q) obj), mVar.c())) {
                break;
            }
        }
        return (q) obj;
    }
}

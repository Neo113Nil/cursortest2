package ru.ozon.android.messenger.framework.presentation.chatlist;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i {
    public static final ru.ozon.android.messenger.blocks.chatGroups.grouplist.m a(@NotNull f fVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Iterator<T> it = fVar.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ru.ozon.android.messenger.framework.presentation.models.r.b((ru.ozon.android.messenger.framework.presentation.models.q) obj) instanceof ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) {
                break;
            }
        }
        ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
        if (qVar != null) {
            return (ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) ru.ozon.android.messenger.framework.presentation.models.r.c(qVar);
        }
        return null;
    }

    public static final String b(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        ru.ozon.android.messenger.blocks.chatGroups.grouplist.m a11 = a(fVar);
        if (a11 != null) {
            return a11.c();
        }
        return null;
    }
}

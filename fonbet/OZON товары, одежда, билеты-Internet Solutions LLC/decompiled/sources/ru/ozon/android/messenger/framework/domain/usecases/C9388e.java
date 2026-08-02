package ru.ozon.android.messenger.framework.domain.usecases;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.unreadline.UnreadDTO;
import ru.ozon.android.messenger.framework.domain.f;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9388e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89069a;

    public C9388e(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f89069a = repository;
    }

    @NotNull
    public final Pair a(@NotNull ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        kotlin.collections.C.h(items, C9387d.f89065b);
        Iterator it = items.iterator();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            ru.ozon.android.messenger.framework.presentation.models.s f7 = ru.ozon.android.messenger.framework.presentation.models.r.f((ru.ozon.android.messenger.framework.presentation.models.q) it.next());
            if (f7 != null && f7.t()) {
                break;
            }
            i11++;
        }
        Integer valueOf = i11 == -1 ? null : Integer.valueOf(i11);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            int i12 = intValue - 1;
            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) C7714v.Q(i12, items);
            if ((qVar != null ? ru.ozon.android.messenger.framework.presentation.models.r.b(qVar) : null) instanceof ru.ozon.android.messenger.blocks.date.a) {
                intValue = i12;
            }
            items.add(intValue, this.f89069a.z(f.b.UNREAD, new UnreadDTO()));
            z11 = true;
        }
        return new Pair(items, Boolean.valueOf(z11));
    }
}

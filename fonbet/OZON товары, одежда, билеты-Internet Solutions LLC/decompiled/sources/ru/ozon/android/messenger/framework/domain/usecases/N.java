package ru.ozon.android.messenger.framework.domain.usecases;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class N extends AbstractC7737t implements Function1<List<? extends ru.ozon.android.messenger.framework.presentation.models.q>, List<? extends ru.ozon.android.messenger.framework.presentation.models.q>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f88994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        super(1);
        this.f88994b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends ru.ozon.android.messenger.framework.presentation.models.q> invoke(List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<? extends ru.ozon.android.messenger.framework.presentation.models.q> items = list;
        Intrinsics.checkNotNullParameter(items, "items");
        List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list2 = items;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (ru.ozon.android.messenger.framework.presentation.models.r.b((ru.ozon.android.messenger.framework.presentation.models.q) it.next()) instanceof ru.ozon.android.messenger.blocks.alert.g) {
                    return items;
                }
            }
        }
        return C7714v.q0(this.f88994b, items);
    }
}

package ru.ozon.android.messenger.framework.domain.usecases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.controller.d;

/* loaded from: classes10.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f88952a;

    public B(@NotNull ru.ozon.android.messenger.framework.data.b blockStore) {
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        this.f88952a = blockStore;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.q a(@NotNull d.w updateEvent, @NotNull ru.ozon.android.messenger.framework.presentation.models.q item) {
        Object obj;
        Intrinsics.checkNotNullParameter(updateEvent, "updateEvent");
        Intrinsics.checkNotNullParameter(item, "item");
        List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = item.b();
        ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
        Iterator<T> it = b11.iterator();
        while (true) {
            ru.ozon.android.messenger.framework.presentation.models.u uVar = null;
            if (!it.hasNext()) {
                return ru.ozon.android.messenger.framework.presentation.models.q.a(item, arrayList, null, 2);
            }
            ru.ozon.android.messenger.framework.presentation.models.u uVar2 = (ru.ozon.android.messenger.framework.presentation.models.u) it.next();
            d.w.a a11 = updateEvent.a();
            List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> b12 = this.f88952a.b(uVar2.e());
            if (b12 != null) {
                Iterator<T> it2 = b12.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    List<Class<? extends d.w.a>> supportedUpdateKeys = ((ru.ozon.android.messenger.framework.core.viewmapper.d) obj).getSupportedUpdateKeys();
                    if ((supportedUpdateKeys != null ? Boolean.valueOf(supportedUpdateKeys.contains(a11.getClass())) : null) != null) {
                        break;
                    }
                }
                ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj;
                if (dVar != null) {
                    if (dVar.getUpdateConsumer() == null) {
                        dVar = null;
                    }
                    if (dVar != null) {
                        try {
                            Function2 updateConsumer = dVar.getUpdateConsumer();
                            ru.ozon.android.messenger.framework.presentation.models.g gVar = updateConsumer != null ? (ru.ozon.android.messenger.framework.presentation.models.g) updateConsumer.invoke(a11, uVar2.c()) : null;
                            if (gVar != null) {
                                uVar = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar2, gVar);
                            }
                        } catch (Exception e11) {
                            Lm0.a.f17149a.w(e11, "Map Widget update error for " + kotlin.jvm.internal.N.b(uVar2.c().getClass()) + ", id: " + ru.ozon.android.messenger.framework.presentation.models.v.a(uVar2) + "]", new Object[0]);
                        }
                    }
                }
            }
            if (uVar != null) {
                uVar2 = uVar;
            }
            arrayList.add(uVar2);
        }
    }

    @NotNull
    public final ArrayList b(@NotNull d.w updateEvent, @NotNull List items) {
        Intrinsics.checkNotNullParameter(updateEvent, "updateEvent");
        Intrinsics.checkNotNullParameter(items, "items");
        List list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(updateEvent, (ru.ozon.android.messenger.framework.presentation.models.q) it.next()));
        }
        return arrayList;
    }
}

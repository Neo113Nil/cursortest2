package ru.ozon.android.messenger.blocks.ai.aiMessageActions;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.c;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.f;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.models.h;

/* loaded from: classes10.dex */
public final class b implements Function2<d.w.a, f, f> {
    @Override // kotlin.jvm.functions.Function2
    public final f invoke(d.w.a aVar, f fVar) {
        Boolean bool;
        d.w.a update = aVar;
        f vo = fVar;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(vo, "vo");
        if (update instanceof c.a.b) {
            c.a.b bVar = (c.a.b) update;
            if (Intrinsics.d(bVar.a(), h.b(vo))) {
                List<f.a> b11 = vo.b();
                ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
                for (f.a aVar2 : b11) {
                    if (aVar2.g()) {
                        if (aVar2.d() == bVar.b()) {
                            bool = aVar2.f() != null ? Boolean.valueOf(!r4.booleanValue()) : null;
                        } else {
                            bool = Boolean.FALSE;
                        }
                        aVar2 = f.a.a(aVar2, bool);
                    }
                    arrayList.add(aVar2);
                }
                return f.a(vo, arrayList);
            }
        }
        return null;
    }
}

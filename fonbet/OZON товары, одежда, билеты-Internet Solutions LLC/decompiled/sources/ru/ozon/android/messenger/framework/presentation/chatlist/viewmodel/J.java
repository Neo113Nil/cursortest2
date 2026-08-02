package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.controller.d;

/* loaded from: classes10.dex */
final class J extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9509v f90581b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.d f90582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(C9509v c9509v, ru.ozon.android.messenger.framework.navigation.controller.d dVar) {
        super(1);
        this.f90581b = c9509v;
        this.f90582c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        ru.ozon.android.messenger.framework.domain.usecases.B b11;
        ru.ozon.android.messenger.framework.domain.usecases.B b12;
        ru.ozon.android.messenger.framework.domain.usecases.B b13;
        ru.ozon.android.messenger.framework.domain.usecases.B b14;
        ru.ozon.android.messenger.framework.presentation.chatlist.f state = fVar;
        Intrinsics.checkNotNullParameter(state, "state");
        C9509v c9509v = this.f90581b;
        b11 = c9509v.f90699g;
        d.w wVar = (d.w) this.f90582c;
        ArrayList b15 = b11.b(wVar, state.k());
        b12 = c9509v.f90699g;
        ArrayList b16 = b12.b(wVar, state.f());
        b13 = c9509v.f90699g;
        ArrayList b17 = b13.b(wVar, state.h());
        Map<Integer, ru.ozon.android.messenger.framework.presentation.models.q> b18 = state.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.U.h(b18.size()));
        Iterator<T> it = b18.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            b14 = c9509v.f90699g;
            linkedHashMap.put(key, b14.a(wVar, (ru.ozon.android.messenger.framework.presentation.models.q) entry.getValue()));
        }
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(state, b15, b16, linkedHashMap, null, null, null, b17, null, null, 1912);
    }
}

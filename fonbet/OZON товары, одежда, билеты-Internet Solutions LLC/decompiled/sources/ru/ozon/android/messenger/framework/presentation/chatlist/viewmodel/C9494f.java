package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9494f extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f90625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9494f(String str) {
        super(1);
        this.f90625b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        ru.ozon.android.messenger.framework.presentation.chatlist.f state = fVar;
        Intrinsics.checkNotNullParameter(state, "state");
        List<ru.ozon.android.messenger.framework.presentation.models.q> k11 = state.k();
        String str = this.f90625b;
        ArrayList f7 = ru.ozon.android.messenger.utils.b.f(k11, new C9493e(str));
        List<ru.ozon.android.messenger.framework.presentation.models.q> f11 = state.f();
        List<ru.ozon.android.messenger.framework.presentation.models.q> f12 = state.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f12) {
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) obj), str)) {
                arrayList.add(obj);
            }
        }
        List l02 = C7714v.l0(f11, C7714v.Y0(arrayList));
        Map<Integer, ru.ozon.android.messenger.framework.presentation.models.q> b11 = state.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, ru.ozon.android.messenger.framework.presentation.models.q> entry : b11.entrySet()) {
            if (!Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(entry.getValue()), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List<ru.ozon.android.messenger.framework.presentation.models.q> h11 = state.h();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : h11) {
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) obj2), str)) {
                arrayList2.add(obj2);
            }
        }
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(state, f7, l02, linkedHashMap, null, null, null, arrayList2, null, null, 1912);
    }
}

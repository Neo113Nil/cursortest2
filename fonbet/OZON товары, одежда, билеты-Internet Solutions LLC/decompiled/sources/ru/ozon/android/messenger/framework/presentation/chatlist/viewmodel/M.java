package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.ArrayList;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class M extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.d f90585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(ru.ozon.android.messenger.framework.navigation.controller.d dVar) {
        super(1);
        this.f90585b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        ru.ozon.android.messenger.framework.presentation.chatlist.f state = fVar;
        Intrinsics.checkNotNullParameter(state, "state");
        ArrayList W02 = C7714v.W0(state.f());
        final L l11 = new L(this.f90585b);
        W02.removeIf(new Predicate() { // from class: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.K
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) Function1.this.invoke(obj)).booleanValue();
            }
        });
        Unit unit = Unit.f71690a;
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(state, null, W02, null, null, null, null, null, null, null, 2045);
    }
}

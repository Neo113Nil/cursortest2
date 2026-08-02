package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9493e extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f90624b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9493e(String str) {
        super(1);
        this.f90624b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> transform = list;
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        kotlin.collections.C.h(transform, new C9492d(this.f90624b));
        return Unit.f71690a;
    }
}

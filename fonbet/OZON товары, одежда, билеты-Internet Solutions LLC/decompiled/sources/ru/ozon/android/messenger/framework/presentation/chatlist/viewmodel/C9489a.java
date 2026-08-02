package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9489a extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9490b f90615b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90616c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9489a(C9490b c9490b, ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        super(1);
        this.f90615b = c9490b;
        this.f90616c = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> transform = list;
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        C9490b.j(this.f90615b, transform, this.f90616c);
        return Unit.f71690a;
    }
}

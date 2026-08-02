package ru.ozon.android.messenger.blocks.showTextButton;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.showTextButton.a;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<a, Unit> f86390b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f86391c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    d(Function1<? super a, Unit> function1, k kVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f86390b = function1;
        this.f86391c = kVar;
        this.f86392d = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        CommonControlSettings common = this.f86391c.b().getCommon();
        this.f86390b.invoke(new a.C1530a(ru.ozon.android.messenger.framework.navigation.action.b.e(action, common != null ? common.getAction() : null, 2), this.f86392d));
        return Unit.f71690a;
    }
}

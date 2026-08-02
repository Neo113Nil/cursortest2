package ru.ozon.android.messenger.blocks.cell;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.messenger.databinding.MOnlyNewBlockCellBinding;
import ru.ozon.uni.android.controls.chip.ChipView;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f84474b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MOnlyNewBlockCellBinding f84475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, MOnlyNewBlockCellBinding mOnlyNewBlockCellBinding) {
        super(0);
        this.f84474b = gVar;
        this.f84475c = mOnlyNewBlockCellBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        g.b(this.f84474b, true);
        MOnlyNewBlockCellBinding mOnlyNewBlockCellBinding = this.f84475c;
        ChipView allChats = mOnlyNewBlockCellBinding.allChats;
        Intrinsics.checkNotNullExpressionValue(allChats, "allChats");
        g.d(allChats, false);
        ChipView onlyNewChats = mOnlyNewBlockCellBinding.onlyNewChats;
        Intrinsics.checkNotNullExpressionValue(onlyNewChats, "onlyNewChats");
        g.d(onlyNewChats, true);
        return Unit.f71690a;
    }
}

package ru.ozon.android.messenger.blocks.cell;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.messenger.databinding.MOnlyNewBlockCellBinding;
import ru.ozon.uni.android.controls.chip.ChipView;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f84472b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MOnlyNewBlockCellBinding f84473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, MOnlyNewBlockCellBinding mOnlyNewBlockCellBinding) {
        super(0);
        this.f84472b = gVar;
        this.f84473c = mOnlyNewBlockCellBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        g.b(this.f84472b, false);
        MOnlyNewBlockCellBinding mOnlyNewBlockCellBinding = this.f84473c;
        ChipView allChats = mOnlyNewBlockCellBinding.allChats;
        Intrinsics.checkNotNullExpressionValue(allChats, "allChats");
        g.d(allChats, true);
        ChipView onlyNewChats = mOnlyNewBlockCellBinding.onlyNewChats;
        Intrinsics.checkNotNullExpressionValue(onlyNewChats, "onlyNewChats");
        g.d(onlyNewChats, false);
        return Unit.f71690a;
    }
}

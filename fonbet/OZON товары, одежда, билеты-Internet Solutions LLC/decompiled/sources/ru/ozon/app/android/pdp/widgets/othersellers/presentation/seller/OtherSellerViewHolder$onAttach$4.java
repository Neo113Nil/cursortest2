package ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OtherSellerViewHolder$onAttach$4 extends AbstractC7737t implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {
    public static final OtherSellerViewHolder$onAttach$4 INSTANCE = new OtherSellerViewHolder$onAttach$4();

    OtherSellerViewHolder$onAttach$4() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Pair<Boolean, Boolean> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.f();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
        return invoke2((Pair<Boolean, Boolean>) pair);
    }
}

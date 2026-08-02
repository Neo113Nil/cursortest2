package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import m0.C7980b;
import m0.C8008p;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll1/Z;", "invoke-0d7_KjU", "()J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$1$1$1 extends AbstractC7737t implements Function0<C7807Z> {
    final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
    final /* synthetic */ long $dislikeColor;
    final /* synthetic */ long $likeColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$1$1$1(C7980b<Float, C8008p> c7980b, long j11, long j12) {
        super(0);
        this.$bottomLightFraction = c7980b;
        this.$likeColor = j11;
        this.$dislikeColor = j12;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C7807Z invoke() {
        return C7807Z.m(m811invoke0d7_KjU());
    }

    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
    public final long m811invoke0d7_KjU() {
        return this.$bottomLightFraction.k().floatValue() > 0.0f ? this.$likeColor : this.$dislikeColor;
    }
}

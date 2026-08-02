package ru.ozon.uni.foundation.components.checkbox;

import J1.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.C7770n;
import l0.N;
import l0.r;
import ru.ozon.uni.foundation.utils.AnimationFactory;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll0/r;", "Lkotlin/Pair;", "LJ1/a;", "", "Ll0/N;", "invoke", "(Ll0/r;)Ll0/N;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class FoundationCheckboxKt$FoundationCheckbox$1$1$1 extends AbstractC7737t implements Function1<r<Pair<? extends a, ? extends Integer>>, N> {
    public static final FoundationCheckboxKt$FoundationCheckbox$1$1$1 INSTANCE = new FoundationCheckboxKt$FoundationCheckbox$1$1$1();

    FoundationCheckboxKt$FoundationCheckbox$1$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ N invoke(r<Pair<? extends a, ? extends Integer>> rVar) {
        return invoke2((r<Pair<a, Integer>>) rVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final N invoke2(r<Pair<a, Integer>> AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        AnimationFactory animationFactory = AnimationFactory.INSTANCE;
        return C7770n.c(animationFactory.animShowIcon$uni_release(), animationFactory.animHideIcon$uni_release());
    }
}

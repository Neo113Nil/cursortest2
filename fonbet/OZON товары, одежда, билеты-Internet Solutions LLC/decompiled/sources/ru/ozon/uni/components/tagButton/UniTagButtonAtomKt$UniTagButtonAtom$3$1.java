package ru.ozon.uni.components.tagButton;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniTagButtonAtomKt$UniTagButtonAtom$3$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ TagButtonDTO $dto;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isSelected$delegate;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniTagButtonAtomKt$UniTagButtonAtom$3$1(Function0<Unit> function0, TagButtonDTO tagButtonDTO, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(0);
        this.$onClick = function0;
        this.$dto = tagButtonDTO;
        this.$isSelected$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean UniTagButtonAtom$lambda$2;
        Function0<Unit> function0 = this.$onClick;
        if (function0 != null) {
            function0.invoke();
        }
        if (Intrinsics.d(this.$dto.isStateChangeDisabled(), Boolean.TRUE)) {
            return;
        }
        InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$isSelected$delegate;
        UniTagButtonAtom$lambda$2 = UniTagButtonAtomKt.UniTagButtonAtom$lambda$2(interfaceC3978p0);
        UniTagButtonAtomKt.UniTagButtonAtom$lambda$3(interfaceC3978p0, !UniTagButtonAtom$lambda$2);
    }
}

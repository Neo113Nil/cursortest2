package ru.ozon.uni.ozi.utils;

import androidx.compose.ui.platform.C5242e1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Incorrect field signature: TT; */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/e1;", "", "invoke", "(Landroidx/compose/ui/platform/e1;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziTestTagsKt$oziTestTag$1$1 extends AbstractC7737t implements Function1<C5242e1, Unit> {
    final /* synthetic */ Map<OziTestTagParameter<T>, String> $customInfo;
    final /* synthetic */ Enum $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;Ljava/util/Map<Lru/ozon/uni/ozi/utils/OziTestTagParameter<TT;>;Ljava/lang/String;>;)V */
    OziTestTagsKt$oziTestTag$1$1(Enum r12, Map map) {
        super(1);
        this.$tag = r12;
        this.$customInfo = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C5242e1 c5242e1) {
        invoke2(c5242e1);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C5242e1 OziTestTagElement) {
        Intrinsics.checkNotNullParameter(OziTestTagElement, "$this$OziTestTagElement");
        OziTestTagElement.getClass();
        OziTestTagElement.a().b(this.$tag.name(), "tag");
        OziTestTagElement.a().b(this.$customInfo.toString(), "customInfo");
    }
}

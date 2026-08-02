package ru.ozon.app.android.pdp.widgets.tabs.compose;

import WZ.t;
import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class PdpTabsComposableKt$PdpTabsContent$2$1$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ PdpTabsVO $item;
    final /* synthetic */ Function1<PdpTabsVO.Tab, Unit> $onTabClick;
    final /* synthetic */ Function1<t, Unit> $onView;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$Tab;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposableKt$PdpTabsContent$2$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<PdpTabsVO.Tab, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(PdpTabsVO.Tab it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Long.valueOf(it.getText().getText().hashCode());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PdpTabsComposableKt$PdpTabsContent$2$1$1(PdpTabsVO pdpTabsVO, Function1<? super PdpTabsVO.Tab, Unit> function1, Function1<? super t, Unit> function12) {
        super(1);
        this.$item = pdpTabsVO;
        this.$onTabClick = function1;
        this.$onView = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<PdpTabsVO.Tab> tabs = this.$item.getTabs();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        Function1<PdpTabsVO.Tab, Unit> function1 = this.$onTabClick;
        Function1<t, Unit> function12 = this.$onView;
        LazyRow.a(tabs.size(), anonymousClass1 != null ? new PdpTabsComposableKt$PdpTabsContent$2$1$1$invoke$$inlined$items$default$2(anonymousClass1, tabs) : null, new PdpTabsComposableKt$PdpTabsContent$2$1$1$invoke$$inlined$items$default$3(PdpTabsComposableKt$PdpTabsContent$2$1$1$invoke$$inlined$items$default$1.INSTANCE, tabs), new C4912a(true, -632812321, new PdpTabsComposableKt$PdpTabsContent$2$1$1$invoke$$inlined$items$default$4(tabs, function1, function12)));
    }
}

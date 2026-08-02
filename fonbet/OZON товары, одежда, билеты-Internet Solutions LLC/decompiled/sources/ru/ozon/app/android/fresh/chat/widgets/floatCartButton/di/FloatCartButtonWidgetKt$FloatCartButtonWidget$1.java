package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di;

import d00.C6018d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.core.FloatCartButtonConfigKt;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.core.FloatCartButtonViewMapperKt;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.data.FloatCartButtonDTO;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonDIComponent;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/data/FloatCartButtonDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FloatCartButtonWidgetKt$FloatCartButtonWidget$1 extends AbstractC7737t implements Function1<C6018d<FloatCartButtonDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatCartButtonWidgetKt$FloatCartButtonWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<FloatCartButtonDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<FloatCartButtonDTO> FreshComposeWidget) {
        Intrinsics.checkNotNullParameter(FreshComposeWidget, "$this$FreshComposeWidget");
        FloatCartButtonConfigKt.floatCartButtonConfig(FreshComposeWidget, this.$jsonDeserializer);
        final FloatCartButtonDIComponent.Companion companion = FloatCartButtonDIComponent.INSTANCE;
        FreshComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonWidgetKt$FloatCartButtonWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return FloatCartButtonDIComponent.Companion.this.create(it);
            }
        });
        FloatCartButtonViewMapperKt.floatCartViewMapper(FreshComposeWidget);
    }
}

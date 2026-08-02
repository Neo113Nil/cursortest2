package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.core;

import j20.C7244b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.data.FloatCartButtonDTO;
import ru.ozon.composer.compose.widget.config.b;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/data/FloatCartButtonDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FloatCartButtonConfigKt$floatCartButtonConfig$1 extends AbstractC7737t implements Function1<b<FloatCartButtonDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/data/FloatCartButtonDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/data/FloatCartButtonDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.core.FloatCartButtonConfigKt$floatCartButtonConfig$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7244b, FloatCartButtonDTO> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FloatCartButtonDTO invoke(C7244b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (FloatCartButtonDTO) this.$jsonDeserializer.fromJson(it.b(), FloatCartButtonDTO.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatCartButtonConfigKt$floatCartButtonConfig$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(b<FloatCartButtonDTO> bVar) {
        invoke2(bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(b<FloatCartButtonDTO> config) {
        Intrinsics.checkNotNullParameter(config, "$this$config");
        b.j(config, null, new AnonymousClass1(this.$jsonDeserializer), 1, null);
    }
}

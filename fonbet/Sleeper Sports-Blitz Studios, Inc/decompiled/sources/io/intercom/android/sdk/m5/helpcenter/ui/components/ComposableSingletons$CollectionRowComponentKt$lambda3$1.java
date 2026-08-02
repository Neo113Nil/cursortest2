package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionRowComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionRowComponentKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$CollectionRowComponentKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CollectionRowComponentKt$lambda3$1 INSTANCE = new ComposableSingletons$CollectionRowComponentKt$lambda3$1();

    ComposableSingletons$CollectionRowComponentKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            CollectionRowComponentKt.CollectionRowComponent(new CollectionRowData("", "Lorem Ipsum Dolor Sit", 0, "", 3, 2), new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionRowComponentKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$CollectionRowComponentKt$lambda3$1.invoke$lambda$0((String) obj);
                    return invoke$lambda$0;
                }
            }, null, composer, 48, 4);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

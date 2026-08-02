package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaPickerButton.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$MediaPickerButtonKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda3$1();

    ComposableSingletons$MediaPickerButtonKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            MediaPickerButtonKt.MediaPickerButton(1, null, null, null, new Function1() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$MediaPickerButtonKt$lambda3$1.invoke$lambda$0((List) obj);
                    return invoke$lambda$0;
                }
            }, new MediaPickerButtonCTAStyle.TextButton("Open Picker"), null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m12900getLambda2$intercom_sdk_ui_release(), composer, 12607494, 78);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

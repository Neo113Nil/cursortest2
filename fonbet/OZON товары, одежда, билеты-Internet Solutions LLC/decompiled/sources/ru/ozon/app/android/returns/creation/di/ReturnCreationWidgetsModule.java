package ru.ozon.app.android.returns.creation.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.ReturnCreationPhotoPickerPerImageTypeWidgetKt;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedWidgetKt;
import ru.ozon.app.android.returns.creation.widgets.stepProgress.StepProgressComposeWidgetKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/creation/di/ReturnCreationWidgetsModule;", "", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "", "Ln20/i;", "provideComposeWidgets", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationWidgetsModule {
    @NotNull
    public final Set<i> provideComposeWidgets(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {StepProgressComposeWidgetKt.returnCreationStepProgressComposeWidget(jsonDeserializer), ReturnCreationPhotoPickerPerImageTypeWidgetKt.returnCreationPhotoPickerPerImageType(jsonDeserializer), ReturnCreationPhotoPickerUnifiedWidgetKt.returnCreationPhotoPickerUnifiedWidget(jsonDeserializer)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}

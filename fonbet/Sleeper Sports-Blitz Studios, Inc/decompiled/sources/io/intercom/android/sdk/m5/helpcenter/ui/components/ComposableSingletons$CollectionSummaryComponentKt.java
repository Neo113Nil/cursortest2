package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.helpcenter.sections.Avatar;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: CollectionSummaryComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$CollectionSummaryComponentKt {
    public static final ComposableSingletons$CollectionSummaryComponentKt INSTANCE = new ComposableSingletons$CollectionSummaryComponentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f258lambda1 = ComposableLambdaKt.composableLambdaInstance(309452486, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionSummaryComponentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                CollectionSummaryComponentKt.CollectionSummaryComponent(new CollectionDetailsUiState.Content("123456", "Recording videos", "How to set up screen and camera recording through our app or Chrome extension.", 5, CollectionsKt.listOf((Object[]) new Author[]{new Author("", "Hannah", new Avatar("", "SK")), new Author("", "Bob", new Avatar("", "PS")), new Author("", "Anna", new Avatar("", "VR"))}), CollectionsKt.emptyList()), null, composer, 8, 2);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12456getLambda1$intercom_sdk_base_release() {
        return f258lambda1;
    }
}

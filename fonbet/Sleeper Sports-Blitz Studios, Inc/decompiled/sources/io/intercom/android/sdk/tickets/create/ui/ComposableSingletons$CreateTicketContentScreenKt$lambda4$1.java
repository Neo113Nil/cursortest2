package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTicketContentScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda4$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda4$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            CreateTicketContentScreenKt.CreateTicketScreen(new CreateTicketViewModel.CreateTicketFormUiState.Error(new ErrorState.WithCTA(0, 0, null, R.string.intercom_reload, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, 7, null)), new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-4$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-4$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-4$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-4$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4;
                    invoke$lambda$4 = ComposableSingletons$CreateTicketContentScreenKt$lambda4$1.invoke$lambda$4((String) obj);
                    return invoke$lambda$4;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-4$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5;
                    invoke$lambda$5 = ComposableSingletons$CreateTicketContentScreenKt$lambda4$1.invoke$lambda$5((AnswerClickData) obj);
                    return invoke$lambda$5;
                }
            }, composer, 224688);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(AnswerClickData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

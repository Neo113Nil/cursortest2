package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTicketContentScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda2$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        List list;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            list = CreateTicketContentScreenKt.questions;
            CreateTicketContentScreenKt.CreateTicketContentScreen(null, new CreateTicketViewModel.CreateTicketFormUiState.Content("All form attribute types", list, false, true), new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-2$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2;
                    invoke$lambda$2 = ComposableSingletons$CreateTicketContentScreenKt$lambda2$1.invoke$lambda$2((String) obj);
                    return invoke$lambda$2;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-2$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3;
                    invoke$lambda$3 = ComposableSingletons$CreateTicketContentScreenKt$lambda2$1.invoke$lambda$3((AnswerClickData) obj);
                    return invoke$lambda$3;
                }
            }, composer, 224704, 1);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(AnswerClickData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

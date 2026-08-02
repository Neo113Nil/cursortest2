package ru.ozon.android.messenger.framework.composer.widgets.di;

import B0.S1;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.StatusWidgetKt;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core.p;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core.q;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core.j;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core.k;

/* loaded from: classes10.dex */
public final class e implements Jb.e<Set<n20.i>> {
    public static Set<n20.i> a(S1 s12, JsonParser deserializer, ru.ozon.android.messenger.framework.composer.navigation.router.a navigator, k fastAnswersListWidgetMapper, ru.ozon.android.messenger.framework.data.remote.serialize.a messengerNavBarMapper, q fastAnswerTemplateEditorWidgetMapper, ru.ozon.android.messenger.framework.domain.repository.a actionRepository, ActionHandlersFactory actionHandlersFactory, ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core.a reportAbuseFormWidgetMapper, ru.ozon.android.messenger.framework.analytics.i iVar, ru.ozon.android.messenger.framework.navigation.controller.a messengerController) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(fastAnswersListWidgetMapper, "fastAnswersListWidgetMapper");
        Intrinsics.checkNotNullParameter(messengerNavBarMapper, "messengerNavBarMapper");
        Intrinsics.checkNotNullParameter(fastAnswerTemplateEditorWidgetMapper, "fastAnswerTemplateEditorWidgetMapper");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        Intrinsics.checkNotNullParameter(reportAbuseFormWidgetMapper, "reportAbuseFormWidgetMapper");
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        n20.i[] elements = {ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.core.i.a(deserializer, messengerNavBarMapper, navigator), j.a(deserializer, fastAnswersListWidgetMapper, navigator, actionRepository), p.a(deserializer, fastAnswerTemplateEditorWidgetMapper, navigator, actionRepository), StatusWidgetKt.StatusWidget(new c(deserializer), new d(actionHandlersFactory)), ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core.p.a(deserializer, iVar, navigator, reportAbuseFormWidgetMapper, actionRepository, messengerController), new b(n20.j.b(), deserializer, actionHandlersFactory)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set<n20.i> j02 = C7705l.j0(elements);
        Jb.j.d(j02);
        return j02;
    }
}

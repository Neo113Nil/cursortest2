package ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.core.PromptSuggestionsConfig;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.core.PromptSuggestionsViewMapper;

/* loaded from: classes6.dex */
public final class PromptSuggestionsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(PromptSuggestionsConfig promptSuggestionsConfig, PromptSuggestionsViewMapper promptSuggestionsViewMapper) {
        Widget2 provideWidget = PromptSuggestionsWidgetModule.INSTANCE.provideWidget(promptSuggestionsConfig, promptSuggestionsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}

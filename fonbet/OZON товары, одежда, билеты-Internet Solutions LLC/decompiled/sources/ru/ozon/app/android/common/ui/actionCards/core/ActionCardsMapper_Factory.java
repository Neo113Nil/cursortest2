package ru.ozon.app.android.common.ui.actionCards.core;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.common.ui.actionCards.ButtonMeasurer;

/* loaded from: classes11.dex */
public final class ActionCardsMapper_Factory implements e<ActionCardsMapper> {
    private final a<ButtonMeasurer> buttonMeasurerProvider;

    public ActionCardsMapper_Factory(a<ButtonMeasurer> aVar) {
        this.buttonMeasurerProvider = aVar;
    }

    public static ActionCardsMapper_Factory create(a<ButtonMeasurer> aVar) {
        return new ActionCardsMapper_Factory(aVar);
    }

    public static ActionCardsMapper newInstance(ButtonMeasurer buttonMeasurer) {
        return new ActionCardsMapper(buttonMeasurer);
    }

    @Override // Pc.a
    public ActionCardsMapper get() {
        return newInstance(this.buttonMeasurerProvider.get());
    }
}

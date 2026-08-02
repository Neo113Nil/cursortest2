package ru.ozon.app.android.common.ui.actionCards;

import Jb.e;
import Pc.a;
import android.content.Context;

/* loaded from: classes11.dex */
public final class ButtonMeasurer_Factory implements e<ButtonMeasurer> {
    private final a<Context> contextProvider;

    public ButtonMeasurer_Factory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static ButtonMeasurer_Factory create(a<Context> aVar) {
        return new ButtonMeasurer_Factory(aVar);
    }

    public static ButtonMeasurer newInstance(Context context) {
        return new ButtonMeasurer(context);
    }

    @Override // Pc.a
    public ButtonMeasurer get() {
        return newInstance(this.contextProvider.get());
    }
}

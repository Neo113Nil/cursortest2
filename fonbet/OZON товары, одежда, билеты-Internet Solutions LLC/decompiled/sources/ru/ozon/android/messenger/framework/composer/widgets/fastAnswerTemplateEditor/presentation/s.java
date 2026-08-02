package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Q1.K;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ButtonV3DTO f86920a;

    static {
        new y(true, "Сообщение покупателю", "До 7 товаров", "Быстрый ответ не может быть пустым", new K(6, 0L, "8000"), 100, 1);
        ButtonV3DTO buttonV3DTO = new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, ButtonV3DTO.Sizes.SIZE_500, "Сохранить", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262136, null);
        f86920a = buttonV3DTO;
        new t(0L, new y(true, "Сообщение покупателю", "До 7 товаров", "Быстрый ответ не может быть пустым", new K(6, 0L, "8000"), 100, 1), buttonV3DTO);
    }

    @NotNull
    public static ButtonV3DTO a() {
        return f86920a;
    }
}

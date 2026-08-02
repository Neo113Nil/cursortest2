package ru.ozon.android.messenger.framework.presentation.mappers;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.models.m;
import ru.ozon.android.messenger.framework.presentation.models.y;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
public final class a {
    private static Object a(String str, Map map) {
        Object obj = map.get(str);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(("Unable to cast parameter with key " + str + " to required type").toString());
    }

    @NotNull
    public static y b(AtomAction atomAction) {
        AtomAction.Click click = atomAction instanceof AtomAction.Click ? (AtomAction.Click) atomAction : null;
        if (click == null) {
            throw new IllegalStateException(("Unable to map report content from " + atomAction).toString());
        }
        Map<String, String> params = click.getParams();
        if (params != null) {
            return new y((String) a("text_report_title", params), (String) a("text_report_message", params), (String) a("text_report_confirm_button", params), new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, ((AtomAction.Click) atomAction).getLink(), d.REPORT.a(), U.j(new Pair("chat_guid", a("chat_guid", params)), new Pair("company_id", a("company_id", params)))), new m((String) a("text_report_success_message", params), R$drawable.ic_m_confirmed, "text_positive"), new m((String) a("text_report_error_message", params), R$drawable.ic_m_exclamation, "text_negative"));
        }
        throw new IllegalStateException(("Unable to map params to " + N.b(y.class).B()).toString());
    }
}

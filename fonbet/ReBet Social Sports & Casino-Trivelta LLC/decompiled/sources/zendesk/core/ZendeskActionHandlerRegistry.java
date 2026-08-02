package zendesk.core;

import androidx.annotation.NonNull;
import com.google.gson.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kd.InterfaceC5251a;

/* loaded from: classes5.dex */
class ZendeskActionHandlerRegistry implements ActionHandlerRegistry {
    private static final Comparator<ActionHandler> PRIORITY_ACTION_HANDLER_COMPARATOR = new Comparator<ActionHandler>() { // from class: zendesk.core.ZendeskActionHandlerRegistry.2
        @Override // java.util.Comparator
        public int compare(ActionHandler actionHandler, ActionHandler actionHandler2) {
            return actionHandler2.getPriority() - actionHandler.getPriority();
        }
    };
    private List<ActionHandler> registry = new ArrayList();

    @Override // zendesk.core.ActionHandlerRegistry
    public void add(@NonNull ActionHandler actionHandler) {
        if (actionHandler == null) {
            return;
        }
        this.registry.add(actionHandler);
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void clear() {
        this.registry.clear();
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public ActionHandler handlerByAction(@NonNull String str) {
        if (com.zendesk.util.d.c(str)) {
            return null;
        }
        ArrayList<ActionHandler> arrayList = new ArrayList(this.registry);
        Collections.sort(arrayList, PRIORITY_ACTION_HANDLER_COMPARATOR);
        for (ActionHandler actionHandler : arrayList) {
            if (actionHandler.canHandle(str)) {
                return actionHandler;
            }
        }
        return null;
    }

    @Override // zendesk.core.ActionHandlerRegistry
    @NonNull
    public List<ActionHandler> handlersByAction(@NonNull final String str) {
        if (com.zendesk.util.d.c(str)) {
            return Collections.EMPTY_LIST;
        }
        List<ActionHandler> d10 = com.zendesk.util.a.d(this.registry, new InterfaceC5251a() { // from class: zendesk.core.ZendeskActionHandlerRegistry.1
            @Override // kd.InterfaceC5251a
            public Boolean apply(ActionHandler actionHandler) {
                return Boolean.valueOf(actionHandler.canHandle(str));
            }
        });
        Collections.sort(d10, PRIORITY_ACTION_HANDLER_COMPARATOR);
        return d10;
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void remove(@NonNull ActionHandler actionHandler) {
        if (actionHandler == null) {
            return;
        }
        this.registry.remove(actionHandler);
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void updateSettings(Map<String, h> map) {
        for (ActionHandler actionHandler : this.registry) {
            if (actionHandler != null) {
                actionHandler.updateSettings(map);
            }
        }
    }
}

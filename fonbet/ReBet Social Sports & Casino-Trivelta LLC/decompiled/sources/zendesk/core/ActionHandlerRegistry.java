package zendesk.core;

import androidx.annotation.NonNull;
import com.google.gson.h;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface ActionHandlerRegistry {
    void add(@NonNull ActionHandler actionHandler);

    void clear();

    ActionHandler handlerByAction(@NonNull String str);

    @NonNull
    List<ActionHandler> handlersByAction(@NonNull String str);

    void remove(@NonNull ActionHandler actionHandler);

    void updateSettings(Map<String, h> map);
}

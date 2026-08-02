package zendesk.core;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.h;
import java.util.Map;

/* loaded from: classes5.dex */
public interface ActionHandler {
    boolean canHandle(@NonNull String str);

    ActionDescription getActionDescription();

    int getPriority();

    void handle(Map<String, Object> map, @NonNull Context context);

    void updateSettings(Map<String, h> map);
}

package zendesk.core;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import md.e;

/* loaded from: classes5.dex */
public interface UserProvider {
    void addTags(@NonNull List<String> list, e eVar);

    void deleteTags(@NonNull List<String> list, e eVar);

    void getUser(e eVar);

    void getUserFields(e eVar);

    void setUserFields(@NonNull Map<String, String> map, e eVar);
}

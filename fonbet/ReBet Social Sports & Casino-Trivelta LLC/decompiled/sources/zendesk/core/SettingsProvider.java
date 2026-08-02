package zendesk.core;

import androidx.annotation.NonNull;
import md.e;

/* loaded from: classes5.dex */
public interface SettingsProvider {
    void getCoreSettings(e eVar);

    <E extends Settings> void getSettingsForSdk(@NonNull String str, @NonNull Class<E> cls, e eVar);
}

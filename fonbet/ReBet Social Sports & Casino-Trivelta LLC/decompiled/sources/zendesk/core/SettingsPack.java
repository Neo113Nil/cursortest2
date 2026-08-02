package zendesk.core;

import androidx.annotation.NonNull;
import zendesk.core.Settings;

/* loaded from: classes5.dex */
public class SettingsPack<E extends Settings> {
    private CoreSettings coreSettings;
    private E settings;

    public SettingsPack(@NonNull CoreSettings coreSettings, E e10) {
        this.coreSettings = coreSettings;
        this.settings = e10;
    }

    @NonNull
    public CoreSettings getCoreSettings() {
        return this.coreSettings;
    }

    public E getSettings() {
        return this.settings;
    }
}

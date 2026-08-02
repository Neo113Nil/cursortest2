package zendesk.core;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
interface CoreSettingsStorage {
    @NonNull
    BlipsSettings getBlipsSettings();

    @NonNull
    CoreSettings getCoreSettings();
}

package zendesk.core;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface BlipsProvider {
    void sendBlip(@NonNull PageView pageView, @NonNull BlipsGroup blipsGroup);

    void sendBlip(@NonNull UserAction userAction, @NonNull BlipsGroup blipsGroup);
}

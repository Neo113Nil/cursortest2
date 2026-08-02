package androidx.appcompat.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {
    public static final /* synthetic */ int b = 0;

    public static class a {
        public static int a() {
            return 512;
        }
    }

    @Override // android.app.Service
    @NonNull
    public final IBinder onBind(@NonNull Intent intent) {
        throw new UnsupportedOperationException();
    }
}

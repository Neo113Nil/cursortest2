package g6;

import T5.l;
import V5.v;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import p6.C8861a;

/* loaded from: classes.dex */
public final class d implements l<c> {
    @Override // T5.d
    public final boolean a(@NonNull Object obj, @NonNull File file, @NonNull T5.i iVar) {
        try {
            C8861a.e(((c) ((v) obj).get()).b(), file);
            return true;
        } catch (IOException e11) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e11);
            return false;
        }
    }

    @Override // T5.l
    @NonNull
    public final T5.c b(@NonNull T5.i iVar) {
        return T5.c.SOURCE;
    }
}

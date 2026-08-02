package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import xsna.lzw;

/* loaded from: classes12.dex */
public class ProfileInstallerInitializer implements lzw<a> {

    public static class a {
    }

    @Override // xsna.lzw
    @NonNull
    public final a create(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: xsna.byd0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler createAsync = Handler.createAsync(Looper.getMainLooper());
                int nextInt = new Random().nextInt(Math.max(1000, 1));
                createAsync.postDelayed(new qo4(applicationContext, 11), nextInt + 5000);
            }
        });
        return new a();
    }

    @Override // xsna.lzw
    @NonNull
    public final List<Class<? extends lzw<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}

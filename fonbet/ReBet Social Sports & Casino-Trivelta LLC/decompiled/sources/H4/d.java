package H4;

import android.util.Log;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.m;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class d implements m {
    @Override // com.bumptech.glide.load.m
    public com.bumptech.glide.load.c b(com.bumptech.glide.load.j jVar) {
        return com.bumptech.glide.load.c.SOURCE;
    }

    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(v vVar, File file, com.bumptech.glide.load.j jVar) {
        try {
            com.bumptech.glide.util.a.f(((c) vVar.get()).c(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            return false;
        }
    }
}

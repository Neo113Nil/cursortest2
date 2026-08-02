package h4;

import android.os.Build;
import d4.k;
import g4.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements v4.c {
    @Override // v4.c
    public final k a() {
        return Build.VERSION.SDK_INT >= 28 ? new g4.a() : new g(0);
    }
}

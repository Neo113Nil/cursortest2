package j9;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f18357c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f18358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18359b;

    public n(Context context, String str) {
        this.f18358a = context;
        this.f18359b = str;
    }

    public final synchronized void a() {
        this.f18358a.deleteFile(this.f18359b);
    }
}

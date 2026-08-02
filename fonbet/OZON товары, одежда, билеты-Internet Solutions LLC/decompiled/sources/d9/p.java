package d9;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.google.mlkit.common.sdkinternal.C5948d;
import e9.C6320a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final q f61362a;

    /* renamed from: b, reason: collision with root package name */
    private final C5948d f61363b;

    p(@NonNull q qVar, @NonNull C5948d c5948d) {
        this.f61362a = qVar;
        this.f61363b = c5948d;
    }

    @NonNull
    public final o a(@NonNull C6320a c6320a) {
        C6105c c6105c = (C6105c) this.f61362a.get(c6320a);
        c6320a.getClass();
        return new o(c6105c, this.f61363b.a(null), zzun.zzb(c6320a.a()), c6320a);
    }
}

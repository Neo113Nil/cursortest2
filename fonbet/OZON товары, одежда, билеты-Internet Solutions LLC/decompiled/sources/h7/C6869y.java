package h7;

import android.annotation.SuppressLint;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq;
import java.util.HashMap;

/* renamed from: h7.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6869y {

    /* renamed from: a, reason: collision with root package name */
    private final int f65059a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f65060b = new HashMap();

    @SuppressLint({"UseSparseArrays"})
    public C6869y(int i11) {
        this.f65059a = i11;
    }

    public final synchronized void a(long j11) {
        this.f65060b.remove(Long.valueOf(j11));
    }

    public final synchronized boolean b(C6867x c6867x, long j11) {
        if (this.f65060b.size() != this.f65059a) {
            this.f65060b.put(Long.valueOf(j11), c6867x);
            return true;
        }
        zbcq.zba.zbc(this, "Buffer is full. Drop frame " + j11, new Object[0]);
        return false;
    }
}

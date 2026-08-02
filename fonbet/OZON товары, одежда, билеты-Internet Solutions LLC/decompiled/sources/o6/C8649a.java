package o6;

import T5.f;
import android.content.Context;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p6.l;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8649a implements f {

    /* renamed from: b, reason: collision with root package name */
    private final int f77772b;

    /* renamed from: c, reason: collision with root package name */
    private final f f77773c;

    private C8649a(int i11, f fVar) {
        this.f77772b = i11;
        this.f77773c = fVar;
    }

    @NonNull
    public static C8649a a(@NonNull Context context) {
        return new C8649a(context.getResources().getConfiguration().uiMode & 48, C8650b.a(context));
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof C8649a) {
            C8649a c8649a = (C8649a) obj;
            if (this.f77772b == c8649a.f77772b && this.f77773c.equals(c8649a.f77773c)) {
                return true;
            }
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        return l.h(this.f77772b, this.f77773c);
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f77773c.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f77772b).array());
    }
}

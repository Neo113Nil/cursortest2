package o6;

import T5.f;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* renamed from: o6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8651c implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final C8651c f77775b = new C8651c();

    @NonNull
    public static C8651c a() {
        return f77775b;
    }

    public final String toString() {
        return "EmptySignature";
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}

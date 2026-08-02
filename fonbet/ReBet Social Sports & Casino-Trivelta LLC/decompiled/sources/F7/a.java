package F7;

import H7.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final k f3572a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, k encodedImage) {
        super(str);
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.f3572a = encodedImage;
    }

    public final k a() {
        return this.f3572a;
    }
}

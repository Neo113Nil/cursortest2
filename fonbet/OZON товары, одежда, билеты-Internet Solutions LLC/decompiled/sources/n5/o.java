package n5;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class o extends AbstractC7737t implements Function0<File> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f76537b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(Context context) {
        super(0);
        this.f76537b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        int i11 = A5.k.f430d;
        File cacheDir = this.f76537b.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        cacheDir.mkdirs();
        return cacheDir;
    }
}

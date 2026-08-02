package n5;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class p extends AbstractC7737t implements Function0<File> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f76538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(Context context) {
        super(0);
        this.f76538b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        int i11 = A5.k.f430d;
        File cacheDir = this.f76538b.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        cacheDir.mkdirs();
        return cacheDir;
    }
}

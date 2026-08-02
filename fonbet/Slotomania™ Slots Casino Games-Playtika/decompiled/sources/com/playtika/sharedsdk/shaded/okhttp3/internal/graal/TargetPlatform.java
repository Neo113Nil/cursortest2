package com.playtika.sharedsdk.shaded.okhttp3.internal.graal;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import com.playtika.sharedsdk.shaded.okhttp3.internal.platform.Jdk9Platform;
import com.playtika.sharedsdk.shaded.okhttp3.internal.platform.Platform;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GraalSvm.kt */
@TargetClass(Platform.Companion.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/graal/TargetPlatform;", "", "<init>", "()V", "findPlatform", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TargetPlatform {
    @Substitute
    public final Platform findPlatform() {
        Jdk9Platform buildIfSupported = Jdk9Platform.INSTANCE.buildIfSupported();
        Intrinsics.checkNotNull(buildIfSupported);
        return buildIfSupported;
    }
}

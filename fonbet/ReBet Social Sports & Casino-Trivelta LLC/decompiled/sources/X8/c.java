package X8;

import android.net.Uri;
import com.facebook.imagepipeline.request.b;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements O8.m {
    @Override // O8.m
    public com.facebook.imagepipeline.request.b a(Uri source, Map headers, b.EnumC0484b cacheChoice) {
        ReadableMap b10;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(cacheChoice, "cacheChoice");
        com.facebook.imagepipeline.request.c A10 = com.facebook.imagepipeline.request.c.x(source).A(cacheChoice);
        ReactNetworkImageRequest.Companion companion = ReactNetworkImageRequest.INSTANCE;
        Intrinsics.checkNotNull(A10);
        b10 = d.b(headers);
        return ReactNetworkImageRequest.Companion.fromBuilderWithHeaders$default(companion, A10, b10, null, 4, null);
    }
}

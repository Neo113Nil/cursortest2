package ru.ozon.app.android.video.di;

import We.G;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LWe/G;", "", "invoke", "(LWe/G;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class VideoModule$Companion$providerCronetConfig$1 extends AbstractC7737t implements Function1<G, String> {
    public static final VideoModule$Companion$providerCronetConfig$1 INSTANCE = new VideoModule$Companion$providerCronetConfig$1();

    VideoModule$Companion$providerCronetConfig$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(G CronetConfig) {
        Intrinsics.checkNotNullParameter(CronetConfig, "$this$CronetConfig");
        return CronetConfig.j().toString();
    }
}

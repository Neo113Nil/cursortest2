package ru.ozon.app.android.mediaupload.di;

import We.B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWe/B;", "it", "", "invoke", "(LWe/B;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class VideoUploadingOkHttpProvider$build$2$1$2 extends AbstractC7737t implements Function1<B, Boolean> {
    public static final VideoUploadingOkHttpProvider$build$2$1$2 INSTANCE = new VideoUploadingOkHttpProvider$build$2$1$2();

    VideoUploadingOkHttpProvider$build$2$1$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getClass().getSimpleName().equals("FlipperOkhttpInterceptor"));
    }
}

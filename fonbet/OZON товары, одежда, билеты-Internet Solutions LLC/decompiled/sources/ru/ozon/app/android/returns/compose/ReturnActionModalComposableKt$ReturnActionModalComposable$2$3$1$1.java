package ru.ozon.app.android.returns.compose;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.v3.molecules.list.GalleryView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/atoms/v3/molecules/list/GalleryView;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnActionModalComposableKt$ReturnActionModalComposable$2$3$1$1 extends AbstractC7737t implements Function1<Context, GalleryView> {
    public static final ReturnActionModalComposableKt$ReturnActionModalComposable$2$3$1$1 INSTANCE = new ReturnActionModalComposableKt$ReturnActionModalComposable$2$3$1$1();

    ReturnActionModalComposableKt$ReturnActionModalComposable$2$3$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GalleryView invoke(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new GalleryView(context, null, 0, 6, null);
    }
}

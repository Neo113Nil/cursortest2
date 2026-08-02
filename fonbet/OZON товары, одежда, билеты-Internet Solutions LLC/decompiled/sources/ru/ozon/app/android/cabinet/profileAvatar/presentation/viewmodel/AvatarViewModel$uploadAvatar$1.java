package ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.platform.image.ImageResizer;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Landroid/net/Uri;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Landroid/net/Uri;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AvatarViewModel$uploadAvatar$1 extends AbstractC7737t implements Function1<Uri, String> {
    final /* synthetic */ AvatarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarViewModel$uploadAvatar$1(AvatarViewModel avatarViewModel) {
        super(1);
        this.this$0 = avatarViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Uri it) {
        ImageResizer imageResizer;
        Intrinsics.checkNotNullParameter(it, "it");
        imageResizer = this.this$0.imageResizer;
        return ImageResizer.DefaultImpls.resize$default(imageResizer, it, 0.0f, 2, null);
    }
}

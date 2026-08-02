package ru.ozon.app.android.storefront.core.socialAtoms.badge;

import android.content.Context;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SocialBadgeAtomView$iconIv$2 extends AbstractC7737t implements Function0<ImageView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SocialBadgeAtomView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SocialBadgeAtomView$iconIv$2(SocialBadgeAtomView socialBadgeAtomView, Context context) {
        super(0);
        this.this$0 = socialBadgeAtomView;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        this.this$0.iconIvIsCreated = true;
        ImageView imageView = new ImageView(this.$context);
        SocialBadgeAtomView socialBadgeAtomView = this.this$0;
        imageView.setId(R$id.atomBadgeIconView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(SocialBadgeAtomView.getLayoutParams$default(socialBadgeAtomView, ResourceExtKt.toPx(16), ResourceExtKt.toPx(16), ResourceExtKt.toPx(8), 0, 0, 0, 56, null));
        this.this$0.addView(imageView, 0);
        return imageView;
    }
}

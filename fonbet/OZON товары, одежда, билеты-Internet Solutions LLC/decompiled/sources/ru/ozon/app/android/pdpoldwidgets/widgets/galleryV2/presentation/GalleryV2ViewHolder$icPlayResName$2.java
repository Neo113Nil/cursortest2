package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$drawable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke", "()Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV2ViewHolder$icPlayResName$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ GalleryV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV2ViewHolder$icPlayResName$2(GalleryV2ViewHolder galleryV2ViewHolder) {
        super(0);
        this.this$0 = galleryV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.this$0.getResources().getResourceEntryName(R$drawable.ic_l_play);
    }
}

package ru.ozon.app.android.ugc.core.widgets.common;

import android.content.Context;
import android.widget.ImageView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.R$drawable;
import ru.ozon.app.android.ugc.core.widgets.common.StatusableMediaPreviewView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StatusableMediaPreviewView$statusIv$2 extends AbstractC7737t implements Function0<ImageView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatusableMediaPreviewView$statusIv$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        StatusableMediaPreviewView.Companion companion;
        StatusableMediaPreviewView.Companion companion2;
        StatusableMediaPreviewView.Companion companion3;
        StatusableMediaPreviewView.Companion companion4;
        ImageView imageView = new ImageView(this.$context);
        imageView.setBackground(a.getDrawable(this.$context, R$drawable.bg_review_media_status));
        companion = StatusableMediaPreviewView.Companion;
        int statusIvPadding = companion.getStatusIvPadding();
        companion2 = StatusableMediaPreviewView.Companion;
        int statusIvPadding2 = companion2.getStatusIvPadding();
        companion3 = StatusableMediaPreviewView.Companion;
        int statusIvPadding3 = companion3.getStatusIvPadding();
        companion4 = StatusableMediaPreviewView.Companion;
        imageView.setPadding(statusIvPadding, statusIvPadding2, statusIvPadding3, companion4.getStatusIvPadding());
        return imageView;
    }
}

package ru.ozon.app.android.ugc.core.widgets.common;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.common.StatusableMediaPreviewView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout$LayoutParams;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StatusableMediaPreviewView$unavailableMediaIvLayoutParams$2 extends AbstractC7737t implements Function0<FrameLayout.LayoutParams> {
    public static final StatusableMediaPreviewView$unavailableMediaIvLayoutParams$2 INSTANCE = new StatusableMediaPreviewView$unavailableMediaIvLayoutParams$2();

    StatusableMediaPreviewView$unavailableMediaIvLayoutParams$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout.LayoutParams invoke() {
        StatusableMediaPreviewView.Companion companion;
        StatusableMediaPreviewView.Companion companion2;
        StatusableMediaPreviewView.Companion companion3;
        StatusableMediaPreviewView.Companion companion4;
        companion = StatusableMediaPreviewView.Companion;
        int statusIvSize = companion.getStatusIvSize();
        companion2 = StatusableMediaPreviewView.Companion;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(statusIvSize, companion2.getStatusIvSize());
        layoutParams.gravity = 8388659;
        companion3 = StatusableMediaPreviewView.Companion;
        layoutParams.topMargin = companion3.getUnavailableMediaIvTopStartMargin();
        companion4 = StatusableMediaPreviewView.Companion;
        layoutParams.leftMargin = companion4.getUnavailableMediaIvTopStartMargin();
        return layoutParams;
    }
}

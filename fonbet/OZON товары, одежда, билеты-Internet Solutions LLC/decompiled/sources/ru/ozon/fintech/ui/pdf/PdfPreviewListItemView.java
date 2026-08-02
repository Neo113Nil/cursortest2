package ru.ozon.fintech.ui.pdf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.core.content.a;
import com.github.chrisbanes.photoview.PhotoView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/pdf/PdfPreviewListItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Lcom/github/chrisbanes/photoview/PhotoView;", "getImageView", "()Lcom/github/chrisbanes/photoview/PhotoView;", "setImageView", "(Lcom/github/chrisbanes/photoview/PhotoView;)V", "bind", "", "item", "Lru/ozon/fintech/ui/pdf/PdfPreviewListItem;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PdfPreviewListItemView extends FrameLayout {
    private PhotoView imageView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdfPreviewListItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull PdfPreviewListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PhotoView photoView = this.imageView;
        if (photoView != null) {
            photoView.setImageBitmap(item.getBitmap());
        }
    }

    public final PhotoView getImageView() {
        return this.imageView;
    }

    public final void setImageView(PhotoView photoView) {
        this.imageView = photoView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdfPreviewListItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PdfPreviewListItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfPreviewListItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R.layout.pdf_preview_list_item, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(a.getDrawable(context, R.color.oz_semantic_bg_secondary));
        PhotoView photoView = (PhotoView) findViewById(R.id.pv_pdf);
        this.imageView = photoView;
        if (photoView != null) {
            photoView.i(7.0f);
        }
        PhotoView photoView2 = this.imageView;
        if (photoView2 != null) {
            photoView2.j(4.0f);
        }
        PhotoView photoView3 = this.imageView;
        if (photoView3 != null) {
            photoView3.k();
        }
    }
}

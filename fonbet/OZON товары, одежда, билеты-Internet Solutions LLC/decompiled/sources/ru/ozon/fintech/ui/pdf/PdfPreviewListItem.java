package ru.ozon.fintech.ui.pdf;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/ui/pdf/PdfPreviewListItem;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "pageIndex", "", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(ILandroid/graphics/Bitmap;)V", "getPageIndex", "()I", "getBitmap", "()Landroid/graphics/Bitmap;", "provideId", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PdfPreviewListItem implements RecyclerItem {

    @NotNull
    private final Bitmap bitmap;
    private final int pageIndex;

    public PdfPreviewListItem(int i11, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.pageIndex = i11;
        this.bitmap = bitmap;
    }

    public static /* synthetic */ PdfPreviewListItem copy$default(PdfPreviewListItem pdfPreviewListItem, int i11, Bitmap bitmap, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = pdfPreviewListItem.pageIndex;
        }
        if ((i12 & 2) != 0) {
            bitmap = pdfPreviewListItem.bitmap;
        }
        return pdfPreviewListItem.copy(i11, bitmap);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final PdfPreviewListItem copy(int pageIndex, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new PdfPreviewListItem(pageIndex, bitmap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfPreviewListItem)) {
            return false;
        }
        PdfPreviewListItem pdfPreviewListItem = (PdfPreviewListItem) other;
        return this.pageIndex == pdfPreviewListItem.pageIndex && Intrinsics.d(this.bitmap, pdfPreviewListItem.bitmap);
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public int hashCode() {
        return this.bitmap.hashCode() + (Integer.hashCode(this.pageIndex) * 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return String.valueOf(this.pageIndex);
    }

    @NotNull
    public String toString() {
        return "PdfPreviewListItem(pageIndex=" + this.pageIndex + ", bitmap=" + this.bitmap + ")";
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}

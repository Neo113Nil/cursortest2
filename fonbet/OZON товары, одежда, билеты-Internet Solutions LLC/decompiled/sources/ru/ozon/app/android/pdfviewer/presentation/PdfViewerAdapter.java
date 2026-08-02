package ru.ozon.app.android.pdfviewer.presentation;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$layout;
import ru.ozon.app.android.pdfviewer.data.PdfRendererCore;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerPageHolder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdfviewer/presentation/PdfViewerPageHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/pdfviewer/presentation/PdfViewerPageHolder;I)V", "Ljava/io/File;", "pdfFile", "openPdf", "(Ljava/io/File;)V", "onDestroy", "()V", "Lru/ozon/app/android/pdfviewer/data/PdfRendererCore;", "renderer", "Lru/ozon/app/android/pdfviewer/data/PdfRendererCore;", "Lru/ozon/app/android/pdfviewer/presentation/BitmapCacheHandler;", "cacheHandler", "Lru/ozon/app/android/pdfviewer/presentation/BitmapCacheHandler;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdfViewerAdapter extends RecyclerView.g<PdfViewerPageHolder> {

    @NotNull
    private final BitmapCacheHandler cacheHandler;

    @NotNull
    private final Handler mainThreadHandler;

    @NotNull
    private final PdfRendererCore renderer;

    public PdfViewerAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.renderer = new PdfRendererCore();
        this.cacheHandler = new BitmapCacheHandler(context);
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.renderer.getPageCount();
    }

    public final void onDestroy() {
        this.renderer.clear();
        this.cacheHandler.clear();
    }

    public final void openPdf(@NotNull File pdfFile) {
        Intrinsics.checkNotNullParameter(pdfFile, "pdfFile");
        this.renderer.openPdfFile(pdfFile);
        this.cacheHandler.resetCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PdfViewerPageHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.cacheHandler.loadFromCache(position, new PdfViewerAdapter$onBindViewHolder$1(this, position, holder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PdfViewerPageHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.pdf_viewer_page, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new PdfViewerPageHolder(inflate);
    }
}

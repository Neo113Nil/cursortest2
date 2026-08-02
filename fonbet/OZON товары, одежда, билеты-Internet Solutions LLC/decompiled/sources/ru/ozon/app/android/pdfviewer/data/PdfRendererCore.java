package ru.ozon.app.android.pdfviewer.data;

import Lm0.a;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdfviewer.data.PdfRendererCore;
import ru.ozon.app.android.pdfviewer.data.Quality;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\tJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdfviewer/data/PdfRendererCore;", "", "<init>", "()V", "executor", "Ljava/util/concurrent/ExecutorService;", "pdfRenderer", "Landroid/graphics/pdf/PdfRenderer;", "openPdfFile", "", "pdfFile", "Ljava/io/File;", "getPageCount", "", "renderPage", "Landroid/graphics/Bitmap;", "pageNo", "clear", "buildBitmap", "quality", "Lru/ozon/app/android/pdfviewer/data/Quality;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdfRendererCore {

    @NotNull
    private final ExecutorService executor;
    private PdfRenderer pdfRenderer;
    public static final int $stable = 8;

    @NotNull
    private static final Quality.Normal PDF_QUALITY = Quality.Normal.INSTANCE;

    public PdfRendererCore() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.executor = newSingleThreadExecutor;
    }

    private final Bitmap buildBitmap(int pageNo, Quality quality) {
        PdfRenderer.Page openPage;
        PdfRenderer pdfRenderer = this.pdfRenderer;
        if (pdfRenderer == null || (openPage = pdfRenderer.openPage(pageNo)) == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(openPage.getWidth() * quality.getRatio(), openPage.getHeight() * quality.getRatio(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            if (createBitmap != null) {
                openPage.render(createBitmap, null, null, 1);
            }
            openPage.close();
            return createBitmap;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap renderPage$lambda$2$lambda$1(PdfRendererCore pdfRendererCore, int i11) {
        try {
            return pdfRendererCore.buildBitmap(i11, PDF_QUALITY);
        } catch (Exception e11) {
            a.f17149a.e(e11);
            return null;
        }
    }

    public final void clear() {
        this.executor.shutdownNow();
        this.pdfRenderer = null;
    }

    public final int getPageCount() {
        PdfRenderer pdfRenderer = this.pdfRenderer;
        if (pdfRenderer != null) {
            return pdfRenderer.getPageCount();
        }
        return 0;
    }

    public final void openPdfFile(@NotNull File pdfFile) {
        Intrinsics.checkNotNullParameter(pdfFile, "pdfFile");
        try {
            this.pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(pdfFile, 268435456));
        } catch (Exception e11) {
            a.f17149a.e(e11);
        }
    }

    public final Bitmap renderPage(int pageNo) {
        Integer valueOf = Integer.valueOf(pageNo);
        if (pageNo >= getPageCount()) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        final int intValue = valueOf.intValue();
        return (Bitmap) this.executor.submit(new Callable() { // from class: mC.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap renderPage$lambda$2$lambda$1;
                renderPage$lambda$2$lambda$1 = PdfRendererCore.renderPage$lambda$2$lambda$1(PdfRendererCore.this, intValue);
                return renderPage$lambda$2$lambda$1;
            }
        }).get();
    }
}

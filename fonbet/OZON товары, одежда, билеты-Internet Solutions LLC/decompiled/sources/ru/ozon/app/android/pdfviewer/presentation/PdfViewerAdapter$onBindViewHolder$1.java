package ru.ozon.app.android.pdfviewer.presentation;

import android.graphics.Bitmap;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdfviewer.data.PdfRendererCore;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cachedBitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PdfViewerAdapter$onBindViewHolder$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ PdfViewerPageHolder $holder;
    final /* synthetic */ int $position;
    final /* synthetic */ PdfViewerAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfViewerAdapter$onBindViewHolder$1(PdfViewerAdapter pdfViewerAdapter, int i11, PdfViewerPageHolder pdfViewerPageHolder) {
        super(1);
        this.this$0 = pdfViewerAdapter;
        this.$position = i11;
        this.$holder = pdfViewerPageHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final Bitmap bitmap) {
        Handler handler;
        PdfRendererCore pdfRendererCore;
        BitmapCacheHandler bitmapCacheHandler;
        Handler handler2;
        if (bitmap != null) {
            handler = this.this$0.mainThreadHandler;
            final PdfViewerPageHolder pdfViewerPageHolder = this.$holder;
            handler.post(new Runnable() { // from class: ru.ozon.app.android.pdfviewer.presentation.b
                @Override // java.lang.Runnable
                public final void run() {
                    PdfViewerPageHolder.this.bind(bitmap);
                }
            });
            return;
        }
        pdfRendererCore = this.this$0.renderer;
        Bitmap renderPage = pdfRendererCore.renderPage(this.$position);
        if (renderPage != null) {
            final PdfViewerAdapter pdfViewerAdapter = this.this$0;
            final int i11 = this.$position;
            bitmapCacheHandler = pdfViewerAdapter.cacheHandler;
            bitmapCacheHandler.writeToCache(i11, renderPage);
            handler2 = pdfViewerAdapter.mainThreadHandler;
            handler2.post(new Runnable() { // from class: ru.ozon.app.android.pdfviewer.presentation.a
                @Override // java.lang.Runnable
                public final void run() {
                    PdfViewerAdapter.this.notifyItemChanged(i11);
                }
            });
        }
    }
}

package ru.sberdevices.salutevision.core.utils;

import Sc.C4001c;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.Q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012J\u0006\u0010\u0013\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/sberdevices/salutevision/core/utils/PdfReader;", "", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "(Landroid/os/ParcelFileDescriptor;)V", "renderer", "Landroid/graphics/pdf/PdfRenderer;", "getRenderer", "()Landroid/graphics/pdf/PdfRenderer;", "setRenderer", "(Landroid/graphics/pdf/PdfRenderer;)V", "close", "", "getPage", "Landroid/graphics/Bitmap;", "n", "", "getPages", "", "getPagesCount", "Companion", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PdfReader {

    @NotNull
    public static final String tag = "PdfReader";

    @NotNull
    private PdfRenderer renderer;

    public PdfReader(@NotNull ParcelFileDescriptor fileDescriptor) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        this.renderer = new PdfRenderer(fileDescriptor);
    }

    public final void close() {
        this.renderer.close();
    }

    public final Bitmap getPage(int n11) {
        Bitmap bitmap = null;
        if (n11 >= 0) {
            try {
                if (n11 <= this.renderer.getPageCount()) {
                    PdfRenderer.Page openPage = this.renderer.openPage(n11);
                    Bitmap createBitmap = Bitmap.createBitmap(openPage.getWidth(), openPage.getHeight(), Bitmap.Config.ARGB_8888);
                    openPage.render(createBitmap, null, null, 1);
                    try {
                        openPage.close();
                        return createBitmap;
                    } catch (Exception e11) {
                        e = e11;
                        bitmap = createBitmap;
                        Log.e(tag, C4001c.b(e));
                        return bitmap;
                    }
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        return bitmap;
    }

    @NotNull
    public final List<Bitmap> getPages() {
        ArrayList arrayList = new ArrayList();
        try {
            if (this.renderer.getPageCount() > 0) {
                Iterator<Integer> it = h.o(0, this.renderer.getPageCount()).iterator();
                while (it.hasNext()) {
                    Bitmap page = getPage(((Q) it).b());
                    if (page != null) {
                        arrayList.add(page);
                    }
                }
            }
        } catch (Exception e11) {
            Log.e(tag, C4001c.b(e11));
        }
        return arrayList;
    }

    public final int getPagesCount() {
        return this.renderer.getPageCount();
    }

    @NotNull
    public final PdfRenderer getRenderer() {
        return this.renderer;
    }

    public final void setRenderer(@NotNull PdfRenderer pdfRenderer) {
        Intrinsics.checkNotNullParameter(pdfRenderer, "<set-?>");
        this.renderer = pdfRenderer;
    }
}

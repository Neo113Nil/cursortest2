package c50;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.pdf.PdfPreviewListItemView;

/* renamed from: c50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5746a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final PdfPreviewListItemView f56511a;

    private C5746a(@NonNull PdfPreviewListItemView pdfPreviewListItemView) {
        this.f56511a = pdfPreviewListItemView;
    }

    @NonNull
    public static C5746a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.cbottom_pdf_page_fragment, viewGroup, false);
        if (inflate != null) {
            return new C5746a((PdfPreviewListItemView) inflate);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public final PdfPreviewListItemView a() {
        return this.f56511a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f56511a;
    }
}

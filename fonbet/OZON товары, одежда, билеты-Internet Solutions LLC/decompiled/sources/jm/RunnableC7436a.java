package jm;

import androidx.media3.ui.LegacyPlayerControlView;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment;
import ru.ozon.app.android.pikazon.internal.PikazonLPLibraryLinkHandler;
import ru.ozon.app.android.pikazon.retry.RequestWithRetryCount;

/* renamed from: jm.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC7436a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70205b;

    public /* synthetic */ RunnableC7436a(Object obj, int i11) {
        this.f70204a = i11;
        this.f70205b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f70204a) {
            case 0:
                ((ProductPickerSearchFragment) this.f70205b).onProgress(false);
                break;
            case 1:
                PikazonLPLibraryLinkHandler.downloadImage$lambda$4$lambda$3((RequestWithRetryCount) this.f70205b);
                break;
            default:
                ((LegacyPlayerControlView) this.f70205b).F();
                break;
        }
    }
}

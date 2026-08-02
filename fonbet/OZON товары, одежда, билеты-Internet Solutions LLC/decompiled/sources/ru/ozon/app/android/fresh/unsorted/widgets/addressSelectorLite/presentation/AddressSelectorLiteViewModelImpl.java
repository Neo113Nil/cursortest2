package ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.presentation;

import androidx.lifecycle.w0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/addressSelectorLite/presentation/AddressSelectorLiteViewModelImpl;", "Lru/ozon/app/android/fresh/unsorted/widgets/addressSelectorLite/presentation/AddressSelectorLiteViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "", "attachComposerReferences", "(Ljava/lang/ref/WeakReference;)V", "onCleared", "Lnc/a;", "disposables", "Lnc/a;", "Ljava/lang/ref/WeakReference;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSelectorLiteViewModelImpl extends w0 implements AddressSelectorLiteViewModel {
    private WeakReference<ComposerReferences> composerReferences;

    @NotNull
    private final C8486a disposables = new C8486a();

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.presentation.AddressSelectorLiteViewModel
    public void attachComposerReferences(@NotNull WeakReference<ComposerReferences> composerReferences) {
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerReferences = composerReferences;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
        this.composerReferences = null;
    }
}

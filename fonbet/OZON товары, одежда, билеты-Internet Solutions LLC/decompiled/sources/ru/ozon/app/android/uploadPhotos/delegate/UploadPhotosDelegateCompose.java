package ru.ozon.app.android.uploadPhotos.delegate;

import Ci.C2779a;
import Ci.b;
import Ci.g;
import Ci.k;
import Ci.l;
import Hi.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/uploadPhotos/delegate/UploadPhotosDelegateCompose;", "", "", "isSelect", "<init>", "(Z)V", "LCi/k;", "", "count", "withCount", "(LCi/k;I)LCi/k;", "limit", "LBi/k;", "galleryLauncher", "Lkotlin/Function1;", "LHi/g;", "", "handleGalleryResult", "openImagePicker", "(ILBi/k;Lkotlin/jvm/functions/Function1;)V", "Z", "reviewGalleryConfig", "LCi/k;", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadPhotosDelegateCompose {
    private final boolean isSelect;

    @NotNull
    private final k reviewGalleryConfig;

    public UploadPhotosDelegateCompose(boolean z11) {
        this.isSelect = z11;
        k b11 = C2779a.b();
        this.reviewGalleryConfig = k.b(b11, z11 ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, h.d.f11018a, b.a(b11.d(), new g(UploadPhotosDelegateCompose$reviewGalleryConfig$1$1.INSTANCE, UploadPhotosDelegateCompose$reviewGalleryConfig$1$2.INSTANCE, null, 10), null, 0, 2046), C2779a.a(), 242);
    }

    private final k withCount(k kVar, int i11) {
        return k.a(kVar, 0, null, b.a(kVar.d(), g.a(kVar.d().f(), null, null, i11 == 1 ? l.RESULT_API_ONLY : kVar.d().f().g(), 31), null, i11, 1918), null, null, 119);
    }

    public final void openImagePicker(int limit, Bi.k galleryLauncher, @NotNull Function1<? super Hi.g, Unit> handleGalleryResult) {
        Intrinsics.checkNotNullParameter(handleGalleryResult, "handleGalleryResult");
        if (galleryLauncher != null) {
            galleryLauncher.b(withCount(this.reviewGalleryConfig, limit), handleGalleryResult);
        }
    }
}

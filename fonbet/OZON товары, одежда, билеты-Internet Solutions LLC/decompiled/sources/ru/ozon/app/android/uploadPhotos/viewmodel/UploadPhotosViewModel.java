package ru.ozon.app.android.uploadPhotos.viewmodel;

import androidx.lifecycle.P;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.gallery.HandleGalleryResult;
import ru.ozon.app.android.uploadPhotos.model.ViewState;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\bJ%\u0010\u000f\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010!\u001a\u00020\u00168&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModel;", "Lru/ozon/app/android/domain/gallery/HandleGalleryResult;", "", "attachImage", "()V", "", "id", "removeAttachedClick", "(J)V", "retryUploadAttachedClick", "", "", "paths", "", "disabled", "setImages", "(Ljava/util/List;Z)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/uploadPhotos/model/ViewState;", "getState", "()Landroidx/lifecycle/P;", "state", "", "getOpenPickScreenEvent", "openPickScreenEvent", "getShowMessageEvent", "showMessageEvent", "getShowErrorEvent", "showErrorEvent", "getPickImagesLimit", "()I", "setPickImagesLimit", "(I)V", "pickImagesLimit", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UploadPhotosViewModel extends HandleGalleryResult {
    void attachImage();

    @NotNull
    P<Integer> getOpenPickScreenEvent();

    int getPickImagesLimit();

    @NotNull
    P<String> getShowErrorEvent();

    @NotNull
    P<String> getShowMessageEvent();

    @NotNull
    P<ViewState> getState();

    void removeAttachedClick(long id2);

    void retryUploadAttachedClick(long id2);

    void setImages(@NotNull List<String> paths, boolean disabled);
}

package com.vk.preview.presentation.view;

import android.os.Parcelable;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.preview.presentation.GalleryPickerInitialData;
import java.util.List;
import xsna.t4d0;

/* compiled from: GalleryPickerPreview.kt */
/* loaded from: classes5.dex */
public interface GalleryPickerPreview {

    /* compiled from: GalleryPickerPreview.kt */
    public interface State extends Parcelable {
    }

    default State getState() {
        return null;
    }

    void setPreviewListener(t4d0 t4d0Var);

    void z4(List<? extends MediaStoreEntry> list);

    default void s3(State state) {
    }

    default void setInitialState(GalleryPickerInitialData galleryPickerInitialData) {
    }
}

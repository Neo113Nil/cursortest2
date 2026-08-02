package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcelable;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.w65;

/* compiled from: MediaPickerState.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final ArrayList a(MediaPickerState mediaPickerState) {
        Parcelable parcelable;
        List<MediaPickerSelectedItem> list = mediaPickerState.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (MediaPickerSelectedItem mediaPickerSelectedItem : list) {
            if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.LocalMedia) {
                parcelable = ((MediaPickerSelectedItem.LocalMedia) mediaPickerSelectedItem).b;
            } else if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkPhoto) {
                parcelable = ((MediaPickerSelectedItem.VkPhoto) mediaPickerSelectedItem).b;
            } else {
                if (!(mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkVideo)) {
                    throw new NoWhenBranchMatchedException();
                }
                parcelable = ((MediaPickerSelectedItem.VkVideo) mediaPickerSelectedItem).b;
            }
            arrayList.add(parcelable);
        }
        return arrayList;
    }

    public static final MediaStoreEntry b(MediaPickerSelectedItem mediaPickerSelectedItem) {
        if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.LocalMedia) {
            return ((MediaPickerSelectedItem.LocalMedia) mediaPickerSelectedItem).b.ba();
        }
        if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkPhoto) {
            return w65.j(((MediaPickerSelectedItem.VkPhoto) mediaPickerSelectedItem).b.b);
        }
        return null;
    }
}

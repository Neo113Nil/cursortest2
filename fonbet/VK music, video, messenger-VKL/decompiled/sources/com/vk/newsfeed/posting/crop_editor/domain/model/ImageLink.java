package com.vk.newsfeed.posting.crop_editor.domain.model;

import android.net.Uri;
import android.os.Parcelable;

/* compiled from: ImageLink.kt */
/* loaded from: classes4.dex */
public interface ImageLink extends Parcelable {
    int getHeight();

    Uri getUri();

    int getWidth();
}

package com.vk.libvideo.api.ad;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.newsfeed.Owner;

/* compiled from: AdsDataProvider.kt */
/* loaded from: classes2.dex */
public interface AdsDataProvider extends Parcelable {
    void Da(FragmentActivity fragmentActivity);

    String S1();

    void a8(Context context);

    String getDescription();

    int getDuration();

    String getMessage();

    Integer h4();

    Owner s();

    void s8(Context context);
}

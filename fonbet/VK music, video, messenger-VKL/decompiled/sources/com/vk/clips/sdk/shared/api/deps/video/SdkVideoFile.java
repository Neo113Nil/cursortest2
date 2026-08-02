package com.vk.clips.sdk.shared.api.deps.video;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkVerifyInfo;
import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.models.ads.SdkOrdAdsInfo;
import com.vk.clips.sdk.shared.api.analytics.SdkStatPixel;
import com.vk.clips.sdk.shared.api.deps.SdkTimelineThumbs;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.Map;
import xsna.ukh0;

/* compiled from: SdkVideoFile.kt */
/* loaded from: classes17.dex */
public interface SdkVideoFile extends Serializer.StreamParcelable {
    boolean A0();

    SdkTimelineThumbs B0();

    UserId I0();

    SdkImages I7();

    boolean J();

    SdkVideoRestriction O();

    String P();

    Boolean Q();

    boolean Q0();

    boolean U();

    SdkVideoAdInfo X0();

    SdkVerifyInfo Y();

    String a1();

    int b0();

    boolean c0();

    SdkVideoFile copy();

    Map<SdkStatPixel.a, ukh0> e0();

    SdkImages e1();

    boolean g1();

    int getDuration();

    int getHeight();

    SdkImages getImage();

    int getWidth();

    boolean h1();

    boolean i0();

    boolean j0();

    String j1();

    int k1();

    SdkActionLink m1();

    int o0();

    void o7(SdkVideoFile sdkVideoFile);

    boolean p0();

    SdkOrdAdsInfo p1();

    boolean q0();

    String r();

    String r1();

    SdkOwner s();

    void setTrackCode(String str);

    boolean t0();

    boolean v();

    boolean v3();

    boolean w1();

    boolean x0();

    void xa(boolean z);

    boolean z0();
}

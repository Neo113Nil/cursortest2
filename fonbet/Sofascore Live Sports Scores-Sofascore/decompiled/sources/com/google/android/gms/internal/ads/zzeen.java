package com.google.android.gms.internal.ads;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeen {
    public NativeAdOptions b;
    public VideoOptions c;
    public AdSize d = AdSize.BANNER;
    public String e = "";
    public String f = "";
    public boolean g = false;
    public AdRequest a = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bf3.f("request_origin", "inspector_ooct")).build();
}

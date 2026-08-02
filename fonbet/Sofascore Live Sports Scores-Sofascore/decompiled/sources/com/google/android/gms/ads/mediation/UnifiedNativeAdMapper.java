package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class UnifiedNativeAdMapper {
    public String a;
    public List b;
    public String c;
    public NativeAd.Image d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public String i;
    public VideoController j;
    public boolean k;
    public View l;
    public View m;
    public Object n;
    public Bundle o = new Bundle();
    public boolean p;
    public boolean q;
    public float r;

    @NonNull
    public View getAdChoicesContent() {
        return this.l;
    }

    @NonNull
    public final String getAdvertiser() {
        return this.f;
    }

    @NonNull
    public final String getBody() {
        return this.c;
    }

    @NonNull
    public final String getCallToAction() {
        return this.e;
    }

    public float getCurrentTime() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getDuration() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @NonNull
    public final Bundle getExtras() {
        return this.o;
    }

    @NonNull
    public final String getHeadline() {
        return this.a;
    }

    @NonNull
    public final NativeAd.Image getIcon() {
        return this.d;
    }

    @NonNull
    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    public float getMediaContentAspectRatio() {
        return this.r;
    }

    public final boolean getOverrideClickHandling() {
        return this.q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.p;
    }

    @NonNull
    public final String getPrice() {
        return this.i;
    }

    @NonNull
    public final Double getStarRating() {
        return this.g;
    }

    @NonNull
    public final String getStore() {
        return this.h;
    }

    public boolean hasVideoContent() {
        return this.k;
    }

    public void setAdChoicesContent(@NonNull View view) {
        this.l = view;
    }

    public final void setAdvertiser(@NonNull String str) {
        this.f = str;
    }

    public final void setBody(@NonNull String str) {
        this.c = str;
    }

    public final void setCallToAction(@NonNull String str) {
        this.e = str;
    }

    public final void setExtras(@NonNull Bundle bundle) {
        this.o = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.k = z;
    }

    public final void setHeadline(@NonNull String str) {
        this.a = str;
    }

    public final void setIcon(@NonNull NativeAd.Image image) {
        this.d = image;
    }

    public final void setImages(@NonNull List<NativeAd.Image> list) {
        this.b = list;
    }

    public void setMediaContentAspectRatio(float f) {
        this.r = f;
    }

    public void setMediaView(@NonNull View view) {
        this.m = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.q = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.p = z;
    }

    public final void setPrice(@NonNull String str) {
        this.i = str;
    }

    public final void setStarRating(@NonNull Double d) {
        this.g = d;
    }

    public final void setStore(@NonNull String str) {
        this.h = str;
    }

    public final void zza(@NonNull VideoController videoController) {
        this.j = videoController;
    }

    public final void zzb(@NonNull Object obj) {
        this.n = obj;
    }

    @NonNull
    public final VideoController zzc() {
        return this.j;
    }

    @NonNull
    public final View zzd() {
        return this.m;
    }

    @NonNull
    public final Object zze() {
        return this.n;
    }

    public void destroy() {
    }

    public void recordImpression() {
    }

    public void handleClick(@NonNull View view) {
    }

    public void untrackView(@NonNull View view) {
    }

    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
    }
}

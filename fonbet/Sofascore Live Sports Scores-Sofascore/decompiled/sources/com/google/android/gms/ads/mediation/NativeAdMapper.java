package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAd;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class NativeAdMapper {
    public String a;
    public List b;
    public String c;
    public NativeAd.Image d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public String i;
    public boolean j;
    public View k;
    public View l;
    public Bundle m = new Bundle();
    public boolean n;
    public boolean o;
    public float p;

    @NonNull
    public View getAdChoicesContent() {
        return this.k;
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
        return this.m;
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
        return this.p;
    }

    public final boolean getOverrideClickHandling() {
        return this.o;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.n;
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
        return this.j;
    }

    public void setAdChoicesContent(@NonNull View view) {
        this.k = view;
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
        this.m = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.j = z;
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
        this.p = f;
    }

    public void setMediaView(@NonNull View view) {
        this.l = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.o = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.n = z;
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

    @NonNull
    public final View zza() {
        return this.l;
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

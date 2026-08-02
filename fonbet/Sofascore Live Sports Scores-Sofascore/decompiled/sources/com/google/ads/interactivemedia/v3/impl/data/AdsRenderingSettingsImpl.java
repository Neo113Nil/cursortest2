package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData;
import defpackage.afn;
import defpackage.c4p;
import defpackage.e9k;
import defpackage.efn;
import defpackage.q1p;
import defpackage.q3p;
import defpackage.zk;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class AdsRenderingSettingsImpl implements zk {
    private boolean enablePreloading;
    private Set<e9k> uiElements;
    private int bitrate = -1;
    private List<String> mimeTypes = null;
    private boolean enableFocusSkipButton = true;
    private double playAdsAfterTime = -1.0d;
    private boolean disableUi = false;
    private boolean enableCustomTabs = false;
    private int loadVideoTimeout = -1;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q1p(zza = AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData.class)
    public static abstract class AdsRenderingSettingsData {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static abstract class Builder {
            @NonNull
            public abstract AdsRenderingSettingsData build();

            public abstract Builder setBitrate(int i);

            public abstract Builder setDisableUi(boolean z);

            public abstract Builder setEnableFocusSkipButton(boolean z);

            public abstract Builder setEnablePreloading(boolean z);

            public abstract Builder setLoadVideoTimeout(int i);

            public abstract Builder setMimeTypes(List<String> list);

            public abstract Builder setPlayAdsAfterTime(double d);

            public abstract Builder setUiElements(Set<e9k> set);
        }

        @NonNull
        public static Builder builder(@NonNull zk zkVar) {
            AdsRenderingSettingsImpl adsRenderingSettingsImpl = (AdsRenderingSettingsImpl) zkVar;
            AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData.Builder builder = new AutoValue_AdsRenderingSettingsImpl_AdsRenderingSettingsData.Builder();
            builder.setBitrate(adsRenderingSettingsImpl.getBitrateKbps());
            builder.setDisableUi(adsRenderingSettingsImpl.getDisableUi());
            builder.setEnablePreloading(adsRenderingSettingsImpl.getEnablePreloading());
            builder.setEnableFocusSkipButton(adsRenderingSettingsImpl.getFocusSkipButtonWhenAvailable());
            builder.setLoadVideoTimeout(adsRenderingSettingsImpl.getLoadVideoTimeout());
            builder.setMimeTypes(adsRenderingSettingsImpl.getMimeTypes());
            builder.setPlayAdsAfterTime(adsRenderingSettingsImpl.getPlayAdsAfterTime());
            builder.setUiElements(adsRenderingSettingsImpl.getUiElements());
            return builder;
        }

        public abstract int bitrate();

        public abstract boolean disableUi();

        public abstract boolean enableFocusSkipButton();

        public abstract boolean enablePreloading();

        public abstract int loadVideoTimeout();

        public abstract q3p mimeTypes();

        public abstract double playAdsAfterTime();

        public abstract Builder toBuilder();

        public abstract c4p uiElements();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return afn.a(this, obj, new String[0]);
    }

    public int getBitrateKbps() {
        return this.bitrate;
    }

    public boolean getDisableUi() {
        return this.disableUi;
    }

    @Override // defpackage.zk
    public boolean getEnableCustomTabs() {
        return this.enableCustomTabs;
    }

    public boolean getEnablePreloading() {
        return this.enablePreloading;
    }

    @Override // defpackage.zk
    public boolean getFocusSkipButtonWhenAvailable() {
        return this.enableFocusSkipButton;
    }

    public int getLoadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Nullable
    public List<String> getMimeTypes() {
        return this.mimeTypes;
    }

    public double getPlayAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    @Nullable
    public Set<e9k> getUiElements() {
        return this.uiElements;
    }

    public int hashCode() {
        return efn.a(this, new String[0]);
    }

    public void setBitrateKbps(int i) {
        this.bitrate = i;
    }

    public void setDisableUi(boolean z) {
        this.disableUi = z;
    }

    @Override // defpackage.zk
    public void setEnableCustomTabs(boolean z) {
        this.enableCustomTabs = z;
    }

    @Override // defpackage.zk
    public void setEnablePreloading(boolean z) {
        this.enablePreloading = z;
    }

    @Override // defpackage.zk
    public void setFocusSkipButtonWhenAvailable(boolean z) {
        this.enableFocusSkipButton = z;
    }

    public void setLoadVideoTimeout(int i) {
        this.loadVideoTimeout = i;
    }

    @Override // defpackage.zk
    public void setMimeTypes(@NonNull List<String> list) {
        this.mimeTypes = list;
    }

    @Override // defpackage.zk
    public void setPlayAdsAfterTime(double d) {
        this.playAdsAfterTime = d;
    }

    public void setUiElements(@NonNull Set<e9k> set) {
        this.uiElements = set;
    }
}

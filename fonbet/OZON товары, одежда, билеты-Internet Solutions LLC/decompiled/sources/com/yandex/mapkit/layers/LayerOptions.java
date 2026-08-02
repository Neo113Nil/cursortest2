package com.yandex.mapkit.layers;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class LayerOptions implements Serializable {
    private boolean active;
    private boolean animateOnActivation;
    private boolean cacheable;
    private boolean nightModeAvailable;
    private OverzoomMode overzoomMode;
    private long tileAppearingAnimationDuration;
    private boolean transparent;
    private boolean versionSupport;

    public LayerOptions(boolean z11, boolean z12, boolean z13, boolean z14, long j11, @NonNull OverzoomMode overzoomMode, boolean z15, boolean z16) {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.versionSupport = true;
        if (overzoomMode == null) {
            throw new IllegalArgumentException("Required field \"overzoomMode\" cannot be null");
        }
        this.active = z11;
        this.nightModeAvailable = z12;
        this.cacheable = z13;
        this.animateOnActivation = z14;
        this.tileAppearingAnimationDuration = j11;
        this.overzoomMode = overzoomMode;
        this.transparent = z15;
        this.versionSupport = z16;
    }

    public boolean getActive() {
        return this.active;
    }

    public boolean getAnimateOnActivation() {
        return this.animateOnActivation;
    }

    public boolean getCacheable() {
        return this.cacheable;
    }

    public boolean getNightModeAvailable() {
        return this.nightModeAvailable;
    }

    @NonNull
    public OverzoomMode getOverzoomMode() {
        return this.overzoomMode;
    }

    public long getTileAppearingAnimationDuration() {
        return this.tileAppearingAnimationDuration;
    }

    public boolean getTransparent() {
        return this.transparent;
    }

    public boolean getVersionSupport() {
        return this.versionSupport;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.active = archive.add(this.active);
        this.nightModeAvailable = archive.add(this.nightModeAvailable);
        this.cacheable = archive.add(this.cacheable);
        this.animateOnActivation = archive.add(this.animateOnActivation);
        this.tileAppearingAnimationDuration = archive.add(this.tileAppearingAnimationDuration);
        this.overzoomMode = (OverzoomMode) archive.add((Archive) this.overzoomMode, false, (Class<Archive>) OverzoomMode.class);
        this.transparent = archive.add(this.transparent);
        this.versionSupport = archive.add(this.versionSupport);
    }

    public LayerOptions setActive(boolean z11) {
        this.active = z11;
        return this;
    }

    public LayerOptions setAnimateOnActivation(boolean z11) {
        this.animateOnActivation = z11;
        return this;
    }

    public LayerOptions setCacheable(boolean z11) {
        this.cacheable = z11;
        return this;
    }

    public LayerOptions setNightModeAvailable(boolean z11) {
        this.nightModeAvailable = z11;
        return this;
    }

    public LayerOptions setOverzoomMode(@NonNull OverzoomMode overzoomMode) {
        if (overzoomMode == null) {
            throw new IllegalArgumentException("Required field \"overzoomMode\" cannot be null");
        }
        this.overzoomMode = overzoomMode;
        return this;
    }

    public LayerOptions setTileAppearingAnimationDuration(long j11) {
        this.tileAppearingAnimationDuration = j11;
        return this;
    }

    public LayerOptions setTransparent(boolean z11) {
        this.transparent = z11;
        return this;
    }

    public LayerOptions setVersionSupport(boolean z11) {
        this.versionSupport = z11;
        return this;
    }

    public LayerOptions() {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.versionSupport = true;
    }
}

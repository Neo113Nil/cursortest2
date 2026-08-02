package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class ModelStyle implements Serializable {
    private RenderMode renderMode;
    private float scale;
    private UnitType unitType;
    private String variantName;

    public enum RenderMode {
        BUILDING,
        USER_MODEL
    }

    public enum UnitType {
        UNIT,
        NORMALIZED,
        METER
    }

    public ModelStyle(float f7, @NonNull UnitType unitType, @NonNull RenderMode renderMode, String str) {
        this.scale = 1.0f;
        this.unitType = UnitType.UNIT;
        this.renderMode = RenderMode.USER_MODEL;
        this.variantName = null;
        if (unitType == null) {
            throw new IllegalArgumentException("Required field \"unitType\" cannot be null");
        }
        if (renderMode == null) {
            throw new IllegalArgumentException("Required field \"renderMode\" cannot be null");
        }
        this.scale = f7;
        this.unitType = unitType;
        this.renderMode = renderMode;
        this.variantName = str;
    }

    @NonNull
    public RenderMode getRenderMode() {
        return this.renderMode;
    }

    public float getScale() {
        return this.scale;
    }

    @NonNull
    public UnitType getUnitType() {
        return this.unitType;
    }

    public String getVariantName() {
        return this.variantName;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.scale = archive.add(this.scale);
        this.unitType = (UnitType) archive.add((Archive) this.unitType, false, (Class<Archive>) UnitType.class);
        this.renderMode = (RenderMode) archive.add((Archive) this.renderMode, false, (Class<Archive>) RenderMode.class);
        this.variantName = archive.add(this.variantName, true);
    }

    public ModelStyle setRenderMode(@NonNull RenderMode renderMode) {
        if (renderMode == null) {
            throw new IllegalArgumentException("Required field \"renderMode\" cannot be null");
        }
        this.renderMode = renderMode;
        return this;
    }

    public ModelStyle setScale(float f7) {
        this.scale = f7;
        return this;
    }

    public ModelStyle setUnitType(@NonNull UnitType unitType) {
        if (unitType == null) {
            throw new IllegalArgumentException("Required field \"unitType\" cannot be null");
        }
        this.unitType = unitType;
        return this;
    }

    public ModelStyle setVariantName(String str) {
        this.variantName = str;
        return this;
    }

    public ModelStyle() {
        this.scale = 1.0f;
        this.unitType = UnitType.UNIT;
        this.renderMode = RenderMode.USER_MODEL;
        this.variantName = null;
    }
}

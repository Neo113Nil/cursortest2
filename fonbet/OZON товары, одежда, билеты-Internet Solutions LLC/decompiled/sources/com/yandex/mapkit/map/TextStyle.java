package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class TextStyle implements Serializable {
    private int color;
    private float offset;
    private boolean offsetFromIcon;
    private int outlineColor;
    private float outlineWidth;
    private Placement placement;
    private float size;
    private boolean textOptional;

    public enum Placement {
        CENTER,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public TextStyle(float f7, int i11, float f11, int i12, @NonNull Placement placement, float f12, boolean z11, boolean z12) {
        this.size = 8.0f;
        this.color = -16777216;
        this.outlineWidth = 1.0f;
        this.outlineColor = -1;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
        if (placement == null) {
            throw new IllegalArgumentException("Required field \"placement\" cannot be null");
        }
        this.size = f7;
        this.color = i11;
        this.outlineWidth = f11;
        this.outlineColor = i12;
        this.placement = placement;
        this.offset = f12;
        this.offsetFromIcon = z11;
        this.textOptional = z12;
    }

    public int getColor() {
        return this.color;
    }

    public float getOffset() {
        return this.offset;
    }

    public boolean getOffsetFromIcon() {
        return this.offsetFromIcon;
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public float getOutlineWidth() {
        return this.outlineWidth;
    }

    @NonNull
    public Placement getPlacement() {
        return this.placement;
    }

    public float getSize() {
        return this.size;
    }

    public boolean getTextOptional() {
        return this.textOptional;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.size = archive.add(this.size);
        this.color = archive.add(this.color);
        this.outlineWidth = archive.add(this.outlineWidth);
        this.outlineColor = archive.add(this.outlineColor);
        this.placement = (Placement) archive.add((Archive) this.placement, false, (Class<Archive>) Placement.class);
        this.offset = archive.add(this.offset);
        this.offsetFromIcon = archive.add(this.offsetFromIcon);
        this.textOptional = archive.add(this.textOptional);
    }

    public TextStyle setColor(int i11) {
        this.color = i11;
        return this;
    }

    public TextStyle setOffset(float f7) {
        this.offset = f7;
        return this;
    }

    public TextStyle setOffsetFromIcon(boolean z11) {
        this.offsetFromIcon = z11;
        return this;
    }

    public TextStyle setOutlineColor(int i11) {
        this.outlineColor = i11;
        return this;
    }

    public TextStyle setOutlineWidth(float f7) {
        this.outlineWidth = f7;
        return this;
    }

    public TextStyle setPlacement(@NonNull Placement placement) {
        if (placement == null) {
            throw new IllegalArgumentException("Required field \"placement\" cannot be null");
        }
        this.placement = placement;
        return this;
    }

    public TextStyle setSize(float f7) {
        this.size = f7;
        return this;
    }

    public TextStyle setTextOptional(boolean z11) {
        this.textOptional = z11;
        return this;
    }

    public TextStyle() {
        this.size = 8.0f;
        this.color = -16777216;
        this.outlineWidth = 1.0f;
        this.outlineColor = -1;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
    }
}

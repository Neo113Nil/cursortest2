package com.yandex.mapkit.places.panorama;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Direction;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ArrowConnection implements Serializable {
    private Direction angularPosition;
    private boolean angularPosition__is_initialized;
    private Style arrowStyle;
    private boolean arrowStyle__is_initialized;
    private String label;
    private boolean label__is_initialized;
    private NativeObject nativeObject;
    private String panoramaId;
    private boolean panoramaId__is_initialized;

    public enum Style {
        STREET,
        INDOOR,
        ENTRY
    }

    public ArrowConnection() {
        this.angularPosition__is_initialized = false;
        this.label__is_initialized = false;
        this.arrowStyle__is_initialized = false;
        this.panoramaId__is_initialized = false;
    }

    private native Direction getAngularPosition__Native();

    private native Style getArrowStyle__Native();

    private native String getLabel__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::panorama::ArrowConnection";
    }

    private native String getPanoramaId__Native();

    private native NativeObject init(Direction direction, String str, Style style, String str2);

    @NonNull
    public synchronized Direction getAngularPosition() {
        try {
            if (!this.angularPosition__is_initialized) {
                this.angularPosition = getAngularPosition__Native();
                this.angularPosition__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.angularPosition;
    }

    @NonNull
    public synchronized Style getArrowStyle() {
        try {
            if (!this.arrowStyle__is_initialized) {
                this.arrowStyle = getArrowStyle__Native();
                this.arrowStyle__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.arrowStyle;
    }

    @NonNull
    public synchronized String getLabel() {
        try {
            if (!this.label__is_initialized) {
                this.label = getLabel__Native();
                this.label__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.label;
    }

    @NonNull
    public synchronized String getPanoramaId() {
        try {
            if (!this.panoramaId__is_initialized) {
                this.panoramaId = getPanoramaId__Native();
                this.panoramaId__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.panoramaId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAngularPosition(), false, (Class<Archive>) Direction.class);
            archive.add(getLabel(), false);
            archive.add((Archive) getArrowStyle(), false, (Class<Archive>) Style.class);
            archive.add(getPanoramaId(), false);
            return;
        }
        this.angularPosition = (Direction) archive.add((Archive) this.angularPosition, false, (Class<Archive>) Direction.class);
        this.angularPosition__is_initialized = true;
        this.label = archive.add(this.label, false);
        this.label__is_initialized = true;
        this.arrowStyle = (Style) archive.add((Archive) this.arrowStyle, false, (Class<Archive>) Style.class);
        this.arrowStyle__is_initialized = true;
        String add = archive.add(this.panoramaId, false);
        this.panoramaId = add;
        this.panoramaId__is_initialized = true;
        this.nativeObject = init(this.angularPosition, this.label, this.arrowStyle, add);
    }

    public ArrowConnection(@NonNull Direction direction, @NonNull String str, @NonNull Style style, @NonNull String str2) {
        this.angularPosition__is_initialized = false;
        this.label__is_initialized = false;
        this.arrowStyle__is_initialized = false;
        this.panoramaId__is_initialized = false;
        if (direction == null) {
            throw new IllegalArgumentException("Required field \"angularPosition\" cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("Required field \"label\" cannot be null");
        }
        if (style == null) {
            throw new IllegalArgumentException("Required field \"arrowStyle\" cannot be null");
        }
        if (str2 != null) {
            this.nativeObject = init(direction, str, style, str2);
            this.angularPosition = direction;
            this.angularPosition__is_initialized = true;
            this.label = str;
            this.label__is_initialized = true;
            this.arrowStyle = style;
            this.arrowStyle__is_initialized = true;
            this.panoramaId = str2;
            this.panoramaId__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"panoramaId\" cannot be null");
    }

    private ArrowConnection(NativeObject nativeObject) {
        this.angularPosition__is_initialized = false;
        this.label__is_initialized = false;
        this.arrowStyle__is_initialized = false;
        this.panoramaId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

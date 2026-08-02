package com.yandex.mapkit.places.panorama;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Direction;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class IconMarker implements Serializable {
    private Direction angularPosition;
    private boolean angularPosition__is_initialized;
    private String iconId;
    private boolean iconId__is_initialized;
    private NativeObject nativeObject;

    public IconMarker() {
        this.angularPosition__is_initialized = false;
        this.iconId__is_initialized = false;
    }

    private native Direction getAngularPosition__Native();

    private native String getIconId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::panorama::IconMarker";
    }

    private native NativeObject init(Direction direction, String str);

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
    public synchronized String getIconId() {
        try {
            if (!this.iconId__is_initialized) {
                this.iconId = getIconId__Native();
                this.iconId__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.iconId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAngularPosition(), false, (Class<Archive>) Direction.class);
            archive.add(getIconId(), false);
            return;
        }
        this.angularPosition = (Direction) archive.add((Archive) this.angularPosition, false, (Class<Archive>) Direction.class);
        this.angularPosition__is_initialized = true;
        String add = archive.add(this.iconId, false);
        this.iconId = add;
        this.iconId__is_initialized = true;
        this.nativeObject = init(this.angularPosition, add);
    }

    public IconMarker(@NonNull Direction direction, @NonNull String str) {
        this.angularPosition__is_initialized = false;
        this.iconId__is_initialized = false;
        if (direction == null) {
            throw new IllegalArgumentException("Required field \"angularPosition\" cannot be null");
        }
        if (str != null) {
            this.nativeObject = init(direction, str);
            this.angularPosition = direction;
            this.angularPosition__is_initialized = true;
            this.iconId = str;
            this.iconId__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"iconId\" cannot be null");
    }

    private IconMarker(NativeObject nativeObject) {
        this.angularPosition__is_initialized = false;
        this.iconId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

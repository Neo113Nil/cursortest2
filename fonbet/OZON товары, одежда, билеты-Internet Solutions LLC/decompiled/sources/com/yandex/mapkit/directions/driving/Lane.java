package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Lane implements Serializable {
    private List<LaneDirection> directions;
    private boolean directions__is_initialized;
    private LaneDirection highlightedDirection;
    private boolean highlightedDirection__is_initialized;
    private LaneKind laneKind;
    private boolean laneKind__is_initialized;
    private NativeObject nativeObject;

    public Lane() {
        this.laneKind__is_initialized = false;
        this.directions__is_initialized = false;
        this.highlightedDirection__is_initialized = false;
    }

    private native List<LaneDirection> getDirections__Native();

    private native LaneDirection getHighlightedDirection__Native();

    private native LaneKind getLaneKind__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::Lane";
    }

    private native NativeObject init(LaneKind laneKind, List<LaneDirection> list, LaneDirection laneDirection);

    @NonNull
    public synchronized List<LaneDirection> getDirections() {
        try {
            if (!this.directions__is_initialized) {
                this.directions = getDirections__Native();
                this.directions__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.directions;
    }

    public synchronized LaneDirection getHighlightedDirection() {
        try {
            if (!this.highlightedDirection__is_initialized) {
                this.highlightedDirection = getHighlightedDirection__Native();
                this.highlightedDirection__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.highlightedDirection;
    }

    @NonNull
    public synchronized LaneKind getLaneKind() {
        try {
            if (!this.laneKind__is_initialized) {
                this.laneKind = getLaneKind__Native();
                this.laneKind__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.laneKind;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getLaneKind(), false, (Class<Archive>) LaneKind.class);
            archive.add((List) getDirections(), false, (ArchivingHandler) new EnumHandler(LaneDirection.class));
            archive.add((Archive) getHighlightedDirection(), true, (Class<Archive>) LaneDirection.class);
            return;
        }
        this.laneKind = (LaneKind) archive.add((Archive) this.laneKind, false, (Class<Archive>) LaneKind.class);
        this.laneKind__is_initialized = true;
        this.directions = archive.add((List) this.directions, false, (ArchivingHandler) new EnumHandler(LaneDirection.class));
        this.directions__is_initialized = true;
        LaneDirection laneDirection = (LaneDirection) archive.add((Archive) this.highlightedDirection, true, (Class<Archive>) LaneDirection.class);
        this.highlightedDirection = laneDirection;
        this.highlightedDirection__is_initialized = true;
        this.nativeObject = init(this.laneKind, this.directions, laneDirection);
    }

    public Lane(@NonNull LaneKind laneKind, @NonNull List<LaneDirection> list, LaneDirection laneDirection) {
        this.laneKind__is_initialized = false;
        this.directions__is_initialized = false;
        this.highlightedDirection__is_initialized = false;
        if (laneKind == null) {
            throw new IllegalArgumentException("Required field \"laneKind\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(laneKind, list, laneDirection);
            this.laneKind = laneKind;
            this.laneKind__is_initialized = true;
            this.directions = list;
            this.directions__is_initialized = true;
            this.highlightedDirection = laneDirection;
            this.highlightedDirection__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"directions\" cannot be null");
    }

    private Lane(NativeObject nativeObject) {
        this.laneKind__is_initialized = false;
        this.directions__is_initialized = false;
        this.highlightedDirection__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

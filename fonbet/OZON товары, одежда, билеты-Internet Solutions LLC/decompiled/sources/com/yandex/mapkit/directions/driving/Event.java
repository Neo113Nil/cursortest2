package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Event implements Serializable {
    private String descriptionText;
    private boolean descriptionText__is_initialized;
    private String eventId;
    private boolean eventId__is_initialized;
    private Point location;
    private boolean location__is_initialized;
    private NativeObject nativeObject;
    private PolylinePosition polylinePosition;
    private boolean polylinePosition__is_initialized;
    private Float speedLimit;
    private boolean speedLimit__is_initialized;
    private List<EventTag> tags;
    private boolean tags__is_initialized;

    public Event() {
        this.polylinePosition__is_initialized = false;
        this.eventId__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.tags__is_initialized = false;
        this.location__is_initialized = false;
        this.speedLimit__is_initialized = false;
    }

    private native String getDescriptionText__Native();

    private native String getEventId__Native();

    private native Point getLocation__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::Event";
    }

    private native PolylinePosition getPolylinePosition__Native();

    private native Float getSpeedLimit__Native();

    private native List<EventTag> getTags__Native();

    private native NativeObject init(PolylinePosition polylinePosition, String str, String str2, List<EventTag> list, Point point, Float f7);

    public synchronized String getDescriptionText() {
        try {
            if (!this.descriptionText__is_initialized) {
                this.descriptionText = getDescriptionText__Native();
                this.descriptionText__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.descriptionText;
    }

    @NonNull
    public synchronized String getEventId() {
        try {
            if (!this.eventId__is_initialized) {
                this.eventId = getEventId__Native();
                this.eventId__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.eventId;
    }

    @NonNull
    public synchronized Point getLocation() {
        try {
            if (!this.location__is_initialized) {
                this.location = getLocation__Native();
                this.location__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.location;
    }

    @NonNull
    public synchronized PolylinePosition getPolylinePosition() {
        try {
            if (!this.polylinePosition__is_initialized) {
                this.polylinePosition = getPolylinePosition__Native();
                this.polylinePosition__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.polylinePosition;
    }

    public synchronized Float getSpeedLimit() {
        try {
            if (!this.speedLimit__is_initialized) {
                this.speedLimit = getSpeedLimit__Native();
                this.speedLimit__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.speedLimit;
    }

    @NonNull
    public synchronized List<EventTag> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.tags;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPolylinePosition(), false, (Class<Archive>) PolylinePosition.class);
            archive.add(getEventId(), false);
            archive.add(getDescriptionText(), true);
            archive.add((List) getTags(), false, (ArchivingHandler) new EnumHandler(EventTag.class));
            archive.add((Archive) getLocation(), false, (Class<Archive>) Point.class);
            archive.add(getSpeedLimit(), true);
            return;
        }
        this.polylinePosition = (PolylinePosition) archive.add((Archive) this.polylinePosition, false, (Class<Archive>) PolylinePosition.class);
        this.polylinePosition__is_initialized = true;
        this.eventId = archive.add(this.eventId, false);
        this.eventId__is_initialized = true;
        this.descriptionText = archive.add(this.descriptionText, true);
        this.descriptionText__is_initialized = true;
        this.tags = archive.add((List) this.tags, false, (ArchivingHandler) new EnumHandler(EventTag.class));
        this.tags__is_initialized = true;
        this.location = (Point) archive.add((Archive) this.location, false, (Class<Archive>) Point.class);
        this.location__is_initialized = true;
        Float add = archive.add(this.speedLimit, true);
        this.speedLimit = add;
        this.speedLimit__is_initialized = true;
        this.nativeObject = init(this.polylinePosition, this.eventId, this.descriptionText, this.tags, this.location, add);
    }

    public Event(@NonNull PolylinePosition polylinePosition, @NonNull String str, String str2, @NonNull List<EventTag> list, @NonNull Point point, Float f7) {
        this.polylinePosition__is_initialized = false;
        this.eventId__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.tags__is_initialized = false;
        this.location__is_initialized = false;
        this.speedLimit__is_initialized = false;
        if (polylinePosition == null) {
            throw new IllegalArgumentException("Required field \"polylinePosition\" cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("Required field \"eventId\" cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Required field \"tags\" cannot be null");
        }
        if (point != null) {
            this.nativeObject = init(polylinePosition, str, str2, list, point, f7);
            this.polylinePosition = polylinePosition;
            this.polylinePosition__is_initialized = true;
            this.eventId = str;
            this.eventId__is_initialized = true;
            this.descriptionText = str2;
            this.descriptionText__is_initialized = true;
            this.tags = list;
            this.tags__is_initialized = true;
            this.location = point;
            this.location__is_initialized = true;
            this.speedLimit = f7;
            this.speedLimit__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"location\" cannot be null");
    }

    private Event(NativeObject nativeObject) {
        this.polylinePosition__is_initialized = false;
        this.eventId__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.tags__is_initialized = false;
        this.location__is_initialized = false;
        this.speedLimit__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

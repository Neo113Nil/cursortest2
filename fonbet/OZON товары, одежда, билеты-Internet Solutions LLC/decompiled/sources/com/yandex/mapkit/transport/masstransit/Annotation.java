package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Annotation implements Serializable {
    private ActionID action;
    private boolean action__is_initialized;
    private LandmarkID landmark;
    private boolean landmark__is_initialized;
    private NativeObject nativeObject;
    private PolylinePosition position;
    private boolean position__is_initialized;
    private Toponym toponym;
    private boolean toponym__is_initialized;

    public Annotation() {
        this.position__is_initialized = false;
        this.action__is_initialized = false;
        this.landmark__is_initialized = false;
        this.toponym__is_initialized = false;
    }

    private native ActionID getAction__Native();

    private native LandmarkID getLandmark__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Annotation";
    }

    private native PolylinePosition getPosition__Native();

    private native Toponym getToponym__Native();

    private native NativeObject init(PolylinePosition polylinePosition, ActionID actionID, LandmarkID landmarkID, Toponym toponym);

    public synchronized ActionID getAction() {
        try {
            if (!this.action__is_initialized) {
                this.action = getAction__Native();
                this.action__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.action;
    }

    public synchronized LandmarkID getLandmark() {
        try {
            if (!this.landmark__is_initialized) {
                this.landmark = getLandmark__Native();
                this.landmark__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.landmark;
    }

    @NonNull
    public synchronized PolylinePosition getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.position;
    }

    public synchronized Toponym getToponym() {
        try {
            if (!this.toponym__is_initialized) {
                this.toponym = getToponym__Native();
                this.toponym__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.toponym;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPosition(), false, (Class<Archive>) PolylinePosition.class);
            archive.add((Archive) getAction(), true, (Class<Archive>) ActionID.class);
            archive.add((Archive) getLandmark(), true, (Class<Archive>) LandmarkID.class);
            archive.add((Archive) getToponym(), true, (Class<Archive>) Toponym.class);
            return;
        }
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.position__is_initialized = true;
        this.action = (ActionID) archive.add((Archive) this.action, true, (Class<Archive>) ActionID.class);
        this.action__is_initialized = true;
        this.landmark = (LandmarkID) archive.add((Archive) this.landmark, true, (Class<Archive>) LandmarkID.class);
        this.landmark__is_initialized = true;
        Toponym toponym = (Toponym) archive.add((Archive) this.toponym, true, (Class<Archive>) Toponym.class);
        this.toponym = toponym;
        this.toponym__is_initialized = true;
        this.nativeObject = init(this.position, this.action, this.landmark, toponym);
    }

    public Annotation(@NonNull PolylinePosition polylinePosition, ActionID actionID, LandmarkID landmarkID, Toponym toponym) {
        this.position__is_initialized = false;
        this.action__is_initialized = false;
        this.landmark__is_initialized = false;
        this.toponym__is_initialized = false;
        if (polylinePosition != null) {
            this.nativeObject = init(polylinePosition, actionID, landmarkID, toponym);
            this.position = polylinePosition;
            this.position__is_initialized = true;
            this.action = actionID;
            this.action__is_initialized = true;
            this.landmark = landmarkID;
            this.landmark__is_initialized = true;
            this.toponym = toponym;
            this.toponym__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"position\" cannot be null");
    }

    private Annotation(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.action__is_initialized = false;
        this.landmark__is_initialized = false;
        this.toponym__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class IndoorSegment implements Serializable {
    private IndoorData indoorData;
    private Subpolyline subpolyline;

    public static class IndoorData implements Serializable {
        private Connector connector;
        private IndoorLevel indoorLevel;

        @NonNull
        public static IndoorData fromConnector(@NonNull Connector connector) {
            if (connector == null) {
                throw new IllegalArgumentException("Variant value \"connector\" cannot be null");
            }
            IndoorData indoorData = new IndoorData();
            indoorData.connector = connector;
            return indoorData;
        }

        @NonNull
        public static IndoorData fromIndoorLevel(@NonNull IndoorLevel indoorLevel) {
            if (indoorLevel == null) {
                throw new IllegalArgumentException("Variant value \"indoorLevel\" cannot be null");
            }
            IndoorData indoorData = new IndoorData();
            indoorData.indoorLevel = indoorLevel;
            return indoorData;
        }

        public Connector getConnector() {
            return this.connector;
        }

        public IndoorLevel getIndoorLevel() {
            return this.indoorLevel;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.indoorLevel = (IndoorLevel) archive.add((Archive) this.indoorLevel, true, (Class<Archive>) IndoorLevel.class);
            this.connector = (Connector) archive.add((Archive) this.connector, true, (Class<Archive>) Connector.class);
        }
    }

    public IndoorSegment(@NonNull IndoorData indoorData, @NonNull Subpolyline subpolyline) {
        if (indoorData == null) {
            throw new IllegalArgumentException("Required field \"indoorData\" cannot be null");
        }
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"subpolyline\" cannot be null");
        }
        this.indoorData = indoorData;
        this.subpolyline = subpolyline;
    }

    @NonNull
    public IndoorData getIndoorData() {
        return this.indoorData;
    }

    @NonNull
    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.indoorData = (IndoorData) archive.add((Archive) this.indoorData, false, (Class<Archive>) IndoorData.class);
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
    }

    public IndoorSegment() {
    }
}

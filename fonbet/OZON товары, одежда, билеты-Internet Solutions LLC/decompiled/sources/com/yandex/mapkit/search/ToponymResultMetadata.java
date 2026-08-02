package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ToponymResultMetadata implements BaseMetadata, Serializable {
    private int found;
    private boolean found__is_initialized;
    private NativeObject nativeObject;
    private ResponseInfo responseInfo;
    private boolean responseInfo__is_initialized;
    private Point reversePoint;
    private boolean reversePoint__is_initialized;

    public enum SearchMode {
        GEOCODE,
        REVERSE
    }

    public ToponymResultMetadata() {
        this.found__is_initialized = false;
        this.responseInfo__is_initialized = false;
        this.reversePoint__is_initialized = false;
    }

    private native int getFound__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ToponymResultMetadata";
    }

    private native ResponseInfo getResponseInfo__Native();

    private native Point getReversePoint__Native();

    private native NativeObject init(int i11, ResponseInfo responseInfo, Point point);

    public synchronized int getFound() {
        try {
            if (!this.found__is_initialized) {
                this.found = getFound__Native();
                this.found__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.found;
    }

    public synchronized ResponseInfo getResponseInfo() {
        try {
            if (!this.responseInfo__is_initialized) {
                this.responseInfo = getResponseInfo__Native();
                this.responseInfo__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.responseInfo;
    }

    public synchronized Point getReversePoint() {
        try {
            if (!this.reversePoint__is_initialized) {
                this.reversePoint = getReversePoint__Native();
                this.reversePoint__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.reversePoint;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getFound());
            archive.add((Archive) getResponseInfo(), true, (Class<Archive>) ResponseInfo.class);
            archive.add((Archive) getReversePoint(), true, (Class<Archive>) Point.class);
            return;
        }
        this.found = archive.add(this.found);
        this.found__is_initialized = true;
        this.responseInfo = (ResponseInfo) archive.add((Archive) this.responseInfo, true, (Class<Archive>) ResponseInfo.class);
        this.responseInfo__is_initialized = true;
        Point point = (Point) archive.add((Archive) this.reversePoint, true, (Class<Archive>) Point.class);
        this.reversePoint = point;
        this.reversePoint__is_initialized = true;
        this.nativeObject = init(this.found, this.responseInfo, point);
    }

    public static class ResponseInfo implements Serializable {
        private Double accuracy;
        private SearchMode mode;

        public ResponseInfo(@NonNull SearchMode searchMode, Double d11) {
            if (searchMode == null) {
                throw new IllegalArgumentException("Required field \"mode\" cannot be null");
            }
            this.mode = searchMode;
            this.accuracy = d11;
        }

        public Double getAccuracy() {
            return this.accuracy;
        }

        @NonNull
        public SearchMode getMode() {
            return this.mode;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.mode = (SearchMode) archive.add((Archive) this.mode, false, (Class<Archive>) SearchMode.class);
            this.accuracy = archive.add(this.accuracy, true);
        }

        public ResponseInfo() {
        }
    }

    public ToponymResultMetadata(int i11, ResponseInfo responseInfo, Point point) {
        this.found__is_initialized = false;
        this.responseInfo__is_initialized = false;
        this.reversePoint__is_initialized = false;
        this.nativeObject = init(i11, responseInfo, point);
        this.found = i11;
        this.found__is_initialized = true;
        this.responseInfo = responseInfo;
        this.responseInfo__is_initialized = true;
        this.reversePoint = point;
        this.reversePoint__is_initialized = true;
    }

    private ToponymResultMetadata(NativeObject nativeObject) {
        this.found__is_initialized = false;
        this.responseInfo__is_initialized = false;
        this.reversePoint__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

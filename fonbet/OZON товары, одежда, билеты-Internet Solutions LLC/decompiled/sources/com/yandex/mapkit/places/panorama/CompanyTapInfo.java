package com.yandex.mapkit.places.panorama;

import androidx.annotation.NonNull;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class CompanyTapInfo implements Serializable {
    private NativeObject nativeObject;
    private String permalink;
    private boolean permalink__is_initialized;
    private ScreenPoint screenPoint;
    private boolean screenPoint__is_initialized;

    public CompanyTapInfo() {
        this.permalink__is_initialized = false;
        this.screenPoint__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::panorama::CompanyTapInfo";
    }

    private native String getPermalink__Native();

    private native ScreenPoint getScreenPoint__Native();

    private native NativeObject init(String str, ScreenPoint screenPoint);

    @NonNull
    public synchronized String getPermalink() {
        try {
            if (!this.permalink__is_initialized) {
                this.permalink = getPermalink__Native();
                this.permalink__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.permalink;
    }

    @NonNull
    public synchronized ScreenPoint getScreenPoint() {
        try {
            if (!this.screenPoint__is_initialized) {
                this.screenPoint = getScreenPoint__Native();
                this.screenPoint__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.screenPoint;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPermalink(), false);
            archive.add((Archive) getScreenPoint(), false, (Class<Archive>) ScreenPoint.class);
            return;
        }
        this.permalink = archive.add(this.permalink, false);
        this.permalink__is_initialized = true;
        ScreenPoint screenPoint = (ScreenPoint) archive.add((Archive) this.screenPoint, false, (Class<Archive>) ScreenPoint.class);
        this.screenPoint = screenPoint;
        this.screenPoint__is_initialized = true;
        this.nativeObject = init(this.permalink, screenPoint);
    }

    public CompanyTapInfo(@NonNull String str, @NonNull ScreenPoint screenPoint) {
        this.permalink__is_initialized = false;
        this.screenPoint__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"permalink\" cannot be null");
        }
        if (screenPoint != null) {
            this.nativeObject = init(str, screenPoint);
            this.permalink = str;
            this.permalink__is_initialized = true;
            this.screenPoint = screenPoint;
            this.screenPoint__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"screenPoint\" cannot be null");
    }

    private CompanyTapInfo(NativeObject nativeObject) {
        this.permalink__is_initialized = false;
        this.screenPoint__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class BusinessRating1xObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private int ratings;
    private boolean ratings__is_initialized;
    private int reviews;
    private boolean reviews__is_initialized;
    private Float score;
    private boolean score__is_initialized;

    public BusinessRating1xObjectMetadata() {
        this.ratings__is_initialized = false;
        this.reviews__is_initialized = false;
        this.score__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BusinessRating1xObjectMetadata";
    }

    private native int getRatings__Native();

    private native int getReviews__Native();

    private native Float getScore__Native();

    private native NativeObject init(int i11, int i12, Float f7);

    public synchronized int getRatings() {
        try {
            if (!this.ratings__is_initialized) {
                this.ratings = getRatings__Native();
                this.ratings__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.ratings;
    }

    public synchronized int getReviews() {
        try {
            if (!this.reviews__is_initialized) {
                this.reviews = getReviews__Native();
                this.reviews__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.reviews;
    }

    public synchronized Float getScore() {
        try {
            if (!this.score__is_initialized) {
                this.score = getScore__Native();
                this.score__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.score;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getRatings());
            archive.add(getReviews());
            archive.add(getScore(), true);
            return;
        }
        this.ratings = archive.add(this.ratings);
        this.ratings__is_initialized = true;
        this.reviews = archive.add(this.reviews);
        this.reviews__is_initialized = true;
        Float add = archive.add(this.score, true);
        this.score = add;
        this.score__is_initialized = true;
        this.nativeObject = init(this.ratings, this.reviews, add);
    }

    public BusinessRating1xObjectMetadata(int i11, int i12, Float f7) {
        this.ratings__is_initialized = false;
        this.reviews__is_initialized = false;
        this.score__is_initialized = false;
        this.nativeObject = init(i11, i12, f7);
        this.ratings = i11;
        this.ratings__is_initialized = true;
        this.reviews = i12;
        this.reviews__is_initialized = true;
        this.score = f7;
        this.score__is_initialized = true;
    }

    private BusinessRating1xObjectMetadata(NativeObject nativeObject) {
        this.ratings__is_initialized = false;
        this.reviews__is_initialized = false;
        this.score__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

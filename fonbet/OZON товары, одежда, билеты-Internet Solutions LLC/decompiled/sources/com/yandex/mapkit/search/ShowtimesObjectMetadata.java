package com.yandex.mapkit.search;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class ShowtimesObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<Showtime> showtimes;
    private boolean showtimes__is_initialized;
    private String title;
    private boolean title__is_initialized;

    public ShowtimesObjectMetadata() {
        this.title__is_initialized = false;
        this.showtimes__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ShowtimesObjectMetadata";
    }

    private native List<Showtime> getShowtimes__Native();

    private native String getTitle__Native();

    private native NativeObject init(String str, List<Showtime> list);

    @NonNull
    public synchronized List<Showtime> getShowtimes() {
        try {
            if (!this.showtimes__is_initialized) {
                this.showtimes = getShowtimes__Native();
                this.showtimes__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.showtimes;
    }

    @NonNull
    public synchronized String getTitle() {
        try {
            if (!this.title__is_initialized) {
                this.title = getTitle__Native();
                this.title__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.title;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getTitle(), false);
            C2616s.f(Showtime.class, archive, getShowtimes(), false);
            return;
        }
        this.title = archive.add(this.title, false);
        this.title__is_initialized = true;
        List<Showtime> d11 = G.d(Showtime.class, archive, this.showtimes, false);
        this.showtimes = d11;
        this.showtimes__is_initialized = true;
        this.nativeObject = init(this.title, d11);
    }

    public ShowtimesObjectMetadata(@NonNull String str, @NonNull List<Showtime> list) {
        this.title__is_initialized = false;
        this.showtimes__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"title\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(str, list);
            this.title = str;
            this.title__is_initialized = true;
            this.showtimes = list;
            this.showtimes__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"showtimes\" cannot be null");
    }

    private ShowtimesObjectMetadata(NativeObject nativeObject) {
        this.title__is_initialized = false;
        this.showtimes__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

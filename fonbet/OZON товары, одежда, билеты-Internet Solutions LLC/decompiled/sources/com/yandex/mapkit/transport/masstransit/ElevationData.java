package com.yandex.mapkit.transport.masstransit;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class ElevationData implements Serializable {
    private List<ElevationPoint> elevationSegments;
    private boolean elevationSegments__is_initialized;
    private List<InclineSection> inclineSections;
    private boolean inclineSections__is_initialized;
    private LocalizedValue kilocalories;
    private boolean kilocalories__is_initialized;
    private NativeObject nativeObject;
    private LocalizedValue steps;
    private boolean steps__is_initialized;
    private LocalizedValue totalAscent;
    private boolean totalAscent__is_initialized;
    private LocalizedValue totalDescent;
    private boolean totalDescent__is_initialized;

    public ElevationData() {
        this.totalAscent__is_initialized = false;
        this.totalDescent__is_initialized = false;
        this.steps__is_initialized = false;
        this.kilocalories__is_initialized = false;
        this.inclineSections__is_initialized = false;
        this.elevationSegments__is_initialized = false;
    }

    private native List<ElevationPoint> getElevationSegments__Native();

    private native List<InclineSection> getInclineSections__Native();

    private native LocalizedValue getKilocalories__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::ElevationData";
    }

    private native LocalizedValue getSteps__Native();

    private native LocalizedValue getTotalAscent__Native();

    private native LocalizedValue getTotalDescent__Native();

    private native NativeObject init(LocalizedValue localizedValue, LocalizedValue localizedValue2, LocalizedValue localizedValue3, LocalizedValue localizedValue4, List<InclineSection> list, List<ElevationPoint> list2);

    @NonNull
    public synchronized List<ElevationPoint> getElevationSegments() {
        try {
            if (!this.elevationSegments__is_initialized) {
                this.elevationSegments = getElevationSegments__Native();
                this.elevationSegments__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.elevationSegments;
    }

    @NonNull
    public synchronized List<InclineSection> getInclineSections() {
        try {
            if (!this.inclineSections__is_initialized) {
                this.inclineSections = getInclineSections__Native();
                this.inclineSections__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.inclineSections;
    }

    @NonNull
    public synchronized LocalizedValue getKilocalories() {
        try {
            if (!this.kilocalories__is_initialized) {
                this.kilocalories = getKilocalories__Native();
                this.kilocalories__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.kilocalories;
    }

    public synchronized LocalizedValue getSteps() {
        try {
            if (!this.steps__is_initialized) {
                this.steps = getSteps__Native();
                this.steps__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.steps;
    }

    @NonNull
    public synchronized LocalizedValue getTotalAscent() {
        try {
            if (!this.totalAscent__is_initialized) {
                this.totalAscent = getTotalAscent__Native();
                this.totalAscent__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.totalAscent;
    }

    @NonNull
    public synchronized LocalizedValue getTotalDescent() {
        try {
            if (!this.totalDescent__is_initialized) {
                this.totalDescent = getTotalDescent__Native();
                this.totalDescent__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.totalDescent;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getTotalAscent(), false, (Class<Archive>) LocalizedValue.class);
            archive.add((Archive) getTotalDescent(), false, (Class<Archive>) LocalizedValue.class);
            archive.add((Archive) getSteps(), true, (Class<Archive>) LocalizedValue.class);
            archive.add((Archive) getKilocalories(), false, (Class<Archive>) LocalizedValue.class);
            archive.add((List) getInclineSections(), false, (ArchivingHandler) new ClassHandler(InclineSection.class));
            C2616s.f(ElevationPoint.class, archive, getElevationSegments(), false);
            return;
        }
        this.totalAscent = (LocalizedValue) archive.add((Archive) this.totalAscent, false, (Class<Archive>) LocalizedValue.class);
        this.totalAscent__is_initialized = true;
        this.totalDescent = (LocalizedValue) archive.add((Archive) this.totalDescent, false, (Class<Archive>) LocalizedValue.class);
        this.totalDescent__is_initialized = true;
        this.steps = (LocalizedValue) archive.add((Archive) this.steps, true, (Class<Archive>) LocalizedValue.class);
        this.steps__is_initialized = true;
        this.kilocalories = (LocalizedValue) archive.add((Archive) this.kilocalories, false, (Class<Archive>) LocalizedValue.class);
        this.kilocalories__is_initialized = true;
        this.inclineSections = G.d(InclineSection.class, archive, this.inclineSections, false);
        this.inclineSections__is_initialized = true;
        List<ElevationPoint> d11 = G.d(ElevationPoint.class, archive, this.elevationSegments, false);
        this.elevationSegments = d11;
        this.elevationSegments__is_initialized = true;
        this.nativeObject = init(this.totalAscent, this.totalDescent, this.steps, this.kilocalories, this.inclineSections, d11);
    }

    public ElevationData(@NonNull LocalizedValue localizedValue, @NonNull LocalizedValue localizedValue2, LocalizedValue localizedValue3, @NonNull LocalizedValue localizedValue4, @NonNull List<InclineSection> list, @NonNull List<ElevationPoint> list2) {
        this.totalAscent__is_initialized = false;
        this.totalDescent__is_initialized = false;
        this.steps__is_initialized = false;
        this.kilocalories__is_initialized = false;
        this.inclineSections__is_initialized = false;
        this.elevationSegments__is_initialized = false;
        if (localizedValue == null) {
            throw new IllegalArgumentException("Required field \"totalAscent\" cannot be null");
        }
        if (localizedValue2 == null) {
            throw new IllegalArgumentException("Required field \"totalDescent\" cannot be null");
        }
        if (localizedValue4 == null) {
            throw new IllegalArgumentException("Required field \"kilocalories\" cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Required field \"inclineSections\" cannot be null");
        }
        if (list2 != null) {
            this.nativeObject = init(localizedValue, localizedValue2, localizedValue3, localizedValue4, list, list2);
            this.totalAscent = localizedValue;
            this.totalAscent__is_initialized = true;
            this.totalDescent = localizedValue2;
            this.totalDescent__is_initialized = true;
            this.steps = localizedValue3;
            this.steps__is_initialized = true;
            this.kilocalories = localizedValue4;
            this.kilocalories__is_initialized = true;
            this.inclineSections = list;
            this.inclineSections__is_initialized = true;
            this.elevationSegments = list2;
            this.elevationSegments__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"elevationSegments\" cannot be null");
    }

    private ElevationData(NativeObject nativeObject) {
        this.totalAscent__is_initialized = false;
        this.totalDescent__is_initialized = false;
        this.steps__is_initialized = false;
        this.kilocalories__is_initialized = false;
        this.inclineSections__is_initialized = false;
        this.elevationSegments__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}

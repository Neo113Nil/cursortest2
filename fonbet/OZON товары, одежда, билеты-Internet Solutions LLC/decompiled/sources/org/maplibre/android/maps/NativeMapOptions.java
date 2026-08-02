package org.maplibre.android.maps;

/* loaded from: classes10.dex */
public class NativeMapOptions {
    private final boolean actionJournalEnabled;
    private final long actionJournalLogFileCount;
    private final long actionJournalLogFileSize;
    private final String actionJournalPath;
    private final int actionJournalRenderingReportInterval;
    private final boolean crossSourceCollisions;
    private final float pixelRatio;

    public NativeMapOptions(MapLibreMapOptions mapLibreMapOptions) {
        this.pixelRatio = mapLibreMapOptions.getPixelRatio();
        this.crossSourceCollisions = mapLibreMapOptions.w();
        this.actionJournalEnabled = mapLibreMapOptions.d();
        this.actionJournalPath = mapLibreMapOptions.g();
        this.actionJournalLogFileSize = mapLibreMapOptions.f();
        this.actionJournalLogFileCount = mapLibreMapOptions.e();
        this.actionJournalRenderingReportInterval = mapLibreMapOptions.h();
    }

    public boolean actionJournalEnabled() {
        return this.actionJournalEnabled;
    }

    public long actionJournalLogFileCount() {
        return this.actionJournalLogFileCount;
    }

    public long actionJournalLogFileSize() {
        return this.actionJournalLogFileSize;
    }

    public String actionJournalPath() {
        return this.actionJournalPath;
    }

    public int actionJournalRenderingReportInterval() {
        return this.actionJournalRenderingReportInterval;
    }

    public boolean crossSourceCollisions() {
        return this.crossSourceCollisions;
    }

    public float pixelRatio() {
        return this.pixelRatio;
    }

    public NativeMapOptions(float f7, boolean z11) {
        this.pixelRatio = f7;
        this.crossSourceCollisions = z11;
        this.actionJournalEnabled = false;
        this.actionJournalPath = "";
        this.actionJournalLogFileSize = 0L;
        this.actionJournalLogFileCount = 0L;
        this.actionJournalRenderingReportInterval = 0;
    }
}

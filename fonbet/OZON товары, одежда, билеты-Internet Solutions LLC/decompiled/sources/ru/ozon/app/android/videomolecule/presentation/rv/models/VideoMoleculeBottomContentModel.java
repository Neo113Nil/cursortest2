package ru.ozon.app.android.videomolecule.presentation.rv.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "", "", "viewType", "", "widgetId", "<init>", "(IJ)V", "I", "getViewType", "()I", "J", "getWidgetId", "()J", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class VideoMoleculeBottomContentModel {
    private final int viewType;
    private final long widgetId;

    public VideoMoleculeBottomContentModel(int i11, long j11) {
        this.viewType = i11;
        this.widgetId = j11;
    }

    public final int getViewType() {
        return this.viewType;
    }
}

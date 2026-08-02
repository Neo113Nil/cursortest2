package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering;

import androidx.annotation.NonNull;
import we0.m;

/* loaded from: classes3.dex */
public interface ClusterItem {
    @NonNull
    String getItemId();

    @NonNull
    m getPosition();

    String getSnippet();

    String getTitle();

    Float getZIndex();

    boolean isProcessed();

    default boolean isSeparated() {
        return false;
    }

    void updateProcessedState(boolean z11);
}

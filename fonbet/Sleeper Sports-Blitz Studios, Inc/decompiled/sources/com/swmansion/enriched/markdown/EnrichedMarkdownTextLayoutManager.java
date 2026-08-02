package com.swmansion.enriched.markdown;

import android.text.TextPaint;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrichedMarkdownTextLayoutManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/swmansion/enriched/markdown/EnrichedMarkdownTextLayoutManager;", "", ViewHierarchyConstants.VIEW_KEY, "Lcom/swmansion/enriched/markdown/EnrichedMarkdownText;", "<init>", "(Lcom/swmansion/enriched/markdown/EnrichedMarkdownText;)V", "forceHeightRecalculationCounter", "", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "invalidateLayout", "", "releaseMeasurementStore", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EnrichedMarkdownTextLayoutManager {
    private int forceHeightRecalculationCounter;
    private StateWrapper stateWrapper;
    private final EnrichedMarkdownText view;

    public EnrichedMarkdownTextLayoutManager(EnrichedMarkdownText view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final StateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.stateWrapper = stateWrapper;
    }

    public final void invalidateLayout() {
        CharSequence text = this.view.getText();
        TextPaint paint = this.view.getPaint();
        MeasurementStore measurementStore = MeasurementStore.INSTANCE;
        int id = this.view.getId();
        Intrinsics.checkNotNull(paint);
        if (measurementStore.store(id, text, paint)) {
            int i = this.forceHeightRecalculationCounter;
            this.forceHeightRecalculationCounter = i + 1;
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("forceHeightRecalculationCounter", i);
            StateWrapper stateWrapper = this.stateWrapper;
            if (stateWrapper != null) {
                stateWrapper.updateState(createMap);
            }
        }
    }

    public final void releaseMeasurementStore() {
        MeasurementStore.INSTANCE.release(this.view.getId());
    }
}

package com.swmansion.enriched.markdown;

import android.content.Context;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.EnrichedMarkdownTextManagerDelegate;
import com.facebook.react.viewmanagers.EnrichedMarkdownTextManagerInterface;
import com.facebook.yoga.YogaMeasureMode;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrichedMarkdownTextManager.kt */
@ReactModule(name = EnrichedMarkdownTextManager.NAME)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0017J\u001c\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0017J\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020 H\u0017J0\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0016J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\nH\u0002J\\\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001d2\b\u0010.\u001a\u0004\u0018\u00010\u001d2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002002\b\u00104\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000106H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/swmansion/enriched/markdown/EnrichedMarkdownTextManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/swmansion/enriched/markdown/EnrichedMarkdownText;", "Lcom/facebook/react/viewmanagers/EnrichedMarkdownTextManagerInterface;", "<init>", "()V", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", ViewHierarchyConstants.VIEW_KEY, "updateState", "", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getExportedCustomDirectEventTypeConstants", "", "setMarkdown", "markdown", "setMarkdownStyle", "style", "Lcom/facebook/react/bridge/ReadableMap;", "setIsSelectable", "selectable", "", "setPadding", "left", "", "top", "right", "bottom", "emitOnLinkPress", "url", "measure", "", "context", "Landroid/content/Context;", "localData", "state", "width", "", "widthMode", "Lcom/facebook/yoga/YogaMeasureMode;", "height", "heightMode", "attachmentsPositions", "", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EnrichedMarkdownTextManager extends SimpleViewManager<EnrichedMarkdownText> implements EnrichedMarkdownTextManagerInterface<EnrichedMarkdownText> {
    public static final String NAME = "EnrichedMarkdownText";
    private final ViewManagerDelegate<EnrichedMarkdownText> mDelegate = new EnrichedMarkdownTextManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<EnrichedMarkdownText> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public EnrichedMarkdownText createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new EnrichedMarkdownText(reactContext, null, 0, 6, null);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(EnrichedMarkdownText view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance((EnrichedMarkdownTextManager) view);
        view.getLayoutManager().releaseMeasurementStore();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(EnrichedMarkdownText view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getLayoutManager().setStateWrapper(stateWrapper);
        return super.updateState((EnrichedMarkdownTextManager) view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(LinkPressEvent.EVENT_NAME, MapsKt.mapOf(TuplesKt.to("registrationName", LinkPressEvent.EVENT_NAME)));
        return linkedHashMap;
    }

    @Override // com.facebook.react.viewmanagers.EnrichedMarkdownTextManagerInterface
    @ReactProp(name = "markdown")
    public void setMarkdown(final EnrichedMarkdownText view, String markdown) {
        if (view != null) {
            view.setOnLinkPressCallback(new Function1() { // from class: com.swmansion.enriched.markdown.EnrichedMarkdownTextManager$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit markdown$lambda$0;
                    markdown$lambda$0 = EnrichedMarkdownTextManager.setMarkdown$lambda$0(EnrichedMarkdownTextManager.this, view, (String) obj);
                    return markdown$lambda$0;
                }
            });
        }
        if (view != null) {
            if (markdown == null) {
                markdown = "No markdown content";
            }
            view.setMarkdownContent(markdown);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMarkdown$lambda$0(EnrichedMarkdownTextManager enrichedMarkdownTextManager, EnrichedMarkdownText enrichedMarkdownText, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        enrichedMarkdownTextManager.emitOnLinkPress(enrichedMarkdownText, url);
        return Unit.INSTANCE;
    }

    @Override // com.facebook.react.viewmanagers.EnrichedMarkdownTextManagerInterface
    @ReactProp(name = "markdownStyle")
    public void setMarkdownStyle(EnrichedMarkdownText view, ReadableMap style) {
        if (view != null) {
            view.setMarkdownStyle(style);
        }
    }

    @Override // com.facebook.react.viewmanagers.EnrichedMarkdownTextManagerInterface
    @ReactProp(defaultBoolean = true, name = "isSelectable")
    public void setIsSelectable(EnrichedMarkdownText view, boolean selectable) {
        if (view != null) {
            view.setIsSelectable(selectable);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(EnrichedMarkdownText view, int left, int top, int right, int bottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setPadding((EnrichedMarkdownTextManager) view, left, top, right, bottom);
        view.setPadding(left, top, right, bottom);
    }

    private final void emitOnLinkPress(EnrichedMarkdownText view, String url) {
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, view.getId());
        LinkPressEvent linkPressEvent = new LinkPressEvent(surfaceId, view.getId(), url);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(linkPressEvent);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap localData, ReadableMap props, ReadableMap state, float width, YogaMeasureMode widthMode, float height, YogaMeasureMode heightMode, float[] attachmentsPositions) {
        Intrinsics.checkNotNullParameter(context, "context");
        return MeasurementStore.INSTANCE.getMeasureById(context, localData != null ? Integer.valueOf(localData.getInt("viewTag")) : null, width, height, heightMode, props);
    }
}

package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.DebuggingOverlayManagerDelegate;
import com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;

@ReactModule(name = DebuggingOverlayManager.REACT_CLASS)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlay;", "Lcom/facebook/react/viewmanagers/DebuggingOverlayManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "highlightTraceUpdates", "", "view", "updates", "Lcom/facebook/react/bridge/ReadableArray;", "highlightElements", "elements", "clearElementsHighlights", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebuggingOverlayManager extends SimpleViewManager<DebuggingOverlay> implements DebuggingOverlayManagerInterface<DebuggingOverlay> {

    @NotNull
    public static final String REACT_CLASS = "DebuggingOverlay";

    @NotNull
    private final ViewManagerDelegate<DebuggingOverlay> delegate = new DebuggingOverlayManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<DebuggingOverlay> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface
    public void clearElementsHighlights(@NotNull DebuggingOverlay view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.clearElementsHighlights();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DebuggingOverlay createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DebuggingOverlay(context);
    }

    @Override // com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface
    public void highlightElements(@NotNull DebuggingOverlay view, @NotNull ReadableArray elements) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList();
        int size = elements.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = elements.getMap(i10);
            if (map != null) {
                try {
                    float f10 = (float) map.getDouble(C5444x.f55808b);
                    float f11 = (float) map.getDouble("y");
                    float f12 = (float) (f10 + map.getDouble("width"));
                    float f13 = (float) (f11 + map.getDouble("height"));
                    PixelUtil pixelUtil = PixelUtil.INSTANCE;
                    arrayList.add(new RectF(pixelUtil.dpToPx(f10), pixelUtil.dpToPx(f11), pixelUtil.dpToPx(f12), pixelUtil.dpToPx(f13)));
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchKeyException) && !(e10 instanceof UnexpectedNativeTypeException)) {
                        throw e10;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                    Unit unit = Unit.INSTANCE;
                    z10 = false;
                }
            }
        }
        if (z10) {
            view.setHighlightedElementsRectangles(arrayList);
        }
    }

    @Override // com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface
    public void highlightTraceUpdates(@NotNull DebuggingOverlay view, @NotNull ReadableArray updates) {
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(updates, "updates");
        ArrayList arrayList = new ArrayList();
        int size = updates.size();
        boolean z11 = true;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = z11;
                break;
            }
            ReadableMap map = updates.getMap(i10);
            if (map != null) {
                ReadableMap map2 = map.getMap("rectangle");
                if (map2 == null) {
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field is null"));
                    z10 = false;
                    break;
                }
                int i11 = map.getInt(StackTraceHelper.ID_KEY);
                int i12 = map.getInt(ViewProps.COLOR);
                try {
                    float f10 = (float) map2.getDouble(C5444x.f55808b);
                    float f11 = (float) map2.getDouble("y");
                    float f12 = (float) (f10 + map2.getDouble("width"));
                    float f13 = (float) (f11 + map2.getDouble("height"));
                    PixelUtil pixelUtil = PixelUtil.INSTANCE;
                    arrayList.add(new TraceUpdate(i11, new RectF(pixelUtil.dpToPx(f10), pixelUtil.dpToPx(f11), pixelUtil.dpToPx(f12), pixelUtil.dpToPx(f13)), i12));
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchKeyException) && !(e10 instanceof UnexpectedNativeTypeException)) {
                        throw e10;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"));
                    Unit unit = Unit.INSTANCE;
                    z11 = false;
                }
            }
            i10++;
        }
        if (z10) {
            view.setTraceUpdates(arrayList);
        }
    }
}

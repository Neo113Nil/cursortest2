package com.mattermost.pasteinputtext;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.views.textinput.ReactTextInputManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PasteTextInputManager.kt */
@ReactModule(name = PasteTextInputManager.NAME)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0014H\u0014J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/mattermost/pasteinputtext/PasteTextInputManager;", "Lcom/facebook/react/views/textinput/ReactTextInputManager;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "disableCopyPaste", "", "mContext", "getName", "", "setDisableCopyPaste", "", "editText", "Lcom/mattermost/pasteinputtext/PasteInputEditText;", "disabled", "getEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/views/textinput/ReactEditText;", "createViewInstance", "Lcom/facebook/react/uimanager/ThemedReactContext;", "addEventEmitters", "getExportedCustomBubblingEventTypeConstants", "", "", "Companion", "mattermost_react-native-paste-input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PasteTextInputManager extends ReactTextInputManager {
    public static final String CACHE_DIR_NAME = "mmPasteInput";
    public static final String NAME = "PasteTextInput";
    private boolean disableCopyPaste;
    private final ReactApplicationContext mContext;

    public PasteTextInputManager(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
    }

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactProp(defaultBoolean = false, name = "disableCopyPaste")
    public final void setDisableCopyPaste(PasteInputEditText editText, boolean disabled) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.disableCopyPaste = disabled;
        EventDispatcher eventDispatcher = getEventDispatcher(this.mContext, editText);
        editText.setCustomInsertionActionModeCallback(new PasteInputActionCallback(editText, disabled, eventDispatcher));
        editText.setCustomSelectionActionModeCallback(new PasteInputActionCallback(editText, disabled, eventDispatcher));
        editText.setDisableCopyPaste(disabled);
    }

    private final EventDispatcher getEventDispatcher(ReactContext reactContext, ReactEditText editText) {
        return UIManagerHelper.getEventDispatcherForReactTag(reactContext, editText.getId());
    }

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.ViewManager
    public PasteInputEditText createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PasteInputEditText pasteInputEditText = new PasteInputEditText(context);
        pasteInputEditText.setInputType(pasteInputEditText.getInputType() & (-131073));
        pasteInputEditText.setReturnKeyType("done");
        EventDispatcher eventDispatcher = getEventDispatcher(this.mContext, pasteInputEditText);
        pasteInputEditText.setCustomInsertionActionModeCallback(new PasteInputActionCallback(pasteInputEditText, this.disableCopyPaste, eventDispatcher));
        pasteInputEditText.setCustomSelectionActionModeCallback(new PasteInputActionCallback(pasteInputEditText, this.disableCopyPaste, eventDispatcher));
        return pasteInputEditText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext reactContext, ReactEditText editText) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(editText, "editText");
        super.addEventEmitters(reactContext, editText);
        PasteInputEditText pasteInputEditText = (PasteInputEditText) editText;
        pasteInputEditText.setOnPasteListener(new PasteInputListener(pasteInputEditText, reactContext.getSurfaceId()), getEventDispatcher(reactContext, editText));
    }

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> mutableMap;
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null || (mutableMap = MapsKt.toMutableMap(exportedCustomBubblingEventTypeConstants)) == null) {
            return new LinkedHashMap();
        }
        mutableMap.put("onPaste", MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPaste")));
        return mutableMap;
    }
}

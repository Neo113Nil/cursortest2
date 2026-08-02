package com.facebook.react.views.textinput;

import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.AbstractC2082d0;
import com.facebook.react.R;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.LegacyArchitectureShadowNodeWithCxxImpl;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.view.MeasureUtil;
import com.twilio.voice.EventKeys;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@LegacyArchitectureShadowNodeWithCxxImpl
@Deprecated(level = DeprecationLevel.WARNING, message = "This class is part of Legacy Architecture and will be removed in a future release")
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\f2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u0011H\u0016¢\u0006\u0004\b0\u00101R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R.\u00109\u001a\u0004\u0018\u00010&2\b\u00108\u001a\u0004\u0018\u00010&8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010)R.\u0010>\u001a\u0004\u0018\u00010&2\b\u00108\u001a\u0004\u0018\u00010&8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<\"\u0004\b@\u0010)¨\u0006B"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputShadowNode;", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "Lcom/facebook/yoga/o;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "Landroid/widget/EditText;", "createInternalEditText", "()Landroid/widget/EditText;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "themedContext", "", "setThemedContext", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "Lcom/facebook/yoga/r;", "node", "", "width", "Lcom/facebook/yoga/p;", "widthMode", "height", "heightMode", "", "measure", "(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J", "", "isVirtualAnchor", "()Z", "isYogaLeafNode", "", EventKeys.DATA, "setLocalData", "(Ljava/lang/Object;)V", "", "mostRecentEventCount", "setMostRecentEventCount", "(I)V", "", ViewProps.TEXT_BREAK_STRATEGY, "setTextBreakStrategy", "(Ljava/lang/String;)V", "Lcom/facebook/react/uimanager/UIViewOperationQueue;", "uiViewOperationQueue", "onCollectExtraUpdates", "(Lcom/facebook/react/uimanager/UIViewOperationQueue;)V", "spacingType", ViewProps.PADDING, "setPadding", "(IF)V", "I", "internalEditText", "Landroid/widget/EditText;", "Lcom/facebook/react/views/textinput/ReactTextInputLocalData;", "localData", "Lcom/facebook/react/views/textinput/ReactTextInputLocalData;", EventKeys.VALUE_KEY, "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", ReactTextInputShadowNode.PROP_PLACEHOLDER, "getPlaceholder", "setPlaceholder", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements com.facebook.yoga.o {

    @NotNull
    public static final String PROP_PLACEHOLDER = "placeholder";

    @NotNull
    public static final String PROP_TEXT = "text";

    @Nullable
    private EditText internalEditText;

    @Nullable
    private ReactTextInputLocalData localData;
    private int mostRecentEventCount;

    @Nullable
    private String placeholder;

    @Nullable
    private String text;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactTextInputShadowNode", LegacyArchitectureLogLevel.ERROR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ReactTextInputShadowNode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final EditText createInternalEditText() {
        return new EditText(new androidx.appcompat.view.d(getThemedContext(), R.style.Theme_ReactNative_TextInput_DefaultBackground));
    }

    @Nullable
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return true;
    }

    @Override // com.facebook.yoga.o
    public long measure(@NotNull com.facebook.yoga.r node, float width, @NotNull com.facebook.yoga.p widthMode, float height, @NotNull com.facebook.yoga.p heightMode) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        EditText editText = this.internalEditText;
        if (editText == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ReactTextInputLocalData reactTextInputLocalData = this.localData;
        if (reactTextInputLocalData == null) {
            editText.setTextSize(0, getTextAttributes().getEffectiveFontSize());
            if (getNumberOfLines() != -1) {
                editText.setLines(getNumberOfLines());
            }
            if (editText.getBreakStrategy() != getTextBreakStrategy()) {
                editText.setBreakStrategy(getTextBreakStrategy());
            }
        } else if (reactTextInputLocalData != null) {
            reactTextInputLocalData.apply(editText);
        }
        editText.setHint(this.placeholder);
        editText.measure(MeasureUtil.getMeasureSpec(width, widthMode), MeasureUtil.getMeasureSpec(height, heightMode));
        return com.facebook.yoga.q.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(@NotNull UIViewOperationQueue uiViewOperationQueue) {
        Intrinsics.checkNotNullParameter(uiViewOperationQueue, "uiViewOperationQueue");
        super.onCollectExtraUpdates(uiViewOperationQueue);
        if (this.mostRecentEventCount != -1) {
            uiViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(spannedFromShadowNode(this, this.text, false, null), this.mostRecentEventCount, getContainsImages(), getPadding(0), getPadding(1), getPadding(2), getPadding(3), getTextAlign(), getTextBreakStrategy(), getJustificationMode()));
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        S7.a.a(data instanceof ReactTextInputLocalData);
        this.localData = (ReactTextInputLocalData) data;
        dirty();
    }

    @ReactProp(name = "mostRecentEventCount")
    public final void setMostRecentEventCount(int mostRecentEventCount) {
        this.mostRecentEventCount = mostRecentEventCount;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int spacingType, float padding) {
        super.setPadding(spacingType, padding);
        markUpdated();
    }

    @ReactProp(name = PROP_PLACEHOLDER)
    public final void setPlaceholder(@Nullable String str) {
        this.placeholder = str;
        markUpdated();
    }

    @ReactProp(name = "text")
    public final void setText(@Nullable String str) {
        this.text = str;
        markUpdated();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r4.equals("simple") == false) goto L21;
     */
    @Override // com.facebook.react.views.text.ReactBaseTextShadowNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTextBreakStrategy(@Nullable String textBreakStrategy) {
        if (textBreakStrategy != null) {
            int hashCode = textBreakStrategy.hashCode();
            if (hashCode != -1924829944) {
                if (hashCode != -902286926) {
                    if (hashCode == 336871677 && textBreakStrategy.equals("highQuality")) {
                        setTextBreakStrategy(1);
                        return;
                    }
                }
            } else if (textBreakStrategy.equals("balanced")) {
                setTextBreakStrategy(2);
                return;
            }
            E6.a.K(ReactConstants.TAG, "Invalid textBreakStrategy: " + textBreakStrategy);
            setTextBreakStrategy(0);
            return;
        }
        setTextBreakStrategy(0);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(@NotNull ThemedReactContext themedContext) {
        Intrinsics.checkNotNullParameter(themedContext, "themedContext");
        super.setThemedContext(themedContext);
        EditText createInternalEditText = createInternalEditText();
        setDefaultPadding(4, AbstractC2082d0.E(createInternalEditText));
        setDefaultPadding(1, createInternalEditText.getPaddingTop());
        setDefaultPadding(5, AbstractC2082d0.D(createInternalEditText));
        setDefaultPadding(3, createInternalEditText.getPaddingBottom());
        this.internalEditText = createInternalEditText;
        createInternalEditText.setPadding(0, 0, 0, 0);
        EditText editText = this.internalEditText;
        if (editText != null) {
            editText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
    }

    public /* synthetic */ ReactTextInputShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : reactTextViewManagerCallback);
    }

    @JvmOverloads
    public ReactTextInputShadowNode(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        super(reactTextViewManagerCallback);
        this.mostRecentEventCount = -1;
        setTextBreakStrategy(1);
        setMeasureFunction(this);
    }
}

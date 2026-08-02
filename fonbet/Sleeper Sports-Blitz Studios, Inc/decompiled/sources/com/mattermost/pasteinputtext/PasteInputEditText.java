package com.mattermost.pasteinputtext;

import android.net.Uri;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.textinput.ReactEditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PasteInputEditText.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/mattermost/pasteinputtext/PasteInputEditText;", "Lcom/facebook/react/views/textinput/ReactEditText;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "mOnPasteListener", "Lcom/mattermost/pasteinputtext/IPasteInputListener;", "mPasteEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "mDisabledCopyPaste", "", "setDisableCopyPaste", "", "disabled", "setOnPasteListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "event", "getOnPasteListener", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "mattermost_react-native-paste-input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PasteInputEditText extends ReactEditText {
    private boolean mDisabledCopyPaste;
    private IPasteInputListener mOnPasteListener;
    private EventDispatcher mPasteEventDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasteInputEditText(ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setDisableCopyPaste(boolean disabled) {
        this.mDisabledCopyPaste = disabled;
    }

    public final void setOnPasteListener(IPasteInputListener listener, EventDispatcher event) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnPasteListener = listener;
        if (event != null) {
            this.mPasteEventDispatcher = event;
        }
    }

    public final IPasteInputListener getOnPasteListener() {
        IPasteInputListener iPasteInputListener = this.mOnPasteListener;
        if (iPasteInputListener != null) {
            return iPasteInputListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOnPasteListener");
        return null;
    }

    @Override // com.facebook.react.views.textinput.ReactEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        EditorInfoCompat.setContentMimeTypes(outAttrs, new String[]{ApiConstant.ALL_MEDIA_TYPE});
        InputConnectionCompat.OnCommitContentListener onCommitContentListener = new InputConnectionCompat.OnCommitContentListener() { // from class: com.mattermost.pasteinputtext.PasteInputEditText$$ExternalSyntheticLambda0
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
                boolean onCreateInputConnection$lambda$0;
                onCreateInputConnection$lambda$0 = PasteInputEditText.onCreateInputConnection$lambda$0(PasteInputEditText.this, inputContentInfoCompat, i, bundle);
                return onCreateInputConnection$lambda$0;
            }
        };
        Intrinsics.checkNotNull(onCreateInputConnection);
        InputConnection createWrapper = InputConnectionCompat.createWrapper(onCreateInputConnection, outAttrs, onCommitContentListener);
        Intrinsics.checkNotNullExpressionValue(createWrapper, "createWrapper(...)");
        return createWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreateInputConnection$lambda$0(PasteInputEditText pasteInputEditText, InputContentInfoCompat inputContentInfo, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inputContentInfo, "inputContentInfo");
        if ((i & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
            } catch (Exception unused) {
                return false;
            }
        }
        if (!pasteInputEditText.mDisabledCopyPaste) {
            IPasteInputListener onPasteListener = pasteInputEditText.getOnPasteListener();
            Uri contentUri = inputContentInfo.getContentUri();
            Intrinsics.checkNotNullExpressionValue(contentUri, "getContentUri(...)");
            EventDispatcher eventDispatcher = pasteInputEditText.mPasteEventDispatcher;
            if (eventDispatcher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPasteEventDispatcher");
                eventDispatcher = null;
            }
            onPasteListener.onPaste(contentUri, eventDispatcher);
        }
        return true;
    }
}

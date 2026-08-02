package com.mattermost.pasteinputtext;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PasteInputActionCallback.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0013\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/mattermost/pasteinputtext/PasteInputActionCallback;", "Landroid/view/ActionMode$Callback;", "editText", "Lcom/mattermost/pasteinputtext/PasteInputEditText;", "disabled", "", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "<init>", "(Lcom/mattermost/pasteinputtext/PasteInputEditText;ZLcom/facebook/react/uimanager/events/EventDispatcher;)V", "isDisabled", "mEditText", "mEventDispatcher", "onCreateActionMode", "mode", "Landroid/view/ActionMode;", "menu", "Landroid/view/Menu;", "onPrepareActionMode", "onActionItemClicked", "item", "Landroid/view/MenuItem;", "onDestroyActionMode", "", "disableMenus", "getUriInClipboard", "Landroid/net/Uri;", "mattermost_react-native-paste-input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PasteInputActionCallback implements ActionMode.Callback {
    private final boolean isDisabled;
    private final PasteInputEditText mEditText;
    private final EventDispatcher mEventDispatcher;

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode mode) {
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return false;
    }

    public PasteInputActionCallback(PasteInputEditText editText, boolean z, EventDispatcher eventDispatcher) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.isDisabled = z;
        this.mEditText = editText;
        this.mEventDispatcher = eventDispatcher;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        if (!this.isDisabled) {
            return true;
        }
        disableMenus(menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        Uri uriInClipboard = getUriInClipboard();
        if (item != null && item.getItemId() == 16908322 && uriInClipboard != null) {
            this.mEditText.getOnPasteListener().onPaste(uriInClipboard, this.mEventDispatcher);
            if (mode == null) {
                return true;
            }
            mode.finish();
            return true;
        }
        PasteInputEditText pasteInputEditText = this.mEditText;
        Intrinsics.checkNotNull(item);
        pasteInputEditText.onTextContextMenuItem(item.getItemId());
        return true;
    }

    private final void disableMenus(Menu menu) {
        if (menu != null) {
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                int itemId = item.getItemId();
                item.setEnabled(!(itemId == 16908322 || itemId == 16908321 || itemId == 16908320));
            }
        }
    }

    private final Uri getUriInClipboard() {
        ClipData.Item itemAt;
        CharSequence text;
        Object systemService = this.mEditText.getContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
        if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null || text.toString().length() > 0) {
            return null;
        }
        return itemAt.getUri();
    }
}

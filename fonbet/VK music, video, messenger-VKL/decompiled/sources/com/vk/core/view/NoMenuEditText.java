package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.vk.internal.core.ui.edittext.PlainEditText;
import xsna.gz80;

/* compiled from: NoMenuEditText.kt */
/* loaded from: classes17.dex */
public final class NoMenuEditText extends PlainEditText {
    public static final boolean b = gz80.a(23);

    public NoMenuEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        if (b) {
            return;
        }
        setCustomSelectionActionModeCallback(new a());
    }

    /* compiled from: NoMenuEditText.kt */
    public final class a implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
        }
    }
}

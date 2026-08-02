package com.vk.newsfeed.common.helpers;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.izs;
import xsna.rl3;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: SelectTextActionModeCallback.kt */
/* loaded from: classes4.dex */
public final class SelectTextActionModeCallback implements ActionMode.Callback {
    public final FunctionReferenceImpl a;
    public final izs<Action, s3q0> b;
    public final Set<Integer> c = rl3.y0(new Integer[]{Integer.valueOf(R.id.copy), Integer.valueOf(R.id.selectAll)});
    public ActionMode d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectTextActionModeCallback.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action Copy;
        public static final Action Select;
        public static final Action SelectAll;

        static {
            Action action = new Action("Select", 0);
            Select = action;
            Action action2 = new Action("SelectAll", 1);
            SelectAll = action2;
            Action action3 = new Action("Copy", 2);
            Copy = action3;
            Action[] actionArr = {action, action2, action3};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectTextActionModeCallback(izs<? super Integer, Boolean> izsVar, izs<? super Action, s3q0> izsVar2) {
        this.a = (FunctionReferenceImpl) izsVar;
        this.b = izsVar2;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (menuItem == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        Action action = itemId == 16908321 ? Action.Copy : itemId == 16908319 ? Action.SelectAll : null;
        if (action != null) {
            this.b.invoke(action);
        }
        return ((Boolean) this.a.invoke(Integer.valueOf(itemId))).booleanValue();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            return false;
        }
        this.d = actionMode;
        izs<Action, s3q0> izsVar = this.b;
        if (izsVar == null) {
            return true;
        }
        izsVar.invoke(Action.Select);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.d = null;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            return false;
        }
        for (int size = menu.size() - 1; -1 < size; size--) {
            int itemId = menu.getItem(size).getItemId();
            if (!this.c.contains(Integer.valueOf(itemId))) {
                menu.removeItem(itemId);
            }
        }
        return true;
    }
}

package com.vk.libvideo.bottomsheet.about;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.e1;
import xsna.e43;
import xsna.epx;
import xsna.j9x;
import xsna.k6s0;
import xsna.xdc;
import xsna.zrp;

/* compiled from: TopVideoBottomSheetCallback.kt */
/* loaded from: classes2.dex */
public final class TopVideoBottomSheetCallback extends k6s0 {
    public final e1 a;
    public final xdc<Integer> b;
    public final List<List<Integer>> c;
    public boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TopVideoBottomSheetCallback.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action BackPress;
        public static final Action Cancel;
        public static final Action DismissWithSwipe;
        public static final Action Dragging;
        public static final Action Idle;

        static {
            Action action = new Action("Idle", 0);
            Idle = action;
            Action action2 = new Action("Dragging", 1);
            Dragging = action2;
            Action action3 = new Action("Cancel", 2);
            Cancel = action3;
            Action action4 = new Action("BackPress", 3);
            BackPress = action4;
            Action action5 = new Action("DismissWithSwipe", 4);
            DismissWithSwipe = action5;
            Action[] actionArr = {action, action2, action3, action4, action5};
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

    public TopVideoBottomSheetCallback(e1 e1Var) {
        this.a = e1Var;
        xdc<Integer> xdcVar = new xdc<>();
        int i = xdcVar.i();
        for (int i2 = 0; i2 < i; i2++) {
            xdcVar.add(null);
        }
        this.b = xdcVar;
        this.c = e43.l(e43.l(1, 2, 5), e43.l(1, 5));
    }

    @Override // xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        Integer valueOf = Integer.valueOf(i);
        xdc<Integer> xdcVar = this.b;
        xdcVar.add(valueOf);
        List<List<Integer>> list = this.c;
        boolean z = list instanceof Collection;
        e1 e1Var = this.a;
        if (!z || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                int size = xdcVar.size() - list2.size();
                if (size >= 0) {
                    Iterable g = e43.g(list2);
                    if (!(g instanceof Collection) || !((Collection) g).isEmpty()) {
                        j9x it2 = g.iterator();
                        while (it2.d) {
                            int nextInt = it2.nextInt();
                            if (!epx.f(list2.get(nextInt), xdcVar.get(nextInt + size))) {
                                break;
                            }
                        }
                    }
                    e1Var.invoke(Action.DismissWithSwipe);
                    return;
                }
            }
        }
        if (i == 1) {
            e1Var.invoke(Action.Dragging);
        } else if (i == 3 || i == 4) {
            this.d = false;
            e1Var.invoke(Action.Idle);
        }
    }

    @Override // xsna.k6s0
    public final void d() {
        boolean z = this.d;
        e1 e1Var = this.a;
        if (z) {
            e1Var.invoke(Action.Cancel);
        } else {
            e1Var.invoke(Action.BackPress);
        }
    }

    @Override // xsna.k6s0
    public final void e() {
        this.d = true;
    }
}

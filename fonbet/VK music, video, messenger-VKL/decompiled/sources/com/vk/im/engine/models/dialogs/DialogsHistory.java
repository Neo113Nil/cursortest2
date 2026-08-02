package com.vk.im.engine.models.dialogs;

import android.util.ArrayMap;
import android.util.ArraySet;
import com.ironsource.X3;
import com.vk.im.engine.models.messages.Msg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.dz;
import xsna.epx;
import xsna.j5g;
import xsna.wpp;
import xsna.x7v;

/* compiled from: DialogsHistory.kt */
/* loaded from: classes2.dex */
public final class DialogsHistory extends x7v<Dialog, DialogsHistory> implements Serializable {
    private boolean hasHistoryAfter;
    private boolean hasHistoryAfterCached;
    private boolean hasHistoryBefore;
    private boolean hasHistoryBeforeCached;
    private Map<Long, Msg> latestMsg;

    /* compiled from: DialogsHistory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            try {
                iArr[DialogsFilter.UNREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DialogsHistory() {
        this(0, 31);
    }

    public final void A(LinkedHashMap linkedHashMap) {
        this.latestMsg = linkedHashMap;
    }

    public final void B(wpp<Long, Dialog> wppVar) {
        for (Dialog dialog : wppVar.c.values()) {
            int size = k().size();
            for (int i = 0; i < size; i++) {
                Long Sb = k().get(i).Sb();
                if (Sb.longValue() == dialog.Sb().longValue()) {
                    k().set(i, dialog);
                    d().remove(Sb);
                    if (wppVar.b.contains(Sb)) {
                        d().add(Sb);
                    }
                }
            }
        }
    }

    public final void clear() {
        k().clear();
        d().clear();
        this.latestMsg.clear();
        this.hasHistoryBefore = false;
        this.hasHistoryBeforeCached = false;
        this.hasHistoryAfter = false;
        this.hasHistoryAfterCached = false;
    }

    @Override // xsna.x7v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DialogsHistory.class.equals(obj.getClass())) {
            DialogsHistory dialogsHistory = (DialogsHistory) obj;
            if (epx.f(this.latestMsg, dialogsHistory.latestMsg) && super.equals(dialogsHistory)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.x7v
    public final boolean g() {
        return this.hasHistoryAfter;
    }

    @Override // xsna.x7v
    public final boolean h() {
        return this.hasHistoryAfterCached;
    }

    @Override // xsna.x7v
    public final int hashCode() {
        return this.latestMsg.hashCode() + (super.hashCode() * 31);
    }

    @Override // xsna.x7v
    public final boolean i() {
        return this.hasHistoryBefore;
    }

    @Override // xsna.x7v
    public final boolean j() {
        return this.hasHistoryBeforeCached;
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<Dialog> it = k().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().Sb());
        }
        return arrayList;
    }

    public final Map<Long, Msg> s() {
        return this.latestMsg;
    }

    public final boolean t() {
        return this.hasHistoryAfterCached || this.hasHistoryAfter;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsHistory{list=");
        sb.append("DialogsList(" + j5g.g0(k(), null, "ids=[", X3.j.e, 0, new dz(20), 25) + ')');
        sb.append(", hasHistoryAfter=");
        sb.append(this.hasHistoryAfter);
        sb.append(", hasHistoryAfterCached=");
        sb.append(this.hasHistoryAfterCached);
        sb.append(", hasHistoryBefore=");
        sb.append(this.hasHistoryBefore);
        sb.append(", hasHistoryBeforeCached=");
        sb.append(this.hasHistoryBeforeCached);
        sb.append(", latestMsg=");
        sb.append(this.latestMsg);
        sb.append(", expired=");
        sb.append(d());
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        return this.hasHistoryBeforeCached || this.hasHistoryBefore;
    }

    public final void v(DialogsHistory dialogsHistory) {
        clear();
        k().addAll(dialogsHistory.k());
        d().addAll((ArraySet<? extends Number>) dialogsHistory.d());
        this.latestMsg.putAll(dialogsHistory.latestMsg);
        this.hasHistoryAfter = dialogsHistory.hasHistoryAfter;
        this.hasHistoryAfterCached = dialogsHistory.hasHistoryAfterCached;
        this.hasHistoryBefore = dialogsHistory.hasHistoryBefore;
        this.hasHistoryBeforeCached = dialogsHistory.hasHistoryBeforeCached;
    }

    public final void w(boolean z) {
        this.hasHistoryAfter = z;
    }

    public final void x(boolean z) {
        this.hasHistoryAfterCached = z;
    }

    public final void y(boolean z) {
        this.hasHistoryBefore = z;
    }

    public final void z(boolean z) {
        this.hasHistoryBeforeCached = z;
    }

    public /* synthetic */ DialogsHistory(int i, int i2) {
        this((i2 & 1) != 0 ? 10 : i, (i2 & 2) == 0, false, false, false);
    }

    public DialogsHistory(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(i, z, z2, z3, z4);
        this.hasHistoryBefore = z;
        this.hasHistoryBeforeCached = z2;
        this.hasHistoryAfter = z3;
        this.hasHistoryAfterCached = z4;
        this.latestMsg = new ArrayMap(i);
    }

    public DialogsHistory(DialogsHistory dialogsHistory) {
        this(dialogsHistory.size(), dialogsHistory.hasHistoryBefore, dialogsHistory.hasHistoryBeforeCached, dialogsHistory.hasHistoryAfter, dialogsHistory.hasHistoryAfterCached);
        v(dialogsHistory);
    }
}

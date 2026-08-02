package com.vk.im.engine.commands.messages;

import java.util.List;
import xsna.d9w;
import xsna.e43;
import xsna.f9w;
import xsna.lj30;

/* compiled from: MsgHistoryCreator.kt */
/* loaded from: classes2.dex */
public final class MsgHistoryCreator {
    public final d9w a;

    /* compiled from: MsgHistoryCreator.kt */
    public static final class SamePhaseOnSpaceException extends IllegalStateException {
    }

    public MsgHistoryCreator(f9w f9wVar) {
        this.a = f9wVar;
    }

    public static boolean a(lj30 lj30Var, int i, List list, String str) {
        if (lj30Var.j && i < e43.h(list)) {
            lj30 lj30Var2 = (lj30) list.get(i + 1);
            if (lj30Var.g.equals(lj30Var2.h)) {
                if (lj30Var.l != lj30Var2.l) {
                    return true;
                }
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                StringBuilder sb = new StringBuilder();
                sb.append("findTruncate" + str + "Position: same phase in after on space. ");
                sb.append("current: " + ((Object) sb) + ", ");
                StringBuilder sb2 = new StringBuilder("after: ");
                sb2.append(lj30Var2);
                sb.append(sb2.toString());
                bVar.a(new SamePhaseOnSpaceException(sb.toString()));
                return false;
            }
        }
        return false;
    }

    public static boolean b(lj30 lj30Var, int i, List list, String str) {
        if (lj30Var.i && i > 0) {
            lj30 lj30Var2 = (lj30) list.get(i - 1);
            if (lj30Var.f.equals(lj30Var2.h)) {
                if (lj30Var.l != lj30Var2.l) {
                    return true;
                }
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                StringBuilder sb = new StringBuilder();
                sb.append("findTruncate" + str + "Position: same phase in before on space. ");
                sb.append("current: " + ((Object) sb) + ", ");
                StringBuilder sb2 = new StringBuilder("before: ");
                sb2.append(lj30Var2);
                sb.append(sb2.toString());
                bVar.a(new SamePhaseOnSpaceException(sb.toString()));
                return false;
            }
        }
        return false;
    }
}

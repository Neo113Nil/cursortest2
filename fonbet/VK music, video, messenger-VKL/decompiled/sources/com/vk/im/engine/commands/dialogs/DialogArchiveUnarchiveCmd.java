package com.vk.im.engine.commands.dialogs;

import com.vk.dto.common.Peer;
import defpackage.k0;
import java.util.Locale;
import xsna.asp;
import xsna.dam;
import xsna.epx;
import xsna.hpm;
import xsna.izs;
import xsna.qjg;
import xsna.qlb0;
import xsna.rqi;
import xsna.s3q0;
import xsna.s55;
import xsna.sn;
import xsna.u4w;
import xsna.ur0;
import xsna.w2w;
import xsna.xl6;
import xsna.zrp;

/* compiled from: DialogArchiveUnarchiveCmd.kt */
/* loaded from: classes2.dex */
public abstract class DialogArchiveUnarchiveCmd extends xl6<s3q0> {
    public final Peer b;
    public final Action c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogArchiveUnarchiveCmd.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ARCHIVE;
        public static final Action UNARCHIVE;
        private final izs<Peer, u4w> jobFactory;
        private final boolean makeArchived;

        static {
            Action action = new Action(0, "ARCHIVE", new ur0(23), true);
            ARCHIVE = action;
            Action action2 = new Action(1, "UNARCHIVE", new dam(0), false);
            UNARCHIVE = action2;
            Action[] actionArr = {action, action2};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action(int i, String str, izs izsVar, boolean z) {
            this.makeArchived = z;
            this.jobFactory = izsVar;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        public final u4w a(Peer peer) {
            return this.jobFactory.invoke(peer);
        }
    }

    public DialogArchiveUnarchiveCmd(Peer peer, Action action) {
        this.b = peer;
        this.c = action;
    }

    @Override // xsna.m2w
    public final String a() {
        return k0.a(this.b.b, "im-dialog-archive-unarchive-");
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        hpm c = sn.c(w2wVar);
        Peer peer = this.b;
        long j = peer.b;
        com.vk.im.engine.models.dialogs.b c2 = c.c(j);
        if (c2 == null) {
            throw new IllegalArgumentException(qlb0.a(j, "Dialog(dialogId ", ") not found").toString());
        }
        boolean f = f(c2);
        Action action = this.c;
        if (!f) {
            String lowerCase = action.name().toLowerCase(Locale.ROOT);
            StringBuilder d = rqi.d(j, "Can't ", lowerCase, " Dialog(dialogId ");
            d.append("), because it is already ");
            d.append(lowerCase);
            d.append('d');
            throw new IllegalStateException(d.toString().toString());
        }
        w2wVar.O0().l(new s55(1, this, DialogArchiveUnarchiveCmd.class, "jobCancellationPredicate", "jobCancellationPredicate(Lcom/vk/instantjobs/InstantJob;)Z", 0, 4));
        w2wVar.O0().a(action.a(peer));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        DialogArchiveUnarchiveCmd dialogArchiveUnarchiveCmd = obj instanceof DialogArchiveUnarchiveCmd ? (DialogArchiveUnarchiveCmd) obj : null;
        return dialogArchiveUnarchiveCmd != null && epx.f(this.b, dialogArchiveUnarchiveCmd.b) && this.c == dialogArchiveUnarchiveCmd.c;
    }

    public abstract boolean f(com.vk.im.engine.models.dialogs.b bVar);

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return qjg.a(this) + "(peer=" + this.b + ", action=" + this.c + ')';
    }
}

package com.vk.im.engine.internal.jobs.dialogs;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.jobs.dialogs.DialogArchiveUnarchiveJob;
import xsna.ny90;
import xsna.s7x;

/* compiled from: DialogArchiveUnarchiveJob.kt */
/* loaded from: classes.dex */
public final class c extends DialogArchiveUnarchiveJob {

    /* compiled from: DialogArchiveUnarchiveJob.kt */
    public static final class a implements s7x<c> {
        @Override // xsna.s7x
        public final c a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new c(Peer.a.b(ny90Var.e("dialog_id")));
        }

        @Override // xsna.s7x
        public final void b(c cVar, ny90 ny90Var) {
            ny90Var.n("dialog_id", cVar.c.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DialogUnarchiveJob";
        }
    }

    public c(Peer peer) {
        super(peer, DialogArchiveUnarchiveJob.Action.UNARCHIVE);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogUnarchiveJob";
    }
}

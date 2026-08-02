package com.vk.im.engine.internal.jobs.dialogs;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.jobs.dialogs.DialogArchiveUnarchiveJob;
import xsna.ny90;
import xsna.s7x;

/* compiled from: DialogArchiveUnarchiveJob.kt */
/* loaded from: classes.dex */
public final class a extends DialogArchiveUnarchiveJob {

    /* compiled from: DialogArchiveUnarchiveJob.kt */
    /* renamed from: com.vk.im.engine.internal.jobs.dialogs.a$a, reason: collision with other inner class name */
    public static final class C1115a implements s7x<a> {
        @Override // xsna.s7x
        public final a a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new a(Peer.a.b(ny90Var.e("dialog_id")));
        }

        @Override // xsna.s7x
        public final void b(a aVar, ny90 ny90Var) {
            ny90Var.n("dialog_id", aVar.c.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DialogArchiveJob";
        }
    }

    public a(Peer peer) {
        super(peer, DialogArchiveUnarchiveJob.Action.ARCHIVE);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogArchiveJob";
    }
}

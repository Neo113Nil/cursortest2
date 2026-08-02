package com.vk.im.engine.commands.dialogs;

import com.vk.dto.common.Peer;
import com.vk.im.engine.commands.dialogs.DialogArchiveUnarchiveCmd;

/* compiled from: DialogArchiveUnarchiveCmd.kt */
/* loaded from: classes2.dex */
public final class a extends DialogArchiveUnarchiveCmd {
    public a(Peer peer) {
        super(peer, DialogArchiveUnarchiveCmd.Action.ARCHIVE);
    }

    @Override // com.vk.im.engine.commands.dialogs.DialogArchiveUnarchiveCmd
    public final boolean f(com.vk.im.engine.models.dialogs.b bVar) {
        return !bVar.R;
    }
}

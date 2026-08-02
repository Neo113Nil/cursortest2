package com.vk.ecosystem.backup.domain;

import android.app.backup.BackupAgentHelper;
import java.io.File;
import org.json.JSONObject;
import xsna.emb;
import xsna.nbr;
import xsna.pjv0;

/* compiled from: VkBackupAgent.kt */
/* loaded from: classes18.dex */
public final class VkBackupAgent extends BackupAgentHelper {
    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        super.onCreate();
        addHelper("backup_pref_group", new pjv0(this, "trusted_hashes"));
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestoreFinished() {
        super.onRestoreFinished();
        nbr.w(new File(getFilesDir(), "onRestoreFinished2"), new JSONObject().put("timestamp", System.currentTimeMillis()).toString(), emb.b);
    }
}

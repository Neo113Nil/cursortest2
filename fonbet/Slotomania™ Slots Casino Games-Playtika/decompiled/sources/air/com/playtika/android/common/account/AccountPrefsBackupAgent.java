package air.com.playtika.android.common.account;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

/* loaded from: classes6.dex */
public class AccountPrefsBackupAgent extends BackupAgentHelper {
    static final String PREFS_BACKUP_KEY = "installationToken";

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper(PREFS_BACKUP_KEY, new SharedPreferencesBackupHelper(this, AccountPreferenceService.ACCOUNT_PREFERENCE_FILE_KEY));
    }
}

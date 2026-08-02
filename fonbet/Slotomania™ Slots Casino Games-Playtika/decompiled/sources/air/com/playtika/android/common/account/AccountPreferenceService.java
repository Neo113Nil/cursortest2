package air.com.playtika.android.common.account;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* loaded from: classes6.dex */
public class AccountPreferenceService {
    public static final String ACCOUNT_PREFERENCE_FILE_KEY = "air.com.playtika.android.common.accountData";
    private static final String TAG = "GameActivity";
    private BackupManager backupManager;
    private SharedPreferences sharedPref;

    public AccountPreferenceService(Context context) {
        this.backupManager = new BackupManager(context);
        this.sharedPref = context.getSharedPreferences(ACCOUNT_PREFERENCE_FILE_KEY, 0);
    }

    public void Set(String str, String str2) {
        Log.i(TAG, "Set KeyValue pair to account sharedPreference: " + String.format("key: %s, value: %s", str, str2));
        this.sharedPref.edit().putString(str, str2).apply();
        this.backupManager.dataChanged();
    }

    public String Get(String str, String str2) {
        String string = this.sharedPref.getString(str, str2);
        Log.i(TAG, "Get KeyValue pair from account sharedPreference: " + String.format("key: %s, defaultValue: %s, result = %s", str, str2, string));
        return string;
    }
}

package zendesk.core;

import android.content.SharedPreferences;
import java.util.UUID;

/* loaded from: classes5.dex */
public class ZendeskMachineIdStorage implements MachineIdStorage {
    private static final String MACHINE_ID_KEY = "machine_id_key";
    private final SharedPreferences sharedPreferences;

    public ZendeskMachineIdStorage(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    private String generateMachineId() {
        String uuid = UUID.randomUUID().toString();
        this.sharedPreferences.edit().putString(MACHINE_ID_KEY, uuid).apply();
        return uuid;
    }

    @Override // zendesk.core.MachineIdStorage
    public String getMachineId() {
        String string = this.sharedPreferences.getString(MACHINE_ID_KEY, null);
        return (string == null || string.isEmpty()) ? generateMachineId() : string;
    }
}

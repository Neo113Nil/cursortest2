package expo.modules.taskManager.repository;

import android.content.SharedPreferences;
import expo.modules.interfaces.taskManager.TaskInterface;
import expo.modules.taskManager.Utils;
import expo.modules.taskManager.repository.TasksAndEventsRepository;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class TasksPersistence {
    public void clearTaskPersistence(SharedPreferences sharedPreferences, String str) {
        for (String str2 : sharedPreferences.getAll().keySet()) {
            if (!str.equals(str2)) {
                sharedPreferences.edit().remove(str2).apply();
            }
        }
    }

    public void persistTasksForAppScopeKey(SharedPreferences sharedPreferences, String str, Map<String, TaskInterface> map) {
        if (sharedPreferences == null) {
            return;
        }
        if (map == null || map.size() == 0) {
            sharedPreferences.edit().remove(str).apply();
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String str2 = null;
        for (TaskInterface taskInterface : map.values()) {
            hashMap2.put(taskInterface.getName(), Utils.exportTaskToMap(taskInterface));
            str2 = taskInterface.getAppUrl();
        }
        hashMap.put("appUrl", str2);
        hashMap.put("tasks", hashMap2);
        sharedPreferences.edit().putString(str, new JSONObject(hashMap).toString()).apply();
    }

    public Map<String, TasksAndEventsRepository.AppConfig> readPersistedTasks(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Map<String, Object> jsonToMap = Utils.jsonToMap(entry.getValue().toString());
            String str = (String) jsonToMap.get("appUrl");
            HashMap hashMap2 = (HashMap) jsonToMap.get("tasks");
            if (str != null && hashMap2 != null && hashMap2.size() > 0) {
                HashMap hashMap3 = new HashMap();
                for (String str2 : hashMap2.keySet()) {
                    hashMap3.put(str2, hashMap2.get(str2));
                }
                TasksAndEventsRepository.AppConfig appConfig = new TasksAndEventsRepository.AppConfig();
                appConfig.appUrl = str;
                appConfig.tasks = hashMap3;
                hashMap.put(entry.getKey(), appConfig);
            }
        }
        return hashMap;
    }
}

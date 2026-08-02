package de.appplant.cordova.plugin.notification;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.ironsource.Wa;
import de.appplant.cordova.plugin.notification.action.Action;
import de.appplant.cordova.plugin.notification.action.ActionGroup;
import de.appplant.cordova.plugin.notification.util.AssetUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import org.apache.cordova.globalization.Globalization;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Options {
    static final String DEFAULT_CHANNEL_ID = "default-channel-id";
    private static final String DEFAULT_ICON = "res://icon";
    private static final String DEFAULT_ICON_TYPE = "square";
    public static final String EXTRA_LAUNCH = "NOTIFICATION_LAUNCH";
    static final String EXTRA_SOUND = "NOTIFICATION_SOUND";
    static final String SILENT_CHANNEL_ID = "silent-channel-id";
    static final String SOUND_CHANNEL_ID = "sound-channel-id";
    static final String SOUND_VIBRATE_CHANNEL_ID = "sound-vibrate-channel-id";
    static final String VIBRATE_CHANNEL_ID = "vibrate-channel-id";
    private final AssetUtil assets;
    private final Context context;
    private final JSONObject options;
    static final CharSequence SILENT_CHANNEL_NAME = "Silent Notifications";
    static final CharSequence VIBRATE_CHANNEL_NAME = "Low Priority Notifications";
    static final CharSequence SOUND_CHANNEL_NAME = "Medium Priority Notifications";
    static final CharSequence SOUND_VIBRATE_CHANNEL_NAME = "High Priority Notifications";
    public static final Integer DEFAULT_RESET_DELAY = 5;
    public static final Integer VOLUME_NOT_SET = -1;
    public static final Integer DEFAULT_WAKE_LOCK_TIMEOUT = Integer.valueOf(Wa.u);

    public Options(JSONObject jSONObject) {
        this.options = jSONObject;
        this.context = null;
        this.assets = null;
    }

    public Options(Context context, JSONObject jSONObject) {
        this.context = context;
        this.options = jSONObject;
        this.assets = AssetUtil.getInstance(context);
    }

    public Boolean isCustomLayout() {
        return Boolean.valueOf(this.options.optBoolean("customLayout", false));
    }

    public Boolean isWorker() {
        return Boolean.valueOf(this.options.optBoolean("worker", false));
    }

    public Context getContext() {
        return this.context;
    }

    public JSONObject getDict() {
        return this.options;
    }

    public String toString() {
        return this.options.toString();
    }

    public Integer getId() {
        return Integer.valueOf(this.options.optInt("id", 0));
    }

    String getIdentifier() {
        return getId().toString();
    }

    public int getBadgeNumber() {
        return this.options.optInt("badge", 0);
    }

    public int getNumber() {
        return this.options.optInt("number", 0);
    }

    public Boolean isSticky() {
        return Boolean.valueOf(this.options.optBoolean("sticky", false));
    }

    Boolean isAutoClear() {
        return Boolean.valueOf(this.options.optBoolean("autoClear", false));
    }

    public JSONObject getTrigger() {
        return this.options.optJSONObject("trigger");
    }

    boolean isSilent() {
        return this.options.optBoolean(NotificationCompat.GROUP_KEY_SILENT, false);
    }

    String getGroup() {
        return this.options.optString("group", null);
    }

    boolean isLaunchingApp() {
        return this.options.optBoolean("launch", true);
    }

    public boolean isAutoLaunchingApp() {
        return this.options.optBoolean("autoLaunch", true);
    }

    public boolean shallWakeUp() {
        return this.options.optBoolean("wakeup", true);
    }

    public boolean useFullScreenIntent() {
        return this.options.optBoolean("fullScreenIntent", true);
    }

    public boolean triggerInApp() {
        return this.options.optBoolean("triggerInApp", false);
    }

    public int getWakeLockTimeout() {
        return this.options.optInt("wakeLockTimeout", DEFAULT_WAKE_LOCK_TIMEOUT.intValue());
    }

    long getTimeout() {
        return this.options.optLong("timeoutAfter");
    }

    public String getChannel() {
        if (Build.VERSION.SDK_INT < 26) {
            return DEFAULT_CHANNEL_ID;
        }
        return Manager.getInstance(this.context).buildChannelWithOptions(getSound(), isWithVibration(), !isWithoutSound(), this.options.optString("channelName", null), this.options.optString("channelId", null));
    }

    boolean getGroupSummary() {
        return this.options.optBoolean("groupSummary", false);
    }

    public String getText() {
        Object opt = this.options.opt("text");
        return opt instanceof String ? (String) opt : "";
    }

    public String getTitle() {
        String optString = this.options.optString("title", "");
        return optString.isEmpty() ? this.context.getApplicationInfo().loadLabel(this.context.getPackageManager()).toString() : optString;
    }

    int getLedColor() {
        String optString;
        Object opt = this.options.opt("led");
        if (opt instanceof String) {
            optString = this.options.optString("led");
        } else if (opt instanceof JSONArray) {
            optString = this.options.optJSONArray("led").optString(0);
        } else {
            optString = opt instanceof JSONObject ? this.options.optJSONObject("led").optString("color") : null;
        }
        if (optString == null) {
            return 0;
        }
        try {
            return Integer.parseInt(stripHex(optString), 16) + ViewCompat.MEASURED_STATE_MASK;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }

    int getLedOn() {
        Object opt = this.options.opt("led");
        if (opt instanceof JSONArray) {
            return this.options.optJSONArray("led").optInt(1, 1000);
        }
        if (opt instanceof JSONObject) {
            return this.options.optJSONObject("led").optInt(DebugKt.DEBUG_PROPERTY_VALUE_ON, 1000);
        }
        return 1000;
    }

    int getLedOff() {
        Object opt = this.options.opt("led");
        if (opt instanceof JSONArray) {
            return this.options.optJSONArray("led").optInt(2, 1000);
        }
        if (opt instanceof JSONObject) {
            return this.options.optJSONObject("led").optInt(DebugKt.DEBUG_PROPERTY_VALUE_OFF, 1000);
        }
        return 1000;
    }

    public int getColor() {
        String optString = this.options.optString("color", null);
        if (optString == null) {
            return 0;
        }
        try {
            String stripHex = stripHex(optString);
            if (stripHex.matches("[^0-9]*")) {
                return Color.class.getDeclaredField(stripHex.toUpperCase()).getInt(null);
            }
            return Integer.parseInt(stripHex, 16) + ViewCompat.MEASURED_STATE_MASK;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return 0;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return 0;
        } catch (NumberFormatException e3) {
            e3.printStackTrace();
            return 0;
        }
    }

    Uri getSound() {
        return this.assets.parse(this.options.optString("sound", null));
    }

    boolean hasLargeIcon() {
        return this.options.optString("icon", null) != null;
    }

    Bitmap getLargeIcon() {
        try {
            return this.assets.getIconFromUri(this.assets.parse(this.options.optString("icon", null)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    boolean hasBackground() {
        return this.options.optString("background", null) != null;
    }

    Bitmap getBackground() {
        try {
            return this.assets.getIconFromUri(this.assets.parse(this.options.optString("background", null)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    String getLargeIconType() {
        return this.options.optString("iconType", DEFAULT_ICON_TYPE);
    }

    public int getSmallIcon() {
        int resId = this.assets.getResId(this.options.optString("smallIcon", DEFAULT_ICON));
        if (resId == 0) {
            resId = this.assets.getResId(DEFAULT_ICON);
        }
        return resId == 0 ? R.drawable.ic_popup_reminder : resId;
    }

    public Integer getVolume() {
        return Integer.valueOf(this.options.optInt("alarmVolume", VOLUME_NOT_SET.intValue()));
    }

    public Integer getResetDelay() {
        return Integer.valueOf(this.options.optInt("resetDelay", DEFAULT_RESET_DELAY.intValue()));
    }

    public boolean isWithVibration() {
        return this.options.optBoolean("vibrate", true);
    }

    public boolean isWithoutSound() {
        Object opt = this.options.opt("sound");
        return opt == null || opt.equals(false) || this.options.optInt("alarmVolume") == 0;
    }

    public boolean isWithDefaultSound() {
        Object opt = this.options.opt("sound");
        return opt != null && opt.equals(true);
    }

    private boolean isWithoutLights() {
        Object opt = this.options.opt("led");
        return opt == null || opt.equals(false);
    }

    private boolean isWithDefaultLights() {
        Object opt = this.options.opt("led");
        return opt != null && opt.equals(true);
    }

    int getDefaults() {
        int optInt = this.options.optInt("defaults", 0);
        int i = isWithVibration() ? optInt | 2 : optInt & 2;
        if (isWithDefaultSound()) {
            i |= 1;
        } else if (isWithoutSound()) {
            i &= 1;
        }
        return isWithDefaultLights() ? i | 4 : isWithoutLights() ? i & 4 : i;
    }

    int getVisibility() {
        return this.options.optBoolean("lockscreen", true) ? 1 : -1;
    }

    int getPrio() {
        return Math.min(Math.max(this.options.optInt("priority"), -2), 2);
    }

    boolean showClock() {
        Object opt = this.options.opt("clock");
        if (opt instanceof Boolean) {
            return ((Boolean) opt).booleanValue();
        }
        return true;
    }

    boolean showChronometer() {
        Object opt = this.options.opt("clock");
        return (opt instanceof String) && opt.equals("chronometer");
    }

    boolean isWithProgressBar() {
        return this.options.optJSONObject("progressBar").optBoolean("enabled", false);
    }

    int getProgressValue() {
        return this.options.optJSONObject("progressBar").optInt("value", 0);
    }

    int getProgressMaxValue() {
        return this.options.optJSONObject("progressBar").optInt("maxValue", 100);
    }

    boolean isIndeterminateProgress() {
        return this.options.optJSONObject("progressBar").optBoolean("indeterminate", false);
    }

    public boolean isInfiniteTrigger() {
        JSONObject optJSONObject = this.options.optJSONObject("trigger");
        return optJSONObject.has("every") && optJSONObject.optInt("count", -1) < 0;
    }

    String getSummary() {
        return this.options.optString("summary", null);
    }

    List<Bitmap> getAttachments() {
        JSONArray optJSONArray = this.options.optJSONArray("attachments");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                Uri parse = this.assets.parse(optJSONArray.optString(i));
                if (parse != Uri.EMPTY) {
                    try {
                        arrayList.add(this.assets.getIconFromUri(parse));
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return arrayList;
    }

    Action[] getActions() {
        String str;
        JSONArray jSONArray;
        ActionGroup parse;
        Object opt = this.options.opt("actions");
        if (opt instanceof String) {
            str = (String) opt;
            jSONArray = null;
        } else if (opt instanceof JSONArray) {
            jSONArray = (JSONArray) opt;
            str = null;
        } else {
            str = null;
            jSONArray = null;
        }
        if (str != null) {
            parse = ActionGroup.lookup(str);
        } else {
            parse = (jSONArray == null || jSONArray.length() <= 0) ? null : ActionGroup.parse(this.context, jSONArray);
        }
        if (parse != null) {
            return parse.getActions();
        }
        return null;
    }

    NotificationCompat.MessagingStyle.Message[] getMessages() {
        Object opt = this.options.opt("text");
        if (opt == null || (opt instanceof String)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) opt;
        if (jSONArray.length() == 0) {
            return null;
        }
        int length = jSONArray.length();
        NotificationCompat.MessagingStyle.Message[] messageArr = new NotificationCompat.MessagingStyle.Message[length];
        long time = new Date().getTime();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            messageArr[i] = new NotificationCompat.MessagingStyle.Message(optJSONObject.optString("message"), optJSONObject.optLong(Globalization.DATE, time), optJSONObject.optString("person", null));
        }
        return messageArr;
    }

    MediaSessionCompat.Token getMediaSessionToken() {
        String optString = this.options.optString("mediaSession", null);
        if (optString == null) {
            return null;
        }
        return new MediaSessionCompat(this.context, optString).getSessionToken();
    }

    private String stripHex(String str) {
        return str.charAt(0) == '#' ? str.substring(1) : str;
    }
}

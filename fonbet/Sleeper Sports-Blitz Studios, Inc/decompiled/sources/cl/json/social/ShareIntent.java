package cl.json.social;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import cl.json.RNShareImpl;
import cl.json.ShareFile;
import cl.json.ShareFiles;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.sentry.SentryReplayEvent;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class ShareIntent {
    protected ShareFile backgroundAsset;
    protected String chooserTitle = "Share";
    protected ShareFile fileShare;
    protected Intent intent;
    protected ReadableMap options;
    protected final ReactApplicationContext reactContext;
    protected ShareFile stickerAsset;

    protected String getComponentClass() {
        return null;
    }

    protected abstract String getDefaultWebLink();

    protected abstract String getPackage();

    protected abstract String getPlayStoreLink();

    public ShareIntent(ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
        setIntent(new Intent("android.intent.action.SEND"));
        getIntent().setType("text/plain");
    }

    public Intent excludeChooserIntent(Intent intent, ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList<HashMap> arrayList2 = new ArrayList();
        Intent intent2 = new Intent(intent.getAction());
        intent2.setType(intent.getType());
        List<ResolveInfo> queryIntentActivities = this.reactContext.getPackageManager().queryIntentActivities(intent2, 0);
        if (!queryIntentActivities.isEmpty()) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && !readableMap.getArray("excludedActivityTypes").toString().contains(resolveInfo.activityInfo.packageName)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("packageName", resolveInfo.activityInfo.packageName);
                    hashMap.put("className", resolveInfo.activityInfo.name);
                    hashMap.put("simpleName", String.valueOf(resolveInfo.activityInfo.loadLabel(this.reactContext.getPackageManager())));
                    arrayList2.add(hashMap);
                }
            }
            if (!arrayList2.isEmpty()) {
                Collections.sort(arrayList2, new Comparator<HashMap<String, String>>() { // from class: cl.json.social.ShareIntent.1
                    @Override // java.util.Comparator
                    public int compare(HashMap<String, String> hashMap2, HashMap<String, String> hashMap3) {
                        return hashMap2.get("simpleName").compareTo(hashMap3.get("simpleName"));
                    }
                });
                for (HashMap hashMap2 : arrayList2) {
                    Intent intent3 = (Intent) intent.clone();
                    intent3.setPackage((String) hashMap2.get("packageName"));
                    intent3.setClassName((String) hashMap2.get("packageName"), (String) hashMap2.get("className"));
                    arrayList.add(intent3);
                }
                Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), "share");
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                return createChooser;
            }
        }
        return Intent.createChooser(intent, "Share");
    }

    public void open(ReadableMap readableMap) throws ActivityNotFoundException {
        this.options = readableMap;
        if (hasValidKey("isNewTask", readableMap) && readableMap.getBoolean("isNewTask")) {
            getIntent().addFlags(268468224);
        }
        if (hasValidKey("subject", readableMap)) {
            getIntent().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (hasValidKey("email", readableMap)) {
            getIntent().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString("email")});
        }
        if (hasValidKey("title", readableMap)) {
            this.chooserTitle = readableMap.getString("title");
        }
        String string = hasValidKey("message", readableMap) ? readableMap.getString("message") : "";
        String string2 = hasValidKey(NotificationCompat.CATEGORY_SOCIAL, readableMap) ? readableMap.getString(NotificationCompat.CATEGORY_SOCIAL) : "";
        if (string2.equals("sms")) {
            String string3 = readableMap.getString("recipient");
            if (!string3.isEmpty()) {
                getIntent().putExtra("address", string3);
            }
        }
        if (string2.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            getIntent().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (string2.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            getIntent().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (hasValidKey(SentryReplayEvent.JsonKeys.URLS, readableMap)) {
            ShareFiles fileShares = getFileShares(readableMap);
            if (fileShares.isFile()) {
                ArrayList<Uri> uri = fileShares.getURI();
                ClipData clipData = new ClipData(new ClipDescription("Files", new String[]{fileShares.getType()}), new ClipData.Item(uri.get(0)));
                for (int i = 1; i < uri.size(); i++) {
                    clipData.addItem(new ClipData.Item(uri.get(i)));
                }
                getIntent().setClipData(clipData);
                getIntent().setAction("android.intent.action.SEND_MULTIPLE");
                getIntent().setType(fileShares.getType());
                getIntent().putParcelableArrayListExtra("android.intent.extra.STREAM", uri);
                getIntent().addFlags(1);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                getIntent().putExtra("android.intent.extra.TEXT", string);
                return;
            }
            if (TextUtils.isEmpty(string)) {
                getIntent().putExtra("android.intent.extra.TEXT", readableMap.getArray(SentryReplayEvent.JsonKeys.URLS).getString(0));
                return;
            }
            getIntent().putExtra("android.intent.extra.TEXT", string + " " + readableMap.getArray(SentryReplayEvent.JsonKeys.URLS).getString(0));
            return;
        }
        if (hasValidKey("url", readableMap)) {
            ShareFile fileShare = getFileShare(readableMap);
            this.fileShare = fileShare;
            if (fileShare.isFile()) {
                Uri uri2 = this.fileShare.getURI();
                ClipData newUri = ClipData.newUri(this.reactContext.getContentResolver(), "File", uri2);
                getIntent().setType(this.fileShare.getType());
                getIntent().setClipData(newUri);
                getIntent().putExtra("android.intent.extra.STREAM", uri2);
                getIntent().addFlags(1);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                getIntent().putExtra("android.intent.extra.TEXT", string);
                return;
            }
            if (TextUtils.isEmpty(string)) {
                getIntent().putExtra("android.intent.extra.TEXT", readableMap.getString("url"));
                return;
            }
            getIntent().putExtra("android.intent.extra.TEXT", string + " " + readableMap.getString("url"));
            return;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        getIntent().putExtra("android.intent.extra.TEXT", string);
    }

    protected ShareFile getFileShare(ReadableMap readableMap) {
        String string = hasValidKey("filename", readableMap) ? readableMap.getString("filename") : null;
        boolean z = false;
        if (hasValidKey("useInternalStorage", readableMap)) {
            z = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = z;
        if (hasValidKey("type", readableMap)) {
            return new ShareFile(readableMap.getString("url"), readableMap.getString("type"), string, bool, this.reactContext);
        }
        return new ShareFile(readableMap.getString("url"), string, bool, this.reactContext);
    }

    protected ShareFiles getFileShares(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (hasValidKey("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(array.getString(i));
            }
        }
        boolean z = false;
        if (hasValidKey("useInternalStorage", readableMap)) {
            z = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = z;
        if (hasValidKey("type", readableMap)) {
            return new ShareFiles(readableMap.getArray(SentryReplayEvent.JsonKeys.URLS), arrayList, readableMap.getString("type"), bool, this.reactContext);
        }
        return new ShareFiles(readableMap.getArray(SentryReplayEvent.JsonKeys.URLS), arrayList, bool, this.reactContext);
    }

    protected static String urlEncode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    protected Intent[] getIntentsToViewFile(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities = this.reactContext.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[queryIntentActivities.size()];
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i] = new Intent(intent2);
        }
        return intentArr;
    }

    protected void openIntentChooser() throws ActivityNotFoundException {
        Intent createChooser;
        IntentSender intentSender;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            TargetChosenReceiver.callbackReject("Something went wrong");
            return;
        }
        if (TargetChosenReceiver.isSupported()) {
            intentSender = TargetChosenReceiver.getSharingSenderIntent(this.reactContext);
            createChooser = Intent.createChooser(getIntent(), this.chooserTitle, intentSender);
        } else {
            createChooser = Intent.createChooser(getIntent(), this.chooserTitle);
            intentSender = null;
        }
        createChooser.addFlags(1073741824);
        if (hasValidKey("showAppsToView", this.options) && hasValidKey("url", this.options)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.fileShare.getType());
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", getIntentsToViewFile(intent, this.fileShare.getURI()));
        }
        if (hasValidKey("excludedActivityTypes", this.options)) {
            createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", getExcludedComponentArray(this.options.getArray("excludedActivityTypes")));
            currentActivity.startActivityForResult(createChooser, RNShareImpl.SHARE_REQUEST_CODE);
        } else {
            currentActivity.startActivityForResult(createChooser, RNShareImpl.SHARE_REQUEST_CODE);
        }
        if (intentSender == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("success", true);
            createMap.putString("message", "OK");
            TargetChosenReceiver.callbackResolve(createMap);
        }
    }

    public static boolean isPackageInstalled(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    protected Intent getIntent() {
        return this.intent;
    }

    protected void setIntent(Intent intent) {
        this.intent = intent;
    }

    public static boolean hasValidKey(String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    private ComponentName[] getExcludedComponentArray(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(getIntent().getAction());
        intent.setType(getIntent().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = this.reactContext.getPackageManager().queryIntentActivities(intent, 0);
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    arrayList.add(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }
}

package cl.json.social;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import cl.json.ShareFile;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes5.dex */
public class InstagramShare extends SingleShareIntent {
    private static final String PACKAGE = "com.instagram.android";
    private static final String PLAY_STORE_LINK = "https://play.google.com/store/apps/details?id=com.instagram.android";

    @Override // cl.json.social.ShareIntent
    protected String getDefaultWebLink() {
        return null;
    }

    public InstagramShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cl.json.social.SingleShareIntent, cl.json.social.ShareIntent
    public void open(ReadableMap readableMap) throws ActivityNotFoundException {
        super.open(readableMap);
        if (!ShareIntent.hasValidKey("type", readableMap)) {
            Log.e("RNShare", "No type provided");
            return;
        }
        String string = readableMap.getString("type");
        if (string.startsWith("text")) {
            openInstagramIntentChooserForText(this.chooserTitle);
            return;
        }
        if (!ShareIntent.hasValidKey("url", readableMap)) {
            Log.e("RNShare", "No url provided");
            return;
        }
        String string2 = readableMap.getString("url");
        boolean startsWith = string2.startsWith("instagram://");
        Boolean.valueOf(startsWith).getClass();
        if (startsWith) {
            openInstagramUrlScheme(string2);
            return;
        }
        String extension = getExtension(string);
        openInstagramIntentChooserForMedia(string2, this.chooserTitle, Boolean.valueOf(string.startsWith("image")), extension);
    }

    protected void openInstagramUrlScheme(String str) {
        Uri parse = Uri.parse(str);
        getIntent().setAction("android.intent.action.VIEW");
        getIntent().setData(parse);
        super.openIntentChooser();
    }

    private String getExtension(String str) {
        return str.split("/")[r2.length - 1];
    }

    protected void openInstagramIntentChooserForText(String str) {
        getIntent().setPackage(PACKAGE);
        getIntent().setType("text/plain");
        getIntent().setAction("android.intent.action.SEND");
        super.openIntentChooser();
    }

    protected void openInstagramIntentChooserForMedia(String str, String str2, Boolean bool, String str3) {
        ShareFile shareFile;
        Boolean valueOf = Boolean.valueOf(ShareIntent.hasValidKey("useInternalStorage", this.options) && this.options.getBoolean("useInternalStorage"));
        if (bool.booleanValue()) {
            shareFile = new ShareFile(str, "image/" + str3, "image", valueOf, this.reactContext);
        } else {
            shareFile = new ShareFile(str, "video/" + str3, "video", valueOf, this.reactContext);
        }
        Uri uri = shareFile.getURI();
        Intent intent = new Intent("android.intent.action.SEND");
        if (bool.booleanValue()) {
            intent.setType("image/*");
        } else {
            intent.setType("video/*");
        }
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setPackage(PACKAGE);
        Intent intent2 = new Intent("com.instagram.share.ADD_TO_STORY");
        intent2.setDataAndType(uri, str3);
        intent2.addFlags(1);
        intent2.setPackage(PACKAGE);
        Intent createChooser = Intent.createChooser(intent, str2);
        createChooser.addFlags(268435456);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
        this.reactContext.getCurrentActivity().grantUriPermission(PACKAGE, uri, 1);
        this.reactContext.startActivity(createChooser);
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("success", true);
        createMap.putString("message", getIntent().getPackage());
        TargetChosenReceiver.callbackResolve(createMap);
    }

    @Override // cl.json.social.ShareIntent
    protected String getPackage() {
        return PACKAGE;
    }

    @Override // cl.json.social.ShareIntent
    protected String getPlayStoreLink() {
        return PLAY_STORE_LINK;
    }
}

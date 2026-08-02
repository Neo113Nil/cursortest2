package cl.json.social;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.media3.common.MimeTypes;
import cl.json.ShareFile;
import com.facebook.internal.NativeProtocol;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes5.dex */
public class FacebookStoriesShare extends SingleShareIntent {
    private static final String PACKAGE = "com.facebook.katana";
    private static final String PLAY_STORE_LINK = "market://details?id=com.facebook.katana";

    @Override // cl.json.social.ShareIntent
    protected String getDefaultWebLink() {
        return null;
    }

    public FacebookStoriesShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        setIntent(new Intent("com.facebook.stories.ADD_TO_STORY"));
    }

    @Override // cl.json.social.SingleShareIntent, cl.json.social.ShareIntent
    public void open(ReadableMap readableMap) throws ActivityNotFoundException, IllegalArgumentException {
        super.open(readableMap);
        shareStory(readableMap);
        openIntentChooser(readableMap);
    }

    @Override // cl.json.social.ShareIntent
    protected String getPackage() {
        return "com.facebook.katana";
    }

    @Override // cl.json.social.ShareIntent
    protected String getPlayStoreLink() {
        return PLAY_STORE_LINK;
    }

    private void shareStory(ReadableMap readableMap) {
        String str;
        if (!hasValidKey(RemoteConfigConstants.RequestFieldKey.APP_ID, readableMap)) {
            throw new IllegalArgumentException("appId was not provided.");
        }
        if (!hasValidKey("backgroundImage", readableMap) && !hasValidKey("backgroundVideo", readableMap) && !hasValidKey("stickerImage", readableMap)) {
            throw new IllegalArgumentException("Invalid background or sticker assets provided.");
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            this.intent.putExtra(NativeProtocol.EXTRA_APPLICATION_ID, readableMap.getString(RemoteConfigConstants.RequestFieldKey.APP_ID));
            this.intent.putExtra("bottom_background_color", "#906df4");
            this.intent.putExtra("top_background_color", "#837DF4");
            if (hasValidKey("attributionURL", readableMap)) {
                this.intent.putExtra(ShareConstants.STORY_DEEP_LINK_URL, readableMap.getString("attributionURL"));
            }
            if (hasValidKey("backgroundTopColor", readableMap)) {
                this.intent.putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
            }
            if (hasValidKey("backgroundBottomColor", readableMap)) {
                this.intent.putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
            }
            boolean z = false;
            if (hasValidKey("useInternalStorage", readableMap)) {
                z = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
            }
            Boolean bool = z;
            boolean z2 = hasValidKey("backgroundImage", readableMap) || hasValidKey("backgroundVideo", readableMap);
            Boolean valueOf = Boolean.valueOf(z2);
            valueOf.getClass();
            if (z2) {
                if (hasValidKey("backgroundImage", readableMap)) {
                    str = readableMap.getString("backgroundImage");
                } else if (!hasValidKey("backgroundVideo", readableMap)) {
                    str = "";
                } else {
                    str = readableMap.getString("backgroundVideo");
                }
                ShareFile shareFile = new ShareFile(str, "image/jpeg", AppStateModule.APP_STATE_BACKGROUND, bool, this.reactContext);
                this.intent.setDataAndType(shareFile.getURI(), shareFile.getType());
                this.intent.setFlags(1);
            }
            if (hasValidKey("stickerImage", readableMap)) {
                ShareFile shareFile2 = new ShareFile(readableMap.getString("stickerImage"), MimeTypes.IMAGE_PNG, "sticker", bool, this.reactContext);
                valueOf.getClass();
                if (!z2) {
                    this.intent.setType("image/*");
                }
                this.intent.putExtra(ShareConstants.STORY_INTERACTIVE_ASSET_URI, shareFile2.getURI());
                currentActivity.grantUriPermission("com.facebook.katana", shareFile2.getURI(), 1);
                return;
            }
            return;
        }
        TargetChosenReceiver.callbackReject("Something went wrong");
    }
}

package f3;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* renamed from: f3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4248i extends AbstractC4254o {
    public C4248i(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        n(new Intent("com.instagram.share.ADD_TO_STORY"));
    }

    private void q(ReadableMap readableMap) {
        String str;
        if (!AbstractC4253n.j("backgroundImage", readableMap) && !AbstractC4253n.j("backgroundVideo", readableMap) && !AbstractC4253n.j("stickerImage", readableMap)) {
            throw new IllegalArgumentException("Invalid background or sticker assets provided.");
        }
        Activity currentActivity = this.f46375a.getCurrentActivity();
        if (currentActivity == null) {
            q.a("Something went wrong");
            return;
        }
        this.f46376b.putExtra("source_application", readableMap.getString("appId"));
        this.f46376b.putExtra("bottom_background_color", "#906df4");
        this.f46376b.putExtra("top_background_color", "#837DF4");
        if (AbstractC4253n.j("attributionURL", readableMap)) {
            this.f46376b.putExtra("content_url", readableMap.getString("attributionURL"));
        }
        if (AbstractC4253n.j("backgroundTopColor", readableMap)) {
            this.f46376b.putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
        }
        if (AbstractC4253n.j("backgroundBottomColor", readableMap)) {
            this.f46376b.putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
        }
        Boolean bool = Boolean.FALSE;
        if (AbstractC4253n.j("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        if (AbstractC4253n.j("linkUrl", readableMap)) {
            this.f46376b.putExtra("link_url", readableMap.getString("linkUrl"));
        }
        if (AbstractC4253n.j("linkText", readableMap)) {
            this.f46376b.putExtra("link_text", readableMap.getString("linkText"));
        }
        boolean z10 = AbstractC4253n.j("backgroundImage", readableMap) || AbstractC4253n.j("backgroundVideo", readableMap);
        if (z10) {
            boolean j10 = AbstractC4253n.j("backgroundImage", readableMap);
            String str2 = ClipboardModule.MIMETYPE_JPEG;
            if (j10) {
                str = readableMap.getString("backgroundImage");
            } else if (AbstractC4253n.j("backgroundVideo", readableMap)) {
                str = readableMap.getString("backgroundVideo");
                str2 = "video/*";
            } else {
                str = "";
            }
            cl.json.e eVar = new cl.json.e(str, str2, AppStateModule.APP_STATE_BACKGROUND, bool2, this.f46375a);
            this.f46376b.setDataAndType(eVar.d(), eVar.c());
            this.f46376b.setFlags(1);
        }
        if (AbstractC4253n.j("stickerImage", readableMap)) {
            cl.json.e eVar2 = new cl.json.e(readableMap.getString("stickerImage"), ClipboardModule.MIMETYPE_PNG, "sticker", bool2, this.f46375a);
            if (!z10) {
                this.f46376b.setType("image/*");
            }
            this.f46376b.putExtra("interactive_asset_uri", eVar2.d());
            currentActivity.grantUriPermission("com.instagram.android", eVar2.d(), 1);
        }
    }

    @Override // f3.AbstractC4253n
    public String b() {
        return null;
    }

    @Override // f3.AbstractC4253n
    public String h() {
        return "com.instagram.android";
    }

    @Override // f3.AbstractC4253n
    public String i() {
        return "https://play.google.com/store/apps/details?id=com.instagram.android";
    }

    @Override // f3.AbstractC4254o, f3.AbstractC4253n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        q(readableMap);
        p(readableMap);
    }
}

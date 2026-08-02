package f3;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import cl.json.NativeRNShareSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.twilio.voice.EventKeys;

/* renamed from: f3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4247h extends AbstractC4254o {
    public C4247h(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
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
        if (!AbstractC4253n.j("type", readableMap)) {
            Log.e(NativeRNShareSpec.NAME, "No type provided");
            return;
        }
        String string = readableMap.getString("type");
        if (string.startsWith("text")) {
            s(this.f46377c);
            return;
        }
        if (!AbstractC4253n.j(EventKeys.URL, readableMap)) {
            Log.e(NativeRNShareSpec.NAME, "No url provided");
            return;
        }
        String string2 = readableMap.getString(EventKeys.URL);
        if (string2.startsWith("instagram://")) {
            t(string2);
            return;
        }
        String q10 = q(string);
        r(string2, this.f46377c, Boolean.valueOf(string.startsWith("image")), q10);
    }

    public final String q(String str) {
        return str.split("/")[r2.length - 1];
    }

    public void r(String str, String str2, Boolean bool, String str3) {
        cl.json.e eVar;
        Boolean valueOf = Boolean.valueOf(AbstractC4253n.j("useInternalStorage", this.f46379e) && this.f46379e.getBoolean("useInternalStorage"));
        if (bool.booleanValue()) {
            eVar = new cl.json.e(str, "image/" + str3, "image", valueOf, this.f46375a);
        } else {
            eVar = new cl.json.e(str, "video/" + str3, "video", valueOf, this.f46375a);
        }
        Uri d10 = eVar.d();
        Intent intent = new Intent("android.intent.action.SEND");
        if (bool.booleanValue()) {
            intent.setType("image/*");
        } else {
            intent.setType("video/*");
        }
        intent.putExtra("android.intent.extra.STREAM", d10);
        intent.setPackage("com.instagram.android");
        Intent intent2 = new Intent("com.instagram.share.ADD_TO_STORY");
        intent2.setDataAndType(d10, str3);
        intent2.addFlags(1);
        intent2.setPackage("com.instagram.android");
        Intent createChooser = Intent.createChooser(intent, str2);
        createChooser.addFlags(268435456);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
        this.f46375a.getCurrentActivity().grantUriPermission("com.instagram.android", d10, 1);
        this.f46375a.startActivity(createChooser);
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("success", true);
        createMap.putString("message", f().getPackage());
        q.b(createMap);
    }

    public void s(String str) {
        f().setPackage("com.instagram.android");
        f().setType("text/plain");
        f().setAction("android.intent.action.SEND");
        super.m();
    }

    public void t(String str) {
        Uri parse = Uri.parse(str);
        f().setAction("android.intent.action.VIEW");
        f().setData(parse);
        super.m();
    }
}

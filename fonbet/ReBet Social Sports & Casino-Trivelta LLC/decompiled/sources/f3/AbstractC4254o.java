package f3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.twilio.voice.EventKeys;

/* renamed from: f3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4254o extends AbstractC4253n {

    /* renamed from: f, reason: collision with root package name */
    public String f46380f;

    /* renamed from: g, reason: collision with root package name */
    public String f46381g;

    public AbstractC4254o(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f46380f = null;
        this.f46381g = null;
    }

    @Override // f3.AbstractC4253n
    public void l(ReadableMap readableMap) {
        System.out.println(h());
        if (h() != null || b() != null || i() != null) {
            if (AbstractC4253n.k(h(), this.f46375a)) {
                System.out.println("INSTALLED");
                if (a() != null) {
                    f().setComponent(new ComponentName(h(), a()));
                } else {
                    f().setPackage(h());
                }
                super.l(readableMap);
                return;
            }
            System.out.println("NOT INSTALLED");
            n(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(b() != null ? b().replace("{url}", AbstractC4253n.o(readableMap.getString(EventKeys.URL))).replace("{message}", AbstractC4253n.o(readableMap.getString("message"))) : i() != null ? i() : ""))));
        }
        super.l(readableMap);
    }

    @Override // f3.AbstractC4253n
    public void m() {
        p(null);
    }

    public void p(ReadableMap readableMap) {
        if (!this.f46379e.hasKey("forceDialog") || !this.f46379e.getBoolean("forceDialog")) {
            f().addFlags(268435456);
            this.f46375a.startActivity(f());
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("success", true);
            createMap.putString("message", f().getPackage());
            q.b(createMap);
            return;
        }
        Activity currentActivity = this.f46375a.getCurrentActivity();
        if (currentActivity == null) {
            q.a("Something went wrong");
            return;
        }
        if (readableMap != null && !AbstractC4253n.j("social", readableMap)) {
            throw new IllegalArgumentException("social is empty");
        }
        if (q.d()) {
            Intent createChooser = Intent.createChooser(f(), this.f46377c, q.c(this.f46375a));
            createChooser.addFlags(1073741824);
            currentActivity.startActivityForResult(createChooser, 16845);
            return;
        }
        Intent createChooser2 = Intent.createChooser(f(), this.f46377c);
        createChooser2.addFlags(1073741824);
        currentActivity.startActivityForResult(createChooser2, 16845);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putBoolean("success", true);
        createMap2.putString("message", "OK");
        q.b(createMap2);
    }
}

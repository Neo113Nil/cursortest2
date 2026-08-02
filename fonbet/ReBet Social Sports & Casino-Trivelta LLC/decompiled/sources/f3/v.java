package f3;

import android.content.ComponentName;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
public class v extends AbstractC4254o {
    public v(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // f3.AbstractC4253n
    public String b() {
        return null;
    }

    @Override // f3.AbstractC4253n
    public String h() {
        return "com.whatsapp";
    }

    @Override // f3.AbstractC4253n
    public String i() {
        return "market://details?id=com.whatsapp";
    }

    @Override // f3.AbstractC4254o, f3.AbstractC4253n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        if (readableMap.hasKey("whatsAppNumber")) {
            try {
                f().setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                m();
                Thread.sleep(10L);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        f().setComponent(null);
        m();
    }
}

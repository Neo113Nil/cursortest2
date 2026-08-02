package f3;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: f3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4246g extends AbstractC4254o {
    public C4246g(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // f3.AbstractC4253n
    public String b() {
        return "https://plus.google.com/share?url={url}";
    }

    @Override // f3.AbstractC4253n
    public String h() {
        return "com.google.android.apps.plus";
    }

    @Override // f3.AbstractC4253n
    public String i() {
        return "market://details?id=com.google.android.apps.plus";
    }

    @Override // f3.AbstractC4254o, f3.AbstractC4253n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}

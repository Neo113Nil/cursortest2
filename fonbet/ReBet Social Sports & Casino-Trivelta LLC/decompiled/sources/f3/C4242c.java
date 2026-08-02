package f3;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4242c extends AbstractC4254o {
    public C4242c(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // f3.AbstractC4253n
    public String b() {
        return "https://www.facebook.com/sharer/sharer.php?u={url}";
    }

    @Override // f3.AbstractC4253n
    public String h() {
        return "com.facebook.pages.app";
    }

    @Override // f3.AbstractC4253n
    public String i() {
        return null;
    }

    @Override // f3.AbstractC4254o, f3.AbstractC4253n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}

package f3;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: f3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4251l extends AbstractC4254o {
    public C4251l(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // f3.AbstractC4253n
    public String b() {
        return "https://pinterest.com/pin/create/button/?url={url}&media=$media&description={message}";
    }

    @Override // f3.AbstractC4253n
    public String h() {
        return "com.pinterest";
    }

    @Override // f3.AbstractC4253n
    public String i() {
        return "market://details?id=com.pinterest";
    }

    @Override // f3.AbstractC4254o, f3.AbstractC4253n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}

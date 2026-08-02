package f3;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
public class s extends AbstractC4254o {
    public s(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // f3.AbstractC4253n
    public String b() {
        return "https://twitter.com/intent/tweet?text={message}&url={url}";
    }

    @Override // f3.AbstractC4253n
    public String h() {
        return "com.twitter.android";
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

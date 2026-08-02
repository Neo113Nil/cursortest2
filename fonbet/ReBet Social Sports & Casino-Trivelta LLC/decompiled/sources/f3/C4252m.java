package f3;

import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: f3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4252m extends AbstractC4254o {

    /* renamed from: h, reason: collision with root package name */
    public ReactApplicationContext f46374h;

    public C4252m(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f46374h = reactApplicationContext;
    }

    @Override // f3.AbstractC4253n
    public String b() {
        return null;
    }

    @Override // f3.AbstractC4253n
    public String h() {
        return Telephony.Sms.getDefaultSmsPackage(this.f46374h);
    }

    @Override // f3.AbstractC4253n
    public String i() {
        return "market://details?id=com.android.mms";
    }

    @Override // f3.AbstractC4254o, f3.AbstractC4253n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}

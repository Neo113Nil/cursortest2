package da;

import com.vk.id.captcha.web.VKCaptchaJSInterface;
import io.sentry.android.replay.util.h;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61447c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f61445a = i11;
        this.f61446b = obj;
        this.f61447c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61445a) {
            case 0:
                VKCaptchaJSInterface.a((JSONObject) this.f61446b, (VKCaptchaJSInterface) this.f61447c);
                break;
            default:
                h.a((Runnable) this.f61446b, (h) this.f61447c);
                break;
        }
    }
}

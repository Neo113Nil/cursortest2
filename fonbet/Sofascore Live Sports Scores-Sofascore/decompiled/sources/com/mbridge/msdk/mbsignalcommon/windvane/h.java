package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.mbsignalcommon.mapping.b;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class h implements b, Handler.Callback {
    protected Pattern a;
    protected String b;
    protected Context d;
    protected WindVaneWebView e;
    protected final int c = 1;
    protected Handler f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.d = context;
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.d);
        if (jsObject == null) {
            return;
        }
        try {
            b.C1280b a = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.d.getClassLoader(), jsObject.getClass().getName()).a(aVar.e, Object.class, String.class);
            a.a();
            if (jsObject instanceof g) {
                aVar.a = a;
                aVar.c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a a = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.e, str);
        if (a != null) {
            a.b = this.e;
            return a;
        }
        Matcher matcher = this.a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int groupCount = matcher.groupCount();
            if (groupCount >= 5) {
                aVar.f = matcher.group(5);
            }
            if (groupCount >= 3) {
                aVar.d = matcher.group(1);
                aVar.g = matcher.group(2);
                String group = matcher.group(3);
                aVar.e = group;
                HashMap<String, String> hashMap = com.mbridge.msdk.mbsignalcommon.base.e.k;
                if (hashMap != null && hashMap.containsKey(group)) {
                    aVar.e = com.mbridge.msdk.mbsignalcommon.base.e.k.get(aVar.e);
                }
                aVar.b = this.e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = aVar.c;
        b.C1280b c1280b = aVar.a;
        if (c1280b != null && obj != null) {
            c1280b.a(obj, aVar, TextUtils.isEmpty(aVar.f) ? "{}" : aVar.f);
        }
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a c;
        if (TextUtils.isEmpty(str) || (c = c(str)) == null) {
            return;
        }
        a(c);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.e = windVaneWebView;
    }

    public void a(int i, a aVar) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = aVar;
        this.f.sendMessage(obtain);
    }

    public void a(Pattern pattern) {
        this.a = pattern;
    }
}

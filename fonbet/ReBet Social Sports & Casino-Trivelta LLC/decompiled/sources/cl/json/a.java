package cl.json;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.twilio.voice.EventKeys;
import f3.AbstractC4253n;
import f3.C4240a;
import f3.C4241b;
import f3.C4242c;
import f3.C4243d;
import f3.C4244e;
import f3.C4245f;
import f3.C4246g;
import f3.C4247h;
import f3.C4248i;
import f3.C4249j;
import f3.C4250k;
import f3.C4251l;
import f3.C4252m;
import f3.C4255p;
import f3.q;
import f3.r;
import f3.s;
import f3.t;
import f3.u;
import f3.v;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements ActivityEventListener {

    /* renamed from: a, reason: collision with root package name */
    public static ReactApplicationContext f27861a;

    /* renamed from: cl.json.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0450a {
        static final /* synthetic */ int[] $SwitchMap$cl$json$RNShareImpl$SHARES;

        static {
            int[] iArr = new int[b.values().length];
            $SwitchMap$cl$json$RNShareImpl$SHARES = iArr;
            try {
                iArr[b.generic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.facebookstories.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.pagesmanager.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.twitter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.whatsapp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.whatsappbusiness.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.instagram.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.instagramstories.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.googleplus.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.email.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.pinterest.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.sms.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.snapchat.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.messenger.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.linkedin.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.telegram.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.viber.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$cl$json$RNShareImpl$SHARES[b.discord.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public enum b {
        facebook,
        facebookstories,
        generic,
        pagesmanager,
        twitter,
        whatsapp,
        whatsappbusiness,
        instagram,
        instagramstories,
        googleplus,
        email,
        pinterest,
        messenger,
        snapchat,
        sms,
        linkedin,
        telegram,
        viber,
        discord;

        public static AbstractC4253n b(String str, ReactApplicationContext reactApplicationContext) {
            switch (C0450a.$SwitchMap$cl$json$RNShareImpl$SHARES[valueOf(str).ordinal()]) {
                case 1:
                    return new C4245f(reactApplicationContext);
                case 2:
                    return new C4243d(reactApplicationContext);
                case 3:
                    return new C4244e(reactApplicationContext);
                case 4:
                    return new C4242c(reactApplicationContext);
                case 5:
                    return new s(reactApplicationContext);
                case 6:
                    return new v(reactApplicationContext);
                case 7:
                    return new u(reactApplicationContext);
                case 8:
                    return new C4247h(reactApplicationContext);
                case 9:
                    return new C4248i(reactApplicationContext);
                case 10:
                    return new C4246g(reactApplicationContext);
                case 11:
                    return new C4241b(reactApplicationContext);
                case 12:
                    return new C4251l(reactApplicationContext);
                case 13:
                    return new C4252m(reactApplicationContext);
                case 14:
                    return new C4255p(reactApplicationContext);
                case 15:
                    return new C4250k(reactApplicationContext);
                case 16:
                    return new C4249j(reactApplicationContext);
                case 17:
                    return new r(reactApplicationContext);
                case 18:
                    return new t(reactApplicationContext);
                case 19:
                    return new C4240a(reactApplicationContext);
                default:
                    return null;
            }
        }
    }

    public a(ReactApplicationContext reactApplicationContext) {
        f27861a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public Map a() {
        HashMap hashMap = new HashMap();
        for (b bVar : b.values()) {
            hashMap.put(bVar.toString().toUpperCase(Locale.ROOT), bVar.toString());
        }
        return hashMap;
    }

    public void b(String str, Promise promise) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme == null || !scheme.equals(EventKeys.DATA)) {
                promise.resolve(Boolean.FALSE);
            } else {
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e10) {
            Log.e(NativeRNShareSpec.NAME, e10.getMessage());
            e10.printStackTrace(System.out);
            promise.reject(e10.getMessage());
        }
    }

    public void c(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(AbstractC4253n.k(str, f27861a)));
        } catch (Exception e10) {
            Log.e(NativeRNShareSpec.NAME, e10.getMessage());
            promise.reject(e10.getMessage());
        }
    }

    public void d(int i10, int i11, Intent intent) {
        if (i10 == 16845) {
            if (i11 == 0) {
                WritableMap createMap = Arguments.createMap();
                createMap.putBoolean("success", false);
                createMap.putString("message", "CANCELED");
                q.b(createMap);
                return;
            }
            if (i11 == -1) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putBoolean("success", true);
                q.b(createMap2);
            }
        }
    }

    public void e(ReadableMap readableMap, Promise promise) {
        q.e(promise);
        try {
            new C4245f(f27861a).l(readableMap);
        } catch (ActivityNotFoundException e10) {
            Log.e(NativeRNShareSpec.NAME, e10.getMessage());
            e10.printStackTrace(System.out);
            q.a("not_available");
        } catch (Exception e11) {
            Log.e(NativeRNShareSpec.NAME, e11.getMessage());
            e11.printStackTrace(System.out);
            q.a(e11.getMessage());
        }
    }

    public void f(ReadableMap readableMap, Promise promise) {
        q.e(promise);
        if (!AbstractC4253n.j("social", readableMap)) {
            q.a("key 'social' missing in options");
            return;
        }
        try {
            AbstractC4253n b10 = b.b(readableMap.getString("social"), f27861a);
            if (b10 == null) {
                throw new ActivityNotFoundException("Invalid share activity");
            }
            b10.l(readableMap);
        } catch (ActivityNotFoundException e10) {
            Log.e(NativeRNShareSpec.NAME, e10.getMessage());
            e10.printStackTrace(System.out);
            q.a(e10.getMessage());
        } catch (Exception e11) {
            Log.e(NativeRNShareSpec.NAME, e11.getMessage());
            e11.printStackTrace(System.out);
            q.a(e11.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        d(i10, i11, intent);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}

package t8;

import com.facebook.AccessToken;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.textinput.ReactTextChangedEvent;
import d8.x;
import e8.f;
import g6.AbstractC4348h;
import g6.C4357q;
import g6.InterfaceC4350j;
import g6.InterfaceC4354n;
import java.util.Iterator;
import java.util.Set;

/* renamed from: t8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6449c extends f {

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC4350j f65772B;

    /* renamed from: t8.c$a */
    public class a extends AbstractC4348h {
        public a() {
        }

        @Override // g6.AbstractC4348h
        public void d(AccessToken accessToken, AccessToken accessToken2) {
            if (accessToken2 == null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("type", "logoutFinished");
                ((RCTEventEmitter) ((ReactContext) C6449c.this.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(C6449c.this.getId(), ReactTextChangedEvent.EVENT_NAME, createMap);
            }
        }
    }

    /* renamed from: t8.c$b */
    public class b implements InterfaceC4354n {
        public b() {
        }

        @Override // g6.InterfaceC4354n
        public void a(C4357q c4357q) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", "loginFinished");
            createMap.putString("error", c4357q.toString());
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean("isCancelled", false);
            createMap.putMap("result", createMap2);
            ((RCTEventEmitter) ((ReactContext) C6449c.this.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(C6449c.this.getId(), ReactTextChangedEvent.EVENT_NAME, createMap);
        }

        @Override // g6.InterfaceC4354n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(x xVar) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", "loginFinished");
            createMap.putString("error", null);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean("isCancelled", false);
            createMap2.putArray("grantedPermissions", Arguments.fromJavaArgs((Object[]) C6449c.this.K(xVar.c())));
            createMap2.putArray("declinedPermissions", Arguments.fromJavaArgs((Object[]) C6449c.this.K(xVar.b())));
            createMap.putMap("result", createMap2);
            ((RCTEventEmitter) ((ReactContext) C6449c.this.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(C6449c.this.getId(), ReactTextChangedEvent.EVENT_NAME, createMap);
        }

        @Override // g6.InterfaceC4354n
        public void onCancel() {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", "loginFinished");
            createMap.putString("error", null);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean("isCancelled", true);
            createMap.putMap("result", createMap2);
            ((RCTEventEmitter) ((ReactContext) C6449c.this.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(C6449c.this.getId(), ReactTextChangedEvent.EVENT_NAME, createMap);
        }
    }

    public C6449c(ThemedReactContext themedReactContext, InterfaceC4350j interfaceC4350j) {
        super(themedReactContext);
        setToolTipMode(f.d.NEVER_DISPLAY);
        this.f65772B = interfaceC4350j;
        J();
    }

    public void J() {
        new a();
        C(this.f65772B, new b());
    }

    public final String[] K(Set set) {
        String[] strArr = new String[set.size()];
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = (String) it.next();
            i10++;
        }
        return strArr;
    }
}

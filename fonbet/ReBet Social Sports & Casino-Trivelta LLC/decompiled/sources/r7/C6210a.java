package r7;

import T7.AbstractC1671k;
import T7.C1661a;
import T7.C1665e;
import T7.C1667g;
import T7.C1670j;
import T7.M;
import T7.Z;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.share.model.GameRequestContent;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import g6.C4331C;
import g6.C4339K;
import g6.C4357q;
import g6.InterfaceC4354n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s7.AbstractC6341a;
import s7.c;
import t7.EnumC6446b;
import v8.AbstractC6654c;
import v8.AbstractC6658g;
import v8.C6663l;
import v8.C6665n;

/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6210a extends AbstractC1671k {

    /* renamed from: i, reason: collision with root package name */
    public static final int f64059i = C1665e.c.GameRequest.b();

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4354n f64060h;

    /* renamed from: r7.a$a, reason: collision with other inner class name */
    public class C0889a extends AbstractC6658g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4354n f64061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0889a(InterfaceC4354n interfaceC4354n, InterfaceC4354n interfaceC4354n2) {
            super(interfaceC4354n);
            this.f64061b = interfaceC4354n2;
        }

        @Override // v8.AbstractC6658g
        public void c(C1661a c1661a, Bundle bundle) {
            if (bundle != null) {
                this.f64061b.onSuccess(new f(bundle, (C0889a) null));
            } else {
                a(c1661a);
            }
        }
    }

    /* renamed from: r7.a$b */
    public class b implements C1665e.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC6658g f64063a;

        public b(AbstractC6658g abstractC6658g) {
            this.f64063a = abstractC6658g;
        }

        @Override // T7.C1665e.a
        public boolean a(int i10, Intent intent) {
            return C6663l.p(C6210a.this.h(), i10, intent, this.f64063a);
        }
    }

    /* renamed from: r7.a$c */
    public class c implements c.InterfaceC0900c {
        public c() {
        }

        @Override // s7.c.InterfaceC0900c
        public void a(C4339K c4339k) {
            if (C6210a.this.f64060h != null) {
                if (c4339k.b() != null) {
                    C6210a.this.f64060h.a(new C4357q(c4339k.b().d()));
                } else {
                    C6210a.this.f64060h.onSuccess(new f(c4339k, (C0889a) null));
                }
            }
        }
    }

    /* renamed from: r7.a$d */
    public class d extends AbstractC1671k.b {
        public d() {
            super(C6210a.this);
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(GameRequestContent gameRequestContent, boolean z10) {
            return C1667g.a() != null && Z.e(C6210a.this.f(), C1667g.b());
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1661a b(GameRequestContent gameRequestContent) {
            AbstractC6654c.a(gameRequestContent);
            C1661a e10 = C6210a.this.e();
            Bundle a10 = C6665n.a(gameRequestContent);
            AccessToken d10 = AccessToken.d();
            if (d10 != null) {
                a10.putString(PublisherMetadata.APP_ID, d10.getApplicationId());
            } else {
                a10.putString(PublisherMetadata.APP_ID, C4331C.m());
            }
            a10.putString("redirect_uri", C1667g.b());
            C1670j.i(e10, "apprequests", a10);
            return e10;
        }

        public /* synthetic */ d(C6210a c6210a, C0889a c0889a) {
            this();
        }
    }

    /* renamed from: r7.a$e */
    public class e extends AbstractC1671k.b {
        public e() {
            super(C6210a.this);
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(GameRequestContent gameRequestContent, boolean z10) {
            PackageManager packageManager = C6210a.this.f().getPackageManager();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z11 = intent.resolveActivity(packageManager) != null;
            AccessToken d10 = AccessToken.d();
            return z11 && (d10 != null && d10.getGraphDomain() != null && "gaming".equals(d10.getGraphDomain()));
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1661a b(GameRequestContent gameRequestContent) {
            C1661a e10 = C6210a.this.e();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken d10 = AccessToken.d();
            Bundle bundle = new Bundle();
            bundle.putString("deeplink", "GAME_REQUESTS");
            if (d10 != null) {
                bundle.putString(PublisherMetadata.APP_ID, d10.getApplicationId());
            } else {
                bundle.putString(PublisherMetadata.APP_ID, C4331C.m());
            }
            bundle.putString("actionType", gameRequestContent.getActionType() != null ? gameRequestContent.getActionType().name() : null);
            bundle.putString("message", gameRequestContent.getMessage());
            bundle.putString("title", gameRequestContent.getTitle());
            bundle.putString(EventKeys.DATA, gameRequestContent.getData());
            bundle.putString("cta", gameRequestContent.getCta());
            gameRequestContent.getRecipients();
            JSONArray jSONArray = new JSONArray();
            if (gameRequestContent.getRecipients() != null) {
                Iterator it = gameRequestContent.getRecipients().iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            bundle.putString("to", jSONArray.toString());
            M.D(intent, e10.c().toString(), "", M.x(), bundle);
            e10.g(intent);
            return e10;
        }

        public /* synthetic */ e(C6210a c6210a, C0889a c0889a) {
            this();
        }
    }

    /* renamed from: r7.a$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public String f64068a;

        /* renamed from: b, reason: collision with root package name */
        public List f64069b;

        public /* synthetic */ f(Bundle bundle, C0889a c0889a) {
            this(bundle);
        }

        public String a() {
            return this.f64068a;
        }

        public List b() {
            return this.f64069b;
        }

        public /* synthetic */ f(C4339K c4339k, C0889a c0889a) {
            this(c4339k);
        }

        public f(Bundle bundle) {
            this.f64068a = bundle.getString("request");
            this.f64069b = new ArrayList();
            while (bundle.containsKey(String.format("to[%d]", Integer.valueOf(this.f64069b.size())))) {
                List list = this.f64069b;
                list.add(bundle.getString(String.format("to[%d]", Integer.valueOf(list.size()))));
            }
        }

        public f(C4339K c4339k) {
            try {
                JSONObject c10 = c4339k.c();
                JSONObject optJSONObject = c10.optJSONObject(EventKeys.DATA);
                c10 = optJSONObject != null ? optJSONObject : c10;
                this.f64068a = c10.getString("request_id");
                this.f64069b = new ArrayList();
                JSONArray jSONArray = c10.getJSONArray("to");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this.f64069b.add(jSONArray.getString(i10));
                }
            } catch (JSONException unused) {
                this.f64068a = null;
                this.f64069b = new ArrayList();
            }
        }
    }

    /* renamed from: r7.a$g */
    public class g extends AbstractC1671k.b {
        public g() {
            super(C6210a.this);
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(GameRequestContent gameRequestContent, boolean z10) {
            return true;
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1661a b(GameRequestContent gameRequestContent) {
            AbstractC6654c.a(gameRequestContent);
            C1661a e10 = C6210a.this.e();
            C1670j.m(e10, "apprequests", C6665n.a(gameRequestContent));
            return e10;
        }

        public /* synthetic */ g(C6210a c6210a, C0889a c0889a) {
            this();
        }
    }

    public C6210a(Activity activity) {
        super(activity, f64059i);
    }

    public static boolean r() {
        return true;
    }

    @Override // T7.AbstractC1671k
    public C1661a e() {
        return new C1661a(h());
    }

    @Override // T7.AbstractC1671k
    public List g() {
        ArrayList arrayList = new ArrayList();
        C0889a c0889a = null;
        arrayList.add(new e(this, c0889a));
        arrayList.add(new d(this, c0889a));
        arrayList.add(new g(this, c0889a));
        return arrayList;
    }

    @Override // T7.AbstractC1671k
    public void k(C1665e c1665e, InterfaceC4354n interfaceC4354n) {
        this.f64060h = interfaceC4354n;
        c1665e.c(h(), new b(interfaceC4354n == null ? null : new C0889a(interfaceC4354n, interfaceC4354n)));
    }

    public final void s(GameRequestContent gameRequestContent, Object obj) {
        Activity f10 = f();
        AccessToken d10 = AccessToken.d();
        if (d10 == null || d10.N()) {
            throw new C4357q("Attempted to open GameRequestDialog with an invalid access token");
        }
        c cVar = new c();
        String applicationId = d10.getApplicationId();
        String name = gameRequestContent.getActionType() != null ? gameRequestContent.getActionType().name() : null;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("appID", applicationId);
            jSONObject.put("actionType", name);
            jSONObject.put("message", gameRequestContent.getMessage());
            jSONObject.put("cta", gameRequestContent.getCta());
            jSONObject.put("title", gameRequestContent.getTitle());
            jSONObject.put(EventKeys.DATA, gameRequestContent.getData());
            jSONObject.put("options", gameRequestContent.getFilters());
            if (gameRequestContent.getRecipients() != null) {
                Iterator it = gameRequestContent.getRecipients().iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            jSONObject.put("to", jSONArray);
            s7.c.h(f10, jSONObject, cVar, EnumC6446b.OPEN_GAME_REQUESTS_DIALOG);
        } catch (JSONException unused) {
            InterfaceC4354n interfaceC4354n = this.f64060h;
            if (interfaceC4354n != null) {
                interfaceC4354n.a(new C4357q("Couldn't prepare Game Request Dialog"));
            }
        }
    }

    @Override // T7.AbstractC1671k
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(GameRequestContent gameRequestContent, Object obj) {
        if (AbstractC6341a.a()) {
            s(gameRequestContent, obj);
        } else {
            super.n(gameRequestContent, obj);
        }
    }
}

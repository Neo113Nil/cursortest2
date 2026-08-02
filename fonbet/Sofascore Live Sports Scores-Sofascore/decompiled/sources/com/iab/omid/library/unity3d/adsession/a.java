package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.internal.c;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.publisher.b;
import com.iab.omid.library.unity3d.utils.g;
import defpackage.a70;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a extends AdSession {
    private static final Pattern l = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final AdSessionContext a;
    private final AdSessionConfiguration b;
    private com.iab.omid.library.unity3d.weakreference.a d;
    private AdSessionStatePublisher e;
    private final String h;
    private boolean i;
    private boolean j;
    private PossibleObstructionListener k;
    private final List<e> c = new ArrayList();
    private boolean f = false;
    private boolean g = false;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.b = adSessionConfiguration;
        this.a = adSessionContext;
        String uuid = UUID.randomUUID().toString();
        this.h = uuid;
        d(null);
        AdSessionStatePublisher aVar = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.unity3d.publisher.a(uuid, adSessionContext.getWebView()) : new b(uuid, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.e = aVar;
        aVar.i();
        c.c().a(this);
        this.e.a(adSessionConfiguration);
    }

    private e b(View view) {
        for (e eVar : this.c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void c(View view) {
        Collection<a> b = c.c().b();
        if (b == null || b.isEmpty()) {
            return;
        }
        for (a aVar : b) {
            if (aVar != this && aVar.c() == view) {
                aVar.d.clear();
            }
        }
    }

    private void d(View view) {
        this.d = new com.iab.omid.library.unity3d.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.unity3d.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.unity3d.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.h, arrayList);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public boolean e() {
        return this.k != null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.g) {
            a70.r("AdSession is finished");
            return;
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f && !this.g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void finish() {
        if (this.g) {
            return;
        }
        this.d.clear();
        removeAllFriendlyObstructions();
        this.g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.e = null;
        this.k = null;
    }

    public boolean g() {
        return this.g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public String getAdSessionId() {
        return this.h;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.e;
    }

    public boolean h() {
        return this.b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void registerAdView(View view) {
        if (this.g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.g) {
            return;
        }
        this.c.clear();
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.g) {
            return;
        }
        a(view);
        e b = b(view);
        if (b != null) {
            this.c.remove(b);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void start() {
        if (this.f) {
            return;
        }
        this.f = true;
        c.c().c(this);
        this.e.a(h.c().b());
        this.e.a(com.iab.omid.library.unity3d.internal.a.a().b());
        this.e.a(this, this.a);
    }

    public List<e> d() {
        return this.c;
    }

    private void b() {
        if (this.j) {
            a70.r("Loaded event can only be sent once");
        }
    }

    private static void a(View view) {
        if (view != null) {
            return;
        }
        a70.p("FriendlyObstruction is null");
    }

    public View c() {
        return this.d.get();
    }

    private void a(String str) {
        String str2;
        if (str != null) {
            if (str.length() > 50) {
                str2 = "FriendlyObstruction has detailed reason over 50 characters in length";
            } else if (l.matcher(str).matches()) {
                return;
            } else {
                str2 = "FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space";
            }
            a70.p(str2);
        }
    }

    private void a() {
        if (this.i) {
            a70.r("Impression event can only be sent once");
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.j = true;
    }
}

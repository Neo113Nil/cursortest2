package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl;
import com.google.ads.interactivemedia.v3.impl.data.ObstructionListData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oun implements nxn {
    public final qrn a;
    public final WebView b;
    public final l8o c;
    public final View d;
    public String e;
    public i2o i;
    public final boolean g = false;
    public String h = null;
    public final HashSet f = new HashSet();

    public oun(qrn qrnVar, WebView webView, l8o l8oVar, ViewGroup viewGroup) {
        this.a = qrnVar;
        this.b = webView;
        this.c = l8oVar;
        this.d = viewGroup;
    }

    @Override // defpackage.uf
    public final void a(vf vfVar) {
        i2o i2oVar;
        if (!this.c.b || (i2oVar = this.i) == null) {
            return;
        }
        i2oVar.c();
        this.i = null;
    }

    @Override // defpackage.nxn
    public final void b(FriendlyObstructionImpl friendlyObstructionImpl) {
        d(friendlyObstructionImpl);
    }

    @Override // defpackage.wf
    public final void c(hoo hooVar) {
        i2o i2oVar;
        View view;
        l8o l8oVar = this.c;
        if (l8oVar.b) {
            int ordinal = hooVar.a.ordinal();
            if (ordinal == 3 || ordinal == 15) {
                if (!l8oVar.b || (i2oVar = this.i) == null) {
                    return;
                }
                i2oVar.c();
                this.i = null;
                return;
            }
            if (ordinal == 16 && l8oVar.b && this.i == null && (view = this.d) != null) {
                fjg fjgVar = new fjg(true);
                if (TextUtils.isEmpty("Google1")) {
                    a70.p("Name is null or empty");
                    return;
                }
                if (TextUtils.isEmpty("3.39.0")) {
                    a70.p("Version is null or empty");
                    return;
                }
                kif kifVar = new kif(24);
                String str = this.h;
                String str2 = true != this.g ? "false" : "true";
                p03 D = p03.D(kifVar, this.b, str, wt3.m("{ssai:", str2, new StringBuilder(str2.length() + 7), "}"));
                if (!cqn.a.a) {
                    a70.r("Method called before OM SDK activation");
                    return;
                }
                i2o i2oVar2 = new i2o(fjgVar, D, UUID.randomUUID().toString());
                i2oVar2.b(view);
                HashSet hashSet = this.f;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    as8 as8Var = (as8) it.next();
                    View view2 = as8Var.getView();
                    cs8 cs8Var = (cs8) Enum.valueOf(cs8.class, as8Var.getPurpose().name());
                    String detailedReason = as8Var.getDetailedReason();
                    if (!i2oVar2.f) {
                        i2oVar2.b.a(view2, cs8Var, detailedReason);
                    }
                }
                e(new ArrayList(hashSet));
                i2oVar2.a();
                this.i = i2oVar2;
            }
        }
    }

    public final void d(as8 as8Var) {
        HashSet hashSet = this.f;
        if (hashSet.contains(as8Var)) {
            return;
        }
        hashSet.add(as8Var);
        i2o i2oVar = this.i;
        if (i2oVar != null) {
            View view = as8Var.getView();
            cs8 cs8Var = (cs8) Enum.valueOf(cs8.class, as8Var.getPurpose().name());
            String detailedReason = as8Var.getDetailedReason();
            if (!i2oVar.f) {
                i2oVar.b.a(view, cs8Var, detailedReason);
            }
            e(Arrays.asList(as8Var));
        }
    }

    public final void e(List list) {
        ObstructionListData obstructionListData;
        if (list == null) {
            obstructionListData = null;
        } else if (list.isEmpty()) {
            return;
        } else {
            obstructionListData = ObstructionListData.builder().friendlyObstructions(list).build();
        }
        ((mqn) this.a).d(new lda(JavaScriptMessage$MsgChannel.omid, JavaScriptMessage$MsgType.registerFriendlyObstructions, this.e, obstructionListData, null));
    }

    @Override // defpackage.nxn
    public final void n(String str) {
        this.h = str;
    }

    @Override // defpackage.nxn
    public final void w() {
        i2o i2oVar;
        if (!this.c.b || (i2oVar = this.i) == null) {
            return;
        }
        i2oVar.c();
        this.i = null;
    }

    @Override // defpackage.nxn
    public final void zzb() {
        this.f.clear();
        i2o i2oVar = this.i;
        if (i2oVar == null) {
            return;
        }
        if (!i2oVar.f) {
            i2oVar.b.a.clear();
        }
        e(null);
    }

    @Override // defpackage.nxn
    public final void zzf(String str) {
        this.e = str;
    }
}

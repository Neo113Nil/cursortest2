package com.vk.auth.ui.consent;

import com.vk.auth.main.AuthModel;
import com.vk.auth.main.TermsLink;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q0;
import io.reactivex.rxjava3.core.q;
import java.util.Collections;
import java.util.List;
import xsna.dq;
import xsna.epx;
import xsna.fw3;
import xsna.fyd0;
import xsna.gyo0;
import xsna.gzs;
import xsna.izs;
import xsna.pr0;
import xsna.r55;
import xsna.sf3;
import xsna.skj0;
import xsna.uf3;

/* compiled from: VkConsentScreenContract.kt */
/* loaded from: classes15.dex */
public final class g {
    public static final a h;
    public static final g i;
    public final String a;
    public final h b;
    public final List<b> c;
    public final izs<String, String> d;
    public final izs<String, String> e;
    public final gzs<List<TermsLink>> f;
    public final boolean g;

    /* compiled from: VkConsentScreenContract.kt */
    public static final class a {
        public static g a(a aVar, String str, h hVar, fyd0 fyd0Var, skj0 skj0Var, gyo0 gyo0Var, int i) {
            izs izsVar;
            izs izsVar2;
            gzs dVar = (i & 4) != 0 ? new d(0, aVar, a.class, "getDefaultDataProvider", "getDefaultDataProvider()Lio/reactivex/rxjava3/core/Observable;", 0) : fyd0Var;
            if ((i & 8) != 0) {
                r55 r55Var = r55.a;
                izsVar = new e(1, r55.h(), AuthModel.class, "getTermsLink", "getTermsLink(Ljava/lang/String;)Ljava/lang/String;", 0);
            } else {
                izsVar = skj0Var;
            }
            if ((i & 16) != 0) {
                r55 r55Var2 = r55.a;
                izsVar2 = new f(1, r55.h(), AuthModel.class, "getPrivacyLink", "getPrivacyLink(Ljava/lang/String;)Ljava/lang/String;", 0);
            } else {
                izsVar2 = gyo0Var;
            }
            r55 r55Var3 = r55.a;
            pr0 k = r55.h().k();
            boolean z = (i & 64) == 0;
            aVar.getClass();
            return new g(str, hVar, Collections.singletonList(new b("", dVar)), izsVar, izsVar2, k, z);
        }
    }

    /* compiled from: VkConsentScreenContract.kt */
    public static final class b {
        public final String a;
        public final gzs<q<List<VkAuthAppScope>>> b;

        public b(String str, gzs gzsVar) {
            this.a = str;
            this.b = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 961);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConsentApp(title=");
            sb.append(this.a);
            sb.append(", description=null, scopesProvider=");
            return uf3.d(sb, this.b, ')');
        }
    }

    static {
        a aVar = new a();
        h = aVar;
        i = a.a(aVar, "", h.b, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(String str, h hVar, List<b> list, izs<? super String, String> izsVar, izs<? super String, String> izsVar2, gzs<? extends List<TermsLink>> gzsVar, boolean z) {
        this.a = str;
        this.b = hVar;
        this.c = list;
        this.d = izsVar;
        this.e = izsVar2;
        this.f = gzsVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e) && epx.f(this.f, gVar.f) && this.g == gVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + sf3.a(dq.c(dq.c(fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(serviceName=");
        sb.append(this.a);
        sb.append(", serviceIcon=");
        sb.append(this.b);
        sb.append(", consentApps=");
        sb.append(this.c);
        sb.append(", serviceTermsLinkProvider=");
        sb.append(this.d);
        sb.append(", servicePrivacyLinkProvider=");
        sb.append(this.e);
        sb.append(", serviceCustomLinksProvider=");
        sb.append(this.f);
        sb.append(", isMiniApp=");
        return q0.a(sb, this.g, ')');
    }
}

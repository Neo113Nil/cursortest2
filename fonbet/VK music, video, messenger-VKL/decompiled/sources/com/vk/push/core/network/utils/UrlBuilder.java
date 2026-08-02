package com.vk.push.core.network.utils;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.B5;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.push.common.HostInfoProvider;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import xsna.drm0;
import xsna.epx;
import xsna.gq;
import xsna.h5s;
import xsna.ho8;
import xsna.izs;
import xsna.j5g;
import xsna.q2z;
import xsna.zcl;

/* compiled from: UrlBuilder.kt */
/* loaded from: classes5.dex */
public final class UrlBuilder {
    public final String a;
    public final String b;
    public final Integer c;
    public final ArrayList d;
    public final ArrayList e;

    /* compiled from: UrlBuilder.kt */
    public static final class a extends Lambda implements izs<Pair<? extends String, ? extends String>, CharSequence> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final CharSequence invoke(Pair<? extends String, ? extends String> pair) {
            Pair<? extends String, ? extends String> pair2 = pair;
            String d = pair2.d();
            String g = pair2.g();
            StringBuilder sb = new StringBuilder();
            Charset charset = StandardCharsets.UTF_8;
            sb.append(URLEncoder.encode(d, charset.toString()));
            sb.append(B5.U);
            sb.append(URLEncoder.encode(g, charset.toString()));
            return sb.toString();
        }
    }

    public UrlBuilder(String str, String str2, Integer num) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final UrlBuilder addPathSegments(String str) {
        List c0 = drm0.c0(str, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        this.d.addAll(arrayList);
        return this;
    }

    public final UrlBuilder addQueryParameter(String str, String str2) {
        q2z.a(str, str2, this.e);
        return this;
    }

    public final UrlBuilder addQueryParams(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            q2z.a(entry.getKey(), entry.getValue(), this.e);
        }
        return this;
    }

    public final String build() {
        String str;
        String str2;
        ArrayList arrayList = this.d;
        String str3 = "";
        if (arrayList.isEmpty()) {
            str = "";
        } else {
            str = DomExceptionUtils.SEPARATOR + j5g.g0(arrayList, DomExceptionUtils.SEPARATOR, null, null, 0, null, 62);
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty()) {
            str2 = "";
        } else {
            str2 = "?" + j5g.g0(arrayList2, "&", null, null, 0, a.i, 30);
        }
        String str4 = this.a;
        Integer num = this.c;
        if (num != null) {
            if (num.intValue() != (epx.f(str4, "http") ? 80 : epx.f(str4, HttpRequest.DEFAULT_SCHEME) ? 443 : -1)) {
                str3 = gq.d(num, StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
        }
        return h5s.d(ho8.b(str4, "://"), this.b, str3, str, str2);
    }

    public /* synthetic */ UrlBuilder(String str, String str2, Integer num, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : num);
    }

    public UrlBuilder(HostInfoProvider hostInfoProvider) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = hostInfoProvider.getScheme();
        this.b = hostInfoProvider.getHost();
        this.c = hostInfoProvider.getPort();
    }
}

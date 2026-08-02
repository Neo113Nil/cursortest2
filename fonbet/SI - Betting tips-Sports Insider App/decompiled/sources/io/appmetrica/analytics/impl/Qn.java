package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Qn {

    /* renamed from: a, reason: collision with root package name */
    public final Gn f12784a;

    /* renamed from: b, reason: collision with root package name */
    public final V f12785b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12786c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12787d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12788e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f12789f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12790g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f12791h;

    public Qn(Gn gn, V v5, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f12784a = gn;
        this.f12785b = v5;
        this.f12786c = arrayList;
        this.f12787d = str;
        this.f12788e = str2;
        this.f12789f = map;
        this.f12790g = str3;
        this.f12791h = bool;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Gn gn = this.f12784a;
        if (gn != null) {
            for (Dl dl : gn.f12288c) {
                sb2.append("at " + dl.f12163a + "." + dl.f12167e + "(" + dl.f12164b + StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f12165c + StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f12166d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f12784a + "\n" + sb2.toString() + '}';
    }
}

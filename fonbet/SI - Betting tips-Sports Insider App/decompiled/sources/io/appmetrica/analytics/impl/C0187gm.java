package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187gm implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0631ye f13842a = new C0631ye();

    /* renamed from: b, reason: collision with root package name */
    public final C0149fa f13843b = new C0149fa();

    /* renamed from: c, reason: collision with root package name */
    public final Hm f13844c = new Hm();

    /* renamed from: d, reason: collision with root package name */
    public final C0142f3 f13845d = new C0142f3();

    /* renamed from: e, reason: collision with root package name */
    public final C0345n2 f13846e = new C0345n2();

    /* renamed from: f, reason: collision with root package name */
    public final C0573w6 f13847f = new C0573w6();

    /* renamed from: g, reason: collision with root package name */
    public final Dm f13848g = new Dm();

    /* renamed from: h, reason: collision with root package name */
    public final C0406pd f13849h = new C0406pd();

    /* renamed from: i, reason: collision with root package name */
    public final C9 f13850i = new C9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0589wm fromModel(@NonNull C0264jm c0264jm) {
        C0589wm c0589wm = new C0589wm();
        c0589wm.f14868s = c0264jm.f14074u;
        c0589wm.f14869t = c0264jm.f14075v;
        String str = c0264jm.f14056a;
        if (str != null) {
            c0589wm.f14852a = str;
        }
        List list = c0264jm.f14061f;
        if (list != null) {
            c0589wm.f14857f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c0264jm.f14062g;
        if (list2 != null) {
            c0589wm.f14858g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c0264jm.f14057b;
        if (list3 != null) {
            c0589wm.f14854c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c0264jm.f14063h;
        if (list4 != null) {
            c0589wm.f14865o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c0264jm.f14064i;
        if (map != null) {
            c0589wm.f14859h = this.f13847f.fromModel(map);
        }
        C0606xe c0606xe = c0264jm.f14072s;
        if (c0606xe != null) {
            c0589wm.f14871v = this.f13842a.fromModel(c0606xe);
        }
        String str2 = c0264jm.j;
        if (str2 != null) {
            c0589wm.j = str2;
        }
        String str3 = c0264jm.f14058c;
        if (str3 != null) {
            c0589wm.f14855d = str3;
        }
        String str4 = c0264jm.f14059d;
        if (str4 != null) {
            c0589wm.f14856e = str4;
        }
        String str5 = c0264jm.f14060e;
        if (str5 != null) {
            c0589wm.f14867r = str5;
        }
        c0589wm.f14860i = this.f13843b.fromModel(c0264jm.f14067m);
        String str6 = c0264jm.f14065k;
        if (str6 != null) {
            c0589wm.f14861k = str6;
        }
        String str7 = c0264jm.f14066l;
        if (str7 != null) {
            c0589wm.f14862l = str7;
        }
        c0589wm.f14863m = c0264jm.f14070p;
        c0589wm.f14853b = c0264jm.f14068n;
        c0589wm.q = c0264jm.f14069o;
        RetryPolicyConfig retryPolicyConfig = c0264jm.f14073t;
        c0589wm.f14872w = retryPolicyConfig.maxIntervalSeconds;
        c0589wm.f14873x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c0264jm.q;
        if (str8 != null) {
            c0589wm.f14864n = str8;
        }
        Gm gm = c0264jm.f14071r;
        if (gm != null) {
            this.f13844c.getClass();
            C0564vm c0564vm = new C0564vm();
            c0564vm.f14805a = gm.f12285a;
            c0589wm.f14866p = c0564vm;
        }
        c0589wm.f14870u = c0264jm.f14076w;
        C0091d3 c0091d3 = c0264jm.f14077x;
        if (c0091d3 != null) {
            this.f13845d.getClass();
            C0390om c0390om = new C0390om();
            c0390om.f14431a = c0091d3.f13560a;
            c0589wm.f14874y = c0390om;
        }
        C0320m2 c0320m2 = c0264jm.f14078y;
        if (c0320m2 != null) {
            c0589wm.f14875z = this.f13846e.fromModel(c0320m2);
        }
        c0589wm.A = this.f13848g.fromModel(c0264jm.f14079z);
        c0589wm.B = this.f13849h.fromModel(c0264jm.A);
        c0589wm.C = this.f13850i.fromModel(c0264jm.B);
        return c0589wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0264jm toModel(@NonNull C0589wm c0589wm) {
        C0238im c0238im = new C0238im(this.f13843b.toModel(c0589wm.f14860i));
        c0238im.f13956a = c0589wm.f14852a;
        c0238im.j = c0589wm.j;
        c0238im.f13958c = c0589wm.f14855d;
        c0238im.f13957b = Arrays.asList(c0589wm.f14854c);
        c0238im.f13962g = Arrays.asList(c0589wm.f14858g);
        c0238im.f13961f = Arrays.asList(c0589wm.f14857f);
        c0238im.f13959d = c0589wm.f14856e;
        c0238im.f13960e = c0589wm.f14867r;
        c0238im.f13963h = Arrays.asList(c0589wm.f14865o);
        c0238im.f13965k = c0589wm.f14861k;
        c0238im.f13966l = c0589wm.f14862l;
        c0238im.q = c0589wm.f14863m;
        c0238im.f13969o = c0589wm.f14853b;
        c0238im.f13970p = c0589wm.q;
        c0238im.f13973t = c0589wm.f14868s;
        c0238im.f13974u = c0589wm.f14869t;
        c0238im.f13971r = c0589wm.f14864n;
        c0238im.f13975v = c0589wm.f14870u;
        c0238im.f13976w = new RetryPolicyConfig(c0589wm.f14872w, c0589wm.f14873x);
        c0238im.f13964i = this.f13847f.toModel(c0589wm.f14859h);
        C0514tm c0514tm = c0589wm.f14871v;
        if (c0514tm != null) {
            this.f13842a.getClass();
            c0238im.f13968n = new C0606xe(c0514tm.f14688a, c0514tm.f14689b);
        }
        C0564vm c0564vm = c0589wm.f14866p;
        if (c0564vm != null) {
            this.f13844c.getClass();
            c0238im.f13972s = new Gm(c0564vm.f14805a);
        }
        C0390om c0390om = c0589wm.f14874y;
        if (c0390om != null) {
            this.f13845d.getClass();
            c0238im.f13977x = new C0091d3(c0390om.f14431a);
        }
        C0365nm c0365nm = c0589wm.f14875z;
        if (c0365nm != null) {
            c0238im.f13978y = this.f13846e.toModel(c0365nm);
        }
        C0539um c0539um = c0589wm.A;
        if (c0539um != null) {
            this.f13848g.getClass();
            c0238im.f13979z = new Cm(c0539um.f14755a);
        }
        c0238im.A = this.f13849h.toModel(c0589wm.B);
        C0440qm c0440qm = c0589wm.C;
        if (c0440qm != null) {
            this.f13850i.getClass();
            c0238im.B = new B9(c0440qm.f14526a);
        }
        return new C0264jm(c0238im);
    }
}

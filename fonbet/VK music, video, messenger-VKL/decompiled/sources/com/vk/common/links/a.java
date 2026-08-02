package com.vk.common.links;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.vk.common.links.LinksParserData;
import com.vk.dto.specials.SpecialEvent;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import java.lang.ref.WeakReference;
import xsna.a0a;
import xsna.a8v;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.cqi;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.exi0;
import xsna.ey50;
import xsna.fjk0;
import xsna.fw3;
import xsna.j990;
import xsna.jad;
import xsna.jsv;
import xsna.ljk0;
import xsna.mjk0;
import xsna.naz;
import xsna.ojk0;
import xsna.pjk0;
import xsna.qaz;
import xsna.qns0;
import xsna.r9c0;
import xsna.rl3;
import xsna.rsg0;
import xsna.tts;
import xsna.u1u0;
import xsna.up;
import xsna.uy3;
import xsna.vlc0;
import xsna.ww50;
import xsna.xdr0;
import xsna.z6f0;

/* compiled from: LinkSpanFactory.kt */
/* loaded from: classes17.dex */
public final class a {
    public final fjk0 a;
    public final bpn0 b = new bpn0(new com.vk.movika.sdk.base.model.props.c(18));

    /* compiled from: LinkSpanFactory.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinksParserData.HashtagService.values().length];
            try {
                iArr[LinksParserData.HashtagService.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinksParserData.HashtagService.Clips.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinksParserData.HashtagService.Posts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(fjk0 fjk0Var) {
        this.a = fjk0Var;
    }

    public final qaz a(String str, LinksParserData linksParserData, boolean z) {
        int i;
        int i2;
        String str2 = linksParserData.f;
        if (str == null) {
            return null;
        }
        qaz qazVar = epx.f(linksParserData.e, str) ? new qaz(null, 0) : str2 != null ? new qaz(up.b(1, str, fw3.e(str2)), 0) : new qaz(str, 0);
        qazVar.i = linksParserData.j;
        qazVar.j = linksParserData.k;
        int i3 = linksParserData.g;
        if (i3 != 0) {
            qazVar.c(i3);
            return qazVar;
        }
        int i4 = linksParserData.h;
        if (i4 != 0) {
            qazVar.b(i4);
            return qazVar;
        }
        if (z && (i2 = linksParserData.c) != 0) {
            qazVar.c(i2);
            return qazVar;
        }
        if (z && (i = linksParserData.d) != 0) {
            qazVar.b(i);
        }
        return qazVar;
    }

    public final qaz b(String str, LinksParserData linksParserData, boolean z) {
        if (str == null) {
            return null;
        }
        boolean z2 = false;
        if (((Boolean) this.b.getValue()).booleanValue()) {
            Uri parse = Uri.parse(naz.a(str));
            if (naz.u(parse) || naz.p(parse) || naz.s(parse) || naz.v(parse)) {
                z2 = true;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_vk_link_key", z2);
        qaz qazVar = new qaz(str, linksParserData.b, bundle);
        qazVar.i = linksParserData.j;
        qazVar.j = linksParserData.k;
        int i = linksParserData.c;
        if (i != 0) {
            qazVar.c(i);
        } else {
            int i2 = linksParserData.d;
            if (i2 != 0) {
                qazVar.b(i2);
            }
        }
        if (z) {
            Context context = e43.a;
            Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context != null ? context : null);
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
            qazVar.g = a;
        }
        return qazVar;
    }

    public final String c(String str) {
        return "vkontakte://" + a0a.d + '/' + str;
    }

    /* compiled from: LinkSpanFactory.kt */
    /* renamed from: com.vk.common.links.a$a, reason: collision with other inner class name */
    public static final class C0719a extends qaz {
        public final SpecialEvent m;

        public C0719a(SpecialEvent specialEvent) {
            super("", 0);
            this.m = specialEvent;
        }

        @Override // xsna.qjc, xsna.rku0
        public final boolean e() {
            return true;
        }

        @Override // xsna.qaz, xsna.rku0
        public final void f(Context context, View view) {
            if (context == null) {
                return;
            }
            b.d dVar = new b.d("media_event_click");
            SpecialEvent specialEvent = this.m;
            dVar.b(specialEvent.b, "event_id");
            dVar.e();
            ComponentCallbacks2 h = e3m.h(context);
            if (h instanceof ey50) {
                ww50<?> Y = ((ey50) h).Y();
                xdr0 xdr0Var = Y instanceof xdr0 ? (xdr0) Y : null;
                if (xdr0Var != null) {
                    pjk0 m0 = xdr0Var.m0();
                    if (m0.e) {
                        return;
                    }
                    m0.e = true;
                    m0.f = false;
                    m0.g = false;
                    m0.i = ljk0.b.a;
                    m0.h = specialEvent;
                    m0.k = new WeakReference<>(view);
                    SpecialEvent.Animation d = specialEvent.d();
                    String str = d != null ? d.b : null;
                    SpecialEvent.Popup e = specialEvent.e();
                    String id = specialEvent.getId();
                    if (str != null && str.length() != 0) {
                        int b = cn70.b(d.d);
                        int b2 = cn70.b(d.e);
                        mjk0 mjk0Var = m0.j;
                        if (mjk0Var != null) {
                            mjk0Var.a();
                        }
                        mjk0 mjk0Var2 = new mjk0(m0.b, m0.a() + m0.l);
                        bwt0.m0(b, b2, mjk0Var2.b);
                        ojk0 ojk0Var = m0.r;
                        VKAnimationView vKAnimationView = mjk0Var2.b;
                        vKAnimationView.setOnLoadAnimationCallback(ojk0Var);
                        vKAnimationView.clearAnimation();
                        vKAnimationView.v0(0, str, false);
                        m0.j = mjk0Var2;
                    } else if (e == null || id == null) {
                        m0.e = false;
                    } else {
                        u1u0.f(e.d(), m0.p);
                    }
                    SpecialEvent.Popup e2 = specialEvent.e();
                    String id2 = specialEvent.getId();
                    if (e2 == null || id2 == null) {
                        return;
                    }
                    m0.c = new c0(new c0(rsg0.y0(new qns0(id2, 3), null, null, 3), new j990(new exi0(m0, 3), 8), io.reactivex.rxjava3.internal.functions.a.c).C(new uy3(m0, 8)).F(new jsv(new r9c0(m0, 10), 24)), io.reactivex.rxjava3.internal.functions.a.d, new jad(m0, 6)).subscribe(new a8v(new z6f0(m0, 9), 19), new tts(new vlc0(m0, 12), 27));
                }
            }
        }

        @Override // xsna.qjc, xsna.l2v0
        public final int getColor() {
            int[] iArr;
            Integer R;
            SpecialEvent.Markup markup = this.m.e;
            if (markup == null || (iArr = markup.b) == null || (R = rl3.R(0, iArr)) == null) {
                return -16711936;
            }
            return R.intValue();
        }

        @Override // xsna.qjc
        public final void d(boolean z) {
        }
    }
}

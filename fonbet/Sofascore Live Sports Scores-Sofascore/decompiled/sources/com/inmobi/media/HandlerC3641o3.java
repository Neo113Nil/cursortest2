package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.ok3;
import defpackage.td4;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.o3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class HandlerC3641o3 extends Handler {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3641o3(Looper looper) {
        super(looper);
        looper.getClass();
    }

    public final void a(Z2 z2) {
        E3 e3 = E3.a;
        String str = z2.b;
        b(z2);
        E3.a(z2, "RETRY_EXHAUSTED");
        ok3.J(new C3589m3(z2, null));
        E3.f.remove(z2);
        if (E3.f.isEmpty()) {
            ok3.J(new C3615n3(this, null));
        }
    }

    public final void b(Z2 z2) {
        int c0 = CollectionsKt.c0(E3.f, z2);
        if (-1 != c0) {
            Z2 z22 = (Z2) E3.f.get(c0 == E3.f.size() + (-1) ? 0 : c0 + 1);
            Message obtain = Message.obtain();
            obtain.what = z22.e ? 3 : 2;
            obtain.obj = z22;
            long pingInterval = E3.c().getPingInterval() * 1000;
            if (System.currentTimeMillis() - z22.g < pingInterval) {
                sendMessageDelayed(obtain, pingInterval);
            } else {
                sendMessage(obtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        if (E3.h.get()) {
            try {
                int i = message.what;
                int i2 = 3;
                if (i == 1) {
                    if (E3.e()) {
                        AdConfig.ImaiConfig c = E3.c();
                        C3357d3 c3357d3 = (C3357d3) E3.b.getValue();
                        List list = (List) td4.t0(kotlin.coroutines.g.a, new C3460h3(c3357d3, c, null));
                        E3.f = list;
                        if (list.isEmpty()) {
                            ok3.J(new C3486i3(c3357d3, this, c, null));
                            return;
                        }
                        for (Z2 z2 : E3.f) {
                            E3 e3 = E3.a;
                            String str = z2.b;
                        }
                        Z2 z22 = (Z2) E3.f.get(0);
                        Message obtain = Message.obtain();
                        if (!z22.e) {
                            i2 = 2;
                        }
                        obtain.what = i2;
                        obtain.obj = z22;
                        long currentTimeMillis = System.currentTimeMillis() - z22.g;
                        if (currentTimeMillis < c.getPingInterval() * 1000) {
                            sendMessageDelayed(obtain, (c.getPingInterval() * 1000) - currentTimeMillis);
                            return;
                        } else {
                            sendMessage(obtain);
                            return;
                        }
                    }
                    return;
                }
                if (i == 2) {
                    if (AbstractC3420ff.a() != null) {
                        E3.g.set(false);
                        E3.g();
                        return;
                    }
                    Object obj = message.obj;
                    AdConfig.ImaiConfig c2 = E3.c();
                    if (obj instanceof Z2) {
                        if (((Z2) obj).f != 0) {
                            if (System.currentTimeMillis() - ((Z2) obj).h <= c2.getPingCacheExpiry() * 1000) {
                                c2.getMaxRetries();
                                ok3.J(new C3511j3((Z2) obj, this, null));
                                return;
                            }
                        }
                        a((Z2) obj);
                        return;
                    }
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        Unit unit = Unit.a;
                        return;
                    }
                    Object obj2 = message.obj;
                    obj2.getClass();
                    Z2 z23 = (Z2) obj2;
                    LinkedHashMap linkedHashMap = E3.j;
                    C3276a0 c3276a0 = (C3276a0) linkedHashMap.get(Integer.valueOf(z23.a));
                    if (c3276a0 != null) {
                        c3276a0.a.a(c3276a0.b);
                    }
                    linkedHashMap.remove(Integer.valueOf(z23.a));
                    ok3.J(new C3563l3(z23, this, null));
                    return;
                }
                if (AbstractC3420ff.a() != null) {
                    E3.g.set(false);
                    E3.g();
                    return;
                }
                Object obj3 = message.obj;
                AdConfig.ImaiConfig c3 = E3.c();
                if (obj3 instanceof Z2) {
                    if (((Z2) obj3).f != 0) {
                        if (System.currentTimeMillis() - ((Z2) obj3).h <= c3.getPingCacheExpiry() * 1000) {
                            c3.getMaxRetries();
                            new C3693q3(new C3537k3(this)).a((Z2) obj3);
                            Unit unit2 = Unit.a;
                            return;
                        }
                    }
                    a((Z2) obj3);
                }
            } catch (Exception e) {
                E3 e32 = E3.a;
                e.getMessage();
            }
        }
    }
}

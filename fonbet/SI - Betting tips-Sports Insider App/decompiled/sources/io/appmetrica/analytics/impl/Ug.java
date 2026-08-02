package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ug {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12977a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0031al f12978b;

    /* renamed from: c, reason: collision with root package name */
    public final C0354nb f12979c = new C0354nb();

    /* renamed from: d, reason: collision with root package name */
    public final C0397p4 f12980d = new C0397p4(new Zl(), new C0372o4(), null);

    /* renamed from: e, reason: collision with root package name */
    public final Consumer f12981e;

    public Ug(Context context, final InterfaceC0094d6 interfaceC0094d6, final EnumC0047bb enumC0047bb, InterfaceC0031al interfaceC0031al) {
        this.f12977a = context;
        this.f12978b = interfaceC0031al;
        this.f12981e = new Consumer() { // from class: io.appmetrica.analytics.impl.gp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Ug.a(EnumC0047bb.this, interfaceC0094d6, this, (C0253jb) obj);
            }
        };
    }

    public static final void a(EnumC0047bb enumC0047bb, InterfaceC0094d6 interfaceC0094d6, Ug ug2, C0253jb c0253jb) {
        String str = c0253jb.f14028h;
        P3 p32 = new P3(str, c0253jb.f14025e, c0253jb.f14026f, c0253jb.f14027g, c0253jb.f14029i);
        String str2 = c0253jb.f14022b;
        byte[] bArr = c0253jb.f14021a;
        int i5 = c0253jb.f14023c;
        HashMap hashMap = c0253jb.f14024d;
        String str3 = c0253jb.j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC0576w9.f14825a;
        M3 m32 = new M3(bArr, str2, enumC0047bb.f13440a, orCreatePublicLogger);
        m32.q = hashMap;
        m32.f12733g = i5;
        m32.f12729c = str3;
        ((Sg) interfaceC0094d6).a(p32, m32, ug2.f12980d);
    }
}

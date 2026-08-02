package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Cd implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Sg f12106a;

    /* renamed from: b, reason: collision with root package name */
    public final H0 f12107b;

    /* renamed from: c, reason: collision with root package name */
    public final Ld f12108c;

    public Cd(@NotNull Sg sg2, @NotNull H0 h02, @NotNull Ld ld2) {
        this.f12106a = sg2;
        this.f12107b = h02;
        this.f12108c = ld2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@NotNull String str) {
        Sg sg2 = this.f12106a;
        H0 h02 = this.f12107b;
        String str2 = h02.f12293a;
        String str3 = h02.f12294b;
        Integer valueOf = Integer.valueOf(h02.f12296d);
        H0 h03 = this.f12107b;
        P3 p32 = new P3(str2, str3, valueOf, h03.f12297e, h03.f12295c);
        Ld ld2 = this.f12108c;
        EnumC0047bb enumC0047bb = ld2.f12537b;
        G0 g02 = ld2.f12536a;
        String str4 = g02.f12247c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(g02.f12250f.f12293a);
        Set set = AbstractC0576w9.f14825a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        M3 m32 = new M3("", "", enumC0047bb.f13440a, orCreatePublicLogger);
        if (str != null) {
            m32.f(str);
        }
        m32.f12738m = bundle;
        m32.f12729c = ld2.f12536a.f12250f.f12298f;
        sg2.a(p32, m32, new C0397p4(new Zl(), new C0372o4(), null));
    }
}

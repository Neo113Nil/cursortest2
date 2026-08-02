package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class H9 extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final I9 f12308b;

    public H9(@NotNull X4 x42, @NotNull TimeProvider timeProvider) {
        super(x42);
        this.f12308b = new I9(x42, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NotNull P5 p52) {
        long optLong;
        I9 i92 = this.f12308b;
        B9 b92 = i92.f12380a.t().B;
        Long valueOf = b92 != null ? Long.valueOf(b92.f12042a) : null;
        if (valueOf != null) {
            xo xoVar = i92.f12380a.f13159t;
            synchronized (xoVar) {
                optLong = xoVar.f14934a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = i92.f12381b.currentTimeMillis();
                i92.f12380a.f13159t.a(optLong);
            }
            if (i92.f12381b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                A9 a92 = (A9) MessageNano.mergeFrom(new A9(), p52.getValueBytes());
                int i5 = a92.f11982a;
                String str = new String(a92.f11983b, Charsets.UTF_8);
                String str2 = this.f12308b.f12380a.f13144c.k().get(Integer.valueOf(i5));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f12818a.f13153m.info("Ignoring attribution of type `" + K9.a(i5) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                I9 i93 = this.f12308b;
                Map<Integer, String> k6 = i93.f12380a.f13144c.k();
                k6.put(Integer.valueOf(i5), str);
                i93.f12380a.f13144c.b(k6);
                this.f12818a.f13153m.info("Handling attribution of type `" + K9.a(i5) + '`', new Object[0]);
                return false;
            }
        }
        this.f12818a.f13153m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}

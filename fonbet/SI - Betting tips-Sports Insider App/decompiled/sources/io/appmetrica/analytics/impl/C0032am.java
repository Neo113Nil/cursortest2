package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032am extends M5 {

    /* renamed from: b, reason: collision with root package name */
    public final C0645z3 f13361b;

    public C0032am(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), C0353na.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.M5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0058bm load(@NonNull L5 l52) {
        C0058bm c0058bm = (C0058bm) super.load(l52);
        C0161fm c0161fm = l52.f12506a;
        c0058bm.f13463d = c0161fm.f13758f;
        c0058bm.f13464e = c0161fm.f13759g;
        Zl zl = (Zl) l52.componentArguments;
        String str = zl.f13316a;
        if (str != null) {
            c0058bm.f13465f = str;
            c0058bm.f13466g = zl.f13317b;
        }
        Map<String, String> map = zl.f13318c;
        c0058bm.f13467h = map;
        c0058bm.f13468i = (C0445r3) this.f13361b.a(new C0445r3(map, S7.f12862c));
        Zl zl2 = (Zl) l52.componentArguments;
        c0058bm.f13469k = zl2.f13319d;
        c0058bm.j = zl2.f13320e;
        C0161fm c0161fm2 = l52.f12506a;
        c0058bm.f13470l = c0161fm2.f13767p;
        c0058bm.f13471m = c0161fm2.f13768r;
        long j = c0161fm2.f13772v;
        if (c0058bm.f13472n == 0) {
            c0058bm.f13472n = j;
        }
        return c0058bm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C0058bm();
    }

    public C0032am(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull C0645z3 c0645z3) {
        super(context, str, safePackageManager);
        this.f13361b = c0645z3;
    }

    @NonNull
    public final C0058bm a() {
        return new C0058bm();
    }
}

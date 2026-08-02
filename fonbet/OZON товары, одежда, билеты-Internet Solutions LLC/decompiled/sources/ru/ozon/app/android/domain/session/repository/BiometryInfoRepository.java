package ru.ozon.app.android.domain.session.repository;

import G.g;
import Ib.a;
import android.os.Build;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ9\u0010\u000e\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\u000e\b\u0001\u0012\n \u000b*\u0004\u0018\u00010\u00010\u00010\nj\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b \u000b*\u00020\r0\r`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;", "", "LIb/a;", "LOb0/a;", "ozonIdAppApi", "<init>", "(LIb/a;)V", "", "getDeviceModel", "()Ljava/lang/String;", "Ljava/util/HashMap;", "kotlin.jvm.PlatformType", "Lkotlin/collections/HashMap;", "", "getBiometryInfo", "()Ljava/util/HashMap;", "LIb/a;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BiometryInfoRepository {

    @NotNull
    private final a<Ob0.a> ozonIdAppApi;

    public BiometryInfoRepository(@NotNull a<Ob0.a> ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.ozonIdAppApi = ozonIdAppApi;
    }

    private final String getDeviceModel() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Intrinsics.f(str2);
        Intrinsics.f(str);
        return h.e0(str2, str, false) ? h.q(str2) : g.c(h.q(str), " ", str2);
    }

    @NotNull
    public final HashMap<String, ? extends Object> getBiometryInfo() {
        Fb0.a biometryAuth = this.ozonIdAppApi.get().getBiometryAuth();
        return U.f(new Pair("deviceId", biometryAuth.getDeviceId()), new Pair("version", Build.VERSION.RELEASE), new Pair("vendor", Build.MANUFACTURER), new Pair("model", getDeviceModel()), new Pair("hasBiometrics", Boolean.valueOf(biometryAuth.available())), new Pair("biometryType", "FINGER_PRINT"));
    }
}

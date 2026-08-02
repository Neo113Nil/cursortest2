package ru.ozon.app.android.cabinet.di;

import Fb0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cabinet/di/BiometryModule;", "", "<init>", "()V", "LOb0/a;", "ozonIdAppApi", "LFb0/a;", "provideBiometryAuth", "(LOb0/a;)LFb0/a;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BiometryModule {

    @NotNull
    public static final BiometryModule INSTANCE = new BiometryModule();

    private BiometryModule() {
    }

    @NotNull
    public final a provideBiometryAuth(@NotNull Ob0.a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        return ozonIdAppApi.getBiometryAuth();
    }
}

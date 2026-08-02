package ru.ozon.app.android.cabinet.biometry;

import L00.i;
import Ob0.a;
import QZ.g;
import i10.h;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.session.repository.BiometryInfoRepository;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cabinet/biometry/BiometryStateConfigurator;", "LQZ/g;", "Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;", "biometryInfoRepository", "LOb0/a;", "ozonIdAppApi", "<init>", "(Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;LOb0/a;)V", "Li10/h;", "state", "onInit", "(Li10/h;)Li10/h;", "Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;", "LOb0/a;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BiometryStateConfigurator implements g {

    @NotNull
    private final BiometryInfoRepository biometryInfoRepository;

    @NotNull
    private final a ozonIdAppApi;

    public BiometryStateConfigurator(@NotNull BiometryInfoRepository biometryInfoRepository, @NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(biometryInfoRepository, "biometryInfoRepository");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.biometryInfoRepository = biometryInfoRepository;
        this.ozonIdAppApi = ozonIdAppApi;
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h hVar, @NotNull L00.g gVar, @NotNull i iVar) {
        g.a.a(hVar, gVar, iVar);
        return gVar;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h hVar, @NotNull A00.a aVar) {
        g.a.b(hVar, aVar);
        return hVar;
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ConcurrentHashMap<String, Object> f7 = state.f();
        HashMap<String, ? extends Object> biometryInfo = this.biometryInfoRepository.getBiometryInfo();
        final BiometryStateConfigurator$onInit$1$1 biometryStateConfigurator$onInit$1$1 = new BiometryStateConfigurator$onInit$1$1(f7);
        biometryInfo.forEach(new BiConsumer() { // from class: Mm.a
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Function2.this.invoke(obj, obj2);
            }
        });
        f7.put("hasSmartLock", Boolean.valueOf(this.ozonIdAppApi.h().available()));
        return h.a(state, null, i10.g.POST, null, null, null, 61);
    }
}

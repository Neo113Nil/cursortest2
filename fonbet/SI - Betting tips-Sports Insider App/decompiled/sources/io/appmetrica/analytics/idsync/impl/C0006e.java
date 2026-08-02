package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.idsync.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006e implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C f11863a = new C();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(@NotNull IdSyncConfig idSyncConfig) {
        m mVar = new m();
        mVar.f11893a = idSyncConfig.getEnabled();
        l lVar = new l();
        lVar.f11888a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        k[] kVarArr = new k[size];
        for (int i5 = 0; i5 < size; i5++) {
            kVarArr[i5] = this.f11863a.fromModel(idSyncConfig.getRequests().get(i5));
        }
        lVar.f11889b = kVarArr;
        mVar.f11894b = lVar;
        return mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@NotNull m mVar) {
        l lVar = mVar.f11894b;
        if (lVar == null) {
            lVar = new l();
        }
        boolean z5 = mVar.f11893a;
        long j = lVar.f11888a;
        k[] kVarArr = lVar.f11889b;
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (k kVar : kVarArr) {
            arrayList.add(this.f11863a.toModel(kVar));
        }
        return new IdSyncConfig(z5, j, arrayList);
    }
}

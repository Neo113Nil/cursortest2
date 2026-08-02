package com.unity3d.ads.core.data.datasource;

import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidFIdExistenceDataSource;", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "className", "", "<init>", "(Ljava/lang/String;)V", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {

    @NotNull
    private final String className;

    public AndroidFIdExistenceDataSource(@NotNull String str) {
        str.getClass();
        this.className = str;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Class.forName(this.className);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        return !(u2gVar instanceof u2g);
    }
}

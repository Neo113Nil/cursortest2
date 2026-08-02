package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.l1;
import defpackage.u2;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "invoke", "()V", "Landroid/content/Context;", "Lf1d;", "", "isCollecting", "Lf1d;", "", "_appSetIdFlow", "getAppSetId", "()Ljava/lang/String;", "appSetId", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAppSetIdDataSource {

    @NotNull
    private final f1d _appSetIdFlow;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final f1d isCollecting;

    public AndroidAppSetIdDataSource(@NotNull Context context) {
        context.getClass();
        this.applicationContext = context;
        this.isCollecting = gdi.a(Boolean.FALSE);
        this._appSetIdFlow = gdi.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(AndroidAppSetIdDataSource androidAppSetIdDataSource, AppSetIdInfo appSetIdInfo) {
        String id = appSetIdInfo.getId();
        id.getClass();
        ((fdi) androidAppSetIdDataSource._appSetIdFlow).l(id);
        return Unit.a;
    }

    @Nullable
    public final String getAppSetId() {
        return (String) ((fdi) this._appSetIdFlow).getValue();
    }

    public final void invoke() {
        fdi fdiVar;
        Object value;
        Boolean bool;
        f1d f1dVar = this.isCollecting;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!fdiVar.k(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            AppSet.getClient(this.applicationContext).getAppSetIdInfo().addOnSuccessListener(new l1(new u2(this, 7), 3)).getClass();
        } catch (Throwable unused) {
        }
    }
}

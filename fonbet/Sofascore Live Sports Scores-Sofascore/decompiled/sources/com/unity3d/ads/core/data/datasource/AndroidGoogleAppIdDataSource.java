package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import defpackage.joa;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.ypa;
import defpackage.z0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001d\u0010\f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidGoogleAppIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/GoogleAppIdDataSource;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Context;", "", "googleAppId$delegate", "Ljoa;", "getGoogleAppId", "()Ljava/lang/String;", "googleAppId", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGoogleAppIdDataSource implements GoogleAppIdDataSource {

    @NotNull
    public static final String GOOGLE_APP_ID_RESOURCE_NAME = "google_app_id";

    @NotNull
    private final Context context;

    /* renamed from: googleAppId$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa googleAppId;

    public AndroidGoogleAppIdDataSource(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.googleAppId = ypa.b(new z0(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String googleAppId_delegate$lambda$3(AndroidGoogleAppIdDataSource androidGoogleAppIdDataSource) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Integer.valueOf(androidGoogleAppIdDataSource.context.getResources().getIdentifier(GOOGLE_APP_ID_RESOURCE_NAME, "string", androidGoogleAppIdDataSource.context.getPackageName()));
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        Integer num = (Integer) u2gVar;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        return androidGoogleAppIdDataSource.context.getString(num.intValue());
    }

    @Override // com.unity3d.ads.core.data.datasource.GoogleAppIdDataSource
    @Nullable
    public String getGoogleAppId() {
        return (String) this.googleAppId.getValue();
    }
}

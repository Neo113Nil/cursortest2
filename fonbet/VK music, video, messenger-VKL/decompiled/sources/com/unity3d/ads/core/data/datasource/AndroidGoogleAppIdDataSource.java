package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import kotlin.Lazy;
import kotlin.Result;
import xsna.bpn0;
import xsna.zcl;

/* compiled from: AndroidGoogleAppIdDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidGoogleAppIdDataSource implements GoogleAppIdDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String GOOGLE_APP_ID_RESOURCE_NAME = "google_app_id";
    private final Context context;
    private final Lazy googleAppId$delegate = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 4));

    /* compiled from: AndroidGoogleAppIdDataSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidGoogleAppIdDataSource(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String googleAppId_delegate$lambda$3(AndroidGoogleAppIdDataSource androidGoogleAppIdDataSource) {
        Object failure;
        try {
            failure = Integer.valueOf(androidGoogleAppIdDataSource.context.getResources().getIdentifier(GOOGLE_APP_ID_RESOURCE_NAME, "string", androidGoogleAppIdDataSource.context.getPackageName()));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
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
    public String getGoogleAppId() {
        return (String) this.googleAppId$delegate.getValue();
    }
}

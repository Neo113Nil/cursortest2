package com.sleeperbot;

import android.content.Context;
import com.google.firebase.FirebaseOptions;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.sentry.SentryLockReason;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FirebaseConfigLoader.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¨\u0006\u000b"}, d2 = {"Lcom/sleeperbot/FirebaseConfigLoader;", "", "<init>", "()V", "loadFromAssets", "Lcom/google/firebase/FirebaseOptions;", "context", "Landroid/content/Context;", "assetName", "", "packageNameOverride", "app_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FirebaseConfigLoader {
    public static final FirebaseConfigLoader INSTANCE = new FirebaseConfigLoader();

    private FirebaseConfigLoader() {
    }

    public static /* synthetic */ FirebaseOptions loadFromAssets$default(FirebaseConfigLoader firebaseConfigLoader, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return firebaseConfigLoader.loadFromAssets(context, str, str2);
    }

    public final FirebaseOptions loadFromAssets(Context context, String assetName, String packageNameOverride) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        InputStream open = context.getAssets().open(assetName);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
        final StringBuilder sb = new StringBuilder();
        TextStreamsKt.forEachLine(bufferedReader, new Function1() { // from class: com.sleeperbot.FirebaseConfigLoader$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit loadFromAssets$lambda$1$lambda$0;
                loadFromAssets$lambda$1$lambda$0 = FirebaseConfigLoader.loadFromAssets$lambda$1$lambda$0(sb, (String) obj);
                return loadFromAssets$lambda$1$lambda$0;
            }
        });
        bufferedReader.close();
        JSONObject jSONObject = new JSONObject(sb.toString());
        JSONObject jSONObject2 = jSONObject.getJSONObject("project_info");
        String string = jSONObject2.getString("project_id");
        JSONObject jSONObject3 = null;
        String optString = jSONObject2.optString("firebase_url", null);
        String optString2 = jSONObject2.optString("storage_bucket", null);
        String optString3 = jSONObject2.optString("project_number", null);
        JSONArray jSONArray = jSONObject.getJSONArray(AnalyticsConstantsKt.KEY_CLIENT);
        String packageName = packageNameOverride == null ? context.getPackageName() : packageNameOverride;
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            JSONObject optJSONObject = jSONObject4.getJSONObject("client_info").optJSONObject("android_client_info");
            if (optJSONObject != null && Intrinsics.areEqual(optJSONObject.optString(SentryLockReason.JsonKeys.PACKAGE_NAME, ""), packageName)) {
                jSONObject3 = jSONObject4;
                break;
            }
            i++;
        }
        if (jSONObject3 == null) {
            throw new IllegalStateException("Could not find a 'client' entry in " + assetName + " with package_name='" + packageName + "'.");
        }
        FirebaseOptions.Builder apiKey = new FirebaseOptions.Builder().setProjectId(string).setApplicationId(jSONObject3.getJSONObject("client_info").getString("mobilesdk_app_id")).setApiKey(jSONObject3.getJSONArray("api_key").getJSONObject(0).getString("current_key"));
        String str = optString;
        if (str != null && str.length() != 0) {
            apiKey.setDatabaseUrl(optString);
        }
        String str2 = optString2;
        if (str2 != null && str2.length() != 0) {
            apiKey.setStorageBucket(optString2);
        }
        String str3 = optString3;
        if (str3 != null && str3.length() != 0) {
            apiKey.setGcmSenderId(optString3);
        }
        FirebaseOptions build = apiKey.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadFromAssets$lambda$1$lambda$0(StringBuilder sb, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sb.append(it);
        return Unit.INSTANCE;
    }
}

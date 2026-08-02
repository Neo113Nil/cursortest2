package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a0a;
import xsna.brm0;
import xsna.emb;
import xsna.l22;
import xsna.ro;
import xsna.s3q0;

/* compiled from: AndroidUnityBootConfigDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {
    private final Context context;

    public AndroidUnityBootConfigDataSource(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    public static final s3q0 getValue$lambda$2$lambda$1$lambda$0(String str, Ref$ObjectRef ref$ObjectRef, String str2) {
        if (brm0.B(str2, str, false)) {
            ref$ObjectRef.element = str2.substring(str.length());
        }
        return s3q0.a;
    }

    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    public String getValue(String str) {
        Object failure;
        try {
            String concat = str.concat("=");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            InputStream open = this.context.getAssets().open("bin/Data/boot.config");
            try {
                a0a.a(new BufferedReader(new InputStreamReader(open, emb.b), 8192), new l22(1, concat, (Object) ref$ObjectRef));
                s3q0 s3q0Var = s3q0.a;
                ro.e(open, null);
                failure = (String) ref$ObjectRef.element;
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? null : failure);
    }
}

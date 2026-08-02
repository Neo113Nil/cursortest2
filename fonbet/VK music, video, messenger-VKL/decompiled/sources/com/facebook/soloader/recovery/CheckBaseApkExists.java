package com.facebook.soloader.recovery;

import android.content.Context;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.NoBaseApkException;
import com.facebook.soloader.SoSource;
import xsna.bd3;
import xsna.t33;

/* loaded from: classes12.dex */
public class CheckBaseApkExists implements RecoveryStrategy {
    private static final String TAG = "soloader.recovery.CheckBaseApkExists";
    private final BaseApkPathHistory mBaseApkPathHistory;
    private final Context mContext;

    public CheckBaseApkExists(Context context, BaseApkPathHistory baseApkPathHistory) {
        this.mContext = context;
        this.mBaseApkPathHistory = baseApkPathHistory;
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        String str = this.mContext.getApplicationInfo().sourceDir;
        if (!bd3.d(str)) {
            StringBuilder a = t33.a("Base apk does not exist: ", str, ". ");
            this.mBaseApkPathHistory.report(a);
            throw new NoBaseApkException(a.toString(), unsatisfiedLinkError);
        }
        LogUtil.w(TAG, "Base apk exists: " + str);
        return false;
    }
}

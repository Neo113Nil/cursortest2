package com.facebook.soloader.recovery;

import android.content.Context;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.RecoverableSoSource;
import com.facebook.soloader.SoSource;
import xsna.bd3;

/* loaded from: classes12.dex */
public class DetectDataAppMove implements RecoveryStrategy {
    private static final String TAG = "soloader.recovery.DetectDataAppMove";
    private final BaseApkPathHistory mBaseApkPathHistory;
    private final Context mContext;
    private final int mInitialHistorySize;

    public DetectDataAppMove(Context context, BaseApkPathHistory baseApkPathHistory) {
        this.mContext = context;
        this.mBaseApkPathHistory = baseApkPathHistory;
        this.mInitialHistorySize = baseApkPathHistory.size();
    }

    private boolean detectMove() {
        String baseApkPath = getBaseApkPath();
        return bd3.d(baseApkPath) && this.mBaseApkPathHistory.recordPathIfNew(baseApkPath);
    }

    private String getBaseApkPath() {
        return this.mContext.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void recoverSoSources(SoSource[] soSourceArr) {
        for (int i = 0; i < soSourceArr.length; i++) {
            Object[] objArr = soSourceArr[i];
            if (objArr instanceof RecoverableSoSource) {
                soSourceArr[i] = ((RecoverableSoSource) objArr).recover(this.mContext);
            }
        }
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        if (detectMove()) {
            recoverSoSources(soSourceArr);
            return true;
        }
        if (this.mInitialHistorySize == this.mBaseApkPathHistory.size()) {
            return false;
        }
        LogUtil.w(TAG, "Context was updated (perhaps by another thread)");
        return true;
    }
}

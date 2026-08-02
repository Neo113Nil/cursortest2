package com.vk.push.core.domain.usecase;

import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.domain.repository.CallingAppRepository;
import kotlin.Result;
import xsna.drm0;

/* compiled from: GetCallingAppInfoUseCase.kt */
/* loaded from: classes5.dex */
public final class GetCallingAppInfoUseCase {
    public final CallingAppRepository a;

    public GetCallingAppInfoUseCase(CallingAppRepository callingAppRepository) {
        this.a = callingAppRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        return new com.vk.push.common.AppInfo(r1, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x000c, B:10:0x0021, B:15:0x002d, B:17:0x0033, B:22:0x003d, B:25:0x0043, B:26:0x004a, B:27:0x004b, B:28:0x0052, B:30:0x0015), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x000c, B:10:0x0021, B:15:0x002d, B:17:0x0033, B:22:0x003d, B:25:0x0043, B:26:0x004a, B:27:0x004b, B:28:0x0052, B:30:0x0015), top: B:2:0x0002 }] */
    /* renamed from: invoke-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m97invokeIoAF18A(CallingAppIds callingAppIds) {
        boolean z;
        CallingAppRepository callingAppRepository = this.a;
        try {
            String packageNameForUid = callingAppRepository.getPackageNameForUid(callingAppIds.getUid());
            if (packageNameForUid != null) {
                if (drm0.N(packageNameForUid)) {
                }
                boolean z2 = true;
                if (packageNameForUid != null && !drm0.N(packageNameForUid)) {
                    z = false;
                    if (!z) {
                        throw new IllegalStateException("Could not retrieve caller package name");
                    }
                    String signatureForPackageName = callingAppRepository.getSignatureForPackageName(packageNameForUid);
                    if (signatureForPackageName != null && !drm0.N(signatureForPackageName)) {
                        z2 = false;
                    }
                    throw new IllegalStateException("Could not retrieve caller pub key");
                }
                z = true;
                if (!z) {
                }
            }
            packageNameForUid = callingAppRepository.getPackageNameForPid(callingAppIds.getPid());
            boolean z22 = true;
            if (packageNameForUid != null) {
                z = false;
                if (!z) {
                }
            }
            z = true;
            if (!z) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}

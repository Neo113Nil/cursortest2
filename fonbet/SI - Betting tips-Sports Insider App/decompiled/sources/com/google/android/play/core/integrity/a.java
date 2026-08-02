package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends d6.e {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f6025b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i5, Exception exc) {
        super(new Status(i5, "Integrity API error (" + i5 + "): " + r1 + ".", null, null));
        String str;
        Locale locale = Locale.ROOT;
        HashMap hashMap = b8.a.f3090a;
        Integer valueOf = Integer.valueOf(i5);
        if (hashMap.containsKey(valueOf)) {
            HashMap hashMap2 = b8.a.f3091b;
            if (hashMap2.containsKey(valueOf)) {
                str = ((String) hashMap.get(valueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#" + ((String) hashMap2.get(valueOf)) + ")";
                if (i5 != 0) {
                    throw new IllegalArgumentException("ErrorCode should not be 0.");
                }
                this.f6025b = exc;
                return;
            }
        }
        str = "";
        if (i5 != 0) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f6025b;
    }
}

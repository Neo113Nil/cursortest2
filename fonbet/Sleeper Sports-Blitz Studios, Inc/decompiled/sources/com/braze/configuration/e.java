package com.braze.configuration;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.f2;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f488a;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f488a = new f2(context);
    }

    public static final String c(String str) {
        return "Offline user storage provider was given user ID longer than 997. Rejecting. User ID: " + str;
    }

    public final String a() {
        String readString = this.f488a.readString(DataStoreKey.LAST_USER_ID, "");
        final String str = readString != null ? readString : "";
        if (StringUtils.getByteSize(str) <= 997) {
            return str;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(str);
            }
        }, 6, (Object) null);
        String truncateToByteLength = StringUtils.truncateToByteLength(str, 997);
        b(truncateToByteLength);
        return truncateToByteLength;
    }

    public final void b(final String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (userId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.e$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.b();
                }
            }, 6, (Object) null);
        } else if (StringUtils.getByteSize(userId) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.e$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.c(userId);
                }
            }, 6, (Object) null);
        } else {
            this.f488a.writeData(DataStoreKey.LAST_USER_ID, userId);
        }
    }

    public static final String a(String str) {
        return "Stored user ID is longer than 997 bytes. Truncating. Original user ID: " + str;
    }

    public static final String b() {
        return "userId is empty in updateLastUserId. Rejecting.";
    }
}

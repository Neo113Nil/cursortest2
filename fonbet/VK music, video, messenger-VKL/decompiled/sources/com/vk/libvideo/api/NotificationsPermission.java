package com.vk.libvideo.api;

import android.content.Context;
import io.reactivex.rxjava3.internal.operators.completable.c0;
import xsna.asp;
import xsna.zrp;

/* compiled from: NotificationsPermission.kt */
/* loaded from: classes2.dex */
public interface NotificationsPermission {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsPermission.kt */
    public static final class Result {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;
        public static final Result DENIED;
        public static final Result GRANTED;

        static {
            Result result = new Result("GRANTED", 0);
            GRANTED = result;
            Result result2 = new Result("DENIED", 1);
            DENIED = result2;
            Result[] resultArr = {result, result2};
            $VALUES = resultArr;
            $ENTRIES = new asp(resultArr);
        }

        public Result() {
            throw null;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    c0 a(Context context);
}

package com.vk.api.sdk.utils.log;

import android.util.Log;
import com.vk.api.sdk.utils.log.Logger;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;

/* compiled from: DefaultApiLogger.kt */
/* loaded from: classes15.dex */
public final class a implements Logger {
    public final bpn0 a;
    public final String b;

    /* compiled from: DefaultApiLogger.kt */
    /* renamed from: com.vk.api.sdk.utils.log.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0376a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Logger.LogLevel.values().length];
            try {
                iArr[Logger.LogLevel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logger.LogLevel.VERBOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logger.LogLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logger.LogLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Logger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(String str, bpn0 bpn0Var) {
        this.a = bpn0Var;
        this.b = str;
    }

    @Override // com.vk.api.sdk.utils.log.Logger
    public final void a(Logger.LogLevel logLevel, String str, Throwable th) {
        int i;
        if (((Logger.LogLevel) this.a.getValue()).ordinal() > logLevel.ordinal() || (i = C0376a.$EnumSwitchMapping$0[logLevel.ordinal()]) == 1 || i == 2 || i == 3 || i == 4) {
            return;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        Log.e(this.b, str, th);
    }

    @Override // com.vk.api.sdk.utils.log.Logger
    public final Lazy<Logger.LogLevel> getLogLevel() {
        return this.a;
    }
}

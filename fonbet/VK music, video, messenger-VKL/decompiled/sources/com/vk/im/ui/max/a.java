package com.vk.im.ui.max;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.im.engine.models.sync.MaxEntryPointsConfig;
import com.vk.im.ui.max.MaxRedirectHandler;
import com.vk.log.L;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.bfm;
import xsna.cau0;
import xsna.msy;
import xsna.s3q0;

/* compiled from: MaxRedirectHandler.kt */
/* loaded from: classes2.dex */
public final class a implements MaxRedirectHandler {
    public final Context a;
    public final Object b;

    /* compiled from: MaxRedirectHandler.kt */
    /* renamed from: com.vk.im.ui.max.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1176a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MaxRedirectHandler.Entrypoint.values().length];
            try {
                iArr[MaxRedirectHandler.Entrypoint.Calls.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MaxRedirectHandler.Entrypoint.Install.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(cau0 cau0Var, Context context) {
        this.a = context;
        this.b = msy.a(LazyThreadSafetyMode.NONE, new bfm(cau0Var, 19));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // com.vk.im.ui.max.MaxRedirectHandler
    public final void a(MaxRedirectHandler.Entrypoint entrypoint) {
        Uri uri;
        Object failure;
        int i = C1176a.$EnumSwitchMapping$0[entrypoint.ordinal()];
        ?? r1 = this.b;
        if (i == 1) {
            MaxEntryPointsConfig maxEntryPointsConfig = (MaxEntryPointsConfig) r1.getValue();
            Object obj = maxEntryPointsConfig.b.get(MaxEntryPointsConfig.AvailableEntryPoint.CallsLink);
            if (obj == null) {
                obj = maxEntryPointsConfig.c;
            }
            uri = (Uri) obj;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            MaxEntryPointsConfig maxEntryPointsConfig2 = (MaxEntryPointsConfig) r1.getValue();
            Object obj2 = maxEntryPointsConfig2.b.get(MaxEntryPointsConfig.AvailableEntryPoint.StoreLink);
            if (obj2 == null) {
                obj2 = maxEntryPointsConfig2.c;
            }
            uri = (Uri) obj2;
        }
        try {
            this.a.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri).addFlags(268435456));
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.g("MaxRedirectHandler", a);
        }
    }

    @Override // com.vk.im.ui.max.MaxRedirectHandler
    public final boolean b() {
        Object failure;
        try {
            boolean z = true;
            if (this.a.getPackageManager().getPackageInfo("ru.oneme.app", 1) == null) {
                z = false;
            }
            failure = Boolean.valueOf(z);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = Boolean.FALSE;
        }
        return ((Boolean) failure).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.ui.max.MaxRedirectHandler
    public final boolean c() {
        return ((MaxEntryPointsConfig) this.b.getValue()).a;
    }
}

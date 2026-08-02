package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFe1qSDK;", "Lcom/appsflyer/internal/AFe1oSDK;", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1qSDK extends AFe1oSDK {

    /* renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\b\u001a\u0006*\u00020\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFe1qSDK$AFa1vSDK;", "", "", "p0", "p1", "p2", "p3", "p4", "valueOf", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "values", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1qSDK$AFa1vSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static String valueOf(@NotNull String p02, @NotNull String p12, String p22, @NotNull String p32, @NotNull String p42) {
            Intrinsics.checkNotNullParameter(p02, "");
            Intrinsics.checkNotNullParameter(p12, "");
            Intrinsics.checkNotNullParameter(p32, "");
            Intrinsics.checkNotNullParameter(p42, "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p02);
            sb2.append(p12);
            return AFb1mSDK.AFInAppEventType(TextUtils.join("\u2063", new String[]{p42, p22, sb2.toString()}), p32);
        }

        static String values(String p02, String p12, String p22) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(AFe1wSDK.values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.valueOf().getHostName()));
            sb2.append(p02);
            sb2.append(p22);
            sb2.append("?device_id=");
            sb2.append(p12);
            return sb2.toString();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* synthetic */ AFe1qSDK(String str, Map map, byte[] bArr, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i11 & 4) != 0 ? null : bArr, (i11 & 8) != 0 ? "GET" : str2, (i11 & 16) != 0 ? false : z11);
    }

    @NotNull
    public static final AFe1qSDK valueOf(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String values = Companion.values(str, str2, str3);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AFe1qSDK aFe1qSDK = new AFe1qSDK(values, U.j(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", valueOf), new Pair("af_sig", Companion.valueOf(str, str3, str2, str4, valueOf))), null, null, false, 28, null);
        aFe1qSDK.unregisterClient = 10000;
        return aFe1qSDK;
    }

    private AFe1qSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z11) {
        super(str, bArr, str2, map, z11);
    }
}

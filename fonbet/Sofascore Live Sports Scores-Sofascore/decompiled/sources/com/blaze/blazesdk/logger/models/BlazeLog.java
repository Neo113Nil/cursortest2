package com.blaze.blazesdk.logger.models;

import androidx.annotation.Keep;
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.b6h;
import defpackage.dmi;
import defpackage.o6a;
import defpackage.p0m;
import defpackage.vul;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0001-BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017¨\u0006."}, d2 = {"Lcom/blaze/blazesdk/logger/models/BlazeLog;", "", "", PglCryptUtils.KEY_MESSAGE, "Lvul;", "level", "", TtmlNode.TAG_METADATA, "apiSchemeVersion", "apiKey", "Lp0m;", "logIdentifier", "<init>", "(Ljava/lang/String;Lvul;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lp0m;)V", "component1", "()Ljava/lang/String;", "component2", "()Lvul;", "component3", "()Ljava/util/Map;", "component4", "component5", "component6", "()Lp0m;", "copy", "(Ljava/lang/String;Lvul;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lp0m;)Lcom/blaze/blazesdk/logger/models/BlazeLog;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Lvul;", "getLevel", "Ljava/util/Map;", "getMetadata", "getApiSchemeVersion", "getApiKey", "Lp0m;", "getLogIdentifier", "MetaDataKeys", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeLog {

    @b6h("api_key")
    @NotNull
    private final String apiKey;

    @b6h("api_scheme_version")
    @NotNull
    private final String apiSchemeVersion;

    @b6h("level")
    @NotNull
    private final vul level;

    @NotNull
    private final transient p0m logIdentifier;

    @b6h(PglCryptUtils.KEY_MESSAGE)
    @NotNull
    private final String message;

    @b6h(TtmlNode.TAG_METADATA)
    @NotNull
    private final Map<String, Object> metadata;

    /* renamed from: MetaDataKeys, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final String SESSION_ID = "session_id";

    @NotNull
    private static final String ID = "id";

    @NotNull
    private static final String SDK_TYPE = "sdk_type";

    @NotNull
    private static final String SDK_VERSION = "sdk_version";

    @NotNull
    private static final String API_KEY = "api_key";

    @NotNull
    private static final String DEVICE_TYPE = "device_type";

    @NotNull
    private static final String DEVICE_BRAND = "device_brand";

    @NotNull
    private static final String DEVICE_MODEL = Payload.DEVICE_MODEL;

    @NotNull
    private static final String OPERATING_SYSTEM = "operating_system";

    @NotNull
    private static final String OPERATING_SYSTEM_VERSION = "operating_system_version";

    @NotNull
    private static final String SCREEN_RESOLUTION = "screen_resolution";

    @NotNull
    private static final String CONNECTION_TYPE = "connection_type";

    @NotNull
    private static final String APP_ID = MBridgeConstans.APP_ID;

    @NotNull
    private static final String APP_VERSION = "app_version";

    @NotNull
    private static final String REPORTING_TIMESTAMP = "reporting_timestamp";

    @NotNull
    private static final String LOG_IDENTIFIER = "log_identifier";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.logger.models.BlazeLog$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ BlazeLog(String str, vul vulVar, Map map, String str2, String str3, p0m p0mVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, vulVar, (i & 4) != 0 ? new LinkedHashMap() : map, (i & 8) != 0 ? "1" : str2, (i & 16) != 0 ? BlazeSDK.INSTANCE.getApiKey$blazesdk_release() : str3, p0mVar);
    }

    public static /* synthetic */ BlazeLog copy$default(BlazeLog blazeLog, String str, vul vulVar, Map map, String str2, String str3, p0m p0mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeLog.message;
        }
        if ((i & 2) != 0) {
            vulVar = blazeLog.level;
        }
        if ((i & 4) != 0) {
            map = blazeLog.metadata;
        }
        if ((i & 8) != 0) {
            str2 = blazeLog.apiSchemeVersion;
        }
        if ((i & 16) != 0) {
            str3 = blazeLog.apiKey;
        }
        if ((i & 32) != 0) {
            p0mVar = blazeLog.logIdentifier;
        }
        String str4 = str3;
        p0m p0mVar2 = p0mVar;
        return blazeLog.copy(str, vulVar, map, str2, str4, p0mVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final vul getLevel() {
        return this.level;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.metadata;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getApiSchemeVersion() {
        return this.apiSchemeVersion;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final p0m getLogIdentifier() {
        return this.logIdentifier;
    }

    @NotNull
    public final BlazeLog copy(@NotNull String message, @NotNull vul level, @NotNull Map<String, Object> metadata, @NotNull String apiSchemeVersion, @NotNull String apiKey, @NotNull p0m logIdentifier) {
        message.getClass();
        level.getClass();
        metadata.getClass();
        apiSchemeVersion.getClass();
        apiKey.getClass();
        logIdentifier.getClass();
        return new BlazeLog(message, level, metadata, apiSchemeVersion, apiKey, logIdentifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeLog)) {
            return false;
        }
        BlazeLog blazeLog = (BlazeLog) other;
        return Intrinsics.c(this.message, blazeLog.message) && this.level == blazeLog.level && Intrinsics.c(this.metadata, blazeLog.metadata) && Intrinsics.c(this.apiSchemeVersion, blazeLog.apiSchemeVersion) && Intrinsics.c(this.apiKey, blazeLog.apiKey) && Intrinsics.c(this.logIdentifier, blazeLog.logIdentifier);
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    public final String getApiSchemeVersion() {
        return this.apiSchemeVersion;
    }

    @NotNull
    public final vul getLevel() {
        return this.level;
    }

    @NotNull
    public final p0m getLogIdentifier() {
        return this.logIdentifier;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.logIdentifier.hashCode() + o6a.k(this.apiKey, o6a.k(this.apiSchemeVersion, dmi.g(this.metadata, (this.level.hashCode() + (this.message.hashCode() * 31)) * 31, 31)));
    }

    @NotNull
    public String toString() {
        return "BlazeLog(message=" + this.message + ", level=" + this.level + ", metadata=" + this.metadata + ", apiSchemeVersion=" + this.apiSchemeVersion + ", apiKey=" + this.apiKey + ", logIdentifier=" + this.logIdentifier + ')';
    }

    public BlazeLog(@NotNull String str, @NotNull vul vulVar, @NotNull Map<String, Object> map, @NotNull String str2, @NotNull String str3, @NotNull p0m p0mVar) {
        str.getClass();
        vulVar.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        p0mVar.getClass();
        this.message = str;
        this.level = vulVar;
        this.metadata = map;
        this.apiSchemeVersion = str2;
        this.apiKey = str3;
        this.logIdentifier = p0mVar;
    }
}

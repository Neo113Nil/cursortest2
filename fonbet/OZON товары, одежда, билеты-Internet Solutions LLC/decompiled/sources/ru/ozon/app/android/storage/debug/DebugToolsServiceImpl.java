package ru.ozon.app.android.storage.debug;

import Nc.C3667a;
import Nc.C3669c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.InterfaceC8918a;
import ru.ozon.app.android.storage.di.StorageComponentConfig;
import xe.C10727i;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001c\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00120\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\b0\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R.\u0010(\u001a\u0004\u0018\u00010\b2\b\u0010'\u001a\u0004\u0018\u00010\b8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010,R(\u00102\u001a\u0004\u0018\u00010\b2\b\u0010'\u001a\u0004\u0018\u00010\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u0010\n\"\u0004\b1\u0010,R(\u00105\u001a\u0004\u0018\u00010\b2\b\u0010'\u001a\u0004\u0018\u00010\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010\n\"\u0004\b4\u0010,R(\u00108\u001a\u0004\u0018\u00010\b2\b\u0010'\u001a\u0004\u0018\u00010\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010\n\"\u0004\b7\u0010,R(\u0010>\u001a\u0004\u0018\u0001092\b\u0010'\u001a\u0004\u0018\u0001098V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lru/ozon/app/android/storage/debug/DebugToolsServiceImpl;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storage/di/StorageComponentConfig;", "config", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storage/di/StorageComponentConfig;)V", "", "initInternalHeadersToken", "()Ljava/lang/String;", "Lpf0/a;", "headerKey", "headerValue", "", "updateExtraHeader", "(Lpf0/a;Ljava/lang/String;Ljava/lang/String;)V", "Lio/reactivex/p;", "", "onAbVariantSaved", "()Lio/reactivex/p;", "onCommitHashSaved", "Landroid/content/Context;", "Lru/ozon/app/android/storage/di/StorageComponentConfig;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "sharedPreferences", "Landroid/content/SharedPreferences;", "LNc/c;", "abVariantListener", "LNc/c;", "LNc/a;", "commitHashListener", "LNc/a;", "extraHeadersRepository$delegate", "LSc/j;", "getExtraHeadersRepository", "()Lpf0/a;", "extraHeadersRepository", AppMeasurementSdk.ConditionalUserProperty.VALUE, "internalHeadersToken", "Ljava/lang/String;", "getInternalHeadersToken", "setInternalHeadersToken", "(Ljava/lang/String;)V", "resolveOverride", "getResolveOverride", "setResolveOverride", "getMeshValue", "setMeshValue", "meshValue", "getAbVariant", "setAbVariant", "abVariant", "getCommitHash", "setCommitHash", "commitHash", "", "getFfRefreshIntervalMinutes", "()Ljava/lang/Long;", "setFfRefreshIntervalMinutes", "(Ljava/lang/Long;)V", "ffRefreshIntervalMinutes", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugToolsServiceImpl implements DebugToolsService {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final C3669c<Boolean> abVariantListener;

    @NotNull
    private final C3667a<String> commitHashListener;

    @NotNull
    private final StorageComponentConfig config;

    @NotNull
    private final Context context;

    /* renamed from: extraHeadersRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j extraHeadersRepository;
    private String internalHeadersToken;
    private String resolveOverride;
    private final SharedPreferences sharedPreferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storage/debug/DebugToolsServiceImpl$Companion;", "", "<init>", "()V", "SERVICE_MESH_PREFERENCES", "", "SERVICE_MESH_HEADER_KEY", "AB_VARIANTS_HEADER_KEY", "INTERNAL_HEADERS_TOKEN", "COMMIT_HASH_KEY", "FF_REFRESH_INTERVAL_MINUTES", "INTERNAL_HEADERS_TOKEN_ARG_ENV_PROP_NAME", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DebugToolsServiceImpl(@NotNull Context context, @NotNull StorageComponentConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.context = context;
        this.config = config;
        this.sharedPreferences = context.getSharedPreferences("ServiceMeshSharedPreferences", 0);
        C3669c<Boolean> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.abVariantListener = d11;
        String commitHash = getCommitHash();
        C3667a<String> e11 = C3667a.e(commitHash == null ? config.getCommitHash() : commitHash);
        Intrinsics.checkNotNullExpressionValue(e11, "createDefault(...)");
        this.commitHashListener = e11;
        this.extraHeadersRepository = k.b(new DebugToolsServiceImpl$extraHeadersRepository$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8918a getExtraHeadersRepository() {
        return (InterfaceC8918a) this.extraHeadersRepository.getValue();
    }

    private final String initInternalHeadersToken() {
        String str = (String) C10727i.d(g.f71771a, new DebugToolsServiceImpl$initInternalHeadersToken$value$1(this, null));
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    private final void updateExtraHeader(InterfaceC8918a interfaceC8918a, String str, String str2) {
        C10727i.d(g.f71771a, new DebugToolsServiceImpl$updateExtraHeader$1(str2, this, str, null));
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public String getAbVariant() {
        return (String) C10727i.d(g.f71771a, new DebugToolsServiceImpl$abVariant$1(this, null));
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public String getCommitHash() {
        return this.sharedPreferences.getString("commit_hash", this.config.getCommitHash());
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public Long getFfRefreshIntervalMinutes() {
        Long valueOf = Long.valueOf(this.sharedPreferences.getLong("ff_refresh_interval_minutes", -1L));
        if (valueOf.longValue() > 0) {
            return valueOf;
        }
        return null;
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public String getInternalHeadersToken() {
        return initInternalHeadersToken();
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public String getMeshValue() {
        return (String) C10727i.d(g.f71771a, new DebugToolsServiceImpl$meshValue$1(this, null));
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public String getResolveOverride() {
        return this.resolveOverride;
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    @NotNull
    public p<Boolean> onAbVariantSaved() {
        return this.abVariantListener;
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    @NotNull
    public p<String> onCommitHashSaved() {
        return this.commitHashListener;
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public void setAbVariant(String str) {
        updateExtraHeader(getExtraHeadersRepository(), "x-o3-ab-variants", str);
        this.abVariantListener.onNext(Boolean.TRUE);
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public void setCommitHash(String str) {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("commit_hash", str);
        edit.apply();
        C3667a<String> c3667a = this.commitHashListener;
        if (str == null) {
            str = this.config.getCommitHash();
        }
        c3667a.onNext(str);
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public void setFfRefreshIntervalMinutes(Long l11) {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (l11 != null) {
            edit.putLong("ff_refresh_interval_minutes", l11.longValue());
        } else {
            edit.remove("ff_refresh_interval_minutes");
        }
        edit.apply();
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public void setInternalHeadersToken(String str) {
        updateExtraHeader(getExtraHeadersRepository(), "x-o3-internal-headers-token", str);
        this.internalHeadersToken = str;
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public void setMeshValue(String str) {
        updateExtraHeader(getExtraHeadersRepository(), "x-o3-meshversion", str);
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsService
    public void setResolveOverride(String str) {
        this.resolveOverride = str;
    }
}

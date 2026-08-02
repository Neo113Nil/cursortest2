package ru.ozon.app.android.barcodecache.push;

import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import eh0.c;
import eh0.d;
import fh0.C6568c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.barcodecache.data.BarcodeCacheDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010$\u001a\u00060\u001fj\u0002` 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/ozon/app/android/barcodecache/push/BarcodePushHandler;", "Leh0/d;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lfh0/c;", "pushModel", "", "saveBarcode", "(Lfh0/c;)V", "", "code", "visibleCode", "", "lifetime", "Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "createBarcodeCacheDTO", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "", "shouldHandle", "(Lfh0/c;)Z", "Leh0/c;", "handle", "(Lfh0/c;)Leh0/c;", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "barcodeCacheManager$delegate", "LSc/j;", "getBarcodeCacheManager", "()Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "barcodeCacheManager", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer$delegate", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonDeserializer", "Companion", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodePushHandler implements d {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: barcodeCacheManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j barcodeCacheManager;

    /* renamed from: jsonDeserializer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/barcodecache/push/BarcodePushHandler$Companion;", "", "<init>", "()V", "KEY_EXTRA", "", "LIFETIME_DEFAULT", "", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BarcodePushHandler(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.barcodeCacheManager = k.b(new BarcodePushHandler$barcodeCacheManager$2(application));
        this.jsonDeserializer = k.b(new BarcodePushHandler$jsonDeserializer$2(application));
    }

    private final BarcodeCacheDTO createBarcodeCacheDTO(String code, String visibleCode, Long lifetime) {
        if (code == null || visibleCode == null) {
            return null;
        }
        return new BarcodeCacheDTO(code, visibleCode, lifetime != null ? lifetime.longValue() - (System.currentTimeMillis() / 1000) : 43200L);
    }

    private final BarcodeCacheManager getBarcodeCacheManager() {
        return (BarcodeCacheManager) this.barcodeCacheManager.getValue();
    }

    private final JsonParser getJsonDeserializer() {
        return (JsonParser) this.jsonDeserializer.getValue();
    }

    private final void saveBarcode(C6568c pushModel) {
        try {
            String str = pushModel.f().get("extra");
            if (str == null) {
                return;
            }
            BarcodePushExtra barcodePushExtra = (BarcodePushExtra) getJsonDeserializer().fromJson(str, BarcodePushExtra.class);
            BarcodeCacheDTO createBarcodeCacheDTO = createBarcodeCacheDTO(barcodePushExtra.getCode(), barcodePushExtra.getHint(), barcodePushExtra.getCacheLifetime());
            if (createBarcodeCacheDTO == null) {
                return;
            }
            getBarcodeCacheManager().saveBarcode(createBarcodeCacheDTO, createBarcodeCacheDTO(barcodePushExtra.getTeensCode(), barcodePushExtra.getTeensHint(), barcodePushExtra.getTeensCacheLifetime()));
        } catch (Exception e11) {
            a.f17149a.e(e11);
        }
    }

    @Override // eh0.d
    @NotNull
    public c handle(@NotNull C6568c pushModel) {
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        saveBarcode(pushModel);
        return new c.b(pushModel);
    }

    @Override // eh0.d
    public boolean shouldHandle(@NotNull C6568c pushModel) {
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        return pushModel.f().containsKey("extra");
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662zk implements ServiceStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15001a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0538ul f15002b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f15003c;

    public C0662zk(@NotNull Context context, @NotNull InterfaceC0538ul interfaceC0538ul, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        this.f15001a = context;
        this.f15002b = interfaceC0538ul;
        this.f15003c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(@NotNull String str, @NotNull ProtobufStateSerializer<P> protobufStateSerializer, @NotNull ProtobufConverter<T, P> protobufConverter) {
        Om.f12714a.getClass();
        return new Nm(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f15001a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f15001a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final SQLiteOpenHelper getDbStorage() {
        return this.f15003c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f15001a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final TempCacheStorage getTempCacheStorage() {
        C0515tn c0515tn;
        C0637yk B = C0353na.I.B();
        Context context = this.f15001a;
        synchronized (B) {
            try {
                c0515tn = B.f14968h;
                if (c0515tn == null) {
                    Sm sm = Sm.SERVICE;
                    C0490sn c0490sn = B.f14967g;
                    if (c0490sn == null) {
                        c0490sn = new C0490sn(new C0439ql(B.f(context)), "temp_cache");
                        B.f14967g = c0490sn;
                    }
                    c0515tn = new C0515tn(context, sm, c0490sn);
                    B.f14968h = c0515tn;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0515tn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences legacyModulePreferences() {
        return new C0653zb(this.f15002b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new Xc(str, this.f15002b);
    }
}

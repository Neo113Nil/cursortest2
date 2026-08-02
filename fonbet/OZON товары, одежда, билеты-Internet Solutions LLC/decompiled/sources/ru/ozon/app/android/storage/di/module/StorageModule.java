package ru.ozon.app.android.storage.di.module;

import J4.r;
import J4.s;
import K4.a;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.OzonDatabase;
import ru.ozon.app.android.storage.entity.bundle.BundleStateDao;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryDao;
import ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storage/di/module/StorageModule;", "", "<init>", "()V", "provideOzonDatabase", "Lru/ozon/app/android/storage/OzonDatabase;", "context", "Landroid/content/Context;", "provideEncryptedSharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPreferences", "provideNetworkHistoryDao", "Lru/ozon/app/android/storage/entity/network/NetworkHistoryDao;", "database", "provideSellerFavoriteDao", "Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteDao;", "provideBundleStateDao", "Lru/ozon/app/android/storage/entity/bundle/BundleStateDao;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StorageModule {
    @NotNull
    public final BundleStateDao provideBundleStateDao(@NotNull OzonDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.bundleStateDao();
    }

    @NotNull
    public final SharedPreferences provideEncryptedSharedPreferences(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SharedPreferencesProvider.INSTANCE.getEncryptedSharedPreferences(context);
    }

    @NotNull
    public final NetworkHistoryDao provideNetworkHistoryDao(@NotNull OzonDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.networkHistoryDao();
    }

    @NotNull
    public final OzonDatabase provideOzonDatabase(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        s.a a11 = r.a(OzonDatabase.class, "ozon", applicationContext);
        a11.g();
        a11.c();
        a aVar = OzonDatabase.MIGRATION_1_2;
        a aVar2 = OzonDatabase.MIGRATION_2_3;
        a aVar3 = OzonDatabase.MIGRATION_3_4;
        a aVar4 = OzonDatabase.MIGRATION_4_5;
        a aVar5 = OzonDatabase.MIGRATION_5_6;
        a aVar6 = OzonDatabase.MIGRATION_6_7;
        a aVar7 = OzonDatabase.MIGRATION_7_8;
        a aVar8 = OzonDatabase.MIGRATION_8_9;
        a aVar9 = OzonDatabase.MIGRATION_9_10;
        OzonDatabase.Companion companion = OzonDatabase.INSTANCE;
        a11.b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, companion.getMIGRATION_10_11(), companion.getMIGRATION_11_12(), companion.getMIGRATION_12_13(), companion.getMIGRATION_13_14(), companion.getMIGRATION_14_15(), companion.getMIGRATION_15_16(), companion.getMIGRATION_16_17(), companion.getMIGRATION_17_18(), companion.getMIGRATION_18_19(), companion.getMIGRATION_19_20(), companion.getMIGRATION_20_21(), companion.getMIGRATION_21_22());
        return (OzonDatabase) a11.d();
    }

    @NotNull
    public final SellerFavoriteDao provideSellerFavoriteDao(@NotNull OzonDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.sellerFavoriteDao();
    }

    @NotNull
    public final SharedPreferences provideSharedPreferences(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SharedPreferencesProvider.INSTANCE.getSharedPreferences$storage_prodGoogleAllVendorsRelease(context);
    }
}

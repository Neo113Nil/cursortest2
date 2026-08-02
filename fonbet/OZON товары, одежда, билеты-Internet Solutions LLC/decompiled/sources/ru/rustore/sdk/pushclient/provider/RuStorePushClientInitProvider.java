package ru.rustore.sdk.pushclient.provider;

import Nl0.l;
import Ol0.t;
import Ol0.u;
import Pl0.h;
import Pl0.q;
import Ql0.d;
import Ql0.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Yl0.f;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ob.C8684c;
import org.jetbrains.annotations.NotNull;
import pb.C8892c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/pushclient/provider/RuStorePushClientInitProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0})
/* loaded from: classes8.dex */
public final class RuStorePushClientInitProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97967a = k.b(new a());

    public static final class a extends AbstractC7737t implements Function0<d> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            Context context = RuStorePushClientInitProvider.this.getContext();
            Application application = (Application) (context != null ? context.getApplicationContext() : null);
            if (application == null) {
                throw new IllegalStateException("applicationContext must be not null");
            }
            Hl0.a logger = new Hl0.a("RuStorePushClient");
            h hVar = h.f22655a;
            PackageManager packageManager = application.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "application.packageManager");
            String packageName = application.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "application.packageName");
            hVar.getClass();
            Intrinsics.checkNotNullParameter(packageManager, "packageManager");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            C8892c manifestDataSource = new C8892c(packageManager, packageName);
            Intrinsics.checkNotNullParameter(manifestDataSource, "manifestDataSource");
            C8684c metadataRepository = new C8684c(manifestDataSource);
            Dl0.a ruStorePushClient = Dl0.a.f6752a;
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(ruStorePushClient, "ruStorePushClient");
            Intrinsics.checkNotNullParameter(logger, "logger");
            l pushClientInitRepository = new l(new t(application), new u(application, logger));
            Za.d dVar = q.f22702a;
            Intrinsics.checkNotNullParameter(metadataRepository, "metadataRepository");
            Intrinsics.checkNotNullParameter(pushClientInitRepository, "pushClientInitRepository");
            Intrinsics.checkNotNullParameter(logger, "logger");
            f initPushClientWithMetadataUseCase = new f(metadataRepository, pushClientInitRepository, logger);
            Za.d dVar2 = Pl0.d.f22647a;
            Intrinsics.checkNotNullParameter(initPushClientWithMetadataUseCase, "initPushClientWithMetadataUseCase");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new e(initPushClientWithMetadataUseCase, logger);
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(@NotNull Context context, @NotNull ProviderInfo info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        if ("ru.rustore.sdk.pushclient.rustorepushclientinitprovider".equals(info.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, info);
    }

    @Override // android.content.ContentProvider
    public final int delete(@NotNull Uri uri, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(@NotNull Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if ((context != null ? context.getApplicationContext() : null) == null) {
            return false;
        }
        ((d) this.f97967a.getValue()).a();
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(@NotNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NotNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}

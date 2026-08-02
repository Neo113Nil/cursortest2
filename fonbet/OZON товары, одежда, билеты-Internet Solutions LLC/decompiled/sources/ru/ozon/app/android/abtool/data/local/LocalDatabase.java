package ru.ozon.app.android.abtool.data.local;

import J4.r;
import J4.s;
import Sc.o;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.data.local.dao.ExperimentDao;
import ru.ozon.app.android.abtool.data.local.dao.FeatureDao;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/abtool/data/local/LocalDatabase;", "LJ4/s;", "<init>", "()V", "Lru/ozon/app/android/abtool/data/local/dao/FeatureDao;", "featureDao", "()Lru/ozon/app/android/abtool/data/local/dao/FeatureDao;", "Lru/ozon/app/android/abtool/data/local/dao/ExperimentDao;", "experimentDao", "()Lru/ozon/app/android/abtool/data/local/dao/ExperimentDao;", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LocalDatabase extends s {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/abtool/data/local/LocalDatabase$Companion;", "", "<init>", "()V", "buildDatabase", "Lru/ozon/app/android/abtool/data/local/LocalDatabase;", "context", "Landroid/content/Context;", "namespace", "Lru/ozon/app/android/abtool/AbToolNamespace;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AbToolNamespace.values().length];
                try {
                    iArr[AbToolNamespace.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbToolNamespace.PLATFORM_MOBILE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LocalDatabase buildDatabase(@NotNull Context context, @NotNull AbToolNamespace namespace) {
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            int i11 = WhenMappings.$EnumSwitchMapping$0[namespace.ordinal()];
            if (i11 == 1) {
                str = "LocalDb.db";
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                str = "LocalLibsDb.db";
            }
            s.a a11 = r.a(LocalDatabase.class, str, context.getApplicationContext());
            a11.c();
            a11.g();
            a11.b(MigrationsKt.getMIGRATION_1_2());
            s d11 = a11.d();
            Intrinsics.checkNotNullExpressionValue(d11, "build(...)");
            return (LocalDatabase) d11;
        }

        private Companion() {
        }
    }

    @NotNull
    public abstract ExperimentDao experimentDao();

    @NotNull
    public abstract FeatureDao featureDao();
}

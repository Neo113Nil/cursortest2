package ru.ozon.app.android.limb2.di.modules;

import Nd0.c;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/limb2/di/modules/Limb2DependencyModule;", "", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Limb2DependencyModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/limb2/di/modules/Limb2DependencyModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/utils/AppType;", "appType", "LNd0/c;", "provideOzonLimbAppName", "(Lru/ozon/app/android/utils/AppType;)LNd0/c;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AppType.values().length];
                try {
                    iArr[AppType.f94580BX.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AppType.TRAVEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AppType.SELECT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AppType.FRESH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c provideOzonLimbAppName(@NotNull AppType appType) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            int i11 = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
            if (i11 == 1) {
                return c.a.f19474a;
            }
            if (i11 == 2) {
                return c.d.f19477a;
            }
            if (i11 == 3) {
                return c.C0384c.f19476a;
            }
            if (i11 == 4) {
                return c.b.f19475a;
            }
            throw new o();
        }

        private Companion() {
        }
    }
}

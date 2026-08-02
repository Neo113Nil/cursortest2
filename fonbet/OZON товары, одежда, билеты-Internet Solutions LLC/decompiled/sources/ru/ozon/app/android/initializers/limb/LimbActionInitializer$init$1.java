package ru.ozon.app.android.initializers.limb;

import Kd0.b;
import Kd0.c;
import Kd0.d;
import Kd0.k;
import kotlin.Metadata;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0003\u0000\u0002\u0007\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ru/ozon/app/android/initializers/limb/LimbActionInitializer$init$1", "LKd0/d;", "ru/ozon/app/android/initializers/limb/LimbActionInitializer$init$1$uiConfig$1", "uiConfig", "Lru/ozon/app/android/initializers/limb/LimbActionInitializer$init$1$uiConfig$1;", "getUiConfig", "()Lru/ozon/app/android/initializers/limb/LimbActionInitializer$init$1$uiConfig$1;", "ru/ozon/app/android/initializers/limb/LimbActionInitializer$init$1$buildConfig$1", "buildConfig", "Lru/ozon/app/android/initializers/limb/LimbActionInitializer$init$1$buildConfig$1;", "getBuildConfig", "()Lru/ozon/app/android/initializers/limb/LimbActionInitializer$init$1$buildConfig$1;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LimbActionInitializer$init$1 extends d {
    private final LimbActionInitializer$init$1$uiConfig$1 uiConfig = new k() { // from class: ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$1$uiConfig$1
        private final boolean isUIReady;

        @Override // Kd0.k
        /* renamed from: isUIReady, reason: from getter */
        public boolean getIsUIReady() {
            return this.isUIReady;
        }
    };
    private final LimbActionInitializer$init$1$buildConfig$1 buildConfig = new b() { // from class: ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$1$buildConfig$1
        private final c buildType;

        {
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            this.buildType = (buildUtils.isQaFlavor() || buildUtils.isDebug()) ? c.f15940QA : c.PROD;
        }

        @Override // Kd0.b
        public c getBuildType() {
            return this.buildType;
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$1$uiConfig$1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$1$buildConfig$1] */
    LimbActionInitializer$init$1() {
    }

    public LimbActionInitializer$init$1$buildConfig$1 getBuildConfig() {
        return this.buildConfig;
    }

    public LimbActionInitializer$init$1$uiConfig$1 getUiConfig() {
        return this.uiConfig;
    }
}

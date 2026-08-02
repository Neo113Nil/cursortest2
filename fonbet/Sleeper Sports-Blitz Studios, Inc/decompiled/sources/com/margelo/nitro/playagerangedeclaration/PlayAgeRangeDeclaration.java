package com.margelo.nitro.playagerangedeclaration;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.play.agesignals.AgeSignalsManager;
import com.google.android.play.agesignals.AgeSignalsManagerFactory;
import com.google.android.play.agesignals.AgeSignalsResult;
import com.google.android.play.agesignals.testing.FakeAgeSignalsManager;
import com.margelo.nitro.NitroModules;
import com.margelo.nitro.core.Promise;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayAgeRangeDeclaration.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclaration;", "Lcom/margelo/nitro/playagerangedeclaration/HybridPlayAgeRangeDeclarationSpec;", "<init>", "()V", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "getPlayAgeRangeDeclaration", "Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", "requestDeclaredAgeRange", "Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", "firstThresholdAge", "", "secondThresholdAge", "thirdThresholdAge", "(DLjava/lang/Double;Ljava/lang/Double;)Lcom/margelo/nitro/core/Promise;", "Companion", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlayAgeRangeDeclaration extends HybridPlayAgeRangeDeclarationSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static AgeSignalsResult mockUser;

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getAppContext() {
        ReactApplicationContext applicationContext = NitroModules.INSTANCE.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        throw new IllegalStateException("Application context not available");
    }

    @Override // com.margelo.nitro.playagerangedeclaration.HybridPlayAgeRangeDeclarationSpec
    public Promise<PlayAgeRangeDeclarationResult> getPlayAgeRangeDeclaration() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new PlayAgeRangeDeclaration$getPlayAgeRangeDeclaration$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.playagerangedeclaration.HybridPlayAgeRangeDeclarationSpec
    public Promise<DeclaredAgeRangeResult> requestDeclaredAgeRange(double firstThresholdAge, Double secondThresholdAge, Double thirdThresholdAge) {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new PlayAgeRangeDeclaration$requestDeclaredAgeRange$1(null), 1, null);
    }

    /* compiled from: PlayAgeRangeDeclaration.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\b\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclaration$Companion;", "", "<init>", "()V", "mockUser", "Lcom/google/android/play/agesignals/AgeSignalsResult;", "getMockUser", "()Lcom/google/android/play/agesignals/AgeSignalsResult;", "setMockUser", "(Lcom/google/android/play/agesignals/AgeSignalsResult;)V", "getManager", "Lcom/google/android/play/agesignals/AgeSignalsManager;", "context", "Landroid/content/Context;", "", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeMockConfig;", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AgeSignalsResult getMockUser() {
            return PlayAgeRangeDeclaration.mockUser;
        }

        public final void setMockUser(AgeSignalsResult ageSignalsResult) {
            PlayAgeRangeDeclaration.mockUser = ageSignalsResult;
        }

        public final AgeSignalsManager getManager(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AgeSignalsResult mockUser = getMockUser();
            if (mockUser != null) {
                FakeAgeSignalsManager fakeAgeSignalsManager = new FakeAgeSignalsManager();
                fakeAgeSignalsManager.setNextAgeSignalsResult(mockUser);
                return fakeAgeSignalsManager;
            }
            AgeSignalsManager create = AgeSignalsManagerFactory.create(context);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return create;
        }

        public final void setMockUser(PlayAgeRangeMockConfig config) {
            if (config == null) {
                setMockUser((AgeSignalsResult) null);
                return;
            }
            AgeSignalsResult.Builder installId = AgeSignalsResult.builder().setInstallId("fake_install_id_12345");
            Intrinsics.checkNotNullExpressionValue(installId, "setInstallId(...)");
            installId.setUserStatus(Integer.valueOf(config.getUserStatus()));
            Integer ageLower = config.getAgeLower();
            if (ageLower != null) {
                installId.setAgeLower(Integer.valueOf(ageLower.intValue()));
            }
            Integer ageUpper = config.getAgeUpper();
            if (ageUpper != null) {
                installId.setAgeUpper(Integer.valueOf(ageUpper.intValue()));
            }
            String installId2 = config.getInstallId();
            if (installId2 != null) {
                installId.setInstallId(installId2);
            }
            Date mostRecentApprovalDate = config.getMostRecentApprovalDate();
            if (mostRecentApprovalDate != null) {
                installId.setMostRecentApprovalDate(mostRecentApprovalDate);
            }
            setMockUser(installId.build());
        }
    }
}

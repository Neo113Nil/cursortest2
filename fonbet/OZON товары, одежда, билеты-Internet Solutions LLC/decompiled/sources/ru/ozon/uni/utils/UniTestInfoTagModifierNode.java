package ru.ozon.uni.utils;

import C1.i;
import D1.E0;
import I1.A;
import I1.D;
import I1.z;
import U7.d;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/utils/UniTestInfoTagModifierNode;", "Landroidx/compose/ui/e$c;", "LC1/i;", "LD1/E0;", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "", "packageName", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", "LI1/D;", "", "applySemantics", "(LI1/D;)V", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "setTestInfo", "(Lru/ozon/uni/atoms/data/TestInfo;)V", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "", "shouldClearDescendantSemantics", "Z", "getShouldClearDescendantSemantics", "()Z", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniTestInfoTagModifierNode extends e.c implements i, E0 {

    @NotNull
    private final String packageName;
    private final boolean shouldClearDescendantSemantics;
    private final boolean shouldMergeDescendantSemantics;

    @NotNull
    private TestInfo testInfo;

    public UniTestInfoTagModifierNode(@NotNull TestInfo testInfo, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(testInfo, "testInfo");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.testInfo = testInfo;
        this.packageName = packageName;
    }

    @Override // D1.E0
    public void applySemantics(@NotNull D d11) {
        Intrinsics.checkNotNullParameter(d11, "<this>");
        if (getNode().isAttached()) {
            UniGlobalConfig uniGlobalConfig = UniGlobalConfig.INSTANCE;
            String e11 = uniGlobalConfig.getEnablePackageNamePrefixInTestTags() ? d.e(this.packageName, ":id/") : "";
            z.t(d11, e11 + this.testInfo.getAutomatizationId());
            A.a(d11, uniGlobalConfig.getTestTagsAsResourceId());
        }
    }

    @Override // D1.E0
    public boolean getShouldClearDescendantSemantics() {
        return this.shouldClearDescendantSemantics;
    }

    @Override // D1.E0
    public boolean getShouldMergeDescendantSemantics() {
        return this.shouldMergeDescendantSemantics;
    }

    public final void setTestInfo(@NotNull TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(testInfo, "<set-?>");
        this.testInfo = testInfo;
    }
}

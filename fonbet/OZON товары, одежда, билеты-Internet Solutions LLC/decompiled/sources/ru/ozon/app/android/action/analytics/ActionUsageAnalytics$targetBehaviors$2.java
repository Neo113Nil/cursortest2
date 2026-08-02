package ru.ozon.app.android.action.analytics;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;
import ru.ozon.app.android.action.featureflag.AllowedToTrackAtomBehaviorsFlag;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ActionUsageAnalytics$targetBehaviors$2 extends AbstractC7737t implements Function0<Set<? extends String>> {
    final /* synthetic */ ActionUsageAnalytics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionUsageAnalytics$targetBehaviors$2(ActionUsageAnalytics actionUsageAnalytics) {
        super(0);
        this.this$0 = actionUsageAnalytics;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        FeatureService featureService;
        featureService = this.this$0.featureService;
        return C7714v.Y0(h.m(featureService.getStringKey(AllowedToTrackAtomBehaviorsFlag.INSTANCE), new String[]{","}, 0, 6));
    }
}

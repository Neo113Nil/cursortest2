package ru.ozon.app.android.ui.start;

import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/fragment/app/G;", "invoke", "()Landroidx/fragment/app/G;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class HomePageConfigurator$onResume$1 extends AbstractC7737t implements Function0<G> {
    final /* synthetic */ HomePageConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomePageConfigurator$onResume$1(HomePageConfigurator homePageConfigurator) {
        super(0);
        this.this$0 = homePageConfigurator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final G invoke() {
        r activity;
        activity = this.this$0.getActivity();
        G supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        return supportFragmentManager;
    }
}

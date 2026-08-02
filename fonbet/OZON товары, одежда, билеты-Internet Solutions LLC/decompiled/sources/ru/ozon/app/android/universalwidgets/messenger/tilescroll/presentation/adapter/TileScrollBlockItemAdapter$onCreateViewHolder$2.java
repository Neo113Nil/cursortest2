package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.adapter;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileScrollBlockItemAdapter$onCreateViewHolder$2 extends AbstractC7737t implements Function1<Map<String, ? extends TokenizedTrackingInfo>, Unit> {
    final /* synthetic */ TileScrollBlockItemAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileScrollBlockItemAdapter$onCreateViewHolder$2(TileScrollBlockItemAdapter tileScrollBlockItemAdapter) {
        super(1);
        this.this$0 = tileScrollBlockItemAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map) {
        invoke2((Map<String, TokenizedTrackingInfo>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, TokenizedTrackingInfo> it) {
        d dVar;
        Intrinsics.checkNotNullParameter(it, "it");
        Map<String, MessengerTrackingInfo> a11 = h.a(it);
        dVar = this.this$0.references;
        dVar.c().s(a11);
    }
}

package ru.ozon.app.android.debugmenu.analytics.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "cache", "", "", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DataLayerRepresentationActivity$onCreate$1 extends AbstractC7737t implements Function1<Map<String, ? extends Object>, Unit> {
    final /* synthetic */ List<String> $breadCrumbs;
    final /* synthetic */ RecyclerView $list;
    final /* synthetic */ DataLayerRepresentationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataLayerRepresentationActivity$onCreate$1(RecyclerView recyclerView, DataLayerRepresentationActivity dataLayerRepresentationActivity, List<String> list) {
        super(1);
        this.$list = recyclerView;
        this.this$0 = dataLayerRepresentationActivity;
        this.$breadCrumbs = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
        invoke2(map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map) {
        Map data;
        RecyclerView recyclerView = this.$list;
        DataLayerRepresentationActivity dataLayerRepresentationActivity = this.this$0;
        Intrinsics.f(map);
        data = dataLayerRepresentationActivity.getData(map, this.$breadCrumbs);
        recyclerView.setAdapter(new DataLayerAdapter(data, this.this$0));
    }
}

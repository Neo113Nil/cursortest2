package ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation;

import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", SearchIntents.EXTRA_QUERY, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelSearchBarWidgetViewHolder$debouncedTextWatcher$1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
    final /* synthetic */ TravelSearchBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelSearchBarWidgetViewHolder$debouncedTextWatcher$1(TravelSearchBarWidgetViewHolder travelSearchBarWidgetViewHolder) {
        super(1);
        this.this$0 = travelSearchBarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        TravelSearchBarWidgetViewHolder travelSearchBarWidgetViewHolder = this.this$0;
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        travelSearchBarWidgetViewHolder.onQueryChanged(obj);
    }
}

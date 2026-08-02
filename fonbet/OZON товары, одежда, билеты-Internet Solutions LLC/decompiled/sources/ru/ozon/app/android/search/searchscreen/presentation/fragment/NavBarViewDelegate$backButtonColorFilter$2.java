package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/PorterDuffColorFilter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavBarViewDelegate$backButtonColorFilter$2 extends AbstractC7737t implements Function0<PorterDuffColorFilter> {
    final /* synthetic */ NavBarViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarViewDelegate$backButtonColorFilter$2(NavBarViewDelegate navBarViewDelegate) {
        super(0);
        this.this$0 = navBarViewDelegate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PorterDuffColorFilter invoke() {
        int i11;
        i11 = this.this$0.tintColor;
        return new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
    }
}

package ru.ozon.app.android.product.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultVO;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\u0010\b\u0000\u0010\u0003*\u00020\u0000*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/account/adult/presenter/AdultVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "T", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lru/ozon/app/android/account/adult/presenter/AdultVO;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class AdultWidgetViewHolder$onAttach$1<T> extends AbstractC7737t implements Function1<T, Unit> {
    final /* synthetic */ AdultWidgetViewHolder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultWidgetViewHolder$onAttach$1(AdultWidgetViewHolder<T> adultWidgetViewHolder) {
        super(1);
        this.this$0 = adultWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((AdultVO) obj);
        return Unit.f71690a;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public final void invoke(AdultVO adultVO) {
        AdultWidgetViewHolder<T> adultWidgetViewHolder = this.this$0;
        Intrinsics.f(adultVO);
        adultWidgetViewHolder.bindAdultContent(adultVO);
    }
}

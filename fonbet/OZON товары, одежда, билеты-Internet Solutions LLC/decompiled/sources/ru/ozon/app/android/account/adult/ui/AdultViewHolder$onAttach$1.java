package ru.ozon.app.android.account.adult.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultVO;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "it", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/account/adult/presenter/AdultVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdultViewHolder$onAttach$1<T> extends AbstractC7737t implements Function1<T, Unit> {
    final /* synthetic */ AdultViewHolder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultViewHolder$onAttach$1(AdultViewHolder<T> adultViewHolder) {
        super(1);
        this.this$0 = adultViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((AdultVO) obj);
        return Unit.f71690a;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public final void invoke(AdultVO adultVO) {
        AdultViewHolder<T> adultViewHolder = this.this$0;
        Intrinsics.f(adultVO);
        adultViewHolder.bindAdultContent(adultVO);
    }
}

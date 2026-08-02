package ru.ozon.app.android.ugcratingmolecule.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegateImpl$currentRatingClickCallback$2$1", "invoke", "()Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegateImpl$currentRatingClickCallback$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class UgcRatingDelegateImpl$currentRatingClickCallback$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ UgcRatingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcRatingDelegateImpl$currentRatingClickCallback$2(UgcRatingDelegateImpl ugcRatingDelegateImpl) {
        super(0);
        this.this$0 = ugcRatingDelegateImpl;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegateImpl$currentRatingClickCallback$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final UgcRatingDelegateImpl ugcRatingDelegateImpl = this.this$0;
        return new Function1<Integer, Unit>() { // from class: ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegateImpl$currentRatingClickCallback$2.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.f71690a;
            }

            public void invoke(int rating) {
                String str;
                UgcRatingDelegateViewModel delegateViewModel;
                ComposerReferences composerReferences;
                str = UgcRatingDelegateImpl.this.currentSku;
                if (str == null) {
                    return;
                }
                delegateViewModel = UgcRatingDelegateImpl.this.delegateViewModel(str);
                composerReferences = UgcRatingDelegateImpl.this.refs;
                delegateViewModel.onRatingClicked(rating, composerReferences);
            }
        };
    }
}

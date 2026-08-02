package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: IntercomArticleSearchActivity.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class IntercomArticleSearchActivity$SearchScreenContent$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ Function1<MutableStateFlow<String>, Unit> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    IntercomArticleSearchActivity$SearchScreenContent$1(Function0<Unit> function0, Function1<? super MutableStateFlow<String>, Unit> function1) {
        this.$onBackClick = function0;
        this.$onTextChanged = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            HelpCenterSearchTopBarKt.HelpCenterSearchTopBar(this.$onBackClick, this.$onTextChanged, new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$SearchScreenContent$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = IntercomArticleSearchActivity$SearchScreenContent$1.invoke$lambda$0((String) obj);
                    return invoke$lambda$0;
                }
            }, composer, 384);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

package ru.ozon.app.android.search.deeplink;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.R$anim;
import sZ.c;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LsZ/c$b;", "invoke", "()LsZ/c$b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class SearchSuggestionsDeeplinkHandler$transitionAnimationForBackButton$2 extends AbstractC7737t implements Function0<c.b> {
    public static final SearchSuggestionsDeeplinkHandler$transitionAnimationForBackButton$2 INSTANCE = new SearchSuggestionsDeeplinkHandler$transitionAnimationForBackButton$2();

    SearchSuggestionsDeeplinkHandler$transitionAnimationForBackButton$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final c.b invoke() {
        int i11 = R$anim.fade_in_suggestions_anim;
        return new c.b(i11, i11, R$anim.fade_out_suggestions_anim, 2, 0);
    }
}

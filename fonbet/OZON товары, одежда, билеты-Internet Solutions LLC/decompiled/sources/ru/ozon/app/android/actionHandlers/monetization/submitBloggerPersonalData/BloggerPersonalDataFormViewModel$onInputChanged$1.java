package ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u00022\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u00022\u000b\u0010\u0005\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;", "Lkotlin/jvm/internal/EnhancedNullability;", "<unused var>", "", "inputState", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class BloggerPersonalDataFormViewModel$onInputChanged$1 extends AbstractC7737t implements Function2<String, BloggerPersonalDataFormInputState, BloggerPersonalDataFormInputState> {
    final /* synthetic */ String $newValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloggerPersonalDataFormViewModel$onInputChanged$1(String str) {
        super(2);
        this.$newValue = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final BloggerPersonalDataFormInputState invoke(String str, BloggerPersonalDataFormInputState inputState) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        return BloggerPersonalDataFormInputState.copy$default(inputState, this.$newValue, null, false, null, 6, null);
    }
}

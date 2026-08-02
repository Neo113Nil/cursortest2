package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.BloggerPersonalDataFormViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class BloggerPersonalDataFormComponent$Companion$create$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<BloggerPersonalDataFormViewModel>> {
    public static final BloggerPersonalDataFormComponent$Companion$create$1$1$viewModelProvider$2 INSTANCE = new BloggerPersonalDataFormComponent$Companion$create$1$1$viewModelProvider$2();

    BloggerPersonalDataFormComponent$Companion$create$1$1$viewModelProvider$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BloggerPersonalDataFormViewModel invoke$lambda$0() {
        return new BloggerPersonalDataFormViewModel();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<BloggerPersonalDataFormViewModel> invoke() {
        return new a();
    }
}

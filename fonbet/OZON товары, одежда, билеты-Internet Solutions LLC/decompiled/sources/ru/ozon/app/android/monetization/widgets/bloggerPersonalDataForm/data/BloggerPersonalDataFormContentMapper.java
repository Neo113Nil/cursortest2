package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.data;

import Kk.c;
import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.BloggerPersonalDataFormInputState;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.data.BloggerPersonalDataFormDTO;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation.BloggerPersonalDataFormVI;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormContentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "Ll20/d;", "", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Content;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View;", "toVI", "(Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View;)Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View$Input;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input;", "(Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View$Input;)Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View$Separator;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Separator;", "(Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View$Separator;)Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Separator;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;Ll20/d;)Ljava/util/List;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BloggerPersonalDataFormContentMapper implements Function2<BloggerPersonalDataFormDTO, d, List<? extends BloggerPersonalDataFormVI.Content>> {
    private final BloggerPersonalDataFormVI.View toVI(BloggerPersonalDataFormDTO.View view) {
        if (view instanceof BloggerPersonalDataFormDTO.View.Input) {
            return toVI((BloggerPersonalDataFormDTO.View.Input) view);
        }
        if (view instanceof BloggerPersonalDataFormDTO.View.Separator) {
            return toVI((BloggerPersonalDataFormDTO.View.Separator) view);
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BloggerPersonalDataFormVI.Content> invoke(@NotNull BloggerPersonalDataFormDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), "-content");
        List<BloggerPersonalDataFormDTO.View> views = state.getViews();
        ArrayList arrayList = new ArrayList(C7714v.z(views, 10));
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            arrayList.add(toVI((BloggerPersonalDataFormDTO.View) it.next()));
        }
        return C7714v.a0(new BloggerPersonalDataFormVI.Content(a11, arrayList));
    }

    private final BloggerPersonalDataFormVI.View.Input toVI(BloggerPersonalDataFormDTO.View.Input input) {
        BloggerPersonalDataFormVI.View.Input.Type type;
        String name = input.getName();
        if (Intrinsics.d(input.getName(), FormPageDTO.Field.FIELD_TYPE_ADDRESS)) {
            type = BloggerPersonalDataFormVI.View.Input.Type.ADDRESS;
        } else {
            type = BloggerPersonalDataFormVI.View.Input.Type.TEXT;
        }
        String value = input.getValue();
        if (value == null) {
            value = "";
        }
        String emptyError = input.getEmptyError();
        BloggerPersonalDataFormInputState bloggerPersonalDataFormInputState = new BloggerPersonalDataFormInputState(value, emptyError != null ? emptyError : "", input.isOptional(), null, 8, null);
        String placeholder = input.getPlaceholder();
        TestInfo testInfo = input.getTestInfo();
        return new BloggerPersonalDataFormVI.View.Input(name, type, bloggerPersonalDataFormInputState, placeholder, testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    private final BloggerPersonalDataFormVI.View.Separator toVI(BloggerPersonalDataFormDTO.View.Separator separator) {
        return new BloggerPersonalDataFormVI.View.Separator(separator.getHeight(), separator.getTintColor(), separator.getLeftPadding(), separator.getRightPadding());
    }
}

package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.main.ui.molecules.oldHeader.FreshHeaderDTO;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.data.ExpressNavigationSliderV2DTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u000022\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003`\u0005B\u0013\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2Parser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Section;", "section", "", "appendInnerItem", "(Ljava/util/List;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Section;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpressNavigationSliderV2Parser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public ExpressNavigationSliderV2Parser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final void appendInnerItem(List<Object> list, ExpressNavigationSliderV2DTO.Section section) {
        FreshHeaderDTO header;
        List<ExpressNavigationSliderV2DTO.Item> items;
        if ((section != null ? section.getSeparatorHeight() : null) != null) {
            list.add(new ExpressNavigationSliderV2DTO.SeparatorDTO(section.getSeparatorHeight().intValue()));
        } else if (section != null && (header = section.getHeader()) != null) {
            list.add(header);
        }
        if (section == null || (items = section.getItems()) == null || !(!items.isEmpty())) {
            return;
        }
        list.add(new ExpressNavigationSliderV2DTO.Items(section.getItems()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.jsonDeserializer;
        Intrinsics.f(state);
        ExpressNavigationSliderV2DTO expressNavigationSliderV2DTO = (ExpressNavigationSliderV2DTO) jsonParser.fromJson(state, ExpressNavigationSliderV2DTO.class);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = expressNavigationSliderV2DTO.getSections().iterator();
        while (it.hasNext()) {
            appendInnerItem(arrayList, (ExpressNavigationSliderV2DTO.Section) it.next());
        }
        return arrayList;
    }
}

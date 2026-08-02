package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.data.AspectCompactV2Footer;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.data.AspectCompactV2Header;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005B\u0013\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/AspectCompactV2Parser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectCompactV2Parser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser deserializer;

    public AspectCompactV2Parser(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.deserializer;
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AspectsV2DTO aspectsV2DTO = (AspectsV2DTO) jsonParser.fromJson(state, AspectsV2DTO.class);
        ArrayList arrayList = new ArrayList();
        List<AspectsV2DTO.AspectV2> aspects = aspectsV2DTO.getAspects();
        if (aspects != null) {
            for (AspectsV2DTO.AspectV2 aspectV2 : aspects) {
                if (aspectV2.getTitleAtom() != null) {
                    arrayList.add(new AspectCompactV2Header(aspectV2.getTitleAtom(), aspectV2.getAdditionalButton(), aspectV2.getAdditionalButtonAtom()));
                }
                arrayList.add(aspectV2);
                AspectsV2DTO.AspectV2.Footer footer = aspectV2.getFooter();
                if (footer != null) {
                    TextDTO leftTextBlock = footer.getLeftTextBlock();
                    TextDTO copy$default = leftTextBlock != null ? TextDTO.copy$default(leftTextBlock, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null) : null;
                    TextDTO rightTextBlock = footer.getRightTextBlock();
                    arrayList.add(new AspectCompactV2Footer(copy$default, rightTextBlock != null ? TextDTO.copy$default(rightTextBlock, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null) : null));
                }
            }
        }
        ButtonV3Atom.LargeButton applyButton = aspectsV2DTO.getApplyButton();
        if (applyButton != null) {
            arrayList.add(applyButton);
        }
        return arrayList;
    }
}

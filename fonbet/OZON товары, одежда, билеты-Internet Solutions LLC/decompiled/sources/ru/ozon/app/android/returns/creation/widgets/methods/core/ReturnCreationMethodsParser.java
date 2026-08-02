package ru.ozon.app.android.returns.creation.widgets.methods.core;

import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.creation.widgets.methods.data.AtomElementDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.BlockPaddingsDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.DatesDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.DatesElementDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.ElementDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.ImagesDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.ImagesElementDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.PaddingsDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.PaddingsDTOKt;
import ru.ozon.app.android.returns.creation.widgets.methods.data.TextWithIconButtonDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.TextWithIconButtonElementDTO;
import ru.ozon.app.android.returns.ui.data.parser.IslandSeparatorWidgetParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.InputSelectButtonDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;
import sf.C9681g;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/core/ReturnCreationMethodsParser;", "Lru/ozon/app/android/returns/ui/data/parser/IslandSeparatorWidgetParser;", "", "", "Lcom/squareup/moshi/Moshi;", "moshi", "Landroid/content/Context;", "context", "<init>", "(Lcom/squareup/moshi/Moshi;Landroid/content/Context;)V", "", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Landroid/content/Context;", "Lcom/squareup/moshi/n$a;", "jsonFields", "Lcom/squareup/moshi/n$a;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/methods/data/BlockPaddingsDTO;", "blockPaddingsJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "paddingsJsonAdapter", "Lru/ozon/app/android/returns/creation/widgets/methods/data/TextWithIconButtonDTO;", "textWithIconButtonJsonAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotationJsonAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textJsonAdapter", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "tabsJsonAdapter", "Lru/ozon/app/android/returns/creation/widgets/methods/data/ImagesDTO;", "imagesJsonAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellJsonAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonJsonAdapter", "Lru/ozon/app/android/returns/creation/widgets/methods/data/DatesDTO;", "datesJsonAdapter", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "inputSelectButtonJsonAdapter", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationMethodsParser extends IslandSeparatorWidgetParser<List<? extends Object>> {

    @NotNull
    private final JsonAdapter<DisclaimerAtom> annotationJsonAdapter;

    @NotNull
    private final JsonAdapter<BlockPaddingsDTO> blockPaddingsJsonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonJsonAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> cellJsonAdapter;

    @NotNull
    private final Context context;

    @NotNull
    private final JsonAdapter<DatesDTO> datesJsonAdapter;

    @NotNull
    private final JsonAdapter<ImagesDTO> imagesJsonAdapter;

    @NotNull
    private final JsonAdapter<InputSelectButtonDTO> inputSelectButtonJsonAdapter;

    @NotNull
    private final n.a jsonFields;

    @NotNull
    private final JsonAdapter<PaddingsDTO> paddingsJsonAdapter;

    @NotNull
    private final JsonAdapter<Tabs> tabsJsonAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textJsonAdapter;

    @NotNull
    private final JsonAdapter<TextWithIconButtonDTO> textWithIconButtonJsonAdapter;

    public ReturnCreationMethodsParser(@NotNull Moshi moshi, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.jsonFields = n.a.C0918a.a("blocks", "blockPaddings", "backgroundColor", "elements", "elementPaddings", "textWithIconButton", "annotation", "text", DynamicElementDTO.TABS, "images", "cell", "button", "dates", "inputSelectButton");
        this.blockPaddingsJsonAdapter = moshi.c(BlockPaddingsDTO.class);
        this.paddingsJsonAdapter = moshi.c(PaddingsDTO.class);
        this.textWithIconButtonJsonAdapter = moshi.c(TextWithIconButtonDTO.class);
        this.annotationJsonAdapter = moshi.c(DisclaimerAtom.class);
        this.textJsonAdapter = moshi.c(TextDTO.class);
        this.tabsJsonAdapter = moshi.c(Tabs.class);
        this.imagesJsonAdapter = moshi.c(ImagesDTO.class);
        this.cellJsonAdapter = moshi.c(CellDTO.class);
        this.buttonJsonAdapter = moshi.c(ButtonV3DTO.class);
        this.datesJsonAdapter = moshi.c(DatesDTO.class);
        this.inputSelectButtonJsonAdapter = moshi.c(InputSelectButtonDTO.class);
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, kotlin.collections.K] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        Object obj;
        C9681g source = new C9681g();
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        source.H0(state);
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = new p(source);
        ArrayList arrayList = new ArrayList();
        BlockPaddingsDTO blockPaddingsDTO = new BlockPaddingsDTO(0, 0, 0, 0, 15, null);
        String token = UniColors.LAYER_FLOOR_1.getToken();
        PaddingsDTO paddingsDTO = new PaddingsDTO(0, 0, 0, 0, 15, null);
        pVar.beginObject();
        while (pVar.hasNext()) {
            if (pVar.v(this.jsonFields) == 0) {
                pVar.beginArray();
                while (pVar.hasNext()) {
                    M m11 = new M();
                    m11.f71787a = K.f71697a;
                    pVar.beginObject();
                    BlockPaddingsDTO blockPaddingsDTO2 = null;
                    String str = null;
                    while (pVar.hasNext()) {
                        int v11 = pVar.v(this.jsonFields);
                        if (v11 == 1) {
                            BlockPaddingsDTO fromJson = this.blockPaddingsJsonAdapter.fromJson(pVar);
                            blockPaddingsDTO2 = fromJson == null ? new BlockPaddingsDTO(0, 0, 0, 0, 15, null) : fromJson;
                        } else if (v11 == 2) {
                            str = pVar.nextString();
                        } else if (v11 == 3) {
                            ?? arrayList2 = new ArrayList();
                            pVar.beginArray();
                            while (pVar.hasNext()) {
                                pVar.beginObject();
                                PaddingsDTO paddingsDTO2 = null;
                                TextWithIconButtonDTO textWithIconButtonDTO = null;
                                Object obj2 = null;
                                ImagesDTO imagesDTO = null;
                                DatesDTO datesDTO = null;
                                while (pVar.hasNext()) {
                                    switch (pVar.v(this.jsonFields)) {
                                        case 4:
                                            paddingsDTO2 = this.paddingsJsonAdapter.fromJson(pVar);
                                            break;
                                        case 5:
                                            textWithIconButtonDTO = this.textWithIconButtonJsonAdapter.fromJson(pVar);
                                            break;
                                        case 6:
                                            obj2 = this.annotationJsonAdapter.fromJson(pVar);
                                            break;
                                        case 7:
                                            obj2 = this.textJsonAdapter.fromJson(pVar);
                                            break;
                                        case 8:
                                            obj2 = this.tabsJsonAdapter.fromJson(pVar);
                                            break;
                                        case 9:
                                            imagesDTO = this.imagesJsonAdapter.fromJson(pVar);
                                            break;
                                        case 10:
                                            obj2 = this.cellJsonAdapter.fromJson(pVar);
                                            break;
                                        case 11:
                                            obj2 = this.buttonJsonAdapter.fromJson(pVar);
                                            break;
                                        case 12:
                                            datesDTO = this.datesJsonAdapter.fromJson(pVar);
                                            break;
                                        case 13:
                                            obj2 = this.inputSelectButtonJsonAdapter.fromJson(pVar);
                                            break;
                                        default:
                                            pVar.skipValue();
                                            break;
                                    }
                                }
                                pVar.endObject();
                                PaddingsDTO paddingsDTO3 = paddingsDTO2;
                                if (paddingsDTO3 == null) {
                                    paddingsDTO3 = paddingsDTO;
                                }
                                String str2 = str == null ? token : str;
                                if (textWithIconButtonDTO != null) {
                                    obj = new TextWithIconButtonElementDTO(paddingsDTO3, str2, textWithIconButtonDTO);
                                } else if (obj2 != null) {
                                    obj = new AtomElementDTO(paddingsDTO3, str2, (AtomDTO) obj2);
                                } else if (imagesDTO != null) {
                                    obj = new ImagesElementDTO(paddingsDTO3, str2, imagesDTO);
                                } else if (datesDTO != null) {
                                    List<DatesDTO.DateDTO> dates = datesDTO.getDates();
                                    if (dates == null) {
                                        dates = K.f71697a;
                                    }
                                    obj = new DatesElementDTO(paddingsDTO3, str2, dates);
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    arrayList2.add(obj);
                                }
                            }
                            pVar.endArray();
                            m11.f71787a = arrayList2;
                        }
                    }
                    pVar.endObject();
                    if (blockPaddingsDTO2 == null) {
                        blockPaddingsDTO2 = blockPaddingsDTO;
                    }
                    int i11 = 0;
                    for (Object obj3 : (Iterable) m11.f71787a) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        ElementDTO elementDTO = (ElementDTO) obj3;
                        if (((List) m11.f71787a).size() == 1) {
                            elementDTO.setPaddings(PaddingsDTOKt.addAll(elementDTO.getPaddings(), blockPaddingsDTO2));
                        } else if (i11 == 0) {
                            elementDTO.setPaddings(PaddingsDTOKt.addTopAndHorizontal(elementDTO.getPaddings(), blockPaddingsDTO2));
                        } else if (i11 == C7714v.P((List) m11.f71787a)) {
                            elementDTO.setPaddings(PaddingsDTOKt.addBottomAndHorizontal(elementDTO.getPaddings(), blockPaddingsDTO2));
                        } else {
                            elementDTO.setPaddings(PaddingsDTOKt.addHorizontal(elementDTO.getPaddings(), blockPaddingsDTO2));
                        }
                        i11 = i12;
                    }
                    if (!((Collection) m11.f71787a).isEmpty()) {
                        arrayList.add(arrayList.isEmpty() ? createBeginIslandSeparator() : IslandSeparatorWidgetParser.createIslandSeparator$default(this, null, null, 3, null));
                    }
                    arrayList.addAll((Collection) m11.f71787a);
                }
                pVar.endArray();
            } else {
                pVar.skipValue();
            }
        }
        pVar.endObject();
        if (!arrayList.isEmpty() && !AppTokensProvider.INSTANCE.isSelect(this.context)) {
            arrayList.add(createEndIslandSeparator());
        }
        return arrayList;
    }
}

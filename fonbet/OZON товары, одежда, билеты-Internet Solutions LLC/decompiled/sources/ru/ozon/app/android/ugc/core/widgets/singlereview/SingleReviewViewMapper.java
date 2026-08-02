package ru.ozon.app.android.ugc.core.widgets.singlereview;

import A00.a;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.R$layout;
import ru.ozon.app.android.ugc.core.widgets.singlereview.di.SingleReviewComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateButtonViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.updateKeys.ExpandBodyUpdate;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0!0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R,\u0010*\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/di/SingleReviewComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewDO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;", "<init>", "()V", "oldItem", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "bodySections", "mapBody", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;Ljava/util/List;)Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewMapper;", "mapper", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleReviewViewMapper extends WidgetViewMapper2<SingleReviewComponent, SingleReviewDO, SingleReviewVO> {
    private final int layout = R$layout.item_single_review;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ExpandBodyUpdate.class, TranslateButtonViewMapper.TranslatedUpdateKey.class);

    @NotNull
    private final Function2<View, ComposerReferences, SingleReviewViewHolder> holderProducer = new SingleReviewViewMapper$holderProducer$1(this);

    private final SingleReviewVO mapBody(SingleReviewVO oldItem, List<SingleReviewDTO.BodySectionDTO> bodySections) {
        SingleReviewMapper mapper = getMapper();
        List<TextAtom> vO$core_prodGoogleAllVendorsRelease = mapper.toVO$core_prodGoogleAllVendorsRelease(bodySections, oldItem.getContextQuestions(), oldItem.getMediaCentricHeader());
        ArrayList arrayList = null;
        List<TextAtom> makeCollapsedMessage$core_prodGoogleAllVendorsRelease = oldItem.getBodyCollapsedAtoms() != null ? mapper.makeCollapsedMessage$core_prodGoogleAllVendorsRelease(vO$core_prodGoogleAllVendorsRelease, oldItem.getReviewCollapseThreshold()) : null;
        List<TextAtom> list = vO$core_prodGoogleAllVendorsRelease;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(TextMapperKt.dsTextAtom$default((TextAtom) it.next(), null, null, null, null, null, null, null, null, null, null, null, true, 2047, null));
        }
        if (makeCollapsedMessage$core_prodGoogleAllVendorsRelease != null) {
            List<TextAtom> list2 = makeCollapsedMessage$core_prodGoogleAllVendorsRelease;
            arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(TextMapperKt.dsTextAtom$default((TextAtom) it2.next(), null, null, null, null, null, null, null, null, null, null, null, true, 2047, null));
            }
        }
        return SingleReviewVO.copy$default(oldItem, 0L, null, arrayList2, arrayList, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, 131059, null);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SingleReviewDO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SingleReviewViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SingleReviewComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SingleReviewComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SingleReviewMapper getMapper() {
        return component().mapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public SingleReviewVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SingleReviewVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((update instanceof ExpandBodyUpdate) && oldItem.getId() == ((ExpandBodyUpdate) update).getWidgetId()) {
            return SingleReviewVO.copy$default(oldItem, 0L, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, 131063, null);
        }
        if (update instanceof TranslateButtonViewMapper.TranslatedUpdateKey) {
            TranslateButtonViewMapper.TranslatedUpdateKey translatedUpdateKey = (TranslateButtonViewMapper.TranslatedUpdateKey) update;
            if (oldItem.getId() == translatedUpdateKey.getReviewId()) {
                return mapBody(oldItem, translatedUpdateKey.getAtoms());
            }
        }
        return oldItem;
    }
}

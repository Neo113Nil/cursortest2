package ru.ozon.app.android.storefront.stories.setContainer;

import A00.a;
import T7.E;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.events.StoriesUpdate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.domain.events.UpdateStoryViewed;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetContainerDTO;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetContainerVO;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.SetOfPreviewsVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\u000bJ'\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020+0*0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R.\u00100\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010)¨\u00063"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/SetContainerViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerDTO;", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;", "<init>", "()V", "Lru/ozon/app/android/common/events/StoriesUpdate;", "update", "updateViewed", "(Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;Lru/ozon/app/android/common/events/StoriesUpdate;)Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;", "Lru/ozon/app/android/storefront/domain/events/UpdateStoryViewed;", "(Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;Lru/ozon/app/android/storefront/domain/events/UpdateStoryViewed;)Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;", "", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonVoSet;", "setList", "", "viewedStoryId", "", "extractCloseScreenStoryPosition", "(Ljava/util/List;J)Ljava/lang/Integer;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;)Ljava/lang/Object;", "Lru/ozon/app/android/storefront/stories/setContainer/SetContainerMapper;", "mapper", "Lru/ozon/app/android/storefront/stories/setContainer/SetContainerMapper;", "getMapper", "()Lru/ozon/app/android/storefront/stories/setContainer/SetContainerMapper;", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetContainerVH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "SelectorState", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetContainerViewMapper extends WidgetViewMapper<SetContainerDTO, SetContainerVO> {

    @NotNull
    private final SetContainerMapper mapper = new SetContainerMapper();
    private final int layout = R$layout.widget_set_container;

    @NotNull
    private final Function2<View, ComposerReferences, SetContainerVH> holderProducer = SetContainerViewMapper$holderProducer$1.INSTANCE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(StoriesUpdate.class, SelectorState.class, UpdateStoryViewed.class);

    @NotNull
    private final Function2<a.J.InterfaceC0007a, SetContainerVO, SetContainerVO> updateConsumer = new SetContainerViewMapper$updateConsumer$1(this);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/SetContainerViewMapper$SelectorState;", "LA00/a$J$a;", "", "selected", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSelected", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectorState implements a.J.InterfaceC0007a {
        private final int selected;

        public SelectorState(int i11) {
            this.selected = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectorState) && this.selected == ((SelectorState) other).selected;
        }

        public final int getSelected() {
            return this.selected;
        }

        public int hashCode() {
            return Integer.hashCode(this.selected);
        }

        @NotNull
        public String toString() {
            return E.a(this.selected, "SelectorState(selected=", ")");
        }
    }

    private final Integer extractCloseScreenStoryPosition(List<? extends CommonVoSet> setList, long viewedStoryId) {
        Iterator<T> it = setList.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            CommonVoSet commonVoSet = (CommonVoSet) it.next();
            if (commonVoSet instanceof SetOfPreviewsVO) {
                Iterator<PreviewItemVO> it2 = ((SetOfPreviewsVO) commonVoSet).getPreviews().iterator();
                int i11 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    Long storyId = it2.next().getStoryId();
                    if (storyId != null && storyId.longValue() == viewedStoryId) {
                        break;
                    }
                    i11++;
                }
                Integer valueOf = Integer.valueOf(i11);
                Integer num = valueOf.intValue() != -1 ? valueOf : null;
                if (num != null) {
                    return Integer.valueOf(num.intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SetContainerVO updateViewed(SetContainerVO setContainerVO, StoriesUpdate storiesUpdate) {
        int closeScreenStoryPosition = storiesUpdate.getCloseScreenStoryPosition();
        List<CommonVoSet> setsList = setContainerVO.getSetsList();
        ArrayList arrayList = new ArrayList(C7714v.z(setsList, 10));
        for (CommonVoSet commonVoSet : setsList) {
            SetOfPreviewsVO setOfPreviewsVO = commonVoSet instanceof SetOfPreviewsVO ? (SetOfPreviewsVO) commonVoSet : null;
            if (setOfPreviewsVO != null) {
                List<PreviewItemVO> previews = ((SetOfPreviewsVO) commonVoSet).getPreviews();
                ArrayList arrayList2 = new ArrayList(C7714v.z(previews, 10));
                for (PreviewItemVO previewItemVO : previews) {
                    if (storiesUpdate.isStoryViewed(previewItemVO.getStoryId())) {
                        previewItemVO = PreviewItemVO.copy$default(previewItemVO, null, null, null, null, null, true, null, null, null, 479, null);
                    }
                    arrayList2.add(previewItemVO);
                }
                SetOfPreviewsVO copy$default = SetOfPreviewsVO.copy$default(setOfPreviewsVO, 0L, null, null, arrayList2, null, 23, null);
                if (copy$default != null) {
                    commonVoSet = copy$default;
                }
            }
            arrayList.add(commonVoSet);
        }
        return SetContainerVO.copy$default(setContainerVO, 0L, arrayList, closeScreenStoryPosition, 0, 9, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SetContainerVO>> mo614getHolderProducer() {
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

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, SetContainerVO, SetContainerVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SetContainerDTO, d, List<SetContainerVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull SetContainerVO oldItem, @NotNull SetContainerVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SetContainerVO updateViewed(SetContainerVO setContainerVO, UpdateStoryViewed updateStoryViewed) {
        Integer extractCloseScreenStoryPosition = extractCloseScreenStoryPosition(setContainerVO.getSetsList(), updateStoryViewed.getCloseStoryId());
        int intValue = extractCloseScreenStoryPosition != null ? extractCloseScreenStoryPosition.intValue() : setContainerVO.getCloseScreenStoryPosition();
        List<CommonVoSet> setsList = setContainerVO.getSetsList();
        ArrayList arrayList = new ArrayList(C7714v.z(setsList, 10));
        for (CommonVoSet commonVoSet : setsList) {
            SetOfPreviewsVO setOfPreviewsVO = commonVoSet instanceof SetOfPreviewsVO ? (SetOfPreviewsVO) commonVoSet : null;
            if (setOfPreviewsVO != null) {
                List<PreviewItemVO> previews = ((SetOfPreviewsVO) commonVoSet).getPreviews();
                ArrayList arrayList2 = new ArrayList(C7714v.z(previews, 10));
                for (PreviewItemVO previewItemVO : previews) {
                    if (C7714v.A(updateStoryViewed.getViewedStorySet(), previewItemVO.getStoryId())) {
                        previewItemVO = PreviewItemVO.copy$default(previewItemVO, null, null, null, null, null, true, null, null, null, 479, null);
                    }
                    arrayList2.add(previewItemVO);
                }
                SetOfPreviewsVO copy$default = SetOfPreviewsVO.copy$default(setOfPreviewsVO, 0L, null, null, arrayList2, null, 23, null);
                if (copy$default != null) {
                    commonVoSet = copy$default;
                }
            }
            arrayList.add(commonVoSet);
        }
        return SetContainerVO.copy$default(setContainerVO, 0L, arrayList, intValue, 0, 9, null);
    }
}

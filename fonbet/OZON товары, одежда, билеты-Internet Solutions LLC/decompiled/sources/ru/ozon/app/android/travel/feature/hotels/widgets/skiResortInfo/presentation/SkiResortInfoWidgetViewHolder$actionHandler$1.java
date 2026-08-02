package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SkiResortInfoWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ SkiResortInfoWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkiResortInfoWidgetViewHolder$actionHandler$1(SkiResortInfoWidgetViewHolder skiResortInfoWidgetViewHolder) {
        super(1);
        this.this$0 = skiResortInfoWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        String id2;
        SkiResortInfoViewModel skiResortInfoViewModel;
        String str;
        Object obj;
        SkiResortInfoVO.TrailsVO.MapVO map;
        ImageDTO image;
        Intrinsics.checkNotNullParameter(action, "action");
        SkiResortInfoVO boundData = this.this$0.getBoundData();
        if (boundData == null || (id2 = action.getId()) == null) {
            return;
        }
        SkiResortInfoWidgetViewHolder skiResortInfoWidgetViewHolder = this.this$0;
        if (!id2.equals("openGallery")) {
            skiResortInfoViewModel = skiResortInfoWidgetViewHolder.viewModel;
            skiResortInfoViewModel.onTabChanged(boundData.getTabs(), id2, new SkiResortInfoWidgetViewHolder$actionHandler$1$1$3(skiResortInfoWidgetViewHolder));
            return;
        }
        Iterator<T> it = boundData.getTopics().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((SkiResortInfoVO.TopicVO) obj).getId(), "Trails")) {
                    break;
                }
            }
        }
        SkiResortInfoVO.TopicVO topicVO = (SkiResortInfoVO.TopicVO) obj;
        if (topicVO != null) {
            SkiResortInfoVO.Content content = topicVO.getContent();
            SkiResortInfoVO.TrailsVO trailsVO = content instanceof SkiResortInfoVO.TrailsVO ? (SkiResortInfoVO.TrailsVO) content : null;
            if (trailsVO != null && (map = trailsVO.getMap()) != null && (image = map.getImage()) != null) {
                str = image.getImage();
            }
            if (str != null) {
                skiResortInfoWidgetViewHolder.openGallery(str);
            }
        }
    }
}

package ru.ozon.app.android.faq.data.model;

import Sc.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.faq.data.model.FaqVO$TopicVO$TopicItemVO;
import ru.ozon.app.android.faq.data.model.FaqWidgetDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"mapToVO", "", "Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO;", "Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic;", "widgetId", "", "faq_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaqVOKt {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<FaqVO$TopicVO$TopicItemVO> mapToVO(@NotNull FaqWidgetDTO.Topic topic, long j11) {
        c accordionVO;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(topic, "<this>");
        List<FaqWidgetDTO.Topic.Item> items = topic.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj3 : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FaqWidgetDTO.Topic.Item item = (FaqWidgetDTO.Topic.Item) obj3;
            long j12 = j11 + i11;
            if (item instanceof FaqWidgetDTO.Topic.Item.LinkItem) {
                OzonSpannableString title = i11 == 0 ? topic.getTitle() : null;
                FaqWidgetDTO.Topic.Item.LinkItem linkItem = (FaqWidgetDTO.Topic.Item.LinkItem) item;
                OzonSpannableString title2 = linkItem.getTitle();
                AtomActionDTO action = linkItem.getAction();
                AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, linkItem.getTrackingInfo()) : null;
                Map<String, TokenizedTrackingInfo> trackingInfo = linkItem.getTrackingInfo();
                accordionVO = new FaqVO$TopicVO$TopicItemVO.LinkItemVO(j12, title, title2, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j12), null, 2, null) : null, i11 != C7714v.P(topic.getItems()));
            } else {
                if (!(item instanceof FaqWidgetDTO.Topic.Item.Accordion)) {
                    throw new o();
                }
                OzonSpannableString title3 = i11 == 0 ? topic.getTitle() : null;
                FaqWidgetDTO.Topic.Item.Accordion accordion = (FaqWidgetDTO.Topic.Item.Accordion) item;
                OzonSpannableString question = accordion.getQuestion();
                List<Object> answer = accordion.getAnswer();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : answer) {
                    if (obj4 instanceof String) {
                        obj2 = new ImageDTO((String) obj4, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null);
                    } else if (obj4 instanceof AtomDTO) {
                        obj2 = (AtomDTO) obj4;
                    } else {
                        obj = null;
                        if (obj == null) {
                            arrayList2.add(obj);
                        }
                    }
                    obj = obj2;
                    if (obj == null) {
                    }
                }
                Map<String, TokenizedTrackingInfo> trackingInfo2 = accordion.getTrackingInfo();
                accordionVO = new FaqVO$TopicVO$TopicItemVO.AccordionVO(j12, title3, question, arrayList2, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j12), null, 2, null) : null, false, i11 != C7714v.P(topic.getItems()), 32, null);
            }
            arrayList.add(accordionVO);
            i11 = i12;
        }
        return arrayList;
    }
}

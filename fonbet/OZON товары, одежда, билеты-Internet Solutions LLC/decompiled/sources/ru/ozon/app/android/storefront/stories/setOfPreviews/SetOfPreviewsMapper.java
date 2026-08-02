package ru.ozon.app.android.storefront.stories.setOfPreviews;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetType;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.SetOfPreviewsDTO;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.SetOfPreviewsVO;
import ru.ozon.app.android.storefront.stories.story.data.Alignment;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u000f\u001a\u00020\u0005*\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/SetOfPreviewsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO$PreviewItemDTO;", "", "widgetId", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;", "type", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", "toVO", "(Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO$PreviewItemDTO;JLru/ozon/app/android/storefront/stories/setContainer/data/SetType;)Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "default", "parseAlignment", "(Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/Alignment;)Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO;Ll20/d;)Ljava/util/List;", "(Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO;)Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsVO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetOfPreviewsMapper implements Function2<SetOfPreviewsDTO, d, List<? extends SetOfPreviewsVO>> {
    private final Alignment parseAlignment(String value, Alignment r42) {
        if (value != null) {
            int hashCode = value.hashCode();
            if (hashCode != -1383228885) {
                if (hashCode != -1364013995) {
                    if (hashCode == 115029 && value.equals("top")) {
                        return Alignment.TOP;
                    }
                } else if (value.equals(RichContentDTO.ALIGN_CENTER)) {
                    return Alignment.CENTER;
                }
            } else if (value.equals("bottom")) {
                return Alignment.BOTTOM;
            }
        }
        return r42;
    }

    @NotNull
    public final SetOfPreviewsVO toVO(@NotNull SetOfPreviewsDTO setOfPreviewsDTO) {
        Intrinsics.checkNotNullParameter(setOfPreviewsDTO, "<this>");
        long hashCode = setOfPreviewsDTO.hashCode();
        long hashCode2 = setOfPreviewsDTO.hashCode();
        String title = setOfPreviewsDTO.getTitle();
        String subtitle = setOfPreviewsDTO.getSubtitle();
        List<SetOfPreviewsDTO.PreviewItemDTO> items = setOfPreviewsDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((SetOfPreviewsDTO.PreviewItemDTO) it.next(), hashCode, setOfPreviewsDTO.getType()));
        }
        return new SetOfPreviewsVO(hashCode2, title, subtitle, arrayList, null, 16, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SetOfPreviewsVO> invoke(@NotNull SetOfPreviewsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state));
    }

    private final PreviewItemVO toVO(SetOfPreviewsDTO.PreviewItemDTO previewItemDTO, long j11, SetType setType) {
        Long storyId = previewItemDTO.getStoryId();
        String image = previewItemDTO.getImage();
        String firstFullImage = previewItemDTO.getFirstFullImage();
        if (firstFullImage == null) {
            firstFullImage = "";
        }
        String str = firstFullImage;
        Alignment parseAlignment = parseAlignment(previewItemDTO.getFirstFullImageAlign(), Alignment.CENTER);
        boolean hideFrame = previewItemDTO.getHideFrame();
        AtomActionDTO action = previewItemDTO.getAction();
        String link = action != null ? action.getLink() : null;
        AtomActionDTO action2 = previewItemDTO.getAction();
        AtomAction atomAction = action2 != null ? AtomActionMapperKt.toAtomAction(action2, previewItemDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = previewItemDTO.getTrackingInfo();
        return new PreviewItemVO(storyId, image, str, parseAlignment, link, hideFrame, setType, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}

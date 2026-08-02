package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.Grid3VO$Grid3ItemVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u0000 02*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u00010B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u000f*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u0003j\u0002`\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!JQ\u0010&\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-¨\u00061"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/core/UniversalObjectGrid3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO$ObjectGrid3NewItemDTO;", "", "isBottomRounded", "isTextInsideCard", "", "index", "size", "getPaddingBottom", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO$ObjectGrid3NewItemDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;II)I", "getPaddingLeft", "(I)I", "getPaddingRight", "isTopRounded", "getPaddingTop", "(Ljava/lang/Boolean;I)I", "Landroid/graphics/drawable/ShapeDrawable;", "createRoundRectShape", "(Ljava/lang/Boolean;Ljava/lang/Boolean;II)Landroid/graphics/drawable/ShapeDrawable;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;Ll20/d;)Ljava/util/List;", "", "widgetId", "", "backgroundColor", "toVO", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO$ObjectGrid3NewItemDTO;JLjava/lang/Boolean;Ljava/lang/Boolean;IILjava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;", "Landroid/content/Context;", "", "radius", "F", "paddingForRounding", "I", "leftRightMargin", "intermediateMargin", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectGrid3Mapper implements Function2<UniversalWidgetDTO, d, List<? extends Grid3VO$Grid3ItemVO>> {

    @NotNull
    private final Context context;
    private final int intermediateMargin;
    private final int leftRightMargin;
    private final int paddingForRounding;
    private final float radius;

    public UniversalObjectGrid3Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.radius = UiExtKt.toPxF(24);
        this.paddingForRounding = ResourceExtKt.toPx(12);
        this.leftRightMargin = ResourceExtKt.toPx(16);
        this.intermediateMargin = ResourceExtKt.toPx(4);
    }

    private final ShapeDrawable createRoundRectShape(Boolean isTopRounded, Boolean isBottomRounded, int index, int size) {
        float f7;
        float f11;
        float f12;
        float f13;
        if (index != 0) {
            if (index == 2 && Intrinsics.d(isTopRounded, Boolean.TRUE)) {
                f11 = this.radius;
                f7 = 0.0f;
            }
            f7 = 0.0f;
            f11 = 0.0f;
        } else {
            if (Intrinsics.d(isTopRounded, Boolean.TRUE)) {
                f7 = this.radius;
                f11 = 0.0f;
            }
            f7 = 0.0f;
            f11 = 0.0f;
        }
        if (index == size - 3) {
            if (Intrinsics.d(isBottomRounded, Boolean.TRUE)) {
                f13 = this.radius;
                f12 = 0.0f;
            }
            f13 = 0.0f;
            f12 = 0.0f;
        } else {
            if (index == size - 1 && Intrinsics.d(isBottomRounded, Boolean.TRUE)) {
                f12 = this.radius;
                f13 = 0.0f;
            }
            f13 = 0.0f;
            f12 = 0.0f;
        }
        if (f7 == 0.0f && f13 == 0.0f && f11 == 0.0f && f12 == 0.0f) {
            return null;
        }
        return new ShapeDrawable(new RoundRectShape(new float[]{f7, f7, f11, f11, f12, f12, f13, f13}, null, null));
    }

    private final int getPaddingBottom(UniversalWidgetDTO.ObjectGrid3NewDTO.ObjectGrid3NewItemDTO objectGrid3NewItemDTO, Boolean bool, Boolean bool2, int i11, int i12) {
        Boolean bool3 = Boolean.TRUE;
        return ((!Intrinsics.d(bool, bool3) || i11 < i12 + (-3)) ? 0 : this.paddingForRounding) + ((Intrinsics.d(bool2, bool3) || (objectGrid3NewItemDTO.getTitle() == null && objectGrid3NewItemDTO.getSubtitle() == null)) ? this.intermediateMargin : this.paddingForRounding);
    }

    private final int getPaddingLeft(int index) {
        int i11 = index % 3;
        if (i11 == 0) {
            return this.leftRightMargin;
        }
        if (i11 == 2) {
            return 0;
        }
        return this.intermediateMargin * 2;
    }

    private final int getPaddingRight(int index) {
        int i11 = index % 3;
        if (i11 == 0) {
            return 0;
        }
        return i11 == 2 ? this.leftRightMargin : this.intermediateMargin * 2;
    }

    private final int getPaddingTop(Boolean isTopRounded, int index) {
        return this.intermediateMargin + ((!Intrinsics.d(isTopRounded, Boolean.TRUE) || index >= 3) ? 0 : this.paddingForRounding);
    }

    @NotNull
    public final Grid3VO$Grid3ItemVO toVO(@NotNull UniversalWidgetDTO.ObjectGrid3NewDTO.ObjectGrid3NewItemDTO objectGrid3NewItemDTO, long j11, Boolean bool, Boolean bool2, int i11, int i12, String str, Boolean bool3) {
        ImageDTO mapImage;
        ImageDTO createBlurImage;
        Intrinsics.checkNotNullParameter(objectGrid3NewItemDTO, "<this>");
        Boolean isAdult = objectGrid3NewItemDTO.isAdult();
        boolean booleanValue = isAdult != null ? isAdult.booleanValue() : false;
        mapImage = UniversalGrid3MapperKt.mapImage(objectGrid3NewItemDTO.getImage());
        createBlurImage = UniversalGrid3MapperKt.createBlurImage(objectGrid3NewItemDTO.getImage(), booleanValue, objectGrid3NewItemDTO.getBlurPlaceholderImage());
        TextDTO title = objectGrid3NewItemDTO.getTitle();
        TextDTO subtitle = objectGrid3NewItemDTO.getSubtitle();
        BadgeDTO adBadge = objectGrid3NewItemDTO.getAdBadge();
        AtomActionDTO action = objectGrid3NewItemDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, objectGrid3NewItemDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = objectGrid3NewItemDTO.getTrackingInfo();
        return new Grid3VO$Grid3ItemVO(j11, booleanValue, booleanValue, mapImage, createBlurImage, title, subtitle, adBadge, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, createRoundRectShape(bool, bool2, i11, i12), getPaddingTop(bool, i11), getPaddingBottom(objectGrid3NewItemDTO, bool2, bool3, i11, i12), getPaddingLeft(i11), getPaddingRight(i11), str);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Grid3VO$Grid3ItemVO> invoke(@NotNull UniversalWidgetDTO dto, @NotNull d widgetInfo) {
        List<UniversalWidgetDTO.ObjectGrid3NewDTO.ObjectGrid3NewItemDTO> items;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        UniversalWidgetDTO.ObjectGrid3NewDTO objectGrid3New = dto.getObjectGrid3New();
        if (objectGrid3New == null || (items = objectGrid3New.getItems()) == null) {
            return K.f71697a;
        }
        List<UniversalWidgetDTO.ObjectGrid3NewDTO.ObjectGrid3NewItemDTO> list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((UniversalWidgetDTO.ObjectGrid3NewDTO.ObjectGrid3NewItemDTO) obj, r6.hashCode(), objectGrid3New.isTopRounded(), objectGrid3New.isBottomRounded(), i11, items.size(), objectGrid3New.getBackgroundColor(), objectGrid3New.isTextInsideCard()));
            i11 = i12;
        }
        return arrayList;
    }
}

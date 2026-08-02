package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation;

import A00.a;
import Xc.b;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CourierTipsDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdone.R$layout;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001/B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R2\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/di/CourierTipsComponent;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CourierTipsDTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;)Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsMapper;", "mapper", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsMapper;", "getMapper", "()Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsMapper;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "CourierTipsPayloads", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CourierTipsViewMapper extends WidgetViewMapper2<CourierTipsComponent, CourierTipsDTO, CourierTipsVO> {
    private final int layout = R$layout.widget_courier_tips;

    @NotNull
    private final CourierTipsMapper mapper = new CourierTipsMapper();

    @NotNull
    private final Function2<View, ComposerReferences, k<CourierTipsVO>> holderProducer = new CourierTipsViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(CourierTipsVO.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewMapper$CourierTipsPayloads;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "BADGE", "SUBTITLE", "CHECKBOX", "BUTTON", "INFO_BUTTON", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class CourierTipsPayloads {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ CourierTipsPayloads[] $VALUES;
        public static final CourierTipsPayloads TITLE = new CourierTipsPayloads(SelectionItemDescriptionDTO.TITLE, 0);
        public static final CourierTipsPayloads BADGE = new CourierTipsPayloads("BADGE", 1);
        public static final CourierTipsPayloads SUBTITLE = new CourierTipsPayloads("SUBTITLE", 2);
        public static final CourierTipsPayloads CHECKBOX = new CourierTipsPayloads("CHECKBOX", 3);
        public static final CourierTipsPayloads BUTTON = new CourierTipsPayloads("BUTTON", 4);
        public static final CourierTipsPayloads INFO_BUTTON = new CourierTipsPayloads("INFO_BUTTON", 5);

        private static final /* synthetic */ CourierTipsPayloads[] $values() {
            return new CourierTipsPayloads[]{TITLE, BADGE, SUBTITLE, CHECKBOX, BUTTON, INFO_BUTTON};
        }

        static {
            CourierTipsPayloads[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CourierTipsPayloads(String str, int i11) {
        }

        public static CourierTipsPayloads valueOf(String str) {
            return (CourierTipsPayloads) Enum.valueOf(CourierTipsPayloads.class, str);
        }

        public static CourierTipsPayloads[] values() {
            return (CourierTipsPayloads[]) $VALUES.clone();
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CourierTipsVO>> mo614getHolderProducer() {
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
    public C7473e<CourierTipsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CourierTipsComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CourierTipsMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull CourierTipsVO oldItem, @NotNull CourierTipsVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(CourierTipsPayloads.TITLE);
        }
        if (!Intrinsics.d(oldItem.getBadge(), newItem.getBadge())) {
            arrayList.add(CourierTipsPayloads.BADGE);
        }
        if (!Intrinsics.d(oldItem.getSubtitle(), newItem.getSubtitle())) {
            arrayList.add(CourierTipsPayloads.SUBTITLE);
        }
        if (!Intrinsics.d(oldItem.getCheckbox(), newItem.getCheckbox())) {
            arrayList.add(CourierTipsPayloads.CHECKBOX);
        }
        if (!Intrinsics.d(oldItem.getButton(), newItem.getButton())) {
            arrayList.add(CourierTipsPayloads.BUTTON);
        }
        if (!Intrinsics.d(oldItem.getInfoButton(), newItem.getInfoButton())) {
            arrayList.add(CourierTipsPayloads.INFO_BUTTON);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public CourierTipsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CourierTipsVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof CourierTipsVO)) {
            return null;
        }
        CourierTipsVO courierTipsVO = (CourierTipsVO) update;
        if (courierTipsVO.getId() == oldItem.getId()) {
            return CourierTipsVO.copy$default(oldItem, 0L, courierTipsVO.getTitle(), courierTipsVO.getBadge(), courierTipsVO.getSubtitle(), courierTipsVO.getVariants(), courierTipsVO.getCheckbox(), null, courierTipsVO.getTokenizedEvent(), courierTipsVO.getButton(), courierTipsVO.getInfoButton(), 65, null);
        }
        return null;
    }
}

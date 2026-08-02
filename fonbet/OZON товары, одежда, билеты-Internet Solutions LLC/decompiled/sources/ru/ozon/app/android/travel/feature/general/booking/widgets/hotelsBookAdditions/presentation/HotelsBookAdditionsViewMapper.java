package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation;

import A00.a;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.data.HotelsBookAdditionsDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.di.HotelsBookAdditionsComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.update.HotelsBookAdditionsUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.view.HotelsBookAdditionsView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R,\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R0\u00101\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060.j\u0002`/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010'¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/di/HotelsBookAdditionsComponent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "newItem", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewMapper$Payload;", "getPayload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/update/HotelsBookAdditionsUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "Payload", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsBookAdditionsViewMapper extends WidgetViewMapper2<HotelsBookAdditionsComponent, HotelsBookAdditionsDTO, HotelsBookAdditionsVO> {
    private final Integer layout;

    @NotNull
    private final Function2<View, ComposerReferences, HotelsBookAdditionsWidgetViewHolder> holderProducer = new HotelsBookAdditionsViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<HotelsBookAdditionsUpdate>> supportedUpdates = C7714v.a0(HotelsBookAdditionsUpdate.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewMapper$Payload;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "FIELDS", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Payload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload EXPANDED = new Payload("EXPANDED", 0);
        public static final Payload COLLAPSED = new Payload("COLLAPSED", 1);
        public static final Payload FIELDS = new Payload("FIELDS", 2);

        private static final /* synthetic */ Payload[] $values() {
            return new Payload[]{EXPANDED, COLLAPSED, FIELDS};
        }

        static {
            Payload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Payload(String str, int i11) {
        }

        public static Payload valueOf(String str) {
            return (Payload) Enum.valueOf(Payload.class, str);
        }

        public static Payload[] values() {
            return (Payload[]) $VALUES.clone();
        }
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsBookAdditionsView hotelsBookAdditionsView = new HotelsBookAdditionsView(context, null, 0, 0, 14, null);
        hotelsBookAdditionsView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = hotelsBookAdditionsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        hotelsBookAdditionsView.setPadding(px, px, px, px);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context3 = hotelsBookAdditionsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context3, R$attr.layerFloor1);
        Context context4 = hotelsBookAdditionsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        hotelsBookAdditionsView.setBackground(roundedBackgroundProducer.produce(themeColor, ResourceExtKt.toPxF(24, context4)));
        return hotelsBookAdditionsView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, HotelsBookAdditionsWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsBookAdditionsDTO, d, List<HotelsBookAdditionsVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<HotelsBookAdditionsUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsBookAdditionsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsBookAdditionsComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<Payload> getPayload(@NotNull HotelsBookAdditionsVO oldItem, @NotNull HotelsBookAdditionsVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (oldItem.getIsOpen() != newItem.getIsOpen()) {
            arrayList.add(newItem.getIsOpen() ? Payload.EXPANDED : Payload.COLLAPSED);
        }
        if (newItem.getIsOpen() && !CollectionExtKt.deepEquals(oldItem.getFields(), newItem.getFields())) {
            arrayList.add(Payload.FIELDS);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotelsBookAdditionsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsBookAdditionsVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof HotelsBookAdditionsUpdate)) {
            return null;
        }
        HotelsBookAdditionsUpdate hotelsBookAdditionsUpdate = (HotelsBookAdditionsUpdate) update;
        Boolean isOpen = hotelsBookAdditionsUpdate.getIsOpen();
        boolean booleanValue = isOpen != null ? isOpen.booleanValue() : oldItem.getIsOpen();
        List<HotelsBookAdditionsVO.FieldVO> fields = hotelsBookAdditionsUpdate.getFields();
        if (fields == null) {
            fields = oldItem.getFields();
        }
        return HotelsBookAdditionsVO.copy$default(oldItem, 0L, null, null, null, null, booleanValue, fields, null, 159, null);
    }
}

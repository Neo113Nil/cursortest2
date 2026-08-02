package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation;

import A00.a;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data.AddHotelGuestsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.di.AddHotelGuestsV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.update.AddHotelGuestsV5Update;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.update.ResetScrollFlagUpdate;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.view.AddHotelGuestsV5RoomView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.scroller.ScrollToFieldUpdate;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R,\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070-0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R0\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u000602j\u0002`3\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010,¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/di/AddHotelGuestsV5Component;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;)Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5Decoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "newItem", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewMapper$Payload;", "getPayload", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "Payload", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddHotelGuestsV5ViewMapper extends WidgetViewMapper2<AddHotelGuestsV5Component, AddHotelGuestsV5DTO, AddHotelGuestsV5VO> {
    private final Integer layout;

    @NotNull
    private final Function2<View, ComposerReferences, AddHotelGuestsV5WidgetViewHolder> holderProducer = new AddHotelGuestsV5ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(AddHotelGuestsV5Update.class, ScrollToFieldUpdate.class, ResetScrollFlagUpdate.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewMapper$Payload;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "SUBTITLE", "FORMS", "BUTTON", "DISCLAIMER", "SCROLL", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Payload {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload TITLE = new Payload(SelectionItemDescriptionDTO.TITLE, 0);
        public static final Payload SUBTITLE = new Payload("SUBTITLE", 1);
        public static final Payload FORMS = new Payload("FORMS", 2);
        public static final Payload BUTTON = new Payload("BUTTON", 3);
        public static final Payload DISCLAIMER = new Payload("DISCLAIMER", 4);
        public static final Payload SCROLL = new Payload("SCROLL", 5);

        private static final /* synthetic */ Payload[] $values() {
            return new Payload[]{TITLE, SUBTITLE, FORMS, BUTTON, DISCLAIMER, SCROLL};
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
        AddHotelGuestsV5RoomView addHotelGuestsV5RoomView = new AddHotelGuestsV5RoomView(context, null, 0, 0, 14, null);
        addHotelGuestsV5RoomView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = addHotelGuestsV5RoomView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        addHotelGuestsV5RoomView.setPadding(px, px, px, px);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context3 = addHotelGuestsV5RoomView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context3, R$attr.layerFloor1);
        Context context4 = addHotelGuestsV5RoomView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        addHotelGuestsV5RoomView.setBackground(roundedBackgroundProducer.produce(themeColor, ResourceExtKt.toPxF(24, context4)));
        return addHotelGuestsV5RoomView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<AddHotelGuestsV5Decoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new AddHotelGuestsV5Decoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AddHotelGuestsV5WidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddHotelGuestsV5DTO, d, List<AddHotelGuestsV5VO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AddHotelGuestsV5Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AddHotelGuestsV5Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<Payload> getPayload(@NotNull AddHotelGuestsV5VO oldItem, @NotNull AddHotelGuestsV5VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(Payload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getSubtitle(), newItem.getSubtitle())) {
            arrayList.add(Payload.SUBTITLE);
        }
        if (!CollectionExtKt.deepEquals(oldItem.getForms(), newItem.getForms())) {
            arrayList.add(Payload.FORMS);
        }
        if (!Intrinsics.d(oldItem.getAddGuestButton(), newItem.getAddGuestButton()) || oldItem.getIsAddGuestButtonVisible() != newItem.getIsAddGuestButtonVisible()) {
            arrayList.add(Payload.BUTTON);
        }
        if (!Intrinsics.d(oldItem.getDisclaimer(), newItem.getDisclaimer())) {
            arrayList.add(Payload.DISCLAIMER);
        }
        if (oldItem.getIsNeedScroll() != newItem.getIsNeedScroll()) {
            arrayList.add(Payload.SCROLL);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public AddHotelGuestsV5VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddHotelGuestsV5VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof AddHotelGuestsV5Update) {
            AddHotelGuestsV5Update addHotelGuestsV5Update = (AddHotelGuestsV5Update) update;
            if (oldItem.getRoomId() == addHotelGuestsV5Update.getRoomId()) {
                List<AddHotelGuestsV5VO.GuestFormVO> forms = addHotelGuestsV5Update.getForms();
                Boolean isAddGuestButtonVisible = addHotelGuestsV5Update.getIsAddGuestButtonVisible();
                return AddHotelGuestsV5VO.copy$default(oldItem, 0L, null, 0, null, null, forms, null, isAddGuestButtonVisible != null ? isAddGuestButtonVisible.booleanValue() : oldItem.getIsAddGuestButtonVisible(), null, null, false, 1375, null);
            }
        }
        if ((update instanceof ScrollToFieldUpdate) && Intrinsics.d(((ScrollToFieldUpdate) update).getScrollWidgetKey(), oldItem.getScrollWidgetKey())) {
            return AddHotelGuestsV5VO.copy$default(oldItem, 0L, null, 0, null, null, null, null, false, null, null, true, 1023, null);
        }
        if (update instanceof ResetScrollFlagUpdate) {
            return AddHotelGuestsV5VO.copy$default(oldItem, 0L, null, 0, null, null, null, null, false, null, null, false, 1023, null);
        }
        return null;
    }
}

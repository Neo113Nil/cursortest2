package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.ServiceVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020*R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5ServiceView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "onClickListener", "dp2", "", "dp4", "hotelsRoomsListIconIv", "Lru/ozon/uni/android/atom/icon/IconView;", "getHotelsRoomsListIconIv", "()Lru/ozon/uni/android/atom/icon/IconView;", "hotelsRoomsListIconIv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "hotelsRoomsListTitleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getHotelsRoomsListTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "hotelsRoomsListTitleTav$delegate", "hotelsRoomsListInfoIbv", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getHotelsRoomsListInfoIbv", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "hotelsRoomsListInfoIbv$delegate", "hotelsRoomsListSaleBv", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getHotelsRoomsListSaleBv", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "hotelsRoomsListSaleBv$delegate", "bind", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ServiceVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5ServiceView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsRoomsListV5ServiceView.class, "hotelsRoomsListIconIv", "getHotelsRoomsListIconIv()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(HotelsRoomsListV5ServiceView.class, "hotelsRoomsListTitleTav", "getHotelsRoomsListTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsRoomsListV5ServiceView.class, "hotelsRoomsListInfoIbv", "getHotelsRoomsListInfoIbv()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0), C2438a.c(HotelsRoomsListV5ServiceView.class, "hotelsRoomsListSaleBv", "getHotelsRoomsListSaleBv()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable = 8;
    private final int dp2;
    private final int dp4;

    /* renamed from: hotelsRoomsListIconIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListIconIv;

    /* renamed from: hotelsRoomsListInfoIbv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListInfoIbv;

    /* renamed from: hotelsRoomsListSaleBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListSaleBv;

    /* renamed from: hotelsRoomsListTitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListTitleTav;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final Function1<AtomAction, Unit> onClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsListV5ServiceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onClickListener = new HotelsRoomsListV5ServiceView$onClickListener$1(this);
        this.dp2 = UiExtKt.toPx(2, context);
        this.dp4 = UiExtKt.toPx(4, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.hotelsRoomsListIconIv = new PreCreationViewPoolDelegate(context2, N.b(IconView.class), new HotelsRoomsListV5ServiceView$special$$inlined$preCreationViewPool$default$1(this), new HotelsRoomsListV5ServiceView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.hotelsRoomsListTitleTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new HotelsRoomsListV5ServiceView$special$$inlined$preCreationViewPool$default$3(this), new HotelsRoomsListV5ServiceView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.hotelsRoomsListInfoIbv = new PreCreationViewPoolDelegate(context4, N.b(IconButtonV3View.class), new HotelsRoomsListV5ServiceView$special$$inlined$preCreationViewPool$default$5(this), new HotelsRoomsListV5ServiceView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.hotelsRoomsListSaleBv = new PreCreationViewPoolDelegate(context5, N.b(BadgeView.class), new HotelsRoomsListV5ServiceView$special$$inlined$preCreationViewPool$default$7(this), new HotelsRoomsListV5ServiceView$special$$inlined$preCreationViewPool$default$8(this));
        setOrientation(0);
        addView(getHotelsRoomsListIconIv());
        addView(getHotelsRoomsListTitleTav());
        addView(getHotelsRoomsListInfoIbv());
        addView(getHotelsRoomsListSaleBv());
    }

    private final IconView getHotelsRoomsListIconIv() {
        return (IconView) this.hotelsRoomsListIconIv.getValue(this, $$delegatedProperties[0]);
    }

    private final IconButtonV3View getHotelsRoomsListInfoIbv() {
        return (IconButtonV3View) this.hotelsRoomsListInfoIbv.getValue(this, $$delegatedProperties[2]);
    }

    private final BadgeView getHotelsRoomsListSaleBv() {
        return (BadgeView) this.hotelsRoomsListSaleBv.getValue(this, $$delegatedProperties[3]);
    }

    private final TextAtomV2View getHotelsRoomsListTitleTav() {
        return (TextAtomV2View) this.hotelsRoomsListTitleTav.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(@NotNull ServiceVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bind$default(getHotelsRoomsListIconIv(), item.getIcon(), null, 2, null);
        TextHolderKt.bind$default(getHotelsRoomsListTitleTav(), item.getText(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(getHotelsRoomsListInfoIbv(), item.getInfoButton(), this.onClickListener);
        BadgeHolderKt.bindOrGone(getHotelsRoomsListSaleBv(), item.getSaleBadge(), this.onClickListener);
    }

    public final Function1<AtomAction, Unit> getOnAction() {
        return this.onAction;
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }
}

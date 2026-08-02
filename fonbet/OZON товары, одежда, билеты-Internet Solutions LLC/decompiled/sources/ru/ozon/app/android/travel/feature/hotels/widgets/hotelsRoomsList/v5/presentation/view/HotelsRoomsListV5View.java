package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import Am.C2438a;
import BS.a;
import BS.b;
import De.s;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.D;
import androidx.lifecycle.H;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.HotelsRoomsListV5RoomVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.ImageVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.Placeholder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffLayoutCache;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.HotelsRoomsListV5HorizontalItemDecoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.images.HotelsRoomsListV5ImagesAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.images.HotelsRoomsListV5ImagesItemDecoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.roomBadges.HotelsRoomsListV5RoomBadgesAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.tariffs.HotelsRoomsListV5TariffsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5View;
import ru.ozon.app.android.travel.molecules.view.indicator.DottedIndicatorView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.fontScaleProvider.FontScaleProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\"\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001d2\u0006\u0010&\u001a\u00020 ¢\u0006\u0004\b'\u0010#J)\u0010-\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n0*¢\u0006\u0004\b-\u0010.J5\u00101\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010$2\b\u00100\u001a\u0004\u0018\u00010+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n0*¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020(0\u001d2\u0006\u00104\u001a\u00020 ¢\u0006\u0004\b5\u0010#J#\u00108\u001a\u00020\n2\f\u00106\u001a\b\u0012\u0004\u0012\u00020$0\u001d2\u0006\u00107\u001a\u00020 ¢\u0006\u0004\b8\u0010#J+\u0010:\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010$2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n0*¢\u0006\u0004\b:\u0010;J7\u0010C\u001a\u00020\n2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001d2\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010B\u001a\u00020 ¢\u0006\u0004\bC\u0010DJ+\u0010G\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010E2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n0*¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bM\u0010LJ%\u0010C\u001a\u00020\n2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001d2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bC\u0010NJ%\u0010O\u001a\u00020\n2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001d2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bO\u0010NJ\u0017\u0010Q\u001a\u00020 2\u0006\u0010P\u001a\u00020@H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\n2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bW\u0010LJ\u0019\u0010X\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bX\u0010LJ\u0019\u0010Y\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bY\u0010LJ\u0019\u0010Z\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bZ\u0010LR\u0014\u0010[\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u0014\u0010^\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\\R\u0014\u0010_\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\\R\u0014\u0010`\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010\\R\u0014\u0010a\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\\R\u0014\u0010b\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\\R\u0014\u0010c\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010\\R\u001e\u0010e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010iR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001b\u0010y\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001d\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b~\u0010v\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0087\u0001\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010v\u001a\u0005\b\u0086\u0001\u0010xR\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u008b\u0001\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010pR\u0016\u0010\u008c\u0001\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010pR\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0094\u0001\u001a\u00030\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010v\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0007\u0010\u0095\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0096\u0001R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u0097\u0001R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010\u0098\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u009c\u0001\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010\\R\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R'\u0010ª\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001¨\u0006«\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesAdapter;", "imagesAdapter", "Landroidx/recyclerview/widget/RecyclerView$u;", "recyclerViewPool", "", "setImageAdapter", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesAdapter;Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "accommodationAdapter", "setAccommodationAdapter", "(Lru/ozon/uni/atoms/af/AtomsAdapter;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/roomBadges/HotelsRoomsListV5RoomBadgesAdapter;", "roomBadgesAdapter", "setRoomBadgesAdapter", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/roomBadges/HotelsRoomsListV5RoomBadgesAdapter;Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsAdapter;", "tariffsAdapter", "setTariffsAdapter", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsAdapter;)V", "Lru/ozon/app/android/travel/utils/fontScaleProvider/FontScaleProvider;", "fontScaleProvider", "setFontScaleProvider", "(Lru/ozon/app/android/travel/utils/fontScaleProvider/FontScaleProvider;)V", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;", "images", "", "payloadBind", "bindImages", "(Ljava/util/List;Z)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "tags", "areTagsVisible", "bindTags", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindName", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lkotlin/jvm/functions/Function1;)V", "detailBadge", "action", "bindDetailBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;)V", "accommodation", "areAccommodationVisible", "bindAccommodation", "roomBadges", "areRoomBadgesVisible", "bindRoomBadges", "roomsLeftBadge", "bindRoomsLeftBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffVO;", "tariffs", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffLayoutCache;", "tariffLayoutCache", "isLoaderVisible", "bindTariffs", "(Ljava/util/List;Landroidx/lifecycle/v;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffLayoutCache;Z)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "bindButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomVO;", "boundData", "onAttach", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomVO;)V", "onDetach", "(Ljava/util/List;Landroidx/lifecycle/v;)V", "checkOthersCardsHeight", "cache", "isCachedSizeValid", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffLayoutCache;)Z", "", "newHeight", "updateTariffHeight", "(I)V", "saveLayoutManagerState", "restoreLayoutManagersState", "saveHighlightedDotPosition", "restoreHighlightedDotPosition", "dp2", "I", "dp4", "dp6", "dp8", "dp10", "dp12", "dp14", "dp16", "Lkotlin/Function0;", "detailsClick", "Lkotlin/jvm/functions/Function0;", "Landroidx/recyclerview/widget/RecyclerView$o;", "imagesLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$o;", "roomBadgesLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "tariffsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "hotelsRoomsListImagesRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "hotelsRoomsListIndicatorDiv", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "hotelsRoomsListRoomsLeftBadgeBv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getHotelsRoomsListRoomsLeftBadgeBv", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "hotelsRoomsListRoomsLeftBadgeBv", "Lcom/google/android/flexbox/FlexboxLayout;", "hotelsRoomsListTagsFl", "Lcom/google/android/flexbox/FlexboxLayout;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "hotelsRoomsListNameTav$delegate", "getHotelsRoomsListNameTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "hotelsRoomsListNameTav", "Landroid/view/View;", "clickableArea", "Landroid/view/View;", "hotelsRoomsListDetailsBv$delegate", "getHotelsRoomsListDetailsBv", "hotelsRoomsListDetailsBv", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "hotelsRoomsListAccommodationVal", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "hotelsRoomsListRoomBadgesRv", "hotelsRoomsListTariffsRv", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5TariffView;", "hotelsRoomsListMeasureTariff", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5TariffView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "hotelsRoomsListButton$delegate", "getHotelsRoomsListButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "hotelsRoomsListButton", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/roomBadges/HotelsRoomsListV5RoomBadgesAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsAdapter;", "", "fontScale", "Ljava/lang/Float;", "densityDpi", "Landroid/os/Handler;", "instanceRestorationHandler", "Landroid/os/Handler;", "Lxe/B0;", "heightCalculationJob", "Lxe/B0;", "maxTariffLayoutCache", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffLayoutCache;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/Placeholder;", "tariffsPlaceholders$delegate", "LSc/j;", "getTariffsPlaceholders", "()Ljava/util/List;", "tariffsPlaceholders", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5View extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsRoomsListV5View.class, "hotelsRoomsListRoomsLeftBadgeBv", "getHotelsRoomsListRoomsLeftBadgeBv()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsRoomsListV5View.class, "hotelsRoomsListNameTav", "getHotelsRoomsListNameTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsRoomsListV5View.class, "hotelsRoomsListDetailsBv", "getHotelsRoomsListDetailsBv()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsRoomsListV5View.class, "hotelsRoomsListButton", "getHotelsRoomsListButton()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    public static final int $stable = 8;
    private AtomsAdapter accommodationAdapter;

    @NotNull
    private final View clickableArea;
    private final int densityDpi;
    private Function0<Unit> detailsClick;
    private final int dp10;
    private final int dp12;
    private final int dp14;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int dp6;
    private final int dp8;
    private Float fontScale;
    private B0 heightCalculationJob;

    @NotNull
    private final VerticalAtomsLayout hotelsRoomsListAccommodationVal;

    /* renamed from: hotelsRoomsListButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListButton;

    /* renamed from: hotelsRoomsListDetailsBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListDetailsBv;

    @NotNull
    private final RecyclerView hotelsRoomsListImagesRv;

    @NotNull
    private final DottedIndicatorView hotelsRoomsListIndicatorDiv;

    @NotNull
    private final HotelsRoomsListV5TariffView hotelsRoomsListMeasureTariff;

    /* renamed from: hotelsRoomsListNameTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListNameTav;

    @NotNull
    private final RecyclerView hotelsRoomsListRoomBadgesRv;

    /* renamed from: hotelsRoomsListRoomsLeftBadgeBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListRoomsLeftBadgeBv;

    @NotNull
    private final FlexboxLayout hotelsRoomsListTagsFl;

    @NotNull
    private final RecyclerView hotelsRoomsListTariffsRv;
    private HotelsRoomsListV5ImagesAdapter imagesAdapter;

    @NotNull
    private final RecyclerView.o imagesLayoutManager;

    @NotNull
    private final Handler instanceRestorationHandler;
    private TariffLayoutCache maxTariffLayoutCache;
    private HotelsRoomsListV5RoomBadgesAdapter roomBadgesAdapter;

    @NotNull
    private final RecyclerView.o roomBadgesLayoutManager;
    private HotelsRoomsListV5TariffsAdapter tariffsAdapter;

    @NotNull
    private final LinearLayoutManager tariffsLayoutManager;

    /* renamed from: tariffsPlaceholders$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tariffsPlaceholders;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsRoomsListV5View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(2, context);
        this.dp2 = px;
        int px2 = UiExtKt.toPx(4, context);
        this.dp4 = px2;
        int px3 = UiExtKt.toPx(6, context);
        this.dp6 = px3;
        int px4 = UiExtKt.toPx(8, context);
        this.dp8 = px4;
        int px5 = UiExtKt.toPx(10, context);
        this.dp10 = px5;
        int px6 = UiExtKt.toPx(12, context);
        this.dp12 = px6;
        int px7 = UiExtKt.toPx(14, context);
        this.dp14 = px7;
        int px8 = UiExtKt.toPx(16, context);
        this.dp16 = px8;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.imagesLayoutManager = linearLayoutManager;
        RecyclerView.o linearLayoutManager2 = new LinearLayoutManager(context, 0, false);
        this.roomBadgesLayoutManager = linearLayoutManager2;
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(context, 0, false);
        this.tariffsLayoutManager = linearLayoutManager3;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.hotelsRoomsListV5ImagesRv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, UiExtKt.toPx(206, context));
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41640k = R$id.hotelsRoomsListV5ServiceBv;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = px;
        recyclerView.setLayoutParams(bVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new HotelsRoomsListV5ImagesItemDecoration(context));
        new x().attachToRecyclerView(recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        this.hotelsRoomsListImagesRv = recyclerView;
        DottedIndicatorView dottedIndicatorView = new DottedIndicatorView(context, null, 2, 0 == true ? 1 : 0);
        dottedIndicatorView.setId(R$id.hotelsRoomsListV5IndicatorDiv);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41642l = R$id.hotelsRoomsListV5ImagesRv;
        bVar2.f41658v = 0;
        bVar2.f41656t = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = px3;
        dottedIndicatorView.setLayoutParams(bVar2);
        dottedIndicatorView.setDotColor(ThemeExtKt.themeColor(context, R$attr.bgOverlap));
        dottedIndicatorView.setDotRadius(px);
        dottedIndicatorView.setHighlightedDotColor(ThemeExtKt.themeColor(context, R$attr.bgPrimary));
        dottedIndicatorView.setHighlightedDotLength(px4);
        dottedIndicatorView.setSpacing(px);
        this.hotelsRoomsListIndicatorDiv = dottedIndicatorView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.hotelsRoomsListRoomsLeftBadgeBv = new PreCreationViewPoolDelegate(context2, N.b(BadgeView.class), new HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$1(this), new HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$2(this));
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        flexboxLayout.setId(R$id.hotelsRoomsListV5TagsFl);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41642l = R$id.hotelsRoomsListV5ImagesRv;
        bVar3.f41658v = 0;
        bVar3.f41656t = 0;
        bVar3.setMarginStart(px7);
        bVar3.setMarginEnd(px7);
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = px6;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.setIntrinsicHeight(px2);
        shapeDrawable.setIntrinsicWidth(px2);
        flexboxLayout.setDividerDrawable(shapeDrawable);
        flexboxLayout.setShowDivider(2);
        flexboxLayout.setFlexWrap(2);
        flexboxLayout.setLayoutParams(bVar3);
        this.hotelsRoomsListTagsFl = flexboxLayout;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.hotelsRoomsListNameTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$3(this), new HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$4(this));
        View view = new View(context);
        view.setId(R$id.hotelsRoomsListV5ClickableAreaV);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, 0);
        bVar4.f41656t = 0;
        bVar4.f41658v = 0;
        bVar4.f41636i = R$id.hotelsRoomsListV5NameTav;
        bVar4.f41642l = R$id.hotelsRoomsListV5AccommodationVal;
        view.setLayoutParams(bVar4);
        view.setOnClickListener(new a(this, 0));
        this.clickableArea = view;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.hotelsRoomsListDetailsBv = new PreCreationViewPoolDelegate(context4, N.b(BadgeView.class), new HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$5(this), new HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$6(this));
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.hotelsRoomsListV5AccommodationVal);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(0, -2);
        bVar5.f41638j = R$id.hotelsRoomsListV5NameTav;
        bVar5.f41658v = 0;
        bVar5.f41656t = 0;
        bVar5.setMarginEnd(px8);
        bVar5.setMarginStart(px8);
        ((ViewGroup.MarginLayoutParams) bVar5).topMargin = px3;
        verticalAtomsLayout.setLayoutParams(bVar5);
        this.hotelsRoomsListAccommodationVal = verticalAtomsLayout;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(R$id.hotelsRoomsListV5RoomBadgesRv);
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(0, -2);
        bVar6.f41658v = 0;
        bVar6.f41656t = 0;
        bVar6.f41638j = R$id.hotelsRoomsListV5AccommodationVal;
        ((ViewGroup.MarginLayoutParams) bVar6).topMargin = px5;
        recyclerView2.setLayoutParams(bVar6);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.addItemDecoration(new HotelsRoomsListV5HorizontalItemDecoration(context));
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setItemAnimator(null);
        recyclerView2.setOverScrollMode(2);
        this.hotelsRoomsListRoomBadgesRv = recyclerView2;
        RecyclerView recyclerView3 = new RecyclerView(context);
        recyclerView3.setId(R$id.hotelsRoomsListV5TariffsRv);
        ConstraintLayout.b bVar7 = new ConstraintLayout.b(0, -2);
        bVar7.f41658v = 0;
        bVar7.f41656t = 0;
        bVar7.f41638j = R$id.hotelsRoomsListV5RoomBadgesRv;
        ((ViewGroup.MarginLayoutParams) bVar7).topMargin = px6;
        recyclerView3.setLayoutParams(bVar7);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        new x().attachToRecyclerView(recyclerView3);
        recyclerView3.addItemDecoration(new HotelsRoomsListV5HorizontalItemDecoration(context));
        recyclerView3.setNestedScrollingEnabled(false);
        recyclerView3.setItemAnimator(null);
        recyclerView3.setClipToPadding(false);
        recyclerView3.setOverScrollMode(2);
        this.hotelsRoomsListTariffsRv = recyclerView3;
        HotelsRoomsListV5TariffView hotelsRoomsListV5TariffView = new HotelsRoomsListV5TariffView(context);
        hotelsRoomsListV5TariffView.setId(R$id.hotelsRoomsListV5MeasureTariff);
        ConstraintLayout.b bVar8 = new ConstraintLayout.b(0, -2);
        bVar8.f41656t = 0;
        bVar8.f41658v = 0;
        bVar8.f41636i = 0;
        hotelsRoomsListV5TariffView.setLayoutParams(bVar8);
        hotelsRoomsListV5TariffView.setVisibility(4);
        this.hotelsRoomsListMeasureTariff = hotelsRoomsListV5TariffView;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.hotelsRoomsListButton = new PreCreationViewPoolDelegate(context5, N.b(ButtonV3View.class), new HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$7(this), new HotelsRoomsListV5View$special$$inlined$preCreationViewPool$default$8(this));
        this.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
        this.instanceRestorationHandler = new Handler(Looper.getMainLooper());
        this.tariffsPlaceholders = LazyUtilsKt.unsafeLazy(HotelsRoomsListV5View$tariffsPlaceholders$2.INSTANCE);
        addView(recyclerView);
        addView(flexboxLayout);
        addView(dottedIndicatorView);
        addView(getHotelsRoomsListRoomsLeftBadgeBv());
        addView(getHotelsRoomsListNameTav());
        addView(getHotelsRoomsListDetailsBv());
        addView(verticalAtomsLayout);
        addView(recyclerView2);
        addView(recyclerView3);
        addView(hotelsRoomsListV5TariffView);
        addView(getHotelsRoomsListButton());
        addView(view);
        setPadding(0, 0, 0, px8);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    public static /* synthetic */ void bindImages$default(HotelsRoomsListV5View hotelsRoomsListV5View, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        hotelsRoomsListV5View.bindImages(list, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkOthersCardsHeight(List<TariffVO> tariffs, AbstractC5434v lifecycle) {
        B0 b02 = this.heightCalculationJob;
        if (b02 != null) {
            b02.j(null);
        }
        TariffLayoutCache tariffLayoutCache = this.maxTariffLayoutCache;
        if (tariffLayoutCache != null && isCachedSizeValid(tariffLayoutCache)) {
            updateTariffHeight(tariffLayoutCache.getTariffHeight());
            return;
        }
        D a11 = H.a(lifecycle);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.heightCalculationJob = C10727i.c(a11, s.f6650a, null, new HotelsRoomsListV5View$checkOthersCardsHeight$2(this, tariffs, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickableArea$lambda$13$lambda$12(HotelsRoomsListV5View hotelsRoomsListV5View, View view) {
        Function0<Unit> function0 = hotelsRoomsListV5View.detailsClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final ButtonV3View getHotelsRoomsListButton() {
        return (ButtonV3View) this.hotelsRoomsListButton.getValue(this, $$delegatedProperties[3]);
    }

    private final BadgeView getHotelsRoomsListDetailsBv() {
        return (BadgeView) this.hotelsRoomsListDetailsBv.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getHotelsRoomsListNameTav() {
        return (TextAtomV2View) this.hotelsRoomsListNameTav.getValue(this, $$delegatedProperties[1]);
    }

    private final BadgeView getHotelsRoomsListRoomsLeftBadgeBv() {
        return (BadgeView) this.hotelsRoomsListRoomsLeftBadgeBv.getValue(this, $$delegatedProperties[0]);
    }

    private final List<Placeholder> getTariffsPlaceholders() {
        return (List) this.tariffsPlaceholders.getValue();
    }

    private final boolean isCachedSizeValid(TariffLayoutCache cache) {
        Float f7 = this.fontScale;
        return f7 != null && cache.getFontScale() != null && Math.abs(cache.getFontScale().floatValue() - f7.floatValue()) < 0.01f && cache.getDensityDpi() == this.densityDpi;
    }

    private final void restoreHighlightedDotPosition(HotelsRoomsListV5RoomVO boundData) {
        if (boundData != null) {
            Integer highlightedDotPosition = boundData.getHighlightedDotPosition();
            if (highlightedDotPosition != null) {
                this.hotelsRoomsListIndicatorDiv.highlightAt(highlightedDotPosition.intValue());
            }
            boundData.setHighlightedDotPosition(null);
        }
    }

    private final void restoreLayoutManagersState(final HotelsRoomsListV5RoomVO boundData) {
        if (boundData != null) {
            final Parcelable imagesState = boundData.getImagesState();
            final Parcelable roomBadgesState = boundData.getRoomBadgesState();
            final Parcelable tariffsState = boundData.getTariffsState();
            if (imagesState == null && roomBadgesState == null && tariffsState == null) {
                return;
            }
            this.instanceRestorationHandler.post(new Runnable() { // from class: BS.c
                @Override // java.lang.Runnable
                public final void run() {
                    HotelsRoomsListV5RoomVO hotelsRoomsListV5RoomVO = boundData;
                    HotelsRoomsListV5View hotelsRoomsListV5View = this;
                    HotelsRoomsListV5View.restoreLayoutManagersState$lambda$35$lambda$34(imagesState, roomBadgesState, tariffsState, hotelsRoomsListV5RoomVO, hotelsRoomsListV5View);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void restoreLayoutManagersState$lambda$35$lambda$34(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, HotelsRoomsListV5RoomVO hotelsRoomsListV5RoomVO, HotelsRoomsListV5View hotelsRoomsListV5View) {
        if (parcelable != null) {
            hotelsRoomsListV5View.imagesLayoutManager.onRestoreInstanceState(parcelable);
        }
        if (parcelable2 != null) {
            hotelsRoomsListV5View.roomBadgesLayoutManager.onRestoreInstanceState(parcelable2);
        }
        if (parcelable3 != null) {
            hotelsRoomsListV5View.tariffsLayoutManager.onRestoreInstanceState(parcelable3);
        }
        hotelsRoomsListV5RoomVO.setImagesState(null);
        hotelsRoomsListV5RoomVO.setRoomBadgesState(null);
        hotelsRoomsListV5RoomVO.setTariffsState(null);
    }

    private final void saveHighlightedDotPosition(HotelsRoomsListV5RoomVO boundData) {
        if (boundData != null) {
            boundData.setHighlightedDotPosition(Integer.valueOf(this.hotelsRoomsListIndicatorDiv.getHighlightedDotPosition()));
        }
    }

    private final void saveLayoutManagerState(HotelsRoomsListV5RoomVO boundData) {
        this.instanceRestorationHandler.removeCallbacksAndMessages(null);
        if (boundData != null) {
            if (boundData.getImagesState() == null) {
                boundData.setImagesState(this.imagesLayoutManager.onSaveInstanceState());
            }
            if (boundData.getRoomBadgesState() == null) {
                boundData.setRoomBadgesState(this.roomBadgesLayoutManager.onSaveInstanceState());
            }
            if (boundData.getTariffsState() == null) {
                boundData.setTariffsState(this.tariffsLayoutManager.onSaveInstanceState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTariffHeight(int newHeight) {
        if (this.hotelsRoomsListTariffsRv.getHeight() != newHeight) {
            RecyclerView recyclerView = this.hotelsRoomsListTariffsRv;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = newHeight;
            recyclerView.setLayoutParams(layoutParams);
        }
        this.maxTariffLayoutCache = new TariffLayoutCache(newHeight, this.fontScale, this.densityDpi);
    }

    public final void bindAccommodation(@NotNull List<TextDTO> accommodation, boolean areAccommodationVisible) {
        Intrinsics.checkNotNullParameter(accommodation, "accommodation");
        this.hotelsRoomsListAccommodationVal.setVisibility(areAccommodationVisible ? 0 : 8);
        AtomsAdapter atomsAdapter = this.accommodationAdapter;
        if (atomsAdapter != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, accommodation);
        }
    }

    public final void bindButton(ButtonV3DTO button, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        ButtonV3HolderKt.bindOrGone(getHotelsRoomsListButton(), button, onAction);
    }

    public final void bindDetailBadge(BadgeDTO detailBadge, AtomAction action, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        BadgeHolderKt.bindOrGone$default(getHotelsRoomsListDetailsBv(), detailBadge, (Function1) null, 2, (Object) null);
        this.detailsClick = new HotelsRoomsListV5View$bindDetailBadge$1(action, onAction);
    }

    public final void bindImages(@NotNull List<ImageVO> images, boolean payloadBind) {
        HotelsRoomsListV5ImagesAdapter hotelsRoomsListV5ImagesAdapter;
        Intrinsics.checkNotNullParameter(images, "images");
        if (!payloadBind && (hotelsRoomsListV5ImagesAdapter = this.imagesAdapter) != null) {
            hotelsRoomsListV5ImagesAdapter.submitList(null);
        }
        HotelsRoomsListV5ImagesAdapter hotelsRoomsListV5ImagesAdapter2 = this.imagesAdapter;
        if (hotelsRoomsListV5ImagesAdapter2 != null) {
            hotelsRoomsListV5ImagesAdapter2.submitList(images);
        }
    }

    public final void bindName(@NotNull TextDTO name, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        TextHolderKt.bind(getHotelsRoomsListNameTav(), name, onAction);
    }

    public final void bindRoomBadges(@NotNull List<BadgeDTO> roomBadges, boolean areRoomBadgesVisible) {
        Intrinsics.checkNotNullParameter(roomBadges, "roomBadges");
        this.hotelsRoomsListRoomBadgesRv.setVisibility(areRoomBadgesVisible ? 0 : 8);
        HotelsRoomsListV5RoomBadgesAdapter hotelsRoomsListV5RoomBadgesAdapter = this.roomBadgesAdapter;
        if (hotelsRoomsListV5RoomBadgesAdapter != null) {
            hotelsRoomsListV5RoomBadgesAdapter.submitList(roomBadges);
        }
    }

    public final void bindRoomsLeftBadge(BadgeDTO roomsLeftBadge, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        BadgeHolderKt.bindOrGone(getHotelsRoomsListRoomsLeftBadgeBv(), roomsLeftBadge, onAction);
    }

    public final void bindTags(@NotNull List<BadgeDTO> tags, boolean areTagsVisible) {
        BadgeView badgeView;
        Intrinsics.checkNotNullParameter(tags, "tags");
        int i11 = 0;
        this.hotelsRoomsListTagsFl.setVisibility(areTagsVisible ? 0 : 8);
        if (areTagsVisible) {
            int childCount = this.hotelsRoomsListTagsFl.getChildCount();
            for (Object obj : tags) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                BadgeDTO badgeDTO = (BadgeDTO) obj;
                if (i11 < childCount) {
                    View childAt = this.hotelsRoomsListTagsFl.getChildAt(i11);
                    badgeView = childAt instanceof BadgeView ? (BadgeView) childAt : null;
                } else {
                    q qVar = q.f64554a;
                    d b11 = N.b(BadgeView.class);
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    badgeView = (BadgeView) qVar.g(b11, context);
                    this.hotelsRoomsListTagsFl.addView(badgeView);
                }
                if (badgeView != null) {
                    BadgeHolderKt.bindOrGone$default(badgeView, badgeDTO, (Function1) null, 2, (Object) null);
                }
                i11 = i12;
            }
            for (int size = tags.size(); size < childCount; size++) {
                View childAt2 = this.hotelsRoomsListTagsFl.getChildAt(size);
                Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
                ViewExtKt.gone(childAt2);
            }
        }
    }

    public final void bindTariffs(@NotNull List<TariffVO> tariffs, @NotNull AbstractC5434v lifecycle, TariffLayoutCache tariffLayoutCache, boolean isLoaderVisible) {
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!isLoaderVisible) {
            this.maxTariffLayoutCache = tariffLayoutCache;
            bindTariffs(tariffs, lifecycle);
        } else {
            HotelsRoomsListV5TariffsAdapter hotelsRoomsListV5TariffsAdapter = this.tariffsAdapter;
            if (hotelsRoomsListV5TariffsAdapter != null) {
                hotelsRoomsListV5TariffsAdapter.submitList(getTariffsPlaceholders());
            }
        }
    }

    public final void onAttach(HotelsRoomsListV5RoomVO boundData) {
        restoreLayoutManagersState(boundData);
        restoreHighlightedDotPosition(boundData);
    }

    public final void onDetach(HotelsRoomsListV5RoomVO boundData) {
        saveLayoutManagerState(boundData);
        saveHighlightedDotPosition(boundData);
        if (boundData != null) {
            boundData.setTariffLayoutCache(this.maxTariffLayoutCache);
        }
    }

    public final void setAccommodationAdapter(@NotNull AtomsAdapter accommodationAdapter) {
        Intrinsics.checkNotNullParameter(accommodationAdapter, "accommodationAdapter");
        this.accommodationAdapter = accommodationAdapter;
        this.hotelsRoomsListAccommodationVal.setAdapter(accommodationAdapter);
    }

    public final void setFontScaleProvider(@NotNull FontScaleProvider fontScaleProvider) {
        Intrinsics.checkNotNullParameter(fontScaleProvider, "fontScaleProvider");
        this.fontScale = Float.valueOf(fontScaleProvider.getFontScale());
    }

    public final void setImageAdapter(@NotNull HotelsRoomsListV5ImagesAdapter imagesAdapter, @NotNull RecyclerView.u recyclerViewPool) {
        Intrinsics.checkNotNullParameter(imagesAdapter, "imagesAdapter");
        Intrinsics.checkNotNullParameter(recyclerViewPool, "recyclerViewPool");
        this.imagesAdapter = imagesAdapter;
        this.hotelsRoomsListImagesRv.setAdapter(imagesAdapter);
        this.hotelsRoomsListImagesRv.setRecycledViewPool(recyclerViewPool);
        this.hotelsRoomsListIndicatorDiv.attachTo(this.hotelsRoomsListImagesRv);
    }

    public final void setRoomBadgesAdapter(@NotNull HotelsRoomsListV5RoomBadgesAdapter roomBadgesAdapter, @NotNull RecyclerView.u recyclerViewPool) {
        Intrinsics.checkNotNullParameter(roomBadgesAdapter, "roomBadgesAdapter");
        Intrinsics.checkNotNullParameter(recyclerViewPool, "recyclerViewPool");
        this.roomBadgesAdapter = roomBadgesAdapter;
        this.hotelsRoomsListRoomBadgesRv.setAdapter(roomBadgesAdapter);
        this.hotelsRoomsListRoomBadgesRv.setRecycledViewPool(recyclerViewPool);
    }

    public final void setTariffsAdapter(@NotNull HotelsRoomsListV5TariffsAdapter tariffsAdapter) {
        Intrinsics.checkNotNullParameter(tariffsAdapter, "tariffsAdapter");
        this.tariffsAdapter = tariffsAdapter;
        this.hotelsRoomsListTariffsRv.setAdapter(tariffsAdapter);
        this.hotelsRoomsListTariffsRv.setRecycledViewPool(tariffsAdapter.getRecycledViewPool());
    }

    private final void bindTariffs(List<TariffVO> tariffs, AbstractC5434v lifecycle) {
        if (tariffs.isEmpty()) {
            this.hotelsRoomsListMeasureTariff.setVisibility(8);
            HotelsRoomsListV5TariffsAdapter hotelsRoomsListV5TariffsAdapter = this.tariffsAdapter;
            if (hotelsRoomsListV5TariffsAdapter != null) {
                hotelsRoomsListV5TariffsAdapter.submitList(tariffs);
                return;
            }
            return;
        }
        this.hotelsRoomsListMeasureTariff.setVisibility(4);
        HotelsRoomsListV5TariffsAdapter hotelsRoomsListV5TariffsAdapter2 = this.tariffsAdapter;
        if (hotelsRoomsListV5TariffsAdapter2 != null) {
            hotelsRoomsListV5TariffsAdapter2.submitList(tariffs, new b(this, tariffs, lifecycle, 0));
        }
    }
}

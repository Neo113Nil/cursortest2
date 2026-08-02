package ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler;

import Ej.b;
import Sc.InterfaceC4008j;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.view.shared.RecyclerAdapter;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R(\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentRecyclerAdapter;", "Lru/ozon/app/android/pdp/view/shared/RecyclerAdapter;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentItemViewHolder;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "", "imagesHeight", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "", "onClickAction", "onBindItem", "", "isSelect", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Z)V", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentItemViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentItemViewHolder;I)V", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Integer;", "Lkotlin/jvm/functions/Function2;", "Z", "Landroid/graphics/drawable/ShapeDrawable;", "imageListBg$delegate", "LSc/j;", "getImageListBg", "()Landroid/graphics/drawable/ShapeDrawable;", "imageListBg", "getImageBackground", "imageBackground", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentRecyclerAdapter extends RecyclerAdapter<RichContentVO.Item, RichContentItemViewHolder> {

    @NotNull
    private final Function0<Drawable> backgroundColor;

    @NotNull
    private final Context context;

    /* renamed from: imageListBg$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageListBg;
    private final Integer imagesHeight;
    private final boolean isSelect;

    @NotNull
    private final Function0<Unit> onBindItem;

    @NotNull
    private final Function2<AtomAction, t, Unit> onClickAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RichContentRecyclerAdapter(@NotNull Context context, @NotNull Function0<? extends Drawable> backgroundColor, Integer num, @NotNull Function2<? super AtomAction, ? super t, Unit> onClickAction, @NotNull Function0<Unit> onBindItem, boolean z11) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        Intrinsics.checkNotNullParameter(onBindItem, "onBindItem");
        this.context = context;
        this.backgroundColor = backgroundColor;
        this.imagesHeight = num;
        this.onClickAction = onClickAction;
        this.onBindItem = onBindItem;
        this.isSelect = z11;
        this.imageListBg = DelegatesKt.lazyUnsafe(new RichContentRecyclerAdapter$imageListBg$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShapeDrawable getImageBackground() {
        return ContextExtKt.createRoundRectShape$default(this.context, UiExtKt.toPxF((this.isSelect ? CornerRadius.RADIUS_500 : CornerRadius.RADIUS_400).getPx()), CornersConfig.ALL, 0, ThemeExtKt.themeColor(this.context, R$attr.bgPrimary), null, 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShapeDrawable getImageListBg() {
        return (ShapeDrawable) this.imageListBg.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        RichContentVO.Item item = getItem(position);
        if (item instanceof RichContentVO.Item.Billboard) {
            return 1;
        }
        if (item instanceof RichContentVO.Item.DoubleTile) {
            return 2;
        }
        if (item instanceof RichContentVO.Item.ListItem.BulletList) {
            return 3;
        }
        if (item instanceof RichContentVO.Item.ListItem.ImageList) {
            return 4;
        }
        if (item instanceof RichContentVO.Item.ListItem.NumberList) {
            return 5;
        }
        if (item instanceof RichContentVO.Item.Text) {
            return 6;
        }
        if (item instanceof RichContentVO.Item.Spacer) {
            return 7;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RichContentItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RichContentVO.Item item = getItem(position);
        this.onBindItem.invoke();
        if (holder instanceof RichContentBillboardItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO.Item.Billboard");
            ((RichContentBillboardItemViewHolder) holder).bind((RichContentVO.Item.Billboard) item, new C(this) { // from class: ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler.RichContentRecyclerAdapter$onBindViewHolder$1
                @Override // kotlin.jvm.internal.C, kotlin.reflect.n
                public Object get() {
                    ShapeDrawable imageBackground;
                    imageBackground = ((RichContentRecyclerAdapter) this.receiver).getImageBackground();
                    return imageBackground;
                }
            });
            return;
        }
        if (holder instanceof RichContentDoubleTileViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO.Item.DoubleTile");
            ((RichContentDoubleTileViewHolder) holder).bind((RichContentVO.Item.DoubleTile) item, this.backgroundColor);
            return;
        }
        if (holder instanceof RichContentBulletListViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO.Item.ListItem.BulletList");
            ((RichContentBulletListViewHolder) holder).bind((RichContentVO.Item.ListItem.BulletList) item);
            return;
        }
        if (holder instanceof RichContentImageListViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO.Item.ListItem.ImageList");
            ((RichContentImageListViewHolder) holder).bind((RichContentVO.Item.ListItem.ImageList) item, new C(this) { // from class: ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler.RichContentRecyclerAdapter$onBindViewHolder$2
                @Override // kotlin.jvm.internal.C, kotlin.reflect.n
                public Object get() {
                    ShapeDrawable imageListBg;
                    imageListBg = ((RichContentRecyclerAdapter) this.receiver).getImageListBg();
                    return imageListBg;
                }
            });
            return;
        }
        if (holder instanceof RichContentNumberListViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO.Item.ListItem.NumberList");
            ((RichContentNumberListViewHolder) holder).bind((RichContentVO.Item.ListItem.NumberList) item);
        } else if (holder instanceof RichContentTextViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO.Item.Text");
            ((RichContentTextViewHolder) holder).bind((RichContentVO.Item.Text) item);
        } else {
            if (!(holder instanceof RichContentSpacerViewHolder)) {
                throw new o();
            }
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO.Item.Spacer");
            ((RichContentSpacerViewHolder) holder).bind((RichContentVO.Item.Spacer) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RichContentItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 1:
                return RichContentBillboardItemViewHolder.INSTANCE.create(parent, this.imagesHeight, this.onClickAction);
            case 2:
                return RichContentDoubleTileViewHolder.INSTANCE.create(parent, this.onClickAction);
            case 3:
                return RichContentBulletListViewHolder.INSTANCE.create(parent);
            case 4:
                return RichContentImageListViewHolder.INSTANCE.create(parent);
            case 5:
                return RichContentNumberListViewHolder.INSTANCE.create(parent);
            case 6:
                return RichContentTextViewHolder.INSTANCE.create(parent);
            case 7:
                return RichContentSpacerViewHolder.INSTANCE.create(parent);
            default:
                throw new IllegalArgumentException(b.a(viewType, "Unknown viewType="));
        }
    }
}

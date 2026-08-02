package ru.ozon.app.android.travel.molecules.view.railwayServices;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import com.google.android.flexbox.FlexboxLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/railwayServices/RailwayServicesView;", "Lcom/google/android/flexbox/FlexboxLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/travel/molecules/view/railwayServices/RailwayServicesVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/travel/molecules/view/railwayServices/RailwayServicesVO;Lkotlin/jvm/functions/Function1;)V", "iconSize", "I", "buttonPadding", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RailwayServicesView extends FlexboxLayout {
    public static final int $stable = 8;
    private final int buttonPadding;
    private final int iconSize;

    public /* synthetic */ RailwayServicesView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static final /* synthetic */ RailwayServicesImagePool access$getPool$p(RailwayServicesView railwayServicesView) {
        railwayServicesView.getClass();
        return null;
    }

    public final void bind(@NotNull RailwayServicesVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        removeAllViews();
        for (Icon icon : item.getIcons()) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            int i11 = this.iconSize;
            appCompatImageView.setLayoutParams(new FlexboxLayout.a(i11, i11));
            ImageViewExtKt.load$default(appCompatImageView, icon.getImage(), null, null, null, null, false, null, 126, null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, icon.getTintColor()));
            addView(appCompatImageView);
        }
        q qVar = q.f64554a;
        d b11 = N.b(SmallIconButtonView.class);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View g10 = qVar.g(b11, context2);
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) g10;
        int i12 = this.iconSize;
        smallIconButtonView.setLayoutParams(new FlexboxLayout.a(i12, i12));
        int i13 = this.buttonPadding;
        smallIconButtonView.setPadding(i13, i13, i13, i13);
        WrappedIconButtonHolderKt.bind(smallIconButtonView, item.getInfoButton(), actionHandler);
        addView(g10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayServicesView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconSize = ResourceExtKt.toPx(24, context);
        this.buttonPadding = ResourceExtKt.toPx(4, context);
        setDividerDrawable(a.getDrawable(context, R$drawable.space_flexbox_atom_layout));
        setShowDivider(2);
        setFlexWrap(1);
        setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: ru.ozon.app.android.travel.molecules.view.railwayServices.RailwayServicesView.1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(child, "child");
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View parent, View child) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(child, "child");
                if (child.getClass().equals(AppCompatImageView.class)) {
                    RailwayServicesView.access$getPool$p(RailwayServicesView.this);
                }
            }
        });
    }
}

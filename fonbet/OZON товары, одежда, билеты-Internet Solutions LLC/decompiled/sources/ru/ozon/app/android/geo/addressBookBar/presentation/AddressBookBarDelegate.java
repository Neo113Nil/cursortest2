package ru.ozon.app.android.geo.addressBookBar.presentation;

import EE.a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addressBookBar.presentation.common.AddressBookBarVO;
import ru.ozon.app.android.geo.addressBookBar.presentation.view.AddressBookBarView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/presentation/AddressBookBarDelegate;", "", "Lru/ozon/app/android/geo/addressBookBar/presentation/view/AddressBookBarView;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;", "holder", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/geo/addressBookBar/presentation/view/AddressBookBarView;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegular24IconPicker;", "cell", "", "bindRegularCell", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegular24IconPicker;)V", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;", "bindRightLeftTitlesCell", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;)V", "item", "bindSeparator", "(Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;)V", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "bindCell", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;)V", "Lru/ozon/app/android/geo/addressBookBar/presentation/view/AddressBookBarView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookBarDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AddressBookBarView view;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/presentation/AddressBookBarDelegate$Companion;", "", "<init>", "()V", "ADDRESS_DELIMITER", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AddressBookBarDelegate(@NotNull AddressBookBarView view, @NotNull k<AddressBookBarVO> holder, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(references, "references");
        this.view = view;
        this.actionHandler = new ActionHandler.Builder(references, holder).buildHandler();
        view.setOnClickListener(new a(9, holder, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(k kVar, AddressBookBarDelegate addressBookBarDelegate, View view) {
        AtomAction action;
        AddressBookBarVO addressBookBarVO = (AddressBookBarVO) kVar.getBoundedData();
        if (addressBookBarVO == null || (action = addressBookBarVO.getAction()) == null) {
            return;
        }
        addressBookBarDelegate.actionHandler.invoke(action);
    }

    private final void bindRegularCell(CellAtom.CellRegular24IconPicker cell) {
        this.view.setRegularCell(cell);
    }

    private final void bindRightLeftTitlesCell(AddressCell.RightLeftTitlesCell24Icon cell) {
        AddressBookBarView addressBookBarView = this.view;
        String icon = cell.getIcon();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, cell.getIconTintColor());
        String leftTitle = cell.getLeftTitle();
        String concat = leftTitle != null ? leftTitle.concat("・") : null;
        String rightTitle = cell.getRightTitle();
        Context context2 = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String titlesColor = cell.getTitlesColor();
        Context context3 = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        addressBookBarView.setRightLeftCell(icon, parseColor, concat, rightTitle, styleParser.parseColor(context2, titlesColor, ThemeExtKt.themeColorRes(context3, R$attr.textPrimary)), !cell.getHideSeparator());
    }

    public final void bindCell(@NotNull AddressCell item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object cell = item.getCell();
        if (cell instanceof CellAtom.CellRegular24IconPicker) {
            bindRegularCell((CellAtom.CellRegular24IconPicker) cell);
        } else if (cell instanceof AddressCell.RightLeftTitlesCell24Icon) {
            bindRightLeftTitlesCell((AddressCell.RightLeftTitlesCell24Icon) cell);
        }
    }

    public final void bindSeparator(@NotNull AddressBookBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.setSeparatorVisibility(item.getShowSeparator());
    }
}

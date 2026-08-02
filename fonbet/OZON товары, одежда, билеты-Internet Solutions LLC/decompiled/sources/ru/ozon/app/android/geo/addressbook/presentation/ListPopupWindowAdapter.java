package ru.ozon.app.android.geo.addressbook.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookVO;
import ru.ozon.app.android.geo.databinding.PopupItemAddressBookBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ+\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/ListPopupWindowAdapter;", "Landroid/widget/BaseAdapter;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls$Control;", "items", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Lru/ozon/app/android/geo/databinding/PopupItemAddressBookBinding;", "binding", "", "setDeleteColor", "(Lru/ozon/app/android/geo/databinding/PopupItemAddressBookBinding;)V", "setDefaultColor", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "getItem", "(I)Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls$Control;", "", "getItemId", "(I)J", "getCount", "()I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ListPopupWindowAdapter extends BaseAdapter {

    @NotNull
    private final Context context;
    private final LayoutInflater inflater;

    @NotNull
    private final List<AddressBookVO.Address.Controls.Control> items;

    public ListPopupWindowAdapter(@NotNull Context context, @NotNull List<AddressBookVO.Address.Controls.Control> items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        this.context = context;
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }

    private final void setDefaultColor(PopupItemAddressBookBinding binding) {
        binding.iconIv.setColorFilter(a.getColor(this.context, R$color.graphic_tertiary), PorterDuff.Mode.SRC_IN);
    }

    private final void setDeleteColor(PopupItemAddressBookBinding binding) {
        binding.iconIv.setColorFilter(a.getColor(this.context, R$color.graphic_negative_primary), PorterDuff.Mode.SRC_IN);
        binding.popupTitleTv.setTextColor(a.getColor(this.context, R$color.text_negative));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.items.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"ViewHolder"})
    @NotNull
    public View getView(int position, View convertView, ViewGroup parent) {
        PopupItemAddressBookBinding inflate = PopupItemAddressBookBinding.inflate(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        AddressBookVO.Address.Controls.Control control = this.items.get(position);
        inflate.popupTitleTv.setText(control.getText());
        Integer iconResByToken = TokensExtKt.getIconResByToken(this.context, control.getIconRes());
        if (iconResByToken != null) {
            inflate.iconIv.setImageResource(iconResByToken.intValue());
            AppCompatImageView iconIv = inflate.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
            ViewExtKt.show(iconIv);
        } else {
            AppCompatImageView iconIv2 = inflate.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
            ImageViewExtKt.loadImageOrGone(iconIv2, control.getIcon());
        }
        AppCompatImageView iconIv3 = inflate.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv3, "iconIv");
        ThemeExtKt.semanticTint$default(iconIv3, 0, 1, null);
        AtomActionDTO action = control.getAction();
        if (Intrinsics.d(action != null ? action.getId() : null, "delete")) {
            setDeleteColor(inflate);
        } else {
            setDefaultColor(inflate);
        }
        ConstraintLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // android.widget.Adapter
    @NotNull
    public AddressBookVO.Address.Controls.Control getItem(int position) {
        return this.items.get(position);
    }
}

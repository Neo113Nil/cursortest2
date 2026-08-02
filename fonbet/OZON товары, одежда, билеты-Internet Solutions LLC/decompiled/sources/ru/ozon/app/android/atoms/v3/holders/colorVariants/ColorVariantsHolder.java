package ru.ozon.app.android.atoms.v3.holders.colorVariants;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.variants.ColorVariants;
import ru.ozon.app.android.uikit.view.atoms.colorVariants.ColorVariantsView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0002H\u0002¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/colorVariants/ColorVariantsHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/variants/ColorVariants;", "Lru/ozon/app/android/uikit/view/atoms/colorVariants/ColorVariantsView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/colorVariants/ColorVariantsView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "onConfigureView", "configuration", "Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "isValid", "", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ColorVariantsHolder extends AtomV3<ColorVariants, ColorVariantsView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorVariantsHolder(@NotNull ColorVariantsView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final boolean isValid(ColorVariants colorVariants) {
        boolean z11;
        boolean z12;
        List<ColorVariants.Item> items = colorVariants.getItems();
        if (!(items instanceof Collection) || !items.isEmpty()) {
            for (ColorVariants.Item item : items) {
                if (item.getType() != ColorVariants.Item.Type.ITEM_TYPE_TRANSPARENT) {
                    if (item.getHex() != null) {
                        List<String> hex = item.getHex();
                        if (!(hex instanceof Collection) || !hex.isEmpty()) {
                            for (String str : hex) {
                                if (!h.e0(str, "#", false) || str.length() != 7) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        z12 = true;
                        if ((!item.getHex().isEmpty()) & z12) {
                        }
                    }
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        return !colorVariants.getItems().isEmpty() && z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorVariantsHolder(@NotNull Context context, String str) {
        this(new ColorVariantsView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ColorVariants item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!isValid(item)) {
            ViewExtKt.gone(getContainerView());
            return;
        }
        ViewExtKt.show(getContainerView());
        super.onBind((ColorVariantsHolder) item);
        List<ColorVariants.Item> items = item.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (ColorVariants.Item item2 : items) {
            List<String> hex = item2.getHex();
            if (hex == null || item2.getType() != ColorVariants.Item.Type.ITEM_TYPE_HEX) {
                hex = null;
            }
            arrayList.add(hex);
        }
        getContainerView().bind(C7714v.K0(arrayList, 7), item.getText());
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Atom.DefaultConfigurator configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        super.onConfigureView((ColorVariantsHolder) configuration);
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
    }
}

package ru.ozon.android.uikit.appearance.atom;

import Sc.InterfaceC3999a;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.uikit.appearance.AttributesAppearance;
import ru.ozon.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/android/uikit/appearance/atom/SmallIconButtonAppearance;", "Lru/ozon/android/uikit/appearance/AttributesAppearance;", "Lru/ozon/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "<init>", "()V", "", "attr", "Landroid/content/res/TypedArray;", "typedAttributes", "", "readAttribute", "(ILandroid/content/res/TypedArray;)V", "view", "apply", "(Lru/ozon/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;)V", "Landroid/graphics/drawable/Drawable;", "image", "Landroid/graphics/drawable/Drawable;", "imageCompat", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SmallIconButtonAppearance extends AttributesAppearance<SmallIconButtonView> {
    private Drawable image;
    private Drawable imageCompat;

    public void apply(@NotNull SmallIconButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable drawable = this.image;
        if (drawable == null) {
            drawable = this.imageCompat;
        }
        if (drawable != null) {
            view.setImageDrawable(drawable);
        }
    }

    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == 0) {
            this.image = typedAttributes.getDrawable(attr);
        } else if (attr == 1) {
            this.imageCompat = typedAttributes.getDrawable(attr);
        }
    }
}

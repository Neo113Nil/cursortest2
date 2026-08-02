package ru.ozon.uni.android.atom.loader.ui;

import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0012\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorInt", "setImageDrawable", "", "drawable", "Landroid/graphics/drawable/Drawable;", "setLoaderSize", "size", "Lru/ozon/uni/android/atom/loader/data/LoaderSize;", "setColor", "color", "setSize", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoaderView extends AppCompatImageView implements AtomView {
    public static final int $stable = 8;
    private int colorInt;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoaderSize.values().length];
            try {
                iArr[LoaderSize.LOADER_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoaderSize.LOADER_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoaderSize.LOADER_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoaderSize.LOADER_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoaderSize.LOADER_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setSize(LoaderSize size) {
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        if (i12 == 1) {
            i11 = R$drawable.avd_loader_200;
        } else if (i12 == 2) {
            i11 = R$drawable.avd_loader_300;
        } else if (i12 == 3) {
            i11 = R$drawable.avd_loader_400;
        } else if (i12 == 4) {
            i11 = R$drawable.avd_loader_500;
        } else {
            if (i12 != 5) {
                throw new o();
            }
            i11 = R$drawable.avd_loader_600;
        }
        Drawable a11 = C7232a.a(getContext(), i11);
        setColorFilter(this.colorInt, PorterDuff.Mode.SRC_IN);
        setImageDrawable(a11);
    }

    public final void setColor(int color) {
        this.colorInt = color;
        setColorFilter(color, PorterDuff.Mode.SRC_IN);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        Drawable drawable2 = getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
        LoaderViewKt.startAnimation(drawable2);
    }

    public final void setLoaderSize(@NotNull LoaderSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        setSize(size);
        setColor(this.colorInt);
    }

    public /* synthetic */ LoaderView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LoaderView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorInt = ThemeExtKt.themeColor(context, R$attr.graphicActionPrimary);
        int[] LoaderView = R$styleable.LoaderView;
        Intrinsics.checkNotNullExpressionValue(LoaderView, "LoaderView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LoaderView, 0, 0);
        setSize((LoaderSize) LoaderSize.getEntries().get(obtainStyledAttributes.getInt(R$styleable.LoaderView_loaderSize, 0)));
        obtainStyledAttributes.recycle();
        Drawable drawable = getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        LoaderViewKt.startAnimation(drawable);
    }
}

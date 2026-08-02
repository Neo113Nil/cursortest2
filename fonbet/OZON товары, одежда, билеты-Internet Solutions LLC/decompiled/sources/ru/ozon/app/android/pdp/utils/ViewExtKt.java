package ru.ozon.app.android.pdp.utils;

import IC.a;
import IC.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0010*\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0017\u001a\u00020\u0007*\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001c\u001a\u00020\u0007*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u001f\u001a\u00020\u0007*\u00020\u001e¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010$\u001a\u00020#*\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroid/widget/ImageView;", "", "image", "", "cornerRadius", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$Blur;", "blur", "", "loadIcon", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$Blur;)V", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "bind", "(Landroid/widget/ImageView;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/Integer;)V", "bindOrGone", "Landroid/view/View;", "", "getAllChildren", "(Landroid/view/View;)Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lkotlin/Function1;", "actionHandler", "bindClickAction", "(Landroid/view/View;Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/helper/widget/Flow;", "flow", "cleanUpFlow", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/helper/widget/Flow;)V", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "forceClearFocus", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;)V", "", "threshold", "", "isColorDark", "(ID)Z", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewExtKt {
    public static final void bind(@NotNull ImageView imageView, @NotNull Icon icon, Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        loadIcon$default(imageView, icon.getImage(), num, null, 4, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, icon.getTintColor()));
    }

    public static /* synthetic */ void bind$default(ImageView imageView, Icon icon, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        bind(imageView, icon, num);
    }

    public static final void bindClickAction(@NotNull View view, AtomAction atomAction, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (atomAction != null) {
            view.setOnClickListener(new a(actionHandler, atomAction, 0));
        }
    }

    public static final void bindOrGone(@NotNull ImageView imageView, Icon icon, Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setVisibility(icon == null ? 8 : 0);
        if (icon != null) {
            bind(imageView, icon, num);
        }
    }

    public static /* synthetic */ void bindOrGone$default(ImageView imageView, Icon icon, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        bindOrGone(imageView, icon, num);
    }

    public static final void cleanUpFlow(@NotNull ConstraintLayout constraintLayout, @NotNull Flow flow) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(flow, "flow");
        int[] referencedIds = flow.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
        for (int i11 : referencedIds) {
            constraintLayout.removeView(constraintLayout.getViewById(i11));
        }
        flow.setReferencedIds(new int[0]);
    }

    public static final void forceClearFocus(@NotNull OzonTextInput ozonTextInput) {
        Intrinsics.checkNotNullParameter(ozonTextInput, "<this>");
        ozonTextInput.setFocusableInTouchMode(false);
        ozonTextInput.setFocusable(false);
        ozonTextInput.clearFocus();
        ViewParent parent = ozonTextInput.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setFocusableInTouchMode(true);
            viewGroup.requestFocus();
            viewGroup.setFocusableInTouchMode(false);
        }
        ozonTextInput.post(new b(ozonTextInput, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forceClearFocus$lambda$8(OzonTextInput ozonTextInput) {
        ozonTextInput.setFocusable(true);
        ozonTextInput.setFocusableInTouchMode(true);
    }

    @NotNull
    public static final List<View> getAllChildren(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ArrayList arrayList = new ArrayList();
        if (!(view instanceof ViewGroup)) {
            arrayList.add(view);
            return arrayList;
        }
        Iterator<View> it = ViewGroupExtKt.children((ViewGroup) view).iterator();
        while (it.hasNext()) {
            arrayList.addAll(getAllChildren(it.next()));
        }
        return arrayList;
    }

    public static final boolean isColorDark(int i11, double d11) {
        return c.c(i11) < d11;
    }

    public static /* synthetic */ boolean isColorDark$default(int i11, double d11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d11 = 0.5d;
        }
        return isColorDark(i11, d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void loadIcon(@NotNull ImageView imageView, @NotNull String image, Integer num, ImageTransformation.Blur blur) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(image, "image");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable loadDrawableByName = ru.ozon.app.android.pikazon.extensions.ContextExtKt.loadDrawableByName(context, image);
        if (loadDrawableByName != null) {
            imageView.setImageDrawable(loadDrawableByName);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (num != null && num.intValue() > 0) {
            arrayList.add(new ImageTransformation.RoundedCorners(num.intValue(), null, 2, 0 == true ? 1 : 0));
        }
        if (blur != null) {
            arrayList.add(blur);
        }
        ImageViewExtKt.load$default(imageView, image, arrayList, null, null, null, false, null, 124, null);
    }

    public static /* synthetic */ void loadIcon$default(ImageView imageView, String str, Integer num, ImageTransformation.Blur blur, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            blur = null;
        }
        loadIcon(imageView, str, num, blur);
    }
}

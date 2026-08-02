package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import j.C7232a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MViewFlashbarBinding;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class c extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    private final int f91191c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final MViewFlashbarBinding f91192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91191c = h.c(4);
        int c11 = h.c(16);
        MViewFlashbarBinding inflate = MViewFlashbarBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f91192d = inflate;
        setId(R$id.m_fbRoot);
        setClickable(true);
        setFocusable(true);
        setBackground(androidx.core.content.a.getDrawable(context, R$drawable.m_bg_flashbar));
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), c11);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        setForeground(C7232a.a(context, typedValue.resourceId));
    }

    public final void b(Integer num, String str, String str2) {
        StyleParser styleParser = StyleParser.INSTANCE;
        MViewFlashbarBinding mViewFlashbarBinding = this.f91192d;
        Context context = mViewFlashbarBinding.fbIcon.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor = styleParser.parseColor(context, str2, ThemeExtKt.themeColorRes(context2, R$attr.textSecondary));
        if (str != null) {
            String str3 = !kotlin.text.h.K(str) ? str : null;
            if (str3 != null) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Drawable loadIconByString = ContextExtKt.loadIconByString(context3, str3);
                if (loadIconByString != null) {
                    ImageView imageView = mViewFlashbarBinding.fbIcon;
                    imageView.setImageDrawable(loadIconByString);
                    ThemeExtKt.tint(imageView, Integer.valueOf(parseColor));
                    s.d(imageView);
                    return;
                }
            }
        }
        if (str != null && !kotlin.text.h.K(str)) {
            ImageView imageView2 = mViewFlashbarBinding.fbIcon;
            Intrinsics.f(imageView2);
            ImageViewExtKt.load$default(imageView2, str, null, null, null, null, false, null, 126, null);
            imageView2.clearColorFilter();
            s.d(imageView2);
            return;
        }
        if (num == null) {
            ImageView fbIcon = mViewFlashbarBinding.fbIcon;
            Intrinsics.checkNotNullExpressionValue(fbIcon, "fbIcon");
            s.a(fbIcon);
            return;
        }
        mViewFlashbarBinding.fbIcon.setImageDrawable(C7232a.a(getContext(), num.intValue()));
        ImageView fbIcon2 = mViewFlashbarBinding.fbIcon;
        Intrinsics.checkNotNullExpressionValue(fbIcon2, "fbIcon");
        ThemeExtKt.tint(fbIcon2, Integer.valueOf(parseColor));
        ImageView fbIcon3 = mViewFlashbarBinding.fbIcon;
        Intrinsics.checkNotNullExpressionValue(fbIcon3, "fbIcon");
        s.d(fbIcon3);
    }

    public final void c(OzonSpannableString ozonSpannableString) {
        TextView textView = this.f91192d.fbMessage;
        if (TextUtils.isEmpty(ozonSpannableString)) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        } else {
            textView.setText(ozonSpannableString);
            textView.setVisibility(0);
        }
    }

    public final void d(OzonSpannableString ozonSpannableString) {
        TextView textView = this.f91192d.fbTitle;
        if (TextUtils.isEmpty(ozonSpannableString)) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        } else {
            textView.setText(ozonSpannableString);
            textView.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r0 = r0.getDisplayCutout();
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onAttachedToWindow() {
        DisplayCutout displayCutout;
        super.onAttachedToWindow();
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowInsets rootWindowInsets = getRootWindowInsets();
            if (rootWindowInsets == null || displayCutout == null) {
                WindowInsets rootWindowInsets2 = getRootWindowInsets();
                if (rootWindowInsets2 != null) {
                    i11 = rootWindowInsets2.getStableInsetTop();
                }
            } else {
                i11 = displayCutout.getSafeInsetTop();
            }
        } else {
            WindowInsets rootWindowInsets3 = getRootWindowInsets();
            if (rootWindowInsets3 != null) {
                i11 = rootWindowInsets3.getStableInsetTop();
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i12 = this.f91191c;
        layoutParams.topMargin = i11 + i12;
        layoutParams.leftMargin = i12;
        layoutParams.rightMargin = i12;
        setLayoutParams(layoutParams);
    }
}

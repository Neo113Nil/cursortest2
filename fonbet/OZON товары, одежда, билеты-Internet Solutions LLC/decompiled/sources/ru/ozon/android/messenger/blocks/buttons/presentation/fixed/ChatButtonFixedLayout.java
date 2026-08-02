package ru.ozon.android.messenger.blocks.buttons.presentation.fixed;

import Aw.ViewOnClickListenerC2448a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.buttons.g;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.utils.c;
import ru.ozon.android.messenger.utils.e;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MLayoutFixedButtonBinding;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/messenger/blocks/buttons/presentation/fixed/ChatButtonFixedLayout;", "Lru/ozon/android/messenger/blocks/buttons/presentation/a;", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChatButtonFixedLayout extends ru.ozon.android.messenger.blocks.buttons.presentation.a {

    /* renamed from: h, reason: collision with root package name */
    private static final int f84435h = h.c(150);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f84436i = 0;

    /* renamed from: c, reason: collision with root package name */
    private final int f84437c;

    /* renamed from: d, reason: collision with root package name */
    private final Drawable f84438d;

    /* renamed from: e, reason: collision with root package name */
    private final int f84439e;

    /* renamed from: f, reason: collision with root package name */
    private final int f84440f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final MLayoutFixedButtonBinding f84441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatButtonFixedLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        int i11 = R$color.bg_light_key;
        Intrinsics.checkNotNullParameter(context, "<this>");
        this.f84437c = androidx.core.content.a.getColor(context, i11);
        int i12 = R$drawable.m_order_counter_bg;
        Intrinsics.checkNotNullParameter(context, "<this>");
        this.f84438d = androidx.core.content.a.getDrawable(context, i12);
        this.f84439e = ThemeExtKt.themeColor(context, R$attr.textSecondary);
        this.f84440f = ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja);
        MLayoutFixedButtonBinding inflate = MLayoutFixedButtonBinding.inflate(c.c(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f84441g = inflate;
        LinearLayout linearLayout = inflate.bubbleFixedContainerLL;
        Intrinsics.f(linearLayout);
        ru.ozon.android.messenger.blocks.buttons.presentation.a.a(linearLayout, true);
        linearLayout.setMinimumWidth(f84435h);
    }

    @Override // ru.ozon.android.messenger.blocks.buttons.presentation.a
    public final void f() {
        LinearLayout rootOrderContainerLL = this.f84441g.rootOrderContainerLL;
        Intrinsics.checkNotNullExpressionValue(rootOrderContainerLL, "rootOrderContainerLL");
        int childCount = rootOrderContainerLL.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            g(rootOrderContainerLL.getChildAt(i11));
        }
    }

    public final void h(@NotNull Function0<Unit> onButtonClick) {
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        this.f84441g.bubbleFixedContainerLL.setOnClickListener(new ViewOnClickListenerC2448a(onButtonClick, 14));
    }

    public final void i(List<String> list, String str, @NotNull d.a networkConfig) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        int i16;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        MLayoutFixedButtonBinding mLayoutFixedButtonBinding = this.f84441g;
        mLayoutFixedButtonBinding.fixedImagesLl.removeAllViews();
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            LinearLayout fixedImagesLl = mLayoutFixedButtonBinding.fixedImagesLl;
            Intrinsics.checkNotNullExpressionValue(fixedImagesLl, "fixedImagesLl");
            s.a(fixedImagesLl);
            return;
        }
        LinearLayout fixedImagesLl2 = mLayoutFixedButtonBinding.fixedImagesLl;
        Intrinsics.checkNotNullExpressionValue(fixedImagesLl2, "fixedImagesLl");
        s.d(fixedImagesLl2);
        int i19 = 0;
        for (Object obj : list) {
            int i21 = i19 + 1;
            if (i19 < 0) {
                C7714v.O0();
                throw null;
            }
            String str2 = (String) obj;
            CardView cardView = new CardView(getContext());
            i14 = e.f91917n;
            i15 = e.f91917n;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i14, i15);
            layoutParams.setMargins(i19 == 0 ? 0 : e.f91908e, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            cardView.setLayoutParams(layoutParams);
            cardView.setCardBackgroundColor(this.f84437c);
            f7 = e.f91924u;
            cardView.setRadius(f7);
            cardView.setElevation(0.0f);
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            i16 = e.f91915l;
            i17 = e.f91915l;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i16, i17);
            i18 = e.f91905b;
            layoutParams2.setMargins(i18, i18, i18, i18);
            appCompatImageView.setLayoutParams(layoutParams2);
            View frameLayout = new FrameLayout(getContext());
            frameLayout.setBackgroundColor(this.f84440f);
            ru.ozon.android.messenger.utils.image.c.a(appCompatImageView, str2, networkConfig);
            if (!c()) {
                appCompatImageView.setAlpha(0.5f);
            }
            cardView.addView(appCompatImageView);
            cardView.addView(frameLayout);
            mLayoutFixedButtonBinding.fixedImagesLl.addView(cardView);
            i19 = i21;
        }
        if (str != null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            i11 = e.f91917n;
            i12 = e.f91917n;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i11, i12);
            i13 = e.f91908e;
            layoutParams3.setMargins(i13, ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
            layoutParams3.gravity = 17;
            appCompatTextView.setLayoutParams(layoutParams3);
            appCompatTextView.setGravity(17);
            appCompatTextView.setTextColor(this.f84439e);
            appCompatTextView.setBackground(this.f84438d);
            appCompatTextView.setText(str);
            mLayoutFixedButtonBinding.fixedImagesLl.addView(appCompatTextView);
        }
    }

    public final void j(ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, @NotNull Function1<? super AtomAction, Unit> action) {
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(action, "action");
        MLayoutFixedButtonBinding mLayoutFixedButtonBinding = this.f84441g;
        LinearLayout rootOrderContainerLL = mLayoutFixedButtonBinding.rootOrderContainerLL;
        Intrinsics.checkNotNullExpressionValue(rootOrderContainerLL, "rootOrderContainerLL");
        int childCount = rootOrderContainerLL.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (rootOrderContainerLL.getChildAt(i15).getId() != mLayoutFixedButtonBinding.bubbleFixedContainerLL.getId()) {
                mLayoutFixedButtonBinding.rootOrderContainerLL.removeViewAt(i15);
            }
        }
        if (smallBorderlessButton != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SmallBorderlessButtonView smallBorderlessButtonView = new SmallBorderlessButtonView(context, null, 0, 6, null);
            WrappedBorderlessButtonHolderKt.bind(smallBorderlessButtonView, smallBorderlessButton, action);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            i11 = e.f91910g;
            i12 = e.f91906c;
            s.g(smallBorderlessButtonView, i11, 0, i12, 0, 10);
            i13 = e.f91906c;
            i14 = e.f91910g;
            layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i13, i14, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            smallBorderlessButtonView.setLayoutParams(layoutParams);
            smallBorderlessButtonView.setEnabled(c());
            mLayoutFixedButtonBinding.rootOrderContainerLL.addView(smallBorderlessButtonView);
        }
    }

    public final void k(@NotNull List<g> textList) {
        Intrinsics.checkNotNullParameter(textList, "textList");
        LinearLayout fixedTitleLL = this.f84441g.fixedTitleLL;
        Intrinsics.checkNotNullExpressionValue(fixedTitleLL, "fixedTitleLL");
        e(fixedTitleLL, textList);
    }
}

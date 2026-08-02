package ru.ozon.android.messenger.blocks.buttons.presentation.flex;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
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
import ru.ozon.app.android.messenger.databinding.MLayoutFlexButtonBinding;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/messenger/blocks/buttons/presentation/flex/ChatButtonFlexLayout;", "Lru/ozon/android/messenger/blocks/buttons/presentation/a;", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChatButtonFlexLayout extends ru.ozon.android.messenger.blocks.buttons.presentation.a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final MLayoutFlexButtonBinding f84449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatButtonFlexLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        MLayoutFlexButtonBinding inflate = MLayoutFlexButtonBinding.inflate(c.c(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f84449c = inflate;
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ru.ozon.android.messenger.blocks.buttons.presentation.a.a(root, false);
    }

    @Override // ru.ozon.android.messenger.blocks.buttons.presentation.a
    public final void f() {
        View root = this.f84449c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        g(root);
    }

    public final void h(Icon icon, @NotNull d.a networkConfig) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        MLayoutFlexButtonBinding mLayoutFlexButtonBinding = this.f84449c;
        ImageView flexButtonIV = mLayoutFlexButtonBinding.flexButtonIV;
        Intrinsics.checkNotNullExpressionValue(flexButtonIV, "flexButtonIV");
        flexButtonIV.setVisibility(icon == null ? 8 : 0);
        if (icon != null) {
            if (c()) {
                Context context = flexButtonIV.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (h.b(context)) {
                    ru.ozon.android.messenger.utils.image.c.b(flexButtonIV, Icon.copy$default(icon, null, UniColors.TEXT_TERTIARY.getToken(), 1, null), Integer.valueOf(R$color.text_tertiary), networkConfig);
                } else {
                    ru.ozon.android.messenger.utils.image.c.b(flexButtonIV, icon, null, networkConfig);
                }
            } else {
                Icon copy$default = Icon.copy$default(icon, null, null, 1, null);
                Context context2 = flexButtonIV.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ru.ozon.android.messenger.utils.image.c.b(flexButtonIV, copy$default, Integer.valueOf(ThemeExtKt.themeColorRes(context2, R$attr.textOriginalpriceAvailable)), networkConfig);
            }
        }
        if (icon == null) {
            LinearLayout flexButtonTextLL = mLayoutFlexButtonBinding.flexButtonTextLL;
            Intrinsics.checkNotNullExpressionValue(flexButtonTextLL, "flexButtonTextLL");
            s.g(flexButtonTextLL, 0, 0, 0, 0, 14);
            i11 = e.f91908e;
            i12 = e.f91908e;
            s.g(this, 0, i11, 0, i12, 5);
            return;
        }
        LinearLayout flexButtonTextLL2 = mLayoutFlexButtonBinding.flexButtonTextLL;
        Intrinsics.checkNotNullExpressionValue(flexButtonTextLL2, "flexButtonTextLL");
        i13 = e.f91910g;
        s.g(flexButtonTextLL2, i13, 0, 0, 0, 14);
        i14 = e.f91907d;
        i15 = e.f91907d;
        s.g(this, 0, i14, 0, i15, 5);
    }

    public final void i(@NotNull List<g> textList) {
        Intrinsics.checkNotNullParameter(textList, "textList");
        LinearLayout flexButtonTextLL = this.f84449c.flexButtonTextLL;
        Intrinsics.checkNotNullExpressionValue(flexButtonTextLL, "flexButtonTextLL");
        e(flexButtonTextLL, textList);
    }
}

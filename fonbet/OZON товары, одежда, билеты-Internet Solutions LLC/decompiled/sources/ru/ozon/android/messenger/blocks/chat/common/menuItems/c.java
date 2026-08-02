package ru.ozon.android.messenger.blocks.chat.common.menuItems;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MContextMenuItemBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniTextStyles;

/* loaded from: classes10.dex */
public final class c extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d.a f84560a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MContextMenuItemBinding f84561b;

    /* renamed from: c, reason: collision with root package name */
    private b f84562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull View itemView, @NotNull d.a networkConfig, @NotNull Function2<? super ru.ozon.android.messenger.framework.navigation.action.a, ? super Map<String, MessengerTrackingInfo>, Unit> onClick) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f84560a = networkConfig;
        MContextMenuItemBinding bind = MContextMenuItemBinding.bind(itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.f84561b = bind;
        itemView.setOnClickListener(new TS.a(2, onClick, this));
    }

    public static void e(Function2 function2, c cVar) {
        b bVar = cVar.f84562c;
        if (bVar == null) {
            Intrinsics.n("itemVO");
            throw null;
        }
        ru.ozon.android.messenger.framework.navigation.action.a c11 = ru.ozon.android.messenger.framework.navigation.action.b.c(bVar.a());
        b bVar2 = cVar.f84562c;
        if (bVar2 != null) {
            function2.invoke(c11, bVar2.e());
        } else {
            Intrinsics.n("itemVO");
            throw null;
        }
    }

    public final void f(@NotNull b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f84562c = item;
        MContextMenuItemBinding mContextMenuItemBinding = this.f84561b;
        AppCompatImageView menuIcon = mContextMenuItemBinding.menuIcon;
        Intrinsics.checkNotNullExpressionValue(menuIcon, "menuIcon");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(menuIcon, Integer.valueOf(styleParser.parseColor(context, item.c().getTintColor(), R$color.bg_light_key)));
        AppCompatImageView menuIcon2 = mContextMenuItemBinding.menuIcon;
        Intrinsics.checkNotNullExpressionValue(menuIcon2, "menuIcon");
        ru.ozon.android.messenger.utils.image.c.a(menuIcon2, item.c().getIcon(), this.f84560a);
        mContextMenuItemBinding.menuLabel.setTextAppearance(UniTextStyles.BODY_300_X_SMALL.getResId());
        mContextMenuItemBinding.menuLabel.setText(item.d().getText());
        TextView textView = mContextMenuItemBinding.menuLabel;
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setTextColor(styleParser.parseColor(context2, item.d().getTextColor(), R$color.bg_light_key));
        LinearLayout linearLayout = mContextMenuItemBinding.contextMenuButton;
        Context context3 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        linearLayout.setBackgroundColor(styleParser.parseColor(context3, item.b(), R$color.graphic_solid_neutral));
    }
}

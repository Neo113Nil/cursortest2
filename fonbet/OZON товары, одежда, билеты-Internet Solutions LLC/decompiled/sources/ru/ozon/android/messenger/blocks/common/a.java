package ru.ozon.android.messenger.blocks.common;

import G.g;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

/* loaded from: classes10.dex */
public final class a {
    public static final void a(@NotNull ImageView imageView, z zVar) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (Intrinsics.d(zVar, z.f.f91568a)) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicActionPrimary)));
            imageView.setImageResource(R$drawable.ic_s_check);
            s.d(imageView);
            return;
        }
        if (Intrinsics.d(zVar, z.e.f91567a)) {
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context2, R$attr.graphicActionPrimary)));
            imageView.setImageResource(R$drawable.ic_s_check_seen);
            s.d(imageView);
            return;
        }
        if (Intrinsics.d(zVar, z.b.f91564a)) {
            Context context3 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context3, R$attr.graphicNegativePrimary)));
            imageView.setImageResource(R$drawable.m_ic_m_alert_input_filled_compact_accent);
            s.d(imageView);
            return;
        }
        if (!Intrinsics.d(zVar, z.a.f91563a)) {
            s.a(imageView);
            return;
        }
        Context context4 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context4, R$attr.bgWarningPrimary)));
        imageView.setImageResource(R$drawable.ic_m_exclamation_filled);
        s.d(imageView);
    }

    public static final void b(@NotNull TextView textView, String str, @NotNull ru.ozon.android.messenger.framework.presentation.models.s messageInfo) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(messageInfo, "messageInfo");
        textView.setText((messageInfo.n() == null || str == null) ? str : g.c(messageInfo.n(), " ", str));
        if (messageInfo.r()) {
            Intrinsics.checkNotNullParameter(textView, "<this>");
            textView.setVisibility(4);
        } else if (messageInfo.o() || str == null) {
            s.a(textView);
        } else {
            s.d(textView);
        }
    }
}

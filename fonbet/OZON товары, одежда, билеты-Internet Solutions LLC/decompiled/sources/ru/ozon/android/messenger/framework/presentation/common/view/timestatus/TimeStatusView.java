package ru.ozon.android.messenger.framework.presentation.common.view.timestatus;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/common/view/timestatus/TimeStatusView;", "Landroid/widget/LinearLayout;", "Lru/ozon/android/messenger/framework/presentation/common/view/timestatus/a;", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimeStatusView extends LinearLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f91285a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f91286b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f91287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeStatusView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91285a = k.b(new g(context, this));
        this.f91286b = k.b(new e(context, this));
        this.f91287c = k.b(new f(context, this));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        setGravity(16);
        setBackgroundResource(R$drawable.m_bg_time_status);
        addView(g());
        addView(e());
        addView(f());
    }

    private final ImageView e() {
        return (ImageView) this.f91286b.getValue();
    }

    private final LoaderView f() {
        return (LoaderView) this.f91287c.getValue();
    }

    private final AppCompatTextView g() {
        return (AppCompatTextView) this.f91285a.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.timestatus.a
    public final void a(int i11) {
        AppCompatTextView g10 = g();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "<this>");
        g10.setTextColor(androidx.core.content.a.getColor(context, i11));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.timestatus.a
    public final void b(@NotNull z status, int i11) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (Intrinsics.d(status, z.f.f91568a)) {
            s.f(g(), new h(false, this));
            s.a(f());
            ImageView e11 = e();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(e11, Integer.valueOf(ru.ozon.android.messenger.utils.c.b(i11, context)));
            e().setImageResource(R$drawable.ic_s_check);
            e().setContentDescription("message_status_sent");
            s.d(e());
            return;
        }
        if (Intrinsics.d(status, z.e.f91567a)) {
            s.f(g(), new h(false, this));
            s.a(f());
            ImageView e12 = e();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ThemeExtKt.tint(e12, Integer.valueOf(ru.ozon.android.messenger.utils.c.b(i11, context2)));
            e().setImageResource(R$drawable.ic_s_check_seen);
            e().setContentDescription("message_status_seen");
            s.d(e());
            return;
        }
        if (Intrinsics.d(status, z.c.f91565a)) {
            s.f(g(), new h(false, this));
            s.a(e());
            LoaderView f7 = f();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            f7.setColor(ru.ozon.android.messenger.utils.c.b(i11, context3));
            s.d(f());
            return;
        }
        if (!Intrinsics.d(status, z.b.f91564a)) {
            s.a(f());
            s.a(e());
            s.f(g(), new h(true, this));
        } else {
            s.f(g(), new h(false, this));
            s.a(f());
            ThemeExtKt.tint(e(), Integer.valueOf(getContext().getColor(R$color.graphic_negative_primary)));
            e().setImageResource(R$drawable.m_ic_m_alert_input_filled_compact_accent);
            e().setContentDescription("message_status_failed");
            s.d(e());
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.timestatus.a
    public final void c(@NotNull String time, String str) {
        Intrinsics.checkNotNullParameter(time, "time");
        AppCompatTextView g10 = g();
        if (str != null && !kotlin.text.h.K(str) && !kotlin.text.h.K(time)) {
            time = G.g.c(str, " ", time);
        }
        g10.setText(time);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.timestatus.a
    public final void d(int i11) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "<this>");
        s.b(this, androidx.core.content.a.getColor(context, i11));
    }
}

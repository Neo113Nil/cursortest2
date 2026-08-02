package ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.MutableDateTime;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.N;

/* loaded from: classes10.dex */
public final class d extends AtomV3<TimerBadge, f> implements WrappedAtomHolder {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Locale f87638e = new Locale("ru", "RU");

    /* renamed from: a, reason: collision with root package name */
    private final org.joda.time.format.b f87639a;

    /* renamed from: b, reason: collision with root package name */
    private final org.joda.time.format.b f87640b;

    /* renamed from: c, reason: collision with root package name */
    private MutableDateTime f87641c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f87642d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(@NotNull Context context) {
        super(view, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        f view = new f(context, null, 0);
        view.setHeight(h.c(20));
        view.setGravity(17);
        view.setBackgroundResource(R$drawable.bg_badge_view);
        view.setTextAppearance(R$style.MTextStyle_Caption_Mono);
        int c11 = h.c(8);
        int c12 = h.c(2);
        view.setPadding(c11, c12, c11, c12);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f87639a = org.joda.time.format.a.b("HH:mm:ss");
        this.f87640b = org.joda.time.format.a.b("d MMMM").m(f87638e);
        getContainerView().setOnClickListener(new AS.a(this, 14));
        getContainerView().addOnAttachStateChangeListener(new a(this));
    }

    public static final void d(d dVar) {
        dVar.getContainerView().setText(dVar.f87639a.g(dVar.f87641c));
        B0 b02 = dVar.f87642d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        dVar.f87642d = C10727i.c(N.a(He.b.f10879b), null, null, new c(dVar, null), 3);
    }

    public static final void e(d dVar) {
        B0 b02 = dVar.f87642d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        dVar.f87642d = null;
    }

    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public final void onBind(AtomDTO atomDTO) {
        TimerBadge item = (TimerBadge) atomDTO;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind(item);
        f containerView = getContainerView();
        B0 b02 = this.f87642d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f87642d = null;
        this.f87641c = null;
        DateTime dateTime = new DateTime();
        if (dateTime.b(item.getExpirationDate())) {
            Duration duration = new Duration(dateTime, item.getExpirationDate());
            Duration d11 = Duration.d();
            long millis = duration.getMillis();
            long millis2 = d11.getMillis();
            if (millis >= millis2 && millis > millis2) {
                containerView.setText(containerView.getContext().getString(R$string.messenger_timer_until_date, this.f87640b.g(item.getExpirationDate())));
            } else {
                this.f87641c = new MutableDateTime(item.getExpirationDate().getMillis() - dateTime.getMillis(), DateTimeZone.f78989a);
            }
        } else {
            containerView.setText(containerView.getContext().getString(R$string.messenger_timer_ended_no_param));
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String backgroundColor = item.getBackgroundColor();
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        s.b(containerView, styleParser.parseColor(context, backgroundColor, ThemeExtKt.themeColorRes(context2, R$attr.layerFloor0)));
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        String textColor = item.getTextColor();
        Context context4 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        containerView.setTextColor(styleParser.parseColor(context3, textColor, ThemeExtKt.themeColorRes(context4, R$attr.textPrimary)));
    }
}

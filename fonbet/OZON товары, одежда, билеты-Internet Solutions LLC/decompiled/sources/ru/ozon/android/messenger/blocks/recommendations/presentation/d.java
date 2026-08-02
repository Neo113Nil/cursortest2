package ru.ozon.android.messenger.blocks.recommendations.presentation;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.MutableDateTime;
import ru.ozon.android.messenger.blocks.recommendations.e;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.N;

/* loaded from: classes10.dex */
public final class d extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Locale f86320g = new Locale("ru", "RU");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f86321h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final org.joda.time.format.b f86322a;

    /* renamed from: b, reason: collision with root package name */
    private final org.joda.time.format.b f86323b;

    /* renamed from: c, reason: collision with root package name */
    private MutableDateTime f86324c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f86325d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private BadgeView f86326e;

    /* renamed from: f, reason: collision with root package name */
    private e.a f86327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86322a = org.joda.time.format.a.b("HH:mm:ss");
        this.f86323b = org.joda.time.format.a.b("d MMMM").m(f86320g);
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        this.f86326e = badgeView;
        badgeView.addOnAttachStateChangeListener(new a(this));
        addView(badgeView);
    }

    public static final void d(d dVar) {
        BadgeDTO a11;
        e.a aVar = dVar.f86327f;
        if (aVar == null || (a11 = aVar.a()) == null) {
            return;
        }
        BadgeHolderKt.bindOrGone$default(dVar.f86326e, BadgeDTO.copy$default(a11, dVar.f86322a.g(dVar.f86324c), null, null, null, null, null, null, null, null, null, null, null, 4094, null), (Function1) null, 2, (Object) null);
        B0 b02 = dVar.f86325d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        dVar.f86325d = C10727i.c(N.a(He.b.f10879b), null, null, new b(dVar, null), 3);
    }

    public static final void e(d dVar) {
        B0 b02 = dVar.f86325d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        dVar.f86325d = null;
    }

    public final void f(@NotNull e.a vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.f86327f = vo;
        B0 b02 = this.f86325d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f86325d = null;
        this.f86324c = null;
        DateTime dateTime = new DateTime();
        boolean b11 = dateTime.b(vo.b());
        BadgeView badgeView = this.f86326e;
        if (!b11) {
            BadgeDTO a11 = vo.a();
            String string = getContext().getString(R$string.messenger_timer_ended_no_param);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            BadgeHolderKt.bindOrGone$default(badgeView, BadgeDTO.copy$default(a11, kotlin.text.h.z0(string).toString(), null, null, null, null, null, null, null, null, null, null, null, 4094, null), (Function1) null, 2, (Object) null);
            return;
        }
        Duration duration = new Duration(dateTime, vo.b());
        Duration d11 = Duration.d();
        long millis = duration.getMillis();
        long millis2 = d11.getMillis();
        if (millis >= millis2 && millis > millis2) {
            BadgeHolderKt.bindOrGone$default(badgeView, BadgeDTO.copy$default(vo.a(), getContext().getString(R$string.messenger_timer_until_date, this.f86323b.g(vo.b())), null, null, null, null, null, null, null, null, null, null, null, 4094, null), (Function1) null, 2, (Object) null);
            return;
        }
        DateTime b12 = vo.b();
        if (b12 != null) {
            this.f86324c = new MutableDateTime(b12.getMillis() - dateTime.getMillis(), DateTimeZone.f78989a);
        }
    }
}

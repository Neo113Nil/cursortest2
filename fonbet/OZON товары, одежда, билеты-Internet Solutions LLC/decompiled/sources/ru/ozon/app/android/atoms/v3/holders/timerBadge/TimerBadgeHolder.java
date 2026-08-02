package ru.ozon.app.android.atoms.v3.holders.timerBadge;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import io.reactivex.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.MutableDateTime;
import org.joda.time.format.a;
import org.joda.time.format.b;
import ru.ozon.app.android.atoms.R$string;
import ru.ozon.app.android.atoms.data.badge.TimerBadge;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.atoms.timerBadge.TimerBadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/timerBadge/TimerBadgeHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/badge/TimerBadge;", "Lru/ozon/app/android/uikit/view/atoms/timerBadge/TimerBadgeView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "", "atomContext", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/timerBadge/TimerBadgeView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "", "startTimer", "()V", "stopTimer", "item", "onBind", "(Lru/ozon/app/android/atoms/data/badge/TimerBadge;)V", "Lorg/joda/time/format/b;", "kotlin.jvm.PlatformType", "timeFormat", "Lorg/joda/time/format/b;", "dateFormat", "Lorg/joda/time/MutableDateTime;", "timerTime", "Lorg/joda/time/MutableDateTime;", "Lnc/b;", "timerDisposable", "Lnc/b;", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TimerBadgeHolder extends AtomV3<TimerBadge, TimerBadgeView> implements WrappedAtomHolder {
    private final b dateFormat;
    private final b timeFormat;
    private InterfaceC8487b timerDisposable;
    private MutableDateTime timerTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerBadgeHolder(@NotNull TimerBadgeView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.timeFormat = a.b("HH : mm : ss");
        this.dateFormat = a.b("d MMMM");
        getContainerView().setOnClickListener(new DQ.b(this, 8));
        getContainerView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.atoms.v3.holders.timerBadge.TimerBadgeHolder.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v11) {
                Intrinsics.checkNotNullParameter(v11, "v");
                if (TimerBadgeHolder.this.timerTime != null) {
                    TimerBadgeHolder.this.startTimer();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v11) {
                Intrinsics.checkNotNullParameter(v11, "v");
                TimerBadgeHolder.this.stopTimer();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(TimerBadgeHolder timerBadgeHolder, View view) {
        AtomAction atomAction;
        TimerBadge timerBadge = (TimerBadge) timerBadgeHolder.getData();
        AtomActionDTO action = timerBadge.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, timerBadge.getTrackingInfo())) == null) {
            return;
        }
        timerBadgeHolder.handleAction(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer() {
        getContainerView().setText(this.timeFormat.g(this.timerTime));
        this.timerDisposable = p.interval(1L, TimeUnit.SECONDS).observeOn(C8125a.a()).subscribe(new GJ.b(new TimerBadgeHolder$startTimer$1(this), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void stopTimer() {
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.timerDisposable = null;
        AtomActionDTO onStopAction = ((TimerBadge) getData()).getOnStopAction();
        if (onStopAction != null) {
            handleAction(AtomActionMapperKt.toAtomAction(onStopAction, ((TimerBadge) getData()).getTrackingInfo()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TimerBadge item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TimerBadgeHolder) item);
        TimerBadgeView containerView = getContainerView();
        stopTimer();
        this.timerTime = null;
        DateTime dateTime = new DateTime();
        if (dateTime.b(item.getExpirationDate())) {
            Duration duration = new Duration(dateTime, item.getExpirationDate());
            Duration d11 = Duration.d();
            long millis = duration.getMillis();
            long millis2 = d11.getMillis();
            if (millis >= millis2 && millis > millis2) {
                containerView.setText(StringProvider.getString(R$string.atoms_timer_until_date, this.dateFormat.g(item.getExpirationDate())));
            } else {
                this.timerTime = new MutableDateTime(item.getExpirationDate().getMillis() - dateTime.getMillis(), DateTimeZone.f78989a);
            }
        } else {
            containerView.setText(this.timeFormat.g(new DateTime(0L, DateTimeZone.f78989a)));
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewExtKt.setBackgroundTint(containerView, styleParser.parseColor(context, item.getBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY));
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        containerView.setTextColor(styleParser.parseColor(context2, item.getTextColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimerBadgeHolder(@NotNull Context context, String str) {
        this(new TimerBadgeView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

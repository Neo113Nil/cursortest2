package ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus;

import Sc.InterfaceC4008j;
import Sc.k;
import U7.d;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.core.graphics.drawable.b;
import ch0.C5835a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.C7232a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.unsorted.R$color;
import ru.ozon.app.android.fresh.unsorted.R$drawable;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.liveActivity.LiveActivityNotificationProvider;
import ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus.OrderStatusLiveActivityStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0019\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b.\u0010%J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\"H\u0016¢\u0006\u0004\b7\u00108R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010E\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR!\u0010J\u001a\b\u0012\u0004\u0012\u00020=0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010IR\u001b\u0010M\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bL\u0010)R\u001c\u0010N\u001a\u00020\t8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b\u0014\u0010)R$\u0010\u0018\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010R\"\u0004\b\u0011\u0010SR\u0016\u0010T\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010O¨\u0006U"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityNotificationProvider;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/LiveActivityNotificationProvider;", "Landroid/app/Application;", "application", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Landroid/app/Application;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "drawable", "Landroid/graphics/Bitmap;", "iconBitmap", "(I)Landroid/graphics/Bitmap;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;", "progressBar", "", "setProgress", "(Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;)V", "resId", "getTintColor", "(I)I", "setEstimatedProgress", "setTargetProgress", "progress", "setIconProgress", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$Button;", "actionButton", "setButton", "(Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$Button;)V", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ActionButton;", "bottomButton", "setBottomButton", "(Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ActionButton;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setButtonView", "(Ljava/lang/String;)V", "setRatingBarView", "()V", "getFlags", "()I", "deeplink", "Landroid/app/PendingIntent;", "provideIntent", "(Ljava/lang/String;)Landroid/app/PendingIntent;", "setTitle", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO;", "data", "setSubtitle", "(Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO;)V", "Lch0/a;", "state", "channelId", "Landroid/app/Notification;", "provideNotification", "(Lch0/a;Ljava/lang/String;)Landroid/app/Notification;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/widget/RemoteViews;", "collapsedLayout$delegate", "LSc/j;", "getCollapsedLayout", "()Landroid/widget/RemoteViews;", "collapsedLayout", "expandedLayout$delegate", "getExpandedLayout", "expandedLayout", "", "layouts$delegate", "getLayouts", "()[Landroid/widget/RemoteViews;", "layouts", "defaultTintColor$delegate", "getDefaultTintColor", "defaultTintColor", "tintColor", "I", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "D", "(D)V", "progressDrawable", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderStatusLiveActivityNotificationProvider implements LiveActivityNotificationProvider {

    /* renamed from: collapsedLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j collapsedLayout;

    @NotNull
    private final Context context;

    /* renamed from: defaultTintColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultTintColor;

    /* renamed from: expandedLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j expandedLayout;

    @NotNull
    private final JsonParser jsonDeserializer;

    /* renamed from: layouts$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j layouts;
    private double progress;
    private int progressDrawable;
    private int tintColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode.values().length];
            try {
                iArr[OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode.TARGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode.ESTIMATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderStatusLiveActivityStateDTO.ProgressBar.TimerMode.ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OrderStatusLiveActivityNotificationProvider(@NotNull Application application, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
        this.collapsedLayout = k.b(new OrderStatusLiveActivityNotificationProvider$collapsedLayout$2(this));
        this.expandedLayout = k.b(new OrderStatusLiveActivityNotificationProvider$expandedLayout$2(this));
        this.layouts = k.b(new OrderStatusLiveActivityNotificationProvider$layouts$2(this));
        this.defaultTintColor = k.b(new OrderStatusLiveActivityNotificationProvider$defaultTintColor$2(this));
        this.tintColor = -1;
        this.progressDrawable = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteViews getCollapsedLayout() {
        return (RemoteViews) this.collapsedLayout.getValue();
    }

    private final int getDefaultTintColor() {
        return ((Number) this.defaultTintColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteViews getExpandedLayout() {
        return (RemoteViews) this.expandedLayout.getValue();
    }

    private final int getFlags() {
        return Build.VERSION.SDK_INT >= 31 ? 201326592 : 134217728;
    }

    private final RemoteViews[] getLayouts() {
        return (RemoteViews[]) this.layouts.getValue();
    }

    private final int getTintColor() {
        int i11 = this.tintColor;
        return i11 == -1 ? getDefaultTintColor() : i11;
    }

    private final Bitmap iconBitmap(int drawable) {
        Drawable a11 = C7232a.a(this.context, drawable);
        if (a11 == null) {
            return null;
        }
        a11.setTint(getTintColor());
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        return b.b(a11, 0, 0, 3);
    }

    private final PendingIntent provideIntent(String deeplink) {
        int flags = getFlags();
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, new Intent("android.intent.action.VIEW", Uri.parse(deeplink)), flags);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    private final void setBottomButton(OrderStatusLiveActivityStateDTO.ActionButton bottomButton) {
        RemoteViews expandedLayout = getExpandedLayout();
        if (bottomButton == null) {
            expandedLayout.setViewVisibility(R$id.bottom_button, 8);
            return;
        }
        expandedLayout.setViewVisibility(R$id.bottom_button, 0);
        expandedLayout.setOnClickPendingIntent(R$id.bottom_button, provideIntent(bottomButton.getActionLink()));
        expandedLayout.setTextViewText(R$id.bottom_button, bottomButton.getTitle());
    }

    private final void setButton(OrderStatusLiveActivityStateDTO.Button actionButton) {
        if (actionButton == null) {
            getExpandedLayout().setViewVisibility(R$id.action_button, 8);
            getExpandedLayout().setViewVisibility(R$id.rating_bar, 8);
        } else if (Intrinsics.d(actionButton.isRatingButton(), Boolean.TRUE)) {
            setRatingBarView();
        } else {
            setButtonView(actionButton.getTitle());
        }
    }

    private final void setButtonView(String title) {
        RemoteViews expandedLayout = getExpandedLayout();
        expandedLayout.setViewVisibility(R$id.rating_bar, 8);
        if (title != null) {
            expandedLayout.setViewVisibility(R$id.action_button, 0);
            expandedLayout.setTextViewText(R$id.action_button, title);
        }
    }

    private final void setEstimatedProgress(OrderStatusLiveActivityStateDTO.ProgressBar progressBar) {
        for (RemoteViews remoteViews : getLayouts()) {
            remoteViews.setViewVisibility(R$id.estimated_progress_text, 0);
            remoteViews.setViewVisibility(R$id.target_progress_text, 8);
            remoteViews.setViewVisibility(R$id.progress_icon, 8);
            remoteViews.setTextViewText(R$id.estimated_title, progressBar.getTitle());
            remoteViews.setTextViewText(R$id.estimated_subtitle, progressBar.getSubtitle());
        }
    }

    private final void setIconProgress(OrderStatusLiveActivityStateDTO.ProgressBar progress) {
        for (RemoteViews remoteViews : getLayouts()) {
            remoteViews.setViewVisibility(R$id.target_progress_text, 8);
            remoteViews.setViewVisibility(R$id.estimated_progress_text, 8);
            remoteViews.setViewVisibility(R$id.progress_icon, 0);
            OrderStatusLiveActivityStateDTO.ProgressBar.ProgressIcon icon = progress.getIcon();
            remoteViews.setImageViewBitmap(R$id.progress_icon, icon != null ? iconBitmap(icon.getResourceId()) : null);
        }
    }

    private final void setProgress(double d11) {
        this.progress = d11;
        if (0.0d <= d11 && d11 <= 0.24d) {
            this.progressDrawable = R$drawable.progress_value_1;
            return;
        }
        if (0.25d <= d11 && d11 <= 0.49d) {
            this.progressDrawable = R$drawable.progress_value_2;
            return;
        }
        if (0.5d <= d11 && d11 <= 0.74d) {
            this.progressDrawable = R$drawable.progress_value_3;
            return;
        }
        if (0.75d <= d11 && d11 <= 0.84d) {
            this.progressDrawable = R$drawable.progress_value_4;
            return;
        }
        if (0.85d <= d11 && d11 <= 0.94d) {
            this.progressDrawable = R$drawable.progress_value_5;
            return;
        }
        if (0.95d <= d11 && d11 <= 0.99d) {
            this.progressDrawable = R$drawable.progress_value_6;
        } else {
            if (1.0d > d11 || d11 > 1.1d) {
                return;
            }
            this.progressDrawable = R$drawable.progress_value_7;
        }
    }

    private final void setRatingBarView() {
        RemoteViews expandedLayout = getExpandedLayout();
        expandedLayout.setViewVisibility(R$id.rating_bar, 0);
        expandedLayout.setViewVisibility(R$id.action_button, 8);
    }

    private final void setSubtitle(OrderStatusLiveActivityStateDTO data) {
        int i11 = 0;
        if (data.getDeadlineTimestamp() == null || data.getServerTimestamp() == null) {
            RemoteViews[] layouts = getLayouts();
            int length = layouts.length;
            while (i11 < length) {
                RemoteViews remoteViews = layouts[i11];
                remoteViews.setChronometer(R$id.subtitle, SystemClock.elapsedRealtime(), null, false);
                remoteViews.setTextViewText(R$id.subtitle, data.getSubtitle());
                i11++;
            }
            return;
        }
        String e11 = d.e(data.getSubtitle(), " %s мин");
        long millis = (data.getDeadlineTimestamp().getMillis() - data.getServerTimestamp().getMillis()) + SystemClock.elapsedRealtime();
        RemoteViews[] layouts2 = getLayouts();
        int length2 = layouts2.length;
        while (i11 < length2) {
            RemoteViews remoteViews2 = layouts2[i11];
            remoteViews2.setChronometerCountDown(R$id.subtitle, true);
            remoteViews2.setChronometer(R$id.subtitle, millis, e11, true);
            i11++;
        }
    }

    private final void setTargetProgress(OrderStatusLiveActivityStateDTO.ProgressBar progressBar) {
        for (RemoteViews remoteViews : getLayouts()) {
            remoteViews.setViewVisibility(R$id.target_progress_text, 0);
            remoteViews.setViewVisibility(R$id.estimated_progress_text, 8);
            remoteViews.setViewVisibility(R$id.progress_icon, 8);
            remoteViews.setTextViewText(R$id.target_title, progressBar.getTitle());
            remoteViews.setTextViewText(R$id.target_subtitle, progressBar.getSubtitle());
        }
    }

    private final void setTitle(String title) {
        for (RemoteViews remoteViews : getLayouts()) {
            remoteViews.setTextViewText(R$id.title, title);
        }
    }

    @Override // ru.ozon.app.android.fresh.unsorted.liveActivity.LiveActivityNotificationProvider
    @NotNull
    public Notification provideNotification(@NotNull C5835a state, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        OrderStatusLiveActivityStateDTO orderStatusLiveActivityStateDTO = (OrderStatusLiveActivityStateDTO) this.jsonDeserializer.fromJson(state.a(), OrderStatusLiveActivityStateDTO.class);
        this.tintColor = getTintColor(orderStatusLiveActivityStateDTO.getStatus().getColor());
        setTitle(orderStatusLiveActivityStateDTO.getTitle());
        setSubtitle(orderStatusLiveActivityStateDTO);
        setProgress(orderStatusLiveActivityStateDTO.getProgressBar());
        setButton(orderStatusLiveActivityStateDTO.getButton());
        setBottomButton(orderStatusLiveActivityStateDTO.getBottomButton());
        l.d dVar = new l.d(this.context, channelId);
        dVar.l(getCollapsedLayout());
        dVar.y(-1);
        dVar.k(getExpandedLayout());
        dVar.C(R$drawable.ic_live_activity_fresh);
        dVar.g(getTintColor(R$color.notification_fresh));
        dVar.F(new l.f());
        dVar.A(false);
        dVar.w(false);
        dVar.B();
        dVar.h(provideIntent(orderStatusLiveActivityStateDTO.getWidgetLink()));
        Intrinsics.checkNotNullExpressionValue(dVar, "setContentIntent(...)");
        Date b11 = state.b();
        if (b11 != null) {
            dVar.H(b11.getTime() - state.d().getTime());
        }
        Notification b12 = dVar.b();
        Intrinsics.checkNotNullExpressionValue(b12, "build(...)");
        return b12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTintColor(int resId) {
        return this.context.getResources().getColor(resId, this.context.getTheme());
    }

    private final void setProgress(OrderStatusLiveActivityStateDTO.ProgressBar progressBar) {
        setProgress(progressBar.getProgress());
        for (RemoteViews remoteViews : getLayouts()) {
            remoteViews.setInt(R$id.progress_value, "setColorFilter", getTintColor());
            remoteViews.setImageViewResource(R$id.progress_value, this.progressDrawable);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[progressBar.getMode().ordinal()];
        if (i11 == 1) {
            setTargetProgress(progressBar);
        } else if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            setIconProgress(progressBar);
        } else {
            setEstimatedProgress(progressBar);
        }
    }
}

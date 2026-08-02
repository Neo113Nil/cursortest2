package ru.ozon.app.android.travel.actionhandler.calendarEvent;

import Lm0.a;
import Sc.r;
import Sc.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.travel.actionhandler.R$string;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/calendarEvent/CalendarEventActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "location", "description", "", "startTime", "endTime", "", "isAllDay", "", "addCalendarEvent", "(Landroidx/fragment/app/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V", "Landroid/content/Context;", "Landroid/content/Intent;", "intent", "startActivitySafely", "(Landroid/content/Context;Landroid/content/Intent;Landroidx/fragment/app/m;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Ljava/text/DateFormat;", "dateFormat", "Ljava/text/DateFormat;", "Companion", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CalendarEventActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId = "calendarEvent";

    @NotNull
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/calendarEvent/CalendarEventActionHandler$Companion;", "", "<init>", "()V", "ISO_8601_TIME_FORMAT", "", "KEY_TITLE", "KEY_LOCATION", "KEY_DESCRIPTION", "KEY_START", "KEY_END", "KEY_IS_ALL_DAY", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void addCalendarEvent(ComponentCallbacksC5392m fragment, String title, String location, String description, long startTime, long endTime, boolean isAllDay) {
        Context requireContext;
        if (fragment == null || (requireContext = fragment.requireContext()) == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra(SelectionItemFormDTO.TITLE_FIELD_NAME, title);
        intent.putExtra("eventLocation", location);
        intent.putExtra("description", description);
        intent.putExtra("beginTime", startTime);
        intent.putExtra("endTime", endTime);
        intent.putExtra("allDay", isAllDay);
        intent.putExtra("calendar_timezone", "UTC");
        startActivitySafely(requireContext, intent, fragment);
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final void startActivitySafely(Context context, Intent intent, ComponentCallbacksC5392m componentCallbacksC5392m) {
        Object a11;
        ViewGroup rootView;
        try {
            r.Companion companion = r.INSTANCE;
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
                a11 = Unit.f71690a;
            } else {
                a11 = null;
                NotificationBarDelegate notificationBarDelegate = (componentCallbacksC5392m == null || (rootView = ContextExtKt.getRootView(componentCallbacksC5392m)) == null) ? null : new NotificationBarDelegate(rootView, componentCallbacksC5392m, null, 4, null);
                if (notificationBarDelegate != null) {
                    notificationBarDelegate.show(new NotificationDTO(StringProvider.getString(R$string.error_common_calendar_app_not_found_android), null, 0, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 506, null));
                    a11 = Unit.f71690a;
                }
            }
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        a.b bVar = a.f17149a;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            bVar.e(b11);
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.Click click;
        Map<String, String> params;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click) || (params = (click = (AtomAction.Click) action).getParams()) == null || (str = params.get("start")) == null) {
            return;
        }
        Date parse = this.dateFormat.parse(str);
        Long valueOf = parse != null ? Long.valueOf(parse.getTime()) : null;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            Map<String, String> params2 = click.getParams();
            if (params2 == null || (str2 = params2.get("end")) == null) {
                return;
            }
            Date parse2 = this.dateFormat.parse(str2);
            Long valueOf2 = parse2 != null ? Long.valueOf(parse2.getTime()) : null;
            if (valueOf2 != null) {
                long longValue2 = valueOf2.longValue();
                Map<String, String> params3 = click.getParams();
                if (params3 == null || (str3 = params3.get(SelectionItemFormDTO.TITLE_FIELD_NAME)) == null) {
                    return;
                }
                Map<String, String> params4 = click.getParams();
                String str5 = params4 != null ? params4.get("location") : null;
                Map<String, String> params5 = click.getParams();
                String str6 = params5 != null ? params5.get("description") : null;
                Map<String, String> params6 = click.getParams();
                addCalendarEvent(Sh.a.b(handlerRefs), str3, str5, str6, longValue, longValue2, (params6 == null || (str4 = params6.get("isAllDay")) == null) ? false : Boolean.parseBoolean(str4));
            }
        }
    }
}

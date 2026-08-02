package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.view.follownotification.FollowActionButton;
import java.time.Instant;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class s21 extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final Set a;
    public final Set b;
    public final Set c;
    public final int d;
    public boolean e;
    public r21 f;
    public ViewGroup g;
    public boolean h;

    public s21(Context context) {
        super(context, null, 0);
        this.a = ph0.a0(new String[]{StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_PRELIMINARY});
        this.b = ph0.a0(new String[]{StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_INTERRUPTED});
        this.c = ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_DELAYED});
        this.d = ao2.s(8, context);
        this.e = true;
    }

    public abstract Pair b();

    public final void c(Event event, FavoritesEventsData favoritesEventsData) {
        event.getClass();
        boolean disabled = Event.getHomeTeam$default(event, null, 1, null).getDisabled();
        boolean disabled2 = Event.getAwayTeam$default(event, null, 1, null).getDisabled();
        FollowActionButton followButtonFirstTeam = getFollowButtonFirstTeam();
        if (followButtonFirstTeam != null) {
            followButtonFirstTeam.h(Event.getHomeTeam$default(event, null, 1, null), favoritesEventsData);
            followButtonFirstTeam.setClickable(true);
            if (disabled && disabled2) {
                followButtonFirstTeam.setVisibility(8);
            } else {
                followButtonFirstTeam.setVisibility(disabled ? 4 : 0);
            }
        }
        FollowActionButton followButtonSecondTeam = getFollowButtonSecondTeam();
        if (followButtonSecondTeam != null) {
            followButtonSecondTeam.h(Event.getAwayTeam$default(event, null, 1, null), favoritesEventsData);
            followButtonSecondTeam.setClickable(true);
            if (disabled && disabled2) {
                followButtonSecondTeam.setVisibility(8);
            } else {
                followButtonSecondTeam.setVisibility(disabled2 ? 4 : 0);
            }
        }
    }

    public boolean d() {
        return this.h;
    }

    public final void e(Event event) {
        boolean B = fc6.B(fc6.t(Instant.ofEpochSecond(event.getStartTimestamp())));
        Pair b = b();
        TextView textView = (TextView) b.a;
        TextView textView2 = (TextView) b.b;
        textView2.setVisibility(0);
        String string = textView2.getContext().getString(R.string.today);
        if (!B) {
            string = null;
        }
        if (string == null) {
            long startTimestamp = event.getStartTimestamp();
            bi4 bi4Var = bi4.PATTERN_DMY;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            string = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
        }
        Context context = textView2.getContext();
        context.getClass();
        long startTimestamp2 = event.getStartTimestamp();
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
        bestPattern.getClass();
        textView2.setText(String.format("%s %s", Arrays.copyOf(new Object[]{string, fc6.i(startTimestamp2, hk4.a(bestPattern))}, 2)));
        haa.E(textView2);
        Context context2 = textView.getContext();
        context2.getClass();
        textView.setText(afi.c(context2, event.getStatusDescription(), ok3.s(event), true));
        textView.setVisibility(0);
    }

    public final void f(long j) {
        Pair b = b();
        TextView textView = (TextView) b.a;
        TextView textView2 = (TextView) b.b;
        haa.E(textView2);
        Context context = getContext();
        context.getClass();
        c6o.L(context, j, textView, textView2);
    }

    public final void g(TextView textView, long j, boolean z) {
        boolean z2 = textView.getVisibility() == 0;
        textView.setVisibility((!z || d()) ? 8 : 0);
        Context context = getContext();
        context.getClass();
        textView.setText(rik.j(context, j, bi4.PATTERN_DMY, " • "));
        if (z2 != (textView.getVisibility() == 0)) {
            this.e = true;
        }
    }

    @NotNull
    public abstract krk getBinding();

    public final int getDpToPx8() {
        return this.d;
    }

    @Nullable
    public abstract FollowActionButton getFollowButtonFirstTeam();

    @Nullable
    public abstract FollowActionButton getFollowButtonSecondTeam();

    @NotNull
    public final Set<String> getInProgressOrInterruptedStatuses() {
        return this.b;
    }

    @NotNull
    public final Set<String> getNotStartedStatuses() {
        return this.a;
    }

    @Nullable
    public final ViewGroup getResultView() {
        return this.g;
    }

    @NotNull
    public Set<String> getStoppedStatuses() {
        return this.c;
    }

    @Nullable
    public final r21 getViewStatus() {
        return this.f;
    }

    public void setChatHeader(boolean z) {
        this.h = z;
    }

    public abstract void setEvent(@NotNull Event event);

    public final void setLayoutChanged(boolean z) {
        this.e = z;
    }

    public final void setResultView(@Nullable ViewGroup viewGroup) {
        this.g = viewGroup;
    }

    public final void setViewStatus(@Nullable r21 r21Var) {
        this.f = r21Var;
    }
}

package com.sofascore.results.featuredtournament.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ao2;
import defpackage.dla;
import defpackage.mg2;
import defpackage.r8;
import defpackage.s16;
import defpackage.z8e;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/sofascore/results/featuredtournament/view/FeaturedTournamentCalendarRailView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "Ljava/time/ZonedDateTime;", "", "e", "Lkotlin/jvm/functions/Function1;", "getDateClickCallback", "()Lkotlin/jvm/functions/Function1;", "setDateClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "dateClickCallback", "getCurrentDate", "()Ljava/time/ZonedDateTime;", "currentDate", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeaturedTournamentCalendarRailView extends RecyclerView {
    public static final /* synthetic */ int f = 0;
    public final mg2 a;
    public final int b;
    public final SimpleDateFormat c;
    public List d;

    /* renamed from: e, reason: from kotlin metadata */
    public Function1 dateClickCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedTournamentCalendarRailView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        mg2 mg2Var = new mg2(context);
        this.a = mg2Var;
        this.b = ao2.s(56, context);
        this.c = new SimpleDateFormat("yyyy-MM-dd", dla.d());
        z8e.b0(this, context, false, false, null, 28);
        setAdapter(mg2Var);
        addOnLayoutChangeListener(new r8(this, 5));
        mg2Var.a.d = new s16(this, 22);
    }

    @Nullable
    public final ZonedDateTime getCurrentDate() {
        mg2 mg2Var = this.a;
        if (mg2Var.getItemCount() == 0) {
            return null;
        }
        return (ZonedDateTime) mg2Var.i.get(mg2Var.m);
    }

    @Nullable
    public final Function1<ZonedDateTime, Unit> getDateClickCallback() {
        return this.dateClickCallback;
    }

    public final void setDateClickCallback(@Nullable Function1<? super ZonedDateTime, Unit> function1) {
        this.dateClickCallback = function1;
    }
}

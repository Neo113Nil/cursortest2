package com.sofascore.results.event.lineups.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.Fc;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.eyd;
import defpackage.ht9;
import defpackage.ida;
import defpackage.joa;
import defpackage.jxe;
import defpackage.k9f;
import defpackage.ljg;
import defpackage.m4j;
import defpackage.o9g;
import defpackage.pco;
import defpackage.qa5;
import defpackage.tba;
import defpackage.tda;
import defpackage.u6h;
import defpackage.uda;
import defpackage.wzb;
import defpackage.x6k;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/sofascore/results/event/lineups/view/RugbyLineupsFieldView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "", "a", "Lkotlin/jvm/functions/Function1;", "getPlayerClickListener", "()Lkotlin/jvm/functions/Function1;", "setPlayerClickListener", "(Lkotlin/jvm/functions/Function1;)V", "playerClickListener", "b", "Ljoa;", "getPlayerWidth", "()I", "playerWidth", a.q, "getPlayerHeight", "playerHeight", "getIntrinsicWidth", "intrinsicWidth", "getIntrinsicHeight", "intrinsicHeight", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RugbyLineupsFieldView extends FrameLayout {
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public Function1 playerClickListener;

    /* renamed from: b, reason: from kotlin metadata */
    public final joa playerWidth;

    /* renamed from: c, reason: from kotlin metadata */
    public final joa playerHeight;
    public final Point d;
    public final LinkedHashMap e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RugbyLineupsFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        k9f k9fVar = new k9f(context, 3);
        ysa ysaVar = ysa.c;
        this.playerWidth = ypa.a(ysaVar, k9fVar);
        this.playerHeight = ypa.a(ysaVar, new k9f(context, 4));
        this.d = new Point();
        this.e = new LinkedHashMap();
        setBackgroundResource(R.drawable.ic_rugby_terrain_full);
        setLayoutDirection(0);
    }

    private final int getIntrinsicHeight() {
        Context context = getContext();
        context.getClass();
        return ao2.s(608, context);
    }

    private final int getIntrinsicWidth() {
        Context context = getContext();
        context.getClass();
        return ao2.s(344, context);
    }

    private final int getPlayerHeight() {
        return ((Number) this.playerHeight.getValue()).intValue();
    }

    private final int getPlayerWidth() {
        return ((Number) this.playerWidth.getValue()).intValue();
    }

    public final void a() {
        removeAllViews();
        this.e.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z, o9g o9gVar, m4j m4jVar) {
        Iterator it;
        Bitmap bitmap;
        List<Incident.CardIncident> cardIncidents;
        Drawable drawable;
        ViewGroup.LayoutParams layoutParams;
        Drawable f;
        Incident.SubstitutionIncident substitutionIncident;
        Drawable drawable2;
        Drawable drawable3;
        o9g o9gVar2 = o9gVar;
        o9gVar2.getClass();
        a();
        this.f = z;
        Iterator it2 = o9gVar2.a.iterator();
        while (it2.hasNext()) {
            PlayerData playerData = (PlayerData) it2.next();
            String jerseyNumber = playerData.getJerseyNumber();
            if (jerseyNumber != null) {
                int i2 = 1;
                IntRange intRange = new IntRange(1, this.f ? 7 : 15, 1);
                Integer intOrNull = StringsKt.toIntOrNull(jerseyNumber);
                if (intOrNull != null && intRange.d(intOrNull.intValue())) {
                    Context context = getContext();
                    context.getClass();
                    uda udaVar = new uda(context);
                    jxe[] jxeVarArr = jxe.a;
                    int i3 = o9gVar2.b;
                    eyd eydVar = new eyd(15, this, playerData);
                    Context context2 = udaVar.getContext();
                    context2.getClass();
                    tda tdaVar = new tda(context2);
                    String J = pco.J(i, m4jVar.a, SearchResponseKt.PLAYER_ENTITY);
                    ida idaVar = new ida(tdaVar, i2);
                    Context context3 = tdaVar.a;
                    ht9 ht9Var = new ht9(context3);
                    ht9Var.c = J;
                    ht9Var.f = ljg.j(i3, J);
                    ht9Var.i = ljg.j(i3, J);
                    ht9Var.c(J + i3);
                    z8e.Q(ht9Var, context3, R.drawable.ic_jersey_placeholder, null, Integer.valueOf(R.color.neutral_default));
                    ht9Var.d = new x6k(11, idaVar, tdaVar, idaVar);
                    ajh.a(context3).a(ht9Var.a());
                    String jerseyNumber2 = playerData.getJerseyNumber();
                    if (jerseyNumber2 == null) {
                        jerseyNumber2 = "";
                    }
                    tdaVar.m = jerseyNumber2;
                    int length = jerseyNumber2.length();
                    Paint paint = tdaVar.p;
                    if (length > 2) {
                        paint.setTextSize(ao2.u(12, context3));
                    }
                    paint.setColor(i3);
                    String str = tdaVar.m;
                    paint.getTextBounds(str, 0, str.length(), tdaVar.n);
                    List<Incident.SubstitutionIncident> substitutionIncidents = playerData.getSubstitutionIncidents();
                    qa5 qa5Var = qa5.a;
                    if (substitutionIncidents != null && (substitutionIncident = (Incident.SubstitutionIncident) CollectionsKt.firstOrNull(substitutionIncidents)) != null) {
                        if (Boolean.valueOf(substitutionIncident.getInjury()).equals(Boolean.TRUE)) {
                            Drawable drawable4 = context3.getDrawable(R.drawable.ic_swap_injured_16);
                            if (drawable4 == null || (drawable3 = drawable4.mutate()) == null) {
                                drawable3 = null;
                            }
                            if (drawable3 != null) {
                                bitmap = u6h.U(drawable3, 0, 0, 7);
                                tdaVar.k = bitmap;
                                cardIncidents = playerData.getCardIncidents();
                                if (cardIncidents == null) {
                                    Iterator it3 = cardIncidents.iterator();
                                    drawable = null;
                                    boolean z2 = false;
                                    while (it3.hasNext()) {
                                        Iterator it4 = it3;
                                        String incidentClass = ((Incident.CardIncident) it3.next()).getIncidentClass();
                                        Iterator it5 = it2;
                                        if (Intrinsics.c(incidentClass, Incident.CardIncident.CARD_RED)) {
                                            Paint paint2 = new Paint();
                                            paint2.setAlpha(89);
                                            tdaVar.o = paint2;
                                            paint.setAlpha(89);
                                            f = qa5.f(qa5Var, context3, R.drawable.ic_card_red_16, null, 6);
                                        } else if (Intrinsics.c(incidentClass, Incident.CardIncident.CARD_YELLOW_RED)) {
                                            Paint paint3 = new Paint();
                                            paint3.setAlpha(89);
                                            tdaVar.o = paint3;
                                            paint.setAlpha(89);
                                            f = qa5.f(qa5Var, context3, R.drawable.ic_yellow_double_16, null, 6);
                                        } else {
                                            if (!z2) {
                                                drawable = qa5.f(qa5Var, context3, R.drawable.ic_card_yellow_16, null, 6);
                                            }
                                            it2 = it5;
                                            it3 = it4;
                                        }
                                        drawable = f;
                                        z2 = true;
                                        it2 = it5;
                                        it3 = it4;
                                    }
                                } else {
                                    drawable = null;
                                }
                                it = it2;
                                if (drawable != null) {
                                    tdaVar.l = u6h.U(drawable, 0, 0, 7);
                                }
                                tdaVar.i = Math.max(tdaVar.s.width(), tdaVar.d + tdaVar.v.width());
                                LineupsPlayerTextView lineupsPlayerTextView = (LineupsPlayerTextView) udaVar.d.c;
                                lineupsPlayerTextView.setTopDrawable(tdaVar);
                                String str2 = !Intrinsics.c(playerData.getCaptain(), Boolean.TRUE) ? "(c) " : null;
                                String str3 = str2 != null ? str2 : "";
                                lineupsPlayerTextView.setText(str3 + tba.t(playerData.getPlayer()));
                                lineupsPlayerTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, tdaVar, (Drawable) null, (Drawable) null);
                                TypedValue typedValue = new TypedValue();
                                lineupsPlayerTextView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                                lineupsPlayerTextView.setBackgroundResource(typedValue.resourceId);
                                lineupsPlayerTextView.setOnClickListener(eydVar);
                                addView(udaVar);
                                layoutParams = udaVar.getLayoutParams();
                                if (layoutParams != null) {
                                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                    return;
                                }
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                c(layoutParams2, jerseyNumber);
                                udaVar.setLayoutParams(layoutParams2);
                                this.e.put(jerseyNumber, udaVar);
                                o9gVar2 = o9gVar;
                                it2 = it;
                            }
                        } else if (Intrinsics.c(substitutionIncident.getIncidentClass(), Incident.GoalIncident.TYPE_TEMPORARY)) {
                            Drawable drawable5 = context3.getDrawable(R.drawable.ic_swap_temporary);
                            if (drawable5 == null || (drawable2 = drawable5.mutate()) == null) {
                                drawable2 = null;
                            }
                            if (drawable2 != null) {
                                bitmap = u6h.U(drawable2, 0, 0, 7);
                                tdaVar.k = bitmap;
                                cardIncidents = playerData.getCardIncidents();
                                if (cardIncidents == null) {
                                }
                                it = it2;
                                if (drawable != null) {
                                }
                                tdaVar.i = Math.max(tdaVar.s.width(), tdaVar.d + tdaVar.v.width());
                                LineupsPlayerTextView lineupsPlayerTextView2 = (LineupsPlayerTextView) udaVar.d.c;
                                lineupsPlayerTextView2.setTopDrawable(tdaVar);
                                if (!Intrinsics.c(playerData.getCaptain(), Boolean.TRUE)) {
                                }
                                if (str2 != null) {
                                }
                                lineupsPlayerTextView2.setText(str3 + tba.t(playerData.getPlayer()));
                                lineupsPlayerTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, tdaVar, (Drawable) null, (Drawable) null);
                                TypedValue typedValue2 = new TypedValue();
                                lineupsPlayerTextView2.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue2, true);
                                lineupsPlayerTextView2.setBackgroundResource(typedValue2.resourceId);
                                lineupsPlayerTextView2.setOnClickListener(eydVar);
                                addView(udaVar);
                                layoutParams = udaVar.getLayoutParams();
                                if (layoutParams != null) {
                                }
                            }
                        } else {
                            Drawable f2 = qa5.f(qa5Var, context3, R.drawable.ic_swap_16, Integer.valueOf(R.color.primary_default), 4);
                            if (f2 != null) {
                                bitmap = u6h.U(f2, 0, 0, 7);
                                tdaVar.k = bitmap;
                                cardIncidents = playerData.getCardIncidents();
                                if (cardIncidents == null) {
                                }
                                it = it2;
                                if (drawable != null) {
                                }
                                tdaVar.i = Math.max(tdaVar.s.width(), tdaVar.d + tdaVar.v.width());
                                LineupsPlayerTextView lineupsPlayerTextView22 = (LineupsPlayerTextView) udaVar.d.c;
                                lineupsPlayerTextView22.setTopDrawable(tdaVar);
                                if (!Intrinsics.c(playerData.getCaptain(), Boolean.TRUE)) {
                                }
                                if (str2 != null) {
                                }
                                lineupsPlayerTextView22.setText(str3 + tba.t(playerData.getPlayer()));
                                lineupsPlayerTextView22.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, tdaVar, (Drawable) null, (Drawable) null);
                                TypedValue typedValue22 = new TypedValue();
                                lineupsPlayerTextView22.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue22, true);
                                lineupsPlayerTextView22.setBackgroundResource(typedValue22.resourceId);
                                lineupsPlayerTextView22.setOnClickListener(eydVar);
                                addView(udaVar);
                                layoutParams = udaVar.getLayoutParams();
                                if (layoutParams != null) {
                                }
                            }
                        }
                    }
                    bitmap = null;
                    tdaVar.k = bitmap;
                    cardIncidents = playerData.getCardIncidents();
                    if (cardIncidents == null) {
                    }
                    it = it2;
                    if (drawable != null) {
                    }
                    tdaVar.i = Math.max(tdaVar.s.width(), tdaVar.d + tdaVar.v.width());
                    LineupsPlayerTextView lineupsPlayerTextView222 = (LineupsPlayerTextView) udaVar.d.c;
                    lineupsPlayerTextView222.setTopDrawable(tdaVar);
                    if (!Intrinsics.c(playerData.getCaptain(), Boolean.TRUE)) {
                    }
                    if (str2 != null) {
                    }
                    lineupsPlayerTextView222.setText(str3 + tba.t(playerData.getPlayer()));
                    lineupsPlayerTextView222.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, tdaVar, (Drawable) null, (Drawable) null);
                    TypedValue typedValue222 = new TypedValue();
                    lineupsPlayerTextView222.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue222, true);
                    lineupsPlayerTextView222.setBackgroundResource(typedValue222.resourceId);
                    lineupsPlayerTextView222.setOnClickListener(eydVar);
                    addView(udaVar);
                    layoutParams = udaVar.getLayoutParams();
                    if (layoutParams != null) {
                    }
                }
            }
            it = it2;
            o9gVar2 = o9gVar;
            it2 = it;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final void c(FrameLayout.LayoutParams layoutParams, String str) {
        layoutParams.width = getPlayerWidth();
        layoutParams.height = getPlayerHeight();
        boolean z = this.f;
        Point point = this.d;
        if (!z) {
            int hashCode = str.hashCode();
            switch (hashCode) {
                case 49:
                    if (str.equals("1")) {
                        point.set(6, 54);
                        break;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        point.set(138, 54);
                        break;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        point.set(270, 54);
                        break;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        point.set(72, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                        break;
                    }
                    break;
                case 53:
                    if (str.equals(CampaignEx.CLICKMODE_ON)) {
                        point.set(204, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                        break;
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        point.set(6, 182);
                        break;
                    }
                    break;
                case 55:
                    if (str.equals(Fc.e)) {
                        point.set(270, 182);
                        break;
                    }
                    break;
                case 56:
                    if (str.equals("8")) {
                        point.set(138, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);
                        break;
                    }
                    break;
                case 57:
                    if (str.equals("9")) {
                        point.set(6, 286);
                        break;
                    }
                    break;
                default:
                    switch (hashCode) {
                        case 1567:
                            if (str.equals("10")) {
                                point.set(72, 326);
                                break;
                            }
                            break;
                        case 1568:
                            if (str.equals("11")) {
                                point.set(6, 446);
                                break;
                            }
                            break;
                        case 1569:
                            if (str.equals("12")) {
                                point.set(138, 366);
                                break;
                            }
                            break;
                        case 1570:
                            if (str.equals("13")) {
                                point.set(204, 406);
                                break;
                            }
                            break;
                        case 1571:
                            if (str.equals("14")) {
                                point.set(270, 446);
                                break;
                            }
                            break;
                        case 1572:
                            if (str.equals("15")) {
                                point.set(138, 482);
                                break;
                            }
                            break;
                    }
            }
        } else {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        point.set(12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                        break;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        point.set(96, 142);
                        break;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        point.set(180, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                        break;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        point.set(12, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
                        break;
                    }
                    break;
                case 53:
                    if (str.equals(CampaignEx.CLICKMODE_ON)) {
                        point.set(96, 344);
                        break;
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        point.set(180, 384);
                        break;
                    }
                    break;
                case 55:
                    if (str.equals(Fc.e)) {
                        point.set(264, 424);
                        break;
                    }
                    break;
            }
        }
        int i = point.x;
        Context context = getContext();
        context.getClass();
        point.x = wzb.b((((ao2.u(i, context) + (getPlayerWidth() / 2)) * getWidth()) / getIntrinsicWidth()) - (getPlayerWidth() / 2));
        int i2 = point.y;
        Context context2 = getContext();
        context2.getClass();
        int b = wzb.b((((ao2.u(i2, context2) + (getPlayerHeight() / 2)) * getHeight()) / getIntrinsicHeight()) - (getPlayerHeight() / 2));
        point.y = b;
        layoutParams.setMargins(point.x, b, 0, 0);
    }

    @Nullable
    public final Function1<Integer, Unit> getPlayerClickListener() {
        return this.playerClickListener;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE && mode != 1073741824 && size < (intrinsicWidth = getIntrinsicWidth())) {
            size = intrinsicWidth;
        }
        int b = wzb.b(size * 1.7674419f);
        if (mode2 == Integer.MIN_VALUE ? b <= size2 : mode2 != 1073741824) {
            size2 = b;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        for (Map.Entry entry : this.e.entrySet()) {
            String str = (String) entry.getKey();
            uda udaVar = (uda) entry.getValue();
            ViewGroup.LayoutParams layoutParams = udaVar.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            } else {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                c(layoutParams2, str);
                udaVar.setLayoutParams(layoutParams2);
            }
        }
    }

    public final void setPlayerClickListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.playerClickListener = function1;
    }
}

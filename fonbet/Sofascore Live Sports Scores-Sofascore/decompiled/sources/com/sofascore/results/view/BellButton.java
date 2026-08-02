package com.sofascore.results.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.favorites.FavoritesStagesData;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageType;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.vungle.ads.internal.task.g;
import defpackage.au1;
import defpackage.e1d;
import defpackage.e92;
import defpackage.eoh;
import defpackage.f31;
import defpackage.f5p;
import defpackage.kq7;
import defpackage.ls1;
import defpackage.mi;
import defpackage.nfc;
import defpackage.nv;
import defpackage.qa6;
import defpackage.qh;
import defpackage.rq3;
import defpackage.s1;
import defpackage.su8;
import defpackage.t6a;
import defpackage.u0a;
import defpackage.u2;
import defpackage.vu;
import defpackage.wu;
import defpackage.x9h;
import defpackage.xe8;
import defpackage.xu;
import defpackage.yaa;
import defpackage.yt1;
import defpackage.ze8;
import defpackage.zt1;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028T@TX\u0094\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sofascore/results/view/BellButton;", "Lf31;", "Lxe8;", "<set-?>", InneractiveMediationDefs.GENDER_FEMALE, "Le1d;", "getState", "()Lxe8;", "setState", "(Lxe8;)V", "state", "Lwu;", g.e, "Lwu;", "getFollowSource", "()Lwu;", "setFollowSource", "(Lwu;)V", "followSource", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BellButton extends f31 {
    public static final /* synthetic */ int h = 0;

    /* renamed from: f, reason: from kotlin metadata */
    public final e1d state;

    /* renamed from: g, reason: from kotlin metadata */
    public wu followSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BellButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.state = e.f(xe8.Inactive);
        this.followSource = wu.MAIN_FAVORITES;
    }

    @Override // defpackage.f31
    public final void b() {
        HashSet<EventType> typeListNotifications;
        Object followableItem = getFollowableItem();
        int i = 2;
        if (!(followableItem instanceof Event)) {
            if (followableItem instanceof Stage) {
                Stage stage = (Stage) followableItem;
                HashSet<StageType> typeList = stage.getTypeList();
                if (typeList.isEmpty()) {
                    typeList.add(StageType.MY_STAGE);
                    setState(xe8.Active);
                    Context context = getContext();
                    context.getClass();
                    t6a.m(context, stage);
                    Context context2 = getContext();
                    context2.getClass();
                    f31.c(context2, new s1(21, this, stage));
                    return;
                }
                StageType stageType = StageType.MUTED;
                if (!typeList.contains(stageType)) {
                    if (typeList.contains(StageType.MY_UNIQUE_STAGE)) {
                        getBellButtonPopup().g(this, stage, new mi(8, this, stage, typeList));
                        return;
                    } else {
                        getBellButtonPopup().f(this, stage, new yt1(this, 2));
                        return;
                    }
                }
                Context context3 = getContext();
                context3.getClass();
                nv.y(context3, vu.UNMUTE_NOTIFICATION, xu.STAGE, stage.getId(), getFollowSource());
                typeList.remove(stageType);
                setState(xe8.Active);
                Context context4 = getContext();
                context4.getClass();
                u0a.N(stage.getId(), context4);
                return;
            }
            if (followableItem instanceof UniqueStage) {
                xe8 state = getState();
                if ((state != null ? zt1.a[state.ordinal()] : -1) == 1) {
                    setState(xe8.Inactive);
                    Context context5 = getContext();
                    context5.getClass();
                    UniqueStage uniqueStage = (UniqueStage) followableItem;
                    t6a.J(uniqueStage.getId(), context5);
                    Context context6 = getContext();
                    context6.getClass();
                    nv.y(context6, vu.REMOVE_NOTIFICATION, xu.UNIQUE_STAGE, uniqueStage.getId(), getFollowSource());
                    return;
                }
                setState(xe8.Active);
                Context context7 = getContext();
                context7.getClass();
                UniqueStage uniqueStage2 = (UniqueStage) followableItem;
                t6a.n(uniqueStage2.getId(), context7);
                Context context8 = getContext();
                context8.getClass();
                f31.c(context8, new s1(22, this, uniqueStage2));
                Context context9 = getContext();
                context9.getClass();
                nv.y(context9, vu.ADD_NOTIFICATION, xu.UNIQUE_STAGE, uniqueStage2.getId(), getFollowSource());
                return;
            }
            if (followableItem instanceof UniqueTournament) {
                xe8 state2 = getState();
                if ((state2 != null ? zt1.a[state2.ordinal()] : -1) == 1) {
                    setState(xe8.Inactive);
                    Context context10 = getContext();
                    context10.getClass();
                    UniqueTournament uniqueTournament = (UniqueTournament) followableItem;
                    yaa.O(uniqueTournament.getId(), context10);
                    Context context11 = getContext();
                    context11.getClass();
                    nv.y(context11, vu.REMOVE_FAVORITE, xu.UNIQUE_TOURNAMENT, uniqueTournament.getId(), getFollowSource());
                    return;
                }
                setState(xe8.Active);
                Context context12 = getContext();
                context12.getClass();
                UniqueTournament uniqueTournament2 = (UniqueTournament) followableItem;
                yaa.k(uniqueTournament2.getId(), true, context12);
                Context context13 = getContext();
                context13.getClass();
                nv.y(context13, vu.ADD_FAVORITE, xu.UNIQUE_TOURNAMENT, uniqueTournament2.getId(), getFollowSource());
                Context context14 = getContext();
                context14.getClass();
                f31.c(context14, new s1(23, this, uniqueTournament2));
                return;
            }
            return;
        }
        Event event = (Event) followableItem;
        HashSet<EventType> typeList2 = event.getTypeList();
        if (typeList2 == null || typeList2.isEmpty()) {
            event.setTypeList(x9h.c(EventType.MY_GAMES));
            event.setMute(0);
            setState(xe8.Active);
            Context context15 = getContext();
            context15.getClass();
            nv.y(context15, vu.ADD_NOTIFICATION, xu.EVENT, event.getId(), getFollowSource());
            Context context16 = getContext();
            context16.getClass();
            su8.a(context16, event);
            Context context17 = getContext();
            context17.getClass();
            f31.c(context17, new u2(this, 24));
            return;
        }
        HashSet<EventType> typeList3 = event.getTypeList();
        if ((typeList3 != null && typeList3.contains(EventType.MUTED)) || (typeListNotifications = event.getTypeListNotifications()) == null || typeListNotifications.isEmpty()) {
            HashSet<EventType> typeList4 = event.getTypeList();
            if (typeList4 != null) {
                typeList4.remove(EventType.MUTED);
            }
            HashSet<EventType> typeList5 = event.getTypeList();
            if (typeList5 != null) {
                typeList5.add(EventType.MY_GAMES);
            }
            HashSet<EventType> typeListNotifications2 = event.getTypeListNotifications();
            if (typeListNotifications2 != null) {
                typeListNotifications2.remove(EventType.MUTED);
            }
            HashSet<EventType> typeListNotifications3 = event.getTypeListNotifications();
            if (typeListNotifications3 != null) {
                typeListNotifications3.add(EventType.NOTIFICATION_EDITED_ENABLED);
            }
            event.setMute(0);
            Context context18 = getContext();
            context18.getClass();
            int id = event.getId();
            qa6 qa6Var = su8.a;
            f5p.E(context18, new kq7(id, (rq3) null, i));
            Context context19 = getContext();
            context19.getClass();
            su8.a(context19, event);
            Context context20 = getContext();
            context20.getClass();
            nv.y(context20, vu.UNMUTE_NOTIFICATION, xu.EVENT, event.getId(), getFollowSource());
            Context context21 = getContext();
            context21.getClass();
            f31.c(context21, new ls1(18));
            return;
        }
        HashSet<EventType> typeList6 = event.getTypeList();
        if (typeList6 == null || !typeList6.contains(EventType.MY_GAMES)) {
            getBellButtonPopup().c(this, event, true);
            return;
        }
        au1 bellButtonPopup = getBellButtonPopup();
        yt1 yt1Var = new yt1(this, 0);
        yt1 yt1Var2 = new yt1(this, 1);
        bellButtonPopup.getClass();
        e92 h2 = e92.h(bellButtonPopup.a());
        bellButtonPopup.d = new PopupWindow((FrameLayout) h2.b, -2, -2);
        LinearLayout linearLayout = (LinearLayout) h2.f;
        linearLayout.setBackgroundResource(R.drawable.menu_background_surface);
        linearLayout.setElevation(bellButtonPopup.c);
        nfc nfcVar = (nfc) h2.c;
        TextView textView = nfcVar.c;
        ImageView imageView = nfcVar.b;
        Context context22 = bellButtonPopup.a;
        textView.setText(context22.getString(R.string.remove_from_favourites));
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.ic_delete);
        imageView.setImageTintList(ColorStateList.valueOf(context22.getColor(R.color.error)));
        nfcVar.a.setOnClickListener(new qh(event, yt1Var, bellButtonPopup, 5));
        nfc nfcVar2 = (nfc) h2.d;
        ConstraintLayout constraintLayout = nfcVar2.a;
        ImageView imageView2 = nfcVar2.b;
        constraintLayout.setOnClickListener(new qh(event, yt1Var2, bellButtonPopup, 6));
        imageView2.setVisibility(0);
        imageView2.setImageResource(R.drawable.ic_notification_mute);
        imageView2.setImageTintList(ColorStateList.valueOf(context22.getColor(R.color.neutral_default)));
        nfcVar2.c.setText(context22.getString(R.string.mute_event));
        PopupWindow popupWindow = bellButtonPopup.d;
        if (popupWindow != null) {
            bellButtonPopup.b(this, popupWindow);
        }
    }

    @Override // defpackage.f31
    public final ze8 d(FavoritesEventsData favoritesEventsData, FavoritesStagesData favoritesStagesData, List list) {
        HashSet<EventType> typeListNotifications;
        if (favoritesEventsData == null && favoritesStagesData == null && list == null) {
            return null;
        }
        Object followableItem = getFollowableItem();
        if (!(followableItem instanceof Event)) {
            if (!(followableItem instanceof Stage)) {
                return followableItem instanceof UniqueStage ? (favoritesStagesData == null || !favoritesStagesData.isUniqueStageFavorite(((UniqueStage) followableItem).getId())) ? xe8.Inactive : xe8.Active : followableItem instanceof UniqueTournament ? (favoritesEventsData == null || !favoritesEventsData.isLeagueFavorite(Integer.valueOf(((UniqueTournament) followableItem).getId()))) ? xe8.Inactive : xe8.Active : xe8.Inactive;
            }
            if (favoritesStagesData != null) {
                favoritesStagesData.populateEventType((Stage) followableItem);
            }
            Stage stage = (Stage) followableItem;
            return stage.getTypeList().isEmpty() ? xe8.Inactive : stage.getTypeList().contains(StageType.MUTED) ? xe8.Muted : xe8.Active;
        }
        if (favoritesEventsData != null) {
            favoritesEventsData.populateEventType((Event) followableItem);
        }
        Event event = (Event) followableItem;
        HashSet<EventType> typeList = event.getTypeList();
        if (typeList == null || typeList.isEmpty()) {
            return xe8.Inactive;
        }
        HashSet<EventType> typeList2 = event.getTypeList();
        return ((typeList2 != null && typeList2.contains(EventType.MUTED)) || (typeListNotifications = event.getTypeListNotifications()) == null || typeListNotifications.isEmpty()) ? xe8.Muted : xe8.Active;
    }

    public final void e(IRecent iRecent, wu wuVar) {
        iRecent.getClass();
        setFollowableItem(iRecent);
        setFollowSource(wuVar);
    }

    @Override // defpackage.f31
    @NotNull
    public wu getFollowSource() {
        return this.followSource;
    }

    @Override // defpackage.f31
    @Nullable
    public xe8 getState() {
        return (xe8) ((eoh) this.state).getValue();
    }

    @Override // defpackage.f31
    public void setFollowSource(@NotNull wu wuVar) {
        wuVar.getClass();
        this.followSource = wuVar;
    }

    @Override // defpackage.f31
    public void setState(@Nullable xe8 xe8Var) {
        ((eoh) this.state).setValue(xe8Var);
    }
}

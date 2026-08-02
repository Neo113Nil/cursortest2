package com.vk.movika.sdk.base.ui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.permission.dialog.VkSeparatePermissionDialog;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.reefton.utils.ReefNetworkUtil;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$PhotoParams;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TextEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.webrtc.chatroom.CallWaitingRoomEvent;
import xsna.anr0;
import xsna.apf0;
import xsna.b320;
import xsna.bny;
import xsna.bpn0;
import xsna.brm0;
import xsna.bwk0;
import xsna.c5g;
import xsna.cnr0;
import xsna.d11;
import xsna.dzf0;
import xsna.e3m;
import xsna.epx;
import xsna.evb0;
import xsna.fw3;
import xsna.gbn;
import xsna.go9;
import xsna.gzs;
import xsna.hbn;
import xsna.hof0;
import xsna.i6w;
import xsna.iag;
import xsna.il90;
import xsna.iy30;
import xsna.izs;
import xsna.j5g;
import xsna.kl90;
import xsna.krv0;
import xsna.l2y;
import xsna.l6w;
import xsna.moq0;
import xsna.mtk0;
import xsna.mvb0;
import xsna.n6j;
import xsna.o6a0;
import xsna.o9t;
import xsna.otp0;
import xsna.p7w;
import xsna.r3q;
import xsna.rdg;
import xsna.rhc0;
import xsna.rv9;
import xsna.s1t;
import xsna.s3q0;
import xsna.szv;
import xsna.trg;
import xsna.ubb0;
import xsna.udt;
import xsna.v1v0;
import xsna.vlo0;
import xsna.vo7;
import xsna.vof0;
import xsna.w0c0;
import xsna.wh50;
import xsna.wmy;
import xsna.xa4;
import xsna.xmy;
import xsna.xn50;
import xsna.y2p0;
import xsna.y7r;
import xsna.ym8;
import xsna.yof0;
import xsna.yzo;
import xsna.zof0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$25;
        PostingUserMessage postingUserMessage;
        String str;
        ?? r5;
        s3q0 onAttendee$lambda$0;
        StoryOwner storyOwner;
        int i = this.b;
        r6 = null;
        String str2 = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((y) obj2).d.A.e(((l0) obj).k.l);
                return s3q0.a;
            case 1:
                yzo yzoVar = (yzo) obj;
                int i2 = vo7.a.$EnumSwitchMapping$0[((BookingEditScreenState.InfoBlock) ((mtk0) obj2).getValue()).c.ordinal()];
                if (i2 == 1) {
                    return null;
                }
                if (i2 == 2) {
                    return yzoVar.a;
                }
                if (i2 == 3) {
                    return yzoVar.f;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                ((izs) obj2).invoke(new rv9.a.c(((CartItem.a) obj).c));
                return s3q0.a;
            case 3:
                ((izs) obj2).invoke(new rv9.e(((CartItem.c.b.a) ((CartItem.c) obj)).f));
                return s3q0.a;
            case 4:
                int i3 = CommentsOutherFragment.h0;
                return ((CommentsOutherFragment) obj2).io(((rdg.e) ((rdg) obj)).a);
            case 5:
                ((trg) obj2).b.d((ArrayList) obj);
                return s3q0.a;
            case 6:
                hbn hbnVar = (hbn) obj;
                y7r a = ((gbn) obj2).a();
                evb0 evb0Var = hbnVar.b;
                b320 b = evb0Var.b(hbnVar.e);
                mvb0 c = evb0Var.c();
                r3q r3qVar = hbnVar.c;
                return new ym8(a, b, c, r3qVar.b(), r3qVar.c(), hbnVar.d);
            case 7:
                ((izs) obj2).invoke(new o9t.a(((udt.c) obj).c));
                return s3q0.a;
            case 8:
                invoke$lambda$25 = HandleInvocationsFromAdViewer.invoke$lambda$25((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                return invoke$lambda$25;
            case 9:
                ((p7w) obj2).d.invoke(new i6w.w(((l6w.b.g) ((l6w.b) obj)).a));
                return s3q0.a;
            case 10:
                l2y l2yVar = (l2y) obj;
                return new cnr0((bpn0) obj2, l2yVar.L0(), l2yVar.w0());
            case 11:
                Context context = (Context) obj2;
                xmy xmyVar = (xmy) obj;
                bny.a.getClass();
                v1v0 v1v0Var = bny.i;
                if (v1v0Var == null) {
                    v1v0Var = null;
                }
                ArrayList b2 = v1v0Var.b(context);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : b2) {
                    if (!epx.f((xmy) obj3, xmyVar)) {
                        arrayList.add(obj3);
                    }
                }
                if (!bny.c(context, xmyVar)) {
                    PackageManager packageManager = context.getPackageManager();
                    String str3 = bny.c;
                    if (str3 == null) {
                        str3 = null;
                    }
                    packageManager.setComponentEnabledSetting(xmyVar.a(str3), 1, 1);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    xmy xmyVar2 = (xmy) it.next();
                    PackageManager packageManager2 = context.getPackageManager();
                    String str4 = bny.c;
                    if (str4 == null) {
                        str4 = null;
                    }
                    packageManager2.setComponentEnabledSetting(xmyVar2.a(str4), 2, 1);
                }
                Iterator it2 = bny.b.iterator();
                while (it2.hasNext()) {
                    ((wmy) it2.next()).a((xmy) j5g.a0(arrayList), xmyVar);
                }
                String str5 = bny.c;
                return xmyVar.a(str5 != null ? str5 : null);
            case 12:
                ((szv) obj2).e(xa4.L(((iy30) obj).c), null);
                return s3q0.a;
            case 13:
                il90.e eVar = (il90.e) obj;
                StringBuilder sb = new StringBuilder("participantsListeners: ");
                CopyOnWriteArraySet<il90> copyOnWriteArraySet = ((kl90) obj2).b;
                L.e("ParticipantListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<il90> it3 = copyOnWriteArraySet.iterator();
                while (it3.hasNext()) {
                    it3.next().t(eVar);
                }
                return s3q0.a;
            case 14:
                o6a0 o6a0Var = (o6a0) obj2;
                MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType c2 = o6a0Var.c();
                String a2 = o6a0Var.b.a();
                MobileOfficialAppsCorePhotoEditorStat$TextEvent mobileOfficialAppsCorePhotoEditorStat$TextEvent = MobileOfficialAppsCorePhotoEditorStat$TextEvent.SAVE_TEXT;
                Boolean valueOf = Boolean.valueOf(!r7.a.isEmpty());
                ArrayList arrayList2 = ((TextStatEvent.d) obj).a;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(vlo0.a((TextStatEvent.e) it4.next()));
                }
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(c2, a2, null, null, null, null, null, null, null, mobileOfficialAppsCorePhotoEditorStat$TextEvent, null, null, null, null, null, new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, valueOf, null, null, null, arrayList3, null, null, null, null, 2076180479, null), 32248, null);
            case 15:
                ubb0 ubb0Var = (ubb0) obj2;
                String str6 = (String) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", go9.b("pid=", str6)});
                }
                ubb0Var.c.a(str6);
                return s3q0.a;
            case 16:
                w0c0 w0c0Var = (w0c0) obj2;
                TextView textView = w0c0Var.C;
                int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                textView.getContext();
                e.b bVar = new e.b(textView, null, null, l2, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                bVar.e = ((ViewGroup) obj).getContext();
                bVar.l = w0c0Var.E;
                return bVar.a();
            case 17:
                xn50.a.c(((rhc0) obj2).c, new PostingAction.Editing.PrivacySettingsChanged(PostPrivacyData.a((PostPrivacyData) obj, null, null, null, null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE)));
                return s3q0.a;
            case 18:
                izs izsVar = (izs) obj2;
                ActionsAvailabilityState.Availability availability = ((ActionsAvailabilityState.AttachmentState) obj).b;
                PostingAction.Navigation.OpenInCurrentStep openInCurrentStep = new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.ProductsPicker.b);
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(openInCurrentStep);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, openInCurrentStep, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 19:
                com.vk.reefton.trackers.n nVar = (com.vk.reefton.trackers.n) obj2;
                vof0 vof0Var = (vof0) obj;
                hof0 hof0Var = nVar.a;
                WifiManager wifiManager = nVar.c;
                if (!hof0Var.b.l("android.permission.ACCESS_WIFI_STATE")) {
                    return s3q0.a;
                }
                if (wifiManager == null || !wifiManager.isWifiEnabled()) {
                    return s3q0.a;
                }
                ReefNetworkUtil reefNetworkUtil = nVar.b;
                apf0 apf0Var = nVar.d;
                ArrayList arrayList4 = apf0Var != null ? apf0Var.c : null;
                reefNetworkUtil.getClass();
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo == null || (str = connectionInfo.getBSSID()) == null) {
                    str = "";
                }
                if (arrayList4 != null) {
                    List<ScanResult> V = j5g.V(arrayList4);
                    r5 = new ArrayList(c5g.u(V, 10));
                    for (ScanResult scanResult : V) {
                        ?? y = brm0.y(str, StringUtils.PROCESS_POSTFIX_DELIMITER, "");
                        String y2 = brm0.y(scanResult.BSSID, StringUtils.PROCESS_POSTFIX_DELIMITER, "");
                        r5.add(new zof0(y.equals(y2), Float.valueOf(WifiManager.calculateSignalLevel(scanResult.level, 10) / 10.0f), Integer.valueOf(scanResult.level), y2, Integer.valueOf(scanResult.frequency)));
                    }
                } else {
                    r5 = EmptyList.b;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : (Iterable) r5) {
                    if (((zof0) obj4).b.floatValue() >= 0.6f) {
                        arrayList5.add(obj4);
                    }
                }
                nVar.e.getClass();
                yof0 yof0Var = new yof0(arrayList5);
                nVar.e = yof0Var;
                vof0Var.a(new yof0(yof0Var.a));
                return s3q0.a;
            case 20:
                dzf0 dzf0Var = (dzf0) obj2;
                Surface surface = (Surface) obj;
                s1t s1tVar = dzf0Var.k;
                if (s1tVar != null) {
                    s1tVar.b();
                }
                dzf0Var.k = surface != null ? new s1t(dzf0Var.a, dzf0Var.b, surface) : null;
                return s3q0.a;
            case 21:
                wh50 wh50Var = (wh50) obj;
                wh50Var.setValue(Boolean.valueOf(!((Boolean) wh50Var.getValue()).booleanValue()));
                Boolean bool = (Boolean) wh50Var.getValue();
                bool.getClass();
                ((izs) obj2).invoke(bool);
                return s3q0.a;
            case 22:
                ((VkSeparatePermissionDialog) obj2).Td(((FragmentActivity) obj).getSupportFragmentManager(), "");
                return s3q0.a;
            case 23:
                return new bwk0(((com.vk.clips.sdk.shared.item.static_ads.c) obj2).g, new d11(e3m.a(R.dimen.clip_owner_avatar_height, (Context) obj)));
            case 24:
                onAttendee$lambda$0 = StereoRoomManagerImpl.onAttendee$lambda$0((StereoRoomManagerImpl) obj2, (CallWaitingRoomEvent.Attendee) obj);
                return onAttendee$lambda$0;
            case 25:
                StoryEntry storyEntry = (StoryEntry) obj2;
                String str7 = (String) obj;
                StringBuilder sb2 = new StringBuilder("preload start entry ");
                n6j.b(sb2, storyEntry != null ? storyEntry.Kb() : null, " photo caching=", str7, " owner=");
                if (storyEntry != null && (storyOwner = storyEntry.l0) != null) {
                    str2 = storyOwner.Db();
                }
                sb2.append(str2);
                return sb2.toString();
            case 26:
                ((y2p0) obj2).a.p2(((y2p0.a.b) ((y2p0.a) obj)).a);
                return s3q0.a;
            case 27:
                otp0 otp0Var = (otp0) obj2;
                otp0Var.b0.bi(((iag) obj).getId(), otp0Var.itemView.getContext());
                return s3q0.a;
            case 28:
                ((UserProfileDialogs) obj2).a.a(new UserProfileAction.s.b.c((moq0.a) obj));
                return s3q0.a;
            default:
                return Preference.h((Context) obj2, 0, ((anr0) obj).b);
        }
    }
}

package com.vk.movika.sdk.android.defaultplayer.interactive;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.content.design.view.camera.AttachWithCounterView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.MutableCameraBounds;
import com.vk.im.ui.views.avatars.a;
import com.vk.log.L;
import com.vk.textformat.di.MsgTextFormatComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.f;
import xsna.a6x0;
import xsna.asu0;
import xsna.avh;
import xsna.ay0;
import xsna.bzd;
import xsna.cmd;
import xsna.dw20;
import xsna.e3m;
import xsna.e43;
import xsna.f4m;
import xsna.fpf0;
import xsna.gzs;
import xsna.h270;
import xsna.h4i;
import xsna.i5s;
import xsna.jwg0;
import xsna.k7m;
import xsna.kwg0;
import xsna.m7m;
import xsna.njd;
import xsna.o7;
import xsna.oob;
import xsna.pt2;
import xsna.r2g;
import xsna.ra9;
import xsna.rew0;
import xsna.rhh0;
import xsna.rt0;
import xsna.rul;
import xsna.ryh;
import xsna.s3q0;
import xsna.sae;
import xsna.t0e;
import xsna.t2g;
import xsna.tf;
import xsna.uw4;
import xsna.v1j;
import xsna.va9;
import xsna.w8b;
import xsna.wgb;
import xsna.wn;
import xsna.xa9;
import xsna.xne;
import xsna.xtx0;
import xsna.yp80;
import xsna.yw9;
import xsna.zx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String cachedVersion_delegate$lambda$4$lambda$1;
        String googleAppId_delegate$lambda$3;
        int i = this.b;
        int i2 = 6;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new c((d) obj, i3);
            case 1:
                com.vk.im.ui.views.avatars.a aVar = (com.vk.im.ui.views.avatars.a) obj;
                int f = e3m.f(R.attr.im_chat_avatar_start_color_1, aVar.a);
                Context context = aVar.a;
                return e43.l(new a.C1177a(f, e3m.f(R.attr.im_chat_avatar_end_color_1, context)), new a.C1177a(e3m.f(R.attr.im_chat_avatar_start_color_2, context), e3m.f(R.attr.im_chat_avatar_end_color_2, context)), new a.C1177a(e3m.f(R.attr.im_chat_avatar_start_color_3, context), e3m.f(R.attr.im_chat_avatar_end_color_3, context)), new a.C1177a(e3m.f(R.attr.im_chat_avatar_start_color_4, context), e3m.f(R.attr.im_chat_avatar_end_color_4, context)), new a.C1177a(e3m.f(R.attr.im_chat_avatar_start_color_5, context), e3m.f(R.attr.im_chat_avatar_end_color_5, context)), new a.C1177a(e3m.f(R.attr.im_chat_avatar_start_color_6, context), e3m.f(R.attr.im_chat_avatar_end_color_6, context)));
            case 2:
                ((com.vk.superapp.browser.internal.ui.shortcats.a) obj).d();
                return s3q0.a;
            case 3:
                cachedVersion_delegate$lambda$4$lambda$1 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$1((NoClassDefFoundError) obj);
                return cachedVersion_delegate$lambda$4$lambda$1;
            case 4:
                googleAppId_delegate$lambda$3 = AndroidGoogleAppIdDataSource.googleAppId_delegate$lambda$3((AndroidGoogleAppIdDataSource) obj);
                return googleAppId_delegate$lambda$3;
            case 5:
                return ((VoipCallComponent) ((k7m) m7m.f((pt2) obj)).a(fpf0.a(VoipCallComponent.class))).c0();
            case 6:
                yp80 yp80Var = (yp80) obj;
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 7:
                rul rulVar = (rul) obj;
                f fVar = new f();
                wn wnVar = new wn(rulVar, i2);
                int i4 = kwg0.a;
                rulVar.h(fVar.subscribe(wnVar, new jwg0("fl6")));
                return fVar;
            case 8:
                int i5 = BiometricsLockPinFragment.c0;
                return ((BiometricsLockComponent) m7m.d((BiometricsLockPinFragment) obj).a(fpf0.a(BiometricsLockComponent.class))).a();
            case 9:
                va9 va9Var = (va9) obj;
                va9Var.k.dispose();
                int i6 = 5;
                q<R> s0 = new y(new io.reactivex.rxjava3.internal.operators.observable.q(new rt0(va9Var, i6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).s0(new o7(new zx(va9Var, 11), i2));
                asu0 asu0Var = asu0.a;
                va9Var.k = s0.a0(asu0Var.d()).subscribe(new tf(new uw4(va9Var, 1), i6));
                if (va9Var.e() && Preference.e(((UserId) ((a6x0) va9Var.g.getValue()).a.invoke()).b, "voip_vmoji").getBoolean("VoipVmojiDelegate_vmoji_enabled", false) && va9Var.d.a()) {
                    UserId f2 = ((rew0) va9Var.f.getValue()).f();
                    va9Var.l.dispose();
                    va9Var.l = io.reactivex.rxjava3.kotlin.c.f(2, new s0(new ra9(va9Var, f2, i3)).r0(asu0Var.c()).a0(asu0Var.d()), null, new xa9(L.a, 0), new ay0(va9Var, 13));
                }
                return s3q0.a;
            case 10:
                CameraBounds cameraBounds = (CameraBounds) obj;
                StringBuilder sb = new StringBuilder("set: ");
                MutableCameraBounds mutableCameraBounds = cameraBounds instanceof MutableCameraBounds ? (MutableCameraBounds) cameraBounds : null;
                sb.append(mutableCameraBounds != null ? Long.valueOf(mutableCameraBounds.s) : null);
                sb.append(' ');
                Parcelable.Creator<BoundingBox> creator = BoundingBox.CREATOR;
                sb.append(cameraBounds.geoJsonString(true));
                return sb.toString();
            case 11:
                float f3 = CameraUIView.w1;
                AttachWithCounterView collectionButton = ((CameraUIView) obj).getCollectionButton();
                return collectionButton != null ? f4m.e(collectionButton) : new Rect();
            case 12:
                return ((BridgeComponent) m7m.d(((yw9) obj).d).a(fpf0.a(BridgeComponent.class))).p();
            case 13:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i7 = ChannelFragment.a1;
                return new w8b(channelFragment.lo(), channelFragment.V, channelFragment.p0);
            case 14:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, ": loader error, network pipe");
            case 15:
                View view = ((oob) obj).r;
                return ((MsgTextFormatComponent) ((k7m) m7m.c(view != null ? view : null)).a(fpf0.a(MsgTextFormatComponent.class))).ed();
            case 16:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i8 = ClipFeedListFragment.a2;
                return new njd(clipFeedListFragment.Ka(), (xne) clipFeedListFragment.L1.getValue(), new rhh0(((ClipEditComponent) clipFeedListFragment.K1.getValue()).d6()), ((ClipsViewersSdkComponentImpl) clipFeedListFragment.V.getValue()).Ef(), clipFeedListFragment.Eo());
            case 17:
                return ((ClipVideoFileAdapter) obj).m.M1;
            case 18:
                return (Group) ((cmd) obj).findViewById(R.id.content_group);
            case 19:
                Intent intent = new Intent();
                intent.putExtra("exit_creation_flow", true);
                ((bzd) obj).d.b(0, intent);
                return s3q0.a;
            case 20:
                return t0e.T4((t0e) obj);
            case 21:
                ClipsFavoritesFoldersPickerFragment.a aVar2 = ClipsFavoritesFoldersPickerFragment.V;
                return (ClipsFavoritesComponentImpl) ((k7m) m7m.f((ClipsFavoritesFoldersPickerFragment) obj)).mo408a(fpf0.a(ClipsFavoritesComponent.class));
            case 22:
                ((sae) obj).a.invoke(ClipsGridBlockAction.a.b);
                return s3q0.a;
            case 23:
                int i9 = ClipsGridDraftsListFragment.l0;
                ((ClipsGridDraftsListFragment) obj).getClass();
                return s3q0.a;
            case 24:
                xtx0 xtx0Var = (xtx0) obj;
                xtx0Var.a.b = xtx0Var.d();
                return s3q0.a;
            case 25:
                return new t2g((r2g) obj);
            case 26:
                avh avhVar = (avh) obj;
                return new h270(avhVar.p, avhVar.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, avhVar.itemView, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            case 27:
                dw20 dw20Var = ((ryh) obj).g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 28:
                h4i h4iVar = (h4i) obj;
                return Boolean.valueOf(h4iVar.d.getValue().booleanValue() && h4iVar.c.getValue().booleanValue());
            default:
                L.A("Rooms " + ((v1j.m) obj).b + " wes removed");
                return s3q0.a;
        }
    }
}

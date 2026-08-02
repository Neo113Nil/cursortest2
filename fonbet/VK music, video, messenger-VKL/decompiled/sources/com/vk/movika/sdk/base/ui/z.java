package com.vk.movika.sdk.base.ui;

import android.content.Context;
import android.view.View;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupSuggestion;
import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.lists.ListDataSet;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.stickers.settings.StickerSettingsRouter;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStart$Response;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import xsna.b7o0;
import xsna.bs;
import xsna.cm50;
import xsna.d4r;
import xsna.f7s0;
import xsna.fkn0;
import xsna.fpf0;
import xsna.fy20;
import xsna.gpu;
import xsna.gzs;
import xsna.h7u0;
import xsna.hds0;
import xsna.i4y;
import xsna.iru;
import xsna.izs;
import xsna.jdf0;
import xsna.k3z;
import xsna.k7m;
import xsna.kat;
import xsna.kj50;
import xsna.km50;
import xsna.lb90;
import xsna.lpx0;
import xsna.lz00;
import xsna.m7m;
import xsna.mc90;
import xsna.mj80;
import xsna.mvd;
import xsna.myc0;
import xsna.nbf0;
import xsna.ojs;
import xsna.oya;
import xsna.q9t;
import xsna.r1d;
import xsna.rh4;
import xsna.rhv;
import xsna.rs0;
import xsna.s3q0;
import xsna.si40;
import xsna.svp;
import xsna.u9t;
import xsna.ut30;
import xsna.uvd;
import xsna.uvg0;
import xsna.wk50;
import xsna.wzs;
import xsna.x180;
import xsna.x6y;
import xsna.xl50;
import xsna.xqu;
import xsna.yvj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        Context context;
        Float d;
        ArrayList<GroupSuggestion> arrayList;
        int i = 3;
        int i2 = 2;
        boolean z = false;
        int i3 = 1;
        switch (this.b) {
            case 0:
                ((y) this.c).d.w.m((com.vk.movika.sdk.base.model.l) this.d);
                return s3q0.a;
            case 1:
                ((izs) this.c).invoke(((ClipCoauthorListVS.Owner) this.d).a);
                return s3q0.a;
            case 2:
                uvd uvdVar = (uvd) this.c;
                return new mvd((xqu) uvdVar.e.getValue(), (bs) uvdVar.d.getValue(), ((BridgeComponent) this.d).O().D());
            case 3:
                one.video.player.j jVar = (one.video.player.j) this.c;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.d;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().h(oneVideoPlayer);
                }
                return s3q0.a;
            case 4:
                GamesCatalogScreenTab gamesCatalogScreenTab = (GamesCatalogScreenTab) this.c;
                izs izsVar = (izs) this.d;
                int i4 = kat.a.$EnumSwitchMapping$0[gamesCatalogScreenTab.ordinal()];
                if (i4 == 1) {
                    izsVar.invoke(q9t.b);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar.invoke(u9t.b);
                }
                return s3q0.a;
            case 5:
                com.vk.photo.editor.features.mlenhance.a aVar = (com.vk.photo.editor.features.mlenhance.a) this.c;
                View view = (View) this.d;
                aVar.h = false;
                view.sendAccessibilityEvent(8);
                return s3q0.a;
            case 6:
                GyroscopeStart$Parameters gyroscopeStart$Parameters = (GyroscopeStart$Parameters) this.c;
                i4y i4yVar = (i4y) this.d;
                svp svpVar = i4yVar.c;
                String e = gyroscopeStart$Parameters != null ? gyroscopeStart$Parameters.e() : null;
                try {
                    context = ((x6y) i4yVar.d.c).l;
                } catch (Throwable th) {
                    svpVar.i(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), e, 1, null));
                }
                if (context == null) {
                    throw new IllegalStateException("The bridge has no context");
                }
                if (!uvg0.a(4, context)) {
                    svpVar.i(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), e, 1, null));
                    return s3q0.a;
                }
                Integer valueOf = (gyroscopeStart$Parameters == null || (d = gyroscopeStart$Parameters.d()) == null) ? null : Integer.valueOf((int) d.floatValue());
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if ((20 <= intValue && intValue < 1001) == false) {
                        svpVar.i(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), e, 1, null));
                        return s3q0.a;
                    }
                }
                i4yVar.t(context, valueOf, new r1d(i), new rh4(17, i4yVar, e));
                com.vk.superapp.base.js.bridge.b.p(i4yVar.b.a, new JsMethod("VKWebAppGyroscopeStart"), new GyroscopeStart$Response(null, new GyroscopeStart$Response.Data(true, e), e, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 7:
                ((k3z) this.c).G.k((String) this.d);
                return s3q0.a;
            case 8:
                ((wzs) this.c).invoke(0, ((ProductGalleryItem) this.d).b);
                return s3q0.a;
            case 9:
                wk50 wk50Var = (wk50) this.c;
                xl50 xl50Var = (xl50) this.d;
                cm50<VS, P, S> cm50Var = wk50Var.c;
                km50 b = cm50Var.b();
                cm50Var.a(xl50Var);
                List Q = wk50Var.Q(b, cm50Var.b(), xl50Var);
                if (Q != null) {
                    Iterator it2 = Q.iterator();
                    while (it2.hasNext()) {
                        wk50Var.C((kj50) it2.next());
                    }
                }
                return s3q0.a;
            case 10:
                return ((PhotosComponent) ((k7m) m7m.f((x180) this.c)).a(fpf0.a(PhotosComponent.class))).F4().c((UserId) this.d);
            case 11:
                gzs gzsVar = (gzs) this.c;
                mj80 mj80Var = (mj80) this.d;
                gzsVar.invoke();
                if (mj80Var.q == PlaybackStateListener.PlaybackState.ENDED) {
                    mj80Var.w(10);
                }
                return s3q0.a;
            case 12:
                mc90 mc90Var = (mc90) this.c;
                yvj yvjVar = (yvj) this.d;
                if (mc90Var.e()) {
                    myc0.h(yvjVar, null, null, new lb90(mc90Var, null), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                jdf0 jdf0Var = (jdf0) this.c;
                GroupSuggestion groupSuggestion = (GroupSuggestion) this.d;
                iru iruVar = jdf0Var.G;
                Object c = iruVar.c.c(((ListDataSet) iruVar.c).w(new ojs(new ut30(groupSuggestion, 12), i3)));
                gpu.a aVar2 = c instanceof gpu.a ? (gpu.a) c : null;
                if (aVar2 == null) {
                    return s3q0.a;
                }
                Object[] objArr = ((ListDataSet) iruVar.c).t(new si40(new d4r(22), i3)) != null;
                if (iruVar.getItemCount() == 1 || (objArr == true && iruVar.getItemCount() == 2)) {
                    nbf0 nbf0Var = jdf0Var.K;
                    if (nbf0Var != null) {
                        nbf0Var.c = new com.vk.voip.a(24, jdf0Var, aVar2);
                    }
                    iruVar.notifyItemRemoved(0);
                } else {
                    iruVar.B0(aVar2);
                    GroupsSuggestions b7 = jdf0Var.b7();
                    if (b7 != null && (arrayList = b7.l) != null) {
                        arrayList.remove(groupSuggestion);
                    }
                    if (iruVar.getItemCount() == 0) {
                        jdf0Var.E.e(100, b7);
                    }
                }
                return s3q0.a;
            case 14:
                StickerSettingsRouter stickerSettingsRouter = (StickerSettingsRouter) this.c;
                rs0 rs0Var = (rs0) this.d;
                int i5 = h7u0.p;
                h7u0.a c2 = h7u0.b.c(stickerSettingsRouter.a);
                c2.g0(R.string.sticker_settings_deactivate_confirm_title);
                c2.U(R.string.sticker_settings_deactivate_confirm);
                c2.c0(R.string.yes, new lz00(i3, rs0Var));
                c2.W(R.string.sticker_settings_deactivate_confirm_no, null);
                c2.m();
                return s3q0.a;
            case 15:
                b7o0 b7o0Var = (b7o0) this.c;
                oya oyaVar = (oya) this.d;
                b7o0Var.c().j(oyaVar.d);
                oyaVar.a();
                return s3q0.a;
            case 16:
                hds0 hds0Var = (hds0) this.c;
                f7s0 f7s0Var = (f7s0) this.d;
                fkn0 fkn0Var = hds0Var.g;
                (fkn0Var != null ? fkn0Var : null).f = f7s0Var;
                return s3q0.a;
            default:
                lpx0 lpx0Var = (lpx0) this.c;
                return new rhv((ProfileFragmentProviderComponent) ((k7m) m7m.f(lpx0Var)).a(fpf0.a(ProfileFragmentProviderComponent.class)), new fy20((Context) this.d, i2), new lpx0.a(2, lpx0Var, lpx0.class, "displayPage", "displayPage(Ljava/lang/String;Ljava/lang/String;)V", 0));
        }
    }
}

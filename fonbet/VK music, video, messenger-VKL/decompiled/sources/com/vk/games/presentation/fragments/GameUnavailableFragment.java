package com.vk.games.presentation.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.api.generated.apps.dto.AppsGetAndroidCatalogFilterDto;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.asp;
import xsna.bwt0;
import xsna.e20;
import xsna.e370;
import xsna.el3;
import xsna.epx;
import xsna.et;
import xsna.f20;
import xsna.fnj;
import xsna.fpf0;
import xsna.gzs;
import xsna.hp5;
import xsna.iah0;
import xsna.ies;
import xsna.j7;
import xsna.msy;
import xsna.nfj;
import xsna.np3;
import xsna.nvg;
import xsna.oz50;
import xsna.qcy;
import xsna.qpj;
import xsna.ras;
import xsna.rdx0;
import xsna.rsg0;
import xsna.t9e;
import xsna.te3;
import xsna.ud8;
import xsna.vds;
import xsna.vf3;
import xsna.wd8;
import xsna.xo9;
import xsna.y50;
import xsna.zrp;

/* compiled from: GameUnavailableFragment.kt */
/* loaded from: classes17.dex */
public final class GameUnavailableFragment extends BaseFragment implements ies, vds {
    public static final /* synthetic */ qcy<Object>[] W;
    public final ras S = xo9.v(".app");
    public final Object T;
    public final Object U;
    public final Object V;

    /* compiled from: GameUnavailableFragment.kt */
    public static final class a extends oz50 {
        public a(ApiApplication apiApplication) {
            super(GameUnavailableFragment.class, null, null);
            this.j.putParcelable(".app", apiApplication);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GameUnavailableFragment.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Game;
        public static final b Standalone;
        public static final b Unknown;
        private final int descriptionId;
        private final int titleId;

        static {
            b bVar = new b("Standalone", 0, R.string.games_unsupported_standalone_title, R.string.games_unsupported_standalone_description);
            Standalone = bVar;
            b bVar2 = new b("Game", 1, R.string.games_unsupported_game_title, R.string.games_unsupported_game_description);
            Game = bVar2;
            b bVar3 = new b(DeviceInfo.STR_TYPE_UNKNOWN, 2, R.string.unknown_unsupported_standalone_title, R.string.unknown_unsupported_standalone_description);
            Unknown = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, int i2, int i3) {
            this.titleId = i2;
            this.descriptionId = i3;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int h() {
            return this.descriptionId;
        }

        public final int i() {
            return this.titleId;
        }
    }

    /* compiled from: GameUnavailableFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<hp5> {
        @Override // xsna.gzs
        public final hp5 invoke() {
            GameUnavailableFragment gameUnavailableFragment = (GameUnavailableFragment) this.receiver;
            qcy<Object>[] qcyVarArr = GameUnavailableFragment.W;
            gameUnavailableFragment.getClass();
            return new hp5(new nfj(gameUnavailableFragment, 21));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GameUnavailableFragment.class, "application", "getApplication()Lcom/vk/dto/common/data/ApiApplication;", 0);
        fpf0.a.getClass();
        W = new qcy[]{propertyReference1Impl};
    }

    public GameUnavailableFragment() {
        e20 e20Var = new e20(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, e20Var);
        this.U = msy.a(lazyThreadSafetyMode, new c(0, this, GameUnavailableFragment.class, "createAdapter", "createAdapter()Lcom/vk/games/presentation/adapters/AvailableGamesAdapter;", 0));
        this.V = msy.a(lazyThreadSafetyMode, new f20(17));
    }

    @Override // xsna.vds
    public final int Q0() {
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        return fnj.b(requireContext) ? -1 : 1;
    }

    public final ApiApplication io() {
        qcy<Object> qcyVar = W[0];
        return (ApiApplication) this.S.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(mo2getContext()).inflate(R.layout.fragment_game_unavailable, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        b bVar;
        q y0;
        super.onViewCreated(view, bundle);
        int i = 23;
        bwt0.p(view, R.id.toolbar, null, new t9e(this, i), 2);
        String str = io().C;
        if (epx.f(str, "standalone")) {
            bVar = b.Standalone;
        } else if (epx.f(str, "game")) {
            bVar = b.Game;
        } else {
            com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.c("Message", "Application tried open as unavailable.");
            aVar.c("Application data", "[id: " + io().b + "; type: " + io().C + ']');
            bVar2.k(aVar.e());
            bVar = b.Unknown;
        }
        ((TextView) bwt0.p(view, R.id.tvTitle, null, null, 6)).setText(getString(bVar.i()));
        ((TextView) bwt0.p(view, R.id.tvDescription, null, null, 6)).setText(getString(bVar.h()));
        bwt0.i0(bwt0.p(view, R.id.btnShowMore, null, null, 6), new qpj(this, 14));
        if (((Boolean) this.T.getValue()).booleanValue()) {
            y0 = rdx0.u(e370.e(vf3.a.c(null, 10, null, (55283 & 2048) != 0 ? null : Integer.valueOf(io().m), null, (55283 & 8192) != 0 ? null : AppsGetAndroidCatalogFilterDto.GENRES_FOR_UNAVAILABLE))).U(new j7(new nvg(this, 27), 25));
        } else {
            int i2 = io().m;
            te3 te3Var = new te3("apps.getCatalog", ApiApplication.k0);
            te3Var.C(i2, "genre_id");
            te3Var.K("platform", "html5");
            te3Var.K("filter", "genres_for_unavailable");
            te3Var.C(10, "count");
            y0 = rsg0.y0(te3Var, null, null, 3);
        }
        fo(y0.U(new et(19)).subscribe(new np3(new ud8(1, (hp5) this.U.getValue(), hp5.class, "setItems", "setItems(Ljava/util/List;)V", 0, 7), i), new y50(new wd8(L.a, 7), 26)));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.GAMES_UNAVAILABLE_PAGE;
        long j = io().b.b;
        UserId userId = io().u;
        Long valueOf = userId != null ? Long.valueOf(userId.b) : null;
        String str = io().B;
        uiTrackingScreen.f = new SchemeStat$EventItem(type, Long.valueOf(j), valueOf, io().G, str, null, 32, null);
    }
}

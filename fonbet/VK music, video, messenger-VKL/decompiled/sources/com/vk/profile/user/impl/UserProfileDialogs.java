package com.vk.profile.user.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.c5g;
import xsna.c5v0;
import xsna.cqm0;
import xsna.dhr0;
import xsna.dvq0;
import xsna.dw20;
import xsna.ey50;
import xsna.gd60;
import xsna.gko;
import xsna.gzs;
import xsna.hbh0;
import xsna.htq0;
import xsna.izs;
import xsna.j6;
import xsna.lyd0;
import xsna.m33;
import xsna.moq0;
import xsna.mpq0;
import xsna.nh40;
import xsna.oq;
import xsna.qoq0;
import xsna.r0e0;
import xsna.tlo0;
import xsna.tvd0;
import xsna.x1e0;
import xsna.zrp;

/* compiled from: UserProfileDialogs.kt */
/* loaded from: classes5.dex */
public final class UserProfileDialogs {
    public static final String m = cqm0.m("SERVICE_TRUSTED_PROFILE");
    public final mpq0 a;
    public final htq0 b;
    public final r0e0 c;
    public final tvd0 d;
    public final gd60 e;
    public final lyd0 f;
    public final dvq0 g;
    public final nh40 h;
    public final ArrayList i = new ArrayList();
    public final Handler j = new Handler(Looper.getMainLooper());
    public dw20 k;
    public dw20 l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserProfileDialogs.kt */
    public static final class ItemCallPlace {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ItemCallPlace[] $VALUES;
        public static final ItemCallPlace PRIMARY_HOLDER;
        public static final ItemCallPlace SECONDARY_HOLDER;
        public static final ItemCallPlace THIRD_PARTY_HOLDER;

        static {
            ItemCallPlace itemCallPlace = new ItemCallPlace("PRIMARY_HOLDER", 0);
            PRIMARY_HOLDER = itemCallPlace;
            ItemCallPlace itemCallPlace2 = new ItemCallPlace("SECONDARY_HOLDER", 1);
            SECONDARY_HOLDER = itemCallPlace2;
            ItemCallPlace itemCallPlace3 = new ItemCallPlace("THIRD_PARTY_HOLDER", 2);
            THIRD_PARTY_HOLDER = itemCallPlace3;
            ItemCallPlace[] itemCallPlaceArr = {itemCallPlace, itemCallPlace2, itemCallPlace3};
            $VALUES = itemCallPlaceArr;
            $ENTRIES = new asp(itemCallPlaceArr);
        }

        public ItemCallPlace() {
            throw null;
        }

        public static ItemCallPlace valueOf(String str) {
            return (ItemCallPlace) Enum.valueOf(ItemCallPlace.class, str);
        }

        public static ItemCallPlace[] values() {
            return (ItemCallPlace[]) $VALUES.clone();
        }
    }

    /* compiled from: UserProfileDialogs.kt */
    public interface a {
        void a();
    }

    /* compiled from: UserProfileDialogs.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ItemCallPlace.values().length];
            try {
                iArr[ItemCallPlace.PRIMARY_HOLDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemCallPlace.THIRD_PARTY_HOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemCallPlace.SECONDARY_HOLDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserProfileDialogs(mpq0 mpq0Var, htq0 htq0Var, r0e0 r0e0Var, tvd0 tvd0Var, gd60 gd60Var, lyd0 lyd0Var, dvq0 dvq0Var, nh40 nh40Var) {
        this.a = mpq0Var;
        this.b = htq0Var;
        this.c = r0e0Var;
        this.d = tvd0Var;
        this.e = gd60Var;
        this.f = lyd0Var;
        this.g = dvq0Var;
        this.h = nh40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qoq0 a(FragmentActivity fragmentActivity, gzs gzsVar) {
        qoq0 qoq0Var = new qoq0(gzsVar);
        ey50 ey50Var = fragmentActivity instanceof ey50 ? (ey50) fragmentActivity : null;
        if (ey50Var != null) {
            ey50Var.Y().S(qoq0Var);
        }
        return qoq0Var;
    }

    public static ArrayList b(List list, FragmentActivity fragmentActivity, izs izsVar) {
        List<moq0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (moq0 moq0Var : list2) {
            arrayList.add(new VkContextMenu.a(fragmentActivity.getString(moq0Var.c()), m33.a(moq0Var.a(), fragmentActivity), Integer.valueOf(dhr0.t.c(moq0Var.b())), false, moq0Var.c, new j6(18, izsVar, moq0Var), 8));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(FragmentActivity fragmentActivity, qoq0 qoq0Var) {
        ey50 ey50Var = fragmentActivity instanceof ey50 ? (ey50) fragmentActivity : null;
        if (ey50Var != null) {
            ey50Var.Y().H(qoq0Var);
        }
    }

    public final void d(FragmentActivity fragmentActivity, String str, String str2) {
        int i = dhr0.M() ? R.drawable.vk_icon_illustration_profile_fist_bump_dark_160h : R.drawable.vk_icon_illustration_profile_fist_bump_light_160h;
        VkModal.Mode mode = VkModal.Mode.Card;
        gko.b bVar = gko.Companion;
        this.l = new VkModal(mode, new b.a.C0790b(new c5v0.c.b(new gko(i), null, new Size(hbh0.b(PsExtractor.VIDEO_STREAM_MASK, fragmentActivity), hbh0.b(160, fragmentActivity)), 8), new c5v0.b(12, oq.d(tlo0.Companion, str), new tlo0.h(str2)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.user_profile_esia_verified_ok), new x1e0(this, 17), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) null, 6), 20), null, false, 28).b(fragmentActivity, null);
    }
}

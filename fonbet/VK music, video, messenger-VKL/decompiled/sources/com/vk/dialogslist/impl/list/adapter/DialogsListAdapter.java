package com.vk.dialogslist.impl.list.adapter;

import xsna.asp;
import xsna.cgm;
import xsna.d37;
import xsna.dsc;
import xsna.em20;
import xsna.gm20;
import xsna.h6g;
import xsna.j6e;
import xsna.jmm;
import xsna.jo8;
import xsna.kvw;
import xsna.l5e0;
import xsna.mmf;
import xsna.mp20;
import xsna.n3i;
import xsna.no8;
import xsna.nq20;
import xsna.o7p;
import xsna.oce;
import xsna.og20;
import xsna.omf;
import xsna.p7p;
import xsna.pvw;
import xsna.qg20;
import xsna.s990;
import xsna.ugm;
import xsna.wls;
import xsna.wx3;
import xsna.xls;
import xsna.xur0;
import xsna.zrp;

/* compiled from: DialogsListAdapter.kt */
/* loaded from: classes18.dex */
public final class DialogsListAdapter extends wx3 {
    public final a j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogsListAdapter.kt */
    public static final class ViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType BUSINESS_NOTIFICATION;
        public static final ViewType DIALOG;
        public static final ViewType EDU_SWITCH_ACCOUNT;
        public static final ViewType FRIENDS_BIRTHDAY_BANNER;
        public static final ViewType HOLIDAYS_BANNER;
        public static final ViewType INFOBAR;
        public static final ViewType MAX_AD;
        public static final ViewType MESSAGES_REQUESTS;
        public static final ViewType MIDSCREEN_BANNER;
        public static final ViewType MINIAPP;
        public static final ViewType ONE_FRIEND_BIRTHDAY_BANNER;
        public static final ViewType PAGE_LOADING;
        public static final ViewType PROMO_LINK;
        public static final ViewType RECOMMEND_DIALOG;

        static {
            ViewType viewType = new ViewType("DIALOG", 0);
            DIALOG = viewType;
            ViewType viewType2 = new ViewType("RECOMMEND_DIALOG", 1);
            RECOMMEND_DIALOG = viewType2;
            ViewType viewType3 = new ViewType("BUSINESS_NOTIFICATION", 2);
            BUSINESS_NOTIFICATION = viewType3;
            ViewType viewType4 = new ViewType("MESSAGES_REQUESTS", 3);
            MESSAGES_REQUESTS = viewType4;
            ViewType viewType5 = new ViewType("MIDSCREEN_BANNER", 4);
            MIDSCREEN_BANNER = viewType5;
            ViewType viewType6 = new ViewType("PAGE_LOADING", 5);
            PAGE_LOADING = viewType6;
            ViewType viewType7 = new ViewType("INFOBAR", 6);
            INFOBAR = viewType7;
            ViewType viewType8 = new ViewType("HOLIDAYS_BANNER", 7);
            HOLIDAYS_BANNER = viewType8;
            ViewType viewType9 = new ViewType("FRIENDS_BIRTHDAY_BANNER", 8);
            FRIENDS_BIRTHDAY_BANNER = viewType9;
            ViewType viewType10 = new ViewType("ONE_FRIEND_BIRTHDAY_BANNER", 9);
            ONE_FRIEND_BIRTHDAY_BANNER = viewType10;
            ViewType viewType11 = new ViewType("MINIAPP", 10);
            MINIAPP = viewType11;
            ViewType viewType12 = new ViewType("EDU_SWITCH_ACCOUNT", 11);
            EDU_SWITCH_ACCOUNT = viewType12;
            ViewType viewType13 = new ViewType("PROMO_LINK", 12);
            PROMO_LINK = viewType13;
            ViewType viewType14 = new ViewType("MAX_AD", 13);
            MAX_AD = viewType14;
            ViewType[] viewTypeArr = {viewType, viewType2, viewType3, viewType4, viewType5, viewType6, viewType7, viewType8, viewType9, viewType10, viewType11, viewType12, viewType13, viewType14};
            $VALUES = viewTypeArr;
            $ENTRIES = new asp(viewTypeArr);
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public interface a extends jmm.a, no8.a, qg20.a, gm20.a, pvw, nq20.a, p7p.a, xur0.a, wls.a {
    }

    public DialogsListAdapter(a aVar) {
        super(new com.vk.dialogslist.impl.list.adapter.a());
        this.j = aVar;
        x0(jo8.class, new n3i(this, 8));
        x0(og20.class, new mmf(this, 21));
        x0(em20.class, new j6e(this, 17));
        x0(kvw.class, new h6g(this, 9));
        x0(xls.class, new dsc(this, 24));
        x0(mp20.class, new oce(this, 17));
        x0(o7p.class, new omf(this, 10));
        x0(l5e0.class, new ugm(this, 1));
        x0(s990.class, new d37(12));
        y0(new cgm(aVar));
        setHasStableIds(false);
    }
}

package com.vk.superapp.api.internal.requests.app;

import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: AddActionSuggestion.kt */
/* loaded from: classes6.dex */
public final class AddActionSuggestion {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final Action d;
    public final String e;
    public final Long f;
    public final List<WebApiApplication> g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddActionSuggestion.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ADD_TO_COMMUNITY;
        public static final Action ADD_TO_MAIN_SCREEN;
        public static final a Companion;
        public static final Action NONE;
        public static final Action NOTIFICATIONS_AUTO_PERMISSION;
        public static final Action PERSONAL_DISCOUNT;
        public static final Action RECOMMEND;
        public static final Action RECOMMENDATION_FROM_NOTIFICATION;
        private final String value;

        /* compiled from: AddActionSuggestion.kt */
        public static final class a {
        }

        static {
            Action action = new Action("RECOMMEND", 0, "recommend");
            RECOMMEND = action;
            Action action2 = new Action("NONE", 1, "none");
            NONE = action2;
            Action action3 = new Action("ADD_TO_COMMUNITY", 2, "add_to_community");
            ADD_TO_COMMUNITY = action3;
            Action action4 = new Action("ADD_TO_MAIN_SCREEN", 3, "add_to_main_screen");
            ADD_TO_MAIN_SCREEN = action4;
            Action action5 = new Action("RECOMMENDATION_FROM_NOTIFICATION", 4, "recommendation_notification");
            RECOMMENDATION_FROM_NOTIFICATION = action5;
            Action action6 = new Action("NOTIFICATIONS_AUTO_PERMISSION", 5, "notifications_auto_permission");
            NOTIFICATIONS_AUTO_PERMISSION = action6;
            Action action7 = new Action("PERSONAL_DISCOUNT", 6, "personal_discount");
            PERSONAL_DISCOUNT = action7;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
            Companion = new a();
        }

        public Action(String str, int i, String str2) {
            this.value = str2;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public AddActionSuggestion(boolean z, boolean z2, long j, Action action, String str, Long l, ArrayList arrayList) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = action;
        this.e = str;
        this.f = l;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddActionSuggestion)) {
            return false;
        }
        AddActionSuggestion addActionSuggestion = (AddActionSuggestion) obj;
        return this.a == addActionSuggestion.a && this.b == addActionSuggestion.b && this.c == addActionSuggestion.c && this.d == addActionSuggestion.d && epx.f(this.e, addActionSuggestion.e) && epx.f(this.f, addActionSuggestion.f) && epx.f(this.g, addActionSuggestion.g);
    }

    public final int hashCode() {
        int a = urd0.a((this.d.hashCode() + bh10.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        Long l = this.f;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        List<WebApiApplication> list = this.g;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddActionSuggestion(needToShowOnStart=");
        sb.append(this.a);
        sb.append(", needToShowOnClose=");
        sb.append(this.b);
        sb.append(", showOnCloseAfter=");
        sb.append(this.c);
        sb.append(", actionType=");
        sb.append(this.d);
        sb.append(", recommendationText=");
        sb.append(this.e);
        sb.append(", needToShowGroupId=");
        sb.append(this.f);
        sb.append(", recommendedGames=");
        return ms9.a(')', sb, this.g);
    }
}

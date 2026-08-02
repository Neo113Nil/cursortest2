package com.vk.dto.notifications;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.notifications.NotificationAction;
import com.vk.dto.notifications.NotificationButton;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.rj60;
import xsna.zj70;

/* compiled from: NotificationItem.kt */
/* loaded from: classes18.dex */
public final class NotificationItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NotificationItem> CREATOR = new c();
    public final String b;
    public final int c;
    public final NotificationEntity d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final NotificationEntity j;
    public final ArrayList<NotificationEntity> k;
    public final NotificationAction l;
    public final ArrayList<NotificationButton> m;
    public final NotificationButton n;
    public final ActionButtons o;
    public final boolean p;
    public final boolean q;
    public boolean r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public b v;
    public boolean w;

    /* compiled from: NotificationItem.kt */
    public static final class ActionButtons extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<ActionButtons> CREATOR = new a();
        public final List<NotificationButton> b;
        public final List<NotificationButton> c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ActionButtons> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ActionButtons a(Serializer serializer) {
                Serializer.c<NotificationButton> cVar = NotificationButton.CREATOR;
                return new ActionButtons(serializer.j(cVar), serializer.j(cVar));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionButtons[i];
            }
        }

        public ActionButtons(List<NotificationButton> list, List<NotificationButton> list2) {
            this.b = list;
            this.c = list2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.o0(this.b);
            serializer.o0(this.c);
        }
    }

    /* compiled from: NotificationItem.kt */
    public static final class a {
        public static NotificationItem a(JSONObject jSONObject, zj70 zj70Var) {
            ArrayList arrayList;
            NotificationAction notificationAction;
            String str;
            ArrayList arrayList2;
            NotificationButton notificationButton;
            NotificationButton notificationButton2;
            ArrayList arrayList3;
            int i;
            ActionButtons actionButtons;
            ArrayList arrayList4;
            ArrayList arrayList5;
            rj60 rj60Var = new rj60(zj70Var, 1);
            Serializer.c<NotificationItem> cVar = NotificationItem.CREATOR;
            String optString = jSONObject.optString("id");
            int optInt = jSONObject.optInt("date");
            JSONObject optJSONObject = jSONObject.optJSONObject("main_item");
            NotificationEntity notificationEntity = optJSONObject != null ? (NotificationEntity) rj60Var.invoke(optJSONObject) : null;
            String optString2 = jSONObject.optString("icon_type");
            String optString3 = jSONObject.optString(CampaignEx.JSON_KEY_ICON_URL);
            String optString4 = jSONObject.optString("header");
            String optString5 = jSONObject.optString("text");
            String optString6 = jSONObject.optString("footer");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("additional_item");
            NotificationEntity notificationEntity2 = optJSONObject2 != null ? (NotificationEntity) rj60Var.invoke(optJSONObject2) : null;
            JSONArray optJSONArray = jSONObject.optJSONArray("attachments");
            if (optJSONArray != null) {
                ArrayList arrayList6 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    int i3 = length;
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i2);
                    if (optJSONObject3 != null) {
                        arrayList6.add(rj60Var.invoke(optJSONObject3));
                    }
                    i2++;
                    length = i3;
                }
                arrayList = arrayList6;
            } else {
                arrayList = null;
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("action");
            if (optJSONObject4 != null) {
                Serializer.c<NotificationAction> cVar2 = NotificationAction.CREATOR;
                notificationAction = NotificationAction.a.a(optJSONObject4, zj70Var);
            } else {
                notificationAction = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("buttons");
            if (optJSONArray2 != null) {
                arrayList2 = new ArrayList(optJSONArray2.length());
                int length2 = optJSONArray2.length();
                str = optString;
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = length2;
                    JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i4);
                    if (optJSONObject5 != null) {
                        Serializer.c<NotificationButton> cVar3 = NotificationButton.CREATOR;
                        arrayList2.add(NotificationButton.a.a(optJSONObject5, zj70Var));
                    }
                    i4++;
                    length2 = i5;
                }
            } else {
                str = optString;
                arrayList2 = null;
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("settings_button");
            if (optJSONObject6 != null) {
                Serializer.c<NotificationButton> cVar4 = NotificationButton.CREATOR;
                notificationButton = NotificationButton.a.a(optJSONObject6, zj70Var);
            } else {
                notificationButton = null;
            }
            JSONObject optJSONObject7 = jSONObject.optJSONObject("action_buttons");
            if (optJSONObject7 != null) {
                Serializer.c<ActionButtons> cVar5 = ActionButtons.CREATOR;
                JSONArray optJSONArray3 = optJSONObject7.optJSONArray(TtmlNode.LEFT);
                notificationButton2 = notificationButton;
                if (optJSONArray3 != null) {
                    arrayList3 = arrayList2;
                    arrayList4 = new ArrayList(optJSONArray3.length());
                    int length3 = optJSONArray3.length();
                    i = optInt;
                    int i6 = 0;
                    while (i6 < length3) {
                        int i7 = length3;
                        JSONObject optJSONObject8 = optJSONArray3.optJSONObject(i6);
                        if (optJSONObject8 != null) {
                            Serializer.c<NotificationButton> cVar6 = NotificationButton.CREATOR;
                            arrayList4.add(NotificationButton.a.a(optJSONObject8, zj70Var));
                        }
                        i6++;
                        length3 = i7;
                    }
                } else {
                    arrayList3 = arrayList2;
                    i = optInt;
                    arrayList4 = null;
                }
                JSONArray optJSONArray4 = optJSONObject7.optJSONArray(TtmlNode.RIGHT);
                if (optJSONArray4 != null) {
                    arrayList5 = new ArrayList(optJSONArray4.length());
                    int length4 = optJSONArray4.length();
                    int i8 = 0;
                    while (i8 < length4) {
                        int i9 = length4;
                        JSONObject optJSONObject9 = optJSONArray4.optJSONObject(i8);
                        if (optJSONObject9 != null) {
                            Serializer.c<NotificationButton> cVar7 = NotificationButton.CREATOR;
                            arrayList5.add(NotificationButton.a.a(optJSONObject9, zj70Var));
                        }
                        i8++;
                        length4 = i9;
                    }
                } else {
                    arrayList5 = null;
                }
                actionButtons = new ActionButtons(arrayList4, arrayList5);
            } else {
                notificationButton2 = notificationButton;
                arrayList3 = arrayList2;
                i = optInt;
                actionButtons = null;
            }
            return new NotificationItem(str, i, notificationEntity, optString2, optString3, optString4, optString5, optString6, notificationEntity2, arrayList, notificationAction, arrayList3, notificationButton2, actionButtons, jSONObject.optBoolean("button_hide"), jSONObject.optBoolean("show_csat"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<NotificationItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NotificationItem a(Serializer serializer) {
            return new NotificationItem(serializer.H(), serializer.u(), (NotificationEntity) serializer.G(NotificationEntity.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), (NotificationEntity) serializer.G(NotificationEntity.class.getClassLoader()), serializer.j(NotificationEntity.CREATOR), (NotificationAction) serializer.G(NotificationAction.class.getClassLoader()), serializer.j(NotificationButton.CREATOR), (NotificationButton) serializer.G(NotificationButton.class.getClassLoader()), (ActionButtons) serializer.G(ActionButtons.class.getClassLoader()), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationItem[i];
        }
    }

    public NotificationItem(String str, int i, NotificationEntity notificationEntity, String str2, String str3, String str4, String str5, String str6, NotificationEntity notificationEntity2, ArrayList<NotificationEntity> arrayList, NotificationAction notificationAction, ArrayList<NotificationButton> arrayList2, NotificationButton notificationButton, ActionButtons actionButtons, boolean z, boolean z2) {
        this.b = str;
        this.c = i;
        this.d = notificationEntity;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = notificationEntity2;
        this.k = arrayList;
        this.l = notificationAction;
        this.m = arrayList2;
        this.n = notificationButton;
        this.o = actionButtons;
        this.p = z;
        this.q = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.i0(this.j);
        serializer.o0(this.k);
        serializer.i0(this.l);
        serializer.o0(this.m);
        serializer.i0(this.n);
        serializer.i0(this.o);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!epx.f(obj != null ? obj.getClass() : null, NotificationItem.class)) {
            return false;
        }
        NotificationItem notificationItem = (NotificationItem) obj;
        return epx.f(this.b, notificationItem.b) && this.c == notificationItem.c;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c;
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NotificationItem(id="), this.b, ')');
    }

    public final boolean zb(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!epx.f(obj != null ? obj.getClass() : null, NotificationItem.class)) {
            return false;
        }
        NotificationItem notificationItem = (NotificationItem) obj;
        return epx.f(this.b, notificationItem.b) && this.c == notificationItem.c;
    }

    /* compiled from: NotificationItem.kt */
    public static class b {
        public final Integer a;
        public final Integer b;
        public final String c;

        public b(Integer num, Integer num2) {
            this.a = num;
            this.b = num2;
            this.c = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!epx.f(obj != null ? obj.getClass() : null, b.class)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            Integer num = this.a;
            int intValue = (num != null ? num.intValue() : 0) * 31;
            Integer num2 = this.b;
            int intValue2 = (intValue + (num2 != null ? num2.intValue() : 0)) * 31;
            String str = this.c;
            return intValue2 + (str != null ? str.hashCode() : 0);
        }

        public b(Integer num, String str) {
            this.a = num;
            this.b = null;
            this.c = str;
        }
    }
}

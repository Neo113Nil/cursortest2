package com.vk.dto.menu;

import com.vk.core.util.JSONSerializeStringList;
import com.vk.dto.hints.Hint;
import com.vk.dto.menu.SideMenuItems;
import com.vk.dto.menu.TabBarItems;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.dlj0;
import xsna.epx;
import xsna.ho8;
import xsna.kvf;
import xsna.qoy;
import xsna.urd0;
import xsna.wq;

/* compiled from: Navigation.kt */
/* loaded from: classes.dex */
public final class a implements bxx {
    private static final a STUB = new a((d) null, 3);
    public static final /* synthetic */ int d = 0;
    public final d b;
    public final C0910a c;

    /* compiled from: Navigation.kt */
    /* renamed from: com.vk.dto.menu.a$a, reason: collision with other inner class name */
    /* loaded from: classes18.dex */
    public static final class C0910a implements bxx {
        public final d b;
        public boolean c;
        public c d;
        public final e e;

        /* compiled from: Navigation.kt */
        /* renamed from: com.vk.dto.menu.a$a$a, reason: collision with other inner class name */
        public static final class C0911a {
            public static C0910a a(JSONObject jSONObject) {
                c cVar;
                JSONObject optJSONObject = jSONObject.optJSONObject("state");
                d a = optJSONObject != null ? d.C0912a.a(optJSONObject) : new d(0);
                boolean optBoolean = jSONObject.optBoolean("is_enabled", false);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("hint");
                if (optJSONObject2 != null) {
                    Hint hint = new Hint(optJSONObject2.optString("id"), optJSONObject2.optString("text"), null, null, 8, null);
                    String optString = optJSONObject2.optString("ok_button");
                    String optString2 = optJSONObject2.optString("switch_button_text");
                    String string = optJSONObject2.getString("source_tab_id");
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("success_message");
                    cVar = new c(hint, optString, optString2, string, optJSONObject3 != null ? new f(optJSONObject3.optString("text"), optJSONObject3.optString("settings_button")) : null);
                } else {
                    cVar = null;
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("settings_labels");
                return new C0910a(a, optBoolean, cVar, optJSONObject4 != null ? new e(optJSONObject4.optString("section_title"), optJSONObject4.optString("switcher_title"), optJSONObject4.optString("description")) : null);
            }
        }

        public C0910a(d dVar, boolean z, c cVar, e eVar) {
            this.b = dVar;
            this.c = z;
            this.d = cVar;
            this.e = eVar;
        }

        public final c a() {
            return this.d;
        }

        public final d b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final void d(boolean z) {
            this.c = z;
        }

        public final void e() {
            this.d = null;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_enabled", this.c);
            jSONObject.put("state", this.b.e5());
            c cVar = this.d;
            if (cVar != null) {
                jSONObject.put("hint", cVar.e5());
            }
            e eVar = this.e;
            if (eVar != null) {
                jSONObject.put("settings_labels", eVar.e5());
            }
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0910a)) {
                return false;
            }
            C0910a c0910a = (C0910a) obj;
            return epx.f(this.b, c0910a.b) && this.c == c0910a.c && epx.f(this.d, c0910a.d) && epx.f(this.e, c0910a.e);
        }

        public final int hashCode() {
            int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
            c cVar = this.d;
            int hashCode = (b + (cVar == null ? 0 : cVar.hashCode())) * 31;
            e eVar = this.e;
            return hashCode + (eVar != null ? eVar.hashCode() : 0);
        }

        public final String toString() {
            return "AlternativeNavigation(state=" + this.b + ", isEnabled=" + this.c + ", hint=" + this.d + ", settingsLabels=" + this.e + ')';
        }
    }

    /* compiled from: Navigation.kt */
    public static final class b {
        public static a a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("state");
            d a = optJSONObject != null ? d.C0912a.a(optJSONObject) : new d(0);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("variant");
            return new a(a, optJSONObject2 != null ? C0910a.C0911a.a(optJSONObject2) : null);
        }

        public final a getSTUB() {
            return a.STUB;
        }
    }

    /* compiled from: Navigation.kt */
    /* loaded from: classes18.dex */
    public static final class c implements bxx {
        public final Hint b;
        public final String c;
        public final String d;
        public final String e;
        public final f f;

        public c(Hint hint, String str, String str2, String str3, f fVar) {
            this.b = hint;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = fVar;
        }

        public final Hint a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            Hint hint = this.b;
            jSONObject.put("id", hint.b);
            jSONObject.put("text", hint.c);
            jSONObject.put("switch_button_text", this.d);
            jSONObject.put("ok_button", this.c);
            jSONObject.put("source_tab_id", this.e);
            f fVar = this.f;
            if (fVar != null) {
                jSONObject.put("success_message", fVar.e5());
            }
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            int hashCode = this.b.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int a = urd0.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
            f fVar = this.f;
            return a + (fVar != null ? fVar.hashCode() : 0);
        }

        public final String toString() {
            return "NavigationHint(hint=" + this.b + ", okButton=" + this.c + ", switchButton=" + this.d + ", sourceTabId=" + this.e + ", successMessage=" + this.f + ')';
        }
    }

    /* compiled from: Navigation.kt */
    public static final class d implements bxx {
        public final TabBarItems b;
        public final JSONSerializeStringList c;
        public final dlj0 d;

        /* compiled from: Navigation.kt */
        /* renamed from: com.vk.dto.menu.a$d$a, reason: collision with other inner class name */
        public static final class C0912a {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v5 */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
            public static d a(JSONObject jSONObject) {
                TabBarItems tabBarItems;
                JSONSerializeStringList jSONSerializeStringList;
                dlj0 dlj0Var;
                ?? r1;
                JSONObject optJSONObject = jSONObject.optJSONObject("tabbar");
                if (optJSONObject != null) {
                    int i = TabBarItems.b;
                    tabBarItems = TabBarItems.a.a(optJSONObject);
                } else {
                    tabBarItems = new TabBarItems(true);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("superapp_features");
                if (optJSONArray != null) {
                    jSONSerializeStringList = new JSONSerializeStringList();
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2 = wq.b(optJSONArray, i2, arrayList, i2, 1)) {
                    }
                    jSONSerializeStringList.addAll(arrayList);
                } else {
                    jSONSerializeStringList = new JSONSerializeStringList();
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("side_menu");
                if (optJSONObject2 != null) {
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("sections");
                    if (optJSONArray2 != null) {
                        r1 = new ArrayList(optJSONArray2.length());
                        int length2 = optJSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i3);
                            if (optJSONObject3 != null) {
                                int i4 = SideMenuItems.b;
                                r1.add(SideMenuItems.a.a(optJSONObject3.getJSONArray("items")));
                            }
                        }
                    } else {
                        r1 = 0;
                    }
                    if (r1 == 0) {
                        r1 = EmptyList.b;
                    }
                    dlj0Var = new dlj0((List<SideMenuItems>) r1);
                } else {
                    dlj0Var = new dlj0(0);
                }
                return new d(tabBarItems, jSONSerializeStringList, dlj0Var);
            }
        }

        public d() {
            this(0);
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabbar", this.b.e5());
            jSONObject.put("superapp_features", kvf.a(this.c));
            jSONObject.put("side_menu", this.d.e5());
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "NavigationState(tabBar=" + this.b + ", superAppFeatures=" + this.c + ", sideMenuSections=" + this.d + ')';
        }

        public d(TabBarItems tabBarItems, JSONSerializeStringList jSONSerializeStringList, dlj0 dlj0Var) {
            this.b = tabBarItems;
            this.c = jSONSerializeStringList;
            this.d = dlj0Var;
        }

        public /* synthetic */ d(int i) {
            this(new TabBarItems(true), new JSONSerializeStringList(), new dlj0(0));
        }
    }

    /* compiled from: Navigation.kt */
    /* loaded from: classes18.dex */
    public static final class e implements bxx {
        public final String b;
        public final String c;
        public final String d;

        public e(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("section_title", this.b);
            jSONObject.put("switcher_title", this.c);
            jSONObject.put("description", this.d);
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SettingsLabels(sectionTitle=");
            sb.append(this.b);
            sb.append(", switcherTitle=");
            sb.append(this.c);
            sb.append(", description=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: Navigation.kt */
    /* loaded from: classes18.dex */
    public static final class f implements bxx {
        public final String b;
        public final String c;

        public f(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", this.b);
            jSONObject.put("settings_button", this.c);
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuccessMessage(text=");
            sb.append(this.b);
            sb.append(", settingsButton=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public a() {
        this((d) null, 3);
    }

    public final d b() {
        C0910a c0910a = this.c;
        return (c0910a == null || !c0910a.c()) ? this.b : c0910a.b();
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.b.e5());
        C0910a c0910a = this.c;
        if (c0910a != null) {
            jSONObject.put("variant", c0910a.e5());
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        C0910a c0910a = this.c;
        return hashCode + (c0910a == null ? 0 : c0910a.hashCode());
    }

    public final String toString() {
        return "Navigation(state=" + this.b + ", variant=" + this.c + ')';
    }

    public a(d dVar, C0910a c0910a) {
        this.b = dVar;
        this.c = c0910a;
    }

    public /* synthetic */ a(d dVar, int i) {
        this((i & 1) != 0 ? new d(0) : dVar, (C0910a) null);
    }
}

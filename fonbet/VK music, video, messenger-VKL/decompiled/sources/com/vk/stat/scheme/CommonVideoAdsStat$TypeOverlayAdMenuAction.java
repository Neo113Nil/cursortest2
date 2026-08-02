package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.k73;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoAdsStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoAdsStat$TypeOverlayAdMenuAction implements SchemeStat$TypeAction.b {
    public final transient String a;
    public final transient String b;

    @pmi0("common_fields")
    private final Object commonFields;

    @pmi0("complaint_reason")
    private final FilteredString filteredComplaintReason;

    @pmi0("render_id")
    private final FilteredString filteredRenderId;

    @pmi0("menu_action")
    private final MenuAction menuAction;

    @pmi0("menu_source")
    private final MenuSource menuSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class MenuAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MenuAction[] $VALUES;

        @pmi0("about_advertiser")
        public static final MenuAction ABOUT_ADVERTISER;

        @pmi0("complain")
        public static final MenuAction COMPLAIN;

        @pmi0("copy_erid")
        public static final MenuAction COPY_ERID;

        @pmi0("not_interesting")
        public static final MenuAction NOT_INTERESTING;

        @pmi0("open_menu")
        public static final MenuAction OPEN_MENU;

        @pmi0("other")
        public static final MenuAction OTHER;

        static {
            MenuAction menuAction = new MenuAction("OPEN_MENU", 0);
            OPEN_MENU = menuAction;
            MenuAction menuAction2 = new MenuAction("NOT_INTERESTING", 1);
            NOT_INTERESTING = menuAction2;
            MenuAction menuAction3 = new MenuAction("ABOUT_ADVERTISER", 2);
            ABOUT_ADVERTISER = menuAction3;
            MenuAction menuAction4 = new MenuAction("COPY_ERID", 3);
            COPY_ERID = menuAction4;
            MenuAction menuAction5 = new MenuAction("COMPLAIN", 4);
            COMPLAIN = menuAction5;
            MenuAction menuAction6 = new MenuAction(NativeAdContent.ViewTag.OTHER, 5);
            OTHER = menuAction6;
            MenuAction[] menuActionArr = {menuAction, menuAction2, menuAction3, menuAction4, menuAction5, menuAction6};
            $VALUES = menuActionArr;
            $ENTRIES = new asp(menuActionArr);
        }

        private MenuAction(String str, int i) {
        }

        public static MenuAction valueOf(String str) {
            return (MenuAction) Enum.valueOf(MenuAction.class, str);
        }

        public static MenuAction[] values() {
            return (MenuAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class MenuSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MenuSource[] $VALUES;

        @pmi0("overlay_menu")
        public static final MenuSource OVERLAY_MENU;

        static {
            MenuSource menuSource = new MenuSource("OVERLAY_MENU", 0);
            OVERLAY_MENU = menuSource;
            MenuSource[] menuSourceArr = {menuSource};
            $VALUES = menuSourceArr;
            $ENTRIES = new asp(menuSourceArr);
        }

        private MenuSource(String str, int i) {
        }

        public static MenuSource valueOf(String str) {
            return (MenuSource) Enum.valueOf(MenuSource.class, str);
        }

        public static MenuSource[] values() {
            return (MenuSource[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonVideoAdsStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoAdsStat$TypeOverlayAdMenuAction>, a9y<CommonVideoAdsStat$TypeOverlayAdMenuAction> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String C = fai.C(x9yVar, "render_id");
            Gson a = tru.a();
            b9y q = x9yVar.q("menu_action");
            Object obj = null;
            MenuAction menuAction = (MenuAction) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), MenuAction.class));
            String C2 = fai.C(x9yVar, "complaint_reason");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("menu_source");
            MenuSource menuSource = (MenuSource) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), MenuSource.class));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("common_fields");
            if (q3 != null && !(q3 instanceof u9y)) {
                obj = a3.fromJson(q3.k(), (Class<Object>) Object.class);
            }
            return new CommonVideoAdsStat$TypeOverlayAdMenuAction(C, menuAction, C2, menuSource, obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoAdsStat$TypeOverlayAdMenuAction commonVideoAdsStat$TypeOverlayAdMenuAction = (CommonVideoAdsStat$TypeOverlayAdMenuAction) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("render_id", commonVideoAdsStat$TypeOverlayAdMenuAction.a);
            x9yVar.o("menu_action", tru.a().toJson(commonVideoAdsStat$TypeOverlayAdMenuAction.b()));
            x9yVar.o("complaint_reason", commonVideoAdsStat$TypeOverlayAdMenuAction.b);
            x9yVar.o("menu_source", tru.a().toJson(commonVideoAdsStat$TypeOverlayAdMenuAction.c()));
            x9yVar.o("common_fields", tru.a().toJson(commonVideoAdsStat$TypeOverlayAdMenuAction.a()));
            return x9yVar;
        }
    }

    public CommonVideoAdsStat$TypeOverlayAdMenuAction() {
        this(null, null, null, null, null, 31, null);
    }

    public final Object a() {
        return this.commonFields;
    }

    public final MenuAction b() {
        return this.menuAction;
    }

    public final MenuSource c() {
        return this.menuSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoAdsStat$TypeOverlayAdMenuAction)) {
            return false;
        }
        CommonVideoAdsStat$TypeOverlayAdMenuAction commonVideoAdsStat$TypeOverlayAdMenuAction = (CommonVideoAdsStat$TypeOverlayAdMenuAction) obj;
        return epx.f(this.a, commonVideoAdsStat$TypeOverlayAdMenuAction.a) && this.menuAction == commonVideoAdsStat$TypeOverlayAdMenuAction.menuAction && epx.f(this.b, commonVideoAdsStat$TypeOverlayAdMenuAction.b) && this.menuSource == commonVideoAdsStat$TypeOverlayAdMenuAction.menuSource && epx.f(this.commonFields, commonVideoAdsStat$TypeOverlayAdMenuAction.commonFields);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        MenuAction menuAction = this.menuAction;
        int hashCode2 = (hashCode + (menuAction == null ? 0 : menuAction.hashCode())) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MenuSource menuSource = this.menuSource;
        int hashCode4 = (hashCode3 + (menuSource == null ? 0 : menuSource.hashCode())) * 31;
        Object obj = this.commonFields;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOverlayAdMenuAction(renderId=");
        sb.append(this.a);
        sb.append(", menuAction=");
        sb.append(this.menuAction);
        sb.append(", complaintReason=");
        sb.append(this.b);
        sb.append(", menuSource=");
        sb.append(this.menuSource);
        sb.append(", commonFields=");
        return k73.c(sb, this.commonFields, ')');
    }

    public CommonVideoAdsStat$TypeOverlayAdMenuAction(String str, MenuAction menuAction, String str2, MenuSource menuSource, Object obj) {
        this.a = str;
        this.menuAction = menuAction;
        this.b = str2;
        this.menuSource = menuSource;
        this.commonFields = obj;
        FilteredString filteredString = new FilteredString(lhg.b(63));
        this.filteredRenderId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(255));
        this.filteredComplaintReason = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public /* synthetic */ CommonVideoAdsStat$TypeOverlayAdMenuAction(String str, MenuAction menuAction, String str2, MenuSource menuSource, Object obj, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : menuAction, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : menuSource, (i & 16) != 0 ? null : obj);
    }
}

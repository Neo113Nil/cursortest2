package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeUniversalWidget implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("element_action_index")
    private final int elementActionIndex;

    @pmi0("element_ui_type")
    private final ElementUiType elementUiType;

    @pmi0("event_name")
    private final EventName eventName;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("widget_id")
    private final String widgetId;

    @pmi0("widget_number")
    private final int widgetNumber;

    @pmi0("widget_uid")
    private final String widgetUid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class ElementUiType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ElementUiType[] $VALUES;

        @pmi0("button")
        public static final ElementUiType BUTTON;

        @pmi0("footer")
        public static final ElementUiType FOOTER;

        @pmi0("header")
        public static final ElementUiType HEADER;

        @pmi0("icon")
        public static final ElementUiType ICON;

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        public static final ElementUiType ITEM;

        @pmi0("need_permission")
        public static final ElementUiType NEED_PERMISSION;

        @pmi0("show_all")
        public static final ElementUiType SHOW_ALL;

        @pmi0("title")
        public static final ElementUiType TITLE;

        @pmi0("widget")
        public static final ElementUiType WIDGET;

        static {
            ElementUiType elementUiType = new ElementUiType("HEADER", 0);
            HEADER = elementUiType;
            ElementUiType elementUiType2 = new ElementUiType("FOOTER", 1);
            FOOTER = elementUiType2;
            ElementUiType elementUiType3 = new ElementUiType("BUTTON", 2);
            BUTTON = elementUiType3;
            ElementUiType elementUiType4 = new ElementUiType("SHOW_ALL", 3);
            SHOW_ALL = elementUiType4;
            ElementUiType elementUiType5 = new ElementUiType("ITEM", 4);
            ITEM = elementUiType5;
            ElementUiType elementUiType6 = new ElementUiType(NativeAdContent.ViewTag.AD_TITLE, 5);
            TITLE = elementUiType6;
            ElementUiType elementUiType7 = new ElementUiType("NEED_PERMISSION", 6);
            NEED_PERMISSION = elementUiType7;
            ElementUiType elementUiType8 = new ElementUiType("WIDGET", 7);
            WIDGET = elementUiType8;
            ElementUiType elementUiType9 = new ElementUiType(NativeAdContent.ViewTag.AD_ICON, 8);
            ICON = elementUiType9;
            ElementUiType[] elementUiTypeArr = {elementUiType, elementUiType2, elementUiType3, elementUiType4, elementUiType5, elementUiType6, elementUiType7, elementUiType8, elementUiType9};
            $VALUES = elementUiTypeArr;
            $ENTRIES = new asp(elementUiTypeArr);
        }

        private ElementUiType(String str, int i) {
        }

        public static ElementUiType valueOf(String str) {
            return (ElementUiType) Enum.valueOf(ElementUiType.class, str);
        }

        public static ElementUiType[] values() {
            return (ElementUiType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventName[] $VALUES;

        @pmi0("longtap")
        public static final EventName LONGTAP;

        @pmi0("tap")
        public static final EventName TAP;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
        public static final EventName VIEW;

        static {
            EventName eventName = new EventName("VIEW", 0);
            VIEW = eventName;
            EventName eventName2 = new EventName("TAP", 1);
            TAP = eventName2;
            EventName eventName3 = new EventName("LONGTAP", 2);
            LONGTAP = eventName3;
            EventName[] eventNameArr = {eventName, eventName2, eventName3};
            $VALUES = eventNameArr;
            $ENTRIES = new asp(eventNameArr);
        }

        private EventName(String str, int i) {
        }

        public static EventName valueOf(String str) {
            return (EventName) Enum.valueOf(EventName.class, str);
        }

        public static EventName[] values() {
            return (EventName[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeUniversalWidget>, a9y<SchemeStat$TypeUniversalWidget> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new SchemeStat$TypeUniversalWidget(fai.s(x9yVar, "track_code"), (EventName) dq.f(x9yVar, "event_name", tru.a(), EventName.class), fai.s(x9yVar, "widget_id"), fai.p(x9yVar, "widget_number"), (ElementUiType) dq.f(x9yVar, "element_ui_type", tru.a(), ElementUiType.class), fai.p(x9yVar, "element_action_index"), fai.C(x9yVar, "widget_uid"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeUniversalWidget schemeStat$TypeUniversalWidget = (SchemeStat$TypeUniversalWidget) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("track_code", schemeStat$TypeUniversalWidget.a);
            x9yVar.o("event_name", tru.a().toJson(schemeStat$TypeUniversalWidget.c()));
            x9yVar.o("widget_id", schemeStat$TypeUniversalWidget.d());
            x9yVar.n("widget_number", Integer.valueOf(schemeStat$TypeUniversalWidget.e()));
            x9yVar.o("element_ui_type", tru.a().toJson(schemeStat$TypeUniversalWidget.b()));
            x9yVar.n("element_action_index", Integer.valueOf(schemeStat$TypeUniversalWidget.a()));
            x9yVar.o("widget_uid", schemeStat$TypeUniversalWidget.f());
            return x9yVar;
        }
    }

    public SchemeStat$TypeUniversalWidget(String str, EventName eventName, String str2, int i, ElementUiType elementUiType, int i2, String str3) {
        this.a = str;
        this.eventName = eventName;
        this.widgetId = str2;
        this.widgetNumber = i;
        this.elementUiType = elementUiType;
        this.elementActionIndex = i2;
        this.widgetUid = str3;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final int a() {
        return this.elementActionIndex;
    }

    public final ElementUiType b() {
        return this.elementUiType;
    }

    public final EventName c() {
        return this.eventName;
    }

    public final String d() {
        return this.widgetId;
    }

    public final int e() {
        return this.widgetNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeUniversalWidget)) {
            return false;
        }
        SchemeStat$TypeUniversalWidget schemeStat$TypeUniversalWidget = (SchemeStat$TypeUniversalWidget) obj;
        return epx.f(this.a, schemeStat$TypeUniversalWidget.a) && this.eventName == schemeStat$TypeUniversalWidget.eventName && epx.f(this.widgetId, schemeStat$TypeUniversalWidget.widgetId) && this.widgetNumber == schemeStat$TypeUniversalWidget.widgetNumber && this.elementUiType == schemeStat$TypeUniversalWidget.elementUiType && this.elementActionIndex == schemeStat$TypeUniversalWidget.elementActionIndex && epx.f(this.widgetUid, schemeStat$TypeUniversalWidget.widgetUid);
    }

    public final String f() {
        return this.widgetUid;
    }

    public final int hashCode() {
        int a = shy.a(this.elementActionIndex, (this.elementUiType.hashCode() + shy.a(this.widgetNumber, urd0.a((this.eventName.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.widgetId), 31)) * 31, 31);
        String str = this.widgetUid;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeUniversalWidget(trackCode=");
        sb.append(this.a);
        sb.append(", eventName=");
        sb.append(this.eventName);
        sb.append(", widgetId=");
        sb.append(this.widgetId);
        sb.append(", widgetNumber=");
        sb.append(this.widgetNumber);
        sb.append(", elementUiType=");
        sb.append(this.elementUiType);
        sb.append(", elementActionIndex=");
        sb.append(this.elementActionIndex);
        sb.append(", widgetUid=");
        return ho8.a(sb, this.widgetUid, ')');
    }

    public /* synthetic */ SchemeStat$TypeUniversalWidget(String str, EventName eventName, String str2, int i, ElementUiType elementUiType, int i2, String str3, int i3, zcl zclVar) {
        this(str, eventName, str2, i, elementUiType, i2, (i3 & 64) != 0 ? null : str3);
    }
}

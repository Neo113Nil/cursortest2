package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.uqi;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("button_click_type")
    private final ButtonClickType buttonClickType;

    @pmi0("event_source")
    private final MobileOfficialAppsVideoStat$VideoEventSource eventSource;

    @pmi0("vsid")
    private final FilteredString filteredVsid;

    @pmi0("position_sec")
    private final Integer positionSec;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class ButtonClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonClickType[] $VALUES;

        @pmi0("autoplay_turn_off")
        public static final ButtonClickType AUTOPLAY_TURN_OFF;

        @pmi0("autoplay_turn_on")
        public static final ButtonClickType AUTOPLAY_TURN_ON;

        @pmi0("back_button_tap")
        public static final ButtonClickType BACK_BUTTON_TAP;

        @pmi0("click_to_external_device_share_button")
        public static final ButtonClickType CLICK_TO_EXTERNAL_DEVICE_SHARE_BUTTON;

        @pmi0("click_to_player_settings_button")
        public static final ButtonClickType CLICK_TO_PLAYER_SETTINGS_BUTTON;

        @pmi0("click_to_settings_quality_button")
        public static final ButtonClickType CLICK_TO_SETTINGS_QUALITY_BUTTON;

        @pmi0("close_button_tap")
        public static final ButtonClickType CLOSE_BUTTON_TAP;

        @pmi0("expand_video")
        public static final ButtonClickType EXPAND_VIDEO;

        @pmi0("undo_expand_video")
        public static final ButtonClickType UNDO_EXPAND_VIDEO;

        static {
            ButtonClickType buttonClickType = new ButtonClickType("BACK_BUTTON_TAP", 0);
            BACK_BUTTON_TAP = buttonClickType;
            ButtonClickType buttonClickType2 = new ButtonClickType("CLOSE_BUTTON_TAP", 1);
            CLOSE_BUTTON_TAP = buttonClickType2;
            ButtonClickType buttonClickType3 = new ButtonClickType("CLICK_TO_EXTERNAL_DEVICE_SHARE_BUTTON", 2);
            CLICK_TO_EXTERNAL_DEVICE_SHARE_BUTTON = buttonClickType3;
            ButtonClickType buttonClickType4 = new ButtonClickType("EXPAND_VIDEO", 3);
            EXPAND_VIDEO = buttonClickType4;
            ButtonClickType buttonClickType5 = new ButtonClickType("UNDO_EXPAND_VIDEO", 4);
            UNDO_EXPAND_VIDEO = buttonClickType5;
            ButtonClickType buttonClickType6 = new ButtonClickType("CLICK_TO_PLAYER_SETTINGS_BUTTON", 5);
            CLICK_TO_PLAYER_SETTINGS_BUTTON = buttonClickType6;
            ButtonClickType buttonClickType7 = new ButtonClickType("AUTOPLAY_TURN_ON", 6);
            AUTOPLAY_TURN_ON = buttonClickType7;
            ButtonClickType buttonClickType8 = new ButtonClickType("AUTOPLAY_TURN_OFF", 7);
            AUTOPLAY_TURN_OFF = buttonClickType8;
            ButtonClickType buttonClickType9 = new ButtonClickType("CLICK_TO_SETTINGS_QUALITY_BUTTON", 8);
            CLICK_TO_SETTINGS_QUALITY_BUTTON = buttonClickType9;
            ButtonClickType[] buttonClickTypeArr = {buttonClickType, buttonClickType2, buttonClickType3, buttonClickType4, buttonClickType5, buttonClickType6, buttonClickType7, buttonClickType8, buttonClickType9};
            $VALUES = buttonClickTypeArr;
            $ENTRIES = new asp(buttonClickTypeArr);
        }

        private ButtonClickType(String str, int i) {
        }

        public static ButtonClickType valueOf(String str) {
            return (ButtonClickType) Enum.valueOf(ButtonClickType.class, str);
        }

        public static ButtonClickType[] values() {
            return (ButtonClickType[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick>, a9y<MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            ButtonClickType buttonClickType = (ButtonClickType) dq.f(x9yVar, "button_click_type", tru.a(), ButtonClickType.class);
            String C = fai.C(x9yVar, "vsid");
            Gson a = tru.a();
            b9y q = x9yVar.q("screen_mode");
            Object obj = null;
            MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = (MobileOfficialAppsVideoStat$TypeScreenMode) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), MobileOfficialAppsVideoStat$TypeScreenMode.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("event_source");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) MobileOfficialAppsVideoStat$VideoEventSource.class);
            }
            return new MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick(buttonClickType, C, mobileOfficialAppsVideoStat$TypeScreenMode, (MobileOfficialAppsVideoStat$VideoEventSource) obj, fai.A(x9yVar, "position_sec"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick = (MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("button_click_type", tru.a().toJson(mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.a()));
            x9yVar.o("vsid", mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.a);
            x9yVar.o("screen_mode", tru.a().toJson(mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.d()));
            x9yVar.o("event_source", tru.a().toJson(mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.b()));
            x9yVar.n("position_sec", mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.c());
            return x9yVar;
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick(ButtonClickType buttonClickType, String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, Integer num) {
        this.buttonClickType = buttonClickType;
        this.a = str;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.eventSource = mobileOfficialAppsVideoStat$VideoEventSource;
        this.positionSec = num;
        FilteredString filteredString = new FilteredString(lhg.b(14));
        this.filteredVsid = filteredString;
        filteredString.a(str);
    }

    public final ButtonClickType a() {
        return this.buttonClickType;
    }

    public final MobileOfficialAppsVideoStat$VideoEventSource b() {
        return this.eventSource;
    }

    public final Integer c() {
        return this.positionSec;
    }

    public final MobileOfficialAppsVideoStat$TypeScreenMode d() {
        return this.screenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick = (MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick) obj;
        return this.buttonClickType == mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.buttonClickType && epx.f(this.a, mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.a) && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.screenMode && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.eventSource && epx.f(this.positionSec, mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.positionSec);
    }

    public final int hashCode() {
        int hashCode = this.buttonClickType.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode())) * 31;
        MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource = this.eventSource;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsVideoStat$VideoEventSource == null ? 0 : mobileOfficialAppsVideoStat$VideoEventSource.hashCode())) * 31;
        Integer num = this.positionSec;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoPlayerButtonClick(buttonClickType=");
        sb.append(this.buttonClickType);
        sb.append(", vsid=");
        sb.append(this.a);
        sb.append(", screenMode=");
        sb.append(this.screenMode);
        sb.append(", eventSource=");
        sb.append(this.eventSource);
        sb.append(", positionSec=");
        return uqi.b(sb, this.positionSec, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick(ButtonClickType buttonClickType, String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, Integer num, int i, zcl zclVar) {
        this(buttonClickType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode, (i & 8) != 0 ? null : mobileOfficialAppsVideoStat$VideoEventSource, (i & 16) != 0 ? null : num);
    }
}

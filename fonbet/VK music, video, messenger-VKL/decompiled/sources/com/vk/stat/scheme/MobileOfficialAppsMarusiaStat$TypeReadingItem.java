package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeReadingItem implements SchemeStat$TypeAction.b, SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("action")
    private final Action action;

    @pmi0("article_id")
    private final int articleId;

    @pmi0("audio_length")
    private final Integer audioLength;

    @pmi0("nav_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen navScreen;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("source")
    private final Source source;

    @pmi0("speed")
    private final Integer speed;

    @pmi0("start_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen startScreen;

    @pmi0("volume")
    private final Integer volume;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Action CLOSE;

        @pmi0("continue")
        public static final Action CONTINUE;

        @pmi0("go_to_article")
        public static final Action GO_TO_ARTICLE;

        @pmi0("pause")
        public static final Action PAUSE;

        @pmi0("player_expand")
        public static final Action PLAYER_EXPAND;

        @pmi0("player_minimize")
        public static final Action PLAYER_MINIMIZE;

        @pmi0("seek")
        public static final Action SEEK;

        @pmi0("set_dream_timer")
        public static final Action SET_DREAM_TIMER;

        @pmi0("start")
        public static final Action START;

        @pmi0("100p")
        public static final Action TYPE_100P;

        @pmi0("10p")
        public static final Action TYPE_10P;

        @pmi0("25p")
        public static final Action TYPE_25P;

        @pmi0("50p")
        public static final Action TYPE_50P;

        @pmi0("75p")
        public static final Action TYPE_75P;

        @pmi0("95p")
        public static final Action TYPE_95P;

        @pmi0("99p")
        public static final Action TYPE_99P;

        static {
            Action action = new Action("START", 0);
            START = action;
            Action action2 = new Action("PAUSE", 1);
            PAUSE = action2;
            Action action3 = new Action("CONTINUE", 2);
            CONTINUE = action3;
            Action action4 = new Action("SEEK", 3);
            SEEK = action4;
            Action action5 = new Action("PLAYER_EXPAND", 4);
            PLAYER_EXPAND = action5;
            Action action6 = new Action("PLAYER_MINIMIZE", 5);
            PLAYER_MINIMIZE = action6;
            Action action7 = new Action("CLOSE", 6);
            CLOSE = action7;
            Action action8 = new Action("TYPE_10P", 7);
            TYPE_10P = action8;
            Action action9 = new Action("TYPE_25P", 8);
            TYPE_25P = action9;
            Action action10 = new Action("TYPE_50P", 9);
            TYPE_50P = action10;
            Action action11 = new Action("TYPE_75P", 10);
            TYPE_75P = action11;
            Action action12 = new Action("TYPE_95P", 11);
            TYPE_95P = action12;
            Action action13 = new Action("TYPE_99P", 12);
            TYPE_99P = action13;
            Action action14 = new Action("TYPE_100P", 13);
            TYPE_100P = action14;
            Action action15 = new Action("GO_TO_ARTICLE", 14);
            GO_TO_ARTICLE = action15;
            Action action16 = new Action("SET_DREAM_TIMER", 15);
            SET_DREAM_TIMER = action16;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11, action12, action13, action14, action15, action16};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        private Action(String str, int i) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("article")
        public static final Source ARTICLE;

        @pmi0("snippet")
        public static final Source SNIPPET;

        static {
            Source source = new Source("SNIPPET", 0);
            SNIPPET = source;
            Source source2 = new Source("ARTICLE", 1);
            ARTICLE = source2;
            Source[] sourceArr = {source, source2};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsMarusiaStat$TypeReadingItem(int i, long j, Integer num, Integer num2, Integer num3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2, Source source, Action action) {
        this.articleId = i;
        this.ownerId = j;
        this.audioLength = num;
        this.speed = num2;
        this.volume = num3;
        this.navScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.startScreen = mobileOfficialAppsCoreNavStat$EventScreen2;
        this.source = source;
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarusiaStat$TypeReadingItem)) {
            return false;
        }
        MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem = (MobileOfficialAppsMarusiaStat$TypeReadingItem) obj;
        return this.articleId == mobileOfficialAppsMarusiaStat$TypeReadingItem.articleId && this.ownerId == mobileOfficialAppsMarusiaStat$TypeReadingItem.ownerId && epx.f(this.audioLength, mobileOfficialAppsMarusiaStat$TypeReadingItem.audioLength) && epx.f(this.speed, mobileOfficialAppsMarusiaStat$TypeReadingItem.speed) && epx.f(this.volume, mobileOfficialAppsMarusiaStat$TypeReadingItem.volume) && this.navScreen == mobileOfficialAppsMarusiaStat$TypeReadingItem.navScreen && this.startScreen == mobileOfficialAppsMarusiaStat$TypeReadingItem.startScreen && this.source == mobileOfficialAppsMarusiaStat$TypeReadingItem.source && this.action == mobileOfficialAppsMarusiaStat$TypeReadingItem.action;
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.articleId) * 31, 31, this.ownerId);
        Integer num = this.audioLength;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.speed;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.volume;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.navScreen;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = this.startScreen;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsCoreNavStat$EventScreen2 == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen2.hashCode())) * 31;
        Source source = this.source;
        int hashCode6 = (hashCode5 + (source == null ? 0 : source.hashCode())) * 31;
        Action action = this.action;
        return hashCode6 + (action != null ? action.hashCode() : 0);
    }

    public final String toString() {
        return "TypeReadingItem(articleId=" + this.articleId + ", ownerId=" + this.ownerId + ", audioLength=" + this.audioLength + ", speed=" + this.speed + ", volume=" + this.volume + ", navScreen=" + this.navScreen + ", startScreen=" + this.startScreen + ", source=" + this.source + ", action=" + this.action + ')';
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeReadingItem(int i, long j, Integer num, Integer num2, Integer num3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2, Source source, Action action, int i2, zcl zclVar) {
        this(i, j, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : num3, (i2 & 32) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i2 & 64) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen2, (i2 & 128) != 0 ? null : source, (i2 & 256) != 0 ? null : action);
    }
}

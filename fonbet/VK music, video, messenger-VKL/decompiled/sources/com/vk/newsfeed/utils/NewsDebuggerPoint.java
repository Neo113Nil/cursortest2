package com.vk.newsfeed.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsDebuggerPoint.kt */
/* loaded from: classes4.dex */
public final class NewsDebuggerPoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsDebuggerPoint[] $VALUES;
    public static final NewsDebuggerPoint ActivityPause;
    public static final NewsDebuggerPoint ActivityResumeSchedule;
    public static final NewsDebuggerPoint ActivityResumeScheduleInactiveTask;
    public static final NewsDebuggerPoint ActivityStart;
    public static final NewsDebuggerPoint ActivityStop;
    public static final NewsDebuggerPoint AppendFreshTopNews;
    public static final NewsDebuggerPoint ChangeList;
    public static final NewsDebuggerPoint EmptyResponse;
    public static final NewsDebuggerPoint ExecuteEmptyTask;
    public static final NewsDebuggerPoint ExecuteInactiveTaskPeriod;
    public static final NewsDebuggerPoint FreshNewsLoaded;
    public static final NewsDebuggerPoint FreshRecentNewsLoaded;
    public static final NewsDebuggerPoint FreshRecentNewsLoadedDisplayFreshButton;
    public static final NewsDebuggerPoint FreshRecentNewsLoadedForceReplace;
    public static final NewsDebuggerPoint FreshRecentNewsLoadedNoIntersection;
    public static final NewsDebuggerPoint FreshRecentNewsLoadedPrepend;
    public static final NewsDebuggerPoint FreshRecentNewsLoadedUpdateEntriesCounters;
    public static final NewsDebuggerPoint HasFreshDisplayFreshButton;
    public static final NewsDebuggerPoint HasFreshForceFeedReplac;
    public static final NewsDebuggerPoint InitialLoaded;
    public static final NewsDebuggerPoint Lifecycle;
    public static final NewsDebuggerPoint LoadChangeList;
    public static final NewsDebuggerPoint LoadFirstPage;
    public static final NewsDebuggerPoint LoadInitial;
    public static final NewsDebuggerPoint LoadNextPage;
    public static final NewsDebuggerPoint LoadRetry;
    public static final NewsDebuggerPoint NextPageLoaded;
    public static final NewsDebuggerPoint OnFreshNewsLoaded;
    public static final NewsDebuggerPoint OnFreshNewsResponse;
    public static final NewsDebuggerPoint PeriodicallyScheduled;
    public static final NewsDebuggerPoint Ptr;
    public static final NewsDebuggerPoint PtrLoaded;
    public static final NewsDebuggerPoint Reload;
    public static final NewsDebuggerPoint Reloaded;
    public static final NewsDebuggerPoint Reschedule;
    public static final NewsDebuggerPoint ReschedulePeriod;
    public static final NewsDebuggerPoint Resume;
    public static final NewsDebuggerPoint SaveChangeList;
    public static final NewsDebuggerPoint SaveFreshNews;
    public static final NewsDebuggerPoint SaveInitial;
    public static final NewsDebuggerPoint SaveNextPage;
    public static final NewsDebuggerPoint SchedulePeriodicallyWithDisableToggle;
    public static final NewsDebuggerPoint ScreenVisibility;
    public static final NewsDebuggerPoint SendRequest;
    public static final NewsDebuggerPoint ShowFreshTopNews;
    public static final NewsDebuggerPoint ShowFreshTopNewsDisplayFreshButton;
    public static final NewsDebuggerPoint ShowFreshTopNewsForceReplace;
    public static final NewsDebuggerPoint ShowFreshTopNewsUpdateEntriesCounters;
    public static final NewsDebuggerPoint StartFreshNewsRequest;
    public static final NewsDebuggerPoint StopTasks;
    public static final NewsDebuggerPoint StoriesActivityPause;
    public static final NewsDebuggerPoint StoriesActivityResume;
    public static final NewsDebuggerPoint StoriesPause;
    public static final NewsDebuggerPoint StoriesReload;
    public static final NewsDebuggerPoint StoriesResume;

    static {
        NewsDebuggerPoint newsDebuggerPoint = new NewsDebuggerPoint("ChangeList", 0);
        ChangeList = newsDebuggerPoint;
        NewsDebuggerPoint newsDebuggerPoint2 = new NewsDebuggerPoint("LoadChangeList", 1);
        LoadChangeList = newsDebuggerPoint2;
        NewsDebuggerPoint newsDebuggerPoint3 = new NewsDebuggerPoint("SaveChangeList", 2);
        SaveChangeList = newsDebuggerPoint3;
        NewsDebuggerPoint newsDebuggerPoint4 = new NewsDebuggerPoint("LoadRetry", 3);
        LoadRetry = newsDebuggerPoint4;
        NewsDebuggerPoint newsDebuggerPoint5 = new NewsDebuggerPoint("SaveInitial", 4);
        SaveInitial = newsDebuggerPoint5;
        NewsDebuggerPoint newsDebuggerPoint6 = new NewsDebuggerPoint("LoadInitial", 5);
        LoadInitial = newsDebuggerPoint6;
        NewsDebuggerPoint newsDebuggerPoint7 = new NewsDebuggerPoint("InitialLoaded", 6);
        InitialLoaded = newsDebuggerPoint7;
        NewsDebuggerPoint newsDebuggerPoint8 = new NewsDebuggerPoint("LoadFirstPage", 7);
        LoadFirstPage = newsDebuggerPoint8;
        NewsDebuggerPoint newsDebuggerPoint9 = new NewsDebuggerPoint("Reload", 8);
        Reload = newsDebuggerPoint9;
        NewsDebuggerPoint newsDebuggerPoint10 = new NewsDebuggerPoint("Reloaded", 9);
        Reloaded = newsDebuggerPoint10;
        NewsDebuggerPoint newsDebuggerPoint11 = new NewsDebuggerPoint("Ptr", 10);
        Ptr = newsDebuggerPoint11;
        NewsDebuggerPoint newsDebuggerPoint12 = new NewsDebuggerPoint("PtrLoaded", 11);
        PtrLoaded = newsDebuggerPoint12;
        NewsDebuggerPoint newsDebuggerPoint13 = new NewsDebuggerPoint("LoadNextPage", 12);
        LoadNextPage = newsDebuggerPoint13;
        NewsDebuggerPoint newsDebuggerPoint14 = new NewsDebuggerPoint("SaveNextPage", 13);
        SaveNextPage = newsDebuggerPoint14;
        NewsDebuggerPoint newsDebuggerPoint15 = new NewsDebuggerPoint("NextPageLoaded", 14);
        NextPageLoaded = newsDebuggerPoint15;
        NewsDebuggerPoint newsDebuggerPoint16 = new NewsDebuggerPoint("FreshNewsLoaded", 15);
        FreshNewsLoaded = newsDebuggerPoint16;
        NewsDebuggerPoint newsDebuggerPoint17 = new NewsDebuggerPoint("Resume", 16);
        Resume = newsDebuggerPoint17;
        NewsDebuggerPoint newsDebuggerPoint18 = new NewsDebuggerPoint("PeriodicallyScheduled", 17);
        PeriodicallyScheduled = newsDebuggerPoint18;
        NewsDebuggerPoint newsDebuggerPoint19 = new NewsDebuggerPoint("SchedulePeriodicallyWithDisableToggle", 18);
        SchedulePeriodicallyWithDisableToggle = newsDebuggerPoint19;
        NewsDebuggerPoint newsDebuggerPoint20 = new NewsDebuggerPoint("Reschedule", 19);
        Reschedule = newsDebuggerPoint20;
        NewsDebuggerPoint newsDebuggerPoint21 = new NewsDebuggerPoint("ReschedulePeriod", 20);
        ReschedulePeriod = newsDebuggerPoint21;
        NewsDebuggerPoint newsDebuggerPoint22 = new NewsDebuggerPoint("StopTasks", 21);
        StopTasks = newsDebuggerPoint22;
        NewsDebuggerPoint newsDebuggerPoint23 = new NewsDebuggerPoint("ExecuteInactiveTaskPeriod", 22);
        ExecuteInactiveTaskPeriod = newsDebuggerPoint23;
        NewsDebuggerPoint newsDebuggerPoint24 = new NewsDebuggerPoint("SaveFreshNews", 23);
        SaveFreshNews = newsDebuggerPoint24;
        NewsDebuggerPoint newsDebuggerPoint25 = new NewsDebuggerPoint("StartFreshNewsRequest", 24);
        StartFreshNewsRequest = newsDebuggerPoint25;
        NewsDebuggerPoint newsDebuggerPoint26 = new NewsDebuggerPoint("ExecuteEmptyTask", 25);
        ExecuteEmptyTask = newsDebuggerPoint26;
        NewsDebuggerPoint newsDebuggerPoint27 = new NewsDebuggerPoint("OnFreshNewsResponse", 26);
        OnFreshNewsResponse = newsDebuggerPoint27;
        NewsDebuggerPoint newsDebuggerPoint28 = new NewsDebuggerPoint("ActivityResumeScheduleInactiveTask", 27);
        ActivityResumeScheduleInactiveTask = newsDebuggerPoint28;
        NewsDebuggerPoint newsDebuggerPoint29 = new NewsDebuggerPoint("ActivityResumeSchedule", 28);
        ActivityResumeSchedule = newsDebuggerPoint29;
        NewsDebuggerPoint newsDebuggerPoint30 = new NewsDebuggerPoint("ActivityPause", 29);
        ActivityPause = newsDebuggerPoint30;
        NewsDebuggerPoint newsDebuggerPoint31 = new NewsDebuggerPoint("ActivityStart", 30);
        ActivityStart = newsDebuggerPoint31;
        NewsDebuggerPoint newsDebuggerPoint32 = new NewsDebuggerPoint("ActivityStop", 31);
        ActivityStop = newsDebuggerPoint32;
        NewsDebuggerPoint newsDebuggerPoint33 = new NewsDebuggerPoint("StoriesResume", 32);
        StoriesResume = newsDebuggerPoint33;
        NewsDebuggerPoint newsDebuggerPoint34 = new NewsDebuggerPoint("StoriesPause", 33);
        StoriesPause = newsDebuggerPoint34;
        NewsDebuggerPoint newsDebuggerPoint35 = new NewsDebuggerPoint("StoriesReload", 34);
        StoriesReload = newsDebuggerPoint35;
        NewsDebuggerPoint newsDebuggerPoint36 = new NewsDebuggerPoint("StoriesActivityResume", 35);
        StoriesActivityResume = newsDebuggerPoint36;
        NewsDebuggerPoint newsDebuggerPoint37 = new NewsDebuggerPoint("StoriesActivityPause", 36);
        StoriesActivityPause = newsDebuggerPoint37;
        NewsDebuggerPoint newsDebuggerPoint38 = new NewsDebuggerPoint("SendRequest", 37);
        SendRequest = newsDebuggerPoint38;
        NewsDebuggerPoint newsDebuggerPoint39 = new NewsDebuggerPoint("EmptyResponse", 38);
        EmptyResponse = newsDebuggerPoint39;
        NewsDebuggerPoint newsDebuggerPoint40 = new NewsDebuggerPoint("HasFreshDisplayFreshButton", 39);
        HasFreshDisplayFreshButton = newsDebuggerPoint40;
        NewsDebuggerPoint newsDebuggerPoint41 = new NewsDebuggerPoint("HasFreshForceFeedReplac", 40);
        HasFreshForceFeedReplac = newsDebuggerPoint41;
        NewsDebuggerPoint newsDebuggerPoint42 = new NewsDebuggerPoint("AppendFreshTopNews", 41);
        AppendFreshTopNews = newsDebuggerPoint42;
        NewsDebuggerPoint newsDebuggerPoint43 = new NewsDebuggerPoint("ShowFreshTopNews", 42);
        ShowFreshTopNews = newsDebuggerPoint43;
        NewsDebuggerPoint newsDebuggerPoint44 = new NewsDebuggerPoint("FreshRecentNewsLoaded", 43);
        FreshRecentNewsLoaded = newsDebuggerPoint44;
        NewsDebuggerPoint newsDebuggerPoint45 = new NewsDebuggerPoint("FreshRecentNewsLoadedPrepend", 44);
        FreshRecentNewsLoadedPrepend = newsDebuggerPoint45;
        NewsDebuggerPoint newsDebuggerPoint46 = new NewsDebuggerPoint("FreshRecentNewsLoadedDisplayFreshButton", 45);
        FreshRecentNewsLoadedDisplayFreshButton = newsDebuggerPoint46;
        NewsDebuggerPoint newsDebuggerPoint47 = new NewsDebuggerPoint("FreshRecentNewsLoadedUpdateEntriesCounters", 46);
        FreshRecentNewsLoadedUpdateEntriesCounters = newsDebuggerPoint47;
        NewsDebuggerPoint newsDebuggerPoint48 = new NewsDebuggerPoint("FreshRecentNewsLoadedForceReplace", 47);
        FreshRecentNewsLoadedForceReplace = newsDebuggerPoint48;
        NewsDebuggerPoint newsDebuggerPoint49 = new NewsDebuggerPoint("FreshRecentNewsLoadedNoIntersection", 48);
        FreshRecentNewsLoadedNoIntersection = newsDebuggerPoint49;
        NewsDebuggerPoint newsDebuggerPoint50 = new NewsDebuggerPoint("ShowFreshTopNewsForceReplace", 49);
        ShowFreshTopNewsForceReplace = newsDebuggerPoint50;
        NewsDebuggerPoint newsDebuggerPoint51 = new NewsDebuggerPoint("ShowFreshTopNewsDisplayFreshButton", 50);
        ShowFreshTopNewsDisplayFreshButton = newsDebuggerPoint51;
        NewsDebuggerPoint newsDebuggerPoint52 = new NewsDebuggerPoint("ShowFreshTopNewsUpdateEntriesCounters", 51);
        ShowFreshTopNewsUpdateEntriesCounters = newsDebuggerPoint52;
        NewsDebuggerPoint newsDebuggerPoint53 = new NewsDebuggerPoint("OnFreshNewsLoaded", 52);
        OnFreshNewsLoaded = newsDebuggerPoint53;
        NewsDebuggerPoint newsDebuggerPoint54 = new NewsDebuggerPoint("ScreenVisibility", 53);
        ScreenVisibility = newsDebuggerPoint54;
        NewsDebuggerPoint newsDebuggerPoint55 = new NewsDebuggerPoint("Lifecycle", 54);
        Lifecycle = newsDebuggerPoint55;
        NewsDebuggerPoint[] newsDebuggerPointArr = {newsDebuggerPoint, newsDebuggerPoint2, newsDebuggerPoint3, newsDebuggerPoint4, newsDebuggerPoint5, newsDebuggerPoint6, newsDebuggerPoint7, newsDebuggerPoint8, newsDebuggerPoint9, newsDebuggerPoint10, newsDebuggerPoint11, newsDebuggerPoint12, newsDebuggerPoint13, newsDebuggerPoint14, newsDebuggerPoint15, newsDebuggerPoint16, newsDebuggerPoint17, newsDebuggerPoint18, newsDebuggerPoint19, newsDebuggerPoint20, newsDebuggerPoint21, newsDebuggerPoint22, newsDebuggerPoint23, newsDebuggerPoint24, newsDebuggerPoint25, newsDebuggerPoint26, newsDebuggerPoint27, newsDebuggerPoint28, newsDebuggerPoint29, newsDebuggerPoint30, newsDebuggerPoint31, newsDebuggerPoint32, newsDebuggerPoint33, newsDebuggerPoint34, newsDebuggerPoint35, newsDebuggerPoint36, newsDebuggerPoint37, newsDebuggerPoint38, newsDebuggerPoint39, newsDebuggerPoint40, newsDebuggerPoint41, newsDebuggerPoint42, newsDebuggerPoint43, newsDebuggerPoint44, newsDebuggerPoint45, newsDebuggerPoint46, newsDebuggerPoint47, newsDebuggerPoint48, newsDebuggerPoint49, newsDebuggerPoint50, newsDebuggerPoint51, newsDebuggerPoint52, newsDebuggerPoint53, newsDebuggerPoint54, newsDebuggerPoint55};
        $VALUES = newsDebuggerPointArr;
        $ENTRIES = new asp(newsDebuggerPointArr);
    }

    public NewsDebuggerPoint() {
        throw null;
    }

    public static NewsDebuggerPoint valueOf(String str) {
        return (NewsDebuggerPoint) Enum.valueOf(NewsDebuggerPoint.class, str);
    }

    public static NewsDebuggerPoint[] values() {
        return (NewsDebuggerPoint[]) $VALUES.clone();
    }
}

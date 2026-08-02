package com.vk.superapp.browser.internal.commands.controller;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkUiCommandsController.kt */
/* loaded from: classes6.dex */
public final class VkUiCommand {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkUiCommand[] $VALUES;
    public static final VkUiCommand ASK_GOOGLE_FIT_WORKOUT_PERMISSIONS;
    public static final VkUiCommand ASK_HEALTH_CONNECT_WORKOUT_PERMISSIONS;
    public static final VkUiCommand COMMUNITY_WIDGET_PREVIEW_BOX;
    public static final VkUiCommand COPY_TEXT;
    public static final VkUiCommand EMAIL;
    public static final VkUiCommand FRIENDS_SEARCH;
    public static final VkUiCommand GET_GOOGLE_FIT_STEPS_PERMISSIONS;
    public static final VkUiCommand GET_GOOGLE_FIT_WORKOUTS;
    public static final VkUiCommand GET_GOOGLE_FIT_WORKOUT_PERMISSIONS;
    public static final VkUiCommand GET_HEALTH_CONNECT_INFO;
    public static final VkUiCommand GET_HEALTH_CONNECT_STEPS;
    public static final VkUiCommand GET_HEALTH_CONNECT_STEPS_PERMISSIONS;
    public static final VkUiCommand GET_HEALTH_CONNECT_WORKOUTS;
    public static final VkUiCommand GET_HEALTH_CONNECT_WORKOUT_PERMISSIONS;
    public static final VkUiCommand GET_STEPS;
    public static final VkUiCommand INSTALL_BUNDLE;
    public static final VkUiCommand KEEP_SCREEN_ON;
    public static final VkUiCommand LEAVE_GROUP;
    public static final VkUiCommand OPEN_CONTACTS;
    public static final VkUiCommand OPEN_QR;
    public static final VkUiCommand OPEN_VMOJI_CAPTURE;
    public static final VkUiCommand PHONE;
    public static final VkUiCommand UPDATE_FOLLOWERS_MODE;
    public static final VkUiCommand UPDATE_MARKET_ITEM;

    static {
        VkUiCommand vkUiCommand = new VkUiCommand("PHONE", 0);
        PHONE = vkUiCommand;
        VkUiCommand vkUiCommand2 = new VkUiCommand(CommonConstant.RETKEY.EMAIL, 1);
        EMAIL = vkUiCommand2;
        VkUiCommand vkUiCommand3 = new VkUiCommand("OPEN_QR", 2);
        OPEN_QR = vkUiCommand3;
        VkUiCommand vkUiCommand4 = new VkUiCommand("FRIENDS_SEARCH", 3);
        FRIENDS_SEARCH = vkUiCommand4;
        VkUiCommand vkUiCommand5 = new VkUiCommand("OPEN_CONTACTS", 4);
        OPEN_CONTACTS = vkUiCommand5;
        VkUiCommand vkUiCommand6 = new VkUiCommand("OPEN_VMOJI_CAPTURE", 5);
        OPEN_VMOJI_CAPTURE = vkUiCommand6;
        VkUiCommand vkUiCommand7 = new VkUiCommand("COMMUNITY_WIDGET_PREVIEW_BOX", 6);
        COMMUNITY_WIDGET_PREVIEW_BOX = vkUiCommand7;
        VkUiCommand vkUiCommand8 = new VkUiCommand("COPY_TEXT", 7);
        COPY_TEXT = vkUiCommand8;
        VkUiCommand vkUiCommand9 = new VkUiCommand("INSTALL_BUNDLE", 8);
        INSTALL_BUNDLE = vkUiCommand9;
        VkUiCommand vkUiCommand10 = new VkUiCommand("LEAVE_GROUP", 9);
        LEAVE_GROUP = vkUiCommand10;
        VkUiCommand vkUiCommand11 = new VkUiCommand("KEEP_SCREEN_ON", 10);
        KEEP_SCREEN_ON = vkUiCommand11;
        VkUiCommand vkUiCommand12 = new VkUiCommand("GET_STEPS", 11);
        GET_STEPS = vkUiCommand12;
        VkUiCommand vkUiCommand13 = new VkUiCommand("GET_HEALTH_CONNECT_STEPS", 12);
        GET_HEALTH_CONNECT_STEPS = vkUiCommand13;
        VkUiCommand vkUiCommand14 = new VkUiCommand("GET_GOOGLE_FIT_WORKOUTS", 13);
        GET_GOOGLE_FIT_WORKOUTS = vkUiCommand14;
        VkUiCommand vkUiCommand15 = new VkUiCommand("GET_GOOGLE_FIT_WORKOUT_PERMISSIONS", 14);
        GET_GOOGLE_FIT_WORKOUT_PERMISSIONS = vkUiCommand15;
        VkUiCommand vkUiCommand16 = new VkUiCommand("ASK_GOOGLE_FIT_WORKOUT_PERMISSIONS", 15);
        ASK_GOOGLE_FIT_WORKOUT_PERMISSIONS = vkUiCommand16;
        VkUiCommand vkUiCommand17 = new VkUiCommand("GET_HEALTH_CONNECT_WORKOUTS", 16);
        GET_HEALTH_CONNECT_WORKOUTS = vkUiCommand17;
        VkUiCommand vkUiCommand18 = new VkUiCommand("GET_HEALTH_CONNECT_WORKOUT_PERMISSIONS", 17);
        GET_HEALTH_CONNECT_WORKOUT_PERMISSIONS = vkUiCommand18;
        VkUiCommand vkUiCommand19 = new VkUiCommand("ASK_HEALTH_CONNECT_WORKOUT_PERMISSIONS", 18);
        ASK_HEALTH_CONNECT_WORKOUT_PERMISSIONS = vkUiCommand19;
        VkUiCommand vkUiCommand20 = new VkUiCommand("GET_HEALTH_CONNECT_INFO", 19);
        GET_HEALTH_CONNECT_INFO = vkUiCommand20;
        VkUiCommand vkUiCommand21 = new VkUiCommand("UPDATE_MARKET_ITEM", 20);
        UPDATE_MARKET_ITEM = vkUiCommand21;
        VkUiCommand vkUiCommand22 = new VkUiCommand("GET_GOOGLE_FIT_STEPS_PERMISSIONS", 21);
        GET_GOOGLE_FIT_STEPS_PERMISSIONS = vkUiCommand22;
        VkUiCommand vkUiCommand23 = new VkUiCommand("GET_HEALTH_CONNECT_STEPS_PERMISSIONS", 22);
        GET_HEALTH_CONNECT_STEPS_PERMISSIONS = vkUiCommand23;
        VkUiCommand vkUiCommand24 = new VkUiCommand("UPDATE_FOLLOWERS_MODE", 23);
        UPDATE_FOLLOWERS_MODE = vkUiCommand24;
        VkUiCommand[] vkUiCommandArr = {vkUiCommand, vkUiCommand2, vkUiCommand3, vkUiCommand4, vkUiCommand5, vkUiCommand6, vkUiCommand7, vkUiCommand8, vkUiCommand9, vkUiCommand10, vkUiCommand11, vkUiCommand12, vkUiCommand13, vkUiCommand14, vkUiCommand15, vkUiCommand16, vkUiCommand17, vkUiCommand18, vkUiCommand19, vkUiCommand20, vkUiCommand21, vkUiCommand22, vkUiCommand23, vkUiCommand24};
        $VALUES = vkUiCommandArr;
        $ENTRIES = new asp(vkUiCommandArr);
    }

    public VkUiCommand() {
        throw null;
    }

    public static VkUiCommand valueOf(String str) {
        return (VkUiCommand) Enum.valueOf(VkUiCommand.class, str);
    }

    public static VkUiCommand[] values() {
        return (VkUiCommand[]) $VALUES.clone();
    }
}

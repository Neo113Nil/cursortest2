package com.vk.clips.design.view.sidecontrols.side.reactions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReactionsLoading.kt */
/* loaded from: classes16.dex */
public final class ReactionsLoading {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReactionsLoading[] $VALUES;
    public static final ReactionsLoading LOAD_ADD_DISLIKE;
    public static final ReactionsLoading LOAD_ADD_LIKE;
    public static final ReactionsLoading LOAD_REMOVE_DISLIKE;
    public static final ReactionsLoading LOAD_REMOVE_LIKE;
    public static final ReactionsLoading NONE;

    static {
        ReactionsLoading reactionsLoading = new ReactionsLoading("LOAD_ADD_LIKE", 0);
        LOAD_ADD_LIKE = reactionsLoading;
        ReactionsLoading reactionsLoading2 = new ReactionsLoading("LOAD_REMOVE_LIKE", 1);
        LOAD_REMOVE_LIKE = reactionsLoading2;
        ReactionsLoading reactionsLoading3 = new ReactionsLoading("LOAD_ADD_DISLIKE", 2);
        LOAD_ADD_DISLIKE = reactionsLoading3;
        ReactionsLoading reactionsLoading4 = new ReactionsLoading("LOAD_REMOVE_DISLIKE", 3);
        LOAD_REMOVE_DISLIKE = reactionsLoading4;
        ReactionsLoading reactionsLoading5 = new ReactionsLoading("NONE", 4);
        NONE = reactionsLoading5;
        ReactionsLoading[] reactionsLoadingArr = {reactionsLoading, reactionsLoading2, reactionsLoading3, reactionsLoading4, reactionsLoading5};
        $VALUES = reactionsLoadingArr;
        $ENTRIES = new asp(reactionsLoadingArr);
    }

    public ReactionsLoading() {
        throw null;
    }

    public static ReactionsLoading valueOf(String str) {
        return (ReactionsLoading) Enum.valueOf(ReactionsLoading.class, str);
    }

    public static ReactionsLoading[] values() {
        return (ReactionsLoading[]) $VALUES.clone();
    }
}

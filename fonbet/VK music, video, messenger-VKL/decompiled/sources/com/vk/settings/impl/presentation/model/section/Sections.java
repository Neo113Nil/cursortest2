package com.vk.settings.impl.presentation.model.section;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Sections.kt */
/* loaded from: classes5.dex */
public final class Sections {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Sections[] $VALUES;
    public static final Sections Communities;
    public static final Sections Feedback;
    public static final Sections Friends;
    public static final Sections Messenger;
    public static final Sections MiniApps;
    public static final Sections Other;
    public static final Sections Stories;
    private final String id;

    static {
        Sections sections = new Sections("Messenger", 0, "messenger");
        Messenger = sections;
        Sections sections2 = new Sections("Communities", 1, "communities");
        Communities = sections2;
        Sections sections3 = new Sections("Feedback", 2, "feedback");
        Feedback = sections3;
        Sections sections4 = new Sections("Friends", 3, "friends");
        Friends = sections4;
        Sections sections5 = new Sections("MiniApps", 4, "services");
        MiniApps = sections5;
        Sections sections6 = new Sections("Other", 5, "other");
        Other = sections6;
        Sections sections7 = new Sections("Stories", 6, "stories");
        Stories = sections7;
        Sections[] sectionsArr = {sections, sections2, sections3, sections4, sections5, sections6, sections7};
        $VALUES = sectionsArr;
        $ENTRIES = new asp(sectionsArr);
    }

    public Sections(String str, int i, String str2) {
        this.id = str2;
    }

    public static Sections valueOf(String str) {
        return (Sections) Enum.valueOf(Sections.class, str);
    }

    public static Sections[] values() {
        return (Sections[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}

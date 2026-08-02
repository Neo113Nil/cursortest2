package com.vk.stat.sak.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$ErrorView {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStatSak$ErrorView[] $VALUES;

    @pmi0("alert")
    public static final SchemeStatSak$ErrorView ALERT;

    @pmi0("fullscreen")
    public static final SchemeStatSak$ErrorView FULLSCREEN;

    @pmi0("input")
    public static final SchemeStatSak$ErrorView INPUT;

    @pmi0("modalcard")
    public static final SchemeStatSak$ErrorView MODALCARD;

    static {
        SchemeStatSak$ErrorView schemeStatSak$ErrorView = new SchemeStatSak$ErrorView("INPUT", 0);
        INPUT = schemeStatSak$ErrorView;
        SchemeStatSak$ErrorView schemeStatSak$ErrorView2 = new SchemeStatSak$ErrorView("ALERT", 1);
        ALERT = schemeStatSak$ErrorView2;
        SchemeStatSak$ErrorView schemeStatSak$ErrorView3 = new SchemeStatSak$ErrorView("FULLSCREEN", 2);
        FULLSCREEN = schemeStatSak$ErrorView3;
        SchemeStatSak$ErrorView schemeStatSak$ErrorView4 = new SchemeStatSak$ErrorView("MODALCARD", 3);
        MODALCARD = schemeStatSak$ErrorView4;
        SchemeStatSak$ErrorView[] schemeStatSak$ErrorViewArr = {schemeStatSak$ErrorView, schemeStatSak$ErrorView2, schemeStatSak$ErrorView3, schemeStatSak$ErrorView4};
        $VALUES = schemeStatSak$ErrorViewArr;
        $ENTRIES = new asp(schemeStatSak$ErrorViewArr);
    }

    private SchemeStatSak$ErrorView(String str, int i) {
    }

    public static SchemeStatSak$ErrorView valueOf(String str) {
        return (SchemeStatSak$ErrorView) Enum.valueOf(SchemeStatSak$ErrorView.class, str);
    }

    public static SchemeStatSak$ErrorView[] values() {
        return (SchemeStatSak$ErrorView[]) $VALUES.clone();
    }
}

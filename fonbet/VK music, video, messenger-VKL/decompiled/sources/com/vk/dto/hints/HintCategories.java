package com.vk.dto.hints;

import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.c5g;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HintCategories.kt */
/* loaded from: classes18.dex */
public final class HintCategories {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HintCategories[] $VALUES;
    public static final a Companion;
    public static final HintCategories DEFAULT;
    private static final List<String> DEFAULT$1;
    public static final HintCategories IM;
    public static final String PARAM_NAME = "categories";
    public static final HintCategories RELOCATION;
    public static final HintCategories VIDEO;
    private final String value;

    /* compiled from: HintCategories.kt */
    public static final class a {
    }

    static {
        HintCategories hintCategories = new HintCategories("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = hintCategories;
        HintCategories hintCategories2 = new HintCategories("RELOCATION", 1, "relocation");
        RELOCATION = hintCategories2;
        HintCategories hintCategories3 = new HintCategories(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = hintCategories3;
        HintCategories hintCategories4 = new HintCategories("IM", 3, "im");
        IM = hintCategories4;
        HintCategories[] hintCategoriesArr = {hintCategories, hintCategories2, hintCategories3, hintCategories4};
        $VALUES = hintCategoriesArr;
        asp aspVar = new asp(hintCategoriesArr);
        $ENTRIES = aspVar;
        Companion = new a();
        ArrayList arrayList = new ArrayList(c5g.u(aspVar, 10));
        Iterator<E> it = aspVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((HintCategories) it.next()).value);
        }
        DEFAULT$1 = arrayList;
    }

    public HintCategories(String str, int i, String str2) {
        this.value = str2;
    }

    public static HintCategories valueOf(String str) {
        return (HintCategories) Enum.valueOf(HintCategories.class, str);
    }

    public static HintCategories[] values() {
        return (HintCategories[]) $VALUES.clone();
    }
}

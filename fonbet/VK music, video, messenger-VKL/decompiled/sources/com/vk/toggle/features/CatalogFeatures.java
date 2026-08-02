package com.vk.toggle.features;

import com.vk.toggle.b;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import xsna.asp;
import xsna.gd6;
import xsna.p0p0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogFeatures.kt */
/* loaded from: classes11.dex */
public final class CatalogFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogFeatures[] $VALUES;
    public static final CatalogFeatures ANDROID_AUTO_SHOWS_TAB;
    public static final CatalogFeatures AUDIO_ARTIST_HEADER_REDESIGN;
    public static final CatalogFeatures AUDIO_OBJECT_SEARCH_HISTORY;
    public static final CatalogFeatures COM_FRIENDS;
    public static final a Companion;
    public static final CatalogFeatures NEW_ANDROID_AUTO;
    public static final CatalogFeatures TEST_TOGGLE;
    public static final CatalogFeatures TEST_TOGGLE_2;
    private final String key;

    /* compiled from: CatalogFeatures.kt */
    public static final class a {
        public static List a() {
            b bVar = b.A;
            zrp<CatalogFeatures> i = CatalogFeatures.i();
            ConcurrentHashMap<Class<?>, List<b.d>> concurrentHashMap = bVar.s;
            final p0p0 p0p0Var = new p0p0(0, i, bVar);
            return concurrentHashMap.computeIfAbsent(CatalogFeatures.class, new Function() { // from class: xsna.q0p0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (List) p0p0.this.invoke(obj);
                }
            });
        }
    }

    static {
        CatalogFeatures catalogFeatures = new CatalogFeatures("TEST_TOGGLE", 0, "ctlg_test_toggle");
        TEST_TOGGLE = catalogFeatures;
        CatalogFeatures catalogFeatures2 = new CatalogFeatures("TEST_TOGGLE_2", 1, "ctlg_test_toggle_2");
        TEST_TOGGLE_2 = catalogFeatures2;
        CatalogFeatures catalogFeatures3 = new CatalogFeatures("AUDIO_ARTIST_HEADER_REDESIGN", 2, "ctlg_audio_header_redesign");
        AUDIO_ARTIST_HEADER_REDESIGN = catalogFeatures3;
        CatalogFeatures catalogFeatures4 = new CatalogFeatures("NEW_ANDROID_AUTO", 3, "ctlg_android_auto_new");
        NEW_ANDROID_AUTO = catalogFeatures4;
        CatalogFeatures catalogFeatures5 = new CatalogFeatures("ANDROID_AUTO_SHOWS_TAB", 4, "ctlg_android_auto_shows_tab");
        ANDROID_AUTO_SHOWS_TAB = catalogFeatures5;
        CatalogFeatures catalogFeatures6 = new CatalogFeatures("COM_FRIENDS", 5, "ctlg_com_friends");
        COM_FRIENDS = catalogFeatures6;
        CatalogFeatures catalogFeatures7 = new CatalogFeatures("AUDIO_OBJECT_SEARCH_HISTORY", 6, "ctlg_audio_object_history");
        AUDIO_OBJECT_SEARCH_HISTORY = catalogFeatures7;
        CatalogFeatures[] catalogFeaturesArr = {catalogFeatures, catalogFeatures2, catalogFeatures3, catalogFeatures4, catalogFeatures5, catalogFeatures6, catalogFeatures7};
        $VALUES = catalogFeaturesArr;
        $ENTRIES = new asp(catalogFeaturesArr);
        Companion = new a();
    }

    public CatalogFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<CatalogFeatures> i() {
        return $ENTRIES;
    }

    public static CatalogFeatures valueOf(String str) {
        return (CatalogFeatures) Enum.valueOf(CatalogFeatures.class, str);
    }

    public static CatalogFeatures[] values() {
        return (CatalogFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}

package com.vk.fave.entities;

import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Locale;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.qsq;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveCategory.kt */
/* loaded from: classes18.dex */
public final class FaveCategory {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveCategory[] $VALUES;
    public static final FaveCategory ALL;
    public static final FaveCategory ARTICLE;
    public static final FaveCategory CLIP;
    public static final FaveCategory COMMUNITY;
    public static final a Companion;
    public static final FaveCategory LINK;
    public static final FaveCategory NARRATIVE;
    public static final FaveCategory PEOPLE;
    public static final FaveCategory PODCAST;
    public static final FaveCategory POST;
    public static final FaveCategory PRODUCT;
    public static final FaveCategory VIDEO;
    private final int titleId;
    private final qsq type;

    /* compiled from: FaveCategory.kt */
    public static final class a {
        public static FaveCategory[] a() {
            FaveCategory[] values = FaveCategory.values();
            ArrayList arrayList = new ArrayList();
            for (FaveCategory faveCategory : values) {
                FaveCategory.Companion.getClass();
                arrayList.add(faveCategory);
            }
            return (FaveCategory[]) arrayList.toArray(new FaveCategory[0]);
        }

        public static FaveCategory b(String str) {
            FaveCategory faveCategory;
            FaveCategory[] a = a();
            int length = a.length;
            int i = 0;
            while (true) {
                faveCategory = null;
                if (i >= length) {
                    break;
                }
                FaveCategory faveCategory2 = a[i];
                qsq i2 = faveCategory2.i();
                if (epx.f(i2 != null ? i2.h() : null, str != null ? str.toLowerCase(Locale.ROOT) : null)) {
                    faveCategory = faveCategory2;
                    break;
                }
                i++;
            }
            return faveCategory == null ? FaveCategory.ALL : faveCategory;
        }
    }

    static {
        FaveCategory faveCategory = new FaveCategory("ALL", 0, null, R.string.fave_tab_all_title);
        ALL = faveCategory;
        FaveCategory faveCategory2 = new FaveCategory("PEOPLE", 1, FaveSearchType.FAVE_PEOPLE, R.string.fave_people_title);
        PEOPLE = faveCategory2;
        FaveCategory faveCategory3 = new FaveCategory("COMMUNITY", 2, FaveSearchType.FAVE_COMMUNITY, R.string.fave_community_title);
        COMMUNITY = faveCategory3;
        FaveCategory faveCategory4 = new FaveCategory("POST", 3, FaveType.POST, R.string.fave_tab_post_title);
        POST = faveCategory4;
        FaveCategory faveCategory5 = new FaveCategory("ARTICLE", 4, FaveType.ARTICLE, R.string.fave_tab_article_title);
        ARTICLE = faveCategory5;
        FaveCategory faveCategory6 = new FaveCategory("LINK", 5, FaveType.LINK, R.string.fave_tab_link_title);
        LINK = faveCategory6;
        FaveCategory faveCategory7 = new FaveCategory("PODCAST", 6, FaveType.PODCAST, R.string.fave_tap_podcast_title);
        PODCAST = faveCategory7;
        FaveCategory faveCategory8 = new FaveCategory(SignalingProtocol.MEDIA_OPTION_VIDEO, 7, FaveType.VIDEO, R.string.fava_tab_video_title);
        VIDEO = faveCategory8;
        FaveCategory faveCategory9 = new FaveCategory("CLIP", 8, FaveType.CLIP, R.string.fava_tab_clip_title);
        CLIP = faveCategory9;
        FaveCategory faveCategory10 = new FaveCategory("NARRATIVE", 9, FaveType.NARRATIVE, R.string.fave_tab_narrative_title);
        NARRATIVE = faveCategory10;
        FaveCategory faveCategory11 = new FaveCategory("PRODUCT", 10, FaveType.PRODUCT, R.string.fave_tab_product_services_title);
        PRODUCT = faveCategory11;
        FaveCategory[] faveCategoryArr = {faveCategory, faveCategory2, faveCategory3, faveCategory4, faveCategory5, faveCategory6, faveCategory7, faveCategory8, faveCategory9, faveCategory10, faveCategory11};
        $VALUES = faveCategoryArr;
        $ENTRIES = new asp(faveCategoryArr);
        Companion = new a();
    }

    public FaveCategory(String str, int i, qsq qsqVar, int i2) {
        this.type = qsqVar;
        this.titleId = i2;
    }

    public static FaveCategory valueOf(String str) {
        return (FaveCategory) Enum.valueOf(FaveCategory.class, str);
    }

    public static FaveCategory[] values() {
        return (FaveCategory[]) $VALUES.clone();
    }

    public final int h() {
        return this.titleId;
    }

    public final qsq i() {
        return this.type;
    }
}

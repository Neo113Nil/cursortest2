package com.vk.stickers.api.models.post;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.dhr0;
import xsna.e43;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostStickerStyle.kt */
/* loaded from: classes5.dex */
public final class PostStickerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostStickerStyle[] $VALUES;
    public static final a Companion;
    public static final PostStickerStyle DARK;
    public static final PostStickerStyle FULLSCREEN;
    public static final PostStickerStyle LIGHT;
    public static final PostStickerStyle MINIATURE;
    public static final PostStickerStyle PREVIEW;
    public static final PostStickerStyle SIMPLIFIED_DARK;
    public static final PostStickerStyle SIMPLIFIED_LIGHT;
    private final String value;

    /* compiled from: PostStickerStyle.kt */
    public static final class a {
        public static ArrayList a(boolean z) {
            List l = e43.l(PostStickerStyle.DARK, PostStickerStyle.LIGHT, PostStickerStyle.SIMPLIFIED_DARK, PostStickerStyle.SIMPLIFIED_LIGHT);
            ArrayList arrayList = new ArrayList();
            for (Object obj : l) {
                PostStickerStyle postStickerStyle = (PostStickerStyle) obj;
                if (!z || postStickerStyle != PostStickerStyle.SIMPLIFIED_LIGHT) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: PostStickerStyle.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostStickerStyle.values().length];
            try {
                iArr[PostStickerStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostStickerStyle.SIMPLIFIED_DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostStickerStyle.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostStickerStyle.MINIATURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostStickerStyle.FULLSCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostStickerStyle.LIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PostStickerStyle.SIMPLIFIED_LIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PostStickerStyle postStickerStyle = new PostStickerStyle("DARK", 0, "dark");
        DARK = postStickerStyle;
        PostStickerStyle postStickerStyle2 = new PostStickerStyle("LIGHT", 1, "light");
        LIGHT = postStickerStyle2;
        PostStickerStyle postStickerStyle3 = new PostStickerStyle("SIMPLIFIED_DARK", 2, "dark_without_bg");
        SIMPLIFIED_DARK = postStickerStyle3;
        PostStickerStyle postStickerStyle4 = new PostStickerStyle("SIMPLIFIED_LIGHT", 3, "light_without_bg");
        SIMPLIFIED_LIGHT = postStickerStyle4;
        PostStickerStyle postStickerStyle5 = new PostStickerStyle("PREVIEW", 4, "preview");
        PREVIEW = postStickerStyle5;
        PostStickerStyle postStickerStyle6 = new PostStickerStyle("MINIATURE", 5, "miniature");
        MINIATURE = postStickerStyle6;
        PostStickerStyle postStickerStyle7 = new PostStickerStyle("FULLSCREEN", 6, "fullview");
        FULLSCREEN = postStickerStyle7;
        PostStickerStyle[] postStickerStyleArr = {postStickerStyle, postStickerStyle2, postStickerStyle3, postStickerStyle4, postStickerStyle5, postStickerStyle6, postStickerStyle7};
        $VALUES = postStickerStyleArr;
        $ENTRIES = new asp(postStickerStyleArr);
        Companion = new a();
    }

    public PostStickerStyle(String str, int i, String str2) {
        this.value = str2;
    }

    public static PostStickerStyle valueOf(String str) {
        return (PostStickerStyle) Enum.valueOf(PostStickerStyle.class, str);
    }

    public static PostStickerStyle[] values() {
        return (PostStickerStyle[]) $VALUES.clone();
    }

    public final Context h() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dhr0.a.getClass();
                return dhr0.s();
            case 6:
            case 7:
                dhr0.a.getClass();
                return dhr0.y();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String i() {
        return this.value;
    }

    public final boolean j() {
        return this == SIMPLIFIED_LIGHT || this == SIMPLIFIED_DARK;
    }
}

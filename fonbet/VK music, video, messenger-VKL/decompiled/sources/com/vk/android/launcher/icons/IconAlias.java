package com.vk.android.launcher.icons;

import android.content.ComponentName;
import io.jsonwebtoken.JwtParser;
import xsna.asp;
import xsna.xmy;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IconAlias.kt */
/* loaded from: classes.dex */
public final class IconAlias implements xmy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IconAlias[] $VALUES;
    public static final IconAlias DefaultIcon;
    public static final IconAlias EventIcon1;
    public static final IconAlias EventIcon10;
    public static final IconAlias EventIcon2;
    public static final IconAlias EventIcon3;
    public static final IconAlias EventIcon4;
    public static final IconAlias EventIcon5;
    public static final IconAlias EventIcon6;
    public static final IconAlias EventIcon7;
    public static final IconAlias EventIcon8;
    public static final IconAlias EventIcon9;
    public static final IconAlias EventIconDuplicate1;
    public static final IconAlias EventIconDuplicate2;
    public static final IconAlias EventIconDuplicate3;
    public static final IconAlias EventIconDuplicate4;
    public static final IconAlias EventIconDuplicate5;
    public static final IconAlias EventIconDuplicate6;
    public static final IconAlias EventIconDuplicate7;
    public static final IconAlias EventIconDuplicate8;
    public static final IconAlias EventIconDuplicate9;
    public static final IconAlias SpecialEventIcon1;
    public static final IconAlias StaticIcon1;
    public static final IconAlias StaticIcon2;
    public static final IconAlias StaticIcon3;
    public static final IconAlias StaticIcon4;
    public static final IconAlias StaticIcon5;
    public static final IconAlias StaticIcon6;
    public static final IconAlias StaticIconDev;
    public static final IconAlias StaticIconDev2;
    public static final IconAlias StaticIconDev3;
    public static final IconAlias StaticIconDev4;
    public static final IconAlias StaticIconDev5;
    public static final IconAlias StaticIconDev6;
    public static final IconAlias StaticIconDev7;
    public static final IconAlias StaticIconDev8;
    public static final IconAlias StaticIconDev9;

    static {
        IconAlias iconAlias = new IconAlias("DefaultIcon", 0);
        DefaultIcon = iconAlias;
        IconAlias iconAlias2 = new IconAlias("StaticIcon1", 1);
        StaticIcon1 = iconAlias2;
        IconAlias iconAlias3 = new IconAlias("StaticIcon2", 2);
        StaticIcon2 = iconAlias3;
        IconAlias iconAlias4 = new IconAlias("StaticIcon3", 3);
        StaticIcon3 = iconAlias4;
        IconAlias iconAlias5 = new IconAlias("StaticIcon4", 4);
        StaticIcon4 = iconAlias5;
        IconAlias iconAlias6 = new IconAlias("StaticIcon5", 5);
        StaticIcon5 = iconAlias6;
        IconAlias iconAlias7 = new IconAlias("StaticIcon6", 6);
        StaticIcon6 = iconAlias7;
        IconAlias iconAlias8 = new IconAlias("StaticIconDev", 7);
        StaticIconDev = iconAlias8;
        IconAlias iconAlias9 = new IconAlias("StaticIconDev2", 8);
        StaticIconDev2 = iconAlias9;
        IconAlias iconAlias10 = new IconAlias("StaticIconDev3", 9);
        StaticIconDev3 = iconAlias10;
        IconAlias iconAlias11 = new IconAlias("StaticIconDev4", 10);
        StaticIconDev4 = iconAlias11;
        IconAlias iconAlias12 = new IconAlias("StaticIconDev5", 11);
        StaticIconDev5 = iconAlias12;
        IconAlias iconAlias13 = new IconAlias("StaticIconDev6", 12);
        StaticIconDev6 = iconAlias13;
        IconAlias iconAlias14 = new IconAlias("StaticIconDev7", 13);
        StaticIconDev7 = iconAlias14;
        IconAlias iconAlias15 = new IconAlias("StaticIconDev8", 14);
        StaticIconDev8 = iconAlias15;
        IconAlias iconAlias16 = new IconAlias("StaticIconDev9", 15);
        StaticIconDev9 = iconAlias16;
        IconAlias iconAlias17 = new IconAlias("EventIcon1", 16);
        EventIcon1 = iconAlias17;
        IconAlias iconAlias18 = new IconAlias("EventIcon2", 17);
        EventIcon2 = iconAlias18;
        IconAlias iconAlias19 = new IconAlias("EventIcon3", 18);
        EventIcon3 = iconAlias19;
        IconAlias iconAlias20 = new IconAlias("EventIcon4", 19);
        EventIcon4 = iconAlias20;
        IconAlias iconAlias21 = new IconAlias("EventIcon5", 20);
        EventIcon5 = iconAlias21;
        IconAlias iconAlias22 = new IconAlias("EventIcon6", 21);
        EventIcon6 = iconAlias22;
        IconAlias iconAlias23 = new IconAlias("EventIcon7", 22);
        EventIcon7 = iconAlias23;
        IconAlias iconAlias24 = new IconAlias("EventIcon8", 23);
        EventIcon8 = iconAlias24;
        IconAlias iconAlias25 = new IconAlias("EventIcon9", 24);
        EventIcon9 = iconAlias25;
        IconAlias iconAlias26 = new IconAlias("EventIcon10", 25);
        EventIcon10 = iconAlias26;
        IconAlias iconAlias27 = new IconAlias("EventIconDuplicate1", 26);
        EventIconDuplicate1 = iconAlias27;
        IconAlias iconAlias28 = new IconAlias("EventIconDuplicate2", 27);
        EventIconDuplicate2 = iconAlias28;
        IconAlias iconAlias29 = new IconAlias("EventIconDuplicate3", 28);
        EventIconDuplicate3 = iconAlias29;
        IconAlias iconAlias30 = new IconAlias("EventIconDuplicate4", 29);
        EventIconDuplicate4 = iconAlias30;
        IconAlias iconAlias31 = new IconAlias("EventIconDuplicate5", 30);
        EventIconDuplicate5 = iconAlias31;
        IconAlias iconAlias32 = new IconAlias("EventIconDuplicate6", 31);
        EventIconDuplicate6 = iconAlias32;
        IconAlias iconAlias33 = new IconAlias("EventIconDuplicate7", 32);
        EventIconDuplicate7 = iconAlias33;
        IconAlias iconAlias34 = new IconAlias("EventIconDuplicate8", 33);
        EventIconDuplicate8 = iconAlias34;
        IconAlias iconAlias35 = new IconAlias("EventIconDuplicate9", 34);
        EventIconDuplicate9 = iconAlias35;
        IconAlias iconAlias36 = new IconAlias("SpecialEventIcon1", 35);
        SpecialEventIcon1 = iconAlias36;
        IconAlias[] iconAliasArr = {iconAlias, iconAlias2, iconAlias3, iconAlias4, iconAlias5, iconAlias6, iconAlias7, iconAlias8, iconAlias9, iconAlias10, iconAlias11, iconAlias12, iconAlias13, iconAlias14, iconAlias15, iconAlias16, iconAlias17, iconAlias18, iconAlias19, iconAlias20, iconAlias21, iconAlias22, iconAlias23, iconAlias24, iconAlias25, iconAlias26, iconAlias27, iconAlias28, iconAlias29, iconAlias30, iconAlias31, iconAlias32, iconAlias33, iconAlias34, iconAlias35, iconAlias36};
        $VALUES = iconAliasArr;
        $ENTRIES = new asp(iconAliasArr);
    }

    public IconAlias() {
        throw null;
    }

    public static IconAlias valueOf(String str) {
        return (IconAlias) Enum.valueOf(IconAlias.class, str);
    }

    public static IconAlias[] values() {
        return (IconAlias[]) $VALUES.clone();
    }

    @Override // xsna.xmy
    public final ComponentName a(String str) {
        return new ComponentName(str, IconAlias.class.getCanonicalName() + JwtParser.SEPARATOR_CHAR + name());
    }

    @Override // xsna.xmy
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}

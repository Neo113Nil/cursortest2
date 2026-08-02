package com.vk.im.engine.models;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LinkTarget.kt */
/* loaded from: classes2.dex */
public final class LinkTarget {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LinkTarget[] $VALUES;
    public static final a Companion;
    public static final LinkTarget DEFAULT;
    public static final LinkTarget EXTERNAL;
    public static final LinkTarget INTERNAL;
    private static final Lazy<Map<Integer, LinkTarget>> values$delegate;
    private final int typeAsInt;

    /* compiled from: LinkTarget.kt */
    public static final class a {
    }

    static {
        LinkTarget linkTarget = new LinkTarget("DEFAULT", 0, 0);
        DEFAULT = linkTarget;
        LinkTarget linkTarget2 = new LinkTarget("INTERNAL", 1, 1);
        INTERNAL = linkTarget2;
        LinkTarget linkTarget3 = new LinkTarget("EXTERNAL", 2, 2);
        EXTERNAL = linkTarget3;
        LinkTarget[] linkTargetArr = {linkTarget, linkTarget2, linkTarget3};
        $VALUES = linkTargetArr;
        $ENTRIES = new asp(linkTargetArr);
        Companion = new a();
        values$delegate = new bpn0(new com.vk.movika.sdk.base.model.props.d(28));
    }

    public LinkTarget(String str, int i, int i2) {
        this.typeAsInt = i2;
    }

    public static LinkedHashMap h() {
        LinkTarget[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (LinkTarget linkTarget : values) {
            linkedHashMap.put(Integer.valueOf(linkTarget.typeAsInt), linkTarget);
        }
        return linkedHashMap;
    }

    public static LinkTarget valueOf(String str) {
        return (LinkTarget) Enum.valueOf(LinkTarget.class, str);
    }

    public static LinkTarget[] values() {
        return (LinkTarget[]) $VALUES.clone();
    }

    public final int j() {
        return this.typeAsInt;
    }
}

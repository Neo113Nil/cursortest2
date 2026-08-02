package com.vk.im.nspkchooser.impl.nspk;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SbpLinkData.kt */
/* loaded from: classes2.dex */
public final class Source {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Source[] $VALUES;
    public static final Source MIDAS;
    private final String value = "MIDAS";

    static {
        Source source = new Source();
        MIDAS = source;
        Source[] sourceArr = {source};
        $VALUES = sourceArr;
        $ENTRIES = new asp(sourceArr);
    }

    public static zrp<Source> h() {
        return $ENTRIES;
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}

package com.sofascore.model.firebase;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/model/firebase/ParamJsonDepthLevel;", "", "<init>", "(Ljava/lang/String;I)V", "PARAM_NAME", "OBJECT_NAME", "OBJECT_TEXT", "PARAM_TEXT", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ParamJsonDepthLevel {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ParamJsonDepthLevel[] $VALUES;
    public static final ParamJsonDepthLevel PARAM_NAME = new ParamJsonDepthLevel("PARAM_NAME", 0);
    public static final ParamJsonDepthLevel OBJECT_NAME = new ParamJsonDepthLevel("OBJECT_NAME", 1);
    public static final ParamJsonDepthLevel OBJECT_TEXT = new ParamJsonDepthLevel("OBJECT_TEXT", 2);
    public static final ParamJsonDepthLevel PARAM_TEXT = new ParamJsonDepthLevel("PARAM_TEXT", 3);

    private static final /* synthetic */ ParamJsonDepthLevel[] $values() {
        return new ParamJsonDepthLevel[]{PARAM_NAME, OBJECT_NAME, OBJECT_TEXT, PARAM_TEXT};
    }

    static {
        ParamJsonDepthLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private ParamJsonDepthLevel(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static ParamJsonDepthLevel valueOf(String str) {
        return (ParamJsonDepthLevel) Enum.valueOf(ParamJsonDepthLevel.class, str);
    }

    public static ParamJsonDepthLevel[] values() {
        return (ParamJsonDepthLevel[]) $VALUES.clone();
    }
}
